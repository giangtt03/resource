import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ca extends d {
  private Image a;
  
  private int[] b;
  
  private int[] c;
  
  private int[] d;
  
  private int[] e;
  
  private int[] f;
  
  private String g = " 0123456789.,:!?()+-*/#$%abcdefghijklmnopqrstuvwxyzáàảãạăắằẳẵặâấầẩẫậéèẻẽẹêếềểễệíìỉĩịóòỏõọôốồổỗộơớờởỡợúùủũụưứừửữựýỳỷỹỵđABCDĐEFGHIJKLMNOPQRSTUVWXYZÁÀẢÃẠĂẮẰẲẴẶÂẤẦẨẪẬÉÈẺẼẸÊẾỀỂỄỆÍÌỈĨỊÓÒỎÕỌÔỐỒỔỖỘƠỚỜỞỠỢÚÙỦŨỤƯỨỪỬỮỰÝỲỶỸỴ\\\"@<=>;_&'`^~{}";
  
  private String h = "";
  
  private int i;
  
  public ca() {
    this(f.a("/_fontcap"));
  }
  
  public ca(Image paramImage) {
    this.a = paramImage;
    ca ca1;
    (ca1 = this).g = " 0123456789.,:!?()+-*/#$%\"@<=>;_&abcdđefghijklmnopqrstuvwxyzáàảãạăắằẳẵặâấầẩẫậéèẻẽẹêếềểễệíìỉĩịóòỏõọôốồổỗộơớờởỡợúùủũụưứừửữựýỳỷỹỵ";
    ca1.h = " 0123456789.,:!?()+-*/#$%\"@<=>;_&ABCDĐEFGHIJKLMNOPQRSTUVWXYZÁÀẢÃẠĂẮẰẲẴẶÂẤẦẨẪẬÉÈẺẼẸÊẾỀỂỄỆÍÌỈĨỊÓÒỎÕỌÔỐỒỔỖỘƠỚỜỞỠỢÚÙỦŨỤƯỨỪỬỮỰÝỲỶỸỴ";
    ca1.b = new int[] { 
        0, 2, 10, 16, 24, 32, 40, 48, 56, 64, 
        72, 80, 84, 88, 92, 80, 6, 12, 87, 19, 
        26, 32, 41, 49, 62, 67, 92, 78, 12, 96, 
        86, 32, 49, 58, 66, 74, 83, 41, 92, 20, 
        8, 14, 29, 48, 55, 65, 37, 73, 81, 90, 
        20, 7, 28, 46, 57, 65, 36, 90, 15, 73, 
        24, 43, 52, 61, 33, 82, 91, 9, 70, 18, 
        42, 51, 60, 28, 35, 79, 9, 67, 86, 93, 
        16, 42, 60, 23, 29, 35, 49, 74, 83, 9, 
        49, 58, 18, 27, 36, 67, 76, 85, 46, 11, 
        22, 33, 92, 57, 85, 65, 73, 44, 33, 54, 
        10, 20, 81, 89, 64, 72 };
    ca1.c = new int[] { 
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
        0, 0, 0, 0, 0, 6, 9, 9, 9, 7, 
        9, 9, 9, 9, 9, 9, 9, 9, 15, 16, 
        17, 18, 18, 18, 19, 20, 20, 20, 20, 21, 
        21, 24, 24, 27, 27, 27, 28, 29, 29, 29, 
        29, 30, 30, 33, 36, 36, 36, 37, 38, 38, 
        39, 40, 42, 45, 45, 45, 46, 47, 50, 50, 
        51, 52, 54, 56, 57, 57, 58, 59, 59, 62, 
        63, 64, 64, 64, 66, 68, 69, 70, 71, 71, 
        71, 71, 74, 76, 78, 80, 82, 82, 83, 83, 
        83, 86, 88, 88, 92, 93, 95, 95, 95, 76, 
        94, 97, 98, 102, 104, 105, 106, 106, 107, 107, 
        109, 109, 110, 113, 114 };
    ca1.d = new int[] { 
        2, 8, 6, 8, 8, 8, 8, 8, 8, 8, 
        8, 4, 4, 4, 4, 7, 6, 6, 7, 5, 
        7, 6, 9, 8, 13, 5, 11, 8, 8, 8, 
        4, 8, 9, 9, 8, 8, 9, 9, 7, 7, 
        8, 9, 6, 6, 8, 7, 10, 8, 9, 8, 
        9, 8, 7, 8, 8, 8, 11, 8, 8, 7, 
        9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 
        9, 9, 9, 9, 10, 9, 9, 7, 7, 7, 
        7, 7, 7, 7, 7, 9, 7, 7, 6, 6, 
        6, 6, 6, 9, 9, 9, 9, 9, 9, 9, 
        9, 10, 9, 9, 11, 11, 11, 11, 11, 11, 
        8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 
        10, 8, 8, 8, 8, 8 };
    ca1.e = new int[] { 
        1, 9, 9, 9, 9, 9, 9, 9, 9, 9, 
        9, 4, 6, 7, 9, 9, 12, 12, 7, 3, 
        7, 12, 9, 11, 9, 5, 10, 8, 5, 8, 
        9, 3, 9, 9, 9, 9, 9, 9, 9, 9, 
        9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 
        11, 9, 9, 9, 9, 9, 9, 9, 9, 9, 
        12, 12, 12, 12, 11, 12, 12, 12, 12, 12, 
        14, 12, 12, 12, 12, 12, 14, 12, 12, 12, 
        12, 11, 12, 12, 12, 12, 12, 14, 12, 12, 
        12, 12, 11, 12, 12, 12, 12, 11, 12, 12, 
        12, 12, 12, 14, 9, 12, 12, 12, 12, 11, 
        12, 12, 12, 12, 11, 10, 12, 12, 12, 12, 
        12, 12, 12, 12, 12, 11 };
    ca1.f = new int[] { 
        11, 3, 3, 3, 3, 3, 3, 3, 3, 3, 
        3, 8, 8, 5, 3, 3, 2, 2, 4, 6, 
        2, 2, 3, 2, 3, 2, 3, 4, 5, 4, 
        5, 11, 3, 3, 3, 3, 3, 3, 3, 3, 
        3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 
        3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 
        3, 3, 3, 3, 3, 3, 3, 2, 2, 3 };
    ca1.i = 14;
  }
  
  public final void a(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    int i = paramInt2 + 0;
    if (paramInt5 == 0) {
      paramInt2 = paramInt3;
    } else {
      int j;
      if (paramInt2 == paramString.length()) {
        j = a(paramString);
      } else {
        j = a(paramString.substring(0, i));
      } 
      if (paramInt5 == 2) {
        paramInt2 = paramInt3 - j;
      } else {
        paramInt2 = paramInt3 - (j >> 1);
      } 
    } 
    for (byte b = 0; b < i; b++) {
      if ((paramInt1 = this.g.indexOf(paramString.charAt(b))) == -1)
        paramInt1 = this.h.indexOf(paramString.charAt(b)); 
      if (paramInt1 == -1)
        paramInt1 = 0; 
      if (paramInt1 >= 0)
        cw.a(paramGraphics, this.a, this.b[paramInt1], this.c[paramInt1], this.d[paramInt1], this.e[paramInt1], paramInt2, paramInt4 - 1 + this.f[paramInt1], 20); 
      paramInt2 += this.d[paramInt1] + 1;
    } 
  }
  
  public final int a() {
    return this.i;
  }
  
  public final int a(String paramString) {
    int i = 0;
    for (byte b = 0; b < paramString.length(); b++)
      i = i + 1 + a(paramString.charAt(b)); 
    return i;
  }
  
  public final int a(char paramChar) {
    int i;
    if ((i = this.g.indexOf(paramChar)) == -1)
      i = this.h.indexOf(paramChar); 
    return (i >= 0) ? this.d[i] : this.d[0];
  }
  
  public final int b() {
    return 0;
  }
  
  public final void c(boolean paramBoolean) {}
  
  public final void a(boolean paramBoolean) {}
  
  public final void c() {}
  
  public final void b(boolean paramBoolean) {}
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ca.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */