import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class fz extends aq {
  public lr i;
  
  private static Image j;
  
  private static Image k;
  
  private static Image l;
  
  public fz(lr paramlr) {
    this.i = paramlr;
    e(22 + bx.d.a());
    d(v.t);
    if (paramlr.a() && j == null)
      j = f.d("/m/lock"); 
    if (l == null)
      l = f.d("/m/arena"); 
    if (k == null)
      k = f.d("/m/room"); 
  }
  
  public final void d(boolean paramBoolean) {
    if (paramBoolean || this.g != paramBoolean)
      this.c = true; 
    super.d(paramBoolean);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.c)
      return; 
    paramInt2 += d();
    paramInt1 += c() + 2;
    d d;
    (d = bx.d).c(true);
    if (this.g)
      pc.e(paramGraphics, paramInt1 - 2, paramInt2, e(), f()); 
    if (this.i.e != null)
      bx.a(paramGraphics, a.g, this.i.e, paramInt1 + 50, paramInt2 + 6 + d.a(), e(), f(), 0); 
    d.a(paramGraphics, this.i.c, paramInt1 + 50, paramInt2 + 4, 0);
    d.c();
    if (this.i.g == 2) {
      if (l != null)
        paramGraphics.drawImage(l, paramInt1 + 3, paramInt2 + 3, 0); 
    } else if (k != null) {
      paramGraphics.drawImage(k, paramInt1 + 3, paramInt2 + 3, 0);
    } 
    if (this.i.a() && j != null)
      paramGraphics.drawImage(j, paramInt1 + v.t - j.getWidth() - 4, paramInt2 + 6, 0); 
    this.c = false;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\fz.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */