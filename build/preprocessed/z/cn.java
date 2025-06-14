import java.io.IOException;
import javax.microedition.io.Connector;
import javax.wireless.messaging.Message;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

final class cn implements bf, Runnable {
  private cf a;
  
  private cf b;
  
  private static cn c;
  
  private static boolean d;
  
  private boolean e;
  
  private Object f = new Object();
  
  private boolean g = false;
  
  public static cn a() {
    if (c == null)
      c = new cn(); 
    ag.g();
    return c;
  }
  
  protected cn() {
    Thread thread;
    (thread = new Thread(this)).start();
  }
  
  public final void run() {
    this.e = false;
    while (true) {
      while (this.a == null) {
        try {
          synchronized (this.f) {
            this.f.wait();
          } 
        } catch (Throwable throwable2) {
          Throwable throwable1;
          (throwable1 = null).printStackTrace();
        } 
      } 
      if (cr.d() && this.g) {
        this.a = null;
        v.Z = false;
        al al1;
        (al1 = ag.b().a("Chú ý", "Mạng đang bị nghẽn, vui lòng thử lại sau.", "Đóng", 2, 1)).a(ag.b());
        ag.b().a(al1, false);
        ag.b().e(-10010);
        continue;
      } 
      v.Z = true;
      al al;
      (al = ag.b().a("Chú ý", "Đang gửi tin nhắn SMS", false)).b(-10001);
      ag.b().a(al, false);
      ag.b().e(-10010);
      null = "sms://" + this.a.a;
      ct.a("[SMS:" + this.a.a + "]" + this.a.b);
      MessageConnection messageConnection = null;
      try {
        TextMessage textMessage;
        (textMessage = (TextMessage)(messageConnection = (MessageConnection)Connector.open(null)).newMessage("text")).setAddress(null);
        textMessage.setPayloadText(this.a.b);
        messageConnection.send((Message)textMessage);
        cr.f();
        if (cr.d()) {
          this.g = true;
          this.a = null;
          ag.b().a(-10001, false);
          al al1;
          (al1 = ag.b().a("Chú ý", "Đã gửi tin thành công, đang chờ phản hồi từ hệ thống", "Ẩn", 3, 1)).a(this);
          al1.b(-10004);
          ag.b().a(al1, false);
          d = true;
        } else {
          ag.b().a(-10001, false);
          if (this.a.c != null)
            this.a.c.a(); 
          this.a = null;
        } 
      } catch (Throwable throwable2) {
        Throwable throwable1;
        (throwable1 = null).printStackTrace();
        this.b = this.a;
        this.a = null;
        ag.b().a(-10001, false);
        al al1;
        (al1 = ag.b().a("Chú ý", "Không thể gửi tin SMS. Bạn có muốn gửi lại không?", "Có", 1, "Không", 2, 1)).a(this);
        al1.b(-10002);
        ag.b().a(al1);
        continue;
      } finally {
        if (messageConnection != null)
          try {
            messageConnection.close();
          } catch (IOException iOException) {
            (messageConnection = null).printStackTrace();
          }  
      } 
    } 
  }
  
  final void a(cf paramcf) {
    if (paramcf != null) {
      this.a = paramcf;
      b();
    } 
  }
  
  private void b() {
    synchronized (this.f) {
      this.f.notify();
      return;
    } 
  }
  
  public final void d(int paramInt1, int paramInt2) {
    if (paramInt2 == 4) {
      ag.b().a(-10002, false);
      this.a = this.b;
      this.b = null;
      b();
      return;
    } 
    if (paramInt2 == 5) {
      this.b = null;
      ag.b().a(-10002, false);
      return;
    } 
    if (paramInt2 == 2) {
      ag.b().a(-10002, false);
      return;
    } 
    if (paramInt2 == 1) {
      ag.b().a(-10002, false);
      a(this.b);
      this.b = null;
      return;
    } 
    if (paramInt2 == 3 && d) {
      d = false;
      ag.b().a(-10004, false);
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\cn.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */