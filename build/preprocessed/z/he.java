import javax.microedition.lcdui.Graphics;

public class he extends al implements b {
  a k;
  
  int l = -1;
  
  private az m = null;
  
  private az n = null;
  
  private int[][] o;
  
  public he() {
    super(1);
    a((ba)null);
    this.k = new a();
  }
  
  public final void a(int[][] paramArrayOfint) {
    this.o = paramArrayOfint;
  }
  
  public final void a(aq paramaq) {
    a(new aq[] { paramaq });
  }
  
  public final void a(aq[] paramArrayOfaq) {
    for (byte b1 = 0; b1 < paramArrayOfaq.length; b1++)
      this.k.a(paramArrayOfaq[b1]); 
    he he1 = this;
    he he2 = he1;
    int i = a2.d();
    boolean bool = false;
    a a2 = this.k;
    a a1 = a2;
    if (i > 0) {
      he he3 = he2;
      int j = i;
      i = 0;
      Object[] arrayOfObject;
      if ((arrayOfObject = a1.e()) != null) {
        j = i + j;
        while (++i < j) {
          int k = 0;
          int m;
          int n = (m = i - 1) / 2;
          while (true) {
            int i1;
            if ((i1 = he3.a(arrayOfObject[n], arrayOfObject[i])) < 0) {
              k = n + 1;
            } else if (i1 > 0) {
              m = n;
            } else {
              k = m = n + 1;
            } 
            n = (m + k) / 2;
            if (m <= k) {
              if (n < i - 1) {
                Object object = arrayOfObject[i];
                for (k = i; k > n; k--)
                  g.a(arrayOfObject, k, k - 1); 
                arrayOfObject[n] = object;
                break;
              } 
              if (he3.a(arrayOfObject[i - 1], arrayOfObject[i]) > 0)
                g.a(arrayOfObject, i, i - 1); 
            } else {
              continue;
            } 
            i++;
          } 
          i++;
        } 
      } 
      a1.a(arrayOfObject);
    } 
    for (i = 0; i < this.k.d(); i++) {
      aq aq1;
      if ((aq1 = h(i)).m()) {
        this.l = i;
        return;
      } 
    } 
  }
  
  public final void e(boolean paramBoolean) {
    super.e(paramBoolean);
    if (paramBoolean)
      for (paramBoolean = false; paramBoolean < this.k.d(); paramBoolean++)
        h(paramBoolean).c(true);  
  }
  
  public final void a(az paramaz, boolean paramBoolean) {
    if (paramaz == null) {
      super.a(paramaz, paramBoolean);
      this.m = null;
      return;
    } 
    bd bd;
    if (paramaz instanceof bd && i.b((bd = (bd)paramaz).d())) {
      this.m = paramaz;
      return;
    } 
    super.a(paramaz, paramBoolean);
  }
  
  public final void b(az paramaz, boolean paramBoolean) {
    if (paramaz == null) {
      super.b(paramaz, paramBoolean);
      this.n = null;
      return;
    } 
    bd bd;
    if (paramaz instanceof bd && i.b((bd = (bd)paramaz).d())) {
      this.n = paramaz;
      return;
    } 
    super.b(paramaz, paramBoolean);
  }
  
  private aq h(int paramInt) {
    return (aq)this.k.b(paramInt);
  }
  
  public final aq e(int paramInt) {
    for (byte b1 = 0; b1 < this.k.d(); b1++) {
      aq aq;
      if ((aq = h(b1)).b() == paramInt)
        return aq; 
    } 
    return null;
  }
  
  public final void f(int paramInt) {
    i(paramInt);
  }
  
  private aq t() {
    return (this.l < 0) ? null : h(this.l);
  }
  
  public final boolean l() {
    if (this.k.d() > 0)
      for (byte b1 = 0; b1 < this.k.d(); b1++) {
        if (h(b1).k())
          return true; 
      }  
    return super.l();
  }
  
  public void c(Graphics paramGraphics) {
    if (l()) {
      e(true);
      a(paramGraphics);
    } 
    for (byte b1 = 0; b1 < this.k.d(); b1++)
      h(b1).a(paramGraphics, a(), c()); 
    this.h = false;
  }
  
  protected void a(Graphics paramGraphics) {
    pc.a(paramGraphics, this.c, this.d, this.f, this.g, v.aj, true);
  }
  
  protected void g() {
    for (byte b1 = 0; b1 < this.k.d(); b1++)
      h(b1).n(); 
  }
  
  public void a(int paramInt1, int paramInt2) {
    paramInt1 -= a();
    paramInt2 -= c();
    for (byte b1 = 0; b1 < this.k.d(); b1++) {
      aq aq;
      if ((aq = h(b1)).j() && aq.h().a(paramInt1, paramInt2)) {
        if (aq.j()) {
          boolean bool = aq.c(paramInt1, paramInt2);
          if (b1 == this.l) {
            if (!bool) {
              u();
              return;
            } 
          } else {
            i(b1);
            if (!bool)
              u(); 
          } 
        } 
        return;
      } 
    } 
  }
  
  public final void b(int paramInt1, int paramInt2) {
    h(this.l).f(paramInt1, paramInt2);
  }
  
  public final void c(int paramInt1, int paramInt2) {
    h(this.l).e(paramInt1, paramInt2);
  }
  
  public final void g(int paramInt) {
    this.g = paramInt;
  }
  
  public void c(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield l : I
    //   4: ifge -> 8
    //   7: return
    //   8: aload_0
    //   9: invokespecial t : ()Laq;
    //   12: iload_1
    //   13: invokevirtual f : (I)Z
    //   16: dup
    //   17: istore_2
    //   18: ifeq -> 22
    //   21: return
    //   22: iload_1
    //   23: tableswitch default -> 759, 93 -> 751, 94 -> 742, 95 -> 737, 96 -> 145, 97 -> 64, 98 -> 471, 99 -> 233
    //   64: aload_0
    //   65: dup
    //   66: astore_1
    //   67: getfield o : [[I
    //   70: ifnull -> 103
    //   73: aload_1
    //   74: getfield o : [[I
    //   77: aload_1
    //   78: getfield l : I
    //   81: aaload
    //   82: iconst_2
    //   83: iaload
    //   84: dup
    //   85: istore_2
    //   86: ifge -> 94
    //   89: aload_1
    //   90: getfield l : I
    //   93: istore_2
    //   94: aload_1
    //   95: iload_2
    //   96: invokespecial i : (I)V
    //   99: iconst_0
    //   100: goto -> 143
    //   103: aload_1
    //   104: getfield l : I
    //   107: iconst_1
    //   108: isub
    //   109: istore_2
    //   110: goto -> 138
    //   113: aload_1
    //   114: iload_2
    //   115: invokespecial h : (I)Laq;
    //   118: dup
    //   119: astore_3
    //   120: invokevirtual j : ()Z
    //   123: ifeq -> 135
    //   126: aload_1
    //   127: iload_2
    //   128: invokespecial i : (I)V
    //   131: iconst_1
    //   132: goto -> 143
    //   135: iinc #2, -1
    //   138: iload_2
    //   139: ifge -> 113
    //   142: iconst_0
    //   143: pop
    //   144: return
    //   145: aload_0
    //   146: dup
    //   147: astore_1
    //   148: getfield o : [[I
    //   151: ifnull -> 184
    //   154: aload_1
    //   155: getfield o : [[I
    //   158: aload_1
    //   159: getfield l : I
    //   162: aaload
    //   163: iconst_3
    //   164: iaload
    //   165: dup
    //   166: istore_2
    //   167: ifge -> 175
    //   170: aload_1
    //   171: getfield l : I
    //   174: istore_2
    //   175: aload_1
    //   176: iload_2
    //   177: invokespecial i : (I)V
    //   180: iconst_0
    //   181: goto -> 231
    //   184: aload_1
    //   185: getfield l : I
    //   188: iconst_1
    //   189: iadd
    //   190: istore_2
    //   191: goto -> 219
    //   194: aload_1
    //   195: iload_2
    //   196: invokespecial h : (I)Laq;
    //   199: dup
    //   200: astore_3
    //   201: invokevirtual j : ()Z
    //   204: ifeq -> 216
    //   207: aload_1
    //   208: iload_2
    //   209: invokespecial i : (I)V
    //   212: iconst_1
    //   213: goto -> 231
    //   216: iinc #2, 1
    //   219: iload_2
    //   220: aload_1
    //   221: getfield k : La;
    //   224: invokevirtual d : ()I
    //   227: if_icmplt -> 194
    //   230: iconst_0
    //   231: pop
    //   232: return
    //   233: aload_0
    //   234: dup
    //   235: astore_1
    //   236: getfield o : [[I
    //   239: ifnull -> 272
    //   242: aload_1
    //   243: getfield o : [[I
    //   246: aload_1
    //   247: getfield l : I
    //   250: aaload
    //   251: iconst_0
    //   252: iaload
    //   253: dup
    //   254: istore_2
    //   255: ifge -> 263
    //   258: aload_1
    //   259: getfield l : I
    //   262: istore_2
    //   263: aload_1
    //   264: iload_2
    //   265: invokespecial i : (I)V
    //   268: iconst_0
    //   269: goto -> 469
    //   272: aload_1
    //   273: invokespecial t : ()Laq;
    //   276: dup
    //   277: astore_2
    //   278: invokevirtual d : ()I
    //   281: istore_3
    //   282: aload_2
    //   283: invokevirtual c : ()I
    //   286: aload_2
    //   287: invokevirtual e : ()I
    //   290: iconst_2
    //   291: idiv
    //   292: iadd
    //   293: istore #4
    //   295: aload_1
    //   296: getfield l : I
    //   299: iconst_1
    //   300: isub
    //   301: istore #5
    //   303: goto -> 463
    //   306: aload_1
    //   307: iload #5
    //   309: invokespecial h : (I)Laq;
    //   312: dup
    //   313: astore_2
    //   314: invokevirtual j : ()Z
    //   317: ifeq -> 460
    //   320: aload_2
    //   321: invokevirtual d : ()I
    //   324: iload_3
    //   325: if_icmpge -> 460
    //   328: iload #5
    //   330: istore #6
    //   332: iload #5
    //   334: iconst_1
    //   335: isub
    //   336: istore_3
    //   337: goto -> 446
    //   340: aload_1
    //   341: iload_3
    //   342: invokespecial h : (I)Laq;
    //   345: dup
    //   346: astore #7
    //   348: invokevirtual d : ()I
    //   351: aload_2
    //   352: invokevirtual d : ()I
    //   355: if_icmpne -> 450
    //   358: aload_2
    //   359: invokevirtual b : ()I
    //   362: aload #7
    //   364: invokevirtual b : ()I
    //   367: if_icmple -> 377
    //   370: iload #5
    //   372: istore #6
    //   374: goto -> 443
    //   377: aload_2
    //   378: invokevirtual b : ()I
    //   381: aload #7
    //   383: invokevirtual b : ()I
    //   386: if_icmpge -> 398
    //   389: aload #7
    //   391: astore_2
    //   392: iload_3
    //   393: istore #6
    //   395: goto -> 443
    //   398: aload #7
    //   400: invokevirtual c : ()I
    //   403: aload #7
    //   405: invokevirtual e : ()I
    //   408: iconst_2
    //   409: idiv
    //   410: iadd
    //   411: iload #4
    //   413: isub
    //   414: invokestatic abs : (I)I
    //   417: aload_2
    //   418: invokevirtual c : ()I
    //   421: aload_2
    //   422: invokevirtual e : ()I
    //   425: iconst_2
    //   426: idiv
    //   427: iadd
    //   428: iload #4
    //   430: isub
    //   431: invokestatic abs : (I)I
    //   434: if_icmpge -> 443
    //   437: aload #7
    //   439: astore_2
    //   440: iload_3
    //   441: istore #6
    //   443: iinc #3, -1
    //   446: iload_3
    //   447: ifge -> 340
    //   450: aload_1
    //   451: iload #6
    //   453: invokespecial i : (I)V
    //   456: iconst_1
    //   457: goto -> 469
    //   460: iinc #5, -1
    //   463: iload #5
    //   465: ifge -> 306
    //   468: iconst_0
    //   469: pop
    //   470: return
    //   471: aload_0
    //   472: dup
    //   473: astore_1
    //   474: getfield o : [[I
    //   477: ifnull -> 510
    //   480: aload_1
    //   481: getfield o : [[I
    //   484: aload_1
    //   485: getfield l : I
    //   488: aaload
    //   489: iconst_1
    //   490: iaload
    //   491: dup
    //   492: istore_2
    //   493: ifge -> 501
    //   496: aload_1
    //   497: getfield l : I
    //   500: istore_2
    //   501: aload_1
    //   502: iload_2
    //   503: invokespecial i : (I)V
    //   506: iconst_0
    //   507: goto -> 735
    //   510: aload_1
    //   511: invokespecial t : ()Laq;
    //   514: dup
    //   515: astore_2
    //   516: invokevirtual d : ()I
    //   519: istore_3
    //   520: aload_2
    //   521: invokevirtual c : ()I
    //   524: aload_2
    //   525: invokevirtual e : ()I
    //   528: iconst_2
    //   529: idiv
    //   530: iadd
    //   531: istore #4
    //   533: aload_2
    //   534: invokevirtual f : ()I
    //   537: istore #5
    //   539: aload_1
    //   540: getfield l : I
    //   543: iconst_1
    //   544: iadd
    //   545: istore #6
    //   547: goto -> 722
    //   550: aload_1
    //   551: iload #6
    //   553: invokespecial h : (I)Laq;
    //   556: dup
    //   557: astore_2
    //   558: invokevirtual j : ()Z
    //   561: ifeq -> 719
    //   564: aload_2
    //   565: invokevirtual d : ()I
    //   568: aload_2
    //   569: invokevirtual f : ()I
    //   572: iadd
    //   573: iload_3
    //   574: iload #5
    //   576: iadd
    //   577: if_icmple -> 719
    //   580: iload #6
    //   582: istore_3
    //   583: iload #6
    //   585: iconst_1
    //   586: iadd
    //   587: istore #7
    //   589: goto -> 698
    //   592: aload_1
    //   593: iload #7
    //   595: invokespecial h : (I)Laq;
    //   598: dup
    //   599: astore #5
    //   601: invokevirtual d : ()I
    //   604: aload_2
    //   605: invokevirtual d : ()I
    //   608: if_icmpne -> 710
    //   611: aload_2
    //   612: invokevirtual b : ()I
    //   615: aload #5
    //   617: invokevirtual b : ()I
    //   620: if_icmple -> 632
    //   623: aload #5
    //   625: astore_2
    //   626: iload #7
    //   628: istore_3
    //   629: goto -> 695
    //   632: aload_2
    //   633: invokevirtual b : ()I
    //   636: aload #5
    //   638: invokevirtual b : ()I
    //   641: if_icmpge -> 650
    //   644: iload #6
    //   646: istore_3
    //   647: goto -> 695
    //   650: aload #5
    //   652: invokevirtual c : ()I
    //   655: aload #5
    //   657: invokevirtual e : ()I
    //   660: iconst_2
    //   661: idiv
    //   662: iadd
    //   663: iload #4
    //   665: isub
    //   666: invokestatic abs : (I)I
    //   669: aload_2
    //   670: invokevirtual c : ()I
    //   673: aload_2
    //   674: invokevirtual e : ()I
    //   677: iconst_2
    //   678: idiv
    //   679: iadd
    //   680: iload #4
    //   682: isub
    //   683: invokestatic abs : (I)I
    //   686: if_icmpge -> 695
    //   689: aload #5
    //   691: astore_2
    //   692: iload #7
    //   694: istore_3
    //   695: iinc #7, 1
    //   698: iload #7
    //   700: aload_1
    //   701: getfield k : La;
    //   704: invokevirtual d : ()I
    //   707: if_icmplt -> 592
    //   710: aload_1
    //   711: iload_3
    //   712: invokespecial i : (I)V
    //   715: iconst_1
    //   716: goto -> 735
    //   719: iinc #6, 1
    //   722: iload #6
    //   724: aload_1
    //   725: getfield k : La;
    //   728: invokevirtual d : ()I
    //   731: if_icmplt -> 550
    //   734: iconst_0
    //   735: pop
    //   736: return
    //   737: aload_0
    //   738: invokespecial u : ()V
    //   741: return
    //   742: aload_0
    //   743: aload_0
    //   744: getfield m : Laz;
    //   747: invokespecial b : (Laz;)V
    //   750: return
    //   751: aload_0
    //   752: aload_0
    //   753: getfield n : Laz;
    //   756: invokespecial b : (Laz;)V
    //   759: return
  }
  
  public final void d(int paramInt) {
    if (this.l < 0)
      return; 
    t().g(paramInt);
  }
  
  private void b(az paramaz) {
    if (paramaz == null || this.i == null)
      return; 
    aq aq;
    if ((aq = t()) == null || !(aq instanceof ff))
      this.i.d(this.e, paramaz.a()); 
  }
  
  private void u() {
    aq aq;
    if ((aq = t()) == null)
      return; 
    if (this.i != null && aq instanceof ex) {
      aq = aq;
      this.i.d(this.e, aq.a());
      return;
    } 
  }
  
  private void i(int paramInt) {
    if (paramInt != this.l) {
      if (this.l >= 0)
        h(this.l).d(false); 
      this.l = paramInt;
      h(this.l).d(true);
    } 
  }
  
  public final int a(Object paramObject1, Object paramObject2) {
    paramObject1 = paramObject1;
    paramObject2 = paramObject2;
    return (paramObject1.d() > paramObject2.d()) ? 1 : ((paramObject1.d() == paramObject2.d()) ? ((paramObject1.c() > paramObject2.c()) ? 1 : ((paramObject1.c() < paramObject2.c()) ? -1 : 0)) : -1);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\he.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */