/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import com.mg.sq.a;
import java.util.Calendar;
import javax.microedition.lcdui.Graphics;

public final class ez
extends au
implements bj {
    private int i;
    private int j;
    private int[] k = new int[]{2, 2, 4};
    private String[] l = new String[]{"", "", ""};
    private gu m = new gu();

    public ez() {
        this.m.a(this);
        this.q();
    }

    private void q() {
        this.l[0] = this.m.w();
        this.l[1] = this.m.y();
        this.l[2] = this.m.x();
    }

    public final boolean f(int n2) {
        if (n2 == 97) {
            --this.i;
            if (this.i < 0) {
                this.i = 2;
            }
            this.j = 0;
            return true;
        }
        if (n2 == 96) {
            ++this.i;
            if (this.i > 2) {
                this.i = 0;
            }
            this.j = 0;
            return true;
        }
        if (n2 == 95) {
            com.mg.sq.a.q().a(this.m);
            return true;
        }
        if (n2 >= 148 && n2 <= 157) {
            int n3;
            int n4;
            String string = this.l[this.i].substring(0, this.j);
            Object object = this.l[this.i].substring(this.j + 1);
            String string2 = String.valueOf(string == null ? "" : string) + (n2 - 148) + (String)(object == null ? "" : object);
            int n5 = Integer.parseInt(string2);
            int n6 = this.i;
            object = this;
            switch (n6) {
                case 0: {
                    n4 = 1;
                    break;
                }
                case 1: {
                    n4 = 1;
                    break;
                }
                default: {
                    n4 = ((ez)object).m.A();
                }
            }
            int n7 = n4;
            n6 = this.i;
            object = this;
            switch (n6) {
                case 0: {
                    int n8 = ((ez)object).m.z();
                    break;
                }
                case 1: {
                    int n8 = 12;
                    break;
                }
                default: {
                    int n8 = n3 = ((ez)object).m.B();
                }
            }
            if (n5 < n7) {
                n5 = n7;
            }
            if (n5 > n3) {
                n5 = n3;
            }
            int n9 = n5;
            n5 = this.i;
            n6 = n9;
            ez ez2 = this;
            if (n5 == 1) {
                ez2.m.a(ez2.m.t(), n6, ez2.m.u());
            } else if (n5 == 2) {
                ez2.m.a(ez2.m.t(), ez2.m.v(), n6);
            } else {
                ez2.m.a(n6, ez2.m.v(), ez2.m.u());
            }
            ez2.q();
            ++this.j;
            if (this.j >= this.k[this.i]) {
                ++this.i;
                if (this.i >= 2) {
                    this.i = 2;
                }
                this.j = 0;
            }
            return true;
        }
        return super.f(n2);
    }

    public final boolean c(int n2, int n3) {
        com.mg.sq.a.q().a(this.m);
        return true;
    }

    public final void a(Graphics graphics, int n2, int n3) {
        oz.a(graphics, this.c() + n2, this.d() + n3, this.e(), this.f(), this.g);
        String string = "";
        String string2 = this.l[0];
        if (this.i == 1) {
            string = String.valueOf(this.l[0]) + " - ";
            string2 = this.l[1];
        } else if (this.i == 2) {
            string = String.valueOf(this.l[0]) + " - " + this.l[1] + " - ";
            string2 = this.l[2];
        }
        String string3 = String.valueOf(this.l[0]) + " - " + this.l[1] + " - " + this.l[2];
        n2 = n2 + this.c() + (this.e() - ca.d.a(string3)) / 2;
        if (this.g) {
            graphics.setColor(16048180);
            graphics.fillRect(n2 + ca.d.a(string) - 2, n3 + this.d() + 2, ca.d.a(string2) + 3, this.f() - 4);
        }
        ca.d.a(graphics, string3, n2, n3 + this.d() + 2, 0);
    }

    public final long a() {
        Calendar calendar = l.a;
        ez ez2 = this;
        calendar.set(5, Integer.parseInt(ez2.l[0]));
        ez2 = this;
        calendar.set(2, Integer.parseInt(ez2.l[1]) - 1);
        ez2 = this;
        calendar.set(1, Integer.parseInt(ez2.l[2]));
        return calendar.getTime().getTime();
    }

    public final void d(int n2, int n3) {
        if (n3 == -1099) {
            this.q();
        }
        this.j = 0;
        com.mg.sq.a.q().a(false);
    }
}

