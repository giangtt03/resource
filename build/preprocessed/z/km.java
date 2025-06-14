public final class km extends jv {
  private boolean[] a = new boolean[5];
  
  private int b = 0;
  
  private int c = 0;
  
  public final void a(at paramat, kh paramkh) {
    // Byte code:
    //   0: aload_1
    //   1: checkcast kl
    //   4: dup
    //   5: astore_1
    //   6: ifnull -> 4029
    //   9: aload_1
    //   10: invokevirtual i : ()V
    //   13: aload_2
    //   14: iconst_1
    //   15: invokevirtual a : (I)Lkb;
    //   18: checkcast kf
    //   21: astore #6
    //   23: aload_1
    //   24: getfield t : Lk;
    //   27: astore #7
    //   29: aload_1
    //   30: dup
    //   31: astore_3
    //   32: getfield j : I
    //   35: tableswitch default -> 4022, 0 -> 3458, 1 -> 1419, 2 -> 803, 3 -> 1268, 4 -> 4022, 5 -> 84, 6 -> 199, 7 -> 643, 8 -> 717
    //   84: aload #7
    //   86: dup
    //   87: getfield b : I
    //   90: aload_1
    //   91: getfield s : I
    //   94: isub
    //   95: putfield b : I
    //   98: aload_1
    //   99: dup
    //   100: getfield w : I
    //   103: aload_1
    //   104: getfield s : I
    //   107: iadd
    //   108: putfield w : I
    //   111: aload_1
    //   112: dup
    //   113: getfield s : I
    //   116: iconst_1
    //   117: isub
    //   118: putfield s : I
    //   121: aload_1
    //   122: getfield s : I
    //   125: ifne -> 137
    //   128: aload_1
    //   129: bipush #6
    //   131: invokevirtual a : (I)V
    //   134: goto -> 4022
    //   137: aload_1
    //   138: invokevirtual o : ()I
    //   141: bipush #20
    //   143: iadd
    //   144: bipush #32
    //   146: idiv
    //   147: istore_3
    //   148: aload #7
    //   150: getfield a : I
    //   153: aload #7
    //   155: getfield c : I
    //   158: iconst_2
    //   159: idiv
    //   160: iadd
    //   161: bipush #32
    //   163: idiv
    //   164: istore #4
    //   166: aload #6
    //   168: iload_3
    //   169: iload #4
    //   171: invokevirtual b : (II)B
    //   174: invokestatic a : (B)Z
    //   177: ifne -> 186
    //   180: aload_1
    //   181: bipush #6
    //   183: invokevirtual a : (I)V
    //   186: aload_0
    //   187: aload_1
    //   188: aload #7
    //   190: aload #6
    //   192: aload_2
    //   193: invokespecial a : (Lkl;Lk;Lkf;Lkh;)V
    //   196: goto -> 4022
    //   199: aload #7
    //   201: dup
    //   202: getfield b : I
    //   205: aload_1
    //   206: getfield s : I
    //   209: iadd
    //   210: putfield b : I
    //   213: aload_1
    //   214: dup
    //   215: getfield s : I
    //   218: iconst_2
    //   219: iadd
    //   220: putfield s : I
    //   223: aload_1
    //   224: getfield s : I
    //   227: aload_1
    //   228: getfield a : I
    //   231: if_icmple -> 242
    //   234: aload_1
    //   235: aload_1
    //   236: getfield a : I
    //   239: putfield s : I
    //   242: aload #7
    //   244: getfield b : I
    //   247: aload #7
    //   249: getfield d : I
    //   252: iadd
    //   253: aload_1
    //   254: getfield a : I
    //   257: isub
    //   258: bipush #32
    //   260: idiv
    //   261: istore #8
    //   263: aload #7
    //   265: getfield b : I
    //   268: aload #7
    //   270: getfield d : I
    //   273: iadd
    //   274: bipush #32
    //   276: idiv
    //   277: istore_3
    //   278: aload #7
    //   280: getfield a : I
    //   283: bipush #32
    //   285: idiv
    //   286: istore #4
    //   288: aload #7
    //   290: getfield a : I
    //   293: aload #7
    //   295: getfield c : I
    //   298: iadd
    //   299: bipush #32
    //   301: idiv
    //   302: istore #5
    //   304: aload #6
    //   306: iload_3
    //   307: iload #5
    //   309: invokevirtual b : (II)B
    //   312: invokestatic l : (I)Z
    //   315: ifeq -> 406
    //   318: aload_1
    //   319: getfield k : I
    //   322: dup
    //   323: istore #4
    //   325: iconst_4
    //   326: if_icmpne -> 340
    //   329: aload_1
    //   330: getfield k : I
    //   333: iconst_2
    //   334: ior
    //   335: istore #4
    //   337: goto -> 355
    //   340: iload #4
    //   342: bipush #8
    //   344: if_icmpne -> 355
    //   347: aload_1
    //   348: getfield k : I
    //   351: iconst_1
    //   352: ior
    //   353: istore #4
    //   355: aload_1
    //   356: bipush #7
    //   358: iload #4
    //   360: invokevirtual a : (II)V
    //   363: bipush #32
    //   365: aload #7
    //   367: getfield a : I
    //   370: aload #7
    //   372: getfield c : I
    //   375: iadd
    //   376: bipush #32
    //   378: irem
    //   379: isub
    //   380: istore #5
    //   382: aload_1
    //   383: aload #7
    //   385: getfield a : I
    //   388: iload_3
    //   389: iconst_5
    //   390: ishl
    //   391: aload #7
    //   393: getfield d : I
    //   396: isub
    //   397: iload #5
    //   399: iadd
    //   400: invokevirtual c : (II)V
    //   403: goto -> 4022
    //   406: aload #6
    //   408: iload_3
    //   409: iload #4
    //   411: invokevirtual b : (II)B
    //   414: invokestatic d : (I)Z
    //   417: ifeq -> 496
    //   420: aload_1
    //   421: getfield k : I
    //   424: dup
    //   425: istore #4
    //   427: iconst_4
    //   428: if_icmpne -> 442
    //   431: aload_1
    //   432: getfield k : I
    //   435: iconst_1
    //   436: ior
    //   437: istore #4
    //   439: goto -> 458
    //   442: iload #4
    //   444: bipush #8
    //   446: if_icmpne -> 458
    //   449: aload_1
    //   450: getfield k : I
    //   453: bipush #8
    //   455: ior
    //   456: istore #4
    //   458: aload_1
    //   459: bipush #7
    //   461: iload #4
    //   463: invokevirtual a : (II)V
    //   466: aload_1
    //   467: aload #7
    //   469: getfield a : I
    //   472: iload_3
    //   473: iconst_5
    //   474: ishl
    //   475: aload #7
    //   477: getfield d : I
    //   480: isub
    //   481: aload #7
    //   483: getfield a : I
    //   486: bipush #32
    //   488: irem
    //   489: iadd
    //   490: invokevirtual c : (II)V
    //   493: goto -> 4022
    //   496: aload #7
    //   498: getfield a : I
    //   501: iconst_5
    //   502: iadd
    //   503: bipush #32
    //   505: idiv
    //   506: istore #4
    //   508: aload #7
    //   510: getfield a : I
    //   513: aload #7
    //   515: getfield c : I
    //   518: iadd
    //   519: iconst_5
    //   520: isub
    //   521: bipush #32
    //   523: idiv
    //   524: istore #5
    //   526: aload #6
    //   528: iload_3
    //   529: iload #4
    //   531: invokevirtual b : (II)B
    //   534: invokestatic c : (I)Z
    //   537: ifeq -> 578
    //   540: iload #8
    //   542: iload_3
    //   543: if_icmpeq -> 4022
    //   546: aload_1
    //   547: bipush #7
    //   549: invokevirtual a : (I)V
    //   552: aload_1
    //   553: aload #7
    //   555: getfield a : I
    //   558: iload_3
    //   559: iconst_1
    //   560: isub
    //   561: iconst_5
    //   562: ishl
    //   563: aload #7
    //   565: getfield d : I
    //   568: bipush #32
    //   570: isub
    //   571: isub
    //   572: invokevirtual c : (II)V
    //   575: goto -> 4022
    //   578: aload #6
    //   580: iload_3
    //   581: iload #5
    //   583: invokevirtual b : (II)B
    //   586: invokestatic c : (I)Z
    //   589: ifeq -> 630
    //   592: iload #8
    //   594: iload_3
    //   595: if_icmpeq -> 4022
    //   598: aload_1
    //   599: bipush #7
    //   601: invokevirtual a : (I)V
    //   604: aload_1
    //   605: aload #7
    //   607: getfield a : I
    //   610: iload_3
    //   611: iconst_1
    //   612: isub
    //   613: iconst_5
    //   614: ishl
    //   615: aload #7
    //   617: getfield d : I
    //   620: bipush #32
    //   622: isub
    //   623: isub
    //   624: invokevirtual c : (II)V
    //   627: goto -> 4022
    //   630: aload_0
    //   631: aload_1
    //   632: aload #7
    //   634: aload #6
    //   636: aload_2
    //   637: invokespecial a : (Lkl;Lk;Lkf;Lkh;)V
    //   640: goto -> 4022
    //   643: aload_1
    //   644: dup
    //   645: astore_3
    //   646: getfield d : Lmg;
    //   649: invokevirtual j : ()Z
    //   652: ifeq -> 660
    //   655: aload_1
    //   656: iconst_0
    //   657: invokevirtual a : (I)V
    //   660: aload_0
    //   661: aload #7
    //   663: aload #6
    //   665: aload_2
    //   666: aload_1
    //   667: invokespecial a : (Lk;Lkf;Lkh;Lkl;)V
    //   670: aload_1
    //   671: getfield k : I
    //   674: iconst_4
    //   675: iand
    //   676: ifeq -> 693
    //   679: aload #7
    //   681: aload_1
    //   682: aload #6
    //   684: aload_2
    //   685: iconst_1
    //   686: invokestatic a : (Lk;Lkl;Lkf;Lkh;Z)Z
    //   689: ifeq -> 4022
    //   692: return
    //   693: aload_1
    //   694: getfield k : I
    //   697: bipush #8
    //   699: iand
    //   700: ifeq -> 4022
    //   703: aload #7
    //   705: aload_1
    //   706: aload #6
    //   708: aload_2
    //   709: iconst_1
    //   710: invokestatic b : (Lk;Lkl;Lkf;Lkh;Z)Z
    //   713: ifeq -> 4022
    //   716: return
    //   717: aload_1
    //   718: getfield k : I
    //   721: iconst_1
    //   722: if_icmpne -> 4022
    //   725: aload #7
    //   727: getfield b : I
    //   730: bipush #10
    //   732: iadd
    //   733: bipush #32
    //   735: idiv
    //   736: istore_3
    //   737: aload #7
    //   739: getfield a : I
    //   742: aload #7
    //   744: getfield c : I
    //   747: iconst_2
    //   748: idiv
    //   749: iadd
    //   750: bipush #32
    //   752: idiv
    //   753: istore #4
    //   755: aload #6
    //   757: iload_3
    //   758: iload #4
    //   760: invokevirtual b : (II)B
    //   763: invokestatic b : (I)Z
    //   766: ifne -> 4022
    //   769: aload_0
    //   770: aload #7
    //   772: getfield b : I
    //   775: aload #7
    //   777: getfield d : I
    //   780: iadd
    //   781: iload_3
    //   782: iconst_1
    //   783: iadd
    //   784: iconst_5
    //   785: ishl
    //   786: isub
    //   787: putfield b : I
    //   790: aload_0
    //   791: aload_0
    //   792: getfield b : I
    //   795: iconst_3
    //   796: idiv
    //   797: putfield c : I
    //   800: goto -> 4022
    //   803: aload_0
    //   804: getfield a : [Z
    //   807: iconst_0
    //   808: baload
    //   809: ifeq -> 1028
    //   812: aload_1
    //   813: iconst_1
    //   814: putfield v : Z
    //   817: aload_1
    //   818: getfield k : I
    //   821: iconst_2
    //   822: if_icmpne -> 837
    //   825: aload_1
    //   826: iconst_1
    //   827: putfield k : I
    //   830: aload_1
    //   831: getfield g : Lmd;
    //   834: invokevirtual s : ()V
    //   837: aload_1
    //   838: iconst_0
    //   839: aload_1
    //   840: getfield i : I
    //   843: getstatic kl.c : [B
    //   846: iconst_1
    //   847: baload
    //   848: imul
    //   849: invokevirtual b : (II)V
    //   852: aload #7
    //   854: getfield b : I
    //   857: bipush #10
    //   859: iadd
    //   860: bipush #32
    //   862: idiv
    //   863: istore_3
    //   864: aload #7
    //   866: getfield a : I
    //   869: aload #7
    //   871: getfield c : I
    //   874: iconst_2
    //   875: idiv
    //   876: iadd
    //   877: bipush #32
    //   879: idiv
    //   880: istore #4
    //   882: aload #6
    //   884: iload_3
    //   885: iload #4
    //   887: invokevirtual b : (II)B
    //   890: invokestatic b : (I)Z
    //   893: ifne -> 935
    //   896: aload_0
    //   897: aload #7
    //   899: getfield b : I
    //   902: aload #7
    //   904: getfield d : I
    //   907: iadd
    //   908: iload_3
    //   909: iconst_1
    //   910: iadd
    //   911: iconst_5
    //   912: ishl
    //   913: isub
    //   914: putfield b : I
    //   917: aload_0
    //   918: aload_0
    //   919: getfield b : I
    //   922: iconst_3
    //   923: idiv
    //   924: putfield c : I
    //   927: aload_1
    //   928: iconst_3
    //   929: invokevirtual a : (I)V
    //   932: goto -> 1177
    //   935: aload #7
    //   937: getfield b : I
    //   940: aload #7
    //   942: getfield d : I
    //   945: iadd
    //   946: bipush #32
    //   948: idiv
    //   949: istore_3
    //   950: aload #7
    //   952: getfield b : I
    //   955: bipush #32
    //   957: idiv
    //   958: istore #5
    //   960: aload #6
    //   962: iload #5
    //   964: iload #4
    //   966: invokevirtual b : (II)B
    //   969: invokestatic b : (I)Z
    //   972: ifeq -> 1177
    //   975: aload #6
    //   977: iload_3
    //   978: iload #4
    //   980: invokevirtual b : (II)B
    //   983: invokestatic c : (I)Z
    //   986: ifeq -> 1177
    //   989: aload_0
    //   990: aload #7
    //   992: getfield b : I
    //   995: aload #7
    //   997: getfield d : I
    //   1000: iadd
    //   1001: iload_3
    //   1002: iconst_1
    //   1003: iadd
    //   1004: iconst_5
    //   1005: ishl
    //   1006: isub
    //   1007: putfield b : I
    //   1010: aload_0
    //   1011: aload_0
    //   1012: getfield b : I
    //   1015: iconst_3
    //   1016: idiv
    //   1017: putfield c : I
    //   1020: aload_1
    //   1021: iconst_3
    //   1022: invokevirtual a : (I)V
    //   1025: goto -> 1177
    //   1028: aload_0
    //   1029: getfield a : [Z
    //   1032: iconst_1
    //   1033: baload
    //   1034: ifeq -> 1172
    //   1037: aload_1
    //   1038: iconst_1
    //   1039: putfield v : Z
    //   1042: aload_1
    //   1043: getfield k : I
    //   1046: iconst_1
    //   1047: if_icmpne -> 1062
    //   1050: aload_1
    //   1051: iconst_2
    //   1052: putfield k : I
    //   1055: aload_1
    //   1056: getfield g : Lmd;
    //   1059: invokevirtual t : ()V
    //   1062: aload_1
    //   1063: iconst_0
    //   1064: aload_1
    //   1065: getfield i : I
    //   1068: getstatic kl.c : [B
    //   1071: iconst_2
    //   1072: baload
    //   1073: imul
    //   1074: invokevirtual b : (II)V
    //   1077: aload #7
    //   1079: getfield b : I
    //   1082: aload #7
    //   1084: getfield d : I
    //   1087: iadd
    //   1088: bipush #32
    //   1090: idiv
    //   1091: istore_3
    //   1092: aload #7
    //   1094: getfield a : I
    //   1097: aload #7
    //   1099: getfield c : I
    //   1102: iconst_2
    //   1103: idiv
    //   1104: iadd
    //   1105: bipush #32
    //   1107: idiv
    //   1108: istore #4
    //   1110: aload #6
    //   1112: iload_3
    //   1113: iload #4
    //   1115: invokevirtual b : (II)B
    //   1118: invokestatic b : (I)Z
    //   1121: ifne -> 1141
    //   1124: aload_1
    //   1125: iload_3
    //   1126: iconst_1
    //   1127: isub
    //   1128: iconst_5
    //   1129: ishl
    //   1130: invokevirtual g : (I)V
    //   1133: aload_1
    //   1134: iconst_3
    //   1135: invokevirtual a : (I)V
    //   1138: goto -> 1177
    //   1141: aload #6
    //   1143: iload_3
    //   1144: iload #4
    //   1146: invokevirtual b : (II)B
    //   1149: invokestatic c : (I)Z
    //   1152: ifeq -> 1177
    //   1155: aload_1
    //   1156: iload_3
    //   1157: iconst_1
    //   1158: isub
    //   1159: iconst_5
    //   1160: ishl
    //   1161: invokevirtual g : (I)V
    //   1164: aload_1
    //   1165: iconst_3
    //   1166: invokevirtual a : (I)V
    //   1169: goto -> 1177
    //   1172: aload_1
    //   1173: iconst_0
    //   1174: putfield v : Z
    //   1177: aload_0
    //   1178: getfield a : [Z
    //   1181: iconst_2
    //   1182: baload
    //   1183: ifeq -> 1222
    //   1186: aload_0
    //   1187: getfield a : [Z
    //   1190: iconst_0
    //   1191: aload_0
    //   1192: getfield a : [Z
    //   1195: iconst_1
    //   1196: iconst_0
    //   1197: dup_x2
    //   1198: bastore
    //   1199: bastore
    //   1200: aload_1
    //   1201: aload #7
    //   1203: getfield a : I
    //   1206: bipush #16
    //   1208: isub
    //   1209: invokevirtual f : (I)V
    //   1212: aload_1
    //   1213: bipush #6
    //   1215: iconst_4
    //   1216: invokevirtual a : (II)V
    //   1219: goto -> 4022
    //   1222: aload_0
    //   1223: getfield a : [Z
    //   1226: iconst_3
    //   1227: baload
    //   1228: ifeq -> 4022
    //   1231: aload_0
    //   1232: getfield a : [Z
    //   1235: iconst_0
    //   1236: aload_0
    //   1237: getfield a : [Z
    //   1240: iconst_1
    //   1241: iconst_0
    //   1242: dup_x2
    //   1243: bastore
    //   1244: bastore
    //   1245: aload_1
    //   1246: aload #7
    //   1248: getfield a : I
    //   1251: bipush #16
    //   1253: iadd
    //   1254: invokevirtual f : (I)V
    //   1257: aload_1
    //   1258: bipush #6
    //   1260: bipush #8
    //   1262: invokevirtual a : (II)V
    //   1265: goto -> 4022
    //   1268: aload_1
    //   1269: getfield k : I
    //   1272: iconst_1
    //   1273: if_icmpne -> 1299
    //   1276: aload #7
    //   1278: dup
    //   1279: getfield b : I
    //   1282: aload_0
    //   1283: getfield c : I
    //   1286: getstatic kl.c : [B
    //   1289: aload_1
    //   1290: getfield k : I
    //   1293: baload
    //   1294: imul
    //   1295: iadd
    //   1296: putfield b : I
    //   1299: aload_1
    //   1300: dup
    //   1301: astore_3
    //   1302: getfield d : Lmg;
    //   1305: invokevirtual j : ()Z
    //   1308: ifeq -> 4022
    //   1311: aload_0
    //   1312: iconst_0
    //   1313: putfield c : I
    //   1316: aload_0
    //   1317: iconst_0
    //   1318: putfield b : I
    //   1321: aload #7
    //   1323: getfield b : I
    //   1326: bipush #32
    //   1328: idiv
    //   1329: istore_3
    //   1330: aload #7
    //   1332: getfield a : I
    //   1335: pop
    //   1336: aload #7
    //   1338: getfield c : I
    //   1341: pop
    //   1342: aload_1
    //   1343: iload_3
    //   1344: iconst_5
    //   1345: ishl
    //   1346: invokevirtual g : (I)V
    //   1349: aload_1
    //   1350: iconst_0
    //   1351: invokevirtual a : (I)V
    //   1354: aload_0
    //   1355: dup
    //   1356: astore_3
    //   1357: invokevirtual a : ()V
    //   1360: invokestatic c : ()V
    //   1363: aload #7
    //   1365: getfield b : I
    //   1368: aload #7
    //   1370: getfield d : I
    //   1373: iadd
    //   1374: bipush #32
    //   1376: idiv
    //   1377: istore_3
    //   1378: aload #7
    //   1380: getfield a : I
    //   1383: aload #7
    //   1385: getfield c : I
    //   1388: iconst_2
    //   1389: idiv
    //   1390: iadd
    //   1391: bipush #32
    //   1393: idiv
    //   1394: istore #4
    //   1396: aload #6
    //   1398: iload_3
    //   1399: iload #4
    //   1401: invokevirtual b : (II)B
    //   1404: invokestatic c : (I)Z
    //   1407: ifne -> 4022
    //   1410: aload_1
    //   1411: bipush #6
    //   1413: invokevirtual a : (I)V
    //   1416: goto -> 4022
    //   1419: aload_0
    //   1420: getfield a : [Z
    //   1423: iconst_0
    //   1424: baload
    //   1425: ifeq -> 1602
    //   1428: aload_1
    //   1429: getfield y : Z
    //   1432: ifne -> 1585
    //   1435: aload #7
    //   1437: getfield b : I
    //   1440: aload #7
    //   1442: getfield d : I
    //   1445: iconst_2
    //   1446: idiv
    //   1447: iadd
    //   1448: bipush #32
    //   1450: idiv
    //   1451: istore_3
    //   1452: aload #7
    //   1454: getfield a : I
    //   1457: aload #7
    //   1459: getfield c : I
    //   1462: iconst_2
    //   1463: idiv
    //   1464: iadd
    //   1465: bipush #32
    //   1467: idiv
    //   1468: istore #4
    //   1470: aload #6
    //   1472: iload_3
    //   1473: iload #4
    //   1475: invokevirtual b : (II)B
    //   1478: invokestatic b : (I)Z
    //   1481: ifeq -> 1527
    //   1484: aload_1
    //   1485: iload #4
    //   1487: iconst_5
    //   1488: ishl
    //   1489: bipush #32
    //   1491: aload #7
    //   1493: getfield c : I
    //   1496: isub
    //   1497: iconst_2
    //   1498: idiv
    //   1499: iadd
    //   1500: invokevirtual f : (I)V
    //   1503: aload_1
    //   1504: bipush #8
    //   1506: iconst_1
    //   1507: invokevirtual a : (II)V
    //   1510: aload_0
    //   1511: getfield a : [Z
    //   1514: iconst_2
    //   1515: aload_0
    //   1516: getfield a : [Z
    //   1519: iconst_3
    //   1520: iconst_0
    //   1521: dup_x2
    //   1522: bastore
    //   1523: bastore
    //   1524: goto -> 1704
    //   1527: aload_1
    //   1528: invokevirtual o : ()I
    //   1531: bipush #20
    //   1533: iadd
    //   1534: bipush #32
    //   1536: idiv
    //   1537: istore_3
    //   1538: aload #7
    //   1540: getfield a : I
    //   1543: aload #7
    //   1545: getfield c : I
    //   1548: iconst_2
    //   1549: idiv
    //   1550: iadd
    //   1551: bipush #32
    //   1553: idiv
    //   1554: istore #4
    //   1556: aload #6
    //   1558: iload_3
    //   1559: iload #4
    //   1561: invokevirtual b : (II)B
    //   1564: invokestatic a : (B)Z
    //   1567: ifeq -> 1704
    //   1570: aload_1
    //   1571: iconst_5
    //   1572: invokevirtual a : (I)V
    //   1575: aload_0
    //   1576: getfield a : [Z
    //   1579: iconst_0
    //   1580: iconst_0
    //   1581: bastore
    //   1582: goto -> 1704
    //   1585: aload_1
    //   1586: getfield k : I
    //   1589: iconst_1
    //   1590: if_icmpeq -> 1704
    //   1593: aload_1
    //   1594: iconst_1
    //   1595: iconst_1
    //   1596: invokevirtual a : (II)V
    //   1599: goto -> 1704
    //   1602: aload_0
    //   1603: getfield a : [Z
    //   1606: iconst_1
    //   1607: baload
    //   1608: ifeq -> 1704
    //   1611: aload #7
    //   1613: getfield b : I
    //   1616: aload #7
    //   1618: getfield d : I
    //   1621: iadd
    //   1622: bipush #8
    //   1624: iadd
    //   1625: bipush #32
    //   1627: idiv
    //   1628: istore_3
    //   1629: aload #7
    //   1631: getfield a : I
    //   1634: aload #7
    //   1636: getfield c : I
    //   1639: iconst_2
    //   1640: idiv
    //   1641: iadd
    //   1642: bipush #32
    //   1644: idiv
    //   1645: istore #4
    //   1647: aload_1
    //   1648: getfield y : Z
    //   1651: ifeq -> 1704
    //   1654: aload #6
    //   1656: iload_3
    //   1657: iload #4
    //   1659: invokevirtual b : (II)B
    //   1662: invokestatic c : (I)Z
    //   1665: ifeq -> 1682
    //   1668: aload #6
    //   1670: iload_3
    //   1671: iload #4
    //   1673: invokevirtual b : (II)B
    //   1676: invokestatic b : (I)Z
    //   1679: ifeq -> 1699
    //   1682: aload_1
    //   1683: getfield k : I
    //   1686: iconst_2
    //   1687: if_icmpeq -> 1704
    //   1690: aload_1
    //   1691: iconst_1
    //   1692: iconst_2
    //   1693: invokevirtual a : (II)V
    //   1696: goto -> 1704
    //   1699: aload_1
    //   1700: iconst_0
    //   1701: invokevirtual a : (I)V
    //   1704: aload_0
    //   1705: getfield a : [Z
    //   1708: iconst_2
    //   1709: baload
    //   1710: ifeq -> 2446
    //   1713: aload_1
    //   1714: getfield k : I
    //   1717: iconst_4
    //   1718: if_icmpne -> 2003
    //   1721: aload #7
    //   1723: aload_1
    //   1724: aload #6
    //   1726: aload_2
    //   1727: iconst_1
    //   1728: invokestatic a : (Lk;Lkl;Lkf;Lkh;Z)Z
    //   1731: ifne -> 4022
    //   1734: aload #7
    //   1736: getfield b : I
    //   1739: aload #7
    //   1741: getfield d : I
    //   1744: iadd
    //   1745: bipush #32
    //   1747: idiv
    //   1748: istore_3
    //   1749: aload #7
    //   1751: getfield a : I
    //   1754: aload #7
    //   1756: getfield c : I
    //   1759: iadd
    //   1760: iconst_5
    //   1761: isub
    //   1762: bipush #32
    //   1764: idiv
    //   1765: istore #4
    //   1767: aload #7
    //   1769: getfield a : I
    //   1772: iconst_5
    //   1773: iadd
    //   1774: bipush #32
    //   1776: idiv
    //   1777: istore #5
    //   1779: aload #6
    //   1781: iload_3
    //   1782: iload #4
    //   1784: invokevirtual b : (II)B
    //   1787: pop
    //   1788: aload #6
    //   1790: iload_3
    //   1791: iload #5
    //   1793: invokevirtual b : (II)B
    //   1796: invokestatic c : (I)Z
    //   1799: ifne -> 1832
    //   1802: aload #6
    //   1804: iload_3
    //   1805: iload #4
    //   1807: invokevirtual b : (II)B
    //   1810: invokestatic c : (I)Z
    //   1813: ifne -> 1832
    //   1816: aload_1
    //   1817: getfield y : Z
    //   1820: ifne -> 3230
    //   1823: aload_1
    //   1824: bipush #6
    //   1826: invokevirtual a : (I)V
    //   1829: goto -> 3230
    //   1832: aload #7
    //   1834: getfield b : I
    //   1837: aload #7
    //   1839: getfield d : I
    //   1842: iadd
    //   1843: bipush #32
    //   1845: idiv
    //   1846: istore_3
    //   1847: aload #7
    //   1849: getfield a : I
    //   1852: aload #7
    //   1854: getfield c : I
    //   1857: iadd
    //   1858: aload_1
    //   1859: getfield i : I
    //   1862: isub
    //   1863: bipush #32
    //   1865: idiv
    //   1866: istore #4
    //   1868: aload #6
    //   1870: iload_3
    //   1871: iload #4
    //   1873: invokevirtual b : (II)B
    //   1876: dup
    //   1877: istore #5
    //   1879: invokestatic l : (I)Z
    //   1882: ifeq -> 1920
    //   1885: aload_1
    //   1886: iload #4
    //   1888: iconst_1
    //   1889: iadd
    //   1890: iconst_5
    //   1891: ishl
    //   1892: aload #7
    //   1894: getfield c : I
    //   1897: isub
    //   1898: iload_3
    //   1899: iconst_5
    //   1900: ishl
    //   1901: aload #7
    //   1903: getfield d : I
    //   1906: isub
    //   1907: invokevirtual c : (II)V
    //   1910: aload_1
    //   1911: iconst_1
    //   1912: bipush #6
    //   1914: invokevirtual a : (II)V
    //   1917: goto -> 3230
    //   1920: aload #7
    //   1922: getfield b : I
    //   1925: aload #7
    //   1927: getfield d : I
    //   1930: iadd
    //   1931: aload_1
    //   1932: getfield i : I
    //   1935: isub
    //   1936: bipush #32
    //   1938: idiv
    //   1939: istore_3
    //   1940: aload #7
    //   1942: getfield a : I
    //   1945: aload_1
    //   1946: getfield i : I
    //   1949: isub
    //   1950: bipush #32
    //   1952: idiv
    //   1953: istore #4
    //   1955: aload #6
    //   1957: iload_3
    //   1958: iload #4
    //   1960: invokevirtual b : (II)B
    //   1963: dup
    //   1964: istore #5
    //   1966: invokestatic d : (I)Z
    //   1969: ifeq -> 3230
    //   1972: aload_1
    //   1973: iload #4
    //   1975: iconst_1
    //   1976: iadd
    //   1977: iconst_5
    //   1978: ishl
    //   1979: iload_3
    //   1980: iconst_5
    //   1981: ishl
    //   1982: aload #7
    //   1984: getfield d : I
    //   1987: bipush #32
    //   1989: isub
    //   1990: isub
    //   1991: invokevirtual c : (II)V
    //   1994: aload_1
    //   1995: iconst_1
    //   1996: iconst_5
    //   1997: invokevirtual a : (II)V
    //   2000: goto -> 3230
    //   2003: aload_1
    //   2004: getfield k : I
    //   2007: iconst_5
    //   2008: if_icmpne -> 2190
    //   2011: aload #7
    //   2013: getfield b : I
    //   2016: aload #7
    //   2018: getfield d : I
    //   2021: iadd
    //   2022: bipush #32
    //   2024: idiv
    //   2025: istore_3
    //   2026: aload #7
    //   2028: getfield a : I
    //   2031: bipush #32
    //   2033: idiv
    //   2034: istore #4
    //   2036: aload #7
    //   2038: getfield b : I
    //   2041: aload #7
    //   2043: getfield d : I
    //   2046: iadd
    //   2047: aload_1
    //   2048: getfield i : I
    //   2051: isub
    //   2052: bipush #32
    //   2054: idiv
    //   2055: istore #5
    //   2057: aload #7
    //   2059: getfield a : I
    //   2062: aload_1
    //   2063: getfield i : I
    //   2066: isub
    //   2067: bipush #32
    //   2069: idiv
    //   2070: istore #8
    //   2072: iload_3
    //   2073: iload #5
    //   2075: if_icmpeq -> 3230
    //   2078: iload #4
    //   2080: iload #8
    //   2082: if_icmpne -> 2146
    //   2085: aload #6
    //   2087: iload #5
    //   2089: iload #8
    //   2091: iconst_1
    //   2092: isub
    //   2093: invokevirtual b : (II)B
    //   2096: invokestatic d : (I)Z
    //   2099: ifne -> 3230
    //   2102: aload #6
    //   2104: iload #5
    //   2106: iload #8
    //   2108: invokevirtual b : (II)B
    //   2111: invokestatic d : (I)Z
    //   2114: ifne -> 3230
    //   2117: aload_1
    //   2118: iload #8
    //   2120: iconst_5
    //   2121: ishl
    //   2122: iload #5
    //   2124: iconst_1
    //   2125: iadd
    //   2126: iconst_5
    //   2127: ishl
    //   2128: aload #7
    //   2130: getfield d : I
    //   2133: isub
    //   2134: invokevirtual c : (II)V
    //   2137: aload_1
    //   2138: iconst_1
    //   2139: iconst_4
    //   2140: invokevirtual a : (II)V
    //   2143: goto -> 3230
    //   2146: aload #6
    //   2148: iload #5
    //   2150: iload #8
    //   2152: invokevirtual b : (II)B
    //   2155: invokestatic d : (I)Z
    //   2158: ifne -> 3230
    //   2161: aload_1
    //   2162: iload #4
    //   2164: iconst_5
    //   2165: ishl
    //   2166: iload #5
    //   2168: iconst_1
    //   2169: iadd
    //   2170: iconst_5
    //   2171: ishl
    //   2172: aload #7
    //   2174: getfield d : I
    //   2177: isub
    //   2178: invokevirtual c : (II)V
    //   2181: aload_1
    //   2182: iconst_1
    //   2183: iconst_4
    //   2184: invokevirtual a : (II)V
    //   2187: goto -> 3230
    //   2190: aload_1
    //   2191: getfield k : I
    //   2194: bipush #6
    //   2196: if_icmpne -> 2400
    //   2199: aload #7
    //   2201: getfield b : I
    //   2204: aload #7
    //   2206: getfield d : I
    //   2209: iadd
    //   2210: bipush #32
    //   2212: idiv
    //   2213: istore_3
    //   2214: aload #7
    //   2216: getfield a : I
    //   2219: aload #7
    //   2221: getfield c : I
    //   2224: iadd
    //   2225: bipush #32
    //   2227: idiv
    //   2228: istore #4
    //   2230: aload #7
    //   2232: getfield b : I
    //   2235: aload #7
    //   2237: getfield d : I
    //   2240: iadd
    //   2241: aload_1
    //   2242: getfield i : I
    //   2245: iadd
    //   2246: bipush #32
    //   2248: idiv
    //   2249: istore #5
    //   2251: aload #7
    //   2253: getfield a : I
    //   2256: aload #7
    //   2258: getfield c : I
    //   2261: iadd
    //   2262: aload_1
    //   2263: getfield i : I
    //   2266: isub
    //   2267: bipush #32
    //   2269: idiv
    //   2270: istore #8
    //   2272: iload_3
    //   2273: iload #5
    //   2275: if_icmpeq -> 3230
    //   2278: iload #4
    //   2280: iload #8
    //   2282: if_icmpne -> 2350
    //   2285: aload #6
    //   2287: iload #5
    //   2289: iload #8
    //   2291: iconst_1
    //   2292: isub
    //   2293: invokevirtual b : (II)B
    //   2296: invokestatic l : (I)Z
    //   2299: ifne -> 3230
    //   2302: aload #6
    //   2304: iload #5
    //   2306: iload #8
    //   2308: invokevirtual b : (II)B
    //   2311: invokestatic l : (I)Z
    //   2314: ifne -> 3230
    //   2317: aload_1
    //   2318: iload #8
    //   2320: iconst_5
    //   2321: ishl
    //   2322: aload #7
    //   2324: getfield c : I
    //   2327: isub
    //   2328: iload #5
    //   2330: iconst_5
    //   2331: ishl
    //   2332: aload #7
    //   2334: getfield d : I
    //   2337: isub
    //   2338: invokevirtual c : (II)V
    //   2341: aload_1
    //   2342: iconst_1
    //   2343: iconst_4
    //   2344: invokevirtual a : (II)V
    //   2347: goto -> 3230
    //   2350: aload #6
    //   2352: iload #5
    //   2354: iload #8
    //   2356: invokevirtual b : (II)B
    //   2359: invokestatic l : (I)Z
    //   2362: ifne -> 3230
    //   2365: aload_1
    //   2366: iload #8
    //   2368: iconst_1
    //   2369: iadd
    //   2370: iconst_5
    //   2371: ishl
    //   2372: aload #7
    //   2374: getfield c : I
    //   2377: isub
    //   2378: iload #5
    //   2380: iconst_5
    //   2381: ishl
    //   2382: aload #7
    //   2384: getfield d : I
    //   2387: isub
    //   2388: invokevirtual c : (II)V
    //   2391: aload_1
    //   2392: iconst_1
    //   2393: iconst_4
    //   2394: invokevirtual a : (II)V
    //   2397: goto -> 3230
    //   2400: aload_1
    //   2401: getfield k : I
    //   2404: bipush #10
    //   2406: if_icmpne -> 2418
    //   2409: aload_1
    //   2410: iconst_1
    //   2411: iconst_5
    //   2412: invokevirtual a : (II)V
    //   2415: goto -> 4022
    //   2418: aload_1
    //   2419: getfield k : I
    //   2422: bipush #9
    //   2424: if_icmpne -> 2437
    //   2427: aload_1
    //   2428: iconst_1
    //   2429: bipush #6
    //   2431: invokevirtual a : (II)V
    //   2434: goto -> 4022
    //   2437: aload_1
    //   2438: iconst_1
    //   2439: iconst_4
    //   2440: invokevirtual a : (II)V
    //   2443: goto -> 4022
    //   2446: aload_0
    //   2447: getfield a : [Z
    //   2450: iconst_3
    //   2451: baload
    //   2452: ifeq -> 3218
    //   2455: aload #7
    //   2457: aload_1
    //   2458: aload #6
    //   2460: aload_2
    //   2461: iconst_1
    //   2462: invokestatic b : (Lk;Lkl;Lkf;Lkh;Z)Z
    //   2465: ifne -> 4022
    //   2468: aload_1
    //   2469: getfield k : I
    //   2472: bipush #8
    //   2474: if_icmpne -> 2758
    //   2477: aload #7
    //   2479: getfield b : I
    //   2482: aload #7
    //   2484: getfield d : I
    //   2487: iadd
    //   2488: bipush #32
    //   2490: idiv
    //   2491: istore_3
    //   2492: aload #7
    //   2494: getfield a : I
    //   2497: iconst_5
    //   2498: iadd
    //   2499: bipush #32
    //   2501: idiv
    //   2502: istore #4
    //   2504: aload #7
    //   2506: getfield a : I
    //   2509: aload #7
    //   2511: getfield c : I
    //   2514: iadd
    //   2515: iconst_5
    //   2516: isub
    //   2517: bipush #32
    //   2519: idiv
    //   2520: istore #5
    //   2522: aload #6
    //   2524: iload_3
    //   2525: iload #4
    //   2527: invokevirtual b : (II)B
    //   2530: pop
    //   2531: aload #6
    //   2533: iload_3
    //   2534: iload #5
    //   2536: invokevirtual b : (II)B
    //   2539: invokestatic c : (I)Z
    //   2542: ifne -> 2575
    //   2545: aload #6
    //   2547: iload_3
    //   2548: iload #4
    //   2550: invokevirtual b : (II)B
    //   2553: invokestatic c : (I)Z
    //   2556: ifne -> 2575
    //   2559: aload_1
    //   2560: getfield y : Z
    //   2563: ifne -> 3230
    //   2566: aload_1
    //   2567: bipush #6
    //   2569: invokevirtual a : (I)V
    //   2572: goto -> 3230
    //   2575: aload #7
    //   2577: getfield b : I
    //   2580: aload #7
    //   2582: getfield d : I
    //   2585: iadd
    //   2586: aload_1
    //   2587: getfield i : I
    //   2590: iadd
    //   2591: bipush #32
    //   2593: idiv
    //   2594: istore_3
    //   2595: aload #7
    //   2597: getfield a : I
    //   2600: aload_1
    //   2601: getfield i : I
    //   2604: iadd
    //   2605: bipush #32
    //   2607: idiv
    //   2608: istore #4
    //   2610: aload #6
    //   2612: iload_3
    //   2613: iload #4
    //   2615: invokevirtual b : (II)B
    //   2618: dup
    //   2619: istore #5
    //   2621: invokestatic d : (I)Z
    //   2624: ifeq -> 2658
    //   2627: aload_1
    //   2628: iload #4
    //   2630: iconst_5
    //   2631: ishl
    //   2632: iconst_1
    //   2633: iadd
    //   2634: iload_3
    //   2635: iconst_5
    //   2636: ishl
    //   2637: aload #7
    //   2639: getfield d : I
    //   2642: isub
    //   2643: iconst_1
    //   2644: iadd
    //   2645: invokevirtual c : (II)V
    //   2648: aload_1
    //   2649: iconst_1
    //   2650: bipush #10
    //   2652: invokevirtual a : (II)V
    //   2655: goto -> 3230
    //   2658: aload #7
    //   2660: getfield b : I
    //   2663: aload #7
    //   2665: getfield d : I
    //   2668: iadd
    //   2669: aload_1
    //   2670: getfield i : I
    //   2673: isub
    //   2674: bipush #32
    //   2676: idiv
    //   2677: istore_3
    //   2678: aload #7
    //   2680: getfield a : I
    //   2683: aload #7
    //   2685: getfield c : I
    //   2688: iadd
    //   2689: aload_1
    //   2690: getfield i : I
    //   2693: iadd
    //   2694: bipush #32
    //   2696: idiv
    //   2697: istore #4
    //   2699: aload #6
    //   2701: iload_3
    //   2702: iload #4
    //   2704: invokevirtual b : (II)B
    //   2707: pop
    //   2708: aload #6
    //   2710: iload_3
    //   2711: iload #4
    //   2713: invokevirtual b : (II)B
    //   2716: invokestatic l : (I)Z
    //   2719: ifeq -> 3230
    //   2722: aload_1
    //   2723: iload #4
    //   2725: iconst_5
    //   2726: ishl
    //   2727: aload #7
    //   2729: getfield c : I
    //   2732: isub
    //   2733: iload_3
    //   2734: iconst_5
    //   2735: ishl
    //   2736: bipush #32
    //   2738: aload #7
    //   2740: getfield d : I
    //   2743: isub
    //   2744: iadd
    //   2745: invokevirtual c : (II)V
    //   2748: aload_1
    //   2749: iconst_1
    //   2750: bipush #9
    //   2752: invokevirtual a : (II)V
    //   2755: goto -> 3230
    //   2758: aload_1
    //   2759: getfield k : I
    //   2762: bipush #10
    //   2764: if_icmpne -> 2953
    //   2767: aload #7
    //   2769: getfield b : I
    //   2772: aload #7
    //   2774: getfield d : I
    //   2777: iadd
    //   2778: bipush #32
    //   2780: idiv
    //   2781: istore_3
    //   2782: aload #7
    //   2784: getfield a : I
    //   2787: bipush #32
    //   2789: idiv
    //   2790: istore #4
    //   2792: aload #7
    //   2794: getfield b : I
    //   2797: aload #7
    //   2799: getfield d : I
    //   2802: iadd
    //   2803: aload_1
    //   2804: getfield i : I
    //   2807: iadd
    //   2808: bipush #32
    //   2810: idiv
    //   2811: istore #5
    //   2813: aload #7
    //   2815: getfield a : I
    //   2818: aload_1
    //   2819: getfield i : I
    //   2822: iadd
    //   2823: bipush #32
    //   2825: idiv
    //   2826: istore #8
    //   2828: iload_3
    //   2829: iload #5
    //   2831: if_icmpeq -> 2884
    //   2834: iload #4
    //   2836: iload #8
    //   2838: if_icmpeq -> 3230
    //   2841: aload #6
    //   2843: iload #5
    //   2845: iload #8
    //   2847: invokevirtual b : (II)B
    //   2850: invokestatic d : (I)Z
    //   2853: ifne -> 3230
    //   2856: aload_1
    //   2857: iload #8
    //   2859: iconst_5
    //   2860: ishl
    //   2861: iload #5
    //   2863: iconst_5
    //   2864: ishl
    //   2865: aload #7
    //   2867: getfield d : I
    //   2870: isub
    //   2871: invokevirtual c : (II)V
    //   2874: aload_1
    //   2875: iconst_1
    //   2876: bipush #8
    //   2878: invokevirtual a : (II)V
    //   2881: goto -> 3230
    //   2884: iload #4
    //   2886: iload #8
    //   2888: if_icmpeq -> 3230
    //   2891: aload #6
    //   2893: iload #5
    //   2895: iload #8
    //   2897: invokevirtual b : (II)B
    //   2900: invokestatic d : (I)Z
    //   2903: ifne -> 3230
    //   2906: aload #6
    //   2908: iload #5
    //   2910: iconst_1
    //   2911: iadd
    //   2912: iload #8
    //   2914: invokevirtual b : (II)B
    //   2917: invokestatic d : (I)Z
    //   2920: ifne -> 3230
    //   2923: aload_1
    //   2924: iload #8
    //   2926: iconst_5
    //   2927: ishl
    //   2928: iload #5
    //   2930: iconst_1
    //   2931: iadd
    //   2932: iconst_5
    //   2933: ishl
    //   2934: aload #7
    //   2936: getfield d : I
    //   2939: isub
    //   2940: invokevirtual c : (II)V
    //   2943: aload_1
    //   2944: iconst_1
    //   2945: bipush #8
    //   2947: invokevirtual a : (II)V
    //   2950: goto -> 3230
    //   2953: aload_1
    //   2954: getfield k : I
    //   2957: bipush #9
    //   2959: if_icmpne -> 3171
    //   2962: aload #7
    //   2964: getfield b : I
    //   2967: aload #7
    //   2969: getfield d : I
    //   2972: iadd
    //   2973: bipush #32
    //   2975: idiv
    //   2976: istore_3
    //   2977: aload #7
    //   2979: getfield a : I
    //   2982: aload #7
    //   2984: getfield c : I
    //   2987: iadd
    //   2988: bipush #32
    //   2990: idiv
    //   2991: istore #4
    //   2993: aload #7
    //   2995: getfield b : I
    //   2998: aload #7
    //   3000: getfield d : I
    //   3003: iadd
    //   3004: aload_1
    //   3005: getfield i : I
    //   3008: isub
    //   3009: bipush #32
    //   3011: idiv
    //   3012: istore #5
    //   3014: aload #7
    //   3016: getfield a : I
    //   3019: aload #7
    //   3021: getfield c : I
    //   3024: iadd
    //   3025: aload_1
    //   3026: getfield i : I
    //   3029: iadd
    //   3030: bipush #32
    //   3032: idiv
    //   3033: istore #8
    //   3035: iload_3
    //   3036: iload #5
    //   3038: if_icmpeq -> 3100
    //   3041: iload #4
    //   3043: iload #8
    //   3045: if_icmpeq -> 3230
    //   3048: aload #6
    //   3050: iload #5
    //   3052: iload #8
    //   3054: invokevirtual b : (II)B
    //   3057: invokestatic l : (I)Z
    //   3060: ifne -> 3230
    //   3063: aload_1
    //   3064: iload #8
    //   3066: iconst_5
    //   3067: ishl
    //   3068: aload #7
    //   3070: getfield c : I
    //   3073: isub
    //   3074: iload #5
    //   3076: iconst_5
    //   3077: ishl
    //   3078: bipush #32
    //   3080: aload #7
    //   3082: getfield d : I
    //   3085: isub
    //   3086: iadd
    //   3087: invokevirtual c : (II)V
    //   3090: aload_1
    //   3091: iconst_1
    //   3092: bipush #8
    //   3094: invokevirtual a : (II)V
    //   3097: goto -> 3230
    //   3100: iload #4
    //   3102: iload #8
    //   3104: if_icmpeq -> 3230
    //   3107: aload #6
    //   3109: iload_3
    //   3110: iload #8
    //   3112: invokevirtual b : (II)B
    //   3115: invokestatic l : (I)Z
    //   3118: ifne -> 3230
    //   3121: aload #6
    //   3123: iload_3
    //   3124: iconst_1
    //   3125: isub
    //   3126: iload #8
    //   3128: invokevirtual b : (II)B
    //   3131: invokestatic l : (I)Z
    //   3134: ifne -> 3230
    //   3137: aload_1
    //   3138: iload #8
    //   3140: iconst_5
    //   3141: ishl
    //   3142: aload #7
    //   3144: getfield c : I
    //   3147: isub
    //   3148: iload #5
    //   3150: iconst_5
    //   3151: ishl
    //   3152: aload #7
    //   3154: getfield d : I
    //   3157: isub
    //   3158: invokevirtual c : (II)V
    //   3161: aload_1
    //   3162: iconst_1
    //   3163: bipush #8
    //   3165: invokevirtual a : (II)V
    //   3168: goto -> 3230
    //   3171: aload_1
    //   3172: getfield k : I
    //   3175: bipush #6
    //   3177: if_icmpne -> 3190
    //   3180: aload_1
    //   3181: iconst_1
    //   3182: bipush #9
    //   3184: invokevirtual a : (II)V
    //   3187: goto -> 4022
    //   3190: aload_1
    //   3191: getfield k : I
    //   3194: iconst_5
    //   3195: if_icmpne -> 3208
    //   3198: aload_1
    //   3199: iconst_1
    //   3200: bipush #10
    //   3202: invokevirtual a : (II)V
    //   3205: goto -> 4022
    //   3208: aload_1
    //   3209: iconst_1
    //   3210: bipush #8
    //   3212: invokevirtual a : (II)V
    //   3215: goto -> 4022
    //   3218: aload_1
    //   3219: getfield y : Z
    //   3222: ifne -> 3230
    //   3225: aload_1
    //   3226: iconst_0
    //   3227: invokevirtual a : (I)V
    //   3230: aload_0
    //   3231: astore_3
    //   3232: iconst_0
    //   3233: istore #4
    //   3235: goto -> 3255
    //   3238: aload_3
    //   3239: getfield a : [Z
    //   3242: iload #4
    //   3244: baload
    //   3245: ifeq -> 3252
    //   3248: iconst_1
    //   3249: goto -> 3266
    //   3252: iinc #4, 1
    //   3255: iload #4
    //   3257: aload_3
    //   3258: getfield a : [Z
    //   3261: arraylength
    //   3262: if_icmplt -> 3238
    //   3265: iconst_0
    //   3266: ifne -> 3274
    //   3269: aload_1
    //   3270: iconst_0
    //   3271: invokevirtual a : (I)V
    //   3274: aload_1
    //   3275: dup
    //   3276: astore_3
    //   3277: getfield j : I
    //   3280: iconst_1
    //   3281: if_icmpne -> 4022
    //   3284: aload_1
    //   3285: getstatic kl.b : [B
    //   3288: aload_1
    //   3289: getfield k : I
    //   3292: baload
    //   3293: aload_1
    //   3294: getfield i : I
    //   3297: imul
    //   3298: getstatic kl.c : [B
    //   3301: aload_1
    //   3302: getfield k : I
    //   3305: baload
    //   3306: aload_1
    //   3307: getfield i : I
    //   3310: imul
    //   3311: invokevirtual b : (II)V
    //   3314: aload_1
    //   3315: getfield k : I
    //   3318: iconst_4
    //   3319: if_icmpne -> 3379
    //   3322: aload #7
    //   3324: getfield b : I
    //   3327: aload #7
    //   3329: getfield d : I
    //   3332: iadd
    //   3333: iconst_1
    //   3334: isub
    //   3335: bipush #32
    //   3337: idiv
    //   3338: istore_3
    //   3339: aload #7
    //   3341: getfield a : I
    //   3344: iconst_1
    //   3345: isub
    //   3346: bipush #32
    //   3348: idiv
    //   3349: istore #4
    //   3351: aload_2
    //   3352: aload #6
    //   3354: iload_3
    //   3355: iload #4
    //   3357: invokevirtual b : (II)B
    //   3360: invokevirtual n : (I)Z
    //   3363: ifeq -> 4022
    //   3366: aload_1
    //   3367: iload #4
    //   3369: iconst_1
    //   3370: iadd
    //   3371: iconst_5
    //   3372: ishl
    //   3373: invokevirtual f : (I)V
    //   3376: goto -> 4022
    //   3379: aload_1
    //   3380: getfield k : I
    //   3383: bipush #8
    //   3385: if_icmpne -> 4022
    //   3388: aload #7
    //   3390: getfield b : I
    //   3393: aload #7
    //   3395: getfield d : I
    //   3398: iadd
    //   3399: iconst_1
    //   3400: isub
    //   3401: bipush #32
    //   3403: idiv
    //   3404: istore_3
    //   3405: aload #7
    //   3407: getfield a : I
    //   3410: aload #7
    //   3412: getfield c : I
    //   3415: iadd
    //   3416: bipush #32
    //   3418: idiv
    //   3419: istore #4
    //   3421: aload_2
    //   3422: aload #6
    //   3424: iload_3
    //   3425: iload #4
    //   3427: invokevirtual b : (II)B
    //   3430: invokevirtual n : (I)Z
    //   3433: ifeq -> 4022
    //   3436: aload_1
    //   3437: iload #4
    //   3439: iconst_1
    //   3440: isub
    //   3441: iconst_5
    //   3442: ishl
    //   3443: aload #7
    //   3445: getfield c : I
    //   3448: bipush #32
    //   3450: isub
    //   3451: isub
    //   3452: invokevirtual f : (I)V
    //   3455: goto -> 4022
    //   3458: aload_0
    //   3459: getfield a : [Z
    //   3462: iconst_0
    //   3463: baload
    //   3464: ifeq -> 3619
    //   3467: aload_1
    //   3468: getfield y : Z
    //   3471: ifne -> 3610
    //   3474: aload #7
    //   3476: getfield b : I
    //   3479: aload #7
    //   3481: getfield d : I
    //   3484: iconst_2
    //   3485: idiv
    //   3486: iadd
    //   3487: bipush #32
    //   3489: idiv
    //   3490: istore_3
    //   3491: aload #7
    //   3493: getfield a : I
    //   3496: aload #7
    //   3498: getfield c : I
    //   3501: iconst_2
    //   3502: idiv
    //   3503: iadd
    //   3504: bipush #32
    //   3506: idiv
    //   3507: istore #4
    //   3509: aload #6
    //   3511: iload_3
    //   3512: iload #4
    //   3514: invokevirtual b : (II)B
    //   3517: invokestatic b : (I)Z
    //   3520: ifeq -> 3552
    //   3523: aload_1
    //   3524: iload #4
    //   3526: iconst_5
    //   3527: ishl
    //   3528: bipush #32
    //   3530: aload #7
    //   3532: getfield c : I
    //   3535: isub
    //   3536: iconst_2
    //   3537: idiv
    //   3538: iadd
    //   3539: invokevirtual f : (I)V
    //   3542: aload_1
    //   3543: bipush #8
    //   3545: iconst_1
    //   3546: invokevirtual a : (II)V
    //   3549: goto -> 3759
    //   3552: aload_1
    //   3553: invokevirtual o : ()I
    //   3556: bipush #20
    //   3558: iadd
    //   3559: bipush #32
    //   3561: idiv
    //   3562: istore_3
    //   3563: aload #7
    //   3565: getfield a : I
    //   3568: aload #7
    //   3570: getfield c : I
    //   3573: iconst_2
    //   3574: idiv
    //   3575: iadd
    //   3576: bipush #32
    //   3578: idiv
    //   3579: istore #4
    //   3581: aload #6
    //   3583: iload_3
    //   3584: iload #4
    //   3586: invokevirtual b : (II)B
    //   3589: invokestatic a : (B)Z
    //   3592: ifeq -> 3759
    //   3595: aload_1
    //   3596: iconst_5
    //   3597: invokevirtual a : (I)V
    //   3600: aload_0
    //   3601: getfield a : [Z
    //   3604: iconst_0
    //   3605: iconst_0
    //   3606: bastore
    //   3607: goto -> 3759
    //   3610: aload_1
    //   3611: iconst_1
    //   3612: iconst_1
    //   3613: invokevirtual a : (II)V
    //   3616: goto -> 3759
    //   3619: aload_0
    //   3620: getfield a : [Z
    //   3623: iconst_1
    //   3624: baload
    //   3625: ifeq -> 3759
    //   3628: aload #7
    //   3630: getfield b : I
    //   3633: aload #7
    //   3635: getfield d : I
    //   3638: iadd
    //   3639: bipush #8
    //   3641: iadd
    //   3642: bipush #32
    //   3644: idiv
    //   3645: istore_3
    //   3646: aload #7
    //   3648: getfield a : I
    //   3651: aload #7
    //   3653: getfield c : I
    //   3656: iconst_2
    //   3657: idiv
    //   3658: iadd
    //   3659: bipush #32
    //   3661: idiv
    //   3662: istore #4
    //   3664: aload_1
    //   3665: getfield y : Z
    //   3668: ifne -> 3717
    //   3671: aload #6
    //   3673: iload_3
    //   3674: iload #4
    //   3676: invokevirtual b : (II)B
    //   3679: invokestatic b : (I)Z
    //   3682: ifeq -> 3759
    //   3685: aload_1
    //   3686: iload #4
    //   3688: iconst_5
    //   3689: ishl
    //   3690: bipush #32
    //   3692: aload #7
    //   3694: getfield c : I
    //   3697: isub
    //   3698: iconst_2
    //   3699: idiv
    //   3700: iadd
    //   3701: iload_3
    //   3702: iconst_5
    //   3703: ishl
    //   3704: invokevirtual c : (II)V
    //   3707: aload_1
    //   3708: bipush #8
    //   3710: iconst_2
    //   3711: invokevirtual a : (II)V
    //   3714: goto -> 4022
    //   3717: aload #6
    //   3719: iload_3
    //   3720: iload #4
    //   3722: invokevirtual b : (II)B
    //   3725: invokestatic c : (I)Z
    //   3728: ifeq -> 3745
    //   3731: aload #6
    //   3733: iload_3
    //   3734: iload #4
    //   3736: invokevirtual b : (II)B
    //   3739: invokestatic b : (I)Z
    //   3742: ifeq -> 3754
    //   3745: aload_1
    //   3746: iconst_1
    //   3747: iconst_2
    //   3748: invokevirtual a : (II)V
    //   3751: goto -> 3759
    //   3754: aload_1
    //   3755: iconst_0
    //   3756: invokevirtual a : (I)V
    //   3759: aload_1
    //   3760: getfield y : Z
    //   3763: ifne -> 4012
    //   3766: aload_1
    //   3767: getfield k : I
    //   3770: iconst_4
    //   3771: if_icmpne -> 3863
    //   3774: aload #7
    //   3776: getfield b : I
    //   3779: aload #7
    //   3781: getfield d : I
    //   3784: iadd
    //   3785: bipush #32
    //   3787: idiv
    //   3788: istore_3
    //   3789: aload #7
    //   3791: getfield a : I
    //   3794: aload #7
    //   3796: getfield c : I
    //   3799: iadd
    //   3800: iconst_5
    //   3801: isub
    //   3802: bipush #32
    //   3804: idiv
    //   3805: istore #4
    //   3807: aload #7
    //   3809: getfield a : I
    //   3812: iconst_5
    //   3813: iadd
    //   3814: bipush #32
    //   3816: idiv
    //   3817: istore #5
    //   3819: aload #6
    //   3821: iload_3
    //   3822: iload #5
    //   3824: invokevirtual b : (II)B
    //   3827: invokestatic c : (I)Z
    //   3830: ifne -> 4012
    //   3833: aload #6
    //   3835: iload_3
    //   3836: iload #4
    //   3838: invokevirtual b : (II)B
    //   3841: invokestatic c : (I)Z
    //   3844: ifne -> 4012
    //   3847: aload_1
    //   3848: getfield y : Z
    //   3851: ifne -> 4022
    //   3854: aload_1
    //   3855: bipush #6
    //   3857: invokevirtual a : (I)V
    //   3860: goto -> 4022
    //   3863: aload_1
    //   3864: getfield k : I
    //   3867: bipush #8
    //   3869: if_icmpne -> 4012
    //   3872: aload #7
    //   3874: getfield b : I
    //   3877: aload #7
    //   3879: getfield d : I
    //   3882: iadd
    //   3883: bipush #32
    //   3885: idiv
    //   3886: istore_3
    //   3887: aload #7
    //   3889: getfield a : I
    //   3892: iconst_5
    //   3893: iadd
    //   3894: bipush #32
    //   3896: idiv
    //   3897: istore #4
    //   3899: aload #7
    //   3901: getfield a : I
    //   3904: aload #7
    //   3906: getfield c : I
    //   3909: iadd
    //   3910: iconst_5
    //   3911: isub
    //   3912: bipush #32
    //   3914: idiv
    //   3915: istore #5
    //   3917: aload #6
    //   3919: iload_3
    //   3920: iload #5
    //   3922: invokevirtual b : (II)B
    //   3925: invokestatic c : (I)Z
    //   3928: ifne -> 4012
    //   3931: aload #6
    //   3933: iload_3
    //   3934: iload #4
    //   3936: invokevirtual b : (II)B
    //   3939: invokestatic c : (I)Z
    //   3942: ifne -> 4012
    //   3945: aload #7
    //   3947: getfield b : I
    //   3950: aload #7
    //   3952: getfield d : I
    //   3955: iadd
    //   3956: bipush #32
    //   3958: idiv
    //   3959: istore_3
    //   3960: aload #7
    //   3962: getfield a : I
    //   3965: bipush #32
    //   3967: idiv
    //   3968: istore #4
    //   3970: aload #7
    //   3972: getfield a : I
    //   3975: pop
    //   3976: aload #7
    //   3978: getfield c : I
    //   3981: pop
    //   3982: aload #6
    //   3984: iload_3
    //   3985: iload #4
    //   3987: invokevirtual b : (II)B
    //   3990: invokestatic d : (I)Z
    //   3993: ifne -> 4012
    //   3996: aload_1
    //   3997: getfield y : Z
    //   4000: ifne -> 4022
    //   4003: aload_1
    //   4004: bipush #6
    //   4006: invokevirtual a : (I)V
    //   4009: goto -> 4022
    //   4012: aload_0
    //   4013: aload #7
    //   4015: aload #6
    //   4017: aload_2
    //   4018: aload_1
    //   4019: invokespecial a : (Lk;Lkf;Lkh;Lkl;)V
    //   4022: aload_2
    //   4023: aload #7
    //   4025: invokevirtual b : (Lk;)Z
    //   4028: pop
    //   4029: return
  }
  
  private static boolean a(k paramk, kl paramkl, kf paramkf, kh paramkh, boolean paramBoolean) {
    int j = (paramk.b + paramk.d / 2) / 32;
    int i = (paramk.a - paramkl.i) / 32;
    if (paramkh.n(paramkf.b(j, i))) {
      if (paramBoolean)
        paramkl.f(i + 1 << 5); 
      return true;
    } 
    return false;
  }
  
  private static boolean b(k paramk, kl paramkl, kf paramkf, kh paramkh, boolean paramBoolean) {
    int i = (paramk.b + paramk.d / 2) / 32;
    int j = (paramk.a + paramk.c + paramkl.i) / 32;
    if (paramkh.m(paramkf.b(i, j))) {
      if (paramBoolean)
        paramkl.f((j - 1 << 5) - paramk.c - 32); 
      return true;
    } 
    return false;
  }
  
  private void a(k paramk, kf paramkf, kh paramkh, kl paramkl) {
    if (this.a[2]) {
      int i = (paramk.b + paramk.d) / 32;
      int j = paramk.a / 32;
      int m = (paramk.a + paramk.c) / 32;
      if (!paramkl.y) {
        if (!kh.c(paramkf.b(i, m)) && kh.d(paramkf.b(i, j))) {
          paramkl.a(1, 5);
          return;
        } 
        if (!kh.c(paramkf.b(i, j)) && kh.l(paramkf.b(i, m))) {
          paramkl.a(1, 6);
          return;
        } 
        if (kh.l(paramkf.b(i, m))) {
          paramkl.a(1, 6);
          return;
        } 
        if (kh.d(paramkf.b(i, j))) {
          paramkl.a(1, 5);
          return;
        } 
        paramkl.a(1, 4);
        return;
      } 
      paramkl.a(1, 4);
      return;
    } 
    if (this.a[3]) {
      int i = (paramk.b + paramk.d) / 32;
      int j = paramk.a / 32;
      int m = (paramk.a + paramk.c) / 32;
      if (!paramkl.y) {
        if (!kh.c(paramkf.b(i, m)) && kh.d(paramkf.b(i, j))) {
          paramkl.a(1, 10);
          return;
        } 
        j = (paramk.a + paramk.c) / 32;
        m = paramk.a / 32;
        if (!kh.c(paramkf.b(i, m)) && kh.l(paramkf.b(i, j))) {
          paramkl.a(1, 9);
          return;
        } 
        if (kh.l(paramkf.b(i, j))) {
          paramkl.a(1, 9);
          return;
        } 
        if (kh.d(paramkf.b(i, m))) {
          paramkl.a(1, 10);
          return;
        } 
        paramkl.a(1, 8);
        return;
      } 
      paramkl.a(1, 8);
    } 
  }
  
  private void a(kl paramkl, k paramk, kf paramkf, kh paramkh) {
    int i = (paramk.b + paramk.d) / 32;
    if (this.a[2]) {
      int j = (paramk.a - paramkl.i) / 32;
      if ((paramkl.k & 0x4) == 0) {
        paramkl.b(4);
      } else if (!a(paramk, paramkl, paramkf, paramkh, false) && !paramkh.n(paramkf.b(i, j))) {
        paramk.a += paramkl.i * kl.b[4];
      } 
    } else if (this.a[3]) {
      int j = (paramk.a + paramk.c + paramkl.i) / 32;
      if ((paramkl.k & 0x8) == 0) {
        paramkl.b(8);
      } else if (!b(paramk, paramkl, paramkf, paramkh, false) && !paramkh.m(paramkf.b(i, j))) {
        paramk.a += paramkl.i * kl.b[8];
      } 
    } 
    if (this.a[0] || this.a[1] || this.a[4]) {
      int m = (paramk.a + paramk.c / 2) / 32;
      i = (paramk.b + paramk.d - 5) / 32;
      int j = (paramk.b + 10) / 32;
      if (kh.b(paramkf.b(i, m)) && kh.b(paramkf.b(j, m))) {
        paramkl.f((m << 5) + (32 - paramk.c) / 2);
        paramkl.a(8, this.a[1] ? 2 : 1);
        this.a[3] = false;
        this.a[2] = false;
      } 
    } 
  }
  
  public final void a(int paramInt, kl paramkl) {
    kl kl1;
    switch (paramInt) {
      case 99:
      case 150:
        this.a[0] = true;
        this.a[1] = false;
        return;
      case 98:
      case 156:
        this.a[1] = true;
        this.a[0] = false;
        return;
      case 97:
      case 152:
        this.a[2] = true;
        this.a[3] = false;
        return;
      case 96:
      case 154:
        this.a[3] = true;
        this.a[2] = false;
        return;
      case 95:
      case 153:
        if ((kl1 = paramkl).j == 0 || (kl1 = paramkl).j == 1)
          paramkl.a(4); 
        a();
        return;
      case 149:
        this.a[2] = true;
        this.a[0] = true;
        return;
      case 151:
        this.a[3] = true;
        this.a[0] = true;
        break;
    } 
  }
  
  public final void a(int paramInt) {
    switch (paramInt) {
      case 99:
      case 150:
        this.a[0] = false;
        return;
      case 98:
      case 156:
        this.a[1] = false;
        return;
      case 97:
      case 152:
        this.a[2] = false;
        return;
      case 96:
      case 154:
        this.a[3] = false;
        return;
      case 95:
      case 153:
        return;
      case 149:
        this.a[2] = false;
        this.a[0] = false;
        return;
      case 151:
        this.a[3] = false;
        this.a[0] = false;
        break;
    } 
  }
  
  public final void a() {
    this.a[4] = false;
    this.a[1] = false;
    this.a[0] = false;
    this.a[3] = false;
    this.a[2] = false;
  }
}


/* Location:              G:\DOWNLOAD\Loạn 12 Sứ Quân Online.jar!\km.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */