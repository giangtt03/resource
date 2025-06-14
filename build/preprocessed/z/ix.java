public class ix extends im {
  private static final byte[][] s = new byte[][] { { 
        0, 0, 1, 1, 2, 2, 3, 3, 3, 4, 
        4, 4 }, { -1 } };
  
  private static final int[][] t = new int[][] { { 190, 99, 82, 27, 11, 99 }, { 103, 87, 105, 8, 19 }, { 0, 0, 103, 126 }, { 190, 75, 99, 14, 25 }, { 265, 52, 94, 26, 29 } };
  
  private int u = 0;
  
  public ix() {
    a(false);
    a(s);
    mp.a().a(1007);
    a((mp.a()).s, t);
    this.o = 103;
    this.p = 126;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (paramInt5 > 0) {
      d(1);
    } else {
      d(0);
    } 
    this.u = paramInt5;
    this.g = 0;
    this.k = 1;
    c(paramInt1 - this.o / 2, paramInt2 - this.p);
    this.r = true;
  }
  
  public final void k() {
    if (this.u > 0) {
      this.u--;
      return;
    } 
    if (this.e == 1) {
      d(0);
      return;
    } 
    if (j())
      this.r = false; 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ix.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */