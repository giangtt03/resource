import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class ib extends al implements b, bf, bq {
  private lh k;
  
  private ay l;
  
  private boolean m = false;
  
  private k n = new k(0, 0, v.t, v.u);
  
  private int o;
  
  private String[] p;
  
  private cu q = null;
  
  private k r = null;
  
  private cu s = null;
  
  private k t = null;
  
  private k u = null;
  
  private int v = 0;
  
  private int w = 2;
  
  private int x = 0;
  
  private String[] y = null;
  
  private byte z;
  
  private az A;
  
  private az B;
  
  private az C;
  
  private az D;
  
  private k E;
  
  private de F;
  
  private k G;
  
  private cu H;
  
  private bs I;
  
  private boolean J;
  
  private fv K;
  
  private k L;
  
  private gj M;
  
  private int N = 0;
  
  private boolean O = false;
  
  private String[] P = new String[] { "Chọn tuyệt chiêu có biểu tượng + màu đỏ. Bấm phím giữa. Rồi chọn nâng cấp.", "Bấm phím lên để tăng cấp, nếu sau khi tăng muốn giảm lại phấm phím xuống. Xong rồi thì bấm phím giữa", "Chọn menu trái > Cập nhật. Để cập nhật tuyệt chiêu cho nhân vật" };
  
  public ib() {
    super(1);
    b(241203);
    a(new ba());
    this.f = 240;
    this.g = 320 - ba.a;
    this.c = 0;
    this.d = 0;
    if (t()) {
      this.f = v.t;
      this.g = 240 - ba.a;
    } 
    this.c = (v.t >= this.f) ? ((v.t - this.f) / 2) : 0;
    this.d = (v.u >= this.g) ? ((v.u - ba.a - this.g) / 2) : 0;
    a(this.c, this.d, this.f, this.g);
    a(go.k);
    ib ib1;
    (ib1 = this).H = new cu(10, 22);
    ib1.q = new cu(ib1.H.a, ib1.H.b + 30 + 4);
    ib1.r = new k(ib1.H.a, 0, ib1.f - 30, 100);
    ib1.t = new k(12, 32, 218, 218);
    ib1.t.a = (ib1.f - ib1.t.c) / 2;
    ib1.u = new k(161, 10, 69, 14);
    if (t()) {
      ib1.q = new cu(ib1.H.a + 30 + 4, ib1.H.b + 4);
      ib1.t.d = 138;
      ib1.u.a = ib1.f - ib1.u.c - 10;
    } 
    ib1.s = new cu(ib1.u.a + ib1.u.c / 2, ib1.u.b + 1);
    ib1.G = new k(ib1.t.a, ib1.t.b + ib1.t.d + 4, ib1.t.c, 34);
    ib1.A = new gb(0, 0);
    ib1.B = new bd("Đóng", 10);
    ib1.D = new gb(12, 2);
    ib1.C = new gb(13, 3);
    ib1.F = new de(ib1.k.g / 2);
    ib1.F.a(ib1.k);
    ib1.F.i = new k(ib1.t.a, ib1.t.b, 218, 218);
    ib1.F.a(ib1);
    ib1.l = new ay();
    ib1.l.a(new k(ib1.t.a, ib1.t.b, ib1.t.c, ib1.t.d));
    ib1.l.b(ib1.F);
    ib1.l.h(1);
    ib1.a((byte)0);
    a(this);
    if (!cs.a.c(142)) {
      od.h(142);
      gr.n = false;
    } 
  }
  
  private static boolean t() {
    return (a.k == 1);
  }
  
  public final void c(Graphics paramGraphics) {
    ib ib1;
    Graphics graphics;
    int m;
    int n;
    int i1;
    cw.a(paramGraphics, this.n);
    pc.d(paramGraphics, this.c, this.d, this.f, this.g, v.aj);
    cw.b(paramGraphics, new k(this.c, this.d, this.f, this.g));
    int i = this.u.a + this.c;
    int j = this.u.b + this.d;
    pc.b(paramGraphics, i, j, this.u.c, this.u.d, 1070484, 16579764, 14542575);
    bx.d.c(true);
    bx.d.a(paramGraphics, "Điểm Kỹ Năng", i - 5, j, 2);
    bx.d.c(false);
    bx.e.a(paramGraphics, (new StringBuffer(String.valueOf(this.F.y()))).toString(), this.s.a + this.c, this.s.b + this.d, 1);
    switch (this.z) {
      case 0:
        n = this.d;
        m = this.c;
        graphics = paramGraphics;
        if ((ib1 = this).l != null) {
          ib1.l.a(graphics, m, n);
          ib1.l.c(true);
        } 
        if ((this.F.t()).b != null) {
          bx.d.c(true);
          int i2 = this.c + this.G.a;
          int i3 = this.d + this.G.b;
          bx.d.a(paramGraphics, (this.F.t()).b, i2 + 8, i3 + 4, 0);
          bx.d.c(false);
          if (this.F.r() <= 0)
            bx.d.a(paramGraphics, "Chưa học", i2 + 8, i3 + bx.d.a() + 4, 0); 
        } 
        break;
      default:
        n = this.d;
        m = this.c;
        graphics = paramGraphics;
        if ((ib1 = this).F.r() > 0) {
          graphics.drawImage(ib1.F.j[ib1.v], ib1.H.a + m, ib1.H.b + n, 0);
        } else {
          graphics.drawImage(ib1.F.k[ib1.v], ib1.H.a + m, ib1.H.b + n, 0);
        } 
        bx.c.a(graphics, (new StringBuffer(String.valueOf(ib1.F.r()))).toString(), ib1.H.a + m + ib1.F.j[ib1.v].getWidth(), ib1.H.b + n + ib1.F.j[ib1.v].getHeight() - bx.c.a(), 2);
        i1 = ib1.q.a + m;
        if ((ib1.F.t()).b != null) {
          bx.d.c(true);
          bx.d.a(graphics, (ib1.F.t()).b, ib1.q.a + m, ib1.q.b + n, 0);
          bx.d.c(false);
        } 
        n = ib1.q.b + n + bx.d.a();
        if (ib1.F.r() <= 0) {
          a.h.a(graphics, "Chưa học", i1, n, 0);
          n += bx.d.a();
        } else {
          bx.c.a(graphics, " - Tiêu hao nội lực: " + (ib1.o / 9) + " thành nội lực", i1, n, 0);
          n += a.h.a();
        } 
        pc.a(graphics, ib1.c + 4, n + 4, ib1.f - 8);
        n += 8;
        a.g.a(graphics, "Mô Tả: ", ib1.c + ib1.f / 2, n, 1);
        n += bx.d.a();
        if (ib1.y != null) {
          bx.a(graphics, bx.c, ib1.y, ib1.r.a + m, n, ib1.r.c, ib1.r.d, 0);
          bx.c.a();
        } 
        if (ib1.F.r() < (ib1.F.t()).c.length) {
          pc.b(graphics, ib1.E.a, ib1.E.b, ib1.E.c, ib1.E.d, v.aj, false);
          n = ib1.E.b + 5;
          a.h.a(graphics, (ib1.F.r() > 0) ? "Điều kiện tăng cấp: " : "Điều kiện được học: ", ib1.E.a + 4, n, 0);
          n += a.h.a();
          bx.a(graphics, a.h, ib1.p, ib1.E.a + 4, n, ib1.E.c, ib1.E.d, 0);
          n += ib1.p.length * a.h.a();
          m = (ib1.F.r() > 0) ? (ib1.F.r() - 1) : 0;
          a.h.a(graphics, " + Tiêu hao: " + ((ib1.F.t()).c[m]).c + " điểm kỹ năng", ib1.E.a + 4, n, 0);
        } 
        break;
    } 
    if (this.K != null)
      this.K.a(paramGraphics, 0, 0); 
    if (!this.J)
      cw.c(paramGraphics, this.n); 
    if (this.I != null)
      this.I.a(paramGraphics, 0, 0); 
    if (this.M != null)
      this.M.a(paramGraphics); 
  }
  
  private void a(byte paramByte) {
    ib ib2;
    gb gb;
    ib ib1;
    az az1;
    this.z = paramByte;
    switch (this.z) {
      case 0:
        a(a.n);
        az1 = this.A;
        (ib2 = this).a(az1, true);
        gb = new gb(1112, 3);
        az1 = gb;
        (ib1 = this).b(az1, true);
        return;
      case 1:
        e(this.v);
        az1 = null;
        (ib1 = this).a(az1, true);
        az1 = null;
        (ib1 = this).b(az1, true);
        a(this.B);
        break;
    } 
  }
  
  protected final void g() {
    if (this.l != null)
      this.l.n(); 
    this.x++;
    if (this.x > 3) {
      this.x = 0;
      this.w = -this.w;
    } 
    if (this.I != null) {
      this.I.n();
      return;
    } 
    if (this.K != null)
      this.K.i(); 
    if (this.M != null)
      this.M.i(); 
  }
  
  public final void a(lh paramlh) {
    this.k = paramlh;
    if (this.F != null)
      this.F.a(paramlh); 
  }
  
  private void e(int paramInt) {
    int j = paramInt;
    de de1;
    (de1 = this.F).l = j;
    int i = this.F.r();
    lw[] arrayOfLw = this.F.s();
    if (i == 0) {
      this.p = new String[2];
      this.p[0] = " + Nhân vật đạt cấp: " + ((arrayOfLw[paramInt]).c[i]).b;
      String str1 = "";
      for (byte b1 = 0; b1 < arrayOfLw.length; b1++) {
        if ((arrayOfLw[b1]).a == (arrayOfLw[paramInt]).d) {
          str1 = (arrayOfLw[b1]).b;
          break;
        } 
      } 
      this.p[1] = " + Phải học: " + str1;
    } else if (this.F.r() < (arrayOfLw[paramInt]).c.length) {
      this.p = new String[1];
      this.p[0] = " + Nhân vật đạt cấp: " + ((arrayOfLw[paramInt]).c[i]).b;
    } 
    this.o = (i - 1 < 0) ? ((arrayOfLw[paramInt]).c[0]).d : ((arrayOfLw[paramInt]).c[i - 1]).d;
    String str = (i - 1 < 0) ? ("Nếu sau khi học sẽ: " + ((arrayOfLw[paramInt]).c[0]).e) : ((arrayOfLw[paramInt]).c[i - 1]).e;
    this.y = bx.a(str, this.r.c, bx.c);
    if (this.p != null) {
      int m = (this.p.length + 2) * bx.c.a() + 4 + 4;
      this.E = new k(this.c + 7, this.d + this.g - m - 10, this.f - 15, m);
    } 
  }
  
  public final void c(int paramInt) {
    if (this.I != null) {
      int i = paramInt;
      az[] arrayOfAz = this.I.a();
      ib ib1 = this;
      if (ib1.i != null)
        ib1.i.d(-1, arrayOfAz[0].a()); 
      if (ib1.i != null)
        ib1.i.d(-1, arrayOfAz[1].a()); 
      if (ib1.i != null)
        ib1.i.d(-1, arrayOfAz[2].a()); 
      if ((i == 94 && arrayOfAz[0] != null && arrayOfAz[0].b()) ? true : ((i == 95 && arrayOfAz[1] != null && arrayOfAz[1].b()) ? true : ((i == 93 && arrayOfAz[2] != null && arrayOfAz[2].b())))) {
        v.c();
        return;
      } 
      if (this.I.f(paramInt))
        return; 
      u();
      return;
    } 
    if (this.z == 1) {
      switch (paramInt) {
        case 97:
        case 99:
          this.v--;
          if (this.v < 0)
            this.v = (this.F.s()).length - 1; 
          e(this.v);
          return;
        case 96:
        case 98:
          this.v++;
          if (this.v >= (this.F.s()).length)
            this.v = 0; 
          e(this.v);
          break;
      } 
      return;
    } 
    if (this.l != null)
      this.l.f(paramInt); 
  }
  
  public final void d(int paramInt) {
    if (this.I != null && this.I.g(paramInt))
      return; 
  }
  
  public final int a(Object paramObject1, Object paramObject2) {
    if (paramObject1 instanceof lv) {
      paramObject1 = paramObject1;
      return ((ld)(paramObject2 = paramObject2)).a - ((ld)paramObject1).a;
    } 
    paramObject1 = paramObject1;
    return ((lw)(paramObject2 = paramObject2)).a - ((lw)paramObject1).a;
  }
  
  private void a(bs parambs) {
    this.I = parambs;
    az az1 = this.C;
    ib ib1;
    (ib1 = this).b(az1, true);
    az1 = this.D;
    (ib1 = this).a(az1, true);
    a(new bd("", 12));
  }
  
  private void u() {
    v.c();
    this.I = null;
    e(true);
    a(this.z);
    this.J = false;
    if (this.m) {
      this.m = false;
      a(new bd("Xong", 20));
    } 
  }
  
  public final void d(int paramInt1, int paramInt2) {
    k k1;
    bs bs1;
    ib ib2;
    int j;
    String str;
    int m;
    int n;
    int i = paramInt2;
    ib ib1 = this;
    switch (i) {
      case 1111:
        a.G();
        if (ib1.F.u())
          ib1.w(); 
        ag.b().a(ib1.h(), false);
      case 1112:
        if (ib1.F.u())
          ib1.w(); 
        ag.b().a(ib1.h(), false);
      case 1113:
        ib1.v();
      case 1114:
        ib1.a((byte)1);
      case 1115:
        ib1.k(true);
        ib1.m = true;
        k1 = ib1.L;
        str = ((ib2 = ib1).F.r() - 1 < 0) ? "Bấm phím lên để nâng cấp." : ((ib2.F.t()).c[ib2.F.r() - 1]).e;
        ib2.K = new fv();
        m = ib2.c + 10;
        n = ib2.d + k1.b + k1.d + 3;
        ib2.K.a(m, n, ib2.f - 20, ib2.g / 4);
        ib2.K.a(str);
        if (n + ib2.K.q() > ib2.d + ib2.g)
          n = ib2.d + k1.b - ib2.K.q() - 3; 
        ib2.K.c(v.t + ib2.K.p(), n);
        ib2.K.a(m, n);
        if (ib1.O && ib1.N < 2) {
          ib1.M = null;
          ib1.M = new gj(ib1.P[ib1.N], ib1.f / 2 + ib1.c, ib1.d + ib1.g - 8, ib1.f - 20, 75, false);
          ib1.N++;
        } 
      default:
        break;
    } 
    if (false) {
      u();
      return;
    } 
    switch (paramInt2) {
      case 9:
        return;
      case 0:
        ib1 = this;
        bs1 = new bs();
        if (ib1.F.u()) {
          bs1.a(new br[] { new br("Cập nhật", 1113), new br("Chi Tiết", 1114), new br("Nhân Vật", 1111), new br("Đóng", 1112) });
        } else {
          bs1.a(new br[] { new br("Chi Tiết", 1114), new br("Nhân Vật", 1111), new br("Đóng", 1112) });
        } 
        j = (bs1.e() > bs1.f()) ? bs1.e() : bs1.f();
        bs1.a_(-j, ib1.j() - bs1.f() + j);
        bs1.d(0, v.u - ba.a - bs1.f());
        bs1.a(ib1);
        ib1.a(bs1);
        ib1.k(false);
        if (ib1.O && ib1.N > 2) {
          ib1.M = null;
          ib1.O = false;
        } 
        return;
      case 10:
        a((byte)0);
        return;
      case 13:
        u();
        return;
      case 12:
        this.I.f(95);
        return;
      case 16:
        ag.b().e(-4561239);
        u();
        ag.b().a(h(), false);
        return;
      case 15:
        ag.b().e(-4561239);
        v();
        u();
        a.s().e(h());
        return;
      case 19:
        u();
        return;
      case 20:
        k(false);
        a(a.n);
        return;
      case 21:
        this.I.f(95);
        break;
    } 
  }
  
  public final void a(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield I : Lbs;
    //   4: ifnull -> 116
    //   7: aload_0
    //   8: aload_0
    //   9: getfield I : Lbs;
    //   12: invokevirtual a : ()[Laz;
    //   15: iload_1
    //   16: iload_2
    //   17: istore #6
    //   19: istore #5
    //   21: astore #4
    //   23: astore_3
    //   24: iconst_0
    //   25: istore #7
    //   27: goto -> 85
    //   30: aload #4
    //   32: iload #7
    //   34: aaload
    //   35: ifnull -> 82
    //   38: aload #4
    //   40: iload #7
    //   42: aaload
    //   43: iload #5
    //   45: iload #6
    //   47: invokevirtual a : (II)Z
    //   50: ifeq -> 82
    //   53: aload_3
    //   54: getfield i : Lbf;
    //   57: ifnull -> 78
    //   60: aload_3
    //   61: getfield i : Lbf;
    //   64: iconst_m1
    //   65: aload #4
    //   67: iload #7
    //   69: aaload
    //   70: invokevirtual a : ()I
    //   73: invokeinterface d : (II)V
    //   78: iconst_1
    //   79: goto -> 94
    //   82: iinc #7, 1
    //   85: iload #7
    //   87: aload #4
    //   89: arraylength
    //   90: if_icmplt -> 30
    //   93: iconst_0
    //   94: ifeq -> 98
    //   97: return
    //   98: aload_0
    //   99: getfield I : Lbs;
    //   102: iload_1
    //   103: iload_2
    //   104: invokevirtual c : (II)Z
    //   107: ifeq -> 111
    //   110: return
    //   111: aload_0
    //   112: invokespecial u : ()V
    //   115: return
    //   116: aload_0
    //   117: getfield z : B
    //   120: iconst_1
    //   121: if_icmpne -> 125
    //   124: return
    //   125: iload_1
    //   126: aload_0
    //   127: getfield c : I
    //   130: isub
    //   131: istore_1
    //   132: iload_2
    //   133: aload_0
    //   134: getfield d : I
    //   137: isub
    //   138: istore_2
    //   139: aload_0
    //   140: getfield l : Lay;
    //   143: iload_1
    //   144: iload_2
    //   145: invokevirtual c : (II)Z
    //   148: pop
    //   149: return
  }
  
  public final void b(int paramInt1, int paramInt2) {
    if (this.I != null && this.I.f(paramInt1, paramInt2))
      return; 
    if (this.z == 1)
      return; 
    this.l.c(paramInt1, paramInt2);
  }
  
  public final void c(int paramInt1, int paramInt2) {
    if (this.I != null && this.I.e(paramInt1, paramInt2))
      return; 
    if (this.z == 1)
      return; 
    this.l.e(paramInt1, paramInt2);
  }
  
  private void v() {
    a.s().a(null, null);
    int[] arrayOfInt = new int[(this.F.s()).length];
    for (byte b1 = 0; b1 < arrayOfInt.length; b1++)
      arrayOfInt[b1] = (this.F.j(b1)).a; 
    ks.a().a(arrayOfInt, this.F.x());
  }
  
  private void w() {
    al al1;
    (al1 = ag.b().a("Chú ý", "Chưa cập nhật điểm cho nhân vật. Bạn muốn cập nhật không?", "Có", 15, "Không", 16, 1)).a(this);
    al1.b(-4561239);
    ag.b().a(al1, false);
  }
  
  private void k(boolean paramBoolean) {
    if (this.F != null)
      this.F.e(paramBoolean); 
    if (!paramBoolean) {
      this.K = null;
      if (this.O && this.N == 2) {
        this.M = new gj(this.P[this.N], 10, v.u - ba.a - 8, 200, 70, false);
        this.M.f(10);
        this.M.a(10);
        this.M.a(new k(this.M.n() + 9, this.M.o() + 9, this.M.p() - 20, this.M.q() - 20));
        this.M.c(true);
        this.N++;
      } 
    } 
  }
  
  public final void j(boolean paramBoolean) {
    if (gr.q && go.k.G < 10) {
      od.h(145);
      gr.q = false;
      paramBoolean = false;
      while (paramBoolean < go.r.length) {
        cu cu1;
        if (this.F.i(paramBoolean)) {
          this.O = true;
          this.N = 0;
          cu1 = this.F.h(paramBoolean);
          this.M = new gj(this.P[this.N], 10 + this.c, cu1.b - 10 + this.d, this.f - 20, 70, false);
          this.M.f(10 + this.c);
          this.M.a(cu1.a + 15);
          if (this.M.o() < 0) {
            this.M.g(cu1.b + 35 + this.d);
            this.M.a(true);
          } 
          this.M.a(new k(this.M.n() + 9, this.M.o() + 9, this.M.p() - 20, this.M.q() - 20));
          this.N++;
          return;
        } 
        cu1++;
      } 
    } 
  }
  
  public final void b(aq paramaq, int paramInt) {
    boolean bool = this.F.i(paramInt);
    k k1 = this.F.a();
    ib ib1;
    (ib1 = this).L = k1;
    bs bs1 = new bs();
    if (bool) {
      bs1.a(new br[] { new br("Nâng cấp", 1115), new br("Chi Tiết", 1114), new br("Đóng", 1112) });
    } else {
      bs1.a(new br[] { new br("Chi Tiết", 1114), new br("Đóng", 1112) });
    } 
    int j = ib1.c + k1.a + (k1.c - bs1.e()) / 2;
    int i;
    if ((i = ib1.d + k1.b + k1.d) + bs1.f() > ib1.d + ib1.g)
      i = ib1.d + ib1.g - bs1.f(); 
    j = (j < ib1.c) ? ib1.c : ((j + bs1.e() > ib1.c + ib1.f) ? (ib1.c + ib1.f - bs1.e()) : j);
    bs1.a_(v.t + bs1.e(), i);
    bs1.d(j, i);
    bs1.a(ib1);
    bs1.a_(1);
    ib1.a(bs1);
    ib1.J = true;
    if (ib1.N == 1 && ib1.M != null) {
      ib1.M.g(ib1.M.o() + (ib1.M.a() ? 70 : 0));
      ib1.M.a(new k(ib1.M.n() + 9, ib1.M.o() + 9, ib1.M.p() - 20, ib1.M.q() - 20));
    } 
  }
  
  public final void a(aq paramaq, int paramInt) {}
  
  public final void a(aq paramaq, int paramInt1, int paramInt2) {
    int i;
    if (this.F.q()) {
      if (this.K != null) {
        String str1 = (this.F.r() - 1 < 0) ? "Chưa học" : ((this.F.t()).c[this.F.r() - 1]).e;
        String str2 = str1;
        k k1 = this.L;
        ib ib1;
        (ib1 = this).K.a(str2);
        i = ib1.c + 10;
        int j;
        if ((j = ib1.d + k1.b + k1.d + 3) + ib1.K.q() > ib1.d + ib1.g)
          j = ib1.d + k1.b - ib1.K.q() - 3; 
        ib1.K.a(i, j);
        if (ib1.K.o() != j)
          ib1.K.g(j); 
        return;
      } 
    } else {
      this.v = i;
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ib.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */