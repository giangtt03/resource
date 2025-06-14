import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ju extends ka {
  public int s = 7;
  
  public int t = 0;
  
  public int u = 2;
  
  private np x = new np();
  
  private boolean y = true;
  
  private int z = 60;
  
  public ju(Image paramImage, int paramInt) {
    super(paramImage, 1);
    a(paramImage, 1);
    a((byte)0);
    this.u = cv.a(4);
    this.s = cv.a(3, 7);
    this.x.a();
    this.g = 0;
  }
  
  public final void l(int paramInt) {
    this.z = 60;
  }
  
  public final void a(byte paramByte) {
    this.e = paramByte;
    switch (paramByte) {
      case 0:
        return;
      case 1:
        this.t = this.s;
        break;
    } 
  }
  
  public final void k() {
    super.k();
    if (this.x.g() > this.z)
      b(false); 
    if (this.x.g() > (this.z - 1))
      this.y = !this.y; 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.y)
      return; 
    super.a(paramGraphics, paramInt1, paramInt2);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ju.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */