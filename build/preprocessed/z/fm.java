import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class fm extends ex {
  public fm(String paramString, int paramInt) {
    super(paramString, -10);
  }
  
  public final void d(boolean paramBoolean) {
    if (paramBoolean || this.g != paramBoolean)
      this.c = true; 
    super.d(paramBoolean);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.e || !this.c)
      return; 
    paramInt1 += c();
    paramInt2 += d();
    if (this.g) {
      paramGraphics.setColor(7267055);
    } else {
      paramGraphics.setColor(14722016);
    } 
    int i = f() - 2;
    paramGraphics.fillRect(paramInt1 + 1, paramInt2 + 1, e() - 2, i);
    pc.a(paramGraphics, paramInt1, paramInt2, e(), f(), 2401717, -1);
    if (this.g) {
      a.h.a(paramGraphics, this.i, paramInt1 + e() / 2, paramInt2 + 3, 1);
      paramGraphics.drawImage(pc.e, paramInt1 + e() / 2, paramInt2 + 9, 17);
    } else {
      bx.c.a(paramGraphics, this.i, paramInt1 + e() / 2, paramInt2 + 3, 1);
    } 
    this.c = false;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\fm.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */