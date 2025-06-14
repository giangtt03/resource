public final class dy {
  public int a;
  
  public int b;
  
  public dx[] c;
  
  public final byte[] a(short paramShort) {
    if (this.c == null)
      return null; 
    for (byte b = 0; b < this.c.length; b++) {
      if ((this.c[b]).a == paramShort)
        return (this.c[b]).b; 
    } 
    return null;
  }
  
  public final String b(short paramShort) {
    return i.a(a(paramShort));
  }
  
  public final int a(short paramShort, int paramInt) {
    if (this.c == null)
      return -1; 
    if ((paramInt = paramInt) < 0) {
      paramInt = -1;
    } else if (paramInt >= this.c.length) {
      paramInt = this.c.length - 1;
    } 
    while (++paramInt < this.c.length) {
      if ((this.c[paramInt]).a == paramShort)
        return paramInt; 
      paramInt++;
    } 
    return -1;
  }
  
  public final int a(short paramShort, int paramInt1, int paramInt2) {
    if (this.c == null)
      return -1; 
    paramInt1 = paramInt1;
    paramInt2 = paramInt2;
    if (paramInt1 < 0) {
      paramInt1 = -1;
    } else if (paramInt1 >= this.c.length) {
      paramInt1 = this.c.length - 1;
    } 
    if (paramInt2 < 0)
      paramInt2 = this.c.length; 
    if (paramInt1 + 1 >= paramInt2)
      return -1; 
    while (++paramInt1 < this.c.length && paramInt1 < paramInt2) {
      if ((this.c[paramInt1]).a == paramShort)
        return paramInt1; 
      paramInt1++;
    } 
    return -1;
  }
  
  public final String b(short paramShort, int paramInt1, int paramInt2) {
    int i;
    return ((i = a(paramShort, paramInt1, paramInt2)) >= 0) ? b(i) : null;
  }
  
  public final long a(short paramShort, int paramInt1, int paramInt2, long paramLong) {
    int i;
    return ((i = a(paramShort, paramInt1, paramInt2)) >= 0) ? a(i, 0L) : 0L;
  }
  
  public final int a(short paramShort, int paramInt1, int paramInt2, int paramInt3) {
    int i;
    return ((i = a(paramShort, paramInt1, paramInt2)) >= 0) ? a(i, 0) : 0;
  }
  
  public final byte a(short paramShort, int paramInt1, int paramInt2, byte paramByte) {
    int i;
    return ((i = a(paramShort, paramInt1, paramInt2)) >= 0) ? a(i, paramByte) : paramByte;
  }
  
  public final byte a(short paramShort1, int paramInt1, int paramInt2, short paramShort2) {
    return a(paramShort1, paramInt1, paramInt2, (byte)paramShort2);
  }
  
  public final int b(short paramShort, int paramInt) {
    if (this.c == null)
      return -1; 
    for (byte b = 0; b < this.c.length; b++) {
      if ((this.c[b]).a == paramShort) {
        if (paramInt == 0)
          return b; 
        paramInt--;
      } 
    } 
    return -1;
  }
  
  public final int c(short paramShort) {
    byte b1 = 0;
    if (this.c == null)
      return 0; 
    for (byte b2 = 0; b2 < this.c.length; b2++) {
      if ((this.c[b2]).a == paramShort)
        b1++; 
    } 
    return b1;
  }
  
  public final byte[] a(int paramInt) {
    return (this.c == null || paramInt < 0 || paramInt >= this.c.length) ? null : (this.c[paramInt]).b;
  }
  
  public final String b(int paramInt) {
    return i.a(a(paramInt));
  }
  
  public final long a(int paramInt, long paramLong) {
    long l = paramLong;
    byte[] arrayOfByte;
    return ((arrayOfByte = a(paramInt)) == null) ? l : m.d(arrayOfByte);
  }
  
  public final int a(int paramInt1, int paramInt2) {
    paramInt2 = paramInt2;
    byte[] arrayOfByte;
    return ((arrayOfByte = a(paramInt1)) == null) ? paramInt2 : ((arrayOfByte.length == 1) ? m.a(arrayOfByte[0]) : ((arrayOfByte.length == 2) ? m.a(arrayOfByte) : ((arrayOfByte.length == 3) ? m.b(arrayOfByte) : m.c(arrayOfByte))));
  }
  
  public final byte a(int paramInt, byte paramByte) {
    paramByte = paramByte;
    byte[] arrayOfByte;
    return ((arrayOfByte = a(paramInt)) == null) ? paramByte : arrayOfByte[0];
  }
  
  public final byte a(int paramInt, short paramShort) {
    return a(paramInt, (byte)paramShort);
  }
  
  public final String toString() {
    String str = "";
    str = String.valueOf(str) + "[Service]: " + this.b + " [Length]: " + this.a + " [Number Of Keys]: " + ((this.c != null) ? String.valueOf(this.c.length) : "Null");
    if (this.c != null) {
      str = String.valueOf(str) + "\n";
      for (byte b = 0; b < this.c.length; b++)
        str = String.valueOf(str) + " [Key]: " + (this.c[b]).a + " [Value length]: " + (this.c[b]).b.length; 
    } 
    return str;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\dy.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */