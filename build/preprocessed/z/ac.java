import javax.microedition.lcdui.Graphics;

public final class ac extends aa {
  private boolean j;
  
  private boolean k;
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    if (paramInt6 < 18)
      paramInt6 = 18; 
    if (paramInt5 < 18)
      paramInt5 = 18; 
    this.a = paramInt1 + paramInt5 / 2;
    this.b = paramInt2;
    this.c = paramInt3 + paramInt5 / 2;
    this.d = paramInt4 + paramInt6 / 2;
    this.g = paramInt5;
    this.h = paramInt6;
    this.f = 18;
    this.e = 18;
    this.a = this.c;
    this.b = this.d;
    if (this.b > paramInt4) {
      this.k = true;
    } else {
      this.k = false;
    } 
    this.j = false;
    this.i = false;
  }
  
  public final void b() {
    if (this.i)
      return; 
    if (this.j) {
      this.b = this.d;
      if (this.f != this.h) {
        int j;
        if (Math.abs(j = this.h - this.f) < 10) {
          this.f += j;
        } else {
          this.f += j / 2;
        } 
      } 
      if (this.e != this.g) {
        int j;
        if (Math.abs(j = this.g - this.e) < 10) {
          this.e += j;
        } else {
          this.e += j / 2;
        } 
      } 
      this.i = (this.f == this.h && this.e == this.g);
      return;
    } 
    int i;
    if (Math.abs(i = (i = this.k ? (this.d - 2) : (this.d + 2)) - this.b) < 2) {
      this.b += i;
      this.j = true;
      return;
    } 
    this.b += i / 2;
  }
  
  public final void a(Graphics paramGraphics) {
    ag.c().a(paramGraphics, c(), d(), e(), f());
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ac.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */