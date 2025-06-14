import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class no extends as {
  private int s = 30;
  
  private int t = 40;
  
  private int u;
  
  private int v;
  
  private int w;
  
  private k x;
  
  private boolean y;
  
  public no() {
    this.q = 3;
  }
  
  public final void a(int paramInt1, int paramInt2, k paramk, Image paramImage, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean) {
    this.y = paramBoolean;
    this.x = paramk;
    int m = paramk.c >> 1;
    int n = paramk.d >> 1;
    m = (m <= 0) ? 1 : m;
    n = (n <= 0) ? 1 : n;
    n = paramInt5;
    m = paramInt4;
    paramInt5 = paramInt3;
    Image image = paramImage;
    paramInt3 = paramk.b + cv.a() % n;
    int j = paramk.a + cv.a() % m;
    int i = paramInt2 + cv.a() % 13;
    paramInt2 = paramInt1 + cv.a() % 13;
    no no1;
    (no1 = this).c(paramInt2, i);
    no1.h = j;
    no1.i = paramInt3;
    no1.r = true;
    no1.j = at.a(no1.m, j, no1.s) + cv.a(4);
    no1.k = at.a(no1.n, paramInt3, no1.t) + cv.a(4);
    no1.b = image;
    no1.u = paramInt5;
    no1.o = m;
    no1.p = n;
  }
  
  public final void k() {
    if (this.y) {
      if (this.v != this.x.a) {
        this.h = this.x.a + this.x.c / 2 + cv.a() % (this.x.c >> 1);
        this.v = this.x.a;
      } 
      if (this.w != this.x.b) {
        this.i = this.x.b + this.x.d / 2 + cv.a() % (this.x.d >> 1);
        this.w = this.x.b;
      } 
    } 
    if (b(this.h, this.i, this.j, this.k))
      this.r = false; 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (this.r && this.b != null && this.g >= 0 && this.f[this.e][this.g] >= 0)
      cw.a(paramGraphics, this.b, this.f[this.e][this.g] * this.o, this.u, this.o, this.p, this.m + paramInt1, this.n + paramInt2, this.q); 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\no.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */