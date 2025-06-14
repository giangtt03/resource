import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class fi extends aq {
  private dk i;
  
  private String j;
  
  private String[] k;
  
  public fi(dk paramdk) {
    this.i = paramdk;
    this.j = String.valueOf(paramdk.c()) + " (" + paramdk.a() + ")";
    this.k = new String[0];
    e(22);
    d(v.t);
  }
  
  public final void d(boolean paramBoolean) {
    if (paramBoolean || this.g != paramBoolean)
      this.c = true; 
    if (paramBoolean) {
      e(22 + this.k.length * bx.d.a() + 5);
    } else {
      e(22);
    } 
    super.d(paramBoolean);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.c)
      return; 
    paramInt2 += d();
    paramInt1 += c() + 2;
    d d;
    (d = bx.d).c(true);
    if (this.g) {
      pc.e(paramGraphics, paramInt1 - 2, paramInt2, e(), f());
      if (this.k != null)
        bx.a(paramGraphics, a.g, this.k, paramInt1 + 25, paramInt2 + 6 + d.a(), e(), f(), 0); 
    } 
    d.a(paramGraphics, this.j, paramInt1 + 25, paramInt2 + 4, 0);
    d.c();
    if (this.i.a) {
      pc.d(paramGraphics, -18, paramInt1 + 3, paramInt2 + 6, 0);
    } else {
      pc.d(paramGraphics, -17, paramInt1 + 3, paramInt2 + 4, 0);
    } 
    this.c = false;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\fi.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */