public final class dt {
  private String a;
  
  private short b;
  
  private ds[] c;
  
  public dt(String paramString) {
    this.a = paramString;
  }
  
  public final short a() {
    return this.b;
  }
  
  public final void a(short paramShort) {
    this.b = paramShort;
  }
  
  public final String b() {
    return this.a;
  }
  
  public final ds[] c() {
    return this.c;
  }
  
  public final void a(ds[] paramArrayOfds) {
    this.c = paramArrayOfds;
    d();
  }
  
  public final void d() {
    if (this.c == null)
      return; 
    for (byte b = 0; b < this.c.length; b++) {
      if (this.c[b].e() != 2) {
        boolean bool = false;
        for (int i = this.c.length - 1; i > b; i--) {
          if (this.c[i].e() == 2) {
            bool = true;
            ds ds1 = this.c[b];
            this.c[b] = this.c[i];
            this.c[i] = ds1;
          } 
        } 
        if (!bool)
          return; 
      } 
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\dt.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */