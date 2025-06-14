import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Image;

public final class er extends ChoiceGroup implements eq {
  private String[] a;
  
  private int b;
  
  public er(String paramString, int paramInt, String[] paramArrayOfString1, Image[] paramArrayOfImage, String[] paramArrayOfString2) {
    super(paramString, paramInt, paramArrayOfString1, null);
    this.b = paramInt;
    this.a = paramArrayOfString2;
  }
  
  public final String a() {
    String str = "";
    er er1;
    if ((er1 = this).b == 2) {
      boolean[] arrayOfBoolean = new boolean[size()];
      getSelectedFlags(arrayOfBoolean);
      try {
        for (byte b = 0; b < arrayOfBoolean.length; b++) {
          if (arrayOfBoolean[b])
            if (str.length() > 0) {
              str = String.valueOf(str) + " " + this.a[b];
            } else {
              str = this.a[b];
            }  
        } 
      } catch (Throwable throwable) {}
    } else {
      try {
        str = this.a[getSelectedIndex()];
      } catch (Throwable throwable) {}
    } 
    if (str != null && str.length() >= 0) {
      if ((str = str.trim()).indexOf(" ") > 0)
        str = "\"" + str + "\""; 
      return str;
    } 
    return null;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\er.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */