import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class hv extends al implements bf {
  private byte k = 113;
  
  private cu l;
  
  private boolean m = false;
  
  private a n = new a(3);
  
  private String o;
  
  private int p;
  
  private String[] q;
  
  private String[] r;
  
  private gd s;
  
  private ex t;
  
  private ex u;
  
  private cu v;
  
  private cu w;
  
  private String[] x = new String[] { "Để bảo vệ tài khoản, bấm \"Khóa\" để người khác không thể đánh cắp tài khoản của bạn trong trường hợp bị lộ mật khẩu.", "Tài khoản của bạn đã được bảo vệ theo số đt trên." };
  
  private String[] y = new String[] { "Bạn cần xác thực số đt để được sử dụng các dịch vụ KEN tiện lợi hơn.", "Tài khoản của bạn đã xác thực với số đt trên." };
  
  public hv(String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    super(1);
    this.m = paramBoolean2;
    this.o = paramString;
    a(this);
    this.l = new cu(a() + 10, c() + 30);
    int i = i() - 2 - 2;
    int j = this.l.b + 8;
    this.p = paramBoolean1 ? 1 : 0;
    this.s = new gd("Số điện thoại: ");
    this.s.h(4);
    this.s.a(2, j, i, this.s.f());
    this.s.a(paramString);
    this.s.b(!paramBoolean1);
    j += this.s.f() + 4;
    this.n.a(this.s);
    this.v = new cu(2, j);
    this.q = bx.a(this.x[paramBoolean1 ? 1 : 0], i() - 10 - 10);
    j += this.q.length * bx.c.a() + 4;
    paramString = paramBoolean1 ? "Mở khóa" : "Khóa";
    byte b = paramBoolean1 ? 10 : 11;
    i = bx.d.a(paramString) + 30;
    int k = bx.d.a() + 2;
    this.t = new ex(paramString, b);
    this.t.a(this.f - i >> 1, j, i, k);
    this.n.a(this.t);
    j += this.t.f() + 10;
    this.w = new cu(2, j);
    this.r = bx.a(this.y[paramBoolean2 ? 1 : 0], i() - 10 - 10);
    j += this.r.length * bx.c.a() + 4;
    this.u = new ex("Xác thực", 15);
    i = bx.d.a("Xác thực") + 30;
    this.u.a(this.f - i >> 1, j, i, k);
    k(paramBoolean2);
    b(241216);
    a(new ba());
    bd bd = new bd("Đóng", 5);
    hv hv1;
    (hv1 = this).b(bd, true);
    d(false);
    ((aq)this.n.b(this.p)).d(true);
  }
  
  public final void c(Graphics paramGraphics) {
    paramGraphics.setColor(16777215);
    paramGraphics.fillRect(a(), c(), i(), j());
    paramGraphics.drawImage(pc.d, a() + i(), c() + j() - 4, 40);
    pc.a(paramGraphics, this.l.a, this.l.b, i() - (this.l.a << 1));
    bx.d.c(true);
    bx.d.a(paramGraphics, "Bảo Mật Tài Khoản", a() + i() / 2, c() + 6, 1);
    bx.d.c(false);
    int i;
    for (i = 0; i < this.n.d(); i++)
      ((aq)this.n.b(i)).a(paramGraphics, a(), c()); 
    bx.a(paramGraphics, bx.c, this.q, this.v.a + 2, this.v.b, i(), j(), 0);
    bx.a(paramGraphics, bx.c, this.r, this.w.a + 2, this.w.b, i(), j(), 0);
    if (this.p == 1) {
      i = this.v.b - 4;
      paramGraphics.setColor(7267055);
      paramGraphics.drawRect(this.v.a, i, this.f - this.v.a - this.v.a - 1, this.t.d() + this.t.f() + 4 + 2 - i);
      return;
    } 
    if (this.p == 2) {
      i = this.w.b - 4;
      paramGraphics.setColor(7267055);
      paramGraphics.drawRect(this.w.a, i, this.f - this.w.a - this.w.a - 1, this.u.d() + this.u.f() + 4 + 2 - i);
    } 
  }
  
  protected final void g() {
    ((aq)this.n.b(this.p)).n();
  }
  
  public final void i(boolean paramBoolean) {
    super.i(paramBoolean);
  }
  
  public final void d(int paramInt1, int paramInt2) {
    al al1;
    switch (paramInt2) {
      case 0:
        return;
      case 5:
        ag.b().a(false);
        return;
      case 11:
        if (this.s.a() == null) {
          al1 = ag.b().a("Chú ý", "Bạn chưa nhập số điện thoại!", "Đóng", 13, 1);
        } else {
          al1 = ag.b().a("Chú ý", "Bạn có chắc muốn khóa tài khoản với số đt đang sử dụng không?", "Có", 12, "Không", 13, 1);
        } 
        al1.a(this);
        al1.b(this.k);
        ag.b().a(al1, false);
        return;
      case 10:
        (al1 = ag.b().a("Chú ý", "Bạn có chắc là muốn mở khóa không? Chú ý khi mở khóa, tài khoản của bạn có thể bị người khác đánh cắp.", "Có", 114, "Không", 13, 1)).a(this);
        al1.b(this.k);
        ag.b().a(al1, false);
        return;
      case 15:
        if (this.s.a() == null) {
          al1 = ag.b().a("Chú ý", "Bạn chưa nhập số điện thoại!", "Đóng", 13, 1);
        } else {
          al1 = ag.b().a("Chú ý", "Bạn có chắc muốn xác thực tài khoản với số đt đang sử dụng không?", "Có", 17, "Không", 13, 1);
        } 
        al1.a(this);
        al1.b(this.k);
        ag.b().a(al1, false);
        return;
      case 13:
        ag.b().e(this.k);
        return;
      case 17:
        a.c(new hw(this));
        return;
      case 12:
        if (this.s.a() != null) {
          a.a(new hx(this));
          return;
        } 
        return;
      case 114:
        a.b(new hy(this));
        return;
      case 18:
        a.c(new hz(this));
        return;
    } 
    ag.b().a(h(), false);
  }
  
  public final void d(int paramInt) {}
  
  public final void c(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield n : La;
    //   4: aload_0
    //   5: getfield p : I
    //   8: invokevirtual b : (I)Ljava/lang/Object;
    //   11: checkcast aq
    //   14: instanceof gd
    //   17: ifeq -> 39
    //   20: aload_0
    //   21: getfield n : La;
    //   24: aload_0
    //   25: getfield p : I
    //   28: invokevirtual b : (I)Ljava/lang/Object;
    //   31: checkcast aq
    //   34: iload_1
    //   35: invokevirtual f : (I)Z
    //   38: pop
    //   39: aload_0
    //   40: getfield p : I
    //   43: istore_2
    //   44: iload_1
    //   45: tableswitch default -> 194, 95 -> 129, 96 -> 194, 97 -> 194, 98 -> 80, 99 -> 109
    //   80: aload_0
    //   81: getfield p : I
    //   84: aload_0
    //   85: getfield n : La;
    //   88: invokevirtual d : ()I
    //   91: iconst_1
    //   92: isub
    //   93: if_icmpge -> 194
    //   96: aload_0
    //   97: dup
    //   98: getfield p : I
    //   101: iconst_1
    //   102: iadd
    //   103: putfield p : I
    //   106: goto -> 194
    //   109: aload_0
    //   110: getfield p : I
    //   113: ifle -> 194
    //   116: aload_0
    //   117: dup
    //   118: getfield p : I
    //   121: iconst_1
    //   122: isub
    //   123: putfield p : I
    //   126: goto -> 194
    //   129: aload_0
    //   130: getfield n : La;
    //   133: aload_0
    //   134: getfield p : I
    //   137: invokevirtual b : (I)Ljava/lang/Object;
    //   140: checkcast aq
    //   143: dup
    //   144: astore_1
    //   145: instanceof ex
    //   148: ifeq -> 163
    //   151: aload_0
    //   152: iconst_m1
    //   153: aload_1
    //   154: checkcast ex
    //   157: invokevirtual a : ()I
    //   160: goto -> 191
    //   163: aload_1
    //   164: instanceof ey
    //   167: ifeq -> 194
    //   170: aload_1
    //   171: checkcast ey
    //   174: invokevirtual a : ()Z
    //   177: istore_1
    //   178: aload_0
    //   179: iconst_m1
    //   180: iload_1
    //   181: ifeq -> 189
    //   184: bipush #16
    //   186: goto -> 191
    //   189: bipush #15
    //   191: invokevirtual d : (II)V
    //   194: iload_2
    //   195: aload_0
    //   196: getfield p : I
    //   199: if_icmpeq -> 288
    //   202: aload_0
    //   203: getfield n : La;
    //   206: iload_2
    //   207: invokevirtual b : (I)Ljava/lang/Object;
    //   210: checkcast aq
    //   213: dup
    //   214: astore_1
    //   215: instanceof gd
    //   218: ifeq -> 255
    //   221: aload_1
    //   222: checkcast gd
    //   225: invokevirtual a : ()Ljava/lang/String;
    //   228: dup
    //   229: astore_1
    //   230: aload_0
    //   231: getfield o : Ljava/lang/String;
    //   234: invokevirtual equals : (Ljava/lang/Object;)Z
    //   237: ifne -> 255
    //   240: invokestatic a : ()Lks;
    //   243: aload_1
    //   244: invokevirtual p : (Ljava/lang/String;)V
    //   247: invokestatic s : ()Lcom/mg/sq/a;
    //   250: aconst_null
    //   251: aconst_null
    //   252: invokevirtual a : (Ljava/lang/String;Lil;)V
    //   255: aload_0
    //   256: getfield n : La;
    //   259: iload_2
    //   260: invokevirtual b : (I)Ljava/lang/Object;
    //   263: checkcast aq
    //   266: iconst_0
    //   267: invokevirtual d : (Z)V
    //   270: aload_0
    //   271: getfield n : La;
    //   274: aload_0
    //   275: getfield p : I
    //   278: invokevirtual b : (I)Ljava/lang/Object;
    //   281: checkcast aq
    //   284: iconst_1
    //   285: invokevirtual d : (Z)V
    //   288: return
  }
  
  public final void a(String paramString, boolean paramBoolean1, int paramBoolean2) {
    this.m = paramBoolean2;
    this.o = paramString;
    this.s.a(paramString);
    this.s.b(!paramBoolean1);
    int i = this.p;
    j(paramBoolean1);
    k(paramBoolean2);
    this.p = i;
    for (paramBoolean2 = 0; paramBoolean2 < this.n.d(); paramBoolean2++) {
      aq aq = (aq)this.n.b(paramBoolean2);
      if (paramBoolean2 == i) {
        aq.d(true);
      } else {
        aq.d(false);
      } 
    } 
  }
  
  public final void j(boolean paramBoolean) {
    this.s.b(!paramBoolean);
    String str = paramBoolean ? "Mở khóa" : "Khóa";
    byte b = paramBoolean ? 10 : 11;
    int i = bx.d.a(str) + 30;
    int j = bx.d.a() + 2;
    int k = this.s.d() + this.s.f() + 4;
    this.v = new cu(2, k);
    this.q = bx.a(this.x[paramBoolean ? 1 : 0], i() - 10 - 10);
    k += this.q.length * bx.c.a() + 4;
    this.t = new ex(str, b);
    this.t.a(this.f - i >> 1, k, i, j);
    this.n.a(this.t, 1);
    k += this.t.f() + 10;
    this.w = new cu(2, k);
    k(this.m);
    if (!paramBoolean) {
      ((aq)this.n.b(this.p)).d(false);
      this.p = 0;
    } 
    ((aq)this.n.b(this.p)).d(true);
  }
  
  public final void k(boolean paramBoolean) {
    this.m = paramBoolean;
    this.r = bx.a(this.y[this.m ? 1 : 0], i() - 10 - 10);
    int i = this.w.b + this.r.length * bx.c.a() + 4;
    this.u.a(this.u.c(), i, this.u.e(), this.u.f());
    this.u.a(!paramBoolean);
    if (this.u.i()) {
      paramBoolean = false;
      for (i = 0; i < this.n.d(); i++) {
        if (this.n.b(i).equals(this.u)) {
          paramBoolean = true;
          break;
        } 
      } 
      if (!paramBoolean) {
        this.n.a(this.u);
        return;
      } 
    } else {
      this.p = (this.p == this.n.d() - 1) ? (this.p - 1) : this.p;
      ((aq)this.n.b(this.p)).d(true);
      this.n.b(this.u);
      this.u.d(false);
    } 
  }
  
  public final void a(int paramInt1, int paramInt2) {
    paramInt1 -= this.c;
    paramInt2 -= this.d;
    for (byte b = 0; b < this.n.d(); b++) {
      aq aq = (aq)this.n.b(b);
      if (paramInt1 > aq.c() && paramInt1 < aq.c() + aq.e() && paramInt2 > aq.d() && paramInt2 < aq.d() + aq.f()) {
        if (this.p == b) {
          c(95);
          return;
        } 
        String str;
        if (aq = (aq)this.n.b(this.p) instanceof gd && !(str = ((gd)aq).a()).equals(this.o)) {
          ks.a().p(str);
          a.s().a(null, null);
        } 
        ((aq)this.n.b(this.p)).d(false);
        this.p = b;
        ((aq)this.n.b(this.p)).d(true);
        return;
      } 
    } 
  }
  
  static byte a(hv paramhv) {
    return paramhv.k;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\hv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */