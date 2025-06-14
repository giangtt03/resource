import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class lc extends as {
  private static Image s = null;
  
  private int[][] t = new int[][] { { 
        0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 
        10, 11, 12, 13, 14, -1, -1, -1 } };
  
  private static Image u = null;
  
  private static Image v = null;
  
  private as w = null;
  
  private as x = null;
  
  private as y = null;
  
  private int[][] z = new int[][] { 
      { 34, 23, 5, 5, 9, 31 }, { 34, 16, 7, 7, 5, 28 }, { 32, 13, 13, 22 }, { 13, 10, 14, 2, 20 }, { 0, 16, 7, 13, 4, 19 }, { 26, 16, 8, 12, 6, 17 }, { 0, 29, 13, 10, 6, 15 }, { 7, 16, 19, 13, 8, 11 }, { 0, 39, 19, 9, 11, 12 }, { 19, 39, 18, 6, 15, 13 }, 
      { 27, 29, 16, 7, 20, 11 }, { 13, 29, 14, 10, 25, 7 }, { 0, 0, 13, 16, 29 }, { 23, 9, 14, 30 }, { 41, 16, 4, 7, 32, 4 } };
  
  private int[][] A = new int[][] { 
      { 35, 39, 5, 5, 9, 31 }, { 27, 29, 7, 7, 5, 28 }, { 0, 16, 13, 13, 22 }, { 13, 10, 14, 2, 20 }, { 32, 7, 13, 4, 19 }, { 32, 16, 8, 12, 6, 17 }, { 0, 29, 13, 10, 6, 15 }, { 13, 16, 19, 13, 8, 11 }, { 0, 39, 19, 9, 11, 12 }, { 0, 48, 18, 6, 15, 13 }, 
      { 19, 39, 16, 7, 20, 11 }, { 13, 29, 14, 10, 25, 7 }, { 0, 0, 13, 16, 29 }, { 23, 9, 14, 30 }, { 34, 29, 4, 7, 32, 4 } };
  
  private int[][] B = new int[][] { 
      { 78, 5, 5, 9, 35 }, { 0, 85, 29, 10, 5, 29 }, { 0, 71, 38, 14, 25 }, { 0, 0, 40, 20, 2, 18 }, { 40, 34, 20, 4, 16 }, { 38, 20, 30, 17, 6, 16 }, { 35, 40, 30, 15, 6, 14 }, { 0, 56, 26, 15, 8, 13 }, { 68, 20, 20, 15, 10, 10 }, { 60, 56, 26, 13, 7, 10 }, 
      { 38, 71, 31, 13, 5, 9 }, { 0, 40, 35, 16, 4, 5 }, { 0, 20, 38, 20, 4 }, { 26, 56, 34, 15, 5, 3 }, { 74, 4, 7, 32, 8 } };
  
  private lc(int paramInt) {
    if (paramInt == 1) {
      if (s == null)
        s = f.d("/aura1"); 
      this.w = new as(s, this.z);
      this.w.h(45);
      this.w.i(50);
      this.w.a(this.t);
      this.w.d(0);
      this.w.b(2);
      return;
    } 
    if (paramInt == 2) {
      if (u == null)
        u = f.d("/aura2"); 
      this.x = new as(u, this.A);
      this.x.h(40);
      this.x.i(55);
      this.x.a(this.t);
      this.x.d(0);
      this.x.b(2);
      return;
    } 
    if (paramInt == 3) {
      if (v == null)
        v = f.d("/aura3"); 
      this.y = new as(v, this.B);
      this.y.h(88);
      this.y.i(95);
      this.y.a(this.t);
      this.y.d(0);
      this.y.b(2);
      return;
    } 
    if (paramInt == 4) {
      if (v == null)
        v = f.d("/aura3"); 
      this.y = new as(v, this.B);
      this.y.h(88);
      this.y.i(95);
      this.y.a(this.t);
      this.y.d(0);
      this.y.b(2);
      if (u == null)
        u = f.d("/aura2"); 
      this.x = new as(u, this.A);
      this.x.h(40);
      this.x.i(55);
      this.x.a(this.t);
      this.x.d(0);
      this.x.b(2);
    } 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (this.y != null)
      this.y.a(paramGraphics, paramInt1, paramInt2); 
    if (this.w != null)
      this.w.a(paramGraphics, paramInt1, paramInt2); 
    if (this.x != null)
      this.x.a(paramGraphics, paramInt1, paramInt2); 
  }
  
  public final void k() {
    if (this.y != null)
      this.y.i(); 
    if (this.w != null)
      this.w.i(); 
    if (this.x != null)
      this.x.i(); 
  }
  
  public static lc a(lh paramlh) {
    return (paramlh.c() > 0) ? new lc(paramlh.c()) : null;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\lc.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */