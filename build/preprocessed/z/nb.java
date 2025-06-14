import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class nb extends at {
  private int a;
  
  private int b;
  
  private int c;
  
  private int d;
  
  private boolean e = false;
  
  private Image f;
  
  private int g;
  
  private int h;
  
  private int i;
  
  private int j;
  
  private int k;
  
  public nb(Image paramImage) {
    this.f = paramImage;
    if (paramImage == null)
      return; 
    this.o = paramImage.getWidth() / 6;
    this.p = paramImage.getHeight() / 10;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    c(paramInt1, paramInt2);
    this.k = paramInt5;
    this.a = paramInt3;
    this.b = paramInt4;
    this.c = paramInt1;
    this.d = paramInt2;
    paramInt5 = 20 + cv.a(40);
    paramInt1 = Math.abs(paramInt1 - paramInt3);
    paramInt2 = Math.abs(paramInt2 - paramInt4);
    if (paramInt1 > paramInt2) {
      this.d -= paramInt1 - paramInt2;
      this.d -= paramInt5;
      if (paramInt3 < v.t / 2) {
        this.c += paramInt5;
      } else {
        this.c -= paramInt5;
      } 
    } else {
      this.d -= paramInt5;
      paramInt5 += paramInt2 - paramInt1;
      if (paramInt3 < v.t / 2) {
        this.c += paramInt5;
      } else {
        this.c -= paramInt5;
      } 
    } 
    if (paramInt3 < v.t / 2) {
      this.j = 2;
    } else {
      this.j = 0;
    } 
    this.i = 0;
    this.e = false;
    this.r = true;
    this.g = at.a(this.m, this.c, 14) + cv.a(4);
    this.h = at.a(this.n, this.d, 14) + cv.a(4);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.r || this.f == null)
      return; 
    paramGraphics.drawRegion(this.f, this.i * this.o, this.k, this.o, this.p, this.j, this.m, this.n, 3);
  }
  
  public final void i() {
    if (!this.r)
      return; 
    if (this.e) {
      if (this.i < 2)
        this.i++; 
      this.g++;
      this.h++;
      if (b(this.a, this.b, this.g, this.h)) {
        this.r = false;
        this.i = 1;
        return;
      } 
    } else if (b(this.c, this.d, this.g, this.h)) {
      this.e = true;
      this.g = at.a(this.m, this.a, 28);
      this.h = at.a(this.n, this.b, 28);
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\nb.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */