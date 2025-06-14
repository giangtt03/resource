import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ly extends ea {
  private static int[] a = new int[] { 
      4, 3, 4, 4, 5, 4, 4, 4, 4, 4, 
      5 };
  
  private static int[] b = new int[] { 
      0, 4, 7, 11, 15, 20, 24, 28, 32, 36, 
      40 };
  
  private static Image c;
  
  public static void f() {
    if (c == null)
      c = f.d("/tinynumber"); 
  }
  
  public static void g() {
    c = null;
  }
  
  public static int b(int paramInt) {
    return c((new StringBuffer(String.valueOf(paramInt))).toString());
  }
  
  public static int c(String paramString) {
    if (i.b(paramString))
      return 0; 
    int i = 0;
    for (byte b = 0; b < paramString.length(); b++) {
      char c;
      if ((c = paramString.charAt(b)) == '+') {
        i += a[10] + 1;
      } else {
        i += a[c - 48] + 1;
      } 
    } 
    return i - 1;
  }
  
  public static void a(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2) {
    if (c == null)
      return; 
    paramInt1 = paramInt1;
    for (byte b = 0; b < paramString.length(); b++) {
      char c = paramString.charAt(b);
      int i = 10;
      if (c != '+')
        i = c - 48; 
      cw.a(paramGraphics, c, b[i], 0, a[i], 7, paramInt1, paramInt2, 0);
      paramInt1 += a[i] + 1;
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ly.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */