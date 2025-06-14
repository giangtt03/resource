import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class nh extends at {
  private static final int[][] a = new int[][] { { 
        0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 
        4, 5, 5 } };
  
  private no[] b;
  
  private int c;
  
  private final Image d;
  
  public nh(Image paramImage) {
    this(paramImage, 6);
  }
  
  private nh(Image paramImage, int paramInt) {
    this.d = paramImage;
    if (paramImage == null)
      return; 
    this.o = paramImage.getWidth() / 6;
    this.p = paramImage.getHeight() / 9;
    this.b = new no[6];
    for (byte b = 0; b < this.b.length; b++) {
      this.b[b] = new no();
      this.b[b].a(a);
    } 
  }
  
  public final void a(int paramInt1, int paramInt2, k paramk, int paramInt3, int paramInt4, boolean paramBoolean) {
    if (this.d == null)
      return; 
    paramInt3 = this.d.getHeight() / 9 * paramInt3;
    this.c = paramInt4;
    for (paramInt4 = 0; paramInt4 < this.b.length; paramInt4++) {
      this.b[paramInt4].a(cv.a((a[0]).length));
      this.b[paramInt4].a(paramInt1, paramInt2, paramk, this.d, paramInt3, this.o, this.p, paramBoolean);
    } 
    this.r = true;
  }
  
  public final void i() {
    if (this.r) {
      if (this.c > 0) {
        this.c--;
        return;
      } 
      byte b = 0;
      if (this.b != null) {
        for (int i = this.b.length - 1; i >= 0; i--) {
          if (this.b[i] != null && this.b[i].m()) {
            this.b[i].i();
          } else {
            b++;
          } 
        } 
        if (b >= this.b.length) {
          this.r = false;
          return;
        } 
        return;
      } 
    } else {
      return;
    } 
    this.r = false;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (this.r) {
      if (this.c > 0)
        return; 
      if (this.b != null)
        for (paramInt1 = this.b.length - 1; paramInt1 >= 0; paramInt1--) {
          if (this.b[paramInt1] != null)
            this.b[paramInt1].a(paramGraphics); 
        }  
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\nh.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */