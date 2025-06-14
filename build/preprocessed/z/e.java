public final class e {
  private static int a = 0;
  
  private static int[] b;
  
  static {
    int[] arrayOfInt = new int[256];
    for (byte b = 0; b < 'Ā'; b++) {
      int i = b;
      byte b1 = 8;
      while (--b1 >= 0) {
        if ((i & 0x1) != 0) {
          i = 0xEDB88320 ^ i >>> 1;
          continue;
        } 
        i >>>= 1;
      } 
      arrayOfInt[b] = i;
    } 
    b = arrayOfInt;
  }
  
  private static long b() {
    return a & 0xFFFFFFFFL;
  }
  
  public static void a() {
    a = 0;
  }
  
  public static long a(byte[] paramArrayOfbyte) {
    int i = paramArrayOfbyte.length;
    byte b = 0;
    paramArrayOfbyte = paramArrayOfbyte;
    for (int j = a ^ 0xFFFFFFFF; --i >= 0; j = b[(j ^ paramArrayOfbyte[b++]) & 0xFF] ^ j >>> 8);
    a = j ^ 0xFFFFFFFF;
    b();
    return b();
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\e.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */