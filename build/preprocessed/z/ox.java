import javax.microedition.lcdui.Image;

public final class ox {
  private a a;
  
  private ox b;
  
  public ox(ox paramox) {
    this.b = paramox;
    this.a = new a();
  }
  
  public final void a() {
    this.a.a();
  }
  
  public final Image a(int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Lox;
    //   4: ifnull -> 23
    //   7: aload_0
    //   8: getfield b : Lox;
    //   11: iload_1
    //   12: iconst_0
    //   13: invokevirtual a : (IZ)Ljavax/microedition/lcdui/Image;
    //   16: dup
    //   17: astore_3
    //   18: ifnull -> 23
    //   21: aload_3
    //   22: areturn
    //   23: aload_0
    //   24: iload_1
    //   25: i2l
    //   26: lstore #6
    //   28: astore_3
    //   29: iconst_0
    //   30: istore #4
    //   32: goto -> 71
    //   35: aload_3
    //   36: getfield a : La;
    //   39: iload #4
    //   41: invokevirtual b : (I)Ljava/lang/Object;
    //   44: checkcast ov
    //   47: dup
    //   48: astore #5
    //   50: getfield a : I
    //   53: i2l
    //   54: lload #6
    //   56: lcmp
    //   57: ifne -> 68
    //   60: aload #5
    //   62: getfield b : Ljavax/microedition/lcdui/Image;
    //   65: goto -> 84
    //   68: iinc #4, 1
    //   71: iload #4
    //   73: aload_3
    //   74: getfield a : La;
    //   77: invokevirtual d : ()I
    //   80: if_icmplt -> 35
    //   83: aconst_null
    //   84: dup
    //   85: astore_3
    //   86: ifnonnull -> 133
    //   89: iload_2
    //   90: ifeq -> 133
    //   93: invokestatic a : ()Lpa;
    //   96: iload_1
    //   97: istore #4
    //   99: dup
    //   100: astore_2
    //   101: iload #4
    //   103: iconst_0
    //   104: invokevirtual b : (IZ)[B
    //   107: dup
    //   108: astore_2
    //   109: ifnull -> 133
    //   112: aload_2
    //   113: invokestatic a : ([B)Ljavax/microedition/lcdui/Image;
    //   116: astore_3
    //   117: aload_0
    //   118: getfield a : La;
    //   121: new ov
    //   124: dup
    //   125: iload_1
    //   126: aload_3
    //   127: invokespecial <init> : (ILjavax/microedition/lcdui/Image;)V
    //   130: invokevirtual a : (Ljava/lang/Object;)V
    //   133: aload_3
    //   134: areturn
  }
  
  public final void a(int paramInt, Image paramImage) {
    for (byte b = 0; b < this.a.d(); b++) {
      ov ov;
      if ((ov = (ov)this.a.b(b)).a == paramInt) {
        ov.b = paramImage;
        return;
      } 
    } 
    this.a.a(new ov(paramInt, paramImage));
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\ox.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */