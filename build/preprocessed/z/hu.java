import javax.microedition.lcdui.Graphics;

public final class hu extends ht implements af {
  private dc p;
  
  private ex q;
  
  private ex r;
  
  private aq[] s;
  
  private byte[][] t;
  
  private ff u;
  
  private byte v = 0;
  
  public String k;
  
  public hu(dc paramdc, String paramString1, int paramInt1, String paramString2, int paramInt2) {
    dc dc1 = paramdc;
    hu hu2;
    (hu2 = this).p = dc1;
    b(241234);
    int k = 1111120;
    paramString2 = paramString2;
    int i = 1111119;
    String str = paramString1;
    if ((hu2 = this).f > hu2.g) {
      if (hu2.f >= 320)
        hu2.f = 320; 
    } else if (hu2.f >= 240) {
      hu2.f = 240;
    } 
    hu2.f -= 20;
    hu2.g = 120;
    hu2.c = (v.t - hu2.f) / 2;
    hu2.d = (v.u - hu2.g - ba.a) / 2;
    hu2.u = new ff(null, 15, 4);
    hu hu3;
    hu2.u.a(15 + bx.d.a("Giá bán: ") + 4, hu2.d + (hu3 = hu2).p.f() + 30, 75, 18);
    hu2.u.a(hu2);
    hu2.u.d(true);
    hu2.q = new ex(str, i);
    i = bx.d.a("Nâng cấp") + 20;
    int j = (hu2.f - i - i) / 4;
    hu2.q.a(hu2.c + j, hu2.d + hu2.g - 30, i, 18);
    hu2.q.d(true);
    hu2.r = new ex(paramString2, k);
    hu2.r.a(hu2.c + hu2.f - j - i, hu2.d + hu2.g - 30, i, 18);
    hu hu1;
    (hu1 = hu2).t = new byte[3][4];
    (new byte[4])[0] = -1;
    (new byte[4])[1] = -1;
    (new byte[4])[2] = 1;
    (new byte[4])[3] = -1;
    hu1.t[0] = new byte[4];
    (new byte[4])[0] = 2;
    (new byte[4])[1] = -1;
    (new byte[4])[2] = -1;
    hu1.t[1] = new byte[4];
    (new byte[4])[0] = -1;
    (new byte[4])[1] = 1;
    (new byte[4])[2] = -1;
    hu1.t[2] = new byte[4];
    hu2.s = new aq[] { hu2.u, hu2.q, hu2.r };
    if (paramdc.j == 0) {
      this.k = ((ll)paramdc.k).d;
      return;
    } 
    if (paramdc.j == 1)
      this.k = String.valueOf(((lm)paramdc.k).g) + " " + ((lm)paramdc.k).b; 
  }
  
  protected final void f(int paramInt) {
    hu hu1;
    byte b = this.v;
    switch (paramInt) {
      case 96:
      case 97:
      case 98:
      case 99:
        if (!this.s[this.v].f(paramInt)) {
          int i = paramInt - 96;
          hu1 = this;
          if (i >= 0 && (i = hu1.t[hu1.v][i]) >= 0)
            hu1.v = i; 
        } 
        if (b != this.v) {
          this.s[this.v].d(true);
          this.s[b].d(false);
          return;
        } 
        return;
      case 95:
        if (this.v != 0) {
          if (this.s[this.v].m()) {
            this.i.d(0, ((ex)this.s[this.v]).a());
            return;
          } 
        } else {
          this.s[this.v].f(hu1);
          return;
        } 
        return;
    } 
    if (this.u.m())
      this.u.f(hu1); 
  }
  
  public final void f(int paramInt1, int paramInt2) {
    e(true);
    byte b = this.v;
    for (byte b1 = 0; b1 < this.s.length; b1 = (byte)(b1 + 1)) {
      if (this.s[b1].h().a(paramInt1, paramInt2)) {
        if (b1 != b) {
          this.v = b1;
          this.s[b].d(false);
          this.s[this.v].d(true);
        } 
        this.s[b1].c(paramInt1, paramInt2);
        if (this.s[b1].m())
          this.i.d(0, ((ex)this.s[b1]).a()); 
        return;
      } 
    } 
  }
  
  public final long t() {
    long l = 0L;
    String str;
    if (!(str = this.u.r()).equals(""))
      l = Integer.parseInt(str); 
    return l;
  }
  
  protected final boolean g(int paramInt) {
    return false;
  }
  
  protected final void e(int paramInt) {}
  
  public final void u() {
    hu hu1;
    (hu1 = this).p.n();
  }
  
  public final void b(Graphics paramGraphics) {
    pc.a(paramGraphics, this.c, this.d, this.f, this.g, v.aj, false);
    hu hu1;
    (hu1 = this).p.a(paramGraphics, (this.f - (hu1 = this).p.e()) / 2, this.d + 10);
    if (this.k != null)
      bx.d.a(paramGraphics, this.k, (this.f - bx.d.a(this.k)) / 2, this.d + (hu1 = this).p.f() + 13, 0); 
    bx.c.a(paramGraphics, "Giá bán: ", 15, this.d + (hu1 = this).p.f() + 31, 0);
    this.u.a(paramGraphics, 0, 0);
    bx.c.a(paramGraphics, ".000 KEN", 10 + bx.d.a("Giá bán: ") + 4 + this.u.e() + 5, this.d + (hu1 = this).p.f() + 34, 0);
    this.q.a(paramGraphics, 0, 0);
    this.r.a(paramGraphics, 0, 0);
  }
  
  public final void a(Graphics paramGraphics) {}
  
  public final dc v() {
    return this.p;
  }
  
  public final void a(ae paramae) {
    System.out.println("dramap" + paramae.a());
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\hu.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */