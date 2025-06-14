import java.io.IOException;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.MessageListener;

final class ch implements MessageListener {
  private static ch a;
  
  private static cm b;
  
  private cg c;
  
  private static MessageConnection d;
  
  protected ch() {
    ci ci = ci.a();
    ch ch1;
    (ch1 = this).c = ci;
  }
  
  private static ch a() {
    if (a == null)
      a = new ch(); 
    return a;
  }
  
  public static void a(MessageConnection paramMessageConnection) {
    MessageConnection messageConnection = paramMessageConnection;
    ch ch1 = a();
    d = messageConnection;
    try {
      d.setMessageListener(ch1);
      return;
    } catch (IOException iOException) {
      (ch1 = null).printStackTrace();
      return;
    } 
  }
  
  public final void notifyIncomingMessage(MessageConnection paramMessageConnection) {
    cm cm1 = b = new cm(this.c, paramMessageConnection);
    Thread thread;
    (thread = new Thread(cm1)).start();
  }
  
  public static void a(String paramString1, String paramString2, be parambe) {
    a();
    parambe = parambe;
    paramString2 = paramString2;
    paramString1 = paramString1;
    cn.a().a(new cf(paramString1, paramString2, parambe));
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ch.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */