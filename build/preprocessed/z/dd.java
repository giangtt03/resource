import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class dd extends at {
  private k a;
  
  private k b;
  
  private k c;
  
  private k d;
  
  private lh e;
  
  private mg f;
  
  public dd(lh paramlh) {
    this.e = paramlh;
    this.f = mb.a(paramlh, false);
    this.f.a(lc.a(paramlh));
    this.f.a(nr.a(paramlh));
    this.f.c(2);
    this.o = 240;
    this.p = 70;
    dd dd1;
    (dd1 = this).a = new k(5, 2, 56, 63);
    dd1.b = new k(112, 2, 122, 16);
    dd1.c = new k(112, 21, 122, 16);
    dd1.d = new k(112, 38, 122, 16);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    paramGraphics.setColor(v.aj);
    pc.b(paramGraphics, this.c.a + paramInt1, this.c.b + paramInt2, this.c.c, this.c.d, 1070484, 16579764, 14542575);
    bx.d.a(paramGraphics, "Cấp", this.c.a + paramInt1 - 6, this.c.b + paramInt2, 2);
    pc.b(paramGraphics, this.d.a + paramInt1, this.d.b + paramInt2, this.d.c, this.d.d, 1070484, 16579764, 14542575);
    bx.d.a(paramGraphics, "D.Vọng", this.d.a + paramInt1 - 6, this.d.b + paramInt2, 2);
    if (this.f != null) {
      a.h.a(paramGraphics, this.e.Q, this.b.a + paramInt1 + this.b.c - 5, this.b.b + paramInt2, 2);
      bx.c.a(paramGraphics, (new StringBuffer(String.valueOf(this.e.G))).toString(), this.c.a + paramInt1 + 5, this.c.b + paramInt2 + 1, 0);
      bx.c.a(paramGraphics, "[" + this.e.S + "]", this.c.a + paramInt1 + this.b.c - 5, this.c.b + paramInt2 + 1, 2);
      bx.c.a(paramGraphics, (new StringBuffer(String.valueOf(this.e.ab))).toString(), this.d.a + paramInt1 + 5, this.d.b + paramInt2 + 1, 0);
      bx.c.a(paramGraphics, "[" + this.e.R + "]", this.d.a + paramInt1 + this.b.c - 5, this.d.b + paramInt2 + 1, 2);
    } 
    pc.c(paramGraphics, this.a.a + paramInt1, this.a.b + paramInt2, this.a.c, this.a.d);
    if (this.f != null) {
      pc.b(paramGraphics, this.a.a + paramInt1 + this.a.c - 13, this.a.b + paramInt2 + this.a.d - 16, this.e.g);
      this.f.a(paramGraphics, this.a.a + paramInt1 + 2, this.a.b + paramInt2 + 7);
    } 
  }
  
  public final void i() {
    if (this.f != null)
      this.f.i(); 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\dd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */