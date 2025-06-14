public final class ns {
  public final String a;
  
  public final String b;
  
  public final String c;
  
  public final long d;
  
  public boolean e;
  
  public nt[] f;
  
  public String[] g;
  
  public ns(String paramString1, String paramString2, String paramString3, long paramLong) {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
    this.d = paramLong;
    this.g = new String[0];
    this.f = new nt[0];
  }
  
  public final String toString() {
    String str = "QUEST: id=" + this.a + "-" + this.b + "-" + this.c;
    if (this.f != null && this.f.length > 0)
      for (byte b = 0; b < this.f.length; b++) {
        if (this.f[b] != null)
          str = String.valueOf(str) + "\n  " + this.f[b].toString(); 
      }  
    return str;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ns.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */