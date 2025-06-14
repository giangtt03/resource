import javax.microedition.lcdui.Graphics;

public final class jj extends im {
  private static int[][] s = new int[][] { { 0, 0, 54, 13 }, { 0, 13, 57, 18 }, { 0, 31, 57, 15 }, { 57, 38, 38 }, { 95, 40, 45 }, { 135, 47, 46 } };
  
  private static byte[][] t = new byte[][] { { 0, 0, 1, 1, 2, 2 }, { 3, 3, 4, 4, 5, 5, 5 }, { -1 } };
  
  private int u;
  
  public jj() {
    mp.a().a(2006);
    a((mp.a()).A, s);
    a(t);
    a(false);
    b(false);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (paramInt1 < paramInt3) {
      c(0);
      j(10);
      paramInt1 += 54;
    } else {
      c(2);
      j(6);
      paramInt1 -= 54;
    } 
    this.u = paramInt5;
    if (this.u > 0) {
      d(2);
    } else {
      d(0);
    } 
    c(paramInt1, paramInt2);
    b(paramInt3, paramInt4);
    this.j = Math.abs(paramInt1 - paramInt3) / 6;
    if (this.j > 30)
      this.j = 30; 
    b(true);
  }
  
  public final void k() {
    switch (this.e) {
      case 0:
        if (e(this.h, this.j)) {
          d(1);
          return;
        } 
        break;
      case 1:
        if (j()) {
          b(false);
          return;
        } 
        break;
      case 2:
        if (this.u > 0) {
          this.u--;
          if (this.u == 0)
            d(0); 
        } 
        break;
    } 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.r || this.g < 0)
      return; 
    int i;
    if ((i = this.f[this.e][this.g]) >= 0) {
      h(s[i][2]);
      i(s[i][3]);
    } 
    super.a(paramGraphics, paramInt1, paramInt2);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\jj.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */