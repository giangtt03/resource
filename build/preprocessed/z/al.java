public abstract class al extends am {
  public static int a = 2000;
  
  private int k = 0;
  
  protected boolean b = false;
  
  private boolean l;
  
  private boolean m;
  
  private int n;
  
  protected int c;
  
  protected int d;
  
  public al(int paramInt) {
    this.k = paramInt;
    if (this.k == 1) {
      this.n = -1;
      return;
    } 
    if (this.k == 0)
      this.n = a; 
  }
  
  public final int a() {
    return this.c;
  }
  
  public final int c() {
    return this.d;
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.c = paramInt1;
    this.d = paramInt2;
    this.f = paramInt3;
    this.g = paramInt4;
  }
  
  public final void a(boolean paramBoolean) {
    this.b = paramBoolean;
  }
  
  public final boolean d() {
    return this.b;
  }
  
  public final boolean e() {
    return this.l;
  }
  
  public final void b(boolean paramBoolean) {
    this.l = true;
  }
  
  public final boolean f() {
    return this.m;
  }
  
  public final void c(boolean paramBoolean) {
    this.m = true;
  }
  
  public void a(int paramInt) {
    this.n = paramInt;
  }
  
  public final void b_() {
    if (this.n > 0) {
      this.n--;
      if (this.n == 1) {
        ag.b().o();
        return;
      } 
    } 
    g();
  }
  
  protected void g() {}
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\al.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */