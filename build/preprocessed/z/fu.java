import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class fu extends ex {
  private int k;
  
  private Image l;
  
  private k m;
  
  private int n;
  
  private int o;
  
  private String[] p;
  
  private int q = 16177368;
  
  private int r = 16496053;
  
  private int s = 16288137;
  
  private int t = -1;
  
  public fu(Image paramImage, int paramInt) {
    super("", paramInt);
    this.l = paramImage;
    this.k = paramInt;
    e(20);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.a(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.l == null)
      this.p = bx.a("Thêm Kul", e() - 6); 
  }
  
  public final void a(String paramString) {
    this.p = bx.a(paramString, e() - 6);
  }
  
  public final void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.m = new k(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final void a(Image paramImage) {
    this.l = paramImage;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3) {
    this.q = 22523;
    this.r = 9287679;
    this.s = 22523;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    paramInt1 += c();
    paramInt2 += d();
    if (this.g) {
      int i = paramInt1;
      int j = paramInt2;
      int m = f();
      int n = e();
      paramGraphics.setColor(this.q);
      paramGraphics.fillRect(i, j, n, m);
      pc.a(paramGraphics, i - 1, j - 1, n + 2, m + 2, this.r, -1);
      cw.b(paramGraphics, this.s, i - 2, j - 2, n + 4, m + 4);
    } 
    if (this.l == null) {
      if (!this.g) {
        paramGraphics.setColor(10659250);
        paramGraphics.fillRect(paramInt1, paramInt2, e(), f());
        paramGraphics.setColor(13816018);
        paramGraphics.drawRect(paramInt1, paramInt2, e(), f());
        paramGraphics.drawRect(paramInt1 - 1, paramInt2 - 1, e() + 2, f() + 2);
      } 
      if (this.p != null) {
        int i = 10;
        for (byte b = 0; b < this.p.length; b++) {
          bx.d.a(paramGraphics, this.p[b], paramInt1 + e() / 2, paramInt2 + i, 1);
          i += bx.d.a();
        } 
        return;
      } 
    } else {
      try {
        cw.a(paramGraphics, this.l, this.m.a, this.m.b, this.m.c, this.m.d, paramInt1, paramInt2, 20);
        return;
      } catch (Exception exception) {
        ct.a("[pictureButon] error in  draw method " + this.m);
      } 
    } 
  }
  
  public final int a() {
    return this.k;
  }
  
  public final void n() {
    this.o++;
    if (this.o > 5) {
      this.n = -this.n;
      this.o = 0;
    } 
  }
  
  public final int r() {
    return this.t;
  }
  
  public final void h(int paramInt) {
    this.t = paramInt;
  }
  
  public final String toString() {
    fu fu1;
    return "PictureButton " + (fu1 = this).k + "   " + this.j;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\fu.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */