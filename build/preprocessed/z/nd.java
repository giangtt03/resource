import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class nd extends as implements mr {
  private int s = 0;
  
  private int t;
  
  private int u;
  
  private int v;
  
  private int w;
  
  private boolean z;
  
  private static k A = new k();
  
  private Image[] B;
  
  private int C;
  
  private int D;
  
  private int E;
  
  private int F;
  
  private int G;
  
  private int H;
  
  public final void d(int paramInt1, int paramInt2) {
    this.u = paramInt1;
    this.w = 1035;
  }
  
  public nd(Image[] paramArrayOfImage) {
    this.B = paramArrayOfImage;
    this.b = this.B[0];
    this.o = this.b.getWidth() / 7;
    this.p = this.b.getHeight();
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, byte paramByte, int paramInt4) {
    this.s = paramInt4;
    if (paramInt4 > 0) {
      this.D = paramInt1;
      this.E = paramInt2;
      this.C = paramInt3;
      this.F = 1;
      l(paramInt4);
      a(paramByte);
      return;
    } 
    paramInt4 = paramByte;
    int i = paramInt3;
    paramInt3 = paramInt2;
    paramInt2 = paramInt1;
    nd nd1 = this;
    try {
      nd1.c(paramInt2, paramInt3);
      nd1.a(paramInt4);
      nd1.b = nd1.B[i];
      nd1.s = 0;
      nd1.d(1);
      return;
    } catch (Exception exception) {
      (nd1 = null).printStackTrace();
      ct.a("loi  " + i);
      return;
    } 
  }
  
  private void a(byte paramByte) {
    this.G = cv.a(4);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, byte paramByte) {
    d(paramInt1, paramInt2, paramInt3, paramInt4);
    a(paramByte);
    this.b = this.B[paramInt5];
    this.s = 0;
    d(4);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, byte paramByte, int paramInt6) {
    d(paramInt1, paramInt2, paramInt3, paramInt4);
    a(paramByte);
    this.b = this.B[paramInt5];
    this.s = paramInt6;
    d(3);
  }
  
  public final void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.s = paramInt4;
    if (paramInt4 > 0) {
      this.D = paramInt1;
      this.E = paramInt2;
      this.C = paramInt3;
      this.F = 2;
      l(paramInt4);
      return;
    } 
    c(paramInt1, paramInt2);
    d(2);
  }
  
  public final void i(int paramInt1, int paramInt2) {
    this.t = 28;
    d(5);
    this.s = paramInt2;
  }
  
  private void d(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    c(paramInt1, paramInt2);
    b(paramInt3, paramInt4);
  }
  
  public final void d(int paramInt) {
    super.d(paramInt);
    this.g = 0;
  }
  
  private void l(int paramInt) {
    this.s = paramInt;
    d(6);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (this.e == 5) {
      paramInt1 = this.m - this.t / 2;
      paramInt2 = this.n - this.t / 2;
      cw.a(paramGraphics, A);
      cw.a(paramGraphics, A, paramInt1, paramInt2, this.t, this.t);
      b(paramGraphics);
      cw.c(paramGraphics, A);
      return;
    } 
    b(paramGraphics);
  }
  
  private void b(Graphics paramGraphics) {
    if (!this.r) {
      ct.a("[chess] draw enable");
      return;
    } 
    if (this.b != null && this.g >= 0 && this.f[this.e][this.g] >= 0)
      cw.a(paramGraphics, this.b, this.f[this.e][this.g] * this.o, 0, this.o, this.p, this.m, this.n, this.q); 
  }
  
  public final void k() {
    if (this.v < this.w) {
      this.v++;
      if (this.v == this.u)
        this.z = true; 
      if (this.z && this.v == this.u + 3)
        this.z = false; 
    } else {
      this.v = 0;
    } 
    if (this.s > 0) {
      this.s--;
      return;
    } 
    switch (this.e) {
      case 6:
        c(this.D, this.E);
        this.b = this.B[this.C];
        d(this.F);
        break;
      case 2:
        if (this.g >= (this.f[2]).length - 1)
          d(0); 
        break;
      case 3:
        if (f(this.i, at.a(this.n, this.i, 2)))
          d(1); 
        break;
      case 4:
        if (b(this.h, this.i, at.a(this.m, this.h, 2), at.a(this.n, this.i, 2)))
          d(1); 
        break;
      case 5:
        if (this.t <= 0) {
          d(0);
          return;
        } 
        this.t -= 3;
        if (this.t < 0)
          this.t = 0; 
        break;
    } 
    this.H++;
    if (this.H > 3) {
      this.H = 0;
      this.G++;
      if (this.G > 3)
        this.G = 0; 
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\nd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */