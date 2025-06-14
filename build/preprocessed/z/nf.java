import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class nf extends ng {
  private static int[][] F = new int[][] { { 299, 123, 124, 75, 91, 50 }, { 140, 123, 159, 95, 41, 30 }, { 230, 127, 121, 17 }, { 0, 0, 136, 123, 14 }, { 357, 99, 108, 4, 32 }, { 423, 123, 128, 73, 2, 63 }, { 0, 123, 140, 96, 19, 26 }, { 136, 94, 122, 126, 3 }, { 456, 96, 88, 143, 41 } };
  
  public nf(int paramInt, Image[] paramArrayOfImage, byte[][] paramArrayOfbyte, int[] paramArrayOfint) {
    super(paramInt, paramArrayOfImage, paramArrayOfbyte, paramArrayOfint);
    this.f = 6;
  }
  
  protected final void a() {
    if (this.a.f() == 0) {
      if (this.x)
        ag.a().a(20); 
      this.x = false;
      this.g.a(this.w, this.y);
    } 
    if (this.a.j() && this.t == 0) {
      this.t--;
      this.s = this.j - 148;
      this.k = at.a(this.s, this.a.n(), 6);
      this.i = false;
      a(5);
      this.a.c(0);
    } 
  }
  
  protected final void b() {
    if (this.i) {
      if (this.a.e(this.s, this.k)) {
        a(1);
        return;
      } 
    } else if (this.a.e(this.s, this.k)) {
      this.a.c(0);
      this.a.f(this.j);
      a(0);
    } 
  }
  
  public final void a(int paramInt) {
    if (paramInt == 0 || paramInt == 1) {
      this.a.a(true);
    } else {
      this.a.a(false);
    } 
    if (paramInt == 2 || paramInt == 5 || paramInt == 1) {
      this.a.a(this.b[2], F);
      this.a.i(140);
      this.a.h(239);
      if (paramInt == 2)
        this.a.f(this.a.n() - 90); 
    } else {
      this.a.a(this.b[paramInt], this.c[paramInt]);
    } 
    this.a.d(paramInt);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    this.z.b(paramGraphics);
    if (this.a.h() == 1 || this.a.h() == 5)
      paramInt2 = 8; 
    this.a.a(paramGraphics, paramInt1, paramInt2);
    this.z.c(paramGraphics);
    this.C.a(paramGraphics, paramInt1, paramInt2);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\nf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */