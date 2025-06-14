import javax.microedition.lcdui.Graphics;

public final class aw extends aq implements bp, bu {
  private bo i;
  
  private bn j;
  
  private int k = -1;
  
  private int l = 0;
  
  private bq m;
  
  private a n;
  
  private k o;
  
  private boolean p;
  
  private boolean q = false;
  
  public aw() {
    bm bm = new bm();
    aw aw1;
    if ((aw1 = this).i != null)
      aw1.i.a((bp)null); 
    aw1.i = bm;
    if (aw1.i != null)
      aw1.i.a(aw1); 
    if (aw1.b != null)
      aw1.b.o(); 
    a(new bl());
    b(20, 20);
    this.o = new k();
    this.g = true;
  }
  
  public final void e(boolean paramBoolean) {
    this.p = true;
  }
  
  public final void h(int paramInt) {
    this.l = paramInt;
  }
  
  public final void a(bn parambn) {
    this.j = parambn;
    z();
    if (this.b != null)
      this.b.o(); 
  }
  
  private void z() {
    this.n = new a();
    byte b = 0;
    int i = a();
    while (b < i) {
      this.n.a(this.j.a(this, b));
      b++;
    } 
    k(0);
    B();
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.a(paramInt1, paramInt2, paramInt3, paramInt4);
    z();
  }
  
  public final void a(Object[] paramArrayOfObject) {
    a(paramArrayOfObject, a());
  }
  
  public final void a(Object[] paramArrayOfObject, int paramInt) {
    this.i.a(paramArrayOfObject, paramInt);
  }
  
  public final void a(Object paramObject) {
    a(paramObject, a());
  }
  
  public final void a(Object paramObject, int paramInt) {
    this.i.a(paramObject, paramInt);
  }
  
  public final Object i(int paramInt) {
    return this.i.a(paramInt);
  }
  
  public final int a() {
    return this.i.a();
  }
  
  public final void b(Object paramObject) {
    this.i.a(paramObject);
  }
  
  public final void j(int paramInt) {
    this.i.b(paramInt);
  }
  
  public final void q() {
    this.i.b();
  }
  
  public final void b(Object paramObject, int paramInt) {
    this.i.b(paramObject, paramInt);
  }
  
  public final Object r() {
    return this.i.a(this.i.a() - 1);
  }
  
  public final void k(int paramInt) {
    int i = this.k;
    this.k = paramInt;
    for (byte b = 0; b < this.n.d(); b++) {
      aq aq1;
      (aq1 = (aq)this.n.b(b)).d(false);
    } 
    if (this.k >= 0 && this.k < a()) {
      aq aq1;
      (aq1 = (aq)this.n.b(this.k)).d(true);
    } 
    if ((i != this.k || a() > 1) && this.m != null)
      this.m.a(this, i, paramInt); 
    B();
  }
  
  public final int s() {
    return this.k;
  }
  
  public final Object t() {
    return i(this.k);
  }
  
  public final aq u() {
    return o(this.k);
  }
  
  public final void a(bq parambq) {
    this.m = parambq;
  }
  
  public final void f(boolean paramBoolean) {
    this.q = true;
  }
  
  private k A() {
    return (this.b != null) ? ((ay)this.b).r() : new k(0, 0, e(), f());
  }
  
  public final void n() {
    try {
      byte b = 0;
      int i = this.i.a();
      while (b < i) {
        Object object;
        if ((object = this.n.b(b)) != null)
          (object = this.n.b(b)).n(); 
        b++;
      } 
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } 
  }
  
  public final void d(boolean paramBoolean) {
    super.d(paramBoolean);
    c(true);
  }
  
  public final void c(boolean paramBoolean) {
    super.c(paramBoolean);
    if (paramBoolean && this.n != null)
      for (paramBoolean = false; paramBoolean < this.n.d(); paramBoolean++)
        ((aq)this.n.b(paramBoolean)).c(true);  
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    cw.a(paramGraphics, this.o);
    int j = paramInt2;
    int i = paramInt1;
    Graphics graphics = paramGraphics;
    aw aw1;
    if ((aw1 = this).n != null) {
      cw.a(graphics, aw1.o, aw1.c() + i, aw1.d() + j, aw1.e(), aw1.f());
      k k1;
      aw aw2;
      int m = (k1 = ((aw2 = aw1).b != null) ? ((ay)aw2.b).q() : new k(0, 0, aw2.e(), aw2.f())).b + k1.d;
      i = i + aw1.c() - k1.a;
      j = j + aw1.d() - k1.b;
      byte b = 0;
      int n = aw1.n.d();
      while (b < n) {
        Object object;
        if ((object = aw1.n.b(b)) != null) {
          object = aw1.n.b(b);
          if (!k1.a(object.h())) {
            if (object.d() + object.f() > m)
              break; 
          } else {
            object.a(graphics, i, j);
          } 
        } 
        b++;
      } 
    } 
    cw.c(paramGraphics, this.o);
  }
  
  public final g v() {
    int i = 0;
    int j = 0;
    byte b = 0;
    int m = this.i.a();
    while (b < m) {
      aq aq1 = (aq)this.n.b(b);
      i += aq1.f() + this.l;
      if (j < aq1.e())
        j = aq1.e(); 
      b++;
    } 
    i += 6;
    return new g((j < e()) ? e() : j, (i < f()) ? f() : i);
  }
  
  public final int w() {
    return 20;
  }
  
  public final boolean c(int paramInt1, int paramInt2) {
    if (a() <= 0)
      return false; 
    paramInt2 -= d();
    paramInt1 -= c();
    boolean bool = false;
    byte b = 0;
    int i = this.i.a();
    while (b < i) {
      aw aw1;
      aq aq1;
      if ((aq1 = (aq)this.n.b(b)).h().a(paramInt1, paramInt2)) {
        if (!this.g)
          d(true); 
        k(b);
        boolean bool1;
        if (bool1 = ((aq)this.n.b((aw1 = this).k)).c(paramInt1, paramInt2))
          return true; 
        f(95);
        return true;
      } 
      if (aw1 + aq1.f() <= paramInt2) {
        int j = aw1 + aq1.f() + this.l;
        b++;
        continue;
      } 
      break;
    } 
    return false;
  }
  
  public final boolean x() {
    if (this.b == null) {
      if (this.p) {
        int i = this.k - 1;
        if (this.k < 0)
          this.k = a() - 1; 
        k(i);
        return true;
      } 
      if (this.k > 0) {
        k(this.k - 1);
        return true;
      } 
      return false;
    } 
    k k1 = A();
    ay ay = (ay)this.b;
    return a(ay, k1, -1);
  }
  
  public final boolean y() {
    if (this.b == null) {
      if (this.p) {
        int i = this.k + 1;
        if (this.k >= a())
          this.k = 0; 
        k(i);
        return true;
      } 
      if (this.k < a() - 1) {
        k(this.k - 1);
        return true;
      } 
      return false;
    } 
    k k1 = A();
    ay ay = (ay)this.b;
    return a(ay, k1, 1);
  }
  
  public final boolean f(int paramInt) {
    if (this.k < 0 || this.n.d() <= 0)
      return false; 
    aw aw1;
    boolean bool;
    if (bool = ((aq)this.n.b((aw1 = this).k)).f(paramInt))
      return true; 
    if (paramInt >= 96 && paramInt <= 99) {
      if (paramInt == 99)
        return x(); 
      if (paramInt == 98)
        return y(); 
      if (this.b == null)
        return false; 
      ay ay = (ay)this.b;
      switch (paramInt) {
        case 97:
          if (ay.u())
            return false; 
          ay.d(1, -1);
          return true;
        case 96:
          if (ay.v())
            return false; 
          ay.d(1, 1);
          return true;
      } 
    } else if (paramInt == 95) {
      if (this.m != null && this.k >= 0 && this.k < a())
        this.m.b(this, this.k); 
      return true;
    } 
    return false;
  }
  
  public final boolean g(int paramInt) {
    aw aw1;
    return (this.k < 0 || this.n.d() <= 0) ? false : ((aq)this.n.b((aw1 = this).k)).g(paramInt);
  }
  
  private boolean a(ay paramay, k paramk, int paramInt) {
    int i = g(0, this.k - 1);
    aq aq1;
    int j = (aq1 = (aq)this.n.b(this.k)).f();
    int m = 0;
    if (paramInt < 0) {
      if (this.k > 0) {
        if (this.q) {
          if (i + this.l > paramk.b + paramk.d / 2 || paramay.t())
            k(this.k - 1); 
          paramay.d(2, -1);
          return true;
        } 
        aq aq2;
        paramInt = (aq2 = (aq)this.n.b(this.k - 1)).f();
        int n;
        if ((n = i - this.l - paramInt) + paramInt > paramk.b + 5) {
          k(this.k - 1);
          i = g(0, this.k - 1);
          j = (aq2 = (aq)this.n.b(this.k)).f();
          if (i <= paramk.b) {
            m = i - paramk.b;
            if (j >= paramk.d) {
              m += j - paramk.d;
            } else if (this.k > 0) {
              aq aq3 = (aq)this.n.b(this.k - 1);
              if (i - m + aq3.f() + j > paramk.b + paramk.d) {
                m -= paramk.d - j;
              } else {
                m -= aq3.f();
              } 
            } 
          } 
        } else {
          paramay.d(2, -1);
          return true;
        } 
      } else {
        if (this.p) {
          k(a() - 1);
          paramay.g(true);
        } else {
          if (paramay.t())
            return false; 
          paramay.d(2, -1);
        } 
        return true;
      } 
    } else if (this.k < a() - 1) {
      if (this.q) {
        if (i + j + this.l < paramk.b + paramk.d / 2 || paramay.s())
          k(this.k + 1); 
        paramay.d(2, 1);
        return true;
      } 
      this.n.b(this.k + 1);
      if ((paramInt = i + j + this.l) < paramk.b + paramk.d - 5) {
        k(this.k + 1);
        i = g(0, this.k - 1);
        aq aq2;
        int n = (aq2 = (aq)this.n.b(this.k)).f();
        if (i + n >= paramk.b + paramk.d) {
          m = i + n - paramk.b - paramk.d;
          if (n >= paramk.d) {
            m -= n - paramk.d;
          } else if (this.k < a() - 1) {
            aq aq3 = (aq)this.n.b(this.k + 1);
            if (i - m - aq3.f() < paramk.b) {
              m += paramk.d - n;
            } else {
              m += aq3.f();
            } 
          } 
        } 
      } else {
        paramay.d(2, 1);
        return true;
      } 
    } else {
      if (this.p) {
        k(0);
        paramay.f(true);
      } else {
        if (paramay.s())
          return false; 
        paramay.d(2, 1);
      } 
      return true;
    } 
    paramay.j(m);
    return true;
  }
  
  private int g(int paramInt1, int paramInt2) {
    for (int i = 0; paramInt1 <= paramInt2; i += aq1.f() + this.l)
      aq aq1 = (aq)this.n.b(paramInt1++); 
    return i;
  }
  
  public final void l(int paramInt) {
    aq aq1;
    (aq1 = this.j.a(this, paramInt)).a(this);
    this.n.a(aq1, paramInt);
    if (this.m != null)
      this.m.a(this, paramInt); 
    if (this.k == paramInt)
      aq1.d(true); 
    B();
    if (this.b != null)
      this.b.o(); 
  }
  
  public final void d(int paramInt1, int paramInt2) {
    int i = paramInt1;
    paramInt1 += paramInt2;
    while (i < paramInt1) {
      aq aq1;
      (aq1 = this.j.a(this, i)).a(this);
      this.n.b(aq1, i);
      i++;
    } 
    k((this.k < 0) ? 0 : this.k);
    if (this.b != null)
      this.b.o(); 
  }
  
  public final void m(int paramInt) {
    aq aq1;
    (aq1 = this.j.a(this, paramInt)).a(this);
    this.n.b(aq1, paramInt);
    k((this.k < 0) ? 0 : this.k);
    if (this.b != null)
      this.b.o(); 
  }
  
  public final void n(int paramInt) {
    if (paramInt < 0) {
      this.k = -1;
      this.n.a();
      if (this.b != null)
        this.b.p(); 
      return;
    } 
    this.n.a(paramInt);
    if (this.k > a() - 1)
      this.k = a() - 1; 
    k(this.k);
    if (this.b != null)
      this.b.p(); 
  }
  
  private void B() {
    int i = 0;
    byte b = 0;
    int j = this.n.d();
    while (b < j) {
      aq aq1;
      (aq1 = (aq)this.n.b(b)).c(i);
      i += aq1.f() + this.l;
      b++;
    } 
    c(true);
  }
  
  public final aq o(int paramInt) {
    return (aq)this.n.b(paramInt);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\aw.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */