public final class ek implements b {
  private int a = 1;
  
  public ek() {
    this(true);
  }
  
  public ek(boolean paramBoolean) {}
  
  public final int a(Object paramObject1, Object paramObject2) {
    paramObject1 = paramObject1;
    paramObject2 = paramObject2;
    long l = paramObject1.d() - paramObject2.d();
    byte b1 = 0;
    if (l < 0L) {
      b1 = -1;
    } else if (l > 0L) {
      b1 = 1;
    } 
    return this.a * b1;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ek.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */