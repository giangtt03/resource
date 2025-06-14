import javax.microedition.lcdui.Graphics;

public final class hf extends at {
  private String a = "";
  
  private int b = 0;
  
  private byte c;
  
  private d d = bx.d;
  
  public hf(String paramString, byte paramByte, d paramd) {
    this.c = paramByte;
    if (paramString != null)
      this.a = paramString; 
    if (paramd != null)
      this.d = paramd; 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    switch (this.c) {
      case 0:
        paramGraphics.setColor(16686236);
        break;
      case 1:
        paramGraphics.setColor(16775619);
        break;
      default:
        paramGraphics.setColor(14808319);
        break;
    } 
    paramGraphics.fillRect(paramInt1 + this.b, paramInt2, this.o, this.p);
    this.d.a(paramGraphics, this.a, paramInt1, paramInt2, 0);
  }
  
  public final void i() {}
  
  public final void a(int paramInt) {
    this.b = -5;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\hf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */