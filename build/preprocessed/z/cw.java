import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class cw {
  public static k a = new k(0, 0, v.t, v.u);
  
  public static void a(Graphics paramGraphics) {
    a(paramGraphics, a);
  }
  
  public static void a(Graphics paramGraphics, k paramk) {
    paramk.a = paramGraphics.getClipX();
    paramk.b = paramGraphics.getClipY();
    paramk.c = paramGraphics.getClipWidth();
    paramk.d = paramGraphics.getClipHeight();
  }
  
  public static void b(Graphics paramGraphics, k paramk) {
    a(paramGraphics, paramk, a);
  }
  
  public static void a(Graphics paramGraphics, k paramk1, k paramk2) {
    a(paramGraphics, paramk1.a, paramk1.b, paramk1.c, paramk1.d, paramk2.a, paramk2.b, paramk2.c, paramk2.d);
  }
  
  public static void a(Graphics paramGraphics, k paramk, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    a(paramGraphics, paramk.a, paramk.b, paramk.c, paramk.d, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    a(paramGraphics, paramGraphics.getClipX(), paramGraphics.getClipY(), paramGraphics.getClipWidth(), paramGraphics.getClipHeight(), paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  private static void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8) {
    paramInt1 = paramInt1;
    paramInt2 = paramInt2;
    paramInt5 = paramInt5;
    paramInt6 = paramInt6;
    long l1 = (l1 = paramInt1) + paramInt3;
    long l2 = (l2 = paramInt2) + paramInt4;
    long l3 = (l3 = paramInt5) + paramInt7;
    long l4 = (l4 = paramInt6) + paramInt8;
    if (paramInt1 < paramInt5)
      paramInt1 = paramInt5; 
    if (paramInt2 < paramInt6)
      paramInt2 = paramInt6; 
    if (l1 > l3)
      l1 = l3; 
    if (l2 > l4)
      l2 = l4; 
    l1 -= paramInt1;
    l2 -= paramInt2;
    if (l1 < -2147483648L)
      l1 = -2147483648L; 
    if (l2 < -2147483648L)
      l2 = -2147483648L; 
    paramGraphics.setClip(paramInt1, paramInt2, (int)l1, (int)l2);
  }
  
  public static void c(Graphics paramGraphics, k paramk) {
    paramGraphics.setClip(paramk.a, paramk.b, paramk.c, paramk.d);
  }
  
  public static void b(Graphics paramGraphics) {
    c(paramGraphics, a);
  }
  
  public static final void a(Graphics paramGraphics, Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {
    if ((paramInt7 & 0x1) > 0) {
      paramInt5 -= paramInt3 >> 1;
    } else if ((paramInt7 & 0x8) > 0) {
      paramInt5 -= paramInt3;
    } 
    if ((paramInt7 & 0x2) > 0) {
      paramInt6 -= paramInt4 >> 1;
    } else if ((paramInt7 & 0x20) > 0) {
      paramInt6 -= paramInt4;
    } 
    paramGraphics.drawRegion(paramImage, paramInt1, paramInt2, paramInt3, paramInt4, 0, paramInt5, paramInt6, 0);
  }
  
  public static void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    // Byte code:
    //   0: aload_0
    //   1: ldc 15198183
    //   3: invokevirtual setColor : (I)V
    //   6: iload_2
    //   7: istore_1
    //   8: iload_3
    //   9: istore #6
    //   11: iload_2
    //   12: istore #7
    //   14: iload_3
    //   15: istore #8
    //   17: aload_0
    //   18: iload_1
    //   19: iload #6
    //   21: iload #7
    //   23: iload #8
    //   25: invokevirtual drawLine : (IIII)V
    //   28: iload #6
    //   30: iload_3
    //   31: iload #5
    //   33: iadd
    //   34: if_icmpge -> 43
    //   37: iinc #6, 2
    //   40: goto -> 54
    //   43: iinc #1, 2
    //   46: iload_1
    //   47: iload_2
    //   48: iload #4
    //   50: iadd
    //   51: if_icmpgt -> 81
    //   54: iload #7
    //   56: iload_2
    //   57: iload #4
    //   59: iadd
    //   60: if_icmpge -> 69
    //   63: iinc #7, 2
    //   66: goto -> 17
    //   69: iinc #8, 2
    //   72: iload #8
    //   74: iload_3
    //   75: iload #5
    //   77: iadd
    //   78: if_icmple -> 17
    //   81: return
  }
  
  public static void b(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    paramGraphics.setColor(paramInt1);
    paramGraphics.fillRect(paramInt2 + 2, paramInt3, paramInt4 - 4, 1);
    paramGraphics.fillRect(paramInt2 + 2, paramInt3 + paramInt5 - 1, paramInt4 - 4, 1);
    paramGraphics.fillRect(paramInt2, paramInt3 + 2, 1, paramInt5 - 4);
    paramGraphics.fillRect(paramInt2 + paramInt4 - 1, paramInt3 + 2, 1, paramInt5 - 4);
    paramGraphics.fillRect(paramInt2 + 1, paramInt3 + 1, 1, 1);
    paramGraphics.fillRect(paramInt2 + 1, paramInt3 + paramInt5 - 2, 1, 1);
    paramGraphics.fillRect(paramInt2 + paramInt4 - 2, paramInt3 + 1, 1, 1);
    paramGraphics.fillRect(paramInt2 + paramInt4 - 2, paramInt3 + paramInt5 - 2, 1, 1);
  }
  
  public static final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {
    a(paramGraphics, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, false, paramInt6, paramInt7);
  }
  
  public static final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean, int paramInt6, int paramInt7) {
    if (paramInt6 >= 0) {
      paramGraphics.setColor(paramInt6);
      paramGraphics.fillRect(paramInt1 + 1, paramInt2 + 2, paramInt3 - 2, paramInt4 - 4);
      paramGraphics.fillRect(paramInt1 + 4, paramInt2 + 1, paramInt3 - 8, 1);
      paramGraphics.fillRect(paramInt1 + 4, paramInt2 + paramInt4 - 2, paramInt3 - 8, 1);
    } 
    paramGraphics.setColor(paramInt7);
    paramGraphics.fillRect(paramInt1 + 4, paramInt2, paramInt3 - 8, 1);
    paramGraphics.fillRect(paramInt1 + 4, paramInt2 + paramInt4 - 1, paramInt3 - 8, 1);
    paramGraphics.fillRect(paramInt1 + 2, paramInt2 + 1, 2, 1);
    paramGraphics.fillRect(paramInt1 + paramInt3 - 4, paramInt2 + 1, 2, 1);
    paramGraphics.fillRect(paramInt1 + 2, paramInt2 + paramInt4 - 2, 2, 1);
    paramGraphics.fillRect(paramInt1 + paramInt3 - 4, paramInt2 + paramInt4 - 2, 2, 1);
    paramGraphics.fillRect(paramInt1, paramInt2 + 4, 1, paramInt4 - 8);
    paramGraphics.fillRect(paramInt1 + paramInt3 - 1, paramInt2 + 4, 1, paramInt4 - 8);
    paramGraphics.fillRect(paramInt1 + 1, paramInt2 + 2, 1, 2);
    paramGraphics.fillRect(paramInt1 + 1, paramInt2 + paramInt4 - 4, 1, 2);
    paramGraphics.fillRect(paramInt1 + paramInt3 - 2, paramInt2 + 2, 1, 2);
    paramGraphics.fillRect(paramInt1 + paramInt3 - 2, paramInt2 + paramInt4 - 4, 1, 2);
    if (paramInt5 >= 0) {
      paramGraphics.setColor(paramInt6);
      if (paramBoolean) {
        paramGraphics.fillTriangle(paramInt5 - 5, paramInt2 + 1, paramInt5 + 5, paramInt2 + 1, paramInt5, paramInt2 - 7);
        paramGraphics.setColor(paramInt7);
        paramGraphics.drawLine(paramInt5, paramInt2 - 7, paramInt5 - 5, paramInt2 + 1);
        paramGraphics.drawLine(paramInt5, paramInt2 - 7, paramInt5 + 5, paramInt2 + 1);
        return;
      } 
      paramGraphics.fillTriangle(paramInt5 - 5, paramInt2 + paramInt4 - 1, paramInt5 + 5, paramInt2 + paramInt4 - 1, paramInt5, paramInt2 + paramInt4 + 7);
      paramGraphics.setColor(paramInt7);
      paramGraphics.drawLine(paramInt5, paramInt2 + paramInt4 + 7, paramInt5 - 5, paramInt2 + paramInt4 - 1);
      paramGraphics.drawLine(paramInt5, paramInt2 + paramInt4 + 7, paramInt5 + 5, paramInt2 + paramInt4 - 1);
    } 
  }
  
  static {
    (new byte[3])[0] = 1;
    (new byte[3])[1] = 2;
    (new byte[3])[2] = 1;
    (new byte[3][])[0] = new byte[3];
    (new byte[3])[0] = 2;
    (new byte[3])[1] = 4;
    (new byte[3])[2] = 2;
    (new byte[3][])[1] = new byte[3];
    (new byte[3])[0] = 1;
    (new byte[3])[1] = 2;
    (new byte[3])[2] = 1;
    (new byte[3][])[2] = new byte[3];
    (new byte[5])[1] = 1;
    (new byte[5])[2] = 2;
    (new byte[5])[3] = 1;
    (new byte[5][])[0] = new byte[5];
    (new byte[5])[0] = 1;
    (new byte[5])[1] = 3;
    (new byte[5])[2] = 5;
    (new byte[5])[3] = 3;
    (new byte[5])[4] = 1;
    (new byte[5][])[1] = new byte[5];
    (new byte[5])[0] = 2;
    (new byte[5])[1] = 5;
    (new byte[5])[2] = 9;
    (new byte[5])[3] = 5;
    (new byte[5])[4] = 2;
    (new byte[5][])[2] = new byte[5];
    (new byte[5])[0] = 1;
    (new byte[5])[1] = 3;
    (new byte[5])[2] = 5;
    (new byte[5])[3] = 3;
    (new byte[5])[4] = 1;
    (new byte[5][])[3] = new byte[5];
    (new byte[5])[1] = 1;
    (new byte[5])[2] = 2;
    (new byte[5])[3] = 1;
    (new byte[5][])[4] = new byte[5];
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\cw.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */