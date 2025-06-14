public final class h {
  private static int[] a = new int[360];
  
  private static int b = 1;
  
  private static int c = 2;
  
  private static int d = 4;
  
  private static int e = 8;
  
  private static int f = 16;
  
  private static int g = 32;
  
  private static byte[] a(int paramInt) {
    byte[] arrayOfByte;
    (arrayOfByte = new byte[3])[0] = (byte)(paramInt >> 16 & 0xFF);
    arrayOfByte[1] = (byte)(paramInt >> 8 & 0xFF);
    arrayOfByte[2] = (byte)paramInt;
    return arrayOfByte;
  }
  
  private static int a(byte paramByte1, byte paramByte2, byte paramByte3) {
    byte[] arrayOfByte;
    return m.c(arrayOfByte = new byte[] { 0, paramByte1, paramByte2, paramByte3 });
  }
  
  public static boolean a(byte[] paramArrayOfbyte, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    if (paramArrayOfint1 != null && paramArrayOfint2 != null) {
      boolean bool1 = false;
      for (byte b = 0; b < paramArrayOfint1.length; b++) {
        if (paramArrayOfint1[b] != paramArrayOfint2[b]) {
          bool1 = true;
          break;
        } 
      } 
      if (!bool1)
        return false; 
    } 
    boolean bool = false;
    int i = 0;
    int j = 0;
    try {
      int k = 0;
      int m = paramArrayOfbyte.length - 4;
      while (k < m) {
        if (paramArrayOfbyte[k] == 80 && paramArrayOfbyte[k + 1] == 76 && paramArrayOfbyte[k + 2] == 84 && paramArrayOfbyte[k + 3] == 69) {
          j = k;
          i = m.a(paramArrayOfbyte[k - 4], paramArrayOfbyte[k - 3], paramArrayOfbyte[k - 2], paramArrayOfbyte[k - 1]);
          break;
        } 
        k++;
      } 
      k = -1;
      try {
        m = j + 12 + i;
        if (paramArrayOfbyte[m] == 116 && paramArrayOfbyte[m + 1] == 82 && paramArrayOfbyte[m + 2] == 78 && paramArrayOfbyte[m + 3] == 83) {
          k = m.a(paramArrayOfbyte[m - 4], paramArrayOfbyte[m - 3], paramArrayOfbyte[m - 2], paramArrayOfbyte[m - 1]);
          k--;
        } 
      } catch (Exception exception) {
        k = -1;
      } 
      if (k >= 0) {
        m = 0;
        int n = j + 4;
        int i1 = i + j + 4;
        while (n < i1) {
          byte b3 = paramArrayOfbyte[n];
          byte b4 = paramArrayOfbyte[n + 1];
          byte b5 = paramArrayOfbyte[n + 2];
          if (b3 == 255 && b4 == 255 && b5 == 255)
            m++; 
          n += 3;
        } 
        if (m < 2)
          k = -1; 
      } 
      boolean[] arrayOfBoolean = new boolean[i / 3];
      byte b2;
      for (b2 = 0; b2 < arrayOfBoolean.length; b2++)
        arrayOfBoolean[b2] = true; 
      for (b2 = 0; b2 < paramArrayOfint1.length; b2++) {
        byte b4 = (byte)(paramArrayOfint1[b2] >> 16 & 0xFF);
        byte b3 = (byte)(paramArrayOfint1[b2] >> 8 & 0xFF);
        byte b5 = (byte)paramArrayOfint1[b2];
        int n = j + 4;
        int i1 = n;
        int i2 = i + n;
        while (i1 < i2) {
          if ((i1 - n) / 3 != k && arrayOfBoolean[(i1 - n) / 3] && paramArrayOfbyte[i1] == b4 && paramArrayOfbyte[i1 + 1] == b3 && paramArrayOfbyte[i1 + 2] == b5) {
            paramArrayOfbyte[i1] = (byte)(paramArrayOfint2[b2] >> 16 & 0xFF);
            paramArrayOfbyte[i1 + 1] = (byte)(paramArrayOfint2[b2] >> 8 & 0xFF);
            paramArrayOfbyte[i1 + 2] = (byte)paramArrayOfint2[b2];
            arrayOfBoolean[(i1 - n) / 3] = false;
            bool = true;
          } 
          i1 += 3;
        } 
      } 
      byte[] arrayOfByte = new byte[i + 4];
      for (b2 = 0; b2 < i + 4; b2++)
        arrayOfByte[b2] = paramArrayOfbyte[j + b2]; 
      e.a();
      long l = e.a(arrayOfByte);
      for (byte b1 = 3; b1 >= 0; b1--) {
        byte b = (byte)(int)(l >> b1 * 8 & 0xFFL);
        paramArrayOfbyte[j + 4 + i + 3 - b1] = b;
      } 
      return bool;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return false;
    } 
  }
  
  public static void a(byte[] paramArrayOfbyte, int paramInt) {
    if (paramInt == 0)
      return; 
    int i = 0;
    int j = 0;
    try {
      int k = 0;
      int m = paramArrayOfbyte.length - 4;
      while (k < m) {
        if (paramArrayOfbyte[k] == 80 && paramArrayOfbyte[k + 1] == 76 && paramArrayOfbyte[k + 2] == 84 && paramArrayOfbyte[k + 3] == 69) {
          j = k;
          i = m.a(paramArrayOfbyte[k - 4], paramArrayOfbyte[k - 3], paramArrayOfbyte[k - 2], paramArrayOfbyte[k - 1]);
          break;
        } 
        k++;
      } 
      k = -1;
      try {
        m = j + 12 + i;
        if (paramArrayOfbyte[m] == 116 && paramArrayOfbyte[m + 1] == 82 && paramArrayOfbyte[m + 2] == 78 && paramArrayOfbyte[m + 3] == 83) {
          k = m.a(paramArrayOfbyte[m - 4], paramArrayOfbyte[m - 3], paramArrayOfbyte[m - 2], paramArrayOfbyte[m - 1]);
          k--;
        } 
      } catch (Exception exception) {
        k = -1;
      } 
      if (k >= 0) {
        m = 0;
        int i2 = j + 4;
        int i1 = i + j + 4;
        while (i2 < i1) {
          byte b1 = paramArrayOfbyte[i2];
          byte b2 = paramArrayOfbyte[i2 + 1];
          byte b3 = paramArrayOfbyte[i2 + 2];
          if (b1 == 255 && b2 == 255 && b3 == 255)
            m++; 
          i2 += 3;
        } 
        if (m < 2)
          k = -1; 
      } 
      m = j + 4;
      int n = j + 4 + i;
      while (m < n) {
        if (m != k) {
          byte b1 = paramArrayOfbyte[m];
          byte b2 = paramArrayOfbyte[m + 1];
          byte b3 = paramArrayOfbyte[m + 2];
          int i2 = paramInt;
          int i1;
          int i3 = (i1 = a(b1, b2, b3)) >> 16 & 0xFF;
          int i4 = i1 >> 8 & 0xFF;
          int i5 = i1 & 0xFF;
          int i6 = 0;
          int i7 = 0;
          i1 = 0;
          if (i3 >= i4 && i4 >= i5) {
            i6 = i3;
            i7 = i5;
            if ((i1 = 60 * (i4 - i5) / (i3 - i5)) < 0 || i1 > 60)
              System.out.println("Co van de khi tinh goc hien tại o truong hop 1"); 
          } else if (i4 > i3 && i3 >= i5) {
            i6 = i4;
            i7 = i5;
            if ((i1 = 120 - 60 * (i3 - i5) / (i4 - i5)) < 60 || i1 > 120)
              System.out.println("Co van de khi tinh goc hien tại o truong hop 2"); 
          } else if (i4 >= i5 && i5 > i3) {
            i6 = i4;
            i7 = i3;
            if ((i1 = 120 + 60 * (i5 - i3) / (i4 - i3)) < 120 || i1 > 180)
              System.out.println("Co van de khi tinh goc hien tại o truong hop 3"); 
          } else if (i5 > i4 && i4 > i3) {
            i6 = i5;
            i7 = i3;
            if ((i1 = 240 - 60 * (i4 - i3) / (i5 - i3)) < 180 || i1 > 240)
              System.out.println("Co van de khi tinh goc hien tại o truong hop 4"); 
          } else if (i5 > i3 && i3 >= i4) {
            i6 = i5;
            i7 = i4;
            if ((i1 = 240 + 60 * (i3 - i4) / (i5 - i4)) < 240 || i1 > 320)
              System.out.println("Co van de khi tinh goc hien tại o truong hop 5"); 
          } else {
            i6 = i3;
            i7 = i4;
            if (i3 >= i5 && i5 > i4 && ((i1 = 360 - 60 * (i5 - i4) / (i3 - i4)) < 320 || i1 > 360))
              System.out.println("Co van de khi tinh goc hien tại o truong hop 6"); 
          } 
          i1 = (i1 + i2 + 360) % 360;
          i2 = 0;
          i3 = 0;
          i4 = 0;
          if (i1 >= 0 && i1 < 60) {
            i2 = i6;
            i4 = i7;
            i3 = i1 * (i2 - i4) / 60 + i4;
          } else if (60 <= i1 && i1 < 120) {
            i3 = i6;
            i4 = i7;
            i2 = (i1 - 120) * (i4 - i3) / 60 + i4;
          } else if (120 <= i1 && i1 < 180) {
            i3 = i6;
            i2 = i7;
            i4 = (i1 - 120) * (i3 - i2) / 60 + i2;
          } else if (180 <= i1 && i1 < 240) {
            i4 = i6;
            i2 = i7;
            i3 = (i1 - 240) * (i2 - i4) / 60 + i2;
          } else if (240 <= i1 && i1 < 300) {
            i4 = i6;
            i3 = i7;
            i2 = (i1 - 240) * (i4 - i3) / 60 + i3;
          } else if (300 <= i1 && i1 < 360) {
            i2 = i6;
            i3 = i7;
            i4 = (i1 - 360) * (i3 - i2) / 60 + i3;
          } 
          byte[] arrayOfByte1 = a((i3 == i4 && i4 == i5) ? i1 : (i1 = (i1 = (i1 = 0x0 | i2 << 16) | i3 << 8) | i4));
          paramArrayOfbyte[m] = arrayOfByte1[0];
          paramArrayOfbyte[m + 1] = arrayOfByte1[1];
          paramArrayOfbyte[m + 2] = arrayOfByte1[2];
        } 
        m += 3;
      } 
      byte[] arrayOfByte = new byte[i + 4];
      for (m = 0; m < i + 4; m++)
        arrayOfByte[m] = paramArrayOfbyte[j + m]; 
      e.a();
      long l = e.a(arrayOfByte);
      for (byte b = 3; b >= 0; b--) {
        byte b1 = (byte)(int)(l >> b * 8 & 0xFFL);
        paramArrayOfbyte[j + 4 + i + 3 - b] = b1;
      } 
      return;
    } catch (Exception exception) {
      System.out.println("Co loi trong qua trinh HUE 1 file PNG");
      exception.printStackTrace();
      return;
    } 
  }
  
  public static void b(byte[] paramArrayOfbyte, int paramInt) {
    if (paramInt == 0)
      return; 
    int i = 0;
    int j = 0;
    try {
      int k = 0;
      int m = paramArrayOfbyte.length - 4;
      while (k < m) {
        if (paramArrayOfbyte[k] == 80 && paramArrayOfbyte[k + 1] == 76 && paramArrayOfbyte[k + 2] == 84 && paramArrayOfbyte[k + 3] == 69) {
          j = k;
          i = m.a(paramArrayOfbyte[k - 4], paramArrayOfbyte[k - 3], paramArrayOfbyte[k - 2], paramArrayOfbyte[k - 1]);
          break;
        } 
        k++;
      } 
      k = -1;
      try {
        m = j + 12 + i;
        if (paramArrayOfbyte[m] == 116 && paramArrayOfbyte[m + 1] == 82 && paramArrayOfbyte[m + 2] == 78 && paramArrayOfbyte[m + 3] == 83) {
          k = m.a(paramArrayOfbyte[m - 4], paramArrayOfbyte[m - 3], paramArrayOfbyte[m - 2], paramArrayOfbyte[m - 1]);
          k--;
        } 
      } catch (Exception exception) {
        k = -1;
      } 
      if (k >= 0) {
        m = 0;
        int i2 = j + 4;
        int i1 = i + j + 4;
        while (i2 < i1) {
          byte b1 = paramArrayOfbyte[i2];
          byte b2 = paramArrayOfbyte[i2 + 1];
          byte b3 = paramArrayOfbyte[i2 + 2];
          if (b1 == 255 && b2 == 255 && b3 == 255)
            m++; 
          i2 += 3;
        } 
        if (m < 2)
          k = -1; 
      } 
      m = j + 4;
      int n = j + 4 + i;
      while (m < n) {
        if (m != k) {
          byte b1 = paramArrayOfbyte[m];
          byte b2 = paramArrayOfbyte[m + 1];
          byte b3 = paramArrayOfbyte[m + 2];
          int i2 = paramInt;
          int i1 = a(b1, b2, b3);
          int i3 = i1 >> 16 & 0xFF;
          int i4 = i1 >> 8 & 0xFF;
          i1 &= 0xFF;
          if (i2 < 0) {
            i3 = i3 * (i2 + 100) / 100;
            i4 = i4 * (i2 + 100) / 100;
            i1 = i1 * (i2 + 100) / 100;
          } else {
            i3 += (255 - i3) * i2 / 100;
            i4 += (255 - i4) * i2 / 100;
            i1 += (255 - i1) * i2 / 100;
          } 
          byte[] arrayOfByte1 = a((i2 <= -100) ? 0 : ((i2 >= 100) ? 16777215 : (i2 = (i2 = (i2 = 0x0 | i3 << 16) | i4 << 8) | i1)));
          paramArrayOfbyte[m] = arrayOfByte1[0];
          paramArrayOfbyte[m + 1] = arrayOfByte1[1];
          paramArrayOfbyte[m + 2] = arrayOfByte1[2];
        } 
        m += 3;
      } 
      byte[] arrayOfByte = new byte[i + 4];
      for (m = 0; m < i + 4; m++)
        arrayOfByte[m] = paramArrayOfbyte[j + m]; 
      e.a();
      long l = e.a(arrayOfByte);
      for (byte b = 3; b >= 0; b--) {
        byte b1 = (byte)(int)(l >> b * 8 & 0xFFL);
        paramArrayOfbyte[j + 4 + i + 3 - b] = b1;
      } 
      return;
    } catch (Exception exception) {
      System.out.println("Co loi trong qua trinh HUE 1 file PNG");
      exception.printStackTrace();
      return;
    } 
  }
  
  public static void a(byte[] paramArrayOfbyte) {
    int i = 0;
    int j = 0;
    try {
      int k = 0;
      int m = paramArrayOfbyte.length - 4;
      while (k < m) {
        if (paramArrayOfbyte[k] == 80 && paramArrayOfbyte[k + 1] == 76 && paramArrayOfbyte[k + 2] == 84 && paramArrayOfbyte[k + 3] == 69) {
          j = k;
          i = m.a(paramArrayOfbyte[k - 4], paramArrayOfbyte[k - 3], paramArrayOfbyte[k - 2], paramArrayOfbyte[k - 1]);
          break;
        } 
        k++;
      } 
      k = -1;
      try {
        m = j + 12 + i;
        if (paramArrayOfbyte[m] == 116 && paramArrayOfbyte[m + 1] == 82 && paramArrayOfbyte[m + 2] == 78 && paramArrayOfbyte[m + 3] == 83) {
          k = m.a(paramArrayOfbyte[m - 4], paramArrayOfbyte[m - 3], paramArrayOfbyte[m - 2], paramArrayOfbyte[m - 1]);
          k--;
        } 
      } catch (Exception exception) {
        k = -1;
      } 
      if (k >= 0) {
        m = 0;
        int i2 = j + 4;
        int i1 = i + j + 4;
        while (i2 < i1) {
          byte b1 = paramArrayOfbyte[i2];
          byte b2 = paramArrayOfbyte[i2 + 1];
          byte b3 = paramArrayOfbyte[i2 + 2];
          if (b1 == 255 && b2 == 255 && b3 == 255)
            m++; 
          i2 += 3;
        } 
        if (m < 2)
          k = -1; 
      } 
      m = j + 4;
      int n = j + 4 + i;
      while (m < n) {
        if (k != m) {
          byte b1 = paramArrayOfbyte[m];
          byte b2 = paramArrayOfbyte[m + 1];
          byte b3 = paramArrayOfbyte[m + 2];
          int i1;
          int i2 = (i1 = a(b1, b2, b3)) >> 16 & 0xFF;
          int i3 = i1 >> 8 & 0xFF;
          i1 &= 0xFF;
          i3 = i2 = (i2 + i3 + i1) / 3;
          i1 = i2;
          byte[] arrayOfByte1 = a(i2 = (i2 = (i2 = 0x0 | i2 << 16) | i3 << 8) | i1);
          paramArrayOfbyte[m] = arrayOfByte1[0];
          paramArrayOfbyte[m + 1] = arrayOfByte1[1];
          paramArrayOfbyte[m + 2] = arrayOfByte1[2];
        } 
        m += 3;
      } 
      byte[] arrayOfByte = new byte[i + 4];
      for (m = 0; m < i + 4; m++)
        arrayOfByte[m] = paramArrayOfbyte[j + m]; 
      e.a();
      long l = e.a(arrayOfByte);
      for (byte b = 3; b >= 0; b--) {
        byte b1 = (byte)(int)(l >> b * 8 & 0xFFL);
        paramArrayOfbyte[j + 4 + i + 3 - b] = b1;
      } 
      return;
    } catch (Exception exception) {
      System.out.println("Co loi trong qua trinh GRAY 1 file PNG");
      exception.printStackTrace();
      return;
    } 
  }
  
  static {
    (new char[16])[0] = '0';
    (new char[16])[1] = '1';
    (new char[16])[2] = '2';
    (new char[16])[3] = '3';
    (new char[16])[4] = '4';
    (new char[16])[5] = '5';
    (new char[16])[6] = '6';
    (new char[16])[7] = '7';
    (new char[16])[8] = '8';
    (new char[16])[9] = '9';
    (new char[16])[10] = 'A';
    (new char[16])[11] = 'B';
    (new char[16])[12] = 'C';
    (new char[16])[13] = 'D';
    (new char[16])[14] = 'E';
    (new char[16])[15] = 'F';
  }
  
  static {
    byte b;
    for (b = 0; b <= 60; b++) {
      byte b1 = (byte)(b * 255 / 60);
      a[b + 0] = a((byte)-1, b1, (byte)0);
    } 
    for (b = 0; b <= 60; b++) {
      byte b1 = (byte)(255 - b * 255 / 60);
      a[b + 60] = a(b1, (byte)-1, (byte)0);
    } 
    for (b = 0; b <= 60; b++) {
      byte b1 = (byte)(b * 255 / 60);
      a[b + 120] = a((byte)0, (byte)-1, b1);
    } 
    for (b = 0; b <= 60; b++) {
      byte b1 = (byte)(255 - b * 255 / 60);
      a[b + 180] = a((byte)0, b1, (byte)-1);
    } 
    for (b = 0; b <= 60; b++) {
      byte b1 = (byte)(b * 255 / 60);
      a[b + 240] = a(b1, (byte)0, (byte)-1);
    } 
    for (b = 0; b < 60; b++) {
      byte b1 = (byte)(255 - b * 255 / 60);
      a[b + 300] = a((byte)-1, (byte)0, b1);
    } 
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\h.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */