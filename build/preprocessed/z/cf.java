import com.mg.smsgame.MGMIDlet;
import java.io.UnsupportedEncodingException;

final class cf {
  String a;
  
  String b;
  
  be c;
  
  cf(String paramString1, String paramString2, be parambe) {
    MGMIDlet mGMIDlet;
    this.b = paramString1;
    if (paramString1 != null)
      this.b = paramString1.replace('_', '-'); 
    this.c = parambe;
    paramString2 = paramString2;
    cf cf1 = this;
    if ((paramString2 = paramString2.trim()).length() == 1) {
      int i = Integer.parseInt(paramString2.trim());
      try {
        byte[] arrayOfByte1;
        byte[] arrayOfByte2 = new byte[(arrayOfByte1 = cx.a(paramString2 = "8" + paramString2 + '\037')).length];
        System.arraycopy(v.h[i], 0, arrayOfByte2, 0, 4);
        System.arraycopy(v.i[i], 0, arrayOfByte2, 8, 4);
        System.arraycopy(v.j[i], 0, arrayOfByte2, 4, 4);
        System.arraycopy(v.k[i], 0, arrayOfByte2, 12, 4);
        if (!cx.a(arrayOfByte1, arrayOfByte2)) {
          cr.e();
          (mGMIDlet = MGMIDlet.d()).notifyDestroyed();
          return;
        } 
        cf1.a = (String)mGMIDlet;
        return;
      } catch (UnsupportedEncodingException unsupportedEncodingException) {
        cf1.a = "8731";
        return;
      } 
    } 
    cf1.a = (String)mGMIDlet;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\cf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */