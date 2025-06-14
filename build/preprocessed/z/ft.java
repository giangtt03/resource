import javax.microedition.lcdui.Graphics;

public final class ft extends at {
  private int a = 50;
  
  private long b = 0L;
  
  private long c = 0L;
  
  private long d = 0L;
  
  private String e = "";
  
  private int f = 0;
  
  public ft(long paramLong) {
    this.b = paramLong;
    this.e = String.valueOf(paramLong) + "Ken";
    this.m = v.t - 5;
    this.n = v.u - ba.a - bx.c.a();
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.r)
      return; 
    paramInt1 = bx.c.a(this.e) + 5;
    pc.a(paramGraphics, this.m - paramInt1, this.n - 2, paramInt1 + 5, bx.c.a() + 2, 0, 16777215);
    bx.c.a(paramGraphics, this.e, this.m, this.n, 2);
  }
  
  public final void i() {
    if (this.b == -1L)
      return; 
    if (!this.r)
      return; 
    if (this.b != this.c) {
      this.c += this.d;
      this.e = String.valueOf(i.a(this.c, ".")) + "Ken";
      long l = this.b - this.c;
      this.d = l / 2L + l % 2L;
      return;
    } 
    if (this.f < this.a) {
      this.f++;
      return;
    } 
    b(false);
  }
  
  public final void a(long paramLong) {
    this.c = this.b;
    this.b = paramLong;
    if (this.b == -1L) {
      this.e = "?Ken";
      return;
    } 
    if (this.c != this.b) {
      long l = this.b - this.c;
      this.d = l / 2L + l % 2L;
    } 
    this.e = String.valueOf(i.a(this.c, ".")) + "Ken";
    b(true);
    this.f = 0;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ft.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */