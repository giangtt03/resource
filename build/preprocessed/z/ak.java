import javax.microedition.lcdui.Graphics;

public class ak extends am {
  private int c = 0;
  
  protected int a = 0;
  
  private int d = 5;
  
  private an k;
  
  private ad l;
  
  private boolean m;
  
  private boolean n;
  
  protected int b = v.am;
  
  public ak() {
    this.e = -100001;
    a();
  }
  
  public final void a() {
    this.f = v.t;
    this.g = v.u;
    this.c = 0;
    this.a = 0;
    this.d = 5;
    this.k = null;
    this.m = false;
  }
  
  public final void a(an paraman, ad paramad, boolean paramBoolean) {
    if (paraman != null) {
      this.k = paraman;
      this.l = paramad;
      this.m = true;
      this.n = paramBoolean;
    } 
  }
  
  public final void a(int paramInt) {
    this.a = 0;
  }
  
  public void b_() {
    if (this.a >= 100) {
      if (this.k != null) {
        ag.b().a(this.k, this.n, this.l);
        this.k = null;
        return;
      } 
    } else {
      if (this.m)
        this.d += 3; 
      this.a += this.d;
      if (this.a > 100)
        this.a = 100; 
    } 
  }
  
  protected void a(Graphics paramGraphics) {
    paramGraphics.setColor(this.b);
    paramGraphics.fillRect(0, 0, this.f, this.g);
  }
  
  protected void b(Graphics paramGraphics) {
    paramGraphics.setColor(16777215);
    paramGraphics.drawRect(0, this.g - 20, this.f, 19);
    int i = this.g - 20;
    paramGraphics.setColor(15484506);
    paramGraphics.fillRect(0, i + 1, this.a * this.f / 100, 18);
    bx.b.a(paramGraphics, "Vui lòng chờ...", this.f / 2, i + 3, 1);
  }
  
  public final void c(Graphics paramGraphics) {
    if (this.c <= 2) {
      a(paramGraphics);
      this.c++;
    } 
    b(paramGraphics);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ak.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */