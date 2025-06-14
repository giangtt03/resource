import javax.microedition.lcdui.Graphics;

public final class hc extends ht {
  private String k;
  
  private String[] p;
  
  private ex q;
  
  private ex r;
  
  private aq[] s;
  
  private byte t = 0;
  
  private byte[][] u;
  
  private le v = null;
  
  private d w;
  
  public hc(String paramString1, String paramString2, int paramInt1, String paramString3, int paramInt2) {
    this.k = paramString1;
    paramInt2 = paramInt2;
    paramString3 = paramString3;
    paramInt1 = 7;
    paramString2 = paramString2;
    hc hc1;
    if ((hc1 = this).f > hc1.g) {
      if (hc1.f >= 320)
        hc1.f = 320; 
    } else if (hc1.f >= 240) {
      hc1.f = 240;
    } 
    hc1.f -= 20;
    hc1.p = bx.a(hc1.k, hc1.f - 16, bx.b);
    hc1.g = 100 + bx.c.a() * hc1.p.length;
    hc1.c = (v.t - hc1.f) / 2;
    hc1.d = (v.u - hc1.g - ba.a) / 2;
    hc1.v = new le();
    hc1.q = new ex(paramString2, paramInt1);
    int i = bx.d.a("Nâng cấp") + 20;
    paramInt1 = (hc1.f - i - i) / 4;
    hc1.q.a(hc1.c + paramInt1, hc1.d + hc1.g - 30, i, 18);
    hc1.q.d(true);
    hc1.r = new ex(paramString3, paramInt2);
    hc1.r.a(hc1.c + hc1.f - paramInt1 - i, hc1.d + hc1.g - 30, i, 18);
    hc hc2;
    (hc2 = hc1).u = new byte[2][4];
    (new byte[4])[0] = 1;
    (new byte[4])[1] = 1;
    (new byte[4])[2] = -1;
    (new byte[4])[3] = -1;
    hc2.u[0] = new byte[4];
    (new byte[4])[2] = -1;
    (new byte[4])[3] = -1;
    hc2.u[1] = new byte[4];
    hc1.s = new aq[] { hc1.q, hc1.r };
    hc1.w = new by(16711680);
  }
  
  protected final void s() {
    this.v = null;
  }
  
  public final void f(int paramInt1, int paramInt2) {
    e(true);
    byte b = this.t;
    for (byte b1 = 0; b1 < this.s.length; b1 = (byte)(b1 + 1)) {
      if (this.s[b1].h().a(paramInt1, paramInt2)) {
        if (b1 != b) {
          this.t = b1;
          this.s[b].d(false);
          this.s[this.t].d(true);
        } 
        this.s[b1].c(paramInt1, paramInt2);
        if (this.s[b1].m())
          this.i.d(0, ((ex)this.s[b1]).a()); 
        return;
      } 
    } 
  }
  
  protected final void f(int paramInt) {
    byte b = this.t;
    switch (paramInt) {
      case 96:
      case 97:
      case 98:
      case 99:
        if (!this.s[this.t].f(paramInt)) {
          int i = paramInt - 96;
          hc hc1 = this;
          if (i >= 0 && (i = hc1.u[hc1.t][i]) >= 0)
            hc1.t = i; 
        } 
        if (b != this.t) {
          this.s[this.t].d(true);
          this.s[b].d(false);
          return;
        } 
        break;
      case 95:
        if (this.s[this.t].m())
          this.i.d(0, ((ex)this.s[this.t]).a()); 
        break;
    } 
  }
  
  public final void u() {
    if (this.v != null)
      this.v.i(); 
  }
  
  public final void b(Graphics paramGraphics) {
    pc.a(paramGraphics, this.c, this.d, this.f, this.g, v.aj, false);
    if (this.v != null)
      this.v.a(paramGraphics, this.c + (this.f - this.v.p()) / 2, this.d + 10); 
    int i = 0;
    for (byte b = 0; b < this.p.length; b++) {
      this.w.a(paramGraphics, this.p[b], this.c + this.f / 2, this.d + 15 + this.v.q() + i, 1);
      i += bx.b.a();
    } 
    this.q.a(paramGraphics, 0, 0);
    this.r.a(paramGraphics, 0, 0);
  }
  
  public final void a(Graphics paramGraphics) {}
  
  protected final boolean g(int paramInt) {
    return false;
  }
  
  protected final void e(int paramInt) {}
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\hc.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */