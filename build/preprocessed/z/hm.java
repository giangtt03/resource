import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class hm extends he implements af, bf, bq {
  private ay m;
  
  private aw n;
  
  private bs o;
  
  private az p;
  
  private az q;
  
  private az r;
  
  private String s;
  
  public hm(String[] paramArrayOfString) {
    b(241218);
    a(this);
    a(new ba());
    int j = this.f - 10 - 10;
    this.g -= ba.a;
    bb bb;
    (bb = new bb("Danh sách số điện thoại có thể nạp KEN", j, bx.d)).a_(10, 10);
    a(bb);
    int i = 10 + bb.f() + 6;
    ff ff;
    (ff = new ff("", 20, 4)).d(true);
    ff.a(10, i, j / 2, 20);
    a(ff);
    int k = bx.d.a("Thêm") + 30;
    ex ex;
    (ex = new ex("Thêm", 1)).a(ff.c() + ff.e() + 10, i, k, 20);
    a(ex);
    i += ex.f() + 10 + 3;
    this.m = new ay(1);
    j = j - 3 - 3;
    this.m.a(this.f - j >> 1, i, j, this.g - i - 10);
    this.m.e(false);
    this.n = new aw();
    this.n.a(this);
    this.m.b(this.n);
    a(paramArrayOfString);
    a(this.m);
    this.m.d(false);
    this.m.f();
    a(this.c, this.d, this.f, this.g);
    this.p = new gb(2, 0);
    this.r = new gb(3, 2);
    this.q = new gb(0, 3);
    a(a.n);
    az az1 = this.p;
    hm hm1;
    (hm1 = this).a(az1, true);
    az1 = this.q;
    (hm1 = this).b(az1, true);
    f(1);
  }
  
  public final void d(int paramInt1, int paramInt2) {
    ff ff;
    hm hm1;
    String str;
    bs bs1;
    aw aw1;
    hm hm3;
    int i;
    hm hm2;
    byte b;
    az az1;
    if (h(paramInt2)) {
      t();
      return;
    } 
    switch (paramInt2) {
      case 1:
        if ((str = (ff = (ff)this.k.b(1)).r()) == null || str.equals(""))
          return; 
        aw1 = (aw)((ay)this.k.b(3)).w();
        ff.c("");
        for (b = 0; b < aw1.a(); b++) {
          o o;
          if ((o = ((bb)aw1.o(b)).a()).i().equals(str))
            return; 
        } 
        du.a().f(str);
        a.s().a(null, null);
        return;
      case 4:
        du.a().g(this.s);
        this.s = null;
        a.s().a(null, null);
        return;
      case 0:
        if (this.o != null) {
          t();
          return;
        } 
        ag.b().a(h(), false);
        return;
      case 2:
        hm1 = this;
        bs1 = new bs();
        if ((hm3 = hm1).l == 3)
          bs1.a(new br("Bỏ ra", 111)); 
        bs1.a(new br("Thêm", 113));
        bs1.a(new br("Đóng", 112));
        i = (bs1.e() > bs1.f()) ? bs1.e() : bs1.f();
        bs1.a_(-i, hm1.j() - bs1.f() + i);
        bs1.d(0, v.u - ba.a - bs1.f());
        bs1.a(hm1);
        hm1.a(bs1);
        az1 = hm1.q;
        (hm2 = hm1).b(az1, true);
        az1 = hm1.r;
        (hm2 = hm1).a(az1, true);
        bs1.c(a.n);
        return;
      case 3:
        if (this.o != null)
          h(this.o.r().c()); 
        break;
    } 
  }
  
  protected final void a(Graphics paramGraphics) {
    super.a(paramGraphics);
    if (this.m != null) {
      int i = 7070703;
      i = 15621212;
      k k = this.m.q();
      aq aq;
      if (this.m.m() && (aq = this.n.u()) != null) {
        paramGraphics.setColor(10223465);
        paramGraphics.fillRect(this.m.c() - k.a + this.c - 2, aq.d() - k.b + this.m.d() + this.d - 2, this.m.e() + 4, aq.f());
      } 
      pc.a(paramGraphics, this.m.c() + this.c - 3, this.m.d() + this.d - 6, this.m.e() + 3 + 3, this.m.f() + 3 + 3, i, -1);
    } 
  }
  
  public final void c(Graphics paramGraphics) {
    super.c(paramGraphics);
    if (this.o != null)
      this.o.a(paramGraphics, 0, 0); 
  }
  
  private void a(bs parambs) {
    this.o = parambs;
    e(true);
  }
  
  private void t() {
    this.o = null;
    az az1 = this.q;
    hm hm1;
    (hm1 = this).b(az1, true);
    az1 = this.p;
    (hm1 = this).a(az1, true);
    e(true);
  }
  
  protected final void g() {
    super.g();
    if (this.o != null) {
      this.o.n();
      e(true);
    } 
  }
  
  public final void a(ae paramae) {}
  
  public final void b(aq paramaq, int paramInt) {
    paramaq = ((aw)paramaq).o(paramInt);
    k k2 = this.m.q();
    k k1 = new k(this.m.c() - k2.a + this.c, paramaq.d() - k2.b + this.m.d() + this.d, this.m.e(), paramaq.f());
    k2 = k1;
    hm hm1 = this;
    bs bs1;
    (bs1 = new bs()).a(new br("Bỏ ra", 111));
    int j = k2.a + hm1.c + (k2.c - bs1.e()) / 2;
    int i;
    if ((i = k2.b + hm1.d + k2.d) + bs1.f() > v.u - ba.a)
      i = v.u - ba.a - bs1.f(); 
    bs1.a_(hm1.c + hm1.f + bs1.e(), i);
    bs1.d((j < hm1.c) ? hm1.c : ((j + bs1.e() > hm1.c + hm1.f) ? (hm1.c + hm1.f - bs1.e()) : j), i);
    bs1.a(hm1);
    az az1 = hm1.q;
    hm hm2;
    (hm2 = hm1).b(az1, true);
    az1 = hm1.r;
    (hm2 = hm1).a(az1, true);
    bs1.a_(1);
    hm1.a(bs1);
  }
  
  public final void a(aq paramaq, int paramInt) {}
  
  public final void a(aq paramaq, int paramInt1, int paramInt2) {}
  
  private boolean h(int paramInt) {
    o o;
    switch (paramInt) {
      case 111:
        o = ((bb)this.n.u()).a();
        this.s = o.i();
        e(true);
        d(-1, 4);
        return true;
      case 112:
        ag.b().a(h(), false);
        return true;
      case 113:
        f(1);
        e(true);
        return true;
    } 
    return false;
  }
  
  public final void c(int paramInt) {
    if (this.o != null) {
      int i = paramInt;
      az[] arrayOfAz = this.o.a();
      hm hm1 = this;
      if (hm1.i != null)
        hm1.i.d(-1, arrayOfAz[0].a()); 
      if (hm1.i != null)
        hm1.i.d(-1, arrayOfAz[1].a()); 
      if (hm1.i != null)
        hm1.i.d(-1, arrayOfAz[2].a()); 
      if ((i == 94 && arrayOfAz[0] != null && arrayOfAz[0].b()) ? true : ((i == 95 && arrayOfAz[1] != null && arrayOfAz[1].b()) ? true : ((i == 93 && arrayOfAz[2] != null && arrayOfAz[2].b())))) {
        v.c();
        return;
      } 
      if (this.o.f(paramInt))
        return; 
      t();
      return;
    } 
    super.c(paramInt);
  }
  
  public final void a(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield o : Lbs;
    //   4: ifnull -> 116
    //   7: aload_0
    //   8: aload_0
    //   9: getfield o : Lbs;
    //   12: invokevirtual a : ()[Laz;
    //   15: iload_1
    //   16: iload_2
    //   17: istore #6
    //   19: istore #5
    //   21: astore #4
    //   23: astore_3
    //   24: iconst_0
    //   25: istore #7
    //   27: goto -> 85
    //   30: aload #4
    //   32: iload #7
    //   34: aaload
    //   35: ifnull -> 82
    //   38: aload #4
    //   40: iload #7
    //   42: aaload
    //   43: iload #5
    //   45: iload #6
    //   47: invokevirtual a : (II)Z
    //   50: ifeq -> 82
    //   53: aload_3
    //   54: getfield i : Lbf;
    //   57: ifnull -> 78
    //   60: aload_3
    //   61: getfield i : Lbf;
    //   64: iconst_m1
    //   65: aload #4
    //   67: iload #7
    //   69: aaload
    //   70: invokevirtual a : ()I
    //   73: invokeinterface d : (II)V
    //   78: iconst_1
    //   79: goto -> 94
    //   82: iinc #7, 1
    //   85: iload #7
    //   87: aload #4
    //   89: arraylength
    //   90: if_icmplt -> 30
    //   93: iconst_0
    //   94: ifeq -> 98
    //   97: return
    //   98: aload_0
    //   99: getfield o : Lbs;
    //   102: iload_1
    //   103: iload_2
    //   104: invokevirtual c : (II)Z
    //   107: ifeq -> 111
    //   110: return
    //   111: aload_0
    //   112: invokespecial t : ()V
    //   115: return
    //   116: aload_0
    //   117: iload_1
    //   118: iload_2
    //   119: invokespecial a : (II)V
    //   122: return
  }
  
  public final void a(String[] paramArrayOfString) {
    this.n.q();
    for (byte b = 0; b < paramArrayOfString.length; b++)
      this.n.a(paramArrayOfString[b]); 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\hm.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */