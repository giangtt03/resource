public final class dq {
  private String d;
  
  public final String a;
  
  private short e;
  
  public final short b;
  
  public final eb[] c;
  
  public dq(String paramString1, String paramString2, short paramShort1, short paramShort2, eb[] paramArrayOfeb) {
    this.d = paramString1;
    this.a = paramString2;
    this.e = paramShort1;
    this.b = paramShort2;
    this.c = paramArrayOfeb;
  }
  
  public final String toString() {
    String str = "[Type] " + ((this.e == 3) ? "Inline" : "Popup") + " [Spot] " + String.valueOf(this.b) + ((this.d != null) ? (" [Title] " + this.d) : (" [Description] " + this.a));
    if (this.c != null)
      for (byte b = 0; b < this.c.length; b++) {
        if (this.c[b] != null)
          str = String.valueOf(str) + " [Inline " + b + "] " + this.c[b].toString(); 
      }  
    return str;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\dq.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */