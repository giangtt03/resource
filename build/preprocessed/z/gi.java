import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class gi extends at {
  private String a = "";
  
  private int b = 60;
  
  public gi(String paramString) {
    this.a = paramString;
    this.m = v.t;
    this.n = 0;
    this.o = bx.d.a(paramString);
    this.b = 40;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.r)
      return; 
    pc.b(paramGraphics, 0, 0, v.t, 20, false);
    bx.d.a(paramGraphics, this.a, this.m, 4, 0);
  }
  
  public final void i() {
    if (!this.r)
      return; 
    if (this.m > v.t / 3) {
      this.m /= 10;
      return;
    } 
    if (this.b > 0) {
      this.b--;
      return;
    } 
    if (this.m > 0 || this.m > -this.o) {
      this.m -= 2;
      return;
    } 
    this.r = false;
    a.s().f();
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\gi.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */