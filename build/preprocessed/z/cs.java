public class cs {
  private static int b = 10;
  
  public static u a;
  
  public static final boolean a() {
    return a.c(-14);
  }
  
  public static final byte[] b() {
    return a.a(-14);
  }
  
  public static void a(byte[] paramArrayOfbyte) {
    a.b(-14, paramArrayOfbyte, 0, 13);
  }
  
  public static void c() {
    if (!v.V)
      return; 
    v.Y = 0;
    byte[] arrayOfByte;
    if ((arrayOfByte = a.a(-8)) != null && arrayOfByte.length >= 4)
      v.Y = m.c(arrayOfByte); 
    arrayOfByte = m.a(++v.Y);
    a.b(-8, arrayOfByte, 0, 4);
  }
  
  public static void d() {
    if (!v.V)
      return; 
    a(false);
  }
  
  public static void a(boolean paramBoolean) {
    if (!v.V)
      return; 
    if (paramBoolean) {
      if (--v.T <= 0) {
        v.S = false;
        v.T = 0;
        return;
      } 
    } else {
      v.S = true;
      v.T = 4;
    } 
  }
  
  public static byte[] e() {
    return null.a(-12);
  }
  
  public static int[] f() {
    int[] arrayOfInt = new int[b];
    byte[] arrayOfByte;
    if ((arrayOfByte = a.a(-1)) == null) {
      arrayOfByte = new byte[b + 1 << 2];
      byte[] arrayOfByte1;
      System.arraycopy(arrayOfByte1 = m.a(cv.a(4) + 1), 0, arrayOfByte, arrayOfByte.length - 4, 4);
      a.b(-1, arrayOfByte, 0, arrayOfByte.length);
    } 
    arrayOfByte = arrayOfByte;
    for (byte b = 0; b < arrayOfInt.length; b++)
      arrayOfInt[b] = m.a(arrayOfByte, b << 2); 
    return arrayOfInt;
  }
  
  public static boolean a(int[] paramArrayOfint) {
    boolean bool;
    if (paramArrayOfint == null)
      return false; 
    boolean[] arrayOfBoolean = new boolean[4];
    int i;
    for (i = paramArrayOfint.length - 1; i >= 0; i--) {
      if (paramArrayOfint[i] > 0)
        arrayOfBoolean[paramArrayOfint[i] - 1] = true; 
    } 
    i = 1;
    for (byte b = 0; b < 4; b++)
      bool = i & arrayOfBoolean[b]; 
    return bool;
  }
  
  public static void a(int paramInt1, int paramInt2, String paramString1, String paramString2) {
    int i;
    if (Math.abs(paramInt1) >= b)
      return; 
    byte[] arrayOfByte1;
    if ((arrayOfByte1 = a.a(-1)) == null)
      return; 
    int[] arrayOfInt1 = new int[b + 1];
    int[] arrayOfInt2 = new int[4];
    int j;
    for (j = 0; j < arrayOfInt1.length; j++) {
      arrayOfInt1[j] = m.a(arrayOfByte1, j << 2);
      if (j < arrayOfInt1.length - 1 && arrayOfInt1[j] > 0)
        arrayOfInt2[arrayOfInt1[j] - 1] = arrayOfInt2[arrayOfInt1[j] - 1] + 1; 
    } 
    j = -1;
    if (paramInt2 != 1) {
      i = Math.abs(arrayOfInt1[arrayOfInt1.length - 1]) - 1;
      int k;
      if ((k = arrayOfInt2[0] + arrayOfInt2[1] + arrayOfInt2[2] + arrayOfInt2[3]) >= 10)
        return; 
      if (k >= 7) {
        for (k = 0; k < 4; k++) {
          if (k != i && arrayOfInt2[k] <= 0) {
            j = k;
            break;
          } 
        } 
        if (j == -1)
          do {
          
          } while ((j = cv.a(4)) == i); 
      } else {
        do {
        
        } while ((j = cv.a(4)) == i);
      } 
      j++;
    } else {
      if (paramString1 == null)
        return; 
      j = Math.abs(i[i.length - 1]);
      byte[] arrayOfByte = paramString1.getBytes();
      a.a(-2, arrayOfByte, 0, arrayOfByte.length);
    } 
    ct.a("index=" + paramInt1 + ",luckyNum=" + paramInt2 + ",codeWin=" + paramString1 + "recordChoose=" + j);
    byte[] arrayOfByte2;
    System.arraycopy(arrayOfByte2 = m.a(j), 0, arrayOfByte1, paramInt1 << 2, 4);
    a.a(-1, arrayOfByte1, 0, arrayOfByte1.length);
    if (paramString2 != null)
      if (paramInt2 == 1 && paramString1 != null) {
        arrayOfByte1 = paramString2.trim().getBytes();
        a.a(-3, arrayOfByte1, 0, arrayOfByte1.length);
        arrayOfByte1 = paramString1.trim().getBytes();
        a.a(-2, arrayOfByte1, 0, arrayOfByte1.length);
      } else if ((arrayOfByte1 = a.a(-2)) == null) {
        arrayOfByte1 = paramString2.trim().getBytes();
        a.a(-3, arrayOfByte1, 0, arrayOfByte1.length);
      }  
    a.a();
  }
  
  public static byte[] g() {
    return a.a(-2);
  }
  
  public static String h() {
    byte[] arrayOfByte;
    return ((arrayOfByte = a.a(-3)) == null) ? null : new String(arrayOfByte);
  }
  
  public static void i() {
    try {
      a.b(-1);
      a.b(-2);
      a.b(-3);
      a.a();
      return;
    } catch (Throwable throwable2) {
      Throwable throwable1;
      (throwable1 = null).printStackTrace();
      return;
    } 
  }
  
  public static void a(int paramInt, be parambe) {
    paramInt = v.Y;
    ci.a((new StringBuffer("linc0")).toString(), paramInt, parambe);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\cs.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */