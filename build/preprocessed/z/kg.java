import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class kg extends at {
  private String i = null;
  
  protected Image a = null;
  
  protected int b = 64;
  
  protected int c = 1;
  
  public jm d;
  
  public ln e = null;
  
  public Image f;
  
  protected boolean g = false;
  
  protected int h = 0;
  
  public kg(Image paramImage, int paramInt) {
    this.f = paramImage;
    if (paramImage == null) {
      ct.a("location object truyen hình vao null");
      return;
    } 
    this.o = this.f.getWidth();
    this.p = paramImage.getHeight() / paramInt;
  }
  
  public kg(ln paramln, jm paramjm) {
    this.e = paramln;
    this.d = paramjm;
    if (paramln != null) {
      this.m = this.d.d + (this.d.f - paramln.p()) / 2;
      this.n = this.d.e + (this.d.g - paramln.q()) / 2;
    } else {
      this.m = this.d.d;
      this.n = this.d.e;
    } 
    j(20);
    b(paramjm.b);
    h(this.d.f);
    i(this.d.g);
  }
  
  public void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (this.f != null)
      paramGraphics.drawImage(this.f, this.m + paramInt1, this.n + paramInt2, this.q); 
    if (this.e != null) {
      this.e.a(paramGraphics, this.m + paramInt1, this.n + paramInt2);
      if (this.i != null)
        bx.c.a(paramGraphics, this.i, this.m + this.e.p() / 2 + paramInt1, this.n - this.b + paramInt2, 1); 
    } 
  }
  
  public final void b(String paramString) {
    this.i = paramString;
    a(paramString);
  }
  
  public final String a() {
    return this.i;
  }
  
  protected void a(String paramString) {}
  
  public void a(int paramInt) {
    this.c = paramInt;
  }
  
  public final int b() {
    return this.c;
  }
  
  public void i() {}
  
  public final void a(boolean paramBoolean, int paramInt) {
    this.g = false;
    this.h = 0;
  }
  
  public final boolean c() {
    return this.g;
  }
  
  public String toString() {
    return String.valueOf(this.i) + "   x = " + this.m + "  y = " + this.n + "   w = " + this.o + "  h= " + this.p;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\kg.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */