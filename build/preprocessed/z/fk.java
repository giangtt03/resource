public final class fk extends fn {
  public boolean i;
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.a(paramInt1, paramInt2, paramInt3, paramInt4);
    this.j = new g(paramInt3, 0);
  }
  
  public final synchronized void b(aq paramaq) {
    paramaq.a_(0, this.j.b);
    this.j.b += paramaq.f() + 1;
    super.b(paramaq);
  }
  
  public final synchronized void a(aq paramaq, int paramInt) {
    paramaq.a_(0, this.j.b);
    this.j.b += paramaq.f() + 1;
    super.a(paramaq, paramInt);
  }
  
  public final synchronized void c(aq paramaq) {
    this.j.b -= paramaq.f() + 1;
    super.c(paramaq);
  }
  
  public final boolean f(int paramInt) {
    fk fk1;
    ay ay;
    k k;
    if (this.l < 0)
      return false; 
    boolean bool;
    if (bool = u().f(paramInt))
      return true; 
    switch (paramInt) {
      case 99:
        if ((fk1 = this).b == null) {
          if (fk1.i) {
            int i = fk1.l - 1;
            if (fk1.l < 0)
              fk1.l = fk1.r() - 1; 
            fk1.i(i);
            return true;
          } 
          if (fk1.l > 0) {
            fk1.i(fk1.l - 1);
            return true;
          } 
          return false;
        } 
        ay = (ay)fk1.b;
        k = fk1.x();
        return fk1.a(ay, k, -1);
      case 98:
        if ((fk1 = this).b == null) {
          if (fk1.i) {
            int i;
            if ((i = fk1.l + 1) >= fk1.r())
              i = 0; 
            fk1.i(i);
            return true;
          } 
          if (fk1.l < fk1.r() - 1) {
            fk1.i(fk1.l - 1);
            return true;
          } 
          return false;
        } 
        ay = (ay)fk1.b;
        k = fk1.x();
        return fk1.a(ay, k, 1);
      case 95:
        if (this.n != null)
          this.n.b(u(), this.l); 
        break;
    } 
    return false;
  }
  
  private k x() {
    return (this.b != null) ? ((ay)this.b).r() : new k(0, 0, e(), f());
  }
  
  public final boolean g(int paramInt) {
    aq aq;
    return ((aq = u()) != null) ? aq.g(paramInt) : false;
  }
  
  public final boolean c(int paramInt1, int paramInt2) {
    paramInt1 -= c();
    paramInt2 -= d();
    for (byte b = 0; b < this.k.d(); b++) {
      aq aq;
      if ((aq = (aq)this.k.b(b)) != null && aq.j() && aq.h().a(paramInt1, paramInt2)) {
        if (b != this.l) {
          i(b);
          if (this.b != null && this.b instanceof ay) {
            int i = 1;
            int j;
            for (j = 0; j <= this.l; j++)
              i += j(j).f() + 1; 
            j = i - u().f() - 1;
            if (i > this.m.b + this.m.d)
              ((ay)l()).j(i - this.m.b + this.m.d); 
            if (j < this.m.b)
              ((ay)l()).j(j - this.m.b); 
          } 
        } 
        boolean bool;
        if (bool = aq.c(paramInt1, paramInt2))
          return true; 
        f(95);
      } 
    } 
    return false;
  }
  
  public final boolean f(int paramInt1, int paramInt2) {
    paramInt1 -= c();
    paramInt2 -= d();
    aq aq;
    return ((aq = u()) != null) ? aq.f(paramInt1, paramInt2) : false;
  }
  
  public final boolean e(int paramInt1, int paramInt2) {
    if (this.b != null && this.b instanceof ay) {
      ((ay)l()).j(paramInt2);
      return true;
    } 
    return false;
  }
  
  public final void a() {
    this.j.b = 0;
    byte b = 0;
    int i = this.k.d();
    while (b < i) {
      aq aq;
      (aq = (aq)this.k.b(b)).a_(0, this.j.b);
      this.j.b += aq.f() + 1;
      b++;
    } 
    c(true);
  }
  
  private int d(int paramInt1, int paramInt2) {
    for (int i = 0; paramInt1 <= paramInt2; i += aq.f() + 1)
      aq aq = (aq)this.k.b(paramInt1++); 
    return i;
  }
  
  private boolean a(ay paramay, k paramk, int paramInt) {
    int i = d(0, this.l - 1);
    aq aq;
    int j = (aq = (aq)this.k.b(this.l)).f();
    int m = 0;
    if (paramInt < 0) {
      if (this.l > 0) {
        aq aq1;
        paramInt = (aq1 = (aq)this.k.b(this.l - 1)).f();
        int n;
        if ((n = i - 1 - paramInt) + paramInt > paramk.b + 5) {
          i(this.l - 1);
          i = d(0, this.l - 1);
          j = (aq1 = (aq)this.k.b(this.l)).f();
          if (i <= paramk.b) {
            m = i - paramk.b;
            if (j >= paramk.d) {
              m += j - paramk.d;
            } else if (this.l > 0) {
              aq aq2 = (aq)this.k.b(this.l - 1);
              if (i - m + aq2.f() + j > paramk.b + paramk.d) {
                m -= paramk.d - j;
              } else {
                m -= aq2.f();
              } 
            } 
          } 
        } else {
          paramay.d(2, -1);
          return true;
        } 
      } else {
        if (this.i) {
          i(r() - 1);
          paramay.g(true);
        } else {
          if (paramay.t())
            return false; 
          paramay.d(2, -1);
        } 
        return true;
      } 
    } else if (this.l < r() - 1) {
      this.k.b(this.l + 1);
      if ((paramInt = i + j + 1) < paramk.b + paramk.d - 5) {
        i(this.l + 1);
        i = d(0, this.l - 1);
        aq aq1;
        int n = (aq1 = (aq)this.k.b(this.l)).f();
        if (i + n >= paramk.b + paramk.d) {
          m = i + n - paramk.b - paramk.d;
          if (n >= paramk.d) {
            m -= n - paramk.d;
          } else if (this.l < r() - 1) {
            aq aq2 = (aq)this.k.b(this.l + 1);
            if (i - m - aq2.f() < paramk.b) {
              m += paramk.d - n;
            } else {
              m += aq2.f();
            } 
          } 
        } 
      } else {
        paramay.d(2, 1);
        return true;
      } 
    } else {
      if (this.i) {
        i(0);
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
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\fk.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */