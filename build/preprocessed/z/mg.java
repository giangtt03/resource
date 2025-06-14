import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class mg extends as {
  public static final int[][] u = new int[][] { { 
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
        1, 1, 1, 1, 1, 1, 1, 1 }, { 1 } };
  
  public static final int[][] v = new int[][] { { 0, 0, 1, 1, 2, 2, 3, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3, 3 } };
  
  public static final int[][] w = new int[][] { { 
        0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 
        3, 3, 4, 4, 4, 5, 5, 5 }, new int[1] };
  
  public static final int[][] x = new int[][] { new int[9], new int[9] };
  
  public static final int[][] y = new int[][] { new int[1], new int[1] };
  
  public static final int[][] z = new int[][] { new int[5], new int[5] };
  
  private Image[] s = null;
  
  private int[][] t;
  
  private int[][] A;
  
  private lc B;
  
  private nr C;
  
  public mg(Image[] paramArrayOfImage, int[][] paramArrayOfint1, int[][] paramArrayOfint2, g paramg) {
    this.s = paramArrayOfImage;
    paramArrayOfint1 = paramArrayOfint1;
    mg mg1;
    (mg1 = this).t = paramArrayOfint1;
    paramArrayOfint1 = paramArrayOfint2;
    (mg1 = this).A = paramArrayOfint1;
    h(paramg.a);
    i(paramg.b);
  }
  
  public void r() {
    this.g = 0;
  }
  
  public final void j(int paramInt) {
    super.j(paramInt);
  }
  
  public final boolean j() {
    return (this.g >= (this.f[this.e]).length - 1);
  }
  
  public void k() {}
  
  public void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.r || this.g < 0)
      return; 
    paramInt1 += this.m;
    paramInt2 += this.n;
    if (this.s != null) {
      if (this.C != null) {
        this.C.k();
        this.C.c(this.a);
        this.C.a(paramGraphics, paramInt1, paramInt2);
      } 
      int i = this.f[this.e][this.g];
      boolean bool = ((this.q & 0x20) != 0) ? true : false;
      if (this.a == 0) {
        paramGraphics.drawRegion(this.s[i], 0, 0, this.s[i].getWidth(), this.s[i].getHeight(), 0, paramInt1 + this.t[i][0], paramInt2 + this.A[i][bool], this.q);
      } else {
        paramGraphics.drawRegion(this.s[i], 0, 0, this.s[i].getWidth(), this.s[i].getHeight(), 2, paramInt1 + this.t[i][1], paramInt2 + this.A[i][bool], this.q);
      } 
      if (this.B != null) {
        this.B.k();
        if (this.a == 2) {
          this.B.a(paramGraphics, paramInt1 + 3, paramInt2 + this.s[i].getHeight() / 3);
          return;
        } 
        this.B.a(paramGraphics, paramInt1 + 13, paramInt2 + this.s[i].getHeight() / 3);
      } 
    } 
  }
  
  public final void a(nr paramnr) {
    this.C = paramnr;
  }
  
  public final void a(lc paramlc) {
    this.B = paramlc;
  }
  
  public final mg u() {
    lc lc1 = this.B;
    mg mg1;
    mg mg2;
    (mg2 = mg1 = new mg(this.s, this.t, this.A, new g(this.o, this.p))).B = lc1;
    mg1.a(this.f);
    return mg1;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\mg.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */