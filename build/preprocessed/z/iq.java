import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class iq extends im {
  private static byte[][] s = new byte[][] { { 0, 0, 1, 1, 1 }, { 2, 2, 2, 3, 3, 3 }, { 4, 5, 5 } };
  
  private Image t;
  
  public iq(Image paramImage1, Image paramImage2) {
    a(paramImage1, 6);
    this.t = paramImage2;
    a(s);
    this.r = false;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    c(paramInt1, paramInt2);
    d(0);
    this.r = true;
  }
  
  public final void k() {
    switch (this.e) {
      case 0:
        if (j()) {
          d(1);
          return;
        } 
        break;
      case 2:
        if (j()) {
          this.r = false;
          return;
        } 
        break;
      case 1:
        if (j())
          d(2); 
        break;
    } 
  }
  
  public final void b(Graphics paramGraphics) {
    if (!this.r || this.g < 0)
      return; 
    int i = this.f[this.e][this.g];
    cw.a(paramGraphics, this.b, i * this.o, 0, this.o, this.p, this.m, this.n, 36);
    paramGraphics.drawRegion(this.b, i * this.o, 0, this.o, this.p, 2, this.m + 1, this.n, 40);
  }
  
  public final void c(Graphics paramGraphics) {
    if (!this.r || this.g < 0)
      return; 
    int i;
    if ((i = this.f[this.e][this.g]) == 2) {
      paramGraphics.drawRegion(this.t, 0, 0, this.t.getWidth(), this.t.getHeight(), 5, this.m + 5, this.n - 5, 40);
      paramGraphics.drawRegion(this.t, 0, 0, this.t.getWidth(), this.t.getHeight(), 5, this.m - 1, this.n - 7, 36);
      paramGraphics.drawImage(this.t, this.m + 2, this.n - 9 - this.t.getHeight(), 33);
      return;
    } 
    if (i == 3) {
      paramGraphics.drawImage(this.t, this.m, this.n - 8, 33);
      paramGraphics.drawImage(this.t, this.m + 4, this.n - 3 - this.t.getHeight(), 33);
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\iq.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */