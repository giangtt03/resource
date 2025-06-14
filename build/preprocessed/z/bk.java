import javax.microedition.lcdui.Graphics;

public final class bk extends at implements bf {
  private static int c = 0;
  
  private bj[] d;
  
  public int a;
  
  private static String e = "OK";
  
  private static int f;
  
  private static int g;
  
  private static int h;
  
  private static int i = 8160656;
  
  public static be b = null;
  
  public static void a(int paramInt) {
    bj.a = 16777215;
  }
  
  public bk(int paramInt) {
    b(paramInt);
    bk bk1;
    (bk1 = this).n = v.u;
    bk1.a = v.u - bk1.p;
  }
  
  private void b(int paramInt) {
    String str;
    this.m = 0;
    this.o = v.t;
    this.p = v.u / 2;
    if (this.p < 160)
      this.p = 160; 
    this.n = v.u - this.p;
    byte b1 = 4;
    byte b2 = 8;
    if (v.d != 3) {
      b1 = 2;
      b2 = 4;
    } 
    int i = (this.o - b1 * 11) / 10;
    int j;
    if ((j = (this.p - 5 * b2) / 4) > i * 5 / 4) {
      j = i * 5 / 4;
      this.p = 4 * j + 5 * b2;
      this.n = v.u - this.p;
    } 
    if (paramInt == 0 || paramInt == 1 || paramInt == 2) {
      c = paramInt;
      this.d = new bj[34];
      if (c == 2) {
        str = "qwertyuiop";
      } else {
        str = "QWERTYUIOP";
      } 
      i = (this.o - b1 * 11) / 10;
      int m = (this.o - i * 10 - b1 * 9) / 2;
      byte b;
      for (b = 0; b < str.length(); b++)
        this.d[b + 0] = new bj(m + b1 * b + b * i, b2, i, j, str.charAt(b), str.charAt(b)); 
      int k = 0 + str.length();
      if (c == 2) {
        str = "asdfghjkl";
      } else {
        str = "ASDFGHJKL";
      } 
      for (b = 0; b < str.length(); b++)
        this.d[k + b] = new bj((v.t - i * 9 - b1 * 8) / 2 + b1 * b + b * i, 2 * b2 + j, i, j, str.charAt(b), str.charAt(b)); 
      k = k + str.length() + 1;
      if (c == 2) {
        str = "zxcvbnm";
      } else {
        str = "ZXCVBNM";
      } 
      m = (v.t - i * 7 - b1 * 6) / 2;
      for (b = 0; b < str.length(); b++)
        this.d[k + b] = new bj(m + b1 * b + b * i, 3 * b2 + 2 * j, i, j, str.charAt(b), str.charAt(b)); 
      if (c == 2) {
        this.d[k - 1] = new bj(b1, 3 * b2 + 2 * j, m - 2 * b1, j, "shift", 0);
      } else if (c == 1) {
        this.d[k - 1] = new bj(b1, 3 * b2 + 2 * j, m - 2 * b1, j, "Shift", 0);
      } else if (c == 0) {
        this.d[k - 1] = new bj(b1, 3 * b2 + 2 * j, m - 2 * b1, j, "SHIFT", 0);
      } 
      f = k - 1;
      this.d[k - 1].a(this, 6);
      this.d[k + 7] = new bj(this.o - b1 - (this.d[k - 1]).d, 3 * b2 + 2 * j, m - 2 * b1, j, "DEL", -8);
      k = k + str.length() + 1;
      m = (v.t - 5 * i - 4 * b1) / 2;
      this.d[k + 2] = new bj(m, 4 * b2 + 3 * j, 4 * i + 4 * b1, j, (v.a && v.b) ? "Khoảng trắng" : "SpaceBar", 32);
      h = k + 2;
      this.d[k] = new bj(b1, 4 * b2 + 3 * j, m - 3 * b1 - i, j, ".?123", 0);
      this.d[k].a(this, 3);
      this.d[k + 1] = new bj(2 * b1 + (this.d[k]).d, 4 * b2 + 3 * j, i, j, (v.a && v.b) ? "Vi" : "En", -3);
      this.d[k + 1].a(this, 9);
      g = k + 1;
      this.d[k + 3] = new bj((this.d[k + 2]).b + (this.d[k + 2]).d + b1, 4 * b2 + 3 * j, i, j, "<", -3);
      this.d[k + 4] = new bj((this.d[k + 3]).b + (this.d[k + 3]).d + b1, 4 * b2 + 3 * j, i, j, ">", -4);
      this.d[k + 5] = new bj((this.d[k + 4]).b + (this.d[k + 4]).d + b1, 4 * b2 + 3 * j, m - 3 * b1 - i, j, e, 0);
      this.d[k + 5].a(this, 5);
      return;
    } 
    if (str == '\003') {
      this.d = new bj[33];
      str = "1234567890";
      i = (this.o - b1 * 11) / 10;
      int m = (this.o - i * 10 - b1 * 9) / 2;
      byte b;
      for (b = 0; b < str.length(); b++)
        this.d[b + 0] = new bj(m + b1 * b + b * i, b2, i, j, str.charAt(b), str.charAt(b)); 
      int k = 0 + str.length();
      str = "-/:;()$&@\"";
      for (b = 0; b < str.length(); b++)
        this.d[k + b] = new bj((v.t - i * 10 - b1 * 9) / 2 + b1 * b + b * i, 2 * b2 + j, i, j, str.charAt(b), str.charAt(b)); 
      k = k + str.length() + 1;
      str = ".,?!'";
      m = (v.t - i * 7 - 4 * b1) / 2;
      for (b = 0; b < str.length(); b++)
        this.d[k + b] = new bj(m + b1 * b + b * i * 7 / 5, 3 * b2 + 2 * j, i * 7 / 5, j, str.charAt(b), str.charAt(b)); 
      this.d[k - 1] = new bj(b1, 3 * b2 + 2 * j, m - 2 * b1, j, "#+=", 0);
      this.d[k - 1].a(this, 7);
      f = k - 1;
      this.d[k + 5] = new bj(this.o - b1 - (this.d[k - 1]).d, 3 * b2 + 2 * j, m - 2 * b1, j, "DEL", -8);
      k = k + str.length() + 1;
      m = (v.t - 5 * i - 4 * b1) / 2;
      this.d[k + 2] = new bj(m, 4 * b2 + 3 * j, 4 * i + 4 * b1, j, (v.a && v.b) ? "Khoảng trắng" : "SpaceBar", 32);
      h = k + 2;
      this.d[k] = new bj(b1, 4 * b2 + 3 * j, m - 3 * b1 - i, j, "ABC", 0);
      this.d[k].a(this, 8);
      this.d[k + 1] = new bj(2 * b1 + (this.d[k]).d, 4 * b2 + 3 * j, i, j, (v.a && v.b) ? "Vi" : "En", -3);
      this.d[k + 1].a(this, 9);
      g = k + 1;
      this.d[k + 3] = new bj((this.d[k + 2]).b + (this.d[k + 2]).d + b1, 4 * b2 + 3 * j, i, j, "<", -3);
      this.d[k + 4] = new bj((this.d[k + 3]).b + (this.d[k + 3]).d + b1, 4 * b2 + 3 * j, i, j, ">", -4);
      this.d[k + 5] = new bj((this.d[k + 4]).b + (this.d[k + 4]).d + b1, 4 * b2 + 3 * j, m - 3 * b1 - i, j, e, 0);
      this.d[k + 5].a(this, 5);
      return;
    } 
    if (str == '\004') {
      this.d = new bj[33];
      str = "[]{}#%^*+=";
      i = (this.o - b1 * 11) / 10;
      int m = (this.o - i * 10 - b1 * 9) / 2;
      byte b;
      for (b = 0; b < str.length(); b++)
        this.d[b + 0] = new bj(m + b1 * b + b * i, b2, i, j, str.charAt(b), str.charAt(b)); 
      int k = 0 + str.length();
      str = "_\\|~<>$&@\"";
      for (b = 0; b < str.length(); b++)
        this.d[k + b] = new bj((v.t - i * 10 - b1 * 9) / 2 + b1 * b + b * i, 2 * b2 + j, i, j, str.charAt(b), str.charAt(b)); 
      k = k + str.length() + 1;
      str = ".,?!'";
      m = (v.t - i * 7 - 4 * b1) / 2;
      for (b = 0; b < str.length(); b++)
        this.d[k + b] = new bj(m + b1 * b + b * i * 7 / 5, 3 * b2 + 2 * j, i * 7 / 5, j, str.charAt(b), str.charAt(b)); 
      this.d[k - 1] = new bj(b1, 3 * b2 + 2 * j, m - 2 * b1, j, "123", 0);
      f = k - 1;
      this.d[k - 1].a(this, 3);
      this.d[k + 5] = new bj(this.o - b1 - (this.d[k - 1]).d, 3 * b2 + 2 * j, m - 2 * b1, j, "DEL", -8);
      k = k + str.length() + 1;
      m = (v.t - 5 * i - 4 * b1) / 2;
      this.d[k + 2] = new bj(m, 4 * b2 + 3 * j, 4 * i + 4 * b1, j, (v.a && v.b) ? "Khoảng trắng" : "SpaceBar", 32);
      h = k + 2;
      this.d[k] = new bj(b1, 4 * b2 + 3 * j, m - 3 * b1 - i, j, "ABC", 0);
      this.d[k].a(this, 8);
      this.d[k + 1] = new bj(2 * b1 + (this.d[k]).d, 4 * b2 + 3 * j, i, j, (v.a && v.b) ? "Vi" : "En", -3);
      this.d[k + 1].a(this, 9);
      g = k + 1;
      this.d[k + 3] = new bj((this.d[k + 2]).b + (this.d[k + 2]).d + b1, 4 * b2 + 3 * j, i, j, "<", -3);
      this.d[k + 4] = new bj((this.d[k + 3]).b + (this.d[k + 3]).d + b1, 4 * b2 + 3 * j, i, j, ">", -4);
      this.d[k + 5] = new bj((this.d[k + 4]).b + (this.d[k + 4]).d + b1, 4 * b2 + 3 * j, m - 3 * b1 - i, j, e, 0);
      this.d[k + 5].a(this, 5);
    } 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    paramGraphics.setColor(i);
    paramGraphics.fillRect(paramInt1 + this.m, paramInt2 + this.n, this.o, this.p);
    if (this.d != null && this.d.length > 0)
      for (byte b = 0; b < this.d.length; b++) {
        int j = paramInt2 + this.n;
        int i = this.m + paramInt1;
        Graphics graphics = paramGraphics;
        bj bj1 = this.d[b];
        int k = bj.a;
        if (bj1.g == 0) {
          cw.b(graphics, 5592405, bj1.b + 1 + i, bj1.c + 1 + j, bj1.d, bj1.e);
          graphics.setColor(k);
          graphics.fillRect(bj1.b + 1 + i, bj1.c + 1 + j, bj1.d - 2, bj1.e - 2);
          cw.b(graphics, 8947848, bj1.b + i, bj1.c + j, bj1.d, bj1.e);
          bx.d.a(graphics, bj1.f, bj1.b + bj1.d / 2 + i, bj1.c + j + (bj1.e - bx.d.a()) / 2, 1);
        } else if (bj1.g == 1) {
          graphics.setColor(k);
          graphics.fillRect(bj1.b + i + 1, bj1.c + j + 1 - 2 - bj1.e, bj1.d - 1, bj1.e + 4 + bj1.e);
          cw.b(graphics, 5592405, bj1.b + i, bj1.c - bj1.e + 2 + j - 4, bj1.d + 1, bj1.e + 6 + bj1.e);
          bx.d.a(graphics, bj1.f, bj1.b + bj1.d / 2 + i, bj1.c - bj1.e + j + (bj1.e - bx.d.a()) / 2, 1);
        } 
      }  
  }
  
  public final void i() {
    if (this.n != this.a) {
      if (this.a - this.n >= -3 && this.a - this.n <= 3) {
        this.n = this.a;
        return;
      } 
      this.n += (this.a - this.n) / 2;
    } 
  }
  
  public final void g(int paramInt1, int paramInt2) {
    paramInt2 -= this.n;
    try {
      if (this.d != null && this.d.length > 0) {
        for (int i = 0; i < this.d.length; i++) {
          if (paramInt1 >= (this.d[i]).b && paramInt1 <= (this.d[i]).b + (this.d[i]).d && paramInt2 >= (this.d[i]).c && paramInt2 <= (this.d[i]).c + (this.d[i]).e) {
            i = paramInt2;
            paramInt2 = paramInt1;
            bj bj1 = this.d[i];
            if (paramInt2 >= bj1.b && paramInt2 <= bj1.b + bj1.d && i >= bj1.c && i <= bj1.c + bj1.e) {
              bj1.g = 1;
              if (bj1.i == null && bj1.h != -1987)
                ag.c(bj1.h); 
            } 
            return;
          } 
        } 
        return;
      } 
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
    } 
  }
  
  public final void h(int paramInt1, int paramInt2) {
    paramInt2 -= this.n;
    try {
      if (this.d != null && this.d.length > 0) {
        for (byte b = 0; b < this.d.length; b++) {
          if ((this.d[b]).g == 1) {
            int j = paramInt2;
            int i = paramInt1;
            bj bj1;
            (bj1 = this.d[b]).g = 0;
            if (bj1.i != null && i >= bj1.b && i <= bj1.b + bj1.d && j >= bj1.c && j <= bj1.c + bj1.e) {
              bj1.i.d(-1, bj1.j);
            } else if (bj1.h != 0) {
              ag.d(bj1.h);
            } 
            if ((this.d[b]).h >= 65 && (this.d[b]).h <= 90 && (this.d[f]).f.equals("Shift")) {
              for (byte b1 = 0; b1 < this.d.length; b1++) {
                if ((this.d[b1]).h >= 65 && (this.d[b1]).h <= 90) {
                  (this.d[b1]).f = (this.d[b1]).f.toLowerCase();
                  (this.d[b1]).h += 32;
                } 
              } 
              (this.d[f]).f = "shift";
            } 
          } 
        } 
        return;
      } 
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
    } 
  }
  
  public final void d(int paramInt1, int paramInt2) {
    if (paramInt2 == 6) {
      if ((this.d[f]).f.equals("SHIFT")) {
        for (paramInt1 = 0; paramInt1 < this.d.length; paramInt1++) {
          if ((this.d[paramInt1]).h >= 65 && (this.d[paramInt1]).h <= 90) {
            (this.d[paramInt1]).f = (this.d[paramInt1]).f.toLowerCase();
            (this.d[paramInt1]).h = (this.d[paramInt1]).f.charAt(0);
          } 
        } 
        (this.d[f]).f = "shift";
        c = 2;
        return;
      } 
      if ((this.d[f]).f.equals("shift")) {
        for (paramInt1 = 0; paramInt1 < this.d.length; paramInt1++) {
          if ((this.d[paramInt1]).h >= 97 && (this.d[paramInt1]).h <= 122) {
            (this.d[paramInt1]).f = (this.d[paramInt1]).f.toUpperCase();
            (this.d[paramInt1]).h = (this.d[paramInt1]).f.charAt(0);
          } 
        } 
        (this.d[f]).f = "Shift";
        c = 1;
        return;
      } 
      if ((this.d[f]).f.equals("Shift")) {
        (this.d[f]).f = "SHIFT";
        c = 0;
        return;
      } 
    } else {
      if (paramInt2 == 5) {
        if (b != null)
          b.a(); 
        ag.a().e();
        return;
      } 
      if (paramInt2 == 3) {
        b(3);
        return;
      } 
      if (paramInt2 == 7) {
        b(4);
        return;
      } 
      if (paramInt2 == 8) {
        b(c);
        return;
      } 
      if (paramInt2 == 9) {
        if (!v.a)
          return; 
        v.b = !v.b;
        (this.d[g]).f = v.b ? "Vi" : "En";
        (this.d[h]).f = v.b ? "Khoảng trắng" : "SpaceBar";
      } 
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\bk.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */