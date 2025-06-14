import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class md extends mg {
  static final byte[][] s = new byte[][] { new byte[3], { 1, 2, 3, 1, 2, 3 } };
  
  public md(Image[] paramArrayOfImage, int[][] paramArrayOfint1, int[][] paramArrayOfint2, g paramg) {
    super(paramArrayOfImage, paramArrayOfint1, paramArrayOfint2, paramg);
  }
  
  public final void d(int paramInt) {
    super.d(paramInt);
  }
  
  public final void s() {
    this.g++;
    if (this.g >= (this.f[this.e]).length)
      this.g = 0; 
  }
  
  public final void t() {
    this.g--;
    if (this.g < 0)
      this.g = (this.f[this.e]).length - 1; 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.r || this.g < 0)
      return; 
    if (this.e == 1)
      paramInt1 -= 5; 
    super.a(paramGraphics, paramInt1 + ((this.a == 2) ? 10 : 0), paramInt2);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\md.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */