import javax.microedition.lcdui.Graphics;

public final class lo extends n {
  public ee i;
  
  public int j;
  
  private int k;
  
  public lo(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    this.g = paramString;
    this.a = paramInt1;
    this.f = paramInt2;
    this.b = paramInt3;
    this.c = paramInt4;
    this.d = 16;
    this.e = 16;
    this.i = new ee();
    this.i.a(paramString.substring(2, paramString.length() - 1));
    if (this.i.f == 1) {
      this.j = -10;
    } else if (this.i.f == 3) {
      this.j = -8;
    } else if (this.i.f == 2) {
      this.j = -9;
    } else {
      this.j = -7;
    } 
    if (this.i.g == '0') {
      this.k = -24;
      return;
    } 
    if (this.i.g == '2') {
      this.k = -6;
      return;
    } 
    if (this.i.g == '1') {
      this.k = -5;
      return;
    } 
    this.k = 1000;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    pc.d(paramGraphics, this.j, paramInt1 + d(), paramInt2 + e(), 0);
    if (this.k <= 0)
      pc.d(paramGraphics, this.k, paramInt1 + d() + f(), paramInt2 + e() - 2, 24); 
  }
  
  public static String a(ee paramee) {
    short s;
    return ((s = paramee.f) == 1) ? "Xem Ảnh" : ((s == 3) ? "Nghe audio" : ((s == 2) ? "Xem video" : null));
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\lo.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */