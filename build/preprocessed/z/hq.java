import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class hq extends ht implements bn, bq {
  private ay k;
  
  private aw p;
  
  private dk[] q;
  
  private If1 r;
  
  private ox s = new ox(null);
  
  private boolean t = false;
  
  private ft u;
  
  private az v;
  
  private az w;
  
  private az x;
  
  private lq y;
  
  private d z = new if(new int[] { 16711680, 16776960 });
  
  public hq(lq[] paramArrayOflq) {
    b(241235);
    a(0, 0, v.t, v.u);
    this.k = new ay(0);
    this.k.a(a(), c(), i(), j() - ba.a);
    this.p = new aw();
    this.p.a(this);
    this.p.a(this);
    this.p.e(true);
    this.k.b(this.p);
    this.r = new If1(999, "Đang bán", paramArrayOflq.length);
    this.q = new dk[1];
    for (byte b = 0; b < this.q.length; b++)
      this.q[b] = new dk(this.r); 
    if (0 < this.q.length) {
      this.q[0].a(paramArrayOflq);
      (this.q[0]).a = true;
      (this.q[0]).c = paramArrayOflq.length;
      v();
    } 
    this.z = new if(new int[] { 16711680, 16776960 });
    a(a.n);
    a(this);
    this.u = new ft(go.s / 2L);
    this.u.a(go.s);
    this.v = new gb(1, 0);
    az az1 = this.v;
    hq hq1;
    (hq1 = this).a(az1, true);
    this.w = new gb(2, 2);
    this.x = new gb(3, 3);
  }
  
  private void v() {
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
      hq hq1;
      aq aq;
      if ((aq = (hq1 = this).p.o(hq1.p.s())) != null) {
        aq aq1;
        if (hq1.p.s() < hq1.p.a() - 1 && (aq1 = hq1.p.o(hq1.p.s() + 1)).d() + aq1.f() - j > hq1.p.f())
          j = aq1.d() + aq1.f() - hq1.p.f(); 
        if (aq.d() + aq.f() - j > hq1.p.f())
          j = aq.d() + aq.f() - hq1.p.f(); 
        hq1.k.k(j);
      } 
      e(true);
      return;
    } 
  }
  
  public final void e(boolean paramBoolean) {
    super.e(paramBoolean);
    this.k.c(paramBoolean);
  }
  
  public final void a(lq[] paramArrayOflq) {
    a.s().v();
    this.q[0] = new dk(new If1(999, "Đang bán", paramArrayOflq.length));
    this.q[0].a(paramArrayOflq);
    (this.q[0]).a = true;
    (this.q[0]).c = paramArrayOflq.length;
    v();
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
    if (this.u != null) {
      this.u.i();
      this.u.b(true);
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
    if (this.u != null)
      this.u.a(paramGraphics, 0, 0); 
  }
  
  public final void b(Graphics paramGraphics) {}
  
  public final void b(aq paramaq, int paramInt) {
    Object object;
    if (object = this.p.i(paramInt) instanceof dk) {
      if (((dk)(object = object)).a) {
        ((dk)object).a = false;
        v();
        return;
      } 
      t();
      return;
    } 
    if (object instanceof dp) {
      paramInt = (((dk)(object = ((dp)(object = object)).b)).b == null) ? 0 : ((dk)object).b.length;
      ks.a().b(object.b(), 10, paramInt);
      a.s().a(null, null);
      return;
    } 
    if (object instanceof lq) {
      lq lq1 = (lq)object;
      ((hq)(object = this)).y = lq1;
      bs bs = new bs();
      String[] arrayOfString = null;
      int[] arrayOfInt = null;
      arrayOfString = new String[] { "Ngưng bán", "C.Tiết", "Gia hạn" };
      arrayOfInt = new int[] { 11111, 11112, 11114 };
      br[] arrayOfBr = new br[3];
      int m;
      for (m = 0; m < 3; m++)
        arrayOfBr[m] = new br(arrayOfString[m], arrayOfInt[m]); 
      bs.a(arrayOfBr);
      m = ((hq)object).p.s();
      aq aq1 = ((hq)object).p.o(m);
      k k = ((hq)object).k.r();
      int j = (v.t - bs.e()) / 2;
      int i;
      if ((i = ((hq)object).k.d() + aq1.d() - k.b) + bs.f() > v.u - ba.a)
        i = v.u - ba.a - bs.f(); 
      bs.a_(v.t + bs.e(), i);
      bs.d(j, i);
      bs.a_(1);
      bs.a((bf)object);
      object.a(bs, ((hq)object).w, a.n, ((hq)object).x);
      ((ht)object).n = true;
    } 
  }
  
  public static void t() {
    ks.a().i();
    a.s().a(null, null);
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
    ct.a("[getListCellRenderer]========================");
    Image image = null;
    if (object instanceof lq) {
      if (((lq)(object = object)).e instanceof lm) {
        lm lm = (lm)((lq)object).e;
        return new fj(lm.b, lm.a, lm.j, lm.g, lm.h, -1, false, null, null, ((lq)object).g);
      } 
      if (((lq)object).e instanceof ll) {
        ll ll = (ll)((lq)object).e;
        try {
          image = this.s.a(mb.a(ll.n), true);
        } catch (Throwable throwable) {}
        return new fj(ll.d, ll.b, ll.l, ll.m, false, image, ll.f, ll.j, this.z, null, ((lq)object).g);
      } 
    } 
    return null;
  }
  
  private void a(String paramString) {
    dk dk1 = null;
    for (byte b = 0; b < this.p.a(); b++) {
      Object object;
      if (object = this.p.i(b) instanceof dk) {
        dk1 = (dk)object;
      } else if (object instanceof lq && ((lq)(object = object)).b.equals(paramString)) {
        this.p.j(b);
        dk1.a(paramString);
        return;
      } 
    } 
  }
  
  public final void a(String paramString, ll[] paramArrayOfll, lm[] paramArrayOflm) {
    a(paramString);
    if (paramArrayOfll != null && paramArrayOfll.length > 0)
      go.a(paramArrayOfll[0]); 
    if (paramArrayOflm != null && paramArrayOflm.length > 0)
      go.a(paramArrayOflm[0], (paramArrayOflm[0]).g); 
  }
  
  public final boolean g(int paramInt) {
    hq hq1;
    hh hh;
    switch (paramInt) {
      case 11111:
        hq1 = this;
        ks.a().h(hq1.y.b);
        a.s().a(null, null);
        return true;
      case 11112:
        if ((hq1 = this).y != null)
          if (hq1.y.e instanceof ll) {
            ll ll;
            a.a(ll = (ll)hq1.y.e, hq1, "", -123233, "Đóng", 5);
          } else if (hq1.y.e instanceof lm) {
            a.a((lm)hq1.y.e, null);
          } else if (hq1.y.e instanceof lu) {
            lu lu = (lu)hq1.y.e;
            al al;
            (al = ag.b().a(lu.a, lu.b, "Đóng", 11119, 1)).b(1515);
            ag.b().a(al);
            al.a(hq1);
          }  
        return true;
      case 11114:
        (hq1 = this).a(hq1.y.b);
        ks.a().g(hq1.y.b);
        a.s().a(null, null);
        return true;
      case 11116:
        hq1 = this;
        a.s().e(hq1.h());
        return true;
      case 11115:
        a.s().I();
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
    hq hq1;
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
        hq1 = this;
        arrayOfBr = new br[] { new br("Chợ trời", 11115), new br("Đóng", 11116) };
        hq1.a(arrayOfBr, hq1.w, a.n, hq1.x);
        return;
      case 5:
        a.s().a(241212, false);
        return;
      case 8:
        a.s().a(1345779, false);
        return;
      case 13:
        ag.b().a(false);
        if ((hq1 = this).y != null) {
          ks.a().i(hq1.y.b);
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
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\hq.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */