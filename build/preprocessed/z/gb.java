import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class gb extends az {
  public static byte[][] e = new byte[][] { { 0, 0, 14, 16 }, { 14, 16, 16 }, { 30, 14, 16 }, { 44, 14, 16 } };
  
  private int g;
  
  public static Image f = f.d("/skicon");
  
  private static boolean h = false;
  
  public gb(int paramInt1, int paramInt2) {
    super(paramInt1);
    if (v.z && !h) {
      f = g.a(f, f.getWidth() + 16, 18);
      e = new byte[][] { { 0, 0, 18, 18 }, { 18, 20, 18 }, { 38, 18, 18 }, { 56, 18, 18 } };
      h = true;
      ig.a = g.a(ig.a, ig.a.getWidth(), ba.a);
    } 
    this.c = e[paramInt2][2];
    this.g = paramInt2;
  }
  
  public final void a(Graphics paramGraphics) {
    if (this.d > 0) {
      cw.a(paramGraphics, f, e[this.g][0], e[this.g][1], e[this.g][2], e[this.g][3], this.a, this.b, 0);
      return;
    } 
    cw.a(paramGraphics, f, e[this.g][0], e[this.g][1], e[this.g][2], e[this.g][3], this.a, this.b - 1, 0);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\gb.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */