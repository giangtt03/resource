import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class kh extends at {
  private k a;
  
  private Image b;
  
  private int c;
  
  private int d;
  
  private int e = 0;
  
  private int f = 1;
  
  private int g = 0;
  
  private int h = 0;
  
  private cu i = null;
  
  private kb[] j = new kb[3];
  
  private kl k;
  
  public kh(Image paramImage) {
    this.b = paramImage;
    k k1 = new k(0, 0, v.t, v.u - ba.a);
    kh kh1;
    (kh1 = this).a = k1;
    kh1.i = new cu(k1.c >> 1, k1.d >> 1);
    this.f = v.t / 240 + ((v.t % 240 > 0) ? 1 : 0);
    this.e = v.u - 320 - paramImage.getHeight();
    if (v.u > 320) {
      this.g = v.u - 320 + 10;
      int i = paramImage.getWidth();
      int j = paramImage.getHeight();
      int[] arrayOfInt = new int[i * j];
      paramImage.getRGB(arrayOfInt, 0, i, 0, 0, i, j);
      this.h = arrayOfInt[0];
    } 
  }
  
  public final void a(Graphics paramGraphics) {
    Graphics graphics = paramGraphics;
    kh kh1;
    if ((kh1 = this).g > 0) {
      graphics.setColor(kh1.h);
      graphics.fillRect(0, 0, v.t, kh1.g);
    } 
    for (byte b2 = 0; b2 < kh1.f; b2++)
      graphics.drawImage(kh1.b, b2 * kh1.b.getWidth(), kh1.e, 36); 
    byte b1 = 0;
    int i = this.j.length;
    while (b1 < i) {
      this.j[b1].a(paramGraphics, this.m, this.n, this.a);
      b1++;
    } 
    this.j[2].b(paramGraphics, this.m, this.n);
  }
  
  public final void i() {
    if (this.k == null)
      this.k = ((kd)this.j[2]).c(); 
    byte b = 0;
    int i = this.j.length;
    while (b < i) {
      this.j[b].a();
      b++;
    } 
  }
  
  public final void a(k paramk) {
    this.c = this.a.a;
    this.d = this.a.b;
    paramk.a -= this.i.a;
    paramk.b -= this.i.b;
    if (this.c == this.a.a && this.d == this.a.b)
      return; 
    if (this.a.a + this.a.c > this.o) {
      this.a.a = this.o - this.a.c;
    } else if (this.a.a < 0) {
      this.a.a = 0;
    } 
    if (this.a.b + this.a.d > this.p) {
      this.a.b = this.p - this.a.d;
    } else if (this.a.b < 0) {
      this.a.b = 0;
    } 
    this.m = -this.a.a;
    this.n = -this.a.b;
    int i = this.c - this.a.a;
    int j = this.d - this.a.b;
    this.j[0].a(i / 3, j / 3);
  }
  
  public final void a(kb paramkb) {
    for (byte b = 0; b < this.j.length; b++) {
      if (this.j[b] == null) {
        this.j[b] = paramkb;
        paramkb.a(this.a);
        return;
      } 
    } 
    kb[] arrayOfKb = new kb[this.j.length + 1];
    System.arraycopy(this.j, 0, arrayOfKb, 0, this.j.length);
    arrayOfKb[this.j.length] = paramkb;
    this.j = arrayOfKb;
  }
  
  public final kb a(int paramInt) {
    return (1 >= this.j.length) ? null : this.j[1];
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {}
  
  public final k a() {
    return this.a;
  }
  
  public static boolean a(byte paramByte) {
    return ((paramByte & 0x8) != 0);
  }
  
  public static boolean b(int paramInt) {
    return ((paramInt & 0x20) != 0);
  }
  
  public static boolean c(int paramInt) {
    return ((paramInt & 0x10) != 0);
  }
  
  private static boolean o(int paramInt) {
    return ((paramInt & 0x40) != 0);
  }
  
  public static boolean d(int paramInt) {
    return ((paramInt & 0x40) != 0 && (paramInt & 0x2) != 0);
  }
  
  public static boolean l(int paramInt) {
    return ((paramInt & 0x40) != 0 && (paramInt & 0x1) != 0);
  }
  
  public final boolean m(int paramInt) {
    return ((paramInt & 0x1) == 0 && !o(paramInt));
  }
  
  public final boolean n(int paramInt) {
    return ((paramInt & 0x2) == 0 && !o(paramInt));
  }
  
  protected final boolean a(at paramat) {
    boolean bool = false;
    if (paramat.n() < 0) {
      paramat.f(0);
      bool = true;
    } else if (paramat.n() + paramat.p() > this.o) {
      paramat.f(this.o - paramat.p());
      bool = true;
    } 
    if (paramat.o() < 0) {
      paramat.g(0);
      bool = true;
    } else if (paramat.o() + paramat.q() > this.p) {
      paramat.g(this.p - paramat.q());
      bool = true;
    } 
    return bool;
  }
  
  protected final boolean b(k paramk) {
    boolean bool = false;
    if (paramk.a < 0) {
      paramk.a = 0;
      bool = true;
    } else if (paramk.a + paramk.c > this.o) {
      paramk.a = this.o - paramk.c;
      bool = true;
    } 
    if (paramk.b < 0) {
      if (this.k.y)
        paramk.b = 0; 
      bool = true;
    } else if (paramk.b + paramk.d > this.p) {
      paramk.b = this.p - paramk.d;
      bool = true;
    } 
    return bool;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\kh.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */