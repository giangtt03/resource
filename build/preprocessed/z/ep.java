import javax.microedition.lcdui.Image;

public final class ep {
  private static byte[] d = new byte[] { -119, 80, 78, 71, 13, 10, 26, 10 };
  
  public Image a;
  
  public String b;
  
  public short c;
  
  public static ep[] a(byte[] paramArrayOfbyte) {
    int i = m.a(paramArrayOfbyte[0], paramArrayOfbyte[1]);
    ep[] arrayOfEp = null;
    if (i > 0) {
      arrayOfEp = new ep[i];
      int j = 2;
      for (byte b = 0; b < i; b++) {
        arrayOfEp[b] = new ep();
        (arrayOfEp[b]).c = m.b(paramArrayOfbyte[j++], paramArrayOfbyte[j++]);
        int k;
        if ((k = m.a(paramArrayOfbyte[j++], paramArrayOfbyte[j++], paramArrayOfbyte[j++], paramArrayOfbyte[j++])) > 0) {
          (arrayOfEp[b]).b = i.a(paramArrayOfbyte, j, k);
          j += k;
        } 
        if ((k = m.a(paramArrayOfbyte[j++], paramArrayOfbyte[j++], paramArrayOfbyte[j++], paramArrayOfbyte[j++])) > 0) {
          try {
            byte b1 = paramArrayOfbyte[j - 1];
            byte b2 = paramArrayOfbyte[j - 2];
            byte b3 = paramArrayOfbyte[j - 3];
            byte b4 = paramArrayOfbyte[j - 4];
            byte b5 = paramArrayOfbyte[j - 5];
            byte b6 = paramArrayOfbyte[j - 6];
            byte b7 = paramArrayOfbyte[j - 7];
            byte b8 = paramArrayOfbyte[j - 8];
            paramArrayOfbyte[j - 1] = d[7];
            paramArrayOfbyte[j - 2] = d[6];
            paramArrayOfbyte[j - 3] = d[5];
            paramArrayOfbyte[j - 4] = d[4];
            paramArrayOfbyte[j - 5] = d[3];
            paramArrayOfbyte[j - 6] = d[2];
            paramArrayOfbyte[j - 7] = d[1];
            paramArrayOfbyte[j - 8] = d[0];
            (arrayOfEp[b]).a = Image.createImage(paramArrayOfbyte, j - d.length, k + d.length);
            paramArrayOfbyte[j - 1] = b1;
            paramArrayOfbyte[j - 2] = b2;
            paramArrayOfbyte[j - 3] = b3;
            paramArrayOfbyte[j - 4] = b4;
            paramArrayOfbyte[j - 5] = b5;
            paramArrayOfbyte[j - 6] = b6;
            paramArrayOfbyte[j - 7] = b7;
            paramArrayOfbyte[j - 8] = b8;
          } catch (Exception exception) {}
          j += k;
        } 
      } 
    } 
    return arrayOfEp;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ep.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */