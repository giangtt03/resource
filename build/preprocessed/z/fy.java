import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class fy extends aq {
  private dh i;
  
  private int[] j;
  
  private int k;
  
  private String l;
  
  private boolean m = false;
  
  private d n;
  
  public fy(dh paramdh) {
    this.i = paramdh;
    e(20);
    d(v.t);
    this.n = bx.c;
  }
  
  public final void a(d paramd) {
    this.n = paramd;
  }
  
  public final void a(int[] paramArrayOfint) {
    this.j = paramArrayOfint;
    this.k = paramArrayOfint[2] - paramArrayOfint[1] - 10;
    this.l = a.a(this.i.c, this.k);
  }
  
  public final void e(boolean paramBoolean) {
    this.m = true;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    paramInt1 += c();
    paramInt2 += d();
    if (this.g) {
      pc.e(paramGraphics, paramInt1, paramInt2, e(), f());
    } else if (this.m) {
      int i = paramInt1 + 7;
      int j = e() - 14;
      int k = f() - 2;
      int m = paramInt2 + 1;
      paramGraphics.setColor(12644863);
      paramGraphics.fillRect(i, m, j, k);
      paramGraphics.setColor(12644849);
      paramGraphics.drawRect(i, m, j, k);
      paramGraphics.drawRect(i - 1, m - 1, j + 2, k + 2);
    } 
    paramInt2 += 2;
    this.n.a(paramGraphics, this.i.b, this.j[0] + paramInt1, paramInt2, 0);
    this.n.a(paramGraphics, this.l, this.j[1] + paramInt1, paramInt2, 0);
    this.n.a(paramGraphics, this.i.d, this.j[2] + paramInt1, paramInt2, 0);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\fy.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */