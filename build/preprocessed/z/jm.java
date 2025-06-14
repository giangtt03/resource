import java.io.UnsupportedEncodingException;

public final class jm {
  public int a;
  
  public String b;
  
  public int c;
  
  public int d;
  
  public int e;
  
  public int f;
  
  public int g;
  
  public boolean h;
  
  public int i;
  
  public final byte[] a() {
    byte[] arrayOfByte = null;
    try {
      byte[] arrayOfByte1 = i.c(this.b);
      int i;
      arrayOfByte = new byte[i = 12 + arrayOfByte1.length + 16];
      System.arraycopy(m.a(this.a), 0, arrayOfByte, 0, 4);
      System.arraycopy(m.a(this.c), 0, arrayOfByte, 4, 4);
      System.arraycopy(m.a(this.d), 0, arrayOfByte, 8, 4);
      System.arraycopy(m.a(this.e), 0, arrayOfByte, 12, 4);
      System.arraycopy(m.a(this.f), 0, arrayOfByte, 16, 4);
      System.arraycopy(m.a(this.g), 0, arrayOfByte, 20, 4);
      System.arraycopy(m.a(arrayOfByte1.length), 0, arrayOfByte, 24, 4);
      System.arraycopy(arrayOfByte1, 0, arrayOfByte, 28, arrayOfByte1.length);
    } catch (UnsupportedEncodingException unsupportedEncodingException2) {
      UnsupportedEncodingException unsupportedEncodingException1;
      (unsupportedEncodingException1 = null).printStackTrace();
    } 
    return arrayOfByte;
  }
  
  public final String toString() {
    String str;
    return str = " x = " + this.d + " y= " + this.e + "       w = " + this.f + " h = " + this.g + "        " + this.b + "   type = " + this.a;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\jm.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */