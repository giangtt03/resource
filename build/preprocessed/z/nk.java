public abstract class nk extends at {
  protected nk g;
  
  protected int h;
  
  protected boolean i;
  
  protected int j;
  
  protected int k;
  
  protected int s;
  
  protected int t = 0;
  
  protected int u = -1;
  
  protected int v = 0;
  
  protected boolean w = false;
  
  protected boolean x = false;
  
  protected boolean y = false;
  
  protected iq z;
  
  protected lk A;
  
  protected lj B;
  
  protected z C;
  
  protected k D;
  
  protected int E;
  
  public nk(int paramInt) {
    this.h = paramInt;
    this.z = new iq((mp.a()).N, (mp.a()).O);
    this.A = new lk();
    this.B = new lj();
  }
  
  public abstract void a(boolean paramBoolean1, boolean paramBoolean2);
  
  public abstract void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5);
  
  public abstract void d();
  
  public abstract void e();
  
  public abstract void a(boolean paramBoolean);
  
  public abstract void a(int paramInt);
  
  public abstract int c();
  
  public final boolean f() {
    return !(this.E != 0 && this.E != 6);
  }
  
  public final k g() {
    return this.D;
  }
  
  public final void h() {
    int i = n() + p() / 2;
    int j = o() + q() + 11;
    if (this.h == 0) {
      i -= 5;
    } else {
      i += 5;
    } 
    this.z.a(i, j, i, j, 0);
  }
  
  public final void j() {
    int i = n() + p() / 2;
    int j = o() + q() + 11;
    if (this.h == 0) {
      i -= 5;
    } else {
      i += 5;
    } 
    this.A.d(i, j);
  }
  
  public final void k() {
    int i = n() + p() / 2;
    int j = o() + q() + 11;
    if (this.h == 0) {
      i -= 5;
    } else {
      i += 5;
    } 
    this.B.d(i, j);
  }
  
  public final void a(nk paramnk) {
    this.g = paramnk;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\nk.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */