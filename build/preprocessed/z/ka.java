import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class ka extends as {
  private byte s = 0;
  
  public ll v;
  
  public int w = 1;
  
  public ka(Image paramImage, int paramInt) {
    this.b = paramImage;
    this.c = paramInt;
    this.o = paramImage.getWidth() / paramInt;
    this.p = paramImage.getHeight();
  }
  
  public final void a(byte[][] paramArrayOfbyte, int paramInt) {
    a(paramArrayOfbyte);
    this.d = new int[4][];
    for (byte b = 0; b < 4; b++) {
      this.d[b] = new int[(paramArrayOfbyte[b]).length];
      for (byte b1 = 0; b1 < (paramArrayOfbyte[b]).length; b1++)
        this.d[b][b1] = paramInt * paramArrayOfbyte[b][b1]; 
    } 
  }
  
  public void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.r)
      return; 
    if (this.b == null || this.d == null)
      return; 
    cw.a(paramGraphics, this.b, this.d[this.e][this.g], 0, this.o, this.p, this.m + paramInt1, this.n + paramInt2, 20);
  }
  
  public final void b(byte paramByte) {
    this.s = 1;
  }
  
  public final byte r() {
    return this.s;
  }
  
  public void a(byte paramByte) {}
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ka.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */