import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class c extends d {
  protected Image a;
  
  protected int[] b;
  
  protected int[] c;
  
  protected int[] d;
  
  protected int[] e;
  
  protected int[] f;
  
  protected int g;
  
  private int k = -1;
  
  private static String l = " 0123456789.,:!?()+-*/#$%abcdefghijklmnopqrstuvwxyzáàảãạăắằẳẵặâấầẩẫậéèẻẽẹêếềểễệíìỉĩịóòỏõọôốồổỗộơớờởỡợúùủũụưứừửữựýỳỷỹỵđABCDĐEFGHIJKLMNOPQRSTUVWXYZÁÀẢÃẠĂẮẰẲẴẶÂẤẦẨẪẬÉÈẺẼẸÊẾỀỂỄỆÍÌỈĨỊÓÒỎÕỌÔỐỒỔỖỘƠỚỜỞỠỢÚÙỦŨỤƯỨỪỬỮỰÝỲỶỸỴ\\\"@<=>;_&'`^~{}[]";
  
  private static byte[] m;
  
  protected int h;
  
  private boolean n = false;
  
  private boolean o = false;
  
  private boolean p;
  
  protected int i = 1;
  
  static {
    char c1 = Character.MIN_VALUE;
    byte b;
    for (b = 0; b < l.length(); b++) {
      if (c1 < l.charAt(b))
        c1 = l.charAt(b); 
    } 
    m = new byte[c1 + 1];
    for (b = 0; b < m.length; b++)
      m[b] = 0; 
    for (b = 0; b < l.length(); b++)
      m[l.charAt(b)] = (byte)b; 
  }
  
  public final void a(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    int i;
    int k = 0 + paramString.length();
    paramInt1 = paramGraphics.getClipY();
    int j = paramGraphics.getClipHeight();
    int m = paramGraphics.getClipX();
    int n = paramGraphics.getClipWidth();
    c c1;
    if (paramInt4 > paramInt1 + j || paramInt4 + (c1 = this).h < paramInt1)
      return; 
    int i1 = 0;
    if (paramInt5 == 0) {
      i = paramInt3;
      if (this.o)
        if (paramInt2 == paramString.length()) {
          i1 = a(paramString);
        } else {
          i1 = a(paramString.substring(0, k));
        }  
    } else {
      if (paramInt2 == paramString.length()) {
        i1 = a(paramString);
      } else {
        i1 = a(paramString.substring(0, k));
      } 
      if (paramInt5 == 2) {
        i = paramInt3 - i1;
      } else {
        i = paramInt3 - (i1 >> 1);
      } 
    } 
    if (this.k != -1) {
      paramGraphics.setColor(this.k);
      paramGraphics.fillRect(i, paramInt4, i1, this.h);
    } 
    paramInt2 = 0;
    while (paramInt2 < k) {
      try {
        paramInt1 = m[paramString.charAt(paramInt2)] & 0xFF;
      } catch (Throwable throwable) {
        paramInt1 = 0;
      } 
      if (this.n && this.f[paramInt1] <= this.h >> 1 && this.e[paramInt1] - (this.h >> 1) + this.f[paramInt1] > 1) {
        int i2 = this.e[paramInt1] >>> 1;
        int i3 = this.e[paramInt1] - i2;
        paramGraphics.drawRegion(this.a, this.b[paramInt1], this.c[paramInt1], this.d[paramInt1], i2, 0, i + 1, paramInt4 + this.f[paramInt1] - 1, 0);
        paramGraphics.drawRegion(this.a, this.b[paramInt1], this.c[paramInt1] + i2, this.d[paramInt1], i3, 0, i, paramInt4 + i2 + this.f[paramInt1] - 1, 0);
      } else {
        paramGraphics.drawRegion(this.a, this.b[paramInt1], this.c[paramInt1], this.d[paramInt1], this.e[paramInt1], 0, i, paramInt4 + this.f[paramInt1] - 1, 0);
        if (this.p)
          paramGraphics.drawRegion(this.a, this.b[paramInt1], this.c[paramInt1], this.d[paramInt1], this.e[paramInt1], 0, i + 1, paramInt4 + this.f[paramInt1] - 1, 0); 
      } 
      if ((i += this.d[paramInt1] + this.i) <= m + n) {
        paramInt2++;
        continue;
      } 
      break;
    } 
    if (this.o) {
      paramGraphics.setColor(this.j);
      if (paramInt5 == 2) {
        paramInt3 -= i1;
      } else if (paramInt5 == 1) {
        paramInt3 -= i1 / 2;
      } 
      paramGraphics.drawLine(paramInt3, paramInt4 + this.g + 1, paramInt3 + i1 - 1, paramInt4 + this.g + 1);
    } 
  }
  
  public final int a() {
    return this.h;
  }
  
  public final int a(String paramString) {
    if (paramString == null || paramString.length() == 0)
      return 0; 
    int i = 0;
    for (byte b = 0; b < paramString.length(); b++)
      i += a(paramString.charAt(b)); 
    return i;
  }
  
  public final int a(char paramChar) {
    try {
      int i = m[paramChar] & 0xFF;
    } catch (Exception exception) {
      paramChar = Character.MIN_VALUE;
    } 
    return this.d[paramChar] + this.i;
  }
  
  public final int b() {
    return this.g;
  }
  
  public final void a(boolean paramBoolean) {
    this.n = paramBoolean;
  }
  
  public final void c() {
    boolean bool = false;
    c c1;
    (c1 = this).n = bool;
    bool = false;
    (c1 = this).o = bool;
    c(false);
  }
  
  public final void b(boolean paramBoolean) {
    this.o = paramBoolean;
  }
  
  public void c(boolean paramBoolean) {
    this.p = paramBoolean;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\c.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */