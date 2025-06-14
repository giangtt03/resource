import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

public final class bz extends d {
  private Font a = Font.getDefaultFont();
  
  public final int a() {
    return this.a.getHeight();
  }
  
  public final int a(String paramString) {
    return this.a.stringWidth(paramString);
  }
  
  public final void a(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3) {
    paramGraphics.setColor(this.j);
    if (paramInt3 == 0) {
      paramGraphics.drawString(paramString, paramInt1, paramInt2, 0);
      return;
    } 
    if (paramInt3 == 2) {
      paramGraphics.drawString(paramString, paramInt1, paramInt2, 24);
      return;
    } 
    if (paramInt3 == 1)
      paramGraphics.drawString(paramString, paramInt1, paramInt2, 17); 
  }
  
  public final void a(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (paramInt5 == 0) {
      paramGraphics.drawSubstring(paramString, 0, paramInt2, paramInt3, paramInt4, 0);
      return;
    } 
    if (paramInt5 == 2) {
      paramGraphics.drawSubstring(paramString, 0, paramInt2, paramInt3, paramInt4, 24);
      return;
    } 
    if (paramInt5 == 1)
      paramGraphics.drawSubstring(paramString, 0, paramInt2, paramInt3, paramInt4, 17); 
  }
  
  public final int a(char paramChar) {
    return this.a.charWidth(paramChar);
  }
  
  public final int b() {
    return this.a.getBaselinePosition();
  }
  
  public final void c(boolean paramBoolean) {
    this.a = Font.getFont(0, 1, 0);
  }
  
  public final void a(boolean paramBoolean) {}
  
  public final void c() {}
  
  public final void b(boolean paramBoolean) {}
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\bz.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */