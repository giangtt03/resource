public final class di {
  private ds c;
  
  private a d;
  
  private int e;
  
  private boolean f;
  
  public boolean a = false;
  
  public dq b = null;
  
  public final boolean a() {
    return this.f;
  }
  
  public final void a(boolean paramBoolean) {
    this.f = paramBoolean;
  }
  
  public di(ds paramds, int paramInt, boolean paramBoolean, dq paramdq) {
    ds ds1 = paramds;
    di di1;
    (di1 = this).c = ds1;
    boolean bool = paramBoolean;
    (di1 = this).f = bool;
    this.e = paramInt;
    this.d = new a(30);
    this.b = paramdq;
    if (paramdq != null)
      a(paramdq.a, 0, 2); 
  }
  
  public final void a(ds paramds) {
    this.c = paramds;
  }
  
  public final boolean a(String paramString, int paramInt) {
    return a(paramString, paramInt, 0);
  }
  
  public final boolean b(String paramString, int paramInt) {
    return a(paramString, paramInt, 1);
  }
  
  private boolean a(String paramString, int paramInt1, int paramInt2) {
    boolean bool = false;
    if (this.d.d() >= 30) {
      this.d.a(0);
      bool = true;
    } 
    dm dm = null;
    if (this.d.d() > 0)
      dm = a(this.d.d() - 1); 
    if (dm != null && dm.a == paramInt2) {
      dm.a(paramString, paramInt1, this.e);
      return bool;
    } 
    this.d.a(new dm(paramString, paramInt1, this.e, paramInt2));
    return bool;
  }
  
  public final ds b() {
    return this.c;
  }
  
  public final a c() {
    return this.d;
  }
  
  public final int d() {
    return this.d.d();
  }
  
  public final dm a(int paramInt) {
    return (dm)this.d.b(paramInt);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\di.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */