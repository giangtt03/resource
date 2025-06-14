import javax.microedition.lcdui.Graphics;

public abstract class aq {
  protected int a;
  
  protected aq b;
  
  protected boolean c = true;
  
  protected k d = new k();
  
  protected boolean e = true;
  
  protected boolean f = true;
  
  protected boolean g = false;
  
  protected af h;
  
  public aq() {
    d(this.g);
  }
  
  public final int b() {
    return this.a;
  }
  
  public final void a_(int paramInt) {
    this.a = paramInt;
  }
  
  public final void a(af paramaf) {
    this.h = paramaf;
  }
  
  public final int c() {
    return this.d.a;
  }
  
  public final int d() {
    return this.d.b;
  }
  
  public final int e() {
    return this.d.c;
  }
  
  public int f() {
    return this.d.d;
  }
  
  public final g g() {
    return new g(this.d.c, this.d.d);
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.d.a(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final void a(k paramk) {
    a(paramk.a, paramk.b, paramk.c, paramk.d);
  }
  
  public final k h() {
    return this.d;
  }
  
  public void a_(int paramInt1, int paramInt2) {
    b_(paramInt1);
    c(paramInt2);
  }
  
  public void b(int paramInt1, int paramInt2) {
    d(paramInt1);
    e(paramInt2);
  }
  
  public final void b_(int paramInt) {
    this.d.a = paramInt;
  }
  
  public final void c(int paramInt) {
    this.d.b = paramInt;
  }
  
  public void d(int paramInt) {
    this.d.c = paramInt;
  }
  
  public final void e(int paramInt) {
    this.d.d = paramInt;
  }
  
  public final boolean i() {
    return this.e;
  }
  
  public final void a(boolean paramBoolean) {
    this.e = paramBoolean;
  }
  
  public final boolean j() {
    return this.f;
  }
  
  public void b(boolean paramBoolean) {
    this.f = paramBoolean;
  }
  
  public boolean k() {
    return this.c;
  }
  
  public void c(boolean paramBoolean) {
    this.c = paramBoolean;
  }
  
  public final aq l() {
    return this.b;
  }
  
  public void a(aq paramaq) {
    this.b = paramaq;
  }
  
  public boolean m() {
    return this.g;
  }
  
  public void d(boolean paramBoolean) {
    this.g = paramBoolean;
  }
  
  public void n() {}
  
  public void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (this.c && this.e)
      this.c = false; 
  }
  
  public boolean f(int paramInt) {
    return false;
  }
  
  public boolean g(int paramInt) {
    return false;
  }
  
  public boolean c(int paramInt1, int paramInt2) {
    return false;
  }
  
  public boolean e(int paramInt1, int paramInt2) {
    return false;
  }
  
  public boolean f(int paramInt1, int paramInt2) {
    return false;
  }
  
  public void o() {}
  
  public void p() {}
  
  public String toString() {
    String str;
    aq aq1;
    return str = "Component id = " + (aq1 = this).a + ";  width=" + this.d.c + ",height=" + this.d.d + ",x=" + this.d.a + ",y=" + this.d.b;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\aq.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */