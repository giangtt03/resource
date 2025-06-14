import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class gu extends al implements bf {
  private dc k;
  
  private int l = 1;
  
  private k m;
  
  private Image n = f.d("/info/increase");
  
  private Image o = f.d("/info/decrease");
  
  private int p = 0;
  
  private int q = 0;
  
  private int r = 50;
  
  private boolean s = false;
  
  public gu(dc paramdc) {
    super(1);
    this.k = paramdc;
    lm lm = (lm)paramdc.k;
    a(this);
    this.f = 200;
    this.g = 100;
    this.c = (v.t - this.f) / 2;
    this.d = (v.u - this.g) / 2;
    b(241213);
    a(new ba());
    this.m = new k(bx.d.a("Số lượng:   "), 0, 20, 18);
    this.p = (int)(lm.h / 1000L);
    this.q = this.p;
    if (go.s < lm.h) {
      az az = null;
      gu gu2;
      (gu2 = this).a(az, true);
    } else {
      bd bd1 = new bd("Mua", 0);
      gu gu2;
      (gu2 = this).a(bd1, true);
    } 
    bd bd = new bd("Hủy", 0);
    gu gu1;
    (gu1 = this).b(bd, true);
  }
  
  public final void c(Graphics paramGraphics) {
    pc.a(paramGraphics, this.c, this.d, this.f, this.g, v.aj, false);
    int i = this.c + 10;
    int j = this.d + 10;
    this.k.a(paramGraphics, i, j);
    bx.d.c(true);
    bx.d.a(paramGraphics, ((lm)this.k.k).b, i + this.k.e() + 5, j, 0);
    bx.d.c(false);
    i = this.c + 10;
    j += this.k.f() + 3;
    bx.d.b(true);
    bx.d.a(paramGraphics, "Số lượng: ", i, j, 0);
    bx.d.b(false);
    if (this.s) {
      i += 55;
    } else {
      j += bx.d.a() + 3;
      pc.b(paramGraphics, i, this.m.b + j, this.m.c, this.m.d, 1070484, 16579764, 14542575);
    } 
    bx.d.a(paramGraphics, this.l, i + 3, j + 2, 0);
    i += this.m.c;
    if (this.l < this.r)
      paramGraphics.drawImage(this.n, i + 3, j + this.m.d / 2, 36); 
    if (this.l > 1)
      paramGraphics.drawImage(this.o, i + 3, j + this.m.d / 2, 20); 
    if (!this.s) {
      i += this.o.getWidth() + 3;
      bx.d.a(paramGraphics, " x " + this.p + ".000 KEN = " + this.q + ".000 KEN", i, j, 0);
      j += bx.d.a() + 10;
      i = this.c + 10;
      a.g.a(paramGraphics, "Ken của bạn: " + go.s + " KEN", i, j, 0);
    } 
  }
  
  protected final void g() {
    super.g();
  }
  
  public final void d(int paramInt1, int paramInt2) {
    switch (paramInt2) {
      case 0:
        ag.b().a(h(), false);
        return;
    } 
    ag.b().a(h(), false);
  }
  
  public final void c(int paramInt) {
    gu gu2;
    int i;
    gu gu1;
    long l;
    switch (paramInt) {
      case 99:
        if (this.l >= this.r)
          return; 
        if ((gu2 = this).s) {
          this.l++;
          return;
        } 
        if ((l = (i = this.l + 1) * ((lm)this.k.k).h) <= go.s) {
          this.l = i;
          this.q = this.p * this.l;
          return;
        } 
        break;
      case 98:
        this.l--;
        if (this.l > 1 && (gu1 = this).s)
          this.q = this.p * this.l; 
        break;
    } 
  }
  
  public final void a(int paramInt1, int paramInt2) {
    if (this.l < this.r && (new k(this.c + 88, this.d + 42, 12, 12)).a(paramInt1, paramInt2)) {
      c(99);
      return;
    } 
    if (this.l > 1 && (new k(this.c + 88, this.d + 54, 12, 12)).a(paramInt1, paramInt2))
      c(98); 
  }
  
  public final void e(int paramInt) {
    this.r = paramInt;
  }
  
  public final lm t() {
    return (lm)this.k.k;
  }
  
  public final int u() {
    return this.l;
  }
  
  public final void j(boolean paramBoolean) {
    this.s = true;
    this.m.b = this.g = 80;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\gu.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */