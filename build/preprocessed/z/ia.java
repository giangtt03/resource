import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ia extends ht implements bn, bq {
  private ay k;
  
  private aw p;
  
  private dk[] q;
  
  private lh r;
  
  private cz s;
  
  private ox t = new ox(null);
  
  private ll[] u;
  
  private boolean v = false;
  
  private lq w;
  
  private boolean x;
  
  private lq[] y;
  
  private boolean[] z;
  
  private lq[] A;
  
  private ft B;
  
  private az C;
  
  private az D;
  
  private az E;
  
  private d F = new if(new int[] { 16711680, 16776960 });
  
  private Image G = f.d("/taythuytinh");
  
  public ia(If1[] paramArrayOflf) {
    b(241210);
    a(0, 0, v.t, v.u);
    this.r = go.k.a();
    byte b;
    for (b = 0; b < this.r.D.length; b++) {
      for (byte b1 = 0; b1 < go.l.length; b1++) {
        if ((this.r.D[b]).c.equals((go.l[b1]).c))
          this.r.D[b] = go.l[b1]; 
      } 
    } 
    this.s = new cz(this.r);
    this.k = new ay(0);
    this.k.a(a(), this.s.q() + 6, i(), j() - this.s.q() - 6 - ba.a);
    this.p = new aw();
    this.p.a(this);
    this.p.a(this);
    this.p.e(true);
    this.k.b(this.p);
    this.q = new dk[paramArrayOflf.length];
    for (b = 0; b < this.q.length; b++)
      this.q[b] = new dk(paramArrayOflf[b]); 
    t();
    a(a.n);
    a(this);
    this.y = new lq[4];
    this.z = new boolean[4];
    this.u = new ll[4];
    this.u[0] = this.r.a(0);
    this.u[1] = this.r.a(1);
    this.u[2] = this.r.a(2);
    this.u[3] = this.r.a(3);
    this.B = new ft(go.s / 2L);
    this.B.a(go.s);
    this.C = new gb(1, 0);
    az az1 = this.C;
    ia ia1;
    (ia1 = this).a(az1, true);
    this.D = new gb(2, 2);
    this.E = new gb(3, 3);
  }
  
  private void t() {
    if (this.q == null)
      return; 
    int i = 0;
    for (byte b = 0; b < this.q.length; b++) {
      i++;
      if ((this.q[b]).a && !this.q[b].e()) {
        i += (this.q[b]).b.length;
        if ((this.q[b]).b.length < this.q[b].d())
          i++; 
      } 
    } 
    Object[] arrayOfObject = new Object[i];
    i = 0;
    int j;
    for (j = 0; j < this.q.length; j++) {
      arrayOfObject[i++] = this.q[j];
      if ((this.q[j]).a && !this.q[j].e()) {
        for (byte b1 = 0; b1 < (this.q[j]).b.length; b1++)
          arrayOfObject[i++] = (this.q[j]).b[b1]; 
        if ((this.q[j]).b.length < this.q[j].d())
          arrayOfObject[i++] = new dp("Xem thêm", this.q[j]); 
      } 
    } 
    j = this.p.s();
    int k = (this.k.r()).b;
    synchronized (this.p) {
      this.p.q();
      this.p.a(arrayOfObject);
      this.p.k(j);
      j = k;
      ia ia1;
      aq aq1 = (ia1 = this).p.o(ia1.p.s());
      aq aq2;
      if (ia1.p.s() < ia1.p.a() - 1 && (aq2 = ia1.p.o(ia1.p.s() + 1)).d() + aq2.f() - j > ia1.p.f())
        j = aq2.d() + aq2.f() - ia1.p.f(); 
      if (aq1.d() + aq1.f() - j > ia1.p.f())
        j = aq1.d() + aq1.f() - ia1.p.f(); 
      ia1.k.k(j);
      e(true);
      return;
    } 
  }
  
  public final void e(boolean paramBoolean) {
    super.e(paramBoolean);
    this.k.c(paramBoolean);
  }
  
  public final void a(int paramInt, lq[] paramArrayOflq) {
    for (byte b = 0; b < this.q.length; b++) {
      if (this.q[b].b() == paramInt) {
        this.q[b].a(paramArrayOflq);
        (this.q[b]).a = true;
        (this.q[b]).c = paramArrayOflq.length;
        t();
        break;
      } 
    } 
    a.s().v();
  }
  
  private static void a(dk paramdk) {
    boolean bool = (paramdk.b == null) ? false : paramdk.b.length;
    ks.a().d(paramdk.b(), bool);
    a.s().a(null, null);
  }
  
  public final void f(int paramInt) {
    this.k.f(paramInt);
  }
  
  public final void f(int paramInt1, int paramInt2) {
    this.k.c(paramInt1, paramInt2);
  }
  
  public final void e(int paramInt1, int paramInt2) {
    this.k.e(paramInt1, paramInt2);
  }
  
  public final void g(int paramInt1, int paramInt2) {
    this.k.f(paramInt1, paramInt2);
  }
  
  public final void u() {
    this.s.i();
    this.k.n();
    if (this.B != null) {
      this.B.i();
      this.B.b(true);
    } 
  }
  
  public final void a(Graphics paramGraphics) {
    if (this.m != null)
      this.k.c(true); 
    if (this.k.k()) {
      paramGraphics.setColor(v.am);
      paramGraphics.fillRect(0, 0, i(), j());
      paramGraphics.drawImage(pc.d, a() + i(), c() + j() - ba.a, 40);
      pc.a(paramGraphics, 2, this.s.q() + 5, i() - 4);
    } 
    this.k.a(paramGraphics, a(), c());
    this.k.c(true);
    paramGraphics.setColor(v.am);
    paramGraphics.fillRect(0, 0, this.s.p(), this.s.q());
    this.s.a(paramGraphics);
    if (this.B != null)
      this.B.a(paramGraphics, 0, 0); 
  }
  
  public final void b(Graphics paramGraphics) {}
  
  private void a(ll paramll) {
    if (paramll != null)
      for (byte b = 0; b < this.p.a(); b++) {
        fj fj;
        if (this.p.o(b) instanceof fj && (fj = (fj)this.p.o(b)).j == paramll.b) {
          fj.i = false;
          fj.c(true);
          return;
        } 
      }  
  }
  
  public final void b(aq paramaq, int paramInt) {
    Object object;
    if (object = this.p.i(paramInt) instanceof dk) {
      if (((dk)(object = object)).a) {
        ((dk)object).a = false;
        t();
        return;
      } 
      if (object.d() <= 0 || (((dk)object).b != null && ((dk)object).b.length > 0)) {
        ((dk)object).a = true;
        t();
        return;
      } 
      a((dk)object);
      return;
    } 
    if (object instanceof dp) {
      a((dk)((dp)(object = object)).b);
      return;
    } 
    if (object instanceof lq) {
      lq lq1 = (lq)object;
      ((ia)(object = this)).w = lq1;
      bs bs = new bs();
      String[] arrayOfString = null;
      int[] arrayOfInt = null;
      ll ll1;
      if (lq1.e instanceof ll && ((ll1 = (ll)lq1.e).h == 2 || ll1.h == ((ia)object).r.f))
        if (((ia)object).y[ll1.e] != null && (((ia)object).y[ll1.e]).e.equals(ll1)) {
          arrayOfString = new String[] { "Cởi ra", "Mua", "C.Tiết" };
          arrayOfInt = new int[] { 11113, 11111, 11112 };
        } else {
          arrayOfString = new String[] { "Mặc thử", "Mua", "C.Tiết" };
          arrayOfInt = new int[] { 11114, 11111, 11112 };
        }  
      if (arrayOfString == null) {
        arrayOfString = new String[] { "Mua", "C.Tiết" };
        arrayOfInt = new int[] { 11111, 11112 };
      } 
      br[] arrayOfBr = new br[arrayOfString.length];
      int m;
      for (m = 0; m < arrayOfBr.length; m++)
        arrayOfBr[m] = new br(arrayOfString[m], arrayOfInt[m]); 
      bs.a(arrayOfBr);
      m = ((ia)object).p.s();
      aq aq1 = ((ia)object).p.o(m);
      k k = ((ia)object).k.r();
      int j = (v.t - bs.e()) / 2;
      int i;
      if ((i = ((ia)object).k.d() + aq1.d() - k.b) + bs.f() > v.u - ba.a)
        i = v.u - ba.a - bs.f(); 
      bs.a_(v.t + bs.e(), i);
      bs.d(j, i);
      bs.a_(1);
      bs.a((bf)object);
      object.a(bs, ((ia)object).D, a.n, ((ia)object).E);
      ((ht)object).n = true;
    } 
  }
  
  public final void a(aq paramaq, int paramInt) {}
  
  public final void a(aq paramaq, int paramInt1, int paramInt2) {}
  
  public final aq a(aw paramaw, int paramInt) {
    Object object;
    if ((object = paramaw.i(paramInt)) == null)
      return null; 
    if (object instanceof dk)
      return new fi((dk)object); 
    if (object instanceof dp)
      return new gl(37); 
    Image image = null;
    if (object instanceof lq) {
      if (((lq)(object = object)).e instanceof lm) {
        object = ((lq)object).e;
        return new fj(((ld)object).b, ((ld)object).a, ((lm)object).j, ((lm)object).g, ((lm)object).h, -1, false, null, null, 0L);
      } 
      if (((lq)object).e instanceof lu) {
        object = ((lq)object).e;
        return new fj(((lu)object).a, ((lu)object).d, ((lu)object).c, this.G);
      } 
      if (((lq)object).e instanceof ll) {
        object = ((lq)object).e;
        boolean bool = false;
        if (this.y[((ll)object).e] != null && (this.y[((ll)object).e]).e.equals(object))
          bool = true; 
        try {
          image = this.t.a(mb.a(((ll)object).n), true);
        } catch (Throwable throwable) {}
        return new fj(((ll)object).d, ((ll)object).b, ((ll)object).l, ((ll)object).m, bool, image, ((ll)object).f, ((ll)object).j, this.F, null, 0L);
      } 
    } 
    return null;
  }
  
  public final boolean g(int paramInt) {
    ia ia1;
    a a;
    al al;
    byte b;
    hh hh;
    switch (paramInt) {
      case 11111:
        (ia1 = this).w.e instanceof lu;
        (al = ag.b().a("Chú ý", "Bạn muốn mua món đồ này không?", "Có", 13, "Không", 12, 1)).a(ia1);
        ag.b().a(al, false);
        return true;
      case 11112:
        if ((ia1 = this).w != null)
          if (ia1.w.e instanceof ll) {
            ll ll1;
            (ll1 = (ll)ia1.w.e).p = (ll1.q == 0) ? -1 : ll1.q;
            a.a(ll1, ia1, "", -123233, "Đóng", 5);
          } else if (ia1.w.e instanceof lm) {
            a.a((lm)ia1.w.e, null);
          } else if (ia1.w.e instanceof lu) {
            lu lu = (lu)ia1.w.e;
            al al1;
            (al1 = ag.b().a(lu.a, lu.b, "Đóng", 11119, 1)).b(1515);
            ag.b().a(al1);
            al1.a(ia1);
          }  
        return true;
      case 11113:
        if ((ia1 = this).w != null && ia1.w.e instanceof ll) {
          ll ll1 = (ll)ia1.w.e;
          fj fj;
          (fj = (fj)ia1.p.o(ia1.p.s())).i = false;
          ia1.y[ll1.e] = null;
          ia1.z[ll1.e] = false;
          if (ia1.u[ll1.e] == null) {
            ia1.s.b(ll1);
          } else {
            ia1.s.a(ia1.u[ll1.e]);
          } 
        } 
        return true;
      case 11114:
        if ((ia1 = this).w != null && ia1.w.e instanceof ll) {
          ll ll1 = (ll)ia1.w.e;
          ll ll2 = (ia1.y[ll1.e] != null) ? (ll)(ia1.y[ll1.e]).e : null;
          ia1.a(ll2);
          fj fj;
          (fj = (fj)ia1.p.o(ia1.p.s())).i = true;
          ia1.y[ll1.e] = ia1.w;
          ia1.z[ll1.e] = true;
          ia1.s.a(ll1);
        } 
        return true;
      case 11115:
        a = new a();
        for (b = 0; b < this.y.length; b++) {
          if ((((this.y[b] != null) ? 1 : 0) & this.z[b]) != 0)
            a.a(this.y[b]); 
        } 
        if (a.d() == 0) {
          v();
        } else {
          lq[] arrayOfLq = new lq[a.d()];
          for (byte b1 = 0; b1 < arrayOfLq.length; b1++)
            arrayOfLq[b1] = (lq)a.b(b1); 
          a(arrayOfLq);
        } 
        return true;
      case 11116:
        b = 0;
        while (b < this.y.length) {
          al al1;
          if (this.y[b] != null && this.z[b]) {
            ia ia2 = this;
            (al1 = ag.b().a("Chú ý", "Bạn đã chọn một số món đồ. Bạn có muốn mua không?", "Có", 11, "Đóng", 8, 1)).a(ia2);
            al1.b(1345779);
            ag.b().a(al1, false);
            this.v = true;
            return true;
          } 
          al1++;
        } 
        w();
        return true;
      case 11117:
        a.s().l();
        hh = new hh(null, null);
        ag.b().a(hh);
        return true;
      case 11118:
        ag.b().a(241209, false);
        return true;
    } 
    return false;
  }
  
  public final void e(int paramInt) {
    ia ia2;
    int[] arrayOfInt;
    a a;
    ia ia1;
    br[] arrayOfBr;
    byte b1;
    lq[] arrayOfLq;
    byte b2;
    switch (paramInt) {
      case 2:
        if (this.m != null) {
          this.m.f(95);
          return;
        } 
        break;
      case 3:
        A();
        return;
      case 1:
        ia2 = this;
        arrayOfBr = new br[] { new br("Giỏ hàng", 11115), new br("Đóng", 11116) };
        ia2.a(arrayOfBr, ia2.D, a.n, ia2.E);
        return;
      case 5:
        a.s().a(241212, false);
        return;
      case 8:
        a.s().a(1345779, false);
        if (this.v) {
          w();
          return;
        } 
        break;
      case 9:
        if (go.b()) {
          a.a(this, "Hành Trang", 11117, "Đóng", 11118);
          return;
        } 
        this.x = true;
        a.s().a(154896, false);
        arrayOfInt = new int[this.A.length];
        for (b1 = 0; b1 < arrayOfInt.length; b1++)
          arrayOfInt[b1] = (this.A[b1]).a; 
        ks.a().a(arrayOfInt);
        a.s().a(null, null);
        return;
      case 10:
        a.s().a(154896, false);
        if (this.v) {
          w();
          return;
        } 
        break;
      case 11:
        a.s().a(1345779, false);
        a = new a();
        for (b1 = 0; b1 < this.y.length; b1++) {
          if ((((this.y[b1] != null) ? 1 : 0) & this.z[b1]) != 0)
            a.a(this.y[b1]); 
        } 
        if (a.d() == 0) {
          v();
          return;
        } 
        arrayOfLq = new lq[a.d()];
        for (b2 = 0; b2 < arrayOfLq.length; b2++)
          arrayOfLq[b2] = (lq)a.b(b2); 
        a(arrayOfLq);
        return;
      case 13:
        ag.b().a(false);
        (ia1 = this).x = false;
        if (ia1.w != null) {
          ks.a().a(new int[] { ia1.w.a });
          a.s().a(null, null);
        } 
        return;
      case 12:
        ag.b().a(false);
        return;
      case 11119:
        ag.b().e(1515);
        break;
    } 
  }
  
  public final void a(String[] paramArrayOfString, int[] paramArrayOfint) {
    a.s().v();
    if (this.x) {
      for (byte b = 0; b < this.y.length; b++) {
        for (byte b1 = 0; b1 < paramArrayOfint.length; b1++) {
          if (this.y[b] != null && (this.y[b]).a == paramArrayOfint[b1]) {
            this.z[b] = false;
            ll ll1;
            (ll1 = ((ll)(this.y[b]).e).d()).p = (ll1.q == 0) ? -1 : ll1.q;
            ll1.c = paramArrayOfString[b1];
            go.a(ll1);
            a((ll)(this.y[b]).e);
            break;
          } 
        } 
      } 
      if (this.v) {
        w();
        return;
      } 
    } else {
      if (this.w == null)
        return; 
      if (this.w.e instanceof ll) {
        ll ll1;
        (ll1 = ((ll)this.w.e).d()).p = (ll1.q == 0) ? -1 : ll1.q;
        ll1.c = paramArrayOfString[0];
        go.a(ll1);
        for (byte b = 0; b < paramArrayOfint.length; b++) {
          for (byte b1 = 0; b1 < this.y.length; b1++) {
            if (this.y[b1] != null && (this.y[b1]).a == paramArrayOfint[b]) {
              this.z[b1] = false;
              a((ll)(this.y[b1]).e);
              break;
            } 
          } 
        } 
        a(ll1.d);
      } 
      return;
    } 
  }
  
  public final void a(int[] paramArrayOfint1, int[] paramArrayOfint2) {
    if (this.w == null)
      return; 
    lm lm;
    if (this.w.e instanceof lm && (lm = ((lm)this.w.e).b()).a == paramArrayOfint1[0]) {
      go.a(lm, paramArrayOfint2[0]);
      a(String.valueOf(paramArrayOfint2[0]) + " " + lm.b);
    } 
    a.s().v();
    if (this.v)
      w(); 
  }
  
  private void v() {
    al al;
    (al = ag.b().a("Chú ý", "Giỏ hàng trống. Bạn chưa chọn món đồ nào", "Đóng", 8, 1)).a(this);
    al.b(1345779);
    ag.b().a(al, false);
  }
  
  private void a(String paramString) {
    al al;
    (al = ag.b().a("Chú ý", "Bạn vừa mua thành công! " + paramString, "Đóng", 8, 1)).a(this);
    al.b(1345779);
    ag.b().a(al, false);
  }
  
  private void a(lq[] paramArrayOflq) {
    this.A = paramArrayOflq;
    bd bd = new bd("Mua", 9);
    gx gx1;
    gx gx2;
    (gx2 = gx1 = new gx(this.A)).a(bd, true);
    bd = new bd("Đóng", 10);
    (gx2 = gx1).b(bd, true);
    gx1.a(this);
    gx1.b(154896);
    ag.b().a(gx1, false);
  }
  
  public final void a(long paramLong) {
    if (this.B != null)
      this.B.a(paramLong); 
  }
  
  private void w() {
    a.s().e(h());
    al al;
    if ((al = a.s().d(241202)) != null) {
      a.s().b(al, false);
      al = new hh(null, null);
      ag.b().a(al);
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ia.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */