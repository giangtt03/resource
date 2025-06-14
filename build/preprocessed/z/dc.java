import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class dc extends aq {
  public static final Image i = f.d("/broken_heart");
  
  public int j = 0;
  
  private Image l = null;
  
  public Object k;
  
  private byte m = 0;
  
  private byte n;
  
  private int o = 3;
  
  private int p;
  
  private int q;
  
  private int r = 3;
  
  private d s;
  
  public dc(Image paramImage, Object paramObject, int paramInt, d paramd) {
    this.k = paramObject;
    this.s = paramd;
    int i = paramInt;
    dc dc1;
    (dc1 = this).j = i;
    if (paramImage != null) {
      this.l = paramImage;
      d(this.l.getWidth());
      e(this.l.getHeight());
    } else {
      d(32);
      e(32);
    } 
    if (this.k instanceof ll && (((ll)paramObject).m == 4 || ((ll)paramObject).m == 7)) {
      this.m = (byte)cv.a(3);
      this.r = cv.a(3, 6);
      this.p = pc.b.getWidth() / 3;
      this.q = pc.b.getHeight();
    } 
  }
  
  public final void n() {
    this.n = (byte)(this.n + 1);
    if (this.n > this.r) {
      this.n = 0;
      this.m = (byte)(this.m + 1);
      if (this.m >= this.o)
        this.m = 0; 
    } 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    paramInt1 += c();
    paramInt2 += d();
    switch (this.j) {
      case 0:
        if (this.l == null)
          return; 
        paramGraphics.drawImage(this.l, paramInt1, paramInt2, 0);
        if (this.k != null && ((ll)this.k).p == 0)
          paramGraphics.drawImage(i, paramInt1 + i.getWidth(), paramInt2 + f(), 40); 
        if (this.k != null && (((ll)this.k).m == 4 || ((ll)this.k).m == 7 || ((ll)this.k).m == 8))
          cw.a(paramGraphics, pc.b, this.m * this.p, 0, this.p, this.q, paramInt1 + this.l.getWidth(), paramInt2, 24); 
        if (this.k != null && ((ll)this.k).j > 0 && this.s != null) {
          this.s.a(paramGraphics, "+" + ((ll)this.k).j, paramInt1 + 32, paramInt2 + 32 - bx.c.a(), 2);
          return;
        } 
        return;
      case 9:
        paramGraphics.drawImage(this.l, paramInt1, paramInt2, 0);
        bx.c.a(paramGraphics, (new StringBuffer("0")).toString(), paramInt1 + this.l.getWidth(), paramInt2 + this.l.getHeight() - bx.c.a(), 2);
        return;
    } 
    pc.g(paramGraphics, ((lm)this.k).j, paramInt1, paramInt2, 0);
    if (((lm)this.k).l != 1)
      bx.c.a(paramGraphics, ((lm)this.k).g, paramInt1 + 32, paramInt2 + 32 - bx.c.a(), 2); 
  }
  
  public final String toString() {
    String str;
    return str = "type = " + this.j + "    info =  " + this.k;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\dc.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */