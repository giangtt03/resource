import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class hh extends ht implements bq {
  private Image k = f.d("/info/hidenobj");
  
  private int p = 32;
  
  private cu q = null;
  
  private cu r = null;
  
  private k s = null;
  
  private k t = null;
  
  private k[] u;
  
  private fg v = null;
  
  private int w = 0;
  
  private byte[][] x;
  
  private mg y = null;
  
  private boolean z = false;
  
  private az A;
  
  private az B;
  
  private az C;
  
  private ay D;
  
  private dc E = null;
  
  private dc[] F = new dc[6];
  
  private boolean G = false;
  
  private boolean H = false;
  
  private boolean I = false;
  
  private int J = 0;
  
  private int K = 0;
  
  private int L = 0;
  
  private lh M;
  
  private ox N;
  
  private boolean O = false;
  
  private db P = null;
  
  private boolean Q;
  
  private gj R;
  
  private fw S;
  
  private int T = 0;
  
  private String U;
  
  private boolean V = false;
  
  private dc W;
  
  private boolean X;
  
  private int Y;
  
  private d Z;
  
  private boolean aa = false;
  
  public hh(ox paramox, d paramd) {
    b(241202);
    a(new ba());
    a(this);
    if (paramd == null)
      paramd = new if(new int[] { 16711680, 16776960 }); 
    this.Z = paramd;
    char c = 'ð';
    int i = 320 - ba.a;
    if (B()) {
      c = 'ŀ';
      i = v.u - ba.a;
    } 
    boolean bool1 = (v.t >= c) ? ((v.t - c) / 2) : false;
    boolean bool2 = (v.u >= i) ? ((v.u - ba.a - i) / 2) : false;
    a(bool1, bool2, c, i);
    this.N = new ox(paramox);
    hh hh1;
    (hh1 = this).q = new cu(6, 4);
    hh1.r = new cu(22, 6);
    if (B()) {
      hh1.s = new k(13, 24, 54, 60);
      k k1 = new k(6, 90, 32, 32);
      k k2 = new k(6, 126, 32, 32);
      k k3 = new k(42, 90, 32, 32);
      k k4 = new k(42, 126, 32, 32);
      k k5 = new k(6, 162, 32, 32);
      k k6 = new k(42, 162, 32, 32);
      hh1.t = new k(79, 23, 226, hh1.g - 33);
    } else {
      hh1.s = new k(95, 21, 54, 60);
      k k1 = new k(60, 18, 32, 32);
      k k2 = new k(60, 53, 32, 32);
      k k3 = new k(153, 18, 32, 32);
      k k4 = new k(153, 53, 32, 32);
      k k5 = new k(189, 18, 32, 32);
      k k6 = new k(189, 53, 32, 32);
      hh1.t = new k(9, 88, 220, hh1.g - 96);
    } 
    hh1.v = new fg(B());
    hh1.v.e(true);
    hh1.v.i = new k(hh1.t.a, hh1.t.b, hh1.t.c, hh1.t.d);
    hh1.M = go.k.a();
    lh lh1 = hh1.M;
    int j = go.l.length - lh1.D.length;
    boolean bool3 = false;
  }
  
  private static boolean B() {
    return (a.k == 1);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.a(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final void h(int paramInt) {
    hh hh1;
    az az1;
    this.L = paramInt;
    switch (this.L) {
      case 0:
        this.W = null;
        this.v.a((db)null);
        az1 = this.A;
        (hh1 = this).a(az1, true);
        a((az)null);
        az1 = this.B;
        (hh1 = this).b(az1, true);
        this.O = false;
        return;
      case 1:
        this.P = new db();
        if (this.v != null)
          this.v.a(this.P); 
        az1 = null;
        (hh1 = this).a(az1, true);
        return;
      case 2:
        az1 = null;
        (hh1 = this).a(az1, true);
        a((az)null);
        az1 = new gb(1235, 3);
        (hh1 = this).b(az1, true);
        break;
    } 
  }
  
  private void a(lm[] paramArrayOflm) {
    for (byte b = 0; b < paramArrayOflm.length; b++) {
      boolean bool = ((paramArrayOflm[b]).e == 3) ? true : true;
      if ((paramArrayOflm[b]).g > 0)
        if ((paramArrayOflm[b]).l > 0) {
          int i = (paramArrayOflm[b]).g;
          int j = (paramArrayOflm[b]).g / (paramArrayOflm[b]).l;
          for (byte b1 = 0; b1 < j; b1++) {
            lm lm1;
            (lm1 = paramArrayOflm[b].b()).g = (paramArrayOflm[b]).l;
            i -= (paramArrayOflm[b]).l;
            hh hh1;
            dc dc1 = new dc(null, lm1, bool, (hh1 = this).Z);
            this.v.a(dc1);
          } 
          if (i > 0) {
            lm lm1;
            (lm1 = paramArrayOflm[b].b()).g = i;
            hh hh1;
            dc dc1 = new dc(null, lm1, bool, (hh1 = this).Z);
            this.v.a(dc1);
          } 
        } else {
          hh hh1;
          dc dc1 = new dc(null, paramArrayOflm[b], bool, (hh1 = this).Z);
          this.v.a(dc1);
        }  
    } 
  }
  
  public final void a(lm paramlm) {
    int i = 0;
    lm lm1 = paramlm.b();
    a a = new a();
    byte b;
    for (b = 0; b < this.v.s(); b++) {
      this.E = (dc)this.v.k(b);
      lm lm2;
      if (this.E != null && this.E.k != null && (this.E.j == 1 || this.E.j == 2) && (lm2 = (lm)this.E.k) != null && lm2.a == paramlm.a) {
        i += lm2.g;
        a.a(this.E);
      } 
    } 
    lm1.g = i - paramlm.g;
    for (b = 0; b < a.d(); b++)
      this.v.a((dc)a.b(b)); 
    if (lm1.g > 0)
      a(new lm[] { lm1 }); 
    v();
  }
  
  public final void h(int paramInt1, int paramInt2) {
    if (paramInt2 == 0) {
      i(paramInt1, 2147483647);
      return;
    } 
    for (int i = this.v.s() - 1; i >= 0; i--) {
      this.E = (dc)this.v.k(i);
      lm lm;
      if (this.E.k instanceof lm && (lm = (lm)this.E.k).a == paramInt1)
        lm.g = paramInt2; 
    } 
    v();
  }
  
  public final void i(int paramInt1, int paramInt2) {
    a a = new a();
    int i;
    for (i = this.v.s() - 1; i >= 0; i--) {
      this.E = (dc)this.v.k(i);
      lm lm;
      if (this.E.k instanceof lm && (lm = (lm)this.E.k).a == paramInt1) {
        if (lm.g > paramInt2) {
          lm.g -= paramInt2;
          break;
        } 
        paramInt2 -= lm.g;
        a.a(this.E);
      } 
    } 
    for (i = 0; i < a.d(); i++)
      this.v.a((dc)a.b(i)); 
    v();
  }
  
  public final void j(int paramInt1, int paramInt2) {
    a.s().v();
    for (byte b = 0; b < go.m.length; b++) {
      if ((go.m[b]).a == paramInt1) {
        go.b(paramInt1, (go.m[b]).g - paramInt2);
        break;
      } 
    } 
    if (this.E != null && this.E.j != 0)
      this.v.a(this.E); 
    v();
  }
  
  public final void a(dc paramdc) {
    this.v.a(paramdc);
    v();
  }
  
  public final void b(dc paramdc) {
    this.v.a(paramdc);
    v();
  }
  
  private void a(lh paramlh, dc[] paramArrayOfdc) {
    byte b = 0;
    if (paramArrayOfdc != null) {
      byte b1;
      for (b1 = 0; b1 < paramArrayOfdc.length; b1++) {
        if (paramArrayOfdc[b1] != null)
          b++; 
      } 
      ll[] arrayOfLl = new ll[b];
      b1 = 0;
      for (byte b2 = 0; b2 < paramArrayOfdc.length; b2++) {
        if (paramArrayOfdc[b2] != null && (paramArrayOfdc[b2]).j == 0) {
          arrayOfLl[b1] = (ll)(paramArrayOfdc[b2]).k;
          b1++;
        } 
      } 
      paramlh.D = arrayOfLl;
    } 
    this.y = null;
    System.gc();
    ct.b("[upgradeAnimation]");
    this.y = mb.a(paramlh, false);
    this.y.a(lc.a(paramlh));
    this.y.a(nr.a(paramlh));
    this.y.c(2);
    this.y.i();
  }
  
  public final void u() {
    if (!this.v.m()) {
      this.K++;
      if (this.K >= 5) {
        this.J = (this.J == 0) ? -2 : 0;
        this.K = 0;
      } 
    } 
    if (this.y != null)
      this.y.i(); 
    if (this.D != null)
      this.D.n(); 
    for (byte b = 0; b < this.F.length; b++) {
      if (this.F[b] != null)
        this.F[b].n(); 
    } 
    if (this.P != null)
      this.P.i(); 
    if (this.R != null) {
      this.R.i();
      if (!this.R.m())
        this.R = null; 
    } 
    if (this.S != null)
      this.S.i(); 
    if (this.T < 7) {
      this.T++;
      if (this.T == 7 && this.E != null && this.E.k != null) {
        Object object = this.E.k;
        hh hh1;
        (hh1 = this).S = new fw(object);
        int i = hh1.g;
        hh1.S.a(9, i, hh1.f - 20, hh1.g / 4);
        hh1.S.c(9, i);
        hh1.S.a(9, i - hh1.S.q() - 7);
      } 
    } 
  }
  
  public final void e(int paramInt) {
    hh hh1;
    hl hl;
    lm lm;
    br[] arrayOfBr;
    switch (paramInt) {
      case 0:
        hh1 = this;
        arrayOfBr = null;
        if (hh1.L == 0)
          if (hh1.G) {
            arrayOfBr = new br[] { new br("Cập nhật", 111111), new br("Nhân Vật", 111112), new br("Cửa hàng", 111113), new br("Đóng", 111114) };
          } else {
            arrayOfBr = new br[] { new br("Nhân Vật", 111112), new br("Cửa hàng", 111113), new br("Đóng", 111114) };
          }  
        hh1.a(arrayOfBr, hh1.C, new bd("", hh1.C.a()), hh1.B);
        return;
      case 4:
        switch (this.L) {
          case 1:
            h(0);
            return;
        } 
        if (this.m == null) {
          D();
          return;
        } 
        A();
        return;
      case 3:
        this.m.f(95);
        return;
      case 6:
        ag.b().e(-4561238);
        A();
        ag.b().a(h(), false);
        if (this.V) {
          a.G();
          return;
        } 
        break;
      case 5:
        ag.b().e(-4561238);
        C();
        A();
        a.s().a(null, null);
        return;
      case 9:
        if (this.E.j == 0) {
          ks.a().a(new String[] { ((ll)this.E.k).c });
        } else if (((lm)this.E.k).l == 1) {
          lm lm1 = (lm)this.E.k;
          ks.a().f(lm1.a, 1);
        } else {
          lm lm1 = (lm)this.E.k;
          ks.a().f(lm1.a, lm1.g);
        } 
        ag.b().e(-4561239);
        a.s().a(null, null);
        return;
      case 10:
        ag.b().e(-4561239);
        return;
      case 14:
        ag.b().e(241212);
        return;
      case 20:
        ag.b().e(-241439);
        if (this.Q) {
          this.Q = false;
          int i = 0;
          if (this.P != null)
            i = this.P.r(); 
          h(this.L);
          this.P.l(i);
          return;
        } 
        break;
      case 21:
        lm = (hl = (hl)ag.b().e()).v();
        h(1);
        d(this.v.a(lm));
        a((ll)this.E.k);
        ag.b().e(-241439);
        return;
      case 23:
        h(0);
        return;
      case 22:
        this.O = true;
        ks.a().a(((lm)this.W.k).a, ((ll)this.E.k).c);
        this.P.d(1);
        return;
      case 27:
        if (this.E != null) {
          this.Q = true;
          c((ll)this.E.k);
          return;
        } 
        break;
      case 26:
        ag.b().a(false);
        a.s().H();
        return;
      case 112:
        ag.b().a(false);
        return;
      case 114:
        ag.b().a(false);
        return;
      case 111:
        ag.b().a(false);
        lm = (lm)this.E.k;
        i(lm.a, 1);
        ks.a().f(lm.a);
        a.s().a("Đợi xíu nhé...", null, 500);
        return;
      case 113:
        ag.b().a(false);
        a.s().N();
        return;
      case 118:
        a.s().e(123456);
        ks.a().u();
        return;
      case 119:
        a.s().e(123456);
        break;
    } 
  }
  
  public final void a(String[] paramArrayOfString) {
    for (byte b = 0; b < paramArrayOfString.length; b++) {
      dc dc1;
      if ((dc1 = this.v.a(paramArrayOfString[b])) != null) {
        if (this.v.m()) {
          this.v.a(dc1);
          this.v.i(this.v.q());
        } 
        go.b((ll)dc1.k);
      } 
    } 
    a.s().v();
  }
  
  public final void f(int paramInt) {
    hh hh1;
    switch (this.L) {
      case 1:
        if (this.O)
          return; 
        break;
    } 
    if (!this.v.m()) {
      int i;
      switch (paramInt) {
        case 96:
        case 97:
        case 98:
        case 99:
          i = paramInt - 96;
          hh1 = this;
          if (i >= 0) {
            if ((i = hh1.x[hh1.w][i]) == -3) {
              hh1.I = false;
              hh1.v.d(true);
              hh1.v.i(0);
            } else {
              if (i >= 0)
                hh1.i(i); 
              return;
            } 
          } else {
            return;
          } 
          return;
        case 95:
          if (this.E != null) {
            a(this.u[this.w]);
            break;
          } 
          return;
      } 
      return;
    } 
    this.v.f(hh1);
    if (!this.v.m())
      i(this.w); 
  }
  
  public final void f(int paramInt1, int paramInt2) {
    String str;
    if (this.S != null)
      this.S.g(paramInt1 - this.c, paramInt2 - this.d); 
    switch (this.L) {
      case 1:
        if (this.O)
          return; 
        break;
    } 
    for (byte b = 0; b < this.u.length - 1; b++) {
      if ((new k((this.u[b]).a + this.c, (this.u[b]).b + this.d, (this.u[b]).c, (this.u[b]).d)).a(paramInt1, paramInt2)) {
        this.v.d(false);
        str = "";
        if (this.E != null)
          str = ((ll)this.E.k).c; 
        i(b);
        if (this.E != null && ((ll)this.E.k).c.equals(str))
          a(this.u[this.w]); 
        return;
      } 
    } 
    if ((new k(this.v.i.a + this.c, this.v.i.b + this.d, this.v.i.c, this.v.i.d)).a(str, paramInt2)) {
      if (!this.v.m())
        this.v.d(true); 
      this.I = false;
      this.D.c(str - this.c, paramInt2 - this.d);
      return;
    } 
  }
  
  public final void i(int paramInt) {
    this.w = paramInt;
    a(this.F[paramInt]);
    if (this.E != null) {
      this.I = true;
      this.H = true;
      if (gr.p && this.E.k != null && ((ll)this.E.k).p == 0 && ((ll)this.E.k).c()) {
        gr.p = false;
        od.h(144);
        int i = (this.u[paramInt]).b - 10 + this.d;
        this.R = new gj("Bấm phim giữa. Rối chọn sửa chữa", this.c + this.f / 2, i, this.f - 20, 80, false);
        this.R.a((this.u[this.w]).a - 10 + (this.u[paramInt]).c / 2);
        if (!B()) {
          this.R.g((this.u[paramInt]).b + 35 + this.d);
          this.R.a(true);
        } 
        this.R.a(new k(this.R.n() + 9, this.R.o() + 9, this.R.p() - 20, this.R.q() - 20));
        return;
      } 
    } else {
      this.I = false;
    } 
  }
  
  public final void e(int paramInt1, int paramInt2) {
    if (this.v.m())
      this.v.e(paramInt1, paramInt2); 
  }
  
  public final void a(k paramk) {
    if (this.E == null)
      return; 
    if (this.L == 2) {
      if (this.i != null && this.v.m())
        this.i.d(-1, 1234); 
      return;
    } 
    if (this.L != 0)
      return; 
    bs bs = new bs();
    if (this.E.k != null) {
      ll ll;
      switch (this.E.j) {
        case 0:
          if ((ll = (ll)this.E.k).b() && ll.c())
            bs.a(new br("Sửa chữa", 111115)); 
          if (this.I) {
            br br = new br("Cởi ra", 111116);
            bs.a(new br("Chi Tiết", 111117));
            if (this.v.s() >= go.n)
              br = new br("Vứt bỏ", 111118); 
            if (ll.e == 0) {
              bs.a(new br[] { this.M.Z ? new br("Hiện Nón", 1111110) : new br("Ẩn Nón", 111119), br });
              break;
            } 
            bs.a(br);
            break;
          } 
          if (this.H) {
            if (((ll)this.E.k).e == 8) {
              bs.a(new br("Dùng", 1111117));
            } else {
              bs.a(new br("Trang bị", 1111111));
            } 
            bs.a(new br("Chi Tiết", 111117));
            bs.a(new br("Nâng cấp", 1111116));
            if (((ll)this.E.k).a())
              bs.a(new br("Rao bán", 1111118)); 
            bs.a(new br("Vứt bỏ", 111118));
            break;
          } 
          bs.a(new br("Chi Tiết", 111117));
          bs.a(new br("Nâng cấp", 1111116));
          if (((ll)this.E.k).a())
            bs.a(new br("Rao bán", 1111118)); 
          bs.a(new br("Vứt bỏ", 111118));
          break;
        case 1:
        case 2:
          switch (((lm)this.E.k).e) {
            case 1:
              bs.a(new br("Dùng", 1111112));
              break;
            case 3:
              bs.a(new br("Dùng", 1111115));
              break;
            case 9:
              bs.a(new br("Mở", 1111113));
              break;
          } 
          if (((lm)this.E.k).a())
            bs.a(new br("Rao bán", 1111118)); 
          bs.a(new br("Vứt bỏ", 111118));
          break;
      } 
    } else if (this.E.j == 3) {
      bs.a(new br("Mua Ngăn Chứa", 1111114));
    } 
    int i = paramk.a + this.c + (paramk.c - bs.e()) / 2;
    int j;
    if ((j = paramk.b + this.d + paramk.d) + bs.f() > this.d + this.g)
      j = this.d + paramk.b - bs.f(); 
    i = (i < this.c) ? this.c : ((i + bs.e() > this.c + this.f) ? (this.c + this.f - bs.e()) : i);
    bs.a_(v.t + bs.e(), j);
    bs.d(i, j);
    bs.a(this);
    bs.a_(1);
    a(bs, this.C, new bd("", this.C.a()), this.B);
    this.n = true;
  }
  
  public final void a(String paramString) {
    a.s().e(-446456);
    dc dc1 = this.v.a(paramString);
    this.v.a(dc1);
    a(this.v.r());
    for (byte b = 0; b < go.l.length; b++) {
      if ((go.l[b]).c.equals(paramString)) {
        go.b(go.l[b]);
        return;
      } 
    } 
  }
  
  public final boolean g(int paramInt) {
    gu gu;
    hu hu;
    al al1;
    ll ll;
    dc dc1;
    hh hh2;
    byte b;
    String[] arrayOfString;
    hh hh1;
    String str;
    dc dc2;
    byte b1;
    lm lm;
    al al2;
    long l1;
    al al3;
    long l2;
    switch (paramInt) {
      case 111111:
        C();
        a.s().a(null, null);
        return true;
      case 111112:
        this.V = true;
        if (this.G) {
          D();
          return true;
        } 
        ag.b().a(h(), false);
        a.G();
        return true;
      case 1111121:
        if (a.s().c(-1122154) && (gu = (gu)a.s().d(-1122154)) != null) {
          lm lm1;
          (lm1 = gu.t()).g = gu.u();
          hh hh3;
          dc dc3 = new dc(null, lm1, (lm1.e == 3) ? 2 : 1, (hh3 = this).Z);
          c(dc3);
        } 
        return true;
      case 1111122:
        a.s().e(-1122154);
        return true;
      case 29:
        a.s().e(-446456);
        return true;
      case 1111119:
        l1 = (hu = (hu)a.s().d(241234)).t() * 1000L;
        (al1 = a.s().a("Chú ý", "Bạn có muốn bán " + hu.k + " giá: " + i.a(l1, ",") + " Ken không?", "Có", 28, "Không", 29, 1)).b(-446456);
        al1.a(this);
        a.s().a(al1);
        return true;
      case 28:
        l2 = (al1 = a.s().d(241234)).t() * 1000L;
        if ((al1.v()).j == 0) {
          ll = (ll)(al1.v()).k;
          ks.a().a(ll.c, l2);
          a.s().a(null, null);
        } else if ((ll.v()).j == 1) {
          lm lm1 = (lm)(ll.v()).k;
          ks.a().a(lm1.a, lm1.g, l2);
          a.s().a(null, null);
        } 
        return true;
      case 1111120:
        a.s().e(241234);
        return true;
      case 111113:
        a.s().H();
        return true;
      case 111114:
        if (this.n) {
          A();
        } else {
          D();
        } 
        return true;
      case 111115:
        if (this.E != null)
          c((ll)this.E.k); 
        if (this.R != null)
          this.R = null; 
        return true;
      case 111116:
        this.G = true;
        dc1 = this.F[this.w];
        this.F[this.w] = null;
        this.v.a(dc1);
        this.E = null;
        a(this.M, this.F);
        return true;
      case 111117:
        a.a((ll)this.E.k, this, "", -1, "Đóng", 14);
        ag.b().e();
        return true;
      case 111118:
        str = ((hh2 = this).E.j == 0) ? ((ll)hh2.E.k).d : ((lm)hh2.E.k).b;
        (al3 = ag.b().a("Chú ý", "Bạn có chắc là muốn vứt bỏ " + str + " này không?", "Có", 9, "Không", 10, 1)).a(hh2);
        al3.b(-4561239);
        ag.b().a(al3, false);
        return true;
      case 111119:
        ks.a().b(true);
        a.s().a(null, null);
        return true;
      case 1111110:
        ks.a().b(false);
        a.s().a(null, null);
        return true;
      case 1111111:
        this.G = true;
        b = ((ll)this.E.k).e;
        ((ll)this.E.k).o = -1L;
        str = null;
        if (this.F[b] != null)
          dc2 = this.F[b]; 
        this.F[b] = this.E;
        if (dc2 != null) {
          this.v.a(dc2, this.v.b(this.E));
        } else {
          this.v.a(this.E);
        } 
        if (this.v.q() >= this.v.s()) {
          int i = this.v.s() - 1;
          this.v.j((i < 0) ? 0 : i);
        } 
        a(this.M, this.F);
        a(this.v.r());
        return true;
      case 1111117:
        ag.b().e(-4561238);
        arrayOfString = new String[] { ((ll)this.E.k).c };
        for (b1 = 0; !b1; b1++) {
          dc dc3 = this.v.a(arrayOfString[0]);
          this.v.a(dc3);
        } 
        ks.a().c(arrayOfString);
        A();
        a.s().a(null, null);
        break;
      case 1111112:
        h(1);
        d(this.E);
        return true;
      case 1111115:
        ks.a().e(((lm)this.E.k).a);
        return true;
      case 1111113:
        lm = (lm)this.E.k;
        hh1 = this;
        if (lm.k > 0L) {
          if (lm.k > go.s) {
            al3 = ag.b().a("Chú ý", "Bạn không đủ Ken để đập trứng, Bạn có muốn nạp Ken không", "Có", 113, "Không", 114, 1);
          } else {
            al3 = ag.b().a("Chú ý", "Đập 1 quả trứng bạn phải mất " + lm.k + " Ken. Bạn có muốn đập không?", "Có", 111, "Không", 112, 1);
          } 
          al3.a(hh1);
          ag.b().a(al3);
        } else {
          lm lm1 = (lm)hh1.E.k;
          ks.a().f(lm1.a);
          hh1.i(lm1.a, 1);
          a.s().a("Đợi xíu nhé...", null);
        } 
        return true;
      case 1111114:
        hh1 = this;
        (al2 = ag.b().a("Chú ý", "Bạn có chắc muốn mua thêm ngăn chứa đồ không? Phí mua 1 ngăn chứa là " + go.o, "Có", 118, "Không", 119, 1)).b(123456);
        al2.a(hh1);
        ag.b().a(al2);
        return true;
      case 1111116:
        if (this.G) {
          (al2 = ag.b().a("Chú ý", "Chưa cập nhật đồ cho nhân vật. Bạn có muốn cập nhật ngay không?", "Có", 5, "Không", 6, 1)).a(this);
          al2.b(-4561238);
          ag.b().a(al2, false);
          A();
          this.G = false;
        } else {
          String str1 = ((ll)this.E.k).c;
          ag.b().a(false);
          a.s().h(str1);
          return true;
        } 
      case 1111118:
        if (this.G) {
          (al2 = ag.b().a("Chú ý", "Chưa cập nhật đồ cho nhân vật. Bạn có muốn cập nhật ngay không?", "Có", 5, "Không", 6, 1)).a(this);
          al2.b(-4561238);
          ag.b().a(al2, false);
          A();
          this.G = false;
        } else {
          hh hh3;
          if ((hh3 = hh1 = this).E.k != null) {
            bd bd;
            if ((hh3 = hh1).E.j == 1) {
              lm lm1 = (lm)(hh3 = hh1).E.k;
              dc dc3 = new dc(null, lm1.b(), (hh3 = hh1).E.j, hh1.Z);
              gu gu1;
              (gu1 = new gu(dc3)).a(hh1);
              gu1.e(lm1.g);
              bd = new bd("Xong", 1111121);
              gu gu2;
              (gu2 = gu1).a(bd, true);
              gu1.a(new bd("", 1111121));
              bd = new bd("Hủy", 1111122);
              (gu2 = gu1).b(bd, true);
              gu1.b(-1122154);
              gu1.j(true);
              ag.b().a(gu1, false);
            } else {
              bd bd1;
              if (((hh)(bd1 = bd)).E.j == 0)
                bd.c(((hh)(bd1 = bd)).E); 
            } 
          } 
        } 
        return true;
    } 
    return false;
  }
  
  private void c(dc paramdc) {
    hu hu;
    (hu = new hu(paramdc, "Rao bán", 1111119, "Hủy", 1111120)).a(this);
    ag.b().a(hu, false);
  }
  
  protected final void s() {}
  
  private void C() {
    byte b1 = 0;
    for (byte b2 = 0; b2 < this.F.length; b2++) {
      if (this.F[b2] != null)
        b1++; 
    } 
    String[] arrayOfString = new String[b1];
    b1 = 0;
    for (byte b3 = 0; b3 < this.F.length; b3++) {
      if (this.F[b3] != null) {
        ll ll = (ll)(this.F[b3]).k;
        arrayOfString[b1] = ll.c;
        b1++;
      } 
    } 
    ks.a().c(arrayOfString);
    this.G = false;
  }
  
  private void D() {
    this.X = true;
    if (this.G) {
      al al;
      (al = ag.b().a("Chú ý", "Chưa cập nhật đồ cho nhân vật. Bạn có muốn cập nhật ngay không?", "Có", 5, "Không", 6, 1)).a(this);
      al.b(-4561238);
      ag.b().a(al, false);
      A();
      this.G = false;
      return;
    } 
    ag.b().a(h(), false);
  }
  
  private void a(Object paramObject) {
    az az1;
    this.H = false;
    this.E = (dc)paramObject;
    this.T = 0;
    this.S = null;
    if (this.E != null) {
      az az2;
      if (this.E.j == 3) {
        if (this.L == 2) {
          a((az)null);
          az az3 = null;
          (paramObject = this).a(az3, true);
        } 
        return;
      } 
      paramObject = null;
      if (this.E.j == 0 && this.E.k != null) {
        paramObject = this.E.k;
        byte b = 0;
        if (((ll)paramObject).i <= this.M.G)
          b++; 
        if (((ll)paramObject).h == 2 || ((ll)paramObject).h == this.M.f)
          b++; 
        this.H = (b == 2);
      } 
      switch (this.L) {
        case 1:
          a((ll)paramObject);
          return;
        case 2:
          if (this.v.m()) {
            a(new bd("", 1234));
            bd bd = new bd("Bán", 1234);
            (paramObject = this).a(bd, true);
            return;
          } 
          a((az)null);
          az2 = null;
          (paramObject = this).a(az2, true);
          break;
      } 
      return;
    } 
    switch (this.L) {
      case 1:
        a((az)null);
        return;
      case 2:
        a((az)null);
        az1 = null;
        (paramObject = this).a(az1, true);
        break;
    } 
  }
  
  public final void a(ll paramll) {
    hh hh1;
    if (paramll == null) {
      a((az)null);
      az az1 = null;
      (hh1 = this).a(az1, true);
      return;
    } 
    if (this.L != 0)
      if (hh1.b()) {
        if (hh1.c()) {
          a(new bd("", 22));
          bd bd = new bd("Sửa chữa", 22);
          (hh1 = this).a(bd, true);
          return;
        } 
      } else {
        a((az)null);
        az az1 = null;
        (hh1 = this).a(az1, true);
      }  
  }
  
  public final void j(int paramInt) {
    lm lm = (lm)this.W.k;
    this.O = false;
    lm.g = paramInt;
    this.P.d(0);
    this.P.l(paramInt);
    if (paramInt <= 0)
      this.v.a(this.W); 
    if (lm.g == 0)
      h(0); 
  }
  
  private void c(ll paramll) {
    hl hl;
    if ((hl = a.a(this, new bd("Chọn", 21), new bd("Đóng", 20), new bd("", 21), paramll)).u() <= 0) {
      hl.a("Hiện tại bạn không còn cây búa nào để sữa chữa! Bạn có muốn vào cửa hàng mua không?");
      bd bd = new bd("C.Hàng", 26);
      hl hl1;
      (hl1 = hl).a(bd, true);
      hl.a(new bd("", 26));
    } 
    hl.e(2);
    A();
  }
  
  private void d(dc paramdc) {
    if (paramdc == null || paramdc.k == null)
      return; 
    this.W = paramdc;
    if (this.P != null)
      this.P.l(((lm)paramdc.k).g); 
  }
  
  public final dc t() {
    return this.E;
  }
  
  public final void v() {
    this.v.i(this.v.q());
  }
  
  public final void j(boolean paramBoolean) {
    this.M.Z = paramBoolean;
    a(this.M, this.F);
    this.G = true;
  }
  
  public final void b(aq paramaq, int paramInt) {
    a(this.v.u());
  }
  
  public final void a(aq paramaq, int paramInt) {
    dc dc1;
    if (paramaq == null && paramInt > this.Y - 1) {
      hh hh1;
      dc1 = new dc(this.v.k, null, 3, (hh1 = this).Z);
    } 
    a(dc1);
  }
  
  public final void a(aq paramaq, int paramInt1, int paramInt2) {
    a(paramaq);
  }
  
  public final void w() {
    a.s().v();
    if (this.V)
      a.G(); 
    if (this.X)
      ag.b().a(h(), false); 
  }
  
  public final void b(lm paramlm) {
    int i = 0;
    a a = new a();
    int j;
    for (j = 0; j < this.v.s(); j++) {
      lm lm1;
      if ((((dc)this.v.k(j)).j == 1 || ((dc)this.v.k(j)).j == 2) && (lm1 = (lm)((dc)this.v.k(j)).k) != null && lm1.a == paramlm.a) {
        i += lm1.g;
        a.a(this.v.k(j));
      } 
    } 
    i += paramlm.g;
    for (j = 0; j < a.d(); j++)
      this.v.a((dc)a.b(j)); 
    if (paramlm.l <= 0) {
      lm lm1;
      (lm1 = paramlm.b()).g = i;
      hh hh1;
      dc dc1 = new dc(null, lm1, (paramlm.e == 3) ? 2 : 1, (hh1 = this).Z);
      this.v.a(dc1);
      return;
    } 
    j = i / paramlm.l + ((i % paramlm.l > 0) ? 1 : 0);
    for (byte b = 0; b < j; b++) {
      lm lm1 = paramlm.b();
      if (i >= paramlm.l) {
        lm1.g = paramlm.l;
        i -= paramlm.l;
      } else if (i > 0) {
        lm1.g = i;
        i = 0;
      } 
      hh hh1;
      dc dc1 = new dc(null, lm1, (paramlm.e == 3) ? 2 : 1, (hh1 = this).Z);
      this.v.a(dc1);
    } 
  }
  
  public final void b(Graphics paramGraphics) {
    bx.d.c(true);
    bx.d.a(paramGraphics, this.U, this.r.a + this.c, this.r.b + this.d, 0);
    bx.d.c(false);
    pc.b(paramGraphics, this.q.a + this.c, this.q.b + this.d, this.M.g);
    bx.d.a(paramGraphics, "Cấp: " + this.M.G, this.c + this.f - 14 + this.c, this.r.b + this.d, 2);
    for (byte b1 = 0; b1 < this.u.length - 1; b1++) {
      pc.b(paramGraphics, (this.u[b1]).a + this.c, (this.u[b1]).b + this.d, (this.u[b1]).c, (this.u[b1]).d, 6647295, 16777215, 8369663);
      cw.a(paramGraphics, this.k, b1 * this.p, 0, this.p, this.p, (this.u[b1]).a + this.c + ((this.u[b1]).c - this.p) / 2, (this.u[b1]).b + this.d + ((this.u[b1]).d - this.p) / 2, 0);
    } 
    for (byte b2 = 0; b2 < this.F.length; b2++) {
      if (this.F[b2] != null) {
        ll ll1 = (ll)(this.F[b2]).k;
        this.F[b2].a(paramGraphics, (this.u[ll1.e]).a + this.c, (this.u[ll1.e]).b + this.d);
      } 
    } 
    if (this.D != null) {
      this.D.a(paramGraphics, this.c, this.d);
      this.D.c(true);
    } 
    ll ll;
    if (this.E != null && !this.I && this.E.k != null && this.E.j == 0 && (ll = (ll)this.E.k).e < this.u.length) {
      int j = this.d;
      int i = this.c;
      k k1 = this.u[ll.e];
      Graphics graphics;
      (graphics = paramGraphics).setColor(16711543);
      graphics.drawRect(k1.a + i, k1.b + j, k1.c, k1.d);
      graphics.setColor(16776624);
      graphics.drawRect(k1.a - 1 + i, k1.b - 1 + j, k1.c + 2, k1.d + 2);
      graphics.setColor(16776659);
      graphics.drawRect(k1.a - 2 + i, k1.b - 2 + j, k1.c + 4, k1.d + 4);
    } 
    if (!this.v.m()) {
      pc.a(paramGraphics, this.u[this.w], this.c, this.d, this.J);
      switch (this.L) {
        case 1:
          if (this.P != null)
            this.P.a(paramGraphics, (this.u[this.w]).a + this.c, (this.u[this.w]).b + (this.u[this.w]).d + this.d); 
          break;
      } 
    } 
    if (this.R != null)
      this.R.a(paramGraphics, 0, 0); 
    if (B()) {
      bx.d.a(paramGraphics, String.valueOf(this.v.s()) + "/" + go.n, this.t.a, this.t.b + this.t.d - 16, 2);
    } else {
      bx.d.a(paramGraphics, String.valueOf(this.v.s()) + "/" + go.n, this.t.a, this.t.b - 16, 0);
    } 
    if (!this.n && this.S != null)
      this.S.a(paramGraphics, this.c, this.d); 
    pc.c(paramGraphics, this.s.a + this.c, this.s.b + this.d, this.s.c, this.s.d);
    if (this.y != null)
      this.y.a(paramGraphics, this.s.a + this.c, this.s.b + 5 + this.d); 
  }
  
  public final void a(Graphics paramGraphics) {
    pc.a(paramGraphics, this.c, this.d, this.f, this.g, v.aj, true);
  }
  
  public final void b(ll paramll) {
    hh hh1;
    dc dc1 = new dc(this.N.a(mb.a(paramll) + 98, true), paramll, 0, (hh1 = this).Z);
    b(dc1);
    a(this.v.r());
    this.v.h(this.v.a() + 1);
    a.s().v();
  }
  
  public final void c(lm paramlm) {
    b(paramlm);
    a(this.v.r());
    a.s().v();
  }
  
  public final void b(String paramString) {
    a(this.v.r());
    a.s().v();
    a.t(paramString);
  }
  
  public final int x() {
    return this.Y;
  }
  
  public final ox y() {
    return this.N;
  }
  
  public final d z() {
    return this.Z;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\hh.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */