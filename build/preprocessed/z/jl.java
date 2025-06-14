import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class jl extends im {
  private static final byte[][] u = new byte[][] { { -1 }, { 0, 0, 1, 2, 2, 2 }, { 2 }, { 3, 3, 4, 4, 4 } };
  
  private int v = -1;
  
  public int s;
  
  public as[] t;
  
  public jl() {
    mp.a().a(2008);
    Image image = (mp.a()).C;
    this.t = new as[36];
    for (byte b = 0; b < this.t.length; b++) {
      this.t[b] = new as(image, 5);
      this.t[b].a(u);
      this.t[b].a(false);
      this.t[b].j(3);
      this.t[b].b(false);
    } 
    a(u);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    c(paramInt1, paramInt2);
    b(paramInt3, paramInt4);
    d(0);
    this.r = true;
  }
  
  public final void k() {
    byte b2;
    byte b1;
    for (b1 = 0; b1 < this.s; b1++)
      this.t[b1].i(); 
    switch (this.e) {
      case 0:
        this.v = 5;
        for (b1 = 0; b1 < this.s; b1++) {
          byte b = b1;
          this.t[b].b(true);
          this.t[b].d(1);
          int i = this.h + cv.a() % 60;
          int j = this.i + cv.a() % 60;
          int k = 7 + cv.a(10);
          int m = Math.abs(this.t[b].n() - i) / k;
          k = Math.abs(this.t[b].o() - j) / k;
          if (m <= 0)
            m = 1; 
          if (k <= 0)
            k = 1; 
          this.t[b].b(i, j);
          this.t[b].a(m, k);
        } 
        d(1);
        return;
      case 1:
        if (this.v >= 0) {
          this.v--;
          if (this.v == 0) {
            for (b1 = 0; b1 < this.s; b1++) {
              byte b = b1;
              this.t[b].d(2);
            } 
            d(2);
            return;
          } 
        } 
        break;
      case 2:
        b1 = 1;
        for (b2 = 0; b2 < this.s; b2++) {
          if (this.t[b2].h() == 2) {
            if (this.t[b2].b(this.t[b2].a(), this.t[b2].b(), this.t[b2].c(), this.t[b2].d()))
              this.t[b2].d(3); 
            b1 = 0;
          } else if (this.t[b2].m() && this.t[b2].h() == 3) {
            if (this.t[b2].j()) {
              this.t[b2].b(false);
            } else {
              b1 = 0;
            } 
          } 
        } 
        if (b1 != 0)
          b(false); 
        break;
    } 
  }
  
  public final void a(Graphics paramGraphics) {
    if (!this.r)
      return; 
    for (byte b = 0; b < this.s; b++)
      this.t[b].a(paramGraphics); 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\jl.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */