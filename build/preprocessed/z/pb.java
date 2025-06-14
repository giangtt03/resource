final class pb implements ko {
  private int b;
  
  private int c;
  
  byte[] a;
  
  private pa d;
  
  pb(pa parampa) {
    this.d = parampa;
  }
  
  public final void a(int paramInt1, int paramInt2, byte[] paramArrayOfbyte) {
    System.arraycopy(paramArrayOfbyte, 0, this.a, this.c, paramArrayOfbyte.length);
    this.c += paramArrayOfbyte.length;
    paramInt2++;
    nx.f(paramArrayOfbyte.length);
    if (paramInt2 < this.b) {
      ks.a().a(paramInt1, paramInt2);
      return;
    } 
    pa.a(this.d);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3) {
    this.a = new byte[paramInt2];
    this.b = paramInt3;
    this.c = 0;
    ks.a().a(paramInt1, 0);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\pb.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */