import javax.microedition.lcdui.Graphics;

public class o {
  private String b;
  
  protected a a;
  
  private int c;
  
  private int d;
  
  private int e;
  
  private int f;
  
  private d g = null;
  
  private boolean h = false;
  
  public o() {}
  
  public final void a(boolean paramBoolean) {
    this.h = true;
  }
  
  public o(d paramd, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    int i = paramInt5;
    paramInt5 = paramInt4;
    paramInt4 = paramInt3;
    paramInt3 = paramInt2;
    paramInt2 = paramInt1;
    String str1 = paramString;
    d d1 = paramd;
    o o1 = this;
    str1 = str1.replace('\r', '\n');
    int j = i;
    i = paramInt5;
    paramInt5 = paramInt4;
    paramInt4 = paramInt3;
    paramInt3 = paramInt2;
    String str2 = str1;
    a a1 = g.c(str1);
    d1 = d1;
    (o1 = o1).g = d1;
    o1.b = str2;
    o1.a = new a(10);
    o1.e = paramInt3;
    o1.f = paramInt4;
    o1.c = paramInt5;
    if (paramInt5 <= 0 || a1.d() <= 0)
      return; 
    o1.a(a1, o1.b, paramInt5, i, j);
    n n1 = (n)o1.a.b(o1.a.d() - 1);
    o1.d = n1.e() + i;
    n n2;
    if (o1.a.d() > 0 && (n2 = (n)o1.a.b(0)).e() == n1.e())
      o1.c = n1.d() + n1.f(); 
  }
  
  private void a(a parama, String paramString, int paramInt1, int paramInt2, int paramInt3) {
    paramInt3 = paramInt2 + paramInt3;
    int i = 0;
    long l = 0L;
    int j = 0;
    int k = parama.d();
    while (j < k) {
      o o1;
      String str = (String)parama.b(j);
      if (this.a.d() > 0) {
        n n1;
        long l1;
        l = (l1 = ((n1 = (n)this.a.b(this.a.d() - 1)).d() + n1.f())) << 32L | n1.e();
      } 
      int m = 10;
      if (str.length() > 0)
        m = str.charAt(0); 
      int n = 0;
      if (m == 26) {
        byte b;
        String str1;
        String str2;
        int i1;
        int i2;
        int i3;
        int i4;
        int i5;
        long l1;
        switch (m = Integer.parseInt((new StringBuffer(String.valueOf(str.charAt(1)))).toString())) {
          case 3:
          case 4:
          case 5:
            n = str.length() - 2;
            str2 = paramString.substring(i, i + n);
            b(str2, m, j, l, paramInt1, paramInt3);
            break;
          case 1:
            n = str.length() - 2;
            str2 = paramString.substring(i, i + n);
            a(str2, 1, j, l, paramInt3, paramInt1);
            break;
          case 2:
            m = Integer.parseInt(String.valueOf(str.charAt(2)) + str.charAt(3));
            n = str.length() - 4;
            str2 = paramString.substring(i, i + n);
            i3 = paramInt1;
            i2 = paramInt3;
            l1 = l;
            i1 = j;
            b = 2;
            str1 = str2;
            m = m;
            o1 = this;
            i4 = (int)(l1 >>> 32L);
            i5 = (int)l1;
            if (i4 + p.l[m] > i3) {
              i5 += i2;
              i4 = 0;
            } 
            o1.a.a(new p(m, str1, 2, i1, i4, i5, p.l[m]));
            break;
        } 
      } else {
        n = o1.length();
        String str1 = paramString.substring(i, i + n);
        b(str1, 0, j, l, paramInt1, paramInt3);
      } 
      i += n;
      j++;
    } 
    for (j = this.a.d() - 1; j >= 0; j--) {
      n n;
      (n = (n)this.a.b(j)).a(paramInt2);
    } 
  }
  
  public final d a() {
    return this.g;
  }
  
  public final int b() {
    return this.c;
  }
  
  public final int c() {
    return this.d;
  }
  
  public final a d() {
    return this.a;
  }
  
  public final n a(int paramInt) {
    return (n)this.a.b(paramInt);
  }
  
  public final int e() {
    return this.e;
  }
  
  public final int f() {
    return this.f;
  }
  
  public final void a(int paramInt1, int paramInt2) {
    this.e = 4;
    this.f = paramInt2;
  }
  
  public final String g() {
    return g.a(this.a, 1, this.h);
  }
  
  public final String h() {
    return g.a(this.a, 3, this.h);
  }
  
  public final void a(int paramInt, boolean paramBoolean) {
    if (paramInt < 0 || paramInt >= this.a.d())
      return; 
    n n;
    int i = (n = (n)this.a.b(paramInt)).b();
    if (!this.h) {
      while (paramInt >= 0) {
        if ((n = (n)this.a.b(paramInt)).b() != i) {
          paramInt++;
          break;
        } 
        paramInt--;
      } 
      if (paramInt < 0)
        paramInt = 0; 
      while (paramInt < this.a.d()) {
        if ((n = (n)this.a.b(paramInt)).b() == i) {
          n.a(paramBoolean);
          paramInt++;
          continue;
        } 
        return;
      } 
      return;
    } 
    for (paramInt = 0; paramInt < this.a.d(); paramInt++) {
      if ((n = (n)this.a.b(paramInt)).b() == i)
        n.a(paramBoolean); 
    } 
  }
  
  public final String b(int paramInt1, int paramInt2) {
    return g.a(this.a, paramInt1, paramInt2, this.h);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    paramInt1 += this.e;
    paramInt2 += this.f;
    for (byte b = 0; b < this.a.d(); b++) {
      n n;
      (n = (n)this.a.b(b)).a(paramGraphics, paramInt1, paramInt2);
    } 
  }
  
  public final String i() {
    return this.b;
  }
  
  public final int b(int paramInt) {
    return g.b(this.a, paramInt);
  }
  
  public final int c(int paramInt) {
    return g.c(this.a, paramInt);
  }
  
  public final int d(int paramInt) {
    return g.d(this.a, paramInt);
  }
  
  public final int e(int paramInt) {
    return g.e(this.a, paramInt);
  }
  
  public final int j() {
    a a1 = this.a;
    for (byte b = 0; b < a1.d(); b++) {
      n n;
      if (g.a((n = (n)a1.b(b)).c()))
        return b; 
    } 
    return -1;
  }
  
  public final int k() {
    a a1;
    for (int i = (a1 = this.a).d() - 1; i >= 0; i--) {
      n n;
      if (g.a((n = (n)a1.b(i)).c()))
        return i; 
    } 
    return -1;
  }
  
  private void b(String paramString, int paramInt1, int paramInt2, long paramLong, int paramInt3, int paramInt4) {
    int k = (int)(paramLong >>> 32L);
    int i = (int)paramLong;
    int j = 0;
    int m = 0;
    int n = k;
    while (j < paramString.length()) {
      char c = paramString.charAt(m);
      int i1 = this.g.a(c);
      m++;
      if (c == '\n') {
        String str;
        if ((str = paramString.substring(0, m - 1)).length() > 0)
          this.a.a(a(str, paramInt1, paramInt2, k, i, n - k)); 
        i += paramInt4;
        if (m >= paramString.length()) {
          this.a.a(a("", paramInt1, paramInt2, 0, i, 0));
          return;
        } 
        paramString = paramString.substring(m);
        j = m = k = n = 0;
        continue;
      } 
      if (c == ' ')
        j = m; 
      if ((n += i1) > paramInt3) {
        String str2;
        int i2;
        if ((i2 = paramString.indexOf(' ', m)) >= 0) {
          str2 = paramString.substring(j, i2);
        } else {
          str2 = paramString.substring(j);
        } 
        int i3;
        if ((i3 = this.g.a(str2)) <= paramInt3) {
          if ((str1 = paramString.substring(0, j)).length() > 0)
            this.a.a(a(str1, paramInt1, paramInt2, k, i, this.g.a(str1))); 
          i += paramInt4;
          k = 0;
          paramString = paramString.substring(j);
          if (i2 < 0) {
            if (paramString.length() > 0) {
              this.a.a(a(paramString, paramInt1, paramInt2, 0, i, this.g.a(str2)));
              return;
            } 
            break;
          } 
          m = j = i2 - j;
          n = i3;
          continue;
        } 
        if (str1 != ' ')
          m--; 
        n -= i1;
        String str1;
        if ((str1 = paramString.substring(0, m)).length() > 0)
          this.a.a(a(str1, paramInt1, paramInt2, k, i, n - k)); 
        i += paramInt4;
        k = n = 0;
        paramString = paramString.substring(m);
        j = m = 0;
        continue;
      } 
      if (m >= paramString.length()) {
        String str;
        if ((str = paramString).length() > 0) {
          this.a.a(a(str, paramInt1, paramInt2, k, i, this.g.a(str)));
          return;
        } 
        break;
      } 
    } 
  }
  
  protected n a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    return new q(paramString, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, this.g);
  }
  
  protected void a(String paramString, int paramInt1, int paramInt2, long paramLong, int paramInt3, int paramInt4) {}
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\o.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */