import javax.microedition.lcdui.Graphics;

public abstract class fb extends aq {
  public final int i;
  
  public String j;
  
  private bf p;
  
  protected az[] k;
  
  private ba q;
  
  public bs l;
  
  protected ax m;
  
  public final int n;
  
  public final boolean o;
  
  public fb(int paramInt1, int paramInt2, String paramString, boolean paramBoolean) {
    this.i = paramInt1;
    this.n = paramInt2;
    this.j = paramString;
    this.o = paramBoolean;
    this.k = new az[3];
  }
  
  public final void a(ax paramax) {
    this.m = paramax;
  }
  
  final void q() {
    if (this.m != null)
      this.m.i(); 
    if (this.l != null) {
      this.l.n();
      r();
      return;
    } 
    az[] arrayOfAz = this.k;
    for (byte b = 0; b < arrayOfAz.length; b++) {
      if (arrayOfAz[b] != null)
        arrayOfAz[b].c(); 
    } 
    n();
  }
  
  protected void r() {}
  
  final void b(Graphics paramGraphics, int paramInt1, int paramInt2) {
    a(paramGraphics, paramInt1, paramInt2);
    if (this.l != null)
      this.l.a(paramGraphics, paramInt1, paramInt2); 
    if (this.q != null)
      this.q.a(paramGraphics); 
    Graphics graphics = paramGraphics;
    fb fb1;
    az[] arrayOfAz = (fb1 = this).k;
    if (fb1.l != null)
      arrayOfAz = fb1.l.a(); 
    for (byte b = 0; b < arrayOfAz.length; b++) {
      if (arrayOfAz[b] != null)
        arrayOfAz[b].a(graphics); 
    } 
    if (this.m != null)
      this.m.a(paramGraphics, paramInt1, paramInt2); 
    c(false);
  }
  
  private boolean a(az[] paramArrayOfaz, int paramInt) {
    if (paramInt == 94 && paramArrayOfaz[0] != null && paramArrayOfaz[0].b()) {
      if (this.p != null)
        this.p.d(-1, paramArrayOfaz[0].a()); 
      return true;
    } 
    if (paramInt == 95 && paramArrayOfaz[1] != null && paramArrayOfaz[1].b()) {
      if (this.p != null)
        this.p.d(-1, paramArrayOfaz[1].a()); 
      return true;
    } 
    if (paramInt == 93 && paramArrayOfaz[2] != null && paramArrayOfaz[2].b()) {
      if (this.p != null)
        this.p.d(-1, paramArrayOfaz[2].a()); 
      return true;
    } 
    return false;
  }
  
  final boolean h(int paramInt) {
    if (this.m != null && this.m.a() != null)
      this.m.a(); 
    if (this.l != null) {
      if (a(this.l.a(), paramInt)) {
        v.c();
        return true;
      } 
      if (this.l.f(paramInt))
        return true; 
      t();
      return true;
    } 
    if (a(this.k, paramInt)) {
      v.c();
      return true;
    } 
    return f(paramInt);
  }
  
  final boolean i(int paramInt) {
    if (this.m != null && this.m.a() != null)
      this.m.a(); 
    return (this.l != null && this.l.g(paramInt)) ? true : g(paramInt);
  }
  
  public final az s() {
    return this.k[1];
  }
  
  private boolean a(az[] paramArrayOfaz, int paramInt1, int paramInt2) {
    for (byte b = 0; b < paramArrayOfaz.length; b++) {
      if (paramArrayOfaz[b] != null && paramArrayOfaz[b].a(paramInt1, paramInt2)) {
        if (this.p != null)
          this.p.d(-1, paramArrayOfaz[b].a()); 
        return true;
      } 
    } 
    return false;
  }
  
  final boolean g(int paramInt1, int paramInt2) {
    if (this.m != null && this.m.a() != null)
      this.m.a().g(paramInt1, paramInt2); 
    if (this.l != null) {
      if (a(this.l.a(), paramInt1, paramInt2))
        return true; 
      if (this.l.c(paramInt1, paramInt2))
        return true; 
      t();
      return true;
    } 
    return a(this.k, paramInt1, paramInt2) ? true : c(paramInt1, paramInt2);
  }
  
  final boolean h(int paramInt1, int paramInt2) {
    if (this.m != null && this.m.a() != null)
      this.m.a().h(paramInt1, paramInt2); 
    return (this.l != null && this.l.f(paramInt1, paramInt2)) ? true : f(paramInt1, paramInt2);
  }
  
  public final void a(bf parambf) {
    this.p = parambf;
  }
  
  public final void a(az paramaz) {
    boolean bool = true;
    az az1 = paramaz;
    fb fb1;
    (fb1 = this).k[0] = az1;
    if (az1 != null)
      fb1.k[0].a(6, v.u - ba.a + 3, 20); 
  }
  
  public final void b(az paramaz) {
    boolean bool = true;
    az az1 = paramaz;
    fb fb1;
    (fb1 = this).k[2] = az1;
    if (az1 != null)
      fb1.k[2].a(v.t - 6, v.u - ba.a + 3, 24); 
  }
  
  public final void c(az paramaz) {
    boolean bool = true;
    az az1 = paramaz;
    fb fb1;
    (fb1 = this).k[1] = az1;
    if (az1 != null)
      fb1.k[1].a(v.t / 2, v.u - ba.a + 3, 17); 
  }
  
  public final void a(ba paramba) {
    this.q = paramba;
  }
  
  public void a(bs parambs) {
    v.c();
    this.l = parambs;
    if (parambs != null)
      parambs.a(this); 
    c(true);
  }
  
  public void t() {
    v.c();
    this.l = null;
    c(true);
  }
  
  public void u() {}
  
  public void x() {}
  
  public void y() {}
  
  public String toString() {
    return "GameTab[" + this.a + ", " + this.j + "]";
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\fb.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */