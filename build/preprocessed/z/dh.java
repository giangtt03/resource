public final class dh {
  public final int a;
  
  public final String b;
  
  public String c;
  
  public final String d;
  
  public dh(int paramInt, String paramString1, String paramString2, String paramString3) {
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
  }
  
  public final String toString() {
    String str = "RankInfo[";
    str = String.valueOf(str) + "idx=" + this.a;
    str = String.valueOf(str) + ",rank=" + this.b;
    str = String.valueOf(str) + ",name=" + this.c;
    str = String.valueOf(str) + ",detail=" + this.d;
    return str = String.valueOf(str) + "]";
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\dh.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */