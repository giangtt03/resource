import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class p extends n {
  public static final String[] i = new String[] { 
      ":-)", ":-P", ">:D<", ":))", ":\">", "B-)", ":-X", ":-*", ":-|", ":-D", 
      ";-)", "I-)", "(:|", ":-/", ":-<", ":-&", ":-(", ":-B", ":-O", ":-h", 
      ":-S", ":-?", ":((", "=((", "=;", ":-W", "X-(", ">:)", "<3", "(y)", 
      "(n)", "@;-", "(*)" };
  
  public static final int[] j = new int[] { 
      0, 20, 40, 81, 101, 121, 143, 166, 186, 206, 
      226, 247, 272, 292, 319, 339, 362, 382, 409, 431, 
      453, 473, 497, 526, 557, 581, 606, 628, 650, 670, 
      692, 714, 736 };
  
  public static final int[] k = new int[33];
  
  public static final int[] l = new int[] { 
      20, 20, 41, 20, 20, 22, 23, 20, 20, 20, 
      21, 25, 20, 27, 20, 23, 20, 27, 22, 22, 
      20, 24, 29, 31, 24, 25, 22, 22, 20, 22, 
      22, 22, 19 };
  
  public static final int[] m = new int[] { 
      20, 20, 20, 21, 20, 20, 20, 20, 20, 22, 
      21, 21, 21, 20, 20, 20, 20, 20, 20, 20, 
      20, 22, 20, 22, 20, 20, 21, 22, 20, 22, 
      22, 20, 20 };
  
  public static final int[] n = new int[] { 
      2, 2, 2, 1, 2, 2, 2, 2, 2, 1, 
      1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 
      1, 2, 1, 2, 2, 1, 1, 2, 2, 1 };
  
  public static final int[] o = new int[] { 
      0, 0, 0, -1, 1, -1, -1, 1, 3, -2, 
      2, -2, 2, 3, 1, 1, -1, 1, 1, -1 };
  
  private int q;
  
  public static Image p;
  
  public static void h() {
    if (p == null)
      p = f.d("/smileys"); 
  }
  
  public static void i() {
    p = null;
  }
  
  public p(int paramInt1, String paramString, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    this.g = paramString;
    this.q = paramInt1;
    this.a = paramInt2;
    this.f = paramInt3;
    this.b = paramInt4;
    this.c = paramInt5;
    this.d = paramInt6;
    h();
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (p != null) {
      int i = paramInt2 + this.c + (this.e - m[this.q]) / 2;
      paramInt2 = paramInt1 + this.b;
      paramInt1 = this.q;
      paramGraphics = paramGraphics;
      if (p != null)
        paramGraphics.drawRegion(p, j[paramInt1], k[paramInt1], l[paramInt1], m[paramInt1], 0, paramInt2, i, 0); 
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\p.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */