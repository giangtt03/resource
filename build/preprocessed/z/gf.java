import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class gf extends aq {
  private Image j = f.d("/info/btinscrease");
  
  private int k;
  
  private int l = 0;
  
  private k m;
  
  private String n = null;
  
  protected int i = 0;
  
  private k o;
  
  private bi p;
  
  private int q = 100;
  
  private int r = 0;
  
  public gf(String paramString) {
    int i = 0;
    this.n = paramString;
    if (paramString != null)
      i = bx.d.a() + 4; 
    this.k = this.j.getWidth() / 4;
    this.m = new k(this.k + 4, i, v.t, this.k);
    this.o = new k(this.m.a, this.m.b, this.k / 2, this.k);
    e(i + this.m.d + 4);
  }
  
  public final void d(int paramInt) {
    super.d(paramInt);
    this.l = e() - (this.k + 4 << 1);
    this.m.c = this.l;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!k())
      return; 
    paramInt1 += c();
    paramInt2 += d();
    if (this.n != null)
      bx.d.a(paramGraphics, this.n, paramInt1, paramInt2, 0); 
    cw.a(paramGraphics, this.j, m() ? ((this.k << 1) + this.k) : (this.k << 1), 0, this.k, this.k, this.m.a - 4 + paramInt1, this.m.b + paramInt2, 24);
    cw.a(paramGraphics, this.j, m() ? this.k : 0, 0, this.k, this.k, this.m.a + this.m.c + 4 + paramInt1, this.m.b + paramInt2, 20);
    int i = this.m.b + this.m.d / 2 + paramInt2;
    paramGraphics.setColor(m() ? 14210926 : 11513775);
    paramGraphics.drawLine(this.m.a + paramInt1, i, this.m.a + this.m.c + paramInt1, i);
    paramGraphics.drawLine(this.m.a + paramInt1, i + 1, this.m.a + this.m.c + paramInt1, i + 1);
    paramGraphics.drawLine(this.m.a + paramInt1 + this.m.c / 2, i - 2, this.m.a + paramInt1 + this.m.c / 2, i + 3);
    paramGraphics.setColor(m() ? 16715792 : 11513600);
    paramGraphics.fillRect(this.o.a + paramInt1, this.o.b + paramInt2, this.o.c, this.o.d);
    c(false);
  }
  
  public void h(int paramInt) {
    this.i = (paramInt > this.q) ? this.q : ((paramInt < 0) ? 0 : paramInt);
    paramInt = this.l;
    this.o.a = this.m.a + this.i * paramInt / this.q - this.o.c / 2;
    if (this.p != null)
      this.p.a(this, this.i); 
  }
  
  public final int a() {
    return this.i;
  }
  
  public final boolean f(int paramInt) {
    if (this.b != null)
      this.b.c(true); 
    switch (paramInt) {
      case 97:
        h(this.i - 10);
        return true;
      case 96:
        h(this.i + 10);
        return true;
      case 98:
      case 99:
        return false;
    } 
    return true;
  }
  
  public final boolean c(int paramInt1, int paramInt2) {
    paramInt1 -= c();
    paramInt2 -= d();
    if ((new k(this.m.a - 4 - this.k, this.m.b, this.k, this.k)).a(paramInt1, paramInt2)) {
      h(this.i - 10);
      return true;
    } 
    if ((new k(this.m.a + this.m.c + 4, this.m.b, this.k, this.k)).a(paramInt1, paramInt2)) {
      h(this.i + 10);
      return true;
    } 
    if (this.m.a(paramInt1, paramInt2)) {
      paramInt1 -= this.m.a;
      h(paramInt1 * 100 / this.m.c);
      return true;
    } 
    return false;
  }
  
  public final void a(bi parambi) {
    this.p = parambi;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\gf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */