import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class ho extends ht implements bq {
  private ox k;
  
  private fg p;
  
  private fg q;
  
  private dc r;
  
  private ay s;
  
  private ay t;
  
  private k u = null;
  
  private k v = null;
  
  private lh w;
  
  private int x;
  
  private az y;
  
  private az z;
  
  private byte A = 0;
  
  private byte[][] B;
  
  private ex C;
  
  private aq[] D;
  
  private int E;
  
  private String F;
  
  private final Object G = new Object();
  
  private fw H;
  
  private int I = 0;
  
  private lm J;
  
  private int K;
  
  private long L;
  
  private String M;
  
  private boolean N = false;
  
  private boolean O = false;
  
  private k P;
  
  private String Q;
  
  private by R;
  
  private d S;
  
  public ho(String paramString1, String paramString2, ox paramox, d paramd) {
    this.F = paramString1;
    this.M = paramString2;
    if (paramd == null)
      paramd = new if(new int[] { 16711680, 16776960 }); 
    this.S = paramd;
    this.k = new ox(paramox);
    b(241231);
    a(new ba());
    a(this);
    char c = 'ð';
    int i = 320 - ba.a;
    if ((a.k == 1)) {
      c = 'ŀ';
      i = v.u - ba.a;
    } 
    boolean bool1 = (v.t >= c) ? ((v.t - c) / 2) : false;
    boolean bool2 = (v.u >= i) ? ((v.u - ba.a - i) / 2) : false;
    this.P = new k(bool1, bool2, c, i);
    t();
    az az1 = this.y;
    ho ho1;
    (ho1 = this).b(az1, true);
    a((az)null);
  }
  
  private void t() {
    int i = v.t - 20;
    this.u = new k((v.t - i) / 2, 140, i, this.g - 174);
    this.v = new k((v.t - i) / 2, 30, i, 44);
    this.p = new fg(false);
    this.p.e(true);
    this.p.i = new k(this.u.a, this.u.b, this.u.c, this.u.d);
    this.w = go.k.a();
    lh lh1 = this.w;
    int j = go.l.length - lh1.D.length;
    boolean bool = false;
  }
  
  private void a(lm[] paramArrayOflm) {
    for (byte b = 0; b < paramArrayOflm.length; b++) {
      boolean bool = ((paramArrayOflm[b]).e == 3) ? true : true;
      if ((paramArrayOflm[b]).g > 0)
        if ((paramArrayOflm[b]).l > 0) {
          int i = (paramArrayOflm[b]).g;
          int j = (paramArrayOflm[b]).g / (paramArrayOflm[b]).l;
          for (byte b1 = 0; b1 < j; b1++) {
            lm lm1;
            (lm1 = paramArrayOflm[b].b()).g = (paramArrayOflm[b]).l;
            i -= (paramArrayOflm[b]).l;
            this.p.a(new dc(null, lm1, bool, this.S));
          } 
          if (i > 0) {
            lm lm1;
            (lm1 = paramArrayOflm[b].b()).g = i;
            this.p.a(new dc(null, lm1, bool, this.S));
          } 
        } else {
          this.p.a(new dc(null, paramArrayOflm[b], bool, this.S));
        }  
    } 
  }
  
  private void v() {
    synchronized (this.G) {
      e(true);
      byte b1 = 0;
      byte b2 = 0;
      byte b3;
      for (b3 = 0; b3 < this.q.s(); b3++) {
        dc dc1;
        if ((dc1 = (dc)this.q.k(b3)).j == 0) {
          if (dc1.k != null)
            b1++; 
        } else if (dc1.j == 1) {
          b2++;
        } 
      } 
      b3 = 0;
      byte b4 = 0;
      String[] arrayOfString = new String[b1];
      int[] arrayOfInt2 = new int[b2];
      int[] arrayOfInt1 = new int[b2];
      for (byte b5 = 0; b5 < this.q.s(); b5++) {
        dc dc1;
        if ((dc1 = (dc)this.q.k(b5)).j == 0) {
          if (dc1.k != null) {
            arrayOfString[b3] = ((ll)dc1.k).c;
            b3++;
          } 
        } else if (dc1.j == 1 && dc1.k != null) {
          arrayOfInt2[b4] = ((lm)dc1.k).a;
          arrayOfInt1[b4] = ((lm)dc1.k).g;
          b4++;
        } 
      } 
      ks.a().a(this.F, arrayOfString, arrayOfInt2, arrayOfInt1, this.L);
      a.s().a(null, null);
      return;
    } 
  }
  
  protected final boolean g(int paramInt) {
    gu gu;
    switch (paramInt) {
      case 4:
        if (this.r.k != null) {
          ho ho1;
          if ((ho1 = this).r.k != null)
            if (ho1.r.j == 0) {
              ks.a().a(ho1.F, (byte)1, ((ll)ho1.r.k).c);
            } else {
              ho1.J = (lm)ho1.r.k;
              int i = 0;
              for (byte b = 0; b < ho1.q.s(); b++) {
                lm lm1;
                if ((((dc)ho1.q.k(b)).j == 1 || ((dc)ho1.q.k(b)).j == 2) && (lm1 = (lm)((dc)ho1.q.k(b)).k) != null && lm1.a == ho1.J.a)
                  i += lm1.g; 
              } 
              ks.a().a(ho1.F, (byte)1, ho1.J.a, i);
            }  
          ho1.N = true;
          a.s().a(null, null);
          if (this.m != null)
            A(); 
        } 
        break;
      case 5:
        if (this.l.c(-7524) && (gu = (gu)this.l.d(-7524)) != null) {
          this.J = gu.t();
          this.J.g = gu.u();
          int i = this.J.g;
          ks.a().a(this.F, (byte)0, this.J.a, i);
          a.s().a(null, null);
          this.l.a(-7524, false);
        } 
        break;
      case 6:
        this.l.a(false);
        break;
      case 2:
        if (this.K == 0 && !this.O) {
          ho ho1;
          al al;
          (al = (ho1 = this).l.a("Chú ý", "Chưa đủ nguyên liệu. Vui lòng thử lại!!!", "Đóng", 1, 1)).b(199199);
          al.a(ho1);
          ho1.l.a(al, false);
          break;
        } 
        if (this.K == 1 && !this.O) {
          if (go.s > -1L && this.L > go.s) {
            ho ho2;
            al al;
            (al = (ho2 = this).l.a("Chú ý", "Vượt quá số tiền bạn đang có. Vui lòng thử lại!!!", "Đóng", 1, 1)).b(199199);
            al.a(ho2);
            ho2.l.a(al, false);
            break;
          } 
          ho ho1 = this;
          hc hc;
          (hc = new hc(String.valueOf(ho1.M) + ". Bạn có muốn kết hợp không?", "Kết hợp", 7, "Không", 1)).a(ho1);
          ho1.l.a(hc, false);
        } 
        break;
      case 7:
        this.l.a(false);
        v();
        break;
    } 
    return false;
  }
  
  public final void a(ll[] paramArrayOfll, lm[] paramArrayOflm, byte paramByte) {
    this.l.v();
    synchronized (this.G) {
      e(true);
      byte b;
      for (b = 0; b < this.q.s(); b++) {
        dc dc1;
        if ((dc1 = (dc)this.q.k(b)).k != null)
          if (dc1.j == 0) {
            go.b((ll)dc1.k);
          } else {
            go.a((lm)dc1.k);
          }  
      } 
      this.q.t();
      for (b = 0; b < paramArrayOfll.length; b++) {
        if (paramArrayOfll[b] != null) {
          dc dc1 = new dc(this.k.a(mb.a(paramArrayOfll[b]) + 98, true), paramArrayOfll[b], 0, this.S);
          this.q.a(dc1);
          go.a(paramArrayOfll[b]);
        } 
      } 
      for (b = 0; b < paramArrayOflm.length; b++) {
        if (paramArrayOflm[b] != null) {
          dc dc1 = new dc(null, paramArrayOflm[b], (paramArrayOflm[b]).e, this.S);
          this.q.a(dc1);
          go.a(paramArrayOflm[b], (paramArrayOflm[b]).g);
        } 
      } 
      if (paramByte == 1) {
        this.Q = "Kết hợp thành công";
      } else {
        this.Q = "Kết hợp thất bại";
      } 
      this.O = true;
      return;
    } 
  }
  
  protected final void e(int paramInt) {
    switch (paramInt) {
      case 1:
        if (this.m != null) {
          A();
          return;
        } 
        this.l.a(false);
        this.l.M();
        return;
      case 3:
        c(95);
        break;
    } 
  }
  
  protected final void f(int paramInt) {
    fg fg1;
    byte b = this.A;
    switch (paramInt) {
      case 96:
      case 97:
      case 98:
      case 99:
        if (!this.D[this.A].f(paramInt)) {
          int i = paramInt - 96;
          ho ho1 = this;
          if (i >= 0 && (i = ho1.B[ho1.A][i]) >= 0)
            ho1.A = i; 
        } 
        if (b != this.A) {
          this.D[this.A].d(true);
          this.D[b].d(false);
          if (this.D[this.A] instanceof ay)
            (fg1 = (fg)((ay)this.D[this.A]).w()).i(0); 
        } 
        if (this.p.m()) {
          a(this.p.r());
          return;
        } 
        if (this.q.m()) {
          a(this.q.r());
          return;
        } 
        this.H = null;
        return;
      case 95:
        if (this.D[1].m()) {
          this.i.d(0, ((ex)this.D[1]).a());
          return;
        } 
        this.D[this.A].f(fg1);
        return;
    } 
    this.D[this.A].f(fg1);
  }
  
  public final void f(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: iconst_1
    //   2: invokevirtual e : (Z)V
    //   5: aload_0
    //   6: getfield m : Lbs;
    //   9: ifnull -> 121
    //   12: aload_0
    //   13: aload_0
    //   14: getfield m : Lbs;
    //   17: invokevirtual a : ()[Laz;
    //   20: iload_1
    //   21: iload_2
    //   22: istore #6
    //   24: istore #5
    //   26: astore #4
    //   28: astore_3
    //   29: iconst_0
    //   30: istore #7
    //   32: goto -> 90
    //   35: aload #4
    //   37: iload #7
    //   39: aaload
    //   40: ifnull -> 87
    //   43: aload #4
    //   45: iload #7
    //   47: aaload
    //   48: iload #5
    //   50: iload #6
    //   52: invokevirtual a : (II)Z
    //   55: ifeq -> 87
    //   58: aload_3
    //   59: getfield i : Lbf;
    //   62: ifnull -> 83
    //   65: aload_3
    //   66: getfield i : Lbf;
    //   69: iconst_m1
    //   70: aload #4
    //   72: iload #7
    //   74: aaload
    //   75: invokevirtual a : ()I
    //   78: invokeinterface d : (II)V
    //   83: iconst_1
    //   84: goto -> 99
    //   87: iinc #7, 1
    //   90: iload #7
    //   92: aload #4
    //   94: arraylength
    //   95: if_icmplt -> 35
    //   98: iconst_0
    //   99: ifeq -> 103
    //   102: return
    //   103: aload_0
    //   104: getfield m : Lbs;
    //   107: iload_1
    //   108: iload_2
    //   109: invokevirtual c : (II)Z
    //   112: ifeq -> 116
    //   115: return
    //   116: aload_0
    //   117: invokevirtual A : ()V
    //   120: return
    //   121: aload_0
    //   122: getfield A : B
    //   125: istore_3
    //   126: iconst_0
    //   127: istore #5
    //   129: goto -> 480
    //   132: aload_0
    //   133: getfield D : [Laq;
    //   136: iload #5
    //   138: aaload
    //   139: aload_0
    //   140: getfield s : Lay;
    //   143: invokevirtual equals : (Ljava/lang/Object;)Z
    //   146: ifeq -> 217
    //   149: new k
    //   152: dup
    //   153: aload_0
    //   154: getfield p : Lfg;
    //   157: getfield i : Lk;
    //   160: getfield a : I
    //   163: aload_0
    //   164: getfield P : Lk;
    //   167: getfield a : I
    //   170: iadd
    //   171: aload_0
    //   172: getfield p : Lfg;
    //   175: getfield i : Lk;
    //   178: getfield b : I
    //   181: aload_0
    //   182: getfield P : Lk;
    //   185: getfield b : I
    //   188: iadd
    //   189: aload_0
    //   190: getfield p : Lfg;
    //   193: getfield i : Lk;
    //   196: getfield c : I
    //   199: aload_0
    //   200: getfield p : Lfg;
    //   203: getfield i : Lk;
    //   206: getfield d : I
    //   209: invokespecial <init> : (IIII)V
    //   212: astore #4
    //   214: goto -> 367
    //   217: aload_0
    //   218: getfield D : [Laq;
    //   221: iload #5
    //   223: aaload
    //   224: aload_0
    //   225: getfield t : Lay;
    //   228: invokevirtual equals : (Ljava/lang/Object;)Z
    //   231: ifeq -> 302
    //   234: new k
    //   237: dup
    //   238: aload_0
    //   239: getfield q : Lfg;
    //   242: getfield i : Lk;
    //   245: getfield a : I
    //   248: aload_0
    //   249: getfield P : Lk;
    //   252: getfield a : I
    //   255: iadd
    //   256: aload_0
    //   257: getfield q : Lfg;
    //   260: getfield i : Lk;
    //   263: getfield b : I
    //   266: aload_0
    //   267: getfield P : Lk;
    //   270: getfield b : I
    //   273: iadd
    //   274: aload_0
    //   275: getfield q : Lfg;
    //   278: getfield i : Lk;
    //   281: getfield c : I
    //   284: aload_0
    //   285: getfield q : Lfg;
    //   288: getfield i : Lk;
    //   291: getfield d : I
    //   294: invokespecial <init> : (IIII)V
    //   297: astore #4
    //   299: goto -> 367
    //   302: new k
    //   305: dup
    //   306: aload_0
    //   307: getfield D : [Laq;
    //   310: iload #5
    //   312: aaload
    //   313: invokevirtual c : ()I
    //   316: aload_0
    //   317: getfield P : Lk;
    //   320: getfield a : I
    //   323: iadd
    //   324: aload_0
    //   325: getfield D : [Laq;
    //   328: iload #5
    //   330: aaload
    //   331: invokevirtual d : ()I
    //   334: aload_0
    //   335: getfield P : Lk;
    //   338: getfield b : I
    //   341: iadd
    //   342: aload_0
    //   343: getfield D : [Laq;
    //   346: iload #5
    //   348: aaload
    //   349: invokevirtual e : ()I
    //   352: aload_0
    //   353: getfield D : [Laq;
    //   356: iload #5
    //   358: aaload
    //   359: invokevirtual f : ()I
    //   362: invokespecial <init> : (IIII)V
    //   365: astore #4
    //   367: aload #4
    //   369: iload_1
    //   370: iload_2
    //   371: invokevirtual a : (II)Z
    //   374: ifeq -> 473
    //   377: iload #5
    //   379: iload_3
    //   380: if_icmpeq -> 412
    //   383: aload_0
    //   384: iload #5
    //   386: putfield A : B
    //   389: aload_0
    //   390: getfield D : [Laq;
    //   393: iload_3
    //   394: aaload
    //   395: iconst_0
    //   396: invokevirtual d : (Z)V
    //   399: aload_0
    //   400: getfield D : [Laq;
    //   403: aload_0
    //   404: getfield A : B
    //   407: aaload
    //   408: iconst_1
    //   409: invokevirtual d : (Z)V
    //   412: aload_0
    //   413: getfield D : [Laq;
    //   416: iload #5
    //   418: aaload
    //   419: iload_1
    //   420: aload_0
    //   421: getfield P : Lk;
    //   424: getfield a : I
    //   427: isub
    //   428: iload_2
    //   429: aload_0
    //   430: getfield P : Lk;
    //   433: getfield b : I
    //   436: isub
    //   437: invokevirtual c : (II)Z
    //   440: pop
    //   441: aload_0
    //   442: getfield D : [Laq;
    //   445: iload #5
    //   447: aaload
    //   448: instanceof ex
    //   451: ifeq -> 472
    //   454: aload_0
    //   455: iconst_m1
    //   456: aload_0
    //   457: getfield D : [Laq;
    //   460: iload #5
    //   462: aaload
    //   463: checkcast ex
    //   466: invokevirtual a : ()I
    //   469: invokevirtual d : (II)V
    //   472: return
    //   473: iload #5
    //   475: iconst_1
    //   476: iadd
    //   477: i2b
    //   478: istore #5
    //   480: iload #5
    //   482: aload_0
    //   483: getfield D : [Laq;
    //   486: arraylength
    //   487: if_icmplt -> 132
    //   490: return
  }
  
  public final void e(int paramInt1, int paramInt2) {
    if (this.p.m())
      this.p.e(paramInt1, paramInt2); 
  }
  
  private void a(Object paramObject) {
    this.I = 0;
    this.H = null;
    this.r = (dc)paramObject;
  }
  
  public final void u() {
    for (byte b = 0; b < this.D.length; b++) {
      if (this.D[b] != null) {
        this.D[b].n();
        this.D[b].c(true);
      } 
    } 
    if (this.H != null)
      this.H.i(); 
    if (this.I < 7) {
      this.I++;
      if (this.I == 7 && this.r != null && this.r.k != null) {
        Object object = this.r.k;
        ho ho1;
        (ho1 = this).H = new fw(object);
        int i = ho1.g - 18;
        ho1.H.a(9, i, ho1.f - 20, ho1.g / 4);
        ho1.H.c(9, i);
        ho1.H.a(9, i - ho1.H.q() - 7);
      } 
    } 
    if (this.h) {
      this.E--;
      if (this.E <= 0) {
        e(false);
        this.E = 0;
      } 
    } 
  }
  
  public final void a(String paramString1, String paramString2, byte paramByte, long paramLong) {
    this.l.v();
    synchronized (this.G) {
      e(true);
      this.K = paramByte;
      this.M = paramString2;
      this.L = paramLong;
      for (byte b = 0; b < this.q.s(); b++) {
        dc dc1;
        ll ll;
        if ((dc1 = (dc)this.q.k(b)).j == 0 && dc1.k != null && (ll = (ll)dc1.k).c.equals(paramString1)) {
          this.q.a(dc1);
          this.p.a(dc1);
          a(this.q.r());
          return;
        } 
      } 
      return;
    } 
  }
  
  public final void a(String paramString, byte paramByte, long paramLong) {
    this.l.v();
    if (this.N) {
      this.K = paramByte;
      this.M = paramString;
      this.L = paramLong;
      this.q.a(this.r);
      lm lm1 = (lm)this.r.k;
      ho ho1 = this;
      int i = 0;
      a a = new a();
      int j;
      for (j = 0; j < ho1.p.s(); j++) {
        lm lm2;
        if ((((dc)ho1.p.k(j)).j == 1 || ((dc)ho1.p.k(j)).j == 2) && (lm2 = (lm)((dc)ho1.p.k(j)).k) != null && lm2.a == lm1.a) {
          i += lm2.g;
          a.a(ho1.p.k(j));
        } 
      } 
      i += lm1.g;
      for (j = 0; j < a.d(); j++)
        ho1.p.a((dc)a.b(j)); 
      if (lm1.l <= 0) {
        lm lm2;
        (lm2 = lm1.b()).g = i;
        dc dc1 = new dc(null, lm2, (lm1.e == 3) ? 2 : 1, ho1.S);
        ho1.p.a(dc1);
      } else {
        j = i / lm1.l + ((i % lm1.l > 0) ? 1 : 0);
        for (byte b = 0; b < j; b++) {
          lm lm2 = lm1.b();
          if (i >= lm1.l) {
            lm2.g = lm1.l;
            i -= lm1.l;
          } else if (i > 0) {
            lm2.g = i;
            i = 0;
          } 
          dc dc1 = new dc(null, lm2, (lm1.e == 3) ? 2 : 1, ho1.S);
          ho1.p.a(dc1);
        } 
      } 
      w();
      this.N = false;
      this.r = null;
      a(this.q.r());
      return;
    } 
  }
  
  public final void b(String paramString1, String paramString2, byte paramByte, long paramLong) {
    this.l.v();
    synchronized (this.G) {
      e(true);
      this.K = paramByte;
      this.M = paramString2;
      this.L = paramLong;
      for (byte b = 0; b < this.p.s(); b++) {
        dc dc1;
        ll ll;
        if ((dc1 = (dc)this.p.k(b)).j == 0 && dc1.k != null && (ll = (ll)dc1.k).c.equals(paramString1)) {
          this.p.a(dc1);
          this.q.a(dc1);
          a(this.p.r());
          return;
        } 
      } 
      return;
    } 
  }
  
  public final void b(String paramString, byte paramByte, long paramLong) {
    this.l.v();
    if (this.J != null) {
      int i;
      this.K = paramByte;
      this.M = paramString;
      this.L = paramLong;
      paramByte = 0;
      a a1 = new a();
      int m;
      for (m = 0; m < this.q.s(); m++) {
        lm lm3;
        if (((dc)this.q.k(m)).j == 1 && (lm3 = (lm)((dc)this.q.k(m)).k) != null && lm3.a == this.J.a) {
          i = paramByte + lm3.g;
          a1.a(this.q.k(m));
        } 
      } 
      i += this.J.g;
      for (m = 0; m < a1.d(); m++)
        this.q.a((dc)a1.b(m)); 
      if (this.J.l <= 0) {
        lm lm3;
        (lm3 = this.J.b()).g = i;
        dc dc1 = new dc(null, lm3, 1, this.S);
        this.q.a(dc1);
      } else {
        m = i / this.J.l + ((i % this.J.l > 0) ? 1 : 0);
        for (byte b1 = 0; b1 < m; b1++) {
          lm lm3 = this.J.b();
          if (i >= this.J.l) {
            lm3.g = this.J.l;
            i -= this.J.l;
          } else if (i > 0) {
            lm3.g = i;
            i = 0;
          } 
          dc dc1 = new dc(null, lm3, 1, this.S);
          this.q.a(dc1);
        } 
      } 
      lm lm1 = this.J;
      ho ho1 = this;
      int j = 0;
      lm lm2 = lm1.b();
      a a2 = new a();
      byte b;
      for (b = 0; b < ho1.p.s(); b++) {
        ho1.r = (dc)ho1.p.k(b);
        lm lm3;
        if (ho1.r != null && ho1.r.k != null && (ho1.r.j == 1 || ho1.r.j == 2) && (lm3 = (lm)ho1.r.k) != null && lm3.a == lm1.a) {
          j += lm3.g;
          a2.a(ho1.r);
        } 
      } 
      lm2.g = j - lm1.g;
      for (b = 0; b < a2.d(); b++)
        ho1.p.a((dc)a2.b(b)); 
      if (lm2.g > 0)
        ho1.a(new lm[] { lm2 }); 
      ho1.w();
      a(this.p.r());
    } 
  }
  
  public final void e(boolean paramBoolean) {
    super.e(paramBoolean);
    this.E = 5;
  }
  
  public final void b(Graphics paramGraphics) {
    this.R.a(paramGraphics, "Phí kết hợp: " + i.a(this.L, ",") + " KEN", (v.t - bx.d.a("Phí kết hợp: ")) / 2 - 10, 10, 0);
    int i = 0;
    if (!this.O) {
      if (this.M != null) {
        String[] arrayOfString = bx.a(this.M, v.t - 20);
        for (byte b = 0; b < arrayOfString.length; b++) {
          this.R.a(paramGraphics, arrayOfString[b], (v.t - bx.d.a(arrayOfString[b])) / 2, this.q.d() + this.q.f() + 8 + i, 0);
          i += this.R.a();
        } 
      } 
    } else if (this.Q != null) {
      this.R.a(paramGraphics, this.Q, (v.t - bx.d.a(this.Q)) / 2, this.q.d() + this.q.f() + 8, 0);
    } 
    if (this.t != null) {
      this.t.a(paramGraphics, this.c, this.d);
      this.t.c(true);
    } 
    this.C.a(paramGraphics, 0, 12);
    if (this.s != null) {
      this.s.a(paramGraphics, this.c, this.d + 12);
      this.s.c(true);
    } 
    if (!this.n && this.H != null)
      this.H.a(paramGraphics, this.c, this.d); 
    bx.d.a(paramGraphics, String.valueOf(this.p.s()) + "/" + go.n, this.u.a, this.u.b - 16, 0);
  }
  
  private void w() {
    this.p.i(this.p.q());
  }
  
  public final void a(Graphics paramGraphics) {
    pc.a(paramGraphics, this.c, this.d, this.f, this.g, v.aj, true);
  }
  
  public final void b(aq paramaq, int paramInt) {
    a(paramaq);
    k k1 = ((fg)((ay)this.D[this.A]).w()).u();
    ho ho1;
    if (this.D[this.A] instanceof ay && (ho1 = this).r != null) {
      bs bs = new bs();
      if (ho1.t.m() && !ho1.O && ho1.q != null && ho1.r.j != 3)
        bs.a(new br("Bỏ ra", 4)); 
      if (ho1.s.m() && !ho1.O && ho1.p != null) {
        ho ho3 = ho1;
        byte b1 = 0;
        for (byte b2 = 0; b2 < ho3.q.a(); b2++) {
          if (ho3.q.k(b2) != null)
            b1++; 
        } 
        ho ho4;
        if (b1 < ho1.q.a() && (ho4 = ho3 = ho1).r.k != null)
          if ((ho4 = ho3).r.j == 1) {
            lm lm1 = (lm)(ho4 = ho3).r.k;
            dc dc1 = new dc(null, lm1.b(), (ho4 = ho3).r.j, ho3.S);
            gu gu1;
            (gu1 = new gu(dc1)).a(ho3);
            gu1.e(lm1.g);
            bd bd = new bd("Xong", 5);
            gu gu2;
            (gu2 = gu1).a(bd, true);
            gu1.a(new bd("", 5));
            bd = new bd("Hủy", 6);
            (gu2 = gu1).b(bd, true);
            gu1.b(-7524);
            gu1.j(true);
            ho3.l.a(gu1, false);
          } else if ((ho4 = ho3).r.j == 0) {
            ks.a().a(ho3.F, (byte)0, ((ll)(ho4 = ho3).r.k).c);
            a.s().a(null, null);
          }  
      } 
      if (bs.s() == null || (bs.s()).length == 0)
        return; 
      int j = k1.a + ho1.c + (k1.c - bs.e()) / 2;
      int i;
      if ((i = k1.b + ho1.d + k1.d) + bs.f() > v.u - ba.a)
        i = v.u - ba.a - bs.f(); 
      bs.a_(ho1.c + ho1.f + bs.e(), i);
      bs.d((j < ho1.c) ? ho1.c : ((j + bs.e() > ho1.c + ho1.f) ? (ho1.c + ho1.f - bs.e()) : j), i);
      bs.a(ho1);
      az az1 = ho1.y;
      ho ho2;
      (ho2 = ho1).b(az1, true);
      az1 = ho1.z;
      (ho2 = ho1).a(az1, true);
      bs.a_(1);
      ho1.n = true;
      ho1.a(bs, ho1.z, (az)null, ho1.y);
    } 
  }
  
  public final void a(aq paramaq, int paramInt) {}
  
  public final void a(aq paramaq, int paramInt1, int paramInt2) {}
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ho.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */