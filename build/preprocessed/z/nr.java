import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class nr extends as {
  private as s;
  
  private as t;
  
  private final int[][] u = new int[][] { { 0, 1 }, { 2, 3 }, { 3, 3, 3, 3 } };
  
  private Image v;
  
  private int w;
  
  private nr(int paramInt) {
    int i = paramInt;
    i = i;
    pa pa;
    nr nr2;
    (nr2 = this).v = (pa = pa.a()).a(i, false);
    this.w = paramInt;
    nr nr1;
    (nr1 = this).s = new as(nr1.v, 4);
    nr1.s.a(nr1.u);
    nr1.s.d(0);
    nr1.s.b(8);
    nr1.t = new as(nr1.v, 4);
    nr1.t.a(nr1.u);
    nr1.t.d(0);
    nr1.t.c(2);
    nr1.t.b(8);
  }
  
  public final void d(int paramInt) {
    this.s.d(paramInt);
    this.s.a(0);
    this.t.a(0);
    switch (paramInt) {
      case 2:
        this.s.b(2);
        this.t.b(2);
        return;
    } 
    this.s.b(8);
    this.t.b(8);
  }
  
  public final void c(int paramInt) {
    this.s.c(paramInt);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    int i;
    if (this.w == 130000) {
      paramInt2 -= 16;
    } else {
      paramInt2 = paramInt2;
    } 
    if (this.s.g() == 0) {
      i = paramInt1 + 20;
      if (this.s.h() == 2)
        if (this.s.f() == 0 || this.s.f() == 3) {
          paramInt2 -= 5;
          i = paramInt1 + 25;
        } else {
          paramInt2 -= 5;
          i = paramInt1 + 20;
        }  
    } else if (this.s.h() == 1) {
      i = paramInt1 - 30;
    } else if (this.s.h() == 2) {
      if (this.s.f() == 0 || this.s.f() == 3) {
        paramInt2 -= 5;
        i = paramInt1 - 33;
      } else {
        paramInt2 -= 5;
        i = paramInt1 - 29;
      } 
    } else {
      i = paramInt1 + 5;
    } 
    if (this.s.h() == 0) {
      this.s.c(0);
      if (this.t != null)
        this.t.a(paramGraphics, i - this.t.p() / 2, paramInt2); 
    } 
    if (this.s != null)
      this.s.a(paramGraphics, i, paramInt2); 
  }
  
  public final void k() {
    if (this.s != null)
      this.s.i(); 
    if (this.t != null)
      this.t.i(); 
  }
  
  public static nr a(lh paramlh) {
    return (paramlh.b() != null) ? new nr((paramlh.b()).n) : null;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\nr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */