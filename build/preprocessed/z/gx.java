import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class gx extends al implements bf {
  private Image[] k = null;
  
  private cu l;
  
  private cu m;
  
  private cu[] n;
  
  private lq[] o;
  
  private d p = bx.d;
  
  private String[][] q;
  
  private int r = 0;
  
  private long s = 0L;
  
  private String t;
  
  public gx(lq[] paramArrayOflq) {
    super(1);
    b(241212);
    a(this);
    a(new ba());
    this.f = 240;
    this.g = 320 - ba.a;
    if (a.k == 1) {
      this.f = 320;
      this.g = v.u - ba.a;
    } else if (v.t < 240) {
      this.f = v.t;
      this.g = v.u - ba.a;
    } 
    this.f -= 20;
    int i = (i = this.f - 32 * paramArrayOflq.length) / (paramArrayOflq.length + 1);
    this.o = paramArrayOflq;
    this.k = new Image[paramArrayOflq.length];
    this.n = new cu[paramArrayOflq.length];
    this.q = new String[paramArrayOflq.length][];
    int j = 0;
    try {
      for (byte b = 0; b < paramArrayOflq.length; b++) {
        ll ll = (ll)(paramArrayOflq[b]).e;
        int k = mb.a(ll) + 98;
        pa pa;
        this.k[b] = (pa = pa.a()).a(k, false);
        this.n[b] = new cu(b * (i + 32) + i, 10);
        this.q[b] = a.a(ll);
        if (j < (this.q[b]).length)
          j = (this.q[b]).length; 
        this.s += (paramArrayOflq[b]).d;
      } 
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
    } 
    this.l = new cu(this.f / 2, (this.n[0]).b + this.k[0].getHeight() + 4);
    this.m = new cu(10, this.l.b + bx.d.a() + 5);
    j += 2;
    this.g = this.m.b + 10 - 2 + bx.c.a() + 2 + (bx.c.a() + 2) * j;
    this.c = (v.t >= this.f) ? ((v.t - this.f) / 2) : 0;
    this.d = (v.u >= this.g) ? ((v.u - ba.a - this.g) / 2) : 0;
    this.p = ll.a(((ll)(paramArrayOflq[this.r]).e).m);
    this.t = "Tổng tiền: " + a.b(this.s);
    bd bd = new bd("Bỏ qua", 1000);
    gx gx1;
    (gx1 = this).b(bd, true);
    bd = new bd("Nhặt", 2000);
    (gx1 = this).a(bd, true);
  }
  
  public final void c(Graphics paramGraphics) {
    pc.a(paramGraphics, this.c, this.d, this.f, this.g, v.aj, true);
    for (byte b = 0; b < this.k.length; b++)
      paramGraphics.drawImage(this.k[b], (this.n[b]).a + this.c, (this.n[b]).b + this.d, 20); 
    pc.e(paramGraphics, (this.n[this.r]).a + this.c, (this.n[this.r]).b + this.d, 32, 32, 0);
    ll ll;
    if ((ll = (ll)(this.o[this.r]).e).d != null) {
      this.p.a(paramGraphics, ll.d, this.l.a + this.c, this.l.b + this.d, 1);
      pc.a(paramGraphics, this.m.a + this.c, this.m.b + this.d, this.f - 10 - 10);
      int i = this.d + this.m.b + 10 - 2;
      int j = this.c + 5;
      pc.a(paramGraphics, j, i + a.g.a() / 2);
      if (go.k.G >= ll.i) {
        bx.d.a(paramGraphics, "Yêu cầu cấp: " + ll.i, j + 7, i, 0);
      } else {
        a.h.a(paramGraphics, "Yêu cầu cấp: " + ll.i, j + 7, i, 0);
      } 
      i += bx.d.a() + 2;
      if (this.q[this.r] != null)
        for (byte b1 = 0; b1 < (this.q[this.r]).length; b1++) {
          pc.a(paramGraphics, j, i + bx.c.a() / 2);
          bx.d.a(paramGraphics, this.q[this.r][b1], j + 7, i, 0);
          i += bx.d.a() + 2;
        }  
      i += 4;
      pc.a(paramGraphics, this.m.a + this.c, i, this.f - 10 - 10);
      i += 8;
      bx.d.c(true);
      bx.d.a(paramGraphics, this.t, j + 7, i, 0);
      bx.d.c(false);
    } 
  }
  
  public final void c(int paramInt) {
    switch (paramInt) {
      case 96:
        this.r = (this.r == this.o.length - 1) ? 0 : (this.r + 1);
        this.p = ll.a(((ll)(this.o[this.r]).e).m);
        return;
      case 97:
        this.r = (this.r == 0) ? (this.o.length - 1) : (this.r - 1);
        this.p = ll.a(((ll)(this.o[this.r]).e).m);
        break;
    } 
  }
  
  public final void d(int paramInt1, int paramInt2) {
    ag.b().a(h(), false);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\gx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */