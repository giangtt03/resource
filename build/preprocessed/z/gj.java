import javax.microedition.lcdui.Graphics;

public final class gj extends at {
  private String[] a;
  
  private byte b = 10;
  
  private int c = 15;
  
  private k d;
  
  private int e;
  
  private int f = 0;
  
  private int g = 0;
  
  private int h = 0;
  
  private boolean i;
  
  private gj j;
  
  private a k;
  
  private boolean s;
  
  private boolean t = false;
  
  private int u = 150;
  
  public gj(String paramString, int paramInt1, int paramInt2, int paramInt3) {
    this(paramString, paramInt1, paramInt2, (v.t >= 200) ? 200 : v.t, paramInt3, false);
  }
  
  public gj(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) {
    this.t = false;
    this.o = paramInt3;
    this.p = paramInt4;
    this.a = bx.a(paramString, paramInt3 - this.b - this.b);
    this.e = this.a.length * bx.c.a();
    this.p = (this.e + 20 >= paramInt4) ? paramInt4 : (this.e + 20);
    this.c = paramInt3 / 2;
    this.m = paramInt1 - this.c;
    this.n = paramInt2 - this.p;
    this.d = new k(this.m + this.b - 1, this.n + this.b - 1, this.o - this.b - this.b, this.p - this.b - this.b);
    this.h = 0;
    this.s = true;
  }
  
  public final void a(boolean paramBoolean) {
    this.t = true;
  }
  
  public final boolean a() {
    return this.t;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.r || !this.s)
      return; 
    cw.a(paramGraphics, this.m + paramInt1, this.n + paramInt2, this.o, this.p, this.m + this.c + paramInt1, this.t, 14808319, 152707);
    cw.a(paramGraphics);
    cw.a(paramGraphics, this.d.a + paramInt1, this.d.b + paramInt2, this.d.c, this.d.d);
    int i = this.a.length - this.h;
    bx.a(paramGraphics, bx.c, this.a, this.h, (i >= 3) ? 3 : i, this.m + this.b + paramInt1, this.n + this.b + paramInt2, this.o - this.b - this.b, this.e, 0);
    cw.b(paramGraphics);
  }
  
  public final void i() {
    if (!this.r)
      return; 
    if (this.i) {
      this.g--;
      if (this.g == this.u / 2) {
        boolean bool = false;
        gj gj1;
        (gj1 = this).s = bool;
      } 
      if (this.g <= 0) {
        b(false);
        if (this.j != null)
          this.j.b(m()); 
      } 
    } 
  }
  
  public final void a(int paramInt) {
    this.c = paramInt;
  }
  
  public final void a(k paramk) {
    this.d = paramk;
  }
  
  public final void c(boolean paramBoolean) {
    this.i = true;
    int i = this.u;
    gj gj1;
    (gj1 = this).g = i;
  }
  
  public final void a(gj paramgj) {
    this.j = paramgj;
  }
  
  public final void a(String[] paramArrayOfString) {
    if (this.k == null)
      this.k = new a(2); 
    for (byte b = 0; b < 2; b++)
      this.k.a(paramArrayOfString[b]); 
  }
  
  public final String b() {
    return (this.k != null) ? (String)this.k.b(0) : "";
  }
  
  public final void c() {
    if (this.k != null)
      this.k.a(0); 
  }
  
  public final void d(boolean paramBoolean) {
    this.s = paramBoolean;
  }
  
  public final boolean d() {
    return this.s;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\gj.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */