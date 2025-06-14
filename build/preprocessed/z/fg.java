import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class fg extends aq implements bu {
  private byte l = 6;
  
  private byte m = 6;
  
  private int n = 2;
  
  private int o = 32;
  
  private int p = 32;
  
  private int q = 20;
  
  private int r = 0;
  
  private int s = 0;
  
  private k[] t;
  
  private int u = 0;
  
  private int[][] v;
  
  public k i;
  
  private k w = null;
  
  private a x = new a();
  
  public boolean j = false;
  
  private int y = 0;
  
  private int z;
  
  private db A;
  
  public Image k = null;
  
  private bq B;
  
  private Image C;
  
  private boolean D;
  
  private boolean E = false;
  
  private static b F = new fh((byte)0);
  
  public fg(boolean paramBoolean) {
    this.D = paramBoolean;
    this.k = f.d("/slotlock");
    this.C = f.d("/m/lock2");
  }
  
  public final void a(aq paramaq) {
    super.a(paramaq);
    if (this.w == null && paramaq instanceof ay)
      this.w = ((ay)paramaq).q(); 
  }
  
  public final void a(bq parambq) {
    this.B = parambq;
  }
  
  public final void a(db paramdb) {
    this.A = paramdb;
  }
  
  public final void e(boolean paramBoolean) {
    this.E = true;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    pc.b(paramGraphics, this.d.a + paramInt1, this.d.b + paramInt2, this.d.c, this.d.d, v.aj, false);
    cw.a(paramGraphics, cw.a);
    cw.a(paramGraphics, this.d.a + paramInt1, this.d.b + 1 + paramInt2, this.d.c, this.d.d - 2);
    if (this.w == null)
      this.w = ((ay)l()).q(); 
    int i = this.i.a - this.w.a;
    int j = this.i.b - this.w.b;
    paramInt1 += i + this.m;
    paramInt2 += j + this.l;
    int m = this.x.d();
    for (byte b1 = 0; b1 < this.t.length; b1++) {
      if (this.t[b1].b(this.w.a, this.w.b, this.w.c, this.w.d)) {
        i = (this.t[b1]).a + paramInt1;
        j = (this.t[b1]).b + paramInt2;
        if (b1 < this.q) {
          if (b1 >= go.n) {
            pc.b(paramGraphics, i, j, (this.t[b1]).c, (this.t[b1]).d, 16711680, 16777215, 15385573);
          } else {
            pc.b(paramGraphics, i, j, (this.t[b1]).c, (this.t[b1]).d, 6647295, 16777215, 8369663);
          } 
        } else if (this.k != null) {
          paramGraphics.drawImage(this.k, i, j, 0);
        } else {
          pc.b(paramGraphics, i, j, (this.t[b1]).c, (this.t[b1]).d, 7895169, 16777215, 11382450);
        } 
        Object object;
        if (b1 < m && b1 < this.q && (object = this.x.b(b1)) != null) {
          ((aq)object).a(paramGraphics, i, j);
          if (b1 >= go.n)
            paramGraphics.drawImage(this.C, i, j, 0); 
        } 
      } 
    } 
    try {
      if (this.g && this.u >= 0) {
        pc.a(paramGraphics, this.t[this.u], paramInt1, paramInt2, this.z);
        if (this.A != null)
          this.A.a(paramGraphics, (this.t[this.u]).a + paramInt1, (this.t[this.u]).b + (this.t[this.u]).d + paramInt2); 
      } 
    } catch (Exception exception) {
      System.err.println(this.u);
    } 
    cw.c(paramGraphics, cw.a);
  }
  
  public final void h(int paramInt) {
    this.q = paramInt;
  }
  
  public final int a() {
    return this.q;
  }
  
  public final void d(int paramInt1, int paramInt2) {
    this.q = paramInt1;
    this.s = this.i.c / (this.o + this.n);
    this.r = paramInt1 / this.s + ((paramInt1 % this.s > 0) ? 1 : 0) + paramInt2;
    this.t = new k[this.s * this.r];
    for (paramInt1 = 0; paramInt1 < this.r; paramInt1++) {
      for (paramInt2 = 0; paramInt2 < this.s; paramInt2++)
        this.t[paramInt1 * this.s + paramInt2] = new k(paramInt2 * (this.o + this.n), paramInt1 * (this.p + this.n), this.o, this.p); 
    } 
    this.i.d = this.r * (this.p + this.n) + (this.l << 1);
    this.m = (byte)((this.i.c - this.s * (this.o + this.n)) / 2);
    fg fg1;
    (fg1 = this).v = new int[fg1.r * fg1.s][5];
    if (fg1.D) {
      for (byte b2 = 0; b2 < fg1.r; b2++) {
        for (byte b3 = 0; b3 < fg1.s; b3++) {
          paramInt2 = b2 * fg1.s + b3;
          (new int[4])[0] = (paramInt2 < fg1.v.length - 1) ? (paramInt2 + 1) : -1;
          (new int[4])[1] = (b3 == 0) ? -2 : ((paramInt2 > 0) ? (paramInt2 - 1) : -1);
          (new int[4])[2] = (b2 < fg1.r - 1) ? (paramInt2 + fg1.s) : -1;
          (new int[4])[3] = (b2 > 0) ? (paramInt2 - fg1.s) : -2;
          fg1.v[paramInt2] = new int[4];
        } 
      } 
      return;
    } 
    for (byte b1 = 0; b1 < fg1.r; b1++) {
      for (byte b2 = 0; b2 < fg1.s; b2++) {
        paramInt2 = b1 * fg1.s + b2;
        (new int[4])[0] = (paramInt2 < fg1.v.length - 1) ? (paramInt2 + 1) : -1;
        (new int[4])[1] = (paramInt2 > 0) ? (paramInt2 - 1) : -1;
        (new int[4])[2] = (b1 < fg1.r - 1) ? (paramInt2 + fg1.s) : -1;
        (new int[4])[3] = (b1 > 0) ? (paramInt2 - fg1.s) : -2;
        fg1.v[paramInt2] = new int[4];
      } 
    } 
  }
  
  public final void i(int paramInt) {
    this.u = paramInt;
    if (paramInt < 0 || this.w == null || this.i == null)
      return; 
    paramInt = this.u / this.s;
    int i = this.i.b - this.w.b;
    if ((paramInt = paramInt * (this.p + this.n) + this.l + i) < this.d.b)
      ((ay)l()).j(paramInt - this.d.b - this.l); 
    if (this.B != null)
      this.B.a(r(), this.u); 
  }
  
  public final void n() {
    this.y++;
    if (this.y >= 5) {
      this.z = (this.z == 0) ? -2 : 0;
      this.y = 0;
    } 
    byte b1 = 0;
    int i = this.x.d();
    while (b1 < i) {
      if (this.x.b(b1) != null) {
        dc dc;
        (dc = (dc)this.x.b(b1)).n();
      } 
      b1++;
    } 
  }
  
  public final boolean f(int paramInt) {
    fg fg1;
    boolean bool;
    int i;
    int j;
    switch (paramInt) {
      case 96:
      case 97:
      case 98:
      case 99:
        i = paramInt - 96;
        fg1 = this;
        fg1.i(0);
        if ((j = fg1.v[fg1.u][i]) == -2) {
          if (!fg1.j)
            fg1.d(false); 
        } else if (j != -1) {
          int m = fg1.u;
          fg1.u = j;
          m /= fg1.s;
          int n = fg1.u / fg1.s;
          if (m < n) {
            i = fg1.i.b - fg1.w.b;
            if ((i = n * (fg1.p + fg1.n) + fg1.l + fg1.p + i) > fg1.d.b + fg1.d.d - 3 * fg1.o)
              ((ay)fg1.l()).j(fg1.o + fg1.n); 
          } else if (m > n) {
            i = fg1.i.b - fg1.w.b;
            if ((i = n * (fg1.p + fg1.n) + fg1.l + i) < fg1.d.b + fg1.o)
              ((ay)fg1.l()).j(-(fg1.o + fg1.n)); 
          } else if (i == 2) {
            ((ay)fg1.l()).j(-(fg1.o + fg1.n));
          } 
          if (fg1.u >= fg1.r * fg1.s)
            fg1.u = fg1.r * fg1.s - 1; 
          fg1.i(fg1.u);
        } 
        if (bool = (i == -1) ? true : ((fg1.u < 0) ? false : j))
          return false; 
        break;
      case 95:
        if (this.B != null)
          this.B.b(r(), this.u); 
        break;
    } 
    return true;
  }
  
  public final void d(boolean paramBoolean) {
    super.d(paramBoolean);
    if (this.g)
      i(-1); 
  }
  
  public final g v() {
    return new g(this.i.c, this.i.d);
  }
  
  public final int w() {
    return 10;
  }
  
  public final boolean c(int paramInt1, int paramInt2) {
    if (this.w == null)
      this.w = ((ay)l()).q(); 
    paramInt1 -= this.i.a + this.m;
    paramInt2 -= this.i.b + this.l;
    for (int i = 0; i < this.t.length; i++) {
      if (this.t[i].a(paramInt1, paramInt2)) {
        paramInt2 = this.u;
        this.u = i;
        paramInt1 = paramInt2 / this.s;
        i = this.u / this.s;
        if (paramInt1 < i) {
          paramInt1 = this.i.b - this.w.b;
          if ((paramInt1 = i * (this.p + this.n) + this.l + this.p + paramInt1) > this.d.b + this.d.d - 3 * this.o)
            ((ay)l()).j(this.o + this.n); 
        } else {
          paramInt1 = this.i.b - this.w.b;
          if (paramInt1 > i && (paramInt1 = i * (this.p + this.n) + this.l + paramInt1) < this.d.b)
            ((ay)l()).j(-(this.o + this.n)); 
        } 
        if (paramInt2 != this.u) {
          i(this.u);
        } else {
          f(95);
        } 
        return true;
      } 
    } 
    return false;
  }
  
  public final boolean e(int paramInt1, int paramInt2) {
    ay ay;
    (ay = (ay)l()).j(-paramInt2);
    return true;
  }
  
  public final int q() {
    return this.u;
  }
  
  public final void j(int paramInt) {
    this.u = paramInt;
  }
  
  public final void a(Object paramObject) {
    this.x.a(paramObject);
    if (this.E) {
      b b1 = F;
      b b2 = b1;
      int i = paramObject.d();
      boolean bool = false;
      Object object = paramObject = this.x;
      if (i > 0)
        object.a(g.a(object.e(), 0, i, b2)); 
      this.x = (a)object;
    } 
  }
  
  public final aq r() {
    return (aq)this.x.b(this.u);
  }
  
  public final aq k(int paramInt) {
    return (aq)this.x.b(paramInt);
  }
  
  public final void a(dc paramdc) {
    this.x.b(paramdc);
  }
  
  public final int s() {
    return this.x.d();
  }
  
  public final void a(Object paramObject, int paramInt) {
    this.x.a(paramObject, paramInt);
  }
  
  public final int b(Object paramObject) {
    return this.x.c(paramObject);
  }
  
  public final void t() {
    this.x.a();
  }
  
  public final k u() {
    return new k((this.t[this.u]).a - this.w.a + this.i.a, (this.t[this.u]).b - this.w.b + this.i.b, this.o, this.p);
  }
  
  public final void l(int paramInt) {
    this.x.a(paramInt);
  }
  
  public final dc a(lm paramlm) {
    for (byte b1 = 0; b1 < this.x.d(); b1++) {
      dc dc;
      if ((dc = (dc)k(b1)).j == 1 && dc.k != null && paramlm.a == ((lm)dc.k).a)
        return dc; 
    } 
    return null;
  }
  
  public final dc a(String paramString) {
    for (byte b1 = 0; b1 < this.x.d(); b1++) {
      dc dc;
      if ((dc = (dc)k(b1)).j == 0 && dc.k != null && paramString.equals(((ll)dc.k).c))
        return dc; 
    } 
    return null;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\fg.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */