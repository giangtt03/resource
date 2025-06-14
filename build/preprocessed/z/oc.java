import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class oc extends ak {
  private Image c;
  
  private int d;
  
  private int k;
  
  private int[] l;
  
  private int[] m;
  
  private k n;
  
  private Image o;
  
  public oc() {
    this.e = -100001;
    oc oc1;
    if ((oc1 = this).o == null)
      oc1.o = f.d("/createcs/bk"); 
    oc1.b = 0;
    oc1.c = pc.b;
    oc1.n = new k((oc1.f - 70) / 2, (oc1.g - 70) / 2, 70, 70);
    int i = oc1.n.a + oc1.n.c / 2;
    int j = oc1.n.b + oc1.n.d / 2;
    byte b = -90;
    oc1.l = new int[8];
    oc1.m = new int[8];
    for (byte b1 = 0; b1 < 8; b1++) {
      oc1.l[b1] = i + (25 * l.b(b) >> 14);
      oc1.m[b1] = j + (25 * l.a(b) >> 14);
      b += 45;
    } 
    a((ba)null);
  }
  
  public final void b_() {
    try {
      super.b_();
      this.k = this.d;
      this.d = (this.d + 1) % this.l.length;
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } 
  }
  
  protected final void b(Graphics paramGraphics) {
    int i = 0;
    if (this.o != null && v.u > this.o.getHeight())
      i = (v.u - this.o.getHeight()) / 2; 
    paramGraphics.drawImage(this.o, this.f / 2, this.g - i, 33);
    bx.b.a(paramGraphics, (new StringBuffer(String.valueOf(this.a))).toString(), this.n.a + (this.n.c >> 1), this.n.b - 4 + (this.n.d >> 1), 1);
    i = this.c.getWidth() / 3;
    int j = this.c.getHeight();
    cw.a(paramGraphics, this.c, 0, 0, i, j, this.l[(this.k - 1 + this.l.length) % this.l.length], this.m[(this.k - 1 + this.l.length) % this.l.length], 3);
    cw.a(paramGraphics, this.c, i, 0, i, j, this.l[this.k], this.m[this.k], 3);
    cw.a(paramGraphics, this.c, i + i, 0, i, j, this.l[this.d], this.m[this.d], 3);
  }
  
  protected final void a(Graphics paramGraphics) {
    paramGraphics.setColor(0);
    paramGraphics.fillRect(0, 0, v.t, v.u);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\oc.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */