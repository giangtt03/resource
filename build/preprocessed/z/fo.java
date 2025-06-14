import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class fo extends aq {
  private static final int i = ly.c("99+") + 1;
  
  private int[] j = new int[6];
  
  private static Image k;
  
  private int l = -1;
  
  private int[] m;
  
  private lo n;
  
  public static void a() {
    if (k == null)
      k = f.d("/mecommands"); 
  }
  
  public static void q() {
    k = null;
  }
  
  public fo() {
    for (byte b = 0; b < this.j.length; b++)
      this.j[b] = -1; 
    e(12);
  }
  
  public final int r() {
    return (this.l < 0) ? 0 : this.m[this.l];
  }
  
  public final void h(int paramInt) {
    d(paramInt, 0);
  }
  
  public final void d(int paramInt1, int paramInt2) {
    this.j[paramInt1] = paramInt2;
    if (this.l == -1)
      this.l = paramInt1; 
  }
  
  public final void a(lo paramlo) {
    this.n = paramlo;
    boolean bool = false;
    fo fo1;
    (fo1 = this).d(bool, 0);
  }
  
  public final void s() {
    int i = 0;
    this.m = new int[this.j.length];
    for (byte b = 0; b < this.j.length; b++) {
      if (this.j[b] >= 0) {
        this.m[b] = i;
        i += true;
        if (this.j[b] > 0)
          if (this.j[b] > 99) {
            i += i;
          } else {
            i += ly.b(this.j[b]) + 2;
          }  
      } 
    } 
    d(i);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (k == null)
      return; 
    paramInt1 += c();
    paramInt2 += d();
    for (byte b = 0; b < this.j.length; b++) {
      if (this.j[b] >= 0) {
        int i = paramInt1 + this.m[b];
        if (b != 0) {
          cw.a(paramGraphics, k, (b - 1) * 15, 0, 15, 12, i, paramInt2, 0);
        } else if (this.n != null) {
          this.n.a(paramGraphics, i, paramInt2 - 4);
        } 
        if (this.j[b] > 0) {
          i += 17;
          ly.a(paramGraphics, (new StringBuffer(String.valueOf(this.j[b]))).toString(), i, paramInt2 + 2);
        } 
      } 
    } 
  }
  
  public final int t() {
    return this.l;
  }
  
  public final void i(int paramInt) {
    if (this.j[paramInt] >= 0)
      this.l = paramInt; 
  }
  
  public final boolean c(int paramInt1, int paramInt2) {
    if (h().b(paramInt1, paramInt2)) {
      paramInt1 -= c();
      for (paramInt2 = this.j.length - 1; paramInt2 >= 0; paramInt2--) {
        if (this.j[paramInt2] >= 0 && paramInt1 >= this.m[paramInt2]) {
          this.l = paramInt2;
          return true;
        } 
      } 
    } 
    return false;
  }
  
  public final boolean f(int paramInt) {
    if (this.l < 0)
      return false; 
    switch (paramInt) {
      case 97:
        for (paramInt = this.l - 1; paramInt >= 0; paramInt--) {
          if (this.j[paramInt] >= 0) {
            this.l = paramInt;
            return true;
          } 
        } 
        break;
      case 96:
        for (paramInt = this.l + 1; paramInt < this.j.length; paramInt++) {
          if (this.j[paramInt] >= 0) {
            this.l = paramInt;
            return true;
          } 
        } 
        break;
    } 
    return false;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\fo.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */