public final class kr {
  private final Object[] a = new Object[16];
  
  private int b = 0;
  
  private int c = 0;
  
  private int d = 0;
  
  public kr(int paramInt) {}
  
  public final boolean a() {
    return (this.d == 0);
  }
  
  public final void a(Object paramObject) {
    if (this.d >= this.a.length)
      throw new ArrayIndexOutOfBoundsException("Queue reach maximum size"); 
    if (paramObject == null)
      throw new NullPointerException("Value can not be NULL"); 
    this.a[this.c] = paramObject;
    this.c = (this.c + 1) % this.a.length;
    this.d++;
  }
  
  public final Object b() {
    if (this.d == 0)
      return null; 
    Object object = this.a[this.b];
    this.a[this.b] = null;
    this.b = (this.b + 1) % this.a.length;
    this.d--;
    return object;
  }
  
  public final void c() {
    this.d = 0;
    this.b = 0;
    this.c = 0;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\kr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */