import javax.microedition.lcdui.Graphics;

public final class fr extends aq {
  private int i = 0;
  
  private aq j;
  
  private int k = 0;
  
  private ls l;
  
  private d m = bx.d;
  
  private long n;
  
  public fr(String paramString, aq paramaq, int paramInt) {
    d(v.t - 20);
    this.j = paramaq;
    this.i = 0;
    String str = paramString;
    fr fr1;
    (fr1 = this).l = new ls(fr1.m, str, 10, 10, fr1.e() - 10 - 10, fr1.m.a(), 2);
    fr1.e(fr1.l.c() + 10 + 10);
    fr1.k = (fr1.l.c() / (fr1.m.a() + 2) + 1) * 3000;
    this.e = false;
  }
  
  public final void a() {
    a(true);
    this.n = System.currentTimeMillis();
  }
  
  public final void n() {
    if (this.e && System.currentTimeMillis() - this.n >= this.k) {
      fr fr1;
      (fr1 = this).a(false);
    } 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (this.e) {
      paramInt1 += this.j.c() + this.j.e() / 2 - e() / 2;
      paramInt2 += this.j.d();
      if (this.i == 0) {
        paramInt2 -= f() + 8;
      } else {
        paramInt2 += f() - 2;
      } 
      if (paramInt1 < 0)
        paramInt1 = 0; 
      cw.a(paramGraphics, paramInt1, paramInt2, e(), f(), paramInt1 + e() / 2, (this.i != 0), 13288681, 5915121);
      this.l.a(paramGraphics, paramInt1, paramInt2);
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\fr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */