import javax.microedition.lcdui.Graphics;

public final class ev extends aq {
  private boolean i = true;
  
  private dt j;
  
  private String k = "";
  
  public ev(dt paramdt, boolean paramBoolean, int paramInt) {
    d(paramInt);
    dt dt1 = paramdt;
    ev ev1;
    (ev1 = this).j = dt1;
    ds[] arrayOfDs = dt1.c();
    byte b1 = 0;
    for (byte b2 = 0; b2 < arrayOfDs.length; b2++) {
      if (arrayOfDs[b2].e() == 2)
        b1++; 
    } 
    ev1.k = String.valueOf(dt1.b()) + "(" + ((gr.c && arrayOfDs != null) ? arrayOfDs.length : ((arrayOfDs == null) ? false : arrayOfDs.length)) + ")";
    boolean bool = paramBoolean;
    (ev1 = this).i = bool;
  }
  
  public final void d(boolean paramBoolean) {
    super.d(paramBoolean);
    if (paramBoolean) {
      e(40);
      return;
    } 
    e(22);
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
    d.a(paramGraphics, this.k, paramInt1 + 25, paramInt2 + 6, 0);
    d.c();
    if (this.g)
      (d = bx.c).a(paramGraphics, this.j.b(), paramInt1 + 25, paramInt2 + 19, 0); 
    if (this.i) {
      pc.d(paramGraphics, -18, paramInt1 + 3, paramInt2 + 9, 0);
    } else {
      pc.d(paramGraphics, -17, paramInt1 + 3, paramInt2 + 9, 0);
    } 
    this.c = false;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ev.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */