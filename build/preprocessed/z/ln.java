import javax.microedition.lcdui.Graphics;

public final class ln extends as {
  private static byte[][] s = new byte[][] { { 0, 0, 1, 1, 2, 2, 3, 3 } };
  
  private static int[] t = new int[] { 0, 0, 0, 0, 3, 3, 3, 3 };
  
  private static int[] u = new int[] { -1, -2, -3, -4, -3, -2, -1 };
  
  public ln() {
    a(f.d("/magicgate"), 4);
    a(s);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (this.g < 0)
      return; 
    c(t[this.g]);
    super.a(paramGraphics, paramInt1, paramInt2);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ln.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */