import javax.microedition.lcdui.Graphics;

public final class ab extends aa {
  private boolean j;
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    if (paramInt6 < 18)
      paramInt6 = 18; 
    if (paramInt5 < 18)
      paramInt5 = 18; 
    this.a = paramInt1 + paramInt5 / 2;
    this.b = paramInt2 + paramInt6 / 2;
    this.c = paramInt3 + paramInt5 / 2;
    this.d = paramInt4;
    this.g = 18;
    this.h = 18;
    this.e = paramInt5;
    this.f = paramInt6;
    this.c = this.a;
    this.d = this.b;
    this.j = true;
    this.i = false;
  }
  
  public final void b() {
    if (this.i)
      return; 
    if (this.j) {
      if (this.e != this.g) {
        int j;
        if (Math.abs(j = this.g - this.e) < 10) {
          this.e += j;
        } else {
          this.e += j / 2;
        } 
      } 
      if (this.f != this.h) {
        int j;
        if (Math.abs(j = this.h - this.f) < 10) {
          this.f += j;
        } else {
          this.f += j / 2;
        } 
      } 
      this.i = (this.f == this.h && this.e == this.g);
      return;
    } 
    int i;
    if (Math.abs(i = (i = this.d) - this.b) < 2) {
      this.b += i;
      this.i = true;
      return;
    } 
    this.b += i / 2;
  }
  
  public final void a(Graphics paramGraphics) {
    ag.c().a(paramGraphics, c(), d(), e(), f());
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ab.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */