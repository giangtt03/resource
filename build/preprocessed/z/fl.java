import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class fl extends aq implements bf {
  private int i = -23232323;
  
  private String j;
  
  private String k;
  
  private String l;
  
  private cu m;
  
  public fl(String paramString1, String paramString2) {
    this.j = paramString1;
    this.k = paramString2;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.a(paramInt1, paramInt2, paramInt3, paramInt4);
    b(this.k);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.c)
      return; 
    cw.a(paramGraphics);
    cw.a(paramGraphics, c() + paramInt1, d() + paramInt2 - 1, e(), bx.d.a());
    bx.d.c(true);
    bx.d.b(true);
    bx.d.a(paramGraphics, this.j, c() + paramInt1, d() + paramInt2, 0);
    bx.d.c();
    if (this.l != null)
      a.g.a(paramGraphics, this.l, c() + paramInt1 + this.m.a, d() + paramInt2 + this.m.b, 0); 
    cw.b(paramGraphics);
    c(true);
  }
  
  public final boolean f(int paramInt) {
    he he;
    ff ff;
    switch (paramInt) {
      case 95:
        (ff = (ff)(he = a.a("Câu trả lời tự động " + this.j, null, "Xong", 0, "Hủy", 1)).e(1)).c(this.k);
        ff.h(100);
        he.b(this.i);
        he.a(this);
        ag.b().a(he);
        return true;
    } 
    return false;
  }
  
  public final boolean c(int paramInt1, int paramInt2) {
    if (paramInt1 > c() && paramInt1 < c() + e() && paramInt2 > d() && paramInt2 < d() + f()) {
      if (this.g) {
        f(95);
      } else {
        d(true);
      } 
      return true;
    } 
    return false;
  }
  
  public final void d(int paramInt1, int paramInt2) {
    String str;
    switch (paramInt2) {
      case 0:
        if ((str = a.k(this.i)) != null && str.length() > 0)
          a(str); 
        ag.b().a(this.i, false);
        return;
      case 1:
        ag.b().a(this.i, false);
        break;
    } 
  }
  
  public final String a() {
    return this.k;
  }
  
  public final void a(String paramString) {
    this.k = paramString;
    b(paramString);
  }
  
  private void b(String paramString) {
    if (paramString == null || this.d == null)
      return; 
    this.m = new cu(this.d.a + bx.d.a(this.j) + 12, 0);
    int i = this.d.c - this.m.a - this.d.a;
    this.l = a.a(paramString, i);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\fl.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */