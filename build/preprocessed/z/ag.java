import com.mg.smsgame.MGMIDlet;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ag extends Canvas implements Runnable {
  private static ag d;
  
  private static int e = 0;
  
  private long f;
  
  private long g;
  
  private boolean h;
  
  private boolean i = true;
  
  private boolean j;
  
  private boolean k;
  
  private final Object l = new Object();
  
  public static Image a = f.d("/_arrow");
  
  private int m = -1;
  
  private bk n;
  
  public static boolean b;
  
  public static boolean c;
  
  private static boolean o = false;
  
  private Graphics p;
  
  private Image q;
  
  private ah r;
  
  private int s;
  
  private int t;
  
  private a u = new a(2);
  
  private ap v;
  
  private ag() {
    setFullScreenMode(true);
    cs.d();
    o = v.ai = cs.a.c(-18);
    v.z = hasPointerEvents();
    String str = System.getProperty("microedition.platform").toUpperCase();
    if (getKeyCode(8) == -20) {
      v.L = 3;
    } else if (str == null || str.length() == 0) {
      v.L = 4;
    } else if (str.indexOf("NOKIAN") >= 0) {
      v.L = 1;
    } else if (str.indexOf("NOKIA") >= 0) {
      v.L = 0;
    } else if (str.indexOf("SONY") >= 0) {
      v.L = 2;
    } else if (str.indexOf("SAMSUNG") >= 0) {
      v.L = 7;
    } else if (str.indexOf("RIM") >= 0) {
      v.L = 5;
    } else if (str.indexOf("SIE-EL71") >= 0) {
      v.L = 6;
    } else {
      v.L = 4;
    } 
    ct.a("Vendor: " + str + " detected as " + String.valueOf(v.L));
    this.v = new ap();
  }
  
  public static ag a() {
    if (d == null)
      d = new ag(); 
    return d;
  }
  
  public static ah b() {
    return (a()).r;
  }
  
  public static void a(ah paramah) {
    (a()).r = paramah;
  }
  
  public static ap c() {
    return (a()).v;
  }
  
  public static void a(ap paramap) {
    (a()).v = paramap;
  }
  
  public final void d() {
    setFullScreenMode(true);
    this.i = true;
    this.q = Image.createImage(v.t, v.u);
    this.p = d.q.getGraphics();
    v.d = 2;
    if (v.u > 330) {
      v.d = 3;
    } else if (v.t > 0 && v.t <= 130) {
      v.d = 0;
    } else if (v.t <= 200) {
      v.d = 1;
    } 
    if (this.r != null)
      ah.g(); 
  }
  
  public final void a(int paramInt1, int paramInt2) {
    e();
    this.n = new bk(paramInt2);
    paramInt2 = this.n.a;
    if (paramInt1 > paramInt2) {
      this.s = 0;
      this.t = paramInt1 - paramInt2;
    } else {
      this.t = 0;
      this.s = 0;
    } 
    b = true;
    c = true;
    o = v.ai;
    v.ai = true;
    this.i = true;
  }
  
  public final void e() {
    if (!v.z)
      return; 
    b = false;
    v.ai = o;
    this.n = null;
    v.e();
    this.i = true;
    (a()).s = 0;
    v.c();
  }
  
  public static boolean f() {
    return b;
  }
  
  public final void a(int paramInt) {
    if (this.r != null)
      this.r.g(paramInt); 
  }
  
  public final void b(int paramInt) {
    if (v.P) {
      this.m = (int)(paramInt / v.n);
      if (paramInt % v.n > 0L)
        this.m++; 
      (MGMIDlet.d()).a.vibrate(paramInt);
    } 
  }
  
  public static void g() {
    for (byte b = 0; b < 'Ĭ'; b++)
      v.c[b] = 0; 
    v.E = v.F = -1;
    v.C = v.D = -1;
    v.A = v.B = -1;
  }
  
  public static int a(int paramInt, boolean paramBoolean) {
    if (!v.ai && !b && paramInt >= 67 && paramInt <= 126) {
      o = v.ai = true;
      cs.a.b(-18, new byte[] { 1 });
    } 
    if (v.ai) {
      if ((paramInt = paramInt) == 1 || paramInt == -1) {
        paramInt = -1;
      } else if (paramInt == 6 || paramInt == -2) {
        paramInt = -2;
      } else if (paramInt == 2 || paramInt == -3) {
        paramInt = -3;
      } else if (paramInt == 5 || paramInt == -4) {
        paramInt = -4;
      } else if (paramInt == 10 || paramInt == 13 || paramInt == -5) {
        paramInt = -5;
      } else if (paramInt == -6) {
        paramInt = -6;
      } else if (paramInt == -7) {
        paramInt = -7;
      } else if (paramInt == 8 || paramInt == -8) {
        paramInt = -8;
      } 
      paramInt = paramInt;
    } 
    if (v.L == 5) {
      if ((paramInt = paramInt) == 113 || paramInt == 35 || paramInt == 81) {
        paramInt = -6;
      } else if (paramInt == 112 || paramInt == 64 || paramInt == 80) {
        paramInt = -7;
      } 
      paramInt = paramInt;
    } else if (v.L == 3) {
      switch (paramInt = paramInt) {
        case -21:
          paramInt = -6;
          break;
        case -22:
          paramInt = -7;
          break;
        case -23:
          paramInt = -8;
          break;
        case -2:
          paramInt = -3;
          break;
        case -5:
          paramInt = -4;
          break;
        case -6:
          paramInt = -2;
          break;
        case -20:
          paramInt = -5;
          break;
      } 
      paramInt = paramInt;
    } else if (v.L == 6) {
      switch (paramInt = paramInt) {
        case -59:
          paramInt = -1;
          break;
        case -60:
          paramInt = -2;
          break;
        case -61:
          paramInt = -3;
          break;
        case -62:
          paramInt = -4;
          break;
        case -26:
          paramInt = -5;
          break;
        case -1:
          paramInt = -6;
          break;
        case -4:
          paramInt = -7;
          break;
      } 
      paramInt = paramInt;
    } 
    if (paramBoolean) {
      switch (paramInt = paramInt) {
        case 50:
          paramInt = -1;
          break;
        case 56:
          paramInt = -2;
          break;
        case 52:
          paramInt = -3;
          break;
        case 54:
          paramInt = -4;
          break;
        case 10:
        case 53:
          paramInt = -5;
          break;
      } 
      paramInt = paramInt;
    } 
    switch (paramInt = (paramInt = paramInt) + 100) {
      case 94:
        if (v.L == 1 && e == 0)
          e = 5; 
        break;
      case 93:
        if (v.L == 1 && e == 0)
          e = 5; 
        break;
    } 
    return paramInt;
  }
  
  public static void c(int paramInt) {
    a().keyPressed(paramInt);
  }
  
  public static void d(int paramInt) {
    a().keyReleased(paramInt);
  }
  
  protected final void keyPressed(int paramInt) {
    if (this.r == null)
      return; 
    boolean bool = this.r.j();
    paramInt = a(paramInt, bool);
    if (!v.ai && (paramInt < 89 || paramInt > 157))
      return; 
    for (bool = false; bool < this.u.d(); bool++) {
      ar ar;
      (ar = (ar)this.u.b(bool)).a(paramInt);
    } 
    if (paramInt < 0 && paramInt >= v.c.length)
      return; 
    if (paramInt == 94 || paramInt == 93 || (paramInt == 95 && this.r.k())) {
      if (v.c[paramInt] == 0) {
        v.c[paramInt] = 2;
        return;
      } 
    } else if (v.c[paramInt] == 0) {
      v.c[paramInt] = 3;
      this.r.a(paramInt);
    } 
  }
  
  protected final void keyReleased(int paramInt) {
    if (this.r != null) {
      boolean bool = this.r.j();
      paramInt = a(paramInt, bool);
      if (!v.ai && (paramInt < 89 || paramInt > 157))
        return; 
      if (paramInt < 0 && paramInt >= v.c.length)
        return; 
      if (v.c[paramInt] == 2 || v.c[paramInt] >= 3) {
        v.c[paramInt] = 1;
        this.r.b(paramInt);
      } 
    } 
  }
  
  protected final void pointerPressed(int paramInt1, int paramInt2) {
    if (b) {
      if (paramInt2 >= this.n.o()) {
        this.n.g(paramInt1, paramInt2 - this.s - v.y);
        return;
      } 
      if (this.r != null)
        this.r.a(paramInt1 - v.x, paramInt2 - v.y); 
      return;
    } 
    if (this.r != null)
      this.r.a(paramInt1 - v.x, paramInt2 - v.y); 
  }
  
  protected final void pointerReleased(int paramInt1, int paramInt2) {
    if (b) {
      if (paramInt2 >= this.n.o()) {
        this.n.h(paramInt1, paramInt2 - this.s - v.y);
        return;
      } 
      if (this.r != null)
        this.r.b(paramInt1 - v.x, paramInt2 - v.y); 
      return;
    } 
    if (this.r != null)
      this.r.b(paramInt1 - v.x, paramInt2 - v.y); 
  }
  
  protected final void pointerDragged(int paramInt1, int paramInt2) {
    if (this.r != null)
      this.r.c(paramInt1 - v.x, paramInt2 - v.y); 
  }
  
  protected final void showNotify() {
    this.k = false;
    synchronized (this.l) {
      setFullScreenMode(true);
      this.i = true;
      v.Z = false;
      g();
      if (this.r != null && !this.r.c(-10003))
        this.r.n(); 
      ct.a((new StringBuffer("show notifyfalse")).toString());
      this.j = false;
      this.l.notify();
      return;
    } 
  }
  
  protected final void hideNotify() {
    this.k = true;
    g();
    if (v.U)
      synchronized (this.l) {
        this.j = true;
        if (this.r != null) {
          this.r.c(-10003);
          this.r.m();
        } 
        ct.a((new StringBuffer("hide notifyfalse")).toString());
        return;
      }  
  }
  
  protected final void paint(Graphics paramGraphics) {
    paramGraphics.setClip(0, 0, v.v, v.w);
    if (this.r == null)
      return; 
    if (this.i) {
      ah.a(paramGraphics);
      if (!b)
        this.i = false; 
    } 
    this.p.setClip(0, 0, this.q.getWidth(), this.q.getHeight());
    this.r.a(this.p, this.q, paramGraphics);
    if (b && this.n != null)
      this.n.a(paramGraphics, v.x, v.y + this.s); 
  }
  
  public final void run() {
    this.h = false;
    this.j = false;
    while (true) {
      while (!this.j) {
        try {
          this.f = System.currentTimeMillis();
          if (this.r != null) {
            ag ag1 = this;
            if (e > 0)
              e--; 
            if (ag1.m > 0) {
              ag1.m--;
              if (ag1.m == 0)
                (MGMIDlet.d()).a.vibrate(0); 
            } 
            if (b) {
              int i;
              if ((i = ag1.t - ag1.s) > 3)
                i /= 2; 
              v.y -= i;
              ag1.s += i;
              ag1.n.i();
            } 
            ag1.r.i();
            if (!this.k)
              repaint(); 
          } 
          this.g = System.currentTimeMillis();
          if (this.g - this.f <= v.n)
            Thread.sleep(v.n - this.g - this.f); 
        } catch (Exception exception2) {
          Exception exception1;
          ct.a(exception1 = null);
          exception1.printStackTrace();
        } 
      } 
      synchronized (this.l) {
        try {
          this.l.wait();
        } catch (InterruptedException interruptedException2) {
          InterruptedException interruptedException1;
          (interruptedException1 = null).printStackTrace();
        } 
      } 
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ag.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */