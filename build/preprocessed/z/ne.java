import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ne extends at {
  private as[] a;
  
  private int b = 3;
  
  private int c = 100;
  
  private boolean d = true;
  
  private int e = 35;
  
  private int f;
  
  private z g;
  
  public final boolean a() {
    return this.d;
  }
  
  public ne(Image paramImage) {
    byte[][] arrayOfByte = { { 0, 1, 2 } };
    this.a = new as[20];
    for (byte b = 0; b < this.a.length; b++) {
      this.a[b] = new as(paramImage, 3);
      this.a[b].a(arrayOfByte);
    } 
    this.g = new z();
    this.g.a(12);
    this.f = 360 / this.a.length;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString) {
    this.b = 3;
    c(paramInt1, paramInt2);
    this.d = true;
    this.g.a(paramString, paramInt1, paramInt2 + 3);
    this.c = this.e + (paramInt3 - 1) * 5;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.d)
      return; 
    paramInt1 = 0;
    for (paramInt2 = 0; paramInt2 < this.a.length; paramInt2++) {
      int i = this.m + (this.b * l.b(paramInt1) >> 14);
      int j = this.n + (this.b * l.a(paramInt1) >> 14);
      if (this.a[paramInt2] != null)
        this.a[paramInt2].a(paramGraphics, i, j); 
      paramInt1 += this.f;
    } 
    if (this.b >= 7)
      this.g.a(paramGraphics, 0, 0); 
  }
  
  public final void i() {
    if (!this.d)
      return; 
    for (byte b = 0; b < this.a.length; b++) {
      if (this.a[b] != null)
        this.a[b].i(); 
    } 
    this.b += 3;
    if (this.b >= this.c)
      this.d = false; 
    if (this.b >= 7)
      this.g.b(); 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ne.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */