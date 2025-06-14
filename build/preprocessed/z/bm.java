public final class bm implements bo {
  private a a = new a();
  
  private bp b;
  
  public final void a(Object[] paramArrayOfObject, int paramInt) {
    byte b = 0;
    int i = paramInt;
    int j = paramInt + paramArrayOfObject.length;
    while (i < j) {
      this.a.b(paramArrayOfObject[b++], i);
      i++;
    } 
    if (this.b != null)
      this.b.d(paramInt, paramArrayOfObject.length); 
  }
  
  public final void a(Object paramObject, int paramInt) {
    this.a.b(paramObject, paramInt);
    if (this.b != null)
      this.b.m(paramInt); 
  }
  
  public final void a(bp parambp) {
    this.b = parambp;
  }
  
  public final Object a(int paramInt) {
    return this.a.b(paramInt);
  }
  
  public final int a() {
    return this.a.d();
  }
  
  public final void a(Object paramObject) {
    b(this.a.c(paramObject));
  }
  
  public final void b(int paramInt) {
    this.a.a(paramInt);
    if (this.b != null)
      this.b.n(paramInt); 
  }
  
  public final void b(Object paramObject, int paramInt) {
    this.a.a(paramObject, paramInt);
    if (this.b != null)
      this.b.l(paramInt); 
  }
  
  public final void b() {
    this.a.a();
    if (this.b != null)
      this.b.n(-1); 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\bm.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */