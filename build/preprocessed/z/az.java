import javax.microedition.lcdui.Graphics;

public abstract class az {
  private int e;
  
  private bf f;
  
  protected int a;
  
  protected int b;
  
  private int g;
  
  private int h;
  
  protected int c;
  
  protected int d;
  
  public az(int paramInt) {
    int i = paramInt;
    az az1;
    (az1 = this).e = i;
  }
  
  public final int a() {
    return this.e;
  }
  
  public final void a(int paramInt) {
    this.e = paramInt;
  }
  
  public final void a(bf parambf) {
    this.f = parambf;
  }
  
  public final boolean b(int paramInt) {
    if (this.f != null) {
      this.f.d(paramInt, this.e);
      return true;
    } 
    return false;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3) {
    this.a = paramInt1;
    this.g = paramInt1;
    switch (paramInt3) {
      case 24:
        this.a = paramInt1 - this.c;
        this.g = paramInt1 - v.t / 3;
        break;
      case 17:
        this.a = paramInt1 - this.c / 2;
        this.g = paramInt1 - v.t / 6;
        break;
    } 
    this.b = paramInt2;
    this.h = paramInt2;
  }
  
  public boolean a(int paramInt1, int paramInt2) {
    return (paramInt2 >= this.h && paramInt1 >= this.g && paramInt1 <= this.g + v.t / 3);
  }
  
  public boolean b() {
    this.d = 3;
    return true;
  }
  
  public abstract void a(Graphics paramGraphics);
  
  public void c() {
    if (this.d > 0)
      this.d--; 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\az.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */