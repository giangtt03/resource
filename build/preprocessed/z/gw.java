import java.util.Calendar;
import javax.microedition.lcdui.Graphics;

public final class gw extends al {
  private int k = 30;
  
  private int l = 18;
  
  private int m = 20;
  
  private int n = 1900;
  
  private int o;
  
  private int p;
  
  private int q;
  
  private int r;
  
  private int s = 0;
  
  private int t;
  
  private int u;
  
  private int v;
  
  private int w = 2;
  
  public gw() {
    this(1900, i.c(System.currentTimeMillis()).get(1));
  }
  
  private gw(int paramInt1, int paramInt2) {
    super(1);
    this.o = paramInt2;
    Calendar calendar = i.c(System.currentTimeMillis());
    this.p = calendar.get(5);
    this.q = calendar.get(2) + 1;
    this.r = calendar.get(1);
    this.v = this.k * 7 + 5;
    this.u = 6 * this.l + 5;
    a((v.t - this.v - 6 - 6) / 2, (v.u - ba.a - this.u - this.m - this.m - 3 - 15 - 15) / 2, this.v + 6 + 6, this.u + this.m + this.m + 3 + 15 + 15);
    gb gb = new gb(-1099, 2);
    gw gw1;
    (gw1 = this).a(gb, true);
    gb = new gb(-1100, 3);
    (gw1 = this).b(gb, true);
    C();
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3) {
    this.p = paramInt1;
    this.q = paramInt2;
    this.r = paramInt3;
    C();
  }
  
  private void C() {
    int k = this.r;
    int j = this.q;
    int i = this.p;
    j = d(j, k);
    this.p = (i > j) ? j : i;
    Calendar calendar;
    (calendar = i.a).set(5, 1);
    calendar.set(2, this.q - 1);
    calendar.set(1, this.r);
    this.s = (calendar.get(7) - 2 + 7) % 7;
    this.t = d(this.q, this.r);
  }
  
  public final int t() {
    return this.p;
  }
  
  public final int u() {
    return this.r;
  }
  
  public final int v() {
    return this.q;
  }
  
  public final String w() {
    return (this.p > 9) ? (new StringBuffer(String.valueOf(this.p))).toString() : ("0" + this.p);
  }
  
  public final String x() {
    return (new StringBuffer(String.valueOf(this.r))).toString();
  }
  
  public final String y() {
    return (this.q > 9) ? (new StringBuffer(String.valueOf(this.q))).toString() : ("0" + this.q);
  }
  
  public final int z() {
    return this.t;
  }
  
  public final int A() {
    return this.n;
  }
  
  public final int B() {
    return this.o;
  }
  
  public final void c(int paramInt) {
    if (paramInt == 98) {
      if (this.w == 2) {
        this.w = 1;
        return;
      } 
      if (this.w == 1) {
        this.w = 0;
        return;
      } 
      if (this.w == 0) {
        if ((paramInt = this.p + 7) > this.t)
          paramInt = this.t; 
        this.p = paramInt;
        return;
      } 
    } else if (paramInt == 99) {
      if (this.w == 1) {
        this.w = 2;
        return;
      } 
      if (this.w == 0) {
        if ((paramInt = this.p - 7) <= 0) {
          this.w = 1;
          return;
        } 
        this.p = paramInt;
        return;
      } 
    } else if (paramInt == 97) {
      if (this.w == 2) {
        if (this.r > this.n) {
          this.r--;
          C();
          return;
        } 
      } else if (this.w == 1) {
        if (this.q > 1) {
          this.q--;
          C();
          return;
        } 
      } else if (this.w == 0 && this.p > 1) {
        this.p--;
        return;
      } 
    } else if (paramInt == 96) {
      if (this.w == 2) {
        if (this.r < this.o) {
          this.r++;
          C();
          return;
        } 
      } else if (this.w == 1) {
        if (this.q < 12) {
          this.q++;
          C();
          return;
        } 
      } else if (this.w == 0 && this.p < this.t) {
        this.p++;
      } 
    } 
  }
  
  public final void a(int paramInt1, int paramInt2) {
    int i = a() + 6;
    int j = c() + 15;
    if (paramInt2 >= j && paramInt2 <= j + this.m) {
      if (this.w == 2) {
        if (paramInt1 < i + i() / 2) {
          c(97);
          return;
        } 
        c(96);
        return;
      } 
      this.w = 2;
      return;
    } 
    j += this.m + 2;
    if (paramInt2 >= j && paramInt2 <= j + this.m) {
      if (this.w == 1) {
        if (paramInt1 < i + i() / 2) {
          c(97);
          return;
        } 
        c(96);
        return;
      } 
      this.w = 1;
      return;
    } 
    j += this.m + 3;
    this.w = 0;
    paramInt2 -= j;
    if (paramInt2 >= j && paramInt2 <= j + this.l * 6 && paramInt1 >= i && paramInt1 <= i + this.k * 7 && (paramInt1 = (paramInt1 -= i) / this.k + paramInt2 / this.l * 7 - this.s + 1) > 0 && paramInt1 <= this.t)
      this.p = paramInt1; 
  }
  
  public final void c(Graphics paramGraphics) {
    paramGraphics.setColor(16244470);
    paramGraphics.fillRect(0, 0, v.t, v.u);
    cw.b(paramGraphics, 13092820, a(), c(), i(), j());
    paramGraphics.setColor(16244470);
    paramGraphics.fillRect(a() + 10, c(), 33, 1);
    bx.d.c(true);
    bx.d.a(paramGraphics, "Ngày", a() + 12, c() - 7, 0);
    bx.d.c();
    int i = a() + 6;
    int j = c() + 15;
    int k = i + (this.v - 60) / 2;
    int m = j;
    if (this.w == 2) {
      pc.c(paramGraphics, k - 25, m + 1, 19, 17, 857589, 0);
      pc.c(paramGraphics, k + 5 + 60, m + 1, 19, 17, 857589, 1);
    } 
    pc.a(paramGraphics, k, m, 60, this.m, (this.w == 2));
    bx.d.a(paramGraphics, (new StringBuffer(String.valueOf(this.r))).toString(), i + this.v / 2, j + 3, 1);
    j += this.m + 2;
    k = i + (this.v - 100) / 2;
    m = j;
    if (this.w == 1) {
      pc.c(paramGraphics, k - 25, m + 1, 19, 17, 857589, 0);
      pc.c(paramGraphics, k + 5 + 100, m + 1, 19, 17, 857589, 1);
    } 
    pc.a(paramGraphics, k, m, 100, this.m, (this.w == 1));
    bx.d.a(paramGraphics, "Tháng " + this.q, i + this.v / 2, j + 3, 1);
    j += this.m + 1;
    a(paramGraphics, i, j);
  }
  
  private void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    int i = 10323806;
    int j = 15722458;
    if (this.w == 0) {
      i = 22523;
      j = 13295359;
    } 
    paramGraphics.setColor(12564408);
    paramGraphics.fillRect(paramInt1 + 2, paramInt2 + 2, this.v - 4, 1);
    pc.b(paramGraphics, paramInt1 + 1, paramInt2 + 1, this.v - 2, this.u - 2, i, j, -1);
    i = 0;
    int k = paramInt2 + 3 + this.l;
    int m = paramInt2 + this.u - 1;
    while (k <= m) {
      j = 16777215;
      int n = 12966138;
      int i1 = 16371412;
      if (i == 0) {
        j = 14013930;
        n = 7184895;
        i1 = 16550298;
      } 
      paramGraphics.setColor(j);
      paramGraphics.fillRect(paramInt1 + 2, k - this.l, this.v - 4 - this.k - this.k, this.l);
      paramGraphics.setColor(n);
      paramGraphics.fillRect(paramInt1 + this.v - 2 - this.k - this.k, k - this.l, this.k, this.l);
      paramGraphics.setColor(i1);
      paramGraphics.fillRect(paramInt1 + this.v - 2 - this.k, k - this.l, this.k, this.l);
      paramGraphics.setColor(12564408);
      paramGraphics.fillRect(paramInt1 + 2, k - 1, this.v - 4, 1);
      i = (i != 0) ? 0 : 1;
      k += this.l;
    } 
    paramGraphics.setColor(12564408);
    k = paramInt1 + 2 + this.k;
    m = paramInt1 + this.v - 2;
    while (k < m) {
      paramGraphics.fillRect(k, paramInt2 + 2, 1, this.u - 4);
      k += this.k;
    } 
    k = this.s;
    for (m = 1; m <= this.t; m++) {
      j = k % 7;
      int n = k / 7;
      int i1 = -1;
      i = paramInt1 + j * this.k + 2;
      j = paramInt2 + n * this.l + 3;
      if (m == this.p) {
        if (this.w == 0)
          i1 = 16048180; 
        paramGraphics.setColor(0);
        paramGraphics.drawRect(i, j - 1, this.k, this.l);
      } 
      if (i1 >= 0) {
        paramGraphics.setColor(i1);
        paramGraphics.fillRect(i + 1, j, this.k - 1, this.l - 1);
      } 
      bx.d.a(paramGraphics, String.valueOf(m), i + this.k - 1, j + 2, 2);
      k++;
    } 
  }
  
  protected final void g() {}
  
  private static int d(int paramInt1, int paramInt2) {
    switch (paramInt1) {
      case 2:
        return (!((paramInt1 = paramInt2) % 400 != 0 && (paramInt1 % 100 == 0 || paramInt1 % 4 != 0))) ? 29 : 28;
      case 4:
      case 6:
      case 9:
      case 11:
        return 30;
    } 
    return 31;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\gw.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */