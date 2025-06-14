import java.io.InputStream;

final class ed {
  private InputStream a;
  
  private dv b;
  
  public ed(InputStream paramInputStream) {
    this.a = paramInputStream;
  }
  
  public final dy a() {
    dy dy = new dy();
    byte[] arrayOfByte = new byte[7];
    int j;
    if ((j = a(arrayOfByte)) <= 0)
      return null; 
    j = j;
    int k = m.a(arrayOfByte[0], arrayOfByte[1]);
    int m = m.a(arrayOfByte[2], arrayOfByte[3], arrayOfByte[4], arrayOfByte[5]);
    dy.a = m;
    int i = m.a(arrayOfByte[6]);
    dy.b = i;
    if (m > 0) {
      dx[] arrayOfDx = new dx[k];
      for (k = 0; k < arrayOfDx.length; k++) {
        byte[] arrayOfByte2 = new byte[5];
        if (a(arrayOfByte2) < 0)
          return null; 
        short s = (short)m.a(arrayOfByte2[0]);
        int n;
        byte[] arrayOfByte1 = new byte[n = m.a(arrayOfByte2[1], arrayOfByte2[2], arrayOfByte2[3], arrayOfByte2[4])];
        if (a(arrayOfByte1) < 0)
          return null; 
        arrayOfDx[k] = new dx();
        (arrayOfDx[k]).a = s;
        (arrayOfDx[k]).b = arrayOfByte1;
      } 
      dy.c = arrayOfDx;
    } 
    j += m;
    if (this.b != null)
      this.b.a(j); 
    return dy;
  }
  
  private int a(byte[] paramArrayOfbyte) {
    for (int i = 0; i < paramArrayOfbyte.length; i += j) {
      int j;
      if ((j = this.a.read(paramArrayOfbyte, i, paramArrayOfbyte.length - i)) < 0)
        return -1; 
    } 
    return i;
  }
  
  public final void b() {
    try {
      this.a.close();
      return;
    } catch (Throwable throwable) {
      return;
    } 
  }
  
  public final void a(dv paramdv) {
    this.b = paramdv;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ed.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */