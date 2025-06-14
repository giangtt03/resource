import javax.microedition.lcdui.Graphics;

public final class kl extends at {
  public int a;
  
  public static final byte[] b = new byte[] { 0, 0, 0, 0, -1, -1, -1, 1, 1, 1 };
  
  public static final byte[] c = new byte[] { 0, -1, 1, -1, 1, -1, 1 };
  
  public mg d = null;
  
  public mg e;
  
  private mg z;
  
  public mg f;
  
  private mg A;
  
  public md g;
  
  public mg h;
  
  private int B = 0;
  
  public int i = 7;
  
  public int j = -1;
  
  private int C = -1;
  
  public int k = 0;
  
  public int s;
  
  public k t = null;
  
  public k u = null;
  
  private int D = 0;
  
  private int E = 17;
  
  public boolean v = false;
  
  private lh F;
  
  private int G;
  
  private int H;
  
  private k I = null;
  
  private int J;
  
  public int w = 0;
  
  public int x = 50;
  
  private boolean K = true;
  
  private int L = 0;
  
  private int M;
  
  private int N = 0;
  
  public boolean y = false;
  
  private nr O;
  
  private static final byte[] P = new byte[] { -1, 1 };
  
  private int Q;
  
  private int R;
  
  public kl() {
    this.t = new k(this.m, this.n, this.E, 32);
    this.u = new k(this.m, this.n, 26, 32);
    this.i = 4;
    b(false);
    e(10);
  }
  
  public final void a(lh paramlh) {
    this.F = paramlh;
    this.y = paramlh.ad;
    mb[] arrayOfMb = mb.a(this.F);
    this.e = null;
    this.z = null;
    this.f = null;
    this.A = null;
    this.h = null;
    this.g = null;
    System.gc();
    lc lc = lc.a(this.F);
    this.O = nr.a(this.F);
    this.e = mb.a(paramlh, arrayOfMb[0], arrayOfMb[1], arrayOfMb[3], arrayOfMb[2], true);
    this.e.a(lc);
    this.e.a(this.O);
    this.z = mb.b(paramlh, arrayOfMb[0], arrayOfMb[1], arrayOfMb[3], arrayOfMb[2], true);
    this.z.a(lc);
    this.z.a(this.O);
    this.f = mb.c(paramlh, arrayOfMb[0], arrayOfMb[1], arrayOfMb[3], arrayOfMb[2], true);
    this.f.a(lc);
    this.f.a(this.O);
    this.A = mb.g(paramlh, arrayOfMb[0], arrayOfMb[1], arrayOfMb[3], arrayOfMb[2], true);
    this.A.a(lc);
    this.h = mb.h(paramlh, arrayOfMb[0], arrayOfMb[1], arrayOfMb[3], arrayOfMb[2], true);
    this.h.a(lc);
    this.g = mb.i(paramlh, arrayOfMb[0], arrayOfMb[1], arrayOfMb[3], arrayOfMb[2], true);
    this.g.a(lc);
    this.G = -this.t.c;
    this.H = this.t.d - this.e.q();
    this.o = this.e.p();
    this.p = this.e.q();
    this.d = this.e;
    this.J = this.d.q() - this.t.d;
    this.I = new k(this.t.a, this.t.b - this.J, this.t.c, this.d.q());
    a(0, 8);
    b(this.F);
  }
  
  public final void b(lh paramlh) {
    this.i = 4 + paramlh.G / 10;
    if (this.i > 9)
      this.i = 9; 
    this.a = 11 + paramlh.G / 10;
    if (this.a > 16)
      this.a = 16; 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (this.K && this.d != null)
      this.d.a(paramGraphics, this.t.a + this.G + this.L + paramInt1, this.t.b + this.H + paramInt2); 
  }
  
  public final void i() {
    // Byte code:
    //   0: aload_0
    //   1: getfield x : I
    //   4: ifle -> 50
    //   7: aload_0
    //   8: dup
    //   9: getfield x : I
    //   12: iconst_1
    //   13: isub
    //   14: putfield x : I
    //   17: aload_0
    //   18: aload_0
    //   19: getfield K : Z
    //   22: ifeq -> 29
    //   25: iconst_0
    //   26: goto -> 30
    //   29: iconst_1
    //   30: putfield K : Z
    //   33: aload_0
    //   34: getfield x : I
    //   37: ifne -> 50
    //   40: aload_0
    //   41: iconst_1
    //   42: putfield K : Z
    //   45: aload_0
    //   46: iconst_1
    //   47: invokevirtual b : (Z)V
    //   50: aload_0
    //   51: getfield N : I
    //   54: ifle -> 87
    //   57: aload_0
    //   58: dup
    //   59: getfield N : I
    //   62: iconst_1
    //   63: isub
    //   64: putfield N : I
    //   67: aload_0
    //   68: getfield N : I
    //   71: ifne -> 87
    //   74: aload_0
    //   75: dup
    //   76: getfield i : I
    //   79: putfield i : I
    //   82: aload_0
    //   83: iconst_0
    //   84: putfield M : I
    //   87: aload_0
    //   88: getfield j : I
    //   91: tableswitch default -> 374, 0 -> 205, 1 -> 374, 2 -> 283, 3 -> 374, 4 -> 357, 5 -> 140, 6 -> 171, 7 -> 202, 8 -> 291
    //   140: aload_0
    //   141: getfield d : Lmg;
    //   144: invokevirtual h : ()I
    //   147: ifne -> 374
    //   150: aload_0
    //   151: getfield d : Lmg;
    //   154: invokevirtual j : ()Z
    //   157: ifeq -> 374
    //   160: aload_0
    //   161: getfield d : Lmg;
    //   164: iconst_1
    //   165: invokevirtual d : (I)V
    //   168: goto -> 374
    //   171: aload_0
    //   172: getfield d : Lmg;
    //   175: invokevirtual h : ()I
    //   178: ifne -> 374
    //   181: aload_0
    //   182: getfield d : Lmg;
    //   185: invokevirtual j : ()Z
    //   188: ifeq -> 374
    //   191: aload_0
    //   192: getfield d : Lmg;
    //   195: iconst_1
    //   196: invokevirtual d : (I)V
    //   199: goto -> 374
    //   202: goto -> 374
    //   205: aload_0
    //   206: getfield y : Z
    //   209: ifeq -> 374
    //   212: aload_0
    //   213: dup
    //   214: getfield R : I
    //   217: iconst_1
    //   218: iadd
    //   219: putfield R : I
    //   222: aload_0
    //   223: getfield R : I
    //   226: bipush #10
    //   228: if_icmple -> 374
    //   231: aload_0
    //   232: dup
    //   233: getfield H : I
    //   236: getstatic kl.P : [B
    //   239: aload_0
    //   240: getfield Q : I
    //   243: baload
    //   244: iadd
    //   245: putfield H : I
    //   248: aload_0
    //   249: dup
    //   250: getfield Q : I
    //   253: iconst_1
    //   254: iadd
    //   255: putfield Q : I
    //   258: aload_0
    //   259: getfield Q : I
    //   262: getstatic kl.P : [B
    //   265: pop
    //   266: iconst_1
    //   267: if_icmple -> 275
    //   270: aload_0
    //   271: iconst_0
    //   272: putfield Q : I
    //   275: aload_0
    //   276: iconst_0
    //   277: putfield R : I
    //   280: goto -> 374
    //   283: aload_0
    //   284: getfield v : Z
    //   287: ifne -> 374
    //   290: return
    //   291: aload_0
    //   292: dup
    //   293: astore_1
    //   294: getfield d : Lmg;
    //   297: invokevirtual j : ()Z
    //   300: ifeq -> 308
    //   303: aload_0
    //   304: iconst_2
    //   305: invokevirtual a : (I)V
    //   308: aload_0
    //   309: getfield B : I
    //   312: istore_1
    //   313: aload_0
    //   314: aload_0
    //   315: getfield d : Lmg;
    //   318: invokevirtual f : ()I
    //   321: putfield B : I
    //   324: iload_1
    //   325: aload_0
    //   326: getfield B : I
    //   329: if_icmpeq -> 374
    //   332: aload_0
    //   333: getfield t : Lk;
    //   336: dup
    //   337: getfield b : I
    //   340: iconst_3
    //   341: getstatic kl.c : [B
    //   344: aload_0
    //   345: getfield k : I
    //   348: baload
    //   349: imul
    //   350: iadd
    //   351: putfield b : I
    //   354: goto -> 374
    //   357: aload_0
    //   358: dup
    //   359: astore_1
    //   360: getfield d : Lmg;
    //   363: invokevirtual j : ()Z
    //   366: ifeq -> 374
    //   369: aload_0
    //   370: iconst_0
    //   371: invokevirtual a : (I)V
    //   374: aload_0
    //   375: getfield j : I
    //   378: iconst_2
    //   379: if_icmpeq -> 399
    //   382: aload_0
    //   383: getfield j : I
    //   386: bipush #8
    //   388: if_icmpeq -> 399
    //   391: aload_0
    //   392: getfield j : I
    //   395: iconst_3
    //   396: if_icmpne -> 455
    //   399: aload_0
    //   400: aload_0
    //   401: getfield t : Lk;
    //   404: getfield a : I
    //   407: aload_0
    //   408: getfield o : I
    //   411: aload_0
    //   412: getfield t : Lk;
    //   415: getfield c : I
    //   418: isub
    //   419: iconst_2
    //   420: idiv
    //   421: isub
    //   422: putfield m : I
    //   425: aload_0
    //   426: aload_0
    //   427: getfield t : Lk;
    //   430: getfield b : I
    //   433: aload_0
    //   434: getfield p : I
    //   437: aload_0
    //   438: getfield t : Lk;
    //   441: getfield d : I
    //   444: isub
    //   445: isub
    //   446: putfield n : I
    //   449: aload_0
    //   450: bipush #-2
    //   452: goto -> 514
    //   455: aload_0
    //   456: aload_0
    //   457: getfield t : Lk;
    //   460: getfield a : I
    //   463: putfield m : I
    //   466: aload_0
    //   467: aload_0
    //   468: getfield t : Lk;
    //   471: getfield b : I
    //   474: aload_0
    //   475: getfield p : I
    //   478: aload_0
    //   479: getfield t : Lk;
    //   482: getfield d : I
    //   485: isub
    //   486: isub
    //   487: putfield n : I
    //   490: aload_0
    //   491: getfield d : Lmg;
    //   494: ifnull -> 517
    //   497: aload_0
    //   498: aload_0
    //   499: getfield d : Lmg;
    //   502: invokevirtual g : ()I
    //   505: ifne -> 513
    //   508: bipush #-4
    //   510: goto -> 514
    //   513: iconst_2
    //   514: putfield L : I
    //   517: aload_0
    //   518: getfield I : Lk;
    //   521: aload_0
    //   522: getfield t : Lk;
    //   525: getfield b : I
    //   528: aload_0
    //   529: getfield J : I
    //   532: isub
    //   533: putfield b : I
    //   536: aload_0
    //   537: getfield I : Lk;
    //   540: aload_0
    //   541: getfield t : Lk;
    //   544: getfield a : I
    //   547: putfield a : I
    //   550: aload_0
    //   551: getfield d : Lmg;
    //   554: ifnull -> 564
    //   557: aload_0
    //   558: getfield d : Lmg;
    //   561: invokevirtual i : ()V
    //   564: return
  }
  
  public final void a(int paramInt1, int paramInt2) {
    b(paramInt2);
    a(paramInt1);
  }
  
  public final void a(int paramInt) {
    this.y = this.F.ad;
    this.C = this.j;
    mg mg1 = this.d;
    this.j = paramInt;
    if (this.O != null)
      this.O.d(0); 
    switch (paramInt) {
      case 1:
        if (this.C != this.j) {
          this.d = this.z;
          if (mg1 != null)
            this.d.c(mg1.g()); 
        } 
        if (this.O != null)
          this.O.d(1); 
        break;
      case 6:
        this.d = this.h;
        if (mg1 != null)
          this.d.c(mg1.g()); 
        this.d.d(0);
        this.s = 1;
        break;
      case 7:
        this.d = this.h;
        this.d.d(2);
        this.B = 0;
        break;
      case 5:
        this.d = this.A;
        if (mg1 != null)
          this.d.c(mg1.g()); 
        this.d.d(0);
        this.s = this.a;
        this.w = 0;
        break;
      case 0:
        this.d = this.e;
        if (mg1 != null)
          this.d.c(mg1.g()); 
        break;
      case 2:
        if (this.d != this.g)
          this.d = this.g; 
        this.d.d(1);
        break;
      case 3:
        this.d.d(0);
        if (mg1 != null)
          this.d.c(mg1.g()); 
        break;
      case 8:
        this.d = this.g;
        this.d.d(1);
        if (mg1 != null)
          this.d.c(mg1.g()); 
        break;
      case 4:
        b(true);
        this.d = this.f;
        this.d.a(0);
        if (mg1 != null)
          this.d.c(mg1.g()); 
        this.u.b = this.t.b;
        if (this.d.g() == 0) {
          this.t.a -= this.u.c;
        } else {
          this.t.a += this.t.c;
        } 
        if (this.O != null)
          this.O.d(2); 
        break;
    } 
    this.d.r();
    if (this.d.f() < 0)
      this.d.i(); 
  }
  
  public final void b(int paramInt) {
    if (this.d != null)
      this.d.c(((paramInt & 0x8) != 0) ? 2 : (((paramInt & 0x4) != 0) ? 0 : this.d.g())); 
    this.k = paramInt;
  }
  
  public final void b(int paramInt1, int paramInt2) {
    this.t.a += paramInt1;
    this.t.b += paramInt2;
  }
  
  public final void c(int paramInt1, int paramInt2) {
    this.t.a = paramInt1;
    this.t.b = paramInt2;
    this.m = this.t.a;
    this.n = this.t.b - this.p - this.t.d;
  }
  
  public final void g(int paramInt) {
    this.t.b = paramInt;
    this.n = this.t.b - this.p - this.t.d;
  }
  
  public final void f(int paramInt) {
    this.t.a = paramInt;
    this.m = this.t.a;
  }
  
  public final int n() {
    return this.t.a - (this.o - this.t.c) / 2;
  }
  
  public final int o() {
    return this.t.b + this.H;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\kl.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */