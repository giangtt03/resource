public final class dj {
  ls a;
  
  private int b;
  
  public final ls a() {
    return this.a;
  }
  
  public final int b() {
    return this.b;
  }
  
  public dj(String paramString, int paramInt1, int paramInt2) {
    this.b = paramInt1 - 1;
    if (!oy.g)
      this.b = -1; 
    paramInt1 = 0;
    if (this.b >= 0 && this.b < 20) {
      paramInt1 = oy.c[this.b] + 2;
    } else {
      this.b = -1;
    } 
    if (paramString.equals("") || paramString.equals(""))
      paramString = " "; 
    this.a = new ls(bx.d, paramString, paramInt1, 0, paramInt2 - paramInt1, bx.d.a(), 2);
  }
  
  public final int c() {
    int i = this.a.c();
    if (this.b >= 0 && i < oy.d[this.b])
      i = oy.d[this.b]; 
    return i;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\dj.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */