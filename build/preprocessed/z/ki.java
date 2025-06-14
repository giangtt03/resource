import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ki extends at {
  public static final byte[] a = new byte[] { 0, 0, -1, 1 };
  
  public static final byte[] b = new byte[] { -1, 1 };
  
  private int h = 0;
  
  private static byte[] i = new byte[] { 0, 0, 0, 4, 4, 4, 5, 5, 5 };
  
  private static byte[] j = new byte[] { 3, 3, 3, 2, 2, 3, 1, 1, 1 };
  
  public int c;
  
  private Image k = null;
  
  private int s = 0;
  
  public int d = 0;
  
  private byte[] t = null;
  
  private int u;
  
  public k e;
  
  private int v;
  
  public jo f;
  
  public Image g = null;
  
  private int w = 0;
  
  private int x = 0;
  
  private int y = 0;
  
  private lh z;
  
  private int A = 12;
  
  private d B = bx.c;
  
  private int C = 0;
  
  private int D;
  
  private int E;
  
  public ki(Image paramImage1, int paramInt1, int paramInt2, jo paramjo, lh paramlh, Image paramImage2) {
    int i = 6;
    paramInt2 = 1;
    Image image = paramImage1;
    ki ki1;
    (ki1 = this).k = image;
    ki1.o = image.getWidth() / i;
    ki1.p = image.getHeight() / paramInt2;
    this.z = paramlh;
    this.f = paramjo;
    a(this.m, this.n, this.o - 12, 20);
    this.w = this.o >> 1;
    if (paramImage2 == null) {
      lh lh1 = paramlh;
      jo jo1 = paramjo;
      ki1 = this;
      if (jo1 != null) {
        i = jo1.d - lh1.G;
        switch (jo1.g) {
          case 1:
            ki1.C = 16711680;
            break;
          case 2:
            ki1.C = 9008914;
            break;
          default:
            if (i >= 5) {
              ki1.C = 1471487;
              break;
            } 
            if (i < -9) {
              ki1.C = 11184810;
              break;
            } 
            ki1.B = bx.c;
            ki1.C = 14540253;
            break;
        } 
        ki1.D = ki1.B.a(jo1.b);
        ki1.E = ki1.B.a();
      } 
      return;
    } 
    this.g = paramImage2;
  }
  
  public ki() {
    a(this.m, this.n, this.o, this.p);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    b(paramGraphics, paramInt1, paramInt2);
    int i = paramInt2;
    paramInt2 = paramInt1;
    Graphics graphics = paramGraphics;
    ki ki1;
    if ((ki1 = this).f.b != null) {
      graphics.setColor(ki1.C);
      graphics.fillRect(ki1.m + ki1.w + paramInt2 - ki1.D / 2, ki1.n + ki1.A + i - ki1.E / 2, ki1.D, ki1.E);
      ki1.B.a(graphics, ki1.f.b, ki1.m + ki1.w + paramInt2 - ki1.D / 2, ki1.n + ki1.A + i - ki1.E / 2, 0);
    } 
  }
  
  public final void b(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (this.k != null) {
      paramGraphics.drawRegion(this.k, this.t[this.u] * this.o, 0, this.o, this.p, this.v, this.m + paramInt1, this.n + this.A + paramInt2, 0);
      return;
    } 
    paramGraphics.setColor(0);
    paramGraphics.fillArc(this.m + paramInt1, this.n + paramInt2, this.o, this.p, 0, 360);
  }
  
  public final void a(int paramInt) {
    ki ki1;
    byte[] arrayOfByte;
    this.h = paramInt;
    this.u = 0;
    switch (this.h) {
      case 0:
        arrayOfByte = i;
        (ki1 = this).t = arrayOfByte;
        return;
      case 1:
        arrayOfByte = j;
        (ki1 = this).t = arrayOfByte;
        break;
    } 
  }
  
  public final void a(int paramInt1, int paramInt2) {
    b(paramInt2);
    a(paramInt1);
  }
  
  public final void i() {
    switch (this.h) {
      case 0:
        this.u++;
        if (this.u >= this.t.length)
          this.u = 0; 
        break;
      default:
        this.u++;
        if (this.u >= this.t.length)
          this.u = 0; 
        break;
    } 
    if (this.e != null) {
      this.e.a = this.m + this.x;
      this.e.b = this.n + this.y;
    } 
  }
  
  public final void b(int paramInt) {
    this.c = paramInt;
    this.v = (paramInt == 2) ? 0 : ((paramInt == 3) ? 2 : this.v);
  }
  
  public final int a() {
    return this.h;
  }
  
  public final void b(int paramInt1, int paramInt2) {
    this.m += paramInt1;
    this.n += paramInt2;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.e = new k(paramInt1, paramInt2, paramInt3, paramInt4);
    this.x = (this.o - this.e.c) / 2;
    this.y = this.p - this.e.d;
  }
  
  public static Image a(Image paramImage, int paramInt) {
    int i = paramImage.getWidth();
    int j = paramImage.getHeight();
    int[] arrayOfInt = new int[i * j];
    paramImage.getRGB(arrayOfInt, 0, i, 0, 0, i, j);
    for (byte b = 0; b < j; b++) {
      for (byte b1 = 0; b1 < i; b1++) {
        int m = b1 + b * i;
        if ((arrayOfInt[m] & 0xFFFFFF) == paramInt)
          arrayOfInt[m] = 0; 
      } 
    } 
    return paramImage = Image.createRGBImage(arrayOfInt, i, j, true);
  }
  
  public final void c(int paramInt1, int paramInt2) {
    super.c(paramInt1, paramInt2);
    if (this.e != null) {
      this.e.a = paramInt1 + this.x;
      this.e.b = paramInt2 + this.y;
    } 
  }
  
  public final void c(int paramInt) {
    this.A = paramInt;
  }
  
  public final ki b() {
    ki ki1;
    (ki1 = new ki(this.k, 1, 6, this.f, this.z, this.g)).h(this.o);
    ki1.i(this.p);
    ki1.a(0, 2);
    ki1.g = null;
    ki1.w = this.w;
    ki1.A = this.A;
    return ki1;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ki.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */