import javax.microedition.lcdui.Graphics;

public class fv extends at {
  private int a = 7;
  
  private String[] b;
  
  private int c;
  
  private int d;
  
  public void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.r)
      return; 
    paramInt1 += this.m;
    paramInt2 += this.n;
    pc.b(paramGraphics, paramInt1, paramInt2, this.o, this.p, 16777215, true);
    paramInt1 += this.a;
    paramInt2 += this.a;
    bx.a(paramGraphics, bx.c, this.b, paramInt1, paramInt2, this.o, this.p, 0);
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.a(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final void a(String paramString) {
    this.b = bx.a(paramString, this.o - this.a - this.a);
    this.p = 0 + this.b.length * bx.c.a() + this.a + this.a;
  }
  
  public final void i() {
    if (!this.r)
      return; 
    if (this.c != n()) {
      int i;
      if (Math.abs(i = this.c - n()) > 4)
        i /= 2; 
      f(n() + i);
    } 
    if (this.d != o()) {
      int i;
      if (Math.abs(i = this.d - o()) > 4)
        i /= 2; 
      g(o() + i);
    } 
  }
  
  public final void a(int paramInt1, int paramInt2) {
    this.c = paramInt1;
    this.d = paramInt2;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\fv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */