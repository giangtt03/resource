import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ic extends al implements bf {
  private cu k;
  
  private k l = null;
  
  private int m;
  
  private as n;
  
  private String[] o = null;
  
  private cu p;
  
  private k q;
  
  private k r;
  
  private int s = 3;
  
  private int t = 3;
  
  private int u = 0;
  
  private String v;
  
  private Image w = f.d("/push");
  
  private int x = 1;
  
  private int y;
  
  private a z;
  
  public ic(int paramInt1, int paramInt2, k paramk, as paramas, String paramString1, String paramString2) {
    super(1);
    this.v = paramString2;
    ic ic1;
    (ic1 = this).f = v.t - 20;
    ic1.g = bx.d.a() * ic1.s + 20;
    ic1.c = v.t - ic1.f >> 1;
    ic1.r = new k(35, 20, ic1.f - 35, ic1.g);
    if (ic1.v != null) {
      int m = bx.d.a(ic1.v) + 20;
      int n = ic1.f - 30;
      if (m > n) {
        m = n;
        a.a(ic1.v, bx.d, n);
      } 
      ic1.q = new k(5, 0, m + 10, 18);
    } else {
      ic1.q = new k(5, 0, ic1.f - 30, 18);
    } 
    ic1.p = new cu(5, 10);
    k k1 = paramk;
    (ic1 = this).l = k1;
    if (k1 != null && ic1.k != null)
      ic1.m = ic1.k.a - k1.a; 
    int j = paramInt2;
    int i = paramInt1;
    (ic1 = this).k = new cu(i, j);
    if (ic1.l != null) {
      ic ic2;
      ic1.m = ic1.k.a - ic1.l.a;
      paramInt1 = ic1.k.b - ic1.l.b;
      if (ic1.g > paramInt1) {
        ic1.g = paramInt1;
        ic1.d = 0;
        if (ic1.g < bx.d.a() * ic1.s - 20) {
          paramInt2 = (ic1.g - 20) / bx.d.a();
          ic2 = ic1;
          if (paramInt2 == 0)
            paramInt2 = 1; 
          ic2.s = paramInt2;
          ic2.t = paramInt2;
        } 
      } else {
        ic1.d = ic2 - ic1.g;
      } 
    } 
    as as1 = paramas;
    (ic1 = this).n = as1;
    if (as1 != null) {
      ic1.n.i();
      ic1.g = (as1.q() > ic1.g) ? (as1.q() + 20) : ic1.g;
      ic1.r.a = ic1.p.a + as1.p() + 3;
      ic1.r.c = ic1.f - ic1.r.a - 5;
      ic1.p.b = ic1.g - as1.q();
    } 
    String str = paramString1;
    (ic1 = this).o = bx.a(str, ic1.r.c);
    ic1.t = (ic1.o.length < ic1.s) ? ic1.o.length : ic1.s;
    this.z = a.s();
  }
  
  protected final void g() {
    if (this.n != null)
      this.n.i(); 
    this.y++;
    if (this.y > 0) {
      this.y = 0;
      this.x++;
      if (this.x > 6) {
        this.x = 0;
        this.y = -6;
      } 
    } 
  }
  
  public final void d(int paramInt1, int paramInt2) {}
  
  public final void c(Graphics paramGraphics) {
    int j = 0;
    int i = 0;
    Graphics graphics = paramGraphics;
    ic ic1 = this;
    i = 0 + ic1.c;
    j = 0 + ic1.d;
    cw.a(graphics, i, j + 9, ic1.f, ic1.g, ic1.m + i, false, 14808319, 152707);
    if (ic1.n != null)
      ic1.n.a(graphics, i + ic1.p.a, j + ic1.p.b); 
    pc.a(graphics, i + ic1.q.a, j + ic1.q.b, ic1.q.c, ic1.q.d, 8023552, 16775619);
    if (ic1.v != null) {
      bx.d.c(true);
      bx.d.a(graphics, ic1.v, ic1.q.a + i + 3, ic1.q.b + j + 2, 0);
      bx.d.c(false);
    } 
    if (ic1.o != null)
      bx.a(graphics, bx.c, ic1.o, ic1.u, ic1.t, ic1.r.a + i, ic1.r.b + j, ic1.r.c, ic1.r.d, 0); 
    int m = ic1.w.getWidth() >> 1;
    i = i + ic1.f - 10;
    j = j + ic1.g - 5;
    graphics.drawRegion(ic1.w, 0, 0, m, ic1.w.getHeight(), 0, i, j + ic1.x, 33);
    graphics.drawRegion(ic1.w, m, 0, m, ic1.w.getHeight(), 0, i, j + 10, 33);
  }
  
  public final void c(int paramInt) {
    if ((paramInt = this.u + this.s) >= this.o.length) {
      this.z.a(false);
      this.z.M();
      return;
    } 
    if (paramInt >= this.o.length - this.s)
      this.t = this.o.length - paramInt; 
    this.u = paramInt;
  }
  
  public final void a(int paramInt1, int paramInt2) {
    if ((new k(this.c + this.p.a, this.d + this.p.b, this.n.p(), this.n.q())).a(paramInt1, paramInt2) || (new k(this.c + this.f - 25, this.d + this.g - 25, 25, 25)).a(paramInt1, paramInt2))
      c(95); 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ic.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */