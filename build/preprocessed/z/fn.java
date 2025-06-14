import javax.microedition.lcdui.Graphics;

public class fn extends aq implements bu {
  protected g j = new g();
  
  protected a k = new a();
  
  protected int l;
  
  protected k m;
  
  bq n;
  
  public final void a(bq parambq) {
    this.n = parambq;
  }
  
  public final int q() {
    return this.l;
  }
  
  public final int r() {
    return this.k.d();
  }
  
  public final aq[] s() {
    aq[] arrayOfAq = new aq[this.k.d()];
    for (byte b = 0; b < arrayOfAq.length; b++)
      arrayOfAq[b] = (aq)this.k.b(b); 
    return arrayOfAq;
  }
  
  public synchronized void b(aq paramaq) {
    this.k.a(paramaq);
    paramaq.a(this);
    if (this.k.d() == 1) {
      i(0);
    } else {
      a();
    } 
    if (this.b != null && this.b instanceof ay)
      ((ay)this.b).o(); 
  }
  
  public synchronized void a(aq paramaq, int paramInt) {
    this.k.b(paramaq, paramInt);
    paramaq.a(this);
    if (paramInt < this.l)
      i(this.l + 1); 
    a();
    if (this.b != null && this.b instanceof ay)
      ((ay)this.b).o(); 
  }
  
  public synchronized void c(aq paramaq) {
    for (byte b = 0; b < this.k.d(); b++) {
      if (this.k.b(b).equals(paramaq)) {
        h(b);
        return;
      } 
    } 
  }
  
  public synchronized void h(int paramInt) {
    if (paramInt < 0 || paramInt >= this.k.d())
      return; 
    this.k.a(paramInt);
    if (paramInt == this.l) {
      if (paramInt == this.k.d() - 1) {
        i(this.l - 1);
      } else {
        i(this.l);
      } 
    } else if (paramInt < this.l) {
      i(this.l - 1);
    } 
    a();
    if (this.b != null && this.b instanceof ay)
      ((ay)this.b).o(); 
  }
  
  public final synchronized void t() {
    this.k.a();
    if (this.b != null && this.b instanceof ay)
      ((ay)this.b).o(); 
    a();
    this.l = 0;
  }
  
  public final void a(aq paramaq) {
    super.a(paramaq);
    if (paramaq instanceof ay)
      this.m = ((ay)paramaq).r(); 
  }
  
  public final aq u() {
    return j(this.l);
  }
  
  public final void i(int paramInt) {
    if (paramInt < 0 || paramInt >= this.k.d()) {
      ct.a("[MGLayout]setSelectedComponent(...) vuot qua mang index = " + paramInt);
      return;
    } 
    aq aq1 = null;
    for (byte b = 0; b < this.k.d(); b++) {
      aq1 = j(b);
      if (b != paramInt) {
        aq1.d(false);
      } else {
        aq1.d(true);
        this.l = paramInt;
      } 
    } 
    if (this.n != null)
      this.n.a(aq1, 0, paramInt); 
    a();
  }
  
  public final aq j(int paramInt) {
    aq aq1;
    return (paramInt < 0) ? null : (aq1 = (aq)this.k.b(paramInt));
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (this.m == null)
      if (l() != null) {
        this.m = ((ay)l()).r();
      } else {
        this.m = new k(0, 0, e(), f());
      }  
    paramInt1 += c() - this.m.a;
    paramInt2 += d() - this.m.b;
    int i = this.k.d();
    for (byte b = 0; b < i; b++) {
      aq aq1;
      if ((aq1 = (aq)this.k.b(b)) != null && aq1.h().a(this.m)) {
        aq1.a(paramGraphics, paramInt1, paramInt2);
        aq1.c(true);
      } 
    } 
  }
  
  public final void n() {
    aq aq1;
    if ((aq1 = u()) != null)
      aq1.n(); 
  }
  
  public final g v() {
    return new g(this.j.a, this.j.b);
  }
  
  public int w() {
    return 10;
  }
  
  protected void a() {}
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\fn.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */