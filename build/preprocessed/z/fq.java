import javax.microedition.lcdui.Graphics;

public final class fq extends aq {
  private dm i;
  
  private int j = 0;
  
  private int k = 15;
  
  public final int a() {
    return this.j;
  }
  
  public fq(dm paramdm, int paramInt) {
    this.i = paramdm;
    d(paramInt);
    e(paramdm.a() + 15);
    r();
  }
  
  public final void c(boolean paramBoolean) {
    super.c(paramBoolean);
    if (!this.b.m() && paramBoolean) {
      if (this.i.c() <= 0)
        return; 
      ls ls;
      (ls = this.i.b()).a(this.i.b, false);
    } 
  }
  
  public final void d(boolean paramBoolean) {
    if (paramBoolean || this.g != paramBoolean) {
      this.c = true;
      a(this.i.c, this.i.b, paramBoolean);
    } 
    super.d(paramBoolean);
  }
  
  public final void q() {
    int i = this.i.c() - 1;
    a(i, this.i.c(i).k(), this.g);
    s();
  }
  
  public final void r() {
    try {
      a(0, this.i.c(0).j(), this.g);
      s();
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  private void s() {
    this.j = 0;
    for (byte b = 0; b < this.i.c; b++)
      this.j += this.i.a(b); 
  }
  
  public final boolean c(int paramInt1, int paramInt2) {
    paramInt1 -= c();
    paramInt2 -= d();
    paramInt1 -= 10;
    int i = 10;
    int j = 10;
    int k = 0;
    int m = this.i.c();
    while (k < m) {
      ls ls = this.i.b(k).a();
      i += this.i.b(k).c() + 4;
      if (paramInt2 <= i) {
        i = k;
        this.b.c(true);
        k = ls.d().d();
        paramInt2 -= j;
        for (j = 0; j < k; j++) {
          n n = ls.a(j);
          if (paramInt1 >= n.d() && paramInt1 <= n.d() + n.f() && paramInt2 >= n.e() && paramInt2 <= n.e() + n.g()) {
            if (n.c() != 0 && n.c() != 2) {
              paramInt1 = j;
              a(i, paramInt1, this.g);
              s();
              return false;
            } 
            break;
          } 
        } 
        a(i, -1, this.g);
        s();
        break;
      } 
      i += 4;
      j = i;
      k++;
    } 
    return false;
  }
  
  private void a(int paramInt1, int paramInt2, boolean paramBoolean) {
    if (this.i.c() <= 0)
      return; 
    ls ls;
    (ls = this.i.b()).a(this.i.b, false);
    this.i.c = paramInt1;
    this.i.b = paramInt2;
    (ls = this.i.b()).a(this.i.b, paramBoolean);
  }
  
  public final boolean f(int paramInt) {
    if (this.i.c() <= 0)
      return false; 
    int i;
    if ((i = this.i.b) >= 0) {
      switch (paramInt) {
        case 97:
          i = this.i.c(this.i.c).b(i);
          break;
        case 96:
          i = this.i.c(this.i.c).c(i);
          break;
        case 99:
          i = this.i.c(this.i.c).d(i);
          break;
        case 98:
          i = this.i.c(this.i.c).e(i);
          break;
        default:
          return false;
      } 
      if (i != this.i.b && i >= 0 && i < this.i.c(this.i.c).d().d()) {
        a(this.i.c, i, this.g);
        s();
        this.b.c(true);
        return true;
      } 
    } 
    if (i < 0) {
      switch (paramInt) {
        case 99:
          if (this.i.c > 0) {
            a(this.i.c - 1, this.i.c(this.i.c - 1).k(), this.g);
            s();
            ay ay;
            if (!(ay = (ay)l().l()).t())
              ay.j(-18); 
            this.b.c(true);
            return true;
          } 
          break;
        case 98:
          if (this.i.c < this.i.c() - 1) {
            a(this.i.c + 1, this.i.c(this.i.c + 1).j(), this.g);
            s();
            ay ay;
            if (!(ay = (ay)l().l()).s())
              ay.j(18); 
            this.b.c(true);
            return true;
          } 
          break;
      } 
      return false;
    } 
    return false;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.c)
      return; 
    paramInt2 += d();
    int i = paramInt1 += c();
    int j = paramInt2;
    if (this.i.a == 0) {
      cw.a(paramGraphics, paramInt1, paramInt2, e(), f(), e() - this.k, 14808319, 152707);
      paramInt1 += 10;
    } else if (this.i.a == 1) {
      cw.a(paramGraphics, paramInt1, paramInt2, e(), f(), this.k, 16775619, 8023552);
      paramInt1 += 10;
    } else {
      cw.a(paramGraphics, paramInt1, paramInt2, e(), f(), -1, 13931764, 6102397);
      paramInt1 += 10;
    } 
    paramInt2 += 10;
    int k = e() - 34;
    byte b = 0;
    int m = this.i.c() - 1;
    while (b <= m) {
      dj dj;
      if ((dj = this.i.b(b)) != null) {
        if (dj.a() != null)
          dj.a().a(paramGraphics, paramInt1, paramInt2); 
        if (dj.b() >= 0)
          oy.a(paramGraphics, dj.b(), paramInt1, paramInt2, 0); 
        if (b < m) {
          paramGraphics.setColor(13947602);
          paramInt2 += dj.c() + 4;
          paramGraphics.fillRect(paramInt1 + 5, paramInt2, k, 1);
        } 
        paramInt2 += 4;
      } 
      b++;
    } 
    j += 4;
    if (this.g && this.b.m())
      if (this.i.b < 0) {
        j += this.j + this.i.b().c();
        if (this.i.a == 2) {
          paramGraphics.drawImage(pc.e, i + e() - 20, j - 10, 0);
        } else {
          paramGraphics.drawImage(pc.f, i + e() - 20, j, 0);
        } 
      } else {
        n n = this.i.b().a(this.i.b);
        paramGraphics.drawImage(pc.e, paramInt1 + n.d() + n.f() / 2 + 6, j + 8 + this.j + n.e() + n.g() / 2, 17);
      }  
    this.c = false;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\fq.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */