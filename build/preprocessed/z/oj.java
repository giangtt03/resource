import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class oj extends fb implements bf, bg, bn, bq {
  private aw p;
  
  private ay q;
  
  private op r;
  
  public oj(int paramInt1, int paramInt2, String paramString) {
    super(105, 2, paramString, false);
    a(0, 0, v.t, v.u);
    this.p = new aw();
    this.p.a(this);
    this.p.a(this);
    this.q = new ay(2);
    this.q.a(c(), d() + 22, e(), f() - 22 - ba.a);
    this.q.b(this.p);
    this.p.e(true);
    a(new ba());
    a(new gb(-1, 0));
    b(new gb(-2, 1));
    c(a.n);
    a(this);
    this.r = new op(this, 106, 3, "Đàm Đạo");
  }
  
  public final boolean a() {
    return (this.p.a() > 0);
  }
  
  public final op v() {
    return this.r;
  }
  
  public final void x() {
    this.q.c(true);
  }
  
  public final void y() {}
  
  public final void c(boolean paramBoolean) {
    super.c(paramBoolean);
    if (paramBoolean)
      this.q.c(true); 
  }
  
  public final int a(String paramString) {
    for (byte b = 0; b < this.p.a(); b++) {
      di di;
      if ((di = (di)this.p.i(b)).b().a().equals(paramString))
        return b; 
    } 
    return -1;
  }
  
  private di b(String paramString) {
    di di = null;
    int i;
    if ((i = a(paramString)) >= 0)
      di = (di)this.p.i(i); 
    return di;
  }
  
  public final void a(ds paramds) {
    int i;
    if ((i = a(paramds.a())) >= 0) {
      di di;
      (di = (di)this.p.i(i)).a(paramds);
      this.p.b(di, i);
    } 
  }
  
  public final void a(di paramdi) {
    try {
      this.p.b(paramdi);
      if (this.b != null) {
        fc fc = (fc)this.b;
        if (this.p.a() <= 0)
          fc.d(this); 
        fc.d(this.r);
        this.r.a();
        return;
      } 
    } catch (Exception exception) {
      (paramdi = null).printStackTrace();
    } 
  }
  
  public final di a(String paramString1, String paramString2, int paramInt) {
    di di;
    if ((di = b(paramString1)) != null) {
      boolean bool = di.a(paramString2, 0);
      if (this.r.p != null && di.b().a().equals(this.r.p.b().a()))
        this.r.a(di.a(di.d() - 1), bool); 
    } 
    return di;
  }
  
  public final di b(String paramString1, String paramString2, int paramInt) {
    di di;
    if ((di = b(paramString1)) != null) {
      boolean bool = di.b(paramString2, paramInt);
      if (this.r.p != null && di.b().a().equals(this.r.p.b().a()))
        this.r.a(di.a(di.d() - 1), bool); 
    } 
    return di;
  }
  
  public final di a(ds paramds, String paramString, int paramInt, boolean paramBoolean) {
    di di = new di(paramds, this.p.e() - 20, paramBoolean, a.m.K());
    this.p.a(di);
    di.b(paramString, paramInt);
    if (this.p.a() < 2)
      a(di, false); 
    return di;
  }
  
  public final void a(ds paramds, boolean paramBoolean1, boolean paramBoolean2) {
    di di;
    if ((di = b(paramds.a())) == null) {
      di = new di(paramds, this.p.e() - 20, paramBoolean1, a.m.K());
      this.p.a(di);
      du.a().b(paramds.a());
    } 
    if (paramBoolean2)
      a(di, true); 
  }
  
  private void a(di paramdi, boolean paramBoolean) {
    if (this.r.p == null || !paramdi.b().a().equals(this.r.p.b().a()))
      this.r.a(paramdi); 
    if (this.b == null)
      return; 
    fc fc;
    if (!(fc = (fc)l()).b(this.r))
      fc.c(this.r); 
    if (paramBoolean)
      fc.a(this.r); 
  }
  
  public final boolean f(int paramInt) {
    return (paramInt == 97 || paramInt == 96) ? false : this.q.f(paramInt);
  }
  
  public final boolean e(int paramInt1, int paramInt2) {
    return this.q.e(paramInt1, paramInt2);
  }
  
  public final boolean c(int paramInt1, int paramInt2) {
    return this.q.c(paramInt1, paramInt2);
  }
  
  public final boolean f(int paramInt1, int paramInt2) {
    return this.q.f(paramInt1, paramInt2);
  }
  
  public final void n() {
    this.q.n();
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    boolean bool;
    if (bool = this.q.k()) {
      paramGraphics.setColor(v.am);
      paramGraphics.fillRect(c(), d(), e(), f());
      paramGraphics.drawImage(pc.d, c() + e(), d() + f() - ba.a, 40);
      pc.a(paramGraphics, 4, 20, v.t - 8);
      bx.d.c(true);
      bx.d.a(paramGraphics, "Đàm Đạo", e() / 2, 2, 1);
      bx.d.c();
    } 
    this.q.a(paramGraphics, c(), d());
  }
  
  public final String[] w() {
    String[] arrayOfString = new String[this.p.a()];
    for (byte b = 0; b < arrayOfString.length; b++) {
      di di = (di)this.p.i(b);
      arrayOfString[b] = di.b().a();
    } 
    return arrayOfString;
  }
  
  public final ds[] z() {
    ds[] arrayOfDs = new ds[this.p.a()];
    for (byte b = 0; b < arrayOfDs.length; b++) {
      di di = (di)this.p.i(b);
      arrayOfDs[b] = di.b();
    } 
    return arrayOfDs;
  }
  
  public final aq a(aw paramaw, int paramInt) {
    Object object = object = paramaw.i(paramInt);
    return new eu(object.b(), this.q.e());
  }
  
  public final void b(aq paramaq, int paramInt) {
    Object object = this.p.i(paramInt);
    a((di)object, true);
  }
  
  public final void a(aq paramaq, int paramInt) {
    if (this.p.s() == paramInt)
      this.p.k(paramInt); 
  }
  
  public final void a(aq paramaq, int paramInt1, int paramInt2) {}
  
  public final void d(int paramInt1, int paramInt2) {
    oj oj1;
    bs bs;
    br[] arrayOfBr;
    int i;
    switch (paramInt2) {
      case -1:
        oj1 = this;
        (bs = new bs()).a(new gb(0, 2));
        bs.b(new gb(1, 3));
        arrayOfBr = new br[] { new br("Đóng", 10001), new br("Đóng Hết", 10000) };
        if (a.m != null)
          arrayOfBr = oi.b(arrayOfBr, 2); 
        bs.a(arrayOfBr);
        i = (bs.e() > bs.f()) ? bs.e() : bs.f();
        bs.a_(-i, v.u);
        bs.d(0, v.u - ba.a - bs.f());
        bs.a(oj1);
        oj1.a(bs);
        return;
      case 1:
        t();
        return;
      case 0:
        this.l.f(95);
        return;
    } 
    ((fc)this.b).a();
  }
  
  public final void a(int paramInt1, int paramInt2, Object paramObject) {
    fc fc;
    switch (paramInt2) {
      case 10001:
        if (this.p.a() > 0) {
          di di = (di)this.p.t();
          fc = null;
          if (this.b != null)
            fc = (fc)this.b; 
          if (this.r.p != null && this.r.p.equals(di)) {
            if (fc != null)
              fc.d(this.r); 
            this.r.a();
          } 
          this.p.b(di);
          if (this.p.a() <= 0 && fc != null)
            fc.d(this); 
        } 
        t();
        break;
      case 10000:
        this.p.q();
        if (this.b != null) {
          fc fc1;
          (fc1 = (fc)this.b).d(this);
          fc1.d(this.r);
          this.r.a();
        } 
        t();
        break;
      default:
        if (a.m != null && this.l != null)
          a.m.j(fc); 
        break;
    } 
    t();
  }
  
  public final void A() {
    if (this.b == null)
      return; 
    fc fc = (fc)l();
    oj oj1 = this;
    boolean bool = false;
    for (byte b = 0; b < oj1.p.a(); b++) {
      di di = (di)oj1.p.i(b);
      eu eu = (eu)oj1.p.o(b);
      if (di.a)
        bool = true; 
      eu.k = di.a;
    } 
    if (bool) {
      fc.e(this);
      c(true);
      return;
    } 
    fc.f(this);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\oj.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */