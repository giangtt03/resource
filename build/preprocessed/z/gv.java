import javax.microedition.lcdui.Graphics;

public final class gv extends al implements bf, ii {
  private String[] k;
  
  private aq[] l;
  
  private int m = 0;
  
  private int[][] n;
  
  private short[] o;
  
  private String p;
  
  private fd q;
  
  private int[] r;
  
  private int[] s = new int[2];
  
  private int t = 10;
  
  public gv(String paramString1, String paramString2, int[] paramArrayOfint, long[] paramArrayOflong, short[] paramArrayOfshort) {
    super(1);
    this.p = paramString2;
    a(this);
    a((ba)null);
    this.f = (v.t >= 240) ? (v.t - 20) : 174;
    this.g = 125;
    this.r = paramArrayOfint;
    this.o = paramArrayOfshort;
    this.k = bx.a(paramString1, this.f - 10);
    this.l = new aq[2];
    int i = 5 + this.k.length * bx.c.a() + 6;
    int j = pe.a().a(paramArrayOfshort[0]);
    int k = pe.a().b(paramArrayOfshort[0]);
    int m;
    for (m = 1; m < paramArrayOfshort.length; m++) {
      int i3 = pe.a().a(paramArrayOfshort[m]);
      int i4 = pe.a().b(paramArrayOfshort[m]);
      if (i3 > j)
        j = i3; 
      if (i4 > k)
        k = i4; 
    } 
    m = (k + 4 << 2) + 5 + 5 - 10;
    int i1;
    int n = (i1 = (n = this.f - 5 - 5) / (j + 4)) * (j + 4) + 5 + 5;
    this.f = n + 10 + 10;
    int i2 = this.f - n >> 1;
    this.q = new fd(i1, paramArrayOfshort.length);
    this.q.q().a(i2, i, n, m);
    this.q.e(true);
    this.q.a(this);
    this.q.d(j, k);
    this.q.a(5, 5, 5, 5, 4, 4);
    this.l[0] = this.q.q();
    i += this.l[0].f() + 6;
    this.s[0] = 5;
    this.s[1] = i;
    i += 30;
    fx fx;
    (fx = new fx("Bảng giá:")).d(false);
    fx.a(5, i, this.f - 10, 70);
    this.l[1] = fx;
    for (k = 0; k < paramArrayOfint.length; k++) {
      ey ey;
      (ey = new ey(String.valueOf(paramArrayOfint[k]) + "ngày <" + paramArrayOflong[k] + "KEN>", false)).h(k);
      fx.a(ey);
    } 
    fx.h(0);
    i += this.l[1].f() + 6;
    this.g = i + 5;
    this.c = v.t - this.f >> 1;
    this.d = v.u - ba.a - this.g >> 1;
    this.n = new int[][] { { 1, 1 }, { 1, 1, 1 } };
    this.l[this.m].d(true);
    a(new ba());
    bd bd = new bd("Mua", 1);
    gv gv1;
    (gv1 = this).a(bd, true);
    bd = new bd("Đóng", 0);
    (gv1 = this).b(bd, true);
  }
  
  public final void e(boolean paramBoolean) {
    super.e(paramBoolean);
    if (paramBoolean)
      this.t = 10; 
  }
  
  public final void c(Graphics paramGraphics) {
    if (!this.h)
      return; 
    pc.a(paramGraphics, this.c, this.d, this.f, this.g, v.aj, true);
    bx.a(paramGraphics, bx.c, this.k, this.c + 10, this.d + 5, this.f - 10 - 10, this.k.length * bx.c.a(), 0);
    int i;
    for (i = 0; i < this.l.length; i++) {
      if (this.l[i] != null) {
        this.l[i].a(paramGraphics, this.c, this.d);
        this.l[i].c(true);
      } 
    } 
    i = this.s[0] + this.c;
    int j = this.s[1] + this.d;
    pe.a().a(paramGraphics, this.o[this.q.a()], i, j, 0);
    bx.d.a(paramGraphics, pe.a().c(this.o[this.q.a()]), i + pe.a().a(this.o[this.q.a()]) + 5, j, 0);
  }
  
  public final void d(int paramInt1, int paramInt2) {
    switch (paramInt2) {
      case 0:
        ag.b().a(false);
        return;
      case 1:
        ag.b().a(false);
        if (this.l[1] instanceof fx)
          du.a().a(this.p, this.r[((fx)this.l[1]).a().q()], this.o[this.q.a()]); 
        break;
    } 
  }
  
  protected final void g() {
    for (byte b = 0; b < this.l.length; b++) {
      if (this.l[b] != null)
        this.l[b].n(); 
    } 
    this.t--;
    if (this.t == 0)
      e(false); 
  }
  
  public final void c(int paramInt) {
    e(true);
    int i = this.m;
    switch (paramInt) {
      case 95:
        this.l[this.m].f(paramInt);
        break;
      case 96:
      case 97:
      case 98:
      case 99:
        if (!this.l[this.m].f(paramInt))
          this.m = this.n[this.m][paramInt - 96]; 
        break;
    } 
    if (this.m != i) {
      this.l[i].d(false);
      this.l[this.m].d(true);
    } 
    this.h = true;
  }
  
  public final void a(int paramInt1, int paramInt2) {
    e(true);
    paramInt1 -= this.c;
    paramInt2 -= this.d;
    for (byte b = 0; b < this.l.length; b++) {
      if (paramInt1 > this.l[b].c() && paramInt1 < this.l[b].c() + this.l[b].e() && paramInt2 > this.l[b].d() && paramInt2 < this.l[b].d() + this.l[b].f()) {
        if (this.m == b) {
          this.l[b].c(paramInt1, paramInt2);
          return;
        } 
        this.l[this.m].d(false);
        this.m = b;
        this.l[this.m].d(true);
        return;
      } 
    } 
  }
  
  public final void b(int paramInt1, int paramInt2) {
    paramInt1 -= this.c;
    paramInt2 -= this.d;
    for (byte b = 0; b < this.l.length; b++)
      this.l[b].f(paramInt1, paramInt2); 
  }
  
  public final void c(int paramInt1, int paramInt2) {
    e(true);
    for (byte b = 0; b < this.l.length; b++)
      this.l[b].e(paramInt1, paramInt2); 
  }
  
  public final void t() {
    this.m = 1;
    this.l[0].d(false);
    this.l[this.m].d(true);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramGraphics.setColor(16177368);
    paramGraphics.fillRect(paramInt1 + 2, paramInt2, paramInt3, paramInt4);
    pc.a(paramGraphics, paramInt1 + 2, paramInt2, paramInt3, paramInt4 + 1, 16496053, -1);
  }
  
  public final void b(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = v.aj;
    int j = 10126946;
    if (this.l[0].m()) {
      j = 22523;
      i = 14479097;
    } 
    pc.b(paramGraphics, paramInt1, paramInt2, paramInt3, paramInt4, j, 16777215, i);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    pe.a().a(paramGraphics, this.o[paramInt5], paramInt1 + (paramInt3 - pe.a().a(this.o[paramInt5])) / 2 + 2, paramInt2 + (paramInt4 - pe.a().b(this.o[paramInt5])) / 2, 0);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\gv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */