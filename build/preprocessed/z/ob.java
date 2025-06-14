import com.mg.smsgame.MGMIDlet;
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ob extends an implements bf {
  private int[] a = new int[] { 0, 0, 234, 125 };
  
  private Image b;
  
  private aq[] c;
  
  private int d;
  
  private boolean k;
  
  public ob() {
    super(2);
    d(false);
    b(true);
    a(false);
    v.ae = true;
    this.b = f.d("/bklogin");
    int i = v.t - this.a[2] >> 1;
    int j = v.u - 166;
    this.a[0] = i;
    this.a[1] = j;
    this.c = new aq[4];
    this.c[0] = new ff("", 100, 2);
    this.c[0].a(this.a[0] + 83, this.a[1] + 35, 119, 16);
    ((ff)this.c[0]).a("Nhập nick ola");
    this.c[1] = new ff("", 100, 3);
    this.c[1].a(this.a[0] + 83, this.a[1] + 54, 119, 16);
    ((ff)this.c[1]).a("Nhập mật khẩu ola");
    this.c[2] = new ey("", gr.e);
    this.c[2].a(this.a[0] + 83, this.a[1] + 73, 11, 11);
    this.c[3] = new ey("", false);
    this.c[3].a(this.a[0] + 83, this.a[1] + 90, 11, 11);
    ob ob1 = this;
    byte[] arrayOfByte;
    if ((arrayOfByte = cs.a.a(107)) != null) {
      String str = new String(arrayOfByte);
      ((ff)ob1.c[0]).c(str);
    } 
    if ((arrayOfByte = cs.a.a(108)) != null) {
      String str = new String(arrayOfByte);
      ((ff)ob1.c[1]).c(str);
    } 
    if (cs.a.c(109)) {
      arrayOfByte = cs.a.a(109);
      ((ey)ob1.c[2]).e((arrayOfByte[0] == 1));
    } 
    if (cs.a.c(110)) {
      arrayOfByte = cs.a.a(110);
      ((ey)ob1.c[3]).e((arrayOfByte[0] == 1));
    } 
    a(a.n);
    a(new ba());
    a.s().l();
    ks.a().a((kq)a.s());
    pa.a();
    this.c[0].d(true);
    a.s().c();
    ob1 = this;
    br br;
    (br = new br("Hỗ trợ", -1)).a(new br[] { new br("Quên mật khẩu", 202), new br("Tổng đài", 203), new br("Cài đặt", 204) });
    bs bs;
    (bs = new bs(new br[] { new br("Đăng nhập", 200), new br("Đăng ký", 201), br, new br("Thoát", 205) })).a(ob1);
    ob1.a(bs);
  }
  
  protected final void r() {
    boolean bool = true;
    boolean bool1 = ((ey)this.c[3]).a();
    if (gr.f && bool1) {
      bool = false;
      f();
    } else if (a.l != null && a.l.length > 0) {
      a.b(a.l);
      a.l = null;
    } 
    gr.f = false;
    if (bool)
      a.a(this); 
    ct.b("init SQLoginScreen");
  }
  
  protected final void e(int paramInt1, int paramInt2) {
    if (this.k)
      return; 
    for (byte b = 0; b < this.c.length; b++) {
      if (this.c[b].c(paramInt1, paramInt2)) {
        if (this.d != b) {
          this.c[this.d].d(false);
          this.d = b;
          this.c[this.d].d(true);
          return;
        } 
        break;
      } 
    } 
  }
  
  protected final void a(int paramInt) {
    if (this.k)
      return; 
    int i = this.d;
    switch (paramInt) {
      case 99:
        this.d--;
        if (this.d < 0)
          this.d = 0; 
      case 98:
        if (paramInt == 98) {
          this.d++;
          if (this.d > this.c.length - 1)
            this.d = this.c.length - 1; 
        } 
        this.c[i].d(false);
        this.c[this.d].d(true);
        return;
    } 
    this.c[this.d].f(paramInt);
  }
  
  protected final void e(int paramInt) {
    if (this.k)
      return; 
    switch (paramInt) {
      case 98:
      case 99:
        return;
    } 
    this.c[this.d].g(paramInt);
  }
  
  protected final void c() {
    for (byte b = 0; b < this.c.length; b++)
      this.c[b].n(); 
  }
  
  protected final void a(Graphics paramGraphics) {
    if (v.u > this.b.getHeight() || v.t > this.b.getWidth()) {
      paramGraphics.setColor(0);
      paramGraphics.fillRect(0, 0, v.t, v.u);
    } 
    paramGraphics.drawImage(this.b, v.t / 2, this.a[1] + 166, 33);
    for (byte b = 0; b < this.c.length; b++)
      this.c[b].a(paramGraphics, 0, 0); 
  }
  
  public final void d(int paramInt1, int paramInt2) {
    String str;
    he he;
    MGMIDlet mGMIDlet;
    switch (paramInt2) {
      case 6:
        ci.b(str = a.k(241220).toLowerCase().trim());
        a.s().l();
        break;
      case 7:
        a.s().a(false);
        break;
      case 200:
        f();
        break;
      case 201:
        a.s().L();
        break;
      case 202:
        (he = a.a("Nhập nick muốn lấy lại mật khẩu vào bên dưới", null, "Xong", 6, "Đóng", 7)).a(this);
        ag.b().a(he);
        break;
      case 203:
        MGMIDlet.d();
        MGMIDlet.b("1900588883");
        break;
      case 204:
        a.F();
        break;
      case 205:
        (mGMIDlet = MGMIDlet.d()).notifyDestroyed();
        break;
    } 
    c(false);
  }
  
  private void f() {
    String str1 = ((ff)this.c[0]).r();
    String str2 = ((ff)this.c[1]).r();
    if (!i.a(str1) && !i.a(str2)) {
      ob ob1;
      ey ey = (ey)(ob1 = this).c[2];
      ff ff = (ff)ob1.c[1];
      if (ey.a()) {
        cs.a.a(108, ff.r().getBytes());
        cs.a.a(109, new byte[] { 1 });
      } else {
        cs.a.a(109, new byte[1]);
        cs.a.b(108);
      } 
      if ((ey = (ey)ob1.c[3]).a()) {
        cs.a.a(110, new byte[] { 1 });
      } else {
        cs.a.a(110, new byte[1]);
      } 
      ff = (ff)ob1.c[0];
      cs.a.a(107, ff.r().getBytes());
      cs.a.a();
      go.e = str1 = str1.trim().toLowerCase();
      go.f = str2;
      a.s().a(null, null);
      pd.k();
      ks.a().a(str1, str2, go.a);
    } 
    go.t = true;
    go.t = (pd.G() == 0);
    pc.d();
  }
  
  public static void d() {
    go.c = pd.x();
    String str1;
    if ((str1 = pd.r()) != null && !str1.equals(go.e))
      pd.s(); 
    dz dz;
    (dz = new dz()).b = "vn";
    dz.e = v.t;
    dz.f = v.u;
    dz.g = 0;
    dz.c = "123456789";
    dz.d = "patriot";
    String str2 = System.getProperty("microedition.platform");
    dz.a = (str2 == null) ? " " : str2;
    if (a.m == null)
      a.m = new oi(); 
    du.a().a(a.m);
    du.a().a(dz);
    oi.r = System.currentTimeMillis();
    a.o = false;
  }
  
  protected final void s() {
    this.b = null;
    this.c = null;
    System.gc();
  }
  
  public final void e() {
    this.k = true;
    gy gy;
    (gy = new gy()).b(241222);
    h();
    gy.t();
    ag.b().a(gy);
    co.b().a("lv1", -1);
    co.b().e();
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ob.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */