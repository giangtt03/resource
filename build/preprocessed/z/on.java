import com.mg.smsgame.MGMIDlet;
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class on extends fb implements bf, bg, bn, bq {
  private aw r;
  
  private ay s;
  
  private int t = 0;
  
  private ex u;
  
  private String[] v;
  
  private String w;
  
  private String x;
  
  private int y;
  
  private int z;
  
  private boolean A;
  
  private long B = 0L;
  
  private String[][] C;
  
  public a p;
  
  public boolean q = false;
  
  private int D;
  
  private long E = -1L;
  
  private aw F = null;
  
  private ay G = null;
  
  private a H = null;
  
  private String I = null;
  
  private String J;
  
  private int K;
  
  private boolean L = false;
  
  private int M = -1987;
  
  private fu N;
  
  private int O = 0;
  
  private long P;
  
  private String[] Q = new String[] { "Bạn đang làm gì?", "Bạn đang nghĩ gì?", "Hôm nay có gì HOT?", "Ngoài trời đang...?", "Bạn đang xem gì?", "Hôm nay có gì vui?", "Nếu có 1 điều ước..." };
  
  public on(int paramInt1, int paramInt2, String paramString) {
    super(107, 5, paramString, false);
    a(0, 0, v.t, v.u);
    this.v = bx.a("Ola Me - Loan tin tức thời. Bạn có thể lắng nghe và chia sẻ tâm sự với những người được quan tâm. Phiên bản web tại http://me.ola.vn ", v.t, bx.d);
    this.u = new ex("Xem ME", -2);
    this.u.a((v.t - 100) / 2, 10 + bx.d.a() + 10 + 10 + bx.d.a() * this.v.length, 100, 20);
    a();
    a(new ba());
    j(0);
    this.C = pd.E();
    this.p = new a();
    a(new gb(-1, 0));
    c(a.n);
    b(new gb(-2, 1));
    a(this);
  }
  
  private void a() {
    this.r = new aw();
    this.r.a(this);
    this.r.a(this);
    this.r.h(5);
    this.s = new ay(0);
    this.s.a(1, 0, v.t - 2, v.u - ba.a);
    this.s.b(this.r);
  }
  
  private he a(String paramString) {
    he he;
    (he = a.a(paramString, null, "Xong", -5, "Hủy", -3, -9, this)).b(-989858);
    this.N = (fu)he.e(4);
    return he;
  }
  
  private void v() {
    this.F = null;
    this.G = null;
    this.H = null;
    this.I = null;
    this.J = null;
  }
  
  private void w() {
    this.r = this.F;
    this.s = this.G;
    this.p = this.H;
    this.z = this.K;
    this.w = this.I;
    this.x = this.J;
    if (this.x != null) {
      bx.d.c(true);
      this.y = bx.d.a(this.x) + 6;
      bx.d.c();
    } 
    v();
    c(true);
  }
  
  public final void a(ef paramef, ef[] paramArrayOfef) {
    if (!z()) {
      on on1;
      (on1 = this).F = on1.r;
      on1.G = on1.s;
      on1.K = on1.z;
      on1.I = on1.w;
      on1.J = on1.x;
      on1.H = on1.p;
      a();
    } 
    if (this.w == null || !this.w.equals("Bình luận") || this.A) {
      this.p = new a();
      if (paramArrayOfef == null) {
        paramArrayOfef = new ef[] { paramef };
      } else {
        ef[] arrayOfEf = new ef[paramArrayOfef.length + 1];
        System.arraycopy(paramArrayOfef, 0, arrayOfEf, 1, paramArrayOfef.length);
        arrayOfEf[0] = paramef;
        paramArrayOfef = arrayOfEf;
      } 
    } 
    a("Bình luận", (short)3, paramArrayOfef, true);
  }
  
  public final void a(String paramString, short paramShort, ef[] paramArrayOfef) {
    a(paramString, paramShort, paramArrayOfef, false);
    if (paramString != null && paramString.equals("#12")) {
      if (paramArrayOfef == null || paramArrayOfef.length == 0)
        return; 
      if (paramArrayOfef.length > 1) {
        if (paramArrayOfef[0].e() < paramArrayOfef[1].e())
          this.P = paramArrayOfef[1].e(); 
      } else {
        this.P = paramArrayOfef[0].e();
      } 
      boolean bool = true;
      on on1;
      if (!pd.d(this.P) && (on1 = this).b != null) {
        fc fc;
        (fc = (fc)on1.l()).e(on1);
        on1.c(true);
      } 
    } 
  }
  
  private void a(String paramString, short paramShort, ef[] paramArrayOfef, boolean paramBoolean) {
    a.s().v();
    if (paramArrayOfef == null || paramArrayOfef.length == 0)
      return; 
    if (!paramBoolean)
      v(); 
    dl[] arrayOfDl = new dl[paramArrayOfef.length];
    int i;
    for (i = 0; i < arrayOfDl.length; i++) {
      arrayOfDl[i] = new dl(paramArrayOfef[i], this.r.e() - 4);
      arrayOfDl[i].a(paramArrayOfef[i].d());
    } 
    arrayOfDl = arrayOfDl;
    short s = paramShort;
    String str = paramString;
    on on1 = this;
    try {
      i = on1.r.s();
      on1.z = s;
      try {
        if ((on1.w == null && str != null) || (on1.w != null && str == null) || (on1.w != null && !on1.w.equals(str)) || on1.A) {
          on1.r.q();
          on1.p.a();
          if (a.m != null)
            a.m.q.a(); 
          i = 1;
          on1.A = false;
        } 
      } catch (Exception exception2) {
        Exception exception1;
        (exception1 = null).printStackTrace();
      } 
      on1.w = str;
      if (on1.w == null) {
        on1.x = "Trang chủ";
      } else {
        on1.x = str;
        oi oi;
        if ((oi = a.m) != null && oi.s != null)
          for (byte b1 = 0; b1 < oi.s.length; b1++) {
            if (oi.s[b1].equals(str)) {
              on1.x = oi.t[b1];
              break;
            } 
          }  
      } 
      if (on1.x != null) {
        bx.d.c(true);
        on1.y = bx.d.a(on1.x) + 6;
        bx.d.c();
      } 
      boolean bool = on1.z();
      if (on1.r.a() > 0) {
        if (on1.L) {
          if (bool) {
            on1.r.a((Object[])arrayOfDl, 2);
          } else {
            on1.r.a((Object[])arrayOfDl, 1);
          } 
        } else {
          on1.r.a((Object[])arrayOfDl, on1.r.a() - 1);
        } 
      } else {
        if (bool)
          (arrayOfDl[0]).n = true; 
        on1.r.a(new dp("Xem mới nhất", null));
        on1.r.a((Object[])arrayOfDl);
        on1.r.a(new dp("Xem thêm", null));
      } 
      for (byte b = 0; b < arrayOfDl.length; b++) {
        if (bool && on1.E >= 0L && (arrayOfDl[b]).e == on1.E && !(arrayOfDl[b]).n)
          (arrayOfDl[b]).o = true; 
        a a1 = on1.p;
        dl dl;
        a a2 = (dl = arrayOfDl[b]).a.d();
        if (dl.d != null && dl.d.j == -10)
          a1.a(dl.d.i); 
        for (byte b1 = 0; b1 < a2.d(); b1++) {
          n n;
          if ((n = dl.a.a(b1)).c() == 1 && ((lo)(n = n)).j == -10)
            a1.a(((lo)n).i); 
        } 
      } 
      dp dp = (dp)on1.r.i(on1.r.a() - 1);
      dl dl1 = (dl)on1.r.i(1);
      dl dl2 = (dl)on1.r.i(on1.r.a() - 2);
      dp.b = new long[] { dl2.e, dl2.e };
      dp = (dp)on1.r.i(0);
      if (bool && on1.r.a() >= 4)
        dl1 = (dl)on1.r.i(2); 
      dp.b = new long[] { dl1.e, -dl1.e };
      if (i > 1)
        i--; 
      on1.r.k(i);
      on1.j(4);
      if (!bool) {
        on1.C = pd.a(on1.C, on1.x, str);
        return;
      } 
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
    } 
  }
  
  private boolean z() {
    return (this.w != null && this.w.equals("Bình luận"));
  }
  
  private void j(int paramInt) {
    this.t = paramInt;
    if (paramInt == 0)
      this.u.d(true); 
    c(true);
  }
  
  private void A() {
    long l = 0L;
    String str = null;
    on on1;
    (on1 = this).a(str, l, true);
  }
  
  public final void c(boolean paramBoolean) {
    super.c(paramBoolean);
    if (paramBoolean)
      this.s.c(true); 
  }
  
  public final boolean f(int paramInt) {
    if (this.t == 0) {
      if (paramInt == 95) {
        A();
        return true;
      } 
    } else {
      if (paramInt == 153) {
        C();
        return true;
      } 
      if (paramInt == 148) {
        A();
        return true;
      } 
      if (paramInt == this.M) {
        boolean bool = false;
        if (this.r.t() instanceof dl) {
          fp fp = (fp)this.r.u();
          if (paramInt == 99) {
            bool = fp.r();
          } else if (paramInt == 98) {
            bool = fp.q();
          } 
          if (bool) {
            fp.a();
            return true;
          } 
        } 
        if (paramInt == 99) {
          bool = this.r.x();
        } else if (paramInt == 98) {
          bool = this.r.y();
        } 
        if (bool) {
          if (this.r.t() instanceof dl) {
            fp fp;
            (fp = (fp)this.r.u()).a();
          } 
          return true;
        } 
      } else {
        this.M = paramInt;
      } 
      return this.s.f(paramInt);
    } 
    return false;
  }
  
  public final boolean g(int paramInt) {
    this.M = -1987;
    return true;
  }
  
  public final boolean c(int paramInt1, int paramInt2) {
    if (this.t == 0) {
      if (this.u.h().b(paramInt1, paramInt2)) {
        this.u.d(true);
        f(95);
        return true;
      } 
    } else {
      return this.s.c(paramInt1, paramInt2);
    } 
    return super.c(paramInt1, paramInt2);
  }
  
  public final boolean e(int paramInt1, int paramInt2) {
    return (this.t != 0) ? this.s.e(paramInt1, paramInt2) : super.e(paramInt1, paramInt2);
  }
  
  public final boolean f(int paramInt1, int paramInt2) {
    return (this.t != 0) ? this.s.f(paramInt1, paramInt2) : super.f(paramInt1, paramInt2);
  }
  
  public final void n() {
    if (this.t != 0)
      this.s.n(); 
  }
  
  private static void a(Graphics paramGraphics) {
    paramGraphics.setColor(v.am);
    paramGraphics.fillRect(0, 0, v.t, v.u - ba.a);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (this.t == 0) {
      if (this.c) {
        a(paramGraphics);
        bx.d.c(true);
        bx.d.a(paramGraphics, "Giới thiệu", v.t >>> 1, 10, 1);
        bx.d.c();
        paramInt1 = 10 + 10 + bx.d.a();
        bx.a(paramGraphics, bx.d, this.v, 0, paramInt1, v.t, v.u, 1);
        this.u.a(paramGraphics, c(), d());
        c(false);
        return;
      } 
    } else if (this.s.k()) {
      a(paramGraphics);
      this.s.a(paramGraphics, c(), d());
      if (this.x != null) {
        paramInt1 = v.t - this.y;
        pc.a(paramGraphics, paramInt1, 0, this.y, 18, 15663104, 16177368);
        bx.d.c(true);
        bx.d.a(paramGraphics, this.x, paramInt1 + 3, 2, 0);
        bx.d.c();
      } 
    } 
  }
  
  public final void x() {
    this.q = false;
    c(true);
    if (this.w != null && this.w.equals("#12"))
      pd.c(this.P); 
  }
  
  public final void y() {}
  
  public final void a(aq paramaq, int paramInt) {}
  
  public final void a(aq paramaq, int paramInt1, int paramInt2) {}
  
  public final void d(int paramInt1, int paramInt2) {
    on on1;
    String str;
    hp hp;
    bs bs;
    int i;
    oi oi;
    switch (paramInt2) {
      case -1:
        on1 = this;
        (bs = new bs()).a(new gb(0, 2));
        bs.b(new gb(1, 3));
        if ((oi = a.m) != null) {
          if (on1.t == 4) {
            br[] arrayOfBr;
            if (on1.z()) {
              arrayOfBr = new br[] { new br("Gửi Me", 1070007), new br("Trở về", 1070008), new br("Đóng", 1070009) };
            } else {
              arrayOfBr = new br[] { new br("Gửi Me", 1070007), new br("Xem ME", 1070002), new br("Cập nhật", 1070010), new br("Đóng", 1070009) };
              if (on1.C != null && on1.C.length > 0) {
                br[] arrayOfBr2 = new br[5];
                System.arraycopy(arrayOfBr, 0, arrayOfBr2, 0, 2);
                arrayOfBr2[2] = new br("Nhật ký", 1070011);
                br[] arrayOfBr3 = new br[on1.C.length];
                for (byte b2 = 0; b2 < arrayOfBr3.length; b2++)
                  arrayOfBr3[b2] = new br(on1.C[b2][0], 1070011); 
                arrayOfBr2[2].a(arrayOfBr3);
                System.arraycopy(arrayOfBr, 2, arrayOfBr2, 3, 2);
                arrayOfBr = arrayOfBr2;
              } 
              String[] arrayOfString1;
              int[] arrayOfInt1 = new int[(arrayOfString1 = new String[2 + ((oi.s != null) ? oi.s.length : 0)]).length];
              arrayOfString1[0] = "Trang chủ";
              arrayOfInt1[0] = 1070013;
              arrayOfString1[arrayOfString1.length - 1] = "Trang khác";
              arrayOfInt1[arrayOfInt1.length - 1] = 1070014;
              if (oi.s != null) {
                byte b2 = 0;
                for (byte b3 = 1; b3 < arrayOfString1.length - 1; b3++) {
                  arrayOfString1[b3] = oi.t[b2++];
                  arrayOfInt1[b3] = 1070019;
                } 
              } 
              String[] arrayOfString2 = new String[arrayOfString1.length - 1];
              int[] arrayOfInt2 = new int[arrayOfInt1.length - 1];
              byte b = -1;
              if (on1.w == null) {
                b = 0;
              } else if (oi.s != null) {
                byte b2 = 0;
                for (byte b3 = 1; b3 < arrayOfString1.length - 1; b3++) {
                  if (on1.w.equals(oi.s[b2++])) {
                    b = b3;
                    break;
                  } 
                } 
              } 
              if (b >= 0) {
                System.arraycopy(arrayOfString1, 0, arrayOfString2, 0, b);
                System.arraycopy(arrayOfString1, b + 1, arrayOfString2, b, arrayOfString2.length - b);
                System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, b);
                System.arraycopy(arrayOfInt1, b + 1, arrayOfInt2, b, arrayOfInt2.length - b);
                arrayOfString1 = arrayOfString2;
                arrayOfInt1 = arrayOfInt2;
              } 
              br[] arrayOfBr1 = new br[arrayOfString1.length];
              for (byte b1 = 0; b1 < arrayOfBr1.length; b1++)
                arrayOfBr1[b1] = new br(arrayOfString1[b1], arrayOfInt1[b1]); 
              arrayOfBr[1].a(arrayOfBr1);
              if ((on1.z == 1 || on1.z == 0) && on1.w != null && ((on1.w.length() >= 3 && !on1.w.equals(go.e)) || on1.w.charAt(0) == '#')) {
                br[] arrayOfBr2 = new br[arrayOfBr.length + 1];
                System.arraycopy(arrayOfBr, 0, arrayOfBr2, 1, arrayOfBr.length);
                if (on1.w.charAt(0) == '#') {
                  if (on1.z == 1) {
                    arrayOfBr2[0] = new br("Rời clan", 1070015);
                  } else {
                    arrayOfBr2[0] = new br("Gia nhập", 1070016);
                  } 
                } else if (on1.z == 1) {
                  arrayOfBr2[0] = new br("Ngừng quan tâm", 1070017);
                } else {
                  arrayOfBr2[0] = new br("Quan tâm", 1070018);
                } 
                arrayOfBr = arrayOfBr2;
              } 
              if (a.m != null) {
                arrayOfBr = a.m.a(arrayOfBr, arrayOfBr.length - 2);
                arrayOfBr = oi.b(arrayOfBr, arrayOfBr.length - 2);
              } 
            } 
            bs.a(arrayOfBr);
          } else {
            br[] arrayOfBr1 = { new br("Gửi Me", 1070007), new br("Xem ME", 1070002), new br("Đóng", 1070009) };
            String[] arrayOfString;
            int[] arrayOfInt = new int[(arrayOfString = new String[2 + ((oi.s != null) ? oi.s.length : 0)]).length];
            arrayOfString[0] = "Trang chủ";
            arrayOfInt[0] = 1070013;
            arrayOfString[arrayOfString.length - 1] = "Trang khác";
            arrayOfInt[arrayOfInt.length - 1] = 1070014;
            if (oi.s != null) {
              byte b1 = 0;
              for (byte b2 = 1; b2 < arrayOfString.length - 1; b2++) {
                arrayOfString[b2] = oi.t[b1++];
                arrayOfInt[b2] = 1070019;
              } 
            } 
            br[] arrayOfBr2 = new br[arrayOfString.length];
            for (byte b = 0; b < arrayOfBr2.length; b++)
              arrayOfBr2[b] = new br(arrayOfString[b], arrayOfInt[b]); 
            arrayOfBr1[1].a(arrayOfBr2);
            if (a.m != null) {
              arrayOfBr1 = a.m.a(arrayOfBr1, 2);
              arrayOfBr1 = oi.b(arrayOfBr1, arrayOfBr1.length - 1);
            } 
            bs.a(arrayOfBr1);
          } 
          int j = (bs.e() > bs.f()) ? bs.e() : bs.f();
          bs.a_(-j, v.u);
          bs.d(0, v.u - ba.a - bs.f());
          bs.a(on1);
          on1.a(bs);
        } 
        return;
      case 1:
        t();
        return;
      case 0:
        this.l.f(95);
        return;
      case -4:
        if (!i.b(str = a.k(241220).trim())) {
          long l = 0L;
          String str1 = str;
          on on2;
          (on2 = this).a(str1, l, true);
        } 
        a.s().a(241220, false);
        return;
      case -5:
        str = a.k(-989858);
        i = this.N.r() + 1;
        if (!i.b(str)) {
          short s = (short)i;
          String str1 = str;
          on on2;
          (on2 = this).a(str1, on2.B, s);
          on2.B = 0L;
        } 
        a.s().a(-989858, false);
        return;
      case -3:
        a.s().a(241220, false);
        a.s().a(-989858, false);
        return;
      case -7:
        this.D++;
        B();
        a.s().a(false);
        return;
      case -8:
        a.s().a(false);
        return;
      case -9:
        (hp = new hp((byte)2)).e(this.N.r());
        hp.f(this.O);
        hp.w();
        hp.a(this);
        ag.b().a(hp, false);
        return;
      case -8882:
        ag.b().e(999999223);
        return;
      case -8881:
        hp = (hp)a.s().d(999999223);
        if (this.N != null && hp != null && oy.f != null) {
          this.O = hp.v();
          this.N.a(oy.f);
          this.N.h(this.O);
          this.N.b(oy.a[this.O], oy.b[this.O], oy.c[this.O], oy.d[this.O]);
          hp.e(this.O);
          ag.b().e(999999223);
          return;
        } 
        return;
      case -8883:
        if ((hp = (hp)a.s().d(999999223)) != null) {
          hp.u();
          this.N.a((Image)null);
          this.N.h(-1);
        } 
        ag.b().e(999999223);
        return;
    } 
    ((fc)this.b).a();
  }
  
  public final void a(String paramString, long paramLong, int paramInt) {
    if (this.t != 0 && this.r.a() > 0 && (this.w == null || i.a(this.w, go.e) || (paramLong > 0L && this.w.equals("Bình luận")))) {
      ef ef;
      (ef = new ef()).b(-1L);
      ef.b(paramString);
      ef.a(go.e);
      ef.a((short)paramInt);
      dl dl;
      (dl = new dl(ef, this.r.e() - 4)).a(0L);
      if (paramLong > 0L && z()) {
        this.r.a(dl, 2);
      } else {
        this.r.a(dl, 1);
      } 
    } 
    if (paramLong > 0L) {
      du.a().a(paramString, paramLong, (String)null, (short)paramInt);
    } else {
      du.a().b(paramString, (String)null, (short)paramInt);
    } 
    a.E();
  }
  
  private void a(long paramLong1, long paramLong2, boolean paramBoolean) {
    this.A = paramBoolean;
    a.s().a(null, null, 375);
    du.a().a(paramLong1, paramLong2, (short)this.i);
  }
  
  public final void a(String paramString, long paramLong) {
    a(paramString, paramLong, true);
  }
  
  private void a(String paramString, long paramLong, boolean paramBoolean) {
    this.A = paramBoolean;
    a.s().a(null, null, 375);
    du.a().a(paramString, paramLong, (short)this.i);
  }
  
  private void B() {
    dl dl = (dl)this.r.t();
    this.r.j(this.r.s());
    du.a().a(dl.e);
  }
  
  private void e(boolean paramBoolean) {
    dl dl = (dl)this.r.t();
    he he = a("Trả lời");
    String str;
    int j = (str = "@" + dl.c + " ").length() - 1;
    if (paramBoolean)
      for (paramBoolean = false; paramBoolean < dl.m.length; paramBoolean++) {
        n n = dl.a.a(dl.m[paramBoolean]);
        str = String.valueOf(str) + dl.a.b(n.b(), dl.m[paramBoolean]) + " ";
      }  
    if (this.w != null && this.w.charAt(0) == '#')
      str = String.valueOf(str) + this.w + " "; 
    int i = str.length() - j;
    this.B = dl.e;
    ff ff;
    (ff = (ff)he.e(1)).c(str);
    ff.g(j, i);
    ag.b().a(he);
  }
  
  public final void a(int paramInt1, int paramInt2, Object paramObject) {
    String str2;
    lo lo;
    String str1;
    he he1;
    int i;
    on on1;
    oi oi1;
    ff ff;
    he he2;
    br br;
    String str4;
    oi oi2;
    String str3;
    on on3;
    oi oi3;
    on on2;
    long l;
    if (paramObject == null)
      return; 
    paramInt1 = this.l.b();
    paramObject = paramObject;
    dl dl1 = null;
    ls ls = null;
    dl dl2 = null;
    int j = 0;
    if (paramInt1 == 1 && (dl1 = (dl)this.r.t()) != null) {
      ls = dl1.a();
      j = dl.b((dl2 = dl1).h);
      String str;
      if ((str = ls.b(ls.a(j).b(), j)) == null || str.length() <= 0)
        str = dl1.c; 
      if (str.charAt(0) == '@')
        str = str.substring(1); 
    } 
    switch (paramInt2) {
      case 1070000:
        str2 = ls.b(ls.a(j).b(), j);
        l = 0L;
        str4 = str2;
        (on3 = this).a(str4, l, true);
        break;
      case 1070020:
        if (paramObject.b().equals("Xem Ảnh")) {
          if (a.m != null) {
            lo lo1 = (lo)dl1.a.a(dl1.h);
            (oi3 = a.m).q.a(lo1.i.a());
          } 
          break;
        } 
        if (paramObject.b().equals("Xem video") || paramObject.b().equals("Nghe audio"))
          a.s().C(); 
        break;
      case 1070001:
        if (a.m != null)
          a.m.c((String)oi3); 
        break;
      case 1070002:
        l = 0L;
        oi2 = oi3;
        (on2 = this).a((String)oi2, l, true);
        break;
      case 1070003:
        ff.i = str2 = oi2.b(oi2.a(j).b(), j);
        break;
      case 1070004:
        str2 = oi2.b(oi2.a(j).b(), j);
        if (a.m != null) {
          String str = str2;
          str3 = dl1.c;
          oi oi;
          (oi = a.m).a(str3, str, true);
        } 
        break;
      case 1070005:
        lo = (lo)str3.a(j);
        a.d("Nhập nick muốn gửi", lo.i.a());
        break;
      case 1070006:
        str1 = dl1.a.i();
        if (dl1.d != null)
          str1 = String.valueOf(str1) + dl1.d.a(); 
        ff.i = str1;
        break;
      case 1070007:
        ff = (ff)(he1 = a(this.Q[cv.a(this.Q.length)])).e(1);
        if (!i.b(this.w))
          if (this.w.charAt(0) == '#') {
            ff.c(String.valueOf(this.w) + " ");
          } else if (!z() && this.w.length() > 3) {
            ff.c("@" + this.w + " ");
          }  
        this.B = 0L;
        ag.b().a(he1);
        break;
      case 1070008:
        w();
        break;
      case 1070009:
        this.q = true;
        if (this.b != null)
          ((fc)this.b).d(this); 
        break;
      case 1070010:
        C();
        break;
      case 1070011:
        i = (i = Math.abs(i)) & 0xFF;
        if ((i = this.l.q()) < 0 && (br = this.l.r()).b().equals("Nhật ký")) {
          l = 0L;
          str3 = this.C[i][1];
          (on2 = this).a(str3, l, true);
          t();
          return;
        } 
        break;
      case 1070013:
        A();
        break;
      case 1070014:
        on1 = this;
        (he2 = a.a("Nhập nick bạn muốn xem Me", null, "Xong", -4, "Hủy", -3)).a(on1);
        ag.b().a(he2);
        break;
      case 1070015:
        du.a().e(this.w);
        this.z = 0;
        break;
      case 1070016:
        du.a().d(this.w);
        this.z = 1;
        break;
      case 1070017:
        du.a().e(this.w);
        this.z = 0;
        break;
      case 1070018:
        du.a().d(this.w);
        this.z = 1;
        break;
      case 1070019:
        if ((oi1 = a.m).s != null)
          for (byte b = 0; b < oi1.s.length; b++) {
            if (oi1.t[b].equals(paramObject.b())) {
              l = 0L;
              str3 = oi1.s[b];
              (on2 = this).a(str3, l, true);
            } 
          }  
        if (a.m != null) {
          if (a.m != null)
            a.m.g(true); 
          if (a.m != null)
            a.m.h(true); 
          if (a.m != null)
            a.m.E(); 
          MGMIDlet.d();
          MGMIDlet.b("1900588883");
          a.F();
          if (a.m != null)
            a.m.F(); 
          a.D();
          he he;
          if (!(((he = he2) == 99031) ? 1 : ((he == 99009) ? 1 : ((he == 99017) ? 1 : ((he == 99012) ? 1 : ((he == 99011) ? 1 : ((he == 99008) ? 1 : ((he == 99007) ? 1 : 0))))))))
            a.m.b(paramObject.b()); 
        } 
        break;
      case 11399:
        if (a.m != null)
          a.m.b(paramObject.b()); 
        break;
      default:
        if (a.m != null)
          a.m.j(he2); 
        break;
    } 
    t();
  }
  
  private void C() {
    if (z()) {
      dp dp;
      long[] arrayOfLong = (long[])(dp = (dp)this.r.i(this.r.a() - 1)).b;
      long l2 = 0L;
      long l1 = arrayOfLong[0];
      on on2;
      (on2 = this).a(l1, 0L, true);
      return;
    } 
    long l = 0L;
    String str = this.w;
    on on1;
    (on1 = this).a(str, l, true);
  }
  
  public final aq a(aw paramaw, int paramInt) {
    Object object;
    if (object = paramaw.i(paramInt) instanceof dp) {
      (object = new fm(((dp)object).a, -10)).a(0, 0, e() - 2, 20);
      return (aq)object;
    } 
    return new fp((dl)object, this.r.e(), ((paramInt & 0x1) == 1));
  }
  
  public final void b(aq paramaq, int paramInt) {
    if (this.r.a() > 0) {
      dp dp;
      if (paramInt == this.r.a() - 1) {
        this.L = false;
        if (z()) {
          if (((on)(paramaq = this)).r.a() > 0) {
            long[] arrayOfLong = (long[])(dp = (dp)((on)paramaq).r.i(((on)paramaq).r.a() - 1)).b;
            paramaq.a(arrayOfLong[0], arrayOfLong[1], false);
            return;
          } 
        } else {
          long[] arrayOfLong = (long[])(dp = (dp)((on)(paramaq = this)).r.i(((on)paramaq).r.a() - 1)).b;
          paramaq.a(((on)paramaq).w, arrayOfLong[1], false);
          return;
        } 
      } else {
        al al1;
        dl dl1;
        dp dp1;
        dl dl3;
        al al2;
        String[] arrayOfString;
        int[] arrayOfInt;
        if (dp == null) {
          this.L = true;
          C();
          return;
        } 
        dp = dp;
        dl dl2;
        ls ls = (dl2 = (dl)((on)(paramaq = this)).r.i(dp)).a();
        dl dl4;
        int i = dl.b((dl4 = dl2).h);
        bs bs;
        (bs = new bs()).a(new gb(0, 2));
        bs.b(new gb(1, 3));
        if (dl2.h >= 0) {
          String str1;
          String str2;
          arrayOfString = new String[] { "Chép nội dung" };
          arrayOfInt = new int[] { 1070006 };
          n n = ls.a(i);
          String[] arrayOfString1 = null;
          int[] arrayOfInt1 = null;
          switch (n.c()) {
            case 5:
              arrayOfString1 = new String[] { "Xem Bang" };
              arrayOfInt1 = new int[] { 1070000 };
              break;
            case 4:
              if ((str1 = ls.b(n.b(), i)) == null || str1.length() <= 0)
                str1 = dl2.c; 
              if (str1.charAt(0) == '@') {
                if (!(str1 = str1.substring(1)).equals(go.e)) {
                  arrayOfString1 = new String[] { "Chat!", "Xem ME" };
                  arrayOfInt1 = new int[] { 1070001, 1070002 };
                  break;
                } 
                arrayOfString1 = new String[] { "Xem ME" };
                arrayOfInt1 = new int[] { 1070002 };
                break;
              } 
              if (!str1.equals(go.e)) {
                arrayOfString1 = new String[] { "Chat!", "Xem ME" };
                arrayOfInt1 = new int[] { 1070001, 1070002 };
                break;
              } 
              arrayOfString1 = new String[] { "Xem ME" };
              arrayOfInt1 = new int[] { 1070002 };
              break;
            case 3:
              arrayOfString1 = new String[] { "Xem tin", "Chép link" };
              arrayOfInt1 = new int[] { 1070004, 1070003 };
              break;
            case 1:
              if ((str2 = lo.a(((lo)str1).i)) != null) {
                arrayOfString1 = new String[] { str2, "Gửi tiếp" };
                arrayOfInt1 = new int[] { 1070020, 1070005 };
              } 
              break;
          } 
          if (arrayOfString1 != null && arrayOfString1.length > 0) {
            String[] arrayOfString2 = new String[1 + arrayOfString1.length];
            int[] arrayOfInt2 = new int[1 + arrayOfInt1.length];
            System.arraycopy(arrayOfString1, 0, arrayOfString2, 0, arrayOfString1.length);
            System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, arrayOfInt1.length);
            for (int i1 = arrayOfString1.length; i1 < arrayOfString2.length; i1++) {
              arrayOfString2[i1] = arrayOfString[i1 - arrayOfString1.length];
              arrayOfInt2[i1] = arrayOfInt[i1 - arrayOfInt1.length];
            } 
            arrayOfString = arrayOfString2;
            arrayOfInt = arrayOfInt2;
          } 
        } else {
          lo lo1;
          lo lo2;
          long l1;
          long l2;
          dp1 = dp;
          dl1 = dl2;
          paramaq = paramaq;
          int n;
          switch (n = dl1.h + 6) {
            case 0:
              if ((lo2 = dl1.d) != null && lo2.i != null)
                if (lo2.j == -10) {
                  if (a.m != null) {
                    oi oi;
                    (oi = a.m).q.a((lo1 = lo2).i.a());
                  } 
                } else {
                  a.s().C();
                }  
            case 1:
              if (dl1.m.length > 0)
                lo1.e(true); 
              lo1.e(false);
            case 5:
              if (((on)(lo2 = lo1)).D >= 2) {
                lo2.B();
              } else {
                (al1 = ag.b().a("Thông tin", "Bạn muốn xóa nội dung ME này?", "Có", -7, "Không", -8, 1)).a((bf)lo2);
                ag.b().a(al1, false);
              } 
            case 2:
              ((on)al1).E = dl1.e;
              l2 = 0L;
              l1 = dl1.e;
              (al2 = al1).a(l1, 0L, true);
            case 3:
              (dl3 = dl1).h = -2;
              dl3.j--;
              dl3.i = 0;
              ((on)al1).r.b(dl1, dp1);
              du.a().a(dl1.e, (short)0);
            case 4:
              (dl3 = dl1).h = -3;
              dl3.j++;
              dl3.i = 1;
              ((on)al1).r.b(dl1, dp1);
              du.a().a(dl1.e, (short)1);
            default:
              break;
          } 
          true;
          return;
        } 
        br[] arrayOfBr = new br[arrayOfString.length];
        for (byte b = 0; b < arrayOfBr.length; b++)
          arrayOfBr[b] = new br(arrayOfString[b], arrayOfInt[b]); 
        bs.a(arrayOfBr);
        k k = ((on)al1).s.r();
        aq aq1 = ((on)al1).r.o(dl1);
        int j = ((on)al1).r.c() + (((on)al1).r.e() - bs.e()) / 2;
        int m = ((on)al1).r.d() + aq1.d() - k.b;
        if (((dl)dp1).h >= 0)
          m += dl3.f() + dl3.a(al2).e(); 
        if (m + bs.f() > ((on)al1).r.d() + ((on)al1).r.f()) {
          m = ((on)al1).r.d() + ((on)al1).r.f() - bs.f();
        } else if (m < ((on)al1).r.d()) {
          m = ((on)al1).r.d();
        } 
        bs.a_(v.t, m);
        bs.d(j, m);
        bs.a((bg)al1);
        bs.a_(1);
        al1.a(bs);
      } 
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\on.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */