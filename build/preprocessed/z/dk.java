public final class dk {
  public boolean a = false;
  
  private If1 d;
  
  public lq[] b;
  
  public int c;
  
  public dk(If1 paramlf) {
    this.d = paramlf;
  }
  
  public final void a(lq[] paramArrayOflq) {
    if (paramArrayOflq == null || paramArrayOflq.length <= 0)
      return; 
    if (this.b == null) {
      this.b = paramArrayOflq;
      return;
    } 
    int i;
    lq[] arrayOfLq = new lq[i = paramArrayOflq.length + this.b.length];
    System.arraycopy(this.b, 0, arrayOfLq, 0, this.b.length);
    System.arraycopy(paramArrayOflq, 0, arrayOfLq, this.b.length, paramArrayOflq.length);
    this.b = arrayOfLq;
  }
  
  public final lq[] a(String paramString) {
    a a = new a();
    for (byte b2 = 0; b2 < this.b.length; b2++) {
      if (!(this.b[b2]).b.equals(paramString)) {
        a.a(this.b[b2]);
      } else {
        this.d.c--;
      } 
    } 
    lq[] arrayOfLq = new lq[a.d()];
    for (byte b1 = 0; b1 < a.d(); b1++) {
      lq lq1 = (lq)a.b(b1);
      arrayOfLq[b1] = lq1;
    } 
    this.b = arrayOfLq;
    return arrayOfLq;
  }
  
  public final String a() {
    return (String)((this.d.c < 0) ? "" : ((this.b == null || this.b.length == 0) ? this.d.c : (String.valueOf(this.c) + "/" + this.d.c)));
  }
  
  public final int b() {
    return this.d.a;
  }
  
  public final String c() {
    return this.d.b;
  }
  
  public final void a(int paramInt) {
    this.d.c = paramInt;
  }
  
  public final int d() {
    return this.d.c;
  }
  
  public final boolean e() {
    return !(this.b != null && this.b.length != 0);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\dk.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */