import javax.microedition.lcdui.Graphics;

public final class y extends x {
  private boolean h;
  
  public final void b() {
    super.b();
    if (this.e % 3 == 0)
      this.h = !this.h; 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.c)
      return; 
    if (this.h)
      this.g.a(paramGraphics, this.d, 0 + this.a, 0 + this.b, 1); 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\y.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */