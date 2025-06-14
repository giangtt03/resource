import com.mg.smsgame.MGMIDlet;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public abstract class ah implements bf, r {
  private static final int[] g = new int[] { -2, 2 };
  
  private static final int[] h = new int[] { 0, 0, 2, -2 };
  
  private boolean i = false;
  
  private final a j = new a(4);
  
  protected an a;
  
  private final a k = new a(8);
  
  protected al b;
  
  private al l;
  
  private ad m;
  
  private aa n;
  
  public aa c;
  
  public aa d;
  
  private ak o;
  
  private int p;
  
  private boolean q;
  
  private boolean r;
  
  private boolean s;
  
  private Object[] t;
  
  private int u;
  
  private int v;
  
  private int w;
  
  al e = null;
  
  protected ax f;
  
  private boolean x = false;
  
  private static final cb y = new cb();
  
  private boolean z;
  
  public ah() {
    s.a().a(6);
    p();
  }
  
  public final ax b() {
    return this.f;
  }
  
  public final void a(ax paramax) {
    this.f = paramax;
  }
  
  public final void c() {
    this.x = false;
  }
  
  public final void a(ak paramak) {
    this.o = paramak;
  }
  
  public final an d() {
    return this.a;
  }
  
  public final al e() {
    return this.b;
  }
  
  public final void f() {
    if (this.b != null) {
      this.b.e(true);
      return;
    } 
    if (this.a != null)
      this.a.e(true); 
  }
  
  public static void g() {}
  
  final void a(int paramInt) {
    if (this.i || this.s)
      return; 
    if (this.b != null) {
      if (!this.b.k()) {
        v.c[paramInt] = v.c[paramInt] + 1;
        this.b.c(paramInt);
      } 
      return;
    } 
    if (this.a != null && !this.a.k()) {
      v.c[paramInt] = v.c[paramInt] + 1;
      this.a.c(paramInt);
    } 
  }
  
  final void b(int paramInt) {
    if (this.i || this.s)
      return; 
    if (this.b != null) {
      if (!this.b.k()) {
        v.c[paramInt] = 0;
        this.b.d(paramInt);
      } 
      return;
    } 
    if (this.a != null && !this.a.k()) {
      v.c[paramInt] = 0;
      this.a.d(paramInt);
    } 
  }
  
  final void a(int paramInt1, int paramInt2) {
    if (this.i || this.s)
      return; 
    v.A = paramInt1;
    v.B = paramInt2;
  }
  
  final void b(int paramInt1, int paramInt2) {
    if (this.i || this.s)
      return; 
    v.C = paramInt1;
    v.D = paramInt2;
  }
  
  final void c(int paramInt1, int paramInt2) {
    if (this.i || this.s)
      return; 
    if (v.E < 0)
      v.E = paramInt1; 
    if (v.F < 0)
      v.F = paramInt2; 
  }
  
  protected void h() {}
  
  final void i() {
    ad ad1;
    h();
    ah ah1;
    if ((ah1 = this).f != null)
      ah1.f.i(); 
    if (ah1.u > 0) {
      ah1.u--;
      int i = ah1.u % 5;
      ah1.v = g[i];
      ah1.w = h[i];
      if (ah1.u == 0)
        ah1.v = ah1.w = 0; 
    } 
    al al1 = ah1.b;
    an an1 = ah1.a;
    if (!ah1.s) {
      if (ah1.n != null) {
        ah1.m = null;
        ah1.n.b();
        if (ah1.n.a()) {
          ah1.n = null;
          ah1.l = null;
          ah1.i = false;
          if (al1 != null)
            al1.i(false); 
        } 
      } else if (ah1.m != null) {
        ad1 = ah1.m;
      } else if (al1 != null) {
        al1.h(true);
        if (al1.f() && an1 != null)
          an1.h(false); 
      } else if (an1 != null) {
        an1.h(true);
      } 
    } else {
      ((ah)ad1).o.b_();
    } 
    cq.a().e();
  }
  
  protected static void a(Graphics paramGraphics) {
    paramGraphics.setColor(0);
    paramGraphics.fillRect(0, 0, v.v, v.w);
  }
  
  final void a(Graphics paramGraphics1, Image paramImage, Graphics paramGraphics2) {
    try {
      if (this.s) {
        if (this.r)
          this.o.a(paramGraphics1, true); 
      } else {
        if (this.n != null) {
          try {
            if (this.a != null)
              this.a.a(paramGraphics1, false); 
            this.n.a(paramGraphics1);
            if (this.l != null) {
              paramGraphics1.setClip(this.n.c() + 10, this.n.d() + 10, this.n.e() - 20, this.n.f() - 20);
              this.l.c(paramGraphics1);
            } 
          } catch (Exception exception2) {
            Exception exception1;
            (exception1 = null).printStackTrace();
          } 
        } else if (this.b != null) {
          try {
            if (!this.z) {
              if (this.a != null)
                this.a.a(paramGraphics1, false); 
              byte b = 0;
              int i = this.k.d();
              while (b < i) {
                ((al)this.k.b(b)).c(paramGraphics1);
                b++;
              } 
              if (!this.b.e())
                this.z = true; 
            } 
            this.b.a(paramGraphics1, true);
          } catch (Exception exception2) {
            Exception exception1;
            (exception1 = null).printStackTrace();
          } 
        } else if (this.a != null) {
          try {
            this.a.a(paramGraphics1, true);
          } catch (Exception exception2) {
            Exception exception1;
            (exception1 = null).printStackTrace();
          } 
        } 
        if (this.m != null)
          return; 
      } 
      if (this.f != null)
        this.f.a(paramGraphics1); 
      Image image = paramImage;
      Graphics graphics = paramGraphics2;
      ah ah1 = this;
      graphics.drawImage(image, v.x + ah1.v, v.y + ah1.w, 20);
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } 
  }
  
  final boolean j() {
    return (this.b != null) ? false : ((this.a != null) ? this.a.a_() : false);
  }
  
  public final boolean k() {
    return (this.b != null) ? this.b.q() : ((this.a != null) ? this.a.q() : false);
  }
  
  public al a(String paramString1, String paramString2, String[] paramArrayOfString, int[] paramArrayOfint, int paramInt) {
    return new bv(paramString1, paramString2, paramArrayOfString, paramArrayOfint, paramInt);
  }
  
  public final al a(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2) {
    String[] arrayOfString;
    (arrayOfString = new String[1])[0] = paramString3;
    int[] arrayOfInt;
    (arrayOfInt = new int[1])[0] = paramInt1;
    return a(paramString1, paramString2, arrayOfString, arrayOfInt, 1);
  }
  
  public final al a(String paramString1, String paramString2, String paramString3, int paramInt1, String paramString4, int paramInt2, int paramInt3) {
    String[] arrayOfString;
    (arrayOfString = new String[2])[0] = paramString3;
    arrayOfString[1] = paramString4;
    int[] arrayOfInt;
    (arrayOfInt = new int[2])[0] = paramInt1;
    arrayOfInt[1] = paramInt2;
    return a(paramString1, paramString2, arrayOfString, arrayOfInt, 1);
  }
  
  public final al a(String paramString1, String paramString2, boolean paramBoolean) {
    return a(paramString1, paramString2, (String[])null, (int[])null, 1);
  }
  
  public final void a(al paramal, boolean paramBoolean) {
    if (paramal != null) {
      v.c();
      paramal.a(false);
      if (this.b != null) {
        al al1;
        al al2;
        (al2 = al1 = this.b).e(true);
        this.k.a(al1);
      } else if (this.a != null) {
        an an1;
        (an1 = this.a).e(true);
      } 
      this.z = false;
      this.b = paramal;
      if (this.b.d() && this.c != null) {
        this.m = null;
        this.n = this.c;
        this.n.a(this.b.c, this.b.d, this.b.c, this.b.d, this.b.f, this.b.g);
        this.i = true;
        this.l = this.b;
        return;
      } 
      this.b.i(false);
    } 
  }
  
  public final void a(al paramal) {
    a(paramal, false);
  }
  
  public final boolean c(int paramInt) {
    if (this.b != null && this.b.h() == paramInt)
      return true; 
    for (byte b = 0; b < this.k.d(); b++) {
      al al1;
      if ((al1 = (al)this.k.b(b)).h() == paramInt)
        return true; 
    } 
    return false;
  }
  
  public final al d(int paramInt) {
    if (this.b != null && this.b.h() == paramInt)
      return this.b; 
    for (byte b = 0; b < this.k.d(); b++) {
      al al1;
      if ((al1 = (al)this.k.b(b)).h() == paramInt)
        return al1; 
    } 
    return null;
  }
  
  public final void a(int paramInt, boolean paramBoolean) {
    al al1;
    if ((al1 = d(paramInt)) != null)
      b(al1, false); 
  }
  
  public final void e(int paramInt) {
    a(paramInt, false);
  }
  
  public final void b(al paramal, boolean paramBoolean) {
    this.z = false;
    if (this.b != null && paramal.equals(this.b)) {
      a(paramBoolean);
      return;
    } 
    this.k.b(paramal);
    paramal.s();
  }
  
  public final void a(boolean paramBoolean) {
    v.c();
    if (this.b != null) {
      if (paramBoolean && (this.a == null || this.a.h() != -100001) && this.d != null) {
        this.m = null;
        this.n = this.d;
        this.n.a(this.b.c, this.b.d, this.b.c, this.b.d, this.b.f, this.b.g);
        this.i = true;
        this.l = this.b;
      } 
      this.b.s();
    } 
    this.b = null;
    if (this.k.d() > 0) {
      this.b = (al)this.k.a(this.k.d() - 1);
      if (this.b != null)
        this.b.i(true); 
      if (this.a != null)
        this.a.e(true); 
    } else if (this.a != null) {
      this.a.i(true);
    } 
    System.gc();
  }
  
  public final void l() {
    v.c();
    if (this.b != null)
      this.b.s(); 
    this.b = null;
    for (byte b = 0; b < this.k.d(); b++)
      ((al)this.k.b(b)).s(); 
    this.k.a();
    this.n = null;
    System.gc();
  }
  
  protected final void a(an paraman, boolean paramBoolean, ad paramad) {
    if (paraman != null) {
      v.c();
      this.a = paraman;
      this.m = paramad;
      if (this.m != null && this.n == null) {
        this.i = true;
        return;
      } 
      this.m = null;
      this.n = null;
      this.a.i(false);
      this.s = false;
      if (paramBoolean)
        this.a.r(); 
    } 
  }
  
  public final void a(an paraman) {
    a(paraman, true, (ad)null);
  }
  
  public final void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2, ad paramad, Object[] paramArrayOfObject) {
    if (this.a == null || this.a.h() != paramInt) {
      this.p = paramInt;
      this.q = paramBoolean1;
      this.r = false;
      this.m = null;
      this.t = paramArrayOfObject;
      v.c();
      ah ah1;
      if ((ah1 = this).o == null)
        ah1.o = new ak(); 
      ah1.m = null;
      ah1.n = null;
      ag.a().e();
      ah1.o.a();
      v.ag = false;
      ah1.s = true;
      if (ah1.r)
        ah1.o.a(0); 
      s.a().a(this);
    } 
  }
  
  public final void f(int paramInt) {
    a(paramInt, false, false, (ad)null, (Object[])null);
  }
  
  public final void a(int paramInt, Object[] paramArrayOfObject) {
    a(5, false, false, (ad)null, paramArrayOfObject);
  }
  
  public final void a() {
    an an1 = null;
    int i = 0;
    int j = this.j.d();
    while (i < j) {
      an an2;
      if ((an2 = (an)this.j.b(i)).h() == this.p) {
        an1 = an2;
        this.j.b(an2);
        break;
      } 
      i++;
    } 
    i = -1;
    if (this.a != null) {
      an an2 = this.a;
      this.a = y;
      if (this.q) {
        this.j.a(an2);
      } else {
        an2.s();
      } 
      i = an2.h();
      System.gc();
    } 
    j = 0;
    if (an1 == null) {
      an1 = a(i, this.p, this.t);
      this.t = null;
      j = 1;
    } 
    this.o.a(an1, null, j);
  }
  
  public final void m() {
    this.m = null;
    this.n = null;
    if (this.a != null);
  }
  
  public final void n() {
    if (this.a != null);
  }
  
  public final void g(int paramInt) {
    this.u = paramInt;
  }
  
  public void o() {
    a(-10006, false);
    a(-10001, false);
    al al1;
    (al1 = a("Chú ý", "Mạng di động đang có vấn đề hoặc quá tải, vui lòng thử lại sau", "Đóng", 3, 1)).a(this);
    al al2 = al1;
    ah ah1;
    (ah1 = this).a(al2, false);
  }
  
  public final void a(int paramInt, String paramString1, String paramString2, String paramString3) {
    v.M = false;
    v.ab = paramInt;
    v.ac = paramString1;
    v.ad = paramString2;
    if (paramString3 != null && paramString3.length() >= 5) {
      String str = paramString3.toLowerCase().substring(0, 4);
      int i = Integer.parseInt(paramString3 = paramString3.trim().substring(4));
      if ("reco".toLowerCase().equals(str)) {
        cs.a(i, paramInt, paramString2, paramString1);
        if (MGMIDlet.b) {
          MGMIDlet mGMIDlet;
          (mGMIDlet = MGMIDlet.d()).notifyDestroyed();
          return;
        } 
        paramInt = i;
        ah ah1;
        if ((ah1 = this).a != null && ah1.a.h() == -100004) {
          cd cd;
          (cd = (cd)ah1.a).d();
        } else {
          paramString1 = null;
        } 
        if (paramString1 != null) {
          paramString2 = paramString1;
          ah ah2;
          (ah2 = ah1).a((an)paramString2, true, (ad)null);
          ah1.a(-10006, false);
        } 
        return;
      } 
      "chal".toLowerCase().equals(str);
    } 
  }
  
  public void d(int paramInt1, int paramInt2) {
    if (paramInt2 == -2) {
      a(-9999, false);
      if (this.a != null)
        return; 
    } else {
      if (paramInt2 == -1) {
        cs.a(0, new ai(this));
        return;
      } 
      if (paramInt2 == 1) {
        n();
        a(-10003, false);
        return;
      } 
      if (paramInt2 == 3) {
        a(true);
        return;
      } 
      if (paramInt2 == 2) {
        a(false);
        return;
      } 
      if (paramInt2 == 4) {
        MGMIDlet mGMIDlet;
        (mGMIDlet = MGMIDlet.d()).notifyDestroyed();
        return;
      } 
      if (paramInt2 == 6) {
        a(true);
        return;
      } 
      if (paramInt2 == 5) {
        try {
          MGMIDlet.d().a("http://game.ola.vn");
        } catch (ConnectionNotFoundException connectionNotFoundException) {}
        a(false);
        return;
      } 
      if (paramInt2 == 7) {
        a(false);
        MGMIDlet.d();
        MGMIDlet.b("1900588883");
        return;
      } 
      if (paramInt2 == 8) {
        MGMIDlet.d();
        MGMIDlet.b("1900588883");
      } 
    } 
  }
  
  protected abstract an a(int paramInt1, int paramInt2, Object[] paramArrayOfObject);
  
  public abstract void p();
  
  public static bt h(int paramInt) {
    bt bt = new bt(paramInt);
    if (paramInt == 1) {
      bt.e(2);
    } else {
      bt.d(2);
    } 
    return bt;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ah.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */