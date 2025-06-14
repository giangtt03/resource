import com.mg.sq.a;

public abstract class mq implements bf, bg, kp, mr {
  protected ms a;
  
  protected mt b;
  
  protected mk[] c;
  
  protected int d;
  
  protected a e;
  
  private int z;
  
  private int[] A = new int[21];
  
  private int B;
  
  private int C;
  
  protected boolean f = false;
  
  protected int g = -1;
  
  private boolean D = false;
  
  private boolean E = false;
  
  protected int h = 0;
  
  protected int i = 5;
  
  protected int j = 6;
  
  private int F = 5;
  
  private int G = 6;
  
  private int H;
  
  private int I;
  
  private byte[] J;
  
  private byte[] K;
  
  private byte[] L;
  
  private byte[] M;
  
  private boolean N = false;
  
  private static int[] O = new int[] { -1, -1, 1, 1, 1, -1 };
  
  private static int[] P = new int[] { 0, 1, 1, 1, -1, -1, -1 };
  
  private oq Q;
  
  private long R;
  
  protected boolean k;
  
  protected kr l = new kr(16);
  
  private boolean S = false;
  
  protected int m = 0;
  
  protected int n;
  
  protected int o = -1;
  
  private long T = -1L;
  
  protected long p;
  
  protected boolean q;
  
  protected int r;
  
  private boolean U;
  
  private boolean V = false;
  
  protected boolean s;
  
  private String[][] W = new String[][] { { "Ngươi chán sống rồi!!", "Hừ, ngươi to gan lắm!", "Ngươi chưa đủ sức!", "Ta sẽ hạ ngươi trong vòng 3 bước", "Muốn chết? Thích thì chiều!" }, { "Xem đây!!!", "Tiếp chiêu!!!", "Chết nè!!!" } };
  
  boolean t = false;
  
  public boolean u;
  
  private a X = new a();
  
  protected nq v;
  
  nq w = null;
  
  public mq(ms paramms, mt parammt, oq paramoq) {
    this.Q = paramoq;
    this.a = paramms;
    this.b = parammt;
    this.a.p = new int[64];
    this.a.i = new mw[64];
    for (byte b = 0; b < this.a.i.length; b++)
      this.a.i[b] = new mw(); 
    this.c = new mk[2];
    this.c[0] = new mn(this, 0);
    this.c[1] = new mn(this, 1);
    ks.a().a(this);
    d(0);
    if (this.a.a(1, 0).b()) {
      this.k = true;
      parammt.a(this.W[0][cv.a((this.W[0]).length)], 50);
    } 
    f(oq.p);
    this.m = 0;
    this.R = System.currentTimeMillis();
  }
  
  public boolean f() {
    return false;
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, int paramInt5) {
    mw mw;
    (mw = this.a.i[this.a.j]).a = this.a.b(paramInt1, paramInt2);
    mw.h = paramInt2;
    mw.i = paramInt1;
    mw.b = paramInt1;
    mw.c = paramInt2 - (paramInt3 >> 16 & 0xFF);
    mw.d = paramInt3 & 0xFF;
    mw.e = paramInt1 - (paramInt4 >> 16 & 0xFF);
    mw.f = paramInt2;
    mw.g = paramInt4 & 0xFF;
    mw.k = paramBoolean;
    mw.j = paramInt5;
    this.a.j++;
    if (this.k && (mw.a.e & 0x1) != 0 && cv.a(3) == 1 && this.h == 1)
      this.b.a(this.W[1][cv.a((this.W[1]).length)], 50); 
  }
  
  private void a(String paramString, nl[] paramArrayOfnl) {
    ct.a("[SQControllerManager]convertAttributeBufferToAttributeCharacter owner" + paramString);
    if (paramArrayOfnl == null)
      return; 
    lg[][] arrayOfLg;
    boolean[][] arrayOfBoolean = new boolean[(arrayOfLg = this.a.a()).length][];
    byte b1 = 0;
    byte b2 = 0;
    for (byte b3 = 0; b3 < arrayOfLg.length; b3++) {
      arrayOfBoolean[b3] = new boolean[(arrayOfLg[b3]).length];
      for (byte b = 0; b < (arrayOfLg[b3]).length; b++) {
        if (arrayOfLg[b3][b].j().equals(paramString)) {
          b1 = b3;
          b2 = b;
        } 
        arrayOfBoolean[b3][b] = arrayOfLg[b3][b].p();
      } 
    } 
    for (byte b4 = 0; b4 < paramArrayOfnl.length; b4++) {
      for (byte b = 0; b < arrayOfLg.length; b++) {
        for (byte b5 = 0; b5 < (arrayOfLg[b]).length; b5++) {
          if ((paramArrayOfnl[b4]).a.equals(arrayOfLg[b][b5].j())) {
            lg lg = arrayOfLg[b][b5];
            this.b.b.a((paramArrayOfnl[b4]).b, (paramArrayOfnl[b4]).c, (paramArrayOfnl[b4]).d, (paramArrayOfnl[b4]).a, (paramArrayOfnl[b4]).f);
            if ((paramArrayOfnl[b4]).b >= 0) {
              int i = (paramArrayOfnl[b4]).b - lg.m();
              ct.a(" convertAttributeBufferToAttributeCharacter   " + i);
              if (i < 0 && (paramArrayOfnl[Math.abs(b4 - 1)]).e > 0)
                this.b.a(lg.j(), b, -(paramArrayOfnl[Math.abs(b4 - 1)]).e, arrayOfBoolean[b1][b2]); 
              lg.g((paramArrayOfnl[b4]).b);
            } 
            if ((paramArrayOfnl[b4]).c >= 0)
              lg.h((paramArrayOfnl[b4]).c); 
            if ((paramArrayOfnl[b4]).d >= 0)
              lg.j((paramArrayOfnl[b4]).d); 
          } 
        } 
      } 
    } 
  }
  
  public void b() {
    // Byte code:
    //   0: aload_0
    //   1: getfield z : I
    //   4: ifle -> 18
    //   7: aload_0
    //   8: dup
    //   9: getfield z : I
    //   12: iconst_1
    //   13: isub
    //   14: putfield z : I
    //   17: return
    //   18: aload_0
    //   19: getfield d : I
    //   22: tableswitch default -> 942, 0 -> 532, 1 -> 624, 2 -> 909, 3 -> 925, 4 -> 931, 5 -> 937, 6 -> 942, 7 -> 565, 8 -> 916, 9 -> 139, 10 -> 559, 11 -> 537, 12 -> 942, 13 -> 942, 14 -> 942, 15 -> 212, 16 -> 120, 17 -> 942, 18 -> 942, 19 -> 132, 20 -> 125
    //   120: aload_0
    //   121: invokevirtual c : ()V
    //   124: return
    //   125: aload_0
    //   126: bipush #10
    //   128: invokevirtual d : (I)V
    //   131: return
    //   132: aload_0
    //   133: bipush #15
    //   135: invokevirtual d : (I)V
    //   138: return
    //   139: aload_0
    //   140: aload_0
    //   141: getfield b : Lmt;
    //   144: aload_0
    //   145: getfield g : I
    //   148: invokevirtual a : (I)I
    //   151: putfield z : I
    //   154: aload_0
    //   155: getfield g : I
    //   158: tableswitch default -> 205, 0 -> 194, 1 -> 180
    //   180: aload_0
    //   181: getfield b : Lmt;
    //   184: getfield b : Lmx;
    //   187: iconst_1
    //   188: invokevirtual l : (I)V
    //   191: goto -> 205
    //   194: aload_0
    //   195: getfield b : Lmt;
    //   198: getfield b : Lmx;
    //   201: iconst_0
    //   202: invokevirtual l : (I)V
    //   205: aload_0
    //   206: bipush #16
    //   208: invokevirtual d : (I)V
    //   211: return
    //   212: aload_0
    //   213: aload_0
    //   214: getfield v : Lnq;
    //   217: astore_2
    //   218: astore_1
    //   219: aload_2
    //   220: ifnull -> 433
    //   223: aload_1
    //   224: aload_2
    //   225: getfield a : Ljava/lang/String;
    //   228: aload_2
    //   229: getfield f : [Lnl;
    //   232: invokespecial a : (Ljava/lang/String;[Lnl;)V
    //   235: aload_1
    //   236: aload_2
    //   237: getfield D : B
    //   240: istore #4
    //   242: astore_3
    //   243: iload #4
    //   245: ifeq -> 286
    //   248: aload_3
    //   249: getfield a : Lms;
    //   252: getfield g : I
    //   255: iload #4
    //   257: iadd
    //   258: dup
    //   259: istore #5
    //   261: ifgt -> 267
    //   264: iconst_1
    //   265: istore #5
    //   267: aload_3
    //   268: getfield b : Lmt;
    //   271: dup
    //   272: astore #6
    //   274: getfield b : Lmx;
    //   277: invokevirtual j : ()V
    //   280: aload_3
    //   281: iload #5
    //   283: invokespecial f : (I)V
    //   286: aload_1
    //   287: aload_2
    //   288: getfield F : B
    //   291: istore #4
    //   293: astore_3
    //   294: getstatic oq.o : B
    //   297: iconst_1
    //   298: if_icmpeq -> 312
    //   301: aload_3
    //   302: dup
    //   303: getfield B : I
    //   306: iload #4
    //   308: iadd
    //   309: putfield B : I
    //   312: aload_1
    //   313: aconst_null
    //   314: putfield v : Lnq;
    //   317: aload_1
    //   318: getfield N : Z
    //   321: ifne -> 428
    //   324: aload_1
    //   325: dup
    //   326: astore_3
    //   327: getfield a : Lms;
    //   330: dup
    //   331: astore #4
    //   333: getfield l : [[Lnj;
    //   336: invokestatic a : ([[Lnj;)J
    //   339: lstore #4
    //   341: invokestatic a : ()Z
    //   344: ifeq -> 379
    //   347: new java/lang/StringBuffer
    //   350: dup
    //   351: ldc 'SQControllerManager.checkSumToSyncDataWithServer()  server='
    //   353: invokespecial <init> : (Ljava/lang/String;)V
    //   356: aload_3
    //   357: getfield T : J
    //   360: invokevirtual append : (J)Ljava/lang/StringBuffer;
    //   363: ldc ', client='
    //   365: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   368: lload #4
    //   370: invokevirtual append : (J)Ljava/lang/StringBuffer;
    //   373: invokevirtual toString : ()Ljava/lang/String;
    //   376: invokestatic a : (Ljava/lang/String;)V
    //   379: aload_3
    //   380: getfield T : J
    //   383: ldc2_w -1
    //   386: lcmp
    //   387: ifle -> 424
    //   390: aload_3
    //   391: getfield T : J
    //   394: lload #4
    //   396: lcmp
    //   397: ifeq -> 424
    //   400: aload_3
    //   401: ldc2_w -1
    //   404: putfield T : J
    //   407: aload_3
    //   408: getfield l : Lkr;
    //   411: invokevirtual c : ()V
    //   414: invokestatic a : ()Lks;
    //   417: invokevirtual t : ()V
    //   420: iconst_1
    //   421: goto -> 425
    //   424: iconst_0
    //   425: ifne -> 433
    //   428: aload_1
    //   429: aload_2
    //   430: invokespecial e : (Lnq;)V
    //   433: aload_0
    //   434: getfield D : Z
    //   437: ifeq -> 488
    //   440: aload_0
    //   441: iconst_0
    //   442: putfield D : Z
    //   445: aload_0
    //   446: getfield a : Lms;
    //   449: invokevirtual e : ()Z
    //   452: pop
    //   453: aload_0
    //   454: getfield a : Lms;
    //   457: invokevirtual f : ()Z
    //   460: ifeq -> 527
    //   463: aload_0
    //   464: getfield N : Z
    //   467: ifeq -> 479
    //   470: aload_0
    //   471: bipush #20
    //   473: invokevirtual d : (I)V
    //   476: goto -> 527
    //   479: aload_0
    //   480: bipush #10
    //   482: invokevirtual d : (I)V
    //   485: goto -> 527
    //   488: aload_0
    //   489: getfield S : Z
    //   492: ifeq -> 527
    //   495: aload_0
    //   496: getfield a : Lms;
    //   499: invokevirtual f : ()Z
    //   502: ifeq -> 527
    //   505: aload_0
    //   506: getfield N : Z
    //   509: ifeq -> 521
    //   512: aload_0
    //   513: bipush #20
    //   515: invokevirtual d : (I)V
    //   518: goto -> 527
    //   521: aload_0
    //   522: bipush #10
    //   524: invokevirtual d : (I)V
    //   527: aload_0
    //   528: invokespecial t : ()V
    //   531: return
    //   532: aload_0
    //   533: invokevirtual e : ()V
    //   536: return
    //   537: aload_0
    //   538: getfield a : Lms;
    //   541: getfield h : I
    //   544: ifle -> 553
    //   547: aload_0
    //   548: iconst_5
    //   549: invokevirtual d : (I)V
    //   552: return
    //   553: aload_0
    //   554: iconst_3
    //   555: invokevirtual d : (I)V
    //   558: return
    //   559: aload_0
    //   560: iconst_0
    //   561: invokevirtual d : (I)V
    //   564: return
    //   565: aload_0
    //   566: bipush #8
    //   568: invokevirtual d : (I)V
    //   571: getstatic oq.o : B
    //   574: iconst_1
    //   575: if_icmpne -> 585
    //   578: aload_0
    //   579: getfield V : Z
    //   582: ifne -> 942
    //   585: aload_0
    //   586: iconst_1
    //   587: putfield V : Z
    //   590: aload_0
    //   591: getfield h : I
    //   594: ifeq -> 604
    //   597: aload_0
    //   598: getfield k : Z
    //   601: ifne -> 942
    //   604: aload_0
    //   605: getfield b : Lmt;
    //   608: aload_0
    //   609: getfield h : I
    //   612: aload_0
    //   613: getfield i : I
    //   616: aload_0
    //   617: getfield j : I
    //   620: invokevirtual b : (III)V
    //   623: return
    //   624: aload_0
    //   625: invokespecial t : ()V
    //   628: aload_0
    //   629: getfield b : Lmt;
    //   632: dup
    //   633: astore_1
    //   634: getfield f : Llz;
    //   637: invokevirtual m : ()Z
    //   640: ifne -> 942
    //   643: aload_0
    //   644: getfield d : I
    //   647: iconst_1
    //   648: if_icmpne -> 942
    //   651: aload_0
    //   652: dup
    //   653: astore_1
    //   654: astore_2
    //   655: ldc 'getAreaScoreFromSwapNode'
    //   657: invokestatic a : (Ljava/lang/String;)V
    //   660: aload_2
    //   661: getfield a : Lms;
    //   664: iconst_0
    //   665: putfield j : I
    //   668: aload_2
    //   669: getfield a : Lms;
    //   672: getfield k : Lmy;
    //   675: getfield a : I
    //   678: istore #7
    //   680: aload_2
    //   681: getfield a : Lms;
    //   684: getfield k : Lmy;
    //   687: getfield b : I
    //   690: istore #8
    //   692: aload_2
    //   693: getfield a : Lms;
    //   696: getfield k : Lmy;
    //   699: getfield e : [I
    //   702: iconst_0
    //   703: iaload
    //   704: dup
    //   705: istore_3
    //   706: sipush #255
    //   709: iand
    //   710: iconst_3
    //   711: if_icmplt -> 718
    //   714: iconst_1
    //   715: goto -> 719
    //   718: iconst_0
    //   719: istore #5
    //   721: aload_2
    //   722: getfield a : Lms;
    //   725: getfield k : Lmy;
    //   728: getfield e : [I
    //   731: iconst_1
    //   732: iaload
    //   733: dup
    //   734: istore #4
    //   736: sipush #255
    //   739: iand
    //   740: iconst_3
    //   741: if_icmplt -> 748
    //   744: iconst_1
    //   745: goto -> 749
    //   748: iconst_0
    //   749: istore #6
    //   751: iload #5
    //   753: ifne -> 761
    //   756: iload #6
    //   758: ifeq -> 774
    //   761: aload_2
    //   762: iload #7
    //   764: iload #8
    //   766: iload_3
    //   767: iload #4
    //   769: iconst_1
    //   770: iconst_0
    //   771: invokespecial a : (IIIIZI)V
    //   774: aload_2
    //   775: getfield a : Lms;
    //   778: getfield k : Lmy;
    //   781: getfield c : I
    //   784: istore #7
    //   786: aload_2
    //   787: getfield a : Lms;
    //   790: getfield k : Lmy;
    //   793: getfield d : I
    //   796: istore #8
    //   798: aload_2
    //   799: getfield a : Lms;
    //   802: getfield k : Lmy;
    //   805: getfield e : [I
    //   808: iconst_2
    //   809: iaload
    //   810: dup
    //   811: istore_3
    //   812: sipush #255
    //   815: iand
    //   816: iconst_3
    //   817: if_icmplt -> 824
    //   820: iconst_1
    //   821: goto -> 825
    //   824: iconst_0
    //   825: istore #5
    //   827: aload_2
    //   828: getfield a : Lms;
    //   831: getfield k : Lmy;
    //   834: getfield e : [I
    //   837: iconst_3
    //   838: iaload
    //   839: dup
    //   840: istore #4
    //   842: sipush #255
    //   845: iand
    //   846: iconst_3
    //   847: if_icmplt -> 854
    //   850: iconst_1
    //   851: goto -> 855
    //   854: iconst_0
    //   855: istore #6
    //   857: iload #5
    //   859: ifne -> 867
    //   862: iload #6
    //   864: ifeq -> 880
    //   867: aload_2
    //   868: iload #7
    //   870: iload #8
    //   872: iload_3
    //   873: iload #4
    //   875: iconst_1
    //   876: iconst_0
    //   877: invokespecial a : (IIIIZI)V
    //   880: aload_1
    //   881: getfield a : Lms;
    //   884: getfield j : I
    //   887: ifle -> 898
    //   890: aload_1
    //   891: iconst_3
    //   892: invokevirtual d : (I)V
    //   895: goto -> 942
    //   898: aload_1
    //   899: iconst_0
    //   900: putfield U : Z
    //   903: aload_1
    //   904: iconst_2
    //   905: invokevirtual d : (I)V
    //   908: return
    //   909: aload_0
    //   910: bipush #15
    //   912: invokevirtual d : (I)V
    //   915: return
    //   916: aload_0
    //   917: invokevirtual d : ()V
    //   920: aload_0
    //   921: invokespecial t : ()V
    //   924: return
    //   925: aload_0
    //   926: iconst_4
    //   927: invokevirtual d : (I)V
    //   930: return
    //   931: aload_0
    //   932: iconst_5
    //   933: invokevirtual d : (I)V
    //   936: return
    //   937: aload_0
    //   938: iconst_3
    //   939: invokevirtual d : (I)V
    //   942: return
  }
  
  protected abstract void c();
  
  protected abstract void d();
  
  protected abstract void e();
  
  protected final void a(nq paramnq, boolean paramBoolean) {
    ms ms1;
    boolean bool;
    switch (paramnq.C) {
      case 2:
        this.a.a(false);
        bool = false;
        (ms1 = this.a).e = bool;
        bool = true;
        (ms1 = this.a).a = bool;
        bool = false;
        (ms1 = this.a).f = bool;
        break;
      case 1:
        this.a.a(true);
        bool = false;
        (ms1 = this.a).e = bool;
        bool = false;
        (ms1 = this.a).a = bool;
        bool = false;
        (ms1 = this.a).f = bool;
        break;
      case 3:
        this.a.a(false);
        bool = true;
        (ms1 = this.a).e = bool;
        bool = false;
        (ms1 = this.a).a = bool;
        bool = false;
        (ms1 = this.a).f = bool;
        break;
      case 4:
        this.a.a(false);
        bool = false;
        (ms1 = this.a).e = bool;
        bool = false;
        (ms1 = this.a).a = bool;
        bool = true;
        (ms1 = this.a).f = bool;
        break;
      default:
        this.a.a(false);
        bool = false;
        (ms1 = this.a).e = bool;
        bool = false;
        (ms1 = this.a).a = bool;
        bool = false;
        (ms1 = this.a).f = bool;
        break;
    } 
    if (paramBoolean) {
      lg lg = this.a.a(a(paramnq.a), 0);
      this.a.d = lg.p();
    } 
  }
  
  protected final void d(int paramInt) {
    while (true) {
      int i;
      ms ms1;
      byte b;
      mt mt1;
      mq mq1;
      nj[][] arrayOfNj;
      int j;
      if (ct.a())
        ct.a("SQControllerManager.changeState(" + paramInt + "): keepTimerNextTurn=" + this.q); 
      this.b.f();
      if (oq.o != 1)
        this.b.g(); 
      if (paramInt != 1 && paramInt != 2 && paramInt != 7 && paramInt != 8) {
        if (!this.q) {
          mt mt2;
          (mt2 = this.b).e.b();
        } 
        this.q = false;
      } 
      switch (paramInt) {
        case 20:
          this.z = 20;
          this.N = false;
          this.b.j();
          break;
        case 19:
          this.z = 15;
          break;
        case 15:
          this.b.a(true);
          this.b.f();
          if (oq.o != 1)
            this.b.g(); 
          ag.b().e(241205);
          break;
        case 16:
          this.z = 15;
          break;
        case 9:
          this.z = 30;
          this.b.a(true);
          break;
        case 0:
          this.b.a(true);
          this.b.i();
          this.z = 26;
          break;
        case 10:
          this.b.a(true);
          this.z = this.b.h();
          break;
        case 7:
          this.s = true;
          this.a.b(false);
          i = this.h;
          if (this.E) {
            this.h = 0;
          } else {
            this.h = 1;
          } 
          if (this.B <= 0) {
            this.B = 0;
          } else {
            if (this.B > 0 || this.C > 0)
              this.b.a(this.h, this.B, 6, 6); 
            this.C = this.B;
            this.B--;
          } 
          for (b = 0; b < 2; b++) {
            lg lg;
            boolean bool1 = (lg = this.a.a(b, 0)).e();
            boolean bool2 = lg.g();
            boolean bool3 = lg.h();
            boolean bool4 = lg.i();
            boolean bool5 = lg.f();
            lg.s();
            if (bool1 && !lg.e())
              this.b.a(b, 1, true); 
            if (bool2 && !lg.g())
              this.b.a(b, 0, true); 
            if (bool3 && !lg.h())
              this.b.a(b, 2, true); 
            if (bool4 && !lg.i())
              this.b.a(b, 1, false); 
            if (bool5 && !lg.f())
              this.b.a(b, 1, false); 
            this.b.b(b);
          } 
          for (b = 0; b < this.A.length; b++)
            this.A[b] = 0; 
          j = this.h;
          (mt1 = this.b).b.d(j);
          this.b.a(false);
          if (this.a.a(this.h, 0).b()) {
            this.z = 15;
            break;
          } 
          if (i != this.h)
            this.z = 5; 
          break;
        case 8:
          this.a.d = false;
          if (this.h == 0) {
            (mt1 = this.b).e.a();
            if (this.Q != null)
              this.Q.r(); 
          } 
          break;
        case 1:
          this.b.a(this.a.k.a, this.a.k.b, this.a.k.c, this.a.k.d, this.a.b(this.a.k.a, this.a.k.b), this.a.b(this.a.k.c, this.a.k.d));
          this.z = 10;
          this.a.a(this.a.k.a, this.a.k.b, this.a.k.c, this.a.k.d);
          this.a.b(false);
          break;
        case 2:
          (mq1 = this).b.a(mq1.a.k.a, mq1.a.k.b, mq1.a.k.c, mq1.a.k.d, mq1.a.b(mq1.a.k.a, mq1.a.k.b), mq1.a.b(mq1.a.k.c, mq1.a.k.d));
          mq1.a.a(mq1.a.k.a, mq1.a.k.b, mq1.a.k.c, mq1.a.k.d);
          mq1.z = 10;
          break;
        case 3:
          if (this.a.j <= 0) {
            if (this.a.o != null)
              this.S = true; 
            paramInt = 15;
            this = this;
            continue;
          } 
          this.z = 0;
          arrayOfNj = (ms1 = this.a).l;
          a(arrayOfNj);
          break;
        case 4:
          r();
          break;
        case 5:
          s();
          break;
        case 11:
          a(this.r, this.H, this.J, this.K, this.L, this.M);
          break;
        default:
          break;
      } 
      this.d = paramInt;
      return;
    } 
    this.d = paramInt;
  }
  
  private void a(nj[][] paramArrayOfnj) {
    if (oq.n == 1) {
      mw[] arrayOfMw1 = new mw[this.a.j];
      System.arraycopy(this.a.i, 0, arrayOfMw1, 0, this.a.j);
      mw[] arrayOfMw2 = arrayOfMw1;
      mq mq1;
      (mq1 = this).X.a();
      if (arrayOfMw2.length != 0) {
        ct.a("=============================================checkMixing======================================" + arrayOfMw2.length);
        a a1 = new a(5);
        a a2 = new a(5);
        for (byte b1 = 0; b1 < arrayOfMw2.length; b1++) {
          if ((arrayOfMw2[b1]).d == 1 && (arrayOfMw2[b1]).g == 1) {
            mq1.X.a(arrayOfMw2[b1]);
          } else if ((arrayOfMw2[b1]).d >= 3) {
            a1.a(arrayOfMw2[b1]);
          } else {
            a2.a(arrayOfMw2[b1]);
          } 
        } 
        a(a1, true);
        a(a2, false);
        if (a1.d() == 0 || a2.d() == 0) {
          byte b2 = 0;
          int j = a1.d();
          while (b2 < j) {
            mw mw = (mw)a1.b(b2);
            mq1.a(mw);
            mq1.X.a(a1.b(b2));
            b2++;
          } 
          b2 = 0;
          j = a2.d();
          while (b2 < j) {
            mw mw = (mw)a2.b(b2);
            mq1.a(mw);
            mq1.X.a(a2.b(b2));
            b2++;
          } 
        } else {
          mq1.a(a1, a2);
        } 
      } 
    } 
    int i = this.a.j;
    a(paramArrayOfnj, i);
    b(paramArrayOfnj, i);
    int[] arrayOfInt = new int[100];
    byte b;
    for (b = 0; b < this.a.j; b++) {
      mw mw = this.a.i[b];
      int j;
      if ((j = this.b.a(mw, this.h)) > this.z)
        this.z = j; 
      if (mw.a.d < 70) {
        int k = this.A[mw.a.d] + 1;
        if (mw.d != 1 || mw.g != 1) {
          arrayOfInt[mw.a.d] = arrayOfInt[mw.a.d] + 1;
          if (k > 1)
            if (mw.d < 3) {
              this.b.c(k, mw.e, mw.f, mw.g, mw.d);
            } else if (mw.g < 3) {
              this.b.c(k, mw.b, mw.c, mw.g, mw.d);
            } else {
              this.b.c(k, mw.e, mw.f, mw.g, mw.d);
              this.b.c(k, mw.b, mw.c, mw.g, mw.d);
            }  
        } 
      } 
    } 
    if (oq.n == 1) {
      b = 0;
      int j = this.X.d();
      while (b < j) {
        mw mw;
        if ((mw = (mw)this.X.b(b)).a.e < 64)
          if ((mw.g >= 3 && mw.d >= 3) || mw.g >= 5 || mw.d >= 5) {
            byte b1 = mr.y[mw.a.d];
            this.a.a(mw.i, mw.h, b1);
            this.b.a(mw.i, mw.h, nj.a(b1), 0);
          } else if (mw.g >= 4 || mw.d >= 4) {
            byte b1 = mr.x[mw.a.d];
            this.a.a(mw.i, mw.h, b1);
            this.b.a(mw.i, mw.h, nj.a(b1), 0);
          }  
        b++;
      } 
    } 
    for (b = 0; b < 100; b++) {
      if (arrayOfInt[b] > 0)
        this.A[b] = this.A[b] + 1; 
    } 
  }
  
  private void a(nj[][] paramArrayOfnj, int paramInt) {
    for (byte b = 0; b < paramInt; b++) {
      mw mw;
      if ((mw = this.a.i[b]).d == 1 && mw.g == 1) {
        for (int i = mw.c + mw.d - 1; i >= mw.c; i--) {
          if ((paramArrayOfnj[mw.b][i]).f > 1)
            a(mw.b, i, -16777215, 1, mw.k, mw.j); 
          paramArrayOfnj[mw.b][i] = nj.a;
        } 
      } else if (mw.d < 3) {
        for (int i = mw.e + mw.g - 1; i >= mw.e; i--) {
          if ((paramArrayOfnj[i][mw.f]).f > 1)
            a(i, mw.f, -16777215, 1, mw.k, mw.j); 
          paramArrayOfnj[i][mw.f] = nj.a;
        } 
      } else if (mw.g < 3) {
        for (int i = mw.c + mw.d - 1; i >= mw.c; i--) {
          if ((paramArrayOfnj[mw.b][i]).f > 1)
            a(mw.b, i, -16777215, 1, mw.k, mw.j); 
          paramArrayOfnj[mw.b][i] = nj.a;
        } 
      } else {
        int i;
        for (i = mw.c + mw.d - 1; i >= mw.c; i--) {
          if ((paramArrayOfnj[mw.b][i]).f > 1)
            a(mw.b, i, -16777215, 1, mw.k, mw.j); 
          paramArrayOfnj[mw.b][i] = nj.a;
        } 
        for (i = mw.e + mw.g - 1; i >= mw.e; i--) {
          if ((paramArrayOfnj[i][mw.f]).f > 1)
            a(i, mw.f, -16777215, 1, mw.k, mw.j); 
          paramArrayOfnj[i][mw.f] = nj.a;
        } 
      } 
    } 
  }
  
  private void b(nj[][] paramArrayOfnj, int paramInt) {
    for (paramInt = paramInt; paramInt < this.a.j; paramInt++) {
      byte b;
      mw mw;
      switch ((mw = this.a.i[paramInt]).a.f) {
        case 2:
          for (b = 0; b < 8; b++) {
            int i = mw.b + O[b];
            int j = mw.c + P[b];
            if ((paramArrayOfnj[i][j]).d < 90) {
              a(i, j, -16777215, 1, mw.k, mw.j);
              paramArrayOfnj[i][j] = nj.a;
            } 
          } 
          break;
        case 4:
          for (b = 2; b <= 10; b++) {
            int i = mw.b;
            byte b1 = b;
            if ((paramArrayOfnj[i][b1]).d < 90) {
              a(i, b1, -16777215, 1, mw.k, mw.j);
              paramArrayOfnj[i][b1] = nj.a;
            } 
          } 
          for (b = 2; b <= 10; b++) {
            byte b1 = b;
            int i = mw.c;
            if ((paramArrayOfnj[b1][i]).d < 90) {
              a(b1, i, -16777215, 1, mw.k, mw.j);
              paramArrayOfnj[b1][i] = nj.a;
            } 
          } 
          break;
      } 
      paramArrayOfnj[mw.b][mw.c] = nj.a;
    } 
  }
  
  private void r() {
    ct.a(" dropAllRows ");
    this.a.h = 0;
    ms ms1;
    nj[][] arrayOfNj = (ms1 = this.a).l;
    int[] arrayOfInt1 = new int[12];
    int[] arrayOfInt2 = new int[12];
    byte b1;
    for (b1 = 2; b1 < 10; b1++)
      arrayOfInt1[b1] = 9; 
    b1 = 0;
    byte b2;
    for (b2 = 2; b2 < 10; b2++) {
      boolean bool = false;
      for (byte b = 9; b >= 2; b--) {
        if (((arrayOfNj[b][b2]).e & 0xFF) != 0) {
          if (b != arrayOfInt1[b2]) {
            this.a.p[this.a.h++] = arrayOfInt1[b2] << 8 | b2;
            arrayOfNj[arrayOfInt1[b2]][b2] = arrayOfNj[b][b2];
            arrayOfNj[b][b2] = nj.a;
            this.b.a(b, b2, arrayOfInt1[b2], b2, arrayOfNj[arrayOfInt1[b2]][b2], arrayOfInt2[b2] + b1);
            arrayOfInt2[b2] = arrayOfInt2[b2] + 1;
            bool = true;
          } 
          arrayOfInt1[b2] = arrayOfInt1[b2] - 1;
        } 
      } 
      if (bool)
        b1++; 
    } 
    b1 = 0;
    for (b2 = 2; b2 < 10; b2++) {
      byte b = 0;
      if (arrayOfInt1[b2] >= 2) {
        for (int i = arrayOfInt1[b2]; i >= 2; i--) {
          this.a.p[this.a.h++] = i << 8 | b2;
          byte b3 = b2;
          int j = i;
          ms ms2;
          if ((ms2 = this.a).m == null || ms2.n >= ms2.m.length)
            ms2.d(); 
          ms2.l[j][b3] = nj.a(ms2.m[ms2.n++]);
          this.b.a(b, b2, i, b2, arrayOfNj[i][b2], arrayOfInt2[b2] + b1);
          arrayOfInt2[b2] = arrayOfInt2[b2] + 1;
          b--;
          this.z = 10;
        } 
        b1++;
      } 
    } 
  }
  
  private void s() {
    this.a.j = 0;
    for (byte b = 0; b < this.a.h; b++) {
      int i = this.a.p[b] >> 8 & 0xFF;
      int j = this.a.p[b] & 0xFF;
      int k;
      boolean bool1 = (((k = a(this.a.l, i, j)) & 0xFF) >= 3) ? true : false;
      int m;
      boolean bool2 = (((m = b(this.a.l, i, j)) & 0xFF) >= 3) ? true : false;
      if (bool1 || bool2)
        a(i, j, k, m, true, 0); 
    } 
    this.a.h = 0;
  }
  
  private static int a(nj[][] paramArrayOfnj, int paramInt1, int paramInt2) {
    byte b1 = 1;
    byte b2 = 1;
    int j = (paramArrayOfnj[paramInt1][paramInt2]).e;
    while ((j & (paramArrayOfnj[paramInt1][paramInt2 - b2]).e) != 0) {
      b2++;
      b1++;
    } 
    int i = 0xFF000000 | (b2 - 1 & 0xFF) << 16;
    b2 = 1;
    while ((j & (paramArrayOfnj[paramInt1][paramInt2 + b2]).e) != 0) {
      b2++;
      b1++;
    } 
    return i = (i |= (b2 - 1 & 0xFF) << 8) | b1 & 0xFF;
  }
  
  private static int b(nj[][] paramArrayOfnj, int paramInt1, int paramInt2) {
    byte b1 = 1;
    byte b2 = 1;
    int j = (paramArrayOfnj[paramInt1][paramInt2]).e;
    while ((j & (paramArrayOfnj[paramInt1 - b2][paramInt2]).e) != 0) {
      b2++;
      b1++;
    } 
    int i = 0x0 | (b2 - 1 & 0xFF) << 16;
    b2 = 1;
    while ((j & (paramArrayOfnj[paramInt1 + b2][paramInt2]).e) != 0) {
      b2++;
      b1++;
    } 
    return i = (i |= (b2 - 1 & 0xFF) << 8) | b1 & 0xFF;
  }
  
  public abstract void b(int paramInt);
  
  public abstract void c(int paramInt);
  
  public abstract void a(int paramInt1, int paramInt2);
  
  public abstract void b(int paramInt1, int paramInt2);
  
  public abstract void c(int paramInt1, int paramInt2);
  
  public final k k() {
    mh mh;
    return (mh = this.b.a).a;
  }
  
  public final boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) {
    int m = paramInt4;
    int k = paramInt3;
    int j = paramInt2;
    int i = paramInt1;
    ms ms1 = this.a;
    mq mq1;
    my my = (mq1 = this).a(ms1, i, j, k, m);
    my my = my;
    this.a.k = my;
    if (this.a.k == null) {
      this.a.k = new my();
      this.a.k.b = paramInt2;
      this.a.k.a = paramInt1;
      this.a.k.d = paramInt4;
      this.a.k.c = paramInt3;
    } 
    this.F = paramInt1;
    this.G = paramInt2;
    d(1);
    return (my != null);
  }
  
  public final my a(ms paramms, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    try {
      if (paramms.l[paramInt1][paramInt2] == paramms.l[paramInt3][paramInt4])
        return null; 
      ms.a(paramms.l, paramInt1, paramInt2, paramInt3, paramInt4);
      boolean bool = false;
      int i = a(paramms.l, paramInt1, paramInt2);
      int j = b(paramms.l, paramInt1, paramInt2);
      int k = a(paramms.l, paramInt3, paramInt4);
      int m = b(paramms.l, paramInt3, paramInt4);
      if ((i & 0xFF) >= 3 || (j & 0xFF) >= 3 || (k & 0xFF) >= 3 || (m & 0xFF) >= 3)
        bool = true; 
      ms.a(paramms.l, paramInt1, paramInt2, paramInt3, paramInt4);
      if (bool) {
        int[] arrayOfInt = { i, j, k, m };
        my my;
        (my = new my()).a = paramInt1;
        my.b = paramInt2;
        my.c = paramInt3;
        my.d = paramInt4;
        my.e = arrayOfInt;
        return my;
      } 
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
    } 
    return null;
  }
  
  public final void l() {
    if (!this.f || this.b.f.m() || this.d != 8)
      return; 
    if (this.a.b()) {
      this.a.b(false);
      this.b.a(0, this.i, this.j);
      return;
    } 
    this.a.b(true);
    this.b.a(this.i, this.j);
    this.b.f();
    h(this.i, this.j);
  }
  
  public final void g(int paramInt1, int paramInt2) {
    this.i = paramInt1;
    this.j = paramInt2;
    this.a.b(false);
    h(paramInt1, paramInt2);
    this.b.a(0, this.i, this.j);
  }
  
  protected final void h(int paramInt1, int paramInt2) {
    if (!this.k && oq.o != 1 && System.currentTimeMillis() - this.R >= 500L) {
      ks.a().a(paramInt1, paramInt2, this.m);
      this.R = System.currentTimeMillis();
    } 
  }
  
  public final boolean m() {
    return this.a.b();
  }
  
  public final int n() {
    return this.i;
  }
  
  public final int o() {
    return this.j;
  }
  
  public boolean g() {
    return false;
  }
  
  public boolean h() {
    return false;
  }
  
  public boolean i() {
    return false;
  }
  
  public boolean j() {
    return false;
  }
  
  public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return false;
  }
  
  protected final void e(int paramInt) {
    this.b.a();
    if (this.Q != null)
      this.b.d.b(this.Q.q[paramInt]); 
  }
  
  public final void a(int paramInt1, int paramInt2, Object paramObject) {
    mq mq1;
    Object object;
    String str;
    al al;
    br br = (br)paramObject;
    switch (paramInt2) {
      case 11111:
        mq1 = this;
        str = "Bạn muốn thoát khỏi trận đấu";
        (al = ag.b().a("Chú ý", str, "Có", -1, "Không", -2, 1)).b(15000);
        al.a(mq1);
        al.c(true);
        al.b(true);
        ag.b().a(al, false);
        break;
      case 11112:
        if (f())
          (mq1 = this).b.a(mq1); 
        break;
      case 11113:
        if (f()) {
          (mq1 = this).b.g.a(mq1);
          ag.b().a(mq1.b.g);
        } 
        break;
      case 11115:
        if ((object = mq1.a()) != null) {
          int i = ((Integer)object).intValue();
          e(i);
        } 
        break;
    } 
    if (this.Q != null)
      this.Q.q(); 
  }
  
  public final void d(int paramInt1, int paramInt2) {
    try {
      al al;
      mt mt1;
      long l;
      switch (paramInt2) {
        case 1009:
          a.s().a(-241439, false);
          return;
        case 1008:
          d(15);
          ks.a().c(this.b.g.t(), this.m);
          this.m++;
          this.o = 4;
          a.s().a(-241439, false);
          return;
        case 1000:
          if (this.Q != null) {
            this.Q.a();
            return;
          } 
          return;
        case 1002:
          if (this.Q != null) {
            this.Q.q();
            return;
          } 
          return;
        case 1001:
          if (this.Q != null) {
            this.Q.f(95);
            return;
          } 
          return;
        case 1003:
          l = 0L;
          if (ag.b().e() instanceof gt)
            l = ((gt)ag.b().e()).u(); 
          if (go.s < l) {
            d(-1, 1004);
            (al = ag.b().a("Chú ý", "Bạn không đủ KEN để tham gia trận đánh này!", "Đóng", 1006, 1)).a(this);
            ag.b().a(al, false);
            return;
          } 
          a.s().a(true, null);
          return;
        case 1004:
          a.s().a(false, "Đang đánh quái, đợi tí!");
          return;
        case -1:
          d(15);
          ag.b().a(false);
          if (oq.o == 9) {
            p();
            ks.a().g();
            return;
          } 
          p();
          ks.a().h();
          return;
        case -2:
          ag.b().a(false);
          return;
        case -6:
          ag.b().a(false);
          this.g = 1;
          return;
        case 1006:
          ag.b().a(false);
          return;
        case 999999:
          if ((mt1 = this.b).e.d() && oq.o == 0)
            return; 
          (mt1 = this.b).e.b();
          d(15);
          this.z = 14;
          if (!(this.a.a(this.h, 0).a()).O) {
            int i = this.h;
            mx mx = this.b.b;
            if (i == 1) {
              mx.a[1].e();
            } else {
              mx.a[0].e();
            } 
          } 
          ks.a().b(al, this.m);
          this.m++;
          this.o = 5;
          return;
        case 1010:
          if (this.Q != null) {
            this.Q.x();
            break;
          } 
          return;
      } 
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
    } 
  }
  
  protected final void a(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte != null) {
      this.N = true;
      byte[] arrayOfByte = paramArrayOfbyte;
      ms ms1;
      (ms1 = this.a).o = arrayOfByte;
    } 
  }
  
  protected final void b(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte != null)
      this.a.a(paramArrayOfbyte); 
  }
  
  protected void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    ct.a("[SQControllerManager ]=============receiveOpponentSwapChess====================");
    this.b.b(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    a(paramInt2, paramInt3, paramInt4, paramInt5, false);
  }
  
  protected void a(boolean paramBoolean) {
    this.E = paramBoolean;
    this.D = true;
    if (!this.f) {
      mt mt1;
      (mt1 = this.b).c.a(0);
      this.f = true;
      if (this.k && !paramBoolean)
        try {
          Thread.sleep(1000L);
        } catch (InterruptedException interruptedException2) {
          InterruptedException interruptedException1;
          (interruptedException1 = null).printStackTrace();
        }  
    } 
    mp.a().b();
  }
  
  public final void a(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, lh[] paramArrayOflh1, lh[] paramArrayOflh2, boolean paramBoolean, int paramInt) {
    this.o = -1;
    this.w = null;
    this.l.c();
    this.m = paramInt;
    this.a.a(paramArrayOfbyte1, paramArrayOfbyte2, paramArrayOfbyte3, paramArrayOflh1, paramArrayOflh2);
    byte b;
    for (b = 0; !b; b++)
      this.b.b.a((paramArrayOflh2[0]).s, (paramArrayOflh2[0]).u, (paramArrayOflh2[0]).w, (paramArrayOflh2[0]).b, (paramArrayOflh2[0]).T); 
    for (b = 0; b <= 0; b++)
      this.b.b.a((paramArrayOflh1[0]).s, (paramArrayOflh1[0]).u, (paramArrayOflh1[0]).w, (paramArrayOflh1[0]).b, (paramArrayOflh1[0]).T); 
    this.S = true;
    a(paramBoolean);
    if (this.f) {
      d(10);
    } else {
      d(0);
    } 
    this.b.c("Lỗi! do mạng quá chậm...");
    this.b.c.a(30);
    this.b.e();
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4) {
    ct.a("[SQCOntrollerManager]==========receiveSkillAffect================");
    this.r = paramInt1;
    this.H = paramInt2;
    this.I = paramInt3 + 1;
    this.J = paramArrayOfbyte1;
    this.K = paramArrayOfbyte2;
    this.L = paramArrayOfbyte3;
    this.M = paramArrayOfbyte4;
    d(11);
  }
  
  private void a(int paramInt1, int paramInt2, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4) {
    byte b2;
    ct.a("[SQCOntrollerManager]=============processSkill=================" + paramInt2);
    this.a.j = 0;
    this.a.h = 0;
    int i = (paramInt1 + 1) % 2;
    lg lg = this.a.a(paramInt1, 0);
    byte b1 = 0;
    lv lv = lg.i(paramInt2);
    boolean bool = true;
    if (lv == null) {
      d(15);
      return;
    } 
    switch (paramInt2) {
      case 1000:
        for (paramInt2 = 0; paramInt2 < paramArrayOfbyte1.length; paramInt2++)
          a(paramArrayOfbyte1[paramInt2], paramArrayOfbyte2[paramInt2], -16777215, 1, true, 0); 
        break;
      case 1001:
        if (paramArrayOfbyte1 != null)
          for (paramInt2 = 0; paramInt2 < paramArrayOfbyte1.length; paramInt2++) {
            this.a.a(paramArrayOfbyte1[paramInt2], paramArrayOfbyte2[paramInt2], 10);
            this.a.p[this.a.h++] = paramArrayOfbyte1[paramInt2] << 8 | paramArrayOfbyte2[paramInt2] & 0xFF;
          }  
        break;
      case 1002:
        this.a.a(paramInt1, 0).a(this.I);
        bool = false;
        break;
      case 1003:
      case 1005:
        bool = false;
        break;
      case 1006:
        for (paramInt2 = 0; paramInt2 < paramArrayOfbyte1.length; paramInt2++)
          a(paramArrayOfbyte1[paramInt2], paramArrayOfbyte2[paramInt2], -16777215, 1, true, 0); 
        break;
      case 1007:
        for (paramInt2 = 0; paramInt2 < paramArrayOfbyte1.length; paramInt2++)
          a(paramArrayOfbyte1[paramInt2], paramArrayOfbyte2[paramInt2], -16777215, 1, true, 0); 
        break;
      case 1008:
        paramInt2 = 16;
        b1 = 16;
        i = paramArrayOfbyte1.length / 8;
        b2 = 0;
        while (b2 < paramArrayOfbyte1.length) {
          for (byte b = 0; b < i; b++) {
            a(paramArrayOfbyte1[b2], paramArrayOfbyte2[b2], -16777215, 1, true, paramInt2);
            b2++;
          } 
          paramInt2 -= 2;
        } 
        break;
      case 2000:
        if (paramArrayOfbyte1 != null)
          for (byte b = 0; b < paramArrayOfbyte1.length; b++)
            a(paramArrayOfbyte1[b], paramArrayOfbyte2[b], -16777215, 1, true, 0);  
        break;
      case 2001:
        this.a.a(paramInt1, 0).c(this.I);
        bool = false;
        break;
      case 2002:
        this.a.a(paramInt1, 0).d(this.I);
        bool = false;
        break;
      case 2003:
        if (paramArrayOfbyte1 != null)
          for (byte b = 0; b < paramArrayOfbyte1.length; b++)
            a(paramArrayOfbyte1[b], paramArrayOfbyte2[b], -16777215, 1, true, 0);  
        break;
      case 2004:
        this.a.a(i, 0).e(this.I);
      case 2005:
        bool = false;
        break;
      case 2006:
        if (paramArrayOfbyte1 != null) {
          byte b;
          for (b = 0; b < paramArrayOfbyte3.length; b++) {
            for (paramInt2 = b + 1; paramInt2 < paramArrayOfbyte3.length; paramInt2++) {
              if (paramArrayOfbyte3[paramInt2] < paramArrayOfbyte3[b]) {
                i = paramArrayOfbyte3[paramInt2];
                paramArrayOfbyte3[paramInt2] = paramArrayOfbyte3[b];
                paramArrayOfbyte3[b] = i;
              } 
            } 
          } 
          if (paramInt1 == 0) {
            for (b = 0; b < paramArrayOfbyte3.length; b++) {
              paramInt2 = -2;
              if (b == 1)
                paramInt2 = 0; 
              for (i = 2; i < 10; i++)
                a(paramArrayOfbyte3[b], i, -16777215, 1, true, paramInt2 + i); 
            } 
          } else {
            for (b = 0; b < paramArrayOfbyte3.length; b++) {
              paramInt2 = 9;
              if (b == 1)
                paramInt2 = 11; 
              for (i = 9; i >= 2; i--)
                a(paramArrayOfbyte3[b], i, -16777215, 1, true, paramInt2 - i); 
            } 
          } 
        } 
        bool = false;
        break;
      case 2007:
        if (paramArrayOfbyte1 != null)
          for (byte b = 0; b < paramArrayOfbyte1.length; b++)
            a(paramArrayOfbyte1[b], paramArrayOfbyte2[b], -16777215, 1, true, 0);  
        break;
      case 2008:
        if (paramArrayOfbyte1 != null)
          for (byte b = 0; b < paramArrayOfbyte1.length; b++)
            a(paramArrayOfbyte1[b], paramArrayOfbyte2[b], -16777215, 1, true, 0);  
        break;
      case 4000:
        if (paramArrayOfbyte1 != null)
          for (byte b = 0; b < paramArrayOfbyte1.length; b++)
            a(paramArrayOfbyte1[b], paramArrayOfbyte2[b], -16777215, 1, true, 0);  
        break;
      case 4001:
        bool = false;
        break;
      case 4002:
        this.a.a(i, 0).b(this.I);
        bool = false;
        break;
      case 4004:
      case 4005:
        bool = false;
        break;
      case 4006:
        if (paramArrayOfbyte1 != null)
          for (byte b = 0; b < paramArrayOfbyte1.length; b++)
            a(paramArrayOfbyte1[b], paramArrayOfbyte2[b], -16777215, 1, true, 0);  
        break;
      case 4007:
        if (paramArrayOfbyte1 != null)
          for (byte b = 0; b < paramArrayOfbyte1.length; b++)
            a(paramArrayOfbyte1[b], paramArrayOfbyte2[b], -16777215, 1, true, 0);  
        break;
      case 4008:
        if (paramArrayOfbyte1 != null)
          for (byte b = 0; b < paramArrayOfbyte1.length; b++)
            a(paramArrayOfbyte1[b], paramArrayOfbyte2[b], -16777215, 1, true, 0);  
        break;
    } 
    bool = bool;
    i = paramInt1;
    mx mx = this.b.b;
    if (i == 1) {
      mx.a[1].a(bool);
    } else {
      mx.a[0].a(bool);
    } 
    this.z = this.b.a(lv, paramArrayOfbyte1, paramArrayOfbyte2, paramArrayOfbyte3, paramArrayOfbyte4, paramInt1);
    if (this.z < b1)
      this.z = b1; 
    this.z += 10;
  }
  
  protected final void p() {
    ks.a().a((kp)null);
    if (this.Q != null)
      this.Q.t(); 
  }
  
  protected void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int[] paramArrayOfint1, int[] paramArrayOfint2, ll[] paramArrayOfll, lm[] paramArrayOflm) {
    this.g = paramInt1;
    hs.n = (paramInt1 == 1) ? (paramInt2 - paramInt3) : 0;
    hs.o = paramInt4;
    hs.p = paramArrayOfint1;
    hs.q = paramArrayOfint2;
    hs.r = (paramInt1 == 1);
    hs.s = paramInt5;
    hs.t = paramInt3;
    go.u = paramArrayOfll;
    go.v = paramArrayOflm;
    d(9);
  }
  
  private void f(int paramInt) {
    this.a.g = paramInt;
    np.a = paramInt * 1000;
  }
  
  public final void a(int paramInt) {
    ct.a("[SQCOntrollerManager] receiveCancelGame  " + paramInt);
    if (paramInt < 0) {
      this.g = paramInt;
      al al;
      (al = ag.b().a("", "Kết quả trận đấu hòa!!! Lỗi mất kết nối do đường truyền mạng...", "Đóng", 1006, 1)).a(this);
      ag.b().a(al);
      d(9);
      this.D = false;
      return;
    } 
  }
  
  public void a(String paramString1, String paramString2) {
    paramString2 = paramString2;
    mt mt1;
    (mt1 = this.b).b(paramString2);
  }
  
  public void a() {
    this.b.k();
  }
  
  protected void e(int paramInt1, int paramInt2) {
    if (paramInt2 == 199000009 || paramInt2 == 199000059) {
      this.b.b(paramInt1, 1);
    } else if (paramInt2 == 199000019 || paramInt2 == 199000069) {
      this.b.b(paramInt1, 2);
    } else if (paramInt2 == 199000079) {
      this.b.b(paramInt1, 3);
    } 
    d(19);
  }
  
  public final void a(lh paramlh, String paramString1, long paramLong, String paramString2, boolean paramBoolean1, boolean paramBoolean2) {
    if (this.d == 16 || !this.k) {
      a.s().a(false, null);
      return;
    } 
    al al;
    (al = a.a(paramlh, 1003, 1004, this, paramLong, paramString2, paramBoolean1, paramBoolean2)).c(true);
    al.b(true);
  }
  
  private static void a(a parama, boolean paramBoolean) {
    int i = 1;
    int j = parama.d();
    while (i < j) {
      int k = i;
      mw mw1 = (mw)parama.b(k - 1);
      mw mw2 = (mw)parama.b(k);
      while (k > 0 && (paramBoolean ? (mw1.d >= mw2.d) : (mw1.g >= mw2.g))) {
        parama.a(k - 1, k);
        if (--k > 0) {
          mw1 = (mw)parama.b(k - 1);
          mw2 = (mw)parama.b(k);
        } 
      } 
      i++;
    } 
    for (i = parama.d() - 1; i > 0; i--) {
      mw mw1 = (mw)parama.b(i - 1);
      mw mw2 = (mw)parama.b(i);
      if (paramBoolean) {
        if (mw1.d == mw2.d && mw1.c == mw2.c)
          if (mw1.h < mw2.h) {
            parama.a(i);
          } else {
            parama.a(i - 1);
          }  
      } else if (mw1.g == mw2.g && mw1.e == mw2.e) {
        if (mw1.i < mw2.i) {
          parama.a(i);
        } else {
          parama.a(i - 1);
        } 
      } 
    } 
  }
  
  private void a(a parama1, a parama2) {
    byte b = 0;
    int i = parama1.d();
    while (b < i) {
      mw mw = (mw)parama1.b(b);
      byte b1 = 0;
      int j = parama2.d();
      while (b1 < j) {
        mw mw1 = (mw)parama2.b(b1);
        mw mw2 = mw1;
        mw1 = mw;
        int k = mw2.f - mw1.c;
        int m = mw2.f - mw1.c + mw1.d - 1;
        int n = mw1.b - mw2.e;
        int i1 = mw1.b - mw2.e + mw2.g - 1;
        mw mw3;
        (mw3 = new mw()).c = mw1.c;
        mw3.b = mw1.b;
        mw3.d = mw1.d;
        mw3.f = mw2.f;
        mw3.e = mw2.e;
        mw3.g = mw2.g;
        mw3.i = mw1.b;
        mw3.h = mw2.f;
        mw3.a = mw1.a;
        if ((mw1 = (mw)((mw1.a.e != mw2.a.e || k < 0 || m > 0 || n < 0 || i1 > 0) ? null : mw3)) != null) {
          this.X.a(mw1);
          parama1.a(b);
          parama2.a(b1);
          i--;
          b--;
          mw = null;
          break;
        } 
        b1++;
      } 
      if (mw != null)
        a(mw); 
      b++;
    } 
    b = 0;
    i = parama2.d();
    while (b < i) {
      a((mw)parama2.b(b));
      b++;
    } 
  }
  
  private void a(mw parammw) {
    if (parammw.d < 3 || parammw.g < 3)
      if (parammw.d > 3) {
        parammw.h = parammw.c + (parammw.d - 1 >> 1);
      } else if (parammw.g > 3) {
        parammw.i = parammw.e + (parammw.g - 1 >> 1);
      }  
    this.X.a(parammw);
  }
  
  public void a(nq paramnq) {
    this.l.a(paramnq);
    if (paramnq.b >= 0)
      this.n = paramnq.b; 
  }
  
  private void d(nq paramnq) {
    ct.a("[SQControllerManager ]================processUseItem=================  turnModel.owner = " + paramnq.a + "   rv = " + paramnq.b);
    if (oq.o == 1) {
      ag.b().e(15000);
      if (this.a.b()) {
        this.a.b(false);
        this.b.a(0, this.i, this.j);
      } 
    } 
    a(paramnq, true);
    if (paramnq.g != null)
      for (byte b = 0; b < paramnq.g.length; b++)
        b(paramnq.g[b]);  
    a(paramnq.h);
    e(a(paramnq.a), paramnq.e);
    this.v = paramnq;
    this.b.e();
    this.m = paramnq.b;
  }
  
  private void e(nq paramnq) {
    mq mq1;
    this.o = -1;
    if (paramnq.E) {
      (mq1 = this).u = true;
      mq1.D = false;
      return;
    } 
    a(((nq)mq1).d);
    d(7);
  }
  
  protected void c(nq paramnq) {
    if (ct.a())
      ct.a("SQControlManager.processSwapChess(): " + paramnq); 
    a(paramnq, true);
    if (paramnq.g != null)
      for (byte b = 0; b < paramnq.g.length; b++)
        b(paramnq.g[b]);  
    a(paramnq.h);
    if (a(paramnq.a) == 1)
      a(1, paramnq.j, paramnq.k, paramnq.l, paramnq.m); 
    this.v = paramnq;
    this.b.e();
    this.m = paramnq.b;
  }
  
  protected boolean b(nq paramnq) {
    return false;
  }
  
  private void t() {
    mx mx;
    if (!(((mx = this.b.b).a[0].f() && mx.a[1].f()) ? 1 : 0))
      return; 
    Object object;
    if (this.v == null && !this.l.a() && (object = this.l.b()) != null) {
      mq mq1;
      mq mq2;
      int i;
      object = object;
      if (b((nq)object))
        return; 
      if (oq.o == 1 && a(((nq)object).a) != 0) {
        f(oq.p);
        (mx = this.b.b).c.b();
        mx.c.a();
      } 
      switch (((nq)object).c) {
        case 5:
          this.T = ((nq)object).i;
          object = object;
          mq1 = this;
          ct.a("[SQControllerManager ]=============processUsingSkill   turnModel==== " + ((nq)object).a + "  rv = " + ((nq)object).b);
          if (oq.o == 1) {
            ag.b().e(15000);
            if (mq1.a.b()) {
              mq1.a.b(false);
              mq1.b.a(0, mq1.i, mq1.j);
            } 
          } 
          mq1.a((nq)object, true);
          if (((nq)object).g != null)
            for (byte b = 0; b < ((nq)object).g.length; b++)
              mq1.b(((nq)object).g[b]);  
          mq1.a(((nq)object).h);
          mq1.a(mq1.a(((nq)object).a), ((nq)object).n, ((nq)object).r, ((nq)object).s, ((nq)object).o, ((nq)object).q, ((nq)object).p);
          mq1.v = (nq)object;
          mq1.b.e();
          mq1.m = ((nq)object).b;
          return;
        case 3:
          this.T = ((nq)object).i;
          c((nq)object);
          return;
        case 2:
          object = object;
          mq1 = this;
          ct.a("[SQControllerManager ]========processUpdateMatch=========== rv = " + ((nq)object).b);
          mq1.a(((nq)object).a, ((nq)object).f);
          mq1.m = ((nq)object).b;
          mq1.e((nq)object);
          mq1.b.e();
          return;
        case 4:
          this.T = ((nq)object).i;
          d((nq)object);
          return;
        case 6:
          object = object;
          mq1 = this;
          ct.a("[SQControllerManager ]========processAttack=========== rv = " + ((nq)object).b);
          if (oq.o == 1) {
            ag.b().e(15000);
            if (mq1.a.b()) {
              mq1.a.b(false);
              mq1.b.a(0, mq1.i, mq1.j);
            } 
          } 
          mq1.a((nq)object, false);
          mq1.a(((nq)object).a, ((nq)object).f);
          i = mq1.a(((nq)object).a);
          (mq2 = mq1).z = 10;
          mq2.b.a((i == 1) ? 0 : 1, 14, 4, true);
          a.s().a(-241439, false);
          mq1.m = ((nq)object).b;
          mq1.e((nq)object);
          mq1.b.e();
          return;
        case 8:
          object = object;
          (mq1 = this).b.b(true);
          a.s().l();
          mq1.a(((nq)object).t, ((nq)object).u, ((nq)object).v, ((nq)object).w, ((nq)object).x, ((nq)object).y, ((nq)object).z, ((nq)object).A, ((nq)object).B);
          return;
        case 1:
          f(((nq)object).k, ((nq)object).j);
          return;
        case 0:
          object = object;
          (mq1 = this).m = ((nq)object).b;
          mq1.e((nq)object);
          break;
      } 
    } 
  }
  
  protected final nq a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    nq nq1;
    (nq1 = new nq(paramInt5, (byte)3)).a = paramString;
    nq1.d = true;
    nq1.i = this.p;
    nq1.j = paramInt1;
    nq1.k = paramInt2;
    nq1.l = paramInt3;
    nq1.m = paramInt4;
    return nq1;
  }
  
  protected void f(int paramInt1, int paramInt2) {
    this.b.a(this.h, this.F, this.G, paramInt2, paramInt1);
    this.F = paramInt2;
    this.G = paramInt1;
    if (oq.o == 9 && this.s) {
      this.s = false;
      this.b.b(true);
    } 
  }
  
  private int a(String paramString) {
    for (byte b = 0; b < (this.a.a()).length; b++) {
      for (byte b1 = 0; b1 < (this.a.a()[b]).length; b1++) {
        if (paramString.equals(this.a.a(b, b1).j()))
          return b; 
      } 
    } 
    return -1;
  }
  
  public final void q() {
    this.l = null;
    this.Q = null;
    this.b = null;
    this.a = null;
    this.M = null;
    this.K = null;
    this.c = null;
    this.A = null;
    this.L = null;
    this.J = null;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\mq.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */