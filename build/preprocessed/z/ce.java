import com.mg.smsgame.MGMIDlet;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.GameCanvas;

public final class ce extends GameCanvas implements Runnable {
  private int a = 0;
  
  private Graphics b;
  
  private Image c;
  
  private int d;
  
  private int e;
  
  private int f;
  
  private int g = 0;
  
  private int h = 0;
  
  private int i = 0;
  
  private int j = 10;
  
  private int k = 1;
  
  private int l;
  
  private int m = 1;
  
  private int n = 160 / this.j;
  
  private boolean o = true;
  
  private boolean p = false;
  
  private int q = 0;
  
  private Font r = null;
  
  public ce() {
    super(false);
    setFullScreenMode(true);
    this.r = Font.getFont(0, 0, 8);
    this.q = 0;
    this.b = getGraphics();
    this.e = getWidth();
    this.d = getHeight();
    bx.a();
    this.c = f.a("/_mglogo");
    this.f = this.c.getHeight() / 5;
    this.n = this.c.getHeight() / 2 / this.j + 1;
    if (!v.X) {
      (new Thread(this)).start();
      return;
    } 
    a();
  }
  
  public final void run() {
    while (true) {
      if (!this.o && (MGMIDlet.d()).c) {
        b();
        a();
        return;
      } 
      b();
      if (this.q == 0) {
        if (this.g < this.n) {
          ce ce1;
          (ce1 = this).l = ce1.d / 2 - ce1.f;
          ce1.b.setColor(16777215);
          ce1.b.fillRect(0, 0, ce1.e, ce1.l - ce1.j / 2 - ce1.g * ce1.j);
          ce1.b.fillRect(0, ce1.l + ce1.j / 2 + ce1.g * ce1.j, ce1.e, ce1.d - ce1.l + ce1.j / 2 + ce1.g * ce1.j);
          int i = ce1.l - ce1.j / 2 - ce1.g * ce1.j;
          ce1.b.fillRect(0, i, ce1.e, ce1.j / 2 - ce1.k);
          i = i + 10 - ce1.j / 2 - ce1.k;
          ce1.b.fillRect(0, i, ce1.e, ce1.j / 2 - ce1.k);
          i = ce1.l - ce1.j / 2 + ce1.g * ce1.j;
          ce1.b.fillRect(0, i, ce1.e, ce1.j / 2 - ce1.k);
          i = i + 10 - ce1.j / 2 - ce1.k;
          ce1.b.fillRect(0, i, ce1.e, ce1.j / 2 - ce1.k);
          ce1.k += ce1.m;
          if (ce1.k >= ce1.j / 2 || ce1.k <= 0)
            if (ce1.i >= 0) {
              ce1.k = 0;
              ce1.g++;
              ce1.m = 1;
              ce1.i = 0;
            } else {
              ce1.i++;
              ce1.m = -ce1.m;
            }  
        } 
        flushGraphics();
        this.a++;
        if (this.a > 20)
          this.p = false; 
        if (this.a > 30) {
          ce ce1;
          (ce1 = this).c = f.a("/_partnerLogo");
          this.q = 1;
          this.a = 0;
        } 
      } else {
        flushGraphics();
        this.a++;
        if (this.a > 30)
          this.o = false; 
      } 
      try {
        Thread.sleep(40L);
      } catch (InterruptedException interruptedException2) {
        InterruptedException interruptedException1;
        (interruptedException1 = null).printStackTrace();
      } 
    } 
  }
  
  private void a() {
    v.v = getWidth();
    v.w = getHeight();
    MGMIDlet.d().c();
    ce ce1;
    (ce1 = this).c = null;
    ce1.r = null;
    System.gc();
  }
  
  private void b() {
    if (v.X)
      return; 
    this.e = getWidth();
    this.d = getHeight();
    this.b.setClip(0, 0, this.e, this.d);
    this.b.setColor(16777215);
    this.b.fillRect(0, 0, this.e, this.d);
    if (this.q == 0) {
      this.b.setColor(6710886);
      this.b.setFont(this.r);
      this.b.drawString("www.microgame.com.vn", this.e / 2, this.d - 5, 65);
      this.b.drawImage(this.c, this.e / 2, this.d / 2 - this.f, 3);
      return;
    } 
    this.b.drawImage(this.c, (this.e - this.c.getWidth()) / 2, (this.d - this.c.getHeight()) / 2, 0);
  }
  
  protected final void keyPressed(int paramInt) {
    if (this.q == 1)
      this.a = 30; 
  }
  
  protected final void pointerPressed(int paramInt1, int paramInt2) {
    if (this.q == 1)
      this.a = 30; 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ce.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */