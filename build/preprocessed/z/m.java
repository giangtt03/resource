public final class m {
  static {
  
  }
  
  public static int a(byte paramByte) {
    return paramByte & 0xFF;
  }
  
  public static int a(byte[] paramArrayOfbyte) {
    return (paramArrayOfbyte.length < 2) ? 0 : a(paramArrayOfbyte[0], paramArrayOfbyte[1]);
  }
  
  public static int a(byte paramByte1, byte paramByte2) {
    return ((paramByte1 & 0xFF) << 8) + (paramByte2 & 0xFF);
  }
  
  public static int b(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte.length < 3)
      return 0; 
    byte b3 = paramArrayOfbyte[2];
    byte b2 = paramArrayOfbyte[1];
    byte b1;
    return (((b1 = paramArrayOfbyte[0]) & 0xFF) << 16) + ((b2 & 0xFF) << 8) + (b3 & 0xFF);
  }
  
  public static int c(byte[] paramArrayOfbyte) {
    return (paramArrayOfbyte.length < 4) ? 0 : a(paramArrayOfbyte[0], paramArrayOfbyte[1], paramArrayOfbyte[2], paramArrayOfbyte[3]);
  }
  
  public static int a(byte[] paramArrayOfbyte, int paramInt) {
    return a(paramArrayOfbyte[paramInt], paramArrayOfbyte[paramInt + 1], paramArrayOfbyte[paramInt + 2], paramArrayOfbyte[paramInt + 3]);
  }
  
  public static int a(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4) {
    return ((paramByte1 & 0xFF) << 24) + ((paramByte2 & 0xFF) << 16) + ((paramByte3 & 0xFF) << 8) + (paramByte4 & 0xFF);
  }
  
  public static short b(byte paramByte1, byte paramByte2) {
    return (short)(((paramByte1 & 0xFF) << 8) + (paramByte2 & 0xFF));
  }
  
  public static byte[] a(short paramShort) {
    return new byte[] { (byte)(paramShort >>> 8), (byte)paramShort };
  }
  
  public static byte[] a(int paramInt) {
    return new byte[] { (byte)(paramInt >>> 24), (byte)(paramInt >>> 16), (byte)(paramInt >>> 8), (byte)paramInt };
  }
  
  public static byte[] a(long paramLong) {
    return new byte[] { (byte)(int)(paramLong >>> 56L), (byte)(int)(paramLong >>> 48L), (byte)(int)(paramLong >>> 40L), (byte)(int)(paramLong >>> 32L), (byte)(int)(paramLong >>> 24L), (byte)(int)(paramLong >>> 16L), (byte)(int)(paramLong >>> 8L), (byte)(int)paramLong };
  }
  
  public static long b(byte[] paramArrayOfbyte, int paramInt) {
    int i;
    if ((i = paramArrayOfbyte.length - paramInt) < 8) {
      long l = 0L;
      i = 56;
      int j;
      for (j = paramInt; j < paramArrayOfbyte.length; j++) {
        l += (paramArrayOfbyte[j] & 0xFFL) << i;
        i -= 8;
      } 
      for (j -= paramInt; j < 8; j++) {
        l += (0 << i);
        i -= 8;
      } 
      return l;
    } 
    if (i > 8) {
      long l = 0L;
      i = 56;
      int j = paramInt;
      paramInt += 8;
      while (j < paramInt) {
        l += (paramArrayOfbyte[j] & 0xFFL) << i;
        i -= 8;
        j++;
      } 
      return l;
    } 
    byte b6 = paramArrayOfbyte[paramInt + 7];
    byte b5 = paramArrayOfbyte[paramInt + 6];
    byte b4 = paramArrayOfbyte[paramInt + 5];
    byte b3 = paramArrayOfbyte[paramInt + 4];
    byte b2 = paramArrayOfbyte[paramInt + 3];
    i = paramArrayOfbyte[paramInt + 2];
    paramInt = paramArrayOfbyte[paramInt + 1];
    byte b1;
    return ((b1 = paramArrayOfbyte[paramInt]) << 56L) + ((paramInt & 0xFF) << 48L) + ((i & 0xFF) << 40L) + ((b2 & 0xFF) << 32L) + ((b3 & 0xFF) << 24L) + ((b4 & 0xFF) << 16) + ((b5 & 0xFF) << 8) + (b6 & 0xFF);
  }
  
  public static long d(byte[] paramArrayOfbyte) {
    return b(paramArrayOfbyte, 0);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\m.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */