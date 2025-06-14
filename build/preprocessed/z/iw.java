import javax.microedition.lcdui.Graphics;

public final class iw extends is {
  private static byte[][] x = new byte[][] { new byte[1], { 0, 0, 1, 1, 2, 2, 3, 3, 3 } };
  
  public iw() {
    mp.a().a(1006);
    this.s = (mp.a()).q;
    this.t = (mp.a()).r;
    a(x);
    this.r = false;
    this.v = 1;
    this.w = 4;
  }
  
  public final void j(int paramInt) {
    this.q = 33;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (this.u > 0 || !this.r)
      return; 
    int i = this.f[this.e][this.g];
    if (this.e == 1 && i != 3) {
      paramGraphics.drawRegion(this.b, i * this.o, 0, this.o, this.p, 0, this.m + paramInt1, this.n + paramInt2, 36);
      paramGraphics.drawRegion(this.b, i * this.o, 0, this.o, this.p, 2, this.m + paramInt1, this.n + paramInt2, 40);
      return;
    } 
    super.a(paramGraphics, paramInt1, paramInt2);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\iw.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */