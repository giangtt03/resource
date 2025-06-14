import com.mg.smsgame.MGMIDlet;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;

public final class aj extends Canvas implements bf, Runnable {
  private boolean a = false;
  
  private int b = 2;
  
  private al c;
  
  private int d;
  
  private int e;
  
  public aj() {
    setFullScreenMode(true);
    bx.a();
    v.z = hasPointerEvents();
    (new Thread(this)).start();
  }
  
  protected final void paint(Graphics paramGraphics) {
    aj aj1;
    this.d = getWidth();
    this.e = getHeight();
    paramGraphics.setColor(0);
    paramGraphics.fillRect(0, 0, this.d, this.e);
    if (this.b > 0) {
      this.b--;
      if (this.b == 0) {
        v.t = (aj1 = this).d;
        v.u = aj1.e;
        try {
          bw bw = new bw("Cài đặt tin nhắn");
          bc bc1 = new bc("Máy điện thoại của bạn cần được cho phép nhận tin nhắn từ hệ thống. Hãy bấm cài đặt và sau đó chọn 'có' hoặc 'yes'.", 0);
          bc bc2;
          (bc2 = new bc("**Việc cho phép nhận tin nhắn để nhận vật phẩm, mua mạng chơi cũng như cơ hội nhận được phần thưởng từ hệ thống.", 0)).a(bx.b);
          bc bc3;
          (bc3 = new bc("**Việc không cho phép nhận tin nhắn từ hệ thống sẽ làm cho bạn không thể mua mạng chơi, cập nhật vật phẩm cũng như không thể nhận các giải thưởng từ hệ thống.", 0)).a(bx.b);
          bw.a(new au[] { bc1, bc2, bc3 });
          bw.a(aj1);
          bw.a(new bd("Cài đặt", -1));
          aj1.c = bw;
          return;
        } catch (Exception exception2) {
          Exception exception1;
          (exception1 = null).printStackTrace();
        } 
      } 
      return;
    } 
    this.c.h(true);
    this.c.a((Graphics)aj1, true);
  }
  
  public final void run() {
    this.a = false;
    while (!this.a) {
      try {
        long l1 = System.currentTimeMillis();
        repaint();
        long l2;
        if ((l2 = System.currentTimeMillis()) - l1 <= 40L)
          Thread.sleep(40L - l2 - l1); 
      } catch (Exception exception2) {
        Exception exception1;
        ct.a(exception1 = null);
        exception1.printStackTrace();
      } 
    } 
    MGMIDlet.d().a();
    MGMIDlet.d();
    MGMIDlet.b();
    if (v.X)
      return; 
    MGMIDlet.d().a((Displayable)new ce(), true);
  }
  
  public final void d(int paramInt1, int paramInt2) {
    this.a = true;
  }
  
  protected final void keyPressed(int paramInt) {
    if (this.a)
      return; 
    paramInt = ag.a(paramInt, true);
    v.c[paramInt] = 2;
  }
  
  protected final void keyReleased(int paramInt) {
    if (this.a)
      return; 
    paramInt = ag.a(paramInt, true);
    v.c[paramInt] = 1;
  }
  
  protected final void pointerPressed(int paramInt1, int paramInt2) {
    if (this.a)
      return; 
    v.A = paramInt1 - v.x;
    v.B = paramInt2 - v.y;
  }
  
  protected final void pointerReleased(int paramInt1, int paramInt2) {
    if (this.a)
      return; 
    v.C = paramInt1 - v.x;
    v.D = paramInt2 - v.y;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\aj.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */