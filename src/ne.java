/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class ne
extends ni {
    protected aw a = new aw();
    protected Image[] b;
    protected int[] c;
    private int F = -1000;
    private boolean G;
    public int d = 10;
    public int e = 0;
    public int f = 11;
    private int H = 0;
    private int I;
    private int J;

    public ne(int n2, Image[] imageArray, byte[][] byArray, int[] nArray) {
        super(n2);
        this.b = imageArray;
        this.c = nArray;
        this.h = n2;
        this.a.a(byArray);
        this.a(0);
        if (n2 == 0) {
            this.a.c(2);
        } else {
            this.a.c(0);
        }
        this.C = new ad();
        this.C.a(20);
        this.C.a(com.mg.sq.a.h);
        this.j(36);
        this.D = new n(this.a.n(), this.a.o(), this.a.p(), this.a.q());
    }

    public final int c() {
        return this.a.h();
    }

    public void a(int n2) {
        this.E = n2;
        if (n2 == 4) {
            this.a.a(false);
        } else {
            this.a.a(true);
        }
        if (n2 >= this.b.length) {
            n2 = this.b.length - 1;
        }
        this.a.d(n2);
        try {
            this.a.a(this.b[n2], this.c[n2]);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final int n() {
        return this.a.n();
    }

    public final int o() {
        return this.a.o() - this.a.q();
    }

    public final int p() {
        return this.a.p();
    }

    public final int q() {
        return this.a.q();
    }

    public final void j(int n2) {
        super.j(n2);
        this.a.j(n2);
    }

    public final void c(int n2, int n3) {
        this.a.c(n2, n3);
        this.j = n2;
        this.H = n3;
    }

    public final void d() {
        if (this.a.e().length > 4) {
            this.a(4);
        }
    }

    public final void a(int n2, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6) {
        this.w = bl2;
        if (!this.x) {
            this.x = bl3;
        }
        if (this.h == 0) {
            ne ne2 = this;
            this.s = this.g.n() + this.g.p() / 2 - ne2.a.p();
        } else {
            this.s = this.g.n() + this.g.p() / 2 - this.d;
        }
        this.k = ax.a(this.s, this.a.n(), 2);
        this.J = this.g.o() + this.g.q();
        this.I = ax.a(this.J, this.a.o(), 3);
        if (n2 < this.f) {
            n2 = this.f;
        }
        this.t = n2;
        this.i = true;
        if (this.h == 0) {
            this.a.c(2);
        } else {
            this.a.c(0);
        }
        if (bl4) {
            this.g();
            this.v = 13;
            this.u = 2;
            return;
        }
        if (this.v <= 0) {
            this.a(2);
        }
    }

    public final void a(boolean bl2, boolean bl3) {
        if (bl2) {
            this.G = bl2;
            if (this.F == -1000) {
                this.F = this.a.n();
                if (!this.C.a()) {
                    ne ne2 = this;
                    ne ne3 = ne2;
                    ne3 = this;
                    this.C.a("X\u00ed H\u1ee5t", ne2.a.n() + ne3.a.p() / 2, this.o() + 20);
                }
                this.s = this.h == 0 ? this.a.n() - 15 : this.a.n() + 15;
                this.k = 7;
                this.i = false;
                return;
            }
        } else if (this.a.e().length > 3) {
            this.a(3);
        }
    }

    public void a(Graphics graphics, int n2, int n3) {
        this.z.b(graphics);
        if (this.a.h() == 1) {
            n2 = this.b[1].getWidth() / this.c[1];
            int n4 = this.b[2].getWidth() / this.c[2];
            n2 = -(n2 - n4) / 2;
            n3 -= this.e;
        }
        this.a.a(graphics, n2, n3);
        this.z.c(graphics);
        this.C.a(graphics, n2, n3);
    }

    public final void i() {
        if (this.t > 0) {
            --this.t;
        }
        if (this.v > 0) {
            --this.v;
            if (this.v == 0) {
                this.a(this.u);
            }
        }
        this.z.i();
        switch (this.a.h()) {
            case 1: {
                this.a();
                break;
            }
            case 2: 
            case 5: {
                this.b();
                break;
            }
            case 3: {
                if (!this.a.j()) break;
                this.a(0);
            }
        }
        if (this.G) {
            if (this.i) {
                if (this.a.e(this.s, this.k)) {
                    this.a(0);
                    this.F = -1000;
                    this.G = false;
                }
            } else if (this.a.e(this.s, this.k)) {
                this.s = this.F;
                this.i = true;
                this.k = 7;
            } else if (this.k > 2) {
                this.k -= 2;
            }
        }
        this.a.i();
        this.C.b();
        this.D.a = this.a.n();
        this.D.b = this.a.o();
    }

    protected void b() {
        if (this.i) {
            if (this.a.b(this.s, this.J, this.k, this.I)) {
                this.a(1);
                return;
            }
        } else if (this.a.b(this.j, this.H, this.k, this.I)) {
            if (this.h == 0) {
                this.a.c(2);
            } else {
                this.a.c(0);
            }
            this.a(0);
        }
    }

    protected void a() {
        if (this.a.f() == 0) {
            if (this.x) {
                ak.a().a(20);
            }
            this.x = false;
            this.g.a(this.w, this.y);
        }
        if (this.a.j() && this.t == 0) {
            --this.t;
            this.s = this.j;
            this.k = ax.a(this.s, this.a.n(), 2);
            this.i = false;
            this.a(2);
            if (this.h == 0) {
                this.a.c(0);
                return;
            }
            this.a.c(2);
        }
    }

    public final void a(boolean bl2) {
    }

    public final void e() {
    }
}

