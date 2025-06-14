public final class go {
  public static int a = 0;
  
  public static int b = 0;
  
  public static int c = 0;
  
  public static int d = 0;
  
  public static String e = "";
  
  public static String f = "";
  
  public static String g = "";
  
  public static boolean h = false;
  
  public static boolean i;
  
  public static boolean j = false;
  
  public static lh k;
  
  public static ll[] l = new ll[0];
  
  public static lm[] m = new lm[0];
  
  public static int n = 50;
  
  public static int o = 0;
  
  public static b p = new gp((byte)0);
  
  public static b q = new gq((byte)0);
  
  public static lw[] r;
  
  public static long s = -1L;
  
  public static boolean t = true;
  
  public static ll[] u = null;
  
  public static lm[] v = null;
  
  public static String w;
  
  public static int x;
  
  public static void a() {
    k = null;
    r = null;
    l = new ll[0];
    m = new lm[0];
    s = -1L;
  }
  
  public static void a(ll[] paramArrayOfll, lm[] paramArrayOflm, int paramInt1, int paramInt2) {
    l = paramArrayOfll;
    m = paramArrayOflm;
    n = paramInt1;
    o = paramInt2;
  }
  
  public static void a(ll paramll) {
    ll[] arrayOfLl = new ll[l.length + 1];
    System.arraycopy(l, 0, arrayOfLl, 0, l.length);
    arrayOfLl[arrayOfLl.length - 1] = paramll;
    l = arrayOfLl;
  }
  
  public static void b(ll paramll) {
    ll[] arrayOfLl = new ll[l.length - 1];
    byte b1 = 0;
    for (byte b2 = 0; b2 < l.length; b2++) {
      if (l[b2] != paramll) {
        arrayOfLl[b1] = l[b2];
        b1++;
      } 
    } 
    l = arrayOfLl;
  }
  
  public static void a(lm paramlm, int paramInt) {
    for (byte b1 = 0; b1 < m.length; b1++) {
      if (paramlm.a == (m[b1]).a) {
        (m[b1]).g += paramInt;
        return;
      } 
    } 
    lm[] arrayOfLm = new lm[m.length + 1];
    System.arraycopy(m, 0, arrayOfLm, 0, m.length);
    arrayOfLm[arrayOfLm.length - 1] = paramlm;
    m = arrayOfLm;
  }
  
  public static void a(lm paramlm) {
    b(paramlm.a, paramlm.g);
  }
  
  public static void a(int paramInt1, int paramInt2) {
    if (paramInt2 == 0) {
      b(paramInt1, 2147483647);
      return;
    } 
    for (byte b1 = 0; b1 < m.length; b1++) {
      if ((m[b1]).a == paramInt1) {
        (m[b1]).g = paramInt2;
        return;
      } 
    } 
  }
  
  public static void b(int paramInt1, int paramInt2) {
    for (byte b1 = 0; b1 < m.length; b1++) {
      if ((m[b1]).a == paramInt1) {
        (m[b1]).g -= paramInt2;
        if ((m[b1]).g <= 0) {
          lm[] arrayOfLm = new lm[m.length - 1];
          System.arraycopy(m, 0, arrayOfLm, 0, b1);
          paramInt2 = b1 + 1;
          System.arraycopy(m, paramInt2, arrayOfLm, b1, m.length - paramInt2);
        } 
        return;
      } 
    } 
  }
  
  public static boolean b() {
    int i = (i = l.length) - k.D.length;
    for (byte b1 = 0; b1 < m.length; b1++) {
      if ((m[b1]).e == 7) {
        i += (m[b1]).g;
      } else {
        i++;
      } 
    } 
    return (i >= n);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\go.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */