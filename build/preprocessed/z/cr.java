import java.io.UnsupportedEncodingException;

public final class cr {
  private static byte a = 0;
  
  private static byte b;
  
  private static boolean c = true;
  
  private static long d = 0L;
  
  private static boolean e = false;
  
  public static void a() {
    e = true;
  }
  
  public static void b() {
    switch (v.L) {
      case 0:
      case 1:
      case 2:
      case 3:
      case 6:
      case 7:
        c = false;
        break;
      default:
        c = false;
        break;
    } 
    if (!c)
      return; 
    j();
  }
  
  private static final void j() {
    if (!cs.a()) {
      if (v.Y > 5) {
        a = 2;
        return;
      } 
      l();
      k();
      return;
    } 
    byte[] arrayOfByte1 = cs.b();
    byte[] arrayOfByte2;
    (arrayOfByte2 = new byte[3])[0] = arrayOfByte1[10];
    arrayOfByte2[1] = arrayOfByte1[11];
    arrayOfByte2[2] = arrayOfByte1[12];
    arrayOfByte1[10] = 0;
    arrayOfByte1[11] = 0;
    arrayOfByte1[12] = 0;
    byte[] arrayOfByte3 = cx.a(arrayOfByte1);
    if (arrayOfByte2[0] != arrayOfByte3[arrayOfByte3.length - 3] || arrayOfByte2[1] != arrayOfByte3[arrayOfByte3.length - 2] || arrayOfByte2[2] != arrayOfByte3[arrayOfByte3.length - 1]) {
      a = 2;
      return;
    } 
    a = arrayOfByte1[0];
    b = arrayOfByte1[1];
    (arrayOfByte2 = new byte[8])[0] = arrayOfByte1[2];
    arrayOfByte2[1] = arrayOfByte1[3];
    arrayOfByte2[2] = arrayOfByte1[4];
    arrayOfByte2[3] = arrayOfByte1[5];
    arrayOfByte2[4] = arrayOfByte1[6];
    arrayOfByte2[5] = arrayOfByte1[7];
    arrayOfByte2[6] = arrayOfByte1[8];
    arrayOfByte2[7] = arrayOfByte1[9];
    d = m.d(arrayOfByte2);
  }
  
  private static final void k() {
    byte[] arrayOfByte1;
    (arrayOfByte1 = new byte[13])[0] = a;
    arrayOfByte1[1] = b;
    byte[] arrayOfByte2 = m.a(d);
    arrayOfByte1[2] = arrayOfByte2[0];
    arrayOfByte1[3] = arrayOfByte2[1];
    arrayOfByte1[4] = arrayOfByte2[2];
    arrayOfByte1[5] = arrayOfByte2[3];
    arrayOfByte1[6] = arrayOfByte2[4];
    arrayOfByte1[7] = arrayOfByte2[5];
    arrayOfByte1[8] = arrayOfByte2[6];
    arrayOfByte1[9] = arrayOfByte2[7];
    arrayOfByte1[10] = 0;
    arrayOfByte1[11] = 0;
    arrayOfByte1[12] = 0;
    arrayOfByte2 = cx.a(arrayOfByte1);
    arrayOfByte1[10] = arrayOfByte2[arrayOfByte2.length - 3];
    arrayOfByte1[11] = arrayOfByte2[arrayOfByte2.length - 2];
    arrayOfByte1[12] = arrayOfByte2[arrayOfByte2.length - 1];
    cs.a(arrayOfByte1);
  }
  
  public static final boolean c() {
    j();
    return (a == 2);
  }
  
  public static final boolean d() {
    return (a == 1);
  }
  
  public static final void e() {
    a = 2;
    b = 6;
    k();
  }
  
  private static void l() {
    a = 0;
    b = 0;
    d = 0L;
  }
  
  public static final void f() {
    if (e) {
      e = false;
      return;
    } 
    if (!c)
      return; 
    if (a == 1)
      return; 
    j();
    if (d == 0L)
      d = System.currentTimeMillis(); 
    long l;
    if ((l = System.currentTimeMillis()) - d >= 300000L || b >= 5) {
      a = 1;
    } else {
      b = (byte)(b + 1);
    } 
    k();
  }
  
  public static final void g() {
    if (!c)
      return; 
    l();
    k();
  }
  
  public static final void h() {
    String str = i.a("Kích thước màn hình của bạn: %d:%d, không phù hợp với yêu cầu của game (%d:%d)", "%d", new String[] { (new StringBuffer(String.valueOf(v.t))).toString(), (new StringBuffer(String.valueOf(v.u))).toString(), (new StringBuffer(String.valueOf(v.r))).toString(), (new StringBuffer(String.valueOf(v.s))).toString() });
    al al;
    (al = ag.b().a("Chú ý", str, "Đóng", 4, 1)).a(ag.b());
    ag.b().a(al);
  }
  
  public static final void i() {
    String str = "Thiết bị không phù hợp để chơi game! Xin cảm ơn.";
    al al;
    (al = ag.b().a("Chú ý", str, "Đóng", 4, "Hỗ trợ", 8, 1)).a(ag.b());
    ag.b().a(al);
  }
  
  public static final boolean a(boolean paramBoolean) {
    try {
      byte[] arrayOfByte = cx.a(v.d());
      return cx.a(v.m, arrayOfByte);
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      return true;
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\cr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */