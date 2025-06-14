final class ao implements bf {
  private an a;
  
  private ao(an paraman) {
    this.a = paraman;
  }
  
  public final void d(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iload_1
    //   1: aload_0
    //   2: getfield a : Lan;
    //   5: getfield e : I
    //   8: if_icmpne -> 72
    //   11: iload_2
    //   12: tableswitch default -> 72, -90002 -> 64, -90001 -> 49, -90000 -> 40
    //   40: aload_0
    //   41: getfield a : Lan;
    //   44: iconst_1
    //   45: invokevirtual c : (Z)V
    //   48: return
    //   49: aload_0
    //   50: getfield a : Lan;
    //   53: invokestatic a : (Lan;)Lbs;
    //   56: bipush #95
    //   58: invokevirtual f : (I)Z
    //   61: ifne -> 72
    //   64: aload_0
    //   65: getfield a : Lan;
    //   68: iconst_0
    //   69: invokevirtual c : (Z)V
    //   72: return
  }
  
  ao(an paraman, byte paramByte) {
    this(paraman);
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ao.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */