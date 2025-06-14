import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class gt extends al implements bf {
  private byte k = 0;
  
  private lh l = null;
  
  private String m = null;
  
  private k n;
  
  private k o;
  
  private k p;
  
  private mg q;
  
  private String[] r = new String[] { "Danh Hiệu", "Hạng ", "Cấp: " };
  
  private cu s;
  
  private k t;
  
  private String[] u;
  
  private String v;
  
  private np w;
  
  private String x;
  
  private int y;
  
  private boolean z;
  
  private boolean A;
  
  public gt(lh paramlh, String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    this(paramlh, (byte)0, paramBoolean1, paramBoolean2);
    this.x = paramString;
    this.z = paramBoolean1;
  }
  
  public gt(lh paramlh, byte paramByte, boolean paramBoolean1, boolean paramBoolean2) {
    super(1);
    (new int[5])[0] = 7037769;
    (new int[5])[1] = 12628615;
    (new int[5])[2] = 15720104;
    (new int[5])[3] = 12628615;
    (new int[5])[4] = 7037769;
    this.y = 50;
    this.z = false;
    this.A = false;
    byte b = paramByte;
    gt gt1;
    (gt1 = this).k = b;
    if (b == 0) {
      bd bd = new bd("Không", 24);
      (gt1 = gt1).b(bd, true);
    } else {
      gt1.a(new bd("Đóng", 87));
    } 
    b(-241209);
    a(new ba());
    a(this);
    this.z = paramBoolean1;
    this.A = paramBoolean2;
    lh lh1 = paramlh;
    gt1 = this;
    if (lh1 != null) {
      int i = 220;
      gt1.l = lh1;
      gt1.o = new k(10, 10, 60, 70);
      int j = gt1.o.b + gt1.o.d + 4;
      gt1.p = new k(gt1.o.a + gt1.o.c + 65, gt1.o.b + bx.d.a() + 4, 75, 16);
      int m;
      if ((m = bx.c.a(lh1.Q) + 4) > gt1.p.c) {
        int n = m - gt1.p.c;
        gt1.p.c = m;
        i = n + 220;
      } 
      if (gt1.k == 0) {
        j += 4 + bx.d.a() + 4;
        if (gt1.z)
          j += 4 + bx.d.a() + 4; 
        if (gt1.A)
          j += 4 + bx.d.a() + 4; 
        if (lh1.X > 0L) {
          gt1.m = i.a(lh1.X, ".");
          j += 4;
          gt1.s = new cu(gt1.o.a, j);
          j += 6;
          m = bx.c.a("Đặt Cược:");
          int n = bx.c.a(gt1.m);
          gt1.t = new k(gt1.o.a + 4 + 2 + m, j, n, 16);
          j += gt1.t.d + 4;
        } 
      } 
      j = j + 4 + 4;
      gt1.n = new k((gt1.f - i) / 2, (gt1.g - j - ba.a) / 2, i, j);
      gt1.u = new String[3];
      gt1.u[0] = lh1.Q;
      gt1.u[1] = lh1.R;
      gt1.u[2] = (new StringBuffer(String.valueOf(lh1.G))).toString();
      gt1.v = a.a(gt1.l.b, gt1.f / 2 - 5);
      gt1.q = mb.a(lh1, false);
      gt1.q.a(lc.a(lh1));
      gt1.q.a(nr.a(lh1));
      gt1.q.c(2);
    } 
    this.w = new np();
    this.w.a();
  }
  
  public final String t() {
    return this.x;
  }
  
  public final void c(Graphics paramGraphics) {
    pc.d(paramGraphics, this.n.a, this.n.b, this.n.c, this.n.d, v.aj);
    int i = this.o.a + this.n.a;
    int j = this.n.b + this.o.b;
    pc.c(paramGraphics, i, j, this.o.c, this.o.d);
    if (this.q != null)
      this.q.a(paramGraphics, i + 4, j + this.o.d - 4 - this.q.q()); 
    j = j;
    int m = i + this.o.c + 4;
    pc.b(paramGraphics, m, j + bx.d.b() - pc.h.getHeight(), this.l.g);
    m += 15;
    bx.d.c(true);
    bx.d.a(paramGraphics, this.v, m, j, 0);
    bx.d.c(false);
    j += bx.d.a() + 4;
    for (m = 0; m < this.r.length; m++) {
      pc.b(paramGraphics, this.p.a + this.n.a, j, this.p.c, this.p.d, 1070484, 16579764, 14542575);
      bx.d.a(paramGraphics, this.r[m], this.p.a + this.n.a - 4, j + 1, 2);
      bx.c.a(paramGraphics, this.u[m], this.p.a + this.n.a + this.p.c / 2, j + 1, 1);
      j += this.p.d + 4;
    } 
    if (this.k == 0) {
      a.h.a(paramGraphics, "Muốn khiêu chiến với bạn!", this.n.a + this.n.c / 2, j + 2, 1);
      j += 4 + a.h.a();
      if (this.z) {
        a.g.a(paramGraphics, "Kiểu quyết đấu: 1 chiều", i, j + 2, 0);
        j += 4 + a.g.a();
      } 
      if (this.A) {
        a.g.a(paramGraphics, "Không chơi Tuyệt Chiêu", i, j + 2, 0);
        a.g.a();
      } 
      if (this.m != null) {
        pc.a(paramGraphics, this.s.a + this.n.a, this.s.b + this.n.b, this.n.c - 20);
        j = this.t.b + this.n.b + 2;
        bx.d.c(true);
        bx.d.a(paramGraphics, "Đặt Cược:", i, j + 2, 0);
        bx.d.c(false);
        i = this.t.a + this.n.a + 4;
        a.h.a(paramGraphics, this.m, i, j + 2, 0);
        bx.d.a(paramGraphics, " KEN", i + this.t.c + 2, j + 2, 0);
        a.h.a();
      } 
    } 
  }
  
  public final void d(int paramInt1, int paramInt2) {
    switch (paramInt2) {
      case 24:
        a.s().a(false, null);
        return;
      case 12:
        a.s().a(true, null);
        return;
    } 
    ag.b().a(h(), false);
  }
  
  protected final void g() {
    if (this.q != null)
      this.q.i(); 
    if (this.k == 0) {
      if (this.y > 0) {
        this.y--;
        if (this.y == 1) {
          bd bd = new bd("Đồng ý", 12);
          gt gt1;
          (gt1 = this).a(bd, true);
          return;
        } 
      } 
      if (this.w.g() > 29L) {
        a.s().a(false, null);
        this.w.b();
      } 
    } 
  }
  
  public final long u() {
    return this.l.X;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\gt.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */