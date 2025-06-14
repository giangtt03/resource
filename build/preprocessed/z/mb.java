import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class mb {
  private int a;
  
  private int[][][] b;
  
  private int[] c;
  
  private byte[][] d;
  
  private int e;
  
  private static a f = new a();
  
  public mb(int paramInt) {
    this(paramInt, pa.a().a(paramInt));
  }
  
  private mb(int paramInt, byte[] paramArrayOfbyte) {
    this.a = paramInt;
    a(paramArrayOfbyte);
  }
  
  private void a(byte[] paramArrayOfbyte) {
    try {
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
      DataInputStream dataInputStream;
      (dataInputStream = new DataInputStream(byteArrayInputStream)).readByte();
      this.e = dataInputStream.readInt();
      byte b = dataInputStream.readByte();
      this.b = new int[b][][];
      this.d = new byte[b][];
      this.c = new int[b];
      for (b = 0; b < this.b.length; b++) {
        byte b1 = dataInputStream.readByte();
        this.c[b] = dataInputStream.readByte();
        byte b2 = dataInputStream.readByte();
        this.b[b1] = new int[b2][2];
        this.d[b1] = new byte[b2];
        for (byte b3 = 0; b3 < b2; b3++) {
          this.d[b1][b3] = dataInputStream.readByte();
          this.b[b1][b3][0] = dataInputStream.readShort();
          this.b[b1][b3][1] = dataInputStream.readShort();
        } 
      } 
      dataInputStream.close();
      return;
    } catch (Exception exception) {
      ct.a((new StringBuffer(String.valueOf(this.a))).toString());
      exception.printStackTrace();
      return;
    } 
  }
  
  private static Image b(int paramInt) {
    int i = paramInt;
    pa pa;
    return f.a((pa = pa.a()).b(i, false));
  }
  
  private static Image a(int paramInt, df paramdf) {
    int i = paramInt;
    pa pa;
    byte[] arrayOfByte = (pa = pa.a()).b(i, false);
    if (paramdf != null && paramdf.d != null && paramdf.e != null && !paramdf.d.equals(paramdf.e))
      h.a(arrayOfByte, paramdf.d.c, paramdf.e.c); 
    return f.a(arrayOfByte);
  }
  
  private static Image a(int paramInt, df paramdf1, df paramdf2) {
    int i = paramInt;
    pa pa;
    byte[] arrayOfByte = (pa = pa.a()).b(i, false);
    if (paramdf1 != null && paramdf1.d != null && paramdf1.e != null && !paramdf1.d.equals(paramdf1.e))
      h.a(arrayOfByte, paramdf1.d.c, paramdf1.e.c); 
    if (paramdf2 != null && paramdf2.d != null && paramdf2.e != null && !paramdf2.d.equals(paramdf2.e))
      h.a(arrayOfByte, paramdf2.d.c, paramdf2.e.c); 
    return f.a(arrayOfByte);
  }
  
  private static ma a(lh paramlh, mb parammb1, mb parammb2, mb parammb3, mb parammb4, int paramInt1, int paramInt2, boolean paramBoolean) {
    int i;
    ma ma2;
    if ((ma2 = c(i = a(paramlh, parammb1, parammb2, parammb3, parammb4, paramInt1))) != null)
      return ma2; 
    int j = parammb2.c[paramInt1];
    int k = parammb1.c[paramInt1];
    int m = parammb3.c[paramInt1];
    int n = parammb4.c[paramInt1];
    Image image2 = a(paramInt1 + 99000, paramlh.W);
    int i1 = paramInt1;
    mb mb1;
    Image image3 = a((mb1 = parammb2).e + i1, paramlh.V, paramlh.W);
    i1 = paramInt1;
    Image image1 = a((mb1 = parammb1).e + i1, paramlh.U);
    i1 = paramInt1;
    Image image4 = b((mb1 = parammb3).e + i1);
    i1 = paramInt1;
    Image image5 = b((mb1 = parammb4).e + i1);
    i1 = image2.getWidth() / paramInt2;
    j = image3.getWidth() / j;
    m = image4.getWidth() / m;
    n = image5.getWidth() / n;
    k = image1.getWidth() / k;
    int i2 = image2.getHeight();
    int i3 = image3.getHeight();
    int i4 = image1.getHeight();
    int i5 = image4.getHeight();
    int i6 = image5.getHeight();
    byte[] arrayOfByte1 = parammb2.d[paramInt1];
    byte[] arrayOfByte2 = parammb1.d[paramInt1];
    byte[] arrayOfByte3 = parammb3.d[paramInt1];
    byte[] arrayOfByte4 = parammb4.d[paramInt1];
    int[][] arrayOfInt2 = parammb2.b[paramInt1];
    int[][] arrayOfInt1 = parammb1.b[paramInt1];
    int[][] arrayOfInt3 = parammb3.b[paramInt1];
    int[][] arrayOfInt4 = parammb4.b[paramInt1];
    int[][] arrayOfInt5 = new int[paramInt2][2];
    int[][] arrayOfInt6 = new int[paramInt2][2];
    g g = new g();
    Image[] arrayOfImage = new Image[paramInt2];
    g.a = i1;
    g.b = i2;
    for (byte b = 0; b < paramInt2; b++) {
      int i7 = 0;
      int i8 = i1;
      int i9 = 0;
      int i10 = i2;
      if (arrayOfInt2[b][0] < 0)
        i7 = arrayOfInt2[b][0]; 
      if (arrayOfInt1[b][0] < i7)
        i7 = arrayOfInt1[b][0]; 
      if (arrayOfInt3[b][0] < i7)
        i7 = arrayOfInt3[b][0]; 
      if (arrayOfInt4[b][0] < i7)
        i7 = arrayOfInt4[b][0]; 
      i7 = Math.abs(i7);
      if (i8 < arrayOfInt2[b][0] + j)
        i8 = arrayOfInt2[b][0] + j; 
      if (i8 < arrayOfInt1[b][0] + k)
        i8 = arrayOfInt1[b][0] + k; 
      if (i8 < arrayOfInt3[b][0] + m)
        i8 = arrayOfInt3[b][0] + m; 
      if (i8 < arrayOfInt4[b][0] + n)
        i8 = arrayOfInt4[b][0] + n; 
      arrayOfInt5[b][0] = -i7;
      arrayOfInt5[b][1] = i1 - i8;
      if (arrayOfInt2[b][1] < 0)
        i9 = arrayOfInt2[b][1]; 
      if (arrayOfInt1[b][1] < i9)
        i9 = arrayOfInt1[b][1]; 
      if (arrayOfInt3[b][1] < i9)
        i9 = arrayOfInt3[b][1]; 
      if (arrayOfInt4[b][1] < i9)
        i9 = arrayOfInt4[b][1]; 
      i9 = Math.abs(i9);
      if (i2 < arrayOfInt2[b][1] + i3)
        i10 = arrayOfInt2[b][1] + i3; 
      if (i10 < arrayOfInt1[b][1] + i4)
        i10 = arrayOfInt1[b][1] + i4; 
      if (i10 < arrayOfInt3[b][1] + i5)
        i10 = arrayOfInt3[b][1] + i5; 
      if (i10 < arrayOfInt4[b][1] + i6)
        i10 = arrayOfInt4[b][1] + i6; 
      arrayOfInt6[b][0] = -i9;
      arrayOfInt6[b][1] = i2 - i10;
      i8 = i7 + i8;
      i10 = i9 + i10;
      Image image;
      Graphics graphics;
      (graphics = (image = Image.createImage(i8, i10)).getGraphics()).setColor(16711935);
      graphics.fillRect(0, 0, i8, i10);
      cw.a(graphics, image2, b * i1, 0, i1, i2, i7, i9, 0);
      if (image3 != null)
        cw.a(graphics, image3, arrayOfByte1[b] * j, 0, j, i3, i7 + arrayOfInt2[b][0], i9 + arrayOfInt2[b][1], 0); 
      if (image1 != null)
        cw.a(graphics, image1, arrayOfByte2[b] * k, 0, k, i4, i7 + arrayOfInt1[b][0], i9 + arrayOfInt1[b][1], 0); 
      if (image5 != null)
        cw.a(graphics, image5, arrayOfByte4[b] * n, 0, n, i6, i7 + arrayOfInt4[b][0], i9 + arrayOfInt4[b][1], 0); 
      if (image4 != null)
        cw.a(graphics, image4, arrayOfByte3[b] * m, 0, m, i5, i7 + arrayOfInt3[b][0], i9 + arrayOfInt3[b][1], 0); 
      int[] arrayOfInt = new int[i8 * i10];
      image.getRGB(arrayOfInt, 0, i8, 0, 0, i8, i10);
      for (i9 = 0; i9 < arrayOfInt.length; i9++) {
        if ((arrayOfInt[i9] & 0xFFFFFF) == 16711935)
          arrayOfInt[i9] = 0; 
      } 
      arrayOfImage[b] = Image.createRGBImage(arrayOfInt, i8, i10, true);
    } 
    ma ma1 = new ma(i, arrayOfImage, arrayOfInt5, arrayOfInt6, paramInt2, g);
    if (paramBoolean)
      a(ma1); 
    return ma1;
  }
  
  private static void a(ma paramma) {
    synchronized (f) {
      for (byte b = 0; b < f.d(); b++) {
        ma ma1;
        if ((ma1 = (ma)f.b(b)).a == paramma.a) {
          f.a(paramma, b);
          return;
        } 
      } 
      f.a(paramma);
      return;
    } 
  }
  
  private static ma c(int paramInt) {
    synchronized (f) {
      for (byte b = 0; b < f.d(); b++) {
        ma ma;
        if ((ma = (ma)f.b(b)).a == paramInt)
          return ma; 
      } 
      return null;
    } 
  }
  
  public static void a() {
    f.a();
  }
  
  public static mg a(lh paramlh, mb parammb1, mb parammb2, mb parammb3, mb parammb4, boolean paramBoolean) {
    ma ma;
    paramlh.b();
    if (!paramlh.ad) {
      ma = a(paramlh, parammb1, parammb2, parammb3, parammb4, 0, 2, paramBoolean);
    } else {
      ma = a(paramlh, (mb)ma, parammb2, parammb3, parammb4, 3, 2, paramBoolean);
    } 
    mg mg = new mg(ma.b, ma.c, ma.d, ma.e);
    if (!paramlh.ad) {
      mg.a(mg.u);
    } else {
      mg.a(mf.s);
    } 
    if (paramlh.ad) {
      mg.d(1);
    } else {
      mg.d(0);
    } 
    return mg;
  }
  
  public static mg b(lh paramlh, mb parammb1, mb parammb2, mb parammb3, mb parammb4, boolean paramBoolean) {
    ma ma = a(paramlh, parammb1, parammb2, parammb3, parammb4, 1, 6, true);
    mg mg;
    (mg = new mg(ma.b, ma.c, ma.d, ma.e)).a(mg.w);
    if (paramlh.ad) {
      mg.d(1);
    } else {
      mg.d(0);
    } 
    return mg;
  }
  
  public static mg c(lh paramlh, mb parammb1, mb parammb2, mb parammb3, mb parammb4, boolean paramBoolean) {
    ma ma = a(paramlh, parammb1, parammb2, parammb3, parammb4, 2, 4, paramBoolean);
    mg mg;
    (mg = new mg(ma.b, ma.c, ma.d, ma.e)).a(mg.v);
    if (paramlh.ad) {
      mg.d(1);
    } else {
      mg.d(0);
    } 
    return mg;
  }
  
  public static mg d(lh paramlh, mb parammb1, mb parammb2, mb parammb3, mb parammb4, boolean paramBoolean) {
    ma ma = a(paramlh, parammb1, parammb2, parammb3, parammb4, 9, 1, true);
    mg mg;
    (mg = new mg(ma.b, ma.c, ma.d, ma.e)).a(mg.z);
    if (paramlh.ad) {
      mg.d(1);
    } else {
      mg.d(0);
    } 
    return mg;
  }
  
  public static mg e(lh paramlh, mb parammb1, mb parammb2, mb parammb3, mb parammb4, boolean paramBoolean) {
    ma ma = a(paramlh, parammb1, parammb2, parammb3, parammb4, 7, 1, true);
    mg mg;
    (mg = new mg(ma.b, ma.c, ma.d, ma.e)).a(mg.x);
    if (paramlh.ad) {
      mg.d(1);
    } else {
      mg.d(0);
    } 
    return mg;
  }
  
  public static mg f(lh paramlh, mb parammb1, mb parammb2, mb parammb3, mb parammb4, boolean paramBoolean) {
    ma ma = a(paramlh, parammb1, parammb2, parammb3, parammb4, 8, 1, true);
    mg mg;
    (mg = new mg(ma.b, ma.c, ma.d, ma.e)).a(mg.y);
    if (paramlh.ad) {
      mg.d(1);
    } else {
      mg.d(0);
    } 
    return mg;
  }
  
  public static mc a(lh paramlh, Image paramImage, mb parammb1, mb parammb2, mb parammb3, mb parammb4, boolean paramBoolean) {
    paramBoolean = paramBoolean;
    byte b = 3;
    b = 6;
    parammb4 = parammb4;
    parammb3 = parammb3;
    parammb2 = parammb2;
    parammb1 = parammb1;
    lh lh1;
    int i;
    ma ma2;
    if ((ma2 = c(i = a(lh1 = paramlh, parammb1, parammb2, parammb3, parammb4, 6))) == null) {
      int j = parammb2.c[6];
      int k = parammb1.c[6];
      int m = parammb3.c[6];
      int n = parammb4.c[6];
      Image image2 = a(99006, lh1.W);
      int i1 = 6;
      mb mb1;
      Image image3 = a((mb1 = parammb2).e + i1, lh1.V, lh1.W);
      i1 = 6;
      Image image1 = a((mb1 = parammb1).e + i1, lh1.U);
      i1 = 6;
      Image image4 = b((mb1 = parammb3).e + i1);
      i1 = 6;
      Image image5 = b((mb1 = parammb4).e + i1);
      i1 = image2.getWidth() / 3;
      j = image3.getWidth() / j;
      m = image4.getWidth() / m;
      n = image5.getWidth() / n;
      k = image1.getWidth() / k;
      int i2 = image2.getHeight();
      int i3 = image3.getHeight();
      int i4 = image1.getHeight();
      int i5 = image4.getHeight();
      int i6 = image5.getHeight();
      byte[] arrayOfByte1 = parammb2.d[6];
      byte[] arrayOfByte2 = parammb1.d[6];
      byte[] arrayOfByte3 = parammb3.d[6];
      byte[] arrayOfByte4 = parammb4.d[6];
      int[][] arrayOfInt2 = parammb2.b[6];
      int[][] arrayOfInt1 = parammb1.b[6];
      int[][] arrayOfInt3 = parammb3.b[6];
      int[][] arrayOfInt4 = parammb4.b[6];
      int[][] arrayOfInt5 = new int[3][2];
      int[][] arrayOfInt6 = new int[3][2];
      g g = new g();
      Image[] arrayOfImage = new Image[3];
      g.a = i1;
      g.b = i2;
      for (byte b1 = 0; b1 < 3; b1++) {
        int i7 = 0;
        int i8 = i1;
        int i9 = 0;
        int i10 = i2;
        if (arrayOfInt2[b1][0] < 0)
          i7 = arrayOfInt2[b1][0]; 
        if (arrayOfInt1[b1][0] < i7)
          i7 = arrayOfInt1[b1][0]; 
        if (arrayOfInt3[b1][0] < i7)
          i7 = arrayOfInt3[b1][0]; 
        if (arrayOfInt4[b1][0] < i7)
          i7 = arrayOfInt4[b1][0]; 
        i7 = Math.abs(i7);
        if (i1 < arrayOfInt2[b1][0] + j)
          i8 = arrayOfInt2[b1][0] + j; 
        if (i8 < arrayOfInt1[b1][0] + k)
          i8 = arrayOfInt1[b1][0] + k; 
        if (i8 < arrayOfInt3[b1][0] + m)
          i8 = arrayOfInt3[b1][0] + m; 
        if (i8 < arrayOfInt4[b1][0] + n)
          i8 = arrayOfInt4[b1][0] + n; 
        arrayOfInt5[b1][0] = -i7;
        arrayOfInt5[b1][1] = i1 - i8;
        if (arrayOfInt2[b1][1] < 0)
          i9 = arrayOfInt2[b1][1]; 
        if (arrayOfInt1[b1][1] < i9)
          i9 = arrayOfInt1[b1][1]; 
        if (arrayOfInt3[b1][1] < i9)
          i9 = arrayOfInt3[b1][1]; 
        if (arrayOfInt4[b1][1] < i9)
          i9 = arrayOfInt4[b1][1]; 
        i9 = Math.abs(i9);
        if (i2 < arrayOfInt2[b1][1] + i3)
          i10 = arrayOfInt2[b1][1] + i3; 
        if (i10 < arrayOfInt1[b1][1] + i4)
          i10 = arrayOfInt1[b1][1] + i4; 
        if (i10 < arrayOfInt3[b1][1] + i5)
          i10 = arrayOfInt3[b1][1] + i5; 
        if (i10 < arrayOfInt4[b1][1] + i6)
          i10 = arrayOfInt4[b1][1] + i6; 
        arrayOfInt6[b1][0] = -i9;
        arrayOfInt6[b1][1] = i2 - i10;
        i8 = i7 + i8;
        i10 = i9 + i10;
        Image image;
        Graphics graphics;
        (graphics = (image = Image.createImage(i8, i10)).getGraphics()).setColor(16711935);
        graphics.fillRect(0, 0, i8, i10);
        cw.a(graphics, image2, b1 * i1, 0, i1, i2, i7, i9, 0);
        if (image3 != null)
          cw.a(graphics, image3, arrayOfByte1[b1] * j, 0, j, i3, i7 + arrayOfInt2[b1][0], i9 + arrayOfInt2[b1][1], 0); 
        if (image1 != null)
          cw.a(graphics, image1, arrayOfByte2[b1] * k, 0, k, i4, i7 + arrayOfInt1[b1][0], i9 + arrayOfInt1[b1][1], 0); 
        if (image5 != null)
          cw.a(graphics, image5, arrayOfByte4[b1] * n, 0, n, i6, i7 + arrayOfInt4[b1][0], i9 + arrayOfInt4[b1][1], 0); 
        if (image4 != null)
          cw.a(graphics, image4, arrayOfByte3[b1] * m, 0, m, i5, i7 + arrayOfInt3[b1][0], i9 + arrayOfInt3[b1][1], 0); 
        int[] arrayOfInt = new int[i8 * i10];
        image.getRGB(arrayOfInt, 0, i8, 0, 0, i8, i10);
        for (i9 = 0; i9 < arrayOfInt.length; i9++) {
          if ((arrayOfInt[i9] & 0xFFFFFF) == 16711935)
            arrayOfInt[i9] = 0; 
        } 
        arrayOfImage[b1] = Image.createRGBImage(arrayOfInt, i8, i10, true);
      } 
      ma2 = new ma(i, arrayOfImage, arrayOfInt5, arrayOfInt6, 3, g);
      if (paramBoolean)
        a(ma2); 
    } 
    ma ma1 = ma2;
    mc mc;
    (mc = new mc(ma1.b, ma1.c, ma1.d, ma1.e, paramImage)).a(mc.s);
    return mc;
  }
  
  public static mf g(lh paramlh, mb parammb1, mb parammb2, mb parammb3, mb parammb4, boolean paramBoolean) {
    ma ma = a(paramlh, parammb1, parammb2, parammb3, parammb4, 3, 2, true);
    mf mf;
    (mf = new mf(ma.b, ma.c, ma.d, ma.e)).a(mf.s);
    return mf;
  }
  
  public static me h(lh paramlh, mb parammb1, mb parammb2, mb parammb3, mb parammb4, boolean paramBoolean) {
    ma ma = a(paramlh, parammb1, parammb2, parammb3, parammb4, 4, 3, paramBoolean);
    me me;
    (me = new me(ma.b, ma.c, ma.d, ma.e)).a(me.s);
    return me;
  }
  
  public static md i(lh paramlh, mb parammb1, mb parammb2, mb parammb3, mb parammb4, boolean paramBoolean) {
    paramBoolean = true;
    byte b = 4;
    b = 5;
    parammb4 = parammb4;
    parammb3 = parammb3;
    parammb2 = parammb2;
    parammb1 = parammb1;
    lh lh1;
    int i;
    ma ma2;
    if ((ma2 = c(i = a(lh1 = paramlh, parammb1, parammb2, parammb3, parammb4, 5))) == null) {
      int j = parammb2.c[5];
      int k = parammb1.c[5];
      int m = parammb3.c[5];
      int n = parammb4.c[5];
      Image image2 = a(99005, lh1.W);
      int i1 = 5;
      mb mb1;
      Image image3 = a((mb1 = parammb2).e + i1, lh1.V, lh1.W);
      i1 = 5;
      Image image1 = a((mb1 = parammb1).e + i1, lh1.U);
      i1 = 5;
      Image image4 = b((mb1 = parammb3).e + i1);
      i1 = 5;
      Image image5 = b((mb1 = parammb4).e + i1);
      i1 = image2.getWidth() / 4;
      j = image3.getWidth() / j;
      m = image4.getWidth() / m;
      n = image5.getWidth() / n;
      k = image1.getWidth() / k;
      int i2 = image2.getHeight();
      int i3 = image3.getHeight();
      int i4 = image1.getHeight();
      int i5 = image4.getHeight();
      int i6 = image5.getHeight();
      byte[] arrayOfByte1 = parammb2.d[5];
      byte[] arrayOfByte2 = parammb1.d[5];
      byte[] arrayOfByte3 = parammb3.d[5];
      byte[] arrayOfByte4 = parammb4.d[5];
      int[][] arrayOfInt2 = parammb2.b[5];
      int[][] arrayOfInt1 = parammb1.b[5];
      int[][] arrayOfInt3 = parammb3.b[5];
      int[][] arrayOfInt4 = parammb4.b[5];
      int[][] arrayOfInt5 = new int[4][2];
      int[][] arrayOfInt6 = new int[4][2];
      g g = new g();
      Image[] arrayOfImage = new Image[4];
      g.a = i1;
      g.b = i2;
      for (byte b1 = 0; b1 < 4; b1++) {
        int i7 = 0;
        int i8 = i1;
        int i9 = 0;
        int i10 = i2;
        if (arrayOfInt2[b1][0] < 0)
          i7 = arrayOfInt2[b1][0]; 
        if (arrayOfInt1[b1][0] < i7)
          i7 = arrayOfInt1[b1][0]; 
        if (arrayOfInt3[b1][0] < i7)
          i7 = arrayOfInt3[b1][0]; 
        if (arrayOfInt4[b1][0] < i7)
          i7 = arrayOfInt4[b1][0]; 
        i7 = Math.abs(i7);
        if (i1 < arrayOfInt2[b1][0] + j)
          i8 = arrayOfInt2[b1][0] + j; 
        if (i8 < arrayOfInt1[b1][0] + k)
          i8 = arrayOfInt1[b1][0] + k; 
        if (i8 < arrayOfInt3[b1][0] + m)
          i8 = arrayOfInt3[b1][0] + m; 
        if (i8 < arrayOfInt4[b1][0] + n)
          i8 = arrayOfInt4[b1][0] + n; 
        arrayOfInt5[b1][0] = -i7;
        arrayOfInt5[b1][1] = i1 - i8;
        if (arrayOfInt2[b1][1] < 0)
          i9 = arrayOfInt2[b1][1]; 
        if (arrayOfInt1[b1][1] < i9)
          i9 = arrayOfInt1[b1][1]; 
        if (arrayOfInt3[b1][1] < i9)
          i9 = arrayOfInt3[b1][1]; 
        if (arrayOfInt4[b1][1] < i9)
          i9 = arrayOfInt4[b1][1]; 
        i9 = Math.abs(i9);
        if (i2 < arrayOfInt2[b1][1] + i3)
          i10 = arrayOfInt2[b1][1] + i3; 
        if (i10 < arrayOfInt1[b1][1] + i4)
          i10 = arrayOfInt1[b1][1] + i4; 
        if (i10 < arrayOfInt3[b1][1] + i5)
          i10 = arrayOfInt3[b1][1] + i5; 
        if (i10 < arrayOfInt4[b1][1] + i6)
          i10 = arrayOfInt4[b1][1] + i6; 
        arrayOfInt6[b1][0] = -i9;
        arrayOfInt6[b1][1] = i2 - i10;
        i8 = i7 + i8;
        i10 = i9 + i10;
        Image image;
        Graphics graphics;
        (graphics = (image = Image.createImage(i8, i10)).getGraphics()).setColor(16711935);
        graphics.fillRect(0, 0, i8, i10);
        cw.a(graphics, image2, b1 * i1, 0, i1, i2, i7, i9, 0);
        if (image3 != null)
          cw.a(graphics, image3, arrayOfByte1[b1] * j, 0, j, i3, i7 + arrayOfInt2[b1][0], i9 + arrayOfInt2[b1][1], 0); 
        if (image1 != null)
          cw.a(graphics, image1, arrayOfByte2[b1] * k, 0, k, i4, i7 + arrayOfInt1[b1][0], i9 + arrayOfInt1[b1][1], 0); 
        if (image5 != null)
          cw.a(graphics, image5, arrayOfByte4[b1] * n, 0, n, i6, i7 + arrayOfInt4[b1][0], i9 + arrayOfInt4[b1][1], 0); 
        if (image4 != null)
          cw.a(graphics, image4, arrayOfByte3[b1] * m, 0, m, i5, i7 + arrayOfInt3[b1][0], i9 + arrayOfInt3[b1][1], 0); 
        int[] arrayOfInt = new int[i8 * i10];
        image.getRGB(arrayOfInt, 0, i8, 0, 0, i8, i10);
        for (i9 = 0; i9 < arrayOfInt.length; i9++) {
          if ((arrayOfInt[i9] & 0xFFFFFF) == 16711935)
            arrayOfInt[i9] = 0; 
        } 
        arrayOfImage[b1] = Image.createRGBImage(arrayOfInt, i8, i10, true);
      } 
      ma2 = new ma(i, arrayOfImage, arrayOfInt5, arrayOfInt6, 4, g);
      if (paramBoolean)
        a(ma2); 
    } 
    ma ma1 = ma2;
    md md;
    (md = new md(ma1.b, ma1.c, ma1.d, ma1.e)).a(md.s);
    return md;
  }
  
  public static mb[] a(lh paramlh) {
    int i;
    int[] arrayOfInt = null;
    if ((paramlh = paramlh).D != null) {
      arrayOfInt = new int[4];
      for (i = 0; i < paramlh.D.length; i++) {
        ll ll;
        if ((ll = paramlh.D[i]).e < 4) {
          int k;
          arrayOfInt[ll.e] = (k = (ll = ll).n) - k % 10;
        } 
      } 
    } else {
      ct.a("[BodyPartLoader.loadMetadata()] charaterInfo.equipments is Null");
      return new mb[0];
    } 
    mb[] arrayOfMb;
    (arrayOfMb = new mb[4])[1] = new mb(paramlh.V.a + 99);
    int j = paramlh.U.a + 99;
    if (paramlh.f == 1) {
      i = 79999;
    } else {
      i = 79899;
    } 
    if (arrayOfInt[0] > 0 && !paramlh.Z) {
      arrayOfMb[0] = new mb(arrayOfInt[0] + 99);
    } else {
      arrayOfMb[0] = new mb(j);
    } 
    if (arrayOfInt[1] > 0) {
      arrayOfMb[2] = new mb(arrayOfInt[1] + 99);
    } else {
      arrayOfMb[2] = new mb(i);
    } 
    if (arrayOfInt[2] > 0) {
      arrayOfMb[3] = new mb(arrayOfInt[2] + 99);
    } else {
      arrayOfMb[3] = new mb(89999);
    } 
    return arrayOfMb;
  }
  
  public static mg a(lh paramlh, boolean paramBoolean) {
    mb[] arrayOfMb = a(paramlh);
    return a(paramlh, arrayOfMb[0], arrayOfMb[1], arrayOfMb[3], arrayOfMb[2], false);
  }
  
  private static StringBuffer a(StringBuffer paramStringBuffer, int[] paramArrayOfint) {
    if (paramArrayOfint != null && paramArrayOfint.length > 0)
      for (byte b = 0; b < paramArrayOfint.length; b++)
        paramStringBuffer.append(paramArrayOfint[b]);  
    return paramStringBuffer;
  }
  
  private static int a(lh paramlh, mb parammb1, mb parammb2, mb parammb3, mb parammb4, int paramInt) {
    StringBuffer stringBuffer;
    (stringBuffer = new StringBuffer(100)).append(paramInt).append(':');
    a(stringBuffer, paramlh.W.e.c).append(':');
    if (parammb2 != null) {
      int i = paramInt;
      stringBuffer.append((parammb2 = parammb2).e + i).append(':');
      if (paramlh.V != null)
        a(stringBuffer, paramlh.V.e.c).append(':'); 
    } 
    if (parammb1 != null) {
      int i = paramInt;
      stringBuffer.append((parammb2 = parammb1).e + i).append(':');
      if (paramlh.U != null)
        a(stringBuffer, paramlh.U.e.c).append(':'); 
    } 
    if (parammb3 != null) {
      int i = paramInt;
      stringBuffer.append((parammb2 = parammb3).e + i).append(':');
    } 
    if (parammb4 != null) {
      int i = paramInt;
      stringBuffer.append((parammb2 = parammb4).e + i).append(':');
    } 
    String str;
    return (str = stringBuffer.toString()).hashCode();
  }
  
  public static int a(ll paramll) {
    int i;
    return (i = paramll.n) - i % 10;
  }
  
  public static int a(int paramInt) {
    return (paramInt = paramInt) - paramInt % 10 + 98;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\mb.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */