import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class cz extends at {
  private lh a;
  
  private mg b;
  
  private k c;
  
  private k d;
  
  private k e;
  
  private boolean f;
  
  private boolean g = true;
  
  private lh h;
  
  private String[][] i = new String[][] { { "Công", "C.Xác", "S.Lực" }, { "P.Thủ", "N.Tránh", "C.Mạng" } };
  
  public cz(lh paramlh) {
    a(paramlh, true);
    this.h = a.a(paramlh.a());
    this.c = new k(5, 5, 50, 59);
    if (v.t >= v.u && v.t == 320)
      this.f = true; 
    byte b = this.f ? 60 : 45;
    this.d = new k(this.c.a + this.c.c + 40, 9, b, 15);
    this.e = new k(this.d.a + this.d.c + b + 5, this.d.b, b, 15);
    this.o = 240;
    this.p = 70;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    pc.c(paramGraphics, this.c.a + paramInt1, this.c.b + paramInt2, this.c.c, this.c.d);
    if (this.g) {
      int i = 0;
      int j;
      for (j = 0; j < 3; j++) {
        pc.b(paramGraphics, this.d.a + paramInt1, this.d.b + i + paramInt2, this.d.c, this.d.d, 1070484, 16579764, 14542575);
        bx.c.a(paramGraphics, this.i[0][j], this.d.a - 3 + paramInt1, this.d.b + paramInt2 + i, 2);
        i += this.d.d + 3;
      } 
      j = this.d.a + this.d.c / 2 + paramInt1;
      i = (this.d.d - bx.d.a()) / 2 + 1;
      int i4;
      d d6;
      (d6 = a(i4 = this.a.x - this.h.x)).a(paramGraphics, (new StringBuffer(String.valueOf(this.a.x))).toString(), j, this.d.b + i + paramInt2, 1);
      int i3;
      d d5 = a(i3 = this.a.B - this.h.B);
      i += this.d.d + 3;
      d5.a(paramGraphics, (new StringBuffer(String.valueOf(this.a.B))).toString(), j, this.d.b + i + paramInt2, 1);
      int i2;
      d d4 = a(i2 = this.a.r - this.h.r);
      i += this.d.d + 3;
      d4.a(paramGraphics, (new StringBuffer(String.valueOf(this.a.r))).toString(), j, this.d.b + i + paramInt2, 1);
      i = 0;
      for (j = 0; j < 3; j++) {
        pc.b(paramGraphics, this.e.a + paramInt1, this.e.b + i + paramInt2, this.e.c, this.e.d, 1070484, 16579764, 14542575);
        bx.c.a(paramGraphics, this.i[1][j], this.e.a - 3 + paramInt1, this.e.b + paramInt2 + i, 2);
        i += this.e.d + 3;
      } 
      j = this.e.a + this.e.c / 2 + paramInt1;
      i = (this.e.d - bx.d.a()) / 2 + 1;
      int i1;
      d d3;
      (d3 = a(i1 = this.a.z - this.h.z)).a(paramGraphics, (new StringBuffer(String.valueOf(this.a.z))).toString(), j, this.e.b + i + paramInt2, 1);
      i += this.e.d + 3;
      d d2;
      int n;
      (d2 = a(n = this.a.A - this.h.A)).a(paramGraphics, (new StringBuffer(String.valueOf(this.a.A))).toString(), j, this.e.b + i + paramInt2, 1);
      i += this.e.d + 3;
      d d1;
      int m;
      (d1 = a(m = this.a.C - this.h.C)).a(paramGraphics, String.valueOf(this.a.C) + "%", j, this.e.b + i + paramInt2, 1);
    } 
    if (this.b != null) {
      pc.b(paramGraphics, this.c.a + paramInt1, this.c.b + this.c.d + paramInt2 - 17, this.a.g);
      this.b.a(paramGraphics, paramInt1 + this.c.a, paramInt2 + this.c.b + 4);
    } 
  }
  
  private static d a(int paramInt) {
    d d;
    if (paramInt > 0) {
      d = a.g;
    } else if (d < null) {
      d = a.h;
    } else {
      d = bx.d;
    } 
    return d;
  }
  
  public final void i() {
    if (this.b != null)
      this.b.i(); 
  }
  
  private void a(lh paramlh, boolean paramBoolean) {
    this.a = a.a(paramlh);
    if (paramBoolean) {
      this.b = mb.a(paramlh, false);
      this.b.a(lc.a(paramlh));
      this.b.a(nr.a(paramlh));
      this.b.c(2);
      this.g = true;
    } 
  }
  
  public final void a(ll paramll) {
    if (paramll == null)
      return; 
    ll[] arrayOfLl = this.a.D;
    boolean bool = false;
    if (arrayOfLl != null && arrayOfLl.length > 0)
      for (byte b = 0; b < arrayOfLl.length; b++) {
        if ((arrayOfLl[b]).e == paramll.e) {
          if ((arrayOfLl[b]).b == paramll.b)
            return; 
          this.a.D[b] = paramll;
          bool = true;
          break;
        } 
      }  
    if (!bool)
      if (this.a.D == null || this.a.D.length == 0) {
        this.a.D = new ll[] { paramll };
      } else {
        ll[] arrayOfLl1 = new ll[this.a.D.length + 1];
        System.arraycopy(this.a.D, 0, arrayOfLl1, 0, this.a.D.length);
        arrayOfLl1[this.a.D.length] = paramll;
        this.a.D = arrayOfLl1;
      }  
    a(this.a, (paramll.e != 3));
  }
  
  public final void b(ll paramll) {
    if (paramll == null)
      return; 
    ll[] arrayOfLl;
    if ((arrayOfLl = this.a.D) != null && arrayOfLl.length > 0)
      for (byte b = 0; b < arrayOfLl.length; b++) {
        if (arrayOfLl[b].equals(paramll))
          if (arrayOfLl.length == 1) {
            this.a.D = new ll[0];
          } else {
            this.a.D = new ll[arrayOfLl.length - 1];
            System.arraycopy(arrayOfLl, 0, this.a.D, 0, b);
            System.arraycopy(arrayOfLl, b + 1, this.a.D, b, this.a.D.length - b);
          }  
      }  
    if (paramll.e != 3) {
      this.b = mb.a(this.a, false);
      this.b.a(lc.a(this.a));
      this.b.a(nr.a(this.a));
      this.b.c(2);
    } 
    this.a = a.a(this.a);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\cz.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */