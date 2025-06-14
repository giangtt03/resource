import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

public final class dg {
  public int a;
  
  public String b;
  
  public int[] c;
  
  private dg(int paramInt, int[] paramArrayOfint) {
    this.a = paramInt;
    this.c = paramArrayOfint;
  }
  
  public dg(int paramInt, byte[] paramArrayOfbyte) {
    this(paramInt, a(paramArrayOfbyte));
  }
  
  private static int[] a(byte[] paramArrayOfbyte) {
    try {
      int[] arrayOfInt = new int[paramArrayOfbyte.length / 4];
      DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(paramArrayOfbyte));
      for (byte b = 0; b < arrayOfInt.length; b++)
        arrayOfInt[b] = dataInputStream.readInt(); 
      dataInputStream.close();
      return arrayOfInt;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return null;
    } 
  }
  
  public final dg a() {
    int[] arrayOfInt = new int[this.c.length];
    System.arraycopy(this.c, 0, arrayOfInt, 0, this.c.length);
    dg dg1;
    (dg1 = new dg(this.a, arrayOfInt)).b = this.b;
    return dg1;
  }
  
  public final String toString() {
    return this.b;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof dg) {
      int[] arrayOfInt = this.c;
      if ((paramObject = ((dg)(paramObject = paramObject)).c) == null || arrayOfInt == null)
        return (paramObject == arrayOfInt); 
      if (paramObject.length != arrayOfInt.length)
        return false; 
      for (byte b = 0; b < paramObject.length; b++) {
        if (paramObject[b] != arrayOfInt[b])
          return false; 
      } 
      return true;
    } 
    return false;
  }
  
  public final int hashCode() {
    int[] arrayOfInt;
    if ((arrayOfInt = this.c) == null)
      return 0; 
    int i = 1;
    for (byte b = 0; b < arrayOfInt.length; b++)
      i = i * 31 + arrayOfInt[b]; 
    return i;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\dg.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */