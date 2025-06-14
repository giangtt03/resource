import javax.microedition.lcdui.Graphics;

public final class pe {
  private static pe b;
  
  public ep[] a = null;
  
  public static pe a() {
    if (b == null)
      b = new pe(); 
    return b;
  }
  
  public static void a(pe parampe) {
    b = null;
  }
  
  public final void a(ep[] paramArrayOfep) {
    g.a((Object[])paramArrayOfep, new pf(this));
    this.a = paramArrayOfep;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramInt1 = d(paramInt1);
    try {
      if (this.a == null || paramInt1 < 0) {
        pc.d(paramGraphics, -20, paramInt2, paramInt3, 0);
        return;
      } 
      paramGraphics.drawImage((this.a[paramInt1]).a, paramInt2, paramInt3, 0);
      return;
    } catch (Exception exception) {
      ct.a("[VipIconUtil] Exception in drawVipIcon");
      exception.printStackTrace();
      pc.d(paramGraphics, -20, paramInt2, paramInt3, 0);
      return;
    } 
  }
  
  private int d(int paramInt) {
    return (this.a != null) ? g.a((Object[])this.a, 0, this.a.length - 1, new Integer(paramInt), new pg(this)) : -1;
  }
  
  public final int a(int paramInt) {
    return ((paramInt = d(paramInt)) < 0 || this.a[paramInt] == null || paramInt >= this.a.length) ? 16 : (this.a[paramInt]).a.getWidth();
  }
  
  public final int b(int paramInt) {
    return ((paramInt = d(paramInt)) < 0 || this.a[paramInt] == null || paramInt >= this.a.length) ? 16 : (this.a[paramInt]).a.getHeight();
  }
  
  public final String c(int paramInt) {
    return ((paramInt = d(paramInt)) < 0 || this.a[paramInt] == null || paramInt >= this.a.length || (this.a[paramInt]).b == null) ? "" : (this.a[paramInt]).b;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\pe.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */