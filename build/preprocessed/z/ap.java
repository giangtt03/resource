import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class ap {
  private Image a = f.d("/_corner");
  
  private int b = v.am & 0xFFFFFF;
  
  private int c;
  
  public ap() {
    int i = this.b >> 16 & 0xFF;
    int j = this.b >> 8 & 0xFF;
    int k = this.b & 0xFF;
    this.c = (255 - i) / 6 + i << 16 | (255 - j) / 6 + j << 8 | (255 - k) / 6 + k;
  }
  
  public az a(int paramInt) {
    return new bd("Menu", -90000);
  }
  
  public az b(int paramInt) {
    return new bd("Chọn", -90001);
  }
  
  public az c(int paramInt) {
    return new bd("Trở về", -90002);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramGraphics.setColor(v.aj);
    paramGraphics.fillRect(paramInt1 + 3, paramInt2 + 3, paramInt3 - 6, paramInt4 - 6);
    paramGraphics.setColor(v.al);
    paramGraphics.drawRect(paramInt1 + 2, paramInt2 + 2, paramInt3 - 5, paramInt4 - 5);
    paramGraphics.setColor(v.ak);
    paramGraphics.drawRect(paramInt1 + 1, paramInt2 + 1, paramInt3 - 3, paramInt4 - 3);
    int i = this.a.getWidth();
    int j = this.a.getHeight();
    paramGraphics.drawRegion(this.a, 0, 0, i, j, 0, paramInt1, paramInt2, 20);
    paramGraphics.drawRegion(this.a, 0, 0, i, j, 2, paramInt1 + paramInt3, paramInt2, 24);
    paramGraphics.drawRegion(this.a, 0, 0, i, j, 1, paramInt1, paramInt2 + paramInt4, 36);
    paramGraphics.drawRegion(this.a, 0, 0, i, j, 3, paramInt1 + paramInt3, paramInt2 + paramInt4, 40);
  }
  
  public void b(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramGraphics.setColor(16711680);
    paramGraphics.fillRect(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void c(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramGraphics.setColor(this.c);
    paramGraphics.drawRect(paramInt1, paramInt2 + 1, paramInt3 - 1, paramInt4 - 1);
    paramGraphics.setColor(this.b);
    paramGraphics.fillRect(paramInt1 + 1, paramInt2 + 2, paramInt3 - 2, paramInt4 - 2);
  }
  
  public void d(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramGraphics.setColor(this.c);
    paramGraphics.drawRect(paramInt1, paramInt2 + 1, paramInt3 - 1, paramInt4 - 1);
    paramGraphics.setColor(this.b);
    paramGraphics.fillRect(paramInt1 + 1, paramInt2 + 2, paramInt3 - 2, paramInt4 - 2);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ap.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */