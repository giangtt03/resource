import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class mv {
  private Image a;
  
  private Image b;
  
  private boolean c;
  
  public mv(mt parammt, boolean paramBoolean) {
    this.c = paramBoolean;
    if (!this.c) {
      if (a.k == 0) {
        this.a = f.d("/play/bkboardv");
        return;
      } 
      this.a = f.d("/play/bkboardh");
      return;
    } 
    this.b = f.d("/play/ground");
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3) {
    if (!this.c) {
      paramGraphics.drawImage(this.a, paramInt1, paramInt2, 0);
      return;
    } 
    paramGraphics.setColor(9828603);
    if (a.k == 0) {
      paramGraphics.drawLine(paramInt1, paramInt2, paramInt1 + 240, paramInt2);
      paramGraphics.fillRect(paramInt1, paramInt2, 5, 232);
      paramGraphics.fillRect(paramInt1 + 235, paramInt2, 5, 232);
      paramGraphics.fillRect(paramInt1, paramInt2 + 232, a(), b());
    } else {
      paramGraphics.drawLine(paramInt1, paramInt2, paramInt1 + 320, paramInt2);
      paramGraphics.fillRect(paramInt1, paramInt2, 45, 232);
      paramGraphics.fillRect(paramInt1 + 275, paramInt2, 45, 232);
    } 
    for (paramInt3 = 0; paramInt3 <= a() / this.b.getWidth(); paramInt3++)
      paramGraphics.drawImage(this.b, paramInt1 + this.b.getWidth() * paramInt3, paramInt2 + b() - this.b.getHeight(), 0); 
    if (a.k == 0) {
      ow.a(paramInt1, paramInt2, paramGraphics);
      return;
    } 
    ow.b(paramInt1, paramInt2, paramGraphics);
  }
  
  public static int a() {
    return (a.k == 0) ? 240 : 320;
  }
  
  public static int b() {
    return (a.k == 0) ? 320 : 240;
  }
  
  public final void c() {
    this.a = null;
    this.b = null;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\mv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */