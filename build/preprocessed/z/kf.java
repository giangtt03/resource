import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class kf extends kb {
  private Image b;
  
  private byte[][] c;
  
  private byte[][] d;
  
  private byte e = 32;
  
  private byte f = 32;
  
  private int g = 0;
  
  private int h = 0;
  
  private int i = 0;
  
  public kf(Image paramImage, byte[][] paramArrayOfbyte, byte paramByte1, byte paramByte2) {
    Image image = paramImage;
    kf kf1;
    (kf1 = this).b = image;
    byte[][] arrayOfByte = paramArrayOfbyte;
    (kf1 = this).c = arrayOfByte;
    kf1.g = arrayOfByte.length;
    kf1.h = (arrayOfByte[0]).length;
    this.i = paramImage.getWidth() / 32;
    this.p = paramArrayOfbyte.length * this.e;
    this.o = (paramArrayOfbyte[0]).length * this.e;
  }
  
  public final void a(k paramk) {
    super.a(paramk);
    c(paramk.a, paramk.b);
  }
  
  public final void a(Graphics paramGraphics) {}
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2, k paramk) {
    int j;
    if ((j = paramk.a / this.e - 1) < 0)
      j = 0; 
    int m;
    if ((m = paramk.b / this.f - 1) < 0)
      m = 0; 
    int n = ((n = (paramk.a + paramk.c) / this.e + 1) > this.h) ? this.h : n;
    int i = ((i = (paramk.b + paramk.d) / this.f + 1) > this.g) ? this.g : i;
    for (int i1 = m; i1 < i; i1++) {
      for (int i2 = j; i2 < n; i2++) {
        if ((m = (this.c[i1][i2] & 0xFF) - 1) >= 0)
          cw.a(paramGraphics, this.b, m % this.i * this.e, m / this.i * this.f, this.e, this.f, i2 * this.e + paramInt1, i1 * this.f + paramInt2, 0); 
      } 
    } 
  }
  
  public final void i() {}
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {}
  
  public final byte b(int paramInt1, int paramInt2) {
    return (this.d == null || paramInt2 < 0 || paramInt1 < 0 || paramInt1 >= this.g || paramInt2 >= this.h) ? 0 : this.d[paramInt1][paramInt2];
  }
  
  public final void a(byte[][] paramArrayOfbyte) {
    this.d = paramArrayOfbyte;
  }
  
  public final void b() {
    this.c = null;
    this.d = null;
    this.b = null;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\kf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */