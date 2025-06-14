import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ig extends ap {
  private final Image b = f.d("/corner/3");
  
  public static Image a;
  
  private final Image c;
  
  public ig() {
    a = f.d("/corner/cornerskb");
    this.c = f.d("/corner/1");
  }
  
  public final az a(int paramInt) {
    return new gb(-90000, 0);
  }
  
  public final az b(int paramInt) {
    return new gb(-90001, 2);
  }
  
  public final az c(int paramInt) {
    return new gb(-90002, 3);
  }
  
  public final void b(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramGraphics.setColor(3236863);
    paramGraphics.drawRect(paramInt1, paramInt2, paramInt3 - 1, paramInt4 - 1);
    paramGraphics.setColor(16514043);
    paramGraphics.drawRect(paramInt1 + 1, paramInt2 + 1, paramInt3 - 3, paramInt4 - 3);
    paramGraphics.setColor(16512242);
    paramGraphics.fillRect(paramInt1 + 2, paramInt2 + 2, paramInt3 - 4, paramInt4 - 4);
    paramGraphics.setColor(3968767);
    paramGraphics.drawRect(paramInt1 + 2, paramInt2 + 2, paramInt3 - 5, paramInt4 - 5);
    cw.a(paramGraphics, this.b, 0, 2, 8, 8, paramInt1, paramInt2, 0);
    paramGraphics.drawRegion(this.b, 0, 2, 8, 8, 6, paramInt1, paramInt2 + paramInt4, 36);
    paramGraphics.drawRegion(this.b, 0, 2, 8, 8, 1, paramInt1, paramInt2 + paramInt4, 36);
    paramGraphics.drawRegion(this.b, 0, 2, 8, 8, 5, paramInt1 + paramInt3, paramInt2, 24);
    paramGraphics.drawRegion(this.b, 0, 2, 8, 8, 3, paramInt1 + paramInt3, paramInt2 + paramInt4, 40);
  }
  
  public final void c(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramInt4 = a.getHeight();
    int i = paramInt3 - 18 + 1;
    int j = paramInt1 + 9;
    int k = 35;
    while (i > 0) {
      if (k > i)
        k = i; 
      paramGraphics.drawRegion(a, 9, 0, k, paramInt4, 0, j, paramInt2, 0);
      i -= k;
      j += k;
    } 
    paramGraphics.drawRegion(a, 0, 0, 9, paramInt4, 0, paramInt1, paramInt2, 0);
    paramGraphics.drawRegion(a, 0, 0, 9, paramInt4, 2, paramInt1 + paramInt3 - 9, paramInt2, 0);
  }
  
  public final void d(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramInt4 = this.c.getHeight();
    int i = paramInt3 - 18 + 1;
    int j = paramInt1 + 9;
    int k = 35;
    while (i > 0) {
      if (k > i)
        k = i; 
      paramGraphics.drawRegion(this.c, 9, 0, k, paramInt4, 0, j, paramInt2, 0);
      i -= k;
      j += k;
    } 
    paramGraphics.drawRegion(this.c, 0, 0, 9, paramInt4, 0, paramInt1, paramInt2, 0);
    paramGraphics.drawRegion(this.c, 0, 0, 9, paramInt4, 2, paramInt1 + paramInt3, paramInt2, 24);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ig.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */