import javax.microedition.lcdui.Graphics;

public final class lz extends at {
  private int a;
  
  private int b;
  
  private int[] c;
  
  private int[] d;
  
  private byte e = 10;
  
  private int f = 30;
  
  public lz(int paramInt1, int paramInt2, int paramInt3, byte paramByte) {
    this.o = paramInt1;
    this.p = paramInt2;
    this.f = 30;
    this.e = 10;
    lz lz1;
    paramInt2 = (lz1 = this).o / 2;
    paramInt3 = (lz1.p + lz1.f) / 2 - lz1.f + lz1.e;
    int i = lz1.f / 2;
    byte b = -90;
    lz1.c = new int[9];
    lz1.d = new int[9];
    for (byte b1 = 0; b1 < 9; b1++) {
      lz1.c[b1] = paramInt2 + (i * l.b(b) >> 14);
      lz1.d[b1] = paramInt3 + (i * l.a(b) >> 14);
      b += 40;
    } 
  }
  
  public final void i() {
    if (!this.r)
      return; 
    this.b = this.a;
    this.a = (this.a + 1) % this.c.length;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.r)
      return; 
    paramInt1 += this.m;
    paramInt2 += this.n;
    int i = pc.b.getWidth() / 3;
    int j = pc.b.getHeight();
    int k = (this.b - 2 + this.c.length) % this.c.length;
    for (byte b = 0; b < 2; b++) {
      int m = (k + b + this.c.length) % this.c.length;
      cw.a(paramGraphics, pc.b, 0, 0, i, j, this.c[m] + paramInt1, this.d[m] + paramInt2, 3);
    } 
    cw.a(paramGraphics, pc.b, i, 0, i, j, this.c[this.b] + paramInt1, this.d[this.b] + paramInt2, 3);
    cw.a(paramGraphics, pc.b, i + i, 0, i, j, this.c[this.a] + paramInt1, this.d[this.a] + paramInt2, 3);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\lz.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */