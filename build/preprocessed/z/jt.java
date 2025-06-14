import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class jt extends at {
  private Image a = f.d("/info/gauge");
  
  private k b = new k(3, 2, 87, 8);
  
  private k c = new k(3, 12, 87, 8);
  
  private int d = 0;
  
  private int e = 0;
  
  private int[] f = new int[] { 7930113, 12386818, 13894146, 16583949, 12911106, 10289666, 9372162 };
  
  private int[] g = new int[] { 2193665, 3456258, 3855362, 5111053, 3589378, 2858242, 2592514 };
  
  public jt(lh paramlh) {
    a(paramlh);
    h(this.a.getWidth());
    i(this.a.getHeight());
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    paramGraphics.drawImage(this.a, paramInt1, paramInt2, 0);
    pc.a(paramGraphics, this.b, this.d, this.f, paramInt1, paramInt2);
    pc.a(paramGraphics, this.c, this.e, this.g, paramInt1, paramInt2);
  }
  
  public final void i() {}
  
  public final void a(lh paramlh) {
    this.d = paramlh.s * (this.b.c - 2) / paramlh.r;
    int j = paramlh.J - paramlh.M;
    int i = paramlh.N - paramlh.M;
    this.e = j * (this.c.c - 2) / i;
    if (this.e > this.c.c)
      this.e = this.c.c - 2; 
    if (this.d > this.b.c)
      this.d = this.b.c - 2; 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\jt.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */