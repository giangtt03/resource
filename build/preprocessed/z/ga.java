import javax.microedition.lcdui.Graphics;

public final class ga extends aq {
  private String i = "";
  
  private ez j;
  
  public ga(String paramString) {
    this.i = paramString;
    this.j = new ez();
    this.j.a(c(), bx.d.a() + 10, e(), 20);
    e(bx.d.a() + this.j.f() + 15);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.c)
      return; 
    int i = d() + paramInt2;
    int j = c() + paramInt1;
    if (m()) {
      pc.a(paramGraphics, c() + paramInt1, d() + paramInt2, e(), f(), 7070703, -1);
      paramGraphics.setColor(7267055);
      paramGraphics.fillRect(j, i, e(), bx.d.a() + 6);
    } 
    if (this.i != null) {
      bx.d.c(true);
      bx.d.a(paramGraphics, this.i, j, i + 3, 0);
      bx.d.c();
    } 
    this.j.a(paramGraphics, j + 3, i);
  }
  
  public final void n() {
    this.j.n();
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.a(paramInt1, paramInt2, paramInt3, paramInt4);
    this.j.a(paramInt1, paramInt2 + 20, e(), 18);
  }
  
  public final void d(int paramInt) {
    super.d(paramInt);
    this.j.d(paramInt - 5);
  }
  
  public final boolean f(int paramInt) {
    return this.j.f(paramInt);
  }
  
  public final boolean g(int paramInt) {
    return this.j.g(paramInt);
  }
  
  public final boolean c(int paramInt1, int paramInt2) {
    return this.j.c(paramInt1, paramInt2);
  }
  
  public final boolean f(int paramInt1, int paramInt2) {
    return this.j.f(paramInt1, paramInt2);
  }
  
  public final void d(boolean paramBoolean) {
    super.d(paramBoolean);
    if (this.j != null)
      this.j.d(paramBoolean); 
  }
  
  public final long a() {
    return this.j.a();
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ga.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */