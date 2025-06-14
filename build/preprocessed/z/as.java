import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class as extends at {
  protected int a = 0;
  
  protected Image b;
  
  protected int c;
  
  protected int[][] d;
  
  protected int e;
  
  protected int[][] f;
  
  private int s;
  
  private int t;
  
  protected int g;
  
  private boolean u = true;
  
  protected int h;
  
  protected int i;
  
  protected int j;
  
  protected int k;
  
  public as() {}
  
  public as(Image paramImage, int paramInt) {
    a(paramImage, paramInt);
  }
  
  public as(Image paramImage, int[][] paramArrayOfint) {
    a(paramImage, paramArrayOfint);
  }
  
  public final void a(Image paramImage, int paramInt) {
    if (paramImage == null)
      throw new NullPointerException("Image is NULL!!!"); 
    this.c = paramInt;
    this.g = -1;
    this.o = paramImage.getWidth() / this.c;
    this.p = paramImage.getHeight();
    this.b = paramImage;
    this.d = null;
  }
  
  public final void a(Image paramImage, int[][] paramArrayOfint) {
    if (paramImage == null)
      throw new NullPointerException("Image is NULL!!!"); 
    if (paramArrayOfint == null)
      throw new NullPointerException("Regions are NULL!!!"); 
    this.g = -1;
    this.b = paramImage;
    this.d = paramArrayOfint;
  }
  
  public void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    try {
      if (!this.r || this.g < 0 || this.b == null)
        return; 
      int i;
      if ((i = this.f[this.e][this.g]) >= 0) {
        if (this.d != null) {
          int[] arrayOfInt = this.d[i];
          paramInt1 = (this.a == 0) ? (this.m + paramInt1 + arrayOfInt[4]) : (this.m + paramInt1 + this.o - arrayOfInt[2] - arrayOfInt[4]);
          paramInt2 = this.n + paramInt2 + arrayOfInt[5];
          if ((this.q & 0x1) > 0) {
            paramInt1 -= this.o >> 1;
          } else if ((this.q & 0x8) > 0) {
            paramInt1 -= this.o;
          } 
          if ((this.q & 0x2) > 0) {
            paramInt2 -= this.p >> 1;
          } else if ((this.q & 0x20) > 0) {
            paramInt2 -= this.p;
          } 
          if (this.a == 0) {
            cw.a(paramGraphics, this.b, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3], paramInt1, paramInt2, 0);
            return;
          } 
          paramGraphics.drawRegion(this.b, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3], this.a, paramInt1, paramInt2, 0);
          return;
        } 
        if (this.a == 0) {
          cw.a(paramGraphics, this.b, this.f[this.e][this.g] * this.o, 0, this.o, this.p, this.m + paramInt1, this.n + paramInt2, this.q);
          return;
        } 
        paramGraphics.drawRegion(this.b, this.f[this.e][this.g] * this.o, 0, this.o, this.p, this.a, this.m + paramInt1, this.n + paramInt2, this.q);
        return;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      ct.a(" Framanimate error: " + this.f.length + "            " + this.e + "             " + this.g);
      illegalArgumentException.printStackTrace();
      return;
    } catch (Exception exception) {
      ct.a(" Framanimate error: frames = " + this.f);
    } 
  }
  
  public final int a() {
    return this.h;
  }
  
  public final int b() {
    return this.i;
  }
  
  public final int c() {
    return this.j;
  }
  
  public final int d() {
    return this.k;
  }
  
  public final void a(int paramInt1, int paramInt2) {
    this.j = paramInt1;
    this.k = paramInt2;
  }
  
  public final void b(int paramInt1, int paramInt2) {
    this.h = paramInt1;
    this.i = paramInt2;
  }
  
  public final int[][] e() {
    return this.f;
  }
  
  public final void a(int[][] paramArrayOfint) {
    this.f = paramArrayOfint;
  }
  
  public final void a(byte[][] paramArrayOfbyte) {
    this.f = new int[paramArrayOfbyte.length][];
    for (byte b = 0; b < paramArrayOfbyte.length; b++) {
      this.f[b] = new int[(paramArrayOfbyte[b]).length];
      for (byte b1 = 0; b1 < (paramArrayOfbyte[b]).length; b1++)
        this.f[b][b1] = paramArrayOfbyte[b][b1]; 
    } 
  }
  
  public final void a(int paramInt) {
    this.g = paramInt;
  }
  
  public final int f() {
    return this.g;
  }
  
  public final void b(int paramInt) {
    this.s = paramInt;
    this.t = 0;
  }
  
  public final int g() {
    return this.a;
  }
  
  public void c(int paramInt) {
    this.a = paramInt;
  }
  
  public final void a(boolean paramBoolean) {
    this.u = paramBoolean;
  }
  
  public void d(int paramInt) {
    if (paramInt != this.e) {
      this.g = 0;
    } else {
      this.g %= (this.f[paramInt]).length;
    } 
    this.e = paramInt;
  }
  
  public final int h() {
    return this.e;
  }
  
  public final void i() {
    if (this.r) {
      k();
      if (this.f != null && this.f[this.e] != null) {
        this.t++;
        if (this.t >= this.s) {
          this.t = 0;
          if (this.u) {
            this.g = (this.g + 1) % (this.f[this.e]).length;
          } else {
            this.g++;
            if (this.g >= (this.f[this.e]).length)
              this.g = (this.f[this.e]).length - 1; 
          } 
        } 
      } 
      if (this.e < 0) {
        this.e = 0;
        return;
      } 
      if (this.e >= this.f.length)
        this.e = this.f.length - 1; 
    } 
  }
  
  public boolean j() {
    return (this.g >= (this.f[this.e]).length - 1);
  }
  
  public void k() {}
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\as.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */