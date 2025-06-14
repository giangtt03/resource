import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class mm extends at {
  private Image a = (mp.a()).e[0];
  
  private int b;
  
  private int c;
  
  private int d;
  
  public final void b(int paramInt1, int paramInt2, int paramInt3) {
    c(paramInt1, paramInt2);
    this.b = -1;
    this.c = paramInt3;
  }
  
  public final void a() {
    this.b = 0;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (this.b != 0) {
      paramInt1 = 8;
      if (this.d >= 3)
        paramInt1++; 
      if ((this.c & 0x1) == 1)
        paramGraphics.drawRegion(this.a, 0, 0, this.a.getWidth(), this.a.getHeight(), 6, this.m - paramInt1, this.n, 10); 
      if ((this.c & 0x2) == 2)
        paramGraphics.drawRegion(this.a, 0, 0, this.a.getWidth(), this.a.getHeight(), 5, this.m + paramInt1, this.n, 6); 
      if ((this.c & 0x4) == 4)
        paramGraphics.drawRegion(this.a, 0, 0, this.a.getWidth(), this.a.getHeight(), 0, this.m, this.n - paramInt1, 33); 
      if ((this.c & 0x8) == 8)
        paramGraphics.drawRegion(this.a, 0, 0, this.a.getWidth(), this.a.getHeight(), 3, this.m, this.n + paramInt1, 17); 
    } 
  }
  
  public final void i() {
    if (this.b != 0) {
      if (this.b > 0)
        this.b--; 
      this.d++;
      if (this.d > 6)
        this.d = 0; 
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\mm.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */