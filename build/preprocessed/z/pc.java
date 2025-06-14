import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class pc extends cw {
  private static final Image i = f.d("/focusmovechess1");
  
  public static Image b = f.d("/crystalblue");
  
  public static Image c = f.d("/notifygtmicon");
  
  private static Image j = f.d("/tab");
  
  private static Image k = f.d("/dialog/corner");
  
  private static Image l = f.d("/corner/2");
  
  public static Image d = f.d("/hiddendragon");
  
  public static final Image e = f.d("/m/hand");
  
  public static final Image f = f.d("/m/arrow");
  
  private static Image m = null;
  
  private static int[] n = new int[] { 
      0, 9, 24, 33, 43, 59, 67, 73, 89, 105, 
      121, 137, 152, 163, 179, 202, 210, 221, 229, 243, 
      259, 275, 291, 305, 315 };
  
  private static int[] o = new int[25];
  
  public static final int[] g = new int[] { 
      9, 15, 9, 10, 16, 8, 6, 16, 16, 16, 
      16, 15, 11, 16, 23, 8, 11, 8, 14, 16, 
      16, 16, 14, 10, 6 };
  
  private static int[] p = new int[] { 
      9, 15, 15, 12, 16, 11, 10, 16, 16, 16, 
      16, 13, 15, 16, 20, 8, 10, 14, 8, 16, 
      16, 16, 14, 11, 12 };
  
  private static Image q = f.d("/hiddenphoenix");
  
  private static Image r = f.d("/roomicon");
  
  public static Image h = f.d("/elementsicon");
  
  private static int s = 0;
  
  private static Image t = null;
  
  private static Image u;
  
  private static int v;
  
  private static int w;
  
  public static void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) {
    int i = 10323806;
    int j = 14273459;
    int k = 15722458;
    if (paramBoolean) {
      i = 22523;
      j = 9287679;
      k = 13295359;
    } 
    b(paramGraphics, paramInt1, paramInt2, paramInt3, paramInt4, i, k, j);
  }
  
  public static void b(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    cw.a(paramGraphics, j, paramInt3 * 35, 0, 35, 37, paramInt1, paramInt2, 3);
  }
  
  public static void b(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {
    a(paramGraphics, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt7);
    paramGraphics.setColor(paramInt6);
    paramGraphics.fillRect(paramInt1 + 1, paramInt2 + paramInt4 - 2, paramInt3 - 2, 1);
    paramGraphics.fillRect(paramInt1 + paramInt3 - 2, paramInt2 + 1, 1, paramInt4 - 2);
  }
  
  public static void c(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    cw.b(paramGraphics, 22246, paramInt1, paramInt2, paramInt3, paramInt4);
    paramGraphics.setColor(16579546);
    paramGraphics.drawRect(paramInt1 + 1, paramInt2 + 1, paramInt3 - 3, paramInt4 - 3);
    paramGraphics.setColor(230911);
    paramGraphics.drawRect(paramInt1 + 2, paramInt2 + 2, paramInt3 - 5, paramInt4 - 5);
    if (paramInt5 > 0) {
      paramGraphics.setColor(paramInt5);
      paramGraphics.fillRect(paramInt1 + 3, paramInt2 + 3, paramInt3 - 6, paramInt4 - 6);
    } 
    paramGraphics.drawImage(k, paramInt1, paramInt2, 0);
    paramGraphics.drawRegion(k, 0, 0, k.getWidth(), k.getHeight(), 2, paramInt1 + paramInt3, paramInt2, 24);
    paramGraphics.drawRegion(k, 0, 0, k.getWidth(), k.getHeight(), 1, paramInt1, paramInt2 + paramInt4, 36);
    paramGraphics.drawRegion(k, 0, 0, k.getWidth(), k.getHeight(), 3, paramInt1 + paramInt3, paramInt2 + paramInt4, 40);
  }
  
  public static void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean) {
    if (paramInt5 >= 0) {
      paramGraphics.setColor(paramInt5);
      paramGraphics.fillRect(paramInt1 + 3, paramInt2 + 4, paramInt3 - 6, paramInt4 - 8);
    } 
    if (paramBoolean)
      paramGraphics.drawImage(d, paramInt1 + paramInt3, paramInt2 + paramInt4 - 4, 40); 
    paramGraphics.setColor(51967);
    paramGraphics.drawRect(paramInt1 + 1, paramInt2 + 1, paramInt3 - 3, paramInt4 - 3);
    paramGraphics.setColor(9975807);
    paramGraphics.drawRect(paramInt1 + 2, paramInt2 + 3, paramInt3 - 5, paramInt4 - 7);
    paramGraphics.setColor(8972031);
    paramGraphics.fillRect(paramInt1 + 2, paramInt2 + 2, paramInt3 - 4, 1);
    paramGraphics.fillRect(paramInt1 + 2, paramInt2 + paramInt4 - 3, paramInt3 - 4, 1);
    paramGraphics.setColor(22246);
    paramGraphics.fillRect(paramInt1 + 4, paramInt2, paramInt3 - 8, 1);
    paramGraphics.fillRect(paramInt1 + 4, paramInt2 + paramInt4 - 1, paramInt3 - 8, 1);
    paramGraphics.fillRect(paramInt1, paramInt2 + 4, 1, paramInt4 - 8);
    paramGraphics.fillRect(paramInt1 + paramInt3 - 1, paramInt2 + 4, 1, paramInt4 - 8);
    paramGraphics.drawImage(l, paramInt1, paramInt2, 0);
    paramGraphics.drawRegion(l, 0, 0, l.getWidth(), l.getHeight(), 2, paramInt1 + paramInt3, paramInt2, 24);
    paramGraphics.drawRegion(l, 0, 0, l.getWidth(), l.getHeight(), 1, paramInt1, paramInt2 + paramInt4, 36);
    paramGraphics.drawRegion(l, 0, 0, l.getWidth(), l.getHeight(), 3, paramInt1 + paramInt3, paramInt2 + paramInt4, 40);
  }
  
  public static void d(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    a(paramGraphics, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, false);
  }
  
  public static void c(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramInt1 = paramInt1;
    paramInt2 = paramInt2;
    paramGraphics.setColor(19, 87, 151);
    paramGraphics.drawRect(paramInt1, paramInt2, paramInt3, paramInt4);
    paramInt1++;
    paramInt2++;
    paramInt3 -= 2;
    paramInt4 -= 2;
    paramGraphics.drawRect(paramInt1, paramInt2, paramInt3, paramInt4);
    paramGraphics.setColor(32, 165, 222);
    paramInt3 -= 2;
    paramGraphics.drawLine(++paramInt1, paramInt2, paramInt1 + paramInt3, paramInt2);
    paramGraphics.drawLine(paramInt1, paramInt2 + paramInt4, paramInt1 + paramInt3, paramInt2 + paramInt4);
    paramGraphics.drawLine(paramInt1, paramInt2 + 1, paramInt1, paramInt2 + 1);
    paramGraphics.drawLine(paramInt1, paramInt2 + paramInt4 - 1, paramInt1 + 1, paramInt2 + paramInt4);
    paramInt1--;
    paramInt2++;
    paramInt4 -= 2;
    paramGraphics.drawLine(paramInt1, paramInt2, paramInt1, paramInt2 + paramInt4);
    paramInt1 += paramInt3 + 2;
    paramGraphics.drawLine(paramInt1, paramInt2, paramInt1, paramInt2 + paramInt4);
    paramGraphics.drawLine(paramInt1 - 1, paramInt2, paramInt1, paramInt2 + 1);
    paramGraphics.drawLine(paramInt1 - 1, paramInt2 + paramInt4, paramInt1, paramInt2 + paramInt4);
  }
  
  public static void a(Graphics paramGraphics, k paramk, int paramInt1, int[] paramArrayOfint, int paramInt2, int paramInt3) {
    paramGraphics.setColor(paramArrayOfint[0]);
    paramGraphics.drawLine(paramk.a + paramInt2 + 1, paramk.b + paramInt3, paramk.a + paramInt2 + paramk.c - 2, paramk.b + paramInt3);
    paramGraphics.drawLine(paramk.a + paramInt2 + 1, paramk.b + paramInt3 + paramk.d - 1, paramk.a + paramInt2 + paramk.c - 2, paramk.b + paramInt3 + paramk.d - 1);
    paramGraphics.drawLine(paramk.a + paramInt2, paramk.b + paramInt3 + 1, paramk.a + paramInt2, paramk.b + paramInt3 + paramk.d - 2);
    paramGraphics.drawLine(paramk.a + paramInt2 + paramk.c - 1, paramk.b + paramInt3 + 1, paramk.a + paramInt2 + paramk.c - 1, paramk.b + paramInt3 + paramk.d - 2);
    byte b = 1;
    if (paramInt1 > 0)
      for (byte b1 = 1; b1 < paramk.d - 1; b1++) {
        if (b1 < paramArrayOfint.length)
          paramGraphics.setColor(paramArrayOfint[b1]); 
        paramGraphics.drawLine(paramk.a + paramInt2 + 1, paramk.b + paramInt3 + b, paramk.a + paramInt2 + paramInt1, paramk.b + paramInt3 + b);
        b++;
      }  
  }
  
  public static void a(Graphics paramGraphics, k paramk, int paramInt) {
    a(paramGraphics, paramk, 0, 0, paramInt);
  }
  
  public static void a(Graphics paramGraphics, k paramk, int paramInt1, int paramInt2, int paramInt3) {
    e(paramGraphics, paramk.a + paramInt1, paramk.b + paramInt2, paramk.c, paramk.d, paramInt3);
  }
  
  public static void e(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    int i = i.getWidth() - 7;
    int j = i.getHeight() - 7;
    cw.a(paramGraphics, i, 0, 0, 7, 7, paramInt1 + paramInt5, paramInt2 + paramInt5, 20);
    cw.a(paramGraphics, i, i, 0, 7, 7, paramInt1 + paramInt3 - paramInt5, paramInt2 + paramInt5, 24);
    cw.a(paramGraphics, i, 0, j, 7, 7, paramInt1 + paramInt5, paramInt2 + paramInt4 - paramInt5, 36);
    cw.a(paramGraphics, i, i, j, 7, 7, paramInt1 + paramInt3 - paramInt5, paramInt2 + paramInt4 - paramInt5, 40);
  }
  
  public static final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    if (paramInt6 >= 0) {
      paramGraphics.setColor(paramInt6);
      paramGraphics.fillRect(paramInt1 + 1, paramInt2 + 1, paramInt3 - 2, paramInt4 - 2);
    } 
    paramGraphics.setColor(paramInt5);
    paramGraphics.fillRect(paramInt1 + 1, paramInt2, paramInt3 - 2, 1);
    paramGraphics.fillRect(paramInt1 + 1, paramInt2 + paramInt4 - 1, paramInt3 - 2, 1);
    paramGraphics.fillRect(paramInt1, paramInt2 + 1, 1, paramInt4 - 2);
    paramGraphics.fillRect(paramInt1 + paramInt3 - 1, paramInt2 + 1, 1, paramInt4 - 2);
  }
  
  public static void b(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean) {
    paramGraphics.setColor(230911);
    paramGraphics.drawLine(paramInt1 + 2, paramInt2, paramInt1 + paramInt3 - 2, paramInt2);
    paramGraphics.drawLine(paramInt1 + 2, paramInt2 + paramInt4, paramInt1 + paramInt3 - 2, paramInt2 + paramInt4);
    paramGraphics.drawLine(paramInt1, paramInt2 + 2, paramInt1, paramInt2 + paramInt4 - 2);
    paramGraphics.drawLine(paramInt1 + paramInt3, paramInt2 + 2, paramInt1 + paramInt3, paramInt2 + paramInt4 - 2);
    paramGraphics.drawLine(paramInt1 + 1, paramInt2 + 1, paramInt1 + 1, paramInt2 + 1);
    paramGraphics.drawLine(paramInt1 + 1, paramInt2 + paramInt4 - 1, paramInt1 + 1, paramInt2 + paramInt4 - 1);
    paramGraphics.drawLine(paramInt1 + paramInt3 - 1, paramInt2 + 1, paramInt1 + paramInt3 - 1, paramInt2 + 1);
    paramGraphics.drawLine(paramInt1 + paramInt3 - 1, paramInt2 + paramInt4 - 1, paramInt1 + paramInt3 - 1, paramInt2 + paramInt4 - 1);
    paramGraphics.setColor(14612735);
    paramGraphics.drawLine(paramInt1 + 2, paramInt2 + 1, paramInt1 + paramInt3 - 2, paramInt2 + 1);
    paramGraphics.drawLine(paramInt1 + 2, paramInt2 + paramInt4 - 1, paramInt1 + paramInt3 - 2, paramInt2 + paramInt4 - 1);
    paramGraphics.drawLine(paramInt1 + 1, paramInt2 + 2, paramInt1 + 1, paramInt2 + paramInt4 - 2);
    paramGraphics.drawLine(paramInt1 + paramInt3 - 1, paramInt2 + 2, paramInt1 + paramInt3 - 1, paramInt2 + paramInt4 - 2);
    if (paramBoolean) {
      paramGraphics.setColor(16777215);
      paramGraphics.fillRect(paramInt1 + 2, paramInt2 + 2, paramInt3 - 3, paramInt4 - 3);
      paramGraphics.setColor(paramInt5);
      paramGraphics.fillRect(paramInt1 + 2, paramInt2 + 2, paramInt3 - 4, paramInt4 - 4);
    } 
    paramGraphics.setColor(14612735);
    paramGraphics.drawLine(paramInt1 + 2, paramInt2 + 2, paramInt1 + 2, paramInt2 + 2);
    paramGraphics.drawLine(paramInt1 + 2, paramInt2 + paramInt4 - 2, paramInt1 + 2, paramInt2 + paramInt4 - 2);
    paramGraphics.drawLine(paramInt1 + paramInt3 - 2, paramInt2 + 2, paramInt1 + paramInt3 - 2, paramInt2 + 2);
    paramGraphics.drawLine(paramInt1 + paramInt3 - 2, paramInt2 + paramInt4 - 2, paramInt1 + paramInt3 - 2, paramInt2 + paramInt4 - 2);
  }
  
  public static void a() {
    if (m == null)
      m = f.d("/olaicons"); 
  }
  
  public static void d(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramInt1 = Math.abs(paramInt1);
    if (m != null)
      cw.a(paramGraphics, m, n[paramInt1], o[paramInt1], g[paramInt1], p[paramInt1], paramInt2, paramInt3, paramInt4); 
  }
  
  public static void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, int paramInt5) {
    paramGraphics.setColor(16742661);
    paramGraphics.fillRect(paramInt1, paramInt2, paramInt3, 1);
    paramGraphics.fillRect(paramInt1, paramInt2 + paramInt4 - 1, paramInt3, 1);
    paramGraphics.setColor(16167168);
    paramGraphics.fillRect(paramInt1, paramInt2 + 1, paramInt3, 1);
    paramGraphics.fillRect(paramInt1, paramInt2 + paramInt4 - 2, paramInt3, 1);
    paramGraphics.setColor(16777099);
    paramGraphics.fillRect(paramInt1, paramInt2 + 2, paramInt3, 2);
    paramGraphics.fillRect(paramInt1, paramInt2 + paramInt4 - 4, paramInt3, 2);
    paramGraphics.setColor(16777143);
    paramGraphics.fillRect(paramInt1, paramInt2 + 4, paramInt3, 1);
    paramGraphics.fillRect(paramInt1, paramInt2 + paramInt4 - 5, paramInt3, 1);
    paramGraphics.setColor(paramInt5);
    paramGraphics.fillRect(paramInt1, paramInt2 + 5, paramInt3, paramInt4 - 10);
    if (paramBoolean) {
      if (paramInt4 - 4 < q.getHeight()) {
        cw.a(paramGraphics, q, 0, q.getHeight() - paramInt4 + 4, q.getWidth(), paramInt4 - 4, paramInt1 + paramInt3, paramInt2 + paramInt4 - 2, 40);
        return;
      } 
      paramGraphics.drawImage(q, paramInt1 + paramInt3, paramInt2 + paramInt4 - 2, 40);
    } 
  }
  
  public static void b(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) {
    a(paramGraphics, paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean, 16777215);
  }
  
  public static void e(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    b(paramGraphics, paramInt1, paramInt2, paramInt3, paramInt4, true);
  }
  
  public static void f(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    paramInt1 += (paramInt3 - 7) / 2;
    paramInt2 += (paramInt4 - 7) / 2;
    paramInt1 = paramInt1;
    paramInt2 += 2;
    paramGraphics.setColor(0);
    paramInt3 = paramInt1 + 3;
    while (paramInt1 < paramInt3) {
      paramGraphics.fillRect(paramInt1, paramInt2++, 1, 3);
      paramInt1++;
    } 
    paramInt2 -= 2;
    paramInt3 = paramInt1 + 4;
    while (paramInt1 < paramInt3) {
      paramGraphics.fillRect(paramInt1, paramInt2--, 1, 3);
      paramInt1++;
    } 
  }
  
  public static void b(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    paramGraphics.setColor(16069679);
    paramGraphics.fillRect(paramInt1 - 1, paramInt2 - 1, 8, 8);
    paramGraphics.setColor(16777215);
    paramGraphics.drawLine(paramInt1, paramInt2 + 2, paramInt1 + 5, paramInt2 + 2);
    paramGraphics.drawLine(paramInt1, paramInt2 + 2 + 1, paramInt1 + 5, paramInt2 + 2 + 1);
    paramGraphics.drawLine(paramInt1 + 2, paramInt2, paramInt1 + 2, paramInt2 + 5);
    paramGraphics.drawLine(paramInt1 + 2 + 1, paramInt2, paramInt1 + 2 + 1, paramInt2 + 5);
  }
  
  public static void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramInt3 / 2;
    paramGraphics.setColor(11383216);
    paramGraphics.drawLine(paramInt1 + i - 1, paramInt2, paramInt1 + i - 1, paramInt2 - 4);
    paramGraphics.drawLine(paramInt1 + i + 1, paramInt2, paramInt1 + i + 1, paramInt2 - 4);
    paramGraphics.drawLine(paramInt1 + i - 1, paramInt2 - 4, paramInt1 + i - 4, paramInt2 - 4);
    paramGraphics.drawLine(paramInt1 + i + 1, paramInt2 - 4, paramInt1 + i + 4, paramInt2 - 4);
    paramGraphics.drawLine(paramInt1 + i - 4, paramInt2 - 4, paramInt1 + i - 4, paramInt2 - 2);
    paramGraphics.drawLine(paramInt1 + i + 4, paramInt2 - 4, paramInt1 + i + 4, paramInt2 - 2);
    paramGraphics.drawLine(paramInt1 + i - 4, paramInt2 - 2, paramInt1 + i - 3, paramInt2 - 2);
    paramGraphics.drawLine(paramInt1 + i + 4, paramInt2 - 2, paramInt1 + i + 3, paramInt2 - 2);
    paramGraphics.drawLine(paramInt1 + i - 1, paramInt2, paramInt1 + 17, paramInt2);
    paramGraphics.drawLine(paramInt1 + i + 1, paramInt2, paramInt1 + paramInt3 - 18, paramInt2);
    paramGraphics.setColor(12237498);
    paramGraphics.drawLine(paramInt1 + 16, paramInt2, paramInt1 + 14, paramInt2);
    paramGraphics.drawLine(paramInt1 + paramInt3 - 17, paramInt2, paramInt1 + paramInt3 - 15, paramInt2);
    paramGraphics.setColor(13026498);
    paramGraphics.drawLine(paramInt1 + 13, paramInt2, paramInt1 + 11, paramInt2);
    paramGraphics.drawLine(paramInt1 + paramInt3 - 14, paramInt2, paramInt1 + paramInt3 - 12, paramInt2);
    paramGraphics.setColor(13750994);
    paramGraphics.drawLine(paramInt1 + 10, paramInt2, paramInt1 + 9, paramInt2);
    paramGraphics.drawLine(paramInt1 + paramInt3 - 11, paramInt2, paramInt1 + paramInt3 - 10, paramInt2);
    paramGraphics.setColor(13618379);
    paramGraphics.drawLine(paramInt1 + 8, paramInt2, paramInt1 + 8, paramInt2);
    paramGraphics.drawLine(paramInt1 + paramInt3 - 9, paramInt2, paramInt1 + paramInt3 - 9, paramInt2);
    paramGraphics.setColor(14671839);
    paramGraphics.drawLine(paramInt1 + 7, paramInt2, paramInt1 + 7, paramInt2);
    paramGraphics.drawLine(paramInt1 + paramInt3 - 8, paramInt2, paramInt1 + paramInt3 - 8, paramInt2);
    paramGraphics.setColor(13687516);
    paramGraphics.drawLine(paramInt1 + 6, paramInt2, paramInt1 + 5, paramInt2);
    paramGraphics.drawLine(paramInt1 + paramInt3 - 7, paramInt2, paramInt1 + paramInt3 - 6, paramInt2);
    paramGraphics.setColor(14671839);
    paramGraphics.drawLine(paramInt1 + 4, paramInt2, paramInt1 + 2, paramInt2);
    paramGraphics.drawLine(paramInt1 + paramInt3 - 5, paramInt2, paramInt1 + paramInt3 - 3, paramInt2);
    paramGraphics.setColor(15329769);
    paramGraphics.drawLine(paramInt1 + 1, paramInt2, paramInt1, paramInt2);
    paramGraphics.drawLine(paramInt1 + paramInt3 - 2, paramInt2, paramInt1 + paramInt3 - 1, paramInt2);
  }
  
  public static void a(Graphics paramGraphics, int paramInt1, int paramInt2, byte paramByte) {
    int i = r.getWidth() / 4;
    cw.a(paramGraphics, r, i * paramByte, 0, i, r.getHeight(), paramInt1, paramInt2, 0);
  }
  
  public static void b(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3) {
    paramInt3 /= 2;
    int i = h.getWidth() / 4;
    cw.a(paramGraphics, h, i * paramInt3, 0, i, h.getHeight(), paramInt1, paramInt2, 0);
  }
  
  public static void b() {
    byte[] arrayOfByte;
    if (t == null && (arrayOfByte = pa.a().a(1000)) != null) {
      s = m.a(arrayOfByte, 0);
      t = f.a(arrayOfByte, 4, arrayOfByte.length - 4);
    } 
  }
  
  public static void c() {
    s = 0;
    t = null;
  }
  
  public static boolean a(int paramInt) {
    return !(t == null || paramInt <= 0 || paramInt > s || s <= 0);
  }
  
  public static boolean c(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3) {
    if (!a(paramInt3))
      return false; 
    int i = t.getWidth() / s;
    cw.a(paramGraphics, t, i * (paramInt3 - 1), 0, i, t.getHeight(), paramInt1, paramInt2, 0);
    return true;
  }
  
  public static void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    paramGraphics.setColor(0);
    paramGraphics.drawLine(paramInt1, paramInt2, paramInt1 + 3, paramInt2);
    paramGraphics.fillTriangle(paramInt1 + 1, paramInt2 + 1, paramInt1 + 3, paramInt2 + 1, paramInt1 + 1, paramInt2 + 3);
    paramGraphics.setColor(7237230);
    paramGraphics.fillTriangle(paramInt1 + 1, paramInt2, paramInt1 + 1, paramInt2 - 3, paramInt1 + 3, paramInt2);
  }
  
  public static void c(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    if (paramInt6 == 0) {
      paramInt3 = paramInt1 + 12 + 1;
      paramInt4 = paramInt2 + 8;
      paramGraphics.setColor(157, 159, 251);
      paramGraphics.fillTriangle(paramInt1, paramInt4, paramInt1 + 19, paramInt2, paramInt3, paramInt4);
      paramGraphics.setColor(85, 90, 248);
      paramGraphics.fillTriangle(paramInt1, paramInt4, paramInt1 + 19, paramInt2 + 17, paramInt3, paramInt4);
      paramGraphics.setColor(857589);
      paramGraphics.drawLine(paramInt1, paramInt4, paramInt1 + 19, paramInt2);
      paramGraphics.drawLine(paramInt3, paramInt4, paramInt1 + 19, paramInt2);
      paramGraphics.drawLine(paramInt1, paramInt4, paramInt1 + 19, paramInt2 + 17);
      paramGraphics.drawLine(paramInt3, paramInt4, paramInt1 + 19, paramInt2 + 17);
      paramGraphics.setColor(109, 113, 249);
      paramGraphics.drawLine(paramInt1 + 1, paramInt4, paramInt3 - 1, paramInt4);
      return;
    } 
    if (paramInt6 == 1) {
      paramInt3 = paramInt1 + 6 - 1;
      paramInt4 = paramInt2 + 8;
      paramGraphics.setColor(157, 159, 251);
      paramGraphics.fillTriangle(paramInt1 + 19, paramInt4, paramInt1, paramInt2, paramInt3, paramInt4);
      paramGraphics.setColor(85, 90, 248);
      paramGraphics.fillTriangle(paramInt1 + 19, paramInt4, paramInt1, paramInt2 + 17, paramInt3, paramInt4);
      paramGraphics.setColor(857589);
      paramGraphics.drawLine(paramInt1 + 19, paramInt4, paramInt1, paramInt2);
      paramGraphics.drawLine(paramInt3, paramInt4, paramInt1, paramInt2);
      paramGraphics.drawLine(paramInt1 + 19, paramInt4, paramInt1, paramInt2 + 17);
      paramGraphics.drawLine(paramInt3, paramInt4, paramInt1, paramInt2 + 17);
      paramGraphics.setColor(109, 113, 249);
      paramGraphics.drawLine(paramInt1 + 19 - 1, paramInt4, paramInt3 + 1, paramInt4);
    } 
  }
  
  public static void f(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramGraphics.setColor(13669730);
    paramGraphics.fillRect(paramInt1 - 1, paramInt2 - 1, paramInt3 + 2, paramInt4 + 2);
    a(paramGraphics, paramInt1 - 1, paramInt2 - 1, paramInt3 + 2, paramInt4 + 2, 14593669, -1);
    cw.b(paramGraphics, 15320744, paramInt1 - 2, paramInt2 - 2, paramInt3 + 4, paramInt4 + 4);
  }
  
  public static void d() {
    if (u == null) {
      v = (u = f.a(pa.a().a(30099))).getHeight() / 32;
      w = u.getWidth() / 32;
    } 
  }
  
  public static void g(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = (paramInt1 = Math.abs(paramInt1)) / w;
    paramInt1 %= w;
    if (u != null && i < v)
      cw.a(paramGraphics, u, paramInt1 << 5, i << 5, 32, 32, paramInt2, paramInt3, paramInt4); 
  }
  
  public static final fu a(bf parambf, int paramInt1, int paramInt2, int paramInt3) {
    a();
    fu fu;
    (fu = new fu(m, -3)).a(parambf);
    fu.b(n[20], o[20], g[20], p[20]);
    fu.a(paramInt2, paramInt3, 16, 16);
    return fu;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\pc.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */