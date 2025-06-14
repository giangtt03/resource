import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class jy extends kg {
  public jy(Image paramImage, jm paramjm, int paramInt) {
    super(paramImage, 1);
    this.d = paramjm;
    if (paramjm.d / 32 < oa.c.e / 2) {
      a(0);
    } else {
      a(1);
    } 
    b(paramjm.b);
    this.m = (this.c == 0) ? 0 : (paramInt - this.o);
    this.n = paramjm.e + (paramjm.g - this.p) / 2;
  }
  
  protected final void a(String paramString) {
    int i = bx.b.a(paramString);
    int j = 1 + i / 32;
    this.o = j << 5;
    j--;
    if (this.o <= 32)
      this.o += 32; 
    this.p = 32;
    if (this.a == null) {
      byte b1;
      byte b2 = 0;
      this.a = Image.createImage(this.o, 32);
      Graphics graphics;
      (graphics = this.a.getGraphics()).setColor(65280);
      graphics.fillRect(0, 0, this.o, 32);
      if (this.c == 1) {
        graphics.drawRegion(this.f, 32, 0, 32, 32, 0, this.o, 0, 24);
        graphics.drawRegion(this.f, 0, 0, 32, 32, 0, 0, 0, 20);
        b1 = 0;
        this.m = this.m - this.o + 32;
      } else {
        b2 = 2;
        graphics.drawRegion(this.f, 32, 0, 32, 32, 2, 0, 0, 20);
        graphics.drawRegion(this.f, 0, 0, 32, 32, 2, this.o, 0, 24);
        b1 = 32;
      } 
      for (byte b3 = 0; b3 < j; b3++) {
        graphics.drawRegion(this.f, 0, 0, 32, 32, b2, b1, 0, 20);
        b1 += 32;
      } 
      bx.b.a(graphics, paramString, this.o >> 1, 5, 1);
      this.a = ki.a(this.a, 65280);
    } 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (this.a != null)
      paramGraphics.drawImage(this.a, this.m + paramInt1, this.n + paramInt2, this.q); 
  }
  
  public final void c(int paramInt1, int paramInt2) {
    super.c(paramInt1, paramInt2);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\jy.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */