import javax.microedition.lcdui.Graphics;

public final class bd extends az {
  private String e;
  
  public final String d() {
    return this.e;
  }
  
  public bd(String paramString, int paramInt) {
    super(paramInt);
    this.e = paramString;
    this.c = bx.b.a(paramString);
  }
  
  public final void a(Graphics paramGraphics) {
    if (this.d > 0) {
      bx.b.a(paramGraphics, this.e, this.a, this.b + 1, 0);
      return;
    } 
    bx.c.a(paramGraphics, this.e, this.a, this.b, 0);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\bd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */