import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class gn extends aq {
  private Image i;
  
  private String[] j;
  
  private int k = 3;
  
  public gn(Image paramImage, String paramString, int paramInt) {
    this.i = paramImage;
    this.j = bx.a(paramString, paramInt - 4);
    if (paramImage != null)
      this.k = paramImage.getHeight() + 2; 
    e(this.k + this.j.length * bx.d.a() + 5);
    d(paramInt);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (m()) {
      paramGraphics.setColor(7267055);
      paramGraphics.fillRect(c() + paramInt1, d() + paramInt2, e(), f());
    } 
    if (this.i != null)
      cw.a(paramGraphics, this.i, 0, 0, this.i.getWidth() / 7, this.i.getHeight(), c() + e() / 2 + paramInt1, d() + paramInt2, 17); 
    bx.a(paramGraphics, bx.d, this.j, c() + 3 + paramInt1, d() + paramInt2 + this.k, e(), f(), 0);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\gn.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */