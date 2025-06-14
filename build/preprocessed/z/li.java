import javax.microedition.lcdui.Graphics;

public final class li extends at {
  private String a = "";
  
  public li(int paramInt1, int paramInt2) {
    this.a = String.valueOf(paramInt1 / 1024) + "/" + (paramInt2 / 1024) + "KB";
    this.o = bx.d.a(this.a) + 8;
    this.m = (v.t - this.o) / 2;
    this.n = 2;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    pc.a(paramGraphics, this.m, 0, this.o, 18, 15663104, 16177368);
    bx.d.a(paramGraphics, this.a, this.m + 4, this.n + 2, 0);
  }
  
  public final void i() {}
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\li.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */