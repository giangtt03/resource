import javax.microedition.lcdui.Graphics;

public final class io extends at {
  private mt a;
  
  private int b;
  
  private int c = 0;
  
  private lp[] d;
  
  public io(int paramInt, mt parammt) {
    this.a = parammt;
    this.b = paramInt;
    this.r = false;
  }
  
  public final void a(int paramInt1, ni paramni, int paramInt2, int paramInt3) {
    int i = paramInt3 + 30;
    if (this.d == null) {
      this.d = new lp[6];
      for (paramInt3 = 0; paramInt3 < this.d.length; paramInt3++)
        this.d[paramInt3] = new lp(paramInt1); 
    } 
    for (paramInt3 = 0; paramInt3 < 3; paramInt3++) {
      this.d[paramInt3 << 1].b(paramInt2 - 10 + cv.a() % 5, i + cv.a() % 10, cv.a(6) + 25);
      this.d[(paramInt3 << 1) + 1].b(paramInt2 + 10 + cv.a() % 5, i + cv.a() % 10, cv.a(6) + 25);
      i -= 25;
    } 
    switch (paramInt1) {
      case 0:
        mp.a().a(1003);
        break;
      case 1:
        mp.a().a(2005);
        break;
      case 2:
        mp.a().a(4004);
        break;
    } 
    this.c = 10;
    this.r = true;
  }
  
  public final void a() {
    this.r = false;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.r)
      return; 
    for (byte b = 0; b < this.d.length; b++)
      this.d[b].a(paramGraphics, paramInt1, paramInt2); 
  }
  
  public final void i() {
    if (this.r) {
      if (this.c > 0) {
        this.c--;
        if (this.c == 0)
          this.a.a((this.b + 1) % 2, 34, 24, true); 
      } 
      for (byte b = 0; b < this.d.length; b++)
        this.d[b].i(); 
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\io.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */