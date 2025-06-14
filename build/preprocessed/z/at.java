import javax.microedition.lcdui.Graphics;

public abstract class at {
  protected int l;
  
  protected int m;
  
  protected int n;
  
  protected int o;
  
  protected int p;
  
  protected int q;
  
  protected boolean r = true;
  
  public final int l() {
    return this.l;
  }
  
  public final void e(int paramInt) {
    this.l = 10;
  }
  
  public final boolean m() {
    return this.r;
  }
  
  public void b(boolean paramBoolean) {
    this.r = paramBoolean;
  }
  
  public void c(int paramInt1, int paramInt2) {
    f(paramInt1);
    g(paramInt2);
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    f(paramInt1);
    g(paramInt2);
    paramInt2 = paramInt3;
    at at1;
    (at1 = this).o = paramInt2;
    paramInt2 = paramInt4;
    (at1 = this).p = paramInt2;
  }
  
  public int n() {
    return this.m;
  }
  
  public void f(int paramInt) {
    this.m = paramInt;
  }
  
  public int o() {
    return this.n;
  }
  
  public void g(int paramInt) {
    this.n = paramInt;
  }
  
  public int p() {
    return this.o;
  }
  
  public final void h(int paramInt) {
    this.o = paramInt;
  }
  
  public int q() {
    return this.p;
  }
  
  public final void i(int paramInt) {
    this.p = paramInt;
  }
  
  public void j(int paramInt) {
    this.q = paramInt;
  }
  
  public final void k(int paramInt) {
    if ((paramInt & 0x20) == 32) {
      this.n -= this.p;
    } else if ((paramInt & 0x2) == 2) {
      this.n -= this.p / 2;
    } 
    if ((paramInt & 0x8) == 8) {
      this.m -= this.o;
      return;
    } 
    if ((paramInt & 0x1) == 1)
      this.m -= this.o / 2; 
  }
  
  public abstract void i();
  
  public abstract void a(Graphics paramGraphics, int paramInt1, int paramInt2);
  
  public void a(Graphics paramGraphics) {
    a(paramGraphics, 0, 0);
  }
  
  public final boolean b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    boolean bool1 = e(paramInt1, paramInt3);
    boolean bool2 = f(paramInt2, paramInt4);
    return (bool1 && bool2);
  }
  
  public static int a(int paramInt1, int paramInt2, int paramInt3) {
    return ((paramInt1 = Math.abs(paramInt2 - paramInt1)) <= paramInt3) ? 1 : (paramInt1 / paramInt3);
  }
  
  public final boolean e(int paramInt1, int paramInt2) {
    int i;
    if (i = (this.m > paramInt1) ? 1 : 0) {
      this.m -= paramInt2;
    } else {
      this.m += paramInt2;
    } 
    paramInt2 = (this.m > paramInt1) ? 1 : 0;
    if (i != paramInt2)
      this.m = paramInt1; 
    return (this.m == paramInt1);
  }
  
  public final boolean f(int paramInt1, int paramInt2) {
    int i;
    if (i = (this.n > paramInt1) ? 1 : 0) {
      this.n -= paramInt2;
    } else {
      this.n += paramInt2;
    } 
    paramInt2 = (this.n > paramInt1) ? 1 : 0;
    if (i != paramInt2)
      this.n = paramInt1; 
    return (this.n == paramInt1);
  }
  
  public void g(int paramInt1, int paramInt2) {}
  
  public void h(int paramInt1, int paramInt2) {}
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\at.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */