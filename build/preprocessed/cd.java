/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class cd
extends d {
    private Image a;
    private int[] b;
    private int[] c;
    private int[] d;
    private int[] e;
    private int[] f;
    private String g = " 0123456789.,:!?()+-*/#$%abcdefghijklmnopqrstuvwxyz\u00e1\u00e0\u1ea3\u00e3\u1ea1\u0103\u1eaf\u1eb1\u1eb3\u1eb5\u1eb7\u00e2\u1ea5\u1ea7\u1ea9\u1eab\u1ead\u00e9\u00e8\u1ebb\u1ebd\u1eb9\u00ea\u1ebf\u1ec1\u1ec3\u1ec5\u1ec7\u00ed\u00ec\u1ec9\u0129\u1ecb\u00f3\u00f2\u1ecf\u00f5\u1ecd\u00f4\u1ed1\u1ed3\u1ed5\u1ed7\u1ed9\u01a1\u1edb\u1edd\u1edf\u1ee1\u1ee3\u00fa\u00f9\u1ee7\u0169\u1ee5\u01b0\u1ee9\u1eeb\u1eed\u1eef\u1ef1\u00fd\u1ef3\u1ef7\u1ef9\u1ef5\u0111ABCD\u0110EFGHIJKLMNOPQRSTUVWXYZ\u00c1\u00c0\u1ea2\u00c3\u1ea0\u0102\u1eae\u1eb0\u1eb2\u1eb4\u1eb6\u00c2\u1ea4\u1ea6\u1ea8\u1eaa\u1eac\u00c9\u00c8\u1eba\u1ebc\u1eb8\u00ca\u1ebe\u1ec0\u1ec2\u1ec4\u1ec6\u00cd\u00cc\u1ec8\u0128\u1eca\u00d3\u00d2\u1ece\u00d5\u1ecc\u00d4\u1ed0\u1ed2\u1ed4\u1ed6\u1ed8\u01a0\u1eda\u1edc\u1ede\u1ee0\u1ee2\u00da\u00d9\u1ee6\u0168\u1ee4\u01af\u1ee8\u1eea\u1eec\u1eee\u1ef0\u00dd\u1ef2\u1ef6\u1ef8\u1ef4\\\"@<=>;_&'`^~{}";
    private String h = "";
    private int i;

    public cd() {
        this(f.a("/_fontcap"));
    }

    public cd(Image object) {
        this.a = object;
        object = this;
        this.g = " 0123456789.,:!?()+-*/#$%\"@<=>;_&abcd\u0111efghijklmnopqrstuvwxyz\u00e1\u00e0\u1ea3\u00e3\u1ea1\u0103\u1eaf\u1eb1\u1eb3\u1eb5\u1eb7\u00e2\u1ea5\u1ea7\u1ea9\u1eab\u1ead\u00e9\u00e8\u1ebb\u1ebd\u1eb9\u00ea\u1ebf\u1ec1\u1ec3\u1ec5\u1ec7\u00ed\u00ec\u1ec9\u0129\u1ecb\u00f3\u00f2\u1ecf\u00f5\u1ecd\u00f4\u1ed1\u1ed3\u1ed5\u1ed7\u1ed9\u01a1\u1edb\u1edd\u1edf\u1ee1\u1ee3\u00fa\u00f9\u1ee7\u0169\u1ee5\u01b0\u1ee9\u1eeb\u1eed\u1eef\u1ef1\u00fd\u1ef3\u1ef7\u1ef9\u1ef5";
        object.h = " 0123456789.,:!?()+-*/#$%\"@<=>;_&ABCD\u0110EFGHIJKLMNOPQRSTUVWXYZ\u00c1\u00c0\u1ea2\u00c3\u1ea0\u0102\u1eae\u1eb0\u1eb2\u1eb4\u1eb6\u00c2\u1ea4\u1ea6\u1ea8\u1eaa\u1eac\u00c9\u00c8\u1eba\u1ebc\u1eb8\u00ca\u1ebe\u1ec0\u1ec2\u1ec4\u1ec6\u00cd\u00cc\u1ec8\u0128\u1eca\u00d3\u00d2\u1ece\u00d5\u1ecc\u00d4\u1ed0\u1ed2\u1ed4\u1ed6\u1ed8\u01a0\u1eda\u1edc\u1ede\u1ee0\u1ee2\u00da\u00d9\u1ee6\u0168\u1ee4\u01af\u1ee8\u1eea\u1eec\u1eee\u1ef0\u00dd\u1ef2\u1ef6\u1ef8\u1ef4";
        int[] nArray = new int[126];
        nArray[1] = 2;
        nArray[2] = 10;
        nArray[3] = 16;
        nArray[4] = 24;
        nArray[5] = 32;
        nArray[6] = 40;
        nArray[7] = 48;
        nArray[8] = 56;
        nArray[9] = 64;
        nArray[10] = 72;
        nArray[11] = 80;
        nArray[12] = 84;
        nArray[13] = 88;
        nArray[14] = 92;
        nArray[15] = 80;
        nArray[17] = 6;
        nArray[18] = 12;
        nArray[19] = 87;
        nArray[20] = 19;
        nArray[21] = 26;
        nArray[22] = 32;
        nArray[23] = 41;
        nArray[24] = 49;
        nArray[25] = 62;
        nArray[26] = 67;
        nArray[27] = 92;
        nArray[28] = 78;
        nArray[29] = 12;
        nArray[30] = 96;
        nArray[31] = 86;
        nArray[32] = 32;
        nArray[33] = 49;
        nArray[34] = 58;
        nArray[35] = 66;
        nArray[36] = 74;
        nArray[37] = 83;
        nArray[38] = 41;
        nArray[39] = 92;
        nArray[41] = 20;
        nArray[42] = 8;
        nArray[43] = 14;
        nArray[44] = 29;
        nArray[45] = 48;
        nArray[46] = 55;
        nArray[47] = 65;
        nArray[48] = 37;
        nArray[49] = 73;
        nArray[50] = 81;
        nArray[51] = 90;
        nArray[53] = 20;
        nArray[54] = 7;
        nArray[55] = 28;
        nArray[56] = 46;
        nArray[57] = 57;
        nArray[58] = 65;
        nArray[59] = 36;
        nArray[60] = 90;
        nArray[61] = 15;
        nArray[62] = 73;
        nArray[64] = 24;
        nArray[65] = 43;
        nArray[66] = 52;
        nArray[67] = 61;
        nArray[68] = 33;
        nArray[69] = 82;
        nArray[70] = 91;
        nArray[71] = 9;
        nArray[72] = 70;
        nArray[74] = 18;
        nArray[75] = 42;
        nArray[76] = 51;
        nArray[77] = 60;
        nArray[78] = 28;
        nArray[79] = 35;
        nArray[80] = 79;
        nArray[81] = 9;
        nArray[82] = 67;
        nArray[83] = 86;
        nArray[84] = 93;
        nArray[86] = 16;
        nArray[87] = 42;
        nArray[88] = 60;
        nArray[89] = 23;
        nArray[90] = 29;
        nArray[91] = 35;
        nArray[92] = 49;
        nArray[93] = 74;
        nArray[94] = 83;
        nArray[96] = 9;
        nArray[97] = 49;
        nArray[98] = 58;
        nArray[99] = 18;
        nArray[100] = 27;
        nArray[101] = 36;
        nArray[102] = 67;
        nArray[103] = 76;
        nArray[104] = 85;
        nArray[106] = 46;
        nArray[107] = 11;
        nArray[108] = 22;
        nArray[109] = 33;
        nArray[110] = 92;
        nArray[111] = 57;
        nArray[112] = 85;
        nArray[113] = 65;
        nArray[114] = 73;
        nArray[116] = 44;
        nArray[117] = 33;
        nArray[118] = 54;
        nArray[119] = 10;
        nArray[120] = 20;
        nArray[121] = 81;
        nArray[122] = 89;
        nArray[123] = 64;
        nArray[124] = 72;
        object.b = nArray;
        int[] nArray2 = new int[126];
        nArray2[15] = 6;
        nArray2[16] = 9;
        nArray2[17] = 9;
        nArray2[18] = 9;
        nArray2[19] = 7;
        nArray2[20] = 9;
        nArray2[21] = 9;
        nArray2[22] = 9;
        nArray2[23] = 9;
        nArray2[24] = 9;
        nArray2[25] = 9;
        nArray2[26] = 9;
        nArray2[27] = 9;
        nArray2[28] = 15;
        nArray2[29] = 16;
        nArray2[31] = 17;
        nArray2[32] = 18;
        nArray2[33] = 18;
        nArray2[34] = 18;
        nArray2[35] = 19;
        nArray2[36] = 20;
        nArray2[37] = 20;
        nArray2[38] = 20;
        nArray2[39] = 20;
        nArray2[40] = 21;
        nArray2[41] = 21;
        nArray2[42] = 24;
        nArray2[43] = 24;
        nArray2[44] = 27;
        nArray2[45] = 27;
        nArray2[46] = 27;
        nArray2[47] = 28;
        nArray2[48] = 29;
        nArray2[49] = 29;
        nArray2[50] = 29;
        nArray2[51] = 29;
        nArray2[52] = 30;
        nArray2[53] = 30;
        nArray2[54] = 33;
        nArray2[55] = 36;
        nArray2[56] = 36;
        nArray2[57] = 36;
        nArray2[58] = 37;
        nArray2[59] = 38;
        nArray2[60] = 38;
        nArray2[61] = 39;
        nArray2[62] = 40;
        nArray2[63] = 42;
        nArray2[64] = 45;
        nArray2[65] = 45;
        nArray2[66] = 45;
        nArray2[67] = 46;
        nArray2[68] = 47;
        nArray2[69] = 50;
        nArray2[70] = 50;
        nArray2[71] = 51;
        nArray2[72] = 52;
        nArray2[73] = 54;
        nArray2[74] = 56;
        nArray2[75] = 57;
        nArray2[76] = 57;
        nArray2[77] = 58;
        nArray2[78] = 59;
        nArray2[79] = 59;
        nArray2[80] = 62;
        nArray2[81] = 63;
        nArray2[82] = 64;
        nArray2[83] = 64;
        nArray2[84] = 64;
        nArray2[85] = 66;
        nArray2[86] = 68;
        nArray2[87] = 69;
        nArray2[88] = 70;
        nArray2[89] = 71;
        nArray2[90] = 71;
        nArray2[91] = 71;
        nArray2[92] = 71;
        nArray2[93] = 74;
        nArray2[94] = 76;
        nArray2[95] = 78;
        nArray2[96] = 80;
        nArray2[97] = 82;
        nArray2[98] = 82;
        nArray2[99] = 83;
        nArray2[100] = 83;
        nArray2[101] = 83;
        nArray2[102] = 86;
        nArray2[103] = 88;
        nArray2[104] = 88;
        nArray2[105] = 92;
        nArray2[106] = 93;
        nArray2[107] = 95;
        nArray2[108] = 95;
        nArray2[109] = 95;
        nArray2[110] = 76;
        nArray2[111] = 94;
        nArray2[112] = 97;
        nArray2[113] = 98;
        nArray2[114] = 102;
        nArray2[115] = 104;
        nArray2[116] = 105;
        nArray2[117] = 106;
        nArray2[118] = 106;
        nArray2[119] = 107;
        nArray2[120] = 107;
        nArray2[121] = 109;
        nArray2[122] = 109;
        nArray2[123] = 110;
        nArray2[124] = 113;
        nArray2[125] = 114;
        object.c = nArray2;
        object.d = new int[]{2, 8, 6, 8, 8, 8, 8, 8, 8, 8, 8, 4, 4, 4, 4, 7, 6, 6, 7, 5, 7, 6, 9, 8, 13, 5, 11, 8, 8, 8, 4, 8, 9, 9, 8, 8, 9, 9, 7, 7, 8, 9, 6, 6, 8, 7, 10, 8, 9, 8, 9, 8, 7, 8, 8, 8, 11, 8, 8, 7, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 9, 9, 7, 7, 7, 7, 7, 7, 7, 7, 9, 7, 7, 6, 6, 6, 6, 6, 9, 9, 9, 9, 9, 9, 9, 9, 10, 9, 9, 11, 11, 11, 11, 11, 11, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 8, 8, 8, 8, 8};
        object.e = new int[]{1, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 4, 6, 7, 9, 9, 12, 12, 7, 3, 7, 12, 9, 11, 9, 5, 10, 8, 5, 8, 9, 3, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 11, 9, 9, 9, 9, 9, 9, 9, 9, 9, 12, 12, 12, 12, 11, 12, 12, 12, 12, 12, 14, 12, 12, 12, 12, 12, 14, 12, 12, 12, 12, 11, 12, 12, 12, 12, 12, 14, 12, 12, 12, 12, 11, 12, 12, 12, 12, 11, 12, 12, 12, 12, 12, 14, 9, 12, 12, 12, 12, 11, 12, 12, 12, 12, 11, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 11};
        int[] nArray3 = new int[126];
        nArray3[0] = 11;
        nArray3[1] = 3;
        nArray3[2] = 3;
        nArray3[3] = 3;
        nArray3[4] = 3;
        nArray3[5] = 3;
        nArray3[6] = 3;
        nArray3[7] = 3;
        nArray3[8] = 3;
        nArray3[9] = 3;
        nArray3[10] = 3;
        nArray3[11] = 8;
        nArray3[12] = 8;
        nArray3[13] = 5;
        nArray3[14] = 3;
        nArray3[15] = 3;
        nArray3[16] = 2;
        nArray3[17] = 2;
        nArray3[18] = 4;
        nArray3[19] = 6;
        nArray3[20] = 2;
        nArray3[21] = 2;
        nArray3[22] = 3;
        nArray3[23] = 2;
        nArray3[24] = 3;
        nArray3[25] = 2;
        nArray3[26] = 3;
        nArray3[27] = 4;
        nArray3[28] = 5;
        nArray3[29] = 4;
        nArray3[30] = 5;
        nArray3[31] = 11;
        nArray3[32] = 3;
        nArray3[33] = 3;
        nArray3[34] = 3;
        nArray3[35] = 3;
        nArray3[36] = 3;
        nArray3[37] = 3;
        nArray3[38] = 3;
        nArray3[39] = 3;
        nArray3[40] = 3;
        nArray3[41] = 3;
        nArray3[42] = 3;
        nArray3[43] = 3;
        nArray3[44] = 3;
        nArray3[45] = 3;
        nArray3[46] = 3;
        nArray3[47] = 3;
        nArray3[48] = 3;
        nArray3[49] = 3;
        nArray3[50] = 3;
        nArray3[51] = 3;
        nArray3[52] = 3;
        nArray3[53] = 3;
        nArray3[54] = 3;
        nArray3[55] = 3;
        nArray3[56] = 3;
        nArray3[57] = 3;
        nArray3[58] = 3;
        nArray3[59] = 3;
        nArray3[64] = 3;
        nArray3[81] = 3;
        nArray3[92] = 3;
        nArray3[97] = 3;
        nArray3[104] = 3;
        nArray3[109] = 3;
        nArray3[114] = 3;
        nArray3[115] = 2;
        nArray3[120] = 2;
        nArray3[125] = 3;
        object.f = nArray3;
        object.i = 14;
    }

    public final void a(Graphics graphics, String string, int n2, int n3, int n4, int n5, int n6) {
        int n7;
        int n8 = n3 + 0;
        if (n6 == 0) {
            n3 = n4;
        } else {
            n7 = n3 == string.length() ? this.a(string) : this.a(string.substring(0, n8));
            n3 = n6 == 2 ? n4 - n7 : n4 - (n7 >> 1);
        }
        n7 = 0;
        while (n7 < n8) {
            n2 = this.g.indexOf(string.charAt(n7));
            if (n2 == -1) {
                n2 = this.h.indexOf(string.charAt(n7));
            }
            if (n2 == -1) {
                n2 = 0;
            }
            if (n2 >= 0) {
                cz.a(graphics, this.a, this.b[n2], this.c[n2], this.d[n2], this.e[n2], n3, n5 - 1 + this.f[n2], 20);
            }
            n3 += this.d[n2] + 1;
            ++n7;
        }
    }

    public final int a() {
        return this.i;
    }

    public final int a(String string) {
        int n2 = 0;
        int n3 = 0;
        while (n3 < string.length()) {
            n2 = n2 + 1 + this.a(string.charAt(n3));
            ++n3;
        }
        return n2;
    }

    public final int a(char c2) {
        int n2 = this.g.indexOf(c2);
        if (n2 == -1) {
            n2 = this.h.indexOf(c2);
        }
        if (n2 >= 0) {
            return this.d[n2];
        }
        return this.d[0];
    }

    public final int b() {
        return 0;
    }

    public final void c(boolean bl2) {
    }

    public final void a(boolean bl2) {
    }

    public final void c() {
    }

    public final void b(boolean bl2) {
    }
}

