import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class mc extends mg {
  private static int[][] A = new int[][] { { 78, 11, 11, 83, 20 }, { 61, 17, 17, 80, 17 }, { 0, 0, 22, 24, 79, 12 }, { 44, 17, 17, 80, 17 }, { 22, 22, 22, 77, 13 }, { 0, 24, 50, 23, 28, 13 }, { 50, 17, 32, 32, 23, 8 }, { 89, 62, 42, 4, 2 }, { 151, 68, 45, 1 }, { 219, 24, 49, 50 } };
  
  private static byte[][] B = new byte[][] { { -1, -1, 1, 1, 1 }, { 2, 2, 3, 3, 4, 4 }, { 
        5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 
        9 }, { -1 } };
  
  static final byte[][] s = new byte[][] { new byte[7], new byte[6], { 
        1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 
        2 } };
  
  private as C;
  
  public boolean t = false;
  
  public mc(Image[] paramArrayOfImage, int[][] paramArrayOfint1, int[][] paramArrayOfint2, g paramg, Image paramImage) {
    super(paramArrayOfImage, paramArrayOfint1, paramArrayOfint2, paramg);
    a(0, 0, paramArrayOfImage[0].getWidth(), paramArrayOfImage[0].getHeight());
    a(s);
    this.C = new as(paramImage, A);
    this.C.a(B);
    this.C.a(0, 0, 0, 0);
    this.C.j(36);
  }
  
  public final void d(int paramInt) {
    super.d(paramInt);
    if (paramInt == 2 && !this.t) {
      this.C.d(3);
      return;
    } 
    this.C.d(paramInt);
  }
  
  public final void r() {
    super.r();
    this.C.a(0);
  }
  
  public final void c(int paramInt) {
    super.c(paramInt);
    this.C.c(paramInt);
  }
  
  public final void k() {
    switch (this.e) {
      case 0:
        if (j())
          d(1); 
        break;
    } 
    this.C.i();
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    super.a(paramGraphics, paramInt1, paramInt2);
    paramInt1 += this.m;
    paramInt2 += this.n;
    if (this.C != null) {
      if ((this.q & 0x20) != 0) {
        this.C.a(paramGraphics, (this.a == 0) ? (paramInt1 - 53) : (paramInt1 + this.o + 42), paramInt2 - this.p + 8);
        return;
      } 
      this.C.a(paramGraphics, (this.a == 0) ? (paramInt1 - 53) : (paramInt1 + this.o + 42), paramInt2 + 8);
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\mc.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */