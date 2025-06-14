import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class ha extends al implements bf {
  private at k;
  
  private at l;
  
  private k m;
  
  private k n;
  
  private k o;
  
  private int p = 0;
  
  private int q = 0;
  
  private k r;
  
  private k s;
  
  private boolean t;
  
  private int u = 20;
  
  private int v = 8;
  
  private int w = 0;
  
  private int x = 0;
  
  private boolean y;
  
  private int z = 20;
  
  private boolean A = false;
  
  private lh B;
  
  private lh C;
  
  private ol D = null;
  
  private int E;
  
  private hi F = null;
  
  private String G;
  
  private String H;
  
  private String I;
  
  private boolean J = false;
  
  private int K = 2000;
  
  private bf L;
  
  private int M;
  
  private int N;
  
  public ha(at paramat1, at paramat2, boolean paramBoolean1, boolean paramBoolean2, int paramInt, bf parambf) {
    super(1);
    try {
      this.M = 99030;
      parambf = parambf;
      ha ha1;
      (ha1 = this).L = parambf;
      this.C = go.k;
      a((ba)null);
      this.z = 20;
      this.A = false;
      this.k = paramat1;
      this.l = paramat2;
      this.y = paramBoolean1;
      this.p = this.C.g;
      this.t = paramBoolean2;
      int i = (this.f - 200) / 2;
      int j = (this.g - 164) / 2;
      this.m = new k(i - (this.u << 1), j, 200, 68);
      this.n = new k((this.f - 20) / 2, j + 68 + 4, 20, 20);
      this.o = new k(i + (this.u << 1), j + 68 + 8 + 20, 200, 68);
      this.w = 4;
      this.x = this.o.c - 58 - this.w;
      this.r = new k(this.w, this.m.b + this.w, 58, 68 - (this.w << 1));
      this.s = new k(this.x, this.o.b + this.w, 58, 68 - (this.w << 1));
      this.H = a.a(this.C.b, bx.d, 100);
      if (!this.y) {
        if (paramBoolean2) {
          ((as)paramat1).c(2);
          ((ki)paramat2).b(2);
        } else {
          ((as)paramat1).c(0);
          ((ki)paramat2).b(3);
        } 
        this.q = ((ki)paramat2).f.c;
        this.N = ((ki)paramat2).f.e;
        if (this.N < 3) {
          this.G = "Siêu gà";
        } else if (this.N < 7) {
          this.G = "Bờm";
        } else if (this.N < 10) {
          this.G = "Ma lanh";
        } else if (this.N == 11) {
          this.G = "Tốc chiến";
        } else {
          this.G = "Tuyệt đỉnh";
        } 
        this.I = a.a(((ki)paramat2).f.b, bx.d, 100);
      } else if (paramBoolean2) {
        ((as)paramat1).c(2);
        ((as)paramat2).c(0);
      } else {
        ((as)paramat1).c(0);
        ((as)paramat2).c(2);
      } 
      this.E = bx.d.b() - pc.h.getHeight();
      this.F = new hi();
      this.F.c(this.n.a + this.n.c / 2, this.n.b + this.n.d / 2);
      this.F.a();
      b(true);
      b(191919);
      return;
    } catch (Throwable throwable) {
      ct.b("combat dialog");
      return;
    } 
  }
  
  public ha(lh paramlh1, lh paramlh2, boolean paramBoolean1, boolean paramBoolean2, int paramInt, bf parambf) {
    super(1);
    this.M = 99030;
    bf bf1 = parambf;
    ha ha1;
    (ha1 = this).L = bf1;
    this.C = paramlh1;
    this.B = paramlh2;
    a((ba)null);
    this.z = 20;
    this.A = false;
    mg mg1 = mb.a(paramlh1, false);
    this.k = mg1;
    mg mg2 = mb.a(paramlh2, false);
    this.l = mg2;
    this.y = true;
    this.p = this.C.g;
    this.t = paramBoolean2;
    int i = (this.f - 200) / 2;
    int j = (this.g - 164) / 2;
    this.m = new k(i - (this.u << 1), j, 200, 68);
    this.n = new k((this.f - 20) / 2, j + 68 + 4, 20, 20);
    this.o = new k(i + (this.u << 1), j + 68 + 8 + 20, 200, 68);
    this.w = 4;
    this.x = this.o.c - 58 - this.w;
    this.r = new k(this.w, this.m.b + this.w, 58, 68 - (this.w << 1));
    this.s = new k(this.x, this.o.b + this.w, 58, 68 - (this.w << 1));
    this.H = a.a(this.C.b, bx.d, 100);
    if (paramBoolean2) {
      mg1.c(2);
      mg2.c(0);
    } else {
      mg1.c(0);
      mg2.c(2);
    } 
    this.q = this.B.g;
    this.I = a.a(this.B.c, bx.d, 100);
    this.E = bx.d.b() - pc.h.getHeight();
    this.F = new hi();
    this.F.c(this.n.a + this.n.c / 2, this.n.b + this.n.d / 2);
    this.F.a();
    b(true);
    b(191919);
  }
  
  public final void a(lh paramlh) {
    this.B = paramlh;
    this.q = paramlh.g;
    this.I = a.a(paramlh.c, bx.d, 100);
  }
  
  protected final void g() {
    if (this.J)
      return; 
    if (this.u > 0) {
      this.u -= this.v;
      this.m.a += this.v;
      this.o.a -= this.v;
      this.v--;
      if (this.v <= 0)
        this.v = 1; 
      if (this.u < 0) {
        this.m.a += this.u;
        this.o.a -= this.u;
        this.u = 0;
      } 
      this.m.a += this.w;
      this.o.a += this.x;
    } else {
      this.z--;
      if (this.z <= 0) {
        if (this.A) {
          if (this.D != null) {
            this.D = null;
            System.gc();
          } 
          if (this.L != null)
            this.L.d(a.s().d().h(), this.M); 
          ag.b().e(h());
          this.A = false;
          this.J = true;
        } 
        this.z = 0;
      } 
    } 
    if (this.k != null)
      this.k.i(); 
    if (this.l != null)
      this.l.i(); 
    if (this.F != null)
      this.F.i(); 
    this.K--;
    if (this.K < 0) {
      this.J = true;
      ag.b().b(this, false);
      ol ol1;
      if (this.D != null && !this.y && (ol1 = this.D).p != null && ol1.p.b() == 1)
        ((om)ol1.p).q(); 
    } 
  }
  
  public final void c(Graphics paramGraphics) {
    if (this.J)
      return; 
    int i = v.aj;
    if (this.N == 11)
      i = 16629181; 
    pc.c(paramGraphics, this.m.a, this.m.b, this.m.c, this.m.d, i);
    pc.c(paramGraphics, this.o.a, this.o.b, this.o.c, this.o.d, i);
    paramGraphics.drawRegion(pc.d, 39, 0, 68, 48, 2, this.m.a + this.m.c - 3, this.r.b + this.r.d, 40);
    paramGraphics.drawRegion(pc.d, 39, 0, 68, 48, 0, this.o.a + 3, this.s.b + this.s.d, 36);
    if (this.k != null) {
      k k1;
      boolean bool;
      if (!this.t) {
        k1 = this.s;
        bool = true;
      } else {
        k1 = this.r;
        bool = true;
      } 
      if (this.k instanceof ki) {
        ((ki)this.k).b(paramGraphics, k1.a + 4 + (k1.c - this.k.p()) / 2, k1.b + (k1.d - this.k.q()) / 2);
      } else {
        this.k.a(paramGraphics, k1.a + 4 + (k1.c - this.k.p()) / 2, k1.b + (k1.d - this.k.q()) / 2);
      } 
      a(paramGraphics, k1, this.p, this.C.G, this.H, bool, this.C.Q);
    } 
    if (this.l != null) {
      k k1;
      byte b;
      if (!this.t) {
        k1 = this.r;
        b = 1;
      } else {
        k1 = this.s;
        b = -1;
      } 
      if (this.l instanceof ki) {
        ((ki)this.l).b(paramGraphics, k1.a + 4 + (k1.c - this.l.p()) / 2, k1.b + (k1.d - this.l.q()) / 2);
      } else {
        this.l.a(paramGraphics, k1.a + 4 + (k1.c - this.l.p()) / 2, k1.b + k1.d - this.l.q() - 3);
      } 
      if (!this.y) {
        ki ki = (ki)this.l;
        a(paramGraphics, k1, this.q, ki.f.d, this.I, b, "IQ: " + this.G);
      } else if (this.B != null) {
        a(paramGraphics, k1, this.q, this.B.G, this.I, b, this.B.Q);
      } 
    } 
    this.F.a(paramGraphics);
  }
  
  private void a(Graphics paramGraphics, k paramk, int paramInt1, int paramInt2, String paramString1, int paramInt3, String paramString2) {
    int i = paramk.a + paramk.c + 4;
    int j = paramk.b + 5 + 3;
    if (paramInt3 == 1) {
      pc.b(paramGraphics, i, j + this.E, paramInt1);
      bx.d.c(true);
      bx.d.a(paramGraphics, paramString1, i + 17, j, 0);
      bx.d.c(false);
      j += bx.d.b() + 5;
      bx.d.a(paramGraphics, "Cấp: " + paramInt2, i, j, 0);
      j += bx.d.b() + 5;
      bx.d.a(paramGraphics, paramString2, i, j, 0);
      return;
    } 
    i = paramk.a - 4;
    j = paramk.b + 5 + 3;
    pc.b(paramGraphics, i - pc.h.getWidth() / 3, j + this.E, paramInt1);
    bx.d.c(true);
    bx.d.a(paramGraphics, paramString1, i - 17, j, 2);
    bx.d.c(false);
    j += bx.d.b() + 5;
    bx.d.a(paramGraphics, "Cấp: " + paramInt2, i, j, 2);
    j += bx.d.b() + 5;
    bx.d.a(paramGraphics, paramString2, i, j, 2);
  }
  
  public final void d(int paramInt1, int paramInt2) {}
  
  public final void t() {
    this.A = true;
  }
  
  public final void a(ol paramol) {
    this.D = paramol;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ha.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */