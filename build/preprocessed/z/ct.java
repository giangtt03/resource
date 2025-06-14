import java.util.Date;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;

public final class ct extends Form implements CommandListener {
  private static ct a;
  
  private static boolean b = true;
  
  private int c;
  
  private int d;
  
  private final long e;
  
  public static void a(boolean paramBoolean, int paramInt) {
    b = false;
  }
  
  public static boolean a() {
    return b;
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (!paramCommand.getLabel().equals("Back") && paramCommand.getLabel().equals("Clear")) {
      ct ct1;
      (ct1 = this).deleteAll();
      ct1.d = 0;
      ct1.append("Start at " + (new Date(System.currentTimeMillis())).toString());
    } 
  }
  
  public static boolean b() {
    return (a != null) ? (((a.c & 0x1) == 1)) : false;
  }
  
  public static void a(String paramString) {
    String str = paramString;
    ct ct1;
    if (a != null && ((ct1 = a).c & 0x1) == 1) {
      if (ct1.d >= 30)
        ct1.delete(0); 
      ct1.append("[" + str + "]");
      System.out.println(str);
      ct1.d++;
    } 
  }
  
  public static void a(Throwable paramThrowable) {
    Throwable throwable = paramThrowable;
    ct ct1;
    if (a != null && ((ct1 = a).c & 0x2) == 2) {
      if (ct1.d >= 30)
        ct1.delete(0); 
      throwable.printStackTrace();
      ct1.append(throwable.toString());
      ct1.d++;
    } 
  }
  
  public static boolean c() {
    return (a != null) ? (((a.c & 0x4) == 4)) : false;
  }
  
  public static void b(String paramString) {
    String str = paramString;
    ct ct1;
    if (a != null && ((ct1 = a).c & 0x4) == 4) {
      if (ct1.d >= 30)
        ct1.delete(0); 
      System.gc();
      Runtime runtime;
      long l = ((runtime = Runtime.getRuntime()).totalMemory() - runtime.freeMemory()) / 1024L;
      str = "[MEM] " + str + " " + l + "K/" + ct1.e + "K";
      ct1.append(str);
      System.out.println(str);
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ct.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */