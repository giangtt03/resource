public final class lp extends as {
  private static byte[][] s = new byte[][] { { -1 }, { 0, 0, 1, 1, 2, 2, 3, 3, 3 } };
  
  private int t;
  
  public lp(int paramInt) {
    mp mp;
    switch (paramInt) {
      case 0:
        if ((mp = mp.a()).Q == null)
          mp.Q = f.d("/miniexplosionfire"); 
        a(mp.Q, 4);
        break;
      case 2:
        if ((mp = mp.a()).R == null) {
          byte[] arrayOfByte;
          h.a(arrayOfByte = f.b("/miniexplosionfire"), 138);
          mp.R = f.a(arrayOfByte);
        } 
        a(mp.R, 4);
        break;
      case 1:
        if ((mp = mp.a()).S == null) {
          byte[] arrayOfByte;
          h.a(arrayOfByte = f.b("/miniexplosionfire"), -111);
          mp.S = f.a(arrayOfByte);
        } 
        a(mp.S, 4);
        break;
    } 
    a(s);
    j(3);
    this.r = false;
  }
  
  public final void b(int paramInt1, int paramInt2, int paramInt3) {
    c(paramInt1, paramInt2);
    this.r = true;
    this.t = paramInt3;
    if (paramInt3 <= 0) {
      d(1);
      return;
    } 
    d(0);
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


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\lp.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */