import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class hk extends al implements bf {
  private int k = 10;
  
  private ls l;
  
  private Image[] m;
  
  private String n;
  
  private int o;
  
  private int p;
  
  private int q;
  
  private int r;
  
  private eb[] s;
  
  private bs t;
  
  public hk(String paramString1, String paramString2, ee[] paramArrayOfee, eb[] paramArrayOfeb) {
    super(1);
    this.n = paramString1;
    this.s = paramArrayOfeb;
    if (paramArrayOfee == null)
      paramArrayOfee = new ee[0]; 
    this.m = new Image[paramArrayOfee.length];
    try {
      for (byte b1 = 0; b1 < this.m.length; b1++)
        this.m[b1] = Image.createImage((paramArrayOfee[b1]).h, 0, (paramArrayOfee[b1]).h.length); 
    } catch (Throwable throwable) {
      (paramString1 = null).printStackTrace();
    } 
    this.l = new ls(bx.d, paramString2, 0, 0, v.t - 4, bx.d.a(), 1);
    this.r = v.u - bx.d.a() - ba.a - this.k;
    this.q = this.l.c() + this.k;
    for (byte b = 0; b < this.m.length; b++) {
      if (this.m[b] != null)
        this.q += this.k + this.m[b].getHeight(); 
    } 
    a(new ba());
    t();
    a(this);
  }
  
  private void t() {
    m();
    if (this.s == null || this.s.length < 2) {
      bd bd = new bd("Đóng", -2);
      hk hk1;
      (hk1 = this).b(bd, true);
      if (this.s != null && this.s.length > 0) {
        bd = new bd(this.s[0].e(), 1);
        (hk1 = this).a(bd, true);
        return;
      } 
    } else {
      gb gb = new gb(-1, 0);
      hk hk1;
      (hk1 = this).a(gb, true);
    } 
  }
  
  public final void c(int paramInt) {
    if (this.q <= this.r)
      return; 
    if (paramInt == 99) {
      e(-bx.d.a());
      return;
    } 
    if (paramInt == 98) {
      e(bx.d.a());
      e(true);
    } 
  }
  
  public final void c(int paramInt1, int paramInt2) {
    if (this.q < this.r)
      return; 
    e(-paramInt2);
  }
  
  protected final void g() {
    if (this.o != this.p) {
      int i;
      if (Math.abs(i = this.o - this.p) > 4)
        i /= 4; 
      this.p += i;
      e(true);
    } 
    if (this.t != null)
      this.t.n(); 
  }
  
  private void e(int paramInt) {
    this.o += paramInt;
    if (this.o < 0)
      this.o = 0; 
    if (this.q - this.o < this.r)
      this.o = this.q - this.r; 
    e(true);
  }
  
  public final void c(Graphics paramGraphics) {
    if (!this.h && this.t == null)
      return; 
    paramGraphics.setColor(v.am);
    paramGraphics.fillRect(a(), c(), i(), j());
    paramGraphics.drawImage(pc.d, a() + i(), c() + j() - ba.a, 40);
    pc.a(paramGraphics, 4, 20, v.t - 8);
    bx.d.c(true);
    bx.d.a(paramGraphics, this.n, i() / 2, 2, 1);
    bx.d.c();
    int i = bx.d.a() + this.k;
    paramGraphics.setClip(0, i, v.t, this.r);
    i -= this.p;
    for (byte b = 0; b < this.m.length; b++) {
      if (this.m[b] != null) {
        paramGraphics.drawImage(this.m[b], v.t / 2, i, 17);
        i += this.k + this.m[b].getHeight();
      } 
    } 
    this.l.a(paramGraphics, 2, i);
    paramGraphics.setClip(0, 0, v.t, v.u);
    if (this.t != null)
      this.t.a(paramGraphics, 0, 0); 
    e(false);
  }
  
  public final void d(int paramInt1, int paramInt2) {
    hk hk1;
    br br;
    bs bs1;
    hk hk2;
    br[] arrayOfBr1;
    int i;
    gb gb;
    br[] arrayOfBr2;
    switch (paramInt2) {
      case -1:
        (hk1 = this).m();
        bs1 = new bs();
        arrayOfBr2 = new br[(arrayOfBr1 = oi.a(hk1.s)).length + 1];
        System.arraycopy(arrayOfBr1, 0, arrayOfBr2, 0, arrayOfBr1.length);
        arrayOfBr2[arrayOfBr1.length] = new br("Đóng", 0);
        bs1.a(arrayOfBr2);
        i = (bs1.e() > bs1.f()) ? bs1.e() : bs1.f();
        bs1.a_(-i, hk1.j() - bs1.f() + i);
        bs1.d(0, v.u - ba.a - bs1.f());
        bs1.a(hk1);
        bs1 = bs1;
        (hk1 = hk1).t = bs1;
        hk1.t.a(hk1);
        gb = new gb(-3, 2);
        (hk2 = hk1).a(gb, true);
        gb = new gb(-4, 3);
        (hk2 = hk1).b(gb, true);
        hk1.e(true);
        return;
      case -2:
        a.s().a(false);
        return;
      case -3:
        this.t.f(95);
        return;
      case -4:
        u();
        return;
      case 1:
        a.m.a(this.s[0]);
        return;
      case 0:
        br = this.t.r();
        u();
        if (!a.m.b(br.b(), this.s))
          a.s().a(false); 
        break;
    } 
  }
  
  private void u() {
    this.t = null;
    t();
    e(true);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\hk.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */