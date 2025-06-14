import javax.microedition.lcdui.TextField;

public final class es extends TextField implements eq {
  public es(String paramString1, String paramString2, int paramInt1, int paramInt2) {
    super(paramString1, paramString2, 20, paramInt2);
  }
  
  public final String a() {
    String str;
    if ((str = getString()) != null && str.length() >= 0) {
      if ((str = str.trim()).indexOf(" ") > 0)
        str = "\"" + str + "\""; 
      return str;
    } 
    return null;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\es.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */