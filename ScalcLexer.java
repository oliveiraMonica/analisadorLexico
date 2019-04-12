/* The following code was generated by JFlex 1.4.3 on 11/04/19 16:35 */



import beaver.Symbol;
import beaver.Scanner;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 11/04/19 16:35 from the specification file
 * <tt>SCalc.flex</tt>
 */
class ScalcLexer extends Scanner {

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
    "\11\0\1\6\1\2\1\0\1\6\1\1\22\0\1\23\1\22\1\0"+
    "\2\22\1\31\1\42\1\13\1\24\1\25\1\26\1\27\1\47\1\3"+
    "\1\67\1\30\3\21\2\7\1\21\4\7\1\64\1\50\1\45\1\44"+
    "\1\46\1\0\1\22\1\12\1\55\1\56\2\12\1\33\2\12\1\60"+
    "\14\12\1\32\4\12\1\61\1\14\1\62\1\22\2\0\1\37\1\17"+
    "\1\52\1\10\1\34\1\17\1\63\1\57\1\51\2\10\1\54\1\66"+
    "\1\15\1\40\1\65\1\35\1\16\1\41\1\20\1\36\1\53\4\10"+
    "\1\4\1\43\1\5\1\22\53\0\1\11\12\0\1\11\4\0\1\11"+
    "\5\0\27\11\1\0\37\11\1\0\u01ca\11\4\0\14\11\16\0\5\11"+
    "\7\0\1\11\1\0\1\11\201\0\5\11\1\0\2\11\2\0\4\11"+
    "\10\0\1\11\1\0\3\11\1\0\1\11\1\0\24\11\1\0\123\11"+
    "\1\0\213\11\10\0\236\11\11\0\46\11\2\0\1\11\7\0\47\11"+
    "\110\0\33\11\5\0\3\11\55\0\53\11\25\0\12\7\4\0\2\11"+
    "\1\0\143\11\1\0\1\11\17\0\2\11\7\0\2\11\12\7\3\11"+
    "\2\0\1\11\20\0\1\11\1\0\36\11\35\0\131\11\13\0\1\11"+
    "\16\0\12\7\41\11\11\0\2\11\4\0\1\11\5\0\26\11\4\0"+
    "\1\11\11\0\1\11\3\0\1\11\27\0\31\11\107\0\1\11\1\0"+
    "\13\11\127\0\66\11\3\0\1\11\22\0\1\11\7\0\12\11\4\0"+
    "\12\7\1\0\7\11\1\0\7\11\5\0\10\11\2\0\2\11\2\0"+
    "\26\11\1\0\7\11\1\0\1\11\3\0\4\11\3\0\1\11\20\0"+
    "\1\11\15\0\2\11\1\0\3\11\4\0\12\7\2\11\23\0\6\11"+
    "\4\0\2\11\2\0\26\11\1\0\7\11\1\0\2\11\1\0\2\11"+
    "\1\0\2\11\37\0\4\11\1\0\1\11\7\0\12\7\2\0\3\11"+
    "\20\0\11\11\1\0\3\11\1\0\26\11\1\0\7\11\1\0\2\11"+
    "\1\0\5\11\3\0\1\11\22\0\1\11\17\0\2\11\4\0\12\7"+
    "\25\0\10\11\2\0\2\11\2\0\26\11\1\0\7\11\1\0\2\11"+
    "\1\0\5\11\3\0\1\11\36\0\2\11\1\0\3\11\4\0\12\7"+
    "\1\0\1\11\21\0\1\11\1\0\6\11\3\0\3\11\1\0\4\11"+
    "\3\0\2\11\1\0\1\11\1\0\2\11\3\0\2\11\3\0\3\11"+
    "\3\0\14\11\26\0\1\11\25\0\12\7\25\0\10\11\1\0\3\11"+
    "\1\0\27\11\1\0\12\11\1\0\5\11\3\0\1\11\32\0\2\11"+
    "\6\0\2\11\4\0\12\7\25\0\10\11\1\0\3\11\1\0\27\11"+
    "\1\0\12\11\1\0\5\11\3\0\1\11\40\0\1\11\1\0\2\11"+
    "\4\0\12\7\1\0\2\11\22\0\10\11\1\0\3\11\1\0\51\11"+
    "\2\0\1\11\20\0\1\11\21\0\2\11\4\0\12\7\12\0\6\11"+
    "\5\0\22\11\3\0\30\11\1\0\11\11\1\0\1\11\2\0\7\11"+
    "\72\0\60\11\1\0\2\11\14\0\7\11\11\0\12\7\47\0\2\11"+
    "\1\0\1\11\2\0\2\11\1\0\1\11\2\0\1\11\6\0\4\11"+
    "\1\0\7\11\1\0\3\11\1\0\1\11\1\0\1\11\2\0\2\11"+
    "\1\0\4\11\1\0\2\11\11\0\1\11\2\0\5\11\1\0\1\11"+
    "\11\0\12\7\2\0\4\11\40\0\1\11\37\0\12\7\26\0\10\11"+
    "\1\0\44\11\33\0\5\11\163\0\53\11\24\0\1\11\12\7\6\0"+
    "\6\11\4\0\4\11\3\0\1\11\3\0\2\11\7\0\3\11\4\0"+
    "\15\11\14\0\1\11\1\0\12\7\6\0\46\11\1\0\1\11\5\0"+
    "\1\11\2\0\53\11\1\0\u014d\11\1\0\4\11\2\0\7\11\1\0"+
    "\1\11\1\0\4\11\2\0\51\11\1\0\4\11\2\0\41\11\1\0"+
    "\4\11\2\0\7\11\1\0\1\11\1\0\4\11\2\0\17\11\1\0"+
    "\71\11\1\0\4\11\2\0\103\11\45\0\20\11\20\0\125\11\14\0"+
    "\u026c\11\2\0\21\11\1\0\32\11\5\0\113\11\25\0\15\11\1\0"+
    "\4\11\16\0\22\11\16\0\22\11\16\0\15\11\1\0\3\11\17\0"+
    "\64\11\43\0\1\11\4\0\1\11\3\0\12\7\46\0\12\7\6\0"+
    "\130\11\10\0\51\11\1\0\1\11\5\0\106\11\12\0\35\11\51\0"+
    "\12\7\36\11\2\0\5\11\13\0\54\11\25\0\7\11\10\0\12\7"+
    "\46\0\27\11\11\0\65\11\53\0\12\7\6\0\12\7\15\0\1\11"+
    "\135\0\57\11\21\0\7\11\4\0\12\7\51\0\36\11\15\0\2\11"+
    "\12\7\54\11\32\0\44\11\34\0\12\7\3\0\3\11\12\7\44\11"+
    "\153\0\4\11\1\0\4\11\3\0\2\11\11\0\300\11\100\0\u0116\11"+
    "\2\0\6\11\2\0\46\11\2\0\6\11\2\0\10\11\1\0\1\11"+
    "\1\0\1\11\1\0\1\11\1\0\37\11\2\0\65\11\1\0\7\11"+
    "\1\0\1\11\3\0\3\11\1\0\7\11\3\0\4\11\2\0\6\11"+
    "\4\0\15\11\5\0\3\11\1\0\7\11\164\0\1\11\15\0\1\11"+
    "\20\0\15\11\145\0\1\11\4\0\1\11\2\0\12\11\1\0\1\11"+
    "\3\0\5\11\6\0\1\11\1\0\1\11\1\0\1\11\1\0\4\11"+
    "\1\0\13\11\2\0\4\11\5\0\5\11\4\0\1\11\64\0\2\11"+
    "\u0a7b\0\57\11\1\0\57\11\1\0\205\11\6\0\4\11\3\0\2\11"+
    "\14\0\46\11\1\0\1\11\5\0\1\11\2\0\70\11\7\0\1\11"+
    "\20\0\27\11\11\0\7\11\1\0\7\11\1\0\7\11\1\0\7\11"+
    "\1\0\7\11\1\0\7\11\1\0\7\11\1\0\7\11\120\0\1\11"+
    "\u01d5\0\2\11\52\0\5\11\5\0\2\11\4\0\126\11\6\0\3\11"+
    "\1\0\132\11\1\0\4\11\5\0\51\11\3\0\136\11\21\0\33\11"+
    "\65\0\20\11\u0200\0\u19b6\11\112\0\u51cd\11\63\0\u048d\11\103\0\56\11"+
    "\2\0\u010d\11\3\0\20\11\12\7\2\11\24\0\57\11\20\0\31\11"+
    "\10\0\106\11\61\0\11\11\2\0\147\11\2\0\4\11\1\0\4\11"+
    "\14\0\13\11\115\0\12\11\1\0\3\11\1\0\4\11\1\0\27\11"+
    "\35\0\64\11\16\0\62\11\34\0\12\7\30\0\6\11\3\0\1\11"+
    "\4\0\12\7\34\11\12\0\27\11\31\0\35\11\7\0\57\11\34\0"+
    "\1\11\12\7\46\0\51\11\27\0\3\11\1\0\10\11\4\0\12\7"+
    "\6\0\27\11\3\0\1\11\5\0\60\11\1\0\1\11\3\0\2\11"+
    "\2\0\5\11\2\0\1\11\1\0\1\11\30\0\3\11\2\0\13\11"+
    "\7\0\3\11\14\0\6\11\2\0\6\11\2\0\6\11\11\0\7\11"+
    "\1\0\7\11\221\0\43\11\15\0\12\7\6\0\u2ba4\11\14\0\27\11"+
    "\4\0\61\11\u2104\0\u016e\11\2\0\152\11\46\0\7\11\14\0\5\11"+
    "\5\0\1\11\1\0\12\11\1\0\15\11\1\0\5\11\1\0\1\11"+
    "\1\0\2\11\1\0\2\11\1\0\154\11\41\0\u016b\11\22\0\100\11"+
    "\2\0\66\11\50\0\14\11\164\0\5\11\1\0\207\11\23\0\12\7"+
    "\7\0\32\11\6\0\32\11\13\0\131\11\3\0\6\11\2\0\6\11"+
    "\2\0\6\11\2\0\3\11\43\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\1\1\7\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\2\7\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\3\7\3\10\1\30\1\31\1\32"+
    "\1\7\1\33\4\0\3\7\1\34\1\35\3\7\3\10"+
    "\1\7\2\2\2\0\1\36\10\7\2\10\1\37\1\7"+
    "\2\0\6\7\1\40\1\41\1\42\1\43\1\7\1\2"+
    "\4\7\1\44\10\7\1\45\2\7\1\46\2\7\1\47"+
    "\1\50\1\7\1\51\1\52";

  private static int [] zzUnpackAction() {
    int [] result = new int[110];
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
    "\0\0\0\70\0\160\0\250\0\340\0\70\0\u0118\0\u0150"+
    "\0\u0188\0\u01c0\0\u01f8\0\70\0\70\0\70\0\70\0\70"+
    "\0\70\0\u0188\0\u0188\0\u0230\0\u0268\0\70\0\70\0\u02a0"+
    "\0\70\0\70\0\70\0\70\0\u02d8\0\u0310\0\u0348\0\u0380"+
    "\0\u03b8\0\u03f0\0\70\0\70\0\70\0\u0428\0\70\0\u0460"+
    "\0\u0498\0\u04d0\0\u0508\0\u0540\0\u0578\0\u05b0\0\u05e8\0\70"+
    "\0\u0620\0\u0658\0\u0690\0\u06c8\0\u0700\0\u0738\0\u0770\0\u07a8"+
    "\0\70\0\u07e0\0\u0818\0\70\0\u0850\0\u0888\0\u08c0\0\u08f8"+
    "\0\u0930\0\u0968\0\u09a0\0\u09d8\0\u0a10\0\u0a48\0\u0188\0\u0a80"+
    "\0\u0ab8\0\u0af0\0\u0b28\0\u0b60\0\u0b98\0\u0bd0\0\u0c08\0\u0c40"+
    "\0\u0150\0\u0150\0\u0188\0\u0188\0\u0c78\0\u0498\0\u0cb0\0\u0ce8"+
    "\0\u0d20\0\u0d58\0\u0150\0\u0d90\0\u0dc8\0\u0e00\0\u0e38\0\u0e70"+
    "\0\u0ea8\0\u0ee0\0\u0f18\0\u0150\0\u0f50\0\u0f88\0\u0150\0\u0fc0"+
    "\0\u0ff8\0\u0150\0\u0150\0\u1030\0\u0150\0\u0150";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[110];
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
    "\1\2\2\3\1\4\1\5\1\6\1\3\1\7\1\10"+
    "\1\2\1\11\1\12\1\2\1\10\1\13\2\10\1\7"+
    "\1\2\1\3\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\4\10\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\1\35\1\10\1\36\1\37"+
    "\1\40\1\41\1\10\1\42\1\43\1\44\1\10\1\45"+
    "\1\46\1\10\1\47\71\0\2\3\3\0\1\3\14\0"+
    "\1\3\47\0\1\50\67\0\1\51\73\0\1\7\11\0"+
    "\1\7\55\0\4\10\2\0\5\10\10\0\10\10\7\0"+
    "\10\10\2\0\1\10\1\0\2\10\10\0\4\11\2\0"+
    "\5\11\10\0\10\11\7\0\10\11\2\0\1\11\1\0"+
    "\2\11\4\0\3\52\2\0\1\52\1\0\1\52\1\0"+
    "\1\53\4\52\1\0\5\52\2\0\13\52\1\0\2\52"+
    "\1\0\11\52\2\0\4\52\10\0\4\10\2\0\5\10"+
    "\10\0\2\10\1\54\5\10\7\0\10\10\2\0\1\10"+
    "\1\0\2\10\10\0\4\10\2\0\1\55\4\10\10\0"+
    "\7\10\1\56\7\0\10\10\2\0\1\10\1\0\2\10"+
    "\10\0\4\10\2\0\5\10\10\0\2\10\1\57\5\10"+
    "\7\0\10\10\2\0\1\10\1\0\2\10\45\0\1\60"+
    "\32\0\4\10\2\0\1\61\4\10\10\0\10\10\7\0"+
    "\10\10\2\0\1\10\1\0\2\10\10\0\4\10\2\0"+
    "\5\10\10\0\5\10\1\62\2\10\7\0\10\10\2\0"+
    "\1\10\1\0\2\10\10\0\4\10\2\0\5\10\10\0"+
    "\2\10\1\63\5\10\7\0\10\10\2\0\1\10\1\0"+
    "\2\10\10\0\4\11\2\0\5\11\10\0\6\11\1\64"+
    "\1\11\7\0\10\11\2\0\1\11\1\0\2\11\10\0"+
    "\4\11\2\0\5\11\10\0\10\11\7\0\6\11\1\65"+
    "\1\11\2\0\1\11\1\0\2\11\10\0\4\11\2\0"+
    "\1\66\4\11\10\0\10\11\7\0\10\11\2\0\1\11"+
    "\1\0\2\11\10\0\4\10\2\0\1\10\1\67\3\10"+
    "\10\0\10\10\7\0\10\10\2\0\1\10\1\0\2\10"+
    "\1\0\1\50\1\70\1\71\65\50\1\72\2\73\1\51"+
    "\1\72\1\51\62\72\13\0\1\74\71\0\5\52\55\0"+
    "\4\10\2\0\3\10\1\75\1\10\10\0\10\10\7\0"+
    "\10\10\2\0\1\76\1\0\2\10\10\0\4\10\2\0"+
    "\5\10\10\0\3\10\1\77\4\10\7\0\10\10\2\0"+
    "\1\10\1\0\2\10\10\0\4\10\2\0\5\10\10\0"+
    "\10\10\7\0\1\10\1\100\6\10\2\0\1\10\1\0"+
    "\2\10\10\0\4\10\2\0\1\101\4\10\10\0\10\10"+
    "\7\0\10\10\2\0\1\10\1\0\2\10\10\0\4\10"+
    "\2\0\5\10\10\0\7\10\1\102\7\0\10\10\2\0"+
    "\1\10\1\0\2\10\10\0\4\10\2\0\1\10\1\103"+
    "\3\10\10\0\10\10\7\0\10\10\2\0\1\10\1\0"+
    "\2\10\10\0\4\10\2\0\5\10\10\0\10\10\7\0"+
    "\1\104\7\10\2\0\1\10\1\0\2\10\10\0\4\11"+
    "\2\0\5\11\10\0\6\11\1\105\1\11\7\0\10\11"+
    "\2\0\1\11\1\0\2\11\10\0\4\11\2\0\5\11"+
    "\10\0\5\11\1\106\2\11\7\0\10\11\2\0\1\11"+
    "\1\0\2\11\10\0\4\11\2\0\3\11\1\107\1\11"+
    "\10\0\10\11\7\0\10\11\2\0\1\11\1\0\2\11"+
    "\10\0\4\10\2\0\5\10\10\0\6\10\1\110\1\10"+
    "\7\0\10\10\2\0\1\10\1\0\2\10\3\0\1\71"+
    "\65\0\1\72\2\73\1\111\64\72\3\73\1\112\64\73"+
    "\7\0\4\10\2\0\5\10\10\0\6\10\1\113\1\10"+
    "\7\0\10\10\2\0\1\10\1\0\2\10\10\0\4\10"+
    "\2\0\5\10\10\0\10\10\7\0\1\114\7\10\2\0"+
    "\1\10\1\0\2\10\10\0\4\10\2\0\5\10\10\0"+
    "\4\10\1\115\3\10\7\0\10\10\2\0\1\10\1\0"+
    "\2\10\10\0\4\10\2\0\1\10\1\116\3\10\10\0"+
    "\10\10\7\0\10\10\2\0\1\10\1\0\2\10\10\0"+
    "\4\10\2\0\5\10\10\0\5\10\1\117\2\10\7\0"+
    "\10\10\2\0\1\10\1\0\2\10\10\0\4\10\2\0"+
    "\3\10\1\120\1\10\10\0\10\10\7\0\10\10\2\0"+
    "\1\10\1\0\2\10\10\0\4\10\2\0\5\10\10\0"+
    "\7\10\1\121\7\0\10\10\2\0\1\10\1\0\2\10"+
    "\10\0\4\10\2\0\5\10\10\0\5\10\1\122\2\10"+
    "\7\0\10\10\2\0\1\10\1\0\2\10\10\0\4\11"+
    "\2\0\5\11\10\0\10\11\7\0\3\11\1\123\4\11"+
    "\2\0\1\11\1\0\2\11\10\0\4\11\2\0\1\11"+
    "\1\124\3\11\10\0\10\11\7\0\10\11\2\0\1\11"+
    "\1\0\2\11\10\0\4\10\2\0\5\10\10\0\10\10"+
    "\7\0\10\10\2\0\1\125\1\0\2\10\1\0\1\72"+
    "\2\73\1\111\1\72\1\126\62\72\3\73\1\112\1\73"+
    "\1\71\62\73\7\0\4\10\2\0\1\10\1\127\3\10"+
    "\10\0\10\10\7\0\10\10\2\0\1\10\1\0\2\10"+
    "\10\0\4\10\2\0\5\10\10\0\7\10\1\130\7\0"+
    "\10\10\2\0\1\10\1\0\2\10\10\0\4\10\2\0"+
    "\5\10\10\0\5\10\1\131\2\10\7\0\10\10\2\0"+
    "\1\10\1\0\2\10\10\0\4\10\2\0\5\10\10\0"+
    "\2\10\1\132\5\10\7\0\10\10\2\0\1\10\1\0"+
    "\2\10\10\0\4\10\2\0\5\10\10\0\6\10\1\133"+
    "\1\10\7\0\10\10\2\0\1\10\1\0\2\10\10\0"+
    "\4\10\2\0\5\10\10\0\5\10\1\134\2\10\7\0"+
    "\10\10\2\0\1\10\1\0\2\10\10\0\4\10\2\0"+
    "\1\10\1\135\3\10\10\0\10\10\7\0\10\10\2\0"+
    "\1\10\1\0\2\10\10\0\4\10\2\0\1\136\4\10"+
    "\10\0\10\10\7\0\10\10\2\0\1\10\1\0\2\10"+
    "\10\0\4\10\2\0\3\10\1\137\1\10\10\0\10\10"+
    "\7\0\10\10\2\0\1\10\1\0\2\10\10\0\4\10"+
    "\2\0\1\140\4\10\10\0\10\10\7\0\10\10\2\0"+
    "\1\10\1\0\2\10\10\0\4\10\2\0\5\10\10\0"+
    "\10\10\7\0\2\10\1\141\5\10\2\0\1\10\1\0"+
    "\2\10\10\0\4\10\2\0\1\142\4\10\10\0\10\10"+
    "\7\0\10\10\2\0\1\10\1\0\2\10\10\0\4\10"+
    "\2\0\5\10\10\0\5\10\1\143\2\10\7\0\10\10"+
    "\2\0\1\10\1\0\2\10\10\0\4\10\2\0\5\10"+
    "\10\0\2\10\1\144\5\10\7\0\10\10\2\0\1\10"+
    "\1\0\2\10\10\0\4\10\2\0\1\10\1\145\3\10"+
    "\10\0\10\10\7\0\10\10\2\0\1\10\1\0\2\10"+
    "\10\0\4\10\2\0\3\10\1\146\1\10\10\0\10\10"+
    "\7\0\10\10\2\0\1\10\1\0\2\10\10\0\4\10"+
    "\2\0\5\10\10\0\5\10\1\147\2\10\7\0\10\10"+
    "\2\0\1\10\1\0\2\10\10\0\4\10\2\0\5\10"+
    "\10\0\10\10\7\0\1\10\1\150\6\10\2\0\1\10"+
    "\1\0\2\10\10\0\4\10\2\0\5\10\10\0\10\10"+
    "\7\0\10\10\2\0\1\10\1\0\1\10\1\151\10\0"+
    "\4\10\2\0\5\10\10\0\6\10\1\152\1\10\7\0"+
    "\10\10\2\0\1\10\1\0\2\10\10\0\4\10\2\0"+
    "\5\10\10\0\6\10\1\153\1\10\7\0\10\10\2\0"+
    "\1\10\1\0\2\10\10\0\4\10\2\0\5\10\10\0"+
    "\10\10\7\0\1\154\7\10\2\0\1\10\1\0\2\10"+
    "\10\0\4\10\2\0\5\10\10\0\5\10\1\155\2\10"+
    "\7\0\10\10\2\0\1\10\1\0\2\10\10\0\4\10"+
    "\2\0\5\10\10\0\2\10\1\156\5\10\7\0\10\10"+
    "\2\0\1\10\1\0\2\10\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4200];
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
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\3\1\1\11\5\1\6\11\4\1\2\11"+
    "\1\1\4\11\6\1\3\11\1\1\1\11\4\0\4\1"+
    "\1\11\10\1\1\11\2\0\1\11\14\1\2\0\44\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[110];
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
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
	private Symbol newToken(short id)
	{
		return new Symbol(id, yyline + 1, yycolumn + 1, yylength());
	}

	private Symbol newToken(short id, Object value)
	{
		return new Symbol(id, yyline + 1, yycolumn + 1, yylength(), value);
	}


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  ScalcLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  ScalcLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1730) {
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
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
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
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
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
  public Symbol nextToken() throws java.io.IOException, Scanner.Exception {
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

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
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
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 2: 
          { /* ignore */
          }
        case 43: break;
        case 29: 
          { return newToken(Terminals.EQUAL);
          }
        case 44: break;
        case 40: 
          { return newToken(Terminals.WHILE);
          }
        case 45: break;
        case 23: 
          { return newToken(Terminals.SEMI);
          }
        case 46: break;
        case 24: 
          { return newToken(Terminals.LBRACK);
          }
        case 47: break;
        case 41: 
          { return newToken(Terminals.PROGRAMA);
          }
        case 48: break;
        case 39: 
          { return newToken(Terminals.REGISTRO);
          }
        case 49: break;
        case 9: 
          { return newToken(Terminals.LPAREN);
          }
        case 50: break;
        case 31: 
          { return newToken(Terminals.INTEGER);
          }
        case 51: break;
        case 21: 
          { return newToken(Terminals.HIGHER);
          }
        case 52: break;
        case 33: 
          { return newToken(Terminals.READ);
          }
        case 53: break;
        case 5: 
          { return newToken(Terminals.RBRACE);
          }
        case 54: break;
        case 3: 
          { return newToken(Terminals.MINUS);
          }
        case 55: break;
        case 35: 
          { return newToken(Terminals.CHARACTER);
          }
        case 56: break;
        case 6: 
          { return newToken(Terminals.NUMBER, new Double(yytext()));
          }
        case 57: break;
        case 42: 
          { return newToken(Terminals.INSTANCIE);
          }
        case 58: break;
        case 16: 
          { return newToken(Terminals.FALSE);
          }
        case 59: break;
        case 19: 
          { return newToken(Terminals.ATTR);
          }
        case 60: break;
        case 38: 
          { return newToken(Terminals.WRITE);
          }
        case 61: break;
        case 25: 
          { return newToken(Terminals.RBRACK);
          }
        case 62: break;
        case 27: 
          { return newToken(Terminals.DOT);
          }
        case 63: break;
        case 7: 
          { return newToken(Terminals.ID, yytext());
          }
        case 64: break;
        case 32: 
          { return newToken(Terminals.VARS);
          }
        case 65: break;
        case 10: 
          { return newToken(Terminals.RPAREN);
          }
        case 66: break;
        case 8: 
          { return newToken(Terminals.TYID, yytext());
          }
        case 67: break;
        case 12: 
          { return newToken(Terminals.PLUS);
          }
        case 68: break;
        case 28: 
          { return newToken(Terminals.IF);
          }
        case 69: break;
        case 20: 
          { return newToken(Terminals.LESS);
          }
        case 70: break;
        case 15: 
          { return newToken(Terminals.TRUE);
          }
        case 71: break;
        case 4: 
          { return newToken(Terminals.LBRACE);
          }
        case 72: break;
        case 22: 
          { return newToken(Terminals.VIRG);
          }
        case 73: break;
        case 18: 
          { return newToken(Terminals.OR);
          }
        case 74: break;
        case 17: 
          { return newToken(Terminals.AND);
          }
        case 75: break;
        case 36: 
          { return newToken(Terminals.ELSE);
          }
        case 76: break;
        case 13: 
          { return newToken(Terminals.DIV);
          }
        case 77: break;
        case 11: 
          { return newToken(Terminals.MULT);
          }
        case 78: break;
        case 37: 
          { return newToken(Terminals.RETURN);
          }
        case 79: break;
        case 30: 
          { return newToken(Terminals.CHAR, yytext());
          }
        case 80: break;
        case 14: 
          { return newToken(Terminals.MOD);
          }
        case 81: break;
        case 1: 
          { throw new Scanner.Exception("unexpected character '" + yytext() + "'");
          }
        case 82: break;
        case 26: 
          { return newToken(Terminals.COLON);
          }
        case 83: break;
        case 34: 
          { return newToken(Terminals.BOOL);
          }
        case 84: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
              { 	return newToken(Terminals.EOF, "end-of-file");
 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}