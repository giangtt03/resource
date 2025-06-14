import javax.microedition.lcdui.Graphics;

public final class ge extends az {
  private byte e = 100;
  
  private String f = "";
  
  public ge() {
    super(-2147483648);
    this.c = bx.d.a("77:77");
  }
  
  public final boolean a(int paramInt1, int paramInt2) {
    return false;
  }
  
  public final boolean b() {
    return false;
  }
  
  public final void c() {
    this.e = (byte)(this.e + 1);
    if (this.e >= 100) {
      this.e = 0;
      this.f = i.a();
    } 
  }
  
  public final void a(Graphics paramGraphics) {
    bx.d.a(paramGraphics, this.f, this.a - 40, this.b + 1, 0);
    bx.d.a(paramGraphics, String.valueOf(ks.h / 1024) + "Kb", this.a + 75, this.b + 1, 2);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ge.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */