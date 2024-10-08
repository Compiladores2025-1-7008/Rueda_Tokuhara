/* The following code was generated by JFlex 1.7.0 */

/**
 * Escáner que detecta números y palabras
*/


public class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\2\3\25\0\1\3\17\0\12\1\7\0\6\4\24\2\4\0"+
    "\1\23\1\0\1\15\1\7\1\12\1\4\1\17\1\4\2\2\1\11"+
    "\2\2\1\10\1\21\1\22\1\2\1\5\1\2\1\13\1\20\1\16"+
    "\1\6\1\14\4\2\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uff95\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\5\3\1\5\1\2"+
    "\1\0\2\5\6\3\1\5\1\2\1\0\5\5\6\3"+
    "\1\2\1\0\7\5\4\3\1\6\1\2\1\0\11\5"+
    "\3\3\1\2\1\7\2\5\12\7\1\3\64\5";

  private static int [] zzUnpackAction() {
    int [] result = new int[130];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\24\0\50\0\74\0\24\0\120\0\144\0\170"+
    "\0\214\0\240\0\264\0\310\0\334\0\360\0\u0104\0\u0118"+
    "\0\u012c\0\u0140\0\u0154\0\u0168\0\u017c\0\u0190\0\u01a4\0\u01b8"+
    "\0\u01cc\0\u01e0\0\u01f4\0\u0208\0\u021c\0\u0230\0\u0244\0\u0258"+
    "\0\u026c\0\u0280\0\u0294\0\u02a8\0\u02bc\0\u02d0\0\u02e4\0\u02f8"+
    "\0\u030c\0\u0320\0\u0334\0\u0348\0\u035c\0\u0370\0\u0384\0\u0398"+
    "\0\74\0\u03ac\0\u03c0\0\u03d4\0\u03e8\0\u03fc\0\u0410\0\u0424"+
    "\0\u0438\0\u044c\0\u0460\0\u0474\0\u0488\0\u049c\0\u04b0\0\u04c4"+
    "\0\24\0\u04d8\0\u04ec\0\u04d8\0\u04ec\0\u03e8\0\u03d4\0\u02e4"+
    "\0\u02d0\0\u01e0\0\u01cc\0\360\0\74\0\u0500\0\u0514\0\u0528"+
    "\0\u053c\0\u0550\0\u0564\0\u0578\0\u058c\0\u05a0\0\u05b4\0\u05c8"+
    "\0\u05dc\0\u05f0\0\u0604\0\u0618\0\u062c\0\u0640\0\u0654\0\u0668"+
    "\0\u067c\0\u0690\0\u06a4\0\u06b8\0\u06cc\0\u06e0\0\u06f4\0\u0708"+
    "\0\u071c\0\u0730\0\u0744\0\u0758\0\u076c\0\u0780\0\u0794\0\u07a8"+
    "\0\u07bc\0\u07d0\0\u07e4\0\u07f8\0\u080c\0\u0820\0\u0834\0\u0848"+
    "\0\u085c\0\u0870\0\u0884\0\u0898\0\u08ac\0\u08c0\0\u08d4\0\u08e8"+
    "\0\24\0\u08fc";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[130];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\4\1\6"+
    "\2\4\1\10\2\4\1\6\1\4\1\6\1\11\1\12"+
    "\1\4\1\13\25\0\1\14\2\0\1\15\2\0\1\15"+
    "\2\0\1\15\2\0\1\15\1\0\1\15\5\0\1\16"+
    "\1\4\1\0\17\4\1\16\1\0\1\17\1\4\1\0"+
    "\1\20\2\4\1\20\2\4\1\20\2\4\1\20\1\4"+
    "\1\20\3\4\1\16\1\0\1\16\1\4\1\0\2\4"+
    "\1\21\4\4\1\22\7\4\1\16\1\0\1\17\1\4"+
    "\1\0\1\20\2\4\1\20\1\23\1\4\1\20\2\4"+
    "\1\20\1\4\1\20\3\4\1\16\1\0\1\16\1\4"+
    "\1\0\12\4\1\24\4\4\1\16\1\0\1\16\1\4"+
    "\1\0\11\4\1\25\5\4\1\16\1\0\1\16\1\26"+
    "\1\0\17\26\1\16\1\0\1\27\2\0\1\30\2\0"+
    "\1\30\2\0\1\30\2\0\1\30\1\0\1\30\5\0"+
    "\1\30\2\0\1\30\2\0\1\30\2\0\1\30\2\0"+
    "\1\30\1\0\1\30\5\0\1\31\1\32\1\0\17\32"+
    "\1\31\1\0\1\33\1\32\1\0\1\34\2\32\1\34"+
    "\2\32\1\34\2\32\1\34\1\32\1\34\3\32\1\31"+
    "\1\0\1\35\1\4\1\0\1\36\2\4\1\36\2\4"+
    "\1\36\2\4\1\36\1\4\1\36\3\4\1\16\1\0"+
    "\1\16\1\4\1\0\3\4\1\37\13\4\1\16\1\0"+
    "\1\16\1\4\1\0\5\4\1\40\11\4\1\16\1\0"+
    "\1\16\1\4\1\0\11\4\1\41\5\4\1\16\1\0"+
    "\1\16\1\4\1\0\11\4\1\42\5\4\1\16\1\0"+
    "\1\16\1\4\1\0\5\4\1\43\11\4\1\16\1\0"+
    "\1\31\1\26\1\0\17\26\1\31\1\0\1\44\2\0"+
    "\1\45\2\0\1\45\2\0\1\45\2\0\1\45\1\0"+
    "\1\45\5\0\1\45\2\0\1\45\2\0\1\45\2\0"+
    "\1\45\2\0\1\45\1\0\1\45\5\0\1\46\1\47"+
    "\1\0\17\47\1\46\1\0\1\46\1\32\1\0\17\32"+
    "\1\46\1\0\1\50\1\47\1\0\1\51\2\47\1\51"+
    "\2\47\1\51\2\47\1\51\1\47\1\51\3\47\1\46"+
    "\1\0\1\50\1\32\1\0\1\52\2\32\1\52\2\32"+
    "\1\52\2\32\1\52\1\32\1\52\3\32\1\46\1\0"+
    "\1\53\1\32\1\0\1\52\2\32\1\52\2\32\1\52"+
    "\2\32\1\52\1\32\1\52\3\32\1\31\1\0\1\54"+
    "\1\4\1\0\1\55\2\4\1\55\2\4\1\55\2\4"+
    "\1\55\1\4\1\55\3\4\1\16\1\0\1\16\1\4"+
    "\1\0\4\4\1\56\12\4\1\16\1\0\1\16\1\4"+
    "\1\0\10\4\1\57\6\4\1\16\1\0\1\16\1\4"+
    "\1\0\14\4\1\60\2\4\1\16\1\0\1\16\1\4"+
    "\1\0\12\4\1\56\4\4\1\16\1\0\1\16\1\4"+
    "\1\0\16\4\1\61\1\16\1\0\1\62\2\0\1\63"+
    "\2\0\1\63\2\0\1\63\2\0\1\63\1\0\1\63"+
    "\5\0\1\63\2\0\1\63\2\0\1\63\2\0\1\63"+
    "\2\0\1\63\1\0\1\63\5\0\1\64\1\65\1\0"+
    "\17\65\1\64\1\0\1\64\1\47\1\0\17\47\1\64"+
    "\1\0\1\66\1\65\1\0\1\67\2\65\1\67\2\65"+
    "\1\67\2\65\1\67\1\65\1\67\3\65\1\64\1\0"+
    "\1\66\1\47\1\0\1\70\2\47\1\70\2\47\1\70"+
    "\2\47\1\70\1\47\1\70\3\47\1\64\1\0\1\71"+
    "\1\32\1\0\1\72\2\32\1\72\2\32\1\72\2\32"+
    "\1\72\1\32\1\72\3\32\1\46\1\0\1\71\1\47"+
    "\1\0\1\70\2\47\1\70\2\47\1\70\2\47\1\70"+
    "\1\47\1\70\3\47\1\46\1\0\1\73\1\32\1\0"+
    "\1\72\2\32\1\72\2\32\1\72\2\32\1\72\1\32"+
    "\1\72\3\32\1\31\1\0\1\74\1\4\1\0\1\75"+
    "\2\4\1\75\2\4\1\75\2\4\1\75\1\4\1\75"+
    "\3\4\1\16\1\0\1\16\1\4\1\0\5\4\1\76"+
    "\11\4\1\16\1\0\1\16\1\4\1\0\11\4\1\77"+
    "\5\4\1\16\1\0\1\16\1\4\1\0\14\4\1\61"+
    "\2\4\1\16\1\0\1\100\2\0\1\101\2\0\1\101"+
    "\2\0\1\101\2\0\1\101\1\0\1\101\5\0\1\101"+
    "\2\0\1\101\2\0\1\101\2\0\1\101\2\0\1\101"+
    "\1\0\1\101\5\0\1\102\1\103\1\0\17\103\1\102"+
    "\1\0\1\102\1\65\1\0\17\65\1\102\1\0\1\104"+
    "\1\103\1\0\1\105\2\103\1\105\2\103\1\105\2\103"+
    "\1\105\1\103\1\105\3\103\1\102\1\0\1\104\1\65"+
    "\1\0\1\106\2\65\1\106\2\65\1\106\2\65\1\106"+
    "\1\65\1\106\3\65\1\102\1\0\1\107\1\47\1\0"+
    "\1\110\2\47\1\110\2\47\1\110\2\47\1\110\1\47"+
    "\1\110\3\47\1\64\1\0\1\107\1\65\1\0\1\106"+
    "\2\65\1\106\2\65\1\106\2\65\1\106\1\65\1\106"+
    "\3\65\1\64\1\0\1\111\1\32\1\0\1\112\2\32"+
    "\1\112\2\32\1\112\2\32\1\112\1\32\1\112\3\32"+
    "\1\46\1\0\1\111\1\47\1\0\1\110\2\47\1\110"+
    "\2\47\1\110\2\47\1\110\1\47\1\110\3\47\1\46"+
    "\1\0\1\113\1\32\1\0\1\112\2\32\1\112\2\32"+
    "\1\112\2\32\1\112\1\32\1\112\3\32\1\31\1\0"+
    "\1\114\1\4\1\0\1\115\2\4\1\115\2\4\1\115"+
    "\2\4\1\115\1\4\1\115\3\4\1\16\1\0\1\16"+
    "\1\4\1\0\6\4\1\61\10\4\1\16\1\0\1\16"+
    "\1\4\1\0\12\4\1\116\4\4\1\16\1\0\1\100"+
    "\23\0\1\117\1\120\1\0\17\120\1\117\1\0\1\117"+
    "\1\103\1\0\17\103\1\117\1\0\1\16\1\4\1\0"+
    "\13\4\1\61\3\4\1\16\1\0\1\121\1\122\1\0"+
    "\17\122\1\121\1\0\1\121\1\120\1\0\17\120\1\121"+
    "\1\0\1\123\1\124\1\0\17\124\1\123\1\0\1\123"+
    "\1\122\1\0\17\122\1\123\1\0\1\125\1\126\1\0"+
    "\17\126\1\125\1\0\1\125\1\124\1\0\17\124\1\125"+
    "\1\0\1\127\1\130\1\0\17\130\1\127\1\0\1\127"+
    "\1\126\1\0\17\126\1\127\1\0\1\131\1\132\1\0"+
    "\17\132\1\131\1\0\1\131\1\130\1\0\17\130\1\131"+
    "\1\0\1\133\1\134\1\0\17\134\1\133\1\0\1\133"+
    "\1\132\1\0\17\132\1\133\1\0\1\135\1\136\1\0"+
    "\17\136\1\135\1\0\1\135\1\134\1\0\17\134\1\135"+
    "\1\0\1\137\1\140\1\0\17\140\1\137\1\0\1\137"+
    "\1\136\1\0\17\136\1\137\1\0\1\141\1\142\1\0"+
    "\17\142\1\141\1\0\1\141\1\140\1\0\17\140\1\141"+
    "\1\0\1\143\1\144\1\0\17\144\1\143\1\0\1\143"+
    "\1\142\1\0\17\142\1\143\1\0\1\145\1\146\1\0"+
    "\17\146\1\145\1\0\1\145\1\144\1\0\17\144\1\145"+
    "\1\0\1\147\1\150\1\0\17\150\1\147\1\0\1\147"+
    "\1\146\1\0\17\146\1\147\1\0\1\151\1\152\1\0"+
    "\17\152\1\151\1\0\1\151\1\150\1\0\17\150\1\151"+
    "\1\0\1\153\1\154\1\0\17\154\1\153\1\0\1\153"+
    "\1\152\1\0\17\152\1\153\1\0\1\155\1\156\1\0"+
    "\17\156\1\155\1\0\1\155\1\154\1\0\17\154\1\155"+
    "\1\0\1\157\1\160\1\0\17\160\1\157\1\0\1\157"+
    "\1\156\1\0\17\156\1\157\1\0\1\161\1\162\1\0"+
    "\17\162\1\161\1\0\1\161\1\160\1\0\17\160\1\161"+
    "\1\0\1\163\1\164\1\0\17\164\1\163\1\0\1\163"+
    "\1\162\1\0\17\162\1\163\1\0\1\165\1\166\1\0"+
    "\17\166\1\165\1\0\1\165\1\164\1\0\17\164\1\165"+
    "\1\0\1\167\1\170\1\0\17\170\1\167\1\0\1\167"+
    "\1\166\1\0\17\166\1\167\1\0\1\171\1\172\1\0"+
    "\17\172\1\171\1\0\1\171\1\170\1\0\17\170\1\171"+
    "\1\0\1\173\1\174\1\0\17\174\1\173\1\0\1\173"+
    "\1\172\1\0\17\172\1\173\1\0\1\175\1\176\1\0"+
    "\17\176\1\175\1\0\1\175\1\174\1\0\17\174\1\175"+
    "\1\0\1\177\1\200\1\0\17\200\1\177\1\0\1\177"+
    "\1\176\1\0\17\176\1\177\1\0\1\201\1\202\1\0"+
    "\17\202\1\201\1\0\1\201\1\200\1\0\17\200\1\201"+
    "\2\0\1\202\1\0\17\202\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2320];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\1\11\7\1\1\0\12\1\1\0"+
    "\14\1\1\0\15\1\1\0\15\1\1\11\77\1\1\11"+
    "\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[130];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 100) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.out.print(yytext());
            } 
            // fall through
          case 8: break;
          case 2: 
            { System.out.print("Encontré un número: "+yytext()+"\n");
            } 
            // fall through
          case 9: break;
          case 3: 
            { System.out.print("Encontré una palabra y tambien identificador valido para java: "+yytext()+"\n");
            } 
            // fall through
          case 10: break;
          case 4: 
            { System.out.print("Encontré un espacio: "+yytext()+"\n");
            } 
            // fall through
          case 11: break;
          case 5: 
            { System.out.print("Encontré un identificador valido para java: "+yytext()+"\n");
            } 
            // fall through
          case 12: break;
          case 6: 
            { System.out.print("Encontré una palabra reservada: "+yytext()+"\n");
            } 
            // fall through
          case 13: break;
          case 7: 
            { System.out.print("Encontré un hexadecimal: "+yytext()+"\n");
            } 
            // fall through
          case 14: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java Lexer [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          java.nio.charset.Charset.forName(encodingName); // Side-effect: is encodingName valid? 
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        Lexer scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new Lexer(reader);
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
