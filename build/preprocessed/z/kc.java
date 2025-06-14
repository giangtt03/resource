import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class kc extends ke {
  private Image b;
  
  private int c = 0;
  
  private int d = 0;
  
  private int f = 20;
  
  private int g = 0;
  
  public kc(Image paramImage) {
    this.b = paramImage;
    this.m = 0;
    this.g = v.u;
    this.f = 36;
  }
  
  public final void i() {
    byte b = 0;
    int i = this.e.d();
    while (b < i) {
      ((at)this.e.b(b)).i();
      b++;
    } 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2, k paramk) {
    int i;
    for (i = this.d; i <= this.c; i++)
      paramGraphics.drawImage(this.b, this.m + i * this.b.getWidth(), this.g, this.f); 
    i = 0;
    int j = this.e.d();
    while (i < j) {
      ((at)this.e.b(i)).a(paramGraphics, paramInt1, paramInt2);
      i++;
    } 
  }
  
  public final void c(int paramInt1, int paramInt2) {
    super.c(paramInt1, paramInt2);
  }
  
  public final void f(int paramInt) {
    super.f(paramInt);
  }
  
  public final void g(int paramInt) {
    super.g(paramInt);
  }
  
  public final void a(int paramInt1, int paramInt2) {
    super.a(paramInt1, paramInt2);
    paramInt1 = this.b.getWidth();
    this.c = (v.t - this.m + paramInt1) / paramInt1 + 1;
    if (this.m > 0) {
      paramInt2 = this.m / paramInt1 + ((this.m % paramInt1 > 0) ? 1 : 0);
      this.c += paramInt2;
      this.m -= paramInt2 * paramInt1;
    } 
    if (this.a != null) {
      paramInt2 = this.a.c / paramInt1 + 1;
      this.d = (this.c >= paramInt2) ? (this.c - paramInt2) : 0;
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\kc.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */