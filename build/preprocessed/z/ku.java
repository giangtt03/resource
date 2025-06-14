public final class ku {
  public int a;
  
  public int b;
  
  public kt[] c;
  
  public final boolean a(short paramShort) {
    if (this.c == null)
      return false; 
    for (byte b = 0; b < this.c.length; b++) {
      if ((this.c[b]).a == paramShort)
        return true; 
    } 
    return false;
  }
  
  public final int b(short paramShort) {
    byte b1 = 0;
    if (this.c == null)
      return 0; 
    for (byte b2 = 0; b2 < this.c.length; b2++) {
      if ((this.c[b2]).a == paramShort)
        b1++; 
    } 
    return b1;
  }
  
  public final int a(short paramShort, int paramInt1, int paramInt2) {
    byte b = 0;
    if (this.c == null)
      return 0; 
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
      return 0; 
    while (++paramInt1 < this.c.length && paramInt1 < paramInt2) {
      if ((this.c[paramInt1]).a == paramShort)
        b++; 
      paramInt1++;
    } 
    return b;
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
  
  public final int b(short paramShort, int paramInt1, int paramInt2) {
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
  
  public final byte[] c(short paramShort) {
    if (this.c == null)
      return null; 
    for (byte b = 0; b < this.c.length; b++) {
      if ((this.c[b]).a == paramShort)
        return (this.c[b]).b; 
    } 
    return null;
  }
  
  public final String d(short paramShort) {
    return a(c(paramShort));
  }
  
  public final long a(short paramShort, long paramLong) {
    return a(c(paramShort), paramLong);
  }
  
  public final int c(short paramShort, int paramInt) {
    return a(c(paramShort), paramInt);
  }
  
  public final byte a(short paramShort, byte paramByte) {
    return a(c(paramShort), paramByte);
  }
  
  public final byte[] c(short paramShort, int paramInt1, int paramInt2) {
    int i;
    return ((i = b(paramShort, paramInt1, paramInt2)) >= 0) ? a(i) : null;
  }
  
  public final String d(short paramShort, int paramInt1, int paramInt2) {
    int i;
    return ((i = b(paramShort, paramInt1, paramInt2)) >= 0) ? b(i) : null;
  }
  
  public final long a(short paramShort, int paramInt1, int paramInt2, long paramLong) {
    int i;
    if ((i = b(paramShort, paramInt1, paramInt2)) >= 0) {
      long l = 0L;
      paramInt1 = i;
      ku ku1;
      return a((ku1 = this).a(paramInt1), l);
    } 
    return 0L;
  }
  
  public final int a(short paramShort, int paramInt1, int paramInt2, int paramInt3) {
    int i;
    return ((i = b(paramShort, paramInt1, paramInt2)) >= 0) ? a(i, paramInt3) : paramInt3;
  }
  
  public final byte a(short paramShort, int paramInt1, int paramInt2, byte paramByte) {
    int i;
    return ((i = b(paramShort, paramInt1, paramInt2)) >= 0) ? a(i, paramByte) : paramByte;
  }
  
  public final byte[] a(int paramInt) {
    return (this.c == null || paramInt < 0 || paramInt >= this.c.length) ? null : (this.c[paramInt]).b;
  }
  
  public final String b(int paramInt) {
    return a(a(paramInt));
  }
  
  public final int a(int paramInt1, int paramInt2) {
    return a(a(paramInt1), paramInt2);
  }
  
  public final byte a(int paramInt, byte paramByte) {
    return a(a(paramInt), paramByte);
  }
  
  private static String a(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte == null)
      return null; 
    try {
      return new String(paramArrayOfbyte, 0, paramArrayOfbyte.length, "UTF-8");
    } catch (Throwable throwable) {
      return new String(paramArrayOfbyte);
    } 
  }
  
  private static long a(byte[] paramArrayOfbyte, long paramLong) {
    return (paramArrayOfbyte == null) ? paramLong : m.d(paramArrayOfbyte);
  }
  
  private static int a(byte[] paramArrayOfbyte, int paramInt) {
    return (paramArrayOfbyte == null) ? paramInt : m.c(paramArrayOfbyte);
  }
  
  private static byte a(byte[] paramArrayOfbyte, byte paramByte) {
    return (paramArrayOfbyte == null) ? paramByte : paramArrayOfbyte[0];
  }
  
  public final String toString() {
    String str = "";
    str = String.valueOf(str) + " [Service]: " + this.b + " [Length]: " + this.a + " [Number Of Keys]: " + ((this.c != null) ? String.valueOf(this.c.length) : "Null");
    if (this.c != null) {
      str = String.valueOf(str) + "\n";
      for (byte b = 0; b < this.c.length; b++)
        str = String.valueOf(str) + "  - [Key]: " + (this.c[b]).a + " [Value length]: " + (this.c[b]).b.length + "\n"; 
    } 
    return str;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ku.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */