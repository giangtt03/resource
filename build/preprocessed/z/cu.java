public final class cu {
  public int a;
  
  public int b;
  
  public cu(int paramInt1, int paramInt2) {
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  public cu() {
    this(0, 0);
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject != null && paramObject instanceof cu) {
      paramObject = paramObject;
      return (this.a == ((cu)paramObject).a && this.b == ((cu)paramObject).b);
    } 
    return false;
  }
  
  public final int hashCode() {
    int i;
    return i = (i = 629 + this.a) * 17 + this.b;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\cu.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */