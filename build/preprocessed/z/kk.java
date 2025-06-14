import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class kk extends kg {
  private gj j;
  
  private int k;
  
  private int s = 3;
  
  private boolean t = false;
  
  private String[] u = null;
  
  public boolean i = false;
  
  private boolean v = false;
  
  private int w = 0;
  
  public kk(Image paramImage, jm paramjm, int paramInt) {
    super(paramImage, 1);
    this.d = paramjm;
    i();
    this.m = paramjm.d + (paramjm.f - this.o) / 2;
    this.n = paramjm.e + 16 + paramjm.g - this.p;
    b(paramjm.b);
    this.k = bx.c.a() * this.s + 20;
  }
  
  protected final void a(String paramString) {
    int i = bx.c.a(paramString);
    int j = bx.c.a();
    this.b = this.p;
    if (this.a == null) {
      this.a = Image.createImage(i, j);
      Graphics graphics;
      (graphics = this.a.getGraphics()).setColor(16711680);
      graphics.fillRect(0, 0, i, j);
      bx.c.a(graphics, paramString, 0, 0, 0);
      this.a = ki.a(this.a, 16711680);
    } 
  }
  
  public final void a(int paramInt) {
    super.a(paramInt);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    super.a(paramGraphics, paramInt1, paramInt2);
    if (this.a != null)
      paramGraphics.drawImage(this.a, this.m + this.o / 2 + paramInt1, this.n + paramInt2, 33); 
    if (!this.g && this.v)
      paramGraphics.drawImage(pc.c, this.m + this.o / 2 + paramInt1, this.n + 15 + paramInt2, 33); 
  }
  
  public final void b(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (this.j != null)
      this.j.a(paramGraphics, paramInt1, paramInt2); 
  }
  
  public final void c(int paramInt1, int paramInt2) {
    super.c(paramInt1, paramInt2);
    this.m = paramInt1 - this.o / 2;
    this.n = paramInt2 - this.p;
  }
  
  public final void i() {
    if (this.j != null)
      this.j.i(); 
    this.w++;
    if (this.v) {
      if (this.w >= 40) {
        this.v = false;
        this.w = 0;
      } 
    } else if (this.w == 200) {
      this.v = true;
      this.w = 0;
    } 
    if (this.g) {
      this.h--;
      if (this.h < 0) {
        this.h = 0;
        this.g = false;
      } 
    } 
  }
  
  public final void d() {
    this.j = null;
    this.t = false;
    om.p = false;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\kk.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */