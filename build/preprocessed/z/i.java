import java.util.Calendar;
import java.util.Date;

public final class i {
  private static Date b = new Date();
  
  public static Calendar a = Calendar.getInstance();
  
  private static String[] c = new String[] { "dd", "MM", "yyyy", "hh", "mm", "ss" };
  
  public static boolean a(String paramString) {
    return (paramString == null) ? true : (((paramString = paramString.trim()) == null || paramString.length() == 0));
  }
  
  public static boolean b(String paramString) {
    return !(paramString != null && paramString.length() != 0);
  }
  
  public static boolean a(String paramString1, String paramString2) {
    if (paramString1 == null || paramString2 == null)
      return false; 
    paramString1 = paramString1.toUpperCase();
    paramString2 = paramString2.toUpperCase();
    return paramString1.equals(paramString2);
  }
  
  public static String[] b(String paramString1, String paramString2) {
    return a(paramString1, paramString2, -1, false);
  }
  
  public static String[] a(String paramString1, String paramString2, int paramInt, boolean paramBoolean) {
    int k;
    if (paramInt == 0 || b(paramString1))
      return null; 
    if (paramString2 == null)
      return new String[] { paramString1 }; 
    a a = new a();
    String str = paramString1;
    int j = paramString2.length();
    if (paramBoolean) {
      k = str.toLowerCase().indexOf(paramString2.toLowerCase());
    } else {
      k = str.indexOf(paramString2);
    } 
    if (k >= 0) {
      while (k >= 0) {
        if (paramInt == 1) {
          if (!b(str))
            a.a(str); 
          return a(a);
        } 
        if (k > 0) {
          paramString1 = str.substring(0, k);
          a.a(paramString1);
          if (paramInt > 0)
            paramInt--; 
        } 
        str = str.substring(k + j);
        if (paramBoolean) {
          k = str.toLowerCase().indexOf(paramString2.toLowerCase());
          continue;
        } 
        k = str.indexOf(paramString2);
      } 
      if (!a(str))
        a.a(str); 
      return a(a);
    } 
    return new String[] { paramString1 };
  }
  
  private static String[] a(a parama) {
    if (parama.d() == 0)
      return null; 
    int j;
    String[] arrayOfString = new String[j = parama.d()];
    for (byte b = 0; b < j; b++)
      arrayOfString[b] = (String)parama.b(b); 
    return arrayOfString;
  }
  
  public static byte[] c(String paramString) {
    return c(paramString, null);
  }
  
  public static byte[] c(String paramString1, String paramString2) {
    if (paramString2 == null)
      paramString2 = "UTF-8"; 
    return b(paramString1) ? null : paramString1.getBytes(paramString2);
  }
  
  private static String a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, String paramString) {
    if (paramArrayOfbyte == null)
      return null; 
    if (paramInt2 <= 0)
      return ""; 
    try {
      return new String(paramArrayOfbyte, paramInt1, paramInt2, paramString);
    } catch (Throwable throwable) {
      return new String(paramArrayOfbyte, paramInt1, paramInt2);
    } 
  }
  
  public static String a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return a(paramArrayOfbyte, paramInt1, paramInt2, "UTF-8");
  }
  
  public static String a(byte[] paramArrayOfbyte) {
    return (paramArrayOfbyte == null) ? null : a(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public static String a(String paramString1, String paramString2, String[] paramArrayOfString) {
    int j = 0;
    byte b = 0;
    StringBuffer stringBuffer = new StringBuffer();
    int k;
    while ((k = paramString1.indexOf(paramString2, j)) >= 0) {
      stringBuffer.append(paramString1.substring(j, k));
      stringBuffer.append(paramArrayOfString[b++]);
      j = k + paramString2.length();
      if (b < 4)
        continue; 
      break;
    } 
    stringBuffer.append(paramString1.substring(j));
    return stringBuffer.toString();
  }
  
  public static String a(long paramLong) {
    return a(paramLong, ",");
  }
  
  public static String a(long paramLong, String paramString) {
    if (paramLong < 1000L)
      return (new StringBuffer(String.valueOf(paramLong))).toString(); 
    String str = "";
    while (paramLong >= 1000L) {
      long l;
      if ((l = paramLong % 1000L) < 10L) {
        str = String.valueOf(paramString) + "00" + l + str;
      } else if (l < 100L) {
        str = String.valueOf(paramString) + "0" + l + str;
      } else {
        str = String.valueOf(paramString) + l + str;
      } 
      paramLong /= 1000L;
    } 
    return str = String.valueOf(paramLong) + str;
  }
  
  public static String a() {
    long l = System.currentTimeMillis();
    b.setTime(l);
    a.setTime(b);
    return String.valueOf(a(a.get(11))) + ":" + a(a.get(12));
  }
  
  private static String a(int paramInt) {
    return (paramInt < 10) ? ("0" + paramInt) : (new StringBuffer(String.valueOf(paramInt))).toString();
  }
  
  public static String b(long paramLong, String paramString) {
    b.setTime(paramLong);
    a.setTime(b);
    int[] arrayOfInt = { a.get(5), a.get(2) + 1, a.get(1), a.get(11), a.get(12), a.get(13) };
    for (byte b = 0; b < c.length; b++) {
      int j;
      if ((j = paramString.indexOf(c[b])) >= 0)
        paramString = String.valueOf(paramString.substring(0, j)) + a(arrayOfInt[b]) + paramString.substring(j + c[b].length()); 
    } 
    return paramString;
  }
  
  public static String b(long paramLong) {
    b.setTime(paramLong);
    a.setTime(b);
    return String.valueOf(a.get(5)) + "/" + (a.get(2) + 1) + "/" + a.get(1) + " " + a.get(11) + ":" + a.get(12) + ":" + a.get(13);
  }
  
  public static Calendar c(long paramLong) {
    b.setTime(paramLong);
    a.setTime(b);
    return a;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\i.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */