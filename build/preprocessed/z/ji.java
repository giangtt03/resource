import javax.microedition.lcdui.Graphics;

public final class ji extends im {
  private static final byte[][] s = new byte[][] { { 0, 0, 1, 2, 2, 2, 2, 2, 2 } };
  
  private int[] t = new int[10];
  
  private static final int[][] u = new int[][] { { 0, 0, 42, 35 }, { 0, 35, 73, 50 }, { 0, 85, 58, 73 }, { 0, 158, 34, 27 }, { 0, 185, 66, 27 } };
  
  public ji() {
    mp.a().a(2004);
    this.b = (mp.a()).y;
    a(s);
    a(false);
    this.r = false;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    c(paramInt1, paramInt2);
    paramInt2 = paramInt3 - paramInt1;
    paramInt4 = this.t.length - 6;
    paramInt5 = this.t.length - 4;
    while (paramInt4 < paramInt5) {
      this.t[paramInt4] = paramInt1 + paramInt2 / 3;
      paramInt4++;
    } 
    paramInt4 = this.t.length - 4;
    paramInt5 = this.t.length - 5;
    while (paramInt4 < paramInt5) {
      this.t[paramInt4] = paramInt1 + (paramInt2 << 1) / 3;
      paramInt4++;
    } 
    paramInt4 = this.t.length - 5;
    paramInt5 = this.t.length;
    while (paramInt4 < paramInt5) {
      this.t[paramInt4] = paramInt3;
      paramInt4++;
    } 
    if (paramInt3 > paramInt1) {
      c(0);
      j(6);
    } else {
      c(2);
      j(10);
    } 
    a(-1);
    this.r = true;
  }
  
  public final void k() {
    if (j())
      this.r = false; 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.r || this.g < 0)
      return; 
    if ((paramInt1 = this.f[this.e][this.g]) >= 0)
      switch (paramInt1) {
        case 0:
        case 1:
          paramGraphics.drawRegion(this.b, u[paramInt1][0], u[paramInt1][1], u[paramInt1][2], u[paramInt1][3], this.a, this.m, this.n, this.q);
          return;
        case 2:
          paramInt2 = this.t[this.g];
          paramGraphics.drawRegion(this.b, u[paramInt1][0], u[paramInt1][1], u[paramInt1][2], u[paramInt1][3], this.a, this.m, this.n, this.q);
          paramInt1 = Math.abs(this.m - paramInt2) - u[2][2] - u[4][2];
          paramInt2 = this.m;
          if (this.a == 0) {
            paramInt2 += u[2][2];
          } else {
            paramInt2 -= u[2][2];
          } 
          if (paramInt1 < 0)
            paramInt1 = 0; 
          while (paramInt1 > 0) {
            int i;
            if ((i = u[3][2]) > paramInt1)
              i = paramInt1; 
            paramGraphics.drawRegion(this.b, u[3][0], u[3][1], i, u[3][3], this.a, paramInt2, this.n, this.q);
            paramInt1 -= i;
            if (this.a == 0) {
              paramInt2 += i;
              continue;
            } 
            paramInt2 -= i;
          } 
          paramGraphics.drawRegion(this.b, u[4][0], u[4][1], u[4][2], u[4][3], this.a, paramInt2, this.n, this.q);
          break;
      }  
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ji.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */