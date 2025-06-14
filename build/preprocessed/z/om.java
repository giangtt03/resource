import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class om extends aq implements bf, bg {
  private Image r;
  
  private Image s;
  
  private Image t;
  
  private final ks u;
  
  private az v;
  
  private az w;
  
  private az x;
  
  private az y;
  
  private az z;
  
  private az A;
  
  private az B;
  
  private az C;
  
  private az D;
  
  public static cu i = null;
  
  private static cu E = null;
  
  public static byte j = 0;
  
  public static int k = 8;
  
  private kh F;
  
  public kl l;
  
  private kf G;
  
  private kd H;
  
  private a I;
  
  private kj J;
  
  public jv m;
  
  private byte[][] K;
  
  private kg[] L;
  
  private kg M;
  
  private boolean N;
  
  private boolean O;
  
  private boolean P;
  
  private ln Q;
  
  private cu R;
  
  private String S;
  
  private int T;
  
  public a n;
  
  private int U;
  
  private jt V;
  
  private a W;
  
  private oa X;
  
  private int Y;
  
  private boolean Z;
  
  public boolean o;
  
  private jw aa;
  
  private ka ab;
  
  private int ac;
  
  private int[] ad;
  
  private boolean ae;
  
  private String af;
  
  private a ag;
  
  private az ah;
  
  public static boolean p = false;
  
  public ha q;
  
  private gj ai;
  
  private br aj;
  
  private int ak;
  
  private ox al;
  
  private ol am;
  
  private ax an;
  
  private byte ao;
  
  private jx[] ap;
  
  private boolean aq;
  
  public om(int paramInt, ol paramol, oa paramoa) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: ldc '/monster'
    //   7: invokestatic d : (Ljava/lang/String;)Ljavax/microedition/lcdui/Image;
    //   10: putfield r : Ljavax/microedition/lcdui/Image;
    //   13: aload_0
    //   14: ldc '/zap'
    //   16: invokestatic d : (Ljava/lang/String;)Ljavax/microedition/lcdui/Image;
    //   19: putfield s : Ljavax/microedition/lcdui/Image;
    //   22: aload_0
    //   23: ldc '/ice'
    //   25: invokestatic d : (Ljava/lang/String;)Ljavax/microedition/lcdui/Image;
    //   28: putfield t : Ljavax/microedition/lcdui/Image;
    //   31: aload_0
    //   32: invokestatic a : ()Lks;
    //   35: putfield u : Lks;
    //   38: aload_0
    //   39: aconst_null
    //   40: putfield D : Laz;
    //   43: aload_0
    //   44: aconst_null
    //   45: putfield l : Lkl;
    //   48: aload_0
    //   49: aconst_null
    //   50: putfield G : Lkf;
    //   53: aload_0
    //   54: aconst_null
    //   55: putfield H : Lkd;
    //   58: aload_0
    //   59: new a
    //   62: dup
    //   63: invokespecial <init> : ()V
    //   66: putfield I : La;
    //   69: aload_0
    //   70: new kj
    //   73: dup
    //   74: invokespecial <init> : ()V
    //   77: putfield J : Lkj;
    //   80: aload_0
    //   81: new km
    //   84: dup
    //   85: invokespecial <init> : ()V
    //   88: putfield m : Ljv;
    //   91: aload_0
    //   92: aconst_null
    //   93: putfield K : [[B
    //   96: aload_0
    //   97: aconst_null
    //   98: putfield M : Lkg;
    //   101: aload_0
    //   102: iconst_0
    //   103: putfield N : Z
    //   106: aload_0
    //   107: iconst_0
    //   108: putfield O : Z
    //   111: aload_0
    //   112: iconst_0
    //   113: putfield P : Z
    //   116: aload_0
    //   117: aconst_null
    //   118: putfield S : Ljava/lang/String;
    //   121: aload_0
    //   122: iconst_m1
    //   123: putfield U : I
    //   126: aload_0
    //   127: new a
    //   130: dup
    //   131: invokespecial <init> : ()V
    //   134: putfield W : La;
    //   137: aload_0
    //   138: aconst_null
    //   139: putfield X : Loa;
    //   142: aload_0
    //   143: iconst_0
    //   144: putfield o : Z
    //   147: aload_0
    //   148: new jw
    //   151: dup
    //   152: invokespecial <init> : ()V
    //   155: putfield aa : Ljw;
    //   158: aload_0
    //   159: aconst_null
    //   160: putfield ab : Lka;
    //   163: aload_0
    //   164: iconst_0
    //   165: putfield ac : I
    //   168: aload_0
    //   169: iconst_0
    //   170: putfield ae : Z
    //   173: aload_0
    //   174: aconst_null
    //   175: putfield af : Ljava/lang/String;
    //   178: aload_0
    //   179: new a
    //   182: dup
    //   183: invokespecial <init> : ()V
    //   186: putfield ag : La;
    //   189: aload_0
    //   190: aconst_null
    //   191: putfield q : Lha;
    //   194: aload_0
    //   195: aconst_null
    //   196: putfield ai : Lgj;
    //   199: aload_0
    //   200: aconst_null
    //   201: putfield aj : Lbr;
    //   204: aload_0
    //   205: iconst_m1
    //   206: putfield ak : I
    //   209: aload_0
    //   210: iconst_0
    //   211: putfield ao : B
    //   214: aload_0
    //   215: iconst_1
    //   216: putfield aq : Z
    //   219: ldc 'map'
    //   221: invokestatic b : (Ljava/lang/String;)V
    //   224: aload_0
    //   225: aload_2
    //   226: putfield am : Lol;
    //   229: aload_0
    //   230: aload_3
    //   231: putfield X : Loa;
    //   234: aload_0
    //   235: iconst_1
    //   236: invokevirtual a_ : (I)V
    //   239: aload_0
    //   240: new ox
    //   243: dup
    //   244: aconst_null
    //   245: invokespecial <init> : (Lox;)V
    //   248: putfield al : Lox;
    //   251: aload_0
    //   252: bipush #20
    //   254: newarray int
    //   256: putfield ad : [I
    //   259: getstatic v.ah : Z
    //   262: ifne -> 320
    //   265: invokestatic currentTimeMillis : ()J
    //   268: invokestatic c : (J)Ljava/util/Calendar;
    //   271: dup
    //   272: astore_1
    //   273: bipush #11
    //   275: invokevirtual get : (I)I
    //   278: dup
    //   279: istore_1
    //   280: bipush #6
    //   282: if_icmplt -> 314
    //   285: iload_1
    //   286: bipush #19
    //   288: if_icmpge -> 299
    //   291: aload_0
    //   292: iconst_0
    //   293: putfield ac : I
    //   296: goto -> 320
    //   299: iload_1
    //   300: bipush #21
    //   302: if_icmpgt -> 314
    //   305: aload_0
    //   306: bipush #-25
    //   308: putfield ac : I
    //   311: goto -> 320
    //   314: aload_0
    //   315: bipush #-40
    //   317: putfield ac : I
    //   320: aload_0
    //   321: new ax
    //   324: dup
    //   325: iconst_3
    //   326: invokespecial <init> : (I)V
    //   329: putfield an : Lax;
    //   332: aload_2
    //   333: aload_0
    //   334: getfield an : Lax;
    //   337: invokevirtual a : (Lax;)V
    //   340: aload_0
    //   341: getstatic v.t : I
    //   344: invokevirtual d : (I)V
    //   347: aload_0
    //   348: getstatic v.u : I
    //   351: invokevirtual e : (I)V
    //   354: aload_2
    //   355: new ba
    //   358: dup
    //   359: invokespecial <init> : ()V
    //   362: invokevirtual a : (Lba;)V
    //   365: iconst_0
    //   366: putstatic om.p : Z
    //   369: aload_0
    //   370: dup
    //   371: astore_1
    //   372: getfield P : Z
    //   375: ifne -> 733
    //   378: aload_1
    //   379: iconst_1
    //   380: putfield P : Z
    //   383: aload_1
    //   384: iconst_1
    //   385: putfield Z : Z
    //   388: aload_1
    //   389: getfield am : Lol;
    //   392: aload_1
    //   393: invokevirtual a : (Lbf;)V
    //   396: aload_1
    //   397: new gb
    //   400: dup
    //   401: bipush #109
    //   403: iconst_1
    //   404: invokespecial <init> : (II)V
    //   407: putfield w : Laz;
    //   410: aload_1
    //   411: new gb
    //   414: dup
    //   415: bipush #105
    //   417: iconst_0
    //   418: invokespecial <init> : (II)V
    //   421: putfield x : Laz;
    //   424: aload_1
    //   425: new gb
    //   428: dup
    //   429: bipush #113
    //   431: iconst_2
    //   432: invokespecial <init> : (II)V
    //   435: putfield y : Laz;
    //   438: aload_1
    //   439: new gb
    //   442: dup
    //   443: bipush #106
    //   445: iconst_3
    //   446: invokespecial <init> : (II)V
    //   449: putfield z : Laz;
    //   452: aload_1
    //   453: new bd
    //   456: dup
    //   457: ldc 'Vào'
    //   459: bipush #101
    //   461: invokespecial <init> : (Ljava/lang/String;I)V
    //   464: putfield v : Laz;
    //   467: aload_1
    //   468: new bd
    //   471: dup
    //   472: ldc 'Nói Chuyện'
    //   474: bipush #107
    //   476: invokespecial <init> : (Ljava/lang/String;I)V
    //   479: putfield B : Laz;
    //   482: aload_1
    //   483: new bd
    //   486: dup
    //   487: ldc 'Tiếp tục'
    //   489: bipush #118
    //   491: invokespecial <init> : (Ljava/lang/String;I)V
    //   494: putfield ah : Laz;
    //   497: aload_1
    //   498: new bd
    //   501: dup
    //   502: ldc 'Nhặt'
    //   504: bipush #110
    //   506: invokespecial <init> : (Ljava/lang/String;I)V
    //   509: putfield A : Laz;
    //   512: aload_1
    //   513: getstatic com/mg/sq/a.n : Laz;
    //   516: putfield C : Laz;
    //   519: aload_1
    //   520: getfield am : Lol;
    //   523: aload_1
    //   524: getfield x : Laz;
    //   527: invokevirtual a : (Laz;)V
    //   530: aload_1
    //   531: getfield am : Lol;
    //   534: aload_1
    //   535: getfield w : Laz;
    //   538: invokevirtual b : (Laz;)V
    //   541: aload_1
    //   542: getfield am : Lol;
    //   545: aload_1
    //   546: getfield C : Laz;
    //   549: invokevirtual c : (Laz;)V
    //   552: aload_1
    //   553: invokespecial x : ()V
    //   556: goto -> 639
    //   559: pop
    //   560: new java/lang/StringBuffer
    //   563: dup
    //   564: ldc 'out of memory '
    //   566: invokespecial <init> : (Ljava/lang/String;)V
    //   569: getstatic com/mg/sq/a.m : Loi;
    //   572: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuffer;
    //   575: invokevirtual toString : ()Ljava/lang/String;
    //   578: invokestatic a : (Ljava/lang/String;)V
    //   581: getstatic com/mg/sq/a.m : Loi;
    //   584: ifnull -> 599
    //   587: getstatic com/mg/sq/a.m : Loi;
    //   590: invokevirtual G : ()V
    //   593: invokestatic s : ()Lcom/mg/sq/a;
    //   596: invokevirtual v : ()V
    //   599: aload_1
    //   600: invokespecial x : ()V
    //   603: goto -> 639
    //   606: dup
    //   607: astore_2
    //   608: invokevirtual printStackTrace : ()V
    //   611: invokestatic s : ()Lcom/mg/sq/a;
    //   614: iconst_1
    //   615: invokevirtual j : (I)V
    //   618: goto -> 733
    //   621: dup
    //   622: astore_2
    //   623: invokevirtual printStackTrace : ()V
    //   626: invokestatic a : ()Lou;
    //   629: iconst_4
    //   630: aload_2
    //   631: ldc 'MapTabView.init()#1'
    //   633: invokevirtual a : (ILjava/lang/Throwable;Ljava/lang/String;)V
    //   636: goto -> 733
    //   639: invokestatic s : ()Lcom/mg/sq/a;
    //   642: astore_2
    //   643: getstatic com/mg/sq/a.i : Ljava/lang/String;
    //   646: ifnull -> 664
    //   649: aload_2
    //   650: getstatic com/mg/sq/a.i : Ljava/lang/String;
    //   653: getstatic com/mg/sq/a.j : B
    //   656: pop
    //   657: invokevirtual q : (Ljava/lang/String;)V
    //   660: aconst_null
    //   661: putstatic com/mg/sq/a.i : Ljava/lang/String;
    //   664: invokestatic s : ()Lcom/mg/sq/a;
    //   667: ldc 241230
    //   669: invokevirtual e : (I)V
    //   672: goto -> 701
    //   675: pop
    //   676: invokestatic s : ()Lcom/mg/sq/a;
    //   679: iconst_1
    //   680: invokevirtual j : (I)V
    //   683: goto -> 733
    //   686: dup
    //   687: astore_2
    //   688: invokevirtual printStackTrace : ()V
    //   691: invokestatic a : ()Lou;
    //   694: iconst_4
    //   695: aload_2
    //   696: ldc 'MapTabView.init()#2'
    //   698: invokevirtual a : (ILjava/lang/Throwable;Ljava/lang/String;)V
    //   701: getstatic com/mg/sq/a.m : Loi;
    //   704: ifnull -> 713
    //   707: getstatic com/mg/sq/a.m : Loi;
    //   710: invokevirtual L : ()V
    //   713: aload_1
    //   714: invokevirtual t : ()V
    //   717: aconst_null
    //   718: putstatic oa.c : Ljn;
    //   721: aconst_null
    //   722: putstatic oa.b : [[B
    //   725: aload_1
    //   726: aconst_null
    //   727: putfield ad : [I
    //   730: invokestatic gc : ()V
    //   733: iconst_1
    //   734: invokestatic i : (I)V
    //   737: return
    // Exception table:
    //   from	to	target	type
    //   378	618	675	java/lang/OutOfMemoryError
    //   378	618	686	java/lang/Exception
    //   552	556	559	java/lang/OutOfMemoryError
    //   552	556	621	java/lang/Exception
    //   599	603	606	java/lang/OutOfMemoryError
    //   621	636	675	java/lang/OutOfMemoryError
    //   621	636	686	java/lang/Exception
    //   639	672	675	java/lang/OutOfMemoryError
    //   639	672	686	java/lang/Exception
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.O)
      return; 
    paramGraphics.setColor(0);
    paramGraphics.fillRect(0, 0, v.t, v.u);
    try {
      this.F.a(paramGraphics);
      if (this.S != null) {
        pc.b(paramGraphics, this.R.a - (this.T >> 1), this.R.b, this.T, 17, 1070484, 16579764, 14542575);
        bx.d.a(paramGraphics, this.S, this.R.a, this.R.b + 2, 1);
      } 
      if (gr.a && this.V != null) {
        this.V.a(paramGraphics);
        if (this.am != null && this.am.s)
          paramGraphics.drawImage(dc.i, this.V.p() + 1, (this.V.q() - dc.i.getHeight()) / 2, 20); 
        if (this.ap != null) {
          paramInt1 = this.V.q() + 2;
          for (paramInt2 = 0; paramInt2 < this.ap.length; paramInt2++) {
            this.ap[paramInt2].a(paramGraphics, 0, paramInt1);
            paramInt1 += this.ap[paramInt2].q() + 2;
          } 
        } 
      } 
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
    } 
    this.am.c(true);
  }
  
  private void x() {
    System.out.println("Loading map " + oa.c);
    Image image4 = g(oa.c.f, this.ac);
    this.F = new kh(image4);
    this.K = a(oa.c.j, oa.c.d, oa.c.e);
    this.n = new a();
    for (byte b1 = 0; b1 < oa.c.d; b1++) {
      for (byte b = 0; b < oa.c.e; b++) {
        if (this.K[b1][b] == 2) {
          this.n.a(new cu(b, b1));
          this.K[b1][b] = 0;
        } 
      } 
    } 
    Image image3 = g(oa.c.g, this.ac);
    kc kc = new kc(image3);
    this.F.a(kc);
    int i = a(oa.c.k, oa.c.m);
    byte[] arrayOfByte2;
    h.b(arrayOfByte2 = oa.b[i], (this.ac << 1) / 3);
    Image image2 = f.a(arrayOfByte2);
    this.G = new kf(image2, a(oa.c.h, oa.c.d, oa.c.e), (byte)32, (byte)32);
    this.F.a(this.G);
    this.F.h(this.G.p());
    this.F.i(this.G.q());
    this.H = new kd();
    this.F.a(this.H);
    this.Q = new ln();
    this.L = new kg[oa.c.l.length];
    byte[] arrayOfByte1;
    h.b(arrayOfByte1 = f.b("/gate"), (this.ac << 1) / 3);
    Image image1 = f.a(arrayOfByte1);
    for (byte b2 = 0; b2 < oa.c.l.length; b2++) {
      jm jm;
      if ((jm = oa.c.l[b2]).a == 1) {
        this.L[b2] = new kg(this.Q, jm);
        (this.L[b2]).e = this.Q;
      } else if (jm.a == 0) {
        this.L[b2] = new jy(image1, jm, this.F.p());
      } else {
        Image image;
        if ((image = this.al.a(jm.i, true)) == null) {
          image = g(jm.i, 0);
          this.al.a(jm.i, image);
        } 
        this.L[b2] = new kk(image, jm, 1);
      } 
      if (jm.c == go.x && i == null) {
        i = 0;
        if (jm.a == 0)
          if (this.L[b2].b() == 0) {
            i = (this.L[b2]).d.f;
          } else {
            i -= 26;
          }  
        i = new cu(jm.d + i, jm.e);
      } 
    } 
    this.l = new kl();
    this.l.a(go.k);
    this.l.c(i.a, i.b);
    if (j == 4)
      j = 0; 
    this.l.a(j, k);
    i = null;
    this.H.a(this.l);
    this.H.c = this.L;
    if (go.u != null && go.u.length > 0 && E != null) {
      Image image = f.d("/info/itemchest");
      for (byte b = 0; b < go.u.length; b++) {
        ju ju;
        (ju = new ju(image, 1)).l(60);
        ju.v = go.u[b];
        ju.c(E.a, E.b - ju.q());
        ju.a(new byte[][] { new byte[1], new byte[1], new byte[1], new byte[1] }, ju.p());
        ju.a(new byte[][] { new byte[1], new byte[1], new byte[1], new byte[1] });
        ju.b((byte)1);
        ju.a((byte)1);
        ju.w = (cv.a(2) == 0) ? -1 : 1;
        this.H.d.a(ju);
      } 
      go.u = new ll[0];
    } 
    this.G.a(a(oa.c.i, oa.c.d, oa.c.e));
    this.F.a(this.l.t);
    this.S = oa.c.b;
    this.T = bx.d.a(this.S) + 10;
    this.R = new cu(v.t - this.T / 2, 0);
    this.V = new jt(go.k);
    a(go.k.ac);
    this.O = true;
  }
  
  public final void a(jo[] paramArrayOfjo, boolean paramBoolean) {
    this.W.a();
    int i = (this.l.t.a + this.l.t.c / 2) / 32;
    int j = (this.l.t.b + this.l.t.d / 2) / 32;
    int k;
    for (k = i; k < (this.K[j]).length && this.K[j][k] == 0; k++)
      this.W.a(new cu(k, j)); 
    for (k = i; k >= 0 && this.K[j][k] == 0; k--)
      this.W.a(new cu(k, j)); 
    a a1 = new a();
    boolean bool = false;
    byte b;
    for (b = 0; b < paramArrayOfjo.length; b++) {
      Image image = null;
      for (byte b1 = 0; b1 < (paramArrayOfjo[b]).f; b1++) {
        ki ki;
        if (this.n.d() <= 0) {
          this.n = a1;
          if (paramBoolean)
            return; 
          if (bool)
            return; 
          bool = true;
          a1 = new a();
        } 
        k = cv.a(this.n.d());
        cu cu1 = (cu)this.n.b(k);
        cu cu2;
        for (byte b2 = 0; b2 < this.W.d() && (cu2 = (cu)this.W.b(b2)).b == cu1.b; b2++) {
          if (cu1.a == cu2.a) {
            a1.a(cu1);
            this.n.a(k);
            if (this.n.d() > 0) {
              k = cv.a(this.n.d());
              cu1 = (cu)this.n.b(k);
            } else {
              this.n = a1;
              if (paramBoolean)
                return; 
              if (bool)
                return; 
              bool = true;
              a1 = new a();
            } 
          } 
        } 
        if (bool) {
          if ((ki = a(cu1.a << 5, cu1.b << 5, paramArrayOfjo[b], (b1 == 0) ? null : image)) != null) {
            for (byte b3 = 0; b3 < this.I.d(); b3++) {
              ki ki1;
              if ((ki1 = (ki)this.I.b(b3)).n() == ki.n() && ki1.o() == ki.o()) {
                ki.a(0, ((ki1 = ki1).c == 2) ? 3 : 2);
                break;
              } 
              k k1 = ki1.e;
              ki ki2;
              if ((ki2 = ki).e.a(k1)) {
                ki.a(0, ((ki1 = ki1).c == 2) ? 3 : 2);
                break;
              } 
            } 
            this.I.a(ki);
          } else {
            break;
          } 
        } else if ((ki = a(cu1.a << 5, cu1.b << 5, paramArrayOfjo[b], (b1 == 0) ? null : image)) != null) {
          this.I.a(ki);
        } else {
          break;
        } 
        if (b1 == 0) {
          ki ki1;
          image = (ki1 = ki).g;
        } 
        a1.a(cu1);
        this.n.a(k);
      } 
    } 
    for (b = 0; b < a1.d(); b++)
      this.n.a(a1.b(b)); 
  }
  
  public final void a(jo[] paramArrayOfjo) {
    for (byte b = 0; b < paramArrayOfjo.length; b++) {
      byte b1 = 0;
      while (b1 < this.I.d()) {
        kd kd1;
        ki ki;
        if ((ki = (ki)this.I.b(b1)) != null && ki.f.a.equals((paramArrayOfjo[b]).a)) {
          this.I.a(b1);
          String str = (paramArrayOfjo[b]).a;
          kd1 = this.H;
          for (byte b2 = 0; b2 < kd1.b.d(); b2++) {
            ki ki1;
            if (kd1.b.b(b2) instanceof ki && (ki1 = (ki)kd1.b.b(b2)).f.a.equals(str)) {
              kd1.b.a(b2);
              break;
            } 
          } 
          break;
        } 
        kd1++;
      } 
    } 
  }
  
  private ki a(int paramInt1, int paramInt2, jo paramjo, Image paramImage) {
    Image image3;
    int k;
    Image image2;
    int j;
    if (paramjo == null)
      return null; 
    switch (paramjo.c >> 1) {
      case 0:
        image3 = this.r;
        b = 14;
        (ki1 = new ki(image3, 1, 6, paramjo, go.k, paramImage)).c(b);
        ki1.a(ki1.n(), ki1.o(), ki1.p() - 12, 20);
        k = cv.a(2, 4);
        (ki2 = ki1).d = k;
        ki1.c(paramInt1 - ki1.p() - 32, paramInt2 - ki1.q() - 32);
        ki1.a(0, cv.a(2, 3));
        this.H.b.a(ki1);
        return ki1;
      case 1:
        image2 = this.s;
        b = 5;
        (ki1 = new ki(image2, 1, 6, (jo)ki1, go.k, (Image)ki2)).c(b);
        ki1.a(ki1.n(), ki1.o(), ki1.p() - 12, 20);
        j = cv.a(2, 4);
        (ki2 = ki1).d = j;
        ki1.c(paramInt1 - ki1.p() - 32, paramInt2 - ki1.q() - 32);
        ki1.a(0, cv.a(2, 3));
        this.H.b.a(ki1);
        return ki1;
    } 
    Image image1 = this.t;
    byte b = 13;
    ki ki1;
    (ki1 = new ki(image1, 1, 6, (jo)ki1, go.k, (Image)ki2)).c(b);
    ki1.a(ki1.n(), ki1.o(), ki1.p() - 12, 20);
    int i = cv.a(2, 4);
    ki ki2;
    (ki2 = ki1).d = i;
    ki1.c(paramInt1 - ki1.p() - 32, paramInt2 - ki1.q() - 32);
    ki1.a(0, cv.a(2, 3));
    this.H.b.a(ki1);
    return ki1;
  }
  
  private static int a(int paramInt, int[] paramArrayOfint) {
    byte b1 = 0;
    for (byte b2 = 0; b2 < paramArrayOfint.length; b2++) {
      if (paramInt == paramArrayOfint[b2]) {
        b1 = b2;
        break;
      } 
    } 
    return b1;
  }
  
  private static byte[][] a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    byte[][] arrayOfByte = new byte[paramInt1][paramInt2];
    for (byte b = 0; b < arrayOfByte.length; b++)
      System.arraycopy(paramArrayOfbyte, b * paramInt2, arrayOfByte[b], 0, paramInt2); 
    return arrayOfByte;
  }
  
  public final void n() {
    try {
      if (!this.O) {
        ct.b("chua init map complete k update");
        return;
      } 
      if (this.Z) {
        this.u.d(go.w);
        this.Z = false;
      } 
      if (this.Y > 0) {
        this.Y--;
        if (this.Y == 0) {
          ag.b().a(this.q, false);
        } else if (this.Y < 0) {
          q();
        } 
      } 
      if (this.N) {
        this.l.i();
        kl kl1;
        if ((kl1 = this.l).j != 4)
          this.l.a(4); 
        return;
      } 
      if (this.l != null) {
        this.m.a(this.l, this.F);
        kl kl1;
        if ((kl1 = this.l).j != 4) {
          if (this.M == null) {
            int i;
            for (i = 0; i < this.L.length; i++) {
              if (this.l.t.b((this.L[i]).d.d, (this.L[i]).d.e, (this.L[i]).d.f, (this.L[i]).d.g)) {
                this.M = this.L[i];
                this.ab = null;
                this.D = this.am.s();
                if (this.M.d.a == 2) {
                  if (!this.M.c()) {
                    om om1;
                    (om1 = this).am.v();
                    kk kk = (kk)this.M;
                    this.am.c(this.B);
                  } 
                  break;
                } 
                this.am.c(this.v);
                break;
              } 
            } 
            if (this.M == null) {
              i = this.H.d.d();
              for (byte b = 0; b < i; b++) {
                if (this.H.d.b(b) instanceof ju) {
                  this.ab = (ka)this.H.d.b(b);
                  if (this.ab.r() == 1 && this.ab.h() == 0 && this.l.t.b(this.ab.n(), this.ab.o(), this.ab.p(), this.ab.q())) {
                    this.D = this.am.s();
                    this.am.c(this.A);
                    break;
                  } 
                } 
                if (b == i - 1) {
                  this.ab = null;
                  this.am.c(this.C);
                } 
              } 
            } 
          } else {
            if (this.M.d.a == 0 && ((kl1 = this.l).j == 1 || (kl1 = this.l).j == 7))
              switch (this.M.b()) {
                case 0:
                  if (!this.o && (this.l.k & 0x4) != 0 && this.l.t.a <= this.M.n() + (this.M.p() >> 1)) {
                    e(false);
                    this.u.b(go.w, this.M.d.c);
                    a.s().a(null, null);
                    this.m.a();
                    this.o = true;
                    return;
                  } 
                  break;
                default:
                  if (!this.o && (this.l.k & 0x8) != 0 && this.l.t.a + this.l.t.c >= this.M.n() + (this.M.p() >> 1)) {
                    this.u.b(go.w, this.M.d.c);
                    a.s().a(null, null);
                    this.m.a();
                    this.o = true;
                    return;
                  } 
                  break;
              }  
            if (!this.l.t.b(this.M.d.d, this.M.d.e, this.M.d.f, this.M.d.g)) {
              if (this.M.d.a == 2) {
                om om1;
                (om1 = this).am.w();
              } 
              this.M = null;
              this.am.c(this.D);
              this.D = null;
            } 
          } 
        } else if (this.l.m()) {
          int i = this.I.d();
          for (byte b = 0; b < i; b++) {
            ki ki1;
            ki ki2;
            if ((ki1 = (ki)this.I.b(b)).m() && this.l.u.a((ki2 = ki1).e)) {
              a(ki1, true);
              this.U = b;
              if (ki1.e.a < this.l.t.a) {
                ki1.b(3);
                this.l.b(4);
                break;
              } 
              ki1.b(2);
              this.l.b(8);
              break;
            } 
          } 
        } 
        this.F.a(this.l.t);
      } 
      try {
        byte b = 0;
        int j = this.I.d();
        ki ki;
        while (b < j && (ki = (ki)this.I.b(b)) != null) {
          if (this.U != b) {
            this.J.a(ki, this.l, this.K, this.F, this.aq);
            if (ki.a() == 1 && !a.s().c(191919)) {
              this.U = b;
              a(ki, false);
              this.am.c(null);
            } 
          } 
          if (this.N && this.U == b) {
            ki.i();
            if (ki.a() != 1)
              ki.a(1); 
          } 
          b++;
        } 
        j = 0;
        int i = this.H.d.d();
        while (j < i) {
          ka ka1;
          if ((ka1 = (ka)this.H.d.b(j)).r() == 1) {
            this.aa.a(ka1, this.F);
            if (!ka1.m()) {
              if (this.am.s().equals(this.A))
                this.am.c(this.C); 
              this.H.d.a(j);
              i--;
              j--;
            } 
          } 
          j++;
        } 
      } catch (Exception exception) {
        ct.a("[Map] Loi update monster");
      } 
      if (this.Q != null)
        this.Q.i(); 
      if (this.F != null)
        this.F.i(); 
      if (this.ae) {
        this.ae = false;
        this.X.u();
      } 
      if (this.ap != null)
        for (byte b = 0; b < this.ap.length; b++)
          this.ap[b].i();  
    } catch (OutOfMemoryError outOfMemoryError) {
      a.s().j(1);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      if (this.ao > 9) {
        this.ao = 0;
        a.s().j(0);
      } 
      this.ao = (byte)(this.ao + 1);
      ct.a("Null pointer map " + this.ao);
      return;
    } 
    this.ao = 0;
  }
  
  protected final void a() {
    if (this.aj == null || this.ai == null)
      return; 
    try {
      this.ai = (gj)this.an.a();
      int i = this.aj.n() + this.aj.p();
      this.ai.f(i + 5);
      this.ai.g(this.aj.o() - this.ai.q() - 5);
      this.ai.a(10);
      this.ai.a(new k(this.ai.n() + 9, this.ai.o() + 9, this.ai.p() - 20, this.ai.q() - 20));
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final void q() {
    this.Y = 0;
    ag.b().a(false);
    this.l.a(0);
    e(false);
    ki ki;
    if (this.U >= 0 && (ki = (ki)this.I.b(this.U)) != null)
      ki.a(0); 
    this.m.a();
    this.l.x = 30;
    this.N = false;
    this.U = -1;
  }
  
  private void a(ki paramki, boolean paramBoolean) {
    y();
    ct.b("fightingMonster");
    try {
      if (!paramBoolean)
        ag.a().b(10); 
      ag.b().l();
      this.N = true;
      this.Y = 10;
      r();
      e(false);
      E = new cu(paramki.e.a + paramki.e.c / 2, paramki.e.b + paramki.e.d);
      this.q = new ha(this.l.e.u(), paramki.b(), false, paramBoolean, 99030, this.X);
      this.q.a(this.am);
      ks.a().a(paramki.f.a, paramBoolean);
      return;
    } catch (Throwable throwable) {
      ct.b("fightering monster err");
      throwable.printStackTrace();
      return;
    } 
  }
  
  public final void r() {
    if (this.l != null) {
      i = new cu(this.l.t.a, this.l.t.b);
      j = (this.l.j == 5) ? 6 : (byte)this.l.j;
      k = this.l.k;
    } 
  }
  
  public final void s() {
    if (!this.O)
      return; 
    try {
      for (byte b = 0; b < this.H.d.d(); b++) {
        if (this.H.d.b(b) instanceof ka)
          this.H.d.b(b); 
      } 
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } 
  }
  
  public final void d(int paramInt1, int paramInt2) {
    om om1;
    kk kk;
    bs bs;
    switch (paramInt2) {
      case 105:
        if (!(om1 = this).N && om1.X != null && om1.am != null) {
          bs = new bs();
          br[] arrayOfBr;
          if ((arrayOfBr = oa.a(om1.am)) != null) {
            bs.a(arrayOfBr);
            int i = (bs.e() > bs.f()) ? bs.e() : bs.f();
            bs.a_(-i, om1.f() - bs.f() + i);
            bs.d(0, v.u - ba.a - bs.f());
            bs.a(om1);
            bs.c(om1.C);
            bs.a(om1.y);
            bs.b(om1.z);
            om1.m.a();
            if (om1.an.a() != null && om1.an.a() instanceof gj) {
              om1.an.a().b(false);
              om1.an.i();
              gj gj1 = (gj)om1.an.a();
              br[] arrayOfBr1 = bs.s();
              br br1 = null;
              if (gj1 != null) {
                int j;
                for (j = 0; j < arrayOfBr1.length; j++) {
                  if (arrayOfBr1[j].b().equals(gj1.b()))
                    br1 = arrayOfBr1[j]; 
                } 
                if (br1 != null) {
                  j = br1.n() + br1.p();
                  gj1.f(j + 5);
                  gj1.g(br1.o());
                  gj1.a(gj1.n() + 10);
                  gj1.a(new k(gj1.n() + 9, gj1.o() + 9, gj1.p() - 20, gj1.q() - 20));
                  gj1.c(true);
                  om1.aj = br1;
                  om1.ai = gj1;
                  gj1.c();
                } 
              } 
            } 
            om1.am.a(bs);
          } 
          return;
        } 
        return;
      case 101:
        a.s().a(null, null);
        i = null;
        e(false);
        this.m.a();
        this.l.a(0);
        this.u.b(go.w, this.M.d.c);
        return;
      case 107:
        this.am.c(this.C);
        this.m.a();
        this.af = this.M.a();
        this.ak = this.M.d.c;
        this.u.b(go.w, this.ak);
        a.s().a(null, null);
        return;
      case 109:
        this.m.a();
        ((fc)this.am.l()).a();
        return;
      case 106:
        y();
        return;
      case 113:
        this.am.l.f(95);
        return;
      case 110:
        if (go.b()) {
          a.a(this, "Hành Trang", 114, "Đóng", 115);
          return;
        } 
        a.a(this.ab.v, this, "Nhặt", 2000, "Bỏ qua", 1000);
        return;
      case 2000:
        (om1 = this).ag.a(om1.ab.v);
        om1.u.b(new String[] { om1.ab.v.c });
        ag.b().a(241212, false);
        om1.H.d.b(om1.ab);
        om1.ab = null;
        om1.am.c(om1.C);
        return;
      case 1000:
        ag.b().a(241212, false);
        this.H.d.b(this.ab);
        this.ab = null;
        this.am.c(this.C);
        return;
      case 112:
        if (ag.b().c(241212)) {
          ll ll;
          hg hg;
          go.a(ll = (hg = (hg)ag.b().d(241212)).k);
          this.u.b(new String[] { ll.c });
          ag.b().a(241212, false);
        } 
        this.am.c(this.C);
        return;
      case 114:
        ag.b().a(241209, false);
        this.X.v();
        return;
      case 115:
        ag.b().a(241209, false);
        return;
      case 118:
        kk = (kk)this.M;
        if (this.M != null)
          kk = kk; 
        return;
      case -999:
        ag.b().a(false);
        return;
    } 
    ks.a().a(bs - 99999990, go.w, this.ak);
    a.s().a(null, null);
    ag.b().a(-9898989, false);
  }
  
  public final boolean f(int paramInt) {
    if (!this.O)
      return false; 
    if (this.am.l != null) {
      d(0, 106);
      return true;
    } 
    if (this.N)
      return true; 
    if (v.ai) {
      char c;
      if ((c = ae.a(paramInt)) == 'w' || c == 'W') {
        paramInt = 99;
      } else if (c == 'a' || c == 'A') {
        paramInt = 97;
      } else if (c == 'd' || c == 'D') {
        paramInt = 96;
      } else if (c == 's' || c == 'x' || c == 'X' || c == 'S') {
        paramInt = 98;
      } 
    } 
    if (this.M != null && this.M.d.a == 0)
      switch (paramInt) {
        case 97:
          if (this.M.b() == 0 && !this.o && this.l.t.a <= this.M.n() + this.M.p() / 2) {
            i = null;
            e(false);
            this.u.b(go.w, this.M.d.c);
            a.s().a(null, null);
            this.o = true;
          } 
          break;
        case 96:
          if (this.M.b() == 1 && !this.o && this.l.t.a + this.l.t.c + 10 >= this.M.n() + this.M.p() / 2) {
            i = null;
            e(false);
            this.u.b(go.w, this.M.d.c);
            a.s().a(null, null);
            this.o = true;
          } 
          break;
      }  
    if (this.F == null)
      return true; 
    if (this.l != null)
      this.m.a(paramInt, this.l); 
    return true;
  }
  
  public final boolean g(int paramInt) {
    if (!this.O)
      return false; 
    if (v.ai) {
      char c;
      if ((c = ae.a(paramInt)) == 'w' || c == 'W') {
        paramInt = 99;
      } else if (c == 'a' || c == 'A') {
        paramInt = 97;
      } else if (c == 'd' || c == 'D') {
        paramInt = 96;
      } else if (c == 's' || c == 'x' || c == 'X' || c == 'S') {
        paramInt = 98;
      } 
    } 
    if (this.l != null)
      this.m.a(paramInt); 
    return true;
  }
  
  public final void a(lh paramlh, boolean paramBoolean) {
    this.V.a(paramlh);
    if (paramBoolean) {
      this.l.b(paramlh);
      this.l.a(paramlh);
    } 
  }
  
  public final void e(boolean paramBoolean) {
    this.l.b(paramBoolean);
  }
  
  public final boolean c(int paramInt1, int paramInt2) {
    if (!this.O)
      return false; 
    paramInt1 -= this.F.n();
    paramInt2 -= this.F.o();
    if ((new k(this.l.n() - v.t / 2, this.l.o(), v.t / 2, this.l.q())).a(paramInt1, paramInt2)) {
      f(97);
      return true;
    } 
    if ((new k(this.l.n() + this.l.p(), this.l.o(), v.t / 2, this.l.p())).a(paramInt1, paramInt2)) {
      f(96);
      return true;
    } 
    if ((new k(this.l.n(), this.l.o() - v.u / 2, this.l.p(), v.u / 2)).a(paramInt1, paramInt2)) {
      f(99);
      return true;
    } 
    if ((new k(this.l.n(), this.l.o() + this.l.q(), this.l.p(), v.u / 2)).a(paramInt1, paramInt2)) {
      f(98);
      return true;
    } 
    if ((new k(this.l.n() - v.t / 2, this.l.o() - v.u / 2, v.t / 2, v.u / 2)).a(paramInt1, paramInt2)) {
      f(99);
      f(97);
      return true;
    } 
    if ((new k(this.l.n() + this.l.p(), this.l.o() - v.u / 2, v.t / 2, v.u / 2)).a(paramInt1, paramInt2)) {
      f(99);
      f(96);
      return true;
    } 
    if ((new k(this.l.n(), this.l.o(), this.l.p(), this.l.q())).a(paramInt1, paramInt2))
      f(95); 
    return false;
  }
  
  public final boolean f(int paramInt1, int paramInt2) {
    if (!this.O)
      return false; 
    paramInt1 -= this.F.n();
    paramInt2 -= this.F.o();
    if (this.l.j == 7) {
      g(97);
      g(96);
      g(99);
      g(98);
    } 
    if ((new k(this.l.n() - v.t / 2, this.l.o(), v.t / 2, this.l.q())).a(paramInt1, paramInt2)) {
      g(97);
      return true;
    } 
    if ((new k(this.l.n() + this.l.p(), this.l.o(), v.t / 2, this.l.p())).a(paramInt1, paramInt2)) {
      g(96);
      return true;
    } 
    if ((new k(this.l.n(), this.l.o() - v.u / 2, this.l.p(), v.u / 2)).a(paramInt1, paramInt2)) {
      g(99);
      return true;
    } 
    if ((new k(this.l.n(), this.l.o() + this.l.q(), this.l.p(), v.u / 2)).a(paramInt1, paramInt2)) {
      g(98);
      return true;
    } 
    if ((new k(this.l.n() - v.t / 2, this.l.o() - v.u / 2, v.t / 2, v.u / 2)).a(paramInt1, paramInt2)) {
      g(99);
      g(97);
      return true;
    } 
    if ((new k(this.l.n() + this.l.p(), this.l.o() - v.u / 2, v.t / 2, v.u / 2)).a(paramInt1, paramInt2)) {
      g(99);
      g(96);
      return true;
    } 
    return (new k(this.l.n(), this.l.o(), this.l.p(), this.l.q())).a(paramInt1, paramInt2) ? g(95) : false;
  }
  
  public final void a(int paramInt1, int paramInt2, Object paramObject) {
    if (paramObject == null)
      return; 
    br br1 = (br)paramObject;
    if (this.ai != null && br1.b().equals(this.ai.b()))
      this.ai.b(false); 
    this.X.a(paramInt2, br1);
    y();
  }
  
  private void y() {
    this.am.t();
    this.aj = null;
    this.ai = null;
    if (this.an.a() != null && this.an.a() instanceof gj) {
      this.an.i();
      gj gj1;
      if ((gj1 = (gj)this.an.a()) != null && gj1.d()) {
        gj1.b(false);
        this.an.i();
        gj1 = (gj)this.an.a();
      } 
      if (gj1 != null) {
        gj1.d(true);
        gj1.g(d() + f() - gj1.q() - 30);
        gj1.f(c() + 5);
        gj1.a(10);
        gj1.a(new k(gj1.n() + 9, gj1.o() + 9, gj1.p() - 20, gj1.q() - 20));
        gj1.c(true);
      } 
    } 
    al al;
    if ((al = ag.b().e()) != null && al.h() == 241203)
      (al = al).j(true); 
  }
  
  private Image g(int paramInt1, int paramInt2) {
    byte[] arrayOfByte = oa.b[a(paramInt1, oa.c.m)];
    if (paramInt2 != 0) {
      boolean bool = true;
      byte b;
      for (b = 0; b < this.ad.length; b++) {
        if (this.ad[b] == 0) {
          this.ad[b] = paramInt1;
          break;
        } 
        if (this.ad[b] == paramInt1) {
          bool = false;
          break;
        } 
      } 
      if (b == this.ad.length) {
        int[] arrayOfInt = new int[b + 10];
        System.arraycopy(this.ad, 0, arrayOfInt, 0, b);
        this.ad = arrayOfInt;
      } 
      if (bool)
        h.b(arrayOfByte, paramInt2); 
    } 
    return f.a(arrayOfByte);
  }
  
  public final void t() {
    boolean bool = true;
    if (gr.m && go.k.G < 3) {
      gr.m = false;
      try {
        gj gj2;
        int i = bx.c.a() * 3 + 20;
        gj gj1;
        (gj1 = new gj("Chào mừng đến với sứ quân online! Hãy kiểm tra nhiệm vụ. Chọn Menu > Nhiệm vụ", c() + 15, d() + f() - 30, i)).f(c() + 5);
        gj1.a(10);
        gj1.a(new k(gj1.n() + 9, gj1.o() + 9, gj1.p() - 20, gj1.q() - 20));
        gj1.c(true);
        this.an.a(gj1);
        if (e() > 240) {
          gj2 = new gj("Tốt lắm! Hãy chọn Nhiệm vụ", c() + 15, d() + f() - 30, i);
        } else {
          gj2 = new gj("Tốt lắm! Hãy chọn Nhiệm vụ", c() + 15, d() + f() - 30, e() - 80, i, false);
        } 
        gj2.a(new String[] { "Nhiệm Vụ", "Nhiệm Vụ" });
        gj2.f(c() + 5);
        gj2.a(10);
        gj2.a(new k(gj2.n() + 9, gj2.o() + 9, gj2.p() - 20, gj2.q() - 20));
        gj2.c(true);
        gj1.a(gj2);
        this.an.a(gj2);
        bool = false;
      } catch (Exception exception2) {
        Exception exception1;
        (exception1 = null).printStackTrace();
      } 
    } 
    if (gr.n && go.k.G <= 6) {
      int[] arrayOfInt = new int[9];
      try {
        int i;
        for (i = 0; i < go.k.E.length; i++) {
          lv lv;
          int j = (lv = go.k.E[i]).a % 100;
          arrayOfInt[j] = (go.k.E[i]).f;
        } 
        for (byte b = 0; b < go.r.length; b++) {
          if ((i = arrayOfInt[b]) == 2)
            i = 1; 
          if (i < (go.r[b]).c.length && ((go.r[b]).c[i]).b <= go.k.G && go.k.L >= ((go.r[b]).c[i]).c) {
            gj gj1;
            gr.n = false;
            int j = bx.c.a() * 3 + 20;
            gj gj2;
            (gj2 = new gj("Bạn vừa lên cấp, có thể tăng điểm tuyệt chiêu. Bấm menu trái > Nhân vật > Tuyệt chiêu", c() + 15, d() + f() - 30, j)).f(c() + 5);
            gj2.a(10);
            gj2.a(new k(gj2.n() + 9, gj2.o() + 9, gj2.p() - 20, gj2.q() - 20));
            gj2.c(true);
            gj2.d(bool);
            this.an.a(gj2);
            if (e() > 240) {
              gj1 = new gj("Chọn Nhân vật > Tuyệt chiêu", c() + 15, d() + f() - 30, j);
            } else {
              gj1 = new gj("Chọn Nhân vật > Tuyệt chiêu", c() + 15, d() + f() - 30, e() - 80, j, false);
            } 
            gj1.f(c() + 5);
            gj1.a(10);
            gj1.a(new k(gj1.n() + 9, gj1.o() + 9, gj1.p() - 20, gj1.q() - 20));
            gj1.a(new String[] { "Nhân Vật", "Tuyệt Chiêu" });
            gj1.c(true);
            gj2.a(gj1);
            this.an.a(gj1);
            return;
          } 
        } 
        return;
      } catch (Exception exception2) {
        Exception exception1;
        ct.a(exception1 = null);
      } 
    } 
  }
  
  public final void a(String paramString, byte paramByte) {
    if (paramString == null) {
      this.X.u();
      return;
    } 
    try {
      ic ic;
      if (this.M != null) {
        if (this.M.d.b.equals(this.af)) {
          as as;
          (as = new as(this.M.f, 1)).a(new byte[][] { new byte[1] });
          as.c(2);
          ic = new ic(this.M.n(), this.M.o() - 10, this.F.a(), as, paramString, this.M.d.b);
          ag.b().a(ic);
          return;
        } 
        this.af = null;
        return;
      } 
      a.s().q((String)ic);
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } 
  }
  
  public final void u() {
    if (this.N)
      q(); 
  }
  
  public final void v() {
    for (byte b = 0; b < this.L.length; b++) {
      if ((this.L[b]).d.a == 2) {
        kk kk;
        (kk = (kk)this.L[b]).a(false, 0);
        kk.d();
        this.ae = false;
        if (this.l.t.b((this.L[b]).d.d, (this.L[b]).d.e, (this.L[b]).d.f, (this.L[b]).d.g)) {
          this.M = this.L[b];
          this.ab = null;
          if (!this.M.c()) {
            this.am.c(this.B);
            return;
          } 
          break;
        } 
      } 
    } 
  }
  
  public final void a(String[] paramArrayOfString) {
    int i;
    for (i = 0; i < paramArrayOfString.length; i++) {
      for (byte b = 0; b < this.ag.d(); b++) {
        ll ll = (ll)this.ag.b(b);
        if (paramArrayOfString[i].equals(ll.c)) {
          go.a(ll);
          this.ag.a(b);
          break;
        } 
      } 
    } 
    if (gr.o) {
      gj gj1;
      gr.o = false;
      i = bx.c.a() * 3 + 20;
      gj gj2;
      (gj2 = new gj("Bạn vừa có vật phẩm. Hãy bấm phím menu trái > Nhân vật > Rương đồ", c() + 15, d() + f() - 30, i)).f(c() + 5);
      gj2.a(10);
      gj2.a(new k(gj2.n() + 9, gj2.o() + 9, gj2.p() - 20, gj2.q() - 20));
      gj2.c(true);
      this.an.a(gj2);
      if (e() > 240) {
        gj1 = new gj("Tốt lắm! Hãy chọn Nhân vật > Rương đồ", c() + 15, d() + f() - 30, i);
      } else {
        gj1 = new gj("Tốt lắm! Hãy chọn Nhân vật > Rương đồ", c() + 15, d() + f() - 30, e() - 80, i, false);
      } 
      gj1.a(new String[] { "Nhân Vật", "Rương Đồ" });
      gj1.f(c() + 5);
      gj1.a(10);
      gj1.a(new k(gj1.n() + 9, gj1.o() + 9, gj1.p() - 20, gj1.q() - 20));
      gj1.c(true);
      gj2.a(gj1);
      this.an.a(gj1);
    } 
  }
  
  public final void a(int[] paramArrayOfint, String[] paramArrayOfString) {
    he he2;
    (he2 = new he()).b(-9898989);
    he2.a(new ba());
    he2.a(this);
    int j = 10;
    ex[] arrayOfEx = new ex[paramArrayOfint.length];
    int k = 0;
    int m;
    for (m = 0; m < paramArrayOfint.length; m++) {
      int i1;
      if ((i1 = bx.d.a(paramArrayOfString[m]) + 30) > k)
        k = i1; 
      arrayOfEx[m] = new ex(paramArrayOfString[m], paramArrayOfint[m] + 99999990);
      arrayOfEx[m].a(10, j, k, 18);
      j += arrayOfEx[m].f() + 5;
    } 
    he2.a((aq[])arrayOfEx);
    for (m = arrayOfEx.length - 1; m >= 0; m--)
      arrayOfEx[m].d(k); 
    k += 20;
    m = j + 5;
    int n = v.t - k >> 1;
    int i = v.u - m >> 1;
    he2.a(n, i, k, m);
    gb gb = new gb(-999, 3);
    he he1;
    (he1 = he2).b(gb, true);
    if (this.M != null)
      he2.a(he2.a(), this.M.o() + this.F.o() - he2.j(), he2.i(), he2.j()); 
    he2.f(0);
    ag.b().a(he2, false);
  }
  
  public final void w() {
    this.am.a((bf)null);
    this.al = null;
    this.I = null;
    this.q = null;
    this.W = null;
    this.V = null;
    this.aa = null;
    this.ab = null;
    this.K = null;
    this.ag = null;
    this.t = null;
    this.r = null;
    this.s = null;
    if (this.H != null)
      this.H.b(); 
    this.H = null;
    this.G.b();
    this.G = null;
    this.n = null;
    this.l = null;
    this.af = null;
    this.X = null;
    ct.b("Finish Map.destroy()");
  }
  
  public final void a(lt[] paramArrayOflt) {
    if (paramArrayOflt != null) {
      this.ap = new jx[paramArrayOflt.length];
      for (byte b = 0; b < paramArrayOflt.length; b++) {
        int i = (paramArrayOflt[b]).a;
        pa pa;
        Image image = f.a((pa = pa.a()).b(i, false));
        this.ap[b] = new jx(image, 1);
        this.ap[b].a((paramArrayOflt[b]).b);
        if ((paramArrayOflt[b]).a == 200000 && (paramArrayOflt[b]).b > 0L) {
          this.aq = false;
        } else {
          this.aq = true;
        } 
      } 
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\om.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */