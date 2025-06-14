import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class mi {
  private boolean d = false;
  
  private long e = 0L;
  
  private long f = 0L;
  
  int a = 0;
  
  private long g;
  
  int b;
  
  int c;
  
  public mi(int paramInt1, int paramInt2) {
    this.a = paramInt1;
    this.g = paramInt2;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.e = paramInt1;
    this.f = paramInt2;
    this.g = paramInt3;
    this.d = true;
    this.c = paramInt4;
  }
  
  public final void a() {
    if (!this.d)
      return; 
    long l;
    if ((l = this.f - this.e) < 0L) {
      if (Math.abs(l) >= 6L)
        l /= 6L; 
      this.e += l;
    } else if (l > 0L) {
      if (l <= this.g * 30L / 100L || l == this.g) {
        if (Math.abs(l) >= 6L)
          l /= 6L; 
        this.e += l;
      } else {
        this.e += l;
      } 
    } else {
      this.d = false;
    } 
    this.b = (int)(this.e * this.a / this.g);
    if (this.b > this.a) {
      this.b = this.a;
      return;
    } 
    if (this.b == 0 && this.e > 0L)
      this.b = 1; 
  }
  
  public final void a(Graphics paramGraphics, Image paramImage, int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt3 == 0) {
      mi mi2;
      int m = (mi2 = this).b;
      int n = paramImage.getHeight();
      cw.a(paramGraphics, paramImage, 0, 0, m, n, paramInt1, paramInt2, 0);
      return;
    } 
    mi mi1;
    int j = (mi1 = this).b;
    int i = paramImage.getWidth();
    int k = paramImage.getHeight() - j;
    cw.a(paramGraphics, paramImage, 0, k, i, j, paramInt1, paramInt2 + k, 0);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\mi.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */