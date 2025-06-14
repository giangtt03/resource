import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import javax.microedition.rms.RecordStore;

public final class pd extends cs {
  private static u b = null;
  
  private static void H() {
    b = u.a("olacacher", 2048, 1024, 1, 10);
    char c = '⠀';
    cs.a = u.a("161b", 161, 10240);
  }
  
  public static long b(int[] paramArrayOfint) {
    if (paramArrayOfint == null)
      return 0L; 
    byte[] arrayOfByte = new byte[paramArrayOfint.length << 2];
    boolean bool = false;
    for (byte b = 0; b < paramArrayOfint.length; b++) {
      System.arraycopy(m.a(arrayOfByte[b]), 0, arrayOfByte, bool, 4);
      bool += true;
    } 
    e.a();
    return e.a(arrayOfByte);
  }
  
  public static int a(long paramLong) {
    long l = 0L;
    byte[] arrayOfByte;
    if ((arrayOfByte = cs.a.a(153)) != null)
      l = m.d(arrayOfByte); 
    if (l != paramLong) {
      b(paramLong);
      return 0;
    } 
    int i = 0;
    if ((arrayOfByte = cs.a.a(154)) != null)
      i = m.c(arrayOfByte); 
    return i;
  }
  
  public static void b(long paramLong) {
    cs.a.b(153, m.a(paramLong));
  }
  
  public static void a(int paramInt) {
    cs.a.b(154, m.a(paramInt));
  }
  
  public static void j() {
    cs.a.b(153);
    cs.a.b(154);
    cs.a.a();
  }
  
  public static long k() {
    char c = '';
    byte[] arrayOfByte;
    Long long_;
    u u1;
    if ((long_ = (Long)(((arrayOfByte = (u1 = cs.a).a(155)) != null) ? new Long(m.d(arrayOfByte)) : null)) == null) {
      long l = (long_ = new Long(System.currentTimeMillis())).longValue();
      if (!cs.a.c(155))
        cs.a.b(155, m.a(l)); 
    } 
    return long_.longValue();
  }
  
  public static void a(String[] paramArrayOfString) {
    if (paramArrayOfString == null)
      return; 
    byte[] arrayOfByte = new byte[1000];
    int i = 0;
    System.arraycopy(m.a(paramArrayOfString.length), 0, arrayOfByte, 0, 4);
    i += true;
    for (byte b = 0; b < paramArrayOfString.length; b++) {
      byte[] arrayOfByte1;
      System.arraycopy(m.a((arrayOfByte1 = paramArrayOfString[b].getBytes()).length), 0, arrayOfByte, i, 4);
      i += true;
      System.arraycopy(arrayOfByte1, 0, arrayOfByte, i, arrayOfByte1.length);
      i += arrayOfByte1.length;
    } 
    cs.a.b(157, arrayOfByte, 0, i);
  }
  
  public static String[] l() {
    byte[] arrayOfByte;
    if ((arrayOfByte = cs.a.a(157)) != null) {
      int i = 0;
      int j = m.a(arrayOfByte, 0);
      i += true;
      String[] arrayOfString = new String[j];
      for (byte b = 0; b < arrayOfString.length; b++) {
        int k = m.a(arrayOfByte, i);
        i += true;
        arrayOfString[b] = new String(arrayOfByte, i, k);
        i += k;
      } 
      return arrayOfString;
    } 
    return null;
  }
  
  public static final void m() {
    H();
    int i = 0;
    byte[] arrayOfByte;
    if ((arrayOfByte = cs.a.a(121)) != null)
      i = m.c(arrayOfByte); 
    if (i < 7) {
      try {
        String[] arrayOfString;
        if ((arrayOfString = RecordStore.listRecordStores()) != null)
          for (byte b = 0; b < arrayOfString.length; b++)
            g.b(arrayOfString[b]);  
      } catch (Throwable throwable2) {
        Throwable throwable1;
        (throwable1 = null).printStackTrace();
      } 
      H();
      arrayOfByte = m.a(7);
      cs.a.b(121, arrayOfByte);
    } 
  }
  
  public static boolean n() {
    return cs.a.c(151);
  }
  
  public static void o() {
    cs.a.b(151, new byte[] { 1 });
  }
  
  public static final String p() {
    byte[] arrayOfByte;
    return ((arrayOfByte = cs.a.a(112)) != null) ? i.a(arrayOfByte) : null;
  }
  
  public static final void a(String paramString) {
    byte[] arrayOfByte = null;
    try {
      arrayOfByte = i.c(paramString);
    } catch (UnsupportedEncodingException unsupportedEncodingException) {}
    if (arrayOfByte == null || arrayOfByte.length <= 0)
      arrayOfByte = new byte[0]; 
    cs.a.b(112, arrayOfByte);
  }
  
  public static byte[] q() {
    byte[] arrayOfByte;
    return arrayOfByte = b.a(-2147483648);
  }
  
  public static void b(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte == null)
      return; 
    b.a(-2147483648, paramArrayOfbyte);
    b.a(-2147483648, Long.MAX_VALUE);
    b.a();
  }
  
  public static void b(String paramString) {
    byte[] arrayOfByte = null;
    try {
      arrayOfByte = i.c(paramString);
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      (paramString = null).printStackTrace();
    } 
    if (arrayOfByte == null)
      return; 
    cs.a.b(119, arrayOfByte);
  }
  
  public static String r() {
    byte[] arrayOfByte;
    return ((arrayOfByte = cs.a.a(119)) == null) ? null : i.a(arrayOfByte);
  }
  
  public static void s() {
    b.b(-2147483647);
    b.b(-2147483646);
    cs.a.b(118);
    cs.a.b(112);
    cs.a.b(150);
    cs.a.a();
    b.a();
    go.d = 0;
  }
  
  public static void b(String[] paramArrayOfString) {
    if (paramArrayOfString == null)
      return; 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(2000);
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    byte[] arrayOfByte = null;
    try {
      dataOutputStream.writeInt(paramArrayOfString.length);
      for (byte b = 0; b < paramArrayOfString.length; b++) {
        arrayOfByte = i.c(paramArrayOfString[b]);
        dataOutputStream.writeInt(arrayOfByte.length);
        dataOutputStream.write(arrayOfByte, 0, arrayOfByte.length);
        dataOutputStream.flush();
        byteArrayOutputStream.flush();
        arrayOfByte = byteArrayOutputStream.toByteArray();
        dataOutputStream.close();
        byteArrayOutputStream.close();
      } 
    } catch (IOException iOException) {
      try {
        dataOutputStream.close();
        byteArrayOutputStream.close();
      } catch (IOException iOException1) {
        (arrayOfByte = null).printStackTrace();
      } 
      iOException.printStackTrace();
      return;
    } 
    if (arrayOfByte == null)
      return; 
    b.a(-2147483646, arrayOfByte);
    b.a(-2147483646, Long.MAX_VALUE);
    b.a();
  }
  
  public static String[] t() {
    String[] arrayOfString;
    byte[] arrayOfByte;
    if ((arrayOfByte = b.a(-2147483646)) == null)
      return null; 
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
    try {
      int i;
      arrayOfString = new String[i = dataInputStream.readInt()];
      for (byte b = 0; b < i; b++) {
        byte[] arrayOfByte1 = new byte[dataInputStream.readInt()];
        dataInputStream.read(arrayOfByte1, 0, arrayOfByte1.length);
        arrayOfString[b] = i.a(arrayOfByte1);
      } 
      dataInputStream.close();
      byteArrayInputStream.close();
    } catch (Exception exception) {
      try {
        dataInputStream.close();
        byteArrayInputStream.close();
      } catch (IOException iOException2) {
        IOException iOException1;
        (iOException1 = null).printStackTrace();
      } 
      return null;
    } 
    b.b(-2147483646);
    b.a();
    return arrayOfString;
  }
  
  public static void a(dt[] paramArrayOfdt, int paramInt) {
    if (paramArrayOfdt == null)
      return; 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(2000);
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    try {
      int j = paramArrayOfdt.length;
      byte b;
      for (b = 0; b < paramArrayOfdt.length; b++) {
        if (paramArrayOfdt[b].a() == 1)
          j--; 
      } 
      dataOutputStream.writeInt(j);
      for (b = 0; b < paramArrayOfdt.length; b++) {
        if (paramArrayOfdt[b].a() != 1) {
          byte[] arrayOfByte2 = i.c(paramArrayOfdt[b].b());
          dataOutputStream.writeInt(arrayOfByte2.length);
          dataOutputStream.write(arrayOfByte2, 0, arrayOfByte2.length);
          int k = 0;
          ds[] arrayOfDs;
          if ((arrayOfDs = paramArrayOfdt[b].c()) != null)
            k = arrayOfDs.length; 
          dataOutputStream.writeInt(k);
          for (byte b1 = 0; b1 < k; b1++) {
            byte[] arrayOfByte3 = i.c(arrayOfDs[b1].a());
            dataOutputStream.writeInt(arrayOfByte3.length);
            dataOutputStream.write(arrayOfByte3, 0, arrayOfByte3.length);
            if ((arrayOfByte3 = i.c(arrayOfDs[b1].b())) == null) {
              dataOutputStream.writeInt(0);
            } else {
              dataOutputStream.writeInt(arrayOfByte3.length);
              dataOutputStream.write(arrayOfByte3, 0, arrayOfByte3.length);
            } 
          } 
        } 
      } 
      dataOutputStream.flush();
      byteArrayOutputStream.flush();
      dataOutputStream.close();
      byte[] arrayOfByte1 = byteArrayOutputStream.toByteArray();
      byteArrayOutputStream.close();
    } catch (IOException iOException) {
      try {
        dataOutputStream.close();
        byteArrayOutputStream.close();
      } catch (IOException iOException2) {
        IOException iOException1;
        (iOException1 = null).printStackTrace();
      } 
      paramArrayOfdt = null;
      iOException.printStackTrace();
    } 
    if (paramArrayOfdt == null)
      return; 
    b.a(-2147483647, (byte[])paramArrayOfdt);
    b.a(-2147483647, Long.MAX_VALUE);
    b.a();
    int i;
    byte[] arrayOfByte = m.a(i = paramInt);
    cs.a.b(118, arrayOfByte);
  }
  
  public static dt[] u() {
    dt[] arrayOfDt;
    byte[] arrayOfByte;
    if ((arrayOfByte = b.a(-2147483647)) == null)
      return null; 
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
    try {
      int i;
      arrayOfDt = new dt[i = dataInputStream.readInt()];
      for (byte b = 0; b < i; b++) {
        byte[] arrayOfByte1 = new byte[dataInputStream.readInt()];
        dataInputStream.read(arrayOfByte1, 0, arrayOfByte1.length);
        arrayOfDt[b] = new dt(i.a(arrayOfByte1));
        ds[] arrayOfDs = new ds[dataInputStream.readInt()];
        for (byte b1 = 0; b1 < arrayOfDs.length; b1++) {
          arrayOfDs[b1] = new ds();
          arrayOfByte1 = new byte[dataInputStream.readInt()];
          dataInputStream.read(arrayOfByte1, 0, arrayOfByte1.length);
          arrayOfDs[b1].a(i.a(arrayOfByte1));
          if ((arrayOfByte1 = new byte[dataInputStream.readInt()]).length > 0) {
            dataInputStream.read(arrayOfByte1, 0, arrayOfByte1.length);
            arrayOfDs[b1].b(i.a(arrayOfByte1));
          } else {
            arrayOfDs[b1].b(arrayOfDs[b1].a());
          } 
        } 
        arrayOfDt[b].a(arrayOfDs);
        arrayOfDt[b].a((short)0);
        dataInputStream.close();
        byteArrayInputStream.close();
      } 
    } catch (IOException iOException) {
      try {
        dataInputStream.close();
        byteArrayInputStream.close();
      } catch (IOException iOException2) {
        IOException iOException1;
        (iOException1 = null).printStackTrace();
      } 
      iOException.printStackTrace();
      return null;
    } 
    return arrayOfDt;
  }
  
  public static int v() {
    byte[] arrayOfByte;
    return ((arrayOfByte = cs.a.a(118)) == null) ? go.d : m.c(arrayOfByte);
  }
  
  public static final boolean b(int paramInt) {
    if (paramInt < -2147483643)
      paramInt += 5; 
    return b.c(paramInt);
  }
  
  public static final void a(byte[] paramArrayOfbyte, String paramString) {
    byte[] arrayOfByte2;
    if (paramArrayOfbyte == null)
      return; 
    int i;
    if ((i = paramString.hashCode()) < -2147483643)
      i += 5; 
    try {
      arrayOfByte2 = i.c(paramString);
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      arrayOfByte2 = paramString.getBytes();
    } 
    byte[] arrayOfByte1 = new byte[paramArrayOfbyte.length + arrayOfByte2.length + 4];
    System.arraycopy(m.a(arrayOfByte2.length), 0, arrayOfByte1, 0, 4);
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 4, arrayOfByte2.length);
    System.arraycopy(paramArrayOfbyte, 0, arrayOfByte1, 4 + arrayOfByte2.length, paramArrayOfbyte.length);
    b.b(i, arrayOfByte1);
  }
  
  public static final byte[] c(int paramInt) {
    if (paramInt < -2147483643)
      paramInt += 5; 
    byte[] arrayOfByte = b.a(paramInt);
    b.e();
    return arrayOfByte;
  }
  
  public static final int w() {
    byte[] arrayOfByte;
    return ((arrayOfByte = cs.a.a(113)) == null) ? go.a : m.c(arrayOfByte);
  }
  
  public static final void d(int paramInt) {
    byte[] arrayOfByte = m.a(paramInt);
    cs.a.b(113, arrayOfByte);
  }
  
  public static final int x() {
    byte[] arrayOfByte;
    return ((arrayOfByte = cs.a.a(120)) == null) ? 0 : m.c(arrayOfByte);
  }
  
  public static final void e(int paramInt) {
    byte[] arrayOfByte = m.a(paramInt);
    cs.a.b(120, arrayOfByte);
  }
  
  public static final int y() {
    byte[] arrayOfByte;
    return ((arrayOfByte = cs.a.a(117)) == null) ? go.b : m.c(arrayOfByte);
  }
  
  public static final void f(int paramInt) {
    byte[] arrayOfByte = m.a(paramInt);
    cs.a.b(117, arrayOfByte);
  }
  
  public static final void z() {
    byte[] arrayOfByte = { 1 };
    cs.a.b(114, arrayOfByte);
  }
  
  public static final void A() {
    byte[] arrayOfByte = { 0, 18 };
    cs.a.b(152, arrayOfByte);
  }
  
  public static final boolean B() {
    return cs.a.c(152) ? (((arrayOfByte = cs.a.a(152))[0] == 0 && arrayOfByte[1] == 18 && arrayOfByte[2] == 0)) : false;
  }
  
  public static final void c(long paramLong) {
    byte[] arrayOfByte = m.a(paramLong);
    cs.a.b(160, arrayOfByte);
  }
  
  public static void g(int paramInt) {
    byte[] arrayOfByte = m.a(paramInt);
    cs.a.b(162, arrayOfByte);
  }
  
  public static final int C() {
    byte[] arrayOfByte;
    return (cs.a.c(162) && (arrayOfByte = cs.a.a(162)) != null) ? m.c(arrayOfByte) : -1;
  }
  
  public static final boolean d(long paramLong) {
    byte[] arrayOfByte;
    return (cs.a.c(160) && (arrayOfByte = cs.a.a(160)) != null) ? (((l = m.d(arrayOfByte)) == paramLong)) : false;
  }
  
  public static final boolean D() {
    return cs.a.c(114);
  }
  
  public static String[][] E() {
    String[][] arrayOfString = null;
    if (cs.a.c(115)) {
      byte[] arrayOfByte = cs.a.a(115);
      int i = 0;
      int j;
      arrayOfString = new String[j = m.a(arrayOfByte, 0)][2];
      i += true;
      for (byte b = 0; b < j; b++) {
        int k = m.a(arrayOfByte, i);
        i += true;
        arrayOfString[b][0] = i.a(arrayOfByte, i, k);
        i += k;
        k = m.a(arrayOfByte, i);
        i += 4;
        arrayOfString[b][1] = i.a(arrayOfByte, i, k);
        i += k;
      } 
    } 
    return arrayOfString;
  }
  
  public static String[][] a(String[][] paramArrayOfString, String paramString1, String paramString2) {
    paramString2 = (paramString2 == null) ? "" : paramString2;
    if (paramString1.length() > 15)
      paramString1 = String.valueOf(paramString1.substring(0, 12)) + "..."; 
    if (paramArrayOfString == null) {
      if ("#sq".equals(paramString2)) {
        paramArrayOfString = new String[][] { { paramString1, paramString2 }, { "#ola", "#ola" } };
      } else if ("#ola".equals(paramString2)) {
        paramArrayOfString = new String[][] { { paramString1, paramString2 }, { "#sq", "#sq" } };
      } else {
        paramArrayOfString = new String[][] { { paramString1, paramString2 }, { "#sq", "#sq" }, { "#ola", "#ola" } };
      } 
    } else {
      boolean bool = false;
      for (byte b1 = 0; b1 < paramArrayOfString.length; b1++) {
        if (paramArrayOfString[b1][1].equals(paramString2)) {
          for (int j = b1 - 1; j >= 0; j--)
            paramArrayOfString[j + 1] = paramArrayOfString[j]; 
          (new String[2])[0] = paramString1;
          (new String[2])[1] = paramString2;
          paramArrayOfString[0] = new String[2];
          bool = true;
          break;
        } 
      } 
      if (!bool) {
        String[][] arrayOfString = new String[paramArrayOfString.length + 1][2];
        for (byte b2 = 1; b2 < arrayOfString.length; b2++)
          arrayOfString[b2] = paramArrayOfString[b2 - 1]; 
        (new String[2])[0] = paramString1;
        (new String[2])[1] = paramString2;
        (paramArrayOfString = arrayOfString)[0] = new String[2];
      } 
    } 
    if (paramArrayOfString.length > 5) {
      String[][] arrayOfString = new String[paramArrayOfString.length - 1][2];
      for (byte b1 = 0; b1 < arrayOfString.length; b1++)
        arrayOfString[b1] = paramArrayOfString[b1]; 
      paramArrayOfString = arrayOfString;
    } 
    byte[] arrayOfByte = new byte[1000];
    int i = 0;
    System.arraycopy(m.a(paramArrayOfString.length), 0, arrayOfByte, 0, 4);
    i += true;
    for (byte b = 0; b < paramArrayOfString.length; b++) {
      byte[] arrayOfByte1;
      System.arraycopy(arrayOfByte1 = a(paramArrayOfString[b][0], paramArrayOfString[b][1]), 0, arrayOfByte, i, arrayOfByte1.length);
      i += arrayOfByte1.length;
    } 
    cs.a.b(115, arrayOfByte, 0, i);
    return paramArrayOfString;
  }
  
  private static byte[] a(String paramString1, String paramString2) {
    byte[] arrayOfByte;
    try {
      byte[] arrayOfByte2 = i.c(paramString1);
      byte[] arrayOfByte1;
      if ((arrayOfByte1 = i.c(paramString2)) == null)
        arrayOfByte1 = new byte[0]; 
      arrayOfByte = new byte[arrayOfByte2.length + arrayOfByte1.length + 8];
      System.arraycopy(m.a(arrayOfByte2.length), 0, arrayOfByte, 0, 4);
      System.arraycopy(arrayOfByte2, 0, arrayOfByte, 4, arrayOfByte2.length);
      int i = 4 + arrayOfByte2.length;
      System.arraycopy(m.a(arrayOfByte1.length), 0, arrayOfByte, i, 4);
      i += 4;
      System.arraycopy(arrayOfByte1, 0, arrayOfByte, i, arrayOfByte1.length);
    } catch (Throwable throwable2) {
      Throwable throwable1;
      (throwable1 = null).printStackTrace();
      return null;
    } 
    return arrayOfByte;
  }
  
  public static final int F() {
    byte[] arrayOfByte;
    return ((arrayOfByte = cs.a.a(116)) == null) ? 0 : m.c(arrayOfByte);
  }
  
  public static final void h(int paramInt) {
    byte[] arrayOfByte = m.a(paramInt);
    cs.a.b(116, arrayOfByte);
  }
  
  public static final void b(boolean paramBoolean) {
    byte[] arrayOfByte = { (byte)(paramBoolean ? 1 : 0) };
    cs.a.a(150, arrayOfByte);
    if (go.t != paramBoolean)
      go.t = !paramBoolean; 
    cs.a.a();
  }
  
  public static final int G() {
    byte[] arrayOfByte;
    return ((arrayOfByte = cs.a.a(150)) == null) ? 0 : arrayOfByte[0];
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\pd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */