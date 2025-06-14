public final class eb {
  private String a;
  
  private String b;
  
  private String c;
  
  private String d;
  
  private String e;
  
  private String f;
  
  private String g;
  
  private ec[] h;
  
  public eb(String paramString) {
    this.a = paramString;
  }
  
  public final String a() {
    return this.a;
  }
  
  public final String b() {
    return this.b;
  }
  
  public final void a(String paramString) {
    this.b = paramString;
  }
  
  public final String c() {
    return this.c;
  }
  
  public final void b(String paramString) {
    this.c = paramString;
  }
  
  public final String d() {
    return this.d;
  }
  
  public final void c(String paramString) {
    this.d = paramString;
  }
  
  public final void d(String paramString) {
    this.e = paramString;
  }
  
  public final String toString() {
    String str = "[Action] " + this.a + ((this.f != null) ? (" [Label] " + this.f) : "") + ((this.b != null) ? (" [URL] " + this.b) : "") + ((this.c != null) ? (" [Phone No] " + this.c) : "") + ((this.d != null) ? (" [SMSC] " + this.d) : "") + ((this.e != null) ? (" [PRICE] " + this.e) : "");
    if (this.h != null)
      for (byte b = 0; b < this.h.length; b++)
        str = String.valueOf(str) + " " + this.h[b].toString();  
    return str;
  }
  
  public final String e() {
    return this.f;
  }
  
  public final void e(String paramString) {
    this.f = paramString;
  }
  
  public final ec[] f() {
    return this.h;
  }
  
  public final void a(ec[] paramArrayOfec) {
    this.h = paramArrayOfec;
  }
  
  public final String g() {
    return this.g;
  }
  
  public final void f(String paramString) {
    this.g = paramString;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\eb.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */