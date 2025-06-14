import javax.microedition.lcdui.Graphics;

public final class ir extends at {
  private int a;
  
  private int b;
  
  private int c;
  
  public final void j(int paramInt) {
    null.j(paramInt);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {}
  
  public final void b(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!null.m() || this.a < 5)
      return; 
    null.a(paramGraphics, paramInt1 + null[0], paramInt2 + null[1]);
  }
  
  public final void c(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!null.m() || this.a >= 5)
      return; 
    null.a(paramGraphics, paramInt1 + null[0], paramInt2 + null[1]);
  }
  
  public final void i() {
    if (!this.r)
      return; 
    if (this.b > 0) {
      this.b--;
      if (this.b == 0) {
        null.b(true);
      } else {
        return;
      } 
    } 
    null.i();
    if (this.c > 0) {
      this.c--;
      return;
    } 
    this.c = 2;
    this.a = (this.a + 1) % null.length;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ir.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */