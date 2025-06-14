import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class gl extends aq {
  private int i;
  
  public gl(int paramInt) {
    this.i = paramInt;
    e(22);
    d(v.t);
  }
  
  public final void d(boolean paramBoolean) {
    if (paramBoolean || this.g != paramBoolean)
      this.c = true; 
    super.d(paramBoolean);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.c)
      return; 
    paramInt1 += c();
    paramInt2 += d();
    if (this.g)
      pc.e(paramGraphics, paramInt1 - 2, paramInt2, e(), f()); 
    a.g.c(true);
    a.g.a(paramGraphics, "Xem thêm...", paramInt1 + this.i, paramInt2 + 4, 0);
    a.g.c();
    this.c = false;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\gl.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */