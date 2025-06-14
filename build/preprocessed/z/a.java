public final class a {
  private Object[] a;
  
  private int b = 0;
  
  public a() {}
  
  public a(int paramInt) {
    this();
    this.a = new Object[paramInt];
  }
  
  public final void a(Object[] paramArrayOfObject) {
    if (paramArrayOfObject != null)
      this.a = paramArrayOfObject; 
  }
  
  public final void a(Object paramObject) {
    if (this.a == null)
      this.a = new Object[10]; 
    if (this.b >= this.a.length) {
      Object[] arrayOfObject = new Object[this.a.length + 10];
      System.arraycopy(this.a, 0, arrayOfObject, 0, this.a.length);
      this.a = arrayOfObject;
    } 
    this.a[this.b] = paramObject;
    this.b++;
  }
  
  public final void a(Object paramObject, int paramInt) {
    a a1;
    if (paramInt < 0 || paramInt > (a1 = this).b)
      throw new ArrayIndexOutOfBoundsException(); 
    if (paramInt == (a1 = this).b) {
      a(paramObject);
      return;
    } 
    this.a[paramInt] = paramObject;
  }
  
  public final void b(Object paramObject, int paramInt) {
    a a1;
    if (paramInt < 0 || paramInt > (a1 = this).b)
      throw new ArrayIndexOutOfBoundsException(); 
    if (this.a == null)
      this.a = new Object[10]; 
    int i;
    Object[] arrayOfObject = new Object[i = (this.b >= this.a.length) ? (this.a.length + 10) : this.a.length];
    System.arraycopy(this.a, 0, arrayOfObject, 0, paramInt);
    System.arraycopy(this.a, paramInt, arrayOfObject, paramInt + 1, this.b - paramInt);
    this.a = arrayOfObject;
    this.a[paramInt] = paramObject;
    this.b++;
  }
  
  public final void a(int paramInt1, int paramInt2) {
    a a1;
    if (paramInt1 >= 0 && paramInt1 < (a1 = this).b && paramInt2 >= 0 && paramInt2 < (a1 = this).b) {
      Object object = this.a[paramInt1];
      this.a[paramInt1] = this.a[paramInt2];
      this.a[paramInt2] = object;
    } 
  }
  
  public final Object a(int paramInt) {
    if (this.a == null)
      return null; 
    a a1;
    if (paramInt < 0 || paramInt > (a1 = this).b)
      throw new ArrayIndexOutOfBoundsException(); 
    Object object = this.a[paramInt];
    this.a[paramInt] = null;
    this.b--;
    if (paramInt < this.a.length - 1)
      System.arraycopy(this.a, paramInt + 1, this.a, paramInt, this.b - paramInt); 
    return object;
  }
  
  public final void a() {
    this.a = null;
    this.b = 0;
  }
  
  public final Object b(Object paramObject) {
    if (this.a == null)
      return null; 
    for (byte b = 0; b < this.b; b++) {
      if (this.a[b].equals(paramObject))
        return a(b); 
    } 
    return null;
  }
  
  public final int c(Object paramObject) {
    if (this.a == null)
      return -1; 
    if (paramObject != null) {
      a a1;
      for (byte b = 0; b < (a1 = this).b; b++) {
        if (paramObject.equals(this.a[b]))
          return b; 
      } 
    } 
    return -1;
  }
  
  public final Object b() {
    a a1;
    return (this.a == null) ? null : (((a1 = this).b > 0) ? this.a[0] : null);
  }
  
  public final Object c() {
    a a1;
    return (this.a == null) ? null : (((a1 = this).b > 0) ? this.a[this.b - 1] : null);
  }
  
  public final Object b(int paramInt) {
    return (this.a == null) ? null : ((paramInt >= this.b || paramInt < 0) ? null : this.a[paramInt]);
  }
  
  public final int d() {
    return this.b;
  }
  
  public final Object[] e() {
    a a1;
    Object[] arrayOfObject = new Object[(a1 = this).b];
    System.arraycopy(this.a, 0, arrayOfObject, 0, arrayOfObject.length);
    return this.a;
  }
  
  public final String toString() {
    String str = "";
    a a1;
    if ((a1 = this).b == 0) {
      str = "[Size]: 0";
    } else {
      for (byte b = 0; b < this.b; b++) {
        if (this.a[b] != null) {
          str = String.valueOf(str) + "\n[Index]: " + b + " [Object]: " + this.a[b].toString();
        } else {
          str = String.valueOf(str) + "\n[Index]: " + b + " [Object]: NULL";
        } 
      } 
    } 
    return str;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\a.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */