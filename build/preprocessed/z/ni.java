import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ni extends nk {
  private mg a;
  
  private mg b;
  
  private mg c;
  
  private mg d;
  
  private mg e;
  
  private mg f;
  
  private mc F;
  
  private mg G;
  
  private int[] H = new int[] { -10, -10, 10, 10 };
  
  private int I;
  
  private int J;
  
  private Image K;
  
  private int L = -1000;
  
  private int M;
  
  private int N;
  
  private nr O;
  
  private int P;
  
  public ni(int paramInt, mg parammg1, mg parammg2, mg parammg3, mg parammg4, mg parammg5, mg parammg6, mc parammc, nr paramnr) {
    super(paramInt);
    this.a = parammg1;
    this.b = parammg2;
    this.c = parammg3;
    this.d = parammg5;
    this.e = parammg4;
    this.f = parammg6;
    this.F = parammc;
    this.O = paramnr;
    this.G = this.a;
    if (paramInt == 0) {
      this.G.c(2);
    } else {
      this.G.c(0);
    } 
    this.K = (mp.a()).i;
    a(0);
    this.C = new z();
    this.C.a(20);
    this.C.a(a.h);
    this.D = new k(this.G.n(), this.G.o(), this.G.p(), this.G.q());
  }
  
  public final void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5) {
    this.w = paramBoolean1;
    this.y = paramBoolean5;
    if (!this.x)
      this.x = paramBoolean2; 
    if (this.h == 0) {
      ni ni1;
      this.s = this.g.n() + this.g.p() / 2 - (ni1 = this).G.p();
    } else {
      this.s = this.g.n() + this.g.p() / 2;
    } 
    this.M = this.g.o() + this.g.q() - this.G.q();
    if (this.v <= 0 && (this.E == 0 || this.E == 6)) {
      this.k = at.a(this.s, this.G.n(), 2);
      if (this.k < 5)
        this.k = 5; 
      this.N = at.a(this.M, this.G.o(), 2);
    } 
    if (paramInt < 11)
      paramInt = 11; 
    this.t = paramInt;
    this.i = true;
    if (paramBoolean3) {
      h();
      this.v = 13;
      this.u = 2;
      return;
    } 
    if (paramBoolean4) {
      j();
      this.v = 13;
      this.u = 2;
      return;
    } 
    if (this.v <= 0 && (this.E == 0 || this.E == 6))
      a(2); 
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2) {
    if (paramBoolean1) {
      if (this.L == -1000) {
        this.L = this.G.n();
        if (this.h == 0) {
          this.s = this.G.n() - 10;
        } else {
          this.s = this.G.n() + 10;
        } 
        this.k = 5;
        this.i = false;
        a(7);
        if (!this.C.a()) {
          ni ni1;
          this.C.a("Xí Hụt", (ni1 = this).G.n() + (ni1 = this).G.p() / 2, (ni1 = this).G.o() + 20);
          return;
        } 
      } 
    } else if (paramBoolean2) {
      k();
      if (!this.C.a()) {
        ni ni1;
        this.C.a("Đỡ đòn", (ni1 = this).G.n() + (ni1 = this).G.p() / 2, (ni1 = this).G.o() + 20);
        return;
      } 
    } else {
      a(3);
    } 
  }
  
  public final void d() {
    a(4);
  }
  
  public final void a(boolean paramBoolean) {
    this.F.t = paramBoolean;
    this.F.d(2);
    a(6);
  }
  
  public final void e() {
    this.F.d(0);
    a(6);
  }
  
  public final int c() {
    return this.E;
  }
  
  public final void a(int paramInt) {
    this.v = 0;
    mg mg1 = this.G;
    this.E = paramInt;
    if (this.O != null)
      this.O.d(0); 
    if (paramInt == 0) {
      this.G = this.a;
    } else if (paramInt == 1) {
      this.G = this.b;
      if (this.O != null)
        this.O.d(2); 
    } else if (paramInt == 3) {
      this.G = this.e;
    } else if (paramInt == 4) {
      this.G = this.f;
    } else if (paramInt == 6) {
      this.G = this.F;
    } else if (paramInt == 7) {
      if (this.i) {
        this.G = this.c;
      } else {
        this.G = this.d;
      } 
    } else if (paramInt == 8) {
      this.G = this.e;
    } else {
      if (this.i) {
        this.G = this.c;
      } else {
        this.G = this.d;
      } 
      if (this.O != null)
        this.O.d(1); 
    } 
    this.G.r();
    this.G.c(mg1.n(), mg1.o());
    this.G.c(mg1.g());
    if (paramInt == 0) {
      paramInt = cv.a((mg.u[0]).length);
      this.G.a(paramInt);
    } 
  }
  
  public final int n() {
    return this.G.n();
  }
  
  public final int o() {
    return this.G.o();
  }
  
  public final int p() {
    return this.G.p();
  }
  
  public final int q() {
    return this.G.q();
  }
  
  public final void c(int paramInt1, int paramInt2) {
    this.G.c(paramInt1, paramInt2 - this.G.q());
    this.j = paramInt1;
    this.P = this.G.o();
    this.J = paramInt2 - 2;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (!this.r)
      return; 
    this.z.b(paramGraphics);
    paramGraphics.drawImage(this.K, paramInt1 + this.G.n() + this.G.p() / 2 + ((this.G.g() == 2) ? -4 : 4), this.J, 17);
    this.G.a(paramGraphics, paramInt1, paramInt2);
    this.z.c(paramGraphics);
    this.C.a(paramGraphics, paramInt1, paramInt2);
    this.A.a(paramGraphics);
    this.B.a(paramGraphics);
  }
  
  public final void i() {
    int i;
    if (!this.r)
      return; 
    if (this.t > 0)
      this.t--; 
    if (this.v > 0) {
      this.v--;
      if (this.v == 0)
        a(this.u); 
    } 
    this.z.i();
    this.A.i();
    this.B.i();
    switch (this.E) {
      case 1:
        if (this.G.f() == (this.G.e()[this.G.h()]).length - 6) {
          if (this.x)
            ag.a().a(20); 
          this.x = false;
          this.g.a(this.w, this.y);
        } 
        if (this.G.j() && this.t == 0) {
          this.t--;
          this.s = this.j;
          this.M = this.P;
          this.I = 0;
          this.k = at.a(this.s, this.G.n(), 2);
          this.N = at.a(this.M, this.G.o(), 2);
          this.i = false;
          a(5);
        } 
        break;
      case 2:
        if (this.i) {
          if (this.G.b(this.s, this.M, this.k, this.N))
            a(1); 
          break;
        } 
        this.G.g(this.P + this.H[this.I++]);
        if (this.G.e(this.j, this.k)) {
          this.G.g(this.P);
          a(0);
        } 
        break;
      case 5:
        this.G.g(this.P + this.H[this.I++]);
        if (this.G.e(this.j, this.k)) {
          this.G.g(this.P);
          a(0);
        } 
        break;
      case 3:
        if (this.G.j())
          a(0); 
        break;
      case 6:
        if ((i = this.F.h()) == 2 && this.F.j())
          a(0); 
        break;
      case 7:
        if (this.i) {
          if (this.G.e(this.s, this.k)) {
            a(0);
            this.L = -1000;
          } 
          break;
        } 
        if (this.G.e(this.s, this.k)) {
          this.i = true;
          a(7);
          this.s = this.L;
          this.k = 5;
          break;
        } 
        if (this.k > 2)
          this.k -= 2; 
        break;
    } 
    this.G.i();
    this.C.b();
    this.D.a = this.G.n();
    this.D.b = this.G.o();
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ni.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */