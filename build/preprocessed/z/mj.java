import javax.microedition.lcdui.Graphics;

public final class mj extends at {
  private int a;
  
  private int b;
  
  private String[] c;
  
  private int d;
  
  private k e;
  
  private int f = 0;
  
  private int g;
  
  private int h;
  
  private int i;
  
  public mj(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    a(paramInt1, paramInt2, paramInt3, 20);
    this.g = paramInt3;
    this.h = paramInt1;
    this.f = o() + 20;
    this.e = new k();
  }
  
  public final void a(String paramString, int paramInt1, int paramInt2, int paramInt3) {
    this.a = paramInt2;
    this.d = paramInt1;
    this.c = bx.a(paramString, this.g, bx.d);
    i(this.c.length * 20);
    g(this.f - q());
    if (paramInt1 == 0) {
      int j = bx.d.a(this.c[0]) + 20;
      if (this.c.length == 1 && j < this.g)
        h(j); 
      this.m = this.h;
      this.b = this.m + 20;
      return;
    } 
    int i = bx.d.a(this.c[0]) + 20;
    if (this.c.length == 1 && i < this.g)
      h(i); 
    this.m = this.h + this.g - p();
    this.b = this.m + this.o - 20;
  }
  
  public final void a(String paramString, int paramInt) {
    a(paramString, paramInt, 100, 20);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (this.c == null)
      return; 
    paramInt2 += o() + ((this.d == 1) ? this.i : 0);
    if (this.d == 0) {
      cw.a(paramGraphics, n(), paramInt2, p(), q(), this.b, 14808319, 152707);
    } else {
      cw.a(paramGraphics, n(), paramInt2, p(), q(), this.b, 16775619, 8023552);
    } 
    cw.a(paramGraphics, this.e);
    cw.a(paramGraphics, this.m + 6, paramInt2 + 4, p() - 8, q());
    bx.a(paramGraphics, bx.d, this.c, this.m + 6, paramInt2 + 4, p() - 8, q(), 0);
    cw.c(paramGraphics, this.e);
  }
  
  public final void i() {
    if (this.a > 0) {
      this.a--;
      if (this.a == 0) {
        this.c = null;
        h(this.g);
        f(this.h);
      } 
    } 
  }
  
  public final void a(int paramInt) {
    if (paramInt > 0)
      return; 
    this.i = paramInt;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\mj.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */