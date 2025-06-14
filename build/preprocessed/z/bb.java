import javax.microedition.lcdui.Graphics;

public final class bb extends aq {
  private o i;
  
  private boolean j = false;
  
  private bb(String paramString, int paramInt1, d paramd, boolean paramBoolean, int paramInt2) {
    this.j = false;
    this.i = new o(paramd, paramString, 0, 0, paramInt1 - 2, paramd.a(), paramInt2);
    paramd.c();
    a(1, 1, paramInt1, this.i.c() + 2);
    b(false);
  }
  
  private bb(String paramString, int paramInt1, d paramd, int paramInt2) {
    this(paramString, paramInt1, paramd, false, 1);
  }
  
  public bb(String paramString, int paramInt, d paramd) {
    this(paramString, paramInt, paramd, 1);
  }
  
  public final o a() {
    return this.i;
  }
  
  public final void d(boolean paramBoolean) {
    if (paramBoolean || this.g != paramBoolean)
      this.c = true; 
    super.d(paramBoolean);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (this.c) {
      if (this.j)
        this.i.a().c(true); 
      this.i.a(paramGraphics, paramInt1 + c(), paramInt2 + d());
      this.c = false;
      if (this.j)
        this.i.a().c(); 
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\bb.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */