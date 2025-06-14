import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class gy extends ht {
  public da k;
  
  private ay p;
  
  private az q;
  
  private az r;
  
  private az s;
  
  private boolean t;
  
  private Image u;
  
  public gy() {
    b(241201);
    a(new ba());
    a(this);
    try {
      this.f = 240;
      this.g = 320 - ba.a;
      if ((a.k == 1)) {
        this.f = v.t;
        this.g = 240 - ba.a;
      } 
      this.c = (v.t >= this.f) ? ((v.t - this.f) / 2) : 0;
      this.d = (v.u >= this.g) ? ((v.u - ba.a - this.g) / 2) : 0;
      a(this.c, this.d, this.f, this.g);
      k k = new k(0, 0, this.f, this.g);
      this.k = new da();
      this.k.a(k);
      this.s = new gb(3, 3);
      this.r = new gb(2, 2);
      this.q = new gb(1, 0);
      az az1 = this.s;
      gy gy1;
      (gy1 = this).b(az1, true);
      az1 = this.q;
      (gy1 = this).a(az1, true);
      (gy1 = this).p = new ay(2);
      gy1.p.a(0, 0, v.t, v.u - ba.a);
      gy1.p.h(1);
      gy1.k.a(go.k);
      gy1.k.q();
      gy1.k.a(gy1.k.j.a, gy1.k.j.b, gy1.k.j.c, gy1.k.j.d);
      if (v.u > gy1.k.j.d) {
        gy1.g = gy1.k.j.d;
        gy1.d = v.u - ba.a - gy1.g >> 1;
      } 
      gy1.p.b(gy1.k);
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } 
  }
  
  public final void t() {
    this.u = f.d("/createcs/bk");
    this.k.i = false;
    this.t = true;
    az az1 = null;
    gy gy1;
    (gy1 = this).a(az1, true);
    az1 = null;
    (gy1 = this).b(az1, true);
    a(new bd("Bắt đầu", 4));
  }
  
  public final void a(Graphics paramGraphics) {
    if (this.t) {
      if (this.u != null) {
        if (v.u > this.u.getHeight()) {
          paramGraphics.setColor(555256);
          paramGraphics.fillRect(0, 0, v.t, v.u - this.u.getHeight());
        } 
        for (int i = 0; i < v.t; i += this.u.getWidth())
          paramGraphics.drawImage(this.u, i, v.u, 36); 
        return;
      } 
      paramGraphics.setColor(0);
      paramGraphics.fillRect(0, 0, v.t, v.u);
    } 
  }
  
  public final void b(Graphics paramGraphics) {
    if (this.p != null) {
      this.p.a(paramGraphics, this.c, this.d);
      this.p.c(true);
    } 
  }
  
  public final void u() {
    this.p.n();
  }
  
  public final void e(int paramInt) {
    gy gy1;
    az az1;
    switch (paramInt) {
      case 1:
        if (!(gy1 = this).t) {
          br[] arrayOfBr;
          if (gy1.k.a()) {
            arrayOfBr = new br[] { new br("Cập nhật", 21), new br("Tuyệt Chiêu", 20), new br("Rương Đồ", 22), new br("Đóng", 24) };
          } else {
            arrayOfBr = new br[] { new br("Tuyệt Chiêu", 20), new br("Rương Đồ", 22), new br("Đóng", 24) };
          } 
          gy1.a(arrayOfBr, gy1.r, (az)null, gy1.s);
        } 
        az1 = this.r;
        (gy1 = this).a(az1, true);
        if (!this.t) {
          az1 = this.s;
          (gy1 = this).b(az1, true);
          return;
        } 
        break;
      case 2:
        this.m.f(95);
        az1 = this.q;
        (gy1 = this).a(az1, true);
        return;
      case 3:
        if (this.m == null) {
          this.k.a(this, "Có", 5, "Không", 6);
          ag.b().a(h(), false);
          return;
        } 
        A();
        return;
      case 4:
        a.s().a(null, null, 2000);
        ks.a().c(go.e);
        return;
      case 6:
        ag.b().e(241226);
        A();
        return;
      case 5:
        ag.b().e(241226);
        this.k.r();
        A();
        a.s().a(null, null);
        break;
    } 
  }
  
  public final void f(int paramInt) {
    this.p.f(paramInt);
    switch (paramInt) {
      case 98:
        this.p.j(30);
        return;
      case 99:
        this.p.j(-30);
        return;
      case 97:
        this.p.i(-30);
        return;
      case 96:
        this.p.i(30);
        break;
    } 
  }
  
  public final void e(int paramInt1, int paramInt2) {
    this.p.e(paramInt1, paramInt2);
  }
  
  public final void f(int paramInt1, int paramInt2) {
    paramInt1 -= this.c;
    paramInt2 -= this.d;
    this.p.c(paramInt1, paramInt2);
  }
  
  public final void g(int paramInt1, int paramInt2) {
    paramInt1 -= this.c;
    paramInt2 -= this.d;
    this.p.c(paramInt1, paramInt2);
  }
  
  public final boolean g(int paramInt) {
    ib ib;
    hh hh;
    switch (paramInt) {
      case 20:
        ib = new ib();
        ag.b().a(ib);
        ag.b().a(h(), false);
        this.k.a(this, "Có", 5, "Không", 6);
        return true;
      case 21:
        this.k.r();
        a.s().a(null, null);
        return true;
      case 22:
        if (a.s().c(241202))
          a.s().e(241202); 
        hh = new hh(null, null);
        ag.b().a(hh);
        ag.b().a(h(), false);
        this.k.a(this, "Có", 5, "Không", 6);
        return true;
      case 24:
        this.k.a(this, "Có", 5, "Không", 6);
        ag.b().a(h(), false);
        return true;
    } 
    return false;
  }
  
  public static void a(String paramString1, String paramString2, int paramInt) {
    if (go.e.equals(paramString1)) {
      if (paramString2.equals("M99")) {
        ag.b().f(4);
        return;
      } 
      go.x = paramInt;
      go.w = paramString2;
      ag.b().a(5, new Object[] { paramString2 });
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\gy.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */