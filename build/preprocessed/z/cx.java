public final class cx {
  private cy a = new cy();
  
  private cy b = null;
  
  private static byte[] c = new byte[] { Byte.MIN_VALUE };
  
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
    (new char[16])[10] = 'a';
    (new char[16])[11] = 'b';
    (new char[16])[12] = 'c';
    (new char[16])[13] = 'd';
    (new char[16])[14] = 'e';
    (new char[16])[15] = 'f';
  }
  
  private void a(cy paramcy, byte[] paramArrayOfbyte, int paramInt, int[] paramArrayOfint) {
    int i = paramcy.a[0];
    int j = paramcy.a[1];
    int k = paramcy.a[2];
    int m = paramcy.a[3];
    int[] arrayOfInt = paramArrayOfint;
    paramArrayOfint = paramArrayOfint;
    paramInt = paramInt;
    paramArrayOfbyte = paramArrayOfbyte;
    paramArrayOfint[0] = paramArrayOfbyte[paramInt] & 0xFF | (paramArrayOfbyte[paramInt + 1] & 0xFF) << 8 | (paramArrayOfbyte[paramInt + 2] & 0xFF) << 16 | paramArrayOfbyte[paramInt + 3] << 24;
    paramArrayOfint[1] = paramArrayOfbyte[paramInt + 4] & 0xFF | (paramArrayOfbyte[paramInt + 5] & 0xFF) << 8 | (paramArrayOfbyte[paramInt + 6] & 0xFF) << 16 | paramArrayOfbyte[paramInt + 7] << 24;
    paramArrayOfint[2] = paramArrayOfbyte[paramInt + 8] & 0xFF | (paramArrayOfbyte[paramInt + 9] & 0xFF) << 8 | (paramArrayOfbyte[paramInt + 10] & 0xFF) << 16 | paramArrayOfbyte[paramInt + 11] << 24;
    paramArrayOfint[3] = paramArrayOfbyte[paramInt + 12] & 0xFF | (paramArrayOfbyte[paramInt + 13] & 0xFF) << 8 | (paramArrayOfbyte[paramInt + 14] & 0xFF) << 16 | paramArrayOfbyte[paramInt + 15] << 24;
    paramArrayOfint[4] = paramArrayOfbyte[paramInt + 16] & 0xFF | (paramArrayOfbyte[paramInt + 17] & 0xFF) << 8 | (paramArrayOfbyte[paramInt + 18] & 0xFF) << 16 | paramArrayOfbyte[paramInt + 19] << 24;
    paramArrayOfint[5] = paramArrayOfbyte[paramInt + 20] & 0xFF | (paramArrayOfbyte[paramInt + 21] & 0xFF) << 8 | (paramArrayOfbyte[paramInt + 22] & 0xFF) << 16 | paramArrayOfbyte[paramInt + 23] << 24;
    paramArrayOfint[6] = paramArrayOfbyte[paramInt + 24] & 0xFF | (paramArrayOfbyte[paramInt + 25] & 0xFF) << 8 | (paramArrayOfbyte[paramInt + 26] & 0xFF) << 16 | paramArrayOfbyte[paramInt + 27] << 24;
    paramArrayOfint[7] = paramArrayOfbyte[paramInt + 28] & 0xFF | (paramArrayOfbyte[paramInt + 29] & 0xFF) << 8 | (paramArrayOfbyte[paramInt + 30] & 0xFF) << 16 | paramArrayOfbyte[paramInt + 31] << 24;
    paramArrayOfint[8] = paramArrayOfbyte[paramInt + 32] & 0xFF | (paramArrayOfbyte[paramInt + 33] & 0xFF) << 8 | (paramArrayOfbyte[paramInt + 34] & 0xFF) << 16 | paramArrayOfbyte[paramInt + 35] << 24;
    paramArrayOfint[9] = paramArrayOfbyte[paramInt + 36] & 0xFF | (paramArrayOfbyte[paramInt + 37] & 0xFF) << 8 | (paramArrayOfbyte[paramInt + 38] & 0xFF) << 16 | paramArrayOfbyte[paramInt + 39] << 24;
    paramArrayOfint[10] = paramArrayOfbyte[paramInt + 40] & 0xFF | (paramArrayOfbyte[paramInt + 41] & 0xFF) << 8 | (paramArrayOfbyte[paramInt + 42] & 0xFF) << 16 | paramArrayOfbyte[paramInt + 43] << 24;
    paramArrayOfint[11] = paramArrayOfbyte[paramInt + 44] & 0xFF | (paramArrayOfbyte[paramInt + 45] & 0xFF) << 8 | (paramArrayOfbyte[paramInt + 46] & 0xFF) << 16 | paramArrayOfbyte[paramInt + 47] << 24;
    paramArrayOfint[12] = paramArrayOfbyte[paramInt + 48] & 0xFF | (paramArrayOfbyte[paramInt + 49] & 0xFF) << 8 | (paramArrayOfbyte[paramInt + 50] & 0xFF) << 16 | paramArrayOfbyte[paramInt + 51] << 24;
    paramArrayOfint[13] = paramArrayOfbyte[paramInt + 52] & 0xFF | (paramArrayOfbyte[paramInt + 53] & 0xFF) << 8 | (paramArrayOfbyte[paramInt + 54] & 0xFF) << 16 | paramArrayOfbyte[paramInt + 55] << 24;
    paramArrayOfint[14] = paramArrayOfbyte[paramInt + 56] & 0xFF | (paramArrayOfbyte[paramInt + 57] & 0xFF) << 8 | (paramArrayOfbyte[paramInt + 58] & 0xFF) << 16 | paramArrayOfbyte[paramInt + 59] << 24;
    paramArrayOfint[15] = paramArrayOfbyte[paramInt + 60] & 0xFF | (paramArrayOfbyte[paramInt + 61] & 0xFF) << 8 | (paramArrayOfbyte[paramInt + 62] & 0xFF) << 16 | paramArrayOfbyte[paramInt + 63] << 24;
    i = ((i += (j & k | (j ^ 0xFFFFFFFF) & m) + arrayOfInt[0] + -680876936) << 7 | i >>> 25) + j;
    m = ((m += (i & j | (i ^ 0xFFFFFFFF) & k) + arrayOfInt[1] + -389564586) << 12 | m >>> 20) + i;
    k = ((k += (m & i | (m ^ 0xFFFFFFFF) & j) + arrayOfInt[2] + 606105819) << 17 | k >>> 15) + m;
    j = ((j += (k & m | (k ^ 0xFFFFFFFF) & i) + arrayOfInt[3] + -1044525330) << 22 | j >>> 10) + k;
    i = ((i += (j & k | (j ^ 0xFFFFFFFF) & m) + arrayOfInt[4] + -176418897) << 7 | i >>> 25) + j;
    m = ((m += (i & j | (i ^ 0xFFFFFFFF) & k) + arrayOfInt[5] + 1200080426) << 12 | m >>> 20) + i;
    k = ((k += (m & i | (m ^ 0xFFFFFFFF) & j) + arrayOfInt[6] + -1473231341) << 17 | k >>> 15) + m;
    j = ((j += (k & m | (k ^ 0xFFFFFFFF) & i) + arrayOfInt[7] + -45705983) << 22 | j >>> 10) + k;
    i = ((i += (j & k | (j ^ 0xFFFFFFFF) & m) + arrayOfInt[8] + 1770035416) << 7 | i >>> 25) + j;
    m = ((m += (i & j | (i ^ 0xFFFFFFFF) & k) + arrayOfInt[9] + -1958414417) << 12 | m >>> 20) + i;
    k = ((k += (m & i | (m ^ 0xFFFFFFFF) & j) + arrayOfInt[10] + -42063) << 17 | k >>> 15) + m;
    j = ((j += (k & m | (k ^ 0xFFFFFFFF) & i) + arrayOfInt[11] + -1990404162) << 22 | j >>> 10) + k;
    i = ((i += (j & k | (j ^ 0xFFFFFFFF) & m) + arrayOfInt[12] + 1804603682) << 7 | i >>> 25) + j;
    m = ((m += (i & j | (i ^ 0xFFFFFFFF) & k) + arrayOfInt[13] + -40341101) << 12 | m >>> 20) + i;
    k = ((k += (m & i | (m ^ 0xFFFFFFFF) & j) + arrayOfInt[14] + -1502002290) << 17 | k >>> 15) + m;
    j = ((j += (k & m | (k ^ 0xFFFFFFFF) & i) + arrayOfInt[15] + 1236535329) << 22 | j >>> 10) + k;
    i = ((i += (j & m | k & (m ^ 0xFFFFFFFF)) + arrayOfInt[1] + -165796510) << 5 | i >>> 27) + j;
    m = ((m += (i & k | j & (k ^ 0xFFFFFFFF)) + arrayOfInt[6] + -1069501632) << 9 | m >>> 23) + i;
    k = ((k += (m & j | i & (j ^ 0xFFFFFFFF)) + arrayOfInt[11] + 643717713) << 14 | k >>> 18) + m;
    j = ((j += (k & i | m & (i ^ 0xFFFFFFFF)) + arrayOfInt[0] + -373897302) << 20 | j >>> 12) + k;
    i = ((i += (j & m | k & (m ^ 0xFFFFFFFF)) + arrayOfInt[5] + -701558691) << 5 | i >>> 27) + j;
    m = ((m += (i & k | j & (k ^ 0xFFFFFFFF)) + arrayOfInt[10] + 38016083) << 9 | m >>> 23) + i;
    k = ((k += (m & j | i & (j ^ 0xFFFFFFFF)) + arrayOfInt[15] + -660478335) << 14 | k >>> 18) + m;
    j = ((j += (k & i | m & (i ^ 0xFFFFFFFF)) + arrayOfInt[4] + -405537848) << 20 | j >>> 12) + k;
    i = ((i += (j & m | k & (m ^ 0xFFFFFFFF)) + arrayOfInt[9] + 568446438) << 5 | i >>> 27) + j;
    m = ((m += (i & k | j & (k ^ 0xFFFFFFFF)) + arrayOfInt[14] + -1019803690) << 9 | m >>> 23) + i;
    k = ((k += (m & j | i & (j ^ 0xFFFFFFFF)) + arrayOfInt[3] + -187363961) << 14 | k >>> 18) + m;
    j = ((j += (k & i | m & (i ^ 0xFFFFFFFF)) + arrayOfInt[8] + 1163531501) << 20 | j >>> 12) + k;
    i = ((i += (j & m | k & (m ^ 0xFFFFFFFF)) + arrayOfInt[13] + -1444681467) << 5 | i >>> 27) + j;
    m = ((m += (i & k | j & (k ^ 0xFFFFFFFF)) + arrayOfInt[2] + -51403784) << 9 | m >>> 23) + i;
    k = ((k += (m & j | i & (j ^ 0xFFFFFFFF)) + arrayOfInt[7] + 1735328473) << 14 | k >>> 18) + m;
    j = ((j += (k & i | m & (i ^ 0xFFFFFFFF)) + arrayOfInt[12] + -1926607734) << 20 | j >>> 12) + k;
    i = ((i += (j ^ k ^ m) + arrayOfInt[5] + -378558) << 4 | i >>> 28) + j;
    m = ((m += (i ^ j ^ k) + arrayOfInt[8] + -2022574463) << 11 | m >>> 21) + i;
    k = ((k += (m ^ i ^ j) + arrayOfInt[11] + 1839030562) << 16 | k >>> 16) + m;
    j = ((j += (k ^ m ^ i) + arrayOfInt[14] + -35309556) << 23 | j >>> 9) + k;
    i = ((i += (j ^ k ^ m) + arrayOfInt[1] + -1530992060) << 4 | i >>> 28) + j;
    m = ((m += (i ^ j ^ k) + arrayOfInt[4] + 1272893353) << 11 | m >>> 21) + i;
    k = ((k += (m ^ i ^ j) + arrayOfInt[7] + -155497632) << 16 | k >>> 16) + m;
    j = ((j += (k ^ m ^ i) + arrayOfInt[10] + -1094730640) << 23 | j >>> 9) + k;
    i = ((i += (j ^ k ^ m) + arrayOfInt[13] + 681279174) << 4 | i >>> 28) + j;
    m = ((m += (i ^ j ^ k) + arrayOfInt[0] + -358537222) << 11 | m >>> 21) + i;
    k = ((k += (m ^ i ^ j) + arrayOfInt[3] + -722521979) << 16 | k >>> 16) + m;
    j = ((j += (k ^ m ^ i) + arrayOfInt[6] + 76029189) << 23 | j >>> 9) + k;
    i = ((i += (j ^ k ^ m) + arrayOfInt[9] + -640364487) << 4 | i >>> 28) + j;
    m = ((m += (i ^ j ^ k) + arrayOfInt[12] + -421815835) << 11 | m >>> 21) + i;
    k = ((k += (m ^ i ^ j) + arrayOfInt[15] + 530742520) << 16 | k >>> 16) + m;
    j = ((j += (k ^ m ^ i) + arrayOfInt[2] + -995338651) << 23 | j >>> 9) + k;
    i = ((i += (k ^ (j | m ^ 0xFFFFFFFF)) + arrayOfInt[0] + -198630844) << 6 | i >>> 26) + j;
    m = ((m += (j ^ (i | k ^ 0xFFFFFFFF)) + arrayOfInt[7] + 1126891415) << 10 | m >>> 22) + i;
    k = ((k += (i ^ (m | j ^ 0xFFFFFFFF)) + arrayOfInt[14] + -1416354905) << 15 | k >>> 17) + m;
    j = ((j += (m ^ (k | i ^ 0xFFFFFFFF)) + arrayOfInt[5] + -57434055) << 21 | j >>> 11) + k;
    i = ((i += (k ^ (j | m ^ 0xFFFFFFFF)) + arrayOfInt[12] + 1700485571) << 6 | i >>> 26) + j;
    m = ((m += (j ^ (i | k ^ 0xFFFFFFFF)) + arrayOfInt[3] + -1894986606) << 10 | m >>> 22) + i;
    k = ((k += (i ^ (m | j ^ 0xFFFFFFFF)) + arrayOfInt[10] + -1051523) << 15 | k >>> 17) + m;
    j = ((j += (m ^ (k | i ^ 0xFFFFFFFF)) + arrayOfInt[1] + -2054922799) << 21 | j >>> 11) + k;
    i = ((i += (k ^ (j | m ^ 0xFFFFFFFF)) + arrayOfInt[8] + 1873313359) << 6 | i >>> 26) + j;
    m = ((m += (j ^ (i | k ^ 0xFFFFFFFF)) + arrayOfInt[15] + -30611744) << 10 | m >>> 22) + i;
    k = ((k += (i ^ (m | j ^ 0xFFFFFFFF)) + arrayOfInt[6] + -1560198380) << 15 | k >>> 17) + m;
    j = ((j += (m ^ (k | i ^ 0xFFFFFFFF)) + arrayOfInt[13] + 1309151649) << 21 | j >>> 11) + k;
    i = ((i += (k ^ (j | m ^ 0xFFFFFFFF)) + arrayOfInt[4] + -145523070) << 6 | i >>> 26) + j;
    m = ((m += (j ^ (i | k ^ 0xFFFFFFFF)) + arrayOfInt[11] + -1120210379) << 10 | m >>> 22) + i;
    k = ((k += (i ^ (m | j ^ 0xFFFFFFFF)) + arrayOfInt[2] + 718787259) << 15 | k >>> 17) + m;
    j = ((j += (m ^ (k | i ^ 0xFFFFFFFF)) + arrayOfInt[9] + -343485551) << 21 | j >>> 11) + k;
    paramcy.a[0] = paramcy.a[0] + i;
    paramcy.a[1] = paramcy.a[1] + j;
    paramcy.a[2] = paramcy.a[2] + k;
    paramcy.a[3] = paramcy.a[3] + m;
  }
  
  private void a(cy paramcy, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    byte b;
    this.b = null;
    if (paramInt2 > paramArrayOfbyte.length)
      paramInt2 = paramArrayOfbyte.length; 
    paramInt1 = (int)(paramcy.b & 0x3FL);
    paramcy.b += paramInt2;
    int i = 64 - paramInt1;
    if (paramInt2 >= i) {
      int[] arrayOfInt = new int[16];
      if (i == 64) {
        i = 0;
      } else {
        for (byte b1 = 0; b1 < i; b1++)
          paramcy.c[b1 + paramInt1] = paramArrayOfbyte[b1]; 
        a(paramcy, paramcy.c, 0, arrayOfInt);
      } 
      for (b = i; b + 63 < paramInt2; b += 64)
        a(paramcy, paramArrayOfbyte, b, arrayOfInt); 
      paramInt1 = 0;
    } else {
      b = 0;
    } 
    if (b < paramInt2) {
      i = b;
      while (b < paramInt2) {
        paramcy.c[paramInt1 + b - i] = paramArrayOfbyte[b];
        b++;
      } 
    } 
  }
  
  private static byte[] a(int[] paramArrayOfint, int paramInt) {
    byte[] arrayOfByte = new byte[paramInt];
    byte b2 = 0;
    byte b1 = b2;
    while (b2 < paramInt) {
      arrayOfByte[b2] = (byte)paramArrayOfint[b1];
      arrayOfByte[b2 + 1] = (byte)(paramArrayOfint[b1] >>> 8);
      arrayOfByte[b2 + 2] = (byte)(paramArrayOfint[b1] >>> 16);
      arrayOfByte[b2 + 3] = (byte)(paramArrayOfint[b1] >>> 24);
      b1++;
      b2 += 4;
    } 
    return arrayOfByte;
  }
  
  public static byte[] a(String paramString) {
    paramString = null;
    return a(i.c(paramString = paramString, null));
  }
  
  public static byte[] a(byte[] paramArrayOfbyte) {
    paramArrayOfbyte = paramArrayOfbyte;
    cx cx2;
    (cx2 = new cx()).a(cx2.a, paramArrayOfbyte, 0, paramArrayOfbyte.length);
    cx cx1;
    if ((cx1 = cx2).b == null) {
      cy cy1 = new cy(cx1.a);
      int[] arrayOfInt;
      byte[] arrayOfByte = a(arrayOfInt = new int[] { (int)(cy1.b << 3L), (int)(cy1.b >> 29L) }, 8);
      int i = ((i = (int)(cy1.b & 0x3FL)) < 56) ? (56 - i) : (120 - i);
      cx1.a(cy1, c, 0, i);
      cx1.a(cy1, arrayOfByte, 0, 8);
      cx1.b = cy1;
    } 
    return a(cx1.b.a, 16);
  }
  
  public static boolean a(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    if (paramArrayOfbyte1 == null)
      return (paramArrayOfbyte2 == null); 
    if (paramArrayOfbyte2 == null)
      return false; 
    int i = 16;
    if (paramArrayOfbyte1.length < 16) {
      if (paramArrayOfbyte2.length != paramArrayOfbyte1.length)
        return false; 
      i = paramArrayOfbyte1.length;
    } else if (paramArrayOfbyte2.length < 16) {
      return false;
    } 
    for (byte b = 0; b < i; b++) {
      if (paramArrayOfbyte1[b] != paramArrayOfbyte2[b])
        return false; 
    } 
    return true;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\cx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */