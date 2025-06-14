import javax.microedition.lcdui.Graphics;

public final class nm extends z {
  private at h;
  
  public final void a(at paramat) {
    this.h = paramat;
  }
  
  public final void a(String paramString, int paramInt1, int paramInt2) {
    this.d = paramString;
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = false;
    this.e = 0;
  }
  
  public final void b() {
    if (this.c || this.d == null)
      return; 
    this.e++;
    if (this.e >= 30) {
      this.c = true;
      this.d = null;
    } 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (this.d == null || this.c)
      return; 
    int i = this.a;
    int j = this.b;
    if (this.h != null) {
      i = this.h.n() + this.h.p() / 2;
      j = this.h.o();
    } 
    if (this.g != null)
      this.g.a(paramGraphics, this.d, i + paramInt1, j + paramInt2 - this.e, 1); 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\nm.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */