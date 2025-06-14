import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class hg extends al implements bf {
  private Image l = null;
  
  private cu m;
  
  private cu n;
  
  private cu o;
  
  public ll k;
  
  private d p = bx.d;
  
  private String[] q;
  
  private boolean r;
  
  private String[] s = null;
  
  private d t;
  
  private String[] u = new String[] { "Đồ giành cho NAM", "Đồ giành cho NỮ", "Giành cho cả NAM & NỮ" };
  
  public hg(ll paramll) {
    super(1);
    b(241212);
    a(this);
    a(new ba());
    this.k = paramll;
    this.t = new if(new int[] { 16711680, 16776960 });
    try {
      int i = mb.a(paramll) + 98;
      pa pa;
      this.l = (pa = pa.a()).a(i, false);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
    } 
    if (paramll.h != 2 && paramll.h != go.k.f)
      this.r = true; 
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
    this.o = new cu(this.f / 2, 10);
    this.m = new cu(10, this.o.b + this.l.getHeight() + 4);
    this.n = new cu(10, this.m.b + bx.d.a() + 5);
    this.q = a.a(paramll);
    this.g = this.n.b + 10 - 2 + (bx.c.a() + 2 << 1) + (a.g.a() + 2) * this.q.length + (this.r ? bx.c.a() : 0) + 10;
    if (paramll.g != null && !paramll.g.equals("")) {
      this.s = bx.a(paramll.g, this.f - 20);
      this.g += this.s.length * (bx.c.a() + 2);
    } 
    this.c = (v.t >= this.f) ? ((v.t - this.f) / 2) : 0;
    this.d = (v.u >= this.g) ? ((v.u - ba.a - this.g) / 2) : 0;
    this.p = ll.a(paramll.m);
    bd bd = new bd("Bỏ qua", 1000);
    hg hg1;
    (hg1 = this).b(bd, true);
    bd = new bd("Nhặt", 2000);
    (hg1 = this).a(bd, true);
  }
  
  public final void c(Graphics paramGraphics) {
    pc.a(paramGraphics, this.c, this.d, this.f, this.g, v.aj, true);
    paramGraphics.drawImage(this.l, this.o.a + this.c, this.o.b + this.d, 17);
    if (this.k == null) {
      ct.a("[EquipmentDetailDialog.draw()] Null equipmeny");
      return;
    } 
    if (this.k.j > 0 && this.t != null)
      this.t.a(paramGraphics, "+" + this.k.j, this.o.a + this.c + 16, this.o.b + this.d + 32 - bx.c.a(), 2); 
    if (this.k.d != null) {
      int i = this.n.a + this.c;
      if (this.k.f > 0)
        pc.b(paramGraphics, i, this.m.b + this.d - 4, this.k.f); 
      i += 15;
      if (this.k.j <= 0) {
        this.p.a(paramGraphics, this.k.d, i, this.m.b + this.d, 0);
      } else {
        this.p.a(paramGraphics, String.valueOf(this.k.d) + " +" + this.k.j, i, this.m.b + this.d, 0);
      } 
      pc.a(paramGraphics, this.n.a + this.c, this.n.b + this.d, this.f - 10 - 10);
      int j = this.d + this.n.b + 10 - 2;
      i = this.c + 5;
      pc.a(paramGraphics, i, j + a.g.a() / 2);
      if (go.k.G >= this.k.i) {
        bx.c.a(paramGraphics, "Yêu cầu cấp: " + this.k.i, i + 7, j, 0);
      } else {
        a.h.a(paramGraphics, "Yêu cầu cấp: " + this.k.i, i + 7, j, 0);
      } 
      j += bx.c.a() + 2;
      pc.a(paramGraphics, i, j + a.g.a() / 2);
      if (this.k.q > 0)
        if (this.k.p * 100 / this.k.q >= 30) {
          bx.c.a(paramGraphics, "Độ bền: " + this.k.p + "/" + this.k.q, i + 7, j, 0);
        } else {
          a.h.a(paramGraphics, "Độ bền: " + this.k.p + "/" + this.k.q, i + 7, j, 0);
        }  
      j += bx.c.a() + 2;
      int k;
      for (k = 0; k < this.q.length; k++) {
        pc.a(paramGraphics, i, j + bx.c.a() / 2);
        a.g.a(paramGraphics, this.q[k], i + 7, j, 0);
        j += a.g.a() + 2;
      } 
      if (this.s != null) {
        pc.a(paramGraphics, i, j + bx.c.a() / 2);
        for (k = 0; k < this.s.length; k++) {
          bx.c.a(paramGraphics, this.s[k], i + 7, j, 0);
          j += bx.c.a() + 2;
        } 
      } 
      if (this.r) {
        k = this.d + this.g - bx.d.a() - 10;
        pc.a(paramGraphics, i, k + a.g.a() / 2);
        a.h.a(paramGraphics, this.u[this.k.h], i + 7, k, 0);
      } 
    } 
  }
  
  public final void d(int paramInt1, int paramInt2) {
    switch (paramInt2) {
      case 2000:
        ag.b().a(h(), false);
        return;
      case 1000:
        ag.b().a(h(), false);
        break;
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\hg.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */