/*
 * Decompiled with CFR 0.152.
 */
public final class lh
extends aw {
    private static int[][] s;

    static {
        int[][] nArrayArray = new int[1][];
        int[] nArray = new int[6];
        nArray[2] = 1;
        nArray[3] = 1;
        nArray[4] = 2;
        nArray[5] = 2;
        nArrayArray[0] = nArray;
        s = nArrayArray;
    }

    public lh() {
        this.a(mn.a().j, 3);
        this.a(s);
        this.j(33);
        this.a(false);
        this.r = false;
    }

    public final void d(int n2, int n3) {
        this.c(n2, n3);
        this.r = true;
        this.a(0);
    }

    public final void k() {
        if (this.j()) {
            this.r = false;
        }
    }
}

