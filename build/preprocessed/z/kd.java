import javax.microedition.lcdui.Graphics;

public final class kd extends ke {
  private kl f;
  
  public a b = new a();
  
  public kg[] c;
  
  public a d = new a();
  
  private a g = new a();
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    a(paramGraphics, paramInt1, paramInt2, null);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2, k paramk) {
    for (byte b1 = 0; b1 < this.c.length; b1++) {
      if (this.c[b1].m())
        this.c[b1].a(paramGraphics, paramInt1, paramInt2 + 5); 
    } 
    if (this.d != null) {
      byte b = 0;
      int j = this.d.d();
      while (b < j) {
        ka ka;
        (ka = (ka)this.d.b(b)).a(paramGraphics, paramInt1, paramInt2 + ((ka.r() == 1) ? 5 : 7));
        b++;
      } 
    } 
    byte b2 = 0;
    int i = this.g.d();
    while (b2 < i) {
      at at;
      byte b = ((at = (at)this.g.b(b2)).l() == 10) ? 7 : 5;
      at.a(paramGraphics, paramInt1, paramInt2 + b);
      b2++;
    } 
  }
  
  public final void i() {
    if (this.d != null) {
      byte b = 0;
      int i = this.d.d();
      while (b < i) {
        ka ka;
        (ka = (ka)this.d.b(b)).i();
        b++;
      } 
    } 
  }
  
  public final void a() {
    this.g.a();
    byte b1;
    for (b1 = 0; b1 < this.c.length; b1++)
      this.c[b1].i(); 
    if (this.f != null)
      this.g.a(this.f); 
    if (this.b != null)
      for (byte b = 0; b < this.b.d(); b++) {
        if (this.b.b(b) instanceof ki) {
          at at = (at)this.b.b(b);
          if (this.a.b(at.n(), at.o(), at.p(), at.q())) {
            at.b(true);
            this.g.a(at);
          } else {
            at.b(false);
          } 
        } 
      }  
    for (b1 = 0; b1 < this.c.length; b1++) {
      if (this.a.b(this.c[b1].n(), this.c[b1].o(), this.c[b1].p(), this.c[b1].q())) {
        this.c[b1].b(true);
      } else {
        this.c[b1].b(false);
      } 
    } 
    a a1 = this.g;
    byte b2 = 1;
    int i = a1.d();
    while (b2 < i) {
      byte b = b2;
      at at1 = (at)a1.b(b);
      for (at at2 = (at)a1.b(b - 1); b > 0 && (at2.o() + at2.q() > at1.o() + at1.q() || (at2.l() > at1.l() && at2.o() + at2.q() == at1.o() + at1.q())); at2 = (at)a1.b(b - 1)) {
        a1.a(b, b - 1);
        at1 = (at)a1.b(--b);
      } 
      b2++;
    } 
  }
  
  public final void b(Graphics paramGraphics, int paramInt1, int paramInt2) {
    for (byte b = 0; b < this.c.length; b++) {
      if ((this.c[b]).d.a == 2)
        ((kk)this.c[b]).b(paramGraphics, paramInt1, paramInt2); 
    } 
  }
  
  public final void a(kl paramkl) {
    this.f = paramkl;
    this.b.a(paramkl);
  }
  
  public final kl c() {
    return this.f;
  }
  
  public final void b() {
    super.b();
    this.d.a();
    this.g.a();
    this.b.a();
    this.f = null;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\kd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */