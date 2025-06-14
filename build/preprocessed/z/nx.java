import com.mg.smsgame.MGMIDlet;
import com.mg.sq.a;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class nx extends an implements bf, ij, ik {
  public static int a;
  
  public static int b;
  
  public static long c = 0L;
  
  private Image d;
  
  private Image k;
  
  private Image l;
  
  private static int m = 2;
  
  private int n = 0;
  
  private static String o;
  
  private int p = -1;
  
  private boolean q;
  
  private String r;
  
  private String s;
  
  private int t;
  
  private int[] u;
  
  private int v;
  
  public nx() {
    this(null);
  }
  
  public nx(String paramString) {
    super(5);
    this.r = paramString;
    a.s().l();
    try {
      f();
      return;
    } catch (OutOfMemoryError outOfMemoryError) {
      if (a.m != null)
        a.m.G(); 
      System.gc();
      try {
        f();
        return;
      } catch (OutOfMemoryError outOfMemoryError1) {
        a.s().j(1);
        return;
      } 
    } 
  }
  
  private void f() {
    b(5);
    a((ba)null);
    if (this.r == null) {
      this.p = 1;
    } else {
      this.p = 2;
    } 
    this.q = true;
    a = b = 0;
    if (this.d == null)
      this.d = f.d("/createcs/bk"); 
    if (this.k == null)
      this.k = f.d("/bardownloadscreen"); 
    if (this.l == null)
      this.l = f.d("/fillbardownloadscreen"); 
  }
  
  public final boolean e() {
    return (this.p != 2);
  }
  
  public final void a(boolean paramBoolean, String paramString, int paramInt1, int[] paramArrayOfint, int paramInt2) {
    al al;
    this.s = paramString;
    this.t = paramInt1;
    this.u = paramArrayOfint;
    this.v = paramInt2;
    if (paramBoolean) {
      nx nx1 = this;
      (al = ag.b().a("Thông báo", "Có phiên bản mới, vui lòng cập nhật!", "Cập nhật", -4, 1)).a(nx1);
      al.b(3000);
      ag.b().a(al, false);
      return;
    } 
    if (!i.b((String)al)) {
      nx nx1 = this;
      (al = ag.b().a("Thông báo", "Có phiên bản mới, bạn có muốn cập nhật không?", "Cập nhật", -4, "Không", -5, 1)).a(nx1);
      al.b(3000);
      ag.b().a(al, false);
      return;
    } 
    a(paramInt1, paramArrayOfint, paramInt2);
  }
  
  private void a(int paramInt1, int[] paramArrayOfint, int paramInt2) {
    if (paramInt1 < 0) {
      this.n = 4;
      return;
    } 
    o = "Đang cài đặt...";
    m = 2;
    pa.a().a(paramInt1, paramArrayOfint, paramInt2, this);
  }
  
  protected final void a(Graphics paramGraphics) {
    int i = 0;
    if (this.d != null && v.u > this.d.getHeight())
      i = (v.u - this.d.getHeight()) / 2; 
    if (m > 0 && this.d != null) {
      if (v.t > this.d.getWidth() || v.u > this.d.getHeight()) {
        paramGraphics.setColor(0);
        paramGraphics.fillRect(0, 0, this.f, this.g);
      } 
      paramGraphics.drawImage(this.d, this.f / 2, this.g - i, 33);
      if (o != null)
        bx.c.a(paramGraphics, o, this.f / 2, this.g - i - 17, 1); 
      if (e())
        a.g.a(paramGraphics, "0.18.0" + (ct.a() ? " TEST SVIP = 210.211.116.157" : ""), v.t / 2, 0, 1); 
      m--;
    } 
    if (this.l != null && this.k != null) {
      int j = (this.f - this.k.getWidth()) / 2;
      i = this.g - 33 - i;
      paramGraphics.drawImage(this.k, j, i, 0);
      if (a > 0) {
        if (b > a)
          b = a; 
        int k = b * 144 / a;
        a(paramGraphics, j + 2, i + 2, k, 1);
        bx.d.a(paramGraphics, String.valueOf(b * 100 / a) + "%", j + this.k.getWidth() / 2, i, 1);
      } 
    } 
  }
  
  private void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramInt3 <= 0)
      return; 
    for (paramInt1 = paramInt1; paramInt3 > 0; paramInt1 += paramInt4) {
      paramInt4 = 10;
      if (10 > paramInt3)
        paramInt4 = paramInt3; 
      cw.a(paramGraphics, this.l, 0, 0, paramInt4, this.l.getHeight(), paramInt1, paramInt2, 0);
      paramInt3 -= paramInt4;
    } 
  }
  
  protected final void c() {
    if (this.q) {
      if (this.p == 1) {
        o = "Kiểm tra phiên bản...";
        m = 2;
        int i = pd.C();
        ks.a().a(i, go.a, false);
      } else {
        String str = this.r;
        nx nx1 = this;
        o = "Đang nạp màn chơi...";
        m = 2;
        pa.a().a(str, nx1);
      } 
      this.q = false;
    } 
    if (this.n > 0) {
      this.n--;
      if (this.n == 1)
        a(); 
    } 
    if (this.p == 1 && a > 0 && System.currentTimeMillis() - c >= 18000000L) {
      pa.a().e();
      a.s().a(1, null);
      return;
    } 
  }
  
  public final void e(boolean paramBoolean) {
    super.e(paramBoolean);
    m = 2;
  }
  
  public final void a() {
    pc.b();
    ag.b().f(2);
  }
  
  public final void b() {
    MGMIDlet mGMIDlet;
    (mGMIDlet = MGMIDlet.d()).notifyDestroyed();
  }
  
  public final void d() {}
  
  public final void a(jn paramjn, byte[][] paramArrayOfbyte) {
    oa.c = paramjn;
    oa.b = paramArrayOfbyte;
    ag.b().f(1);
  }
  
  public final void d(int paramInt1, int paramInt2) {
    switch (paramInt2) {
      case -4:
        try {
          MGMIDlet.d().a(this.s);
          return;
        } catch (ConnectionNotFoundException connectionNotFoundException) {
          MGMIDlet mGMIDlet;
          (mGMIDlet = MGMIDlet.d()).notifyDestroyed();
          connectionNotFoundException.printStackTrace();
          return;
        } 
      case -5:
        a.s().a(3000, false);
        a(this.t, this.u, this.v);
        break;
    } 
  }
  
  public static void a(String paramString) {
    o = "Cài đặt " + paramString + cv.a(1000) + ".pak";
    m = 1;
  }
  
  public static void f(int paramInt) {
    b += paramInt;
    c = System.currentTimeMillis();
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\nx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */