import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ie extends al implements bf {
  private static int k;
  
  private static int l;
  
  private int[] m;
  
  private int[] n;
  
  private int o = 60;
  
  private static int p = 10;
  
  private int q = 38;
  
  private String r = "Vui lòng chờ...";
  
  private boolean s;
  
  private String t = "";
  
  private String[] u;
  
  private np v = new np();
  
  private Image w = pc.b;
  
  private Image x = null;
  
  private int y = -1;
  
  public ie(String paramString) {
    this(null, paramString);
  }
  
  private ie(Image paramImage, String paramString) {
    super(0);
    a((ba)null);
    if (paramString != null)
      this.r = paramString; 
    t();
  }
  
  private void t() {
    this.q = 30;
    if (this.s)
      this.q = 36; 
    if (this.f > this.g) {
      if (this.f >= 320)
        this.f = 320; 
    } else if (this.f >= 240) {
      this.f = 240;
    } 
    this.f -= 20;
    this.u = bx.a(this.r, this.f - 16, bx.b);
    this.g = this.q + p + p + p + bx.c.a() * this.u.length;
    this.c = (v.t - this.f) / 2;
    this.d = (v.u - this.g - ba.a) / 2;
    int i = this.f / 2;
    int j = this.d + p + this.q / 2;
    int k = this.q / 2;
    byte b = -90;
    this.m = new int[9];
    this.n = new int[9];
    for (byte b1 = 0; b1 < 9; b1++) {
      this.m[b1] = i + (k * l.b(b) >> 14) + this.c;
      this.n[b1] = j + (k * l.a(b) >> 14);
      b += 40;
    } 
  }
  
  public final void c(Graphics paramGraphics) {
    if (this.x != null) {
      paramGraphics.fillRect(0, 0, v.t, v.u);
      paramGraphics.drawImage(this.x, v.t >> 1, v.u >> 1, 3);
    } else {
      pc.a(paramGraphics, this.c, this.d, this.f, this.g, v.aj, false);
    } 
    if (this.s)
      a.h.a(paramGraphics, this.t, this.c + this.f / 2, this.d + p + this.q / 2 - 5, 1); 
    Graphics graphics = paramGraphics;
    ie ie1;
    int j = (ie1 = this).w.getWidth() / 3;
    int k = ie1.w.getHeight();
    int m = (l - 2 + ie1.m.length) % ie1.m.length;
    for (byte b2 = 0; b2 < 2; b2++) {
      int n = (m + b2 + ie1.m.length) % ie1.m.length;
      cw.a(graphics, ie1.w, 0, 0, j, k, ie1.m[n], ie1.n[n], 3);
    } 
    if (ie1.y >= 0)
      bx.c.a(graphics, String.valueOf(ie1.y) + "%", ie1.c + ie1.f / 2, ie1.d + (p + ie1.q) / 2, 3); 
    cw.a(graphics, ie1.w, j, 0, j, k, ie1.m[l], ie1.n[l], 3);
    cw.a(graphics, ie1.w, j + j, 0, j, k, ie1.m[k], ie1.n[k], 3);
    int i = 0;
    for (byte b1 = 0; b1 < this.u.length; b1++) {
      bx.b.a(paramGraphics, this.u[b1], this.c + this.f / 2 + 5, this.d + p + p + this.q + i, 1);
      i += bx.b.a();
    } 
  }
  
  protected final void g() {
    if (this.s) {
      int i;
      if ((i = (int)(this.o - this.v.g())) <= 0) {
        i = 0;
        a.s().o();
      } 
      this.t = String.valueOf(i);
    } 
    l = k;
    k = (k + 1) % this.m.length;
  }
  
  public final void d(int paramInt1, int paramInt2) {}
  
  public final void a(int paramInt) {
    super.a(paramInt);
    this.o = paramInt;
  }
  
  public final void e(int paramInt) {
    this.o = 30;
    this.v.a();
  }
  
  public final void j(boolean paramBoolean) {
    this.s = true;
    t();
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ie.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */