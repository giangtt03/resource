public final class jb extends im {
  private static byte[][] s = new byte[][] { { 0, 0, 1, 1, 2, 2, 2 }, { 3, 3, 4, 4, 5, 5, 6, 6 } };
  
  public jb() {
    mp.a().a(4002);
    a((mp.a()).G, 7);
    a(false);
    a(s);
    b(false);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (paramInt1 < paramInt3) {
      c(0);
      paramInt1 += 26;
      j(10);
    } else {
      c(2);
      paramInt1 -= 26;
      j(6);
    } 
    d(0);
    c(paramInt1, paramInt2);
    b(paramInt3, paramInt4);
    this.j = Math.abs(paramInt3 - paramInt1) / 6;
    b(true);
  }
  
  public final void k() {
    if (this.e == 0) {
      if (e(this.h, this.j)) {
        d(1);
        return;
      } 
    } else if (j()) {
      b(false);
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\jb.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */