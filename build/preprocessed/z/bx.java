import javax.microedition.lcdui.Graphics;

public final class bx {
  private static bx f = null;
  
  public static d a;
  
  public static d b;
  
  public static d c;
  
  private static d g;
  
  public static d d;
  
  public static d e;
  
  private static int h = -1;
  
  private static String[] i = null;
  
  private static char j = ')';
  
  private static char k = ')';
  
  private static char l = ')';
  
  private static char m = ')';
  
  private static char n = '(';
  
  private static char o = '(';
  
  private static char p = '(';
  
  private static char q = '(';
  
  private bx() {
    a = new bz();
    try {
      byte[] arrayOfByte = f.c("/_fontcap");
      c = new ca(f.a(arrayOfByte));
      h.a(arrayOfByte, new int[] { 16777215 }, new int[] { 16777064 });
      b = new ca(f.a(arrayOfByte));
    } catch (Exception exception) {}
    d d1 = b;
  }
  
  public static void a(d paramd) {
    g = paramd;
  }
  
  public static void a() {
    if (f == null)
      f = new bx(); 
  }
  
  public static String[] a(String paramString, int paramInt) {
    return a(paramString, paramInt, g);
  }
  
  public static String[] a(String paramString, int paramInt, d paramd) {
    a a = new a(10);
    byte b2 = 0;
    byte b = -1;
    String str1 = "";
    while (b2 < paramString.length()) {
      if (b == b2)
        b2++; 
      while (true) {
        if (b2 >= paramString.length() || paramString.charAt(b2) != ' ') {
          if (b2 > 0 && a.d() == 0 && b2 * paramd.a(' ') < paramInt) {
            String str = "";
            for (byte b4 = 0; b4 < b2; b4++)
              str = String.valueOf(str) + ' '; 
            a.a(str);
          } 
          break;
        } 
        b = b2;
        b2++;
      } 
      while (true) {
        if (b2 >= paramString.length() || paramString.charAt(b2) == ' ' || paramString.charAt(b2) == '\r') {
          if (str1.length() > 0) {
            if (b2 < paramString.length() && paramString.charAt(b2) == '\r') {
              str1 = String.valueOf(str1) + '\r';
              b = b2;
              b2++;
            } else {
              str1 = String.valueOf(str1) + " ";
            } 
            int j;
            if ((j = paramd.a(str1)) < paramInt) {
              a.a(str1);
            } else {
              byte b4 = 0;
              String str = "";
              int k = 0;
              while (b4 < str1.length()) {
                if (k + paramd.a(str1.charAt(b4)) < paramInt) {
                  k += paramd.a(str1.charAt(b4));
                  str = String.valueOf(str) + str1.charAt(b4);
                  if (++b4 >= str1.length() && str.length() > 0) {
                    a.a(str);
                    break;
                  } 
                  continue;
                } 
                a.a(str);
                k = 0;
                str = "";
              } 
            } 
          } else if (b2 < paramString.length() && paramString.charAt(b2) == '\r') {
            b = b2;
            b2++;
          } 
          str1 = "";
          break;
        } 
        str1 = String.valueOf(str1) + paramString.charAt(b2);
        b = b2;
        b2++;
      } 
    } 
    String[] arrayOfString1 = new String[a.d()];
    for (byte b3 = 0; b3 < arrayOfString1.length; b3++)
      arrayOfString1[b3] = (String)a.b(b3); 
    a = new a(10);
    String str2 = "";
    int i = 0;
    b2 = 0;
    while (true) {
      if (b2 >= arrayOfString1.length) {
        if (str2.length() > 0)
          a.a(str2); 
        break;
      } 
      int j = paramd.a(arrayOfString1[b2]);
      if (i + j - paramd.a(' ') < paramInt) {
        i += j;
        str2 = String.valueOf(str2) + arrayOfString1[b2];
        if (arrayOfString1[b2].length() > 0 && arrayOfString1[b2].charAt(arrayOfString1[b2].length() - 1) == '\r') {
          a.a(str2);
          str2 = "";
          i = 0;
        } 
        b2++;
        continue;
      } 
      if (j - paramd.a(' ') >= paramInt) {
        a.a(arrayOfString1[b2]);
        b2++;
      } else {
        a.a(str2);
      } 
      str2 = "";
      i = 0;
    } 
    String[] arrayOfString2 = new String[a.d()];
    for (byte b1 = 0; b1 < arrayOfString2.length; b1++)
      arrayOfString2[b1] = (String)a.b(b1); 
    return arrayOfString2;
  }
  
  public static void a(Graphics paramGraphics, d paramd, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    String[] arrayOfString;
    if (paramString.length() == h && paramString.length() > 8 && j == paramString.charAt(1) && k == paramString.charAt(2) && l == paramString.charAt(3) && m == paramString.charAt(4) && n == paramString.charAt(paramString.length() - 1) && o == paramString.charAt(paramString.length() - 2) && p == paramString.charAt(paramString.length() - 3) && q == paramString.charAt(paramString.length() - 4)) {
      arrayOfString = i;
    } else {
      arrayOfString = a(paramString, paramInt3, paramd);
      if (paramString.length() > 4) {
        h = paramString.length();
        i = arrayOfString;
        j = paramString.charAt(1);
        k = paramString.charAt(2);
        l = paramString.charAt(3);
        m = paramString.charAt(4);
        q = paramString.charAt(paramString.length() - 4);
        p = paramString.charAt(paramString.length() - 3);
        o = paramString.charAt(paramString.length() - 2);
        n = paramString.charAt(paramString.length() - 1);
      } 
    } 
    a(paramGraphics, paramd, arrayOfString, paramInt1, paramInt2, paramInt3, paramInt4, 0);
  }
  
  public static void a(Graphics paramGraphics, d paramd, String[] paramArrayOfString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {
    paramInt3 = paramInt3;
    if (paramInt7 == 1) {
      paramInt3 += paramInt5 / 2;
    } else if (paramInt7 == 2) {
      paramInt3 += paramInt5;
    } 
    if ((paramInt2 = paramInt1 + paramInt2) > paramArrayOfString.length)
      paramInt2 = paramArrayOfString.length; 
    paramInt5 = 0;
    paramInt1 = paramInt1;
    paramd.a(paramGraphics, paramArrayOfString[paramInt1], paramInt3, paramInt4 + paramInt5, paramInt7);
    while (paramInt1 < paramInt2 && (paramInt5 += paramd.a()) <= paramInt6)
      paramInt1++; 
  }
  
  public static void a(Graphics paramGraphics, d paramd, String[] paramArrayOfString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    a(paramGraphics, paramd, paramArrayOfString, 0, paramArrayOfString.length, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\bx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */