import javax.microedition.lcdui.Graphics;

public final class et extends aq {
  private ls i;
  
  public et(dq paramdq, int paramInt) {
    this.i = new ls(paramdq.a, 0, 0, paramInt, bx.c.a() + 4, 1);
    d(paramInt);
    e(this.i.c() + 14);
  }
  
  public final void d(boolean paramBoolean) {
    if (paramBoolean || this.g != paramBoolean)
      this.c = true; 
    super.d(paramBoolean);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.c)
      return; 
    paramInt2 += d() + 10;
    paramInt1 += c();
    if (this.g) {
      paramGraphics.setColor(7267055);
      paramGraphics.fillRect(paramInt1, paramInt2, e(), f() - 10);
    } else {
      paramGraphics.setColor(13931764);
      paramGraphics.fillRect(paramInt1, paramInt2, e(), f() - 10);
    } 
    this.i.a(paramGraphics, paramInt1 + 2, paramInt2 + 2);
    if (this.g)
      paramGraphics.drawImage(pc.e, paramInt1 + e() - 20, paramInt2 + f() - 27, 0); 
    this.c = false;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\et.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */