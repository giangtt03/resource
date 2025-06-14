import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class hp extends al {
  private int k = 54;
  
  private int l = 53;
  
  private int m = 5;
  
  private int n = 4;
  
  private int o = 0;
  
  private int p = -1;
  
  private int q;
  
  private byte r;
  
  public final void e(int paramInt) {
    this.p = paramInt;
  }
  
  public final void f(int paramInt) {
    this.o = paramInt;
  }
  
  public final String t() {
    return p.i[this.o];
  }
  
  public final void u() {
    this.p = -1;
    this.o = 0;
    o();
  }
  
  public final int v() {
    return this.o;
  }
  
  public hp(byte paramByte) {
    super(1);
    this.r = paramByte;
    if (paramByte == 2) {
      this.q = 20;
      b(999999223);
    } else {
      this.q = 28;
      b(241224);
      this.k = 35;
      this.l = 30;
      this.m = 6;
      p.h();
    } 
    if (v.t > v.u)
      this.n = (paramByte == 2) ? 5 : 7; 
    this.f = this.n * this.k + this.m + this.m;
    this.g = this.q / this.n * this.l + this.m + this.m;
    this.c = (v.t - this.f) / 2;
    this.d = (v.u - this.g - ba.a) / 2;
    a(new ba());
    gb gb = new gb(-8881, 2);
    hp hp1;
    (hp1 = this).a(gb, true);
    gb = new gb(-8882, 3);
    (hp1 = this).b(gb, true);
    a(a.n);
  }
  
  public final void c(int paramInt) {
    if (paramInt == 95) {
      if (this.i != null) {
        this.p = this.o;
        this.i.d(h(), -8881);
      } 
    } else if (paramInt == 97) {
      this.o--;
      if (this.o < 0)
        this.o = this.q - 1; 
      e(true);
    } else if (paramInt == 96) {
      this.o++;
      if (this.o >= this.q)
        this.o = 0; 
      e(true);
    } else if (paramInt == 99) {
      this.o = (this.o - this.n + this.q) % this.q;
      e(true);
    } else if (paramInt == 98) {
      this.o = (this.o + this.n) % this.q;
      e(true);
    } 
    w();
  }
  
  public final void w() {
    if (this.o == this.p && this.r == 2) {
      a(new bd("Hủy", -8883));
      return;
    } 
    o();
  }
  
  public final void a(int paramInt1, int paramInt2) {
    int i = a() + this.m;
    int j = c() + this.m;
    for (byte b = 0; b < this.q; b++) {
      int k = i + b % this.n * this.k;
      int m = j + b / this.n * this.l;
      if (paramInt1 >= k && paramInt1 <= k + this.k && paramInt2 >= m && paramInt2 <= m + this.l) {
        if (this.o == b) {
          if (this.o == this.p && this.r == 2) {
            if (this.i != null) {
              this.i.d(h(), -8883);
              return;
            } 
            break;
          } 
          c(95);
          return;
        } 
        this.o = b;
        e(true);
        w();
        return;
      } 
    } 
  }
  
  public final void c(Graphics paramGraphics) {
    if (this.r == 2) {
      paramGraphics.setColor(15793151);
      paramGraphics.fillRect(this.c, this.d, this.f, this.g);
      int n = this.c + this.m + this.k / 2;
      int i1 = this.d + this.m + this.l / 2;
      int i2 = n + this.o % this.n * this.k - oy.c[this.o] / 2;
      int i3 = i1 + this.o / this.n * this.l - oy.d[this.o] / 2;
      paramGraphics.setColor(16177368);
      paramGraphics.fillRect(i2, i3, oy.c[this.o] + 2, oy.d[this.o] + 2);
      pc.a(paramGraphics, i2 - 1, i3, oy.c[this.o] + 2, oy.d[this.o] + 1, 16496053, -1);
      cw.b(paramGraphics, 16288137, i2 - 2, i3 - 1, oy.c[this.o] + 4, oy.d[this.o] + 3);
      for (i2 = 0; i2 < this.q; i2++)
        oy.a(paramGraphics, i2, n + i2 % this.n * this.k, i1 + i2 / this.n * this.l, 3); 
      pc.d(paramGraphics, this.c, this.d, this.f, this.g, -1);
      return;
    } 
    pc.d(paramGraphics, this.c, this.d, this.f, this.g, 15793151);
    int i = this.c + this.m + this.k / 2;
    int j = this.d + this.m + this.l / 2;
    int k = i + this.o % this.n * this.k + p.o[this.o] - p.l[this.o] / 2 - 1;
    int m = j + this.o / this.n * this.l + p.n[this.o] - p.m[this.o] / 2 - 1;
    paramGraphics.setColor(16177368);
    paramGraphics.fillRect(k, m, p.l[this.o] + 2, p.m[this.o] + 2);
    pc.a(paramGraphics, k, m, p.l[this.o] + 2, p.m[this.o] + 2, 16496053, -1);
    cw.b(paramGraphics, 16288137, k - 1, m - 1, p.l[this.o] + 4, p.m[this.o] + 4);
    for (k = 0; k < 28; k++)
      cw.a(paramGraphics, p.p, p.j[k], p.k[k], p.l[k], p.m[k], i + k % this.n * this.k + p.o[k], j + k / this.n * this.l + p.n[k], 3); 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\hp.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */