import com.mg.smsgame.MGMIDlet;
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class oa extends an implements bf, ik {
  public boolean a = false;
  
  private ns m;
  
  private fc n;
  
  public static byte[][] b;
  
  public static jn c;
  
  public static boolean d;
  
  private ks o;
  
  public ol k;
  
  private or p;
  
  private boolean q;
  
  private boolean r;
  
  private boolean s;
  
  public String l;
  
  private boolean t = false;
  
  private byte u = 0;
  
  private boolean v = true;
  
  private final a w;
  
  public oa() {
    super(1);
    ct.b("Initializing platform");
    a((ba)null);
    a(this);
    f(true);
    a(false);
    d(false);
    this.w = a.s();
    try {
      B();
    } catch (OutOfMemoryError outOfMemoryError2) {
      OutOfMemoryError outOfMemoryError1;
      (outOfMemoryError1 = null).printStackTrace();
      if (a.m != null)
        a.m.G(); 
      System.gc();
      this.v = false;
      try {
        B();
      } catch (OutOfMemoryError outOfMemoryError) {
        ct.a("[platformscreen contructor] outof memory");
        this.w.j(1);
      } catch (Exception exception) {
        outOfMemoryError1.printStackTrace();
      } 
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      this.w.j(6);
    } 
    this.w.c();
    if (this.v && a.m != null) {
      e();
    } else {
      pc.a();
    } 
    if (a.l != null && a.l.length > 0) {
      a.b(a.l);
      a.l = null;
    } 
    if (ct.c())
      ct.b("Platform initialized"); 
  }
  
  private void B() {
    this.n = new fc(1, 2, 3);
    this.n.a(this);
    b(1);
    this.o = ks.a();
    this.k = new ol(100, 0, "Bản Đồ", this);
    this.n.c(this.k);
    this.w.v();
    if (!co.b().f())
      a.a(this); 
  }
  
  public final void e() {
    try {
      if (a.m != null && a.o) {
        this.n.c(a.m);
        a.m.C();
      } 
      oi.w();
      if (a.o) {
        a.m.g(false);
        return;
      } 
    } catch (OutOfMemoryError outOfMemoryError) {
      oi.v();
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
    } 
  }
  
  public final void f() {
    if (!d)
      return; 
    if (hs.q != null || hs.p != null) {
      hs hs1;
      (hs1 = new hs(1, go.k)).a(this);
      hs1.a(new bd("Đóng", 113));
      az az = null;
      hs hs2;
      (hs2 = hs1).a(az, true);
      az = null;
      (hs2 = hs1).b(az, true);
      this.w.a(hs1);
    } 
  }
  
  protected final void a(Graphics paramGraphics) {
    this.n.a(paramGraphics, 0, 0);
  }
  
  protected final void c() {
    this.n.n();
  }
  
  public final void d(int paramInt1, int paramInt2) {
    ol ol1;
    hh hh;
    switch (paramInt2) {
      case 125:
        if (this.k != null && (ol1 = this.k).p != null && ol1.p.b() == 3)
          ((os)ol1.p).s(); 
        os.l = null;
        this.w.a(false);
        a.s().a(null, null);
        pa.a().a(go.w, this);
        return;
      case 11:
        this.w.e(-241229);
        this.r = false;
        C();
        if (go.k.G != hs.l) {
          a.G();
          if (this.k != null) {
            hs.l = go.k.G;
            return;
          } 
        } 
        break;
      case 113:
        this.w.e(-241219);
        u();
        if (!this.r) {
          C();
          if (go.k.G != hs.l) {
            a.G();
            this.o.o();
            this.s = true;
            hs.l = go.k.G;
            if (this.k != null && (ol1 = this.k).p instanceof om)
              ((om)ol1.p).t(); 
          } 
        } 
        if (this.k != null && (ol1 = this.k).p instanceof om)
          ((om)ol1.p).s(); 
        hs.t();
        return;
      case 114:
        this.w.e(-241439);
        return;
      case 12:
        this.w.a(false);
        return;
      case 10:
        a.s().a(true, null);
        this.t = true;
        return;
      case 13:
        a.s().a(false, null);
        return;
      case 122:
        this.w.e(199199);
        return;
      case 120:
        if (go.v != null && go.v.length > 0)
          for (byte b = 0; b < go.v.length; b++)
            go.a(go.v[b], (go.v[b]).g);  
        this.w.e(-241439);
        return;
      case 121:
        this.w.a(false);
        a.s().a(null, null);
        ks.a().f(this.l);
        return;
      case 123:
        this.w.l();
        this.o.a(true);
        return;
      case 124:
        this.w.a(false);
        this.o.a(false);
        return;
      case 127:
        this.w.a(false);
        (hh = (hh)v()).i(this.u);
        if (!this.a) {
          this.a = true;
          return;
        } 
        break;
      case 2:
        c(this.n.i);
        this.n.s();
        return;
      case 1:
        if (a.m != null && a.m.A() != null && this.n.b(a.m.A())) {
          this.n.a(a.m.A());
          return;
        } 
        break;
      case 3:
        if (a.m != null && a.m.z() != null && this.n.b(a.m.z())) {
          this.n.a(a.m.z());
          return;
        } 
        break;
      case 99030:
        if (this.k != null)
          this.k.j(2); 
        break;
    } 
  }
  
  public final void a(String paramString, int paramInt1, int paramInt2) {
    oa oa1;
    String str;
    if (this.k != null && this.k.p instanceof om)
      ((om)this.k.p).n = null; 
    switch (paramInt2) {
      case 1:
        hs.k = go.k.J;
        hs.l = go.k.G;
        return;
      case 0:
        go.x = paramInt1;
        go.w = paramString;
        if (paramString.equals("M99")) {
          f(4);
          return;
        } 
        str = paramString;
        oa1 = this;
        System.gc();
        try {
          a.s().a(null, null, 3000);
          oa1.w.a(5, new Object[] { str });
          return;
        } catch (Exception exception) {
          (oa1 = null).printStackTrace();
          break;
        } 
    } 
  }
  
  private void f(int paramInt) {
    try {
      this.n.r();
      System.gc();
      this.w.f(4);
      this.w.l();
    } catch (Exception exception) {
      ct.b("out memmory");
      ct.a(exception.toString());
    } 
    System.gc();
  }
  
  public final void a(ns[] paramArrayOfns) {
    if (this.s) {
      if (paramArrayOfns != null && paramArrayOfns.length > 0)
        this.n.a((String)null); 
      this.s = false;
      return;
    } 
    if (this.q) {
      this.q = false;
      if (this.w.c(241204)) {
        hr hr;
        (hr = (hr)this.w.d(241204)).a(paramArrayOfns);
        hr.a((byte)0);
        return;
      } 
    } else if (this.w.c(241204)) {
      hr hr;
      (hr = (hr)this.w.d(241204)).a(paramArrayOfns);
      hr.a((byte)0);
    } 
  }
  
  public final void a(ns paramns, boolean paramBoolean) {
    if (this.w.c(241204)) {
      hr hr;
      (hr = (hr)this.w.d(241204)).a(paramns);
      if (paramBoolean) {
        hr.a((byte)2);
      } else {
        hr.a((byte)1);
      } 
    } 
    this.w.v();
  }
  
  public final void a(lh paramlh, String paramString1, long paramLong, String paramString2, boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield t : Z
    //   4: ifeq -> 8
    //   7: return
    //   8: aconst_null
    //   9: astore #8
    //   11: aload_0
    //   12: getfield w : Lcom/mg/sq/a;
    //   15: ldc 191919
    //   17: invokevirtual c : (I)Z
    //   20: ifeq -> 37
    //   23: aload_0
    //   24: getfield w : Lcom/mg/sq/a;
    //   27: ldc 191919
    //   29: invokevirtual d : (I)Lal;
    //   32: checkcast ha
    //   35: astore #8
    //   37: aload #8
    //   39: ifnull -> 50
    //   42: aload_0
    //   43: iconst_1
    //   44: bipush #13
    //   46: invokevirtual d : (II)V
    //   49: return
    //   50: aload_0
    //   51: getfield n : Lfc;
    //   54: invokevirtual q : ()Lfb;
    //   57: dup
    //   58: astore #8
    //   60: ifnull -> 68
    //   63: aload #8
    //   65: invokevirtual t : ()V
    //   68: aload_0
    //   69: getfield k : Lol;
    //   72: ifnull -> 178
    //   75: aload_0
    //   76: getfield k : Lol;
    //   79: aload_1
    //   80: aload_2
    //   81: lload_3
    //   82: aload #5
    //   84: iload #6
    //   86: iload #7
    //   88: istore #12
    //   90: istore #11
    //   92: astore #10
    //   94: lstore #13
    //   96: astore #9
    //   98: astore #8
    //   100: dup
    //   101: astore_2
    //   102: getfield p : Laq;
    //   105: ifnull -> 173
    //   108: aload_2
    //   109: getfield p : Laq;
    //   112: instanceof om
    //   115: ifeq -> 137
    //   118: aload_2
    //   119: getfield p : Laq;
    //   122: checkcast om
    //   125: getfield m : Ljv;
    //   128: invokevirtual a : ()V
    //   131: invokestatic c : ()V
    //   134: goto -> 173
    //   137: aload_2
    //   138: getfield p : Laq;
    //   141: instanceof oq
    //   144: ifeq -> 173
    //   147: aload_2
    //   148: getfield p : Laq;
    //   151: checkcast oq
    //   154: aload #8
    //   156: aload #9
    //   158: lload #13
    //   160: aload #10
    //   162: iload #11
    //   164: iload #12
    //   166: invokevirtual a : (Llh;Ljava/lang/String;JLjava/lang/String;ZZ)V
    //   169: iconst_1
    //   170: goto -> 174
    //   173: iconst_0
    //   174: ifeq -> 178
    //   177: return
    //   178: aload_1
    //   179: bipush #10
    //   181: bipush #13
    //   183: aload_0
    //   184: lload_3
    //   185: aload #5
    //   187: iload #6
    //   189: iload #7
    //   191: invokestatic a : (Llh;IILbf;JLjava/lang/String;ZZ)Lal;
    //   194: pop
    //   195: return
  }
  
  public final void a(String paramString1, String paramString2) {
    this.w.a(false);
    al al = this.w.a("", (paramString2 == null) ? (String.valueOf(paramString1) + " không muốn đánh với bạn.") : paramString2, "Đóng", 12, 1);
    this.l = paramString1;
    al.a(this);
    this.w.a(al, false);
  }
  
  public final void a(lh paramlh1, lh paramlh2, boolean paramBoolean, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, int paramInt, byte paramByte1, byte paramByte2) {
    this.t = false;
    c = null;
    b = null;
    if (this.k != null)
      this.k.a(paramlh1, paramlh2, paramBoolean, paramArrayOfbyte1, paramArrayOfbyte2, paramArrayOfbyte3, paramByte1, paramByte2); 
  }
  
  public final void a(lh paramlh1, lh paramlh2, boolean paramBoolean) {
    this.t = false;
    c = null;
    b = null;
    ha ha = null;
    if (this.w.c(191919))
      ha = (ha)this.w.d(191919); 
    if (ha == null) {
      this.w.e(-241209);
      this.w.e(-241249);
      (ha = new ha(paramlh1, paramlh2, true, paramBoolean, 99030, this)).a(this.k);
      this.w.a(ha, false);
    } 
    this.w.v();
    ha.t();
  }
  
  public final void d() {
    a.b(false);
  }
  
  public final void a(jn paramjn, byte[][] paramArrayOfbyte) {
    c = paramjn;
    b = paramArrayOfbyte;
    System.gc();
    if (this.k != null)
      this.k.j(1); 
    this.w.v();
  }
  
  protected final void a(int paramInt) {
    this.n.f(paramInt);
  }
  
  protected final void e(int paramInt) {
    this.n.g(paramInt);
  }
  
  protected final void g(int paramInt1, int paramInt2) {
    this.n.e(paramInt1, paramInt2);
  }
  
  protected final void e(int paramInt1, int paramInt2) {
    this.n.c(paramInt1, paramInt2);
  }
  
  protected final void f(int paramInt1, int paramInt2) {
    this.n.f(paramInt1, paramInt2);
  }
  
  public final void g() {
    this.w.v();
    if (this.w.c(241204))
      ((hr)this.w.d(241204)).w(); 
  }
  
  public final void t() {
    this.w.v();
    if (this.w.c(241204))
      ((hr)this.w.d(241204)).v(); 
  }
  
  public final void u() {
    ct.a("[QUEST] Check complete quests");
    if (this.k != null) {
      if (ol1.p instanceof om) {
        ((om)ol1.p).m.a();
        v.c();
      } 
      ol ol1;
      if (((ol1 = this.k).p instanceof oq))
        return; 
    } 
    this.m = nu.a();
    if (this.m != null) {
      ct.a("[QUEST] Has completed quest " + this.m);
      this.r = true;
      hb hb1;
      (hb1 = new hb(this.m, this.m.g)).a(this);
      hb1.a(new bd("Đóng", 11));
      az az = null;
      hb hb2;
      (hb2 = hb1).a(az, true);
      az = null;
      (hb2 = hb1).b(az, true);
      this.q = true;
      this.w.a(hb1);
      this.s = true;
      this.o.b(go.e);
      this.o.a(go.e, (byte)1);
      return;
    } 
    nt nt;
    if ((nt = nu.b()) != null) {
      c(nt.a);
      nu.c();
      return;
    } 
    ns ns1;
    if ((ns1 = nu.c()) != null)
      this.n.a(ns1.a); 
  }
  
  public final void a(jo[] paramArrayOfjo, String paramString) {
    if (!go.w.equals(paramString))
      return; 
    boolean bool = false;
    jo[] arrayOfJo = paramArrayOfjo;
    ol ol1;
    if ((ol1 = this.k).p instanceof om)
      ((om)ol1.p).a(arrayOfJo, false); 
  }
  
  public final void e(boolean paramBoolean) {
    fb fb;
    if (paramBoolean && (fb = this.n.q()) != null)
      fb.c(true); 
  }
  
  public static br[] a(fb paramfb) {
    br br1 = new br("Hỗ trợ", 99001);
    br br2 = new br("Mua bán", 99002);
    br br3;
    (br3 = new br("Nạp KEN", 99003)).a(new br[] { new br("Nhắn tin", 99004), new br("Thẻ cào ĐT", 99005), new br("DS điện thoại", 99006) });
    if (a.m != null && a.o) {
      br1.a(new br[] { new br("Thông Tin #12", 99031), new br("Giới thiệu", 99007), new br("Hướng dẫn", 99008), new br("Thảo luận #SQ", 99009), new br("Hỗ trợ", 99012), new br("Đổi SĐT", 99010), new br("Cài đặt", 99011) });
      br2.a(new br[] { new br("Cửa hàng", 99013), new br("Chợ trời", 99034), new br("Giao dịch", 99014), br3, new br("Mua vip", 99015), new br("Rao vặt #sqgd", 99017) });
    } else {
      br1.a(new br[] { new br("Giới thiệu", 99007), new br("Hỗ trợ", 99001), new br("Đổi SĐT", 99010), new br("Cài đặt", 99011) });
      br2.a(new br[] { new br("Cửa hàng", 99013), new br("Chợ trời", 99034), new br("Giao dịch", 99014) });
    } 
    br br4 = new br("Đăng nhập OLA", 99032);
    br br5;
    (br5 = new br("Nhân Vật", 99018)).a(new br[] { new br("Thông tin", 99019), new br("Tuyệt Chiêu", 99020), new br("Rương Đồ", 99021), new br("Chế tạo", 99033), new br(gs.c[0], 99022), new br(gs.c[1], 99023) });
    br[] arrayOfBr = null;
    if (paramfb instanceof ol && ((ol)(paramfb = paramfb)).p != null)
      if (((ol)paramfb).p instanceof os) {
        if (!a.o) {
          if (((os)((ol)paramfb).p).q() == 1) {
            arrayOfBr = new br[] { new br("Trở về", 99028), new br("Khiêu Chiến", 99024), br5, br2, new br("Nhiệm Vụ", 99025), br4, br1, new br("Thoát", 99027) };
          } else {
            arrayOfBr = new br[] { new br("Khiêu Chiến", 99024), br5, br2, new br("Nhiệm Vụ", 99025), br4, br1, new br("Thoát", 99027) };
          } 
        } else if (((os)((ol)paramfb).p).q() == 1) {
          arrayOfBr = new br[] { new br("Trở về", 99028), new br("Khiêu Chiến", 99024), br5, br2, new br("Nhiệm Vụ", 99025), br1, new br("Thoát", 99027) };
        } else {
          arrayOfBr = new br[] { new br("Khiêu Chiến", 99024), br5, br2, new br("Nhiệm Vụ", 99025), br1, new br("Thoát", 99027) };
        } 
      } else if (!a.o) {
        arrayOfBr = new br[] { new br("Về Bản đồ", 99035), new br("Lôi Đài", 99028), new br("Khiêu Chiến", 99024), br5, br2, br3, new br("Nhiệm Vụ", 99025), br4, br1, new br("Đăng Xuất", 99026) };
      } else {
        arrayOfBr = new br[] { new br("Về Bản đồ", 99035), new br("Lôi Đài", 99028), new br("Khiêu Chiến", 99024), br5, br2, br3, new br("Nhiệm Vụ", 99025), br1, new br("Đăng Xuất", 99026) };
      }  
    if (a.m != null)
      arrayOfBr = a.m.a(arrayOfBr, 4); 
    return arrayOfBr;
  }
  
  public final boolean a(int paramInt, br parambr) {
    oa oa1;
    al al;
    ib ib;
    switch (paramInt) {
      case 99001:
        return true;
      case 99002:
        return true;
      case 99003:
        a.s().N();
        return true;
      case 99004:
      case 99005:
      case 99006:
        return !a.s().m(paramInt) ? ((a.m != null) ? a.m.b(parambr.b()) : false) : true;
      case 99007:
        a.D();
        return true;
      case 99031:
        if (a.m != null)
          a.m.g(true); 
        return true;
      case 99009:
        if (a.m != null)
          a.m.h(true); 
        return true;
      case 99008:
        if (a.m != null)
          a.m.F(); 
        return true;
      case 99010:
        a.s().S();
        return true;
      case 99011:
        a.F();
        return true;
      case 99012:
        MGMIDlet.d();
        MGMIDlet.b("1900588883");
        return true;
      case 99013:
        a.s().H();
        return true;
      case 99034:
        a.s().I();
        return true;
      case 99014:
        a.e("Nhập tên người cần giao dịch");
        return true;
      case 99015:
        du.a().b((short)2412);
        a.s().a(null, null);
        return true;
      case 99017:
        if (a.m != null)
          a.m.E(); 
        return true;
      case 99018:
        return true;
      case 99019:
        a.G();
        return true;
      case 99020:
        oa1 = this;
        ib = new ib();
        oa1.w.a(ib);
        return true;
      case 99021:
        v();
        return true;
      case 99033:
        this.w.a(false);
        a.s().J();
        return true;
      case 99022:
        this.w.Q();
        return true;
      case 99023:
        this.w.R();
        return true;
      case 99024:
        a.d("");
        return true;
      case 99025:
        c(null);
        return true;
      case 99026:
        a.u();
        return true;
      case 99027:
        (al = this.w.a("Chú ý", "Bạn muốn thoát khỏi Lôi Đài?", "Có", 125, "Không", 12, 1)).a(this);
        this.w.a(al, false);
        return true;
      case 99028:
        this.o.r();
        a.s().a(null, null);
        return true;
      case 11399:
        if (a.m != null)
          a.m.b(ib.b()); 
        break;
      case 99032:
        ob.d();
        break;
      case 99035:
        go.w = "M99";
        go.x = 0;
        f(4);
        break;
    } 
    return false;
  }
  
  public final void a(String paramString, boolean paramBoolean1, int paramInt, boolean paramBoolean2, boolean paramBoolean3) {
    this.w.f(paramString);
    this.o.a(paramString, "", false, 0L, false, false);
  }
  
  public final al v() {
    if (this.w.c(241202))
      this.w.e(241202); 
    hh hh = new hh(null, null);
    this.w.a(hh);
    return hh;
  }
  
  private void c(String paramString) {
    hr hr;
    (hr = new hr()).a(this.k);
    this.w.a(hr);
    if (paramString == null) {
      this.o.o();
    } else {
      this.o.o(paramString);
    } 
    a.s().a(null, null);
  }
  
  private void C() {
    if (go.v != null && go.v.length > 0) {
      hl hl1;
      (hl1 = new hl("Bạn nhận được: ", go.v)).a(this);
      az az = null;
      hl hl2;
      (hl2 = hl1).a(az, true);
      az = null;
      (hl2 = hl1).b(az, true);
      hl1.a(new bd("Đóng", 120));
      this.w.a(hl1);
    } 
  }
  
  public final void a(String paramString) {
    al al;
    (al = this.w.a("", String.valueOf(this.l) + " đang đánh nhau với " + paramString + ". Muốn xem trận đánh không?", "Xem", 121, "Đóng", 12, 1)).a(this);
    this.w.a(al, false);
  }
  
  public final void b(String paramString) {
    if (this.k != null && this.k.p instanceof oq) {
      this.o.a(false);
      return;
    } 
    al al;
    (al = this.w.a("", String.valueOf(paramString) + " muốn giao dịch với bạn. Bạn có đồng ý không?", "Đồng ý", 123, "Không", 124, 1)).b(241207);
    al.a(this);
    this.w.a(al, false);
  }
  
  public final boolean w() {
    byte b = 0;
    while (b < go.k.D.length) {
      al al;
      for (byte b1 = 0; b1 < go.l.length; b1++) {
        if ((go.k.D[b]).c.equals((go.l[b1]).c) && (go.l[b1]).p == 0 && (go.l[b1]).p < (go.l[b1]).q) {
          if (!this.a) {
            (al = this.w.a("", "Trang bị đã hư hỏng sẽ mất tác dụng. Bạn có muốn sửa chữa không? ", "Đồng ý", 127, "Không", 12, 1)).a(this);
            this.w.a(al, false);
            this.u = (go.l[b1]).e;
          } 
          return true;
        } 
      } 
      al++;
    } 
    return false;
  }
  
  public final void x() {
    ol ol1;
    if (this.k != null && (ol1 = this.k).p != null && ol1.p.b() == 1)
      ((om)ol1.p).u(); 
    this.w.l();
  }
  
  public final void a(int paramInt, dh[] paramArrayOfdh) {
    al al;
    if (paramArrayOfdh == null || paramArrayOfdh.length <= 0) {
      (al = this.w.a("Chú ý", "Tính năng đang được bảo trì, vui lòng thử lại sau.", "Đóng", 12, 1)).a(this);
      this.w.a(al, false);
      return;
    } 
    if (this.p == null)
      this.p = new or(this); 
    this.p.a(al, paramArrayOfdh);
    if (!this.n.b(this.p))
      this.n.c(this.p); 
    this.n.a(this.p);
  }
  
  public final void y() {
    this.t = false;
  }
  
  public final void z() {
    this.n.d(this.p);
    this.p = null;
    if (this.k != null)
      this.n.a(this.k); 
  }
  
  public final void a(lr[] paramArrayOflr) {
    if (this.k != null) {
      lr[] arrayOfLr = paramArrayOflr;
      ol ol1;
      (ol1 = this.k).t = false;
      if (ol1.p == null || ol1.p.b() != 3) {
        ol1.j(3);
        os.l = arrayOfLr;
      } else if (ol1.p.b() == 3) {
        ((os)ol1.p).a(arrayOfLr);
      } 
    } 
    this.w.v();
  }
  
  public final void b(lr[] paramArrayOflr) {
    lr[] arrayOfLr = paramArrayOflr;
    ol ol1;
    if (this.k != null && (ol1 = this.k).p.b() == 3)
      ((os)ol1.p).b(arrayOfLr); 
    this.w.v();
  }
  
  public final void A() {
    this.t = false;
  }
  
  protected final void s() {
    this.k.A();
    this.k = null;
    this.n.r();
    this.n = null;
    this.p = null;
    this.i = null;
    this.m = null;
    this.o = null;
    pa.a().d();
    c = null;
    b = null;
    go.v = null;
    go.u = null;
    go.v = null;
    d = false;
    ct.b("Finish PlatformScreen.destroyed()");
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\oa.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */