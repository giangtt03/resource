import java.io.IOException;
import javax.wireless.messaging.BinaryMessage;
import javax.wireless.messaging.Message;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

final class cm implements Runnable {
  private Message a;
  
  private MessageConnection b;
  
  private String c;
  
  private String d = "";
  
  private cg e;
  
  cm(cg paramcg, MessageConnection paramMessageConnection) {
    this.b = paramMessageConnection;
    this.e = paramcg;
  }
  
  public final void run() {
    while (!v.ae) {
      try {
        Thread.sleep(100L);
      } catch (Exception exception) {}
    } 
    cm cm1 = this;
    try {
      cm1.a = cm1.b.receive();
      if (cm1.a != null) {
        cm1.c = cm1.a.getAddress();
        if (cm1.a instanceof TextMessage) {
          cm1.d = ((TextMessage)cm1.a).getPayloadText();
          if (cm1.e != null) {
            cm1.e.a(cm1.d);
            return;
          } 
        } else {
          byte[] arrayOfByte = ((BinaryMessage)cm1.a).getPayloadData();
          cm1.d = new String(arrayOfByte);
          if (cm1.e != null) {
            cm1.e.a(cm1.d);
            return;
          } 
        } 
      } 
    } catch (IOException iOException) {}
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\cm.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */