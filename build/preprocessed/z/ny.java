import javax.microedition.lcdui.Graphics;

public final class ny extends an implements ik {
  private final int a;
  
  private boolean b;
  
  private int c;
  
  private String d;
  
  public final void a(String paramString) {
    this.d = paramString;
  }
  
  public ny(int paramInt) {
    super(7);
    a((ba)null);
    this.a = paramInt;
    this.c = 5;
    this.b = false;
  }
  
  protected final void r() {
    System.gc();
  }
  
  protected final void c() {
    if (this.b)
      return; 
    this.c--;
    if (this.c == 1) {
      System.gc();
      this.b = true;
      switch (this.a) {
        case 0:
          ag.b().f(0);
          return;
        case 1:
          pa.a().a(go.w, this);
          return;
        case 5:
          ag.b().a(5, new Object[] { this.d });
          break;
      } 
    } 
  }
  
  protected final void a(Graphics paramGraphics) {}
  
  public final void a(jn paramjn, byte[][] paramArrayOfbyte) {
    oa.c = paramjn;
    oa.b = paramArrayOfbyte;
    ag.b().f(1);
  }
  
  public final void d() {}
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ny.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */