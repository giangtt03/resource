import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class hr extends ht implements bn, bq, il {
  private ns[] k;
  
  private int p;
  
  private ns q = null;
  
  private byte r = 0;
  
  private k s;
  
  private ay t;
  
  private aw u;
  
  private az v;
  
  private az w;
  
  private az x;
  
  private az y;
  
  private az z;
  
  private Object A = null;
  
  private final d B;
  
  private final d C;
  
  private final d D;
  
  private final d E;
  
  private final d F;
  
  public hr() {
    a(this);
    b(241204);
    a(new ba());
    int i = v.t;
    int j = v.u - ba.a;
    a(0, 0, i, j);
    this.t = new ay();
    this.t.h(1);
    hr hr1;
    (hr1 = this).x = new gb(9, 0);
    hr1.v = new gb(7, 2);
    hr1.w = new gb(8, 3);
    hr1.z = new bd("Nhận", 1112);
    hr1.y = new bd("C.Tiết", 1113);
    az az1 = hr1.x;
    hr hr2;
    (hr2 = hr1).a(az1, true);
    az1 = hr1.w;
    (hr2 = hr1).b(az1, true);
    hr1.a(hr1.r);
    if (!cs.a.c(140)) {
      od.h(140);
      gr.m = false;
    } 
    this.B = new if(new int[] { 16754176, 16711680 });
    this.C = new if(new int[] { 12237498 });
    this.D = bx.c;
    this.E = new if(new int[] { 11251967, 255 });
    this.F = a.g;
  }
  
  public final void a(Graphics paramGraphics) {
    paramGraphics.setColor(0);
    paramGraphics.fillRect(0, 0, v.t, v.u);
    pc.a(paramGraphics, this.c, this.d, this.f, this.g, v.aj, true);
  }
  
  public final void b(Graphics paramGraphics) {
    switch (this.r) {
      case 0:
        this.E.a(paramGraphics, "Nhiệm Vụ", this.c + 15, this.d + this.t.d() - 20, 0);
        pc.a(paramGraphics, this.c + 10, this.d + this.t.d() - 3, this.f - 20);
        this.t.a(paramGraphics, this.c, this.d);
        this.t.c(true);
        if (this.k == null || this.k.length <= 0) {
          this.D.a(paramGraphics, "Chưa có nhiệm vụ mới.", this.c + 5, this.d + 30, 0);
          return;
        } 
        break;
      case 1:
      case 2:
        this.E.a(paramGraphics, this.q.b, this.c + 15, this.d + this.t.d() - 20, 0);
        pc.a(paramGraphics, this.c + 10, this.d + this.t.d() - 3, this.f - 20);
        this.t.a(paramGraphics, this.c, this.d);
        this.t.c(true);
        break;
    } 
  }
  
  public final void u() {
    if (this.t != null)
      this.t.n(); 
  }
  
  public final void a(byte paramByte) {
    gc gc;
    this.u = null;
    this.r = paramByte;
    switch (this.r) {
      case 0:
        this.p = 0;
        this.t = new ay();
        this.t.h(1);
        this.s = new k(this.c + 4, this.d + 34, this.f - 8, this.g - 44);
        this.t.a(this.s);
        this.u = new aw();
        this.u.a(this);
        this.u.a(this);
        this.u.e(true);
        this.t.b(this.u);
        if (this.k != null && this.k.length > 0) {
          for (byte b = 0; b < this.k.length; b++) {
            gc gc1;
            (gc1 = new gc(String.valueOf(b + 1) + ". " + (this.k[b]).b, this.t.e() - 20, (this.k[b]).e ? this.C : this.D)).i(10);
            gc1.j(6);
            gc1.d(this.t.e());
            gc1.b(true);
            this.u.a(gc1);
          } 
          this.o[1] = this.y;
          a(this.y);
        } else {
          a(a.n);
        } 
        this.u.k(this.p);
        return;
      case 1:
        this.s = new k(this.c + 8, this.d + 34, this.f - 8, this.g - 44);
        this.t = new ay();
        this.t.h(1);
        this.t.a(this.s);
        this.u = new aw();
        this.u.f(true);
        this.u.a(this);
        this.t.b(this.u);
        gc = new gc(this.q.c, this.s.c - 10, this.D);
        this.u.a(gc);
        if (this.q.f != null)
          for (byte b = 0; b < this.q.f.length; b++) {
            (gc = new gc("- " + (this.q.f[b]).b, 10, this.s.c - 10, this.F, 2)).j(6);
            this.u.a(gc);
          }  
        a((az)null);
        return;
      case 2:
        this.s = new k(this.c + 8, this.d + 34, this.f - 8, this.g - 44);
        this.t = new ay();
        this.t.h(1);
        this.t.a(this.s);
        this.u = new aw();
        this.u.f(true);
        this.u.a(this);
        this.t.b(this.u);
        if (this.q.d > 0L)
          this.u.a(new gc("Giá: " + i.a(this.q.d, ",") + " KEN", this.s.c - 10, this.B)); 
        this.u.a(new gc(this.q.c, this.s.c - 10, this.D));
        a(this.z);
        break;
    } 
  }
  
  public final void e(int paramInt) {
    hr hr1;
    br[] arrayOfBr;
    switch (paramInt) {
      case 2:
        this.l.a(false);
        return;
      case 3:
        ks.a().o((this.k[this.p]).a);
        a.s().a(null, this);
        return;
      case 8:
        if (this.m != null) {
          A();
          return;
        } 
        this.l.a(h(), false);
        return;
      case 7:
        this.m.f(95);
        return;
      case 9:
        switch ((hr1 = this).r) {
          case 0:
            if (hr1.k != null && hr1.k.length > 0) {
              br[] arrayOfBr1 = { new br("Chi Tiết", 1113), new br("Đóng", 1114) };
              break;
            } 
            arrayOfBr = new br[] { new br("Đóng", 1114) };
            break;
          case 1:
            arrayOfBr = new br[] { new br("Danh Sách Nhiệm Vụ", 1116), new br("Hủy nhiệm vụ", 1115), new br("Đóng", 1114) };
            break;
          default:
            arrayOfBr = new br[] { new br("Danh Sách Nhiệm Vụ", 1116), new br("Nhận", 1112), new br("Đóng", 1114) };
            break;
        } 
        hr1.a(arrayOfBr, hr1.v, new bd("", hr1.v.a()), hr1.w);
        return;
      case 11:
        this.l.a(false);
        ks.a().n(this.q.a);
        a.s().a(null, this);
        if (this.A != null && this.A instanceof om) {
          ((om)this.A).v();
          nu.b();
          nu.c();
          return;
        } 
        break;
      case 12:
        this.l.a(false);
        if (!this.q.e) {
          ks.a().m(this.q.a);
          a.s().a(null, this);
          if (this.A != null && this.A instanceof om)
            ((om)this.A).v(); 
        } 
        break;
    } 
  }
  
  public final void a(ns[] paramArrayOfns) {
    this.k = paramArrayOfns;
    if (this.r == 0) {
      if (paramArrayOfns == null || paramArrayOfns.length <= 0) {
        a(a.n);
        return;
      } 
      a(this.y);
    } 
  }
  
  public final void f(int paramInt) {
    switch (paramInt) {
      case 98:
      case 99:
        if (this.r == 0) {
          if (this.u != null) {
            this.u.f(paramInt);
            this.p = this.u.s();
            return;
          } 
          break;
        } 
        this.t.f(paramInt);
        break;
    } 
  }
  
  public final void t() {
    al al;
    (al = this.l.a("Chú ý", "Server bận! bạn có muốn thử lại không?", "Có", 3, "Không", 2, 1)).a(new ba());
    al.a(this);
    this.l.a(al, false);
  }
  
  public final void a(ns paramns) {
    this.q = paramns;
  }
  
  public final void f(int paramInt1, int paramInt2) {
    if (this.r == 0)
      this.t.c(paramInt1, paramInt2); 
  }
  
  public final void e(int paramInt1, int paramInt2) {
    if (this.t != null)
      this.t.j(-paramInt2); 
  }
  
  public final boolean g(int paramInt) {
    hr hr1;
    al al;
    switch (paramInt) {
      case 1112:
        if (!this.q.e)
          if (this.q.d > 0L) {
            hr hr2;
            al al1;
            (al1 = (hr2 = this).l.a("Chú ý", "Bạn sẽ tốn " + i.a(hr2.q.d, ",") + " khi nhận nhiệm vụ này. Bạn có muốn nhận hay không?", "Có", 12, "Không", 2, 1)).a(new ba());
            al1.a(hr2);
            hr2.l.a(al1, false);
          } else {
            ks.a().m(this.q.a);
            a.s().a(null, this);
            if (this.A != null && this.A instanceof om)
              ((om)this.A).v(); 
          }  
        return true;
      case 1113:
        if (this.k == null || this.k.length <= 0) {
          A();
          return true;
        } 
        ks.a().o((this.k[this.p]).a);
        a.s().a(null, null);
        return true;
      case 1114:
        this.l.a(h(), false);
        return true;
      case 1115:
        (al = (hr1 = this).l.a("Chú ý", "Bạn có chắc muốn hủy nhiệm vụ này không?", "Có", 11, "Không", 2, 1)).a(new ba());
        al.a(hr1);
        hr1.l.a(al, false);
        return true;
      case 1116:
        if (this.k == null) {
          ks.a().o();
          a.s().a(null, null);
        } else {
          a((byte)0);
        } 
        return true;
    } 
    return false;
  }
  
  public final void a(Object paramObject) {
    this.A = paramObject;
  }
  
  public final void v() {
    if (this.k != null)
      for (byte b = 0; b < this.k.length; b++) {
        if (this.q.a.equals((this.k[b]).a)) {
          (this.k[b]).e = false;
          break;
        } 
      }  
    a((byte)0);
  }
  
  public final void w() {
    if (this.k != null)
      for (byte b = 0; b < this.k.length; b++) {
        if (this.q.a.equals((this.k[b]).a)) {
          (this.k[b]).e = true;
          break;
        } 
      }  
    a((byte)1);
  }
  
  public final aq a(aw paramaw, int paramInt) {
    Object object;
    return (object = paramaw.i(paramInt) instanceof gc) ? (gc)object : null;
  }
  
  public final void b(aq paramaq, int paramInt) {
    Object object;
    if (object = this.u.i(paramInt) instanceof gc && this.r == 0)
      g(1113); 
  }
  
  public final void a(aq paramaq, int paramInt) {}
  
  public final void a(aq paramaq, int paramInt1, int paramInt2) {
    this.p = paramInt2;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\hr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */