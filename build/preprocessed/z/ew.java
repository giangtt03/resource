import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class ew extends aq {
  public do i;
  
  private String j;
  
  private String k;
  
  private int l;
  
  private int m;
  
  private boolean n = true;
  
  private d o = bx.d;
  
  private d p = a.g;
  
  private String q;
  
  private long r;
  
  public ew(do paramdo, int paramInt) {
    d(paramInt);
    a(paramdo, (String)null, 0L);
  }
  
  public ew(do paramdo, int paramInt, d paramd) {
    this.o = paramd;
    d(paramInt);
    a(paramdo, (String)null, 0L);
  }
  
  public final void a(do paramdo, String paramString, long paramLong) {
    this.i = paramdo;
    this.j = String.valueOf(paramdo.a) + (!i.b(paramdo.e) ? (" - " + paramdo.e) : "");
    this.l = bx.d.a(this.j);
    this.k = "Cấp " + paramdo.b + "  --  Danh vọng" + " " + paramdo.d;
    this.q = paramString;
    this.r = paramLong + System.currentTimeMillis();
  }
  
  public final void d(boolean paramBoolean) {
    if (paramBoolean) {
      this.m = 0;
      this.n = true;
      e(42);
    } else {
      e(32);
    } 
    if (paramBoolean || this.g != paramBoolean)
      this.c = true; 
    super.d(paramBoolean);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    paramInt2 += d();
    paramInt1 += c() + 2;
    if (this.g) {
      pc.e(paramGraphics, paramInt1 - 2, paramInt2, e(), f());
      paramInt2 += 7;
    } else {
      paramInt2 += 3;
    } 
    boolean bool;
    if (bool = (this.g && this.l > e() - 25 - 2) ? true : false) {
      cw.a(paramGraphics);
      cw.a(paramGraphics, paramInt1, paramInt2, e(), f());
    } 
    int i = paramInt1 + 25;
    this.o.a(paramGraphics, this.j, i + (this.g ? this.m : 0), paramInt2, 0);
    if (bool)
      cw.b(paramGraphics); 
    pc.a(paramGraphics, paramInt1, paramInt2, this.i.c);
    this.p.a(paramGraphics, this.k, i, paramInt2 + 13, 0);
    if (this.q != null) {
      long l = (this.r - System.currentTimeMillis() > 0L) ? (this.r - System.currentTimeMillis()) : 0L;
      paramInt1 = v.t - bx.c.a(this.q) - bx.c.a(i.b(l, "hh:mm:ss")) - 5;
      a.h.a(paramGraphics, String.valueOf(this.q) + " " + i.b(l, "hh:mm:ss"), paramInt1, v.u - 35, 0);
    } 
  }
  
  public final void n() {
    int i = e() - 25 - 2;
    if (this.g && this.l > i) {
      if (this.n) {
        this.m--;
        i -= this.l;
        if (this.m < i) {
          this.m = i;
          this.n = false;
        } 
      } else {
        this.m++;
        if (this.m > 0) {
          this.m = 0;
          this.n = true;
        } 
      } 
      this.c = true;
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ew.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */