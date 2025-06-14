import com.mg.sq.a;
import java.util.Calendar;
import javax.microedition.lcdui.Graphics;

public final class ez extends aq implements bf {
  private int i;
  
  private int j;
  
  private int[] k = new int[] { 2, 2, 4 };
  
  private String[] l = new String[] { "", "", "" };
  
  private gw m = new gw();
  
  public ez() {
    this.m.a(this);
    q();
  }
  
  private void q() {
    this.l[0] = this.m.w();
    this.l[1] = this.m.y();
    this.l[2] = this.m.x();
  }
  
  public final boolean f(int paramInt) {
    int i;
    if (paramInt == 97) {
      this.i--;
      if (this.i < 0)
        this.i = 2; 
      this.j = 0;
      return true;
    } 
    if (paramInt == 96) {
      this.i++;
      if (this.i > 2)
        this.i = 0; 
      this.j = 0;
      return true;
    } 
    if (paramInt == 95) {
      a.s().a(this.m);
      return true;
    } 
    if (paramInt >= 148 && paramInt <= 157) {
      String str2 = this.l[this.i].substring(0, this.j);
      String str3 = this.l[this.i].substring(this.j + 1);
      String str1;
      i = Integer.parseInt(str1 = String.valueOf((str2 == null) ? "" : str2) + (paramInt - 148) + ((str3 == null) ? "" : str3));
      int m = this.i;
      ez ez2 = this;
      switch (m) {
        case 0:
        
        case 1:
        
        default:
          break;
      } 
      int j = ez2.m.A();
      m = this.i;
      ez2 = this;
      switch (m) {
        case 0:
        
        case 1:
        
        default:
          break;
      } 
      int k = ez2.m.B();
      if (i < j)
        i = j; 
      if (i > k)
        i = k; 
      i = this.i;
      m = i;
      ez ez1 = this;
      if (i == 1) {
        ez1.m.a(ez1.m.t(), m, ez1.m.u());
      } else if (i == 2) {
        ez1.m.a(ez1.m.t(), ez1.m.v(), m);
      } else {
        ez1.m.a(m, ez1.m.v(), ez1.m.u());
      } 
      ez1.q();
      this.j++;
      if (this.j >= this.k[this.i]) {
        this.i++;
        if (this.i >= 2)
          this.i = 2; 
        this.j = 0;
      } 
      return true;
    } 
    return super.f(i);
  }
  
  public final boolean c(int paramInt1, int paramInt2) {
    a.s().a(this.m);
    return true;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    pc.a(paramGraphics, c() + paramInt1, d() + paramInt2, e(), f(), this.g);
    String str1 = "";
    String str2 = this.l[0];
    if (this.i == 1) {
      str1 = String.valueOf(this.l[0]) + " - ";
      str2 = this.l[1];
    } else if (this.i == 2) {
      str1 = String.valueOf(this.l[0]) + " - " + this.l[1] + " - ";
      str2 = this.l[2];
    } 
    String str3 = String.valueOf(this.l[0]) + " - " + this.l[1] + " - " + this.l[2];
    paramInt1 = paramInt1 + c() + (e() - bx.d.a(str3)) / 2;
    if (this.g) {
      paramGraphics.setColor(16048180);
      paramGraphics.fillRect(paramInt1 + bx.d.a(str1) - 2, paramInt2 + d() + 2, bx.d.a(str2) + 3, f() - 4);
    } 
    bx.d.a(paramGraphics, str3, paramInt1, paramInt2 + d() + 2, 0);
  }
  
  public final long a() {
    Calendar calendar;
    ez ez1;
    (calendar = i.a).set(5, Integer.parseInt((ez1 = this).l[0]));
    calendar.set(2, Integer.parseInt((ez1 = this).l[1]) - 1);
    calendar.set(1, Integer.parseInt((ez1 = this).l[2]));
    return calendar.getTime().getTime();
  }
  
  public final void d(int paramInt1, int paramInt2) {
    if (paramInt2 == -1099)
      q(); 
    this.j = 0;
    a.s().a(false);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ez.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */