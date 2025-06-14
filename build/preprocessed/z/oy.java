import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class oy {
  public static short[] a = new short[] { 
      0, 50, 100, 150, 200, 50, 100, 150, 200, 50, 
      100, 150, 200, 50, 100, 150, 200 };
  
  public static short[] b = new short[] { 
      0, 0, 0, 0, 0, 50, 50, 50, 50, 50, 
      100, 100, 100, 100, 100, 150, 150, 150, 150, 150 };
  
  public static short[] c = new short[] { 
      50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 
      50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
  
  public static short[] d = new short[] { 
      50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 
      50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
  
  public static short e = 50;
  
  public static Image f;
  
  public static boolean g = false;
  
  public static void a() {
    if (f != null && g)
      return; 
    g = false;
    try {
      if (f == null) {
        f = f.d("/onions");
        g = true;
        a = new short[] { 
            0, 50, 100, 150, 200, 50, 100, 150, 200, 50, 
            100, 150, 200, 50, 100, 150, 200 };
        b = new short[] { 
            0, 0, 0, 0, 0, 50, 50, 50, 50, 50, 
            100, 100, 100, 100, 100, 150, 150, 150, 150, 150 };
        c = new short[] { 
            50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 
            50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
        d = new short[] { 
            50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 
            50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
        return;
      } 
    } catch (Throwable throwable2) {
      Throwable throwable1;
      (throwable1 = null).printStackTrace();
      f = null;
      g = false;
    } 
  }
  
  public static void b() {
    g = false;
    f = null;
    d = null;
    c = null;
    a = null;
    b = null;
    g = false;
  }
  
  public static void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (g && f != null && paramInt1 >= 0 && paramInt1 < 20)
      paramGraphics.drawRegion(f, a[paramInt1], b[paramInt1], c[paramInt1], d[paramInt1], 0, paramInt2, paramInt3, paramInt4); 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\oy.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */