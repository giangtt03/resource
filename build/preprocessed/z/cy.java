final class cy {
  int[] a = new int[4];
  
  long b = 0L;
  
  byte[] c = new byte[64];
  
  public cy() {
    this.a[0] = 1732584193;
    this.a[1] = -271733879;
    this.a[2] = -1732584194;
    this.a[3] = 271733878;
  }
  
  public cy(cy paramcy) {
    this();
    byte b;
    for (b = 0; b < this.c.length; b++)
      this.c[b] = paramcy.c[b]; 
    for (b = 0; b < this.a.length; b++)
      this.a[b] = paramcy.a[b]; 
    this.b = paramcy.b;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\cy.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */