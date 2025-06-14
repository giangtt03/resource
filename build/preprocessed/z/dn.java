public final class dn {
  public String a;
  
  public int b;
  
  public ls c;
  
  public int d = -1;
  
  public dn(String paramString1, String paramString2, int paramInt) {
    this(paramString1, 1, paramInt);
    this.a = paramString2;
  }
  
  public dn(String paramString, int paramInt1, int paramInt2) {
    this.b = paramInt1;
    if (paramInt1 == 0) {
      bx.d.c(true);
      this.c = new ls(paramString, 0, 0, paramInt2, bx.c.a() + 4, 1);
      bx.d.c();
      return;
    } 
    this.c = new ls(paramString, 0, 0, paramInt2, bx.d.a() + 4, 1);
    if (paramInt1 == 2) {
      String str;
      if (!i.b(str = this.c.g()) && this.c.i().trim().equals(str)) {
        paramString = "Bấm vào để xem... " + paramString;
        this.c = new ls(paramString, 0, 0, paramInt2, bx.d.a() + 4, 1);
      } 
      this.d = this.c.j();
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\dn.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */