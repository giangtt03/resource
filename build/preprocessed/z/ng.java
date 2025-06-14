import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class ng extends nk {
  protected as a = new as();
  
  protected Image[] b;
  
  protected int[] c;
  
  private int F = -1000;
  
  private boolean G;
  
  public int d = 10;
  
  public int e = 0;
  
  public int f = 11;
  
  private int H = 0;
  
  private int I;
  
  private int J;
  
  public ng(int paramInt, Image[] paramArrayOfImage, byte[][] paramArrayOfbyte, int[] paramArrayOfint) {
    super(paramInt);
    this.b = paramArrayOfImage;
    this.c = paramArrayOfint;
    this.h = paramInt;
    this.a.a(paramArrayOfbyte);
    a(0);
    if (paramInt == 0) {
      this.a.c(2);
    } else {
      this.a.c(0);
    } 
    this.C = new z();
    this.C.a(20);
    this.C.a(a.h);
    j(36);
    this.D = new k(this.a.n(), this.a.o(), this.a.p(), this.a.q());
  }
  
  public final int c() {
    return this.a.h();
  }
  
  public void a(int paramInt) {
    this.E = paramInt;
    if (paramInt == 4) {
      this.a.a(false);
    } else {
      this.a.a(true);
    } 
    if (paramInt >= this.b.length)
      paramInt = this.b.length - 1; 
    this.a.d(paramInt);
    try {
      this.a.a(this.b[paramInt], this.c[paramInt]);
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final int n() {
    return this.a.n();
  }
  
  public final int o() {
    return this.a.o() - this.a.q();
  }
  
  public final int p() {
    return this.a.p();
  }
  
  public final int q() {
    return this.a.q();
  }
  
  public final void j(int paramInt) {
    super.j(paramInt);
    this.a.j(paramInt);
  }
  
  public final void c(int paramInt1, int paramInt2) {
    this.a.c(paramInt1, paramInt2);
    this.j = paramInt1;
    this.H = paramInt2;
  }
  
  public final void d() {
    if ((this.a.e()).length > 4)
      a(4); 
  }
  
  public final void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5) {
    this.w = paramBoolean1;
    if (!this.x)
      this.x = paramBoolean2; 
    if (this.h == 0) {
      ng ng1;
      this.s = this.g.n() + this.g.p() / 2 - (ng1 = this).a.p();
    } else {
      this.s = this.g.n() + this.g.p() / 2 - this.d;
    } 
    this.k = at.a(this.s, this.a.n(), 2);
    this.J = this.g.o() + this.g.q();
    this.I = at.a(this.J, this.a.o(), 3);
    if (paramInt < this.f)
      paramInt = this.f; 
    this.t = paramInt;
    this.i = true;
    if (this.h == 0) {
      this.a.c(2);
    } else {
      this.a.c(0);
    } 
    if (paramBoolean3) {
      h();
      this.v = 13;
      this.u = 2;
      return;
    } 
    if (this.v <= 0)
      a(2); 
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2) {
    if (paramBoolean1) {
      this.G = paramBoolean1;
      if (this.F == -1000) {
        this.F = this.a.n();
        if (!this.C.a()) {
          ng ng1;
          this.C.a("Xí Hụt", (ng1 = this).a.n() + (ng1 = this).a.p() / 2, o() + 20);
        } 
        if (this.h == 0) {
          this.s = this.a.n() - 15;
        } else {
          this.s = this.a.n() + 15;
        } 
        this.k = 7;
        this.i = false;
        return;
      } 
    } else if ((this.a.e()).length > 3) {
      a(3);
    } 
  }
  
  public void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    this.z.b(paramGraphics);
    if (this.a.h() == 1) {
      paramInt1 = this.b[1].getWidth() / this.c[1];
      int i = this.b[2].getWidth() / this.c[2];
      paramInt1 = -(paramInt1 - i) / 2;
      paramInt2 -= this.e;
    } 
    this.a.a(paramGraphics, paramInt1, paramInt2);
    this.z.c(paramGraphics);
    this.C.a(paramGraphics, paramInt1, paramInt2);
  }
  
  public final void i() {
    if (this.t > 0)
      this.t--; 
    if (this.v > 0) {
      this.v--;
      if (this.v == 0)
        a(this.u); 
    } 
    this.z.i();
    switch (this.a.h()) {
      case 1:
        a();
        break;
      case 2:
      case 5:
        b();
        break;
      case 3:
        if (this.a.j())
          a(0); 
        break;
    } 
    if (this.G)
      if (this.i) {
        if (this.a.e(this.s, this.k)) {
          a(0);
          this.F = -1000;
          this.G = false;
        } 
      } else if (this.a.e(this.s, this.k)) {
        this.s = this.F;
        this.i = true;
        this.k = 7;
      } else if (this.k > 2) {
        this.k -= 2;
      }  
    this.a.i();
    this.C.b();
    this.D.a = this.a.n();
    this.D.b = this.a.o();
  }
  
  protected void b() {
    if (this.i) {
      if (this.a.b(this.s, this.J, this.k, this.I)) {
        a(1);
        return;
      } 
    } else if (this.a.b(this.j, this.H, this.k, this.I)) {
      if (this.h == 0) {
        this.a.c(2);
      } else {
        this.a.c(0);
      } 
      a(0);
    } 
  }
  
  protected void a() {
    if (this.a.f() == 0) {
      if (this.x)
        ag.a().a(20); 
      this.x = false;
      this.g.a(this.w, this.y);
    } 
    if (this.a.j() && this.t == 0) {
      this.t--;
      this.s = this.j;
      this.k = at.a(this.s, this.a.n(), 2);
      this.i = false;
      a(2);
      if (this.h == 0) {
        this.a.c(0);
        return;
      } 
      this.a.c(2);
    } 
  }
  
  public final void a(boolean paramBoolean) {}
  
  public final void e() {}
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ng.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */