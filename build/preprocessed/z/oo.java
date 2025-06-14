import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class oo extends fb implements bf, bg, bu {
  private Image p;
  
  private ay q;
  
  private String r;
  
  private int s = -1;
  
  private boolean t;
  
  private boolean u;
  
  private int[] v;
  
  private fu w;
  
  private int x;
  
  private String[] y = new String[] { "Bạn đang làm gì?", "Bạn đang nghĩ gì?", "Hôm nay có gì HOT?", "Ngoài trời đang...?", "Bạn đang xem gì?", "Hôm nay có gì vui?", "Nếu có 1 điều ước..." };
  
  public oo(int paramInt1, int paramInt2, String paramString) {
    super(108, 6, paramString, false);
    a(0, 0, 100, 100);
    this.q = new ay(0);
    this.q.h(1);
    this.q.a(0, 0, v.t, v.u - ba.a);
    this.q.b(this);
    a(new ba());
    a(new gb(-1, 0));
    b(new gb(-2, 1));
    c(a.n);
    a(this);
    this.v = null;
  }
  
  public final void a(String paramString) {
    if (a.m != null) {
      int i;
      if (pd.b(i = paramString.hashCode())) {
        this.r = paramString;
        j(i);
        return;
      } 
      du.a().b(paramString, (short)this.i);
    } 
  }
  
  private void j(int paramInt) {
    byte[] arrayOfByte;
    if ((arrayOfByte = pd.c(paramInt)) != null) {
      ee ee = new ee();
      int i = m.c(arrayOfByte);
      ee.a(i.a(arrayOfByte, 4, i));
      ee.h = new byte[arrayOfByte.length - 4 - i];
      System.arraycopy(arrayOfByte, i + 4, ee.h, 0, ee.h.length);
      a(ee);
    } 
  }
  
  public final void a(ee paramee) {
    this.v = null;
    this.p = null;
    this.s = -1;
    this.t = this.u = false;
    try {
      this.r = paramee.a();
      this.p = f.a(paramee.h);
      this.q.o();
      if (a.m != null) {
        a a = a.m.p.p;
        for (byte b = 0; b < a.d(); b++) {
          ee ee1;
          if ((ee1 = (ee)a.b(b)).a().equals(paramee.a())) {
            this.s = b;
            break;
          } 
        } 
        a.m.e(true);
        return;
      } 
    } catch (OutOfMemoryError outOfMemoryError) {
      this.p = null;
      this.r = null;
      if (a.m != null) {
        a.m.D();
        System.gc();
        a.m.e_();
      } 
    } 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!k())
      return; 
    if (this.p != null) {
      if (this.p.getWidth() < v.t || this.p.getHeight() < v.u) {
        paramGraphics.setColor(16777215);
        paramGraphics.fillRect(0, 0, v.t, v.u);
      } 
      k k = this.q.q();
      if (!this.t && !this.u) {
        paramGraphics.drawImage(this.p, -k.a, -k.b, 0);
      } else {
        if (this.t && this.u) {
          paramInt2 = 1;
        } else if (this.t) {
          paramInt2 = 2;
        } else {
          paramInt2 = 3;
        } 
        paramGraphics.drawRegion(this.p, 0, 0, this.p.getWidth(), this.p.getHeight(), paramInt2, -k.a, -k.b, 0);
      } 
      if (this.s > 0)
        a.h.a(paramGraphics, "<*", 0, (v.u - ba.a) / 2, 0); 
      if (this.s >= 0 && this.s < a.m.p.p.d() - 1)
        a.h.a(paramGraphics, "#>", v.t, (v.u - ba.a) / 2, 2); 
    } else {
      paramGraphics.setColor(16777215);
      paramGraphics.fillRect(0, 0, v.t, v.u);
      bx.d.c(true);
      bx.d.a(paramGraphics, "Chọn hình muốn xem!", v.t / 2, v.u / 2 - ba.a, 1);
      bx.d.c();
    } 
    this.c = false;
  }
  
  public final boolean f(int paramInt) {
    if (this.s >= 0) {
      if (paramInt == 142 && this.s > 0) {
        this.s--;
        a(((ee)a.m.p.p.b(this.s)).a());
        return true;
      } 
      if (paramInt == 135 && this.s < a.m.p.p.d() - 1) {
        this.s++;
        a(((ee)a.m.p.p.b(this.s)).a());
        return true;
      } 
    } 
    return super.f(paramInt);
  }
  
  public final boolean c(int paramInt1, int paramInt2) {
    if (this.s < 0)
      return false; 
    k k = this.q.r();
    paramInt1 -= k.a;
    paramInt2 -= k.b;
    int i = (v.u - ba.a) / 2 - 30;
    if (paramInt2 >= i && paramInt2 <= i + 60) {
      if (paramInt1 < 40) {
        f(142);
        return true;
      } 
      if (paramInt1 > v.t - 40) {
        f(135);
        return true;
      } 
    } 
    return super.c(paramInt1, paramInt2);
  }
  
  public final void x() {
    this.q.c(true);
  }
  
  public final void y() {
    this.p = null;
  }
  
  private static void a(String paramString1, String paramString2, int paramInt) {
    du.a().b(paramString1, paramString2, (short)paramInt);
    a.E();
  }
  
  public final void d(int paramInt1, int paramInt2) {
    he he;
    aq aq;
    hp hp;
    String str;
    bs bs;
    int i;
    switch (paramInt2) {
      case 9991:
        if ((he = (he)a.s().d(-989858)) == null) {
          a("", (String)null, -1);
          return;
        } 
        str = ((ff)he.e(1)).r().toLowerCase().trim();
        i = -1;
        if ((aq = he.e(4)) != null && aq instanceof fu)
          i = ((fu)aq).r() + 1; 
        if (!i.b(str)) {
          a(str, this.r, (short)i);
        } else {
          a.t("Bạn chưa nhập nội dung ME");
          return;
        } 
        this.w = null;
        this.x = 0;
        a.s().a(-989858, false);
        return;
      case 9992:
        this.w = null;
        this.x = 0;
        a.s().a(-989858, false);
        return;
      case 9993:
        (hp = new hp((byte)2)).e(this.w.r());
        hp.f(this.x);
        hp.w();
        hp.a(this);
        ag.b().a(hp, false);
        return;
      case -8882:
        ag.b().e(999999223);
        return;
      case -8881:
        hp = (hp)a.s().d(999999223);
        if (this.w != null && hp != null && oy.f != null) {
          this.x = hp.v();
          this.w.a(oy.f);
          this.w.h(this.x);
          this.w.b(oy.a[this.x], oy.b[this.x], oy.c[this.x], oy.d[this.x]);
          hp.e(this.x);
          ag.b().e(999999223);
          return;
        } 
        return;
      case -8883:
        if ((hp = (hp)a.s().d(999999223)) != null) {
          hp.u();
          this.w.a((Image)null);
          this.w.h(-1);
        } 
        ag.b().e(999999223);
        return;
    } 
    if (str == -1) {
      br[] arrayOfBr;
      oo oo1 = this;
      (bs = new bs()).a(new gb(1, 2));
      bs.b(new gb(2, 3));
      br br1;
      (br1 = new br("Lật", 10802)).a(new br[] { new br("Dọc", 10801), new br("Ngang", 10803), new br("Thông thường", 10800) });
      br br2;
      (br2 = new br("Thao tác", 10804)).a(new br[] { new br("Gửi Me", 10809), new br("Gửi tiếp", 10805), new br("Chép nội dung", 10806) });
      if (oo1.v != null && oo1.v.length > 0) {
        br br = new br("Hình đã tải", 10807);
        br[] arrayOfBr1 = new br[oo1.v.length];
        for (byte b = 0; b < arrayOfBr1.length; b++)
          arrayOfBr1[b] = new br("Hình " + (b + 1), 10807); 
        br.a(arrayOfBr1);
        arrayOfBr = new br[] { br1, br, br2, new br("Đóng", 10808) };
      } else {
        arrayOfBr = new br[] { (br)arrayOfBr, br2, new br("Đóng", 10808) };
      } 
      if (a.m != null) {
        arrayOfBr = a.m.a(arrayOfBr, arrayOfBr.length - 1);
        arrayOfBr = oi.b(arrayOfBr, arrayOfBr.length - 1);
      } 
      bs.a(arrayOfBr);
      int j = (bs.e() > bs.f()) ? bs.e() : bs.f();
      bs.a_(-j, v.u);
      bs.d(0, v.u - ba.a - bs.f());
      bs.a(oo1);
      oo1.a(bs);
      return;
    } 
    if (bs == -2) {
      if (a.m != null && a.m.l() != null) {
        fc fc;
        (fc = (fc)a.m.l()).a();
        return;
      } 
    } else {
      if (bs == 2) {
        t();
        return;
      } 
      if (bs == true)
        this.l.f(95); 
    } 
  }
  
  public final void a(int paramInt1, int paramInt2, Object paramObject) {
    // Byte code:
    //   0: aload_3
    //   1: ifnonnull -> 5
    //   4: return
    //   5: aload_3
    //   6: checkcast br
    //   9: astore_1
    //   10: iload_2
    //   11: lookupswitch default -> 394, 10800 -> 165, 10801 -> 108, 10802 -> 135, 10803 -> 138, 10804 -> 186, 10805 -> 189, 10806 -> 267, 10807 -> 297, 10808 -> 349, 10809 -> 201, 11399 -> 374
    //   108: aload_0
    //   109: aload_0
    //   110: getfield u : Z
    //   113: ifeq -> 120
    //   116: iconst_0
    //   117: goto -> 121
    //   120: iconst_1
    //   121: putfield u : Z
    //   124: aload_0
    //   125: getfield q : Lay;
    //   128: iconst_1
    //   129: invokevirtual c : (Z)V
    //   132: goto -> 408
    //   135: goto -> 408
    //   138: aload_0
    //   139: aload_0
    //   140: getfield t : Z
    //   143: ifeq -> 150
    //   146: iconst_0
    //   147: goto -> 151
    //   150: iconst_1
    //   151: putfield t : Z
    //   154: aload_0
    //   155: getfield q : Lay;
    //   158: iconst_1
    //   159: invokevirtual c : (Z)V
    //   162: goto -> 408
    //   165: aload_0
    //   166: aload_0
    //   167: iconst_0
    //   168: dup_x1
    //   169: putfield t : Z
    //   172: putfield u : Z
    //   175: aload_0
    //   176: getfield q : Lay;
    //   179: iconst_1
    //   180: invokevirtual c : (Z)V
    //   183: goto -> 408
    //   186: goto -> 408
    //   189: ldc 'Nhập nick muốn gửi'
    //   191: aload_0
    //   192: getfield r : Ljava/lang/String;
    //   195: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)V
    //   198: goto -> 408
    //   201: aload_0
    //   202: aload_0
    //   203: getfield y : [Ljava/lang/String;
    //   206: aload_0
    //   207: getfield y : [Ljava/lang/String;
    //   210: arraylength
    //   211: invokestatic a : (I)I
    //   214: aaload
    //   215: astore_2
    //   216: astore_1
    //   217: aload_2
    //   218: aconst_null
    //   219: ldc 'Xong'
    //   221: sipush #9991
    //   224: ldc 'Hủy'
    //   226: sipush #9992
    //   229: sipush #9993
    //   232: aload_1
    //   233: invokestatic a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IILbf;)Lhe;
    //   236: dup
    //   237: astore_2
    //   238: ldc -989858
    //   240: invokevirtual b : (I)V
    //   243: aload_1
    //   244: aload_2
    //   245: iconst_4
    //   246: invokevirtual e : (I)Laq;
    //   249: checkcast fu
    //   252: putfield w : Lfu;
    //   255: aload_2
    //   256: astore_1
    //   257: invokestatic b : ()Lah;
    //   260: aload_1
    //   261: invokevirtual a : (Lal;)V
    //   264: goto -> 408
    //   267: new java/lang/StringBuffer
    //   270: dup
    //   271: ldc '#'
    //   273: invokespecial <init> : (Ljava/lang/String;)V
    //   276: aload_0
    //   277: getfield r : Ljava/lang/String;
    //   280: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   283: ldc '#'
    //   285: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   288: invokevirtual toString : ()Ljava/lang/String;
    //   291: putstatic ff.i : Ljava/lang/String;
    //   294: goto -> 408
    //   297: aload_1
    //   298: invokevirtual b : ()Ljava/lang/String;
    //   301: bipush #32
    //   303: invokevirtual lastIndexOf : (I)I
    //   306: dup
    //   307: istore_2
    //   308: iflt -> 408
    //   311: aload_1
    //   312: invokevirtual b : ()Ljava/lang/String;
    //   315: iload_2
    //   316: iconst_1
    //   317: iadd
    //   318: invokevirtual substring : (I)Ljava/lang/String;
    //   321: invokestatic parseInt : (Ljava/lang/String;)I
    //   324: dup
    //   325: istore_1
    //   326: aload_0
    //   327: getfield v : [I
    //   330: arraylength
    //   331: if_icmpgt -> 408
    //   334: aload_0
    //   335: aload_0
    //   336: getfield v : [I
    //   339: iload_1
    //   340: iconst_1
    //   341: isub
    //   342: iaload
    //   343: invokespecial j : (I)V
    //   346: goto -> 408
    //   349: aload_0
    //   350: aconst_null
    //   351: putfield p : Ljavax/microedition/lcdui/Image;
    //   354: aload_0
    //   355: aconst_null
    //   356: putfield r : Ljava/lang/String;
    //   359: getstatic com/mg/sq/a.m : Loi;
    //   362: ifnull -> 408
    //   365: getstatic com/mg/sq/a.m : Loi;
    //   368: invokevirtual D : ()V
    //   371: goto -> 408
    //   374: getstatic com/mg/sq/a.m : Loi;
    //   377: ifnull -> 408
    //   380: getstatic com/mg/sq/a.m : Loi;
    //   383: aload_1
    //   384: invokevirtual b : ()Ljava/lang/String;
    //   387: invokevirtual b : (Ljava/lang/String;)Z
    //   390: pop
    //   391: goto -> 408
    //   394: getstatic com/mg/sq/a.m : Loi;
    //   397: ifnull -> 408
    //   400: getstatic com/mg/sq/a.m : Loi;
    //   403: iload_2
    //   404: invokevirtual j : (I)Z
    //   407: pop
    //   408: aload_0
    //   409: invokevirtual t : ()V
    //   412: return
  }
  
  public final void a() {
    this.s = -1;
    this.q.c(true);
  }
  
  public final g v() {
    int i = v.t;
    int j = v.u - ba.a;
    if (this.p != null) {
      if (this.p.getHeight() > j)
        j = this.p.getHeight(); 
      if (this.p.getWidth() > i)
        i = this.p.getWidth(); 
    } 
    return new g(i, j);
  }
  
  public final int w() {
    return 10;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\oo.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */