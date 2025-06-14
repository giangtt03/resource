import javax.microedition.lcdui.Graphics;

public final class fd extends aq implements bu {
  private int i;
  
  private int j;
  
  private int k;
  
  private int l;
  
  private ay m;
  
  private int n;
  
  private int o;
  
  private k p = new k();
  
  private ii q;
  
  private boolean r = false;
  
  private int s;
  
  public fd(int paramInt1, int paramInt2) {
    this.n = paramInt1;
    this.o = paramInt2;
    this.m = new ay();
    this.m.b(this);
    this.m.e(false);
  }
  
  public final int a() {
    return this.s;
  }
  
  public final void e(boolean paramBoolean) {
    this.r = true;
  }
  
  public final void a(ii paramii) {
    this.q = paramii;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    this.j = 4;
    this.i = 4;
    this.m.a(new j(5, 5, 5, 5));
  }
  
  public final void d(int paramInt1, int paramInt2) {
    this.k = paramInt1;
    this.l = paramInt2;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.c)
      return; 
    paramInt1 += c();
    paramInt2 += d();
    k k1 = this.m.q();
    j j = this.m.a();
    if (this.q != null)
      this.q.b(paramGraphics, paramInt1 - j.b, paramInt2 - j.a, e() + j.b + j.d, f() + j.a + j.c); 
    cw.a(paramGraphics, this.p);
    cw.a(paramGraphics, this.p, paramInt1, paramInt2, e(), f());
    int i = k1.b + k1.d;
    paramInt1 -= k1.a;
    paramInt2 -= k1.b;
    for (byte b = 0; b < this.o; b++) {
      int m = b / this.n;
      int n = b % this.n;
      n = (this.i + this.k) * n;
      m = (this.j + this.l) * m;
      if (!k1.b(n, m, this.k, this.l)) {
        if (m + this.l > i)
          break; 
      } else if (this.q != null) {
        n = paramInt1 + n;
        m = paramInt2 + m;
        if (b == this.s)
          if (this.r) {
            this.q.a(paramGraphics, n, m, this.k, this.l);
          } else {
            this.q.a(paramGraphics, n, m, this.k, this.l, b);
            this.q.a(paramGraphics, n, m, this.k, this.l);
            b++;
          }  
        this.q.a(paramGraphics, n, m, this.k, this.l, b);
      } 
    } 
    cw.c(paramGraphics, this.p);
    this.c = false;
  }
  
  private int g(int paramInt1, int paramInt2) {
    return (paramInt2 < 0) ? 0 : (paramInt2 * (this.l + this.j));
  }
  
  private int h(int paramInt1, int paramInt2) {
    return (paramInt2 < 0) ? 0 : (paramInt2 * (this.k + this.i));
  }
  
  private boolean a(ay paramay, k paramk, int paramInt1, int paramInt2) {
    fd fd1;
    ay ay1;
    if (2 == paramInt1) {
      if (paramInt2 < 0) {
        if (this.s >= this.n) {
          if ((paramInt1 = g(0, this.s / this.n)) > paramk.b + this.j) {
            paramInt2 = this.s - this.n;
            fd fd2;
            (fd2 = this).s = paramInt2;
            a(paramay, paramk);
            return true;
          } 
          paramay.d(2, -1);
          return true;
        } 
        if (paramay.t())
          return false; 
        paramay.d(2, -1);
        return true;
      } 
      if ((paramInt1 = this.s + this.n) >= this.o)
        paramInt1 = this.o - 1; 
      if (paramInt1 / this.n != this.s / this.n) {
        if ((paramInt2 = g(0, this.s / this.n)) + this.l + this.j < paramk.b + paramk.d) {
          paramInt2 = paramInt1;
          fd fd2;
          (fd2 = this).s = paramInt2;
          b(paramay, paramk);
          return true;
        } 
        paramay.d(2, 1);
        return true;
      } 
      if (paramay.s())
        return false; 
      paramay.d(2, 1);
      return true;
    } 
    if (paramInt2 < 0) {
      if (this.s > 0) {
        if (this.s % this.n == 0) {
          paramay.i(true);
          paramInt2 = this.s - 1;
          fd fd2;
          (fd2 = this).s = paramInt2;
          a(paramay, paramk);
          return true;
        } 
        if ((paramInt1 = h(0, this.s % this.n)) > paramk.a + this.i) {
          paramInt2 = this.s - 1;
          fd fd2;
          (fd2 = this).s = paramInt2;
          k k1 = paramk;
          ay1 = paramay;
          if ((paramInt2 = (fd1 = this).g(0, fd1.s % fd1.n)) <= k1.a) {
            int i = paramInt2 - k1.a;
            if (fd1.k >= k1.c) {
              i += fd1.k - k1.c;
            } else if (fd1.s % fd1.n > 0) {
              if (paramInt2 - i + fd1.k + fd1.i + fd1.k > k1.a + k1.c) {
                i -= k1.c - fd1.k - fd1.i;
              } else {
                i -= fd1.k;
              } 
            } 
            ay1.i(i);
          } 
          return true;
        } 
        fd1.d(1, -1);
        return true;
      } 
      if (fd1.u())
        return false; 
      fd1.d(1, -1);
      return true;
    } 
    if (this.s < this.o - 1) {
      if (this.s % this.n == this.n - 1) {
        fd1.h(true);
        paramInt2 = this.s + 1;
        fd fd2;
        (fd2 = this).s = paramInt2;
        b((ay)fd1, (k)ay1);
        return true;
      } 
      if ((paramInt1 = h(0, this.s % this.n)) + this.k + this.i < ((k)ay1).a + ((k)ay1).c) {
        paramInt2 = this.s + 1;
        fd fd3;
        (fd3 = this).s = paramInt2;
        ay ay2 = ay1;
        fd fd2 = fd1;
        if ((paramInt2 = (fd1 = this).g(0, fd1.s % fd1.n)) + fd1.k + fd1.i > ((k)ay2).a + ((k)ay2).c) {
          int i = paramInt2 + fd1.k + fd1.i - ((k)ay2).a + ((k)ay2).c;
          if (fd1.k >= ((k)ay2).c) {
            i -= fd1.k - ((k)ay2).c;
          } else if (fd1.s % fd1.n < fd1.n - 1) {
            if (paramInt2 - i - fd1.k - fd1.i < ((k)ay2).a) {
              i += ((k)ay2).c - fd1.k - fd1.i;
            } else {
              i += fd1.k + fd1.i;
            } 
          } 
          fd2.i(i);
        } 
        return true;
      } 
      fd1.d(1, 1);
      return true;
    } 
    if (fd1.v())
      return false; 
    fd1.d(1, 1);
    return true;
  }
  
  private void a(ay paramay, k paramk) {
    int i;
    if ((i = g(0, this.s / this.n)) <= paramk.b) {
      int j = i - paramk.b;
      if (this.l >= paramk.d) {
        j += this.l - paramk.d;
      } else if (this.s >= this.n) {
        if (i - j + this.l + this.j + this.l > paramk.b + paramk.d) {
          j -= paramk.d - this.l - this.j;
        } else {
          j -= this.l;
        } 
      } 
      paramay.j(j);
    } 
  }
  
  private void b(ay paramay, k paramk) {
    int i;
    if ((i = g(0, this.s / this.n)) + this.l + this.j > paramk.b + paramk.d) {
      int j = i + this.l + this.j - paramk.b + paramk.d;
      if (this.l >= paramk.d) {
        j -= this.l - paramk.d;
      } else {
        int m;
        if ((m = this.s + this.n) >= this.o)
          m = this.o - 1; 
        if (m / this.n != this.s / this.n)
          if (i - j - this.l - this.j < paramk.b) {
            j += paramk.d - this.l - this.j;
          } else {
            j += this.l + this.j;
          }  
      } 
      paramay.j(j);
    } 
  }
  
  public final boolean f(int paramInt) {
    if (paramInt >= 96 && paramInt <= 99) {
      k k1 = this.m.r();
      switch (paramInt) {
        case 99:
          return a(this.m, k1, 2, -1);
        case 98:
          return a(this.m, k1, 2, 1);
        case 97:
          return a(this.m, k1, 1, -1);
        case 96:
          return a(this.m, k1, 1, 1);
      } 
    } else if (paramInt == 95) {
      if (this.q != null && this.s >= 0 && this.s < this.o)
        this.q.t(); 
      return true;
    } 
    return false;
  }
  
  public final boolean c(int paramInt1, int paramInt2) {
    fd fd1;
    int i = paramInt2 - d();
    int j = paramInt1 - c();
    i /= this.l + this.j;
    j /= this.k + this.i;
    if ((i = i * this.n + j) < this.o) {
      if (i != this.s) {
        paramInt2 = i;
        (fd1 = this).s = paramInt2;
      } else {
        f(95);
      } 
      return true;
    } 
    return super.c(fd1, paramInt2);
  }
  
  public final aq q() {
    return this.m;
  }
  
  public final g v() {
    int i = this.o / this.n + ((this.o % this.n != 0) ? 1 : 0);
    return new g(this.n * this.k + (this.n - 1) * this.i, i * this.l + (i - 1) * this.j);
  }
  
  public final int w() {
    return 10;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\fd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */