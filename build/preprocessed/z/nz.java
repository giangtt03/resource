import javax.microedition.lcdui.Graphics;

public class nz extends an {
  private ay b;
  
  public fn a;
  
  public nz(byte paramByte) {
    super(-1);
    a(new av(16777215, 0, 0, this.f, this.g));
    this.a = new fk();
    this.a.a(0, 0, this.f, this.g);
  }
  
  public final void j(boolean paramBoolean) {
    this.b = new ay(0);
    this.b.a(0, 0, this.f, this.g);
    this.b.b(this.a);
    this.b.h(1);
  }
  
  public final void a(aq paramaq) {
    this.a.b(paramaq);
  }
  
  public final aq f(int paramInt) {
    return this.a.j(paramInt);
  }
  
  public final void g(int paramInt) {
    this.a.i(1);
  }
  
  protected final void a(Graphics paramGraphics) {
    if (this.b != null) {
      this.b.a(paramGraphics, 0, 0);
      return;
    } 
    this.a.a(paramGraphics, 0, 0);
  }
  
  protected final void c() {
    if (this.b != null) {
      this.b.n();
      return;
    } 
    this.a.n();
  }
  
  protected final void a(int paramInt) {
    if (this.b != null) {
      this.b.f(paramInt);
      return;
    } 
    this.a.f(paramInt);
  }
  
  protected final void e(int paramInt) {
    if (this.b != null) {
      this.b.g(paramInt);
      return;
    } 
    this.a.g(paramInt);
  }
  
  protected final void e(int paramInt1, int paramInt2) {
    if (this.b != null) {
      this.b.c(paramInt1, paramInt2);
      return;
    } 
    this.a.c(paramInt1, paramInt2);
  }
  
  protected final void f(int paramInt1, int paramInt2) {
    if (this.b != null) {
      this.b.f(paramInt1, paramInt2);
      return;
    } 
    this.a.f(paramInt1, paramInt2);
  }
  
  protected final void g(int paramInt1, int paramInt2) {
    if (this.b != null) {
      this.b.e(paramInt1, paramInt2);
      return;
    } 
    this.a.e(paramInt1, paramInt2);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\nz.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */