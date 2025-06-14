import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class or extends fb implements bf, bg, bn, bq {
  private dh[][] p = new dh[2][0];
  
  private int q;
  
  private String r = "";
  
  private aw s;
  
  private ay t;
  
  private final int[][] u;
  
  private gb v;
  
  private gb w;
  
  private gb x;
  
  private gb y;
  
  private oa z;
  
  private final d A;
  
  private final d B;
  
  private final d C;
  
  private final d D;
  
  private final d E;
  
  private final d F;
  
  public or(oa paramoa) {
    super(103, 8, "Xếp Hạng", false);
    this.z = paramoa;
    a(this);
    a(new ba());
    d(v.t);
    e(v.u - ba.a);
    int i = e() / 10;
    this.u = new int[][] { { 10, (i << 1) + 10, 10 + (i << 3) }, { 10, (i << 1) + 10, i << 3 } };
    this.t = new ay(0);
    this.t.a(c(), d() + 50, e(), f() - 60);
    this.t.h(1);
    this.s = new aw();
    this.s.a(this);
    this.s.a(this);
    this.s.e(true);
    this.t.b(this.s);
    this.y = new gb(5, 1);
    this.v = new gb(3, 0);
    this.w = new gb(2, 2);
    this.x = new gb(1, 3);
    c(a.n);
    a(this.v);
    b(this.y);
    this.A = a.g;
    this.A.c(true);
    this.B = a.g;
    this.F = bx.c;
    this.C = new if(new int[] { 16711680, 16777215 });
    this.D = new if(new int[] { 32512, 16777215 });
    this.E = new if(new int[] { 127, 16777215 });
  }
  
  public final void x() {}
  
  public final void y() {}
  
  public final void d(int paramInt1, int paramInt2) {
    or or1;
    bs bs;
    int i;
    switch (paramInt2) {
      case 5:
        ((fc)this.b).a();
        return;
      case 1:
        if (this.l != null) {
          t();
          return;
        } 
        this.z.z();
        return;
      case 3:
        or1 = this;
        bs = new bs();
        if (or1.q == 0) {
          bs.a(new br[] { new br(gs.d[1], 9), new br("Tải lại", 10), new br("Đóng", 11) });
        } else {
          bs.a(new br[] { new br(gs.d[0], 8), new br("Tải lại", 10), new br("Đóng", 11) });
        } 
        i = (bs.e() > bs.f()) ? bs.e() : bs.f();
        bs.a_(-i, or1.f() - bs.f() + i);
        bs.d(0, v.u - ba.a - bs.f());
        bs.a(or1);
        or1.a(bs);
        bs.c(a.n);
        bs.a(or1.w);
        bs.b(or1.x);
        return;
      case 2:
        this.l.f(95);
        t();
        break;
    } 
  }
  
  public final aq a(aw paramaw, int paramInt) {
    Object object;
    return (aq)((object = paramaw.i(paramInt) instanceof fy) ? object : ((object instanceof dp) ? new gl(15) : null));
  }
  
  public final void b(aq paramaq, int paramInt) {
    Object object;
    if (object = this.s.i(paramInt) instanceof fy) {
      this.r = (this.p[this.q][paramInt]).c;
      object = this;
      bs bs = new bs();
      if (a.m != null && a.o) {
        bs.a(new br[] { new br("Xem ME", 6), new br("Chi Tiết", 7) });
      } else {
        bs.a(new br[] { new br("Chi Tiết", 7) });
      } 
      int j = ((or)object).s.s();
      aq aq1 = ((or)object).s.o(j);
      k k = ((or)object).t.r();
      int m = (v.t - bs.e()) / 2;
      int i;
      if ((i = ((or)object).t.d() + aq1.d() - k.b) + bs.f() > v.u - ba.a)
        i = v.u - ba.a - bs.f(); 
      bs.a_(v.t + bs.e(), i);
      bs.d(m, i);
      bs.a((bg)object);
      bs.a(((or)object).w);
      bs.b(((or)object).x);
      bs.c(a.n);
      bs.a_(1);
      object.a(bs);
    } 
  }
  
  public final void a(bs parambs) {
    v.c();
    this.l = parambs;
    c(true);
  }
  
  public final void t() {
    v.c();
    this.l = null;
    c(true);
  }
  
  public final void a(aq paramaq, int paramInt) {}
  
  public final void a(aq paramaq, int paramInt1, int paramInt2) {}
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    paramGraphics.setColor(v.am);
    paramGraphics.fillRect(c(), d(), e(), f());
    this.A.a(paramGraphics, gs.c[this.q], c() + e() / 2, d() + 5, 1);
    pc.a(paramGraphics, 10 + c(), 25 + d(), e() - 20);
    paramInt1 = 30 + d();
    this.B.a(paramGraphics, gs.e[this.q][0], this.u[this.q][0] - 5 + c(), paramInt1, 0);
    this.B.a(paramGraphics, gs.e[this.q][1], this.u[this.q][1] + c(), paramInt1, 0);
    this.B.a(paramGraphics, gs.e[this.q][2], this.u[this.q][2] + c(), paramInt1, 0);
    this.t.c(true);
    this.t.a(paramGraphics, c(), d());
    pc.d(paramGraphics, c(), d(), e(), f(), -1);
  }
  
  public final void n() {
    this.t.n();
  }
  
  public final boolean f(int paramInt) {
    return this.t.f(paramInt);
  }
  
  public final boolean c(int paramInt1, int paramInt2) {
    return this.t.c(paramInt1, paramInt2);
  }
  
  public final boolean e(int paramInt1, int paramInt2) {
    return this.t.e(paramInt1, paramInt2);
  }
  
  public final boolean f(int paramInt1, int paramInt2) {
    return this.t.f(paramInt1, paramInt2);
  }
  
  public final void a(int paramInt1, int paramInt2, Object paramObject) {
    if (paramObject == null)
      return; 
    br br = (br)paramObject;
    switch (paramInt2) {
      case 7:
        ks.a().a(this.r, (byte)103);
        a.s().a(null, null);
        break;
      case 11:
        this.z.z();
        break;
      case 6:
        if (a.m != null)
          a.m.a(this.r, 0L); 
        break;
      case 11399:
        if (a.m != null)
          a.m.b(br.b()); 
        break;
      case 10:
        if (this.q == 1) {
          a.s().R();
          break;
        } 
        a.s().Q();
        break;
      case 9:
        if ((this.p[1]).length > 0) {
          a(1, this.p[1]);
          break;
        } 
        a.s().R();
        break;
      case 8:
        if ((this.p[0]).length > 0) {
          a(0, this.p[0]);
          break;
        } 
        a.s().Q();
        break;
      default:
        if (a.m != null)
          a.m.j(paramInt2); 
        break;
    } 
    t();
  }
  
  public final void a(int paramInt, dh[] paramArrayOfdh) {
    this.q = paramInt;
    this.p[paramInt] = paramArrayOfdh;
    this.s.q();
    for (paramInt = 0; paramInt < paramArrayOfdh.length; paramInt++) {
      fy fy;
      (fy = new fy(paramArrayOfdh[paramInt])).a(this.u[this.q]);
      if (paramInt == 0) {
        fy.a(this.C);
      } else if (paramInt < 3) {
        fy.a(this.D);
      } else if (paramInt < 10) {
        fy.a(this.E);
      } else {
        fy.a(this.F);
      } 
      if (paramInt % 2 == 0)
        fy.e(true); 
      this.s.a(fy);
    } 
    c(true);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\or.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */