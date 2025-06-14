import javax.microedition.lcdui.Graphics;

public final class bt extends aq {
  private int i;
  
  private int j;
  
  private int k;
  
  private int l;
  
  private int m;
  
  public bt() {
    this(2);
  }
  
  public bt(int paramInt) {
    this(paramInt, 0, 100, 0, 100);
  }
  
  private bt(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    this.m = paramInt1;
    b(0, 100, 0, 100);
  }
  
  public final int a() {
    return this.j;
  }
  
  public final int q() {
    return this.i;
  }
  
  public final void h(int paramInt) {
    b(paramInt, this.l, this.k, this.j);
  }
  
  public final int r() {
    return this.l;
  }
  
  public final void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    synchronized (this) {
      if (paramInt3 == Integer.MAX_VALUE)
        paramInt3 = 2147483646; 
      if (paramInt4 <= paramInt3)
        paramInt4 = paramInt3 + 1; 
      long l;
      if ((l = paramInt4 - paramInt3) > 2147483647L) {
        l = 2147483647L;
        paramInt4 = paramInt3 + Integer.MAX_VALUE;
      } 
      if (paramInt2 > (int)l)
        paramInt2 = (int)l; 
      if (paramInt2 <= 0)
        paramInt2 = 1; 
      if (paramInt1 < paramInt3)
        paramInt1 = paramInt3; 
      if (paramInt1 > paramInt4 - paramInt2)
        paramInt1 = paramInt4 - paramInt2; 
      this.i = paramInt1;
      this.l = paramInt2;
      this.k = paramInt3;
      this.j = paramInt4;
      return;
    } 
  }
  
  public final boolean c(int paramInt1, int paramInt2) {
    return false;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    int i;
    if ((i = this.j - this.k - this.l) > 0) {
      paramInt2 = paramInt2;
      paramInt1 = paramInt1;
      if (this.m == 2) {
        paramInt2 += d() + this.i * (this.l - 3) / i;
        paramInt1 += c() - e() - 1;
      } else {
        paramInt2 += d() - f() - 1;
        paramInt1 += c() + this.i * (this.l - 3) / i;
      } 
      paramGraphics.setColor(16711680);
      paramGraphics.fillRect(paramInt1, paramInt2 + 1, 1, 1);
      paramGraphics.fillRect(paramInt1 + 1, paramInt2, 1, 1);
      paramGraphics.fillRect(paramInt1 + 1, paramInt2 + 2, 1, 1);
      paramGraphics.fillRect(paramInt1 + 2, paramInt2 + 1, 1, 1);
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\bt.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */