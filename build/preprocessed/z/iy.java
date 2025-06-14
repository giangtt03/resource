import javax.microedition.lcdui.Graphics;

public final class iy extends im {
  private static final byte[][] s = new byte[][] { { 
        0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 
        3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 
        6, 6, 7, 7, 8, 8 }, { 9 } };
  
  private static final int[][] t = new int[][] { { 121, 106, 14, 27, 48, 105 }, { 96, 93, 24, 39, 38, 93 }, { 189, 50, 45, 12, 86 }, { 142, 72, 32, 79, 30, 52 }, { 175, 73, 52, 77, 10, 54 }, { 33, 92, 62, 58, 73 }, { 142, 47, 73, 16, 57 }, { 92, 50, 93, 13, 37 }, { 0, 0, 31, 130, 31 }, { 31, 61, 92, 2, 40 } };
  
  public iy() {
    a(false);
    a(s);
    mp.a().a(1008);
    a((mp.a()).t, t);
    this.o = 63;
    this.p = 130;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    d(0);
    this.g = 0;
    this.k = 1;
    c(paramInt1 - this.o, paramInt2 - this.p);
    b(paramInt1 - this.o, paramInt4 - this.p);
    this.r = true;
  }
  
  public final void k() {
    switch (this.e) {
      case 0:
        if (j()) {
          d(1);
          return;
        } 
        break;
      case 1:
        this.k += 2;
        if (f(this.i, this.k))
          this.r = false; 
        break;
    } 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.r)
      return; 
    if ((paramInt1 = this.f[this.e][this.g]) >= 0) {
      int[] arrayOfInt = t[paramInt1];
      paramInt2 = this.n + arrayOfInt[5];
      int i = this.m + arrayOfInt[4];
      cw.a(paramGraphics, this.b, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3], i, paramInt2, 0);
      paramGraphics.drawRegion(this.b, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3], 2, i + arrayOfInt[2] - 1, paramInt2, 0);
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\iy.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */