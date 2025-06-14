import javax.microedition.lcdui.Graphics;

public final class bs extends aq {
  private static int i = 1;
  
  private static int j = 20;
  
  private int k;
  
  private boolean l = true;
  
  private br[] m;
  
  private bs n;
  
  private int o;
  
  private int p;
  
  private bf q;
  
  private bg r;
  
  private az[] s = new az[3];
  
  public bs() {}
  
  public bs(br[] paramArrayOfbr) {
    if (paramArrayOfbr != null)
      a(paramArrayOfbr); 
  }
  
  public final void a(az paramaz) {
    boolean bool = true;
    az az1 = paramaz;
    bs bs1;
    (bs1 = this).s[0] = az1;
    if (az1 != null)
      bs1.s[0].a(6, v.u - ba.a + 3, 20); 
  }
  
  public final void b(az paramaz) {
    boolean bool = true;
    az az1 = paramaz;
    bs bs1;
    (bs1 = this).s[2] = az1;
    if (az1 != null)
      bs1.s[2].a(v.t - 6, v.u - ba.a + 3, 24); 
  }
  
  public final void c(az paramaz) {
    boolean bool = true;
    az az1 = paramaz;
    bs bs1;
    (bs1 = this).s[1] = az1;
    if (az1 != null)
      bs1.s[1].a(v.t / 2, v.u - ba.a + 3, 17); 
  }
  
  public final az[] a() {
    return this.s;
  }
  
  public final int q() {
    return (this.n != null) ? -(this.k << 16 | this.n.q()) : this.k;
  }
  
  private int u() {
    while (this.n != null)
      this = this.n; 
    return this.m[this.k].c();
  }
  
  public final void a(bf parambf) {
    this.q = parambf;
  }
  
  public final void a(bg parambg) {
    this.r = parambg;
  }
  
  public final void a(br[] paramArrayOfbr) {
    for (byte b = 0; b < paramArrayOfbr.length; b++)
      a(paramArrayOfbr[b]); 
  }
  
  public final void a(br parambr) {
    if (this.m != null) {
      br[] arrayOfBr = new br[this.m.length + 1];
      System.arraycopy(this.m, 0, arrayOfBr, 0, this.m.length);
      arrayOfBr[this.m.length] = parambr;
      e(f() + j);
      this.m = arrayOfBr;
    } else {
      this.m = new br[1];
      this.m[0] = parambr;
      e(this.m.length * j + 18 + (i << 1));
    } 
    int i = 0;
    for (byte b = 0; b < this.m.length; b++) {
      if (this.m[b].p() > i)
        i = this.m[b].p(); 
    } 
    if (i < 50)
      i = 50; 
    d(i + (i << 1) + 16 + 18);
    this.k = 0;
  }
  
  public final void a_(int paramInt1, int paramInt2) {
    super.a_(paramInt1, paramInt2);
    d(paramInt1, paramInt2);
  }
  
  public final void d(int paramInt1, int paramInt2) {
    this.o = paramInt1;
    this.p = paramInt2;
  }
  
  public final void n() {
    while (true) {
      int i = 0;
      if (this.o != c()) {
        if (Math.abs(i = this.o - c()) > 4)
          i /= 2; 
        b_(c() + i);
        i = 1;
      } 
      if (this.p != d()) {
        if (Math.abs(i = this.p - d()) > 4)
          i /= 2; 
        c(d() + i);
        i = 1;
      } 
      if (i != 0)
        c(true); 
      if (this.n != null) {
        this = this.n;
        continue;
      } 
      break;
    } 
  }
  
  public final void c(boolean paramBoolean) {
    super.c(paramBoolean);
    if (l() != null && paramBoolean)
      l().c(true); 
  }
  
  public final boolean k() {
    if (this.b == null)
      this.c = true; 
    return (this.b != null) ? (!(!this.b.k() && !super.k())) : super.k();
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    while (true) {
      int i = c() + paramInt1;
      int j = d() + paramInt2;
      ag.c().b(paramGraphics, i, j, e(), f());
      i += 4 + i;
      j += 10 + i;
      int k = e() - 8 - (i << 1);
      for (byte b = 0; b < this.m.length; b++) {
        boolean bool;
        if (bool = (b == this.k) ? true : false)
          ag.c().c(paramGraphics, i, j, k, j); 
        this.m[b].a(paramGraphics, i + 14, j + 3, bool);
        if (this.m[b].e())
          if (bool) {
            bx.c.a(paramGraphics, ">", i + k - 3, j + 3, 2);
          } else {
            bx.d.a(paramGraphics, ">", i + k - 4, j + 2, 2);
          }  
        j += j;
      } 
      if (this.n != null) {
        paramInt1 = paramInt1;
        paramGraphics = paramGraphics;
        this = this.n;
        continue;
      } 
      break;
    } 
  }
  
  private void v() {
    this.n = new bs(this.m[this.k].d());
    int i = c() + 8 + i;
    int j;
    if ((j = d() + 10 + i + this.k * j + 5) + this.n.f() > d() + f())
      j = d() + f() - this.n.f(); 
    this.n.a_(v.t, j);
    this.n.d(i, j);
    bf bf1 = this.q;
    bs bs1;
    (bs1 = this.n).q = bf1;
    bg bg1 = this.r;
    (bs1 = this.n).r = bg1;
    this.n.a(this);
  }
  
  public final boolean f(int paramInt) {
    bs bs1;
    if (this.b != null)
      this.b.c(true); 
    if (this.m == null)
      return false; 
    if (this.o != c() || this.p != d()) {
      b_(this.o);
      c(this.p);
    } 
    if (this.n != null) {
      if (!this.n.f(paramInt)) {
        this.n = null;
        c(true);
        return false;
      } 
      return true;
    } 
    int i = this.k;
    switch (paramInt) {
      case 99:
        if (i > 0) {
          i--;
          break;
        } 
        if (this.l)
          i = this.m.length - 1; 
        break;
      case 98:
        if (i < this.m.length - 1) {
          i++;
          break;
        } 
        if (this.l)
          i = 0; 
        break;
      case 97:
        if ((bs1 = this).b instanceof bs) {
          ((bs)bs1.b).n = null;
          return true;
        } 
        return false;
      case 96:
        if (this.m[this.k].e()) {
          v();
          return true;
        } 
        return false;
      case 95:
        if (this.m[this.k].e()) {
          v();
        } else {
          if (this.q != null) {
            v.c();
            this.q.d(0, u());
          } 
          if (this.r != null) {
            v.c();
            this.r.a(0, u(), r());
          } 
        } 
        return true;
    } 
    if (i != this.k) {
      this.k = i;
      c(true);
      return true;
    } 
    return false;
  }
  
  public final boolean c(int paramInt1, int paramInt2) {
    if (this.b != null)
      this.b.c(true); 
    if (this.o != c() || this.p != d()) {
      b_(this.o);
      c(this.p);
    } 
    if (this.n != null) {
      boolean bool;
      if (!(bool = this.n.c(paramInt1, paramInt2))) {
        this.n = null;
        c(true);
        return false;
      } 
      return true;
    } 
    int i = c() + 4 + i;
    int j = d() + 10 + i;
    int k = e() - 8 - (i << 1);
    for (byte b = 0; b < this.m.length; b++) {
      if (paramInt1 >= i && paramInt1 <= i + k && paramInt2 >= j && paramInt2 <= j + j) {
        this.k = b;
        c(true);
        return f(95);
      } 
      j += j;
    } 
    if (this.d.a(paramInt1, paramInt2))
      return true; 
    bs bs1;
    if ((bs1 = g(paramInt1, paramInt2)) != null) {
      bs1.n = null;
      return true;
    } 
    return false;
  }
  
  private bs g(int paramInt1, int paramInt2) {
    while (this.b instanceof bs) {
      if (!this.b.h().a(paramInt1, paramInt2)) {
        paramInt1 = paramInt1;
        this = (bs)this.b;
        continue;
      } 
      return (bs)this.b;
    } 
    return null;
  }
  
  public final br r() {
    return this.m[this.k];
  }
  
  public final br[] s() {
    return this.m;
  }
  
  public final void t() {
    v.c();
    this.n = null;
    this.k = 0;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\bs.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */