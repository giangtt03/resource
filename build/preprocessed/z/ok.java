import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class ok extends fb implements bf, bg, bn, bq {
  aw p;
  
  private ay t;
  
  fa[] q;
  
  fa[][] r;
  
  public boolean s = false;
  
  private ex u;
  
  private String[] v;
  
  private int w = 0;
  
  public ok() {
    super(110, 4, "Kho Game", false);
    a(0, 0, v.t, v.u);
    this.v = bx.a("Cài đặt MIỄN PHÍ vô số trò chơi và ứng dụng cực kỳ hấp dẫn. Ngoài ra, bạn còn có cơ hội nhận ngay các phần quà GIÁ TRỊ từ hệ thống.", v.t, bx.d);
    this.u = new ex("Kho Game", -2);
    this.u.a((v.t - 100) / 2, 10 + bx.d.a() + 10 + 10 + bx.d.a() * this.v.length, 100, 20);
    this.t = new ay(0);
    this.t.a(c(), bx.d.a() + 10, e(), f() - bx.d.a() - 10 - ba.a);
    this.p = new aw();
    this.p.a(this);
    this.p.a(this);
    this.p.e(true);
    this.t.b(this.p);
    a(new ba());
    a(new gb(-1, 0));
    b(new gb(-2, 1));
    c(a.n);
    a(this);
    boolean bool = false;
    ok ok1;
    (ok1 = this).w = 0;
    ok1.u.d(true);
    ok1.c(true);
  }
  
  public final void c(boolean paramBoolean) {
    super.c(paramBoolean);
    if (paramBoolean && this.w == 4)
      this.t.c(true); 
  }
  
  public final void x() {
    this.s = false;
    c(true);
  }
  
  public final void y() {}
  
  public final boolean f(int paramInt) {
    if (paramInt == 97 || paramInt == 96)
      return false; 
    if (this.w == 0) {
      if (paramInt == 95) {
        v();
        return true;
      } 
      return false;
    } 
    return this.t.f(paramInt);
  }
  
  private static void v() {
    a.s().a(null, null);
    du.a().n();
  }
  
  public final boolean c(int paramInt1, int paramInt2) {
    if (this.w == 0) {
      if (this.u.h().b(paramInt1, paramInt2)) {
        f(95);
        return true;
      } 
    } else {
      return this.t.c(paramInt1, paramInt2);
    } 
    return super.c(paramInt1, paramInt2);
  }
  
  public final boolean e(int paramInt1, int paramInt2) {
    return (this.w != 0) ? this.t.e(paramInt1, paramInt2) : super.e(paramInt1, paramInt2);
  }
  
  public final boolean f(int paramInt1, int paramInt2) {
    return (this.w != 0) ? this.t.f(paramInt1, paramInt2) : super.f(paramInt1, paramInt2);
  }
  
  public final void n() {
    if (this.w != 0)
      this.t.n(); 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (this.w == 0) {
      if (this.c) {
        a(paramGraphics);
        bx.d.c(true);
        bx.d.a(paramGraphics, "Giới thiệu", v.t >>> 1, 10, 1);
        bx.d.c();
        paramInt1 = 10 + 10 + bx.d.a();
        bx.a(paramGraphics, bx.d, this.v, 0, paramInt1, v.t, v.u, 1);
        this.u.a(paramGraphics, c(), d());
        c(false);
        return;
      } 
    } else {
      boolean bool;
      if (bool = this.t.k()) {
        a(paramGraphics);
        pc.a(paramGraphics, 4, 20, v.t - 8);
        bx.d.c(true);
        bx.d.a(paramGraphics, "Kho Game", e() / 2, 2, 1);
        bx.d.c();
      } 
      this.t.a(paramGraphics, c(), d());
    } 
  }
  
  private void a(Graphics paramGraphics) {
    paramGraphics.setColor(v.am);
    paramGraphics.fillRect(c(), d(), e(), f());
    paramGraphics.drawImage(pc.d, c() + e(), d() + f() - ba.a, 40);
  }
  
  public final void a(ea[] paramArrayOfea) {
    if (paramArrayOfea == null) {
      a.s().v();
      return;
    } 
    this.w = 4;
    this.q = new fa[paramArrayOfea.length];
    this.r = new fa[paramArrayOfea.length][];
    for (byte b = 0; b < paramArrayOfea.length; b++)
      this.q[b] = new fa(true, paramArrayOfea[b].d(), String.valueOf(paramArrayOfea[b].b()) + "(" + paramArrayOfea[b].e() + ")", paramArrayOfea[b].b(), paramArrayOfea[b].e(), this.p.e()); 
    this.p.q();
    this.p.a((Object[])this.q);
    a.s().v();
  }
  
  public final void a() {
    if (this.q == null)
      return; 
    int i = 0;
    for (byte b = 0; b < this.q.length; b++) {
      i++;
      if ((this.q[b]).i && this.r[b] != null && (this.r[b]).length > 0) {
        i += (this.r[b]).length;
        if ((this.r[b]).length < (this.q[b]).l)
          i++; 
      } 
    } 
    Object[] arrayOfObject = new Object[i];
    i = 0;
    int j;
    for (j = 0; j < this.q.length; j++) {
      arrayOfObject[i++] = this.q[j];
      if ((this.q[j]).i && this.r[j] != null && (this.r[j]).length > 0) {
        for (byte b1 = 0; b1 < (this.r[j]).length; b1++)
          arrayOfObject[i++] = this.r[j][b1]; 
        if ((this.r[j]).length < (this.q[j]).l)
          arrayOfObject[i++] = new dp("Xem thêm", String.valueOf((this.q[j]).k) + '\032' + (this.r[j]).length); 
      } 
    } 
    j = this.p.s();
    int k = (this.t.r()).b;
    synchronized (this.p) {
      this.p.q();
      this.p.a(arrayOfObject);
      this.p.k(j);
      j = k;
      ok ok1;
      aq aq1 = (ok1 = this).p.o(ok1.p.s());
      aq aq2;
      if (ok1.p.s() < ok1.p.a() - 1 && (aq2 = ok1.p.o(ok1.p.s() + 1)).d() + aq2.f() - j > ok1.p.f())
        j = aq2.d() + aq2.f() - ok1.p.f(); 
      if (aq1.d() + aq1.f() - j > ok1.p.f())
        j = aq1.d() + aq1.f() - ok1.p.f(); 
      ok1.t.k(j);
      c(true);
      return;
    } 
  }
  
  public final void d(int paramInt1, int paramInt2) {
    ok ok1;
    bs bs;
    br[] arrayOfBr;
    int i;
    switch (paramInt2) {
      case -1:
        ok1 = this;
        (bs = new bs()).a(new gb(0, 2));
        bs.b(new gb(1, 3));
        if (ok1.w == 0) {
          arrayOfBr = new br[] { new br("Kho Game", 6), new br("Đóng", 5) };
        } else {
          arrayOfBr = new br[] { new br("Đóng", 5) };
        } 
        if (a.m != null) {
          arrayOfBr = a.m.a(arrayOfBr, arrayOfBr.length - 1);
          arrayOfBr = oi.b(arrayOfBr, arrayOfBr.length - 1);
        } 
        bs.a(arrayOfBr);
        i = (bs.e() > bs.f()) ? bs.e() : bs.f();
        bs.a_(-i, v.u);
        bs.d(0, v.u - ba.a - bs.f());
        bs.a(ok1);
        ok1.a(bs);
        return;
      case 1:
        t();
        return;
      case 0:
        this.l.f(95);
        return;
      case 5:
        this.s = true;
        if (this.b != null) {
          ((fc)this.b).d(this);
          return;
        } 
        return;
    } 
    ((fc)this.b).a();
  }
  
  public final void a(int paramInt1, int paramInt2, Object paramObject) {
    if (paramObject == null)
      return; 
    br br = (br)paramObject;
    switch (paramInt2) {
      case 5:
        this.s = true;
        if (this.b != null)
          ((fc)this.b).d(this); 
        break;
      case 6:
        v();
        break;
      case 11399:
        if (a.m != null)
          a.m.b(br.b()); 
        break;
      default:
        if (a.m != null)
          a.m.j(paramInt2); 
        break;
    } 
    t();
  }
  
  private static void a(long paramLong, int paramInt) {
    a.s().a(null, null);
    du.a().a(paramLong, paramInt);
  }
  
  public final void b(aq paramaq, int paramInt) {
    String str;
    if (this.p.i(paramInt) instanceof dp) {
      dp dp;
      int i = (str = (String)(dp = (dp)this.p.i(paramInt)).b).indexOf("\032");
      long l = Long.parseLong(str.substring(0, i));
      i = Integer.parseInt(str.substring(i + 1));
      a(l, i);
      return;
    } 
    if (((fa)(paramaq = (fa)this.p.i(str))).j) {
      for (byte b = 0; b < this.q.length; b++) {
        if (this.q[b].equals(paramaq)) {
          if (this.r[b] != null) {
            ((fa)paramaq).i = !((fa)paramaq).i;
            a();
            return;
          } 
          a(((fa)paramaq).k, 0);
        } 
      } 
      return;
    } 
    a.s().a(null, null);
    du.a().b(((fa)paramaq).k);
  }
  
  public final void a(aq paramaq, int paramInt) {}
  
  public final void a(aq paramaq, int paramInt1, int paramInt2) {}
  
  public final aq a(aw paramaw, int paramInt) {
    return (paramaw.i(paramInt) instanceof dp) ? new gl(25) : (aq)paramaw.i(paramInt);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ok.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */