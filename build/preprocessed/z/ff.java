import com.mg.smsgame.MGMIDlet;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.TextBox;

public final class ff extends aq implements bf, CommandListener {
  private static char[][] j = new char[][] { { 
        'a', 'ă', 'â', 'e', 'ê', 'i', 'o', 'ô', 'ơ', 'u', 
        'ư', 'y', 'A', 'Ă', 'Â', 'E', 'Ê', 'I', 'O', 'Ô', 
        'Ơ', 'U', 'Ư', 'Y' }, { 
        'á', 'ắ', 'ấ', 'é', 'ế', 'í', 'ó', 'ố', 'ớ', 'ú', 
        'ứ', 'ý', 'Á', 'Ắ', 'Ấ', 'É', 'Ế', 'Í', 'Ó', 'Ố', 
        'Ớ', 'Ú', 'Ứ', 'Ý' }, { 
        'à', 'ằ', 'ầ', 'è', 'ề', 'ì', 'ò', 'ồ', 'ờ', 'ù', 
        'ừ', 'ỳ', 'À', 'Ằ', 'Ầ', 'È', 'Ề', 'Ì', 'Ò', 'Ồ', 
        'Ờ', 'Ù', 'Ừ', 'Ỳ' }, { 
        'ả', 'ẳ', 'ẩ', 'ẻ', 'ể', 'ỉ', 'ỏ', 'ổ', 'ở', 'ủ', 
        'ử', 'ỷ', 'Ả', 'Ẳ', 'Ẩ', 'Ẻ', 'Ể', 'Ỉ', 'Ỏ', 'Ổ', 
        'Ở', 'Ủ', 'Ử', 'Ỷ' }, { 
        'ã', 'ẵ', 'ẫ', 'ẽ', 'ễ', 'ĩ', 'õ', 'ỗ', 'ỡ', 'ũ', 
        'ữ', 'ỹ', 'Ã', 'Ẵ', 'Ẫ', 'Ẽ', 'Ễ', 'Ĩ', 'Õ', 'Ỗ', 
        'Ỡ', 'Ũ', 'Ữ', 'Ỹ' }, { 
        'ạ', 'ặ', 'ậ', 'ẹ', 'ệ', 'ị', 'ọ', 'ộ', 'ợ', 'ụ', 
        'ự', 'ỵ', 'Ạ', 'Ặ', 'Ậ', 'Ẹ', 'Ệ', 'Ị', 'Ọ', 'Ộ', 
        'Ợ', 'Ụ', 'Ự', 'Ỵ' } };
  
  private static final String[] k = new String[] { " 0", ".,?!'-()#@/:*+<=>;_$%&\"1", "ABC2", "DEF3", "GHI4", "JKL5", "MNO6", "PQRS7", "TUV8", "WXYZ9" };
  
  private static final String[] l = new String[] { " 0", ".,?!'-()#@/:*+<=>;_$%&\"1", "abc2", "def3", "ghi4", "jkl5", "mno6", "pqrs7", "tuv8", "wxyz9" };
  
  private static final String[] m = new String[] { " 0", ".,?!'-()#@/:*+<=>;_$%&\"1", "AĂÂBC2", "DĐEÊF3", "GHI4", "JKL5", "MNOÔƠ6", "PQRS7", "TUƯV8", "WXYZ9" };
  
  private static final String[] n = new String[] { " 0", ".,?!'-()#@/:*+<=>;_$%&\"1", "aăâbc2", "dđeêf3", "ghi4", "jkl5", "mnoôơ6", "pqrs7", "tuưv8", "wxyz9" };
  
  private static final String[] o = new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
  
  private static final String[] p = new String[] { "abc", "Abc", "ABC", "123" };
  
  private static final String[] q = new String[] { "aăâ", "Aăâ", "AĂÂ", "123" };
  
  private String[] r = l;
  
  private int s = -1;
  
  private StringBuffer t = new StringBuffer("");
  
  private int u;
  
  private d v = bx.d;
  
  private int w = -1987;
  
  private int x;
  
  private int y;
  
  private String z;
  
  private String A;
  
  private boolean B;
  
  private int C;
  
  private int D;
  
  private int E;
  
  private int F;
  
  private int G = -1;
  
  private int H;
  
  private int I;
  
  private String J = "";
  
  private TextBox K;
  
  private String L;
  
  private int M = -1;
  
  private int N = 16711680;
  
  private int O = 16777215;
  
  public static String i;
  
  private boolean P = false;
  
  private hp Q = null;
  
  private boolean R = false;
  
  private boolean S = false;
  
  private int T = 0;
  
  private int U = 0;
  
  private int V;
  
  private int W;
  
  private int X = 15830413;
  
  private fu Y;
  
  private String Z = "";
  
  private be aa = null;
  
  private boolean ab = false;
  
  private ae ac = new ae();
  
  public final void e(boolean paramBoolean) {
    if (paramBoolean && v.z)
      this.Y = pc.a(this, -3, c(), d() + 1); 
  }
  
  public final void a(String paramString) {
    this.Z = paramString;
  }
  
  public final void g(int paramInt1, int paramInt2) {
    if (paramInt1 < 0)
      throw new IllegalArgumentException("Điểm bắt đầu không được nhỏ hơn 0"); 
    if (paramInt2 <= 0)
      throw new IllegalArgumentException("Chiều dài không được nhỏ hơn 1"); 
    this.R = true;
    this.S = true;
    this.T = paramInt1;
    this.U = paramInt2;
    w();
  }
  
  public final void a(hp paramhp) {
    this.Q = paramhp;
    paramhp.a(this);
  }
  
  public final void h(int paramInt) {
    this.M = paramInt;
  }
  
  public final void b(boolean paramBoolean) {
    super.b(paramBoolean);
    t();
  }
  
  public static void a() {
    m[0] = "+0";
    k[0] = "+0";
    n[0] = "+0";
    l[0] = "+0";
  }
  
  public static void q() {
    m[0] = " ";
    k[0] = " ";
    n[0] = " ";
    l[0] = " ";
  }
  
  public ff() {
    this("", 255, 2);
  }
  
  public ff(String paramString, int paramInt1, int paramInt2) {
    this.L = paramString;
    this.M = paramInt1;
    this.H = paramInt2 << 31 >>> 31;
    this.I = paramInt2 >>> 1 << 1;
    if (this.I == 4) {
      i(3);
      this.y = 0;
    } else if (this.I == 2) {
      i(1);
      this.y = 0;
    } 
    if (this.H == 1) {
      i(0);
      this.P = true;
      this.y = 0;
    } 
    int j = 16354990;
    ff ff2;
    (ff2 = this).N = 16354990;
    int i = 12643805;
    ff ff1;
    (ff1 = this).O = 12643805;
  }
  
  public final String r() {
    return this.t.toString();
  }
  
  public final void b(String paramString) {
    if (i.a(paramString))
      return; 
    this.t.append(paramString);
    s();
  }
  
  private void s() {
    if (this.t.length() > this.M)
      this.t.delete(0, this.t.length() - this.M); 
    this.u = this.t.length();
    w();
    t();
  }
  
  public final void c(String paramString) {
    if (paramString == null)
      paramString = ""; 
    this.t = new StringBuffer(paramString);
    s();
  }
  
  public final void i(int paramInt) {
    this.C = paramInt;
    this.y = 15;
    this.x = 0;
    this.A = v.b ? q[this.C] : p[this.C];
    if (this.C == 0) {
      if (v.b) {
        this.r = n;
        return;
      } 
      this.r = l;
      return;
    } 
    if (this.C == 1 || this.C == 2) {
      if (v.b) {
        this.r = m;
        return;
      } 
      this.r = k;
      return;
    } 
    this.r = o;
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (i.a(paramCommand.getLabel(), "OK")) {
      c(this.K.getString());
      MGMIDlet.d().a((Displayable)ag.a(), true);
      return;
    } 
    if (i.a(paramCommand.getLabel(), "Trở về")) {
      MGMIDlet.d().a((Displayable)ag.a(), true);
      return;
    } 
    if (i.a(paramCommand.getLabel(), "Dán") && !i.a(i))
      this.K.insert(i, this.K.getCaretPosition()); 
  }
  
  public final void f(boolean paramBoolean) {
    this.ab = true;
  }
  
  public final void a(be parambe) {
    this.aa = parambe;
  }
  
  public final void g(boolean paramBoolean) {
    if (!paramBoolean) {
      int i;
      ag.a().e();
      paramBoolean = false;
      if (this.I == 4)
        i = 2; 
      if (this.H == 1)
        i |= 0x10000; 
      this.K = new TextBox(this.L, this.t.toString(), this.M, i);
      this.K.addCommand(new Command("OK", 4, 1));
      this.K.addCommand(new Command("Trở về", 2, 1));
      if (!i.a(i))
        this.K.addCommand(new Command("Dán", 1, 1)); 
      this.K.setCommandListener(this);
      MGMIDlet.d().a((Displayable)this.K, true);
      return;
    } 
    ff ff1;
    bk.b = (ff1 = this).aa;
    if (ff1.I == 4) {
      ag.a().a(ff1.d() + ff1.f(), 3);
      return;
    } 
    if (ff1.u == 0 && ff1.I != 1) {
      ag.a().a(ff1.d() + ff1.f(), 1);
      return;
    } 
    ag.a().a(ff1.d() + ff1.f(), 2);
  }
  
  private void t() {
    u();
    v();
  }
  
  private void u() {
    if (this.w >= 0)
      v.c[this.w] = 0; 
    this.x = this.y = 0;
    this.w = -1987;
    this.s = -1;
    this.B = false;
    if (this.H == 1)
      w(); 
    if (this.b != null)
      this.b.c(true); 
  }
  
  private void v() {
    // Byte code:
    //   0: aload_0
    //   1: getfield C : I
    //   4: iconst_3
    //   5: if_icmpeq -> 109
    //   8: aload_0
    //   9: getfield P : Z
    //   12: ifne -> 96
    //   15: aload_0
    //   16: getfield u : I
    //   19: ifle -> 90
    //   22: aload_0
    //   23: dup
    //   24: astore_1
    //   25: getfield u : I
    //   28: iconst_1
    //   29: if_icmple -> 86
    //   32: aload_1
    //   33: getfield t : Ljava/lang/StringBuffer;
    //   36: aload_1
    //   37: getfield u : I
    //   40: iconst_2
    //   41: isub
    //   42: invokevirtual charAt : (I)C
    //   45: istore_2
    //   46: aload_1
    //   47: getfield t : Ljava/lang/StringBuffer;
    //   50: aload_1
    //   51: getfield u : I
    //   54: iconst_1
    //   55: isub
    //   56: invokevirtual charAt : (I)C
    //   59: bipush #32
    //   61: if_icmpne -> 86
    //   64: iload_2
    //   65: bipush #46
    //   67: if_icmpeq -> 82
    //   70: iload_2
    //   71: bipush #33
    //   73: if_icmpeq -> 82
    //   76: iload_2
    //   77: bipush #63
    //   79: if_icmpne -> 86
    //   82: iconst_1
    //   83: goto -> 87
    //   86: iconst_0
    //   87: ifeq -> 96
    //   90: aload_0
    //   91: iconst_1
    //   92: invokevirtual i : (I)V
    //   95: return
    //   96: aload_0
    //   97: getfield C : I
    //   100: iconst_1
    //   101: if_icmpne -> 109
    //   104: aload_0
    //   105: iconst_0
    //   106: invokevirtual i : (I)V
    //   109: return
  }
  
  public final void d(boolean paramBoolean) {
    if (!this.f)
      return; 
    if (this.g != paramBoolean) {
      if (paramBoolean && this.R) {
        this.S = true;
        w();
      } 
      super.d(paramBoolean);
      i(this.C);
      u();
    } 
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.a(paramInt1, paramInt2, paramInt3, paramInt4);
    w();
  }
  
  private void l(int paramInt) {
    if (paramInt < 0) {
      paramInt = 0;
    } else if (paramInt > this.t.length()) {
      paramInt = this.t.length();
    } 
    this.u = paramInt;
    w();
  }
  
  private void h(int paramInt1, int paramInt2) {
    if (this.t.length() <= 0)
      return; 
    if (paramInt1 >= this.t.length())
      paramInt1 = this.t.length() - 1; 
    if (paramInt1 < 0)
      paramInt1 = 0; 
    if (paramInt1 + paramInt2 > this.t.length())
      paramInt2 = this.t.length() - paramInt1; 
    this.t.delete(paramInt1, paramInt1 + paramInt2);
    this.u = paramInt1;
    w();
  }
  
  public final boolean f(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield f : Z
    //   4: ifne -> 9
    //   7: iconst_0
    //   8: ireturn
    //   9: iload_1
    //   10: tableswitch default -> 351, 92 -> 64, 93 -> 64, 94 -> 349, 95 -> 56, 96 -> 224, 97 -> 144, 98 -> 349, 99 -> 349
    //   56: aload_0
    //   57: iconst_0
    //   58: invokevirtual g : (Z)V
    //   61: goto -> 5508
    //   64: aload_0
    //   65: getfield S : Z
    //   68: ifeq -> 90
    //   71: aload_0
    //   72: aload_0
    //   73: getfield T : I
    //   76: aload_0
    //   77: getfield U : I
    //   80: invokespecial h : (II)V
    //   83: aload_0
    //   84: iconst_0
    //   85: putfield S : Z
    //   88: iconst_1
    //   89: ireturn
    //   90: iload_1
    //   91: bipush #93
    //   93: if_icmpne -> 104
    //   96: invokestatic b : ()Z
    //   99: ifeq -> 104
    //   102: iconst_0
    //   103: ireturn
    //   104: aload_0
    //   105: getfield u : I
    //   108: ifle -> 5508
    //   111: aload_0
    //   112: dup
    //   113: getfield u : I
    //   116: iconst_1
    //   117: isub
    //   118: putfield u : I
    //   121: aload_0
    //   122: getfield t : Ljava/lang/StringBuffer;
    //   125: aload_0
    //   126: getfield u : I
    //   129: invokevirtual deleteCharAt : (I)Ljava/lang/StringBuffer;
    //   132: pop
    //   133: aload_0
    //   134: invokespecial t : ()V
    //   137: aload_0
    //   138: invokespecial w : ()V
    //   141: goto -> 5508
    //   144: aload_0
    //   145: getfield S : Z
    //   148: ifeq -> 166
    //   151: aload_0
    //   152: aload_0
    //   153: getfield T : I
    //   156: invokespecial l : (I)V
    //   159: aload_0
    //   160: iconst_0
    //   161: putfield S : Z
    //   164: iconst_1
    //   165: ireturn
    //   166: aload_0
    //   167: getfield u : I
    //   170: ifle -> 206
    //   173: aload_0
    //   174: dup
    //   175: getfield u : I
    //   178: iconst_1
    //   179: isub
    //   180: putfield u : I
    //   183: aload_0
    //   184: getfield u : I
    //   187: ifge -> 195
    //   190: aload_0
    //   191: iconst_0
    //   192: putfield u : I
    //   195: aload_0
    //   196: invokespecial t : ()V
    //   199: aload_0
    //   200: invokespecial w : ()V
    //   203: goto -> 5508
    //   206: aload_0
    //   207: getfield w : I
    //   210: sipush #-1987
    //   213: if_icmpeq -> 222
    //   216: aload_0
    //   217: invokespecial t : ()V
    //   220: iconst_1
    //   221: ireturn
    //   222: iconst_0
    //   223: ireturn
    //   224: aload_0
    //   225: getfield S : Z
    //   228: ifeq -> 251
    //   231: aload_0
    //   232: aload_0
    //   233: getfield T : I
    //   236: aload_0
    //   237: getfield U : I
    //   240: iadd
    //   241: invokespecial l : (I)V
    //   244: aload_0
    //   245: iconst_0
    //   246: putfield S : Z
    //   249: iconst_1
    //   250: ireturn
    //   251: aload_0
    //   252: getfield u : I
    //   255: aload_0
    //   256: getfield t : Ljava/lang/StringBuffer;
    //   259: invokevirtual length : ()I
    //   262: if_icmpge -> 311
    //   265: aload_0
    //   266: dup
    //   267: getfield u : I
    //   270: iconst_1
    //   271: iadd
    //   272: putfield u : I
    //   275: aload_0
    //   276: getfield u : I
    //   279: aload_0
    //   280: getfield t : Ljava/lang/StringBuffer;
    //   283: invokevirtual length : ()I
    //   286: if_icmple -> 300
    //   289: aload_0
    //   290: aload_0
    //   291: getfield t : Ljava/lang/StringBuffer;
    //   294: invokevirtual length : ()I
    //   297: putfield u : I
    //   300: aload_0
    //   301: invokespecial t : ()V
    //   304: aload_0
    //   305: invokespecial w : ()V
    //   308: goto -> 5508
    //   311: aload_0
    //   312: getfield w : I
    //   315: sipush #-1987
    //   318: if_icmpeq -> 327
    //   321: aload_0
    //   322: invokespecial t : ()V
    //   325: iconst_1
    //   326: ireturn
    //   327: aload_0
    //   328: getfield Q : Lhp;
    //   331: ifnull -> 347
    //   334: invokestatic b : ()Lah;
    //   337: aload_0
    //   338: getfield Q : Lhp;
    //   341: iconst_0
    //   342: invokevirtual a : (Lal;Z)V
    //   345: iconst_1
    //   346: ireturn
    //   347: iconst_0
    //   348: ireturn
    //   349: iconst_0
    //   350: ireturn
    //   351: aload_0
    //   352: getfield S : Z
    //   355: ifeq -> 375
    //   358: aload_0
    //   359: aload_0
    //   360: getfield T : I
    //   363: aload_0
    //   364: getfield U : I
    //   367: invokespecial h : (II)V
    //   370: aload_0
    //   371: iconst_0
    //   372: putfield S : Z
    //   375: invokestatic a : ()Z
    //   378: ifeq -> 388
    //   381: iload_1
    //   382: sipush #135
    //   385: if_icmpeq -> 401
    //   388: invokestatic a : ()Z
    //   391: ifne -> 509
    //   394: iload_1
    //   395: sipush #142
    //   398: if_icmpne -> 509
    //   401: aload_0
    //   402: getfield I : I
    //   405: iconst_4
    //   406: if_icmpne -> 411
    //   409: iconst_1
    //   410: ireturn
    //   411: aload_0
    //   412: getfield B : Z
    //   415: ifeq -> 452
    //   418: getstatic v.a : Z
    //   421: ifeq -> 438
    //   424: getstatic v.b : Z
    //   427: ifeq -> 434
    //   430: iconst_0
    //   431: goto -> 435
    //   434: iconst_1
    //   435: putstatic v.b : Z
    //   438: aload_0
    //   439: invokespecial t : ()V
    //   442: aload_0
    //   443: aload_0
    //   444: getfield D : I
    //   447: invokevirtual i : (I)V
    //   450: iconst_1
    //   451: ireturn
    //   452: aload_0
    //   453: iconst_1
    //   454: putfield B : Z
    //   457: aload_0
    //   458: iload_1
    //   459: putfield w : I
    //   462: getstatic v.ai : Z
    //   465: ifne -> 509
    //   468: aload_0
    //   469: aload_0
    //   470: getfield C : I
    //   473: putfield D : I
    //   476: aload_0
    //   477: dup
    //   478: getfield C : I
    //   481: iconst_1
    //   482: iadd
    //   483: putfield C : I
    //   486: aload_0
    //   487: getfield C : I
    //   490: iconst_4
    //   491: if_icmplt -> 499
    //   494: aload_0
    //   495: iconst_0
    //   496: putfield C : I
    //   499: aload_0
    //   500: aload_0
    //   501: getfield C : I
    //   504: invokevirtual i : (I)V
    //   507: iconst_1
    //   508: ireturn
    //   509: getstatic v.ai : Z
    //   512: ifeq -> 3521
    //   515: aload_0
    //   516: iload_1
    //   517: istore_2
    //   518: astore_1
    //   519: iload_2
    //   520: invokestatic a : (I)C
    //   523: istore_3
    //   524: aload_1
    //   525: getfield C : I
    //   528: iconst_3
    //   529: if_icmpne -> 547
    //   532: iload_3
    //   533: bipush #48
    //   535: if_icmplt -> 544
    //   538: iload_3
    //   539: bipush #57
    //   541: if_icmple -> 547
    //   544: goto -> 5508
    //   547: getstatic v.b : Z
    //   550: ifeq -> 3513
    //   553: aload_1
    //   554: getfield u : I
    //   557: ifle -> 3513
    //   560: aload_1
    //   561: iload_3
    //   562: istore #5
    //   564: dup
    //   565: astore #4
    //   567: getfield t : Ljava/lang/StringBuffer;
    //   570: aload #4
    //   572: getfield u : I
    //   575: iconst_1
    //   576: isub
    //   577: invokevirtual charAt : (I)C
    //   580: istore_1
    //   581: iconst_m1
    //   582: istore #6
    //   584: iload #5
    //   586: lookupswitch default -> 3404, 65 -> 861, 68 -> 772, 69 -> 1315, 70 -> 3383, 74 -> 3401, 79 -> 1675, 82 -> 3389, 83 -> 3377, 87 -> 2131, 88 -> 3395, 90 -> 3371, 97 -> 861, 100 -> 772, 101 -> 1315, 102 -> 3383, 106 -> 3401, 111 -> 1675, 114 -> 3389, 115 -> 3377, 119 -> 2131, 120 -> 3395, 122 -> 3371
    //   772: iload_1
    //   773: lookupswitch default -> 858, 68 -> 837, 100 -> 816, 272 -> 848, 273 -> 827
    //   816: aload #4
    //   818: sipush #273
    //   821: invokespecial c : (C)V
    //   824: goto -> 3518
    //   827: aload #4
    //   829: bipush #100
    //   831: invokespecial c : (C)V
    //   834: goto -> 3503
    //   837: aload #4
    //   839: sipush #272
    //   842: invokespecial c : (C)V
    //   845: goto -> 3518
    //   848: aload #4
    //   850: bipush #68
    //   852: invokespecial c : (C)V
    //   855: goto -> 3503
    //   858: goto -> 3404
    //   861: iload_1
    //   862: lookupswitch default -> 1312, 65 -> 1236, 97 -> 1160, 192 -> 1258, 193 -> 1247, 194 -> 1302, 195 -> 1280, 224 -> 1182, 225 -> 1171, 226 -> 1226, 227 -> 1204, 258 -> 1236, 259 -> 1160, 7840 -> 1291, 7841 -> 1215, 7842 -> 1269, 7843 -> 1193, 7844 -> 1302, 7845 -> 1226, 7846 -> 1302, 7847 -> 1226, 7848 -> 1302, 7849 -> 1226, 7850 -> 1302, 7851 -> 1226, 7852 -> 1302, 7853 -> 1226, 7854 -> 1247, 7855 -> 1171, 7856 -> 1258, 7857 -> 1182, 7858 -> 1269, 7859 -> 1193, 7860 -> 1280, 7861 -> 1204, 7862 -> 1291, 7863 -> 1215
    //   1160: aload #4
    //   1162: sipush #226
    //   1165: invokespecial c : (C)V
    //   1168: goto -> 3518
    //   1171: aload #4
    //   1173: sipush #7845
    //   1176: invokespecial c : (C)V
    //   1179: goto -> 3518
    //   1182: aload #4
    //   1184: sipush #7847
    //   1187: invokespecial c : (C)V
    //   1190: goto -> 3518
    //   1193: aload #4
    //   1195: sipush #7849
    //   1198: invokespecial c : (C)V
    //   1201: goto -> 3518
    //   1204: aload #4
    //   1206: sipush #7851
    //   1209: invokespecial c : (C)V
    //   1212: goto -> 3518
    //   1215: aload #4
    //   1217: sipush #7853
    //   1220: invokespecial c : (C)V
    //   1223: goto -> 3518
    //   1226: aload #4
    //   1228: bipush #97
    //   1230: invokespecial c : (C)V
    //   1233: goto -> 3503
    //   1236: aload #4
    //   1238: sipush #194
    //   1241: invokespecial c : (C)V
    //   1244: goto -> 3518
    //   1247: aload #4
    //   1249: sipush #7844
    //   1252: invokespecial c : (C)V
    //   1255: goto -> 3518
    //   1258: aload #4
    //   1260: sipush #7846
    //   1263: invokespecial c : (C)V
    //   1266: goto -> 3518
    //   1269: aload #4
    //   1271: sipush #7848
    //   1274: invokespecial c : (C)V
    //   1277: goto -> 3518
    //   1280: aload #4
    //   1282: sipush #7860
    //   1285: invokespecial c : (C)V
    //   1288: goto -> 3518
    //   1291: aload #4
    //   1293: sipush #7852
    //   1296: invokespecial c : (C)V
    //   1299: goto -> 3518
    //   1302: aload #4
    //   1304: bipush #65
    //   1306: invokespecial c : (C)V
    //   1309: goto -> 3503
    //   1312: goto -> 3404
    //   1315: iload_1
    //   1316: lookupswitch default -> 1672, 69 -> 1596, 101 -> 1520, 200 -> 1618, 201 -> 1607, 202 -> 1662, 232 -> 1542, 233 -> 1531, 234 -> 1586, 7864 -> 1651, 7865 -> 1575, 7866 -> 1629, 7867 -> 1553, 7868 -> 1640, 7869 -> 1564, 7870 -> 1662, 7871 -> 1586, 7872 -> 1662, 7873 -> 1586, 7874 -> 1662, 7875 -> 1586, 7876 -> 1662, 7877 -> 1586, 7878 -> 1662, 7879 -> 1586
    //   1520: aload #4
    //   1522: sipush #234
    //   1525: invokespecial c : (C)V
    //   1528: goto -> 3518
    //   1531: aload #4
    //   1533: sipush #7871
    //   1536: invokespecial c : (C)V
    //   1539: goto -> 3518
    //   1542: aload #4
    //   1544: sipush #7873
    //   1547: invokespecial c : (C)V
    //   1550: goto -> 3518
    //   1553: aload #4
    //   1555: sipush #7875
    //   1558: invokespecial c : (C)V
    //   1561: goto -> 3518
    //   1564: aload #4
    //   1566: sipush #7877
    //   1569: invokespecial c : (C)V
    //   1572: goto -> 3518
    //   1575: aload #4
    //   1577: sipush #7879
    //   1580: invokespecial c : (C)V
    //   1583: goto -> 3518
    //   1586: aload #4
    //   1588: bipush #101
    //   1590: invokespecial c : (C)V
    //   1593: goto -> 3503
    //   1596: aload #4
    //   1598: sipush #7871
    //   1601: invokespecial c : (C)V
    //   1604: goto -> 3518
    //   1607: aload #4
    //   1609: sipush #7873
    //   1612: invokespecial c : (C)V
    //   1615: goto -> 3518
    //   1618: aload #4
    //   1620: sipush #7875
    //   1623: invokespecial c : (C)V
    //   1626: goto -> 3518
    //   1629: aload #4
    //   1631: sipush #7877
    //   1634: invokespecial c : (C)V
    //   1637: goto -> 3518
    //   1640: aload #4
    //   1642: sipush #7879
    //   1645: invokespecial c : (C)V
    //   1648: goto -> 3518
    //   1651: aload #4
    //   1653: sipush #7879
    //   1656: invokespecial c : (C)V
    //   1659: goto -> 3518
    //   1662: aload #4
    //   1664: bipush #69
    //   1666: invokespecial c : (C)V
    //   1669: goto -> 3503
    //   1672: goto -> 3404
    //   1675: iload_1
    //   1676: lookupswitch default -> 2128, 79 -> 2052, 111 -> 1976, 210 -> 2074, 211 -> 2063, 212 -> 2118, 213 -> 2096, 242 -> 1998, 243 -> 1987, 244 -> 2042, 245 -> 2020, 416 -> 2052, 417 -> 1976, 7884 -> 2107, 7885 -> 2031, 7886 -> 2085, 7887 -> 2009, 7888 -> 2118, 7889 -> 2042, 7890 -> 2118, 7891 -> 2042, 7892 -> 2118, 7893 -> 2042, 7894 -> 2118, 7895 -> 2042, 7896 -> 2118, 7897 -> 2042, 7898 -> 2063, 7899 -> 1987, 7900 -> 2074, 7901 -> 1998, 7902 -> 2085, 7903 -> 2009, 7904 -> 2096, 7905 -> 2020, 7906 -> 2107, 7907 -> 2031
    //   1976: aload #4
    //   1978: sipush #244
    //   1981: invokespecial c : (C)V
    //   1984: goto -> 3518
    //   1987: aload #4
    //   1989: sipush #7889
    //   1992: invokespecial c : (C)V
    //   1995: goto -> 3518
    //   1998: aload #4
    //   2000: sipush #7891
    //   2003: invokespecial c : (C)V
    //   2006: goto -> 3518
    //   2009: aload #4
    //   2011: sipush #7893
    //   2014: invokespecial c : (C)V
    //   2017: goto -> 3518
    //   2020: aload #4
    //   2022: sipush #7895
    //   2025: invokespecial c : (C)V
    //   2028: goto -> 3518
    //   2031: aload #4
    //   2033: sipush #7897
    //   2036: invokespecial c : (C)V
    //   2039: goto -> 3518
    //   2042: aload #4
    //   2044: bipush #111
    //   2046: invokespecial c : (C)V
    //   2049: goto -> 3503
    //   2052: aload #4
    //   2054: sipush #212
    //   2057: invokespecial c : (C)V
    //   2060: goto -> 3518
    //   2063: aload #4
    //   2065: sipush #7888
    //   2068: invokespecial c : (C)V
    //   2071: goto -> 3518
    //   2074: aload #4
    //   2076: sipush #7890
    //   2079: invokespecial c : (C)V
    //   2082: goto -> 3518
    //   2085: aload #4
    //   2087: sipush #7892
    //   2090: invokespecial c : (C)V
    //   2093: goto -> 3518
    //   2096: aload #4
    //   2098: sipush #7894
    //   2101: invokespecial c : (C)V
    //   2104: goto -> 3518
    //   2107: aload #4
    //   2109: sipush #7896
    //   2112: invokespecial c : (C)V
    //   2115: goto -> 3518
    //   2118: aload #4
    //   2120: bipush #79
    //   2122: invokespecial c : (C)V
    //   2125: goto -> 3503
    //   2128: goto -> 3404
    //   2131: iload_1
    //   2132: lookupswitch default -> 3368, 65 -> 3292, 79 -> 2988, 85 -> 3140, 97 -> 3216, 111 -> 2912, 117 -> 3064, 192 -> 3314, 193 -> 3303, 194 -> 3292, 195 -> 3336, 210 -> 3010, 211 -> 2999, 212 -> 2988, 213 -> 3032, 217 -> 3162, 218 -> 3151, 224 -> 3238, 225 -> 3227, 226 -> 3216, 227 -> 3260, 242 -> 2934, 243 -> 2923, 244 -> 2912, 245 -> 2956, 249 -> 3086, 250 -> 3075, 258 -> 3358, 259 -> 3282, 360 -> 3184, 361 -> 3108, 416 -> 3054, 417 -> 2978, 431 -> 3206, 432 -> 3130, 7840 -> 3347, 7841 -> 3271, 7842 -> 3325, 7843 -> 3249, 7844 -> 3303, 7845 -> 3227, 7846 -> 3314, 7847 -> 3238, 7848 -> 3325, 7849 -> 3249, 7850 -> 3336, 7851 -> 3260, 7852 -> 3347, 7853 -> 3271, 7854 -> 3358, 7855 -> 3282, 7856 -> 3358, 7857 -> 3282, 7858 -> 3358, 7859 -> 3282, 7860 -> 3358, 7861 -> 3282, 7862 -> 3358, 7863 -> 3282, 7884 -> 3043, 7885 -> 2967, 7886 -> 3021, 7887 -> 2945, 7888 -> 2999, 7889 -> 2923, 7890 -> 3010, 7891 -> 2934, 7892 -> 3021, 7893 -> 2945, 7894 -> 3032, 7895 -> 2956, 7896 -> 3043, 7897 -> 2967, 7898 -> 3054, 7899 -> 2978, 7900 -> 3054, 7901 -> 2978, 7902 -> 3054, 7903 -> 2978, 7904 -> 3054, 7905 -> 2978, 7906 -> 3054, 7907 -> 2978, 7908 -> 3195, 7909 -> 3119, 7910 -> 3173, 7911 -> 3097, 7912 -> 3206, 7913 -> 3130, 7914 -> 3206, 7915 -> 3130, 7916 -> 3206, 7917 -> 3130, 7918 -> 3206, 7919 -> 3130, 7920 -> 3206, 7921 -> 3130
    //   2912: aload #4
    //   2914: sipush #417
    //   2917: invokespecial c : (C)V
    //   2920: goto -> 3518
    //   2923: aload #4
    //   2925: sipush #7899
    //   2928: invokespecial c : (C)V
    //   2931: goto -> 3518
    //   2934: aload #4
    //   2936: sipush #7901
    //   2939: invokespecial c : (C)V
    //   2942: goto -> 3518
    //   2945: aload #4
    //   2947: sipush #7903
    //   2950: invokespecial c : (C)V
    //   2953: goto -> 3518
    //   2956: aload #4
    //   2958: sipush #7905
    //   2961: invokespecial c : (C)V
    //   2964: goto -> 3518
    //   2967: aload #4
    //   2969: sipush #7907
    //   2972: invokespecial c : (C)V
    //   2975: goto -> 3518
    //   2978: aload #4
    //   2980: bipush #111
    //   2982: invokespecial c : (C)V
    //   2985: goto -> 3503
    //   2988: aload #4
    //   2990: sipush #416
    //   2993: invokespecial c : (C)V
    //   2996: goto -> 3518
    //   2999: aload #4
    //   3001: sipush #7898
    //   3004: invokespecial c : (C)V
    //   3007: goto -> 3518
    //   3010: aload #4
    //   3012: sipush #7900
    //   3015: invokespecial c : (C)V
    //   3018: goto -> 3518
    //   3021: aload #4
    //   3023: sipush #7902
    //   3026: invokespecial c : (C)V
    //   3029: goto -> 3518
    //   3032: aload #4
    //   3034: sipush #7904
    //   3037: invokespecial c : (C)V
    //   3040: goto -> 3518
    //   3043: aload #4
    //   3045: sipush #7906
    //   3048: invokespecial c : (C)V
    //   3051: goto -> 3518
    //   3054: aload #4
    //   3056: bipush #79
    //   3058: invokespecial c : (C)V
    //   3061: goto -> 3503
    //   3064: aload #4
    //   3066: sipush #432
    //   3069: invokespecial c : (C)V
    //   3072: goto -> 3518
    //   3075: aload #4
    //   3077: sipush #7913
    //   3080: invokespecial c : (C)V
    //   3083: goto -> 3518
    //   3086: aload #4
    //   3088: sipush #7915
    //   3091: invokespecial c : (C)V
    //   3094: goto -> 3518
    //   3097: aload #4
    //   3099: sipush #7917
    //   3102: invokespecial c : (C)V
    //   3105: goto -> 3518
    //   3108: aload #4
    //   3110: sipush #7919
    //   3113: invokespecial c : (C)V
    //   3116: goto -> 3518
    //   3119: aload #4
    //   3121: sipush #7921
    //   3124: invokespecial c : (C)V
    //   3127: goto -> 3518
    //   3130: aload #4
    //   3132: bipush #117
    //   3134: invokespecial c : (C)V
    //   3137: goto -> 3503
    //   3140: aload #4
    //   3142: sipush #431
    //   3145: invokespecial c : (C)V
    //   3148: goto -> 3518
    //   3151: aload #4
    //   3153: sipush #7912
    //   3156: invokespecial c : (C)V
    //   3159: goto -> 3518
    //   3162: aload #4
    //   3164: sipush #7914
    //   3167: invokespecial c : (C)V
    //   3170: goto -> 3518
    //   3173: aload #4
    //   3175: sipush #7916
    //   3178: invokespecial c : (C)V
    //   3181: goto -> 3518
    //   3184: aload #4
    //   3186: sipush #7918
    //   3189: invokespecial c : (C)V
    //   3192: goto -> 3518
    //   3195: aload #4
    //   3197: sipush #7920
    //   3200: invokespecial c : (C)V
    //   3203: goto -> 3518
    //   3206: aload #4
    //   3208: bipush #85
    //   3210: invokespecial c : (C)V
    //   3213: goto -> 3503
    //   3216: aload #4
    //   3218: sipush #259
    //   3221: invokespecial c : (C)V
    //   3224: goto -> 3518
    //   3227: aload #4
    //   3229: sipush #7855
    //   3232: invokespecial c : (C)V
    //   3235: goto -> 3518
    //   3238: aload #4
    //   3240: sipush #7857
    //   3243: invokespecial c : (C)V
    //   3246: goto -> 3518
    //   3249: aload #4
    //   3251: sipush #7859
    //   3254: invokespecial c : (C)V
    //   3257: goto -> 3518
    //   3260: aload #4
    //   3262: sipush #7861
    //   3265: invokespecial c : (C)V
    //   3268: goto -> 3518
    //   3271: aload #4
    //   3273: sipush #7863
    //   3276: invokespecial c : (C)V
    //   3279: goto -> 3518
    //   3282: aload #4
    //   3284: bipush #97
    //   3286: invokespecial c : (C)V
    //   3289: goto -> 3503
    //   3292: aload #4
    //   3294: sipush #258
    //   3297: invokespecial c : (C)V
    //   3300: goto -> 3518
    //   3303: aload #4
    //   3305: sipush #7854
    //   3308: invokespecial c : (C)V
    //   3311: goto -> 3518
    //   3314: aload #4
    //   3316: sipush #7856
    //   3319: invokespecial c : (C)V
    //   3322: goto -> 3518
    //   3325: aload #4
    //   3327: sipush #7858
    //   3330: invokespecial c : (C)V
    //   3333: goto -> 3518
    //   3336: aload #4
    //   3338: sipush #7860
    //   3341: invokespecial c : (C)V
    //   3344: goto -> 3518
    //   3347: aload #4
    //   3349: sipush #7862
    //   3352: invokespecial c : (C)V
    //   3355: goto -> 3518
    //   3358: aload #4
    //   3360: bipush #65
    //   3362: invokespecial c : (C)V
    //   3365: goto -> 3503
    //   3368: goto -> 3404
    //   3371: iconst_0
    //   3372: istore #6
    //   3374: goto -> 3404
    //   3377: iconst_1
    //   3378: istore #6
    //   3380: goto -> 3404
    //   3383: iconst_2
    //   3384: istore #6
    //   3386: goto -> 3404
    //   3389: iconst_3
    //   3390: istore #6
    //   3392: goto -> 3404
    //   3395: iconst_4
    //   3396: istore #6
    //   3398: goto -> 3404
    //   3401: iconst_5
    //   3402: istore #6
    //   3404: iload #6
    //   3406: iflt -> 3503
    //   3409: getstatic ff.j : [[C
    //   3412: pop
    //   3413: iconst_5
    //   3414: istore_2
    //   3415: goto -> 3499
    //   3418: getstatic ff.j : [[C
    //   3421: iconst_0
    //   3422: aaload
    //   3423: arraylength
    //   3424: iconst_1
    //   3425: isub
    //   3426: istore_3
    //   3427: goto -> 3492
    //   3430: iload_1
    //   3431: getstatic ff.j : [[C
    //   3434: iload_2
    //   3435: aaload
    //   3436: iload_3
    //   3437: caload
    //   3438: if_icmpne -> 3489
    //   3441: iload_2
    //   3442: iload #6
    //   3444: if_icmpne -> 3471
    //   3447: getstatic ff.j : [[C
    //   3450: iconst_0
    //   3451: aaload
    //   3452: iload_3
    //   3453: caload
    //   3454: istore_1
    //   3455: aload #4
    //   3457: iload_1
    //   3458: invokespecial c : (C)V
    //   3461: aload #4
    //   3463: iload #5
    //   3465: invokespecial d : (C)V
    //   3468: goto -> 3510
    //   3471: getstatic ff.j : [[C
    //   3474: iload #6
    //   3476: aaload
    //   3477: iload_3
    //   3478: caload
    //   3479: istore_1
    //   3480: aload #4
    //   3482: iload_1
    //   3483: invokespecial c : (C)V
    //   3486: goto -> 3518
    //   3489: iinc #3, -1
    //   3492: iload_3
    //   3493: ifge -> 3430
    //   3496: iinc #2, -1
    //   3499: iload_2
    //   3500: ifge -> 3418
    //   3503: aload #4
    //   3505: iload #5
    //   3507: invokespecial d : (C)V
    //   3510: goto -> 5508
    //   3513: aload_1
    //   3514: iload_3
    //   3515: invokespecial d : (C)V
    //   3518: goto -> 5508
    //   3521: aload_0
    //   3522: iload_1
    //   3523: istore_2
    //   3524: astore_1
    //   3525: iload_2
    //   3526: tableswitch default -> 5508, 135 -> 3632, 136 -> 5508, 137 -> 5508, 138 -> 5508, 139 -> 5508, 140 -> 5508, 141 -> 5508, 142 -> 3632, 143 -> 5508, 144 -> 5508, 145 -> 5508, 146 -> 5508, 147 -> 5508, 148 -> 3632, 149 -> 3632, 150 -> 3632, 151 -> 3632, 152 -> 3632, 153 -> 3632, 154 -> 3632, 155 -> 3632, 156 -> 3632, 157 -> 3632
    //   3632: invokestatic a : ()Z
    //   3635: ifeq -> 3749
    //   3638: iload_2
    //   3639: sipush #148
    //   3642: if_icmpne -> 3691
    //   3645: aload_1
    //   3646: getfield C : I
    //   3649: iconst_3
    //   3650: if_icmpeq -> 3691
    //   3653: aload_1
    //   3654: getfield B : Z
    //   3657: ifeq -> 3677
    //   3660: aload_1
    //   3661: bipush #48
    //   3663: invokespecial c : (C)V
    //   3666: aload_1
    //   3667: invokespecial t : ()V
    //   3670: aload_1
    //   3671: invokespecial w : ()V
    //   3674: goto -> 5508
    //   3677: aload_1
    //   3678: bipush #32
    //   3680: invokespecial d : (C)V
    //   3683: aload_1
    //   3684: iload_2
    //   3685: putfield w : I
    //   3688: goto -> 5503
    //   3691: iload_2
    //   3692: sipush #142
    //   3695: if_icmpne -> 3787
    //   3698: getstatic v.b : Z
    //   3701: ifne -> 3787
    //   3704: aload_1
    //   3705: getfield C : I
    //   3708: iconst_3
    //   3709: if_icmpeq -> 3719
    //   3712: aload_1
    //   3713: getfield B : Z
    //   3716: ifeq -> 3736
    //   3719: aload_1
    //   3720: bipush #43
    //   3722: invokespecial d : (C)V
    //   3725: aload_1
    //   3726: invokespecial t : ()V
    //   3729: aload_1
    //   3730: invokespecial w : ()V
    //   3733: goto -> 5508
    //   3736: aload_1
    //   3737: iload_2
    //   3738: putfield w : I
    //   3741: aload_1
    //   3742: iconst_1
    //   3743: putfield B : Z
    //   3746: goto -> 5508
    //   3749: iload_2
    //   3750: sipush #135
    //   3753: if_icmpne -> 3787
    //   3756: aload_1
    //   3757: dup
    //   3758: astore #5
    //   3760: bipush #32
    //   3762: invokespecial d : (C)V
    //   3765: aload #5
    //   3767: sipush #-1987
    //   3770: putfield w : I
    //   3773: aload #5
    //   3775: iconst_0
    //   3776: putfield B : Z
    //   3779: aload #5
    //   3781: invokespecial v : ()V
    //   3784: goto -> 5508
    //   3787: getstatic v.b : Z
    //   3790: ifeq -> 5282
    //   3793: invokestatic a : ()Z
    //   3796: ifeq -> 3806
    //   3799: iload_2
    //   3800: sipush #142
    //   3803: if_icmpeq -> 3819
    //   3806: invokestatic a : ()Z
    //   3809: ifne -> 5282
    //   3812: iload_2
    //   3813: sipush #148
    //   3816: if_icmpne -> 5282
    //   3819: aload_1
    //   3820: getfield u : I
    //   3823: ifle -> 5282
    //   3826: aload_1
    //   3827: getfield t : Ljava/lang/StringBuffer;
    //   3830: aload_1
    //   3831: getfield u : I
    //   3834: iconst_1
    //   3835: isub
    //   3836: invokevirtual charAt : (I)C
    //   3839: istore_3
    //   3840: aload_1
    //   3841: getfield B : Z
    //   3844: ifeq -> 5257
    //   3847: iload_3
    //   3848: dup
    //   3849: istore #5
    //   3851: istore #6
    //   3853: iload #5
    //   3855: lookupswitch default -> 5239, 65 -> 5145, 68 -> 5235, 69 -> 5191, 73 -> 5221, 79 -> 5168, 85 -> 5206, 89 -> 5228, 97 -> 5048, 100 -> 5138, 101 -> 5094, 105 -> 5124, 111 -> 5071, 117 -> 5109, 121 -> 5131, 192 -> 5145, 193 -> 5145, 194 -> 5160, 195 -> 5145, 200 -> 5191, 201 -> 5191, 202 -> 5198, 204 -> 5221, 205 -> 5221, 210 -> 5168, 211 -> 5168, 212 -> 5183, 213 -> 5168, 217 -> 5206, 218 -> 5206, 221 -> 5228, 224 -> 5048, 225 -> 5048, 226 -> 5063, 227 -> 5048, 232 -> 5094, 233 -> 5094, 234 -> 5101, 236 -> 5124, 237 -> 5124, 242 -> 5071, 243 -> 5071, 244 -> 5086, 245 -> 5071, 249 -> 5109, 250 -> 5109, 253 -> 5131, 258 -> 5152, 259 -> 5055, 272 -> 5235, 273 -> 5138, 296 -> 5221, 297 -> 5124, 360 -> 5206, 361 -> 5109, 416 -> 5175, 417 -> 5078, 431 -> 5213, 432 -> 5116, 7840 -> 5145, 7841 -> 5048, 7842 -> 5145, 7843 -> 5048, 7844 -> 5160, 7845 -> 5063, 7846 -> 5160, 7847 -> 5063, 7848 -> 5160, 7849 -> 5063, 7850 -> 5160, 7851 -> 5063, 7852 -> 5160, 7853 -> 5063, 7854 -> 5152, 7855 -> 5055, 7856 -> 5152, 7857 -> 5055, 7858 -> 5152, 7859 -> 5055, 7860 -> 5152, 7861 -> 5055, 7862 -> 5152, 7863 -> 5055, 7864 -> 5191, 7865 -> 5094, 7866 -> 5191, 7867 -> 5094, 7868 -> 5191, 7869 -> 5094, 7870 -> 5198, 7871 -> 5101, 7872 -> 5198, 7873 -> 5101, 7874 -> 5198, 7875 -> 5101, 7876 -> 5198, 7877 -> 5101, 7878 -> 5198, 7879 -> 5101, 7880 -> 5221, 7881 -> 5124, 7882 -> 5221, 7883 -> 5124, 7884 -> 5168, 7885 -> 5071, 7886 -> 5168, 7887 -> 5071, 7888 -> 5183, 7889 -> 5086, 7890 -> 5183, 7891 -> 5086, 7892 -> 5183, 7893 -> 5086, 7894 -> 5183, 7895 -> 5086, 7896 -> 5183, 7897 -> 5086, 7898 -> 5175, 7899 -> 5078, 7900 -> 5175, 7901 -> 5078, 7902 -> 5175, 7903 -> 5078, 7904 -> 5175, 7905 -> 5078, 7906 -> 5175, 7907 -> 5078, 7908 -> 5206, 7909 -> 5109, 7910 -> 5206, 7911 -> 5109, 7912 -> 5213, 7913 -> 5116, 7914 -> 5213, 7915 -> 5116, 7916 -> 5213, 7917 -> 5116, 7918 -> 5213, 7919 -> 5116, 7920 -> 5213, 7921 -> 5116, 7922 -> 5228, 7923 -> 5131, 7924 -> 5228, 7925 -> 5131, 7926 -> 5228, 7927 -> 5131, 7928 -> 5228, 7929 -> 5131
    //   5048: bipush #97
    //   5050: istore #6
    //   5052: goto -> 5239
    //   5055: sipush #259
    //   5058: istore #6
    //   5060: goto -> 5239
    //   5063: sipush #226
    //   5066: istore #6
    //   5068: goto -> 5239
    //   5071: bipush #111
    //   5073: istore #6
    //   5075: goto -> 5239
    //   5078: sipush #417
    //   5081: istore #6
    //   5083: goto -> 5239
    //   5086: sipush #244
    //   5089: istore #6
    //   5091: goto -> 5239
    //   5094: bipush #101
    //   5096: istore #6
    //   5098: goto -> 5239
    //   5101: sipush #234
    //   5104: istore #6
    //   5106: goto -> 5239
    //   5109: bipush #117
    //   5111: istore #6
    //   5113: goto -> 5239
    //   5116: sipush #432
    //   5119: istore #6
    //   5121: goto -> 5239
    //   5124: bipush #105
    //   5126: istore #6
    //   5128: goto -> 5239
    //   5131: bipush #121
    //   5133: istore #6
    //   5135: goto -> 5239
    //   5138: bipush #100
    //   5140: istore #6
    //   5142: goto -> 5239
    //   5145: bipush #65
    //   5147: istore #6
    //   5149: goto -> 5239
    //   5152: sipush #258
    //   5155: istore #6
    //   5157: goto -> 5239
    //   5160: sipush #194
    //   5163: istore #6
    //   5165: goto -> 5239
    //   5168: bipush #79
    //   5170: istore #6
    //   5172: goto -> 5239
    //   5175: sipush #416
    //   5178: istore #6
    //   5180: goto -> 5239
    //   5183: sipush #212
    //   5186: istore #6
    //   5188: goto -> 5239
    //   5191: bipush #69
    //   5193: istore #6
    //   5195: goto -> 5239
    //   5198: sipush #202
    //   5201: istore #6
    //   5203: goto -> 5239
    //   5206: bipush #85
    //   5208: istore #6
    //   5210: goto -> 5239
    //   5213: sipush #431
    //   5216: istore #6
    //   5218: goto -> 5239
    //   5221: bipush #73
    //   5223: istore #6
    //   5225: goto -> 5239
    //   5228: bipush #89
    //   5230: istore #6
    //   5232: goto -> 5239
    //   5235: bipush #68
    //   5237: istore #6
    //   5239: iload #6
    //   5241: dup
    //   5242: istore #4
    //   5244: iload_3
    //   5245: if_icmpeq -> 5282
    //   5248: aload_1
    //   5249: iload #4
    //   5251: invokespecial c : (C)V
    //   5254: goto -> 5282
    //   5257: iload_3
    //   5258: invokestatic a : (C)C
    //   5261: dup
    //   5262: istore #4
    //   5264: bipush #26
    //   5266: if_icmpeq -> 5282
    //   5269: aload_1
    //   5270: iload #4
    //   5272: invokespecial c : (C)V
    //   5275: aload_1
    //   5276: invokespecial t : ()V
    //   5279: goto -> 5503
    //   5282: aload_1
    //   5283: getfield B : Z
    //   5286: ifeq -> 5306
    //   5289: iload_2
    //   5290: aload_1
    //   5291: getfield w : I
    //   5294: if_icmpeq -> 5306
    //   5297: getstatic v.c : [I
    //   5300: iload_2
    //   5301: iconst_0
    //   5302: iastore
    //   5303: goto -> 5508
    //   5306: iload_2
    //   5307: aload_1
    //   5308: getfield w : I
    //   5311: if_icmpeq -> 5365
    //   5314: aload_1
    //   5315: iconst_m1
    //   5316: putfield s : I
    //   5319: aload_1
    //   5320: getfield w : I
    //   5323: sipush #-1987
    //   5326: if_icmpeq -> 5345
    //   5329: invokestatic a : ()Z
    //   5332: ifeq -> 5345
    //   5335: aload_1
    //   5336: getfield w : I
    //   5339: sipush #135
    //   5342: if_icmpne -> 5361
    //   5345: invokestatic a : ()Z
    //   5348: ifne -> 5365
    //   5351: aload_1
    //   5352: getfield w : I
    //   5355: sipush #142
    //   5358: if_icmpeq -> 5365
    //   5361: aload_1
    //   5362: invokespecial t : ()V
    //   5365: iload_2
    //   5366: sipush #148
    //   5369: if_icmplt -> 5379
    //   5372: iload_2
    //   5373: sipush #157
    //   5376: if_icmple -> 5382
    //   5379: goto -> 5508
    //   5382: aload_1
    //   5383: bipush #25
    //   5385: putfield x : I
    //   5388: aload_1
    //   5389: getfield r : [Ljava/lang/String;
    //   5392: iload_2
    //   5393: sipush #148
    //   5396: isub
    //   5397: aaload
    //   5398: astore_3
    //   5399: aload_1
    //   5400: aload_3
    //   5401: putfield z : Ljava/lang/String;
    //   5404: aload_1
    //   5405: getfield B : Z
    //   5408: ifeq -> 5424
    //   5411: aload_1
    //   5412: aload_3
    //   5413: invokevirtual length : ()I
    //   5416: iconst_1
    //   5417: isub
    //   5418: putfield s : I
    //   5421: goto -> 5439
    //   5424: aload_1
    //   5425: aload_1
    //   5426: getfield s : I
    //   5429: iconst_1
    //   5430: iadd
    //   5431: aload_3
    //   5432: invokevirtual length : ()I
    //   5435: irem
    //   5436: putfield s : I
    //   5439: aload_3
    //   5440: aload_1
    //   5441: getfield s : I
    //   5444: invokevirtual charAt : (I)C
    //   5447: istore #4
    //   5449: iload_2
    //   5450: aload_1
    //   5451: getfield w : I
    //   5454: if_icmpeq -> 5471
    //   5457: aload_1
    //   5458: iload #4
    //   5460: invokespecial d : (C)V
    //   5463: aload_1
    //   5464: iload_2
    //   5465: putfield w : I
    //   5468: goto -> 5477
    //   5471: aload_1
    //   5472: iload #4
    //   5474: invokespecial c : (C)V
    //   5477: aload_1
    //   5478: getfield B : Z
    //   5481: ifne -> 5492
    //   5484: aload_3
    //   5485: invokevirtual length : ()I
    //   5488: iconst_2
    //   5489: if_icmpge -> 5503
    //   5492: aload_1
    //   5493: invokespecial t : ()V
    //   5496: aload_1
    //   5497: invokespecial w : ()V
    //   5500: goto -> 5508
    //   5503: aload_1
    //   5504: iconst_1
    //   5505: putfield B : Z
    //   5508: iconst_1
    //   5509: ireturn
  }
  
  public final boolean c(int paramInt1, int paramInt2) {
    byte b = 0;
    if (this.Y != null) {
      this.Y.c(paramInt1, paramInt2);
      b = 20;
    } 
    if (m())
      this.S = false; 
    if (!this.f)
      return false; 
    if (paramInt1 > c() + b && paramInt1 < c() + e() + b && paramInt2 > d() && paramInt2 < d() + f()) {
      if (this.g) {
        ag.a();
        g(!ag.f());
      } else {
        g(true);
      } 
      return true;
    } 
    return false;
  }
  
  public final boolean g(int paramInt) {
    if (!this.g)
      return false; 
    this.B = false;
    return true;
  }
  
  private static char a(char paramChar) {
    char c = '\032';
    switch (paramChar) {
      case 'a':
        c = 'á';
        break;
      case 'á':
        c = 'à';
        break;
      case 'à':
        c = 'ả';
        break;
      case 'ả':
        c = 'ã';
        break;
      case 'ã':
        c = 'ạ';
        break;
      case 'ạ':
        c = 'a';
        break;
      case 'ă':
        c = 'ắ';
        break;
      case 'ắ':
        c = 'ằ';
        break;
      case 'ằ':
        c = 'ẳ';
        break;
      case 'ẳ':
        c = 'ẵ';
        break;
      case 'ẵ':
        c = 'ặ';
        break;
      case 'ặ':
        c = 'ă';
        break;
      case 'â':
        c = 'ấ';
        break;
      case 'ấ':
        c = 'ầ';
        break;
      case 'ầ':
        c = 'ẩ';
        break;
      case 'ẩ':
        c = 'ẫ';
        break;
      case 'ẫ':
        c = 'ậ';
        break;
      case 'ậ':
        c = 'â';
        break;
      case 'o':
        c = 'ó';
        break;
      case 'ó':
        c = 'ò';
        break;
      case 'ò':
        c = 'ỏ';
        break;
      case 'ỏ':
        c = 'õ';
        break;
      case 'õ':
        c = 'ọ';
        break;
      case 'ọ':
        c = 'o';
        break;
      case 'ơ':
        c = 'ớ';
        break;
      case 'ớ':
        c = 'ờ';
        break;
      case 'ờ':
        c = 'ở';
        break;
      case 'ở':
        c = 'ỡ';
        break;
      case 'ỡ':
        c = 'ợ';
        break;
      case 'ợ':
        c = 'ơ';
        break;
      case 'ô':
        c = 'ố';
        break;
      case 'ố':
        c = 'ồ';
        break;
      case 'ồ':
        c = 'ổ';
        break;
      case 'ổ':
        c = 'ỗ';
        break;
      case 'ỗ':
        c = 'ộ';
        break;
      case 'ộ':
        c = 'ô';
        break;
      case 'e':
        c = 'é';
        break;
      case 'é':
        c = 'è';
        break;
      case 'è':
        c = 'ẻ';
        break;
      case 'ẻ':
        c = 'ẽ';
        break;
      case 'ẽ':
        c = 'ẹ';
        break;
      case 'ẹ':
        c = 'e';
        break;
      case 'ê':
        c = 'ế';
        break;
      case 'ế':
        c = 'ề';
        break;
      case 'ề':
        c = 'ể';
        break;
      case 'ể':
        c = 'ễ';
        break;
      case 'ễ':
        c = 'ệ';
        break;
      case 'ệ':
        c = 'ê';
        break;
      case 'u':
        c = 'ú';
        break;
      case 'ú':
        c = 'ù';
        break;
      case 'ù':
        c = 'ủ';
        break;
      case 'ủ':
        c = 'ũ';
        break;
      case 'ũ':
        c = 'ụ';
        break;
      case 'ụ':
        c = 'u';
        break;
      case 'ư':
        c = 'ứ';
        break;
      case 'ứ':
        c = 'ừ';
        break;
      case 'ừ':
        c = 'ử';
        break;
      case 'ử':
        c = 'ữ';
        break;
      case 'ữ':
        c = 'ự';
        break;
      case 'ự':
        c = 'ư';
        break;
      case 'i':
        c = 'í';
        break;
      case 'í':
        c = 'ì';
        break;
      case 'ì':
        c = 'ỉ';
        break;
      case 'ỉ':
        c = 'ĩ';
        break;
      case 'ĩ':
        c = 'ị';
        break;
      case 'ị':
        c = 'i';
        break;
      case 'y':
        c = 'ý';
        break;
      case 'ý':
        c = 'ỳ';
        break;
      case 'ỳ':
        c = 'ỷ';
        break;
      case 'ỷ':
        c = 'ỹ';
        break;
      case 'ỹ':
        c = 'ỵ';
        break;
      case 'ỵ':
        c = 'y';
        break;
      case 'd':
        c = 'đ';
        break;
      case 'đ':
        c = 'd';
        break;
      case 'A':
        c = 'Á';
        break;
      case 'Á':
        c = 'À';
        break;
      case 'À':
        c = 'Ả';
        break;
      case 'Ả':
        c = 'Ã';
        break;
      case 'Ã':
        c = 'Ạ';
        break;
      case 'Ạ':
        c = 'A';
        break;
      case 'Ă':
        c = 'Ắ';
        break;
      case 'Ắ':
        c = 'Ằ';
        break;
      case 'Ằ':
        c = 'Ẳ';
        break;
      case 'Ẳ':
        c = 'Ẵ';
        break;
      case 'Ẵ':
        c = 'Ặ';
        break;
      case 'Ặ':
        c = 'Ă';
        break;
      case 'Â':
        c = 'Ấ';
        break;
      case 'Ấ':
        c = 'Ầ';
        break;
      case 'Ầ':
        c = 'Ẩ';
        break;
      case 'Ẩ':
        c = 'Ẫ';
        break;
      case 'Ẫ':
        c = 'Ậ';
        break;
      case 'Ậ':
        c = 'Â';
        break;
      case 'O':
        c = 'Ó';
        break;
      case 'Ó':
        c = 'Ò';
        break;
      case 'Ò':
        c = 'Ỏ';
        break;
      case 'Ỏ':
        c = 'Õ';
        break;
      case 'Õ':
        c = 'Ọ';
        break;
      case 'Ọ':
        c = 'O';
        break;
      case 'Ơ':
        c = 'Ớ';
        break;
      case 'Ớ':
        c = 'Ờ';
        break;
      case 'Ờ':
        c = 'Ở';
        break;
      case 'Ở':
        c = 'Ỡ';
        break;
      case 'Ỡ':
        c = 'Ợ';
        break;
      case 'Ợ':
        c = 'Ơ';
        break;
      case 'Ô':
        c = 'Ố';
        break;
      case 'Ố':
        c = 'Ồ';
        break;
      case 'Ồ':
        c = 'Ổ';
        break;
      case 'Ổ':
        c = 'Ỗ';
        break;
      case 'Ỗ':
        c = 'Ộ';
        break;
      case 'Ộ':
        c = 'Ô';
        break;
      case 'E':
        c = 'É';
        break;
      case 'É':
        c = 'È';
        break;
      case 'È':
        c = 'Ẻ';
        break;
      case 'Ẻ':
        c = 'Ẽ';
        break;
      case 'Ẽ':
        c = 'Ẹ';
        break;
      case 'Ẹ':
        c = 'E';
        break;
      case 'Ê':
        c = 'Ế';
        break;
      case 'Ế':
        c = 'Ề';
        break;
      case 'Ề':
        c = 'Ể';
        break;
      case 'Ể':
        c = 'Ễ';
        break;
      case 'Ễ':
        c = 'Ệ';
        break;
      case 'Ệ':
        c = 'Ê';
        break;
      case 'U':
        c = 'Ú';
        break;
      case 'Ú':
        c = 'Ù';
        break;
      case 'Ù':
        c = 'Ủ';
        break;
      case 'Ủ':
        c = 'Ũ';
        break;
      case 'Ũ':
        c = 'Ụ';
        break;
      case 'Ụ':
        c = 'U';
        break;
      case 'Ư':
        c = 'Ứ';
        break;
      case 'Ứ':
        c = 'Ừ';
        break;
      case 'Ừ':
        c = 'Ử';
        break;
      case 'Ử':
        c = 'Ữ';
        break;
      case 'Ữ':
        c = 'Ự';
        break;
      case 'Ự':
        c = 'Ư';
        break;
      case 'I':
        c = 'Í';
        break;
      case 'Í':
        c = 'Ì';
        break;
      case 'Ì':
        c = 'Ỉ';
        break;
      case 'Ỉ':
        c = 'Ĩ';
        break;
      case 'Ĩ':
        c = 'Ị';
        break;
      case 'Ị':
        c = 'I';
        break;
      case 'Y':
        c = 'Ý';
        break;
      case 'Ý':
        c = 'Ỳ';
        break;
      case 'Ỳ':
        c = 'Ỷ';
        break;
      case 'Ỷ':
        c = 'Ỹ';
        break;
      case 'Ỹ':
        c = 'Ỵ';
        break;
      case 'Ỵ':
        c = 'Y';
        break;
      case 'D':
        c = 'Đ';
        break;
      case 'Đ':
        c = 'D';
        break;
    } 
    return c;
  }
  
  private char b(char paramChar) {
    if (this.h == null)
      return paramChar; 
    this.ac.a(paramChar);
    this.h.a(this.ac);
    return this.ac.a();
  }
  
  private void c(char paramChar) {
    if (this.t.length() <= 0 || this.u <= 0)
      return; 
    if ((paramChar = b(paramChar)) != '\032') {
      this.t.setCharAt(this.u - 1, paramChar);
      w();
    } 
  }
  
  private void d(char paramChar) {
    if ((paramChar = b(paramChar)) != '\032') {
      if (this.t.length() + 1 > this.M) {
        this.t.delete(this.M - 1, this.t.length());
        if (this.u > this.t.length())
          this.u = this.t.length(); 
      } 
      if (this.u <= this.t.length()) {
        this.t.insert(this.u, paramChar);
      } else {
        this.t.append(paramChar);
      } 
      this.u++;
      w();
    } 
  }
  
  private void w() {
    int i = e() - ((this.Y != null) ? 20 : 0);
    this.J = "";
    if (this.H == 1) {
      int k;
      for (k = this.u - 2; k >= 0; k--)
        this.J = String.valueOf(this.J) + "*"; 
      if (this.u > 0)
        if (this.x > 0) {
          this.J = String.valueOf(this.J) + this.t.charAt(this.u - 1);
        } else {
          this.J = String.valueOf(this.J) + "*";
        }  
      for (k = this.t.length() - 1; k >= this.u; k--)
        this.J = String.valueOf(this.J) + "*"; 
    } else {
      this.J = this.t.toString();
    } 
    String str;
    if ((str = this.J) == null)
      str = ""; 
    int j = this.v.a(str);
    if (this.E < 0 && this.v.a(str) + this.E < i - 4 - 3)
      this.E = i - j; 
    this.G = this.v.a(str.substring(0, this.u));
    if (this.E + this.G <= 0) {
      this.E = -this.G;
      this.E += 8;
    } else if (this.E + this.G >= i - 4 - 3) {
      this.E = i - this.G - 8;
    } 
    if (this.E > 0)
      this.E = 0; 
    if (this.G <= 0)
      this.G = -1; 
    if (this.S) {
      this.V = this.W = 0;
      if (this.t.length() <= 0 || this.T >= this.t.length())
        return; 
      int k = this.T;
      int m = this.U;
      if (k < 0)
        k = 0; 
      if (k + m > this.t.length())
        m = this.t.length() - k; 
      if (k == 0) {
        this.V = 0;
      } else {
        this.V = this.v.a(str.substring(0, k));
      } 
      if (k + m >= str.length()) {
        this.W = j;
      } else {
        this.W = this.V + this.v.a(str.substring(k, k + m));
      } 
      this.V += this.E;
      this.W += this.E;
      i -= 8;
      if (this.V < 0)
        this.V = 0; 
      if (this.W > i)
        this.W = i; 
    } 
  }
  
  public final void n() {
    if (this.x > 0) {
      this.x--;
      if (this.x == 0)
        t(); 
    } 
    if (this.y > 0) {
      this.y--;
      if (this.x == 0 && this.b != null)
        this.b.c(true); 
    } 
    if (!this.g)
      return; 
    if (this.F < 12) {
      this.F++;
      return;
    } 
    this.F = 0;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.e)
      return; 
    int i = (this.Y != null) ? 20 : 0;
    int j = c() + paramInt1 + i;
    int k = d() + paramInt2;
    int n = k;
    int m = j;
    Graphics graphics = paramGraphics;
    ff ff1 = this;
    pc.a(graphics, m, n, ff1.e() - ((ff1.Y != null) ? 20 : 0), ff1.f(), (ff1.g && ff1.f));
    n = k;
    m = j;
    graphics = paramGraphics;
    if ((ff1 = this).W > ff1.V && ff1.S && ff1.m()) {
      int i3 = m + 4 + ff1.V;
      int i4 = n + (ff1.d.d - ff1.v.a() >> 1);
      graphics.setColor(ff1.X);
      graphics.fillRect(i3, i4, ff1.W - ff1.V, ff1.v.a());
    } 
    cw.a(paramGraphics);
    cw.a(paramGraphics, j + 4, k, e() - 4 - 4 - i, f());
    n = k;
    m = j;
    graphics = paramGraphics;
    ff1 = this;
    int i1 = m + 4 + ff1.E;
    int i2 = n + (ff1.d.d - ff1.v.a() >> 1);
    if (ff1.J == null || ff1.J.equals("")) {
      if (ff1.Z.length() > 0) {
        bx.d.a(true);
        bx.d.a(graphics, ff1.Z, i1, i2, 0);
        bx.d.a(false);
      } 
    } else if (ff1.H == 1) {
      if (ff1.x <= 0) {
        ff1.v.a(graphics, ff1.J, i1, i2 + 3, 0);
      } else if (ff1.J.length() > 0) {
        String str;
        if (!i.b(str = ff1.J.substring(0, ff1.J.length() - 1)))
          ff1.v.a(graphics, str, i1, i2 + 3, 0); 
        int i3 = ff1.v.a(str);
        ff1.v.a(graphics, (new StringBuffer(String.valueOf(ff1.J.charAt(ff1.J.length() - 1)))).toString(), i1 + i3, i2, 0);
      } 
    } else {
      ff1.v.a(graphics, ff1.J, i1, i2, 0);
    } 
    cw.b(paramGraphics);
    n = k;
    m = j;
    graphics = paramGraphics;
    if ((ff1 = this).L != null && ff1.L.length() > 0) {
      ff1.v.c(false);
      ff1.v.a(graphics, ff1.L, m + 2, n - ff1.v.a() - 4, 0);
      ff1.v.c(false);
    } 
    n = k;
    m = j;
    graphics = paramGraphics;
    if ((!(ff1 = this).S || ff1.W <= ff1.V) && ff1.m()) {
      i1 = m + 4 + ff1.E;
      i2 = n + (ff1.d.d - ff1.v.a() >> 1);
      i = ff1.e() - ((ff1.Y != null) ? 20 : 0);
      if (ff1.g) {
        if (ff1.F < 6) {
          i1 += ff1.G;
          graphics.setColor(16711680);
          graphics.drawLine(i1, i2, i1, i2 + ff1.v.a() - 2);
        } 
        if (ff1.x > 0) {
          int i3 = ff1.v.a(ff1.z) + 6;
          j = ff1.v.a() + 6;
          k = m + i - i3;
          i1 = n - j;
          cw.b(graphics, ff1.O, k, i1, i3, j - 2);
          graphics.setColor(ff1.O);
          graphics.fillRect(k + 1, i1 + 1, i3 - 2, j - 4);
          graphics.setColor(0);
          cw.b(graphics, 0, m + i - i3, i1, i3, j - 2);
          graphics.setColor(ff1.N);
          n = ff1.v.a(ff1.z.substring(0, ff1.s));
          graphics.fillRect(k + 3 + n, i1 + 2, ff1.v.a(ff1.z.charAt(ff1.s)) - 1, j - 6);
          ff1.v.a(graphics, ff1.z, k + 3, i1 + 2, 0);
        } else if (ff1.y > 0) {
          String str = ff1.A;
          j = ff1.v.a(str) + 6;
          k = ff1.v.a() + 6;
          i1 = m + i - j;
          n -= k;
          cw.b(graphics, ff1.O, i1, n, j, k - 2);
          graphics.setColor(ff1.O);
          graphics.fillRect(i1 + 1, n + 1, j - 2, k - 4);
          cw.b(graphics, 0, m + i - j, n, j, k - 2);
          ff1.v.a(graphics, str, i1 + 3, n + 2, 0);
        } else if (ff1.ab) {
          ff ff2;
          String str = (new StringBuffer(String.valueOf((ff2 = ff1).M - ff2.t.length()))).toString();
          int i3 = ff1.v.a(str);
          k = ff1.v.a();
          i1 = m + i - i3;
          n -= k;
          ff1.v.a(graphics, str, i1, n, 0);
        } 
      } 
    } 
    if (this.Y != null)
      this.Y.a(paramGraphics, paramInt1, paramInt2); 
  }
  
  public final void j(int paramInt) {
    this.I = paramInt;
    if (paramInt == 4) {
      i(3);
      this.y = 0;
    } else if (paramInt == 2) {
      i(1);
      this.y = 0;
    } 
    if (this.H == 1) {
      i(0);
      this.P = true;
      this.y = 0;
    } 
  }
  
  public final void k(int paramInt) {
    this.H = paramInt;
  }
  
  public final void d(int paramInt1, int paramInt2) {
    switch (paramInt2) {
      case -8882:
        ag.b().e(241224);
        return;
      case -8881:
        if (this.Q != null) {
          b(this.Q.t());
          ag.b().e(241224);
          return;
        } 
        break;
      case -3:
        if (this.Q == null) {
          this.Q = new hp((byte)1);
          this.Q.a(this);
        } 
        this.Y.d(false);
        ag.b().a(this.Q, false);
        break;
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ff.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */