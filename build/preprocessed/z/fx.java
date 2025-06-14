import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class fx extends aq {
  private a i;
  
  private int j = 0;
  
  private String k;
  
  private int l;
  
  private k m;
  
  private boolean n = false;
  
  private bh o = null;
  
  public fx(String paramString) {
    this.k = paramString;
    this.d = new k(0, 0, v.t - 20, v.u);
    this.m = new k(0, 0, this.d.c, 9 + bx.d.a());
    this.i = new a();
    this.l = this.m.d + 5;
  }
  
  public final void d(boolean paramBoolean) {
    super.d(paramBoolean);
    this.c = true;
  }
  
  public final void a(ey paramey) {
    paramey.a(this);
    paramey.a(9, this.l, 13, 13);
    this.l += paramey.f() + 5;
    this.d.d = this.l + 5;
    e(this.d.d);
    int i = this.i.d();
    this.i.a(paramey);
    if (this.i.d() == 1) {
      this.j = 0;
      paramey.d(true);
      paramey.e(true);
    } else if (paramey.a()) {
      for (byte b = 0; b < i; b++)
        ((ey)this.i.b(b)).e(false); 
    } 
    if (paramey.m()) {
      this.j = i;
      for (byte b = 0; b < i; b++)
        ((ey)this.i.b(b)).d(false); 
    } 
  }
  
  public final void b(int paramInt1, int paramInt2) {
    super.b(paramInt1, paramInt2);
    this.m = new k(0, 0, this.d.c, 9 + bx.d.a());
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.a(paramInt1, paramInt2, paramInt3, paramInt4);
    this.m = new k(this.d.a, this.d.b, this.d.c, 9 + bx.d.a());
    this.k = a.a(this.k, this.d.c - 4);
  }
  
  public final boolean f(int paramInt) {
    ey ey;
    byte b;
    if (this.i.d() <= 0)
      return false; 
    int i = this.j;
    int j = 0;
    switch (paramInt) {
      case 98:
        if (this.j < this.i.d() - 1) {
          this.j++;
          j = 1;
        } 
        break;
      case 99:
        if (this.j > 0) {
          this.j--;
          j = 1;
        } 
        break;
      case 95:
        (ey = (ey)this.i.b(this.j)).e(true);
        b = 0;
        j = this.i.d();
        while (b < j) {
          if (b != this.j)
            ((ey)this.i.b(b)).e(false); 
          b++;
        } 
        if (this.b != null)
          this.b.c(true); 
        c(true);
        j = 1;
        break;
    } 
    if (i != this.j) {
      ((ey)this.i.b(i)).d(false);
      ((ey)this.i.b(this.j)).d(true);
      this.c = true;
      if (this.b != null)
        this.b.c(true); 
    } 
    return j;
  }
  
  public final boolean c(int paramInt1, int paramInt2) {
    paramInt1 -= c();
    paramInt2 -= d();
    byte b = 0;
    int i = this.i.d();
    while (b < i) {
      ey ey;
      if ((ey = (ey)this.i.b(b)).h().a(paramInt1, paramInt2)) {
        this.j = b;
        ey.d(true);
        ey.e(true);
        for (paramInt2 = 0; paramInt2 < i; paramInt2++) {
          if (b != paramInt2) {
            ey ey1;
            (ey1 = (ey)this.i.b(paramInt2)).d(false);
            ey1.e(false);
          } 
        } 
        c(true);
        if (this.b != null)
          this.b.c(true); 
        break;
      } 
      b++;
    } 
    return true;
  }
  
  public final void h(int paramInt) {
    for (byte b = 0; b < this.i.d(); b++) {
      ey ey;
      if ((ey = (ey)this.i.b(b)).q() == 0) {
        ey.e(true);
      } else {
        ey.e(false);
      } 
    } 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.c)
      return; 
    if (m()) {
      pc.a(paramGraphics, c() + paramInt1, d() + paramInt2, e(), f(), 7070703, -1);
      paramGraphics.setColor(7267055);
      paramGraphics.fillRect(c() + paramInt1, d() + paramInt2, this.m.c, this.m.d);
    } 
    paramInt1 += c();
    int i = (paramInt2 += d()) + 4;
    int j = paramInt1 + 4;
    bx.d.c(true);
    bx.d.a(paramGraphics, this.k, j, i, 0);
    bx.d.c(false);
    j = 0;
    int m = this.i.d();
    while (j < m) {
      ey ey = (ey)this.i.b(j);
      if (j == this.j) {
        paramGraphics.setColor(16711680);
        paramGraphics.fillRect(paramInt1 + ey.c(), paramInt2 + ey.d(), ey.e(), ey.f());
      } 
      ey.a(paramGraphics, paramInt1, paramInt2);
      j++;
    } 
    this.c = false;
  }
  
  public final ey a() {
    for (byte b = 0; b < this.i.d(); b++) {
      ey ey;
      if ((ey = (ey)this.i.b(b)).a())
        return ey; 
    } 
    return null;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\fx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */