import javax.microedition.lcdui.Graphics;

public final class bv extends al {
  private String[] k;
  
  private int l;
  
  private int m;
  
  private String n;
  
  private int o = 0;
  
  private int p = 2;
  
  private boolean q = false;
  
  private int r = 20;
  
  private int s = 0;
  
  private int t = 6;
  
  private int u;
  
  private int v;
  
  public bv(String paramString1, String paramString2, String[] paramArrayOfString, int[] paramArrayOfint, int paramInt) {
    super(paramInt);
    this.n = paramString1;
    this.s = 1;
    if (this.s == 0) {
      this.c = 0;
      this.u = this.f = v.t;
    } else {
      this.c = 10;
      this.u = this.f = v.t - 20;
    } 
    paramString2 = paramString2;
    bv bv1;
    (bv1 = this).k = bx.a(paramString2, bv1.u - (bv1.t << 1));
    if ((bv1 = bv1).s == 0) {
      bv1.l = 0;
      bv1.m = v.u - ba.a;
    } else {
      int i = ((i = bv1.k.length) + 2) * bx.c.a();
      bv1.l = (bv1.g - ba.a - i) / 2;
      bv1.m = (bv1.g - ba.a + i) / 2 + bx.c.a();
      if (bv1.l < 0)
        bv1.l = 0; 
      if (bv1.m > v.u - ba.a)
        bv1.m = v.u - ba.a; 
    } 
    bv1.d = bv1.l;
    bv1.v = bv1.m - bv1.l;
    if (bv1.s != 0) {
      bv1.f = bv1.u;
      bv1.g = bv1.v;
    } 
    if (paramArrayOfString != null) {
      if (paramArrayOfString.length == 1) {
        a(new bd(paramArrayOfString[0], paramArrayOfint[0]));
        return;
      } 
      if (paramArrayOfString.length == 2) {
        bd bd1 = new bd(paramArrayOfString[0], paramArrayOfint[0]);
        (bv1 = this).a(bd1, true);
        bd1 = new bd(paramArrayOfString[1], paramArrayOfint[1]);
        (bv1 = this).b(bd1, true);
        return;
      } 
      bd bd = new bd(paramArrayOfString[0], paramArrayOfint[0]);
      (bv1 = this).a(bd, true);
      a(new bd(paramArrayOfString[1], paramArrayOfint[1]));
      bd = new bd(paramArrayOfString[1], paramArrayOfint[2]);
      (bv1 = this).b(bd, true);
    } 
  }
  
  public final void c(int paramInt) {
    if (paramInt == 99) {
      this.r = 20;
      if (this.o < 0) {
        this.o += this.p;
        return;
      } 
    } else if (paramInt == 98) {
      this.r = 20;
    } 
  }
  
  public final void a(int paramInt1, int paramInt2) {
    this.r = 20;
  }
  
  protected final void g() {
    if (this.r > 0)
      this.r--; 
  }
  
  public final void c(Graphics paramGraphics) {
    ag.c().a(paramGraphics, this.c, this.d, this.u, this.v);
    Graphics graphics = paramGraphics;
    bv bv1;
    (bv1 = this).t = 6;
    cw.a(graphics, cw.a);
    if (bv1.n != null && bv1.n.length() > 0) {
      bx.b.a(graphics, bv1.n, bv1.c + bv1.f / 2, bv1.l + bx.b.a() - 5, 1);
      bx.a(bx.c);
      cw.a(graphics, bv1.c + bv1.t, bv1.l + (bx.c.a() << 1) - 5, bv1.u - (bv1.t << 1), bv1.v - 2 * bx.c.a());
      bx.a(graphics, bx.c, bv1.k, bv1.c + bv1.t, bv1.l + (bx.c.a() << 1) - 5 + bv1.o + ((bv1.n.length() > 1) ? 5 : 0), bv1.u - (bv1.t << 1), bv1.v - 2 * bx.c.a() + 5 - bv1.o, 1);
    } else {
      cw.a(graphics, bv1.c + bv1.t, bv1.l + bx.c.a() - 5, bv1.u - (bv1.t << 1), bv1.v - bx.c.a());
      bx.a(graphics, bx.c, bv1.k, bv1.c + bv1.t, bv1.l + bx.c.a() - 5 + bv1.o + 5, bv1.u - (bv1.t << 1), bv1.v - bx.c.a() + 5 - bv1.o, 1);
    } 
    cw.c(graphics, cw.a);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\bv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */