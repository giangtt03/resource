import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class bw extends al {
  private au[] k;
  
  private int l;
  
  private int m;
  
  private k n;
  
  private int o;
  
  private Image p;
  
  private String q;
  
  private d r = bx.b;
  
  private int s = 2;
  
  private int t;
  
  private int u = 0;
  
  public bw(String paramString) {
    this(paramString, null);
  }
  
  public final void a(au[] paramArrayOfau) {
    this.k = paramArrayOfau;
    t();
  }
  
  private bw(String paramString, au[] paramArrayOfau) {
    super(1);
    this.r = bx.b;
    this.b = false;
    bw bw1 = this;
    try {
      bw1.p = ag.a;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
    } 
    this.n = new k(10, 41, this.f - 15, this.g - 47 + ba.a + 5);
    this.q = paramString;
    this.k = null;
    int i = this.u;
    (bw1 = this).u = i;
    if (bw1.q != null && bw1.q.length() > 0) {
      bw1.t = bw1.r.a(bw1.q);
      switch (i) {
        case 0:
          bw1.s = bw1.n.a + 2;
          break;
        case 1:
          bw1.s = bw1.n.a + bw1.n.c / 2 - bw1.t / 2;
          break;
        case 2:
          bw1.s = bw1.n.a + bw1.n.c - 2 - bw1.t;
          break;
      } 
    } 
    t();
  }
  
  private void t() {
    if (this.k == null)
      return; 
    this.o = 0;
    this.l = this.m = 0;
    for (byte b = 0; b < this.k.length; b++) {
      this.k[b].a(this.n);
      this.o += this.k[b].a() + 8;
    } 
  }
  
  public final void a(int paramInt1, int paramInt2) {
    super.a(paramInt1, paramInt2);
    if (this.l > 0) {
      int i = this.f / 2 + 2 - 5;
      int j = this.n.b - 2 - 15;
      if (paramInt1 > i && paramInt1 < i + 10 && paramInt2 > j && paramInt2 < j + 15) {
        v.c[99] = 2;
        return;
      } 
    } 
    if (this.o > this.n.d && this.o - this.l - this.n.d > 0) {
      int i = this.f / 2 + 2 - 5;
      int j = this.n.b + this.n.d + 2;
      if (paramInt1 > i && paramInt1 < i + 10 && paramInt2 > j && paramInt2 < j + 15) {
        v.c[98] = 2;
        return;
      } 
    } 
  }
  
  public final void c(int paramInt) {
    super.c(paramInt);
    if (paramInt == 99 || paramInt == 150) {
      paramInt = this.l;
      this.l -= 15;
      if (this.l < 0)
        this.l = 0; 
      if (this.l != this.m && paramInt == this.m)
        return; 
    } else if (paramInt == 98 || paramInt == 156) {
      this.l += 15;
      if (this.o - this.l < this.n.d)
        this.l = this.o - this.n.d; 
      if (this.l < 0)
        this.l = 0; 
      if (this.l != this.m);
    } 
  }
  
  protected final void g() {
    if (this.m != this.l) {
      int i;
      if (Math.abs(i = this.l - this.m) < 3) {
        this.m += i;
      } else {
        this.m += i / 2;
      } 
    } 
    if (this.k != null)
      for (byte b = 0; b < this.k.length; b++); 
  }
  
  public final void c(Graphics paramGraphics) {
    paramGraphics.setColor(v.am);
    paramGraphics.fillRect(0, 0, this.f, this.g);
    if (this.q != null) {
      this.r.a(paramGraphics, this.q, this.s, 2, 0);
      paramGraphics.setColor(16711680);
      paramGraphics.fillRect(this.s, this.r.a() + 1, this.t + 2, 2);
    } 
    if (this.k != null) {
      paramGraphics.setClip(this.n.a, this.n.b, this.n.c, this.n.d);
      int i = this.n.b - this.m;
      int j = this.n.b + this.n.d;
      k k1 = new k();
      for (byte b = 0; b < this.k.length && i <= j; b++) {
        k1.a(this.n.a, i, this.n.c, this.k[b].a());
        if (this.n.a(k1))
          this.k[b].a(paramGraphics, this.n.a, i); 
        i += this.k[b].a() + 8;
      } 
      paramGraphics.setClip(0, 0, this.f, this.g);
    } 
    try {
      if (this.p != null) {
        if (this.l > 0)
          paramGraphics.drawRegion(this.p, 0, 0, this.p.getWidth(), this.p.getHeight(), 6, this.f / 2 + 2, this.n.b - 2, 33); 
        if (this.o > this.n.d && this.o - this.l - this.n.d > 0) {
          paramGraphics.drawRegion(this.p, 0, 0, this.p.getWidth(), this.p.getHeight(), 5, this.f / 2 + 2, this.n.b + this.n.d + 2, 17);
          return;
        } 
      } 
    } catch (Throwable throwable2) {
      Throwable throwable1;
      (throwable1 = null).printStackTrace();
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\bw.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */