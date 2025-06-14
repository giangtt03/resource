import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

final class oh extends aq implements bu {
  private k[] i;
  
  private short[][] j;
  
  private short[][] k;
  
  private Image l;
  
  private short m;
  
  private int n;
  
  private cu o;
  
  private Image p;
  
  private d q;
  
  private Image r;
  
  private og s;
  
  public oh(og paramog) {
    this.s = paramog;
    this.j = new short[][] { 
        { 183, 399 }, { 405, 311 }, { 26, 432 }, { 408, 236 }, { 206, 261 }, { 304, 220 }, { 350, 184 }, { 183, 216 }, { 80, 181 }, { 256, 119 }, 
        { 367, 116 }, { 229, 100 }, { 58, 119 }, { 16, 91 }, { 34, 317 }, { 402, 170 }, { 166, 59 } };
    this.k = new short[][] { 
        { 149, 363 }, { 389, 345 }, { 15, 408 }, { 411, 266 }, { 243, 289 }, { 305, 247 }, { 341, 161 }, { 214, 192 }, { 77, 203 }, { 284, 150 }, 
        { 374, 90 }, { 245, 90 }, { 84, 93 }, { 23, 65 }, { 30, 297 }, { 414, 155 }, { 190, 39 } };
    this.m = 5;
    this.n = -1987;
    ct.b("WorldrMap");
    this.i = new k[17];
    this.i[0] = new k(146, 342, 61, 48);
    this.i[1] = new k(381, 319, 62, 48);
    this.i[2] = new k(9, 386, 64, 48);
    this.i[3] = new k(407, 245, 65, 47);
    this.i[4] = new k(236, 271, 64, 44);
    this.i[5] = new k(300, 227, 63, 44);
    this.i[6] = new k(332, 142, 62, 48);
    this.i[7] = new k(173, 169, 64, 48);
    this.i[8] = new k(68, 185, 62, 48);
    this.i[9] = new k(242, 128, 62, 48);
    this.i[10] = new k(369, 70, 64, 44);
    this.i[11] = new k(229, 74, 63, 45);
    this.i[12] = new k(84, 73, 63, 47);
    this.i[13] = new k(18, 38, 62, 48);
    this.i[14] = new k(34, 271, 52, 46);
    this.i[15] = new k(391, 131, 66, 44);
    this.i[16] = new k(157, 27, 71, 26);
    this.o = new cu((this.i[0]).a + (this.i[0]).c / 2, (this.i[0]).b + (this.i[0]).d / 2);
    this.q = new if(new int[] { 16711680, 16777215 });
    this.l = f.d("/m/m");
    this.p = pc.e;
    this.r = f.d("/m/lock");
  }
  
  public final boolean f(int paramInt) {
    int i;
    switch (paramInt) {
      case 96:
      case 97:
      case 98:
      case 99:
        if (this.n == paramInt) {
          if (this.m < 50)
            this.m = (short)(this.m + 2); 
        } else {
          this.m = 25;
          this.n = paramInt;
        } 
        if (paramInt == 99) {
          if (this.o.b > 0)
            this.o.b -= this.m; 
        } else if (paramInt == 98) {
          if (this.o.b < this.l.getHeight())
            this.o.b += this.m; 
        } else if (paramInt == 97) {
          if (this.o.a > 0)
            this.o.a -= this.m; 
        } else if (paramInt == 96 && this.o.a < this.l.getWidth()) {
          this.o.a += this.m;
        } 
        if (this.o.a < 0) {
          this.o.a = 0;
        } else if (this.o.a > this.l.getWidth() - this.p.getWidth()) {
          this.o.a = this.l.getWidth() - this.p.getWidth();
        } 
        if (this.o.b < 0) {
          this.o.b = 0;
        } else if (this.o.b > this.l.getHeight() - this.p.getHeight()) {
          this.o.b = this.l.getHeight() - this.p.getHeight();
        } 
        if ((i = q()) >= 0)
          if (go.x == i) {
            if (paramInt == 99) {
              this.o.b = (this.i[i]).b - 1;
            } else if (paramInt == 98) {
              this.o.b = (this.i[i]).b + (this.i[i]).d + 1;
            } else if (paramInt == 97) {
              this.o.a = (this.i[i]).a - 1;
            } else if (paramInt == 96) {
              this.o.a = (this.i[i]).a + (this.i[i]).c + 1;
            } 
            i = -1;
          } else {
            this.o.a = (this.i[i]).a + (this.i[i]).c / 2;
            this.o.b = (this.i[i]).b + (this.i[i]).d / 2;
          }  
        if (i >= 0 && this.s.a != null) {
          bd bd = new bd("Vào Thành", -1);
          og og1;
          (og1 = this.s).a(bd, true);
        } else {
          this.s.n();
        } 
        go.x = i;
        a();
        return true;
      case 95:
        if (this.s.p())
          this.s.d(-1, -1); 
        return true;
    } 
    return false;
  }
  
  final void a() {
    ay ay;
    k k1 = (ay = (ay)this.b).r();
    int i = this.o.a - k1.c / 2;
    int j = this.o.b - k1.d / 2;
    if (i < 0) {
      i = 0;
    } else if (i + k1.c > this.l.getWidth()) {
      i = this.l.getWidth() - k1.c;
    } 
    if (j < 0) {
      j = 0;
    } else if (j + k1.d > this.l.getHeight()) {
      j = this.l.getHeight() - k1.d;
    } 
    if (i != k1.a)
      ay.i(i - k1.a); 
    if (j != k1.b)
      ay.j(j - k1.b); 
  }
  
  private int q() {
    int i = this.o.a;
    int j = this.o.b;
    for (byte b = 0; b < this.i.length; b++) {
      int m = (this.i[b]).c;
      int n = (this.i[b]).d;
      if (i >= (this.i[b]).a && i <= (this.i[b]).a + m && j >= (this.i[b]).b && j <= (this.i[b]).b + n)
        return b; 
    } 
    return -1;
  }
  
  public final boolean g(int paramInt) {
    this.n = -1987;
    this.m = 25;
    return false;
  }
  
  public final boolean c(int paramInt1, int paramInt2) {
    this.o.a = paramInt1;
    this.o.b = paramInt2;
    if ((paramInt1 = q()) >= 0 && this.s.a != null) {
      bd bd = new bd("Vào Thành", -1);
      og og1;
      (og1 = this.s).a(bd, true);
      if (paramInt1 == go.x) {
        go.x = paramInt1;
        og.a(this.s);
      } 
    } else {
      this.s.n();
    } 
    go.x = paramInt1;
    return true;
  }
  
  public final g v() {
    return new g(this.l.getWidth(), this.l.getHeight());
  }
  
  public final int w() {
    return this.m;
  }
  
  public final void n() {
    this.c = true;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (v.t > e() || v.u - ba.a > f()) {
      paramGraphics.setColor(0);
      paramGraphics.fillRect(0, 0, v.t, v.u - ba.a);
    } 
    oh oh1;
    k k1 = ((ay)(oh1 = this).b).q();
    cw.a(paramGraphics);
    cw.a(paramGraphics, c(), d(), e(), f());
    paramGraphics.drawImage(this.l, c() - k1.a, d() - k1.b, 0);
    if (this.s.a != null)
      for (paramInt2 = 0; paramInt2 < this.s.a.length; paramInt2++) {
        if (paramInt2 < this.k.length && (this.s.a[paramInt2]).h)
          paramGraphics.drawImage(this.r, this.k[paramInt2][0] - k1.a, this.k[paramInt2][1] - k1.b, 20); 
      }  
    for (paramInt2 = 0; paramInt2 < this.j.length; paramInt2++) {
      d d1 = bx.c;
      if (paramInt2 == go.x)
        d1 = this.q; 
      d1.a(paramGraphics, og.b(this.s)[paramInt2], this.j[paramInt2][0] - k1.a, this.j[paramInt2][1] - k1.b, 0);
    } 
    paramInt2 = this.o.a - k1.a;
    int i = this.o.b - k1.b;
    if (go.x >= 0) {
      paramGraphics.drawImage(this.p, paramInt2, i, 0);
    } else {
      paramGraphics.drawImage(pc.f, paramInt2, i, 0);
    } 
    cw.b(paramGraphics);
  }
  
  static Image a(oh paramoh) {
    return paramoh.l;
  }
  
  static void a(oh paramoh, int paramInt1, int paramInt2) {
    paramInt2 = paramInt2;
    paramInt1 = paramInt1;
    paramoh = paramoh;
    byte b;
    for (b = 0; b < paramoh.i.length; b++) {
      (paramoh.i[b]).a += paramInt1;
      (paramoh.i[b]).b += paramInt2;
    } 
    for (b = 0; b < paramoh.j.length; b++) {
      paramoh.j[b][0] = (short)(paramoh.j[b][0] + paramInt1);
      paramoh.j[b][1] = (short)(paramoh.j[b][1] + paramInt2);
    } 
    for (b = 0; b < paramoh.k.length; b++) {
      paramoh.k[b][0] = (short)(paramoh.k[b][0] + paramInt1);
      paramoh.k[b][1] = (short)(paramoh.k[b][1] + paramInt2);
    } 
  }
  
  static k[] b(oh paramoh) {
    return paramoh.i;
  }
  
  static void a(oh paramoh, cu paramcu) {
    paramoh.o = paramcu;
  }
  
  static void c(oh paramoh) {
    (paramoh = paramoh).p = null;
    paramoh.r = null;
    paramoh.l = null;
    paramoh.i = null;
    paramoh.k = null;
    System.gc();
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\oh.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */