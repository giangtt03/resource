import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class gg extends aq {
  private Object[] i;
  
  private int j;
  
  private String k;
  
  private int l;
  
  private int m;
  
  private int n;
  
  private d o = bx.d;
  
  private Image p;
  
  private bg q;
  
  private int r;
  
  public final void a(d paramd) {
    this.o = paramd;
  }
  
  public gg(String paramString) {
    this.k = paramString;
    this.p = f.d("/info/increase");
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.a(paramInt1, paramInt2, paramInt3, paramInt4);
    this.l = paramInt1 + paramInt3 / 2;
    this.m = this.l;
  }
  
  public final int a() {
    return this.j;
  }
  
  public final Object q() {
    return this.i[this.j];
  }
  
  public final void a(Object[] paramArrayOfObject) {
    this.i = paramArrayOfObject;
    this.j = 0;
  }
  
  private void i(int paramInt) {
    this.j = paramInt;
    if (this.q != null) {
      gg gg1;
      this.q.a(b(), (gg1 = this).r, this);
    } 
  }
  
  public final boolean f(int paramInt) {
    if (this.i.length > 1) {
      if (paramInt == 97) {
        i((this.j - 1 + this.i.length) % this.i.length);
        this.m = c() - this.o.a(this.i[this.j].toString()) / 2;
        return true;
      } 
      if (paramInt == 96) {
        i((this.j + 1) % this.i.length);
        this.m = c() + e() + this.o.a(this.i[this.j].toString()) / 2;
        return true;
      } 
    } 
    return false;
  }
  
  public final boolean c(int paramInt1, int paramInt2) {
    if (paramInt1 >= c() && paramInt1 < c() + e() && paramInt2 >= d() && paramInt2 <= d() + f()) {
      if (this.g)
        if (paramInt1 <= c() + e() / 2) {
          f(97);
        } else {
          f(96);
        }  
      return true;
    } 
    return false;
  }
  
  public final void d(boolean paramBoolean) {
    super.d(paramBoolean);
    if (!paramBoolean) {
      this.m = this.l;
      return;
    } 
    this.n = 0;
  }
  
  public final void n() {
    if (this.g) {
      if (this.m != this.l) {
        int i;
        if (Math.abs(i = this.l - this.m) > 3)
          i /= 3; 
        this.m += i;
      } 
      if (this.n < 6) {
        this.n++;
        return;
      } 
      this.n = 0;
    } 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    int i = this.m + paramInt1;
    paramInt1 += c();
    paramInt2 += d();
    pc.a(paramGraphics, paramInt1, paramInt2, e(), f(), m());
    cw.a(paramGraphics);
    if (this.i != null) {
      cw.a(paramGraphics, paramInt1, paramInt2, e(), f());
      this.o.a(paramGraphics, this.i[this.j].toString(), i, paramInt2 + (f() - this.o.a() >> 1) + 1, 1);
      cw.b(paramGraphics);
    } 
    if (this.k != null) {
      bx.d.c(true);
      bx.d.a(paramGraphics, this.k, paramInt1, paramInt2 - bx.d.a(), 0);
      bx.d.c();
    } 
    if (this.g && this.i != null && this.i.length > 1) {
      paramInt2 += f() - this.p.getWidth() >> 1;
      paramGraphics.drawRegion(this.p, 0, 0, this.p.getHeight(), this.p.getWidth(), 4, paramInt1 + 4 - this.n / 2, paramInt2, 20);
      paramGraphics.drawRegion(this.p, 0, 0, this.p.getHeight(), this.p.getWidth(), 7, paramInt1 + e() - 4 + this.n / 2, paramInt2, 24);
    } 
  }
  
  public final void a(bg parambg) {
    this.q = parambg;
  }
  
  public final void h(int paramInt) {
    this.r = paramInt;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\gg.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */