import com.mg.sq.a;

public final class oe extends nz implements bf {
  private byte[] b;
  
  private int c;
  
  public oe(int paramInt, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    super((byte)0);
    this.c = paramInt;
    paramArrayOfbyte2 = paramArrayOfbyte2;
    oe oe2;
    (oe2 = this).b = paramArrayOfbyte2;
    a(this);
    int i = i();
    this.g -= ba.a;
    j(true);
    gh gh;
    (gh = new gh("Đăng ký")).a_(-1919);
    gh.d(i);
    gh.d(5, 5);
    gh.b(false);
    a(gh);
    gd gd3;
    (gd3 = new gd("Tên đăng nhập")).d(i);
    a(gd3);
    (gd3 = new gd("Mật Khẩu")).i(1);
    gd3.d(i);
    a(gd3);
    (gd3 = new gd("Nhập lại mật khẩu")).i(1);
    gd3.d(i);
    a(gd3);
    (gd3 = new gd("Họ tên: ")).d(i);
    a(gd3);
    ga ga;
    (ga = new ga("Ngày sinh ")).d(i);
    a(ga);
    gd gd2;
    (gd2 = new gd("Số điện thoại: ")).h(4);
    gd2.d(i);
    a(gd2);
    fx fx;
    (fx = new fx("Giới tính")).a(0, 0, i, 50);
    ey ey;
    (ey = new ey("Nam", false)).h(0);
    fx.a(ey);
    (ey = new ey("Nữ", false)).h(1);
    fx.a(ey);
    if (!gr.i)
      fx.h(0); 
    a(fx);
    g(1);
    gd gd1;
    (gd1 = new gd(paramArrayOfbyte1)).d(i);
    a(gd1);
    b(10);
    a(new ba());
    bd bd = new bd("Đăng ký", 1001);
    oe oe1;
    (oe1 = this).a(bd, true);
    bd = new bd("Hủy", 1000);
    (oe1 = this).b(bd, true);
    d(false);
  }
  
  public final void d(int paramInt1, int paramInt2) {
    oe oe1;
    al al;
    switch (paramInt2) {
      case 1001:
        if (d().trim().equals("")) {
          al al1;
          (al1 = ag.b().a("Chú ý", "Bạn chưa nhập tên nick. Vui lòng nhập tên nick!", "Đóng", 1005, 1)).a(this);
          ag.b().a(al1);
          return;
        } 
        if (e().equals(((gd)(oe1 = this).f(3)).a())) {
          oe1 = this;
          ks.a().a(d(), g.a(this.b, e()), ((gd)(oe1 = this).f(4)).a(), ((gd)(oe1 = this).f(6)).a(), new Long(((ga)oe1.f(5)).a()), ((gd)(oe1 = this).f(8)).a(), (byte)((fx)(oe1 = this).f(7)).a().q());
          a.s().a(null, null);
          return;
        } 
        (al = ag.b().a("Chú ý", "Mật khẩu không trùng nhau, vui lòng nhập lại!", "Đóng", 1005, 1)).a(this);
        ag.b().a(al);
        return;
      case 1006:
        go.e = d();
        go.f = e();
        ag.b().f(this.c);
        a.s().l();
        return;
      case 1005:
        ag.b().a(false);
        return;
    } 
    ag.b().f(this.c);
  }
  
  private String d() {
    return ((gd)f(1)).a();
  }
  
  private String e() {
    return ((gd)f(2)).a();
  }
  
  public final void a(String paramString) {
    if (this.c == 2) {
      al al;
      (al = ag.b().a("Chú ý", (paramString == null) ? "Chúc mừng bạn đã đăng ký thành công!" : paramString, "Đóng", 1006, 1)).a(this);
      ag.b().a(al);
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\oe.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */