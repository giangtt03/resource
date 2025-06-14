import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class gd extends aq {
  private String i = "";
  
  private ff j;
  
  private Image k;
  
  private cu l;
  
  public gd(String paramString) {
    this.i = paramString;
    this.j = new ff("", 300, 2);
    this.j.a(c() + 3, bx.d.a() + 10, e() - 6, 20);
    e(bx.d.a() + this.j.f() + 15);
  }
  
  public gd(byte[] paramArrayOfbyte) {
    this.i = "Nhập lại những ký tự sau:";
    if (paramArrayOfbyte != null && paramArrayOfbyte.length > 0)
      this.k = f.a(paramArrayOfbyte); 
    int i = bx.d.a() + 10;
    if (this.k != null) {
      this.l = new cu((v.t - this.k.getWidth()) / 2, i);
      i += this.k.getHeight() + 5;
    } 
    this.j = new ff("", 300, 2);
    this.j.a(c() + 3, i, e() - 6, 20);
    e(i + this.j.f() + 3);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.c)
      return; 
    int i = d() + paramInt2;
    int j = c() + paramInt1;
    if (m()) {
      pc.a(paramGraphics, c() + paramInt1, d() + paramInt2, e(), f(), 7070703, -1);
      paramGraphics.setColor(7267055);
      paramGraphics.fillRect(j, i, e(), bx.d.a() + 6);
    } 
    if (this.i != null) {
      bx.d.c(true);
      bx.d.a(paramGraphics, this.i, j + 1, i + 3, 0);
      bx.d.c();
    } 
    if (this.k != null)
      paramGraphics.drawImage(this.k, this.l.a + j, this.l.b + i, 20); 
    this.j.a(paramGraphics, j, i);
  }
  
  public final void n() {
    this.j.n();
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.a(paramInt1, paramInt2, paramInt3, paramInt4);
    this.j.a(c() + 3, bx.d.a() + 10, e() - 10, 20);
  }
  
  public final void d(int paramInt) {
    super.d(paramInt);
    this.j.d(paramInt - 5);
  }
  
  public final boolean f(int paramInt) {
    return this.j.f(paramInt);
  }
  
  public final boolean g(int paramInt) {
    return this.j.g(paramInt);
  }
  
  public final boolean c(int paramInt1, int paramInt2) {
    paramInt1 -= c();
    paramInt2 -= d();
    return this.j.c(paramInt1, paramInt2);
  }
  
  public final void h(int paramInt) {
    this.j.j(4);
  }
  
  public final void d(boolean paramBoolean) {
    super.d(paramBoolean);
    if (this.j != null)
      this.j.d(paramBoolean); 
  }
  
  public final String a() {
    return this.j.r();
  }
  
  public final void i(int paramInt) {
    this.j.k(1);
  }
  
  public final void a(String paramString) {
    this.j.c(paramString);
  }
  
  public final void b(boolean paramBoolean) {
    super.b(paramBoolean);
    this.j.b(paramBoolean);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\gd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */