import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class id extends ht implements bq {
  private ox k;
  
  private fg p;
  
  private fg q;
  
  private fg r;
  
  private dc s;
  
  private ay t;
  
  private ay u;
  
  private ay v;
  
  private k w = null;
  
  private k x = null;
  
  private k y = null;
  
  private lh z;
  
  private int A;
  
  private az B;
  
  private az C;
  
  private byte D = 0;
  
  private byte[][] E;
  
  private ex F;
  
  private aq[] G;
  
  private int H;
  
  private String I;
  
  private Object J = new Object();
  
  private fw K;
  
  private int L = 0;
  
  private lm M;
  
  private int N;
  
  private long O;
  
  private String P;
  
  private boolean Q = false;
  
  private boolean R = false;
  
  private k S;
  
  private String T;
  
  private by U;
  
  private d V;
  
  public id(String paramString1, String paramString2, String paramString3, ox paramox, d paramd) {
    this.I = paramString1;
    this.P = paramString3;
    if (paramd == null)
      paramd = new if(new int[] { 16711680, 16776960 }); 
    this.V = paramd;
    this.k = new ox(paramox);
    b(241232);
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
    this.S = new k(bool1, bool2, c, i);
    t();
    a(paramString2);
    az az1 = this.B;
    id id1;
    (id1 = this).b(az1, true);
    a((az)null);
  }
  
  private void t() {
    int i = v.t - 20;
    this.w = new k((v.t - i) / 2, 130, i, this.g - 155);
    this.y = new k((v.t - i) / 2 - 4, 30, 44, 44);
    this.x = new k((v.t - i) / 2 + 46, 30, i - 44, 44);
    this.p = new fg(false);
    this.p.e(true);
    this.p.i = new k(this.w.a, this.w.b, this.w.c, this.w.d);
    this.z = go.k.a();
    lh lh1 = this.z;
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
            dc dc1 = new dc(null, lm1, bool, this.V);
            this.p.a(dc1);
          } 
          if (i > 0) {
            lm lm1;
            (lm1 = paramArrayOflm[b].b()).g = i;
            dc dc1 = new dc(null, lm1, bool, this.V);
            this.p.a(dc1);
          } 
        } else {
          dc dc1 = new dc(null, paramArrayOflm[b], bool, this.V);
          this.p.a(dc1);
        }  
    } 
  }
  
  private void v() {
    synchronized (this.J) {
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
      ks.a().b(this.I, arrayOfString, arrayOfInt2, arrayOfInt1, this.O);
      a.s().a(null, null);
      return;
    } 
  }
  
  protected final boolean g(int paramInt) {
    gu gu;
    switch (paramInt) {
      case 4:
        if (this.s.k != null) {
          id id1;
          if ((id1 = this).s.k != null)
            if (id1.s.j == 0) {
              ks.a().b(id1.I, (byte)1, ((ll)id1.s.k).c);
            } else {
              id1.M = (lm)id1.s.k;
              int i = 0;
              for (byte b = 0; b < id1.q.s(); b++) {
                lm lm1;
                if ((((dc)id1.q.k(b)).j == 1 || ((dc)id1.q.k(b)).j == 2) && (lm1 = (lm)((dc)id1.q.k(b)).k) != null && lm1.a == id1.M.a)
                  i += lm1.g; 
              } 
              ks.a().b(id1.I, (byte)1, id1.M.a, i);
            }  
          id1.Q = true;
          a.s().a(null, null);
          if (this.m != null)
            A(); 
        } 
        break;
      case 5:
        if (a.s().c(-7524) && (gu = (gu)a.s().d(-7524)) != null) {
          this.M = gu.t();
          this.M.g = gu.u();
          int i = this.M.g;
          ks.a().b(this.I, (byte)0, this.M.a, i);
          a.s().a(null, null);
          ag.b().a(-7524, false);
        } 
        break;
      case 6:
        ag.b().a(false);
        break;
      case 2:
        ct.a("Command Upgradeready " + this.N + "processUpgrade" + this.R);
        if (!this.R) {
          if (this.N == 0) {
            id id1 = this;
            al al;
            (al = ag.b().a("Chú ý", "Chưa đủ nguyên liệu. Vui lòng thử lại!!!", "Đóng", 6, 1)).b(199199);
            al.a(id1);
            ag.b().a(al, false);
            break;
          } 
          if (this.N == 1) {
            if (go.s > -1L && this.O > go.s) {
              id id2 = this;
              al al;
              (al = ag.b().a("Chú ý", "Vượt quá số tiền bạn đang có. Vui lòng thử lại!!!", "Đóng", 6, 1)).b(199199);
              al.a(id2);
              ag.b().a(al, false);
              break;
            } 
            id id1 = this;
            hc hc;
            (hc = new hc(String.valueOf(id1.P) + ". Bạn có muốn nâng cấp không?", "Nâng cấp", 7, "Không", 6)).a(id1);
            ag.b().a(hc, false);
          } 
          break;
        } 
        w();
        this.F.a("Nâng cấp");
        this.R = false;
        this.T = null;
        this.P = null;
        break;
      case 7:
        ag.b().a(false);
        v();
        break;
    } 
    return false;
  }
  
  public final void a(ll[] paramArrayOfll, lm[] paramArrayOflm, byte paramByte) {
    if (ct.a())
      ct.a("Receive " + paramArrayOfll.length + " equips, " + paramArrayOflm.length + " items after upgrade."); 
    a.s().v();
    synchronized (this.J) {
      e(true);
      byte b;
      for (b = 0; b < this.r.s(); b++) {
        dc dc1;
        if ((dc1 = (dc)this.r.k(b)).k != null)
          if (dc1.j == 0) {
            go.b((ll)dc1.k);
          } else {
            go.a((lm)dc1.k);
          }  
      } 
      for (b = 0; b < this.q.s(); b++) {
        dc dc1;
        if ((dc1 = (dc)this.q.k(b)).k != null)
          if (dc1.j == 0) {
            go.b((ll)dc1.k);
          } else {
            go.a((lm)dc1.k);
          }  
      } 
      this.r.t();
      this.q.t();
      for (b = 0; b < paramArrayOfll.length; b++) {
        if (paramArrayOfll[b] != null) {
          dc dc1 = new dc(this.k.a(mb.a(paramArrayOfll[b]) + 98, true), paramArrayOfll[b], 0, this.V);
          this.r.a(dc1);
          go.a(paramArrayOfll[b]);
        } 
      } 
      for (b = 0; b < paramArrayOflm.length; b++) {
        if (paramArrayOflm[b] != null) {
          dc dc1 = new dc(null, paramArrayOflm[b], (paramArrayOflm[b]).e, this.V);
          this.r.a(dc1);
          go.a(paramArrayOflm[b], (paramArrayOflm[b]).g);
        } 
      } 
    } 
    if (paramByte == 1) {
      this.T = "Nâng cấp thành công";
    } else {
      this.T = "Nâng cấp thất bại";
    } 
    this.R = true;
    this.F.a("Tiếp tục");
  }
  
  protected final void e(int paramInt) {
    hh hh;
    switch (paramInt) {
      case 1:
        if (this.m != null) {
          A();
          return;
        } 
        ag.b().a(false);
        if (a.s().c(241202))
          a.s().e(241202); 
        hh = new hh(null, null);
        ag.b().a(hh);
        return;
      case 3:
        c(95);
        break;
    } 
  }
  
  protected final void f(int paramInt) {
    fg fg1;
    byte b = this.D;
    switch (paramInt) {
      case 96:
      case 97:
      case 98:
      case 99:
        if (!this.G[this.D].f(paramInt)) {
          int i = paramInt - 96;
          id id1 = this;
          if (i >= 0 && (i = id1.E[id1.D][i]) >= 0)
            id1.D = i; 
        } 
        if (b != this.D) {
          this.G[this.D].d(true);
          this.G[b].d(false);
          if (this.G[this.D] instanceof ay)
            (fg1 = (fg)((ay)this.G[this.D]).w()).i(0); 
        } 
        if (this.p.m()) {
          a(this.p.r());
          return;
        } 
        if (this.q.m()) {
          a(this.q.r());
          return;
        } 
        if (this.r.m()) {
          a(this.r.r());
          return;
        } 
        this.K = null;
        return;
      case 95:
        if (this.G[2].m()) {
          this.i.d(0, ((ex)this.G[2]).a());
          return;
        } 
        this.G[this.D].f(fg1);
        return;
    } 
    this.G[this.D].f(fg1);
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
    //   122: getfield D : B
    //   125: istore_3
    //   126: iconst_0
    //   127: istore #5
    //   129: goto -> 480
    //   132: aload_0
    //   133: getfield G : [Laq;
    //   136: iload #5
    //   138: aaload
    //   139: aload_0
    //   140: getfield t : Lay;
    //   143: invokevirtual equals : (Ljava/lang/Object;)Z
    //   146: ifeq -> 217
    //   149: new k
    //   152: dup
    //   153: aload_0
    //   154: getfield p : Lfg;
    //   157: getfield i : Lk;
    //   160: getfield a : I
    //   163: aload_0
    //   164: getfield S : Lk;
    //   167: getfield a : I
    //   170: iadd
    //   171: aload_0
    //   172: getfield p : Lfg;
    //   175: getfield i : Lk;
    //   178: getfield b : I
    //   181: aload_0
    //   182: getfield S : Lk;
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
    //   218: getfield G : [Laq;
    //   221: iload #5
    //   223: aaload
    //   224: aload_0
    //   225: getfield u : Lay;
    //   228: invokevirtual equals : (Ljava/lang/Object;)Z
    //   231: ifeq -> 302
    //   234: new k
    //   237: dup
    //   238: aload_0
    //   239: getfield q : Lfg;
    //   242: getfield i : Lk;
    //   245: getfield a : I
    //   248: aload_0
    //   249: getfield S : Lk;
    //   252: getfield a : I
    //   255: iadd
    //   256: aload_0
    //   257: getfield q : Lfg;
    //   260: getfield i : Lk;
    //   263: getfield b : I
    //   266: aload_0
    //   267: getfield S : Lk;
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
    //   307: getfield G : [Laq;
    //   310: iload #5
    //   312: aaload
    //   313: invokevirtual c : ()I
    //   316: aload_0
    //   317: getfield S : Lk;
    //   320: getfield a : I
    //   323: iadd
    //   324: aload_0
    //   325: getfield G : [Laq;
    //   328: iload #5
    //   330: aaload
    //   331: invokevirtual d : ()I
    //   334: aload_0
    //   335: getfield S : Lk;
    //   338: getfield b : I
    //   341: iadd
    //   342: aload_0
    //   343: getfield G : [Laq;
    //   346: iload #5
    //   348: aaload
    //   349: invokevirtual e : ()I
    //   352: aload_0
    //   353: getfield G : [Laq;
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
    //   386: putfield D : B
    //   389: aload_0
    //   390: getfield G : [Laq;
    //   393: iload_3
    //   394: aaload
    //   395: iconst_0
    //   396: invokevirtual d : (Z)V
    //   399: aload_0
    //   400: getfield G : [Laq;
    //   403: aload_0
    //   404: getfield D : B
    //   407: aaload
    //   408: iconst_1
    //   409: invokevirtual d : (Z)V
    //   412: aload_0
    //   413: getfield G : [Laq;
    //   416: iload #5
    //   418: aaload
    //   419: iload_1
    //   420: aload_0
    //   421: getfield S : Lk;
    //   424: getfield a : I
    //   427: isub
    //   428: iload_2
    //   429: aload_0
    //   430: getfield S : Lk;
    //   433: getfield b : I
    //   436: isub
    //   437: invokevirtual c : (II)Z
    //   440: pop
    //   441: aload_0
    //   442: getfield G : [Laq;
    //   445: iload #5
    //   447: aaload
    //   448: instanceof ex
    //   451: ifeq -> 472
    //   454: aload_0
    //   455: iconst_m1
    //   456: aload_0
    //   457: getfield G : [Laq;
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
    //   483: getfield G : [Laq;
    //   486: arraylength
    //   487: if_icmplt -> 132
    //   490: return
  }
  
  public final void e(int paramInt1, int paramInt2) {
    if (this.p.m())
      this.p.e(paramInt1, paramInt2); 
  }
  
  private void a(Object paramObject) {
    this.L = 0;
    this.K = null;
    this.s = (dc)paramObject;
  }
  
  public final void u() {
    for (byte b = 0; b < this.G.length; b++) {
      if (this.G[b] != null) {
        this.G[b].n();
        this.G[b].c(true);
      } 
    } 
    if (this.K != null)
      this.K.i(); 
    if (this.L < 7) {
      this.L++;
      if (this.L == 7 && this.s != null && this.s.k != null) {
        Object object = this.s.k;
        id id1;
        (id1 = this).K = new fw(object);
        int i = id1.g - 18;
        id1.K.a(9, i, id1.f - 20, id1.g / 4);
        id1.K.c(9, i);
        id1.K.a(9, i - id1.K.q() - 7);
      } 
    } 
    if (this.h) {
      this.H--;
      if (this.H <= 0) {
        e(false);
        this.H = 0;
      } 
    } 
  }
  
  public final void a(String paramString1, String paramString2, byte paramByte, long paramLong) {
    a.s().v();
    synchronized (this.J) {
      e(true);
      this.N = paramByte;
      this.P = paramString2;
      this.O = paramLong;
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
    a.s().v();
    if (this.Q) {
      this.N = paramByte;
      this.P = paramString;
      this.O = paramLong;
      this.q.a(this.s);
      lm lm1 = (lm)this.s.k;
      id id1 = this;
      int i = 0;
      a a = new a();
      int j;
      for (j = 0; j < id1.p.s(); j++) {
        lm lm2;
        if ((((dc)id1.p.k(j)).j == 1 || ((dc)id1.p.k(j)).j == 2) && (lm2 = (lm)((dc)id1.p.k(j)).k) != null && lm2.a == lm1.a) {
          i += lm2.g;
          a.a(id1.p.k(j));
        } 
      } 
      i += lm1.g;
      for (j = 0; j < a.d(); j++)
        id1.p.a((dc)a.b(j)); 
      if (lm1.l <= 0) {
        lm lm2;
        (lm2 = lm1.b()).g = i;
        dc dc1 = new dc(null, lm2, (lm1.e == 3) ? 2 : 1, id1.V);
        id1.p.a(dc1);
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
          dc dc1 = new dc(null, lm2, (lm1.e == 3) ? 2 : 1, id1.V);
          id1.p.a(dc1);
        } 
      } 
      x();
      this.Q = false;
      this.s = null;
      a(this.q.r());
      return;
    } 
  }
  
  public final void b(String paramString1, String paramString2, byte paramByte, long paramLong) {
    a.s().v();
    synchronized (this.J) {
      e(true);
      this.N = paramByte;
      this.P = paramString2;
      this.O = paramLong;
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
  
  private void a(String paramString) {
    for (byte b = 0; b < this.p.s(); b++) {
      dc dc1;
      ll ll;
      if ((dc1 = (dc)this.p.k(b)).j == 0 && dc1.k != null && (ll = (ll)dc1.k).c.equals(paramString)) {
        this.p.a(dc1);
        this.r.a(dc1);
        a(this.r.r());
        return;
      } 
    } 
  }
  
  private void w() {
    for (byte b = 0; b < this.r.s(); b++) {
      dc dc1 = (dc)this.r.k(b);
      ks.a().r(((ll)dc1.k).c);
    } 
  }
  
  public final void b(String paramString, byte paramByte, long paramLong) {
    a.s().v();
    if (this.M != null) {
      int i;
      this.N = paramByte;
      this.P = paramString;
      this.O = paramLong;
      paramByte = 0;
      a a1 = new a();
      int m;
      for (m = 0; m < this.q.s(); m++) {
        lm lm3;
        if (((dc)this.q.k(m)).j == 1 && (lm3 = (lm)((dc)this.q.k(m)).k) != null && lm3.a == this.M.a) {
          i = paramByte + lm3.g;
          a1.a(this.q.k(m));
        } 
      } 
      i += this.M.g;
      for (m = 0; m < a1.d(); m++)
        this.q.a((dc)a1.b(m)); 
      if (this.M.l <= 0) {
        lm lm3;
        (lm3 = this.M.b()).g = i;
        dc dc1 = new dc(null, lm3, 1, this.V);
        this.q.a(dc1);
      } else {
        m = i / this.M.l + ((i % this.M.l > 0) ? 1 : 0);
        for (byte b1 = 0; b1 < m; b1++) {
          lm lm3 = this.M.b();
          if (i >= this.M.l) {
            lm3.g = this.M.l;
            i -= this.M.l;
          } else if (i > 0) {
            lm3.g = i;
            i = 0;
          } 
          dc dc1 = new dc(null, lm3, 1, this.V);
          this.q.a(dc1);
        } 
      } 
      lm lm1 = this.M;
      id id1 = this;
      int j = 0;
      lm lm2 = lm1.b();
      a a2 = new a();
      byte b;
      for (b = 0; b < id1.p.s(); b++) {
        id1.s = (dc)id1.p.k(b);
        lm lm3;
        if (id1.s != null && id1.s.k != null && (id1.s.j == 1 || id1.s.j == 2) && (lm3 = (lm)id1.s.k) != null && lm3.a == lm1.a) {
          j += lm3.g;
          a2.a(id1.s);
        } 
      } 
      lm2.g = j - lm1.g;
      for (b = 0; b < a2.d(); b++)
        id1.p.a((dc)a2.b(b)); 
      if (lm2.g > 0)
        id1.a(new lm[] { lm2 }); 
      id1.x();
      a(this.p.r());
    } 
  }
  
  public final void e(boolean paramBoolean) {
    super.e(paramBoolean);
    this.H = 5;
  }
  
  public final void b(Graphics paramGraphics) {
    this.U.a(paramGraphics, "Phí kết hợp: " + i.a(this.O, ",") + " KEN", (v.t - bx.d.a("Phí kết hợp: ")) / 2 - 10, 10, 0);
    if (!this.R) {
      if (this.P != null)
        this.U.a(paramGraphics, this.P, (v.t - bx.d.a(this.P)) / 2, this.q.d() + this.q.f() + 8, 0); 
    } else if (this.T != null) {
      this.U.a(paramGraphics, this.T, (v.t - bx.d.a(this.T)) / 2, this.q.d() + this.q.f() + 8, 0);
    } 
    if (this.u != null) {
      this.u.a(paramGraphics, this.c, this.d);
      this.u.c(true);
    } 
    if (this.v != null) {
      this.v.a(paramGraphics, this.c, this.d);
      this.v.c(true);
    } 
    this.F.a(paramGraphics, 0, 0);
    if (this.t != null) {
      this.t.a(paramGraphics, this.c, this.d);
      this.t.c(true);
    } 
    if (!this.n && this.K != null)
      this.K.a(paramGraphics, this.c, this.d); 
    bx.d.a(paramGraphics, String.valueOf(this.p.s()) + "/" + go.n, this.w.a, this.w.b - 16, 0);
  }
  
  private void x() {
    this.p.i(this.p.q());
  }
  
  public final void a(Graphics paramGraphics) {
    pc.a(paramGraphics, this.c, this.d, this.f, this.g, v.aj, true);
  }
  
  public final void b(aq paramaq, int paramInt) {
    a(paramaq);
    k k1 = ((fg)((ay)this.G[this.D]).w()).u();
    id id1;
    if (this.G[this.D] instanceof ay && (id1 = this).s != null) {
      bs bs = new bs();
      if (id1.u.m() && !id1.R && id1.q != null && id1.s.j != 3)
        bs.a(new br("Bỏ ra", 4)); 
      if (id1.t.m() && !id1.R && id1.p != null) {
        id id3 = id1;
        byte b1 = 0;
        for (byte b2 = 0; b2 < id3.q.a(); b2++) {
          if (id3.q.k(b2) != null)
            b1++; 
        } 
        id id4;
        if (b1 < id1.q.a() && (id4 = id3 = id1).s.k != null) {
          bd bd;
          if ((id4 = id3).s.j == 1) {
            lm lm1 = (lm)(id4 = id3).s.k;
            dc dc1 = new dc(null, lm1.b(), (id4 = id3).s.j, id3.V);
            gu gu1;
            (gu1 = new gu(dc1)).a(id3);
            gu1.e(lm1.g);
            bd = new bd("Xong", 5);
            gu gu2;
            (gu2 = gu1).a(bd, true);
            gu1.a(new bd("", 5));
            bd = new bd("Hủy", 6);
            (gu2 = gu1).b(bd, true);
            gu1.b(-7524);
            gu1.j(true);
            ag.b().a(gu1, false);
          } else {
            bd bd1;
            if (((id)(bd1 = bd)).s.j == 0) {
              ks.a().b(((id)bd).I, (byte)0, ((ll)((id)(bd1 = bd)).s.k).c);
              a.s().a(null, null);
            } 
          } 
        } 
      } 
      if (bs.s() == null || (bs.s()).length == 0)
        return; 
      int j = k1.a + id1.c + (k1.c - bs.e()) / 2;
      int i;
      if ((i = k1.b + id1.d + k1.d) + bs.f() > v.u - ba.a)
        i = v.u - ba.a - bs.f(); 
      bs.a_(id1.c + id1.f + bs.e(), i);
      bs.d((j < id1.c) ? id1.c : ((j + bs.e() > id1.c + id1.f) ? (id1.c + id1.f - bs.e()) : j), i);
      bs.a(id1);
      az az1 = id1.B;
      id id2;
      (id2 = id1).b(az1, true);
      az1 = id1.C;
      (id2 = id1).a(az1, true);
      bs.a_(1);
      id1.n = true;
      id1.a(bs, id1.C, (az)null, id1.B);
    } 
  }
  
  public final void a(aq paramaq, int paramInt) {}
  
  public final void a(aq paramaq, int paramInt1, int paramInt2) {}
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\id.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */