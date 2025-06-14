import javax.microedition.lcdui.Graphics;

public class ex extends aq {
  private int k;
  
  protected String i;
  
  protected bf j;
  
  public ex(String paramString, int paramInt) {
    this.i = paramString;
    this.k = paramInt;
    e(20);
  }
  
  public final void a(bf parambf) {
    this.j = parambf;
  }
  
  public int a() {
    return this.k;
  }
  
  public void a(String paramString) {
    this.i = paramString;
  }
  
  public final String q() {
    return this.i;
  }
  
  public final boolean c(int paramInt1, int paramInt2) {
    if (!j())
      return false; 
    if (h().a(paramInt1, paramInt2)) {
      if (!this.g)
        this.g = true; 
      return f(95);
    } 
    return false;
  }
  
  public final boolean f(int paramInt) {
    if (!j())
      return false; 
    if (paramInt == 95 && this.j != null) {
      this.j.d(-1, a());
      return true;
    } 
    return false;
  }
  
  public void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.e)
      return; 
    paramInt1 += c();
    paramInt2 += d();
    if (this.g)
      pc.f(paramGraphics, paramInt1 - 1, paramInt2 - 1, e() + 2, 22); 
    ag.c().d(paramGraphics, paramInt1, paramInt2, e(), f());
    cw.a(paramGraphics);
    cw.a(paramGraphics, paramInt1 + 3, paramInt2, e() - 6, f());
    if (this.g) {
      bx.c.a(paramGraphics, this.i, paramInt1 + e() / 2, paramInt2 + 3, 1);
    } else {
      bx.d.a(paramGraphics, this.i, paramInt1 + e() / 2, paramInt2 + 3, 1);
    } 
    cw.b(paramGraphics);
  }
  
  public static final ex a(String paramString, int paramInt) {
    ex ex1;
    (ex1 = new ex(paramString, paramInt)).d(bx.d.a(paramString) + 30);
    ex1.e(bx.d.a() + 6);
    return ex1;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ex.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */