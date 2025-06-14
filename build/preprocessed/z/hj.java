import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class hj extends at {
  private int a;
  
  private int b;
  
  private int c;
  
  private Image d;
  
  private int e = 1;
  
  private boolean f;
  
  private boolean g = true;
  
  private int h = 3;
  
  private int i = 0;
  
  private int[] j;
  
  private int[] k;
  
  public hj(int paramInt1, int paramInt2) {
    this.m = paramInt1;
    this.n = paramInt2;
    this.d = pc.b;
    this.a = this.d.getWidth() / 3;
    this.b = this.d.getHeight();
    a(1);
  }
  
  public final void i() {
    if (!this.g)
      if (!this.f) {
        this.c++;
        this.i = 0;
        if (this.c >= 2) {
          this.c = 2;
          this.f = true;
        } 
      } else {
        this.i++;
        if (this.i > 1) {
          this.e += 12;
          this.c--;
          if (this.c < 0) {
            this.c = 0;
            if (this.h == 0) {
              this.g = true;
            } else {
              this.h--;
              this.f = false;
              this.e = 1;
            } 
          } 
          this.i = 0;
        } 
      }  
    a(this.e);
  }
  
  private void a(int paramInt) {
    paramInt /= 2;
    int i = this.m;
    int j = this.n;
    byte b = -90;
    this.j = new int[8];
    this.k = new int[8];
    for (byte b1 = 0; b1 < 8; b1++) {
      this.j[b1] = i + (paramInt * l.b(b) >> 14);
      this.k[b1] = j + (paramInt * l.a(b) >> 14);
      b += 45;
    } 
  }
  
  public final void a() {
    this.g = false;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (this.g)
      return; 
    for (byte b = 0; b < this.j.length; b++)
      cw.a(paramGraphics, this.d, this.c * this.a, 0, this.a, this.b, this.j[b] + paramInt1, this.k[b] + paramInt2, 3); 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\hj.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */