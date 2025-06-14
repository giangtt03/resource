import javax.microedition.lcdui.Graphics;

public final class gh extends aq {
  private int i = 0;
  
  private int j = 0;
  
  private String k = "";
  
  public gh(String paramString) {
    this.k = paramString;
    e(bx.d.a() + this.j + this.i);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.c)
      return; 
    if (m()) {
      paramGraphics.setColor(7267055);
      paramGraphics.fillRect(c() + paramInt1, d() + paramInt2 + this.i - 1, e(), bx.d.a() + 2);
    } 
    cw.a(paramGraphics);
    cw.a(paramGraphics, c() + paramInt1, d() + paramInt2 + this.i - 1, e(), bx.d.a());
    bx.d.c(true);
    bx.d.b(true);
    bx.d.a(paramGraphics, this.k, c() + e() / 2 + paramInt1, d() + paramInt2 + this.i, 1);
    bx.d.c();
    cw.b(paramGraphics);
    c(true);
  }
  
  public final void d(int paramInt1, int paramInt2) {
    this.i = paramInt1;
    this.j = 5;
    e(bx.d.a() + this.j + this.i);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.a(paramInt1, paramInt2, paramInt3, paramInt4 + this.i + this.j);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\gh.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */