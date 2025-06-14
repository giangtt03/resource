import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class eu extends aq {
  public ds i;
  
  public ls j;
  
  private int l;
  
  private int m;
  
  private int n;
  
  private boolean o = true;
  
  public boolean k = false;
  
  private d p;
  
  public eu(ds paramds, int paramInt) {
    d(paramInt);
    ds ds1 = paramds;
    eu eu1;
    (eu1 = this).i = ds1;
    boolean bool1 = (ds1.e() == 2) ? true : false;
    String str = (str = (str = String.valueOf(ds1.b()) + (bool1 ? (!i.b(ds1.f()) ? (" - " + ds1.f()) : "") : "")).replace('\r', ' ')).replace('\n', ' ');
    eu1.p = bx.d;
    boolean bool2;
    if (bool2 = (ds1.g() != null && ds1.g().equals("patriot")) ? true : false)
      eu1.p = a.g; 
    eu1.j = new ls(eu1.p, str, 0, 0, 2147483647, eu1.p.a(), 1);
    if (!bool2)
      eu1.p = bx.c; 
    if (ds1.d() == 3) {
      eu1.m = -3;
    } else if (ds1.d() == 1) {
      eu1.m = -5;
    } else {
      eu1.m = 10000;
    } 
    short s = ds1.c();
    eu1.l = ((eu1 = eu1).i.c() == -13) ? -13 : ((eu1.i.e() == 2) ? s : -19);
  }
  
  public final void d(boolean paramBoolean) {
    if (paramBoolean) {
      e(40);
      this.n = 0;
      this.o = true;
    } else {
      e(22);
    } 
    if (paramBoolean || this.g != paramBoolean)
      this.c = true; 
    super.d(paramBoolean);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.c)
      return; 
    paramInt2 += d();
    paramInt1 += c() + 2;
    if (this.g)
      pc.e(paramGraphics, paramInt1 - 2, paramInt2, e(), f()); 
    paramInt2 += 3;
    boolean bool;
    if (bool = (this.g && this.j.b() > e() - 25) ? true : false) {
      cw.a(paramGraphics);
      cw.a(paramGraphics, paramInt1, paramInt2, e(), f());
    } 
    int i = paramInt2 + 4;
    try {
      this.j.a(paramGraphics, paramInt1 + 25 + (this.g ? this.n : 0), i);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
    } 
    if (bool)
      cw.b(paramGraphics); 
    i += (this.j.c() - pe.a().b(this.l)) / 2;
    int j = paramInt1 + 25;
    if (this.g) {
      i = paramInt2 + 18;
      this.p.a(paramGraphics, this.i.a(), j, i, 0);
      i += this.p.b() - pe.a().b(this.l);
    } 
    if (this.l < 0) {
      pc.d(paramGraphics, this.l, j - 2 - pc.g[Math.abs(this.l)], i, 0);
    } else {
      pe.a().a(paramGraphics, this.l, j - 2 - pe.a().a(this.l), i, 0);
    } 
    if (this.i.e() == 2 && this.m <= 0)
      pc.d(paramGraphics, this.m, paramInt1, i, 0); 
    if (this.k)
      pc.d(paramGraphics, -23, paramInt1 - 2, paramInt2 - 2, 0); 
    this.c = false;
  }
  
  public final void n() {
    if (this.g) {
      int i = e() - 4 - 25;
      if (this.j.b() > i) {
        if (this.o) {
          this.n--;
          i -= this.j.b();
          if (this.n < i) {
            this.n = i;
            this.o = false;
          } 
        } else {
          this.n++;
          if (this.n > 0) {
            this.n = 0;
            this.o = true;
          } 
        } 
        this.c = true;
      } 
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\eu.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */