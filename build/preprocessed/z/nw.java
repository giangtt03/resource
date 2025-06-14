import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class nw extends an implements bf, bg {
  private Image a = f.d("/createcs/bk");
  
  private Image b = f.d("/createcs/stone");
  
  private int[] c = new int[] { 0, 0, 135, 220 };
  
  private int[] d = new int[2];
  
  private by k = new by();
  
  private d l;
  
  private gg[] m;
  
  private int n;
  
  private mg o;
  
  private df[][] p;
  
  private df[][] q;
  
  private df[] r;
  
  private mb s;
  
  private mb t;
  
  private int u;
  
  private mb[][] v;
  
  private mb[][] w;
  
  private mb[] x;
  
  private boolean y;
  
  private gg z;
  
  private String[] A = new String[] { "Hỏa", "Lôi", "Thủy" };
  
  public nw() {
    super(3);
    this.k.c(true);
    this.l = bx.c;
    int i = v.t - this.c[2] - this.b.getWidth();
    byte b1 = 5;
    if (i > 80)
      b1 = 50; 
    i = i - b1 >> 1;
    this.c[0] = i + this.b.getWidth() + b1;
    this.c[1] = (v.u - ba.a - this.c[3]) / 2;
    this.d[0] = i;
    this.d[1] = this.c[1] + this.c[3] - 60;
    nw nw1 = this;
    String[] arrayOfString = { "Giới Tính", "Hệ", "Khuôn Mặt", "Kiểu Tóc", "Màu Tóc", "Màu Da" };
    int[] arrayOfInt = { 100, 101, 102, 103, 104, 105 };
    nw1.m = new gg[6];
    int j = nw1.c[0] + 8;
    int k = nw1.c[1] + 25;
    for (byte b2 = 0; b2 < nw1.m.length; b2++) {
      nw1.m[b2] = new gg(arrayOfString[b2]);
      nw1.m[b2].h(arrayOfInt[b2]);
      nw1.m[b2].a(nw1.l);
      nw1.m[b2].a_(b2);
      nw1.m[b2].a(j, k, 120, 16);
      nw1.m[b2].a(nw1);
      k += 33;
    } 
    nw1.m[0].a((Object[])new String[] { "Nam", "Nữ" });
    nw1.m[1].a((Object[])nw1.A);
    nw1.m[0].d(true);
    g(false);
    f(false);
    a(a.n);
    bs bs;
    (bs = new bs(new br[] { new br("Bắt đầu", 301), new br("Đăng Xuất", 302) })).a(this);
    a(bs);
  }
  
  private void e() {
    this.t = this.x[this.m[0].a()];
    int i = this.m[0].a();
    lh lh;
    (lh = new lh(0)).W = this.r[i];
    lh.U = this.p[i][this.m[3].a()];
    this.o = mb.a(lh, this.w[i][this.m[3].a()], this.v[i][this.m[2].a()], this.s, this.t, false);
    this.o.c(2);
    this.o.c(this.d[0] + 30, this.d[1] - this.o.q() + 5);
  }
  
  protected final void e(int paramInt1, int paramInt2) {
    for (byte b = 0; b < this.m.length; b++) {
      boolean bool;
      if (bool = this.m[b].c(paramInt1, paramInt2)) {
        if (this.n != b) {
          this.m[this.n].d(false);
          this.n = b;
          this.m[this.n].d(true);
          return;
        } 
      } else {
        this.u = 5;
      } 
    } 
  }
  
  protected final void a(int paramInt) {
    boolean bool;
    if (!(bool = this.m[this.n].f(paramInt))) {
      int i = this.n;
      if (paramInt == 99) {
        this.n--;
        if (this.n < 0)
          this.n = this.m.length - 1; 
      } else if (paramInt == 98) {
        this.n++;
        if (this.n >= this.m.length)
          this.n = 0; 
      } 
      if (i != this.n) {
        this.m[i].d(false);
        this.m[this.n].d(true);
      } 
    } 
  }
  
  protected final void a(Graphics paramGraphics) {
    if (v.u > this.a.getHeight()) {
      paramGraphics.setColor(555256);
      paramGraphics.fillRect(0, 0, v.t, v.u - this.a.getHeight());
    } 
    int i;
    for (i = 0; i < v.t; i += this.a.getWidth())
      paramGraphics.drawImage(this.a, i, v.u, 36); 
    if (this.y)
      return; 
    paramGraphics.drawImage(this.b, this.d[0], this.d[1], 0);
    pc.a(paramGraphics, this.c[0], this.c[1], this.c[2], this.c[3], 15793151, true);
    if (this.o != null)
      this.o.a(paramGraphics); 
    for (i = 0; i < this.m.length; i++)
      this.m[i].a(paramGraphics, 0, 0); 
  }
  
  protected final void c() {
    if (this.u > 0) {
      this.u--;
      if (this.u == 0) {
        nw nw2;
        dg dg;
        df df1;
        nw nw1;
        switch ((nw1 = this).z.b()) {
          case 0:
            nw1.g();
            break;
          case 3:
            df1 = (df)(nw2 = nw1).m[3].q();
            nw2.m[4].a((Object[])df1.f);
            nw2.f();
            break;
          case 4:
            nw1.f();
            break;
          case 5:
            df1 = (nw2 = nw1).r[nw2.m[0].a()];
            dg = (dg)nw2.m[5].q();
            df1.e = dg;
            break;
        } 
        nw1.e();
      } 
    } 
    if (this.o != null)
      this.o.i(); 
    for (byte b = 0; b < this.m.length; b++)
      this.m[b].n(); 
  }
  
  private void f() {
    df df1;
    (df1 = (df)this.m[3].q()).e = (dg)this.m[4].q();
  }
  
  private void g() {
    df[] arrayOfDf1 = this.p[this.m[0].a()];
    df[] arrayOfDf2 = this.q[this.m[0].a()];
    df df1 = this.r[this.m[0].a()];
    this.m[0].a();
    byte b;
    for (b = 0; b < arrayOfDf1.length; b++)
      (arrayOfDf1[b]).e = (arrayOfDf1[b]).d; 
    for (b = 0; b < arrayOfDf2.length; b++)
      (arrayOfDf2[b]).e = (arrayOfDf2[b]).d; 
    df1.e = df1.d;
    this.m[2].a((Object[])arrayOfDf2);
    this.m[3].a((Object[])arrayOfDf1);
    this.m[4].a((Object[])(arrayOfDf1[0]).f);
    this.m[5].a((Object[])df1.f);
    e();
  }
  
  public final void a(df[] paramArrayOfdf1, df[] paramArrayOfdf2, df[] paramArrayOfdf3, df[] paramArrayOfdf4, df[] paramArrayOfdf5, df[] paramArrayOfdf6) {
    this.p = new df[2][];
    this.p[0] = paramArrayOfdf1;
    this.p[1] = paramArrayOfdf4;
    this.q = new df[2][];
    this.q[0] = paramArrayOfdf2;
    this.q[1] = paramArrayOfdf5;
    this.r = new df[2];
    this.r[0] = paramArrayOfdf3[0];
    this.r[1] = paramArrayOfdf6[0];
    this.s = new mb(89999);
    this.x = new mb[2];
    this.x[1] = new mb(79999);
    this.x[0] = new mb(79899);
    this.v = new mb[2][];
    byte b;
    for (b = 0; b < 2; b++) {
      this.v[b] = new mb[(this.q[b]).length];
      for (byte b1 = 0; b1 < (this.v[b]).length; b1++)
        this.v[b][b1] = new mb((this.q[b][b1]).a + 99); 
    } 
    this.w = new mb[2][];
    for (b = 0; b < 2; b++) {
      this.w[b] = new mb[(this.p[b]).length];
      for (byte b1 = 0; b1 < (this.w[b]).length; b1++)
        this.w[b][b1] = new mb((this.p[b][b1]).a + 99); 
    } 
    g();
    a.s().v();
  }
  
  public final void d(int paramInt1, int paramInt2) {
    int[] arrayOfInt;
    switch (paramInt2) {
      case 301:
        a.s().a(null, null);
        arrayOfInt = new int[] { 1, 2, 4 };
        ks.a().a(this.m[0].a(), arrayOfInt[this.m[1].a()], this.p[this.m[0].a()][this.m[3].a()], this.q[this.m[0].a()][this.m[2].a()], this.r[this.m[0].a()]);
        break;
      case 302:
        a.u();
        break;
    } 
    c(false);
  }
  
  public final void d() {
    this.y = true;
    gy gy;
    (gy = new gy()).b(241222);
    h();
    gy.t();
    ag.b().a(gy);
    co.b().a("lv1", -1);
    co.b().e();
  }
  
  public final void a(int paramInt1, int paramInt2, Object paramObject) {
    this.u = 5;
    this.z = (gg)paramObject;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\nw.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */