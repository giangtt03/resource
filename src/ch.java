/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Font
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 *  javax.microedition.lcdui.game.GameCanvas
 */
import com.mg.smsgame.MGMIDlet;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.GameCanvas;

public final class ch
extends GameCanvas
implements Runnable {
    private int a = 0;
    private Graphics b;
    private Image c;
    private int d;
    private int e;
    private int f;
    private int g = 0;
    private int h = 0;
    private int i = 0;
    private int j = 10;
    private int k = 1;
    private int l;
    private int m = 1;
    private int n = 160 / this.j;
    private boolean o = true;
    private boolean p = false;
    private int q = 0;
    private Font r = null;

    public ch() {
        super(false);
        this.setFullScreenMode(true);
        this.r = Font.getFont((int)0, (int)0, (int)8);
        this.q = 0;
        this.b = this.getGraphics();
        this.e = this.getWidth();
        this.d = this.getHeight();
        ca.a();
        this.c = f.a("/_mglogo");
        this.f = this.c.getHeight() / 5;
        this.n = this.c.getHeight() / 2 / this.j + 1;
        if (!z.T) {
            new Thread(this).start();
            return;
        }
        this.a();
    }

    public final void run() {
        while (this.o || !MGMIDlet.f().c) {
            Object object;
            this.b();
            if (this.q == 0) {
                if (this.g < this.n) {
                    object = this;
                    this.l = ((ch)object).d / 2 - ((ch)object).f;
                    ((ch)object).b.setColor(0xFFFFFF);
                    ((ch)object).b.fillRect(0, 0, ((ch)object).e, ((ch)object).l - ((ch)object).j / 2 - ((ch)object).g * ((ch)object).j);
                    ((ch)object).b.fillRect(0, ((ch)object).l + ((ch)object).j / 2 + ((ch)object).g * ((ch)object).j, ((ch)object).e, ((ch)object).d - ((ch)object).l + ((ch)object).j / 2 + ((ch)object).g * ((ch)object).j);
                    int n2 = ((ch)object).l - ((ch)object).j / 2 - ((ch)object).g * ((ch)object).j;
                    ((ch)object).b.fillRect(0, n2, ((ch)object).e, ((ch)object).j / 2 - ((ch)object).k);
                    n2 = n2 + 10 - (((ch)object).j / 2 - ((ch)object).k);
                    ((ch)object).b.fillRect(0, n2, ((ch)object).e, ((ch)object).j / 2 - ((ch)object).k);
                    n2 = ((ch)object).l - ((ch)object).j / 2 + ((ch)object).g * ((ch)object).j;
                    ((ch)object).b.fillRect(0, n2, ((ch)object).e, ((ch)object).j / 2 - ((ch)object).k);
                    n2 = n2 + 10 - (((ch)object).j / 2 - ((ch)object).k);
                    ((ch)object).b.fillRect(0, n2, ((ch)object).e, ((ch)object).j / 2 - ((ch)object).k);
                    ((ch)object).k += ((ch)object).m;
                    if (((ch)object).k >= ((ch)object).j / 2 || ((ch)object).k <= 0) {
                        if (((ch)object).i >= 0) {
                            ((ch)object).k = 0;
                            ++((ch)object).g;
                            ((ch)object).m = 1;
                            ((ch)object).i = 0;
                        } else {
                            ++((ch)object).i;
                            ((ch)object).m = -((ch)object).m;
                        }
                    }
                }
                this.flushGraphics();
                ++this.a;
                if (this.a > 20) {
                    this.p = false;
                }
                if (this.a > 30) {
                    object = this;
                    this.c = f.a("/_partnerLogo");
                    this.q = 1;
                    this.a = 0;
                }
            } else {
                this.flushGraphics();
                ++this.a;
                if (this.a > 30) {
                    this.o = false;
                }
            }
            try {
                Thread.sleep(40L);
            }
            catch (InterruptedException interruptedException) {
                object = interruptedException;
                interruptedException.printStackTrace();
            }
        }
        this.b();
        this.a();
    }

    private void a() {
        z.t = this.getWidth();
        z.u = this.getHeight();
        MGMIDlet.f().c();
        ch ch2 = this;
        this.c = null;
        ch2.r = null;
        System.gc();
    }

    private void b() {
        if (z.T) {
            return;
        }
        this.e = this.getWidth();
        this.d = this.getHeight();
        this.b.setClip(0, 0, this.e, this.d);
        this.b.setColor(0xFFFFFF);
        this.b.fillRect(0, 0, this.e, this.d);
        if (this.q == 0) {
            this.b.setColor(0x666666);
            this.b.setFont(this.r);
            this.b.drawString("www.microgame.com.vn", this.e / 2, this.d - 5, 65);
            this.b.drawImage(this.c, this.e / 2, this.d / 2 - this.f, 3);
            return;
        }
        this.b.drawImage(this.c, (this.e - this.c.getWidth()) / 2, (this.d - this.c.getHeight()) / 2, 0);
    }

    protected final void keyPressed(int n2) {
        if (this.q == 1) {
            this.a = 30;
        }
    }

    protected final void pointerPressed(int n2, int n3) {
        if (this.q == 1) {
            this.a = 30;
        }
    }
}

