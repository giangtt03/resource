import javax.microedition.lcdui.Graphics;

public class iv extends im {
  private static int[][] t = new int[][] { { 138, 26, 19, 56, 24 }, { 138, 19, 57, 27, 41, 20 }, { 0, 0, 138, 66 } };
  
  private static byte[][] u = new byte[][] { { -1 }, { 0, 0, 1, 1, 2, 2, 2 } };
  
  protected lp[] s;
  
  private int v;
  
  private int w;
  
  private int x = 0;
  
  public iv() {
    mp.a().a(1005);
    a((mp.a()).p, t);
    a(u);
    this.o = 155;
    this.p = 66;
    this.s = new lp[6];
    for (byte b = 0; b < this.s.length; b++)
      this.s[b] = new lp(0); 
    this.r = false;
    a(false);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    paramInt1 -= 60;
    if (paramInt1 < paramInt3) {
      c(paramInt1, paramInt2);
      c(0);
      j(6);
      this.h = paramInt3;
    } else {
      this.h = paramInt3 - 50;
      c(paramInt1, paramInt2);
      c(2);
      j(6);
    } 
    this.v = paramInt3;
    this.j = 0;
    this.x = 0;
    if (paramInt5 > 0) {
      this.w = paramInt5;
      d(0);
    } else {
      d(1);
    } 
    d(1);
    this.r = true;
  }
  
  public final void k() {
    int i;
    for (i = 0; i < this.s.length; i++)
      this.s[i].i(); 
    if (this.e == 1) {
      this.x++;
      this.j += this.x;
      if (e(this.h, this.j)) {
        i = o() + 30;
        for (byte b = 0; b < 3; b++) {
          this.s[b << 1].b(this.v - 10 + cv.a() % 5, i + cv.a() % 10, cv.a(6));
          this.s[(b << 1) + 1].b(this.v + 10 + cv.a() % 5, i + cv.a() % 10, cv.a(6));
          i -= 25;
        } 
        d(0);
      } 
    } 
    if (this.e == 0) {
      if (this.w > 0) {
        this.w--;
        if (this.w == 0)
          d(1); 
        return;
      } 
      i = 0;
      for (byte b = 0; b < this.s.length; b++) {
        if (this.s[b].m()) {
          i = 1;
          break;
        } 
      } 
      if (i == 0)
        this.r = false; 
    } 
  }
  
  public final void a(Graphics paramGraphics) {
    for (byte b = 0; b < this.s.length; b++)
      this.s[b].a(paramGraphics); 
    super.a(paramGraphics);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\iv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */