import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class hd extends al implements bf, bn, bq {
  private dt[] k;
  
  private ay l = new ay(0);
  
  private aw m;
  
  private boolean[] n;
  
  private ih o;
  
  public final void a(ih paramih) {
    this.o = paramih;
  }
  
  public hd() {
    super(1);
    this.l.a(a(), c(), i(), j() - 20);
    this.m = new aw();
    this.m.a(this);
    this.m.a(this);
    this.m.e(true);
    this.l.b(this.m);
    hd hd2 = this;
    byte b2 = 0;
    dt dt1 = new dt("Đàm Đạo");
    ds[] arrayOfDs1 = a.m.A().z();
    byte b3 = 0;
    for (byte b4 = 0; b4 < arrayOfDs1.length; b4++) {
      if (arrayOfDs1[b4].a().length() >= 3)
        b3++; 
    } 
    ds[] arrayOfDs2 = new ds[b3];
    for (int j = arrayOfDs1.length - 1; j >= 0; j--) {
      if (arrayOfDs1[j].a().length() >= 3)
        arrayOfDs2[--b3] = arrayOfDs1[j]; 
    } 
    dt1.a(arrayOfDs2);
    if ((dt1 = (dt)((arrayOfDs2.length <= 0) ? null : dt1)) != null)
      b2 = 1; 
    dt[] arrayOfDt = a.m.B();
    b3 = 0;
    int i;
    for (i = 0; i < arrayOfDt.length; i++) {
      if (arrayOfDt[i].a() == 0)
        b3++; 
    } 
    hd2.k = new dt[b3 + b2];
    if (b2 > 0)
      hd2.k[0] = dt1; 
    for (i = arrayOfDt.length - 1; i >= 0; i--) {
      if (arrayOfDt[i].a() == 0)
        hd2.k[--b3 + b2] = arrayOfDt[i]; 
    } 
    this.n = new boolean[this.k.length];
    for (byte b1 = 0; b1 < this.n.length; b1++)
      this.n[b1] = true; 
    t();
    a(new ba());
    gb gb = new gb(-1, 2);
    hd hd1;
    (hd1 = this).a(gb, true);
    gb = new gb(-2, 3);
    (hd1 = this).b(gb, true);
    a(this);
  }
  
  public final void e(boolean paramBoolean) {
    super.e(paramBoolean);
    if (paramBoolean)
      this.l.c(true); 
  }
  
  public final void c(int paramInt) {
    this.l.f(paramInt);
  }
  
  public final void c(int paramInt1, int paramInt2) {
    this.l.e(paramInt1, paramInt2);
  }
  
  public final void a(int paramInt1, int paramInt2) {
    this.l.c(paramInt1, paramInt2);
  }
  
  public final void b(int paramInt1, int paramInt2) {
    this.l.f(paramInt1, paramInt2);
  }
  
  public final void c(Graphics paramGraphics) {
    boolean bool;
    if (bool = this.l.k()) {
      e(true);
      paramGraphics.setColor(v.am);
      paramGraphics.fillRect(a(), c(), i(), j() - 20);
      paramGraphics.drawImage(pc.d, a() + i(), c() + j() - ba.a, 40);
    } 
    this.l.a(paramGraphics, a(), c());
  }
  
  protected final void g() {
    this.l.n();
  }
  
  public final aq a(aw paramaw, int paramInt) {
    Object object;
    if (object = paramaw.i(paramInt) instanceof ds) {
      ds ds = (ds)object;
      return new eu(ds, this.m.e());
    } 
    for (byte b = 0; b < this.k.length; b++) {
      dt dt2 = this.k[b];
      paramInt--;
      if (this.n[b])
        paramInt -= (dt2.c()).length; 
      if (paramInt < 0) {
        paramInt = b;
        break;
      } 
    } 
    dt dt1 = (dt)object;
    return new ev(dt1, this.n[paramInt], this.m.e());
  }
  
  public final void b(aq paramaq, int paramInt) {
    Object object;
    if (object = this.m.i(paramInt) instanceof ds) {
      d(0, -1);
      return;
    } 
    for (int i = 0; i < this.k.length; i++) {
      if (object.equals(this.k[i]) && i <= this.n.length) {
        this.n[i] = !this.n[i];
        t();
        this.m.k(paramInt);
        paramInt = (((hd)(object = this)).l.r()).b;
        if ((i = ((hd)object).m.s()) * 22 - paramInt >= ((hd)object).m.f() - 40 - 22)
          paramInt = i * 22 - ((hd)object).m.f() - 40 - 22; 
        ((hd)object).l.k(paramInt);
        return;
      } 
    } 
  }
  
  private void t() {
    int i = 0;
    for (byte b1 = 0; b1 < this.k.length; b1++) {
      dt dt1;
      ds[] arrayOfDs = (dt1 = this.k[b1]).c();
      i++;
      if (this.n[b1])
        i += arrayOfDs.length; 
    } 
    Object[] arrayOfObject = new Object[i];
    i = 0;
    for (byte b2 = 0; b2 < this.k.length; b2++) {
      dt dt1 = this.k[b2];
      arrayOfObject[i++] = dt1;
      if (this.n[b2]) {
        ds[] arrayOfDs = dt1.c();
        for (byte b = 0; b < arrayOfDs.length; b++)
          arrayOfObject[i++] = arrayOfDs[b]; 
      } 
    } 
    synchronized (this.m) {
      this.m.q();
      this.m.a(arrayOfObject);
      return;
    } 
  }
  
  public final void a(aq paramaq, int paramInt) {}
  
  public final void a(aq paramaq, int paramInt1, int paramInt2) {
    Object object;
    if (object = this.m.i(paramInt2) instanceof ds) {
      gb gb = new gb(-1, 2);
      (object = this).a(gb, true);
      return;
    } 
    n();
  }
  
  public final void d(int paramInt1, int paramInt2) {
    ag.b().a(false);
    if (paramInt2 == -1 && this.o != null) {
      ds ds = (ds)this.m.t();
      this.o.u(ds.a());
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\hd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */