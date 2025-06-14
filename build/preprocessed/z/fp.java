import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class fp extends aq {
  private dl i;
  
  private boolean j = false;
  
  private fo k;
  
  private int l = 0;
  
  public fp(dl paramdl, int paramInt, boolean paramBoolean) {
    this.i = paramdl;
    this.j = paramBoolean;
    this.k = new fo();
    int i = paramdl.a.c() + this.k.f();
    if (paramdl.g >= 0 && i < oy.d[paramdl.g])
      i = oy.d[paramdl.g]; 
    i += bx.d.a() + 26;
    int j = 0;
    if (paramdl.n)
      j = 7; 
    if (s())
      j += paramdl.p.c() + 8; 
    b(paramInt, i + j);
    if (paramdl.d != null)
      this.k.a(paramdl.d); 
    if ((paramInt = (paramdl.m.length <= 0 && go.e.equals(paramdl.c)) ? 0 : 1) != 0)
      this.k.h(1); 
    if (paramdl.k > 0 || paramdl.l)
      this.k.d(2, paramdl.k); 
    if (paramdl.i == 0) {
      this.k.d(4, paramdl.j);
    } else if (paramdl.i == 1) {
      this.k.d(3, paramdl.j);
    } 
    if (paramdl.e > 0L)
      this.k.h(5); 
    if (paramdl.h < 0)
      this.k.i(paramdl.h + 6); 
    this.k.s();
    this.k.a_(e() - this.k.e() - 5, f() - 6 - this.k.f() - j);
    if (s())
      paramdl.p.a(4, this.k.d() + this.k.f() + 6); 
  }
  
  public final void d(boolean paramBoolean) {
    if (paramBoolean || this.g != paramBoolean) {
      this.c = true;
      if (!paramBoolean)
        this.l = 0; 
      a(this.i.h, paramBoolean);
    } 
    super.d(paramBoolean);
  }
  
  public final boolean f(int paramInt) {
    dl dl1;
    int i = dl.b((dl1 = this.i).h);
    ls ls = this.i.a();
    if (i >= 0) {
      switch (paramInt) {
        case 97:
          i = ls.b(i);
          break;
        case 96:
          i = ls.c(i);
          break;
        case 99:
          i = ls.d(i);
          break;
        case 98:
          i = ls.e(i);
          break;
        default:
          return false;
      } 
      if (i < 0) {
        if ((paramInt == 98 && this.i.h < 1000) || (paramInt == 99 && this.i.h >= 1000)) {
          if (this.k.t() < 0)
            return false; 
          a(this.k.t() - 6, this.g);
          this.b.c(true);
          return true;
        } 
        return false;
      } 
    } 
    if (i >= 0 && i < ls.d().d()) {
      if (this.i.h >= 1000) {
        a(i + 1000, this.g);
      } else {
        a(i, this.g);
      } 
      this.b.c(true);
      return true;
    } 
    if (this.k.f(paramInt)) {
      this.b.c(true);
      a(this.k.t() - 6, this.g);
      return true;
    } 
    if (this.i.h < 0 && paramInt == 99) {
      if ((paramInt = this.i.a.k()) >= 0) {
        this.b.c(true);
        a(paramInt, this.g);
        return true;
      } 
      return false;
    } 
    if (this.i.h < 1000 && paramInt == 98 && s()) {
      if ((paramInt = this.i.p.j()) >= 0) {
        this.b.c(true);
        a(paramInt + 1000, this.g);
        return true;
      } 
      return false;
    } 
    return false;
  }
  
  public final void a() {
    this.l = 13;
  }
  
  public final boolean q() {
    if (s()) {
      if (this.i.h >= 1000)
        return false; 
      int j;
      if ((j = this.i.p.k()) >= 0) {
        this.b.c(true);
        a(j + 1000, this.g);
        return true;
      } 
    } 
    if (this.k.t() >= 0) {
      if (this.i.h < 0)
        return false; 
      a(this.k.t() - 6, this.g);
      this.b.c(true);
      return true;
    } 
    int i;
    if ((i = this.i.a.k()) == this.i.h)
      return false; 
    a(i, this.g);
    this.b.c(true);
    return true;
  }
  
  public final boolean r() {
    int i;
    if ((i = this.i.a.j()) == this.i.h)
      return false; 
    a(i, this.g);
    this.b.c(true);
    return true;
  }
  
  private boolean s() {
    return (this.i.p != null);
  }
  
  private void a(int paramInt, boolean paramBoolean) {
    int k;
    int i = this.i.h;
    this.i.h = paramInt;
    fp fp1 = this;
    int j = (j = bx.d.a() + 4) + 6;
    if (fp1.i.h >= 0) {
      dl dl1;
      ls ls;
      n n = (ls = fp1.i.a()).a(dl.b((dl1 = fp1.i).h));
      if (fp1.i.h >= 1000) {
        j = ls.f() + n.e() + n.g() / 2;
      } else {
        j = j + n.e() + n.g() / 2;
      } 
      k = n.g();
    } else {
      j = fp1.k.d() + 5;
      k = fp1.k.f();
    } 
    ay ay;
    k k1 = (ay = (ay)fp1.b.l()).r();
    if (j < 0) {
      ay.d(2, -1);
    } else {
      ay.d(2, 1);
    } 
    boolean bool;
    if (bool = (fp1.l() == null || fp1.l().l() == null) ? false : (((j += fp1.d() - k1.b) < 0 || j + k > k1.d) ? true : false)) {
      this.i.h = i;
      return;
    } 
    this.i.a(i).a(dl.b(i), false);
    this.i.a(paramInt).a(dl.b(paramInt), paramBoolean);
  }
  
  public final boolean c(int paramInt1, int paramInt2) {
    paramInt1 -= c();
    paramInt2 -= d();
    if (this.k.c(paramInt1, paramInt2)) {
      a(this.k.t() - 6, this.g);
      return false;
    } 
    if (s()) {
      int j = paramInt1 - 2 + this.i.p.e();
      int k = paramInt2 - this.i.p.f();
      int m = this.i.p.d().d();
      for (byte b1 = 0; b1 < m; b1++) {
        n n = this.i.p.a(b1);
        if (j >= n.d() && j <= n.d() + n.f() && k >= n.e() && k <= n.e() + n.g()) {
          if (n.c() != 0 && n.c() != 2) {
            a(b1 + 1000, this.g);
            return false;
          } 
          break;
        } 
      } 
    } 
    paramInt1 -= 2 + this.i.a.e();
    paramInt2 -= bx.d.a() + 4 + 6;
    int i = this.i.a.d().d();
    for (byte b = 0; b < i; b++) {
      n n = this.i.a.a(b);
      if (paramInt1 >= n.d() && paramInt1 <= n.d() + n.f() && paramInt2 >= n.e() && paramInt2 <= n.e() + n.g()) {
        if (n.c() != 0 && n.c() != 2) {
          a(b, this.g);
          return false;
        } 
        break;
      } 
    } 
    return false;
  }
  
  public final void n() {
    if (this.l > 0) {
      this.l--;
      if (this.g)
        this.b.c(true); 
    } 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.c)
      return; 
    paramInt2 += d();
    paramInt1 += c();
    if (this.g) {
      paramGraphics.setColor(7267055);
    } else if (this.j) {
      paramGraphics.setColor(13365492);
    } else {
      paramGraphics.setColor(15916258);
    } 
    int i = bx.d.a() + 4;
    paramGraphics.fillRect(paramInt1 + 1, paramInt2 + 1, e() - 2, i);
    int j = 0;
    if (this.i.n)
      j = 7; 
    j = f() - j;
    if (this.i.o) {
      paramGraphics.setColor(16777181);
      paramGraphics.fillRect(paramInt1 + 1, paramInt2 + i + 1, e() - 2, j - i - 2);
    } 
    pc.a(paramGraphics, paramInt1, paramInt2, e(), j, 2401717, -1);
    if (this.i.n) {
      int m = paramInt1 + 20;
      paramGraphics.drawLine(m, paramInt2 + j + 7, m - 8, paramInt2 + j - 1);
      paramGraphics.drawLine(m, paramInt2 + j + 7, m + 8, paramInt2 + j - 1);
      paramGraphics.setColor(v.am);
      paramGraphics.fillRect(m - 7, paramInt2 + j - 1, 15, 1);
    } 
    if (s()) {
      paramGraphics.setColor(13489618);
      paramGraphics.fillRect(paramInt1 + 1, paramInt2 + this.i.p.f(), e() - 2, this.i.p.c());
      this.i.p.a(paramGraphics, paramInt1 + 2, paramInt2);
    } 
    int k = paramInt2 + i + 6;
    i = paramInt1 + 2;
    if (this.i.g >= 0)
      oy.a(paramGraphics, this.i.g, i, k, 0); 
    this.i.a.a(paramGraphics, i, k);
    this.k.a(paramGraphics, paramInt1 + 2, paramInt2);
    d d = this.g ? a.h : bx.c;
    if (pc.c(paramGraphics, paramInt1 + 4, paramInt2 + 2, this.i.f)) {
      d.a(paramGraphics, this.i.c, paramInt1 + 4 + 20, paramInt2 + 3, 0);
    } else {
      d.a(paramGraphics, this.i.c, paramInt1 + 4, paramInt2 + 3, 0);
    } 
    d.a(paramGraphics, this.i.b, paramInt1 + e() - 4, paramInt2 + 3, 2);
    if (this.g && (this.l & 0x1) == 0) {
      int m;
      if (this.i.h >= 0) {
        dl dl1;
        ls ls;
        n n = (ls = this.i.a()).a(dl.b((dl1 = this.i).h));
        m = paramInt1 + ls.e() + n.d() + n.f() / 2 + 6;
        if (this.i.h >= 1000) {
          paramInt1 = paramInt2 + ls.f() + n.e() + n.g() / 2;
        } else {
          paramInt1 = k + n.e() + n.g() / 2;
        } 
      } else {
        m = paramInt1 + this.k.c() + this.k.r() + 10;
        paramInt1 = paramInt2 + this.k.d() + 5;
      } 
      paramGraphics.drawImage(pc.e, m, paramInt1, 17);
    } 
    this.c = false;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\fp.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */