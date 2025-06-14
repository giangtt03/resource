public final class la {
  private final int[] a;
  
  private final dq[] b;
  
  private int c;
  
  public la(int paramInt, dq[] paramArrayOfdq) {
    this.a = new int[paramInt];
    this.b = paramArrayOfdq;
    if (paramArrayOfdq != null) {
      paramInt = 0;
      for (byte b = 0; b < paramArrayOfdq.length; b++) {
        for (byte b1 = 0; b1 < (paramArrayOfdq[b]).b; b1++)
          this.a[paramInt++] = b; 
      } 
    } 
    if (this.a.length > 0)
      this.c = cv.a(this.a.length); 
  }
  
  public final dq a() {
    if (this.b == null)
      return null; 
    dq dq1 = this.b[this.a[this.c]];
    this.c++;
    if (this.c >= this.a.length)
      this.c = 0; 
    return dq1;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\la.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */