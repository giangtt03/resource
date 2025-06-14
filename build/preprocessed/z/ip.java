import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ip extends at {
  public int a;
  
  public boolean b;
  
  private int c;
  
  private Image d;
  
  private int e;
  
  private int f = 0;
  
  private int g;
  
  public ip(int paramInt1, boolean paramBoolean, int paramInt2) {
    this.a = paramInt1;
    this.b = paramBoolean;
    this.f = (paramBoolean ? 0 : 1) * 3 + paramInt1;
    if (!paramBoolean)
      this.f = 3; 
    this.d = (mp.a()).P;
    this.e = 8;
    this.o = 17;
    this.p = 17;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (this.e > 0)
      return; 
    cw.a(paramGraphics, this.d, this.f * this.o, 0, this.o, this.p, paramInt1, paramInt2 + this.c / 2, 0);
  }
  
  public final void i() {
    if (this.e > 0) {
      this.e--;
      return;
    } 
    if (this.c > 6) {
      this.c = 0;
      return;
    } 
    if (++this.g > 3) {
      this.c++;
      this.g = 0;
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ip.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */