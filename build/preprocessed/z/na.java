import javax.microedition.lcdui.Image;

public final class na extends as {
  private int s;
  
  public na(int paramInt1, int paramInt2) {
    c(paramInt1, paramInt2);
    this.f = new int[][] { { 0, 0, 0, 2, 1, 2 }, { 2 } };
    this.r = false;
    this.q = 3;
  }
  
  public final int a(Image paramImage) {
    if (paramImage == null)
      return 0; 
    a(paramImage, 3);
    this.r = true;
    d(0);
    this.g = 0;
    this.s = 45;
    return (this.f[0]).length + this.s;
  }
  
  public final void k() {
    switch (this.e) {
      case 0:
        if (this.g >= (this.f[0]).length - 1) {
          d(1);
          return;
        } 
        break;
      case 1:
        if (this.s > 0) {
          this.s--;
          if (this.s == 0) {
            this.b = null;
            this.r = false;
          } 
        } 
        break;
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\na.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */