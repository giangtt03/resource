import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class nc extends as {
  private boolean s = false;
  
  private int t;
  
  private int u;
  
  public nc(Image paramImage, int paramInt1, int paramInt2, int paramInt3) {
    this.b = paramImage;
    this.o = paramInt1;
    this.p = paramInt2;
    this.u = paramInt3;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    c(paramInt1, paramInt2);
    this.h = paramInt3;
    this.i = paramInt4;
    this.r = true;
    this.j = at.a(this.m, paramInt3, 20) + cv.a(3);
    this.k = at.a(this.n, paramInt4, 20) + cv.a(3);
    this.s = false;
    this.t = paramInt5;
  }
  
  public final void k() {
    if (this.t > 0) {
      this.t--;
      return;
    } 
    if (this.s) {
      this.k++;
      this.j++;
    } else {
      this.j = at.a(this.m, this.h, 4) + cv.a(2);
      this.k = at.a(this.n, this.i, 8) + cv.a(2);
    } 
    if (b(this.h, this.i, this.j, this.k)) {
      if (this.s) {
        this.r = false;
        return;
      } 
      this.h = this.m + cv.a(20);
      this.i = this.n + 40 + cv.a(100);
      this.j = at.a(this.m, this.h, 14) + cv.a(2);
      this.k = at.a(this.n, this.i, 10) + cv.a(2);
      this.s = true;
      b(this.h, this.i, this.j, this.k);
    } 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.r || this.t > 0)
      return; 
    if (this.g >= 0 && this.f[this.e][this.g] >= 0 && this.b != null)
      cw.a(paramGraphics, this.b, this.f[this.e][this.g] * this.o, this.u, this.o, this.p, this.m + paramInt1, this.n + paramInt2, this.q); 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\nc.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */