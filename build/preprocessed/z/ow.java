import javax.microedition.lcdui.Graphics;

public final class ow {
  private static int[][] a = new int[][] { 
      new int[2], { 229, 1 }, { 229, 254 }, { 228, 255 }, { 145, 255 }, { 144, 254 }, { 144, 230 }, { 85, 230 }, { 85, 254 }, { 84, 255 }, 
      { 1, 255 }, { 0, 254 }, { 0, 1 } };
  
  private static int[][] b = new int[][] { { 1, 229 }, { 1, 253 }, { 2, 254 }, { 83, 254 }, { 84, 253 }, { 84, 229 } };
  
  private static int[][] c = new int[][] { { 228, 229 }, { 228, 253 }, { 227, 254 }, { 146, 254 }, { 145, 253 }, { 145, 229 } };
  
  private static int[][] d = new int[][] { 
      { 1 }, { 280 }, { 281, 1 }, { 281, 84 }, { 280, 85 }, { 255, 85 }, { 255, 229 }, { 26, 229 }, { 26, 85 }, { 1, 85 }, 
      { 0, 84 }, { 0, 1 } };
  
  private static int[][] e = new int[][] { { 26, 1 }, { 2, 1 }, { 1, 2 }, { 1, 83 }, { 2, 84 }, { 27, 84 } };
  
  private static int[][] f = new int[][] { { 255, 1 }, { 279, 1 }, { 280, 2 }, { 280, 83 }, { 279, 84 }, { 255, 84 } };
  
  public static void a(int paramInt1, int paramInt2, Graphics paramGraphics) {
    paramGraphics = paramGraphics;
    c((paramInt1 += 5) + 3, ++paramInt2 + 3, paramGraphics);
    paramGraphics.setColor(5921370);
    paramGraphics.fillRect(paramInt1 + 3, paramInt2 + 230, 81, 24);
    paramGraphics.fillRect(paramInt1 + 147, paramInt2 + 230, 81, 24);
    paramGraphics.setColor(10040319);
    a(paramInt1, paramInt2, a, paramGraphics);
    paramGraphics.setColor(52479);
    paramGraphics.drawRect(paramInt1 + 1, paramInt2 + 1, 228, 228);
    a(paramInt1, paramInt2, b, paramGraphics);
    a(paramInt1, paramInt2, c, paramGraphics);
    paramGraphics.setColor(230911);
    paramGraphics.drawRect(paramInt1 + 2, paramInt2 + 2, 226, 226);
    paramGraphics.drawRect(paramInt1 + 2, paramInt2 + 229, 82, 25);
    paramGraphics.drawRect(paramInt1 + 146, paramInt2 + 229, 82, 25);
    a(paramInt1 + 5, paramInt2 + 232, paramGraphics, false);
    a(paramInt1 + 5, paramInt2 + 239, paramGraphics, true);
    a(paramInt1 + 5, paramInt2 + 246, paramGraphics, false);
    a(paramInt1 + 149, paramInt2 + 232, paramGraphics, false);
    a(paramInt1 + 149, paramInt2 + 239, paramGraphics, true);
    a(paramInt1 + 149, paramInt2 + 246, paramGraphics, false);
  }
  
  public static void b(int paramInt1, int paramInt2, Graphics paramGraphics) {
    paramGraphics = paramGraphics;
    c((paramInt1 += 19) + 29, ++paramInt2 + 3, paramGraphics);
    paramGraphics.setColor(5921370);
    paramGraphics.fillRect(paramInt1 + 3, paramInt2 + 3, 24, 81);
    paramGraphics.fillRect(paramInt1 + 256, paramInt2 + 3, 24, 81);
    paramGraphics.setColor(10040319);
    a(paramInt1, paramInt2, d, paramGraphics);
    paramGraphics.setColor(52479);
    paramGraphics.drawRect(paramInt1 + 27, paramInt2 + 1, 228, 228);
    a(paramInt1, paramInt2, e, paramGraphics);
    a(paramInt1, paramInt2, f, paramGraphics);
    paramGraphics.setColor(230911);
    paramGraphics.drawRect(paramInt1 + 28, paramInt2 + 2, 226, 226);
    paramGraphics.drawRect(paramInt1 + 2, paramInt2 + 2, 25, 82);
    paramGraphics.drawRect(paramInt1 + 255, paramInt2 + 2, 25, 82);
    b(paramInt1 + 5, paramInt2 + 5, paramGraphics, false);
    b(paramInt1 + 12, paramInt2 + 5, paramGraphics, true);
    b(paramInt1 + 19, paramInt2 + 5, paramGraphics, false);
    b(paramInt1 + 258, paramInt2 + 5, paramGraphics, false);
    b(paramInt1 + 265, paramInt2 + 5, paramGraphics, true);
    b(paramInt1 + 272, paramInt2 + 5, paramGraphics, false);
  }
  
  private static void a(int paramInt1, int paramInt2, Graphics paramGraphics, boolean paramBoolean) {
    paramGraphics.drawLine(paramInt1 + 1, paramInt2, paramInt1 + 74, paramInt2);
    paramGraphics.drawLine(paramInt1 + 75, paramInt2 + 1, paramInt1 + 75, paramInt2 + 3);
    paramGraphics.drawLine(paramInt1 + 1, paramInt2 + 4, paramInt1 + 74, paramInt2 + 4);
    paramGraphics.drawLine(paramInt1, paramInt2 + 1, paramInt1, paramInt2 + 3);
    if (paramBoolean) {
      paramGraphics.drawLine(paramInt1 + 18, paramInt2 + 1, paramInt1 + 18, paramInt2 + 3);
      paramGraphics.drawLine(paramInt1 + 37, paramInt2 + 1, paramInt1 + 37, paramInt2 + 3);
      paramGraphics.drawLine(paramInt1 + 56, paramInt2 + 1, paramInt1 + 56, paramInt2 + 3);
    } 
  }
  
  private static void b(int paramInt1, int paramInt2, Graphics paramGraphics, boolean paramBoolean) {
    paramGraphics.drawLine(paramInt1, paramInt2 + 1, paramInt1, paramInt2 + 74);
    paramGraphics.drawLine(paramInt1 + 1, paramInt2 + 75, paramInt1 + 3, paramInt2 + 75);
    paramGraphics.drawLine(paramInt1 + 4, paramInt2 + 1, paramInt1 + 4, paramInt2 + 74);
    paramGraphics.drawLine(paramInt1 + 1, paramInt2, paramInt1 + 3, paramInt2);
    if (paramBoolean) {
      paramGraphics.drawLine(paramInt1 + 1, paramInt2 + 18, paramInt1 + 3, paramInt2 + 18);
      paramGraphics.drawLine(paramInt1 + 1, paramInt2 + 37, paramInt1 + 3, paramInt2 + 37);
      paramGraphics.drawLine(paramInt1 + 1, paramInt2 + 56, paramInt1 + 3, paramInt2 + 56);
    } 
  }
  
  private static void c(int paramInt1, int paramInt2, Graphics paramGraphics) {
    for (byte b = 0; b < 8; b++) {
      for (byte b1 = 0; b1 < 8; b1++) {
        if ((b % 2 == 0 && b1 % 2 == 0) || (b % 2 == 1 && b1 % 2 == 1)) {
          paramGraphics.setColor(4671303);
        } else {
          paramGraphics.setColor(3815994);
        } 
        paramGraphics.fillRect(paramInt1 + b * 28, paramInt2 + b1 * 28, 28, 28);
      } 
    } 
  }
  
  private static void a(int paramInt1, int paramInt2, int[][] paramArrayOfint, Graphics paramGraphics) {
    for (byte b = 0; b < paramArrayOfint.length - 1; b++)
      paramGraphics.drawLine(paramInt1 + paramArrayOfint[b][0], paramInt2 + paramArrayOfint[b][1], paramInt1 + paramArrayOfint[b + 1][0], paramInt2 + paramArrayOfint[b + 1][1]); 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ow.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */