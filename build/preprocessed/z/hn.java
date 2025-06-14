import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class hn extends ht implements bn, bq {
  private ay k;
  
  private aw p;
  
  private dk[] q;
  
  private ox r = new ox(null);
  
  private boolean s = false;
  
  private ft t;
  
  private az u;
  
  private az v;
  
  private az w;
  
  private lq x;
  
  private d y;
  
  private boolean z;
  
  private int A;
  
  public hn(If1[] paramArrayOflf) {
    b(241233);
    a(0, 0, v.t, v.u);
    this.k = new ay(0);
    this.k.a(a(), c(), i(), j() - ba.a);
    this.p = new aw();
    this.p.a((bn)this);
    this.p.a(this);
    this.p.e(true);
    this.k.b(this.p);
    if (this.y == null)
      this.y = new if(new int[] { 16711680, 16776960 }); 
    this.q = new dk[paramArrayOflf.length];
    for (byte b = 0; b < this.q.length; b++)
      this.q[b] = new dk(paramArrayOflf[b]); 
    t();
    a(a.n);
    a(this);
    this.t = new ft(go.s / 2L);
    this.t.a(go.s);
    this.u = new gb(1, 0);
    az az1 = this.u;
    hn hn1;
    (hn1 = this).a(az1, true);
    this.v = new gb(2, 2);
    this.w = new gb(3, 3);
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
    ct.b("[reloadShop()]=================");
    synchronized (this.p) {
      this.p.q();
      this.p.a(arrayOfObject);
      this.p.k(j);
      e(true);
      return;
    } 
  }
  
  public final void e(boolean paramBoolean) {
    super.e(paramBoolean);
    this.k.c(paramBoolean);
  }
  
  public final void a(int paramInt1, int paramInt2, lq[] paramArrayOflq) {
    byte b = -1;
    for (byte b1 = 0; b1 < this.q.length; b1++) {
      if (this.q[b1].b() != paramInt1) {
        (this.q[b1]).a = false;
        (this.q[b1]).c = 0;
      } else {
        b = b1;
      } 
    } 
    dk dk1;
    if (b >= 0 && (dk1 = this.q[b]).b() == paramInt1) {
      dk1.c += paramArrayOflq.length;
      dk dk2;
      (dk2 = dk1).b = null;
      this.p.k(b);
      this.r.a();
      if (!dk1.a)
        dk1.a = true; 
      dk1.a(paramArrayOflq);
      dk1.a(paramInt2);
      t();
    } 
    a.s().v();
  }
  
  private void a(dk paramdk) {
    if (!this.z) {
      if (this.A <= paramdk.d())
        if (this.A + paramdk.b.length <= paramdk.d()) {
          this.A += paramdk.b.length;
        } else {
          this.A += paramdk.d() - this.A;
        }  
    } else {
      this.A = 0;
    } 
    ks.a().b(paramdk.b(), 10, this.A);
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
    this.k.n();
    if (this.t != null) {
      this.t.i();
      this.t.b(true);
    } 
  }
  
  public final void a(Graphics paramGraphics) {
    if (this.m != null)
      this.k.c(true); 
    if (this.k.k()) {
      paramGraphics.setColor(v.am);
      paramGraphics.fillRect(0, 0, i(), j());
      paramGraphics.drawImage(pc.d, a() + i(), c() + j() - ba.a, 40);
    } 
    this.k.a(paramGraphics, a(), c());
    this.k.c(true);
    paramGraphics.setColor(v.am);
    if (this.t != null)
      this.t.a(paramGraphics, 0, 0); 
  }
  
  public final void b(Graphics paramGraphics) {}
  
  public final void b(aq paramaq, int paramInt) {
    Object object;
    if (object = this.p.i(paramInt) instanceof dk) {
      if (((dk)(object = object)).a) {
        ((dk)object).a = false;
        t();
        return;
      } 
      this.z = true;
      a((dk)object);
      ((dk)object).c = 0;
      return;
    } 
    if (object instanceof dp) {
      object = object;
      this.z = false;
      a((dk)((dp)object).b);
      return;
    } 
    if (object instanceof lq) {
      lq lq1 = (lq)object;
      ((hn)(object = this)).x = lq1;
      bs bs = new bs();
      String[] arrayOfString = null;
      int[] arrayOfInt = null;
      if (!go.e.equals(lq1.f)) {
        arrayOfString = new String[] { "Mua", "C.Tiết" };
        arrayOfInt = new int[] { 11111, 11112 };
      } else {
        arrayOfString = new String[] { "C.Tiết" };
        arrayOfInt = new int[] { 11112 };
      } 
      br[] arrayOfBr = new br[arrayOfString.length];
      int m;
      for (m = 0; m < arrayOfBr.length; m++)
        arrayOfBr[m] = new br(arrayOfString[m], arrayOfInt[m]); 
      bs.a(arrayOfBr);
      m = ((hn)object).p.s();
      aq aq1 = ((hn)object).p.o(m);
      k k = ((hn)object).k.r();
      int j = (v.t - bs.e()) / 2;
      int i;
      if ((i = ((hn)object).k.d() + aq1.d() - k.b) + bs.f() > v.u - ba.a)
        i = v.u - ba.a - bs.f(); 
      bs.a_(v.t + bs.e(), i);
      bs.d(j, i);
      bs.a_(1);
      bs.a((bf)object);
      object.a(bs, ((hn)object).v, a.n, ((hn)object).w);
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
        lm lm = (lm)((lq)object).e;
        return new fj(lm.b, lm.a, lm.j, lm.g, lm.h, -1, false, null, ((lq)object).f, 0L);
      } 
      if (((lq)object).e instanceof ll) {
        ll ll = (ll)((lq)object).e;
        try {
          image = this.r.a(mb.a(ll.n), true);
        } catch (Throwable throwable) {}
        return new fj(ll.d, ll.b, ll.l, ll.m, false, image, ll.f, ll.j, this.y, ((lq)object).f, 0L);
      } 
    } 
    return null;
  }
  
  public final boolean g(int paramInt) {
    hn hn1;
    hh hh;
    al al;
    switch (paramInt) {
      case 11111:
        (hn1 = this).x.e instanceof lu;
        (al = ag.b().a("Chú ý", "Bạn muốn mua món đồ này không?", "Có", 13, "Không", 12, 1)).a(hn1);
        ag.b().a(al, false);
        return true;
      case 11112:
        if ((hn1 = this).x != null)
          if (hn1.x.e instanceof ll) {
            ll ll;
            a.a(ll = (ll)hn1.x.e, hn1, "", -123233, "Đóng", 5);
          } else if (hn1.x.e instanceof lm) {
            a.a((lm)hn1.x.e, null);
          } else if (hn1.x.e instanceof lu) {
            lu lu = (lu)hn1.x.e;
            al al1;
            (al1 = ag.b().a(lu.a, lu.b, "Đóng", 11119, 1)).b(1515);
            ag.b().a(al1);
            al1.a(hn1);
          }  
        return true;
      case 11116:
        hn1 = this;
        a.s().e(hn1.h());
        if ((al = a.s().d(241202)) != null) {
          a.s().b(al, false);
          al = new hh(null, null);
          ag.b().a(al);
        } 
        return true;
      case 11114:
        ag.b().a(199199, false);
        return true;
      case 11115:
        ks.a().i();
        a.s().a(null, null);
        return true;
      case 11113:
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
    hn hn1;
    br[] arrayOfBr;
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
        hn1 = this;
        arrayOfBr = new br[] { new br("Đang bán", 11115), new br("Rao bán", 11113), new br("Đóng", 11116) };
        hn1.a(arrayOfBr, hn1.v, a.n, hn1.w);
        return;
      case 5:
        a.s().a(241212, false);
        return;
      case 8:
        a.s().a(1345779, false);
        return;
      case 13:
        ag.b().a(false);
        if (go.s > -1L && this.x.d > go.s) {
          hn1 = this;
          al al;
          (al = ag.b().a("Chú ý", "Vượt quá số tiền bạn đang có. Vui lòng thử lại!!!", "Đóng", 11114, 1)).b(199199);
          al.a(hn1);
          ag.b().a(al, false);
          return;
        } 
        if ((hn1 = this).x != null) {
          ks.a().i(hn1.x.b);
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
  
  public final void a(String paramString, ll[] paramArrayOfll, lm[] paramArrayOflm) {
    a.s().v();
    if (this.x == null)
      return; 
    String str = paramString;
    hn hn1 = this;
    dk dk1 = null;
    for (byte b = 0; b < hn1.p.a(); b++) {
      Object object;
      if (object = hn1.p.i(b) instanceof dk) {
        dk1 = (dk)object;
      } else if (object instanceof lq && ((lq)(object = object)).b.equals(str)) {
        hn1.p.j(b);
        dk1.a(str);
        break;
      } 
    } 
    if (paramArrayOfll != null && paramArrayOfll.length > 0) {
      go.a(paramArrayOfll[0]);
      a((paramArrayOfll[0]).d);
    } 
    if (paramArrayOflm != null && paramArrayOflm.length > 0) {
      go.a(paramArrayOflm[0], (paramArrayOflm[0]).g);
      a(String.valueOf((paramArrayOflm[0]).g) + " " + (paramArrayOflm[0]).b);
    } 
  }
  
  private void a(String paramString) {
    al al;
    (al = ag.b().a("Chú ý", "Bạn vừa mua thành công! " + paramString, "Đóng", 8, 1)).a(this);
    al.b(1345779);
    ag.b().a(al, false);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\hn.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */