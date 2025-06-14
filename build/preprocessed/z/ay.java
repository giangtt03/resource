import javax.microedition.lcdui.Graphics;

public final class ay extends aq {
  private int i = 0;
  
  private int j = 0;
  
  private j k;
  
  private aq l;
  
  private bt m;
  
  private bt n;
  
  private k o;
  
  private k p;
  
  private boolean q = true;
  
  private boolean r = false;
  
  private int s = 50;
  
  private cu t = new cu(-1987, -1987);
  
  private boolean u = false;
  
  private long v = -1L;
  
  public ay() {
    this(0);
  }
  
  public ay(int paramInt) {
    this.i = paramInt;
    ag.b();
    this.m = ah.h(2);
    ag.b();
    this.n = ah.h(1);
    this.o = new k();
    this.p = new k();
    byte b2 = 100;
    byte b1 = 100;
    ay ay1;
    (ay1 = this).b(b1, b2);
    d(true);
  }
  
  public final void e(boolean paramBoolean) {
    this.q = false;
  }
  
  public final void h(int paramInt) {
    this.j = paramInt;
  }
  
  public final void b(aq paramaq) {
    if (this.l != null)
      this.l.b = null; 
    if (paramaq != null && paramaq instanceof bu) {
      this.l = paramaq;
      this.l.a(this);
      this.r = true;
      x();
    } 
  }
  
  private void x() {
    bu bu;
    g g1 = (bu = (bu)this.l).v();
    g g3 = g1;
    ay ay1;
    g g4 = (ay1 = this).g();
    j j2 = ay1.a();
    int m = g4.a - ay1.k.b - j2.d;
    int i = g4.b - ay1.k.a - j2.c;
    if (ay1.i != 2 && ay1.i == 0);
    m = m;
    i = i;
    g g2 = new g(m, i);
    j j1 = a();
    if (this.r || this.l.e() != g2.a || this.l.f() != g2.b) {
      this.l.a(j1.b + c(), d() + j1.a, g2.a, g2.b);
      this.r = false;
    } 
    this.n.b(this.n.q(), g2.a, 0, g1.a);
    this.n.a(c() + j1.b, d() + g2.b, e() - j1.b - j1.d, this.n.f());
    this.m.b(this.m.q(), g2.b, 0, g1.b);
    this.m.a(c() + j1.b + g2.a, d() + j1.a, this.m.e(), f() - j1.a - j1.c);
    this.o.a(this.n.q(), this.m.q(), this.n.r(), this.m.r());
    this.p.a(this.n.q(), this.m.q(), this.n.r(), this.m.r());
  }
  
  public final j a() {
    if (this.k == null)
      this.k = new j(0, 0, 0, 0); 
    return this.k;
  }
  
  public final void b(int paramInt1, int paramInt2) {
    super.b(paramInt1, paramInt2);
  }
  
  public final void a(j paramj) {
    this.k = paramj;
    x();
  }
  
  public final k q() {
    return this.o;
  }
  
  public final k r() {
    return this.p;
  }
  
  private void y() {
    this.p.a = this.n.q();
    this.p.b = this.m.q();
  }
  
  public final void d(int paramInt1, int paramInt2) {
    int i = ((bu)this.l).w();
    int m = i;
    i = paramInt2;
    paramInt2 = paramInt1;
    ay ay1 = this;
    if (i < 0)
      m = -m; 
    if (paramInt2 == 1) {
      ay1.i(m);
      return;
    } 
    ay1.j(m);
  }
  
  public final void i(int paramInt) {
    if (this.j == 0) {
      if (this.o.a < 0 || this.o.a + this.n.r() > this.n.a()) {
        this.o.a += paramInt / 3;
        Math.abs(paramInt);
        return;
      } 
      paramInt += this.n.q();
      if (this.n.r() < this.n.a()) {
        if (paramInt < 0 && this.o.a <= 0) {
          this.o.a = paramInt;
        } else if (paramInt + this.o.c > this.n.a() && this.o.a >= this.n.q()) {
          this.o.a = paramInt;
        } 
        this.n.h(paramInt);
      } else {
        this.n.h(paramInt);
        this.o.a = this.n.q();
      } 
    } else {
      this.n.h(this.n.q() + paramInt);
    } 
    y();
  }
  
  public final void j(int paramInt) {
    if (this.j == 0) {
      if (this.o.b < 0 || this.o.b + this.m.r() > this.m.a()) {
        if (Math.abs(paramInt) > 3)
          paramInt /= 3; 
        if (Math.abs(paramInt) > 30)
          if (paramInt < 0) {
            paramInt = -30;
          } else {
            paramInt = 30;
          }  
        this.o.b += paramInt;
        return;
      } 
      paramInt += this.m.q();
      if (this.m.r() < this.m.a()) {
        if (paramInt < 0 && this.o.b <= 0) {
          this.o.b = paramInt;
        } else if (paramInt + this.o.d > this.m.a() && this.o.b >= this.m.q()) {
          this.o.b = paramInt;
        } 
        this.m.h(paramInt);
      } else {
        this.m.h(paramInt);
        this.o.b = this.m.q();
      } 
    } else {
      this.m.h(this.m.q() + paramInt);
    } 
    y();
  }
  
  public final boolean s() {
    return (this.m.q() + this.m.r() >= this.m.a());
  }
  
  public final boolean t() {
    return (this.m.q() <= 0);
  }
  
  public final boolean u() {
    return (this.n.q() <= 0);
  }
  
  public final boolean v() {
    return (this.n.q() + this.n.r() >= this.n.a());
  }
  
  public final void k(int paramInt) {
    this.m.h(paramInt);
    this.o.b = this.m.q();
    y();
  }
  
  public final void f(boolean paramBoolean) {
    this.m.h(0);
    y();
  }
  
  public final void g(boolean paramBoolean) {
    this.m.h(this.m.a());
    y();
    if (!paramBoolean)
      this.o.b = this.m.q(); 
  }
  
  public final void h(boolean paramBoolean) {
    this.n.h(0);
    y();
  }
  
  public final void i(boolean paramBoolean) {
    this.n.h(this.n.a() - this.n.r());
    y();
  }
  
  public final aq w() {
    return this.l;
  }
  
  public final void n() {
    if (this.l == null)
      return; 
    if (this.v > 0L && System.currentTimeMillis() - this.v > 100L) {
      this.v = -1L;
      if (this.m.q() != this.o.b) {
        k(this.o.b);
        this.u = true;
      } 
      if (this.n.q() != this.o.a) {
        int m = this.o.a;
        ay ay1;
        (ay1 = this).n.h(m);
        ay1.o.a = ay1.n.q();
        ay1.y();
        this.u = true;
      } 
      if (this.t.a >= 0 && this.t.b >= 0)
        this.l.c(this.t.a + this.o.a, this.t.b + this.o.b); 
    } 
    int i = 0;
    if (this.u && (this.o.b < 0 || this.o.b + this.m.r() > this.m.a())) {
      i = 1;
    } else {
      if (this.n.q() != this.o.a) {
        if (Math.abs(i = this.n.q() - this.o.a) > 3)
          i /= 3; 
        if (v.z && Math.abs(i) > this.s)
          if (i < 0) {
            i = -this.s;
          } else {
            i = this.s;
          }  
        this.o.a += i;
        i = 1;
      } 
      if (this.m.q() != this.o.b) {
        if (Math.abs(i = this.m.q() - this.o.b) > 3)
          i /= 3; 
        if (v.z && Math.abs(i) > this.s)
          if (i < 0) {
            i = -this.s;
          } else {
            i = this.s;
          }  
        this.o.b += i;
        i = 1;
      } 
    } 
    if (i != 0)
      c(true); 
    this.l.n();
  }
  
  public final void c(boolean paramBoolean) {
    super.c(paramBoolean);
    if (this.l != null)
      this.l.c(paramBoolean); 
  }
  
  public final boolean k() {
    return (this.l != null) ? this.l.k() : super.k();
  }
  
  public final boolean m() {
    return (this.l != null) ? this.l.m() : super.m();
  }
  
  public final void d(boolean paramBoolean) {
    super.d(paramBoolean);
    if (this.l != null)
      this.l.d(paramBoolean); 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (this.l != null) {
      this.l.a(paramGraphics, paramInt1, paramInt2);
      if (this.q && this.i != 2) {
        if (this.m.r() < this.m.a())
          this.m.a(paramGraphics, paramInt1, paramInt2); 
        if (this.n.r() < this.n.a())
          this.n.a(paramGraphics, paramInt1, paramInt2); 
      } 
      c(false);
    } 
  }
  
  public final boolean f(int paramInt) {
    if (this.l != null) {
      boolean bool;
      if (!(bool = this.l.f(paramInt)))
        switch (paramInt) {
          case 99:
            if (t())
              return false; 
            d(2, -1);
            return true;
          case 98:
            if (s())
              return false; 
            d(2, 1);
            return true;
          case 97:
            if (u())
              return false; 
            d(1, -1);
            return true;
          case 96:
            if (v())
              return false; 
            d(1, 1);
            return true;
        }  
      return bool;
    } 
    return false;
  }
  
  public final boolean g(int paramInt) {
    return (this.l != null) ? this.l.g(paramInt) : false;
  }
  
  public final boolean c(int paramInt1, int paramInt2) {
    if (this.l.h().a(paramInt1, paramInt2)) {
      if (!m())
        d(true); 
      this.u = false;
      this.v = System.currentTimeMillis();
      this.t.a = paramInt1;
      this.t.b = paramInt2;
      return true;
    } 
    return this.n.h().a(paramInt1, paramInt2) ? this.n.c(paramInt1, paramInt2) : (this.m.h().a(paramInt1, paramInt2) ? this.m.c(paramInt1, paramInt2) : false);
  }
  
  public final boolean f(int paramInt1, int paramInt2) {
    if (this.u) {
      this.u = false;
      if (this.t.a >= 0 && this.t.b >= 0) {
        paramInt1 = (paramInt1 - this.t.a) / 15 * 180;
        paramInt2 = (paramInt2 - this.t.b) / 15 * 180;
        if (paramInt1 != 0)
          i(-paramInt1); 
        if (paramInt2 != 0)
          j(-paramInt2); 
      } 
      this.t.a = this.t.b = -1;
      return true;
    } 
    if (this.v >= 0L && !this.u && this.t.a >= 0 && this.t.b >= 0 && this.l != null && this.l.c(this.t.a + this.o.a, this.t.b + this.o.b)) {
      this.t.a = -1;
      this.t.b = -1;
      this.v = -1L;
      this.u = false;
      return true;
    } 
    this.t.a = -1;
    this.t.b = -1;
    this.v = -1L;
    this.u = false;
    this.u = false;
    return this.n.h().a(paramInt1, paramInt2) ? this.n.f(paramInt1, paramInt2) : (this.m.h().a(paramInt1, paramInt2) ? this.m.f(paramInt1, paramInt2) : false);
  }
  
  public final boolean e(int paramInt1, int paramInt2) {
    this.v = -1L;
    if (this.t.a >= 0 && this.t.b >= 0) {
      if (this.u) {
        this.t.a += paramInt1;
        this.t.b += paramInt2;
      } 
      this.u = true;
      if (paramInt1 != 0)
        i(-paramInt1); 
      if (paramInt2 != 0)
        j(-paramInt2); 
      return true;
    } 
    return false;
  }
  
  public final void o() {
    x();
  }
  
  public final void p() {
    x();
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ay.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */