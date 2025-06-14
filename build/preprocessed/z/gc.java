import javax.microedition.lcdui.Graphics;

public final class gc extends aq {
  private d i;
  
  private int[] j;
  
  private String[] k;
  
  private int l;
  
  private int m;
  
  private int n;
  
  private boolean o;
  
  private int p;
  
  private int q;
  
  private gc(String paramString, int paramInt1, d paramd, int paramInt2) {
    this(paramString, 0, paramInt1, paramd, 1);
  }
  
  public gc(String paramString, int paramInt, d paramd) {
    this(paramString, paramInt, paramd, 1);
  }
  
  public gc(String paramString, int paramInt1, int paramInt2, d paramd, int paramInt3) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: iconst_0
    //   6: putfield l : I
    //   9: aload_0
    //   10: iconst_0
    //   11: putfield n : I
    //   14: aload_0
    //   15: iconst_0
    //   16: putfield p : I
    //   19: aload_0
    //   20: iconst_0
    //   21: putfield q : I
    //   24: aload_1
    //   25: ifnull -> 37
    //   28: aload_1
    //   29: ldc ''
    //   31: invokevirtual equals : (Ljava/lang/Object;)Z
    //   34: ifeq -> 43
    //   37: ldc 'Bạn chưa nhập nội dung '
    //   39: invokestatic a : (Ljava/lang/String;)V
    //   42: return
    //   43: aload_0
    //   44: iconst_0
    //   45: invokevirtual b : (Z)V
    //   48: aload_0
    //   49: iload_2
    //   50: putfield n : I
    //   53: iload_2
    //   54: iload_3
    //   55: if_icmpne -> 65
    //   58: aload_0
    //   59: iconst_0
    //   60: dup
    //   61: istore_2
    //   62: putfield n : I
    //   65: aload_0
    //   66: aload #4
    //   68: putfield i : Ld;
    //   71: iload_2
    //   72: ifle -> 222
    //   75: iload_2
    //   76: iload_3
    //   77: if_icmpge -> 222
    //   80: aload_1
    //   81: ifnull -> 222
    //   84: aload_1
    //   85: ldc ''
    //   87: invokevirtual equals : (Ljava/lang/Object;)Z
    //   90: ifeq -> 222
    //   93: aload_1
    //   94: iload_3
    //   95: iload_2
    //   96: isub
    //   97: aload #4
    //   99: invokestatic a : (Ljava/lang/String;ILd;)[Ljava/lang/String;
    //   102: dup
    //   103: astore_2
    //   104: arraylength
    //   105: ifle -> 233
    //   108: aload_2
    //   109: iconst_0
    //   110: aaload
    //   111: invokevirtual length : ()I
    //   114: istore #6
    //   116: aload_1
    //   117: iload #6
    //   119: invokevirtual substring : (I)Ljava/lang/String;
    //   122: dup
    //   123: astore_2
    //   124: iload_3
    //   125: aload #4
    //   127: invokestatic a : (Ljava/lang/String;ILd;)[Ljava/lang/String;
    //   130: astore_2
    //   131: aload_0
    //   132: aload_2
    //   133: arraylength
    //   134: iconst_1
    //   135: iadd
    //   136: anewarray java/lang/String
    //   139: putfield k : [Ljava/lang/String;
    //   142: aload_0
    //   143: getfield k : [Ljava/lang/String;
    //   146: iconst_0
    //   147: aload_1
    //   148: iconst_0
    //   149: iload #6
    //   151: invokevirtual substring : (II)Ljava/lang/String;
    //   154: aastore
    //   155: aload_2
    //   156: iconst_0
    //   157: aload_0
    //   158: getfield k : [Ljava/lang/String;
    //   161: iconst_1
    //   162: aload_2
    //   163: arraylength
    //   164: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   167: iconst_1
    //   168: istore_2
    //   169: iconst_0
    //   170: istore #6
    //   172: goto -> 199
    //   175: aload_0
    //   176: getfield k : [Ljava/lang/String;
    //   179: iconst_0
    //   180: aaload
    //   181: iload #6
    //   183: invokevirtual charAt : (I)C
    //   186: bipush #32
    //   188: if_icmpne -> 196
    //   191: iconst_0
    //   192: istore_2
    //   193: goto -> 213
    //   196: iinc #6, 1
    //   199: iload #6
    //   201: aload_0
    //   202: getfield k : [Ljava/lang/String;
    //   205: iconst_0
    //   206: aaload
    //   207: invokevirtual length : ()I
    //   210: if_icmplt -> 175
    //   213: iload_2
    //   214: ifeq -> 233
    //   217: aload_0
    //   218: iconst_0
    //   219: putfield n : I
    //   222: aload_0
    //   223: aload_1
    //   224: iload_3
    //   225: aload #4
    //   227: invokestatic a : (Ljava/lang/String;ILd;)[Ljava/lang/String;
    //   230: putfield k : [Ljava/lang/String;
    //   233: aload_0
    //   234: aload_0
    //   235: getfield k : [Ljava/lang/String;
    //   238: arraylength
    //   239: iconst_1
    //   240: isub
    //   241: newarray int
    //   243: putfield j : [I
    //   246: iconst_0
    //   247: istore_2
    //   248: aload_0
    //   249: getfield j : [I
    //   252: arraylength
    //   253: istore #6
    //   255: goto -> 269
    //   258: aload_0
    //   259: getfield j : [I
    //   262: iload_2
    //   263: iload #5
    //   265: iastore
    //   266: iinc #2, 1
    //   269: iload_2
    //   270: iload #6
    //   272: if_icmplt -> 258
    //   275: aload_0
    //   276: iconst_0
    //   277: iconst_0
    //   278: iload_3
    //   279: aload_0
    //   280: getfield k : [Ljava/lang/String;
    //   283: arraylength
    //   284: aload #4
    //   286: invokevirtual a : ()I
    //   289: imul
    //   290: invokevirtual a : (IIII)V
    //   293: return
  }
  
  public final void h(int paramInt) {
    this.l = 1;
    this.m = e() >> 1;
  }
  
  public final int f() {
    if (this.k == null)
      return 0; 
    int i = 0;
    for (byte b = 0; b < this.j.length; b++)
      i += this.j[b]; 
    return this.i.a() * this.k.length + i + this.q;
  }
  
  public final void i(int paramInt) {
    this.p = 10;
  }
  
  public final void j(int paramInt) {
    this.q = 6;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (this.k == null)
      return; 
    if (this.f && m())
      pc.e(paramGraphics, paramInt1 + c(), paramInt2 + d() + this.q / 2, e(), f()); 
    int i = 0;
    byte b = 0;
    int j = this.k.length;
    int k = this.n;
    this.i.c(this.o);
    while (b < j) {
      this.i.a(paramGraphics, this.k[b], c() + k + this.m + this.p + paramInt1, d() + i + this.q + paramInt2, this.l);
      i += this.i.a() + ((b < this.j.length) ? this.j[b] : 0);
      b++;
      k = 0;
    } 
    this.i.c(false);
  }
  
  public final String toString() {
    return "sqstringcomponent   " + c() + "   " + d();
  }
  
  public final void e(boolean paramBoolean) {
    this.o = true;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\gc.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */