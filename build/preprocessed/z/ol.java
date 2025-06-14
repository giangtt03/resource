import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class ol extends fb implements bf, r {
  private oa u;
  
  public aq p;
  
  private int v = -1;
  
  private int w;
  
  public int q;
  
  private az[] x;
  
  public String r;
  
  public boolean s = false;
  
  public boolean t = false;
  
  private int y;
  
  public ol(int paramInt1, int paramInt2, String paramString, oa paramoa) {
    super(100, 0, paramString, true);
    try {
      ct.b("main tab");
      this.u = paramoa;
      a(this);
      ol ol1 = this;
      if (oa.b == null || oa.c == null) {
        pa.a().a(go.w, paramoa);
      } else {
        k(1);
      } 
      d(v.t);
      e(v.u);
      a(new ba());
      this.m = new ax(3);
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } 
  }
  
  public final void c(boolean paramBoolean) {
    super.c(paramBoolean);
    if (this.p != null)
      this.p.c(paramBoolean); 
  }
  
  public final void n() {
    if (this.v >= 0) {
      k(this.v);
      return;
    } 
    if (this.p != null)
      this.p.n(); 
  }
  
  protected final void r() {
    if (this.p != null) {
      oq oq;
      switch (this.p.b()) {
        case 1:
          ((om)this.p).a();
          return;
        case 3:
          ((os)this.p).a();
          return;
        case 2:
          (oq = (oq)this.p).n();
          break;
      } 
    } 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (this.p != null)
      this.p.a(paramGraphics, paramInt1, paramInt2); 
    c(true);
  }
  
  public final boolean f(int paramInt) {
    if (this.p != null)
      this.p.f(paramInt); 
    return true;
  }
  
  public final boolean g(int paramInt) {
    if (this.p != null)
      this.p.g(paramInt); 
    return true;
  }
  
  public final boolean c(int paramInt1, int paramInt2) {
    if (this.p != null)
      this.p.c(paramInt1, paramInt2); 
    return true;
  }
  
  public final boolean f(int paramInt1, int paramInt2) {
    if (this.p != null)
      this.p.f(paramInt1, paramInt2); 
    return true;
  }
  
  public final boolean e(int paramInt1, int paramInt2) {
    return super.e(paramInt1, paramInt2);
  }
  
  public final void d(int paramInt1, int paramInt2) {
    if (paramInt2 == 0)
      ag.b().a(false); 
  }
  
  public final void j(int paramInt) {
    this.v = paramInt;
  }
  
  private void k(int paramInt) {
    this.v = -1;
    a((bf)null);
    if (this.p != null) {
      if (this.p.b() != paramInt)
        this.q = this.p.b(); 
      if (paramInt == 1)
        this.r = null; 
      switch (this.p.b()) {
        case 1:
          ((om)this.p).r();
          oa.c = null;
          oa.b = null;
          ((om)this.p).w();
          this.r = null;
          break;
        case 3:
          this.r = ((os)this.p).j;
          break;
      } 
    } 
    this.w = paramInt;
    this.p = null;
    System.gc();
    ct.b("[processChangeView]");
    s.a().a(this);
  }
  
  public final void y() {
    this.p = null;
  }
  
  public final void v() {
    this.x = new az[this.k.length];
    for (byte b = 0; b < this.x.length; b++)
      this.x[b] = this.k[b]; 
  }
  
  public final void w() {
    this.k = this.x;
  }
  
  public final void z() {
    for (byte b = 0; b < this.k.length; b++)
      this.k[b] = null; 
  }
  
  public final void a() {
    try {
      boolean bool = (this.p == null) ? true : this.p.b();
      mb.a();
      switch (this.w) {
        case 1:
          this.t = false;
          this.p = new om(1, this, this.u);
          break;
        case 2:
          this.p = new oq(2, this, this.u);
          break;
        case 3:
          this.p = new os(3, this.u, this);
          if (this.r != null)
            a(this.r, null, 0L, this.y); 
          break;
      } 
      a((bf)this.p);
      if (this.w == 1 || this.w == 3) {
        try {
          Thread.sleep(100L);
        } catch (InterruptedException interruptedException2) {
          InterruptedException interruptedException1;
          (interruptedException1 = null).printStackTrace();
        } 
        this.s = this.u.w();
        if (go.t)
          if (go.s == 0L) {
            a.g("Bạn chưa có KEN. Bạn có muốn nạp không?");
            go.t = false;
          } else if (go.s <= 2000L) {
            a.g("Bạn sắp hết KEN. Bạn có muốn nạp không?");
            go.t = false;
          }  
        this.u.f();
        if (bool == 2) {
          ks.a().d();
          return;
        } 
      } 
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
    } 
  }
  
  public final void a(String paramString1, String paramString2, long paramLong, int paramInt) {
    this.t = true;
    this.y = paramInt;
    if (this.p instanceof os)
      ((os)this.p).a(paramString1, paramString2, paramLong, paramInt); 
  }
  
  public final void a(lh paramlh1, lh paramlh2, boolean paramBoolean, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte paramByte1, byte paramByte2) {
    ha ha = null;
    if (this.p instanceof om) {
      ha = ((om)this.p).q;
      ((om)this.p).r();
    } else if (this.p instanceof oq) {
      ((oq)this.p).a(paramlh1, paramlh2, paramArrayOfbyte1, paramArrayOfbyte2, paramArrayOfbyte3, paramByte1, paramByte2);
    } 
    if (ha == null) {
      mg mg2;
      ag.b().l();
      if (this.p instanceof om) {
        (mg2 = ((om)this.p).l.e.u()).a(lc.a(paramlh1));
        mg2.a(nr.a(paramlh1));
        ((om)this.p).e(false);
      } else {
        (mg2 = mb.a(paramlh1, false)).a(lc.a(paramlh1));
        mg2.a(nr.a(paramlh1));
      } 
      mg mg1;
      (mg1 = mb.a(paramlh2, false)).a(lc.a(paramlh2));
      mg1.a(nr.a(paramlh2));
      (ha = new ha(mg2, mg1, true, paramBoolean, 99030, this.u)).a(this);
      ha.a(paramlh2);
      ag.b().a(ha, false);
    } 
    a.s().v();
    ha.t();
    a.s().b().b();
  }
  
  public final void A() {
    oq.v();
    if (this.p != null)
      switch (this.p.b()) {
        case 1:
          ((om)this.p).w();
          break;
        case 2:
          ((oq)this.p).u();
          break;
      }  
    a((bf)null);
    this.p = null;
    this.u = null;
    ct.b("Finish MainTab.destroy()");
  }
  
  public final void a(int[] paramArrayOfint, String[] paramArrayOfString) {
    boolean bool = true;
    ol ol1;
    if (((ol1 = this).p != null && ol1.p.b() == 1))
      ((om)this.p).a(paramArrayOfint, paramArrayOfString); 
  }
  
  public final void x() {}
  
  public final void t() {
    super.t();
    if (this.p != null && this.p.b() == 2)
      a((ba)null); 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ol.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */