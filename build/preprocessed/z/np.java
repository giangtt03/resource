import javax.microedition.lcdui.Graphics;

public final class np extends at {
  public static int a = 15000;
  
  private boolean b = false;
  
  private long c;
  
  private boolean d;
  
  private long e = 0L;
  
  public np() {
    a = 15000;
  }
  
  public final void a() {
    if (!this.b) {
      this.c = System.currentTimeMillis();
      this.d = true;
    } 
    this.b = true;
  }
  
  public final void b() {
    this.b = false;
  }
  
  public final boolean c() {
    return this.b;
  }
  
  public final boolean d() {
    return (System.currentTimeMillis() - this.c >= a);
  }
  
  public final boolean e() {
    boolean bool = false;
    if (System.currentTimeMillis() - this.c >= 10000L && this.d) {
      this.d = false;
      bool = true;
    } 
    return bool;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.b)
      return; 
    bx.b.a(paramGraphics, (new StringBuffer(String.valueOf(this.e))).toString(), this.m, this.n, 0);
  }
  
  public final void i() {
    if (!this.b)
      return; 
    long l;
    if ((l = a - System.currentTimeMillis() - this.c) >= 0L)
      this.e = l / 1000L + ((l % 1000L != 0L) ? 1L : 0L); 
  }
  
  public final long f() {
    return System.currentTimeMillis() - this.c;
  }
  
  public final long g() {
    return f() / 1000L;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\np.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */