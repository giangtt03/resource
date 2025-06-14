import java.io.UnsupportedEncodingException;

public final class jn {
  public String a;
  
  public String b;
  
  public int c;
  
  public int d;
  
  public int e;
  
  public int f;
  
  public int g;
  
  public byte[] h;
  
  public byte[] i;
  
  public byte[] j;
  
  public int k;
  
  public jm[] l;
  
  public int[] m;
  
  public int n;
  
  public final byte[] a() {
    byte[] arrayOfByte = null;
    try {
      byte[] arrayOfByte1 = i.c(this.a);
      int i = 32 + arrayOfByte1.length + 4;
      byte[] arrayOfByte2 = i.c(this.b);
      i = (i += arrayOfByte2.length + 4) + this.h.length + 4 + this.i.length + 4 + this.j.length + 4;
      byte[] arrayOfByte3 = new byte[this.m.length << 2];
      int j = 0;
      for (byte b1 = 0; b1 < this.m.length; b1++) {
        System.arraycopy(m.a(this.m[b1]), 0, arrayOfByte3, j, 4);
        j += true;
      } 
      i += arrayOfByte3.length;
      i += 4;
      byte[][] arrayOfByte4 = new byte[this.l.length][];
      int k = 0;
      byte b2;
      for (b2 = 0; b2 < arrayOfByte4.length; b2++) {
        arrayOfByte4[b2] = this.l[b2].a();
        i += (arrayOfByte4[b2]).length + 4;
        k += (arrayOfByte4[b2]).length + 4;
      } 
      i += 4;
      arrayOfByte = new byte[i];
      System.arraycopy(m.a(this.f), 0, arrayOfByte, 0, 4);
      System.arraycopy(m.a(this.e), 0, arrayOfByte, 4, 4);
      System.arraycopy(m.a(this.g), 0, arrayOfByte, 8, 4);
      System.arraycopy(m.a(this.c), 0, arrayOfByte, 12, 4);
      System.arraycopy(m.a(this.d), 0, arrayOfByte, 16, 4);
      System.arraycopy(m.a(this.k), 0, arrayOfByte, 20, 4);
      System.arraycopy(m.a(arrayOfByte1.length), 0, arrayOfByte, 24, 4);
      System.arraycopy(arrayOfByte1, 0, arrayOfByte, 28, arrayOfByte1.length);
      j = 28 + arrayOfByte1.length;
      System.arraycopy(m.a(arrayOfByte2.length), 0, arrayOfByte, j, 4);
      j += 4;
      System.arraycopy(arrayOfByte2, 0, arrayOfByte, j, arrayOfByte2.length);
      j += arrayOfByte2.length;
      System.arraycopy(m.a(this.h.length), 0, arrayOfByte, j, 4);
      j += 4;
      System.arraycopy(this.h, 0, arrayOfByte, j, this.h.length);
      j += this.h.length;
      System.arraycopy(m.a(this.i.length), 0, arrayOfByte, j, 4);
      j += 4;
      System.arraycopy(this.i, 0, arrayOfByte, j, this.i.length);
      j += this.i.length;
      System.arraycopy(m.a(this.j.length), 0, arrayOfByte, j, 4);
      j += 4;
      System.arraycopy(this.j, 0, arrayOfByte, j, this.j.length);
      j += this.j.length;
      System.arraycopy(m.a(arrayOfByte3.length), 0, arrayOfByte, j, 4);
      j += 4;
      System.arraycopy(arrayOfByte3, 0, arrayOfByte, j, arrayOfByte3.length);
      j += arrayOfByte3.length;
      System.arraycopy(m.a(k), 0, arrayOfByte, j, 4);
      j += 4;
      for (b2 = 0; b2 < arrayOfByte4.length; b2++) {
        System.arraycopy(m.a((arrayOfByte4[b2]).length), 0, arrayOfByte, j, 4);
        j += 4;
        System.arraycopy(arrayOfByte4[b2], 0, arrayOfByte, j, (arrayOfByte4[b2]).length);
        j += (arrayOfByte4[b2]).length;
      } 
    } catch (UnsupportedEncodingException unsupportedEncodingException2) {
      UnsupportedEncodingException unsupportedEncodingException1;
      (unsupportedEncodingException1 = null).printStackTrace();
    } 
    return arrayOfByte;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\jn.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */