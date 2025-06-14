import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class da extends aq implements bf, bu {
  private static final int[] k = new int[] { 
      7930113, 12386818, 13894146, 16583949, 16583949, 12911106, 12911106, 10289666, 10289666, 9372162, 
      9372162, 9372162, 9372162 };
  
  private static final int[] l = new int[] { 
      227841, 375554, 381954, 719882, 719882, 377602, 377602, 231937, 236033, 236033, 
      231937, 231937, 231937 };
  
  private static final int[] m = new int[] { 
      14067456, 15579392, 15579392, 16765211, 16765211, 14593280, 14593280, 12095488, 12095488, 11109376, 
      11109376, 11109376, 11109376 };
  
  private cu n;
  
  private cu o;
  
  private k p = null;
  
  private k q = null;
  
  private k r = null;
  
  private k s = null;
  
  private k[] t = new k[7];
  
  private k[] u = new k[8];
  
  private Image v;
  
  private Image w;
  
  private Image x;
  
  private int[] y;
  
  private int[] z;
  
  private int A;
  
  private static final int[] B = new int[] { 1, 1, 1, 1 };
  
  private static final int[] C = new int[] { 1, 1, 1, 1 };
  
  private int D = 0;
  
  private int[][] E;
  
  private int F = 1;
  
  private int G;
  
  private fu[] H = new fu[8];
  
  private mg I = null;
  
  private mg J = null;
  
  private mg K = null;
  
  private mg L = null;
  
  private mc M = null;
  
  private boolean N = false;
  
  private lh O;
  
  private boolean P = true;
  
  public boolean i = true;
  
  private k Q;
  
  private k R;
  
  private k S;
  
  private static final String[] T = new String[] { "Cấp", "D.Vọng" };
  
  private static final String[] U = new String[] { "Cường Lực", "Nội Lực", "Thân Pháp", "Thể Lực" };
  
  private static String[] V = new String[] { "Tấn Công", "Chính xác", "Sinh lực" };
  
  private static String[] W = new String[] { "P.Thủ", "Né Tránh", "Chí Mạng" };
  
  private cu X;
  
  private cu Y;
  
  private cu Z;
  
  public k j;
  
  private boolean aa = false;
  
  private int ab;
  
  private int ac;
  
  private k ad;
  
  private k ae;
  
  private String af;
  
  private String ag;
  
  private jz ah;
  
  private int ai;
  
  private int aj;
  
  private int ak;
  
  private int al;
  
  private int am;
  
  private int an;
  
  private int ao;
  
  private String ap = "";
  
  private String aq = "";
  
  private String ar = "";
  
  private int as = 0;
  
  private int at = 0;
  
  private int au = 0;
  
  private int av = 0;
  
  private int aw = 0;
  
  private int ax = 0;
  
  private int ay = 0;
  
  private int az = 0;
  
  private int aA;
  
  private boolean aB;
  
  private int aC;
  
  private int aD;
  
  private int aE = 0;
  
  private int[][] aF;
  
  private static int[] aG = new int[] { 1000, 1001, 1002, 1003, 1004, 1005, 1006, 1007 };
  
  private String aH;
  
  private byte[] aI = new byte[] { 0, 2, 1 };
  
  private final d aJ;
  
  public da() {
    int i = 240;
    int j = 320 - ba.a;
    if (a.k == 1)
      i = v.t; 
    this.j = new k(0, 0, i, j);
    this.af = this.ag = "Chưa có";
    this.aJ = new if(new int[] { 16777215, 16744192 });
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.N)
      return; 
    da da2;
    k k1 = ((ay)(da2 = this).b).q();
    paramInt1 = this.j.a + paramInt1 - k1.a;
    paramInt2 = this.j.b + paramInt2 - k1.b;
    int j = paramInt2;
    int i = paramInt1;
    Graphics graphics = paramGraphics;
    da da1 = this;
    pc.d(graphics, i, j, da1.j.c, da1.j.d, v.aj);
    pc.c(graphics, da1.p.a + i, da1.p.b + j, da1.p.c, da1.p.d);
    int m = 0;
    byte b;
    for (b = 0; b < 2; b++) {
      pc.b(graphics, da1.Q.a + i, da1.Q.b + m + j, da1.Q.c, da1.Q.d, 1070484, 16579764, 14542575);
      bx.c.a(graphics, T[b], da1.Q.a - 2 + i, da1.Q.b + j + m, 2);
      m += da1.Q.d + 2;
    } 
    m = 0;
    for (b = 0; b < 3; b++) {
      pc.b(graphics, da1.ad.a + i, da1.ad.b + m + j, da1.ad.c, da1.ad.d, 1070484, 16579764, 14542575);
      bx.c.a(graphics, V[b], da1.ad.a - 5 + i, da1.ad.b + j + m, 2);
      m += da1.ad.d + 3;
    } 
    m = 0;
    for (b = 0; b < 3; b++) {
      pc.b(graphics, da1.ae.a + i, da1.ae.b + m + j, da1.ae.c, da1.ae.d, 1070484, 16579764, 14542575);
      bx.c.a(graphics, W[b], da1.ae.a - 5 + i, da1.ae.b + j + m, 2);
      m += da1.ae.d + 3;
    } 
    m = 0;
    for (b = 0; b < 4; b++) {
      pc.b(graphics, da1.R.a + i, da1.R.b + m + j, da1.R.c, da1.R.d, 1070484, 16579764, 14542575);
      if (b == da1.aI[da1.O.g / 2]) {
        a.h.a(graphics, U[b], da1.R.a - 5 + i, da1.R.b + j + m, 2);
      } else {
        bx.c.a(graphics, U[b], da1.R.a - 5 + i, da1.R.b + j + m, 2);
      } 
      m += da1.R.d + 3;
    } 
    pc.a(graphics, da1.S.a + i, da1.S.b + j, da1.S.c, da1.S.d, 10323806, 14273459);
    bx.d.c(true);
    bx.d.a(graphics, "Điểm", da1.S.a - 5 + i, da1.S.b + j, 2);
    bx.d.c(false);
    graphics.drawImage(da1.x, da1.q.a - 3 + i, da1.q.b + da1.q.d + j, 40);
    pc.a(graphics, da1.q.a + i, da1.q.b + j, da1.q.c, da1.q.d, 1463700, 16311483);
    graphics.drawImage(da1.w, da1.r.a - 3 + i, da1.r.b + da1.r.d + j, 40);
    pc.a(graphics, da1.r.a + i, da1.r.b + j, da1.r.c, da1.r.d, 1993479, 16311483);
    graphics.drawImage(da1.v, da1.s.a - 3 + i, da1.s.b + da1.s.d + j, 40);
    pc.a(graphics, da1.s.a + i, da1.s.b + j, da1.s.c, da1.s.d, 7293991, 16311483);
    pc.a(graphics, da1.Y.a + i, da1.Y.b + j, da1.j.c - (da1.Y.a << 1));
    pc.a(graphics, da1.X.a + i, da1.X.b + j, da1.j.c - (da1.X.a << 1));
    if (this.O != null) {
      int n = (this.Q.d - bx.c.a()) / 2 + 1;
      int i1 = this.Q.a + 7 + paramInt1;
      i = this.Q.a + this.Q.c - 5 + paramInt1;
      a.h.a(paramGraphics, this.O.Q, this.j.c - 15 + paramInt1, this.o.b + paramInt2, 2);
      bx.c.a(paramGraphics, (new StringBuffer(String.valueOf(this.O.G))).toString(), i1, this.Q.b + n + paramInt2, 0);
      bx.c.a(paramGraphics, this.af, i, this.Q.b + n + paramInt2, 2);
      n += this.Q.d + 2;
      bx.c.a(paramGraphics, (new StringBuffer(String.valueOf(this.O.ab))).toString(), i1, this.Q.b + n + paramInt2, 0);
      bx.c.a(paramGraphics, this.ag, i, this.Q.b + n + paramInt2, 2);
      i1 = this.R.a + this.R.c / 2 + paramInt1;
      n = (this.Q.d - bx.d.a()) / 2;
      i = this.R.d + 3;
      a.g.a(paramGraphics, (new StringBuffer(String.valueOf(this.z[0] + this.as))).toString(), i1, this.R.b + n + paramInt2, 1);
      if (this.O.l > 0) {
        j = bx.c.a((new StringBuffer(String.valueOf(this.z[0] + this.as))).toString());
        a.h.a(paramGraphics, " + " + this.O.l, i1 + j / 2, this.R.b + n + paramInt2, 0);
      } 
      n += i;
      a.g.a(paramGraphics, (new StringBuffer(String.valueOf(this.z[1] + this.at))).toString(), i1, this.R.b + n + paramInt2, 1);
      if (this.O.n > 0) {
        j = bx.c.a((new StringBuffer(String.valueOf(this.z[1] + this.at))).toString());
        a.h.a(paramGraphics, " + " + this.O.n, i1 + j / 2, this.R.b + n + paramInt2, 0);
      } 
      n += i;
      a.g.a(paramGraphics, (new StringBuffer(String.valueOf(this.z[2] + this.au))).toString(), i1, this.R.b + n + paramInt2, 1);
      if (this.O.m > 0) {
        j = bx.c.a((new StringBuffer(String.valueOf(this.z[2] + this.au))).toString());
        a.h.a(paramGraphics, " + " + this.O.m, i1 + j / 2, this.R.b + n + paramInt2, 0);
      } 
      n += i;
      a.g.a(paramGraphics, (new StringBuffer(String.valueOf(this.z[3] + this.av))).toString(), i1, this.R.b + n + paramInt2, 1);
      if (this.O.o > 0) {
        j = bx.c.a((new StringBuffer(String.valueOf(this.z[3] + this.av))).toString());
        a.h.a(paramGraphics, " + " + this.O.o, i1 + j / 2, this.R.b + n + paramInt2, 0);
      } 
      i1 = this.ad.a + this.ad.c / 2 + paramInt1;
      n = (this.ad.d - bx.d.a()) / 2 + 1;
      a.g.a(paramGraphics, (new StringBuffer(String.valueOf(this.ak))).toString(), i1, this.ad.b + n + paramInt2, 1);
      n += this.ad.d + 3;
      a.g.a(paramGraphics, (new StringBuffer(String.valueOf(this.an))).toString(), i1, this.ad.b + n + paramInt2, 1);
      n += this.ad.d + 3;
      a.g.a(paramGraphics, (new StringBuffer(String.valueOf(this.ai))).toString(), i1, this.ad.b + n + paramInt2, 1);
      i1 = this.ae.a + this.ae.c / 2 + paramInt1;
      n = (this.ae.d - bx.d.a()) / 2 + 1;
      a.g.a(paramGraphics, (new StringBuffer(String.valueOf(this.al))).toString(), i1, this.ae.b + n + paramInt2, 1);
      n += this.ae.d + 3;
      a.g.a(paramGraphics, (new StringBuffer(String.valueOf(this.am))).toString(), i1, this.ae.b + n + paramInt2, 1);
      n += this.ae.d + 3;
      a.g.a(paramGraphics, String.valueOf(this.ao) + "%", i1, this.ae.b + n + paramInt2, 1);
      bx.d.a(paramGraphics, (new StringBuffer(String.valueOf(this.A))).toString(), this.S.a + this.S.c / 2 + paramInt1, this.S.b + (this.S.d - bx.d.a()) / 2 + paramInt2, 1);
      pc.a(paramGraphics, this.q, this.aj * (this.q.c - 2) / this.ai, k, paramInt1, paramInt2);
      bx.d.a(paramGraphics, this.ar, this.q.a + (this.q.c >> 1) + paramInt1, this.q.b + paramInt2, 1);
      pc.a(paramGraphics, this.r, this.ab, l, paramInt1, paramInt2);
      bx.d.a(paramGraphics, this.ap, this.r.a + (this.q.c >> 1) + paramInt1, this.r.b + paramInt2, 1);
      if ((j = this.O.H * this.s.c / this.O.I) > this.s.c)
        j %= this.s.c; 
      pc.a(paramGraphics, this.s, j, m, paramInt1, paramInt2);
      bx.d.a(paramGraphics, this.aq, this.s.a + (this.s.c >> 1) + paramInt1, this.s.b + paramInt2, 1);
      n = paramInt1 + this.p.a;
      i1 = paramInt2 + this.p.b;
      if (this.I != null)
        this.I.a(paramGraphics, n, i1 + 4); 
      n = paramInt1 + this.n.a;
      i1 = paramInt2 + this.n.b;
      pc.b(paramGraphics, n, i1, this.O.g);
      n = paramInt1 + 10;
      i1 = paramInt2 + 95 - bx.d.b();
      String str = a.b(go.s);
      this.aJ.a(paramGraphics, str, n, i1, 0);
      n = paramInt1 + this.o.a;
      i1 = paramInt2 + this.o.b;
      bx.d.c(true);
      bx.d.a(paramGraphics, this.aH, n, i1, 0);
      bx.d.c(false);
      if (this.i && this.P) {
        for (n = 0; n < this.H.length; n++)
          this.H[n].a(paramGraphics, paramInt1, paramInt2); 
        pc.e(paramGraphics, (this.t[this.D]).a - 4 + paramInt1, (this.t[this.D]).b - 4 + paramInt2, (this.t[this.D]).c + 8, (this.t[this.D]).d + 8, this.F);
      } 
    } 
  }
  
  public final boolean a() {
    for (byte b = 0; b < this.y.length; b++) {
      if (this.y[b] > 0)
        return true; 
    } 
    return false;
  }
  
  private static boolean s() {
    return (a.k == 1);
  }
  
  public final void q() {
    if (!this.N) {
      this.w = f.d("/info/expicon");
      this.x = f.d("/info/heart");
      this.v = f.d("/info/gold");
      this.Q = s() ? new k(170, 20, 124, 16) : new k(110, 25, 118, 16);
      this.Y = new cu(10, this.Q.b + (this.Q.d + 2 << 2) + 6);
      int i = s() ? (this.j.c - 52) : 204;
      this.q = new k(26, this.Y.b + 6 + 2, i, 14);
      this.r = new k(26, this.q.b + this.q.d + 4, i, 14);
      this.s = new k(26, this.r.b + this.r.d + 4, i, 14);
      this.R = new k(81, this.s.b + this.s.d + 4, 93, 15);
      if (s())
        this.R.c = 126; 
      this.S = new k(this.s.a + this.s.c - 65, this.R.b + (this.R.d + 3 << 2) + 2, 65, 14);
      this.X = new cu(10, this.S.b + this.S.d + 2 + 6);
      i = s() ? 60 : 45;
      this.ad = new k(70, this.X.b + 6 + 2, i, 15);
      this.ae = new k(this.s.a + this.s.c - i, this.ad.b, i, 15);
      this.Z = new cu(this.Y.a, this.ae.b + (this.ae.d + 3) * 3 + 2);
      this.n = new cu(8, 4);
      this.o = new cu(25, 7);
      this.p = new k(10, 22, 50, 59);
      i = 0;
      int j = this.R.b + (this.R.d - 12) / 2;
      int m;
      int n = (m = this.R.a + this.R.c + 4) + 12 + 3;
      for (byte b = 0; b < 4; b++) {
        this.u[b] = new k(m, j + i, 12, 12);
        this.u[b + 4] = new k(n, j + i, 12, 12);
        i += this.R.d - 12 + 3 + 12;
      } 
      Image image;
      i = (image = f.d("/info/btinscrease")).getWidth() >> 2;
      j = image.getHeight();
      this.aF = new int[][] { { 0, 0, i, j }, { i, i, j }, { i << 1, i, j }, { i * 3, i, j } };
      for (j = 0; j < this.H.length; j++) {
        this.H[j] = new fu(image, aG[j]);
        this.H[j].a(this);
        i = (j > 4) ? 2 : 0;
        this.H[j].b(this.aF[i][0], this.aF[i][1], this.aF[i][2], this.aF[i][3]);
        this.H[j].b(false);
        this.H[j].a((this.u[j]).a, (this.u[j]).b, this.aF[i][2], this.aF[i][3]);
      } 
      this.t = new k[] { this.u[0], this.u[1], this.u[2], this.u[3], this.u[4], this.u[5], this.u[6], this.u[7] };
      this.j.d = this.Z.b + 6 + 4;
      da da1;
      (da1 = this).E = new int[da1.t.length][4];
      (new int[4])[0] = 1;
      (new int[4])[1] = -1;
      (new int[4])[2] = 4;
      (new int[4])[3] = -1;
      da1.E[0] = new int[4];
      (new int[4])[0] = 2;
      (new int[4])[2] = 5;
      (new int[4])[3] = -1;
      da1.E[1] = new int[4];
      (new int[4])[0] = 3;
      (new int[4])[1] = 1;
      (new int[4])[2] = 6;
      (new int[4])[3] = -1;
      da1.E[2] = new int[4];
      (new int[4])[0] = -1;
      (new int[4])[1] = 2;
      (new int[4])[2] = 7;
      (new int[4])[3] = -1;
      da1.E[3] = new int[4];
      (new int[4])[0] = 5;
      (new int[4])[1] = -1;
      (new int[4])[2] = -1;
      da1.E[4] = new int[4];
      (new int[4])[0] = 6;
      (new int[4])[1] = 4;
      (new int[4])[2] = -1;
      (new int[4])[3] = 1;
      da1.E[5] = new int[4];
      (new int[4])[0] = 7;
      (new int[4])[1] = 5;
      (new int[4])[2] = -1;
      (new int[4])[3] = 2;
      da1.E[6] = new int[4];
      (new int[4])[0] = -1;
      (new int[4])[1] = 6;
      (new int[4])[2] = -1;
      (new int[4])[3] = 3;
      da1.E[7] = new int[4];
      this.ah = jp.a(this.O.g);
      this.y = new int[4];
      this.z = new int[4];
      c(this.O);
      this.N = true;
      a(this.j.a, this.j.b, this.j.c, this.j.d);
      this.aH = a.a(this.O.b, e() - 85);
    } 
    u();
  }
  
  public final void a(lh paramlh) {
    this.O = paramlh;
    this.au = 0;
    this.at = 0;
    this.as = 0;
    this.av = 0;
    this.aw = 0;
    this.ay = 0;
    this.az = 0;
    this.ax = 0;
    this.aA = 0;
    if (this.ah == null) {
      this.ah = jp.a(this.O.g);
      this.ah.a(this.O.h + this.as + this.O.l, this.O.j + this.au + this.O.m, this.O.i + this.at + this.O.n, this.O.k + this.av + this.O.o);
    } 
    for (byte b = 0; b < this.O.D.length; b++) {
      for (byte b1 = 0; b1 < go.l.length; b1++) {
        if ((go.l[b1]).c.equals((this.O.D[b]).c) && (go.l[b1]).p != 0) {
          lb lb = (go.l[b1]).r;
          this.as += lb.a;
          this.av += lb.d;
          this.au += lb.b;
          this.at += lb.c;
          this.aw += lb.e;
          this.aw += this.ah.c() * lb.n / 100;
          this.ay += lb.g;
          this.az += lb.f;
          this.ax += lb.h;
          this.aA += lb.i;
        } 
      } 
    } 
    this.ah.a(this.O.h + this.as + this.O.l, this.O.j + this.au + this.O.m, this.O.i + this.at + this.O.n, this.O.k + this.av + this.O.o);
    mb[] arrayOfMb = mb.a(paramlh);
    nr nr = nr.a(paramlh);
    lc lc = lc.a(paramlh);
    this.J = mb.a(paramlh, false);
    this.J.a(lc);
    this.J.a(nr);
    this.L = mb.c(paramlh, arrayOfMb[0], arrayOfMb[1], arrayOfMb[3], arrayOfMb[2], false);
    this.L.a(lc);
    this.L.a(nr);
    this.K = mb.h(paramlh, arrayOfMb[0], arrayOfMb[1], arrayOfMb[3], arrayOfMb[2], false);
    this.K.a(lc);
    this.K.a(nr);
    Image image = f.d("/castingball");
    this.M = mb.a(paramlh, image, arrayOfMb[0], arrayOfMb[1], arrayOfMb[3], arrayOfMb[2], false);
    this.M.a(nr);
    if (!this.aB) {
      h(0);
    } else {
      h(1);
    } 
    this.aB = true;
    x();
    this.af = "[" + this.O.S + "]";
    this.ag = "[" + this.O.R + "]";
  }
  
  private void h(int paramInt) {
    this.aC = paramInt;
    switch (paramInt) {
      case 1:
        this.I = this.J;
        break;
      case 0:
        this.I = this.K;
        this.I.g(-70);
        this.aD = 1;
        break;
      case 2:
        this.I = this.L;
        break;
      case 3:
        this.I = this.M;
        break;
    } 
    this.I.c(2);
    this.I.j(20);
    this.I.i();
  }
  
  private void c(lh paramlh) {
    this.y = new int[4];
    this.z = new int[4];
    int i = paramlh.J - paramlh.M;
    int j = paramlh.N + 1 - paramlh.M;
    this.ab = i * this.r.c / j;
    if (this.ab > this.r.c)
      this.ab = this.r.c - 2; 
    this.ac = i * 1000 / j;
    this.ap = String.valueOf(this.ac / 10) + "," + (this.ac % 10) + "%";
    this.aq = String.valueOf(i.a(paramlh.H, ".")) + "/" + i.a(paramlh.I, ".");
    t();
    da da1;
    (da1 = this).z[0] = da1.O.h;
    da1.z[2] = da1.O.j;
    da1.z[1] = da1.O.i;
    da1.z[3] = da1.O.k;
    da1.A = da1.O.K;
    if (da1.O.K <= 0)
      da1.P = false; 
  }
  
  private void t() {
    byte b = 0;
    int i = this.H.length / 2;
    while (b < i) {
      if (this.A >= B[b]) {
        this.H[b].b(true);
        this.H[b].b(this.aF[1][0], this.aF[1][1], this.aF[1][2], this.aF[1][3]);
      } else {
        this.H[b].b(false);
        this.H[b].b(this.aF[0][0], this.aF[0][1], this.aF[0][2], this.aF[0][3]);
      } 
      if (this.y[b] > 0) {
        this.H[b + 4].b(true);
        this.H[b + 4].b(this.aF[3][0], this.aF[3][1], this.aF[3][2], this.aF[3][3]);
      } else {
        this.H[b + 4].b(false);
        this.H[b + 4].b(this.aF[2][0], this.aF[2][1], this.aF[2][2], this.aF[2][3]);
      } 
      b++;
    } 
  }
  
  private void u() {
    t();
    this.ah.a(this.z[0] + this.as + this.O.l, this.z[2] + this.au + this.O.m, this.z[1] + this.at + this.O.n, this.z[3] + this.av + this.O.o);
    x();
  }
  
  private void x() {
    this.ai = this.ah.a() + this.aA + this.O.p;
    this.aj = this.O.s + (this.ai - this.O.r) * this.O.q / 100 / 100;
    this.am = this.ah.e() + this.ax;
    this.ao = this.ah.g() + this.ay;
    this.al = this.ah.d() + this.az;
    this.an = this.ah.f();
    this.ak = this.ah.b() + this.aw;
    this.ah.c();
    this.ar = String.valueOf(i.a(this.aj, ".")) + "/" + i.a(this.ai, ".");
  }
  
  public final void n() {
    int i;
    if (!this.N)
      return; 
    switch (this.aC) {
      case 0:
        if (this.I.f(0, this.aD) && this.I.j())
          h(2); 
        this.aD += 3;
        break;
      case 2:
        if (this.I.j()) {
          this.aE++;
          if (this.aE >= 3) {
            h(3);
            this.aE = 0;
          } 
        } 
        break;
      case 3:
        if ((i = this.I.h()) == 1 && this.I.j()) {
          this.M.t = true;
          this.M.d(2);
          break;
        } 
        if (i == 2 && this.I.j())
          h(1); 
        break;
    } 
    this.G++;
    if (this.G > 3) {
      this.F = -this.F;
      this.G = 0;
    } 
    this.I.i();
  }
  
  private void i(int paramInt) {
    if ((paramInt = this.E[this.D][paramInt]) >= 0) {
      if (this.D != paramInt) {
        this.H[this.D].d(false);
        this.H[paramInt].d(true);
      } 
      this.D = paramInt;
    } 
  }
  
  public final void r() {
    ks.a().a(this.y[0] / B[0] * C[0], this.y[2] / B[1] * C[1], this.y[1] / B[2] * C[2], this.y[3] / B[3] * C[3]);
  }
  
  public final boolean f(int paramInt) {
    if (super.f(paramInt))
      return true; 
    switch (paramInt) {
      case 98:
        i(0);
        break;
      case 99:
        i(1);
        break;
      case 97:
        i(3);
        break;
      case 96:
        i(2);
        break;
      case 95:
        if (!this.i)
          return true; 
        if (this.D < this.H.length)
          return this.H[this.D].f(paramInt); 
        break;
      case 135:
        this.I = this.M;
        this.M.d(0);
        this.p.a = 100;
        this.I.c(2);
        break;
      case 142:
        this.I = this.M;
        this.M.d(0);
        this.p.a = 100;
        this.I.c(0);
        break;
    } 
    return true;
  }
  
  public final void d(int paramInt1, int paramInt2) {
    if (paramInt2 >= aG[0])
      if ((paramInt1 = paramInt2 % aG[0]) < 4) {
        if (this.A >= B[paramInt1]) {
          this.A -= B[paramInt1];
          this.y[paramInt1] = this.y[paramInt1] + B[paramInt1];
          this.z[paramInt1] = this.z[paramInt1] + C[paramInt1];
          u();
          return;
        } 
      } else {
        paramInt1 -= 4;
        if (this.y[paramInt1] >= B[paramInt1]) {
          this.y[paramInt1] = this.y[paramInt1] - B[paramInt1];
          this.z[paramInt1] = this.z[paramInt1] - C[paramInt1];
          this.A += B[paramInt1];
          u();
        } 
      }  
  }
  
  public final void b(lh paramlh) {
    a(paramlh);
    c(paramlh);
    u();
  }
  
  public final g v() {
    return new g(this.j.c, this.j.d);
  }
  
  public final int w() {
    return 10;
  }
  
  public final boolean c(int paramInt1, int paramInt2) {
    paramInt1 -= this.j.a;
    paramInt2 -= this.j.b;
    for (byte b = 0; b < this.H.length; b++) {
      if (this.H[b].c(paramInt1, paramInt2)) {
        if (this.D != b) {
          this.H[this.D].d(false);
          this.D = b;
        } 
        return true;
      } 
    } 
    return false;
  }
  
  public final boolean a(bf parambf, String paramString1, int paramInt1, String paramString2, int paramInt2) {
    for (paramInt1 = 0; paramInt1 < this.y.length; paramInt1++) {
      if (this.y[paramInt1] > 0) {
        al al;
        (al = ag.b().a("Chú ý", "Chưa cập nhật điểm cho nhân vật. Bạn muốn cập nhật không?", paramString1, 5, paramString2, 6, 1)).a(parambf);
        al.b(241226);
        ag.b().a(al, false);
        return true;
      } 
    } 
    return false;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\da.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */