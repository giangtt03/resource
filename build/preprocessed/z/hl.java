import javax.microedition.lcdui.Graphics;

public final class hl extends al implements bf {
  private int k = 0;
  
  private int l = 0;
  
  private k m;
  
  private k n;
  
  private k[] o;
  
  private String[] p = null;
  
  private int[][] q;
  
  private int r = 4;
  
  private int s = 0;
  
  private int t = 0;
  
  private lm[] u;
  
  private String v;
  
  private cu w = null;
  
  private int x = 2;
  
  private boolean y;
  
  private int z = 0;
  
  private int A = 0;
  
  private int[] B;
  
  private az C;
  
  private String D = null;
  
  private az E;
  
  public hl(lm[] paramArrayOflm, az paramaz1, az paramaz2, az paramaz3) {
    this((String)null, paramArrayOflm);
    paramaz1 = paramaz1;
    hl hl1;
    (hl1 = this).a(paramaz1, true);
    a(paramaz3);
    paramaz1 = paramaz2;
    (hl1 = this).b(paramaz1, true);
    a(this.u);
  }
  
  public hl(String paramString, lm paramlm) {
    this(paramString, new lm[] { paramlm });
    this.y = true;
    int i;
    if ((i = (this.o[0]).a + this.c + (this.o[0]).c + 2 + bx.d.a(paramlm.b) + 5) > this.m.c) {
      i -= this.m.c;
      this.m.c += i;
      this.n.c += i;
      this.f += i;
      this.c = (v.t - this.f) / 2;
    } 
  }
  
  public hl(String paramString, lm[] paramArrayOflm) {
    super(1);
    if (paramArrayOflm == null)
      paramArrayOflm = new lm[0]; 
    this.v = paramString;
    this.u = paramArrayOflm;
    if (v.t > v.u)
      this.r = 5; 
    a(new ba());
    a(this);
    b(-241439);
    a(this.u);
    if (this.u != null) {
      this.B = new int[this.u.length];
      this.t = this.u.length;
    } 
    int i = (this.f > 240) ? 225 : (this.f - 15);
    int j = 7;
    if (paramString != null) {
      this.w = new cu(7, 7);
      j = 7 + bx.d.a() + 2;
    } 
    if (this.t > 0) {
      this.s = this.t / this.r + ((this.t % this.r > 0) ? 1 : 0);
      i = 32 * this.r + 5 + 5 + 8 + 8;
      int m = (this.s << 5) + (this.s - 1) * 5 + 8 + 8;
      this.m = new k(7, j, i, m);
      j += this.m.d + 5;
      this.o = new k[this.t];
      m = this.m.a + 8;
      int n = this.m.b + 8;
      byte b = 0;
      int i1 = this.o.length;
      while (b < i1) {
        int i2 = b % this.r;
        int i3 = b / this.r;
        this.o[b] = new k(m + (i2 << 5) + i2 * 5, n + (i3 << 5) + i3 * 5, 32, 32);
        b++;
      } 
    } 
    this.n = new k(7, j, i, bx.d.a() * 3 + 5 + 5);
    j += this.n.d;
    this.f = i + 7 + 7 + 1;
    this.g = j + 7;
    this.c = (v.t - this.f) / 2;
    this.d = (v.u - this.g - ba.a) / 2;
    hl hl1;
    if ((hl1 = this).t > 0) {
      hl1.q = new int[hl1.o.length][4];
      for (j = 0; j < hl1.s; j++) {
        for (byte b = 0; b < hl1.r && (i = j * hl1.r + b) < hl1.o.length; b++) {
          (new int[4])[0] = (i < hl1.o.length - 1) ? (i + 1) : (hl1.o.length - 1);
          (new int[4])[1] = (i > 0) ? (i - 1) : 0;
          (new int[4])[2] = (j < hl1.s - 1) ? (i + hl1.r) : i;
          (new int[4])[3] = (j > 0) ? (i - hl1.r) : i;
          hl1.q[i] = new int[4];
        } 
      } 
    } 
    this.l = 0;
    f(this.l);
  }
  
  public final void b(az paramaz) {
    this.E = paramaz;
  }
  
  public final void a(az paramaz) {
    super.a(paramaz);
    this.C = paramaz;
  }
  
  public final void a(ll paramll) {
    if (this.u == null)
      return; 
    for (int i = this.u.length - 1; i >= 0; i--) {
      if ((this.u[i]).e == 1)
        if ((this.u[i]).g < paramll.k) {
          this.B[i] = -1;
        } else {
          this.l = i;
        }  
    } 
    f(this.l);
  }
  
  public final void a(String paramString) {
    this.p = bx.a(paramString, this.n.c - 4, bx.d);
    if (this.x < this.p.length)
      this.x = this.p.length; 
    this.n.d = bx.d.a() * this.x + 5 + 5;
    this.g = 20 + this.n.d + 7;
    if (this.d + this.g > v.u)
      this.d = (v.u - this.g) / 2; 
  }
  
  public final void e(int paramInt) {
    this.k = 2;
    x();
  }
  
  private void x() {
    hl hl1;
    az az1;
    switch (this.k) {
      case 0:
        return;
      case 2:
        if (this.B == null || this.B[this.l] < 0) {
          az az2 = null;
          hl hl2;
          (hl2 = this).a(az2, true);
          a((az)null);
          return;
        } 
        az1 = this.E;
        (hl1 = this).a(az1, true);
        a(new bd("", this.E.a()));
        break;
    } 
  }
  
  protected final void g() {
    this.A++;
    if (this.A > 5) {
      this.z = (this.z == 0) ? -2 : 0;
      this.A = 0;
    } 
  }
  
  private void a(lm[] paramArrayOflm) {
    hl hl1;
    if (this.u == null || this.u.length == 0) {
      a((az)null);
      az az1 = null;
      (hl1 = this).a(az1, true);
      return;
    } 
    a a = new a();
    int i;
    for (i = 0; i < hl1.length; i++) {
      if (((lm)hl1[i]).g > 0)
        a.a(hl1[i]); 
    } 
    i = a.d();
    this.u = new lm[i];
    for (byte b = 0; b < i; b++)
      this.u[b] = (lm)a.b(b); 
    if (this.u == null || this.u.length == 0) {
      a((az)null);
      a = null;
      hl hl2;
      (hl2 = this).a((az)a, true);
    } 
  }
  
  public final void c(Graphics paramGraphics) {
    if (this.h) {
      pc.a(paramGraphics, this.c, this.d, this.f, this.g, v.aj, true);
      if (this.v != null) {
        bx.d.c(true);
        bx.d.a(paramGraphics, this.v, this.w.a + this.c, this.w.b + this.d, 0);
        bx.d.c(false);
      } 
    } 
    if (this.m != null) {
      pc.b(paramGraphics, this.m.a + this.c, this.m.b + this.d, this.m.c, this.m.d, v.aj, true);
      byte b = 0;
      int i = this.o.length;
      while (b < i) {
        pc.b(paramGraphics, (this.o[b]).a + this.c, (this.o[b]).b + this.d, (this.o[b]).c, (this.o[b]).d, 6647295, 16777215, 8369663);
        pc.g(paramGraphics, (this.u[b]).j, (this.o[b]).a + this.c, (this.o[b]).b + this.d, 20);
        if (this.B != null && b < this.B.length && this.B[b] < 0)
          cw.a(paramGraphics, 15198183, (this.o[b]).a + this.c, (this.o[b]).b + this.d, (this.o[b]).c, (this.o[b]).d); 
        if ((this.u[b]).e != 9)
          bx.c.a(paramGraphics, (this.u[b]).g, (this.o[b]).a + this.c + (this.o[b]).c - 2, (this.o[b]).b + (this.o[b]).d - bx.c.a() + this.d + 2, 2); 
        if (this.y) {
          bx.d.c(true);
          bx.d.a(paramGraphics, (this.u[b]).b, (this.o[b]).a + this.c + (this.o[b]).c + 2, (this.o[b]).b + ((this.o[b]).d - bx.c.a()) / 2 + this.d, 0);
          bx.d.c(false);
        } 
        b++;
      } 
      pc.a(paramGraphics, this.o[this.l], this.c, this.d, this.z);
      if (this.h)
        pc.b(paramGraphics, this.n.a + this.c, this.n.b + this.d, this.n.c, this.n.d, v.aj, true); 
    } 
    if (this.h && this.p != null) {
      int i = 0;
      if (this.D != null) {
        bx.d.c(true);
        bx.d.a(paramGraphics, this.D, this.n.a + this.c + 2, this.n.b + this.d + 5, 0);
        bx.d.c(false);
        i = 0 + bx.d.a() + 2;
      } 
      bx.a(paramGraphics, bx.d, this.p, this.n.a + this.c + 2, this.n.b + this.d + 5 + i, this.n.c - 4, this.n.d, 0);
    } 
  }
  
  public final void d(int paramInt1, int paramInt2) {
    ag.b().a(-241439, false);
  }
  
  private void f(int paramInt) {
    if (paramInt >= this.t) {
      this.p = bx.a("Không có vật dụng nào trong giỏ.", this.n.c - 4, bx.d);
      return;
    } 
    try {
      if (this.t > 0) {
        if ((this.u[paramInt]).d != null)
          this.p = bx.a((this.u[paramInt]).d, this.n.c - 4, bx.d); 
      } else {
        this.p = bx.a("Không có vật dụng nào trong giỏ.", this.n.c - 4, bx.d);
      } 
      this.D = null;
      int i = this.m.b + this.m.d + 5;
      if (this.p != null && this.x < this.p.length) {
        this.x = this.p.length;
        if (this.u != null && this.u.length > 0 && (this.u[paramInt]).b != null) {
          this.x++;
          this.D = (this.u[paramInt]).b;
        } 
      } 
      this.n.d = bx.d.a() * this.x + 5 + 5;
      this.g = i + this.n.d + 7;
      if (this.d + this.g > v.u)
        this.d = (v.u - this.g) / 2; 
      x();
      return;
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      ct.a("index = " + paramInt + "     items leng " + this.u.length);
      arrayIndexOutOfBoundsException.printStackTrace();
      return;
    } 
  }
  
  public final void c(int paramInt) {
    if (this.t > 0)
      switch (paramInt) {
        case 96:
        case 97:
        case 98:
        case 99:
          this.l = this.q[this.l][paramInt - 96];
          if (this.l >= this.o.length)
            this.l = this.o.length - 1; 
          f(this.l);
          break;
        case 95:
          if (this.C != null)
            this.i.d(-1, this.C.a()); 
          break;
      }  
    e(true);
  }
  
  public final void a(int paramInt1, int paramInt2) {
    if (this.t == 0)
      return; 
    int i = this.l;
    for (byte b = 0; b < this.o.length; b++) {
      if (this.o[b].a(paramInt1 - this.c, paramInt2 - this.d) && b < this.u.length) {
        this.l = b;
        if (i == this.l) {
          if (this.C != null)
            this.i.d(-1, this.C.a()); 
        } else {
          f(this.l);
        } 
      } 
    } 
    e(true);
  }
  
  public final int t() {
    int i = -1;
    if (this.l < this.t)
      i = (this.u[this.l]).a; 
    return i;
  }
  
  public final int u() {
    return this.t;
  }
  
  public final lm v() {
    lm lm1 = null;
    if (this.l < this.t)
      lm1 = this.u[this.l]; 
    return lm1;
  }
  
  public final lm[] w() {
    return this.u;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\hl.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */