import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class jx extends as {
  private static byte[][] s = new byte[][] { new byte[1] };
  
  private String t;
  
  private np u;
  
  private long v = 0L;
  
  private byte w = 0;
  
  public jx(Image paramImage, int paramInt) {
    super(paramImage, 1);
    a(s);
    this.g = 0;
  }
  
  public final void k() {
    if (!this.r)
      return; 
    this.w = (byte)(this.w + 1);
    if (this.w > 5) {
      this.w = 0;
      super.k();
      b(this.v - this.u.f());
    } 
  }
  
  public final void a(long paramLong) {
    if (this.u == null)
      this.u = new np(); 
    this.u.a();
    this.v = paramLong;
    b(paramLong);
  }
  
  private void b(long paramLong) {
    long l1;
    long l2 = (int)((l1 = paramLong / 1000L) / 60L);
    l1 %= 60L;
    int i = (int)(l2 / 60L);
    l2 %= 60L;
    int j = i / 24;
    i %= 24;
    this.t = String.valueOf((i >= 10) ? (String.valueOf(i) + ":") : ((i > 0) ? ("0" + i + ":") : "00:")) + ((l2 >= 10L) ? (String.valueOf(l2) + ":") : ((l2 > 0L) ? ("0" + l2 + ":") : "00:")) + ((j > 0) ? " " : ((l1 >= 10L) ? (new StringBuffer(String.valueOf(l1))).toString() : ((l1 > 0L) ? ("0" + l1) : "00")));
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.r)
      return; 
    super.a(paramGraphics, paramInt1, paramInt2);
    if (this.t != null) {
      paramInt1 += this.o;
      paramInt2 += (this.p - bx.c.a()) / 2;
      bx.c.a(paramGraphics, this.t, paramInt1, paramInt2, 0);
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\jx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */