import javax.microedition.lcdui.Graphics;

public final class ax extends at {
  private a a;
  
  private int b;
  
  private at c;
  
  private at d;
  
  public ax(int paramInt) {
    this.a = new a(paramInt);
    this.b = paramInt;
  }
  
  public final void a(at paramat) {
    synchronized (this.a) {
      if (this.c == null) {
        this.c = paramat;
        return;
      } 
      if (this.a.d() >= this.b)
        this.a.a(0); 
      this.a.a(paramat);
      return;
    } 
  }
  
  public final at a() {
    return this.c;
  }
  
  public final void b() {
    this.a.a();
    this.c = null;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (this.d != null)
      this.d.a(paramGraphics); 
    if (this.c != null)
      this.c.a(paramGraphics); 
  }
  
  public final void b(at paramat) {
    this.d = paramat;
  }
  
  public final void i() {
    if (this.d != null)
      this.d.i(); 
    if (this.c != null) {
      this.c.i();
      if (!this.c.m()) {
        this.c = null;
        if (this.a.d() > 0) {
          this.c = (at)this.a.b();
          this.a.a(0);
        } 
      } 
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ax.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */