import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ml extends at {
  private int a;
  
  private Image[] b;
  
  private Image[] c;
  
  private Image[] d;
  
  private int e;
  
  private int f;
  
  private int g;
  
  private int h;
  
  private int i;
  
  private int j;
  
  public ml() {
    ml ml1;
    (ml1 = this).c = (mp.a()).d;
    ml1.d = (mp.a()).e;
    ml1.b = new Image[1];
    ml1.b[0] = (mp.a()).g;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    switch (this.a) {
      case 2:
      case 3:
        paramGraphics.drawImage(this.c[this.g], this.m, this.n, 3);
        return;
      case 1:
        paramGraphics.drawImage(this.c[this.g], this.m, this.n, 3);
        paramInt1 = 14;
        if (this.e >= 3)
          paramInt1++; 
        if ((this.f & 0x1) == 1)
          paramGraphics.drawRegion(this.d[this.g], 0, 0, this.d[this.g].getWidth(), this.d[this.g].getHeight(), 6, this.m - paramInt1, this.n, 10); 
        if ((this.f & 0x2) == 2)
          paramGraphics.drawRegion(this.d[this.g], 0, 0, this.d[this.g].getWidth(), this.d[this.g].getHeight(), 5, this.m + paramInt1, this.n, 6); 
        if ((this.f & 0x4) == 4)
          paramGraphics.drawRegion(this.d[this.g], 0, 0, this.d[this.g].getWidth(), this.d[this.g].getHeight(), 0, this.m, this.n - paramInt1, 33); 
        if ((this.f & 0x8) == 8) {
          paramGraphics.drawRegion(this.d[this.g], 0, 0, this.d[this.g].getWidth(), this.d[this.g].getHeight(), 3, this.m, this.n + paramInt1, 17);
          return;
        } 
        break;
      case 4:
        paramInt1 = this.b[this.g].getWidth() >> 1;
        paramInt2 = 0;
        if (this.j >= 2)
          paramInt2 = 1; 
        cw.a(paramGraphics, this.b[this.g], paramInt2 * paramInt1, 0, paramInt1, this.b[this.g].getHeight(), this.m, this.n, 3);
        break;
    } 
  }
  
  public final void i() {
    int i;
    boolean bool;
    switch (this.a) {
      case 4:
        this.j++;
        if (this.j >= 4) {
          byte b = 2;
          ml ml1;
          (ml1 = this).a = 2;
          return;
        } 
        break;
      case 3:
        if ((i = Math.abs(this.i - this.n)) < 2) {
          i = 2;
        } else {
          i /= 2;
        } 
        bool = f(this.i, i);
        if ((i = Math.abs(this.h - this.m)) < 2) {
          i = 2;
        } else {
          i /= 2;
        } 
        if (bool &= e(this.h, i)) {
          i = 2;
          ml ml1;
          (ml1 = this).a = 2;
        } 
      case 1:
        this.e++;
        if (this.e > 6)
          this.e = 0; 
        break;
    } 
  }
  
  public final void a() {
    this.a = 0;
  }
  
  public final void a(int paramInt) {
    this.g = paramInt;
  }
  
  public final void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.a = 3;
    this.h = paramInt3;
    this.i = paramInt4;
    c(paramInt1, paramInt2);
  }
  
  public final void a(int paramInt1, int paramInt2) {
    this.a = 2;
    c(paramInt1, paramInt2);
  }
  
  public final void b(int paramInt1, int paramInt2, int paramInt3) {
    this.a = 1;
    this.f = paramInt1;
    c(paramInt2, paramInt3);
  }
  
  public final void b(int paramInt1, int paramInt2) {
    this.a = 4;
    c(paramInt1, paramInt2);
    this.j = 0;
    this.e = 0;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ml.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */