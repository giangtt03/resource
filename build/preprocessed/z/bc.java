import javax.microedition.lcdui.Graphics;

public final class bc extends au {
  private String c = null;
  
  private String[] d;
  
  private int e;
  
  private d f;
  
  private int g = 41377;
  
  private d h;
  
  public final void a(d paramd) {
    this.f = paramd;
  }
  
  public bc(String paramString, int paramInt) {
    this.c = paramString;
    this.e = 0;
    bc bc1;
    (bc1 = this).f = bx.c;
    bc1.h = bx.b;
  }
  
  public final void a(k paramk) {
    super.a(paramk);
    if (this.c != null)
      this.d = bx.a(this.c, paramk.c, this.f); 
    if (this.d != null)
      this.b = this.d.length * 15; 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (this.d != null) {
      int i = this.a.b + this.a.d;
      for (byte b = 0; b < this.d.length && paramInt2 <= i; b++) {
        this.f.a(paramGraphics, this.d[b], paramInt1, paramInt2, this.e);
        paramInt2 += 15;
      } 
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\bc.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */