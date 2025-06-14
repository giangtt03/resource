import javax.microedition.lcdui.Graphics;

public final class db extends as {
  private int s = 0;
  
  private static final int[][] t = new int[][] { new int[2], { 0, 1, 2 } };
  
  public db() {
    char c = '疒';
    pa pa;
    a(f.a((pa = pa.a()).b(c, false)), 3);
    a(t);
    d(0);
    this.g = 0;
  }
  
  public final void l(int paramInt) {
    this.s = paramInt;
  }
  
  public final int r() {
    return this.s;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    cw.a(paramGraphics, this.b, this.f[this.e][this.g] * this.o, 0, this.o, this.p, this.m + paramInt1, this.n + paramInt2, 36);
    if (this.e == 0)
      bx.c.a(paramGraphics, (new StringBuffer(String.valueOf(this.s))).toString(), this.m + this.o + paramInt1, this.n - 15 + paramInt2, 2); 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\db.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */