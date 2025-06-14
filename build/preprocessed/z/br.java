import javax.microedition.lcdui.Graphics;

public final class br extends at {
  private String a;
  
  private int b;
  
  private br[] c;
  
  private Object d;
  
  public br(String paramString, int paramInt) {
    this.a = paramString;
    this.b = paramInt;
    h(bx.c.a(paramString));
  }
  
  public final Object a() {
    return this.d;
  }
  
  public final void a(Object paramObject) {
    this.d = paramObject;
  }
  
  public final String b() {
    return this.a;
  }
  
  public final int c() {
    return this.b;
  }
  
  public final void a(br[] paramArrayOfbr) {
    this.c = paramArrayOfbr;
  }
  
  public final br[] d() {
    return this.c;
  }
  
  public final boolean e() {
    return !(this.c == null || this.c.length <= 0);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2, boolean paramBoolean) {
    if (paramBoolean) {
      bx.c.a(paramGraphics, this.a, paramInt1, paramInt2, 0);
    } else {
      bx.d.a(paramGraphics, this.a, paramInt1, paramInt2, 0);
    } 
    f(paramInt1);
    g(paramInt2);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {}
  
  public final void i() {}
  
  public final String toString() {
    return "popupItem id= " + this.l + "     caption= " + this.a + "      command= " + this.b;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\br.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */