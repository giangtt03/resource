import javax.microedition.lcdui.Graphics;

public final class jk extends im {
  private static final byte[][] s = new byte[][] { { 
        0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 
        5, 5, 5 }, { -1 } };
  
  private static final int[][] t = new int[][] { { 0, 0, 21, 173, 7 }, { 21, 28, 168, 3 }, { 49, 35, 176 }, { 84, 22, 176, 6 }, { 106, 22, 176, 6 }, { 128, 27, 176, 4 } };
  
  private static final int[][] u = new int[][] { { 155, 10, 25, 13 }, { 165, 11, 43, -2 }, { 155, 43, 87, 52, -8 }, { 91, 176, 115, 55, -3 }, { 155, 95, 103, 47 }, { 0, 176, 91, 55, -4 } };
  
  private as v;
  
  private int w;
  
  public jk() {
    mp.a().a(2007);
    a((mp.a()).B, t);
    a(s);
    j(33);
    h(35);
    i(176);
    this.v = new as();
    this.v.a((mp.a()).B, u);
    this.v.a(s);
    this.v.j(17);
    this.v.i(55);
    this.v.d(1);
    this.v.b(false);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    paramInt2 -= this.v.q() / 2;
    c(paramInt1, paramInt2);
    this.v.c(paramInt1, paramInt2);
    this.w = paramInt5;
    if (paramInt5 <= 0) {
      d(0);
    } else {
      d(1);
    } 
    b(true);
  }
  
  public final void d(int paramInt) {
    super.d(paramInt);
    this.v.d(paramInt);
  }
  
  public final void b(boolean paramBoolean) {
    super.b(paramBoolean);
    this.v.b(paramBoolean);
  }
  
  public final void k() {
    if (this.w > 0) {
      this.w--;
      if (this.w == 0)
        d(0); 
    } 
    if (this.e == 0 && j())
      b(false); 
    this.v.i();
    if (!this.v.m() || this.v.f() < 0)
      return; 
    byte b;
    if ((b = s[this.v.h()][this.v.f()]) >= 0) {
      this.v.h(u[b][2]);
      h(t[b][2]);
    } 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    super.a(paramGraphics, paramInt1, paramInt2);
    this.v.a(paramGraphics, paramInt1, paramInt2);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\jk.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */