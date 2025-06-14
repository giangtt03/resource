import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class hb extends al implements bf {
  private String k = null;
  
  private String[] l = null;
  
  private k m = null;
  
  private int n = 20;
  
  private d o = null;
  
  private int p = 10;
  
  private String[][] q = null;
  
  private int r = 0;
  
  private boolean s = true;
  
  public hb(ns paramns, String[] paramArrayOfString) {
    super(1);
    this.k = "Đã hoàn thành nhiệm vụ: " + paramns.b;
    a(this.k, paramArrayOfString);
  }
  
  private void a(String paramString, String[] paramArrayOfString) {
    b(-241229);
    a(new ba());
    this.o = bx.d;
    this.c = this.p;
    this.f -= this.p << 1;
    int j = this.f - 20;
    this.l = bx.a(paramString, j, this.o);
    int i = 0;
    if (paramArrayOfString != null) {
      this.q = new String[paramArrayOfString.length + 1][];
      (new String[1])[0] = "Bạn nhận được: ";
      this.q[0] = new String[1];
      int n = 1;
      for (i = 0; i < paramArrayOfString.length; i++) {
        this.q[i + 1] = bx.a(paramArrayOfString[i], j - 4, this.o);
        n += (this.q[i + 1]).length;
      } 
      i = n * (this.o.a() + 5);
    } 
    int m = this.l.length * this.o.a();
    this.r = m;
    m += i + 10;
    this.m = new k(10, 30, j, m);
    this.g = m + 65;
    this.d = v.u - this.g >> 1;
  }
  
  public final void c(Graphics paramGraphics) {
    pc.a(paramGraphics, this.c, this.d, this.f, this.g - this.n, v.aj, this.s);
    a.h.a(paramGraphics, "Chúc mừng", this.c + (this.f >> 1), this.d + 10, 1);
    pc.a(paramGraphics, this.m.a + this.c, this.m.b + this.d, this.m.c);
    bx.a(paramGraphics, this.o, this.l, this.m.a + 5 + this.c, this.m.b + 5 + this.d, this.m.c - 10, this.m.d, 0);
    if (this.q != null) {
      int i = 5;
      int j = this.m.a + 5 + this.c;
      int m = this.m.b + this.r + this.d;
      for (byte b = 0; b < this.q.length; b++) {
        if (b > 0)
          pc.a(paramGraphics, j, m + i + this.o.a() / 2); 
        bx.a(paramGraphics, this.o, this.q[b], j + 10, m + i, this.m.c - 10, this.m.d, 0);
        i += (this.q[b]).length * this.o.a() + 5;
      } 
    } 
  }
  
  public final void d(int paramInt1, int paramInt2) {
    if (paramInt2 == 0)
      ag.b().a(true); 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\hb.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */