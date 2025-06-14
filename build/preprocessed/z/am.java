import javax.microedition.lcdui.Graphics;

public abstract class am {
  protected int e;
  
  protected int f = v.t;
  
  protected int g = v.u;
  
  protected boolean h = true;
  
  private boolean a = true;
  
  protected bf i;
  
  private ba b = new ba();
  
  protected az[] j = new az[3];
  
  private int[] c = new int[3];
  
  private int d;
  
  private int k;
  
  private int l = 13;
  
  private boolean m = true;
  
  private boolean n = false;
  
  public final int h() {
    return this.e;
  }
  
  public final void b(int paramInt) {
    this.e = paramInt;
  }
  
  public final int i() {
    return this.f;
  }
  
  public final int j() {
    return this.g;
  }
  
  public void a(bf parambf) {
    this.i = parambf;
  }
  
  public final boolean k() {
    return this.a;
  }
  
  public final void d(boolean paramBoolean) {
    this.a = false;
  }
  
  public boolean l() {
    return this.h;
  }
  
  public void e(boolean paramBoolean) {
    this.h = paramBoolean;
  }
  
  public final void f(boolean paramBoolean) {
    this.n = paramBoolean;
  }
  
  public final void g(boolean paramBoolean) {
    this.m = false;
  }
  
  public final void a(ba paramba) {
    this.b = paramba;
  }
  
  public final void m() {
    for (byte b = 0; b < this.j.length; b++) {
      this.j[b] = null;
      this.c[b] = 0;
    } 
  }
  
  public final void n() {
    this.j[0] = null;
    this.c[0] = 0;
  }
  
  public final void o() {
    this.j[1] = null;
    this.c[1] = 0;
  }
  
  protected void d(Graphics paramGraphics) {
    if (this.b != null)
      this.b.a(paramGraphics); 
    for (byte b = 0; b < this.j.length; b++) {
      if (this.j[b] != null)
        this.j[b].a(paramGraphics); 
    } 
  }
  
  public final void a(Graphics paramGraphics, boolean paramBoolean) {
    c(paramGraphics);
    if (paramBoolean)
      d(paramGraphics); 
  }
  
  public final void h(boolean paramBoolean) {
    int i;
    for (i = 0; i < this.j.length; i++) {
      if (this.j[i] != null) {
        this.j[i].c();
        if (this.c[i] > 0) {
          this.c[i] = this.c[i] - 1;
          if (this.c[i] == 0 && !this.j[i].b(this.e) && this.i != null)
            this.i.d(this.e, this.j[i].a()); 
        } 
      } 
    } 
    if (paramBoolean) {
      am am1 = this;
      if (v.z) {
        i = v.A;
        int j = v.B;
        if (i >= 0 && j >= 0) {
          boolean bool = ag.b;
          ag.c = false;
          int k = j;
          j = i;
          am am2 = am1;
          boolean bool1 = false;
          am2.d = k;
          am2.k = j;
          if (am2.p() && am2.j[0].a(j, k)) {
            v.c[94] = 2;
            bool1 = true;
          } 
          if (am2.a() && am2.j[2].a(j, k)) {
            v.c[93] = 2;
            bool1 = true;
          } 
          if (am2.q() && am2.j[1].a(j, k)) {
            v.c[95] = 2;
            bool1 = true;
          } 
          if (!bool1)
            am2.a(j, k); 
          v.A = v.B = -1;
          if (bool && !ag.c)
            ag.a().e(); 
        } else {
          i = v.E;
          j = v.F;
          if (i >= 0 && j >= 0) {
            int m = j;
            j = i;
            am am2 = am1;
            int n = j - am2.k;
            int k = m - am2.d;
            am2.d = m;
            am2.k = j;
            am2.c(n, k);
            v.E = v.F = -1;
          } 
        } 
        i = v.C;
        j = v.D;
        if (i >= 0 && j >= 0) {
          int k = j;
          j = i;
          am am2;
          (am2 = am1).b(j, k);
          v.C = v.D = -1;
        } 
      } 
      am1 = this;
      for (i = 299; i >= 0; i--) {
        if (v.c[i] != 0) {
          if (v.c[i] == 1) {
            am1.d(i);
            v.c[i] = 0;
          } else if (v.c[i] == 2) {
            if (!am1.a(i))
              am1.c(i); 
            v.c[i] = 0;
          } else if (v.c[i] >= 3) {
            if ((v.c[i] > am1.l || v.c[i] == 3) && !am1.a(i) && (am1.m || v.c[i] == 3))
              am1.c(i); 
            if (v.c[i] < Integer.MAX_VALUE)
              v.c[i] = v.c[i] + 1; 
          } 
          if (am1.n)
            continue; 
          break;
        } 
        continue;
      } 
    } 
    b_();
  }
  
  public final boolean p() {
    return (this.j[0] != null);
  }
  
  private boolean a() {
    return (this.j[2] != null);
  }
  
  public final boolean q() {
    return (this.j[1] != null);
  }
  
  public void a(az paramaz, boolean paramBoolean) {
    this.j[0] = paramaz;
    this.c[0] = 0;
    if (paramaz == null)
      return; 
    if (paramBoolean)
      this.j[0].a(6, v.u - ba.a + 3, 20); 
  }
  
  public void b(az paramaz, boolean paramBoolean) {
    this.j[2] = paramaz;
    this.c[2] = 0;
    if (paramaz == null)
      return; 
    if (paramBoolean)
      this.j[2].a(v.t - 6, v.u - ba.a + 3, 24); 
  }
  
  public void a(az paramaz) {
    boolean bool = true;
    az az1 = paramaz;
    am am1;
    (am1 = this).j[1] = az1;
    am1.c[1] = 0;
    if (az1 != null)
      am1.j[1].a(v.t / 2, v.u - ba.a + 3, 17); 
  }
  
  private boolean a(int paramInt) {
    boolean bool = false;
    if (p() && paramInt == 94) {
      if (this.c[0] == 0) {
        bool = this.j[0].b();
        this.c[0] = 3;
      } 
    } else if (a() && paramInt == 93) {
      if (this.c[2] == 0) {
        bool = this.j[2].b();
        this.c[2] = 3;
      } 
    } else if (q() && paramInt == 95 && this.c[1] == 0) {
      bool = this.j[1].b();
      this.c[1] = 3;
    } 
    return bool;
  }
  
  public void c(int paramInt) {}
  
  public void d(int paramInt) {}
  
  public void a(int paramInt1, int paramInt2) {}
  
  public void b(int paramInt1, int paramInt2) {}
  
  public void c(int paramInt1, int paramInt2) {}
  
  protected void r() {}
  
  protected void s() {}
  
  public void i(boolean paramBoolean) {
    e(true);
  }
  
  public abstract void b_();
  
  public abstract void c(Graphics paramGraphics);
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\am.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */