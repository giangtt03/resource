/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;

final class em
implements Runnable {
    private dw a;
    private ee b;
    private boolean c = false;
    private byte[] d;

    public em(InputStream inputStream) {
        this.b = new ee(inputStream);
        this.c = false;
        new Thread(this).start();
    }

    public final void run() {
        int n2 = 10;
        this.c = false;
        block80: while (!this.c) {
            Object object = null;
            try {
                object = this;
                object = ((em)object).b == null ? null : ((em)object).b.a();
                if (object == null) {
                    if (--n2 <= 0) {
                        this.c = true;
                        if (dv.a().c) {
                            dv.a().d();
                        }
                    } else {
                        try {
                            Thread.sleep(3000L);
                        }
                        catch (Throwable throwable) {}
                    }
                } else {
                    n2 = 10;
                }
            }
            catch (Throwable throwable) {
                if (--n2 <= 0) {
                    this.c = true;
                    if (dv.a().c) {
                        dv.a().d();
                    }
                } else {
                    try {
                        Thread.sleep(3000L);
                    }
                    catch (Throwable throwable2) {}
                }
                object = null;
            }
            Object object2 = object;
            object = this;
            if (object2 == null) continue;
            try {
                if (((em)object).a == null) continue;
                int n3 = ((dz)object2).b;
                switch (n3) {
                    case 0: {
                        byte by2 = ((dz)object2).a(((dz)object2).b((short)0, 0), (short)0);
                        n3 = by2;
                        if (by2 == 9) continue block80;
                        String string = ((dz)object2).b((short)8);
                        byte by3 = ((dz)object2).a(((dz)object2).b((short)255, 0), (short)0);
                        String string2 = ((dz)object2).b((short)30);
                        if (!l.a(string2)) {
                            em.a(string2);
                        }
                        ((em)object).a.a(n3, string, by3);
                        break;
                    }
                    case 95: {
                        object = object2;
                        byte[] byArray = ((dz)object).a((short)42);
                        if (byArray != null) {
                            String string = "";
                            int n4 = p.a(byArray[0]);
                            string = String.valueOf(string) + String.valueOf(n4);
                            n4 = p.a(byArray[1]);
                            string = String.valueOf(string) + ".";
                            string = String.valueOf(string) + String.valueOf(n4);
                            n4 = p.a(byArray[2]);
                            string = String.valueOf(string) + ".";
                            string = String.valueOf(string) + String.valueOf(n4);
                            n4 = p.a(byArray[3]);
                            string = String.valueOf(string) + ".";
                            string = String.valueOf(string) + String.valueOf(n4);
                            dv.a().a(string);
                            break;
                        }
                        dv.a().a((String)null);
                        break;
                    }
                    case 96: {
                        byte[] byArray = ((dz)object2).a((short)11);
                        dv.a().k = byArray;
                        dv.a().a = true;
                        if (dv.a().b) {
                            dv.a().e();
                            break;
                        }
                        if (((em)object).a == null) continue block80;
                        ((em)object).a.h_();
                        break;
                    }
                    case 97: {
                        ((dz)object2).b((short)4);
                        ((dz)object2).b((short)22);
                        ((dz)object2).b((short)13);
                        dv.a().f();
                        dv.a().c = true;
                        if (dv.a().b) {
                            dv.a().b = false;
                            dv.a().j();
                            if (dv.a().i != 2 || l.a(dv.a().h)) continue block80;
                            dv.a().c(dv.a().h);
                            break;
                        }
                        ((em)object).a.g_();
                        break;
                    }
                    case 9: {
                        n3 = ((dz)object2).a(((dz)object2).b((short)39, 0), 0);
                        byte by4 = ((dz)object2).a(((dz)object2).b((short)53, 0), (byte)0);
                        j[] jArray = em.a((dz)object2, null, true, by4);
                        ((em)object).a.a(jArray, n3);
                        break;
                    }
                    case 10: {
                        super.C((dz)object2);
                        break;
                    }
                    case 11: {
                        eo eo2 = new eo();
                        ((dz)object2).b((short)7);
                        ((dz)object2).b((short)22);
                        eo2.a = ((dz)object2).b((short)13);
                        if (l.a(eo2.a)) {
                            eo2.a = null;
                        }
                        eo2.b = ((dz)object2).b((short)109);
                        if (eo2.b == null) {
                            ((dz)object2).b((short)110);
                        }
                        ((dz)object2).b((short)111);
                        ((dz)object2).b((short)4);
                        ((dz)object2).b((short)112);
                        ((dz)object2).b((short)113);
                        break;
                    }
                    case 12: {
                        break;
                    }
                    case 77: {
                        dv.a();
                        dv.a();
                        break;
                    }
                    case 79: {
                        ((dz)object2).b((short)7);
                        ((dz)object2).b((short)109);
                        break;
                    }
                    case 14: {
                        super.a((dz)object2);
                        break;
                    }
                    case 21: {
                        super.b((dz)object2);
                        break;
                    }
                    case 23: {
                        super.c((dz)object2);
                        break;
                    }
                    case 25: {
                        object2 = dv.a();
                        dv.a().g = null;
                        ((dv)object2).j = dl.a(((dv)object2).k, ((dv)object2).g);
                        break;
                    }
                    case 6: {
                        super.d((dz)object2);
                        break;
                    }
                    case 115: {
                        ep[] epArray;
                        byte[] byArray = ((dz)object2).a((short)214);
                        if (byArray == null) {
                            ((em)object).d = null;
                            break;
                        }
                        int n5 = p.a(byArray[0], byArray[1]);
                        if (dv.a().r != n5) continue block80;
                        byArray = ((dz)object2).a((short)213);
                        if (byArray != null) {
                            dv.a().q = p.a(byArray);
                            if (dv.a().q <= 0) {
                                dv.a().q = 1;
                            }
                            byArray = ((dz)object2).a((short)37);
                            int n6 = p.c(byArray);
                            ((em)object).d = new byte[n6];
                            dv.a().p = n6;
                        }
                        int n7 = dv.a().q;
                        byte[] byArray2 = ((dz)object2).a((short)23);
                        System.arraycopy(byArray2, 0, ((em)object).d, dv.a().o, byArray2.length);
                        dv.a().o += byArray2.length;
                        if (n5 >= n7 - 1) {
                            int n8 = ((dz)object2).a(((dz)object2).b((short)218, 0), 0);
                            epArray = ep.a(((em)object).d);
                            ((em)object).a.a(n8, epArray, ((em)object).d);
                            ((em)object).d = null;
                            break;
                        }
                        dv.a().c(n5);
                        break;
                    }
                    case 22: {
                        dv.a().b();
                        ((em)object).a.f_();
                        break;
                    }
                    case 42: {
                        dv.a().h();
                        break;
                    }
                    case 50: {
                        String string = ((dz)object2).b((short)7);
                        if (l.a(string)) {
                            ((dz)object2).b((short)109);
                            break;
                        }
                        ((dz)object2).b((short)109);
                        ((dz)object2).b((short)110);
                        ((dz)object2).b((short)111);
                        break;
                    }
                    case 67: {
                        super.e((dz)object2);
                        break;
                    }
                    case 15: {
                        super.f((dz)object2);
                        break;
                    }
                    case 17: {
                        ((dz)object2).b((short)21);
                        break;
                    }
                    case 54: {
                        super.g((dz)object2);
                        break;
                    }
                    case 103: {
                        super.h((dz)object2);
                        break;
                    }
                    case 116: {
                        super.i((dz)object2);
                        break;
                    }
                    case 124: {
                        super.j((dz)object2);
                        break;
                    }
                    case 125: {
                        String string = ((dz)object2).b((short)7);
                        byte by5 = ((dz)object2).a(((dz)object2).b((short)45, 0), (byte)0);
                        long l2 = ((dz)object2).a(((dz)object2).b((short)9, 0), 0L);
                        long l3 = ((dz)object2).a(((dz)object2).b((short)59, 0), -1L);
                        if (string.toLowerCase().equals(dv.a().f.toLowerCase())) {
                            ((em)object).a.a(by5, l2, l3);
                            break;
                        }
                        if (l3 >= 0L) continue block80;
                        ((em)object).a.a(string, (short)by5, l2);
                        break;
                    }
                    case 109: {
                        super.k((dz)object2);
                        break;
                    }
                    case 117: {
                        super.l((dz)object2);
                        break;
                    }
                    case 114: {
                        super.m((dz)object2);
                        break;
                    }
                    case 39: {
                        String string = ((dz)object2).b((short)7);
                        String string3 = ((dz)object2).b((short)24);
                        long l4 = ((dz)object2).a(((dz)object2).b((short)9, 0), 0L);
                        if (l4 == 0L) {
                            l4 = System.currentTimeMillis();
                        }
                        ef ef2 = new ef();
                        new ef().a = string;
                        ef2.a(string3);
                        ef2.c = l4;
                        if (dv.a().i == 2 && (object2 = ((dz)object2).b((short)109)) != null) {
                            dv.a().b(string, (String)object2);
                        }
                        ((em)object).a.a(string, ef2);
                        break;
                    }
                    case 104: {
                        ((dz)object2).b((short)7);
                        ((dz)object2).b((short)8);
                        break;
                    }
                    case 105: {
                        ((dz)object2).b((short)7);
                        break;
                    }
                    case 65: {
                        ((dz)object2).b((short)7);
                        String string = ((dz)object2).b((short)30);
                        ((em)object).a.a(string);
                        break;
                    }
                    case 66: {
                        String string = ((dz)object2).b((short)28);
                        long l5 = ((dz)object2).a(((dz)object2).b((short)130, 0), 0L);
                        int n9 = ((dz)object2).a(((dz)object2).b((short)124, 0), 0);
                        ((em)object).a.a(string, l5, n9);
                        break;
                    }
                    case 129: {
                        break;
                    }
                    case 133: {
                        super.n((dz)object2);
                        break;
                    }
                    case 136: {
                        String string = ((dz)object2).b((short)4);
                        String[] stringArray = l.b(string, ";");
                        ((em)object).a.a(stringArray);
                        break;
                    }
                    case 137: {
                        super.o((dz)object2);
                        break;
                    }
                    case 138: {
                        super.p((dz)object2);
                        break;
                    }
                    case 140: {
                        j[] jArray = em.a((dz)object2, null, true, (short)0);
                        ((em)object).a.a(jArray);
                        break;
                    }
                    case 193: {
                        super.q((dz)object2);
                        break;
                    }
                    case 194: {
                        String string = ((dz)object2).b((short)29);
                        if (string == null) continue block80;
                        l.b(string, ";");
                        break;
                    }
                    case 199: {
                        ((dz)object2).b((short)109);
                        ((dz)object2).b((short)110);
                        break;
                    }
                    case 147: {
                        super.r((dz)object2);
                        break;
                    }
                    case 148: {
                        break;
                    }
                    case 158: {
                        ((dz)object2).b((short)129);
                        ((dz)object2).b((short)22);
                        ((dz)object2).b((short)13);
                        ((dz)object2).b((short)24);
                        break;
                    }
                    case 159: {
                        ((dz)object2).b((short)129);
                        ((dz)object2).b((short)7);
                        break;
                    }
                    case 160: {
                        ((dz)object2).b((short)129);
                        ((dz)object2).b((short)22);
                        ((dz)object2).b((short)13);
                        ((dz)object2).b((short)24);
                        break;
                    }
                    case 162: {
                        ((dz)object2).b((short)129);
                        String string = ((dz)object2).b((short)7);
                        String string4 = ((dz)object2).b((short)8);
                        byte by6 = ((dz)object2).a(((dz)object2).b((short)220, 0), (short)0);
                        ep[] epArray = new eg();
                        epArray.a(string);
                        epArray.b(string4);
                        epArray.a(by6);
                        if (dv.a().i != 2 || (object2 = ((dz)object2).b((short)109)) == null) continue block80;
                        dv.a().b(string, (String)object2);
                        break;
                    }
                    case 163: {
                        String string;
                        ((dz)object2).b((short)129);
                        String string5 = ((dz)object2).b((short)7);
                        ((dz)object2).b((short)24);
                        if (dv.a().i != 2 || (string = ((dz)object2).b((short)109)) == null) continue block80;
                        dv.a().b(string5, string);
                        break;
                    }
                    case 164: {
                        super.s((dz)object2);
                        break;
                    }
                    case 165: {
                        super.t((dz)object2);
                        break;
                    }
                    case 166: {
                        ((dz)object2).b((short)111);
                        ((dz)object2).b((short)7);
                        ((dz)object2).b((short)110);
                        break;
                    }
                    case 167: {
                        ((dz)object2).b((short)7);
                        break;
                    }
                    case 168: {
                        break;
                    }
                    case 169: {
                        super.u((dz)object2);
                        break;
                    }
                    case 171: {
                        super.v((dz)object2);
                        break;
                    }
                    case 175: {
                        ((dz)object2).b((short)110);
                        ((dz)object2).b((short)28);
                        ((dz)object2).b((short)8);
                        break;
                    }
                    case 35: {
                        super.w((dz)object2);
                        break;
                    }
                    case 113: {
                        dv.a();
                        break;
                    }
                    case 100: {
                        super.x((dz)object2);
                        break;
                    }
                    case 101: {
                        super.y((dz)object2);
                        break;
                    }
                    case 102: {
                        super.z((dz)object2);
                        break;
                    }
                    case 20: {
                        ((dz)object2).b((short)21);
                        ((dz)object2).b((short)26);
                        break;
                    }
                    case 18: {
                        ((dz)object2).b((short)21);
                        break;
                    }
                    case 19: {
                        ((dz)object2).b((short)7);
                        ((dz)object2).b((short)21);
                        break;
                    }
                    case 92: {
                        super.A((dz)object2);
                        break;
                    }
                    case 82: {
                        super.B((dz)object2);
                        break;
                    }
                    case 128: {
                        super.D((dz)object2);
                        break;
                    }
                }
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void a(dz var1_1) {
        block69: {
            block68: {
                var2_2 = var1_1.a((short)53);
                var3_3 = 0;
                if (var2_2 != null) {
                    var3_3 = var2_2[0];
                }
                var2_2 = var1_1.b((short)7);
                var4_4 /* !! */  = var1_1.b((short)8);
                var5_5 = var1_1.a(var1_1.b((short)220, 0), (short)0);
                if (var4_4 /* !! */  == null) {
                    var4_4 /* !! */  = "";
                }
                var6_6 = new eg();
                if (var2_2.toLowerCase().equals("ola".toLowerCase())) {
                    var7_7 = l.a((String)var4_4 /* !! */ , " ", 3, false);
                    if (var7_7 != null && var7_7.length == 3 && var7_7[0].toLowerCase().equals("LOCK".toLowerCase())) {
                        try {
                            Long.parseLong(var7_7[1]);
                            return;
                        }
                        catch (Exception v0) {}
                    }
                } else if (var2_2.length() <= 3 && (var7_7 = l.a((String)var4_4 /* !! */ , "|", 2, false)) != null && var7_7.length == 2 && (var8_12 = em.a(var7_7[1])) != null && ((ec[])var8_12).length > 0) {
                    var4_4 /* !! */  = var7_7[0];
                    var6_6.a((ec[])var8_12);
                }
                var7_8 = true;
                var7_9 = null;
                var7_9 = var4_4 /* !! */ ;
                var11_13 = true;
                var7_10 = false;
                var18_14 = 0L;
                var10_20 = null;
                var9_22 = var7_9;
                var8_12 = dv.a().f;
                var7_11 = null;
                if (!l.b((String)var9_22)) break block68;
                v1 = null;
                break block69;
            }
            var7_11 = l.b((String)var9_22, " ");
            var9_22 = null;
            var12_23 = 0;
            if (var10_20 != null) {
                var9_22 = new ec[30];
                var13_24 /* !! */  = new ef();
                var13_24 /* !! */ .a(var10_20);
                switch (var13_24 /* !! */ .d) {
                    case 1: {
                        var9_22[0] = new ec("openphoto");
                        var9_22[0].e("Xem \u1ea3nh");
                        ++var12_23;
                        break;
                    }
                    case 3: {
                        var9_22[0] = new ec("openaudio");
                        var9_22[0].e("M\u1edf \u00e2m thanh");
                        ++var12_23;
                        break;
                    }
                    case 2: {
                        var9_22[0] = new ec("openvideo");
                        var9_22[0].e("M\u1edf Video");
                        ++var12_23;
                        break;
                    }
                    default: {
                        var9_22[0] = new ec("wap");
                        var9_22[0].e("Xem WAP");
                        var9_22[0].a(var13_24 /* !! */ .b);
                        ++var12_23;
                    }
                }
            }
            if (!var8_12.equals(dv.a().f.toLowerCase())) {
                if (var9_22 == null) {
                    var9_22 = new ec[30];
                }
                var9_22[var12_23] = new ec("chatto");
                var13_24 /* !! */  = var8_12;
                if (var8_12.length() >= 14) {
                    var13_24 /* !! */  = var13_24 /* !! */ .substring(0, 11);
                    var13_24 /* !! */  = String.valueOf(var13_24 /* !! */ ) + "...";
                }
                var9_22[var12_23].e("Chat \"" + (String)var13_24 /* !! */  + "\"");
                var9_22[var12_23].a((String)var8_12);
                var9_22[++var12_23] = new ec("replyto");
                var9_22[var12_23].e("Tr\u1ea3 l\u1eddi \"" + (String)var13_24 /* !! */  + "\"");
                var9_22[var12_23].a((String)var8_12);
                var9_22[++var12_23] = new ec("viewme");
                var9_22[var12_23].e("Xem \"" + (String)var13_24 /* !! */  + "\"");
                var9_22[var12_23].a((String)var8_12);
                ++var12_23;
            }
            var13_25 = 1;
            var14_26 = 1;
            var15_27 = 0;
            while (var15_27 < var7_11.length && var12_23 < 30) {
                block71: {
                    block74: {
                        block73: {
                            block72: {
                                block70: {
                                    if (!var7_11[var15_27].startsWith("@") || var7_11[var15_27].length() <= 1 || var7_11[var15_27].toLowerCase().equals("@" + (String)var8_12)) break block70;
                                    var16_29 = var7_11[var15_27].substring(1);
                                    var16_29 = var16_29.trim();
                                    var17_30 = 0;
                                    var18_15 = var16_29.length();
                                    while (var17_30 < var18_15) {
                                        if (!(var16_29.charAt(var17_30) >= 'a' && var16_29.charAt(var17_30) <= 'z' || var16_29.charAt(var17_30) >= 'A' && var16_29.charAt(var17_30) <= 'Z' || var16_29.charAt(var17_30) >= '0' && var16_29.charAt(var17_30) <= '9' || var16_29.charAt(var17_30) == '.' || var16_29.charAt(var17_30) == '_')) {
                                            var16_29 = var16_29.substring(0, var17_30);
                                            break;
                                        }
                                        ++var17_30;
                                    }
                                    if (var16_29.length() > 0 && !var16_29.toLowerCase().equals(var8_12.toLowerCase())) {
                                        if (var9_22 == null) {
                                            var9_22 = new ec[30];
                                        }
                                        if (!(var17_31 = var16_29.toLowerCase()).equals(dv.a().f.toLowerCase())) {
                                            var18_15 = 0;
                                            while (var18_15 < var12_23) {
                                                if (var9_22[var18_15] != null && var9_22[var18_15].a().equals("viewme") && var9_22[var18_15].b().toLowerCase().equals(var17_31)) break;
                                                ++var18_15;
                                            }
                                            if (var18_15 >= var12_23) {
                                                var20_36 = var19_35 = var17_31.length() - 1;
                                                while (var20_36 > 0) {
                                                    if (var17_31.charAt(var20_36) != '.') break;
                                                    --var20_36;
                                                }
                                                if (var20_36 < var19_35) {
                                                    var17_31 = var17_31.substring(0, var20_36 + 1);
                                                }
                                                if ((var10_20 = var17_31).length() >= 14) {
                                                    var10_20 = var10_20.substring(0, 11);
                                                    var10_20 = String.valueOf(var10_20) + "...";
                                                }
                                                if (var11_13) {
                                                    var9_22[var12_23] = new ec("chatto");
                                                    var9_22[var12_23].e("Chat \"" + var10_20 + "\"");
                                                    var9_22[var12_23].a(var17_31);
                                                    ++var12_23;
                                                }
                                                var9_22[var12_23] = new ec("viewme");
                                                var9_22[var12_23].e("Xem \"" + var10_20 + "\"");
                                                var9_22[var12_23].a(var17_31);
                                                ++var12_23;
                                                ** GOTO lbl231
                                            }
                                        }
                                    }
                                    break block71;
                                }
                                if (!var7_11[var15_27].startsWith("#") || var7_11[var15_27].length() <= 1 || var7_11[var15_27].toLowerCase().equals("#" + (String)var8_12)) break block72;
                                var16_29 = var7_11[var15_27].substring(1);
                                if (var16_29.charAt(0) >= 'a' && var16_29.charAt(0) <= 'z' || var16_29.charAt(0) >= 'A' && var16_29.charAt(0) <= 'Z' || var16_29.charAt(0) >= '0' && var16_29.charAt(0) <= '9') {
                                    var16_29 = var16_29.trim();
                                    var17_32 = 0;
                                    var18_16 = var16_29.length();
                                    while (var17_32 < var18_16) {
                                        if (!(var16_29.charAt(var17_32) >= 'a' && var16_29.charAt(var17_32) <= 'z' || var16_29.charAt(var17_32) >= 'A' && var16_29.charAt(var17_32) <= 'Z' || var16_29.charAt(var17_32) >= '0' && var16_29.charAt(var17_32) <= '9' || var16_29.charAt(var17_32) == '.' || var16_29.charAt(var17_32) == '_')) {
                                            var16_29 = var16_29.substring(0, var17_32);
                                            break;
                                        }
                                        ++var17_32;
                                    }
                                    if (var16_29 != null && var16_29.length() > 0) {
                                        if (var9_22 == null) {
                                            var9_22 = new ec[30];
                                        }
                                        var17_33 = var16_29.toLowerCase();
                                        var18_16 = 0;
                                        while (var18_16 < var12_23) {
                                            if (var9_22[var18_16] != null && var9_22[var18_16].a().equals("viewme") && var9_22[var18_16].b().toLowerCase().equals(String.valueOf('#') + var17_33)) break;
                                            ++var18_16;
                                        }
                                        if (var18_16 >= var12_23) {
                                            var9_22[var12_23] = new ec("viewme");
                                            var20_37 = var19_35 = var17_33.length() - 1;
                                            while (var20_37 > 0) {
                                                if (var17_33.charAt(var20_37) != '.') break;
                                                --var20_37;
                                            }
                                            if (var20_37 < var19_35) {
                                                var17_33 = var17_33.substring(0, var20_37 + 1);
                                            }
                                            if ((var10_20 = var17_33).length() >= 14) {
                                                var10_20 = var10_20.substring(0, 11);
                                                var10_20 = String.valueOf(var10_20) + "...";
                                            }
                                            var9_22[var12_23].e("Xem nh\u00f3m \"" + var10_20 + "\"");
                                            var9_22[var12_23].a(String.valueOf('#') + var17_33);
                                            ++var12_23;
                                            ** GOTO lbl231
                                        }
                                    }
                                }
                                break block71;
                            }
                            var10_21 = var7_11[var15_27].toLowerCase().indexOf("http://");
                            if (var10_21 < 0) break block73;
                            if (var9_22 == null) {
                                var9_22 = new ec[30];
                            }
                            var16_29 = "Xem WAP " + var13_25;
                            var17_34 = var7_11[var15_27].indexOf(10);
                            if (var10_21 > var17_34 && var15_27 + 1 < var7_11.length && var7_11[var15_27 + 1].startsWith("<")) {
                                var18_17 = var15_27 + 2;
                                while (var18_17 < var7_11.length) {
                                    if (var7_11[var18_17].endsWith(">")) {
                                        var16_29 = var7_11[var15_27 + 1].substring(1);
                                        var19_35 = var15_27 + 2;
                                        while (var19_35 <= var18_17) {
                                            var20_38 = var7_11[var19_35];
                                            if (var19_35 == var18_17) {
                                                var20_38 = var20_38.substring(0, var20_38.length() - 1);
                                            }
                                            if ((var16_29 = String.valueOf(var16_29) + " " + (String)var20_38).length() >= 16) {
                                                var16_29 = var16_29.substring(0, 13);
                                                var16_29 = String.valueOf(var16_29) + "...";
                                            }
                                            --var13_25;
                                            ++var19_35;
                                        }
                                    }
                                    ++var18_17;
                                }
                            }
                            var9_22[var12_23] = new ec("wap");
                            var18_18 = var10_21 > var17_34 ? var7_11[var15_27].substring(var7_11[var15_27].toLowerCase().indexOf("http://")) : var7_11[var15_27].substring(var7_11[var15_27].toLowerCase().indexOf("http://"), var17_34);
                            ++var13_25;
                            var9_22[var12_23].e(var16_29);
                            break block74;
                        }
                        var10_21 = var7_11[var15_27].toLowerCase().indexOf("rss://");
                        if (var10_21 < 0) break block71;
                        if (var9_22 == null) {
                            var9_22 = new ec[30];
                        }
                        var16_29 = "Xem tin " + var14_26;
                        var17_34 = var7_11[var15_27].indexOf(10);
                        if (var10_21 > var17_34 && var15_27 + 1 < var7_11.length && var7_11[var15_27 + 1].startsWith("<")) {
                            var18_19 = var15_27 + 2;
                            while (var18_19 < var7_11.length) {
                                if (var7_11[var18_19].endsWith(">")) {
                                    var16_29 = var7_11[var15_27 + 1].substring(1);
                                    var19_35 = var15_27 + 2;
                                    while (var19_35 <= var18_19) {
                                        var20_39 = var7_11[var19_35];
                                        if (var19_35 == var18_19) {
                                            var20_39 = var20_39.substring(0, var20_39.length() - 1);
                                        }
                                        if ((var16_29 = String.valueOf(var16_29) + " " + (String)var20_39).length() >= 16) {
                                            var16_29 = var16_29.substring(0, 13);
                                            var16_29 = String.valueOf(var16_29) + "...";
                                        }
                                        --var14_26;
                                        ++var19_35;
                                    }
                                }
                                ++var18_19;
                            }
                        }
                        var9_22[var12_23] = new ec("rss");
                        var18_18 = var10_21 > var17_34 ? var7_11[var15_27].substring(var7_11[var15_27].toLowerCase().indexOf("rss://") + 6) : var7_11[var15_27].substring(var7_11[var15_27].toLowerCase().indexOf("rss://") + 6, var17_34);
                        ++var14_26;
                        var9_22[var12_23].e(var16_29);
                        if (var18_18.toLowerCase().equals("null")) {
                            var18_18 = null;
                        }
                    }
                    var9_22[var12_23].a(var18_18);
                    ++var12_23;
                }
                ++var15_27;
            }
            if (var9_22 == null) {
                var9_22 = new ec[30];
            }
            if (0L != 0L) {
                var9_22[var12_23] = new ec("delme");
                var9_22[var12_23].e("X\u00f3a");
                ++var12_23;
            }
            if (var12_23 <= 0) {
                v1 = null;
            } else {
                var15_28 = new ec[var12_23];
                System.arraycopy(var9_22, 0, var15_28, 0, var15_28.length);
                var9_22 = var15_28;
                v1 = var7_11 = var9_22;
            }
        }
        if (v1 != null) {
            var8_12 = var6_6.a();
            if (var8_12 != null) {
                var9_22 = new ec[var7_11.length + ((ec[])var8_12).length];
                System.arraycopy(var8_12, 0, var9_22, 0, ((ec[])var8_12).length);
                System.arraycopy(var7_11, 0, var9_22, ((ec[])var8_12).length, var7_11.length);
                var7_11 = var9_22;
            }
            var6_6.a((ec[])var7_11);
        }
        var6_6.a((String)var2_2);
        if (var4_4 /* !! */ .toLowerCase().equals("ola")) {
            var4_4 /* !! */  = "Ola!!!";
        }
        var6_6.b((String)var4_4 /* !! */ );
        var6_6.a(System.currentTimeMillis());
        var6_6.a(var5_5);
        if (dv.a().i == 2 && (var8_12 = var1_1.b((short)109)) != null) {
            dv.a().b((String)var2_2, (String)var8_12);
        }
        if (this.a != null) {
            this.a.a(var6_6, (short)var3_3);
        }
    }

    private void b(dz dz2) {
        int n2 = dz2.c((short)7);
        if (n2 == 0) {
            return;
        }
        du[] duArray = new du[n2];
        int n3 = dz2.b((short)7, 0);
        boolean bl2 = false;
        int n4 = 0;
        while (!bl2) {
            int n5 = n3;
            if ((n3 = dz2.a((short)7, n5)) <= 0) {
                bl2 = true;
            }
            byte by2 = 0;
            byte by3 = 0;
            byte by4 = 0;
            String string = dz2.b(n5);
            String string2 = null;
            String string3 = null;
            int n6 = dz2.a((short)12, n5, n3);
            if (n6 >= 0) {
                by4 = dz2.a(n6, (short)0);
                by2 = dz2.a((short)45, n5, n3, (short)0);
                by3 = dz2.a((short)38, n5, n3, (short)0);
                string2 = dz2.b((short)13, n5, n3);
                if (l.a(string2)) {
                    string2 = null;
                }
                string3 = dz2.b((short)86, n5, n3);
            }
            duArray[n4] = new du();
            duArray[n4].a(string);
            duArray[n4].a(by2);
            duArray[n4].b(by3);
            duArray[n4].d(string3);
            duArray[n4].c(by4);
            duArray[n4].c(string2);
            ++n4;
        }
        this.a.a(duArray);
    }

    private void c(dz dz2) {
        int n2 = dz2.c((short)24);
        ef[] efArray = null;
        if (n2 > 0) {
            efArray = new ef[n2];
            int n3 = dz2.b((short)24, 0);
            int n4 = dz2.b((short)7, 0);
            int n5 = 0;
            while (n5 < n2) {
                int n6 = dz2.a((short)24, n3);
                int n7 = dz2.a((short)7, n4);
                String string = dz2.b(n3);
                dz2.b((short)22, n3, n6);
                String string2 = dz2.b(n4);
                long l2 = dz2.a((short)9, n4, n7, 0L);
                n3 = n6;
                n4 = n7;
                efArray[n5] = new ef();
                efArray[n5].a(string);
                efArray[n5].a = string2;
                efArray[n5].c = l2;
                ++n5;
            }
        }
    }

    private void d(dz dz2) {
        byte[] byArray = dz2.a((short)53);
        byte by2 = 0;
        if (byArray != null) {
            by2 = byArray[0];
        }
        int s2 = dz2.c((short)7);
        eg[] egArray = null;
        if (s2 > 0) {
            egArray = new eg[s2];
            int n2 = dz2.b((short)7, 0);
            boolean bl2 = false;
            int n3 = 0;
            while (!bl2) {
                ec[] ecArray;
                String[] stringArray;
                int n4;
                egArray[n3] = new eg();
                int n5 = n4;
                if ((n4 = dz2.a((short)7, n5)) < 0) {
                    bl2 = true;
                }
                String string = dz2.b(n5);
                String string2 = dz2.b((short)8, n5, n4);
                long l2 = dz2.a((short)9, n5, n4, 0L);
                n5 = dz2.a((short)220, n5, n4, (short)0);
                if (string.toLowerCase().equals("ola".toLowerCase())) {
                    stringArray = l.a(string2, " ", 3, false);
                    if (stringArray != null && stringArray.length == 3 && stringArray[0].toLowerCase().equals("LOCK".toLowerCase())) {
                        try {
                            Long.parseLong(stringArray[1]);
                            return;
                        }
                        catch (Exception exception) {}
                    }
                } else if (string.length() <= 3 && (stringArray = l.a(string2, "|", 2, false)) != null && stringArray.length == 2 && (ecArray = em.a(stringArray[1])) != null && ecArray.length > 0) {
                    string2 = stringArray[0];
                    egArray[n3].a(ecArray);
                }
                egArray[n3].a(string);
                egArray[n3].a(l2);
                egArray[n3].b(string2);
                egArray[n3].a((short)n5);
                ++n3;
            }
        }
        this.a.a(egArray, (short)by2);
    }

    private void e(dz dz2) {
        dt[] dtArray = null;
        int n2 = dz2.c((short)200);
        if (n2 > 0) {
            dtArray = new dt[n2];
            int n3 = dz2.b((short)207, 0);
            int n4 = 0;
            while (n4 < n2) {
                dz2.b(n3);
                dtArray[n4] = new dt();
                n3 = dz2.a((short)207, n3);
                ++n4;
            }
        }
    }

    private void f(dz dz2) {
        String string = dz2.b((short)21);
        int n2 = dz2.c((short)7);
        du[] duArray = null;
        if (n2 > 0) {
            duArray = new du[n2];
            n2 = dz2.b((short)7, 0);
            boolean bl2 = false;
            int n3 = 0;
            while (!bl2) {
                int n4 = n2;
                if ((n2 = dz2.a((short)7, n4)) <= 0) {
                    bl2 = true;
                }
                byte by2 = 0;
                byte by3 = 0;
                byte by4 = 0;
                String string2 = dz2.b(n4);
                String string3 = null;
                String string4 = null;
                int n5 = dz2.a((short)12, n4, n2);
                if (n5 >= 0) {
                    by4 = dz2.a(n5, (short)0);
                    by2 = dz2.a((short)45, n4, n2, (short)0);
                    by3 = dz2.a((short)38, n4, n2, (short)0);
                    string3 = dz2.b((short)13, n4, n2);
                    if (l.a(string3)) {
                        string3 = null;
                    }
                    string4 = dz2.b((short)86, n4, n2);
                }
                duArray[n3] = new du();
                duArray[n3].a(string2);
                duArray[n3].b(dz2.b((short)22, n4, n2));
                duArray[n3].a(by2);
                duArray[n3].b(by3);
                duArray[n3].d(string4);
                duArray[n3].c(by4);
                duArray[n3].c(string3);
                ++n3;
            }
        }
        this.a.a(duArray, string);
    }

    private void g(dz dz2) {
        int n2 = dz2.c((short)7);
        if (n2 > 0) {
            du[] duArray = new du[n2];
            int n3 = dz2.b((short)7, 0);
            int n4 = dz2.b((short)22, 0);
            int n5 = 0;
            while (n5 < n2) {
                String string = dz2.b(n3);
                String string2 = dz2.b(n4);
                duArray[n5] = new du();
                duArray[n5].a(string);
                duArray[n5].b(string2);
                n3 = dz2.a((short)7, n3);
                n4 = dz2.a((short)22, n4);
                ++n5;
            }
        }
    }

    private void h(dz dz2) {
        Object object;
        eg[] egArray;
        byte by2 = dz2.a(dz2.b((short)255, 0), (short)0);
        if (dv.a().x != by2) {
            return;
        }
        String string = dz2.b((short)7);
        short s2 = 0;
        if (string != null) {
            string = string.toLowerCase();
            if (dz2.c((short)67) <= 0) {
                try {
                    byte[] byArray = string.getBytes("UTF-8");
                    if (byArray == null || byArray.length == 0) {
                        byArray = string.getBytes();
                    }
                    dz dz3 = dz2;
                    egArray = (eg[])byArray;
                    int n2 = 67;
                    object = dz3;
                    if (dz3.c == null) {
                        object.c = new dy[1];
                        object.c[0] = new dy();
                        object.c[0].a = (short)67;
                        object.c[0].b = (byte[])egArray;
                    } else {
                        dy[] dyArray = new dy[object.c.length + 1];
                        dy[] dyArray2 = dyArray;
                        dyArray[0] = new dy();
                        dyArray2[0].a = (short)67;
                        dyArray2[0].b = (byte[])egArray;
                        System.arraycopy(object.c, 0, dyArray2, 1, object.c.length);
                        object.c = dyArray2;
                    }
                }
                catch (Throwable throwable) {}
            }
        }
        if ((object = dz2.a((short)66)) != null) {
            s2 = object[0];
        }
        if (s2 == 3) {
            this.a.a(string, s2, null);
            return;
        }
        int n3 = dz2.c((short)8);
        egArray = null;
        if (n3 > 0) {
            egArray = new eg[n3];
            n3 = 0;
            int n4 = dz2.a((short)67, -1);
            boolean bl2 = false;
            while (!bl2) {
                int n5 = n4;
                if ((n4 = dz2.a((short)67, n5)) < 0) {
                    bl2 = true;
                }
                byte by3 = 0;
                byte by4 = 0;
                int n6 = 0;
                int n7 = 0;
                byte by5 = 0;
                byte by6 = 0;
                String string2 = null;
                String string3 = null;
                String string4 = null;
                String string5 = dz2.b(n5);
                string5 = string5.toLowerCase();
                dz2.b((short)109, n5, n4);
                n5 = dz2.a((short)72, n5);
                boolean bl3 = false;
                while (!bl3) {
                    int n8 = n5;
                    if ((n5 = dz2.a((short)72, n8, n4)) < 0) {
                        n5 = n4;
                        bl3 = true;
                    }
                    long l2 = dz2.a(n8, 0L);
                    by3 = dz2.a((short)221, n8, n5, (byte)0);
                    by4 = dz2.a((short)220, n8, n5, (byte)0);
                    n6 = dz2.a((short)125, n8, n5, 0);
                    n7 = dz2.a((short)124, n8, n5, 0);
                    by5 = dz2.a((short)90, n8, n5, (byte)0);
                    long l3 = dz2.a((short)9, n8, n5, 0L);
                    string2 = dz2.b((short)8, n8, n5);
                    string3 = dz2.b((short)24, n8, n5);
                    by6 = dz2.a((short)12, n8, n5, (short)0);
                    String[] stringArray = dz2.b((short)110, n8, n5);
                    if (!l.b((String)stringArray)) {
                        stringArray = l.b((String)stringArray, ";");
                        int n9 = 0;
                        while (n9 < stringArray.length) {
                            String[] stringArray2 = l.b(stringArray[n9], ":");
                            if (l.a(stringArray2[0], "border")) {
                                Short.parseShort(stringArray2[1]);
                            } else if (l.a(stringArray2[0], "color")) {
                                Short.parseShort(stringArray2[1]);
                            }
                            ++n9;
                        }
                    }
                    string4 = dz2.b((short)29, n8, n5);
                    egArray[n3] = new eg();
                    egArray[n3].b(l2);
                    egArray[n3].a(string5);
                    egArray[n3].a(n6);
                    egArray[n3].b(n7);
                    egArray[n3].c(by5);
                    egArray[n3].d(string4);
                    egArray[n3].b(by3);
                    egArray[n3].a(by4);
                    egArray[n3].a(l3);
                    egArray[n3].b(string2);
                    egArray[n3].c(string3);
                    egArray[n3].d(by6);
                    ++n3;
                }
            }
            egArray = (eg[])k.a(egArray, new ek(true));
        }
        this.a.a(string, s2, egArray);
    }

    private void i(dz dz2) {
        byte by2 = dz2.a(dz2.b((short)255, 0), (short)0);
        if (dv.a().y != by2) {
            return;
        }
        by2 = dz2.a(dz2.b((short)31, 0), (byte)0);
        int n2 = dz2.c((short)29);
        String[] stringArray = null;
        String[] stringArray2 = null;
        String string = dz2.b((short)207);
        dz2.b((short)109);
        if (n2 > 0) {
            int n3 = 0;
            stringArray = new String[n2];
            stringArray2 = new String[n2];
            n2 = 0;
            int n4 = 0;
            while (n3 < stringArray.length) {
                n2 = dz2.a((short)29, n2);
                n4 = dz2.a((short)30, n4);
                stringArray[n3] = dz2.b(n2);
                stringArray2[n3] = dz2.b(n4);
                ++n3;
            }
        }
        switch (by2) {
            case 0: {
                this.a.a(string, stringArray, stringArray2);
                return;
            }
            case 1: {
                this.a.b(string, stringArray, stringArray2);
                return;
            }
        }
        this.a.c(string, stringArray, stringArray2);
    }

    private void j(dz stringArray) {
        Object[] objectArray = stringArray.b((short)8);
        if (objectArray != null) {
            String[] stringArray2;
            int[] nArray = null;
            long[] lArray = null;
            if ((objectArray = l.b((String)objectArray, ";")) != null) {
                nArray = new int[objectArray.length];
                lArray = new long[objectArray.length];
                int n2 = 0;
                while (n2 < objectArray.length) {
                    stringArray2 = l.b(objectArray[n2], ":");
                    nArray[n2] = Integer.parseInt(stringArray2[0]);
                    lArray[n2] = Long.parseLong(stringArray2[1]);
                    ++n2;
                }
            }
            String string = stringArray.b((short)109);
            stringArray2 = stringArray.b((short)110);
            if (stringArray2 != null) {
                l.b((String)stringArray2, ";");
            }
            stringArray = l.b(string, ";");
            objectArray = new short[stringArray.length];
            int n3 = 0;
            while (n3 < objectArray.length) {
                objectArray[n3] = (String)((short)Integer.parseInt(stringArray[n3]));
                ++n3;
            }
            this.a.a(nArray, lArray, (short[])objectArray);
        }
    }

    private void k(dz stringArray) {
        stringArray.b((short)7);
        byte[] byArray = stringArray.a((short)209);
        stringArray = (String[])byArray;
        byte by2 = byArray[0];
        switch (by2) {
            case 3: {
                byte[] byArray2 = new byte[stringArray.length - 3];
                System.arraycopy(stringArray, 3, byArray2, 0, byArray2.length);
                return;
            }
            case 5: {
                Object object = new byte[stringArray.length - 1];
                System.arraycopy(stringArray, 1, object, 0, ((byte[])object).length);
                stringArray = l.a(object);
                if (l.a((String)stringArray)) break;
                stringArray = l.b((String)stringArray, ";");
                object = null;
                String string = null;
                if (stringArray != null && stringArray.length > 0) {
                    int n2 = 0;
                    while (n2 < stringArray.length) {
                        if (stringArray[n2].startsWith("id=")) {
                            object = stringArray[n2].substring(3);
                        }
                        if (stringArray[n2].startsWith("chatgroupId=")) {
                            string = stringArray[n2].substring("chatgroupId=".length());
                        }
                        ++n2;
                    }
                }
                if (l.a(string) && l.a((String)object)) {
                    return;
                }
                l.a(string);
            }
        }
    }

    private void l(dz stringArray) {
        byte by2 = stringArray.a(stringArray.b((short)255, 0), (short)0);
        if (dv.a().y != by2) {
            return;
        }
        eg[] egArray = stringArray.b((short)8);
        String string = stringArray.b((short)207);
        stringArray.b((short)109);
        stringArray.b((short)29);
        if (egArray != null && (stringArray = l.b((String)egArray, "\n")) != null && stringArray.length > 0) {
            egArray = new eg[stringArray.length];
            int n2 = 0;
            while (n2 < egArray.length) {
                egArray[n2] = new eg();
                egArray[n2].b(stringArray[n2]);
                ++n2;
            }
            this.a.a(string, egArray);
        }
    }

    private void m(dz object) {
        try {
            if (dv.a().d) {
                byte[] byArray = ((dz)object).a((short)214);
                int n2 = p.a(byArray[0], byArray[1]);
                int n3 = 0;
                if (dv.a().t == n2) {
                    byArray = ((dz)object).a((short)213);
                    if (byArray != null) {
                        dv.a().v = p.a(byArray);
                        if (dv.a().v <= 0) {
                            dv.a().v = 1;
                        }
                        byArray = ((dz)object).a((short)37);
                        n3 = p.c(byArray);
                        dv.a().l = new byte[n3];
                        dv.a().u = n3;
                    }
                    int n4 = dv.a().v;
                    byte[] byArray2 = ((dz)object).a((short)23);
                    System.arraycopy(byArray2, 0, dv.a().l, dv.a().s, byArray2.length);
                    dv.a().s += byArray2.length;
                    if (n2 >= n4 - 1) {
                        dv.a().d = false;
                        dv.a();
                        dv.a();
                        this.a.a(dv.a().s, dv.a().u);
                        ef ef2 = new ef();
                        String string = ((dz)object).b((short)7);
                        object = ((dz)object).b((short)24);
                        if (object == null) {
                            object = dv.a().w;
                        }
                        ef2.a = string;
                        ef2.a((String)object);
                        ef2.a(dv.a().l);
                        this.a.a(ef2);
                        dv.a().l = null;
                        return;
                    }
                    if (n2 == 0 && n3 >= 204800) {
                        this.a.d_();
                        return;
                    }
                    dv.a().d(n2);
                    return;
                }
            }
        }
        catch (OutOfMemoryError outOfMemoryError) {
            dv.a().l();
            this.a.e_();
        }
    }

    private void n(dz dz2) {
        int n2 = dz2.c((short)7);
        String[] stringArray = null;
        if (n2 > 0) {
            stringArray = new String[n2];
            n2 = dz2.b((short)7, 0);
            int n3 = 0;
            while (n3 < stringArray.length) {
                stringArray[n3] = dz2.b(n2);
                n2 = dz2.a((short)7, n2);
                ++n3;
            }
        }
    }

    private void o(dz ecArray) {
        try {
            String string = ecArray.b((short)28);
            ecArray = ecArray.b((short)30);
            if (ecArray != null) {
                ecArray = em.a((String)ecArray);
                this.a.a(string, ecArray);
                return;
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private void p(dz stringArray) {
        try {
            stringArray = stringArray.b((short)83);
            if (stringArray != null) {
                stringArray = l.b((String)stringArray, "|");
                String[] stringArray2 = new String[stringArray.length / 2];
                String[] stringArray3 = new String[stringArray2.length];
                int n2 = 0;
                while (n2 < stringArray2.length) {
                    stringArray2[n2] = stringArray[n2 << 1];
                    stringArray3[n2] = stringArray[(n2 << 1) + 1];
                    ++n2;
                }
                this.a.a(stringArray2, stringArray3);
                return;
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private void q(dz dz2) {
        Object var2_2 = null;
        int n2 = dz2.c((short)7);
        if (n2 > 0) {
            du[] duArray = new du[n2];
            int n3 = dz2.b((short)7, 0);
            int n4 = dz2.b((short)4, 0);
            int n5 = 0;
            while (n5 < duArray.length) {
                duArray[n5] = new du(dz2.b(n3));
                dz2.b(n4);
                ++n5;
            }
        }
    }

    private void r(dz object) {
        ((dz)object).b((short)7);
        ((dz)object).b((short)111);
        String[] stringArray = ((dz)object).b((short)109);
        String[] stringArray2 = ((dz)object).b((short)110);
        object = ((dz)object).b((short)112);
        stringArray = l.b((String)stringArray, ";");
        stringArray2 = l.b((String)stringArray2, ";");
        String[] stringArray3 = null;
        if (object != null) {
            stringArray3 = l.b((String)object, ";");
        }
        object = null;
        String[] stringArray4 = null;
        boolean[] blArray = null;
        if (stringArray != null && stringArray.length > 0) {
            object = new short[stringArray.length];
            stringArray4 = new String[stringArray.length];
            blArray = new boolean[stringArray.length];
            int n2 = 0;
            while (n2 < stringArray.length) {
                object[n2] = Short.parseShort(stringArray[n2]);
                stringArray4[n2] = stringArray2[n2];
                blArray[n2] = stringArray3 != null && stringArray3[n2] != null ? stringArray3[n2].equals("1") : false;
                ++n2;
            }
        }
    }

    private void s(dz dz2) {
        int n2 = dz2.c((short)129);
        dz2.b((short)21);
        dx[] dxArray = null;
        if (n2 > 0) {
            dxArray = new dx[n2];
            int n3 = dz2.b((short)129, 0);
            int n4 = 0;
            while (n4 < n2) {
                int n5 = dz2.a((short)129, n3);
                dz2.b(n3);
                dz2.b((short)22, n3, n5);
                dz2.b((short)13, n3, n5);
                dz2.b((short)24, n3, n5);
                dxArray[n4] = new dx();
                n3 = n5;
                ++n4;
            }
        }
    }

    private void t(dz dz2) {
        dz2.b((short)129);
        du[] duArray = null;
        int n2 = dz2.c((short)7);
        if (n2 > 0) {
            duArray = new du[n2];
            int n3 = dz2.b((short)7, 0);
            int n4 = 0;
            while (n4 < n2) {
                int n5 = dz2.a((short)7, n3);
                String string = dz2.b(n3);
                String string2 = dz2.b((short)22, n3, n5);
                n3 = dz2.a((short)45, n3, n5, (short)0);
                duArray[n4] = new du();
                duArray[n4].a(string);
                duArray[n4].b(string2);
                duArray[n4].a((short)n3);
                n3 = n5;
                ++n4;
            }
        }
    }

    private void u(dz dz2) {
        int n2 = dz2.c((short)109);
        if (n2 > 0) {
            ej[] ejArray = new ej[n2];
            int n3 = dz2.b((short)109, 0);
            int n4 = 0;
            while (n4 < n2) {
                String string;
                int n5 = dz2.a((short)109, n3);
                ejArray[n4] = new ej();
                dz2.b(n3);
                dz2.b((short)112, n3, n5);
                dz2.b((short)110, n3, n5);
                String string2 = dz2.b((short)113, n3, n5);
                if (string2 != null) {
                    l.b(string2, ".");
                }
                if (!l.a(string = dz2.b((short)111, n3, n5))) {
                    em.a(string);
                }
                n3 = n5;
                ++n4;
            }
        }
    }

    private void v(dz dz2) {
        dz2.b((short)7);
        int n2 = dz2.c((short)110);
        if (n2 > 0) {
            ei[] eiArray = new ei[n2];
            int n3 = dz2.b((short)110, 0);
            int n4 = 0;
            while (n4 < n2) {
                int n5 = dz2.a((short)110, n3);
                eiArray[n4] = new ei();
                dz2.b(n3);
                dz2.b((short)28, n3, n5);
                dz2.b((short)30, n3, n5);
                dz2.b((short)109, n3, n5);
                n3 = n5;
                ++n4;
            }
        }
    }

    private void w(dz dz2) {
        int n2;
        int n3 = 0;
        byte[] byArray = dz2.a((short)31);
        short s2 = 3;
        if (byArray != null) {
            s2 = byArray[0];
        }
        if ((n2 = dz2.c((short)29)) <= 0) {
            return;
        }
        ds[] dsArray = new ds[n2];
        int n4 = dz2.b((short)29, 0);
        boolean bl2 = false;
        int n5 = 0;
        while (!bl2) {
            int n6 = n4;
            if ((n4 = dz2.a((short)29, n6)) < 0) {
                bl2 = true;
            }
            ec[] ecArray = dz2.b(n6);
            String string = dz2.b((short)28, n6, n4);
            byte by2 = dz2.a((short)70, n6, n4, (short)1);
            n3 += by2;
            dsArray[n5] = new ds();
            dsArray[n5].a(s2);
            dsArray[n5].b(by2);
            dsArray[n5].a(string);
            dsArray[n5].b((String)ecArray);
            ecArray = dz2.b((short)30, n6, n4);
            if (ecArray != null) {
                ecArray = em.a((String)ecArray);
                dsArray[n5].a(ecArray);
            }
            ++n5;
        }
        this.a.a(n3, dsArray);
    }

    private void x(dz dz2) {
        int n2 = dz2.c((short)207);
        eb[] ebArray = null;
        if (n2 > 0) {
            ebArray = new eb[n2];
            n2 = dz2.b((short)207, 0);
            int n3 = dz2.b((short)200, 0);
            int n4 = dz2.b((short)205, 0);
            int n5 = 0;
            while (n2 >= 0) {
                String string = dz2.b(n2);
                byte[] byArray = dz2.a(n3);
                long l2 = p.d(byArray);
                byArray = dz2.a(n4);
                int n6 = p.c(byArray);
                ebArray[n5] = new eb();
                ebArray[n5].b(string);
                ebArray[n5].b(l2);
                ebArray[n5].a(n6);
                n2 = dz2.a((short)207, n2);
                n3 = dz2.a((short)200, n3);
                n4 = dz2.a((short)205, n4);
                ++n5;
            }
        }
        this.a.a(ebArray);
    }

    private void y(dz dz2) {
        int n2 = dz2.c((short)28);
        byte[] byArray = dz2.a((short)200);
        long l2 = p.d(byArray);
        eb[] ebArray = null;
        if (n2 > 0) {
            ebArray = new eb[n2];
            n2 = dz2.b((short)28, 0);
            int n3 = dz2.b((short)65, 0);
            int n4 = 0;
            while (n2 >= 0) {
                ebArray[n4] = new eb();
                String string = dz2.b(n2);
                byArray = dz2.a(n3);
                long l3 = p.d(byArray);
                ebArray[n4].a(string);
                ebArray[n4].a(l3);
                n2 = dz2.a((short)28, n2);
                n3 = dz2.a((short)65, n3);
                ++n4;
            }
        }
        this.a.a(l2, ebArray);
    }

    private void z(dz stringArray) {
        String string;
        ef[] efArray = null;
        ec[] ecArray = null;
        String string2 = stringArray.b((short)28);
        String string3 = stringArray.b((short)29);
        int n2 = stringArray.c((short)23);
        if (n2 > 0) {
            efArray = new ef[n2];
            n2 = stringArray.b((short)23, 0);
            int n3 = 0;
            while (n2 >= 0) {
                efArray[n3] = new ef();
                efArray[n3].a(stringArray.a(n2));
                n2 = stringArray.b((short)23, n2);
                ++n3;
            }
        }
        if ((string = stringArray.b((short)30)) != null) {
            String string4 = string;
            stringArray = l.b(string4, "^");
            ecArray = new ec[stringArray.length];
            boolean bl2 = false;
            int n4 = 0;
            while (n4 < stringArray.length) {
                String[] stringArray2 = stringArray[n4];
                String[] stringArray3 = l.a((String)stringArray2, "|", 2, true);
                stringArray2 = stringArray3[0];
                stringArray2 = l.a((String)stringArray2, ":", 3, true);
                ed[] edArray = stringArray2[0];
                String string5 = null;
                if (stringArray2.length == 3) {
                    string5 = stringArray2[1];
                }
                Object object = stringArray2.length == 3 ? stringArray2[2] : stringArray2[1];
                int n5 = object.indexOf(32);
                String[] stringArray4 = object.substring(n5 + 1);
                String string6 = object.substring(0, n5);
                if (edArray.toLowerCase().equals("wap".toLowerCase())) {
                    ecArray[n4] = new ec("wap");
                    ecArray[n4].a(string6);
                    ecArray[n4].d((String)stringArray4);
                    ecArray[n4].e(string5);
                } else if (edArray.toLowerCase().equals("call".toLowerCase())) {
                    ecArray[n4] = new ec("call");
                    ecArray[n4].b(string6);
                    ecArray[n4].d((String)stringArray4);
                    ecArray[n4].e(string5);
                } else if (edArray.toLowerCase().equals("sms".toLowerCase())) {
                    ecArray[n4] = new ec("sms");
                    ecArray[n4].c(string6);
                    ecArray[n4].d((String)stringArray4);
                    ecArray[n4].e(string5);
                    string6 = stringArray3[1];
                    stringArray3 = l.b(string6, "#");
                    string6 = stringArray3[0];
                    if (stringArray3.length > 1) {
                        edArray = new ed[stringArray3.length - 1];
                        int n6 = 1;
                        while (n6 < stringArray3.length) {
                            object = stringArray3[n6];
                            object = l.b((String)object, "|");
                            stringArray4 = object[0];
                            int n7 = Integer.parseInt(object[1]);
                            edArray[n6 - 1] = new ed();
                            edArray[n6 - 1].a = n7;
                            edArray[n6 - 1].b = stringArray4;
                            if (((String[])object).length > 2) {
                                stringArray4 = new String[(((String[])object).length - 2) / 2];
                                String[] stringArray5 = new String[(((String[])object).length - 2) / 2];
                                int n8 = 0;
                                int n9 = 2;
                                while (n9 < ((String[])object).length) {
                                    stringArray4[n8] = object[n9];
                                    stringArray5[n8] = object[++n9];
                                    ++n8;
                                    ++n9;
                                }
                                edArray[n6 - 1].d = stringArray4;
                                edArray[n6 - 1].e = stringArray5;
                            }
                            ++n6;
                        }
                        ecArray[n4].f(string6);
                        ecArray[n4].a(edArray);
                    }
                }
                ++n4;
            }
        }
        this.a.a(string2, string3, efArray, ecArray);
    }

    private void A(dz dz2) {
        int n2 = dz2.a(dz2.b((short)255, 0), (short)0);
        if (dv.a().x != n2) {
            return;
        }
        n2 = dz2.c((short)8);
        Object[] objectArray = null;
        if (n2 > 0) {
            objectArray = new eg[n2];
            n2 = 0;
            int n3 = dz2.a((short)67, -1);
            boolean bl2 = false;
            while (!bl2) {
                int n4 = n3;
                if ((n3 = dz2.a((short)67, n4)) < 0) {
                    bl2 = true;
                }
                byte by2 = 0;
                byte by3 = 0;
                int n5 = 0;
                int n6 = 0;
                byte by4 = 0;
                String string = null;
                String string2 = null;
                String string3 = null;
                String string4 = dz2.b(n4);
                string4 = string4.toLowerCase();
                n4 = dz2.a((short)72, n4);
                boolean bl3 = false;
                while (!bl3) {
                    int n7 = n4;
                    if ((n4 = dz2.a((short)72, n7, n3)) < 0) {
                        n4 = n3;
                        bl3 = true;
                    }
                    long l2 = dz2.a(n7, 0L);
                    by2 = dz2.a((short)221, n7, n4, (byte)0);
                    by3 = dz2.a((short)220, n7, n4, (byte)0);
                    n5 = dz2.a((short)125, n7, n4, 0);
                    n6 = dz2.a((short)124, n7, n4, 0);
                    by4 = dz2.a((short)90, n7, n4, (byte)0);
                    long l3 = dz2.a((short)9, n7, n4, 0L);
                    string = dz2.b((short)8, n7, n4);
                    string2 = dz2.b((short)24, n7, n4);
                    String[] stringArray = dz2.b((short)110, n7, n4);
                    if (!l.b((String)stringArray)) {
                        stringArray = l.b((String)stringArray, ";");
                        int n8 = 0;
                        while (n8 < stringArray.length) {
                            String[] stringArray2 = l.b(stringArray[n8], ":");
                            if (l.a(stringArray2[0], "border")) {
                                Short.parseShort(stringArray2[1]);
                            } else if (l.a(stringArray2[0], "color")) {
                                Short.parseShort(stringArray2[1]);
                            }
                            ++n8;
                        }
                    }
                    string3 = dz2.b((short)29, n7, n4);
                    objectArray[n2] = new eg();
                    ((eg)objectArray[n2]).b(l2);
                    ((eg)objectArray[n2]).a(string4);
                    ((eg)objectArray[n2]).a(n5);
                    ((eg)objectArray[n2]).b(n6);
                    ((eg)objectArray[n2]).c(by4);
                    ((eg)objectArray[n2]).d(string3);
                    ((eg)objectArray[n2]).b(by2);
                    ((eg)objectArray[n2]).a(by3);
                    ((eg)objectArray[n2]).a(l3);
                    ((eg)objectArray[n2]).b(string);
                    ((eg)objectArray[n2]).c(string2);
                    dv.a();
                    ++n2;
                }
            }
            objectArray = (eg[])k.a(objectArray, new ek(true));
        }
        if (objectArray != null && objectArray.length > 0) {
            eg[] egArray = null;
            eg eg2 = objectArray[objectArray.length - 1];
            if (objectArray.length > 1) {
                egArray = new eg[objectArray.length - 1];
                System.arraycopy(objectArray, 0, egArray, 0, egArray.length);
            }
            this.a.a(eg2, egArray);
        }
    }

    private void B(dz dz2) {
        dz2.b((short)109);
        int n2 = dz2.c((short)110);
        ef[] efArray = null;
        if (n2 > 0) {
            efArray = new ef[n2];
            int n3 = dz2.b((short)110, 0);
            int n4 = dz2.b((short)23, 0);
            int n5 = 0;
            while (n5 < n2) {
                efArray[n5] = new ef();
                efArray[n5].a = dz2.b(n3);
                efArray[n5].f = dz2.a(n4);
                n3 = dz2.a((short)110, n3);
                n4 = dz2.a((short)23, n4);
                ++n5;
            }
        }
    }

    private void C(dz dz2) {
        int n2 = dz2.c((short)7);
        if (n2 > 0) {
            du[] duArray = new du[n2];
            int n3 = dz2.a((short)7, -1);
            int n4 = 0;
            while (n4 < n2) {
                String string = dz2.b(n3);
                n3 = dz2.a((short)7, n3);
                duArray[n4] = new du();
                duArray[n4].a(string);
                ++n4;
            }
        }
    }

    private void D(dz stringArray) {
        String string = stringArray.b((short)5);
        String string2 = stringArray.b((short)29);
        stringArray = stringArray.b((short)8);
        if ((stringArray = l.b((String)stringArray, ";")) != null && stringArray.length > 0 && stringArray.length % 2 == 0) {
            String[] stringArray2 = new String[stringArray.length / 2];
            String[] stringArray3 = new String[stringArray.length / 2];
            int n2 = 0;
            while (n2 < stringArray.length) {
                stringArray3[n2 / 2] = stringArray[n2];
                stringArray2[n2 / 2] = stringArray[n2 + 1];
                n2 += 2;
            }
            this.a.a(string2, string, stringArray3, stringArray2);
        }
    }

    public final void a() {
        this.c = true;
        if (this.b != null) {
            this.b.b();
            this.b = null;
        }
    }

    public final void a(dw dw2) {
        this.a = dw2;
        if (this.b != null) {
            this.b.a(this.a);
        }
    }

    private static ec[] a(String stringArray) {
        if ((stringArray = l.b((String)stringArray, "^")) == null || stringArray.length == 0) {
            return null;
        }
        ec[] ecArray = new ec[stringArray.length];
        boolean bl2 = false;
        int n2 = 0;
        int n3 = 0;
        while (n3 < stringArray.length) {
            String[] stringArray2 = stringArray[n3];
            String[] stringArray3 = l.a((String)stringArray2, "|", 2, false);
            stringArray2 = stringArray3[0];
            stringArray2 = l.a((String)stringArray2, ":", 3, false);
            ed[] edArray = stringArray2[0];
            String string = null;
            if (stringArray2.length == 3) {
                string = stringArray2[1];
            }
            Object object = stringArray2.length == 3 ? stringArray2[2] : stringArray2[1];
            int n4 = object.indexOf(32);
            Object object2 = n4 < 0 ? object : object.substring(n4 + 1);
            Object object3 = n4 <= 0 ? "" : object.substring(0, n4);
            object = edArray.toLowerCase();
            if (object.equals("wap".toLowerCase())) {
                ecArray[n2] = new ec("wap");
                ecArray[n2].a((String)object3);
                ecArray[n2].d((String)object2);
                ecArray[n2].e(string);
                ++n2;
            } else if (object.equals("viewme".toLowerCase())) {
                ecArray[n2] = new ec("viewme");
                ecArray[n2].a((String)object3);
                ecArray[n2].d((String)object2);
                ecArray[n2].e(string);
                ++n2;
            } else if (object.equals("viewbox".toLowerCase())) {
                ecArray[n2] = new ec("viewbox");
                ecArray[n2].a((String)object3);
                ecArray[n2].d((String)object2);
                ecArray[n2].e(string);
                ++n2;
            } else if (object.equals("viewproposalrequest".toLowerCase())) {
                ecArray[n2] = new ec("viewproposalrequest");
                ecArray[n2].a((String)object3);
                ecArray[n2].d((String)object2);
                ecArray[n2].e(string);
                ++n2;
            } else if (object.equals("viewproposallist".toLowerCase())) {
                ecArray[n2] = new ec("viewproposallist");
                ecArray[n2].a((String)object3);
                ecArray[n2].d((String)object2);
                ecArray[n2].e(string);
                ++n2;
            } else if (object.equals("viewmedia".toLowerCase())) {
                ecArray[n2] = new ec("viewmedia");
                object3 = new ef();
                ((ef)object3).a((String)object2);
                ecArray[n2].e(string);
                ++n2;
            } else if (object.equals("xt".toLowerCase())) {
                ecArray[n2] = new ec("xt");
                ecArray[n2].a((String)object3);
                ecArray[n2].d((String)object2);
                ecArray[n2].e(string);
                ++n2;
            } else if (object.equals("app".toLowerCase())) {
                ecArray[n2] = new ec("app");
                ecArray[n2].a((String)object3);
                ecArray[n2].d((String)object2);
                ecArray[n2].e(string);
                ++n2;
            } else if (object.equals("dpk".toLowerCase())) {
                ecArray[n2] = new ec("dpk");
                ecArray[n2].a((String)object3);
                ecArray[n2].d((String)object2);
                ecArray[n2].e(string);
                ++n2;
            } else if (object.equals("rss".toLowerCase())) {
                ecArray[n2] = new ec("rss");
                ecArray[n2].a((String)object3);
                ecArray[n2].d((String)object2);
                ecArray[n2].e(string);
                ++n2;
            } else if (object.equals("vip".toLowerCase())) {
                ecArray[n2] = new ec("vip");
                if (object3 == null || ((String)object3).length() == 0) {
                    object3 = dv.a().f;
                }
                ecArray[n2].a((String)object3);
                ecArray[n2].d((String)object2);
                ecArray[n2].e(string);
                ++n2;
            } else if (object.equals("call".toLowerCase())) {
                ecArray[n2] = new ec("call");
                ecArray[n2].b((String)object3);
                ecArray[n2].d((String)object2);
                ecArray[n2].e(string);
                ++n2;
            } else if (object.equals("sms".toLowerCase()) || object.equals("msg".toLowerCase())) {
                ecArray[n2] = new ec((String)edArray);
                ecArray[n2].c((String)object3);
                ecArray[n2].d((String)object2);
                ecArray[n2].e(string);
                object3 = stringArray3[1];
                stringArray3 = l.b((String)object3, "#");
                object3 = stringArray3[0];
                if (stringArray3.length > 1) {
                    edArray = new ed[stringArray3.length - 1];
                    int n5 = 1;
                    while (n5 < stringArray3.length) {
                        object = stringArray3[n5];
                        object = l.b((String)object, "|");
                        object2 = object[0];
                        int n6 = Integer.parseInt(object[1]);
                        edArray[n5 - 1] = new ed();
                        edArray[n5 - 1].a = n6;
                        edArray[n5 - 1].b = object2;
                        if (n6 == 10) {
                            edArray[n5 - 1].c = ((String[])object).length > 2 ? object[2] : dv.a().f;
                        } else if ((n6 == 4 || n6 == 5 || n6 == 6) && ((String[])object).length > 2) {
                            object2 = new String[(((String[])object).length - 2) / 2];
                            String[] stringArray4 = new String[(((String[])object).length - 2) / 2];
                            int n7 = 0;
                            int n8 = 2;
                            while (n8 < ((String[])object).length) {
                                object2[n7] = object[n8];
                                stringArray4[n7] = object[++n8];
                                ++n7;
                                ++n8;
                            }
                            edArray[n5 - 1].d = object2;
                            edArray[n5 - 1].e = stringArray4;
                        }
                        ++n5;
                    }
                    ecArray[n2].a(edArray);
                }
                ecArray[n2].f((String)object3);
                ++n2;
            }
            ++n3;
        }
        if (n2 < ecArray.length) {
            ec[] ecArray2 = new ec[n2];
            System.arraycopy(ecArray, 0, ecArray2, 0, n2);
            ecArray = ecArray2;
        }
        return ecArray;
    }

    private static j[] a(dz dz2, j[] jArray, boolean bl2, short s2) {
        int n2 = dz2.c((short)21);
        j[] jArray2 = null;
        if (n2 > 0) {
            Object var3_6 = null;
            var3_6 = null;
            Object var4_13 = null;
            var3_6 = null;
            var4_13 = null;
            boolean bl3 = false;
            short s3 = 0;
            short s4 = 0;
            short s5 = 0;
            int n3 = 0;
            short s6 = 0;
            jArray2 = new j[n2];
            boolean bl4 = false;
            short s7 = dz2.b((short)21, 0);
            int n4 = 0;
            int n5 = 0;
            while (n5 < n2) {
                int n6;
                short s8 = s7;
                s7 = dz2.a((short)21, (int)s8);
                String string = dz2.b((int)s8);
                jArray2[n5] = new j(string);
                byte by2 = dz2.a((short)20, (int)s8, (int)s7, (short)0);
                jArray2[n5].a(by2);
                s5 = s7;
                s4 = s8;
                s3 = 7;
                Object object = dz2;
                n3 = 0;
                if (((dz)object).c == null) {
                    n6 = 0;
                } else {
                    s3 = s4;
                    s6 = s5;
                    if (s4 < 0) {
                        s3 = -1;
                    } else if (s4 >= ((dz)object).c.length) {
                        s3 = ((dz)object).c.length - 1;
                    }
                    if (s5 < 0) {
                        s6 = ((dz)object).c.length;
                    }
                    if (s3 + 1 >= s6) {
                        n6 = 0;
                    } else {
                        ++s3;
                        while (s3 < ((dz)object).c.length && s3 < s6) {
                            if (((dz)object).c[s3].a == 7) {
                                ++n3;
                            }
                            ++s3;
                        }
                        n6 = n4 = n3;
                    }
                }
                if (n6 > 0) {
                    du[] duArray = new du[n4];
                    s4 = dz2.a((short)7, (int)s8);
                    int n7 = 0;
                    while (n7 < n4) {
                        s3 = s4;
                        s4 = dz2.a((short)7, (int)s3);
                        object = dz2.b((int)s3);
                        object = ((String)object).toLowerCase();
                        duArray[n7] = new du();
                        duArray[n7].a((String)object);
                        Object object2 = dz2.b((short)22, s3, s4);
                        if (object2 == null) {
                            object2 = object;
                        }
                        duArray[n7].b((String)object2);
                        s5 = 0;
                        n3 = 0;
                        s6 = 0;
                        int n8 = dz2.a((short)12, s3, s4);
                        if (n8 >= 0) {
                            s6 = dz2.a(n8, (short)0);
                            s5 = dz2.a((short)45, (int)s3, (int)s4, (short)0);
                            n3 = dz2.a((short)38, (int)s3, (int)s4, (short)0);
                        }
                        object = dz2.b((short)13, s3, s4);
                        object2 = dz2.b((short)86, s3, s4);
                        duArray[n7].a(s5);
                        duArray[n7].b((short)n3);
                        duArray[n7].d((String)object2);
                        duArray[n7].c(s6);
                        duArray[n7].c((String)object);
                        ++n7;
                    }
                    jArray2[n5].a(duArray);
                }
                ++n5;
            }
            j[] jArray3 = jArray2;
            s3 = 0;
            s4 = 1;
            while (s4 < jArray3.length) {
                if (jArray3[s4 - 1].a() == 1) {
                    ++s3;
                } else {
                    s5 = s4;
                    while (s5 > s3 && jArray3[s5].b().compareTo(jArray3[s5 - 1].b()) < 0) {
                        j j2 = jArray3[s5 - 1];
                        jArray3[s5 - 1] = jArray3[s5];
                        jArray3[s5] = j2;
                        --s5;
                    }
                }
                ++s4;
            }
        }
        return jArray2;
    }
}

