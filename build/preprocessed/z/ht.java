import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public abstract class ht extends al implements bf {
  protected a l = a.s();
  
  protected bs m;
  
  protected boolean n = false;
  
  private k k = new k();
  
  az[] o = new az[3];
  
  public ht() {
    super(1);
  }
  
  public final void d(int paramInt1, int paramInt2) {
    if (g(paramInt2)) {
      A();
      return;
    } 
    e(paramInt2);
  }
  
  protected final void g() {
    if (this.m != null)
      this.m.n(); 
    u();
  }
  
  public final void c(Graphics paramGraphics) {
    a(paramGraphics);
    cw.a(paramGraphics, this.k);
    cw.a(paramGraphics, this.c, this.d, this.f + 1, this.g + 1);
    b(paramGraphics);
    if (this.m != null && this.n)
      this.m.a(paramGraphics, 0, 0); 
    cw.c(paramGraphics, this.k);
    if (this.m != null && !this.n)
      this.m.a(paramGraphics, 0, 0); 
  }
  
  protected abstract boolean g(int paramInt);
  
  protected abstract void e(int paramInt);
  
  public abstract void u();
  
  public abstract void b(Graphics paramGraphics);
  
  public abstract void a(Graphics paramGraphics);
  
  public final void c(int paramInt) {
    if (this.m != null) {
      int i = paramInt;
      az[] arrayOfAz = this.m.a();
      ht ht1 = this;
      if (ht1.i != null)
        ht1.i.d(-1, arrayOfAz[0].a()); 
      if (ht1.i != null)
        ht1.i.d(-1, arrayOfAz[1].a()); 
      if (ht1.i != null)
        ht1.i.d(-1, arrayOfAz[2].a()); 
      if ((i == 94 && arrayOfAz[0] != null && arrayOfAz[0].b()) ? true : ((i == 95 && arrayOfAz[1] != null && arrayOfAz[1].b()) ? true : ((i == 93 && arrayOfAz[2] != null && arrayOfAz[2].b())))) {
        v.c();
        return;
      } 
      if (this.m.f(paramInt))
        return; 
      A();
      return;
    } 
    f(paramInt);
  }
  
  protected void f(int paramInt) {}
  
  protected final void a(bs parambs, az paramaz1, az paramaz2, az paramaz3) {
    this.m = parambs;
    this.o = new az[this.j.length];
    for (byte b = 0; b < this.j.length; b++)
      this.o[b] = this.j[b]; 
    paramaz1 = paramaz1;
    ht ht1;
    (ht1 = this).a(paramaz1, true);
    paramaz1 = paramaz3;
    (ht1 = this).b(paramaz1, true);
    a(paramaz2);
    e(true);
  }
  
  protected final void A() {
    if (this.m == null)
      return; 
    this.m = null;
    this.n = false;
    for (byte b = 0; b < this.o.length; b++)
      this.j[b] = this.o[b]; 
    e(true);
  }
  
  public final void d(int paramInt) {
    if (this.m != null) {
      this.m.g(paramInt);
      return;
    } 
  }
  
  public final void c(int paramInt1, int paramInt2) {
    if (this.m != null) {
      this.m.e(paramInt1, paramInt2);
      return;
    } 
    e(paramInt1, paramInt2);
  }
  
  public void e(int paramInt1, int paramInt2) {}
  
  public final void a(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield m : Lbs;
    //   4: ifnull -> 116
    //   7: aload_0
    //   8: aload_0
    //   9: getfield m : Lbs;
    //   12: invokevirtual a : ()[Laz;
    //   15: iload_1
    //   16: iload_2
    //   17: istore #6
    //   19: istore #5
    //   21: astore #4
    //   23: astore_3
    //   24: iconst_0
    //   25: istore #7
    //   27: goto -> 85
    //   30: aload #4
    //   32: iload #7
    //   34: aaload
    //   35: ifnull -> 82
    //   38: aload #4
    //   40: iload #7
    //   42: aaload
    //   43: iload #5
    //   45: iload #6
    //   47: invokevirtual a : (II)Z
    //   50: ifeq -> 82
    //   53: aload_3
    //   54: getfield i : Lbf;
    //   57: ifnull -> 78
    //   60: aload_3
    //   61: getfield i : Lbf;
    //   64: iconst_m1
    //   65: aload #4
    //   67: iload #7
    //   69: aaload
    //   70: invokevirtual a : ()I
    //   73: invokeinterface d : (II)V
    //   78: iconst_1
    //   79: goto -> 94
    //   82: iinc #7, 1
    //   85: iload #7
    //   87: aload #4
    //   89: arraylength
    //   90: if_icmplt -> 30
    //   93: iconst_0
    //   94: ifeq -> 98
    //   97: return
    //   98: aload_0
    //   99: getfield m : Lbs;
    //   102: iload_1
    //   103: iload_2
    //   104: invokevirtual c : (II)Z
    //   107: ifeq -> 111
    //   110: return
    //   111: aload_0
    //   112: invokevirtual A : ()V
    //   115: return
    //   116: aload_0
    //   117: iload_1
    //   118: iload_2
    //   119: invokevirtual f : (II)V
    //   122: return
  }
  
  public void f(int paramInt1, int paramInt2) {}
  
  public final void b(int paramInt1, int paramInt2) {
    if (this.m != null) {
      this.m.f(paramInt1, paramInt2);
      return;
    } 
    g(paramInt1, paramInt2);
  }
  
  public void g(int paramInt1, int paramInt2) {}
  
  public final void a(br[] paramArrayOfbr, az paramaz1, az paramaz2, az paramaz3) {
    bs bs1;
    (bs1 = new bs()).a(paramArrayOfbr);
    int i = (bs1.e() > bs1.f()) ? bs1.e() : bs1.f();
    bs1.a_(-i, j() - bs1.f() + i);
    bs1.d(0, v.u - ba.a - bs1.f());
    bs1.a(this);
    a(bs1, paramaz1, paramaz2, paramaz3);
  }
  
  public void a(k paramk) {}
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ht.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */