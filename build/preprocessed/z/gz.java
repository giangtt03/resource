import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class gz extends al implements b, bf {
  private lh k;
  
  private Image[] l;
  
  private Image[] m;
  
  private k[] n;
  
  private int o;
  
  private int p;
  
  private int[] q;
  
  private int[][] r;
  
  private int s = 0;
  
  private String[][] t;
  
  private String u;
  
  private lv[] v;
  
  private bf w;
  
  private int x = 6;
  
  private boolean y = false;
  
  public gz(lh paramlh) {
    super(1);
    b(241205);
    a(new ba());
    a(this);
    this.k = paramlh;
    this.v = (lv[])g.a((Object[])paramlh.E, this);
    gz gz2;
    (gz2 = this).l = new Image[gz2.v.length];
    gz2.m = new Image[gz2.v.length];
    byte b1;
    for (b1 = 0; b1 < gz2.l.length; b1++) {
      int i2 = (gz2.v[b1]).a * 1000;
      int i1 = i2;
      pa pa;
      byte[] arrayOfByte = (pa = pa.a()).b(i1, false);
      gz2.l[b1] = Image.createImage(arrayOfByte, 0, arrayOfByte.length);
      h.a(arrayOfByte);
      gz2.m[b1] = Image.createImage(arrayOfByte, 0, arrayOfByte.length);
    } 
    gz2.o = gz2.l[0].getWidth();
    gz2.p = gz2.l[0].getHeight();
    int i = this.k.E.length;
    this.t = new String[i][0];
    this.n = new k[i];
    b1 = 3;
    if (a.k == 1) {
      if (v.t >= 320)
        this.f = 300; 
      b1 = 5;
    } else if (v.t >= 240) {
      this.f = 220;
    } 
    int m = (this.f - b1 * this.o) / 3 / (b1 - 1);
    b1 = (b1 > i) ? i : b1;
    int j = i / b1 + ((i % b1 != 0) ? 1 : 0);
    int n = this.o * b1 + m * (b1 - 1);
    n = (this.f - n) / 2;
    byte b3;
    for (b3 = 0; b3 < j; b3++) {
      int i1;
      for (byte b4 = 0; b4 < b1 && (i1 = b3 * b1 + b4) < i; b4++) {
        this.n[i1] = new k((m + this.o) * b4 + n, (5 + this.p) * b3 + 10, this.o, this.p);
        byte b5 = -1;
        for (byte b6 = 0; b6 < go.r.length; b6++) {
          lv lv1;
          if ((go.r[b6]).a == (lv1 = this.v[i1]).a) {
            b5 = b6;
            break;
          } 
        } 
        if (b5 >= 0)
          this.t[i1] = bx.a(((go.r[b5]).c[(this.v[i1]).f - 1]).e, this.f - 10 - 10); 
      } 
    } 
    m = this.n.length;
    j = j;
    b1 = b1;
    gz gz1;
    (gz1 = this).r = new int[m][4];
    for (byte b2 = 0; b2 < j; b2++) {
      for (b3 = 0; b3 < b1 && (n = b2 * b1 + b3) < m; b3++) {
        (new int[4])[0] = (n < m - 1) ? (n + 1) : -1;
        (new int[4])[1] = (n > 0) ? (n - 1) : -1;
        (new int[4])[2] = (b2 < j - 1) ? ((n + b1 >= m) ? (m - 1) : (n + b1)) : -1;
        (new int[4])[3] = (b2 > 0) ? (n - b1) : -1;
        gz1.r[n] = new int[4];
      } 
    } 
    this.q = new int[] { 10, (this.n[this.n.length - 1]).b + (this.n[this.n.length - 1]).d + 10 };
    this.g = this.q[1] + 10 + 5 + bx.d.a() * this.x;
    this.c = (v.t - this.f) / 2;
    this.d = (v.u - this.g - ba.a) / 2;
    e(this.s);
    bd bd = new bd("Đóng", 0);
    gz gz3;
    (gz3 = this).b(bd, true);
    c(true);
    b(true);
  }
  
  public final void b(bf parambf) {
    this.w = parambf;
    this.s = 0;
    e(this.s);
    ag.b().a(this, false);
  }
  
  public final void c(Graphics paramGraphics) {
    pc.d(paramGraphics, this.c, this.d, this.f, this.g, v.aj);
    int i;
    for (i = 0; i < this.n.length; i++) {
      Image image;
      paramGraphics.fillRect((this.n[i]).a + this.c, (this.n[i]).b + this.d, (this.n[i]).c, (this.n[i]).d);
      if (this.k.u >= (this.v[i]).e) {
        image = this.l[i];
      } else {
        image = this.m[i];
      } 
      paramGraphics.drawImage(image, (this.n[i]).a + this.c, (this.n[i]).b + this.d, 0);
    } 
    pc.a(paramGraphics, this.q[0] + this.c, this.q[1] + this.d, this.f - 10 - 10);
    i = this.q[1] + this.d + 5;
    if (this.u != null) {
      bx.d.c(true);
      bx.d.a(paramGraphics, this.u, this.q[0] + this.c, i, 0);
      bx.d.c(false);
    } 
    if (this.t[this.s] != null) {
      i += bx.d.a() + 2;
      bx.a(paramGraphics, bx.c, this.t[this.s], this.q[0] + this.c, i, this.f, this.g, 0);
    } 
    pc.e(paramGraphics, (this.n[this.s]).a - 4 + this.c, (this.n[this.s]).b - 4 + this.d, (this.n[this.s]).c + 8, (this.n[this.s]).d + 8, 1);
  }
  
  public final void d(int paramInt1, int paramInt2) {
    switch (paramInt2) {
      case 0:
        ag.b().a(h(), false);
        return;
    } 
    gz gz1;
    if ((gz1 = this).k.u >= (gz1.v[gz1.s]).e) {
      if (gz1.w != null)
        gz1.w.d((gz1.v[gz1.s]).a, 999999); 
      ag.b().a(gz1.h(), false);
    } 
  }
  
  public final void c(int paramInt) {
    gz gz1;
    int i;
    switch (paramInt) {
      case 96:
      case 97:
      case 98:
      case 99:
        i = paramInt - 96;
        gz1 = this;
        if (i >= 0) {
          gz1.s = (gz1.r[gz1.s][i] >= 0) ? gz1.r[gz1.s][i] : gz1.s;
          gz1.e(gz1.s);
        } 
        break;
    } 
  }
  
  public final void a(int paramInt1, int paramInt2) {
    paramInt1 -= this.c;
    paramInt2 -= this.d;
    for (byte b1 = 0; b1 < this.v.length; b1++) {
      if (this.n[b1].a(paramInt1, paramInt2)) {
        if (this.s != b1) {
          this.s = b1;
          e(this.s);
          return;
        } 
        d(-1, 1);
        return;
      } 
    } 
  }
  
  private void e(int paramInt) {
    byte b1 = 0;
    for (byte b2 = 0; b2 < go.r.length; b2++) {
      if ((go.r[b2]).a == (this.v[paramInt]).a) {
        b1 = b2;
        break;
      } 
    } 
    this.u = (go.r[b1]).b;
    if (((go.r[b1]).c[0]).e != null)
      if ((this.t[paramInt]).length > this.x) {
        this.g = ((this.t[paramInt]).length - this.x) * bx.d.a();
        this.d = (v.u - this.g - ba.a) / 2;
        this.y = true;
      } else if (this.y) {
        this.y = false;
        this.g = this.q[1] + 10 + 5 + bx.d.a() * this.x;
        this.d = (v.u - this.g - ba.a) / 2;
      }  
    if (this.k.u >= (this.v[paramInt]).e) {
      bd bd = new bd("Dùng", 1);
      gz gz2;
      (gz2 = this).a(bd, true);
      a(new bd("", 1));
      return;
    } 
    az az = null;
    gz gz1;
    (gz1 = this).a(az, true);
    a((az)null);
  }
  
  public final int a(Object paramObject1, Object paramObject2) {
    if (paramObject1 instanceof lv) {
      paramObject1 = paramObject1;
      paramObject2 = paramObject2;
      return ((lv)paramObject1).e - ((lv)paramObject2).e;
    } 
    paramObject1 = paramObject1;
    paramObject2 = paramObject2;
    return ((lw)paramObject1).a - ((lw)paramObject2).a;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\gz.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */