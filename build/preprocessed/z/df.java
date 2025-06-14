public final class df {
  public int a;
  
  public String b;
  
  public int c;
  
  public dg d;
  
  public dg e;
  
  public dg[] f;
  
  public df(int paramInt) {
    this.a = paramInt;
  }
  
  public final String toString() {
    return this.b;
  }
  
  public final df a() {
    df df1;
    (df1 = new df(this.a)).b = this.b;
    df1.c = this.c;
    df1.d = this.d.a();
    df1.e = this.e.a();
    df1.f = new dg[this.f.length];
    for (byte b = 0; b < this.f.length; b++)
      df1.f[b] = this.f[b].a(); 
    return df1;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\df.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */