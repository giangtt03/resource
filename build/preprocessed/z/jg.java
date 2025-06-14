import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class jg extends im {
  private int[] s;
  
  private int[] t;
  
  private int u;
  
  private Image[] v;
  
  private int w;
  
  private int x;
  
  private int y;
  
  private int z;
  
  private int A;
  
  private int B;
  
  public jg() {
    mp.a().a(2000);
    a((mp.a()).u, 2);
    this.v = (mp.a()).v;
    this.A = this.v[0].getWidth() >> 1;
    this.B = this.v[1].getWidth() >> 1;
    a(new byte[][] { { 0, 0, 1, 1 } });
    this.q = 3;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    this.u = 1;
    this.r = true;
    this.w = paramInt5;
    this.x = 5;
  }
  
  public final void a(int[] paramArrayOfint1, int[] paramArrayOfint2) {
    this.s = paramArrayOfint1;
    this.t = paramArrayOfint2;
  }
  
  public final void k() {
    if (this.x <= 0) {
      if (this.u < this.s.length)
        this.u++; 
      this.x = 5;
    } else {
      this.x--;
    } 
    if (this.w > 0) {
      this.w--;
      if (this.w == 0)
        this.r = false; 
    } 
    if (this.z > 0) {
      this.z--;
      return;
    } 
    this.z = 1;
    if (this.y == 0) {
      this.y = 1;
      return;
    } 
    this.y = 0;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.r)
      return; 
    for (paramInt1 = 0; paramInt1 < this.u; paramInt1++)
      super.a(paramGraphics, this.s[paramInt1], this.t[paramInt1]); 
    paramInt1 = this.u - 1;
    paramInt2 = 0;
    while (paramInt2 < paramInt1) {
      int m = this.t[paramInt2 + 1];
      int k = this.s[paramInt2 + 1];
      int j = this.t[paramInt2];
      int i = this.s[paramInt2];
      Graphics graphics = paramGraphics;
      jg jg1 = this;
      i = i;
      j = j;
      int n = 0;
      int i1 = 0;
      boolean bool1 = true;
      boolean bool2 = true;
      while (true) {
        if (bool1) {
          if (bool1 = (i > k) ? true : false) {
            n = i - 28;
          } else {
            n = i + 28;
          } 
          if (!(bool1 = (bool1 == ((n > k) ? true : false)) ? true : false))
            n = k; 
        } 
        if (bool2) {
          if (bool2 = (j > m) ? true : false) {
            i1 = j - 28;
          } else {
            i1 = j + 28;
          } 
          if (!(bool2 = (bool2 == ((i1 > m) ? true : false)) ? true : false))
            i1 = m; 
        } 
        if (i < n) {
          if (j < i1) {
            cw.a(graphics, jg1.v[0], jg1.A * jg1.y, 0, jg1.A, jg1.v[0].getHeight(), i, j, 20);
          } else if (j > i1) {
            graphics.drawRegion(jg1.v[0], jg1.A * jg1.y, 0, jg1.A, jg1.v[0].getHeight(), 2, i, i1, 20);
          } else {
            cw.a(graphics, jg1.v[1], jg1.B * jg1.y, 0, jg1.B, jg1.v[1].getHeight(), i, j, 6);
          } 
        } else if (i > n) {
          if (j < i1) {
            graphics.drawRegion(jg1.v[0], jg1.A * jg1.y, 0, jg1.A, jg1.v[0].getHeight(), 2, n, j, 20);
          } else if (j > i1) {
            cw.a(graphics, jg1.v[0], jg1.A * jg1.y, 0, jg1.A, jg1.v[0].getHeight(), n, i1, 20);
          } else {
            cw.a(graphics, jg1.v[1], jg1.B * jg1.y, 0, jg1.B, jg1.v[1].getHeight(), n, i1, 6);
          } 
        } else if (j < i1) {
          graphics.drawRegion(jg1.v[1], jg1.B * jg1.y, 0, jg1.B, jg1.v[1].getHeight(), 5, i, j, 17);
        } else if (j > i1) {
          graphics.drawRegion(jg1.v[1], jg1.B * jg1.y, 0, jg1.B, jg1.v[1].getHeight(), 5, i, i1, 17);
        } 
        i = n;
        j = i1;
        if (!bool1 && !bool2)
          paramInt2++; 
      } 
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\jg.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */