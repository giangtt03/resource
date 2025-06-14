import java.io.ByteArrayOutputStream;

public final class kx {
  private ByteArrayOutputStream a = new ByteArrayOutputStream();
  
  public final void a(short paramShort, byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte == null)
      return; 
    this.a.write((byte)paramShort);
    paramArrayOfbyte = paramArrayOfbyte;
    kx kx1 = this;
    try {
      byte[] arrayOfByte = m.a(paramArrayOfbyte.length);
      kx1.a.write(arrayOfByte, 0, 4);
      kx1.a.write(paramArrayOfbyte, 0, paramArrayOfbyte.length);
      return;
    } catch (Throwable throwable2) {
      Throwable throwable1;
      (throwable1 = null).printStackTrace();
      return;
    } 
  }
  
  public final void a(short paramShort, String paramString) {
    if (paramString == null)
      return; 
    this.a.write((byte)paramShort);
    paramString = paramString;
    kx kx1 = this;
    try {
      byte[] arrayOfByte1;
      if ((arrayOfByte1 = paramString.getBytes("UTF-8")) == null || arrayOfByte1.length == 0)
        arrayOfByte1 = paramString.getBytes(); 
      byte[] arrayOfByte2 = m.a(arrayOfByte1.length);
      kx1.a.write(arrayOfByte2, 0, 4);
      kx1.a.write(arrayOfByte1, 0, arrayOfByte1.length);
      return;
    } catch (Throwable throwable) {
      byte[] arrayOfByte2;
      byte[] arrayOfByte1 = m.a((arrayOfByte2 = paramString.getBytes()).length);
      try {
        kx1.a.write(arrayOfByte1, 0, 4);
        kx1.a.write(arrayOfByte2, 0, arrayOfByte2.length);
        return;
      } catch (Throwable throwable1) {
        (kx1 = null).printStackTrace();
        return;
      } 
    } 
  }
  
  public final void a(short paramShort, byte paramByte) {
    a(paramShort, new byte[] { paramByte });
  }
  
  public final void a(short paramShort, int paramInt) {
    a(paramShort, new byte[] { (byte)paramInt });
  }
  
  public final void b(short paramShort, int paramInt) {
    a(paramShort, m.a(paramInt));
  }
  
  public final void a(short paramShort, long paramLong) {
    a(paramShort, m.a(paramLong));
  }
  
  public final byte[] a() {
    return this.a.toByteArray();
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\kx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */