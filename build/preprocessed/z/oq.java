import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class oq extends aq implements bf, bg {
  private ms r;
  
  private mt s;
  
  private mq t;
  
  public static lh[] i;
  
  public static lh[] j;
  
  public static byte[] k;
  
  public static byte[] l;
  
  public static byte[] m;
  
  public static byte n;
  
  public static byte o;
  
  public static int p;
  
  private boolean u = false;
  
  private boolean v = false;
  
  public String[] q;
  
  private boolean w;
  
  private ol x;
  
  private oa y;
  
  private byte z = 0;
  
  public oq(int paramInt, ol paramol, oa paramoa) {
    ct.b("Start init PlayingTabView");
    this.y = paramoa;
    this.x = paramol;
    a_(2);
    mp.a(this);
    nj.a();
    try {
      y();
    } catch (OutOfMemoryError outOfMemoryError) {
      ct.b("[!!] OutOfMemoryError: Loading PlayingTabView");
      if (a.m != null) {
        a.m.G();
        System.gc();
      } 
      try {
        y();
      } catch (Exception exception) {
        a.s().j(1);
        return;
      } 
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      ou.a().a(5, exception1, "PlayingTabView()#1");
      return;
    } 
    try {
      ag.b().l();
      i = null;
      j = null;
      k = null;
      l = null;
      m = null;
      a.i(0);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
    } 
    System.gc();
    q();
    if (paramoa != null)
      paramoa.d(false); 
    this.x.a((ba)null);
    this.x.a(this.t);
    a.s().e(241230);
    ct.b("Finish init PlayingTabView");
  }
  
  private void y() {
    this.r = new ms(i, j);
    byte[] arrayOfByte = k;
    ms ms1;
    (ms1 = this.r).o = arrayOfByte;
    this.r.a(l);
    this.r.a(m);
    this.r.e();
    this.r.f();
    this.s = new mt(this.r);
    if (o == 9) {
      this.t = new mz(this.r, this.s, this);
    } else {
      this.t = new mo(this.r, this.s, this);
      lm[] arrayOfLm = (i[0]).F;
      for (byte b = 0; b < arrayOfLm.length; b++) {
        for (byte b1 = 0; b1 < go.m.length; b1++) {
          if ((arrayOfLm[b]).a == (go.m[b1]).a) {
            (arrayOfLm[b]).b = (go.m[b1]).b;
            (arrayOfLm[b]).d = (go.m[b1]).d;
          } 
        } 
      } 
      this.s.a(arrayOfLm);
    } 
    this.q = od.e();
    ct.b("Finish PlayingTabView.loadGame()");
  }
  
  public final void a() {
    if (this.v)
      return; 
    bs bs = new bs();
    if (!(this.r.a(1, 0).a()).O) {
      oq oq1;
      if ((oq1 = this).q == null)
        oq1.q = od.e(); 
      br br2 = new br("Chat nhanh", 11115);
      br[] arrayOfBr = new br[oq1.q.length];
      for (byte b = 0; b < oq1.q.length; b++) {
        arrayOfBr[b] = new br(a.a(String.valueOf(b) + ". " + oq1.q[b], 120), 11115);
        arrayOfBr[b].a(new Integer(b));
      } 
      br2.a(arrayOfBr);
      br br1 = br2;
      if (!this.t.f()) {
        if (o == 9) {
          bs.a(new br[] { new br("Thoát", 11111) });
        } else {
          bs.a(new br[] { br1, new br("Thoát", 11111) });
        } 
      } else {
        bs.a(new br[] { new br("Tuyệt Chiêu", 11112), new br("Túi đồ", 11113), br1, new br("Đầu hàng", 11111) });
      } 
    } else if (!this.t.f()) {
      if (o == 0) {
        bs.a(new br[] { new br("Thoát", 11111) });
      } else if (o == 1) {
        bs.a(new br[] { new br("Tuyệt Chiêu", 11112), new br("Đầu hàng", 11111) });
      } 
    } else {
      bs.a(new br[] { new br("Tuyệt Chiêu", 11112), new br("Túi đồ", 11113), new br("Đầu hàng", 11111) });
    } 
    int i = (bs.e() > bs.f()) ? bs.e() : bs.f();
    bs.a_(-i, v.u);
    bs.d(0, v.u - ba.a - bs.f());
    bs.a(this.t);
    v.c();
    this.x.a(bs);
    bs.a(new gb(1001, 2));
    bs.b(new gb(1002, 3));
    this.x.a(new ba());
  }
  
  public final void q() {
    v.c();
    this.x.t();
    this.x.c(true);
    oq oq1;
    (oq1 = this).x.z();
    r();
  }
  
  public final void r() {
    if (this.v)
      return; 
    this.x.a(new gb(1000, 0));
    this.x.b(new gb(1010, 1));
  }
  
  public final boolean f(int paramInt) {
    boolean bool;
    if (this.v)
      return false; 
    if (this.x.l != null) {
      if (!(bool = this.x.l.f(paramInt)))
        q(); 
      return true;
    } 
    this.t.b(bool);
    return true;
  }
  
  public final boolean g(int paramInt) {
    if (this.v)
      return false; 
    if (this.x.l != null)
      return true; 
    this.t.c(paramInt);
    return true;
  }
  
  public final boolean c(int paramInt1, int paramInt2) {
    boolean bool;
    if (this.v)
      return false; 
    if (this.x.l != null) {
      if (!(bool = this.x.l.c(paramInt1, paramInt2)))
        q(); 
      return true;
    } 
    this.t.a(bool, paramInt2);
    return true;
  }
  
  public final boolean f(int paramInt1, int paramInt2) {
    if (this.v)
      return false; 
    if (this.x.l != null)
      return true; 
    this.t.b(paramInt1, paramInt2);
    return true;
  }
  
  public final boolean e(int paramInt1, int paramInt2) {
    if (this.t != null)
      this.t.c(paramInt1, paramInt2); 
    return true;
  }
  
  public final void n() {
    try {
      if (this.v)
        return; 
      if (this.t != null)
        this.t.b(); 
      if (this.s != null)
        this.s.d(); 
    } catch (OutOfMemoryError outOfMemoryError) {
      System.gc();
      if (a.m != null) {
        ct.a("logout OLA ");
        outOfMemoryError.printStackTrace();
        a.m.G();
        System.gc();
      } else {
        a.s().j(1);
      } 
      ct.a("out of memory playingchess update");
    } catch (Exception exception) {
      this.z = (byte)(this.z + 1);
      ct.a("Null pointer playing " + this.z);
      if (this.z > 9)
        a.s().j(0); 
    } 
    this.z = 0;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (this.v)
      return; 
    if (this.s != null)
      this.s.a(paramGraphics); 
  }
  
  public final String s() {
    return this.v ? "" : this.r.a(1, 0).j();
  }
  
  public final void a(String paramString) {
    if (this.v)
      return; 
    this.s.b(paramString);
  }
  
  public final void a(lh paramlh1, lh paramlh2, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte paramByte1, byte paramByte2) {
    ct.a("[PlayingScreen]============receivePrepareData===========");
    ag.b().e(-241209);
    ag.b().e(-241249);
    ks.a().a((kp)null);
    z();
    this.w = true;
    lh[] arrayOfLh2;
    (arrayOfLh2 = new lh[1])[0] = paramlh1;
    lh[] arrayOfLh1;
    (arrayOfLh1 = new lh[1])[0] = paramlh2;
    i = arrayOfLh2;
    j = arrayOfLh1;
    n = paramByte1;
    o = paramByte2;
    k = paramArrayOfbyte1;
    l = paramArrayOfbyte2;
    m = paramArrayOfbyte3;
  }
  
  public final void a(lh paramlh, String paramString1, long paramLong, String paramString2, boolean paramBoolean1, boolean paramBoolean2) {
    if (this.v)
      return; 
    this.t.a(paramlh, paramString1, paramLong, paramString2, paramBoolean1, paramBoolean2);
  }
  
  public final void t() {
    oa.d = (o != 9);
    z();
    if (this.x.q == 1) {
      pa.a().a(go.w, this.y);
    } else {
      this.x.j(3);
    } 
    u();
    ct.b("[PlayingChess]====== exitGame ===== ");
  }
  
  public final void u() {
    this.q = null;
    this.x.l = null;
    ks.a().a((kp)null);
    this.x = null;
    this.y = null;
    ct.b("[PlayingChess] destroy complete");
  }
  
  private void z() {
    ct.b("[PlayingChess]============destroyall============== prepareData = " + this.w);
    this.v = true;
    if (this.s != null)
      this.s.c(); 
    this.s = null;
    if (this.r != null)
      this.r.g(); 
    this.r = null;
    if (this.t != null)
      this.t.q(); 
    this.t = null;
    if (!this.w)
      v(); 
    this.w = false;
    oq oq1;
    (oq1 = this).x.z();
    ct.b("huy PlayingChess");
  }
  
  public static void v() {
    ct.b("[PlayingChess]begin: clearStaticObject ");
    a.s().l();
    co.b().d();
    i = null;
    j = null;
    k = null;
    l = null;
    m = null;
    mp.f();
    mh.a();
    nj.b();
    System.gc();
    ct.b("[PlayingChess]end: clearStaticObject");
  }
  
  public final void w() {
    if (this.s != null)
      this.s.l(); 
  }
  
  public final void x() {
    ((fc)this.x.l()).a();
  }
  
  public final void a(int paramInt1, int paramInt2, Object paramObject) {
    if (this.t != null)
      this.t.a(paramInt1, paramInt2, paramObject); 
  }
  
  public final void d(int paramInt1, int paramInt2) {
    if (this.t != null)
      this.t.d(paramInt1, paramInt2); 
  }
  
  public final void a(String paramString1, String paramString2) {
    for (byte b = 0; b < (this.r.a()[1]).length; b++) {
      if (paramString1.equals(this.r.a()[1][b].j()))
        a(paramString2); 
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\oq.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */