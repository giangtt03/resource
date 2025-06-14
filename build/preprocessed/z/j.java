public class j {
  public int a;
  
  public int b;
  
  public int c;
  
  public int d;
  
  public j(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramInt4;
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
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\j.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */