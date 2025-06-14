import java.util.Vector;
import javax.wireless.messaging.MessageConnection;

public final class ci implements bf, cg {
  public static String a = "TESTGAME";
  
  public static String b = "3";
  
  public static String c = "1";
  
  public static String d = "19003";
  
  public static int e = 0;
  
  public static int f = 6;
  
  public static int g = 5;
  
  public static int h = 5;
  
  public static int i = 5;
  
  public static int j = 1;
  
  public static String k = String.valueOf(a) + b;
  
  public static String l = null;
  
  private static ci m;
  
  public static ci a() {
    if (m == null)
      m = new ci(); 
    return m;
  }
  
  public static void a(String paramString, int paramInt, be parambe) {
    try {
      String str2;
      if ((str2 = System.getProperty("microedition.platform")) == null) {
        str2 = "Unknown";
      } else if (str2.length() >= 80) {
        str2 = str2.substring(0, 80);
      } 
      str2 = " \"m" + str2 + "\" e" + String.valueOf(System.currentTimeMillis());
      String str1 = String.valueOf(k) + " v" + "2" + " a2 o" + String.valueOf(paramInt) + " d" + b + " p" + l;
      if (paramString != null)
        str1 = String.valueOf(str1) + " r" + paramString; 
      ch.a(str1 = String.valueOf(str1) + str2, (new StringBuffer(String.valueOf(h))).toString(), new cj(parambe));
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } 
  }
  
  public static void b(String paramString) {
    cr.a();
    ch.a(paramString = "RESET " + paramString, (new StringBuffer("0")).toString(), new ck());
  }
  
  public static void a(String paramString1, String paramString2, be parambe) {
    cr.a();
    ch.a(paramString1, (new StringBuffer(String.valueOf(paramString2))).toString(), new cl(parambe));
  }
  
  public static void a(String paramString1, String paramString2, String paramString3) {
    a(paramString1 = String.valueOf(paramString1) + " " + paramString2 + " " + c + " " + cv.a(100), paramString3, (be)null);
  }
  
  public final void a(String paramString) {
    byte b = -1;
    String str4 = "\"";
    String str3 = "\"";
    String str2 = " ";
    String str1 = paramString = paramString;
    boolean bool = false;
    int i = 0;
    Vector vector = new Vector();
    int j;
    for (j = 0; j < str1.length() - str2.length() + 1; j++) {
      if (str2.equals(str1.substring(j, j + str2.length())) && !bool) {
        vector.addElement(str1.substring(i, j));
        j = (i = j + str2.length()) - 1;
      } else if (str3.equals(str1.substring(j, j + str3.length())) && !bool) {
        vector.addElement(str1.substring(i, j));
        j = (i = j + str3.length()) - 1;
        bool = true;
      } else if (str4.equals(str1.substring(j, j + str4.length())) && bool) {
        vector.addElement(str1.substring(i, j));
        j = (i = j + str4.length()) - 1;
        bool = false;
      } 
    } 
    if (i < str1.length())
      vector.addElement(str1.substring(i)); 
    String[] arrayOfString = new String[vector.size()];
    for (j = 0; j < vector.size(); j++)
      arrayOfString[j] = vector.elementAt(j); 
    if (!(arrayOfString = (vector.size() > 0) ? arrayOfString : null)[0].toUpperCase().equals(k.toUpperCase()))
      return; 
    try {
      int k = 0;
      str3 = null;
      str4 = null;
      String str = null;
      for (i = 1; i < arrayOfString.length; i++) {
        if (arrayOfString[i].length() != 0) {
          char c = arrayOfString[i].charAt(0);
          String str5 = null;
          if (arrayOfString[i].length() > 1)
            str5 = arrayOfString[i].substring(1); 
          switch (c) {
            case 'a':
              k = Integer.parseInt(str5);
              break;
            case 'l':
              str3 = str5;
              break;
            case 'c':
              str4 = str5;
              break;
            case 'r':
              str = str5;
              break;
            case 'i':
              try {
                Integer.parseInt(str5);
              } catch (Exception exception) {}
              break;
          } 
        } 
      } 
      if (ag.b() != null) {
        i = k;
        String str7 = str3;
        String str8 = str4;
        String str5 = str;
        String str6;
        if (str != null && str.length() >= 4 && (str6 = str.substring(0, 4).toLowerCase()).equals("reco"))
          ag.b().a(i, str7, str8, str5); 
        cn.a().d(0, 3);
        cr.g();
        return;
      } 
    } catch (Exception exception) {
      (str2 = null).printStackTrace();
      al al;
      (al = ag.b().a("Có lỗi", "Tin sai cú pháp", "Có", 3, 1)).b(-10008);
      al.a(a());
      ag.b().a(al);
    } 
  }
  
  public final void d(int paramInt1, int paramInt2) {
    if (paramInt2 == 1) {
      ag.b().a(-10007, false);
      return;
    } 
    if (paramInt2 == 2) {
      ag.b().a(-10009, false);
      return;
    } 
    if (paramInt2 == 3)
      ag.b().a(-10008, false); 
  }
  
  public static void a(MessageConnection paramMessageConnection) {
    ch.a(paramMessageConnection);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ci.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */