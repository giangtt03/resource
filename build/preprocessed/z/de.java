import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class de extends aq implements bu {
  public k i;
  
  private Image m;
  
  public Image[] j;
  
  public Image[] k;
  
  private cu n;
  
  private boolean[] o;
  
  private boolean[] p;
  
  private int[][] q;
  
  private int[] r;
  
  private int[] s;
  
  public int l;
  
  private k t;
  
  private byte[] u;
  
  private Image v = f.d("/info/increase");
  
  private Image w = f.d("/info/decrease");
  
  private boolean x = false;
  
  private lw[] y = null;
  
  private bq z;
  
  private lh A;
  
  private int B = 0;
  
  private int[][] C = new int[][] { { -1, 1, 3, 6 }, { 0, 2, 3, 6 }, { 1, -1, 4, 7 }, { 0, 4, -1, 1 }, { 3, 5, -1, 2 }, { 4, -1, -1, 8 }, { 0, 7, 1, -1 }, { 6, 8, 2, -1 }, { 7, -1, 5, -1 } };
  
  private int D;
  
  public de(int paramInt) {
    de de1;
    (de1 = this).j = new Image[go.r.length];
    de1.k = new Image[go.r.length];
    de1.m = f.d("/info/skilltree");
    for (byte b = 0; b < go.r.length; b++) {
      int i = (go.r[b]).a * 1000;
      int j = i;
      pa pa;
      byte[] arrayOfByte = (pa = pa.a()).b(j, false);
      de1.j[b] = Image.createImage(arrayOfByte, 0, arrayOfByte.length);
      h.a(arrayOfByte);
      de1.k[b] = Image.createImage(arrayOfByte, 0, arrayOfByte.length);
    } 
    this.n = new cu(28, 9);
    this.i = new k(0, 0, 218, 218);
    this.q = new int[][] { { 94, 11 }, { 94, 101 }, { 94, 152 }, { 29, 76 }, { 29, 127 }, { 29, 178 }, { 160, 76 }, { 160, 127 }, { 160, 178 } };
  }
  
  public final void a(bq parambq) {
    this.z = parambq;
  }
  
  public final k a() {
    return new k(this.q[this.l][0] - this.t.a + this.i.a, this.q[this.l][1] - this.t.b + this.i.b, 30, 30);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    try {
      int i = this.d.a + paramInt1;
      int j = this.d.b + paramInt2;
      pc.a(paramGraphics, this.i.a + paramInt1, this.i.b + paramInt2, this.i.c);
      pc.a(paramGraphics, i, j + this.d.d, this.d.c);
      cw.a(paramGraphics, cw.a);
      cw.a(paramGraphics, i, j + 4, this.d.c, this.d.d - 8);
      if (this.t == null)
        this.t = ((ay)l()).q(); 
      paramInt1 += this.i.a - this.t.a;
      paramInt2 += this.i.b - this.t.b;
      paramGraphics.drawImage(this.m, this.n.a + paramInt1, this.n.b + paramInt2, 20);
      paramGraphics.drawRegion(this.m, 0, 0, this.m.getWidth(), this.m.getHeight(), 2, this.n.a + paramInt1 + this.m.getWidth() - 1, this.n.b + paramInt2, 20);
      byte b;
      for (b = 0; b < this.q.length; b++) {
        Image image = this.k[b];
        i = this.q[b][0] + paramInt1;
        j = this.q[b][1] + paramInt2;
        if (this.o[b]) {
          d d;
          image = this.j[b];
          paramGraphics.drawImage(image, i, j, 0);
          if (this.s[b] > 0) {
            d = a.h;
          } else {
            d = bx.c;
          } 
          d.a(paramGraphics, (new StringBuffer(String.valueOf(this.r[b]))).toString(), i + image.getWidth(), j + image.getHeight() - bx.c.a(), 2);
        } else {
          paramGraphics.drawImage(image, i, j, 0);
        } 
      } 
      for (b = 0; b < this.o.length; b++) {
        if (this.p[b])
          pc.b(paramGraphics, this.q[b][0] + paramInt1 + 30 - 6, this.q[b][1] + paramInt2 + 1, 5, 5, 16777215, 16069679); 
      } 
      if (this.l < 0)
        return; 
      i = this.q[this.l][0] + paramInt1;
      j = this.q[this.l][1] + paramInt2;
      pc.a(paramGraphics, new k(i - 4, j - 4, 38, 38), 0);
      if (this.x) {
        int m = this.j[0].getHeight();
        j = j;
        i += this.j[0].getWidth();
        Graphics graphics = paramGraphics;
        de de1;
        switch ((de1 = this).u[de1.l]) {
          case 2:
            graphics.drawImage(de1.w, i + 5, j + m, 36);
            break;
          case 4:
            graphics.drawImage(de1.v, i + 5, j, 20);
            break;
          case 3:
            graphics.drawImage(de1.v, i + 5, j, 20);
            graphics.drawImage(de1.w, i + 5, j + m, 36);
            break;
        } 
      } 
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
    } 
    cw.c(paramGraphics, cw.a);
  }
  
  public final void a(lh paramlh) {
    this.A = paramlh;
    this.B = paramlh.L;
    this.D = this.B;
    this.s = new int[go.r.length];
    this.u = new byte[go.r.length];
    this.r = new int[go.r.length];
    this.o = new boolean[go.r.length];
    this.A = paramlh;
    for (byte b1 = 0; b1 < paramlh.E.length; b1++) {
      lv lv;
      int i = (lv = paramlh.E[b1]).a % 100;
      this.o[i] = true;
      this.r[i] = (paramlh.E[b1]).f;
    } 
    lw[] arrayOfLw = go.r;
    de de1;
    (de1 = this).y = arrayOfLw;
    lv[] arrayOfLv = (de1 = de1).A.E;
    de1.o = new boolean[de1.y.length];
    byte b2;
    for (b2 = 0; b2 < arrayOfLv.length; b2++) {
      lv lv;
      int i = (lv = arrayOfLv[b2]).a % 100;
      de1.o[i] = true;
    } 
    for (b2 = 0; b2 < de1.y.length; b2++) {
      if (!de1.o[b2] && de1.i(b2))
        de1.o[b2] = true; 
    } 
    z();
  }
  
  public final cu h(int paramInt) {
    if (this.t == null)
      this.t = ((ay)l()).q(); 
    int i = this.i.a - this.t.a;
    int j = this.i.b - this.t.b;
    return new cu(this.q[paramInt][0] + i, this.q[paramInt][1] + j);
  }
  
  private boolean k(int paramInt) {
    boolean bool = ((this.y[paramInt]).d >= 0 && this.r[(this.y[paramInt]).d % 100] <= 0) ? false : true;
    return (this.B > 0 && this.r[paramInt] < (this.y[paramInt]).c.length && this.B >= ((this.y[paramInt]).c[this.r[paramInt]]).c && this.A.G >= ((this.y[paramInt]).c[this.r[paramInt]]).b && bool);
  }
  
  private void l(int paramInt) {
    if (this.s[paramInt] > 0) {
      if (this.r[paramInt] < (this.y[paramInt]).c.length && k(paramInt)) {
        this.u[paramInt] = 3;
      } else {
        this.u[paramInt] = 2;
      } 
    } else {
      if (this.B >= ((this.y[paramInt]).c[this.r[paramInt]]).c && k(paramInt))
        this.u[paramInt] = 4; 
      for (paramInt = 0; paramInt < this.r.length; paramInt++) {
        if (this.r[paramInt] == 0)
          for (int i = paramInt; i < this.r.length; i++) {
            if ((this.y[i]).d == (this.y[paramInt]).a)
              while (this.r[i] > 0) {
                this.s[i] = this.s[i] - 1;
                this.r[i] = this.r[i] - 1;
                this.B += ((this.y[i]).c[this.r[i]]).c;
              }  
          }  
      } 
    } 
    z();
  }
  
  public final g v() {
    return new g(this.i.c, this.i.d);
  }
  
  public final int w() {
    return 10;
  }
  
  public final void e(boolean paramBoolean) {
    this.x = paramBoolean;
    l(this.l);
  }
  
  public final boolean q() {
    return this.x;
  }
  
  public final boolean c(int paramInt1, int paramInt2) {
    if (this.t == null)
      this.t = ((ay)l()).q(); 
    paramInt1 -= this.i.a;
    paramInt2 -= this.i.b;
    int i = this.q[this.l][1];
    if (this.x) {
      if ((new k(this.q[this.l][0] + 30, this.q[this.l][1], 15, 15)).a(paramInt1, paramInt2)) {
        f(99);
        return true;
      } 
      if ((new k(this.q[this.l][0] + 30, this.q[this.l][1] + 15, 15, 15)).a(paramInt1, paramInt2)) {
        f(98);
        return true;
      } 
    } else {
      if ((new k(this.q[this.l][0], this.q[this.l][1], 30, 30)).a(paramInt1, paramInt2)) {
        f(95);
        return true;
      } 
      for (byte b = 0; b < this.q.length; b++) {
        if ((new k(this.q[b][0], this.q[b][1], 30, 30)).a(paramInt1, paramInt2)) {
          this.l = b;
          if (this.z != null)
            this.z.a(this, this.l); 
          e(0, i - this.q[b][1]);
          return true;
        } 
      } 
    } 
    return false;
  }
  
  private void z() {
    if (this.p == null)
      this.p = new boolean[go.r.length]; 
    for (byte b = 0; b < this.p.length; b++) {
      if (this.r[b] < (this.y[b]).c.length && i(b)) {
        this.o[b] = true;
      } else if (this.r[b] == 0) {
        this.o[b] = false;
      } 
      this.p[b] = i(b) & this.o[b];
    } 
  }
  
  public final boolean i(int paramInt) {
    boolean bool = ((this.y[paramInt]).d >= 0 && this.r[(this.y[paramInt]).d % 100] <= 0) ? false : true;
    return (this.B > 0 && this.r[paramInt] < (this.y[paramInt]).c.length && this.B >= ((this.y[paramInt]).c[this.r[paramInt]]).c && this.A.G >= ((this.y[paramInt]).c[this.r[paramInt]]).b && bool) ? true : ((this.s[paramInt] > 0 && bool));
  }
  
  public final boolean f(int paramInt) {
    int i = this.l;
    switch (paramInt) {
      case 99:
        if (this.x) {
          if (this.u[this.l] > 2) {
            this.B -= ((this.y[this.l]).c[this.r[this.l]]).c;
            this.s[this.l] = this.s[this.l] + 1;
            this.r[this.l] = this.r[this.l] + 1;
            l(this.l);
          } 
          break;
        } 
        if (this.C[this.l][0] >= 0) {
          this.l = this.C[this.l][0];
          ((ay)l()).j(-40);
        } 
        break;
      case 98:
        if (this.x) {
          if (this.s[this.l] > 0) {
            this.s[this.l] = this.s[this.l] - 1;
            this.r[this.l] = this.r[this.l] - 1;
            this.B += ((this.y[this.l]).c[this.r[this.l]]).c;
            l(this.l);
          } 
          break;
        } 
        if (this.C[this.l][1] >= 0) {
          this.l = this.C[this.l][1];
          ((ay)l()).j(40);
        } 
        break;
      case 97:
        if (this.x)
          return true; 
        if (this.C[this.l][2] >= 0)
          this.l = this.C[this.l][2]; 
        break;
      case 96:
        if (this.x)
          return true; 
        if (this.C[this.l][3] >= 0)
          this.l = this.C[this.l][3]; 
        break;
      case 95:
        if (this.z != null)
          this.z.b(this, this.l); 
        break;
    } 
    if (this.z != null && paramInt != 95)
      this.z.a(this, i, this.l); 
    return true;
  }
  
  public final boolean e(int paramInt1, int paramInt2) {
    ay ay;
    (ay = (ay)l()).j(-paramInt2);
    return false;
  }
  
  public final int r() {
    return this.r[this.l];
  }
  
  public final lw[] s() {
    return this.y;
  }
  
  public final lw t() {
    return this.y[this.l];
  }
  
  public final lw j(int paramInt) {
    return this.y[paramInt];
  }
  
  public final boolean u() {
    return (this.D - this.B > 0);
  }
  
  public final int[] x() {
    return this.s;
  }
  
  public final int y() {
    return this.B;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\de.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */