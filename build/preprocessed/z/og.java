import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class og extends an implements bf, ik {
  private ay b;
  
  private oh c;
  
  jm[] a;
  
  private String[] d = new String[] { 
      "Hoa Lư", "Kỳ Bố", "Bình Kiều", "Đằng Châu", "Đỗ Động Giang", "Tế Giang", "Siêu Loại", "Tây Phù Liệt", "Đường Lâm", "Cổ Loa", 
      "Tiên Du", "Tam Đái", "Phong Châu", "Hồi Hồ", "Luyện Ngục", "Thiên Môn", "Mẫu Sơn" };
  
  public og() {
    super(4);
    bd bd = new bd("Đăng Xuất", -2);
    og og1;
    (og1 = this).b(bd, true);
    a(new ba());
    a(this);
    ag.b().l();
    try {
      e();
      return;
    } catch (OutOfMemoryError outOfMemoryError) {
      if (a.m != null)
        a.m.G(); 
      try {
        e();
        return;
      } catch (OutOfMemoryError outOfMemoryError1) {
        a.s().j(1);
        return;
      } 
    } 
  }
  
  private void e() {
    this.c = new oh(this);
    this.b = new ay(2);
    this.b.h(1);
    int i = 0;
    int j = 0;
    int k = v.t;
    int m = v.u - ba.a;
    if (k > oh.a(this.c).getWidth()) {
      i = (k - oh.a(this.c).getWidth()) / 2;
      k = oh.a(this.c).getWidth();
    } 
    if (m > oh.a(this.c).getHeight()) {
      j = (m - oh.a(this.c).getHeight()) / 2;
      m = oh.a(this.c).getHeight();
    } 
    this.b.a(i, j, k, m);
    oh.a(this.c, i, j);
    this.b.b(this.c);
    this.c.a();
  }
  
  protected final void r() {
    go.x = 0;
    oh.a(this.c, new cu((oh.b(this.c)[0]).a + (oh.b(this.c)[0]).c / 2, (oh.b(this.c)[0]).b + (oh.b(this.c)[0]).d / 2));
    this.c.a();
    pa.a().a("M99", this);
  }
  
  protected final void a(Graphics paramGraphics) {
    this.b.a(paramGraphics, 0, 0);
  }
  
  protected final void c() {
    this.b.n();
  }
  
  protected final void a(int paramInt) {
    this.b.f(paramInt);
  }
  
  protected final void e(int paramInt) {
    this.b.g(paramInt);
  }
  
  protected final void g(int paramInt1, int paramInt2) {
    this.b.e(paramInt1, paramInt2);
  }
  
  protected final void e(int paramInt1, int paramInt2) {
    this.b.c(paramInt1, paramInt2);
  }
  
  protected final void f(int paramInt1, int paramInt2) {
    this.b.f(paramInt1, paramInt2);
  }
  
  protected final void s() {
    this.a = null;
    this.b = null;
    this.i = null;
    oh.c(this.c);
    this.c = null;
  }
  
  public final void d(int paramInt1, int paramInt2) {
    if (paramInt2 == -2) {
      a.u();
      return;
    } 
    if (paramInt2 == -1)
      f(); 
  }
  
  private static void f() {
    a.s().a(null, null, 5000);
    ks.a().b("M99", go.x);
  }
  
  public final void d() {}
  
  public final void a(jn paramjn, byte[][] paramArrayOfbyte) {
    a.s().v();
    if (paramArrayOfbyte == null || paramArrayOfbyte.length <= 0)
      try {
        this.a = paramjn.l;
        if (go.x >= 0 && this.a != null && !(this.a[go.x]).h) {
          bd bd = new bd("Vào Thành", -1);
          og og1;
          (og1 = this).a(bd, true);
          return;
        } 
        n();
        return;
      } catch (Exception exception) {
        (paramjn = null).printStackTrace();
      }  
  }
  
  static void a(og paramog) {
    f();
  }
  
  static String[] b(og paramog) {
    return paramog.d;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\og.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */