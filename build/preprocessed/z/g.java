import java.io.InputStream;
import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;

public class g {
  public int a;
  
  public int b;
  
  public static Image a(Image paramImage, int paramInt1, int paramInt2) {
    int[] arrayOfInt;
    int i = paramImage.getWidth();
    int j = paramImage.getHeight();
    if (i != paramInt1 || j != paramInt2) {
      int[] arrayOfInt2 = new int[i * j];
      paramImage.getRGB(arrayOfInt2, 0, i, 0, 0, i, j);
      arrayOfInt = new int[paramInt1 * paramInt2];
      int[] arrayOfInt3 = arrayOfInt;
      int n = j;
      int m = i;
      int k = paramInt2;
      j = paramInt1;
      int[] arrayOfInt1 = arrayOfInt2;
      int i2 = m * 1024 / j;
      int i3 = n * 1024 / k;
      byte b = 0;
      int i1 = 0;
      while (b < k) {
        int i4 = (i3 * b >> 10) * m;
        int i5 = 0;
        for (n = 0; n < j; n++) {
          arrayOfInt3[i1 + n] = arrayOfInt1[i4 + (i5 >> 10)];
          i5 += i2;
        } 
        i1 += j;
        b++;
      } 
      return Image.createRGBImage(arrayOfInt, paramInt1, paramInt2, true);
    } 
    return (Image)arrayOfInt;
  }
  
  public static SocketConnection a(String paramString, int paramInt) {
    byte b = 5;
    paramInt = paramInt;
    String str = paramString;
    SocketConnection socketConnection;
    (socketConnection = (SocketConnection)Connector.open("socket://" + str + ":" + paramInt)).setSocketOption((byte)1, 5);
    return socketConnection;
  }
  
  public static int a(InputStream paramInputStream, byte[] paramArrayOfbyte, int paramInt) {
    for (paramInt = paramInt; paramInt < paramArrayOfbyte.length; paramInt += i) {
      int i;
      if ((i = paramInputStream.read(paramArrayOfbyte, paramInt, paramArrayOfbyte.length - paramInt)) < 0)
        return -1; 
    } 
    return paramInt;
  }
  
  public static boolean a(String paramString) {
    if (i.a(paramString))
      return false; 
    String[] arrayOfString;
    if ((arrayOfString = RecordStore.listRecordStores()) == null || paramString.length() <= 0)
      return false; 
    paramString = paramString.toLowerCase();
    for (byte b = 0; b < arrayOfString.length; b++) {
      if (arrayOfString[b].toLowerCase().equals(paramString))
        return true; 
    } 
    return false;
  }
  
  public static RecordStore a(String paramString, boolean paramBoolean) {
    try {
      return RecordStore.openRecordStore(paramString, paramBoolean);
    } catch (Throwable throwable) {
      (paramString = null).printStackTrace();
      return null;
    } 
  }
  
  public static byte[] a(RecordStore paramRecordStore, int paramInt) {
    try {
      byte[] arrayOfByte = paramRecordStore.getRecord(paramInt);
    } catch (Throwable throwable) {
      (paramRecordStore = null).printStackTrace();
      paramRecordStore = null;
    } 
    return (byte[])paramRecordStore;
  }
  
  public static void a(RecordStore paramRecordStore, int paramInt, byte[] paramArrayOfbyte) {
    int i = paramArrayOfbyte.length;
    boolean bool = false;
    paramArrayOfbyte = paramArrayOfbyte;
    paramInt = paramInt;
    RecordStore recordStore;
    (recordStore = paramRecordStore).setRecord(paramInt, paramArrayOfbyte, 0, i);
  }
  
  public static int a(RecordStore paramRecordStore, byte[] paramArrayOfbyte) {
    int i = paramArrayOfbyte.length;
    boolean bool = false;
    paramArrayOfbyte = paramArrayOfbyte;
    RecordStore recordStore;
    return (recordStore = paramRecordStore).addRecord(paramArrayOfbyte, 0, i);
  }
  
  public static int a(RecordStore paramRecordStore) {
    try {
      return paramRecordStore.getNumRecords();
    } catch (Throwable throwable) {
      (paramRecordStore = null).printStackTrace();
      return 0;
    } 
  }
  
  public static void b(String paramString) {
    try {
      RecordStore.deleteRecordStore(paramString);
      return;
    } catch (Throwable throwable) {
      (paramString = null).printStackTrace();
      return;
    } 
  }
  
  public static void a(Object[] paramArrayOfObject, int paramInt1, int paramInt2) {
    Object object = paramArrayOfObject[paramInt1];
    paramArrayOfObject[paramInt1] = paramArrayOfObject[paramInt2];
    paramArrayOfObject[paramInt2] = object;
  }
  
  public static Object[] a(Object[] paramArrayOfObject, b paramb) {
    return a(paramArrayOfObject, 0, paramArrayOfObject.length, paramb);
  }
  
  public static Object[] a(Object[] paramArrayOfObject, int paramInt1, int paramInt2, b paramb) {
    if (paramArrayOfObject != null) {
      paramInt2 = paramInt1 + paramInt2;
      int i = paramInt1 + 1;
      while (true) {
        paramInt1 = 0;
        int j;
        for (j = i; j < paramInt2; j++) {
          if (paramb.a(paramArrayOfObject[j - 1], paramArrayOfObject[j]) > 0) {
            a(paramArrayOfObject, j - 1, j);
            paramInt1 = 1;
          } 
        } 
        paramInt2--;
        if (paramInt1 != 0) {
          for (j = paramInt2 - 1; j >= i; j--) {
            if (paramb.a(paramArrayOfObject[j - 1], paramArrayOfObject[j]) > 0) {
              a(paramArrayOfObject, j - 1, j);
              paramInt1 = 1;
            } 
          } 
          i++;
          if (paramInt1 == 0)
            break; 
          continue;
        } 
        break;
      } 
    } 
    return paramArrayOfObject;
  }
  
  public static int a(Object[] paramArrayOfObject, int paramInt1, int paramInt2, Object paramObject, b paramb) {
    paramInt1 = 0;
    paramInt2 = paramInt2;
    while (paramInt1 <= paramInt2) {
      int i = paramInt1 + paramInt2 >>> 1;
      int j;
      if ((j = paramb.a(paramArrayOfObject[i], paramObject)) < 0) {
        paramInt1 = i + 1;
        continue;
      } 
      if (j > 0) {
        paramInt2 = i - 1;
        continue;
      } 
      return i;
    } 
    return -(paramInt1 + 1);
  }
  
  public g() {}
  
  public g(int paramInt1, int paramInt2) {
    a(paramInt1, paramInt2);
  }
  
  public void a(int paramInt1, int paramInt2) {
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  public static String a(a parama, int paramInt1, int paramInt2, boolean paramBoolean) {
    boolean bool;
    if (paramBoolean) {
      bool = paramBoolean;
      paramInt1 = paramInt1;
      parama = parama;
      paramBoolean = false;
      int i = parama.d();
      while (paramBoolean < i) {
        n n;
        if ((n = (n)parama.b(paramBoolean)).b() == paramInt1)
          return b(parama, paramInt1, paramBoolean, bool); 
        paramBoolean++;
      } 
      return null;
    } 
    while (!bool) {
      n n;
      if ((n = (n)parama.b(bool)).b() != paramInt1) {
        bool++;
        break;
      } 
      bool--;
    } 
    if (bool)
      bool = false; 
    return b(parama, paramInt1, bool, paramBoolean);
  }
  
  public static String b(a parama, int paramInt1, int paramInt2, boolean paramBoolean) {
    String str = "";
    paramInt2 = paramInt2;
    int i = parama.d();
    while (paramInt2 < i) {
      n n;
      if ((n = (n)parama.b(paramInt2)).b() == paramInt1) {
        str = String.valueOf(str) + n.a();
        continue;
      } 
      if (paramBoolean)
        continue; 
      break;
      paramInt2++;
    } 
    return str;
  }
  
  public static int[] a(a parama, int paramInt) {
    a a1 = new a();
    int i = Integer.MIN_VALUE;
    for (byte b1 = 0; b1 < parama.d(); b1++) {
      i = n.b();
      n n;
      String str;
      if ((n = (n)parama.b(b1)).c() == 4 && n.b() != i && !i.a(str = a(parama, n.b(), b1, true))) {
        boolean bool = true;
        a a3 = a1;
        for (byte b = 0; b < a3.d(); b++) {
          int j = ((Integer)a3.b(b)).intValue();
          n n1 = (n)parama.b(j);
          String str1;
          if ((str1 = a(parama, n1.b(), j, true)).equals(str)) {
            bool = false;
            break;
          } 
        } 
        if (bool)
          a3.a(new Integer(b1)); 
      } 
    } 
    int[] arrayOfInt = new int[a1.d()];
    a a2 = a1;
    for (byte b2 = 0; b2 < a2.d(); b2++)
      arrayOfInt[b2] = ((Integer)a2.b(b2)).intValue(); 
    return arrayOfInt;
  }
  
  public static a c(String paramString) {
    String str = paramString;
    a a3 = new a(15);
    if (!i.b(str)) {
      String str1 = str.toLowerCase();
      int i;
      do {
        a3.a(str1.substring(0, i));
        a3.a("\n");
      } while ((i = str1.indexOf('\n')) >= 0 && !i.b(str1 = str1.substring(i + 1)));
      if (!i.b(str1))
        a3.a(str1); 
    } 
    a a1;
    a a2;
    if ((a2 = a1 = a3).d() > 0)
      try {
        a a;
        a(a = a2, "rss://", " ", false, 3);
        a(a = a2, "http://", " ", false, 3);
        a(a = a2, "www.", " ", false, 3);
        a(a = a2, "#\033", "#", true, 1);
        a(a = a2, "@", " ", false, 4);
        a(a = a2, "#", " ", false, 5);
        a = a2;
        for (byte b = 0; b < a.d(); b++) {
          String str1;
          if ((str1 = (String)a.b(b)).length() > 0 && str1.charAt(0) != '\032') {
            byte b1 = 0;
            int i = str1.length() - 1;
            while (b1 < i) {
              int j = str1.length() - b1;
              char c1 = str1.charAt(b1);
              char c2 = str1.charAt(b1 + 1);
              byte b2 = 3;
              byte b3 = -1;
              switch (c1) {
                case '<':
                  if (c2 == '3') {
                    b2 = 2;
                    b3 = 28;
                  } 
                  break;
                case '@':
                  if (c2 == ';' && j > 2 && str1.charAt(b1 + 2) == '-')
                    b3 = 31; 
                  break;
                case ':':
                  if (c2 == '-') {
                    if (j > 2) {
                      if ((c1 = str1.charAt(b1 + 2)) == ')') {
                        if (j > 3 && (j = str1.charAt(b1 + 3)) == 41) {
                          b2 = 4;
                          b3 = 3;
                          break;
                        } 
                        b3 = 0;
                        break;
                      } 
                      if (c1 == 'p') {
                        b3 = 1;
                        break;
                      } 
                      if (c1 == 'x') {
                        b3 = 6;
                        break;
                      } 
                      if (c1 == '*') {
                        b3 = 7;
                        break;
                      } 
                      if (c1 == '|') {
                        b3 = 8;
                        break;
                      } 
                      if (c1 == 'd') {
                        b3 = 9;
                        break;
                      } 
                      if (c1 == '/') {
                        b3 = 13;
                        break;
                      } 
                      if (c1 == '<') {
                        b3 = 14;
                        break;
                      } 
                      if (c1 == '&') {
                        b3 = 15;
                        break;
                      } 
                      if (c1 == '(') {
                        if (j > 3 && (j = str1.charAt(b1 + 3)) == 40) {
                          b2 = 4;
                          b3 = 22;
                          break;
                        } 
                        b3 = 16;
                        break;
                      } 
                      if (c1 == 'b') {
                        b3 = 17;
                        break;
                      } 
                      if (c1 == 'o') {
                        b3 = 18;
                        break;
                      } 
                      if (c1 == 'h') {
                        b3 = 19;
                        break;
                      } 
                      if (c1 == 's') {
                        b3 = 20;
                        break;
                      } 
                      if (c1 == '?') {
                        b3 = 21;
                        break;
                      } 
                      if (c1 == 'w')
                        b3 = 25; 
                    } 
                    break;
                  } 
                  if (c2 == ')') {
                    if (j > 2 && (c1 = str1.charAt(b1 + 2)) == ')') {
                      b3 = 3;
                      break;
                    } 
                    b2 = 2;
                    b3 = 0;
                    break;
                  } 
                  if (c2 == 'p') {
                    b2 = 2;
                    b3 = 1;
                    break;
                  } 
                  if (c2 == 'x') {
                    b2 = 2;
                    b3 = 6;
                    break;
                  } 
                  if (c2 == '*') {
                    b2 = 2;
                    b3 = 7;
                    break;
                  } 
                  if (c2 == '|') {
                    b2 = 2;
                    b3 = 8;
                    break;
                  } 
                  if (c2 == 'd') {
                    b2 = 2;
                    b3 = 9;
                    break;
                  } 
                  if (c2 == '(') {
                    if (j > 2 && (c1 = str1.charAt(b1 + 2)) == '(') {
                      b3 = 22;
                      break;
                    } 
                    b2 = 2;
                    b3 = 16;
                    break;
                  } 
                  if (c2 == 'b') {
                    b2 = 2;
                    b3 = 17;
                    break;
                  } 
                  if (c2 == 'o') {
                    b2 = 2;
                    b3 = 18;
                    break;
                  } 
                  if (c2 == 's') {
                    b2 = 2;
                    b3 = 20;
                    break;
                  } 
                  if (c2 == '"' && j > 2 && (c1 = str1.charAt(b1 + 2)) == '>')
                    b3 = 4; 
                  break;
                case '>':
                  if (j > 2) {
                    c1 = str1.charAt(b1 + 2);
                    if (c2 == ':') {
                      if (j > 3) {
                        j = str1.charAt(b1 + 3);
                        if (c1 == 'd' && j == 60) {
                          b2 = 4;
                          b3 = 2;
                          break;
                        } 
                      } 
                      if (c1 == ')')
                        b3 = 27; 
                    } 
                  } 
                  break;
                case 'b':
                  if (j > 2) {
                    c1 = str1.charAt(b1 + 2);
                    if (c2 == '-' && c1 == ')')
                      b3 = 5; 
                  } 
                  break;
                case ';':
                  if (j > 2) {
                    c1 = str1.charAt(b1 + 2);
                    if (c2 == '-' && c1 == ')') {
                      b3 = 10;
                      break;
                    } 
                  } 
                  if (c2 == ')') {
                    b2 = 2;
                    b3 = 10;
                  } 
                  break;
                case '|':
                  if (j > 2) {
                    c1 = str1.charAt(b1 + 2);
                    if (c2 == '-' && c1 == ')')
                      b3 = 11; 
                  } 
                  break;
                case '(':
                  if (j > 2) {
                    c1 = str1.charAt(b1 + 2);
                    if (c2 == ':' && c1 == '|') {
                      b3 = 12;
                      break;
                    } 
                    if (c2 == 'y' && c1 == ')') {
                      b3 = 29;
                      break;
                    } 
                    if (c2 == 'n' && c1 == ')') {
                      b3 = 30;
                      break;
                    } 
                    if (c2 == '*' && c1 == ')')
                      b3 = 32; 
                  } 
                  break;
                case '=':
                  if (j > 2) {
                    c1 = str1.charAt(b1 + 2);
                    if (c2 == '(' && c1 == '(')
                      b3 = 23; 
                    break;
                  } 
                  if (c2 == ';') {
                    b2 = 2;
                    b3 = 24;
                  } 
                  break;
                case 'X':
                case 'x':
                  if (j > 2) {
                    c1 = str1.charAt(b1 + 2);
                    if (c2 == '-' && c1 == '(')
                      b3 = 26; 
                    break;
                  } 
                  if (c2 == '(') {
                    b2 = 2;
                    b3 = 26;
                  } 
                  break;
                case 'I':
                case 'i':
                  if (j > 2) {
                    c1 = str1.charAt(b1 + 2);
                    if (c2 == '-' && c1 == ')')
                      b3 = 11; 
                  } 
                  break;
              } 
              if (b3 >= 0) {
                String str2 = str1.substring(0, b1);
                String str3 = str1.substring(b1, b1 + b2);
                str1 = str1.substring(b1 + b2);
                str3 = "\0322" + ((b3 < 10) ? ("0" + b3) : String.valueOf(b3)) + str3;
                if (str2 == null || str2.length() <= 0) {
                  a.a(str3, b);
                } else {
                  a.a(str2, b);
                  a.b(str3, ++b);
                } 
                if (str1 != null && str1.length() > 0)
                  a.b(str1, b + 1); 
                break;
              } 
              b1++;
            } 
          } 
        } 
      } catch (Throwable throwable) {
        (a3 = null).printStackTrace();
      }  
    return a1;
  }
  
  private static void a(a parama, String paramString1, String paramString2, boolean paramBoolean, int paramInt) {
    for (byte b = 0; b < parama.d(); b++) {
      String str;
      if ((str = (String)parama.b(b)).length() > 0 && str.charAt(0) != '\032') {
        int i = -1;
        while ((i = str.indexOf(paramString1, i + 1)) >= 0) {
          String str2;
          String str3 = null;
          String str1 = str.substring(0, i);
          int j;
          if ((j = str.indexOf(paramString2, i + paramString1.length())) >= 0) {
            if (paramBoolean)
              j++; 
            str2 = str.substring(i, j);
            str3 = str.substring(j);
          } else if (!paramBoolean) {
            str2 = str.substring(i);
          } else {
            continue;
          } 
          if (str2.length() > paramString1.length()) {
            try {
              if (paramInt == 5 || paramInt == 4) {
                j = paramString1.length();
                int k = str2.length();
                char c;
                while (j < k && (((c = str2.charAt(j)) >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '.' || c == '_'))
                  j++; 
                if (j < str2.length()) {
                  if (j <= paramString1.length()) {
                    i += paramString1.length() - 1;
                    continue;
                  } 
                  str2 = str.substring(i, j + i);
                  str3 = str.substring(j + i);
                } 
                if (str3 != null && str3.length() > 0 && str2.length() - paramString1.length() > 1) {
                  k = str2.charAt(str2.length() - 1);
                  c = str3.charAt(0);
                  if (k == 46 && c == ' ') {
                    str2 = str.substring(i, --j + i);
                    str3 = str.substring(j + i);
                  } 
                } 
              } 
            } catch (Exception exception2) {
              Exception exception1;
              (exception1 = null).printStackTrace();
            } 
            str2 = "\032" + paramInt + str2;
            if (str1 == null || str1.length() <= 0) {
              parama.a(str2, b);
            } else {
              parama.a(str1, b);
              parama.b(str2, ++b);
            } 
            if (str3 != null && str3.length() > 0)
              parama.b(str3, b + 1); 
            break;
          } 
        } 
      } 
    } 
  }
  
  private static n f(a parama, int paramInt) {
    return (n)parama.b(paramInt);
  }
  
  public static boolean a(int paramInt) {
    return (paramInt != 0 && paramInt != 2);
  }
  
  public static int b(a parama, int paramInt) {
    n n = f(parama, paramInt);
    while (--paramInt >= 0) {
      n n1;
      if (a((n1 = f(parama, paramInt)).c()) && n1.b() != n.b())
        return paramInt; 
      paramInt--;
    } 
    return -1;
  }
  
  public static int c(a parama, int paramInt) {
    n n = f(parama, paramInt);
    while (++paramInt < parama.d()) {
      n n1;
      if (a((n1 = f(parama, paramInt)).c()) && n1.b() != n.b())
        return paramInt; 
      paramInt++;
    } 
    return -1;
  }
  
  public static int d(a parama, int paramInt) {
    n n = f(parama, paramInt);
    while (--paramInt >= 0) {
      n n1;
      if (a((n1 = f(parama, paramInt)).c()) && n1.e() < n.e() && n1.b() != n.b()) {
        int i = Math.abs(n.d() - n1.d());
        for (int j = paramInt - 1; j >= 0; j--) {
          n n2 = f(parama, j);
          if (n1.e() != n2.e())
            return paramInt; 
          if (a(n2.c()) && n2.b() != n1.b()) {
            int k;
            if ((k = Math.abs(n.d() - n2.d())) > i)
              return paramInt; 
            if (k < i) {
              paramInt = j;
              i = k;
            } 
          } 
        } 
        return paramInt;
      } 
      paramInt--;
    } 
    return -1;
  }
  
  public static int e(a parama, int paramInt) {
    n n = f(parama, paramInt);
    while (++paramInt < parama.d()) {
      n n1;
      if (a((n1 = f(parama, paramInt)).c()) && n1.e() > n.e() && n1.b() != n.b()) {
        int i = Math.abs(n.d() - n1.d());
        for (int j = paramInt + 1; j < parama.d(); j++) {
          n n2 = f(parama, j);
          if (n1.e() != n2.e())
            return paramInt; 
          if (a(n2.c()) && n2.b() != n1.b()) {
            int k;
            if ((k = Math.abs(n.d() - n2.d())) > i)
              return paramInt; 
            if (k < i) {
              paramInt = j;
              i = k;
            } 
          } 
        } 
        return paramInt;
      } 
      paramInt++;
    } 
    return -1;
  }
  
  public static String a(a parama, int paramInt, boolean paramBoolean) {
    for (byte b = 0; b < parama.d(); b++) {
      n n;
      if ((n = (n)parama.b(b)).c() == paramInt)
        return b(parama, n.b(), b, paramBoolean); 
    } 
    return null;
  }
  
  public static byte[] a(byte[] paramArrayOfbyte, String paramString) {
    try {
      byte b = paramArrayOfbyte[0];
      byte[] arrayOfByte2 = paramString.getBytes("UTF-8");
      byte[] arrayOfByte1;
      (arrayOfByte1 = new byte[Math.max(paramArrayOfbyte.length - 1, arrayOfByte2.length + b) + 1])[0] = (byte)arrayOfByte2.length;
      for (byte b1 = 0; b1 < arrayOfByte1.length - 1; b1++) {
        byte b2 = 17;
        byte b3 = 0;
        if (b1 + 1 < paramArrayOfbyte.length)
          b2 = paramArrayOfbyte[b1 + 1]; 
        if (b1 >= b && b1 - b < arrayOfByte2.length)
          b3 = arrayOfByte2[b1 - b]; 
        arrayOfByte1[b1 + 1] = (byte)(b2 ^ b3);
      } 
      return arrayOfByte1;
    } catch (Throwable throwable) {
      try {
        byte b = paramArrayOfbyte[0];
        byte[] arrayOfByte2 = paramString.getBytes();
        byte[] arrayOfByte1;
        (arrayOfByte1 = new byte[Math.max(paramArrayOfbyte.length - 1, arrayOfByte2.length + b) + 1])[0] = (byte)arrayOfByte2.length;
        for (byte b1 = 0; b1 < arrayOfByte1.length - 1; b1++) {
          byte b3 = 17;
          byte b2 = 0;
          if (b1 + 1 < paramArrayOfbyte.length)
            b3 = paramArrayOfbyte[b1 + 1]; 
          if (b1 >= b && b1 - b < arrayOfByte2.length)
            b2 = arrayOfByte2[b1 - b]; 
          arrayOfByte1[b1 + 1] = (byte)(b3 ^ b2);
        } 
        return arrayOfByte1;
      } catch (Throwable throwable1) {
        return null;
      } 
    } 
  }
  
  public static String a() {
    String str;
    try {
      if ((str = System.getProperty("Cell-ID")) == null || str.equals("null") || str.equals(""))
        str = System.getProperty("CellID"); 
      if (str == null || str.equals("null") || str.equals(""))
        str = System.getProperty("com.nokia.mid.cellid"); 
      if (str == null || str.equals("null") || str.equals(""))
        str = System.getProperty("com.sonyericsson.net.cellid"); 
      if (str == null || str.equals("null") || str.equals(""))
        str = System.getProperty("phone.cid"); 
      if (str == null || str.equals("null") || str.equals(""))
        str = System.getProperty("com.samsung.cellid"); 
      if (str == null || str.equals("null") || str.equals(""))
        str = System.getProperty("com.siemens.cellid"); 
      if (str == null || str.equals("null") || str.equals(""))
        str = System.getProperty("cid"); 
      if (str == null || str.equals("null") || str.equals(""))
        return null; 
    } catch (Exception exception) {
      return null;
    } 
    try {
      if (str != null) {
        int i;
        str = Integer.toHexString(i = Integer.parseInt(str));
      } 
    } catch (Exception exception) {}
    return str;
  }
  
  public static String b() {
    String str;
    try {
      if ((str = System.getProperty("phone.lac")) == null || str.equals("null") || str.equals(""))
        str = System.getProperty("com.nokia.mid.lac"); 
      if (str == null || str.equals("null") || str.equals(""))
        str = System.getProperty("com.sonyericsson.net.lac"); 
      if (str == null || str.equals("null") || str.equals(""))
        str = System.getProperty("LocAreaCode"); 
      if (str == null || str.equals("null") || str.equals(""))
        return null; 
    } catch (Exception exception) {
      return null;
    } 
    try {
      if (str != null) {
        int i;
        str = Integer.toHexString(i = Integer.parseInt(str));
      } 
    } catch (Exception exception) {}
    return str;
  }
  
  public static String c() {
    String str;
    try {
      if ((str = System.getProperty("phone.mcc")) == null || str.equals("null") || str.equals(""))
        str = System.getProperty("com.nokia.mid.mcc"); 
      if (str == null || str.equals("null") || str.equals(""))
        str = System.getProperty("com.sonyericsson.net.mcc"); 
      if (str == null || str.equals("null") || str.equals(""))
        str = System.getProperty("mcc"); 
      if (str == null || str.equals("null") || str.equals(""))
        str = System.getProperty("com.nokia.mid.countrycode"); 
      if (str == null || str.equals("null") || str.equals(""))
        return null; 
    } catch (Exception exception) {
      return null;
    } 
    return str;
  }
  
  public static String d() {
    String str1;
    try {
      if ((str1 = System.getProperty("phone.mnc")) == null || str1.equals("null") || str1.equals(""))
        str1 = System.getProperty("com.nokia.mid.mnc"); 
      if (str1 == null || str1.equals("null") || str1.equals(""))
        str1 = System.getProperty("com.sonyericsson.net.mnc"); 
      if (str1 == null || str1.equals("null") || str1.equals(""))
        str1 = System.getProperty("mnc"); 
      if (str1 == null || str1.equals("null") || str1.equals(""))
        str1 = System.getProperty("com.nokia.mid.networkID"); 
      if (str1 == null || str1.equals("null") || str1.equals(""))
        str1 = System.getProperty("com.nokia.mid.networkid"); 
      if (str1 == null || str1.equals("null") || str1.equals(""))
        return null; 
    } catch (Exception exception) {
      return null;
    } 
    String str2;
    if (str1 != null && (str2 = c()) != null) {
      if (!str1.equals(str2) && str1.startsWith(str2))
        str1 = str1.substring(str2.length()); 
      if (str1 != null && str1.length() > 0) {
        byte b = 0;
        int i = str1.length();
        while (b < i) {
          if (str1.charAt(b) < '0' || str1.charAt(b) > '9') {
            str1 = str1.substring(0, b);
            break;
          } 
          b++;
        } 
      } 
    } 
    return str1;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\g.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */