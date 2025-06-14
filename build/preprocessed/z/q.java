import javax.microedition.lcdui.Graphics;

public final class q extends n {
  private d i = null;
  
  private boolean j = false;
  
  public final void a(d paramd) {
    this.i = paramd;
  }
  
  public q(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, d paramd) {
    this.i = paramd;
    this.g = paramString;
    this.a = paramInt1;
    this.f = paramInt2;
    this.b = paramInt3;
    this.c = paramInt4;
    this.d = paramInt5;
    a(paramd.a());
    if (paramInt1 == 3) {
      boolean bool = true;
      q q1;
      (q1 = this).j = true;
    } 
  }
  
  public final String toString() {
    return this.g;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    paramInt1 += this.b;
    paramInt2 += this.c;
    if (this.h && (this.a == 3 || this.a == 4 || this.a == 5)) {
      paramGraphics.setColor(14211288);
      paramGraphics.fillRect(paramInt1 - 1, paramInt2, this.d + 1, this.e);
    } 
    if (this.j) {
      this.i.b(true);
      this.i.a(paramGraphics, this.g, paramInt1, paramInt2 + (this.e - this.i.a()) / 2, 0);
      this.i.c();
      return;
    } 
    this.i.a(paramGraphics, this.g, paramInt1, paramInt2 + (this.e - this.i.a()) / 2, 0);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\q.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */