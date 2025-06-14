import javax.microedition.lcdui.Graphics;

public abstract class d {
  protected int j;
  
  public abstract int a();
  
  public abstract int a(String paramString);
  
  public void a(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3) {
    a(paramGraphics, paramString, 0, paramString.length(), paramInt1, paramInt2, paramInt3);
  }
  
  public abstract void a(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
  
  public abstract int a(char paramChar);
  
  public abstract int b();
  
  public abstract void a(boolean paramBoolean);
  
  public abstract void b(boolean paramBoolean);
  
  public abstract void c(boolean paramBoolean);
  
  public abstract void c();
  
  public final void a(int paramInt) {
    this.j = paramInt;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\d.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */