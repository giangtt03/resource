import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class le extends as {
  private Image s = f.d("/blacksmith");
  
  private Image t = f.d("/effblacksmith");
  
  private int u = 40;
  
  private as v;
  
  private static final int[][] w = new int[][] { { 0, 1, 2, 3 } };
  
  private static final int[][] x = new int[][] { { 1 }, { 0, 1, 2, 3, 2, 3, 2, 1 }, { 
        0, 1, 2, 3, 2, 3, 2, 1, 1, 2, 
        3, 2, 3, 2, 1 }, { 
        0, 1, 2, 3, 2, 3, 2, 1, 1, 2, 
        3, 2, 3, 2, 1, 1, 2, 3, 2, 3, 
        2, 1 }, { 
        0, 1, 2, 3, 2, 3, 2, 1, 1, 2, 
        3, 2, 3, 2, 1, 1, 2, 3, 2, 3, 
        2, 1, 1, 2, 3, 2, 3, 2, 1 }, { 
        0, 1, 2, 3, 2, 3, 2, 1, 1, 2, 
        3, 2, 3, 2, 1, 1, 2, 3, 2, 3, 
        2, 1, 1, 2, 3, 2, 3, 2, 1, 1, 
        2, 3, 2, 3, 2, 1 }, { 
        0, 1, 2, 3, 2, 3, 2, 1, 1, 2, 
        3, 2, 3, 2, 1, 1, 2, 3, 2, 3, 
        2, 1, 1, 2, 3, 2, 3, 2, 1, 1, 
        2, 3, 2, 3, 2, 1 } };
  
  public le() {
    a(this.s, 4);
    a(x);
    d(0);
    b(2);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    super.a(paramGraphics, paramInt1, paramInt2);
    if (this.v != null)
      this.v.a(paramGraphics, this.m + this.o - this.v.p() / 2 - this.v.p() + paramInt1, this.n + (this.p - this.v.q()) / 2 + paramInt2 + 5); 
  }
  
  public final void k() {
    if (!this.r)
      return; 
    switch (this.e) {
      case 0:
        this.u++;
        if (this.u == 50) {
          this.u = 0;
          d(cv.a(1, 6));
        } 
        break;
      default:
        if (j())
          d(0); 
        if (this.g == (this.f[this.e]).length - 5) {
          le le1;
          (le1 = this).v = new as(le1.t, 4);
          le1.v.a(w);
          le1.v.d(0);
          le1.v.b(2);
          return;
        } 
        break;
    } 
    if (this.v != null) {
      this.v.i();
      if (this.v.j())
        this.v = null; 
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\le.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */