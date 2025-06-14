import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class fa extends aq {
  public boolean i;
  
  public boolean j;
  
  public long k;
  
  private String m;
  
  private String n;
  
  public int l = 0;
  
  public fa(boolean paramBoolean, long paramLong, String paramString1, String paramString2, int paramInt1, int paramInt2) {
    this.j = paramBoolean;
    this.k = paramLong;
    this.m = paramString1;
    this.n = paramString2;
    this.l = paramInt1;
    d(paramInt2);
  }
  
  public final void d(boolean paramBoolean) {
    if (paramBoolean) {
      e(40);
    } else {
      e(22);
    } 
    if (paramBoolean || this.g != paramBoolean)
      this.c = true; 
    super.d(paramBoolean);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.c)
      return; 
    paramInt2 += d();
    paramInt1 += c() + 2;
    if (this.g)
      pc.e(paramGraphics, paramInt1 - 2, paramInt2, e(), f()); 
    paramInt2 += 3;
    if (this.j) {
      d d;
      (d = bx.d).c(true);
      d.a(paramGraphics, this.m, paramInt1 + 25, paramInt2 + 3, 0);
      d.c();
      if (this.g)
        (d = bx.c).a(paramGraphics, this.n, paramInt1 + 25, paramInt2 + 19, 0); 
      if (this.i) {
        pc.d(paramGraphics, -18, paramInt1 + 3, paramInt2 + 4, 0);
      } else {
        pc.d(paramGraphics, -17, paramInt1 + 3, paramInt2 + 4, 0);
      } 
    } else {
      bx.d.a(paramGraphics, this.m, paramInt1 + 25, paramInt2 + 4, 0);
      pc.d(paramGraphics, -11, paramInt1 + 3, paramInt2 + 4, 0);
      if (this.g)
        a.g.a(paramGraphics, this.n, paramInt1 + 25, paramInt2 + 18, 0); 
    } 
    this.c = false;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\fa.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */