import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class fc extends aq {
  private a j = new a();
  
  private a k = new a();
  
  private int l;
  
  private int m;
  
  private boolean n;
  
  private int o;
  
  private int p;
  
  private int q;
  
  private int r;
  
  private Image s;
  
  private int t;
  
  private int u;
  
  private int v;
  
  private int[] w = new int[0];
  
  private Image x = pc.c;
  
  private Image y = f.d("/questnotifyicon");
  
  private Image z = null;
  
  private int A;
  
  private int B;
  
  private int C;
  
  private int D = -1;
  
  private int E = 0;
  
  private int F;
  
  public String i;
  
  private bf G;
  
  private Image H = f.d("/corner/4");
  
  private Image I = f.d("/corner/5");
  
  public fc() {
    a(0, v.u, v.t, 69);
    this.t = d();
    this.s = f.d("/focustab");
    this.u = this.s.getWidth();
    k(0);
  }
  
  public fc(int paramInt1, int paramInt2, int paramInt3) {
    this();
    this.A = 1;
    this.B = 2;
    this.C = 3;
  }
  
  private void j(int paramInt) {
    if (this.j.d() <= 0)
      return; 
    if (this.l < this.j.d())
      this.v = (q()).i; 
    this.l = paramInt;
    int i = paramInt;
    fc fc1 = this;
    if (i >= 0) {
      fc1.w[i] = 0;
      fc1.D = -1;
      for (i = 0; i < fc1.w.length; i++) {
        switch (fc1.w[i]) {
          case 105:
            fc1.D = fc1.A;
            break;
          case 107:
            fc1.D = fc1.C;
            break;
        } 
      } 
    } 
    k(this.l);
    try {
      q().x();
    } catch (OutOfMemoryError outOfMemoryError) {
      for (byte b = 0; b < this.j.d(); b++) {
        fb fb;
        (fb = (fb)this.j.b(b)).y();
      } 
      try {
        q().x();
      } catch (OutOfMemoryError outOfMemoryError1) {
        a.r();
        q().x();
      } 
    } 
    ag.a().e();
  }
  
  public final void a(fb paramfb) {
    if (paramfb == null)
      return; 
    for (byte b = 0; b < this.j.d(); b++) {
      fb fb1 = (fb)this.j.b(b);
      if (paramfb.i == fb1.i) {
        j(b);
        return;
      } 
    } 
  }
  
  private void k(int paramInt) {
    if (this.j.d() <= 0)
      return; 
    int i;
    if ((i = this.j.d() * this.u) > e())
      if (paramInt < this.m) {
        if (this.q + paramInt * this.u < 2)
          this.q = 2 - paramInt * this.u; 
        if (paramInt > 0 && this.q + paramInt * this.u - this.u < 2)
          if ((i = 2 - paramInt * this.u + this.u) + paramInt * this.u + this.u + this.u > c() + e() - 2) {
            this.q = i - i + this.u + this.u - e() - 2;
          } else {
            this.q = i;
          }  
      } else {
        if (this.q + paramInt * this.u + this.u > e() - 2)
          this.q = e() - 2 - paramInt * this.u - this.u; 
        if (paramInt < this.j.d() - 1 && this.q + paramInt * this.u + this.u + this.u > e() - 2)
          if ((i = e() - 2 - paramInt * this.u - this.u - this.u) + paramInt * this.u < 2) {
            this.q = 2 - paramInt * this.u;
          } else {
            this.q = i;
          }  
      }  
    this.m = paramInt;
  }
  
  public final void a() {
    if (this.G != null) {
      fc fc2;
      int j = (fc2 = this).D;
      this.G.d(-1, j);
      if (j == this.A || j == this.B)
        return; 
    } 
    c(v.u);
    this.t = d() - f();
    this.p = 0;
    this.n = true;
    fc fc1;
    int i;
    if ((i = (fc1 = this).u * fc1.j.d()) <= fc1.e()) {
      fc1.q = (fc1.e() - i) / 2;
      return;
    } 
    fc1.q = (fc1.e() - fc1.u) / 2 - fc1.l * fc1.u;
    if (fc1.q > 2) {
      fc1.q = 2;
      return;
    } 
    if (fc1.q + fc1.j.d() * fc1.u < fc1.e())
      fc1.q = -fc1.j.d() * fc1.u + fc1.e() - 2; 
  }
  
  private void t() {
    this.t = v.u;
    this.n = false;
    this.o = 0;
    if (this.m != this.l)
      j(this.m); 
    v.c();
  }
  
  private int l(int paramInt) {
    for (byte b = 0; b < this.j.d(); b++) {
      fb fb;
      if ((fb = (fb)this.j.b(b)).i == paramInt)
        return b; 
    } 
    return -1;
  }
  
  public final boolean b(fb paramfb) {
    return (this.j.c(paramfb) >= 0);
  }
  
  public final fb q() {
    return (this.j.d() <= 0) ? null : (fb)this.j.b(this.l);
  }
  
  public final fb h(int paramInt) {
    return ((paramInt = l(100)) >= 0) ? (fb)this.j.b(paramInt) : null;
  }
  
  public final void c(fb paramfb) {
    if (paramfb == null || b(paramfb))
      return; 
    if (paramfb.o)
      this.k.a(paramfb); 
    if (paramfb.i == 107 && this.z == null)
      this.z = f.d("/notificationnewsicon"); 
    int[] arrayOfInt = new int[this.j.d() + 1];
    fb fb1 = q();
    for (byte b = 0; b < this.j.d(); b++) {
      fb fb2 = (fb)this.j.b(b);
      if (paramfb.i == fb2.i)
        throw new ArrayIndexOutOfBoundsException("Đã tồn tại 1 gametab có id trùng với id của gametab mà bạn muốn thêm vào"); 
      if (paramfb.i < fb2.i) {
        System.arraycopy(this.w, 0, arrayOfInt, 0, b);
        System.arraycopy(this.w, b, arrayOfInt, b + 1, this.w.length - b);
        this.w = arrayOfInt;
        this.j.b(paramfb, b);
        paramfb.u();
        paramfb.a(this);
        if ((fb1 != null && q() != null && fb1.i != (q()).i) || q() == null)
          a(fb1); 
        return;
      } 
    } 
    System.arraycopy(this.w, 0, arrayOfInt, 0, this.w.length);
    this.w = arrayOfInt;
    this.j.a(paramfb);
    paramfb.u();
    paramfb.a(this);
    if (fb1 != null && (q() == null || (q() != null && fb1.i != (q()).i)))
      a(fb1); 
  }
  
  public final boolean i(int paramInt) {
    for (paramInt = 0; paramInt < this.j.d(); paramInt++) {
      fb fb = (fb)this.j.b(paramInt);
      if (100 == fb.i)
        return true; 
    } 
    return false;
  }
  
  public final void d(fb paramfb) {
    int i = this.j.c(paramfb);
    f(paramfb);
    if (paramfb.i == 107)
      this.z = null; 
    if (i >= 0) {
      int[] arrayOfInt = new int[this.w.length - 1];
      System.arraycopy(this.w, 0, arrayOfInt, 0, i);
      System.arraycopy(this.w, i + 1, arrayOfInt, i, arrayOfInt.length - i);
      this.w = arrayOfInt;
      Object object;
      if ((object = this.j.a(i)) != null)
        paramfb.a((aq)null); 
      if (this.j.d() <= 0) {
        this.l = this.m = 0;
        t();
        return;
      } 
      int j;
      if ((j = l(this.v)) >= 0) {
        j(j);
        return;
      } 
      if (this.l >= this.j.d())
        this.l = this.j.d() - 1; 
      j(this.l);
    } 
  }
  
  public final void r() {
    for (byte b = 0; b < this.j.d(); b++) {
      if (this.j.b(b) != null) {
        fb fb;
        (fb = (fb)this.j.b(b)).a((aq)null);
      } 
    } 
    this.j.a();
    this.l = this.m = 0;
    this.w = new int[0];
    t();
  }
  
  public final boolean f(int paramInt) {
    if (this.n) {
      fb fb;
      int i = this.m;
      switch (paramInt) {
        case 97:
          if (--i < 0)
            i = this.j.d() - 1; 
          break;
        case 96:
          if (++i >= this.j.d())
            i = 0; 
          break;
        case 95:
          t();
          return true;
        default:
          t();
          if (paramInt != 94 && paramInt != 93)
            (fb = q()).h(paramInt); 
          return true;
      } 
      if (fb != this.m) {
        k(fb);
        this.o = 7;
        this.p = 0;
        return true;
      } 
    } 
    if (!this.n) {
      fb fb;
      if (this.j.d() > 0 && (fb = q()).h(paramInt))
        return true; 
      switch (paramInt) {
        case 96:
        case 97:
          a();
          return true;
      } 
    } 
    return false;
  }
  
  public final boolean g(int paramInt) {
    fb fb;
    return (this.j.d() > 0 && (fb = q()).i(paramInt));
  }
  
  public final boolean c(int paramInt1, int paramInt2) {
    if (this.n) {
      if (paramInt1 >= c() && paramInt1 <= c() + e() && paramInt2 >= d() && paramInt2 <= d() + f()) {
        this.p = 0;
        int i = d() + 8 + bx.c.a();
        if (paramInt2 >= i && paramInt2 <= i + f()) {
          paramInt2 = this.r;
          for (i = 0; i < this.j.d(); i++) {
            if (paramInt1 >= paramInt2 && paramInt1 <= paramInt2 + this.u) {
              if (this.m != i) {
                k(i);
                this.o = 7;
                this.p = 0;
                break;
              } 
              // Byte code: goto -> 160
            } 
            paramInt2 += this.u;
          } 
        } 
      } else {
        t();
      } 
      return true;
    } 
    fb fb;
    return (this.j.d() > 0 && (fb = q()).g(paramInt1, paramInt2));
  }
  
  public final boolean f(int paramInt1, int paramInt2) {
    fb fb;
    return this.n ? true : ((this.j.d() > 0 && (fb = q()).h(paramInt1, paramInt2)));
  }
  
  public final boolean e(int paramInt1, int paramInt2) {
    if (this.n) {
      int j;
      if ((j = this.u * this.j.d()) > e()) {
        this.p = 0;
        this.q += paramInt1;
        if (this.q >= 0) {
          this.q = 0;
        } else if (this.q + j < e()) {
          this.q = e() - j;
        } 
      } 
      return true;
    } 
    int i = paramInt2;
    paramInt2 = paramInt1;
    fb fb1;
    fb fb2;
    return (this.j.d() > 0 && (((fb1 = fb2 = q()).l != null && fb1.l.e(paramInt2, i)) ? true : fb1.e(paramInt2, i)));
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!j())
      return; 
    if (this.j.d() > 0) {
      fb fb;
      (fb = q()).b(paramGraphics, paramInt1, paramInt2);
    } 
    if (this.n || this.t != d()) {
      int i1 = f();
      int n = e();
      int m = d();
      int k = c();
      Graphics graphics = paramGraphics;
      fc fc1 = this;
      int i2 = k + fc1.H.getWidth() - 1;
      int i3 = m + 2;
      int i4 = n - fc1.H.getWidth() - fc1.H.getWidth() + 2;
      graphics.setColor(16764571);
      graphics.fillRect(i2, i3 + 2, i4, 15);
      graphics.setColor(13077582);
      graphics.drawLine(i2, i3, i2 + i4, i3);
      graphics.drawLine(i2, i3 + 17, i2 + i4, i3 + 17);
      graphics.setColor(7225619);
      graphics.drawLine(i2, i3 + 1, i2 + i4, i3 + 1);
      i2 = k + 1;
      i3 = m + 20;
      i4 = n - 2;
      int i5 = i1 - fc1.H.getHeight() + 2 - 1;
      graphics.setColor(7225619);
      graphics.drawRect(i2, i3, i4 - 1, i5 - 1);
      graphics.setColor(13077582);
      graphics.drawRect(i2 + 1, i3 + 1, i4 - 3, i5 - 3);
      graphics.setColor(14854509);
      graphics.drawRect(i2 + 2, i3 + 2, i4 - 5, i5 - 5);
      graphics.setColor(16764571);
      graphics.fillRect(i2 + 1, i3 + 3, i4 - 4, i5 - 6);
      graphics.drawImage(fc1.H, k, m, 0);
      graphics.drawRegion(fc1.H, 0, 0, fc1.H.getWidth(), fc1.H.getHeight(), 2, k + n, m, 24);
      graphics.setColor(13077582);
      graphics.drawLine(k, m + 10, k, m + i1);
      graphics.setColor(3355443);
      graphics.drawLine(k + n - 1, m + 10, k + n - 1, m + i1);
      graphics.drawLine(k, m + i1 - 1, k + n - 1, m + i1 - 1);
      graphics.drawImage(fc1.I, k + 2, m + fc1.H.getHeight() - 1, 0);
      graphics.drawRegion(fc1.I, 0, 0, fc1.I.getWidth(), fc1.I.getHeight(), 2, k + n - 2, m + fc1.H.getHeight() - 1, 24);
      graphics.drawRegion(fc1.I, 0, 0, fc1.I.getWidth(), fc1.I.getHeight(), 1, k + 2, m + i1 - 2, 36);
      graphics.drawRegion(fc1.I, 0, 0, fc1.I.getWidth(), fc1.I.getHeight(), 3, k + n - 2, m + i1 - 2, 40);
      k = this.r;
      int i = d() + 4;
      if (this.j.d() <= 0)
        return; 
      fb fb;
      if ((fb = (fb)this.j.b(this.m)).j != null)
        bx.e.a(paramGraphics, fb.j, e() / 2, i + 1, 1); 
      i += bx.e.a() + 6;
      cw.a(paramGraphics);
      cw.a(paramGraphics, c() + 3, d(), e() - 6, f());
      int j = this.s.getWidth();
      m = this.s.getHeight();
      for (n = 0; n < this.j.d(); n++) {
        fb fb1 = (fb)this.j.b(n);
        if (n == this.m)
          paramGraphics.drawRegion(this.s, 0, 0, j, m, 0, k, i, 0); 
        pc.b(paramGraphics, k + this.u / 2, i + m / 2, fb1.n, 3);
        if (this.w[n] > 0)
          paramGraphics.drawImage(this.x, k + this.u - 10, i, 0); 
        k += this.u;
      } 
      cw.b(paramGraphics);
      return;
    } 
    if (this.E < 16) {
      if (this.D == this.A) {
        int i = d() - 36;
        paramInt2 = c() + e() - 16;
        Graphics graphics;
        pc.d(graphics = paramGraphics, -21, paramInt2, i, 0);
        pc.d(graphics, -23, paramInt2 - 3, i - 3, 0);
        return;
      } 
      if (this.D == this.B) {
        paramGraphics.drawImage(this.y, c() + e() - 16, d() - 36, 0);
        return;
      } 
      if (this.D == this.C && this.z != null)
        paramGraphics.drawImage(this.z, c() + e() - 16, d() - 36, 0); 
    } 
  }
  
  public final void n() {
    if (!j())
      return; 
    if (this.D >= this.A) {
      if (this.E >= 20) {
        this.E = 1;
      } else {
        this.E++;
      } 
      if (this.D == this.B)
        if (this.F < 500) {
          this.F++;
        } else {
          s();
        }  
    } 
    if (this.n)
      if (this.p < 50) {
        this.p++;
      } else {
        t();
      }  
    if (this.o > 0) {
      this.o--;
      if (this.o == 0 && this.l != this.m)
        j(this.m); 
    } 
    if (this.t != d()) {
      int i;
      boolean bool1;
      if (bool1 = ((i = d()) > this.t) ? true : false) {
        i -= 20;
      } else {
        i += 20;
      } 
      boolean bool2 = (i > this.t) ? true : false;
      if (bool1 != bool2)
        i = this.t; 
      c(i);
      fb fb;
      if ((fb = q()) != null)
        fb.c(true); 
    } 
    if (this.q != this.r) {
      int i;
      if (Math.abs(i = this.q - this.r) > 3)
        i /= 3; 
      this.r += i;
    } 
    if (!this.n && this.j.d() > 0) {
      fb fb;
      (fb = q()).q();
    } 
    for (byte b = 0; b < this.k.d(); b++) {
      fb fb;
      if (!(fb = (fb)this.k.b(b)).equals(q()))
        fb.q(); 
    } 
  }
  
  public final void a(String paramString) {
    this.D = this.B;
    this.F = 1;
    this.i = paramString;
  }
  
  public final void s() {
    this.E = 0;
    this.D = -1;
    for (byte b = 0; b < this.w.length; b++) {
      switch (this.w[b]) {
        case 105:
          this.D = this.A;
          break;
        case 107:
          this.D = this.C;
          break;
      } 
    } 
  }
  
  public final void e(fb paramfb) {
    int i;
    if ((i = this.j.c(paramfb)) < 0)
      return; 
    if (i != this.l) {
      this.w[i] = paramfb.i;
      if (this.D == this.B)
        return; 
      if (paramfb.i == 105) {
        this.D = this.A;
        return;
      } 
      if (paramfb.i == 107)
        this.D = this.C; 
    } 
  }
  
  public final void f(fb paramfb) {
    if (paramfb == null)
      return; 
    for (byte b = 0; b < this.w.length; b++) {
      if (paramfb.i == this.w[b])
        this.w[b] = -1; 
      switch (this.w[b]) {
        case 1:
          this.D = this.A;
          break;
        case 3:
          this.D = this.C;
          break;
      } 
    } 
  }
  
  public final void a(bf parambf) {
    this.G = parambf;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\fc.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */