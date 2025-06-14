import java.io.InputStream;
import javax.microedition.lcdui.Image;

public final class f {
  private static boolean a = false;
  
  private static String b = ".mg";
  
  private static final byte[] c = new byte[] { -119, 80, 78, 71 };
  
  public static Image a(String paramString) {
    paramString = String.valueOf(paramString) + b;
    try {
      InputStream inputStream = "".getClass().getResourceAsStream(paramString);
      byte[] arrayOfByte1 = new byte[4];
      inputStream.read(arrayOfByte1, 0, 4);
      int i;
      byte[] arrayOfByte2 = new byte[i = m.c(arrayOfByte1)];
      g.a(inputStream, arrayOfByte2, 4);
      inputStream.close();
      for (byte b = 0; b < 4; b++)
        arrayOfByte2[b] = c[b]; 
      return a(arrayOfByte2, 0, i);
    } catch (Exception exception) {
      System.out.println("[ERROR] Create image: " + paramString);
      exception.printStackTrace();
      return null;
    } 
  }
  
  public static byte[] b(String paramString) {
    return c(paramString);
  }
  
  public static byte[] c(String paramString) {
    return a(paramString = String.valueOf(paramString) + b, true);
  }
  
  private static byte[] a(String paramString, boolean paramBoolean) {
    byte b = 0;
    byte[] arrayOfByte = null;
    try {
      InputStream inputStream = "".getClass().getResourceAsStream(paramString);
      if (paramBoolean) {
        byte[] arrayOfByte1 = new byte[4];
        inputStream.read(arrayOfByte1, 0, 4);
        int i;
        arrayOfByte = new byte[i = m.c(arrayOfByte1)];
        for (i = 0; i < 4; i++)
          arrayOfByte[i] = c[i]; 
        b = 4;
      } else {
        arrayOfByte = new byte[inputStream.available()];
      } 
      g.a(inputStream, arrayOfByte, b);
      inputStream.close();
    } catch (Exception exception) {
      (paramString = null).printStackTrace();
    } 
    return arrayOfByte;
  }
  
  public static Image a(byte[] paramArrayOfbyte) {
    return (paramArrayOfbyte == null) ? null : a(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public static Image a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (paramArrayOfbyte == null)
      return null; 
    try {
      return Image.createImage(paramArrayOfbyte, paramInt1, paramInt2);
    } catch (Throwable throwable) {
      (paramArrayOfbyte = null).printStackTrace();
      return null;
    } 
  }
  
  public static Image d(String paramString) {
    return a(paramString);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\f.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */