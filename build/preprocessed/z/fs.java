import javax.microedition.lcdui.Graphics;

public final class fs extends aq {
  private dn i;
  
  private boolean j = false;
  
  public fs(dn paramdn, boolean paramBoolean, int paramInt) {
    this.i = paramdn;
    this.j = paramBoolean;
    d(paramInt);
    e(paramdn.c.c() + 4);
  }
  
  public final void d(boolean paramBoolean) {
    if (paramBoolean || this.g != paramBoolean)
      this.c = true; 
    super.d(paramBoolean);
  }
  
  public final boolean f(int paramInt) {
    int i;
    if ((i = this.i.d) < 0)
      return false; 
    switch (paramInt) {
      case 97:
        i = this.i.c.b(this.i.d);
        break;
      case 96:
        i = this.i.c.c(this.i.d);
        break;
      case 99:
        i = this.i.c.d(this.i.d);
        break;
      case 98:
        i = this.i.c.e(this.i.d);
        break;
      default:
        return false;
    } 
    if (i >= 0 && i < this.i.c.d().d()) {
      this.i.d = i;
      this.b.c(true);
      return true;
    } 
    return false;
  }
  
  public final boolean c(int paramInt1, int paramInt2) {
    if (this.i.d < 0)
      return false; 
    paramInt1 -= c();
    paramInt2 -= d();
    int i = this.i.c.d().d();
    for (byte b = 0; b < i; b++) {
      n n = this.i.c.a(b);
      if (paramInt1 >= n.d() && paramInt1 <= n.d() + n.f() && paramInt2 >= n.e() && paramInt2 <= n.e() + n.g()) {
        if (n.c() != 0 && n.c() != 2) {
          this.i.d = b;
          return false;
        } 
        break;
      } 
    } 
    return false;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.c)
      return; 
    paramInt2 += d();
    paramInt1 += c();
    if (this.i.b == 0) {
      if (this.g) {
        paramGraphics.setColor(7267055);
      } else {
        paramGraphics.setColor(2401717);
      } 
      paramGraphics.fillRect(paramInt1, paramInt2, e(), f());
      bx.d.c(true);
      this.i.c.a(paramGraphics, paramInt1 + 2, paramInt2 + 2);
      bx.d.c();
    } else if (this.i.b == 1) {
      int i = -1;
      if (!this.j) {
        i = 13365492;
        paramGraphics.fillRect(paramInt1, paramInt2, e(), f());
      } 
      if (this.g)
        i = 7267055; 
      if (i >= 0) {
        paramGraphics.setColor(i);
        paramGraphics.fillRect(paramInt1, paramInt2, e(), f());
      } 
      this.i.c.a(paramGraphics, paramInt1 + 2, paramInt2 + 2);
      if (this.g)
        paramGraphics.drawImage(pc.e, paramInt1 + e() - 20, paramInt2 + f() - 18, 0); 
    } else {
      if (this.g) {
        paramGraphics.setColor(7267055);
        paramGraphics.fillRect(paramInt1, paramInt2, e(), f());
      } 
      this.i.c.a(paramGraphics, paramInt1 + 2, paramInt2 + 2);
      if (this.g && this.i.d >= 0) {
        n n = this.i.c.a(this.i.d);
        paramGraphics.drawImage(pc.e, paramInt1 + n.d() + n.f() / 2 + 6, paramInt2 + n.e() + n.g() / 2, 17);
      } 
    } 
    this.c = false;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\fs.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */