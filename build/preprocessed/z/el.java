import java.io.ByteArrayOutputStream;

public final class el {
  private ByteArrayOutputStream a = new ByteArrayOutputStream();
  
  public final void a(short paramShort, byte[] paramArrayOfbyte) {
    this.a.write((byte)paramShort);
    paramArrayOfbyte = paramArrayOfbyte;
    el el1 = this;
    try {
      byte[] arrayOfByte = m.a(paramArrayOfbyte.length);
      el1.a.write(arrayOfByte, 0, 4);
      el1.a.write(paramArrayOfbyte, 0, paramArrayOfbyte.length);
      return;
    } catch (Throwable throwable) {
      return;
    } 
  }
  
  public final void a(short paramShort, String paramString) {
    this.a.write((byte)paramShort);
    paramString = paramString;
    el el1 = this;
    try {
      byte[] arrayOfByte1;
      if ((arrayOfByte1 = paramString.getBytes("UTF-8")) == null || arrayOfByte1.length == 0)
        arrayOfByte1 = paramString.getBytes(); 
      byte[] arrayOfByte2 = m.a(arrayOfByte1.length);
      el1.a.write(arrayOfByte2, 0, 4);
      el1.a.write(arrayOfByte1, 0, arrayOfByte1.length);
      return;
    } catch (Throwable throwable) {
      byte[] arrayOfByte2;
      byte[] arrayOfByte1 = m.a((arrayOfByte2 = paramString.getBytes()).length);
      try {
        el1.a.write(arrayOfByte1, 0, 4);
        el1.a.write(arrayOfByte2, 0, arrayOfByte2.length);
        return;
      } catch (Throwable throwable1) {
        return;
      } 
    } 
  }
  
  public final void a(short paramShort, long paramLong) {
    a(paramShort, m.a(paramLong));
  }
  
  public final void a(short paramShort, int paramInt) {
    a(paramShort, m.a(paramInt));
  }
  
  public final void a(short paramShort1, short paramShort2) {
    a(paramShort1, m.a(paramShort2));
  }
  
  public final void a(short paramShort, byte paramByte) {
    a(paramShort, new byte[] { paramByte });
  }
  
  public final byte[] a() {
    return this.a.toByteArray();
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\el.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */