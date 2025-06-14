import javax.microedition.lcdui.Graphics;

public abstract class an extends am {
  private av a;
  
  private boolean b;
  
  private bs c;
  
  private boolean d;
  
  private boolean k;
  
  private az[] l;
  
  public an(int paramInt) {
    b(paramInt);
    this.b = false;
    this.c = null;
    this.d = false;
    this.k = false;
    this.l = new az[3];
    this.a = null;
  }
  
  public final void a(bf parambf) {
    super.a(parambf);
  }
  
  public final boolean a_() {
    return this.b;
  }
  
  public final void a(boolean paramBoolean) {
    this.b = false;
  }
  
  public final void a(av paramav) {
    this.a = paramav;
  }
  
  public final void a(bs parambs) {
    az az1 = null;
    az1 = null;
    az1 = null;
    bs bs1 = parambs;
    an an1 = this;
    ao ao = new ao(an1, (byte)0);
    (az1 = ag.c().b(-90001)).a(-90001);
    az1.a(ao);
    bs1.a(az1);
    (az1 = ag.c().c(-90002)).a(-90002);
    az1.a(ao);
    bs1.b(az1);
    (az1 = ag.c().a(-90000)).a(-90000);
    az1.a(ao);
    az az2 = az1;
    an an2;
    (an2 = an1).a(az2, true);
    an1.c = bs1;
    an1.d = false;
  }
  
  public final void b(boolean paramBoolean) {
    this.k = true;
  }
  
  protected final void c(boolean paramBoolean) {
    v.c();
    if (this.c != null) {
      this.d = paramBoolean;
      if (paramBoolean) {
        for (paramBoolean = false; paramBoolean < this.j.length; paramBoolean++)
          this.l[paramBoolean] = this.j[paramBoolean]; 
        az az1 = this.c.a()[0];
        an an1;
        (an1 = this).a(az1, true);
        a((az)null);
        az1 = this.c.a()[2];
        (an1 = this).b(az1, true);
        int i = (this.c.e() > this.c.f()) ? this.c.e() : this.c.f();
        this.c.a_(-i, v.u);
        this.c.d(0, v.u - ba.a - this.c.f());
        return;
      } 
      for (paramBoolean = false; paramBoolean < this.j.length; paramBoolean++)
        this.j[paramBoolean] = this.l[paramBoolean]; 
      this.c.t();
      return;
    } 
    this.d = false;
  }
  
  protected void a(int paramInt) {}
  
  public final void c(int paramInt) {
    if (this.d) {
      if (this.c != null && !this.c.f(paramInt))
        c(false); 
      return;
    } 
    a(paramInt);
  }
  
  protected void e(int paramInt) {}
  
  public final void d(int paramInt) {
    if (this.d)
      return; 
    e(paramInt);
  }
  
  protected void e(int paramInt1, int paramInt2) {}
  
  public final void a(int paramInt1, int paramInt2) {
    if (this.d) {
      if (this.c != null && !this.c.c(paramInt1, paramInt2))
        c(false); 
      return;
    } 
    e(paramInt1, paramInt2);
  }
  
  protected void f(int paramInt1, int paramInt2) {}
  
  public final void b(int paramInt1, int paramInt2) {
    if (this.d)
      return; 
    f(paramInt1, paramInt2);
  }
  
  protected void g(int paramInt1, int paramInt2) {}
  
  public final void c(int paramInt1, int paramInt2) {
    if (this.d)
      return; 
    g(paramInt1, paramInt2);
  }
  
  protected abstract void c();
  
  public final void b_() {
    if (this.d) {
      if (this.c == null) {
        this.d = false;
      } else {
        this.c.n();
      } 
      if (!this.k)
        return; 
    } 
    if (this.a != null);
    c();
  }
  
  protected abstract void a(Graphics paramGraphics);
  
  public final void c(Graphics paramGraphics) {
    if (this.a != null)
      this.a.a(paramGraphics); 
    a(paramGraphics);
    if (this.d) {
      if (this.c == null) {
        this.d = false;
        return;
      } 
      this.c.a(paramGraphics, 0, 0);
    } 
  }
  
  static bs a(an paraman) {
    return paraman.c;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\an.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */