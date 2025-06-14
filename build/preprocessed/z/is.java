import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class is extends im {
  private static byte[][] x = new byte[][] { new byte[1], { 
        0, 0, 1, 1, 1, 2, 2, 3, 3, 3, 
        4, 4, 4 } };
  
  protected Image s;
  
  protected Image t;
  
  protected int u;
  
  protected int v;
  
  protected int w;
  
  public is() {
    mp.a().a(1000);
    this.s = (mp.a()).k;
    this.t = (mp.a()).l;
    a(x);
    this.r = false;
    this.v = 1;
    this.w = 5;
  }
  
  public void d(int paramInt) {
    super.d(paramInt);
    this.g = 0;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    b(paramInt3, paramInt4);
    c(paramInt1, paramInt2);
    if (paramInt1 < paramInt3) {
      c(2);
    } else {
      c(0);
    } 
    a(this.s, this.v);
    d(0);
    j(33);
    this.j = at.a(paramInt1, paramInt3, 10);
    this.k = at.a(paramInt2, paramInt4, 10);
    this.r = true;
    this.u = paramInt5;
  }
  
  public final void k() {
    if (this.u > 0) {
      this.u--;
      return;
    } 
    if (this.e == 0) {
      if (b(this.h, this.i, this.j, this.k)) {
        a(this.t, this.w);
        j(3);
        d(1);
        return;
      } 
    } else if (this.e == 1 && j()) {
      this.r = false;
    } 
  }
  
  public void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (this.u > 0)
      return; 
    super.a(paramGraphics, paramInt1, paramInt2);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\is.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */