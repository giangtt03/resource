/*
 * Decompiled with CFR 0.152.
 */
public final class li
extends aw {
    private static int[][] s;
    private static int[][] t;

    static {
        int[][] nArrayArray = new int[4][];
        int[] nArray = new int[6];
        nArray[2] = 95;
        nArray[3] = 11;
        nArray[5] = 54;
        nArrayArray[0] = nArray;
        int[] nArray2 = new int[6];
        nArray2[1] = 11;
        nArray2[2] = 95;
        nArray2[3] = 19;
        nArray2[5] = 43;
        nArrayArray[1] = nArray2;
        int[] nArray3 = new int[6];
        nArray3[1] = 30;
        nArray3[2] = 95;
        nArray3[3] = 43;
        nArray3[5] = 17;
        nArrayArray[2] = nArray3;
        int[] nArray4 = new int[6];
        nArray4[1] = 73;
        nArray4[2] = 95;
        nArray4[3] = 34;
        nArray4[5] = 7;
        nArrayArray[3] = nArray4;
        s = nArrayArray;
        int[][] nArrayArray2 = new int[1][];
        int[] nArray5 = new int[9];
        nArray5[2] = 1;
        nArray5[3] = 1;
        nArray5[4] = 2;
        nArray5[5] = 2;
        nArray5[6] = 3;
        nArray5[7] = 3;
        nArray5[8] = 3;
        nArrayArray2[0] = nArray5;
        t = nArrayArray2;
    }

    public li() {
        mn.a().c();
        this.a(mn.a().n, s);
        this.a(t);
        this.j(33);
        this.a(false);
        this.r = false;
        this.o = 95;
        this.p = 62;
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

