import javax.microedition.lcdui.Graphics;

public final class iu extends im {
  private static byte[][] s = new byte[][] { { -1 }, { 
        0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 
        4, 5, 5, 6, 6, 6 } };
  
  private lp[] t;
  
  private int u;
  
  private int v = 0;
  
  public iu() {
    mp.a().a(1004);
    a((mp.a()).o, 7);
    a(s);
    this.t = new lp[6];
    for (byte b = 0; b < this.t.length; b++)
      this.t[b] = new lp(0); 
    this.r = false;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    this.r = true;
    if (paramInt3 >= v.t / 2) {
      c(0);
      j(40);
      b(paramInt3 + 20, paramInt4);
      c(this.h - this.o - 20, paramInt4);
      this.u = paramInt3;
    } else {
      c(2);
      j(36);
      b(paramInt3 - 20, paramInt4);
      c(this.h + this.o + 20, paramInt4);
      this.u = paramInt3;
    } 
    f(this.h);
    this.v = 1;
    d(1);
  }
  
  public final void k() {
    int i;
    for (i = 0; i < this.t.length; i++)
      this.t[i].i(); 
    if (this.e == 1)
      if (this.v == 0) {
        if (j()) {
          this.v++;
          f(this.h);
          a(-1);
        } 
      } else {
        if (this.g == (s[1]).length - 5) {
          i = o() - 10;
          for (byte b = 0; b < 3; b++) {
            this.t[b << 1].b(this.u - 10 + cv.a() % 5, i + cv.a() % 10, cv.a(6));
            this.t[(b << 1) + 1].b(this.u + 10 + cv.a() % 5, i + cv.a() % 10, cv.a(6));
            i -= 25;
          } 
        } 
        if (j())
          d(0); 
      }  
    if (this.e == 0) {
      i = 0;
      for (byte b = 0; b < this.t.length; b++) {
        if (this.t[b].m()) {
          i = 1;
          break;
        } 
      } 
      if (i == 0)
        this.r = false; 
    } 
  }
  
  public final void a(Graphics paramGraphics) {
    for (byte b = 0; b < this.t.length; b++)
      this.t[b].a(paramGraphics); 
    super.a(paramGraphics);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\iu.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */