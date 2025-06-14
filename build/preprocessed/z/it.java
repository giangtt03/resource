public final class it extends im {
  private static byte[][] s = new byte[][] { { -1 }, { 
        0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 
        4 } };
  
  private int t;
  
  public it() {
    mp.a().a(1001);
    a((mp.a()).m, 5);
    a(s);
    this.r = false;
    j(3);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    c(paramInt1, paramInt2);
    this.g = 0;
    if (paramInt5 <= 0) {
      d(1);
    } else {
      d(0);
    } 
    this.r = true;
    this.t = paramInt5;
  }
  
  public final void k() {
    if (this.t > 0) {
      this.t--;
      if (this.t == 0)
        d(1); 
    } 
    if (this.e == 1 && j())
      this.r = false; 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\it.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */