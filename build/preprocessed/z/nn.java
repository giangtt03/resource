import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class nn extends nk {
  private as c = new as();
  
  private as d;
  
  private Image[] e;
  
  private int[] f;
  
  private boolean F = false;
  
  private int G = -1000;
  
  public int a = 0;
  
  public int b = 0;
  
  public nn(int paramInt1, Image[] paramArrayOfImage, byte[][] paramArrayOfbyte1, int[] paramArrayOfint, Image paramImage, byte[][] paramArrayOfbyte2, int paramInt2) {
    super(paramInt1);
    this.e = paramArrayOfImage;
    this.f = paramArrayOfint;
    this.c.a(paramArrayOfbyte1);
    a(0);
    this.d = new as(paramImage, paramInt2);
    this.d.a(paramArrayOfbyte2);
    this.d.a(false);
    if (paramInt1 == 0) {
      this.c.c(2);
      this.d.c(2);
    } else {
      this.c.c(0);
      this.d.c(0);
    } 
    this.d.d(2);
    this.C = new z();
    this.C.a(20);
    this.C.a(a.h);
    j(36);
    this.D = new k(this.c.n(), this.c.o(), this.c.p(), this.c.q());
  }
  
  public final int c() {
    return this.c.h();
  }
  
  public final void j(int paramInt) {
    super.j(paramInt);
    this.c.j(paramInt);
  }
  
  public final void a(int paramInt) {
    this.E = paramInt;
    if (paramInt == 4) {
      this.c.a(false);
    } else {
      this.c.a(true);
    } 
    this.c.d(paramInt);
    this.c.a(this.e[paramInt], this.f[paramInt]);
  }
  
  public final int n() {
    return this.c.n();
  }
  
  public final int o() {
    return this.c.o() - this.c.q();
  }
  
  public final int p() {
    return this.c.p();
  }
  
  public final int q() {
    return this.c.q();
  }
  
  public final void c(int paramInt1, int paramInt2) {
    this.c.c(paramInt1, paramInt2);
    this.j = paramInt1;
  }
  
  public final void d() {
    if ((this.c.e()).length > 4)
      a(4); 
  }
  
  public final void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5) {
    this.w = paramBoolean1;
    if (!this.x)
      this.x = paramBoolean2; 
    if (this.h == 0) {
      nn nn2;
      this.s = this.g.n() + this.g.p() / 2 - (nn2 = this).c.p();
      this.d.c((nn2 = this).c.n() + (nn2 = this).c.p() / 2, o() - (nn2 = this).c.q());
    } else {
      this.s = this.g.n() + this.g.p() / 2 - 10;
    } 
    nn nn1;
    this.d.c((nn1 = this).c.n() - this.a, o() - this.b);
    this.k = at.a(this.s, this.c.n(), 6);
    this.t = paramInt - 6;
    this.i = true;
    this.d.d(2);
    if (paramBoolean3)
      h(); 
    a(2);
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2) {
    if (paramBoolean1) {
      this.F = paramBoolean1;
      if (this.G == -1000) {
        this.G = this.c.n();
        if (!this.C.a()) {
          nn nn1;
          this.C.a("Xí Hụt", (nn1 = this).c.n() + (nn1 = this).c.p() / 2, o() + 20);
        } 
        if (this.h == 0) {
          this.s = this.c.n() - 15;
        } else {
          this.s = this.c.n() + 15;
        } 
        this.k = 7;
        this.i = false;
        return;
      } 
    } else if ((this.c.e()).length > 3) {
      a(3);
    } 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    this.z.b(paramGraphics);
    this.c.a(paramGraphics, paramInt1, paramInt2);
    this.d.a(paramGraphics, paramInt1, paramInt2);
    this.z.c(paramGraphics);
    this.C.a(paramGraphics, paramInt1, paramInt2);
  }
  
  public final void i() {
    if (this.t > 0)
      this.t--; 
    this.z.i();
    switch (this.c.h()) {
      case 1:
        if (this.d.h() == 0) {
          if (this.d.e(this.s, this.k)) {
            this.d.d(1);
            this.d.j(17);
            if (this.x)
              ag.a().a(20); 
            this.x = false;
            this.g.a(this.w, this.y);
          } 
          break;
        } 
        if (this.d.h() == 1 && this.d.j()) {
          this.d.d(2);
          a(0);
        } 
        break;
      case 2:
        if (this.i && this.t > 0 && this.t == 1) {
          this.d.d(0);
          this.d.j(20);
          a(1);
        } 
        break;
      case 3:
        if (this.c.j())
          a(0); 
        break;
    } 
    if (this.F)
      if (this.i) {
        if (this.c.e(this.s, this.k)) {
          a(0);
          this.G = -1000;
          this.F = false;
        } 
      } else if (this.c.e(this.s, this.k)) {
        this.s = this.G;
        this.i = true;
        this.k = 7;
      } else if (this.k > 2) {
        this.k -= 2;
      }  
    this.c.i();
    this.d.i();
    this.C.b();
    this.D.a = this.c.n();
    this.D.b = this.c.o();
  }
  
  public final void a(boolean paramBoolean) {}
  
  public final void e() {}
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\nn.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */