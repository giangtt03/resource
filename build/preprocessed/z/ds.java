public final class ds {
  private String a;
  
  private String b;
  
  private String c;
  
  private String d;
  
  private short e;
  
  private short f;
  
  private short g;
  
  public ds() {
    this(null);
  }
  
  public ds(String paramString) {
    this.a = paramString;
  }
  
  public final String a() {
    return this.a;
  }
  
  public final void a(String paramString) {
    this.a = paramString;
  }
  
  public final String b() {
    return this.b;
  }
  
  public final void b(String paramString) {
    this.b = paramString;
  }
  
  public final short c() {
    return this.e;
  }
  
  public final void a(short paramShort) {
    this.e = paramShort;
  }
  
  public final short d() {
    return this.f;
  }
  
  public final void b(short paramShort) {
    this.f = paramShort;
  }
  
  public final short e() {
    return this.g;
  }
  
  public final void c(short paramShort) {
    this.g = paramShort;
  }
  
  public final String f() {
    return this.c;
  }
  
  public final void c(String paramString) {
    this.c = paramString;
  }
  
  public final String g() {
    return this.d;
  }
  
  public final void d(String paramString) {
    this.d = paramString;
  }
  
  public static String e(String paramString) {
    if (paramString == null)
      return null; 
    for (paramString = (paramString = paramString.toLowerCase().trim()).replace(' ', '_'); paramString.charAt(0) == '@'; paramString = paramString.substring(1));
    return paramString;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ds.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */