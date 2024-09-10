/* The following code was generated by JFlex 1.7.0 */

/**
 * Escáner que detecta el lenguaje C_1
*/

package main.jflex;

import main.java.ClaseLexica;
import main.java.Token;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>src/main/jflex/Lexer.flex</tt>
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
    "\11\0\2\4\25\0\1\4\7\0\1\21\1\22\2\0\1\6\1\0"+
    "\1\2\1\0\12\2\1\0\1\5\5\0\32\1\4\0\1\23\1\0"+
    "\1\15\3\1\1\3\1\12\1\1\1\20\1\7\2\1\1\13\1\1"+
    "\1\10\1\14\3\1\1\16\1\11\2\1\1\17\3\1\1\0\1\2"+
    "\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uff93\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\2\3\1\4\1\5\1\6\3\2"+
    "\1\7\1\10\2\2\2\3\2\2\1\11\5\2\2\3"+
    "\1\2\1\12\4\2\2\3\1\13\4\2\2\3\1\14"+
    "\1\15\2\2\2\3\2\2\2\3\2\2\2\3\2\2"+
    "\2\3\2\2\2\3\2\2\2\3\2\2\2\3\2\2"+
    "\2\3\2\2\2\3\2\2\2\3\2\2\2\3\2\2"+
    "\2\3\2\2\2\3\2\2\2\3\2\2\2\3\2\2"+
    "\2\3\2\2\2\3\2\2\2\3\2\2\2\3\2\2"+
    "\2\3\2\2\2\3\2\2\2\3\2\2\2\3\2\2"+
    "\2\3\2\2\2\3\2\2\2\3\2\2\1\3";

  private static int [] zzUnpackAction() {
    int [] result = new int[151];
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
    "\0\0\0\24\0\50\0\74\0\120\0\24\0\24\0\24"+
    "\0\144\0\170\0\214\0\24\0\24\0\240\0\264\0\310"+
    "\0\334\0\360\0\u0104\0\50\0\u0118\0\u012c\0\u0140\0\u0154"+
    "\0\u0168\0\u017c\0\u0190\0\u01a4\0\50\0\u01b8\0\u01cc\0\u01e0"+
    "\0\u01f4\0\u0208\0\u021c\0\50\0\u0230\0\u0244\0\u0258\0\u026c"+
    "\0\u0280\0\u0294\0\50\0\50\0\u02a8\0\u02bc\0\u02d0\0\u02e4"+
    "\0\u02f8\0\u030c\0\u0320\0\u0334\0\u0348\0\u035c\0\u0370\0\u0384"+
    "\0\u0398\0\u03ac\0\u03c0\0\u03d4\0\u03e8\0\u03fc\0\u0410\0\u0424"+
    "\0\u0438\0\u044c\0\u0460\0\u0474\0\u0488\0\u049c\0\u04b0\0\u04c4"+
    "\0\u04d8\0\u04ec\0\u0500\0\u0514\0\u0528\0\u053c\0\u0550\0\u0564"+
    "\0\u0578\0\u058c\0\u05a0\0\u05b4\0\u05c8\0\u05dc\0\u05f0\0\u0604"+
    "\0\u0618\0\u062c\0\u0640\0\u0654\0\u0668\0\u067c\0\u0690\0\u06a4"+
    "\0\u06b8\0\u06cc\0\u06e0\0\u06f4\0\u0708\0\u071c\0\u0730\0\u0744"+
    "\0\u0758\0\u076c\0\u0780\0\u0794\0\u07a8\0\u07bc\0\u07d0\0\u07e4"+
    "\0\u07f8\0\u080c\0\u0820\0\u0834\0\u0848\0\u085c\0\u0870\0\u0884"+
    "\0\u0898\0\u08ac\0\u08c0\0\u08d4\0\u08e8\0\u08fc\0\u0910\0\u0924"+
    "\0\u0938\0\u094c\0\u0960\0\u0974\0\u0988\0\u099c\0\u09b0\0\u09c4"+
    "\0\u09d8\0\u09ec\0\u0a00\0\u0a14\0\u0a28\0\u0a3c\0\u0a50\0\u0a64"+
    "\0\u0a78\0\u0a8c\0\u0aa0\0\u0ab4\0\24\0\u0ac8\0\u0adc";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[151];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\2\3\1\12\4\3\1\13\1\3\1\14\1\15\1\16"+
    "\25\0\1\3\1\17\1\3\3\0\12\3\2\0\1\17"+
    "\2\0\2\4\21\0\1\3\1\20\1\21\3\0\4\3"+
    "\1\22\5\3\2\0\1\17\1\0\1\3\1\17\1\3"+
    "\3\0\1\3\1\23\1\3\1\24\6\3\2\0\1\17"+
    "\1\0\1\3\1\17\1\3\3\0\4\3\1\25\5\3"+
    "\2\0\1\17\1\0\1\3\1\17\1\3\3\0\11\3"+
    "\1\26\2\0\1\17\1\0\1\27\1\17\1\27\3\0"+
    "\12\27\2\0\1\17\1\0\1\30\1\31\1\30\3\0"+
    "\12\30\2\0\1\31\1\0\1\30\1\32\1\33\3\0"+
    "\12\30\2\0\1\31\1\0\1\3\1\20\1\21\3\0"+
    "\12\3\2\0\1\17\1\0\1\3\1\17\1\3\3\0"+
    "\7\3\1\34\2\3\2\0\1\17\1\0\1\3\1\17"+
    "\1\3\3\0\2\3\1\35\7\3\2\0\1\17\1\0"+
    "\1\3\1\17\1\3\3\0\5\3\1\36\4\3\2\0"+
    "\1\17\1\0\1\3\1\17\1\3\3\0\1\37\11\3"+
    "\2\0\1\17\1\0\1\27\1\31\1\27\3\0\12\27"+
    "\2\0\1\31\1\0\1\30\1\40\1\30\3\0\12\30"+
    "\2\0\1\40\1\0\1\41\1\40\1\41\3\0\12\41"+
    "\2\0\1\40\1\0\1\41\1\42\1\43\3\0\12\41"+
    "\2\0\1\40\1\0\1\30\1\42\1\33\3\0\12\30"+
    "\2\0\1\40\1\0\1\3\1\17\1\44\3\0\12\3"+
    "\2\0\1\17\1\0\1\3\1\17\1\3\3\0\6\3"+
    "\1\45\3\3\2\0\1\17\1\0\1\3\1\17\1\3"+
    "\3\0\4\3\1\46\5\3\2\0\1\17\1\0\1\47"+
    "\1\50\1\47\3\0\12\47\2\0\1\50\1\0\1\41"+
    "\1\50\1\41\3\0\12\41\2\0\1\50\1\0\1\47"+
    "\1\51\1\52\3\0\12\47\2\0\1\50\1\0\1\41"+
    "\1\51\1\43\3\0\12\41\2\0\1\50\1\0\1\3"+
    "\1\17\1\3\3\0\2\3\1\53\7\3\2\0\1\17"+
    "\1\0\1\3\1\17\1\54\3\0\12\3\2\0\1\17"+
    "\1\0\1\47\1\55\1\47\3\0\12\47\2\0\1\55"+
    "\1\0\1\56\1\55\1\56\3\0\12\56\2\0\1\55"+
    "\1\0\1\56\1\57\1\60\3\0\12\56\2\0\1\55"+
    "\1\0\1\47\1\57\1\52\3\0\12\47\2\0\1\55"+
    "\1\0\1\61\1\62\1\61\3\0\12\61\2\0\1\62"+
    "\1\0\1\56\1\62\1\56\3\0\12\56\2\0\1\62"+
    "\1\0\1\61\1\63\1\64\3\0\12\61\2\0\1\62"+
    "\1\0\1\56\1\63\1\60\3\0\12\56\2\0\1\62"+
    "\1\0\1\61\1\65\1\61\3\0\12\61\2\0\1\65"+
    "\1\0\1\66\1\65\1\66\3\0\12\66\2\0\1\65"+
    "\1\0\1\66\1\67\1\70\3\0\12\66\2\0\1\65"+
    "\1\0\1\61\1\67\1\64\3\0\12\61\2\0\1\65"+
    "\1\0\1\71\1\72\1\71\3\0\12\71\2\0\1\72"+
    "\1\0\1\66\1\72\1\66\3\0\12\66\2\0\1\72"+
    "\1\0\1\71\1\73\1\74\3\0\12\71\2\0\1\72"+
    "\1\0\1\66\1\73\1\70\3\0\12\66\2\0\1\72"+
    "\1\0\1\71\1\75\1\71\3\0\12\71\2\0\1\75"+
    "\1\0\1\76\1\75\1\76\3\0\12\76\2\0\1\75"+
    "\1\0\1\76\1\77\1\100\3\0\12\76\2\0\1\75"+
    "\1\0\1\71\1\77\1\74\3\0\12\71\2\0\1\75"+
    "\1\0\1\101\1\102\1\101\3\0\12\101\2\0\1\102"+
    "\1\0\1\76\1\102\1\76\3\0\12\76\2\0\1\102"+
    "\1\0\1\101\1\103\1\104\3\0\12\101\2\0\1\102"+
    "\1\0\1\76\1\103\1\100\3\0\12\76\2\0\1\102"+
    "\1\0\1\101\1\105\1\101\3\0\12\101\2\0\1\105"+
    "\1\0\1\106\1\105\1\106\3\0\12\106\2\0\1\105"+
    "\1\0\1\106\1\107\1\110\3\0\12\106\2\0\1\105"+
    "\1\0\1\101\1\107\1\104\3\0\12\101\2\0\1\105"+
    "\1\0\1\111\1\112\1\111\3\0\12\111\2\0\1\112"+
    "\1\0\1\106\1\112\1\106\3\0\12\106\2\0\1\112"+
    "\1\0\1\111\1\113\1\114\3\0\12\111\2\0\1\112"+
    "\1\0\1\106\1\113\1\110\3\0\12\106\2\0\1\112"+
    "\1\0\1\111\1\115\1\111\3\0\12\111\2\0\1\115"+
    "\1\0\1\116\1\115\1\116\3\0\12\116\2\0\1\115"+
    "\1\0\1\116\1\117\1\120\3\0\12\116\2\0\1\115"+
    "\1\0\1\111\1\117\1\114\3\0\12\111\2\0\1\115"+
    "\1\0\1\121\1\122\1\121\3\0\12\121\2\0\1\122"+
    "\1\0\1\116\1\122\1\116\3\0\12\116\2\0\1\122"+
    "\1\0\1\121\1\123\1\124\3\0\12\121\2\0\1\122"+
    "\1\0\1\116\1\123\1\120\3\0\12\116\2\0\1\122"+
    "\1\0\1\121\1\125\1\121\3\0\12\121\2\0\1\125"+
    "\1\0\1\126\1\125\1\126\3\0\12\126\2\0\1\125"+
    "\1\0\1\126\1\127\1\130\3\0\12\126\2\0\1\125"+
    "\1\0\1\121\1\127\1\124\3\0\12\121\2\0\1\125"+
    "\1\0\1\131\1\132\1\131\3\0\12\131\2\0\1\132"+
    "\1\0\1\126\1\132\1\126\3\0\12\126\2\0\1\132"+
    "\1\0\1\131\1\133\1\134\3\0\12\131\2\0\1\132"+
    "\1\0\1\126\1\133\1\130\3\0\12\126\2\0\1\132"+
    "\1\0\1\131\1\135\1\131\3\0\12\131\2\0\1\135"+
    "\1\0\1\136\1\135\1\136\3\0\12\136\2\0\1\135"+
    "\1\0\1\136\1\137\1\140\3\0\12\136\2\0\1\135"+
    "\1\0\1\131\1\137\1\134\3\0\12\131\2\0\1\135"+
    "\1\0\1\141\1\142\1\141\3\0\12\141\2\0\1\142"+
    "\1\0\1\136\1\142\1\136\3\0\12\136\2\0\1\142"+
    "\1\0\1\141\1\143\1\144\3\0\12\141\2\0\1\142"+
    "\1\0\1\136\1\143\1\140\3\0\12\136\2\0\1\142"+
    "\1\0\1\141\1\145\1\141\3\0\12\141\2\0\1\145"+
    "\1\0\1\146\1\145\1\146\3\0\12\146\2\0\1\145"+
    "\1\0\1\146\1\147\1\150\3\0\12\146\2\0\1\145"+
    "\1\0\1\141\1\147\1\144\3\0\12\141\2\0\1\145"+
    "\1\0\1\151\1\152\1\151\3\0\12\151\2\0\1\152"+
    "\1\0\1\146\1\152\1\146\3\0\12\146\2\0\1\152"+
    "\1\0\1\151\1\153\1\154\3\0\12\151\2\0\1\152"+
    "\1\0\1\146\1\153\1\150\3\0\12\146\2\0\1\152"+
    "\1\0\1\151\1\155\1\151\3\0\12\151\2\0\1\155"+
    "\1\0\1\156\1\155\1\156\3\0\12\156\2\0\1\155"+
    "\1\0\1\156\1\157\1\160\3\0\12\156\2\0\1\155"+
    "\1\0\1\151\1\157\1\154\3\0\12\151\2\0\1\155"+
    "\1\0\1\161\1\162\1\161\3\0\12\161\2\0\1\162"+
    "\1\0\1\156\1\162\1\156\3\0\12\156\2\0\1\162"+
    "\1\0\1\161\1\163\1\164\3\0\12\161\2\0\1\162"+
    "\1\0\1\156\1\163\1\160\3\0\12\156\2\0\1\162"+
    "\1\0\1\161\1\165\1\161\3\0\12\161\2\0\1\165"+
    "\1\0\1\166\1\165\1\166\3\0\12\166\2\0\1\165"+
    "\1\0\1\166\1\167\1\170\3\0\12\166\2\0\1\165"+
    "\1\0\1\161\1\167\1\164\3\0\12\161\2\0\1\165"+
    "\1\0\1\171\1\172\1\171\3\0\12\171\2\0\1\172"+
    "\1\0\1\166\1\172\1\166\3\0\12\166\2\0\1\172"+
    "\1\0\1\171\1\173\1\174\3\0\12\171\2\0\1\172"+
    "\1\0\1\166\1\173\1\170\3\0\12\166\2\0\1\172"+
    "\1\0\1\171\1\175\1\171\3\0\12\171\2\0\1\175"+
    "\1\0\1\176\1\175\1\176\3\0\12\176\2\0\1\175"+
    "\1\0\1\176\1\177\1\200\3\0\12\176\2\0\1\175"+
    "\1\0\1\171\1\177\1\174\3\0\12\171\2\0\1\175"+
    "\1\0\1\201\1\202\1\201\3\0\12\201\2\0\1\202"+
    "\1\0\1\176\1\202\1\176\3\0\12\176\2\0\1\202"+
    "\1\0\1\201\1\203\1\204\3\0\12\201\2\0\1\202"+
    "\1\0\1\176\1\203\1\200\3\0\12\176\2\0\1\202"+
    "\1\0\1\201\1\205\1\201\3\0\12\201\2\0\1\205"+
    "\1\0\1\206\1\205\1\206\3\0\12\206\2\0\1\205"+
    "\1\0\1\206\1\207\1\210\3\0\12\206\2\0\1\205"+
    "\1\0\1\201\1\207\1\204\3\0\12\201\2\0\1\205"+
    "\1\0\1\211\1\212\1\211\3\0\12\211\2\0\1\212"+
    "\1\0\1\206\1\212\1\206\3\0\12\206\2\0\1\212"+
    "\1\0\1\211\1\213\1\214\3\0\12\211\2\0\1\212"+
    "\1\0\1\206\1\213\1\210\3\0\12\206\2\0\1\212"+
    "\1\0\1\211\1\215\1\211\3\0\12\211\2\0\1\215"+
    "\1\0\1\216\1\215\1\216\3\0\12\216\2\0\1\215"+
    "\1\0\1\216\1\217\1\220\3\0\12\216\2\0\1\215"+
    "\1\0\1\211\1\217\1\214\3\0\12\211\2\0\1\215"+
    "\1\0\1\221\1\222\1\221\3\0\12\221\2\0\1\222"+
    "\1\0\1\216\1\222\1\216\3\0\12\216\2\0\1\222"+
    "\1\0\1\221\1\223\1\224\3\0\12\221\2\0\1\222"+
    "\1\0\1\216\1\223\1\220\3\0\12\216\2\0\1\222"+
    "\1\0\1\221\1\225\1\221\3\0\12\221\2\0\1\225"+
    "\1\0\1\226\1\225\1\226\3\0\12\226\2\0\1\225"+
    "\1\0\1\226\1\4\1\227\3\0\12\226\2\0\1\225"+
    "\1\0\1\221\1\4\1\224\3\0\12\221\2\0\1\225"+
    "\1\0\1\226\1\0\1\226\3\0\12\226\4\0\1\226"+
    "\1\4\1\227\3\0\12\226\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2800];
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
    "\1\0\1\11\3\1\3\11\3\1\2\11\207\1\1\11"+
    "\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[151];
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

  /* user code: */

public Token actual;



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
    while (i < 114) {
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
          case 14: break;
          case 2: 
            { Token token = new Token(ClaseLexica.ID,yytext()); System.out.println(token.toString());
            } 
            // fall through
          case 15: break;
          case 3: 
            { Token token = new Token(ClaseLexica.NUMERO,yytext()); System.out.println(token.toString());
            } 
            // fall through
          case 16: break;
          case 4: 
            { 
            } 
            // fall through
          case 17: break;
          case 5: 
            { Token token = new Token(ClaseLexica.PYC,yytext()); System.out.println(token.toString());
            } 
            // fall through
          case 18: break;
          case 6: 
            { Token token = new Token(ClaseLexica.COMA,yytext()); System.out.println(token.toString());
            } 
            // fall through
          case 19: break;
          case 7: 
            { Token token = new Token(ClaseLexica.LPAR,yytext()); System.out.println(token.toString());
            } 
            // fall through
          case 20: break;
          case 8: 
            { Token token = new Token(ClaseLexica.RPAR,yytext()); System.out.println(token.toString());
            } 
            // fall through
          case 21: break;
          case 9: 
            { Token token = new Token(ClaseLexica.IF,yytext()); System.out.println(token.toString());
            } 
            // fall through
          case 22: break;
          case 10: 
            { Token token = new Token(ClaseLexica.INT,yytext()); System.out.println(token.toString());
            } 
            // fall through
          case 23: break;
          case 11: 
            { Token token = new Token(ClaseLexica.ELSE,yytext()); System.out.println(token.toString());
            } 
            // fall through
          case 24: break;
          case 12: 
            { Token token = new Token(ClaseLexica.FLOAT,yytext()); System.out.println(token.toString());
            } 
            // fall through
          case 25: break;
          case 13: 
            { Token token = new Token(ClaseLexica.WHILE,yytext()); System.out.println(token.toString());
            } 
            // fall through
          case 26: break;
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
