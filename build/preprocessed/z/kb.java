import javax.microedition.lcdui.Graphics;

public abstract class kb extends at {
  protected k a;
  
  public abstract void a(Graphics paramGraphics, int paramInt1, int paramInt2, k paramk);
  
  public void a(int paramInt1, int paramInt2) {
    this.m += paramInt1;
    this.n += paramInt2;
  }
  
  public void a(k paramk) {
    this.a = paramk;
  }
  
  public void a() {}
  
  public void b(Graphics paramGraphics, int paramInt1, int paramInt2) {}
  
  public void b() {}
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\kb.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */