import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class of extends an implements af, bf, bq {
  private boolean a;
  
  private k b;
  
  private ay c;
  
  private fg d = null;
  
  private ay k;
  
  private fg l = null;
  
  private k m;
  
  private k n;
  
  private az o;
  
  private az p;
  
  private az q;
  
  private Image r;
  
  private ff s;
  
  private int[] t = new int[2];
  
  private int[] u = new int[2];
  
  private int v = 0;
  
  private ex w;
  
  private ex x;
  
  private int y = 0;
  
  private int z = 6;
  
  private String A = "";
  
  private cu B;
  
  private cu C;
  
  private k D;
  
  private bs E;
  
  private boolean F;
  
  private hh G;
  
  private dc H;
  
  private cu I;
  
  private cu J;
  
  private cu K;
  
  private int L = 0;
  
  private int M;
  
  private boolean N = false;
  
  private boolean O = false;
  
  private boolean P = false;
  
  private boolean Q = false;
  
  private lm R;
  
  private ff S;
  
  private a T = new a();
  
  private int U;
  
  private aq[] V;
  
  private byte[][] W;
  
  private byte X = 0;
  
  private ox Y = new ox(null);
  
  private int Z = 0;
  
  private boolean aa;
  
  private int ab = 0;
  
  private boolean ac;
  
  private int ad = 0;
  
  private ex ae;
  
  private int af = 0;
  
  private np ag = new np();
  
  private lz ah;
  
  private Object ai = new Object();
  
  private int aj = 0;
  
  private String ak = null;
  
  private d al = new if(new int[] { 16711680, 16776960 });
  
  public of(String paramString) {
    super(8);
    String str = paramString;
    of of2;
    (of2 = this).A = str;
    a(false);
    d(false);
    a(new ba());
    a(this);
    int i = v.t;
    int j = v.u - ba.a;
    if (v.t >= v.u && v.t == 320) {
      i = 320;
      j = v.u - ba.a;
      this.a = true;
    } 
    int m = (v.t >= i) ? ((v.t - i) / 2) : 0;
    boolean bool = (v.u >= j) ? ((v.u - ba.a - j) / 2) : false;
    this.b = new k(m, bool, i, j);
    of of1;
    (of1 = this).r = f.d("/info/gold");
    of1.I = new cu(7, 7);
    if (of1.a) {
      of1.K = new cu(of1.b.c / 2 - 7, of1.I.b);
      of1.m = new k(10, 25, 112, 78);
      of1.u[0] = 10;
      of1.u[1] = of1.m.b + of1.m.d + 7;
      of1.s = new ff(null, 6, 4);
      of1.s.a(10 + bx.d.a("Giá bán: ") + 4, of1.u[1] - 3, 50, 18);
      of1.t[0] = of1.s.c() + of1.s.e() + 1;
      of1.t[1] = of1.s.d() + 3;
      j = bx.d.a("Đồng ý(5)") + 30;
      of1.w = new ex("Đồng ý", 6);
      of1.w.a(of1.s.c() + (of1.s.e() - j) / 2, of1.s.d() + of1.s.f() + 5, j, 18);
      j = bx.d.a("K. đồng ý") + 20;
      of1.x = new ex("K. đồng ý", 14);
      of1.x.a(of1.s.c() + (of1.s.e() - j) / 2, of1.s.d() + of1.s.f() + 5, j, 18);
      of1.B = null;
      of1.J = new cu(of1.f / 2 + 7, 7);
      of1.n = new k(184, 25, 112, 78);
      of1.C = new cu(of1.f / 2 + 7, of1.t[1]);
      of1.w.d();
      of1.w.f();
      j = of1.w.d() + of1.w.f() + 5;
      of1.D = new k(7, j, of1.f - 7 - 7, of1.b.d - j - 7);
    } else {
      of1.K = new cu(of1.b.c - 7, of1.I.b);
      m = of1.b.c - 7 - 7;
      of1.m = new k(7, 25, m, 44);
      of1.u[0] = 7;
      of1.u[1] = of1.m.b + of1.m.d + 7;
      of1.s = new ff(null, 6, 4);
      of1.s.a(7 + bx.d.a("Giá bán: ") + 4, of1.u[1] - 3, 50, 18);
      of1.s.a(of1);
      of1.t[0] = of1.s.c() + of1.s.e() + 1;
      of1.t[1] = of1.s.d() + 3;
      j = bx.d.a("Đồng ý(5)") + 20;
      of1.w = new ex("Đồng ý", 6);
      of1.w.a(of1.t[0] + bx.d.a(".000 KEN") + 7, of1.s.d(), j, 18);
      j = bx.d.a("K. đồng ý") + 10;
      of1.x = new ex("K. đồng ý", 14);
      of1.x.a(of1.t[0] + bx.d.a(".000 KEN") + 10, of1.s.d(), j, 18);
      of1.B = new cu(7, of1.s.d() + of1.s.f() + 7);
      j = of1.B.b + bx.d.a() + 7;
      of1.n = new k(7, j, m, 44);
      of1.J = new cu(7, of1.n.b - bx.d.a() - 3);
      of1.C = new cu(7, of1.n.b + of1.n.d + 5);
      j = of1.C.b + bx.d.a() + 3;
      of1.D = new k(7, j, m, of1.b.d - j - 7);
    } 
    of1.d = new fg(false);
    of1.d.a(of1);
    of1.d.i = new k(of1.m.a, of1.m.b, of1.m.c, of1.m.d);
    of1.d.d(of1.z, 0);
    of1.d.j = true;
    of1.c = new ay();
    of1.c.a(new k(of1.m.a, of1.m.b, of1.m.c, of1.m.d + 2));
    of1.c.b(of1.d);
    of1.c.h(2);
    of1.c.d(true);
    of1.d.i(0);
    of1.l = new fg(false);
    of1.l.a(of1);
    of1.l.i = new k(of1.n.a, of1.n.b, of1.n.c, of1.n.d);
    of1.l.d(of1.z, 0);
    of1.l.j = true;
    of1.k = new ay();
    of1.k.a(new k(of1.n.a, of1.n.b, of1.n.c, of1.n.d + 2));
    of1.k.b(of1.l);
    of1.c.h(2);
    of1.o = new gb(0, 0);
    of1.q = new gb(3, 2);
    of1.p = new gb(4, 3);
    of1.a(a.n);
    az az1 = of1.o;
    of of3;
    (of3 = of1).a(az1, true);
    az1 = of1.p;
    (of3 = of1).b(az1, true);
    of1.S = new ff("", 100, 2);
    of1.S.f(true);
    if (v.z) {
      byte b = 2;
      if (of1.a) {
        of1.S.a(0, v.u - ba.a, v.t - 40, ba.a);
        b = 0;
      } else {
        of1.S.a(of1.D.a, of1.D.b + of1.D.d - 18, of1.D.c - 45, 18);
      } 
      of1.S.a(false);
      of1.ae = new ex("Gửi", -2);
      of1.ae.a(of1.S.e() + of1.S.c() + b, of1.a ? (v.u - 20) : of1.S.d(), 40, 18);
    } else {
      of1.S.a(of1.D.a, of1.D.b + of1.D.d - 18, of1.D.c, 18);
    } 
    of1.S.a(false);
    of1.U = (of1.D.d - 6) / bx.c.a();
    of1.T = new a(of1.U);
    of1.V = new aq[] { of1.c, of1.s, of1.w, of1.k };
    (of3 = of1).W = new byte[4][4];
    if (of3.a) {
      (new byte[4])[0] = 3;
      (new byte[4])[1] = -1;
      (new byte[4])[2] = 1;
      (new byte[4])[3] = 3;
      of3.W[0] = new byte[4];
      (new byte[4])[0] = 3;
      (new byte[4])[1] = -1;
      (new byte[4])[2] = 2;
      of3.W[1] = new byte[4];
      (new byte[4])[0] = 3;
      (new byte[4])[1] = -1;
      (new byte[4])[2] = 3;
      (new byte[4])[3] = 1;
      of3.W[2] = new byte[4];
      (new byte[4])[0] = -1;
      (new byte[4])[3] = 2;
      of3.W[3] = new byte[4];
    } else {
      (new byte[4])[0] = 1;
      (new byte[4])[1] = -1;
      (new byte[4])[2] = 1;
      (new byte[4])[3] = -1;
      of3.W[0] = new byte[4];
      (new byte[4])[0] = 2;
      (new byte[4])[2] = 3;
      of3.W[1] = new byte[4];
      (new byte[4])[0] = 3;
      (new byte[4])[1] = 1;
      (new byte[4])[2] = 3;
      of3.W[2] = new byte[4];
      (new byte[4])[0] = -1;
      (new byte[4])[1] = 2;
      (new byte[4])[2] = -1;
      (new byte[4])[3] = 2;
      of3.W[3] = new byte[4];
    } 
    of1.ah = new lz(of1.f, of1.g, 30, (byte)10);
  }
  
  protected final void r() {}
  
  protected final void c() {
    if (this.E != null) {
      this.E.n();
      e(true);
    } 
    if (this.af > 0) {
      if (this.ah != null)
        this.ah.i(); 
      e(true);
      if (this.ag != null && this.ag.c() && this.ag.g() >= 60L) {
        this.ag.b();
        al al;
        (al = ag.b().a("", "Xin lỗi! kết nối tạm thời bị gián đoạn! Giao dịch sẽ bị hủy bỏ. Vui lòng thử lại sau!", "Đóng", 15, 1)).a(this);
        ag.b().a(al, false);
      } 
      return;
    } 
    for (byte b = 0; b < this.V.length; b++) {
      if (this.V[b] != null)
        this.V[b].n(); 
    } 
    if (this.S != null) {
      this.S.n();
      if (this.ae != null)
        this.ae.n(); 
    } 
    if (this.Z > 0) {
      ex ex1 = (ex)this.V[2];
      if (this.ak == null)
        this.ak = ex1.q(); 
      ex1.a(String.valueOf(this.ak) + " (" + (this.Z / 25) + ")");
      this.Z--;
      e(true);
      if (this.Z <= 0) {
        ex1.a(this.ak);
        this.ak = null;
      } 
    } 
    if (this.h) {
      this.aj--;
      if (this.aj <= 0) {
        e(false);
        this.aj = 0;
      } 
    } 
  }
  
  public final void e(boolean paramBoolean) {
    super.e(paramBoolean);
    this.aj = 5;
  }
  
  protected final void a(Graphics paramGraphics) {
    if (this.h) {
      pc.a(paramGraphics, this.b.a, this.b.b, this.b.c, this.b.d, v.aj, true);
      bx.d.c(true);
      bx.d.a(paramGraphics, go.e, this.b.a + 7, this.b.b + 7, 0);
      bx.d.c(false);
      String str1 = a.b(go.s);
      paramGraphics.drawImage(this.r, this.K.a + this.b.a - bx.d.a(str1), this.K.b + this.b.b + 2, 24);
      bx.d.a(paramGraphics, str1, this.K.a + this.b.a, this.K.b + this.b.b, 2);
      bx.d.a(paramGraphics, "Tiền gửi: ", this.b.a + this.u[0], this.b.b + this.u[1], 0);
      bx.d.a(paramGraphics, ".000 KEN", this.t[0] + this.b.a, this.t[1] + this.b.b, 0);
      if (this.B != null)
        pc.a(paramGraphics, this.B.a + this.b.a, this.B.b + this.b.b, this.m.c); 
      if (this.a) {
        paramGraphics.setColor(11972261);
        paramGraphics.drawLine(this.b.a + this.b.c / 2, this.b.b + 4, this.b.a + this.b.c / 2, this.b.b + this.b.d - 8);
      } 
      bx.d.c(true);
      bx.d.a(paramGraphics, this.A, this.J.a + this.b.a, this.J.b + this.b.b, 0);
      bx.d.c(false);
      pc.b(paramGraphics, this.D.a + this.b.a, this.D.b + this.b.b, this.D.c, this.D.d, v.aj, true);
      int i = 0;
      for (byte b = 0; b < this.T.d(); b++) {
        ((hf)this.T.b(b)).a(paramGraphics, this.D.a + 7 + this.b.a, this.D.b + 3 + i + this.b.b);
        i += bx.c.a();
      } 
    } 
    if (this.V != null) {
      byte b = 0;
      int i = this.V.length;
      while (b < i) {
        this.V[b].a(paramGraphics, this.b.a, this.b.b);
        b++;
      } 
    } 
    String str = "Tiền gửi: " + i.a(this.v, ".");
    if (this.v == 0) {
      str = String.valueOf(str) + " KEN";
    } else {
      str = String.valueOf(str) + ".000 KEN";
    } 
    if (this.ac) {
      int i = v.aj;
      if (this.ad % 2 == 0)
        i = 15081495; 
      paramGraphics.setColor(i);
      paramGraphics.fillRect(this.C.a + this.b.a, this.C.b + this.b.b - 2, bx.d.a(str), 18);
      this.ad--;
      if (this.ad == 0)
        this.ac = false; 
    } 
    bx.d.a(paramGraphics, str, this.C.a + this.b.a, this.C.b + this.b.b, 0);
    if (this.O || this.N) {
      pc.b(paramGraphics, this.m.a + this.b.a, this.m.b + this.b.b, this.m.c, this.m.d, 16686236, true);
    } else if (this.c.m()) {
      pc.b(paramGraphics, this.m.a + this.b.a, this.m.b + this.b.b, this.m.c, this.m.d, 7070703, true);
    } 
    if (this.O || this.N) {
      pc.b(paramGraphics, this.n.a + this.b.a, this.n.b + this.b.b, this.n.c, this.n.d, 16686236, true);
    } else if (this.k.m()) {
      pc.b(paramGraphics, this.n.a + this.b.a, this.n.b + this.b.b, this.n.c, this.n.d, 7070703, true);
    } else if (this.aa) {
      int i = v.aj;
      if (this.ab % 2 == 0)
        i = 15081495; 
      pc.b(paramGraphics, this.n.a + this.b.a, this.n.b + this.b.b, this.n.c, this.n.d, i, true);
      this.ab--;
      if (this.ab == 0)
        this.aa = false; 
    } 
    this.k.a(paramGraphics, this.b.a, this.b.b);
    this.c.a(paramGraphics, this.b.a, this.b.b);
    if (this.E != null && this.F)
      this.E.a(paramGraphics, 0, 0); 
    if (this.E != null && !this.F)
      this.E.a(paramGraphics, 0, 0); 
    Graphics graphics = paramGraphics;
    of of1;
    if (this.af > 0 && (of1 = this).ah != null)
      of1.ah.a(graphics); 
  }
  
  protected final void d(Graphics paramGraphics) {
    super.d(paramGraphics);
    if (this.S.i()) {
      if (this.a) {
        paramGraphics.setColor(16777215);
        paramGraphics.fillRect(0, v.u - ba.a, v.t, ba.a);
      } 
      this.S.a(paramGraphics, this.b.a, this.b.b);
      if (this.ae != null)
        this.ae.a(paramGraphics, this.b.a, this.b.b); 
    } 
  }
  
  protected final void a(int paramInt) {
    fg fg1;
    e(true);
    if (this.af > 0)
      return; 
    if (this.E != null) {
      int i = paramInt;
      az[] arrayOfAz = this.E.a();
      of of1 = this;
      if (of1.i != null)
        of1.i.d(-1, arrayOfAz[0].a()); 
      if (of1.i != null)
        of1.i.d(-1, arrayOfAz[1].a()); 
      if (of1.i != null)
        of1.i.d(-1, arrayOfAz[2].a()); 
      if ((i == 94 && arrayOfAz[0] != null && arrayOfAz[0].b()) ? true : ((i == 95 && arrayOfAz[1] != null && arrayOfAz[1].b()) ? true : ((i == 93 && arrayOfAz[2] != null && arrayOfAz[2].b())))) {
        v.c();
        return;
      } 
      if (this.E.f(paramInt))
        return; 
      v();
      return;
    } 
    if (this.S.i()) {
      if (paramInt == 95 || paramInt == 110) {
        g();
        return;
      } 
      if (!this.S.f(paramInt))
        u(); 
      return;
    } 
    if (!this.s.m())
      switch (paramInt) {
        case 95:
        case 96:
        case 97:
        case 98:
        case 99:
          break;
        default:
          if (!this.S.i()) {
            t();
            this.S.f(paramInt);
          } 
          return;
      }  
    byte b = this.X;
    switch (paramInt) {
      case 96:
      case 97:
      case 98:
      case 99:
        if (!this.V[this.X].f(paramInt)) {
          int i = paramInt - 96;
          of of1 = this;
          byte b1;
          if (i >= 0 && (b1 = of1.W[of1.X][i]) >= 0)
            of1.X = b1; 
        } 
        if (b != this.X) {
          this.V[this.X].d(true);
          this.V[b].d(false);
          if (this.V[b].equals(this.s))
            y(); 
          if (this.V[this.X] instanceof ay) {
            (fg1 = (fg)((ay)this.V[this.X]).w()).i(0);
            return;
          } 
        } 
        return;
      case 95:
        if (this.V[2].m()) {
          this.i.d(0, ((ex)this.V[2]).a());
          return;
        } 
        this.V[this.X].f(fg1);
        return;
    } 
    this.V[this.X].f(fg1);
  }
  
  private void g() {
    String str;
    if ((str = this.S.r()) == null || str.equals(""))
      return; 
    ks.a().a(this.A, str);
    a(str, (byte)2, bx.d);
    this.S.c("");
  }
  
  private void f(int paramInt) {
    this.af = paramInt;
    this.ag.b();
    this.ag.a();
  }
  
  protected final void e(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: iconst_1
    //   2: invokevirtual e : (Z)V
    //   5: aload_0
    //   6: getfield af : I
    //   9: ifle -> 13
    //   12: return
    //   13: aload_0
    //   14: getfield E : Lbs;
    //   17: ifnull -> 129
    //   20: aload_0
    //   21: aload_0
    //   22: getfield E : Lbs;
    //   25: invokevirtual a : ()[Laz;
    //   28: iload_1
    //   29: iload_2
    //   30: istore #6
    //   32: istore #5
    //   34: astore #4
    //   36: astore_3
    //   37: iconst_0
    //   38: istore #7
    //   40: goto -> 98
    //   43: aload #4
    //   45: iload #7
    //   47: aaload
    //   48: ifnull -> 95
    //   51: aload #4
    //   53: iload #7
    //   55: aaload
    //   56: iload #5
    //   58: iload #6
    //   60: invokevirtual a : (II)Z
    //   63: ifeq -> 95
    //   66: aload_3
    //   67: getfield i : Lbf;
    //   70: ifnull -> 91
    //   73: aload_3
    //   74: getfield i : Lbf;
    //   77: iconst_m1
    //   78: aload #4
    //   80: iload #7
    //   82: aaload
    //   83: invokevirtual a : ()I
    //   86: invokeinterface d : (II)V
    //   91: iconst_1
    //   92: goto -> 107
    //   95: iinc #7, 1
    //   98: iload #7
    //   100: aload #4
    //   102: arraylength
    //   103: if_icmplt -> 43
    //   106: iconst_0
    //   107: ifeq -> 111
    //   110: return
    //   111: aload_0
    //   112: getfield E : Lbs;
    //   115: iload_1
    //   116: iload_2
    //   117: invokevirtual c : (II)Z
    //   120: ifeq -> 124
    //   123: return
    //   124: aload_0
    //   125: invokespecial v : ()V
    //   128: return
    //   129: aload_0
    //   130: getfield X : B
    //   133: istore_3
    //   134: iconst_0
    //   135: istore #5
    //   137: goto -> 522
    //   140: aload_0
    //   141: getfield V : [Laq;
    //   144: iload #5
    //   146: aaload
    //   147: aload_0
    //   148: getfield c : Lay;
    //   151: invokevirtual equals : (Ljava/lang/Object;)Z
    //   154: ifeq -> 225
    //   157: new k
    //   160: dup
    //   161: aload_0
    //   162: getfield d : Lfg;
    //   165: getfield i : Lk;
    //   168: getfield a : I
    //   171: aload_0
    //   172: getfield b : Lk;
    //   175: getfield a : I
    //   178: iadd
    //   179: aload_0
    //   180: getfield d : Lfg;
    //   183: getfield i : Lk;
    //   186: getfield b : I
    //   189: aload_0
    //   190: getfield b : Lk;
    //   193: getfield b : I
    //   196: iadd
    //   197: aload_0
    //   198: getfield d : Lfg;
    //   201: getfield i : Lk;
    //   204: getfield c : I
    //   207: aload_0
    //   208: getfield d : Lfg;
    //   211: getfield i : Lk;
    //   214: getfield d : I
    //   217: invokespecial <init> : (IIII)V
    //   220: astore #4
    //   222: goto -> 375
    //   225: aload_0
    //   226: getfield V : [Laq;
    //   229: iload #5
    //   231: aaload
    //   232: aload_0
    //   233: getfield k : Lay;
    //   236: invokevirtual equals : (Ljava/lang/Object;)Z
    //   239: ifeq -> 310
    //   242: new k
    //   245: dup
    //   246: aload_0
    //   247: getfield l : Lfg;
    //   250: getfield i : Lk;
    //   253: getfield a : I
    //   256: aload_0
    //   257: getfield b : Lk;
    //   260: getfield a : I
    //   263: iadd
    //   264: aload_0
    //   265: getfield l : Lfg;
    //   268: getfield i : Lk;
    //   271: getfield b : I
    //   274: aload_0
    //   275: getfield b : Lk;
    //   278: getfield b : I
    //   281: iadd
    //   282: aload_0
    //   283: getfield l : Lfg;
    //   286: getfield i : Lk;
    //   289: getfield c : I
    //   292: aload_0
    //   293: getfield l : Lfg;
    //   296: getfield i : Lk;
    //   299: getfield d : I
    //   302: invokespecial <init> : (IIII)V
    //   305: astore #4
    //   307: goto -> 375
    //   310: new k
    //   313: dup
    //   314: aload_0
    //   315: getfield V : [Laq;
    //   318: iload #5
    //   320: aaload
    //   321: invokevirtual c : ()I
    //   324: aload_0
    //   325: getfield b : Lk;
    //   328: getfield a : I
    //   331: iadd
    //   332: aload_0
    //   333: getfield V : [Laq;
    //   336: iload #5
    //   338: aaload
    //   339: invokevirtual d : ()I
    //   342: aload_0
    //   343: getfield b : Lk;
    //   346: getfield b : I
    //   349: iadd
    //   350: aload_0
    //   351: getfield V : [Laq;
    //   354: iload #5
    //   356: aaload
    //   357: invokevirtual e : ()I
    //   360: aload_0
    //   361: getfield V : [Laq;
    //   364: iload #5
    //   366: aaload
    //   367: invokevirtual f : ()I
    //   370: invokespecial <init> : (IIII)V
    //   373: astore #4
    //   375: aload #4
    //   377: iload_1
    //   378: iload_2
    //   379: invokevirtual a : (II)Z
    //   382: ifeq -> 515
    //   385: aload_0
    //   386: getfield S : Lff;
    //   389: invokevirtual i : ()Z
    //   392: ifeq -> 399
    //   395: aload_0
    //   396: invokespecial u : ()V
    //   399: iload #5
    //   401: iload_3
    //   402: if_icmpeq -> 454
    //   405: aload_0
    //   406: iload #5
    //   408: putfield X : B
    //   411: aload_0
    //   412: getfield V : [Laq;
    //   415: iload_3
    //   416: aaload
    //   417: iconst_0
    //   418: invokevirtual d : (Z)V
    //   421: aload_0
    //   422: getfield V : [Laq;
    //   425: iload_3
    //   426: aaload
    //   427: aload_0
    //   428: getfield s : Lff;
    //   431: invokevirtual equals : (Ljava/lang/Object;)Z
    //   434: ifeq -> 441
    //   437: aload_0
    //   438: invokespecial y : ()V
    //   441: aload_0
    //   442: getfield V : [Laq;
    //   445: aload_0
    //   446: getfield X : B
    //   449: aaload
    //   450: iconst_1
    //   451: invokevirtual d : (Z)V
    //   454: aload_0
    //   455: getfield V : [Laq;
    //   458: iload #5
    //   460: aaload
    //   461: iload_1
    //   462: aload_0
    //   463: getfield b : Lk;
    //   466: getfield a : I
    //   469: isub
    //   470: iload_2
    //   471: aload_0
    //   472: getfield b : Lk;
    //   475: getfield b : I
    //   478: isub
    //   479: invokevirtual c : (II)Z
    //   482: pop
    //   483: aload_0
    //   484: getfield V : [Laq;
    //   487: iload #5
    //   489: aaload
    //   490: instanceof ex
    //   493: ifeq -> 514
    //   496: aload_0
    //   497: iconst_m1
    //   498: aload_0
    //   499: getfield V : [Laq;
    //   502: iload #5
    //   504: aaload
    //   505: checkcast ex
    //   508: invokevirtual a : ()I
    //   511: invokevirtual d : (II)V
    //   514: return
    //   515: iload #5
    //   517: iconst_1
    //   518: iadd
    //   519: i2b
    //   520: istore #5
    //   522: iload #5
    //   524: aload_0
    //   525: getfield V : [Laq;
    //   528: arraylength
    //   529: if_icmplt -> 140
    //   532: aload_0
    //   533: getfield S : Lff;
    //   536: invokevirtual i : ()Z
    //   539: ifne -> 549
    //   542: aload_0
    //   543: invokespecial t : ()V
    //   546: goto -> 591
    //   549: aload_0
    //   550: getfield ae : Lex;
    //   553: ifnull -> 591
    //   556: aload_0
    //   557: getfield ae : Lex;
    //   560: invokevirtual h : ()Lk;
    //   563: iload_1
    //   564: aload_0
    //   565: getfield b : Lk;
    //   568: getfield a : I
    //   571: isub
    //   572: iload_2
    //   573: aload_0
    //   574: getfield b : Lk;
    //   577: getfield b : I
    //   580: isub
    //   581: invokevirtual a : (II)Z
    //   584: ifeq -> 591
    //   587: aload_0
    //   588: invokespecial g : ()V
    //   591: aload_0
    //   592: getfield S : Lff;
    //   595: iload_1
    //   596: iload_2
    //   597: invokevirtual c : (II)Z
    //   600: pop
    //   601: return
  }
  
  private void t() {
    this.S.a(true);
    this.S.d(true);
    this.S.c("");
    az az1 = null;
    of of1;
    (of1 = this).a(az1, true);
    az1 = null;
    (of1 = this).b(az1, true);
    e(true);
  }
  
  private void u() {
    this.S.d(false);
    this.S.a(false);
    az az1 = this.o;
    of of1;
    (of1 = this).a(az1, true);
    az1 = this.p;
    (of1 = this).b(az1, true);
    if (this.X != 0) {
      this.V[this.X].d(false);
      this.X = 0;
      this.V[this.X].d(true);
      this.d.i(0);
    } 
  }
  
  public final void d(int paramInt1, int paramInt2) {
    of of1;
    gu gu;
    hh hh1;
    bs bs1;
    int i;
    int j;
    of of2;
    int m;
    az az1;
    e(true);
    if (paramInt2 == 15) {
      ks.a().l();
      ag.b().l();
      return;
    } 
    if (this.af > 0)
      return; 
    if (g(paramInt2)) {
      v();
      return;
    } 
    switch (paramInt2) {
      case 4:
        if (this.E != null) {
          v();
          return;
        } 
        x();
        return;
      case 0:
        of1 = this;
        bs1 = new bs();
        if (of1.N) {
          bs1.a(new br("Đồng ý", 11119));
        } else {
          bs1.a(new br[] { of1.O ? new br("K. đồng ý", 14) : new br("Đồng ý", 11119) });
        } 
        bs1.a(new br("Hủy giao dịch", 11117));
        j = (bs1.e() > bs1.f()) ? bs1.e() : bs1.f();
        bs1.a_(-j, of1.j() - bs1.f() + j);
        bs1.d(0, v.u - ba.a - bs1.f());
        bs1.a(of1);
        of1.b(bs1);
        az1 = of1.p;
        (of2 = of1).b(az1, true);
        az1 = of1.q;
        (of2 = of1).a(az1, true);
        bs1.c(a.n);
        return;
      case 3:
        c(95);
        return;
      case 5:
        return;
      case 6:
        g(11119);
        return;
      case 1:
        return;
      case 1235:
        ag.b().a(241202, false);
        return;
      case 1234:
        if ((this.G.t()).k != null) {
          if ((this.G.t()).j == 1 || (this.G.t()).j == 2) {
            lm lm1 = (lm)(this.G.t()).k;
            dc dc1 = new dc(null, lm1.b(), (this.G.t()).j, this.al);
            gu gu1;
            (gu1 = new gu(dc1)).a(this);
            gu1.e(lm1.g);
            az1 = new bd("Xong", 12);
            gu gu2;
            (gu2 = gu1).a(az1, true);
            gu1.a(new bd("", 12));
            az1 = new bd("Hủy", 13);
            (gu2 = gu1).b(az1, true);
            gu1.b(-7524);
            gu1.j(true);
            ag.b().a(gu1, false);
            ag.b().a(241202, false);
            return;
          } 
          if (this.y < this.z) {
            this.M = 0;
            if ((this.G.t()).j == 0 && ((ll)(this.G.t()).k).a()) {
              ks.a().k(((ll)(this.G.t()).k).c);
              f(this.af + 1);
              ag.b().a(241202, false);
              return;
            } 
          } 
        } 
        break;
      case 7:
        ag.b().a(241212, false);
        return;
      case 8:
        of1 = this;
        i = (i = go.l.length) - go.k.D.length;
        for (j = 0; j < go.m.length; j++)
          i++; 
        for (m = 0; m < of1.l.s(); m++) {
          dc dc1;
          if ((dc1 = (dc)of1.l.k(m)).k != null)
            i++; 
        } 
        for (m = 0; m < of1.d.s(); m++) {
          dc dc1;
          if ((dc1 = (dc)of1.d.k(m)).k != null)
            i--; 
        } 
        if ((of1.G != null) ? ((i > of1.G.x())) : ((i > go.n))) {
          a.a(this, "Hành Trang", 1110, "Đóng", 110);
          return;
        } 
        this.P = true;
        ks.a().m();
        ag.b().a(-7894, false);
        f(this.af + 1);
        return;
      case 9:
        ag.b().a(-7894, false);
        return;
      case 10:
        ag.b().l();
        ks.a().l();
        ag.b().f(1);
        return;
      case 11:
        ag.b().a(-7946, false);
        return;
      case 12:
        if (a.s().c(-7524) && (gu = (gu)a.s().d(-7524)) != null) {
          i = 0;
          this.R = gu.t();
          this.R.g = gu.u();
          m = this.R.g;
          for (byte b = 0; b < this.d.s(); b++) {
            lm lm1;
            dc dc1;
            if ((dc1 = (dc)this.d.k(b)).k != null && dc1.j == 1 && (lm1 = (lm)dc1.k) != null && lm1.a == this.R.a) {
              m += lm1.g;
              i = 1;
            } 
          } 
          if (i != 0 || this.y < this.z) {
            this.M = 2;
            ks.a().e(this.R.a, m);
            f(this.af + 1);
          } 
          ag.b().a(-7524, false);
          return;
        } 
        break;
      case 13:
        ag.b().a(-7524, false);
        return;
      case 14:
        ks.a().n();
        f(this.af + 1);
        v();
        return;
      case 16:
        ag.b().a(-7426, false);
        return;
      case 17:
        ag.b().a(false);
        ag.b().f(1);
        return;
      case 1110:
        ag.b().a(241209, false);
        hh1 = new hh(this.Y, this.al);
        ag.b().a(hh1);
        return;
      case 110:
        ag.b().a(241209, false);
        break;
    } 
  }
  
  private void b(bs parambs) {
    this.E = parambs;
    if (this.s != null && this.s.m()) {
      y();
      return;
    } 
    if (this.S.i())
      g(); 
  }
  
  private void v() {
    this.E = null;
    az az1 = this.p;
    of of1;
    (of1 = this).b(az1, true);
    az1 = this.o;
    (of1 = this).a(az1, true);
    e(true);
    this.F = false;
  }
  
  private boolean g(int paramInt) {
    switch (paramInt) {
      case 11119:
        if (this.Z > 0) {
          al al;
          (al = ag.b().a("Chú ý", "Vui lòng kiểm tra các món hàng giao dịch trước khi đồng ý! vui lòng chớ hết thơi gian đếm ngược.", "Đóng", 16, 1)).a(this);
          al.b(-7426);
          ag.b().a(al, false);
          return true;
        } 
        d(-1, 8);
        return true;
      case 11118:
        if (this.G == null) {
          this.G = new hh(this.Y, this.al);
          this.G.a(this);
          this.G.h(2);
        } 
        ag.b().a(this.G);
        return true;
      case 11117:
        x();
        return true;
      case 11116:
        if (this.H != null && this.H.k != null)
          if (this.H.j == 0) {
            a.a((ll)this.H.k, this, "", -23434, "Đóng", 7);
          } else {
            a.a((lm)this.H.k, null);
          }  
        return true;
      case 11115:
        if (this.H.k != null)
          if (this.H.j == 0) {
            ks.a().l(((ll)this.H.k).c);
            this.M = 0;
          } else {
            this.R = (lm)this.H.k;
            paramInt = 0;
            for (byte b = 0; b < this.d.s(); b++) {
              lm lm1;
              if ((((dc)this.d.k(b)).j == 1 || ((dc)this.d.k(b)).j == 2) && (lm1 = (lm)((dc)this.d.k(b)).k) != null && lm1.a == this.R.a)
                paramInt += lm1.g; 
            } 
            ks.a().e(this.R.a, paramInt - this.R.g);
            this.M = 2;
          }  
        this.Q = true;
        f(this.af + 1);
        return true;
    } 
    return false;
  }
  
  public final void d() {
    this.af--;
    w();
    switch (this.M) {
      case 1:
        if (this.Q) {
          this.Q = false;
          this.d.a(this.H);
          this.G.b(this.H);
          this.d.i(this.d.q());
          this.y--;
          return;
        } 
        this.y++;
        this.d.a(this.G.t());
        this.G.a(this.G.t());
        this.d.i(this.d.q());
        return;
      case 2:
        if (this.Q) {
          this.d.a(this.H);
          this.G.b((lm)this.H.k);
          this.G.v();
          this.Q = false;
          this.H = null;
          this.y--;
          return;
        } 
        if (this.R != null) {
          int i = 0;
          a a1 = new a();
          int j;
          for (j = 0; j < this.d.s(); j++) {
            lm lm1;
            if (((dc)this.d.k(j)).j == 1 && (lm1 = (lm)((dc)this.d.k(j)).k) != null && lm1.a == this.R.a) {
              i += lm1.g;
              a1.a(this.d.k(j));
            } 
          } 
          i += this.R.g;
          for (j = 0; j < a1.d(); j++) {
            this.d.a((dc)a1.b(j));
            this.y--;
          } 
          if (this.R.l <= 0 || this.R.l == Integer.MAX_VALUE) {
            lm lm1;
            (lm1 = this.R.b()).g = i;
            dc dc1 = new dc(null, lm1, 1, this.al);
            this.d.a(dc1);
            this.y++;
          } else {
            j = i / this.R.l + ((i % this.R.l > 0) ? 1 : 0);
            for (byte b = 0; b < j; b++) {
              lm lm1 = this.R.b();
              if (i >= this.R.l) {
                lm1.g = this.R.l;
                i -= this.R.l;
              } else if (i > 0) {
                lm1.g = i;
                i = 0;
              } 
              dc dc1 = new dc(null, lm1, 1, this.al);
              this.d.a(dc1);
              this.y++;
            } 
          } 
          this.G.a(this.R);
        } 
        this.d.i(this.d.q());
        return;
      case 3:
        this.s.c((new StringBuffer(String.valueOf(this.L))).toString());
        return;
      case 0:
        if (this.Q) {
          this.Q = false;
          this.d.a(this.H);
          this.G.b(this.H);
          this.d.i(this.d.q());
          this.y--;
          return;
        } 
        this.y++;
        this.d.a(this.G.t());
        this.G.a(this.G.t());
        this.d.i(this.d.q());
        break;
    } 
  }
  
  private void w() {
    synchronized (this.ai) {
      if (this.O || this.N) {
        a("----- Không chấp nhận -----", (byte)0, bx.d);
        e(true);
        this.O = this.N = false;
        this.P = false;
        this.V[2] = this.w;
        this.V[2].d(this.x.m());
        this.x.d(false);
      } 
      return;
    } 
  }
  
  public final void a(ll paramll) {
    synchronized (this.ai) {
      e(true);
      this.Z = 125;
      w();
      dc dc1;
      (dc1 = new dc(this.Y.a(mb.a(paramll) + 98, true), paramll, 0, this.al)).k = paramll;
      this.l.a(dc1);
      this.ab = 10;
      this.aa = true;
      a(String.valueOf(this.A) + " vừa cập nhật " + paramll.d, (byte)0, a.g);
      return;
    } 
  }
  
  public final void a(lm paramlm, int paramInt) {
    synchronized (this.ai) {
      e(true);
      this.Z = 125;
      a(String.valueOf(this.A) + " vừa cập nhật " + paramInt + " " + paramlm.b, (byte)0, a.g);
      w();
      a a1 = new a();
      byte b;
      for (b = 0; b < this.l.s(); b++) {
        dc dc1;
        lm lm1;
        if ((dc1 = (dc)this.l.k(b)) != null && dc1.j != 0 && (lm1 = (lm)dc1.k) != null && lm1.a == paramlm.a)
          a1.a(dc1); 
      } 
      for (b = 0; b < a1.d(); b++)
        this.l.a((dc)a1.b(b)); 
      if (paramInt > 0) {
        int i;
        b = (paramlm.e == 3) ? 2 : 1;
        if (paramlm.l <= 0 || paramlm.l == Integer.MAX_VALUE) {
          dc dc1 = new dc(null, paramlm, b, this.al);
          this.l.a(dc1);
          return;
        } 
        if (paramlm.l == 1) {
          i = paramInt;
        } else {
          i = paramInt / paramlm.l + ((paramInt % paramlm.l > 0) ? 1 : 0);
        } 
        lm[] arrayOfLm = new lm[i];
        for (byte b1 = 0; b1 < i; b1++) {
          arrayOfLm[b1] = paramlm.b();
          if (paramlm.l > 1) {
            if (paramInt >= paramlm.l) {
              (arrayOfLm[b1]).g = paramlm.l;
              paramInt -= paramlm.l;
            } else if (paramInt > 0) {
              (arrayOfLm[b1]).g = paramInt;
            } 
          } else {
            (arrayOfLm[b1]).g = 1;
          } 
          dc dc1 = new dc(null, arrayOfLm[b1], b, this.al);
          this.l.a(dc1);
        } 
      } 
      this.ab = 10;
      this.aa = true;
      return;
    } 
  }
  
  public final void a(int paramInt, boolean paramBoolean) {
    synchronized (this.ai) {
      e(true);
      if (paramBoolean) {
        this.Z = 125;
        w();
        a(String.valueOf(this.A) + " vừa cập nhật " + a.b(paramInt), (byte)0, a.g);
      } 
      this.v = paramInt / 1000;
      this.ad = 10;
      this.ac = true;
      return;
    } 
  }
  
  public final void a(ll[] paramArrayOfll, lm[] paramArrayOflm, int paramInt) {
    synchronized (this.ai) {
      e(true);
      this.af--;
      if (this.P) {
        this.O = true;
        this.V[2] = this.x;
        this.V[2].d(this.w.m());
        this.w.d(false);
        this.Z = 0;
      } else {
        this.N = true;
        this.Z = 125;
      } 
      a(paramInt, false);
      this.l.t();
      this.T.a();
      a("Kiểm tra thông tin:", (byte)0, a.g);
      byte b;
      for (b = 0; b < paramArrayOfll.length; b++) {
        dc dc1 = new dc(this.Y.a(mb.a(paramArrayOfll[b]) + 98, true), paramArrayOfll[b], 0, this.al);
        this.l.a(dc1);
        a("- " + (paramArrayOfll[b]).d, (byte)0, a.g);
      } 
      for (b = 0; b < paramArrayOflm.length; b++) {
        int i;
        if ((i = (paramArrayOflm[b]).g) > 0) {
          boolean bool = ((paramArrayOflm[b]).e == 3) ? true : true;
          if ((paramArrayOflm[b]).l <= 0 || (paramArrayOflm[b]).l == Integer.MAX_VALUE) {
            dc dc1 = new dc(null, paramArrayOflm[b], bool, this.al);
            this.l.a(dc1);
          } else {
            int j;
            if ((paramArrayOflm[b]).l == 1) {
              j = i;
            } else {
              j = i / (paramArrayOflm[b]).l + ((i % (paramArrayOflm[b]).l > 0) ? 1 : 0);
            } 
            lm[] arrayOfLm = new lm[j];
            for (byte b1 = 0; b1 < j; b1++) {
              arrayOfLm[b1] = paramArrayOflm[b].b();
              if ((paramArrayOflm[b]).l > 1) {
                if (i >= (paramArrayOflm[b]).l) {
                  (arrayOfLm[b1]).g = (paramArrayOflm[b]).l;
                  i -= (paramArrayOflm[b]).l;
                } else if (i > 0) {
                  (arrayOfLm[b1]).g = i;
                } 
              } else {
                (arrayOfLm[b1]).g = 1;
              } 
              dc dc1 = new dc(null, arrayOfLm[b1], bool, this.al);
              this.l.a(dc1);
            } 
          } 
        } 
        a("- " + (paramArrayOflm[b]).g + " " + (paramArrayOflm[b]).b, (byte)0, a.g);
      } 
      a("- Số KEN giao dịch: " + a.b(paramInt), (byte)0, a.g);
      return;
    } 
  }
  
  public final void a(String paramString) {
    synchronized (this.ai) {
      e(true);
      this.Z = 125;
      w();
      this.ab = 10;
      this.aa = true;
      for (byte b = 0; b < this.l.s(); b++) {
        dc dc1;
        ll ll;
        if ((dc1 = (dc)this.l.k(b)).j == 0 && dc1.k != null && (ll = (ll)dc1.k).c.equals(paramString)) {
          a(String.valueOf(this.A) + " vừa lấy lại " + ll.d, (byte)0, a.g);
          this.l.l(b);
          return;
        } 
      } 
      return;
    } 
  }
  
  public final void a(lm paramlm) {
    synchronized (this.ai) {
      e(true);
      this.Z = 125;
      w();
      for (byte b = 0; b < this.l.s(); b++) {
        dc dc1;
        lm lm1;
        if ((dc1 = (dc)this.l.k(b)).k != null && (dc1.j == 1 || dc1.j == 2) && (lm1 = (lm)dc1.k).a == paramlm.a) {
          a(String.valueOf(this.A) + " vừa lấy lại " + lm1.b, (byte)0, a.g);
          this.l.l(b);
          break;
        } 
      } 
      this.ab = 10;
      this.aa = true;
      return;
    } 
  }
  
  public final void b(String paramString) {
    synchronized (this.ai) {
      e(true);
      if (!paramString.equals(this.A)) {
        ct.a("[TradeScreen ] khac tên ng giao dịch nen huy");
        return;
      } 
      byte b;
      for (b = 0; b < this.l.s(); b++) {
        dc dc1;
        if ((dc1 = (dc)this.l.k(b)).k != null)
          if (dc1.j == 0) {
            go.a((ll)dc1.k);
          } else {
            lm lm1;
            go.a(lm1 = (lm)dc1.k, lm1.g);
          }  
      } 
      for (b = 0; b < this.d.s(); b++) {
        dc dc1;
        if ((dc1 = (dc)this.d.k(b)).k != null)
          if (dc1.j == 0) {
            go.b((ll)dc1.k);
          } else {
            go.a((lm)dc1.k);
          }  
      } 
      ag.b().l();
      ag.b().f(1);
      return;
    } 
  }
  
  private void x() {
    al al;
    (al = ag.b().a("Chú ý", "Bạn muốn hủy bỏ giao dịch?", "Có", 10, "Không", 11, 1)).a(this);
    al.b(-7946);
    ag.b().a(al, false);
  }
  
  public final void a(String paramString, byte paramByte, d paramd) {
    e(true);
    String[] arrayOfString = bx.a(paramString, this.D.c - 10, paramd);
    for (byte b = 0; b < arrayOfString.length; b++) {
      if (this.T.d() >= this.U)
        this.T.a(0); 
      hf hf;
      (hf = new hf(arrayOfString[b], paramByte, paramd)).a(-5);
      hf.h(this.D.c - 3);
      hf.i(paramd.a());
      this.T.a(hf);
    } 
  }
  
  public final void e() {
    w();
    this.af--;
  }
  
  protected final void e(int paramInt) {
    if (this.S.i()) {
      this.S.g(paramInt);
      return;
    } 
    if (this.s.m())
      this.s.g(paramInt); 
  }
  
  private void y() {
    int i = this.L;
    String str;
    if (!(str = this.s.r()).equals("")) {
      this.L = Integer.parseInt(str);
    } else {
      this.L = 0;
    } 
    if (i != this.L) {
      if ((this.L * 1000) > go.s)
        this.L = (int)(go.s / 1000L); 
      this.M = 3;
      ks.a().g(this.L * 1000);
      f(this.af + 1);
    } 
  }
  
  public final void a(ae paramae) {
    char c;
    if ((c = paramae.a()) < '0' || c > '9')
      paramae.a('\032'); 
  }
  
  public final void f() {
    if (this.af != 0)
      this.af = 0; 
  }
  
  public final void b(aq paramaq, int paramInt) {
    if (paramaq == null && paramInt >= 6)
      paramaq = new dc(this.l.k, null, 3, this.al); 
    aq aq1 = paramaq;
    of of1;
    (of1 = this).H = (dc)aq1;
    if (this.V[this.X] instanceof ay) {
      k k1 = ((fg)((ay)this.V[this.X]).w()).u();
      of1 = this;
      bs bs1 = new bs();
      if (of1.H != null && of1.H.j != 3)
        bs1.a(new br("Chi Tiết", 11116)); 
      if (of1.c.m())
        if (of1.H != null) {
          if (of1.H.j != 3)
            bs1.a(new br("Bỏ ra", 11115)); 
        } else {
          bs1.a(new br[] { new br("Rương Đồ", 11118) });
        }  
      if (bs1.s() == null || (bs1.s()).length == 0)
        return; 
      int j = k1.a + of1.b.a + (k1.c - bs1.e()) / 2;
      int i;
      if ((i = k1.b + of1.b.b + k1.d) + bs1.f() > v.u - ba.a)
        i = v.u - ba.a - bs1.f(); 
      bs1.a_(of1.b.a + of1.b.c + bs1.e(), i);
      bs1.d((j < of1.b.a) ? of1.b.a : ((j + bs1.e() > of1.b.a + of1.b.c) ? (of1.b.a + of1.b.c - bs1.e()) : j), i);
      bs1.a(of1);
      az az1 = of1.p;
      of of2;
      (of2 = of1).b(az1, true);
      az1 = of1.q;
      (of2 = of1).a(az1, true);
      bs1.a_(1);
      of1.b(bs1);
      of1.F = true;
    } 
  }
  
  public final void a(aq paramaq, int paramInt) {}
  
  public final void a(aq paramaq, int paramInt1, int paramInt2) {}
  
  public final void c(String paramString) {
    al al;
    this.af = 0;
    if (paramString == null) {
      ag.b().l();
      (al = ag.b().a("", "Giao dịch đã bị hủy bởi hệ thống!", "Đóng", 17, 1)).a(this);
      ag.b().a(al, false);
      return;
    } 
    of of1;
    if (al.equals((of1 = this).A)) {
      ag.b().l();
      (al = ag.b().a("", String.valueOf(al) + " đã hủy giao dịch!", "Đóng", 17, 1)).a(this);
      ag.b().a(al, false);
      return;
    } 
    ag.b().l();
    ag.b().f(1);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\of.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */