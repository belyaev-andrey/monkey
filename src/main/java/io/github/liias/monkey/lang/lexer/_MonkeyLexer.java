/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package io.github.liias.monkey.lang.lexer;

import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static io.github.liias.monkey.lang.psi.MonkeyTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>_MonkeyLexer.flex</tt>
 */
public class _MonkeyLexer implements FlexLexer {

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
   * Chosen bits are [9, 6, 6]
   * Total runtime size is 1568 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>12]|((ch>>6)&0x3f)]<<6)|(ch&0x3f)];
  }

  /* The ZZ_CMAP_Z table has 272 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\100\1\200\u010d\100");

  /* The ZZ_CMAP_Y table has 192 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\175\3\1\4\77\3");

  /* The ZZ_CMAP_A table has 320 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\3\4\2\22\0\1\3\1\5\1\20\1\0\1\54\1\73\1\70\1\22\1\61\1\62\1\6\1\71"+
    "\1\63\1\72\1\16\1\4\1\12\11\10\1\25\1\23\1\65\1\67\1\66\1\24\1\0\1\77\1\76"+
    "\1\14\1\17\1\101\1\15\2\7\1\105\2\7\1\11\2\7\1\104\1\110\1\102\1\100\1\106"+
    "\1\7\1\107\1\103\1\7\1\13\2\7\1\57\1\21\1\60\1\74\1\7\1\0\1\30\1\51\1\26\1"+
    "\45\1\41\1\32\1\46\1\50\1\36\1\7\1\52\1\27\1\44\1\34\1\37\2\7\1\40\1\31\1"+
    "\35\1\33\1\43\1\42\1\47\1\53\1\7\1\55\1\64\1\56\1\75\6\0\1\1\242\0\2\1\26"+
    "\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\2\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\21\6\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\3\6\1\0\1\40\1\41\1\42\1\43\1\44"+
    "\1\45\1\46\1\0\1\47\1\50\1\46\1\0\1\51"+
    "\2\0\1\52\3\6\1\53\16\6\1\54\1\6\1\55"+
    "\7\6\1\56\4\6\1\57\1\60\1\61\1\62\1\63"+
    "\1\64\1\65\1\66\1\67\1\70\1\71\3\6\1\72"+
    "\1\73\1\74\1\0\4\6\1\75\6\6\1\76\3\6"+
    "\1\77\1\6\1\100\10\6\1\101\2\6\1\102\5\6"+
    "\1\74\1\6\1\103\4\6\1\104\6\6\1\105\1\106"+
    "\1\107\3\6\1\110\1\111\7\6\1\112\1\6\1\113"+
    "\1\114\1\115\3\6\1\116\2\6\1\117\1\6\1\120"+
    "\3\6\1\121\3\6\1\122\1\123\1\124\1\6\1\125"+
    "\1\126\2\6\1\127\1\6\1\130\1\6\1\131\1\6"+
    "\1\132\2\6\1\133\1\6\1\134\1\135\1\136\1\137"+
    "\2\6\1\140";

  private static int [] zzUnpackAction() {
    int [] result = new int[232];
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
    "\0\0\0\111\0\222\0\333\0\u0124\0\u016d\0\u01b6\0\u01ff"+
    "\0\u0248\0\u0291\0\u02da\0\u0323\0\111\0\111\0\111\0\u036c"+
    "\0\u03b5\0\u03fe\0\u0447\0\u0490\0\u04d9\0\u0522\0\u056b\0\u05b4"+
    "\0\u05fd\0\u0646\0\u068f\0\u06d8\0\u0721\0\u076a\0\u07b3\0\u07fc"+
    "\0\u01b6\0\111\0\111\0\111\0\111\0\111\0\111\0\111"+
    "\0\u0845\0\111\0\111\0\u088e\0\u08d7\0\u0920\0\u0969\0\u09b2"+
    "\0\111\0\111\0\u09fb\0\u0a44\0\u0a8d\0\u0ad6\0\u0b1f\0\111"+
    "\0\111\0\111\0\111\0\111\0\111\0\u0291\0\111\0\u0b68"+
    "\0\u0bb1\0\u02da\0\111\0\u0bfa\0\u0323\0\111\0\u0c43\0\u0c8c"+
    "\0\u0cd5\0\u01b6\0\u0d1e\0\u0d67\0\u0db0\0\u0df9\0\u0e42\0\u0e8b"+
    "\0\u0ed4\0\u0f1d\0\u0f66\0\u0faf\0\u0ff8\0\u1041\0\u108a\0\u10d3"+
    "\0\u01b6\0\u111c\0\u01b6\0\u1165\0\u11ae\0\u11f7\0\u1240\0\u1289"+
    "\0\u12d2\0\u131b\0\u01b6\0\u1364\0\u13ad\0\u13f6\0\u143f\0\111"+
    "\0\111\0\111\0\111\0\111\0\111\0\111\0\111\0\111"+
    "\0\111\0\111\0\u1488\0\u14d1\0\u151a\0\u1563\0\u15ac\0\u0b1f"+
    "\0\u15f5\0\u163e\0\u1687\0\u16d0\0\u1719\0\u01b6\0\u1762\0\u17ab"+
    "\0\u17f4\0\u183d\0\u1886\0\u18cf\0\u01b6\0\u1918\0\u1961\0\u19aa"+
    "\0\u01b6\0\u19f3\0\u01b6\0\u1a3c\0\u1a85\0\u1ace\0\u1b17\0\u1b60"+
    "\0\u1ba9\0\u1bf2\0\u1c3b\0\u01b6\0\u1c84\0\u1ccd\0\u01b6\0\u1d16"+
    "\0\u1d5f\0\u1da8\0\u1df1\0\u1e3a\0\111\0\u1e83\0\u01b6\0\u1ecc"+
    "\0\u1f15\0\u1f5e\0\u1fa7\0\u01b6\0\u1ff0\0\u2039\0\u2082\0\u20cb"+
    "\0\u2114\0\u215d\0\u01b6\0\u01b6\0\u01b6\0\u21a6\0\u21ef\0\u2238"+
    "\0\u01b6\0\u01b6\0\u2281\0\u22ca\0\u2313\0\u235c\0\u23a5\0\u23ee"+
    "\0\u2437\0\u01b6\0\u2480\0\u01b6\0\u01b6\0\u01b6\0\u24c9\0\u2512"+
    "\0\u255b\0\u01b6\0\u25a4\0\u25ed\0\u01b6\0\u2636\0\u01b6\0\u267f"+
    "\0\u26c8\0\u2711\0\u01b6\0\u275a\0\u27a3\0\u27ec\0\u01b6\0\u01b6"+
    "\0\u01b6\0\u2835\0\u01b6\0\u01b6\0\u287e\0\u28c7\0\u01b6\0\u2910"+
    "\0\u01b6\0\u2959\0\u01b6\0\u29a2\0\u01b6\0\u29eb\0\u2a34\0\u01b6"+
    "\0\u2a7d\0\u01b6\0\u01b6\0\u01b6\0\u01b6\0\u2ac6\0\u2b0f\0\u01b6";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[232];
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
    "\2\2\2\3\1\4\1\5\1\6\1\7\1\10\1\7"+
    "\1\11\3\7\1\12\1\7\1\13\1\2\1\14\1\15"+
    "\1\16\1\17\1\20\1\7\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\1\36\2\7\1\37\1\40\2\7\1\41\1\42"+
    "\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52"+
    "\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62"+
    "\1\63\4\7\1\64\2\7\1\65\2\7\113\0\2\3"+
    "\111\0\1\66\1\0\1\67\60\0\1\70\110\0\1\71"+
    "\25\0\1\72\62\0\1\73\30\0\7\7\1\0\1\7"+
    "\6\0\27\7\21\0\13\7\10\0\1\10\1\74\1\10"+
    "\2\0\1\75\1\76\1\77\7\0\1\74\2\0\1\75"+
    "\12\0\1\77\53\0\1\10\1\74\1\10\1\100\1\0"+
    "\1\75\1\76\1\77\7\0\1\74\2\0\1\75\12\0"+
    "\1\77\1\0\1\100\51\0\1\101\1\0\1\101\76\0"+
    "\20\102\1\103\1\104\67\102\22\105\1\106\66\105\7\0"+
    "\7\7\1\0\1\7\6\0\1\7\1\107\1\110\6\7"+
    "\1\111\15\7\21\0\13\7\7\0\7\7\1\0\1\7"+
    "\6\0\3\7\1\112\2\7\1\113\20\7\21\0\13\7"+
    "\7\0\7\7\1\0\1\7\6\0\7\7\1\114\3\7"+
    "\1\115\1\116\12\7\21\0\13\7\7\0\7\7\1\0"+
    "\1\7\6\0\2\7\1\117\2\7\1\120\2\7\1\121"+
    "\1\122\15\7\21\0\13\7\7\0\7\7\1\0\1\7"+
    "\6\0\3\7\1\123\23\7\21\0\13\7\7\0\7\7"+
    "\1\0\1\7\6\0\2\7\1\124\2\7\1\125\5\7"+
    "\1\126\13\7\21\0\13\7\7\0\7\7\1\0\1\7"+
    "\6\0\12\7\1\127\7\7\1\130\4\7\21\0\13\7"+
    "\7\0\7\7\1\0\1\7\6\0\4\7\1\131\1\7"+
    "\1\132\20\7\21\0\13\7\7\0\7\7\1\0\1\7"+
    "\6\0\12\7\1\133\14\7\21\0\13\7\7\0\7\7"+
    "\1\0\1\7\6\0\13\7\1\134\13\7\21\0\13\7"+
    "\7\0\7\7\1\0\1\7\6\0\1\7\1\135\4\7"+
    "\1\136\12\7\1\137\5\7\21\0\13\7\7\0\7\7"+
    "\1\0\1\7\6\0\22\7\1\140\4\7\21\0\13\7"+
    "\7\0\7\7\1\0\1\7\6\0\2\7\1\141\24\7"+
    "\21\0\13\7\7\0\7\7\1\0\1\7\6\0\11\7"+
    "\1\142\15\7\21\0\13\7\7\0\7\7\1\0\1\7"+
    "\6\0\11\7\1\143\1\7\1\144\13\7\21\0\13\7"+
    "\7\0\7\7\1\0\1\7\6\0\2\7\1\145\5\7"+
    "\1\146\16\7\21\0\13\7\7\0\7\7\1\0\1\7"+
    "\6\0\12\7\1\147\14\7\21\0\13\7\64\0\1\150"+
    "\2\0\1\151\107\0\1\152\1\153\110\0\1\154\1\155"+
    "\107\0\1\156\1\0\1\157\106\0\1\160\2\0\1\161"+
    "\105\0\1\162\30\0\7\7\1\0\1\7\6\0\27\7"+
    "\21\0\1\7\1\163\11\7\7\0\7\7\1\0\1\7"+
    "\6\0\27\7\21\0\6\7\1\164\4\7\7\0\7\7"+
    "\1\0\1\7\6\0\27\7\21\0\11\7\1\165\1\7"+
    "\5\166\1\167\103\166\6\170\1\171\102\170\10\0\1\100"+
    "\1\0\1\100\1\0\2\100\1\0\1\100\6\0\1\100"+
    "\1\0\1\100\1\0\1\100\6\0\1\100\3\0\1\100"+
    "\3\0\1\100\24\0\2\100\1\0\1\100\17\0\1\101"+
    "\1\0\1\101\2\0\1\75\1\0\1\77\12\0\1\75"+
    "\12\0\1\77\43\0\1\102\2\0\106\102\7\0\7\7"+
    "\1\0\1\7\6\0\2\7\1\172\24\7\21\0\13\7"+
    "\7\0\7\7\1\0\1\7\6\0\3\7\1\173\3\7"+
    "\1\174\17\7\21\0\13\7\7\0\7\7\1\0\1\7"+
    "\6\0\6\7\1\175\20\7\21\0\13\7\7\0\7\7"+
    "\1\0\1\7\6\0\17\7\1\176\7\7\21\0\13\7"+
    "\7\0\7\7\1\0\1\7\6\0\2\7\1\177\24\7"+
    "\21\0\13\7\7\0\7\7\1\0\1\7\6\0\1\7"+
    "\1\200\25\7\21\0\13\7\7\0\7\7\1\0\1\7"+
    "\6\0\10\7\1\201\16\7\21\0\13\7\7\0\7\7"+
    "\1\0\1\7\6\0\1\7\1\202\25\7\21\0\13\7"+
    "\7\0\7\7\1\0\1\7\6\0\6\7\1\203\20\7"+
    "\21\0\13\7\7\0\7\7\1\0\1\7\6\0\6\7"+
    "\1\204\20\7\21\0\13\7\7\0\7\7\1\0\1\7"+
    "\6\0\12\7\1\205\14\7\21\0\13\7\7\0\7\7"+
    "\1\0\1\7\6\0\10\7\1\206\16\7\21\0\13\7"+
    "\7\0\7\7\1\0\1\7\6\0\7\7\1\207\17\7"+
    "\21\0\13\7\7\0\7\7\1\0\1\7\6\0\1\7"+
    "\1\210\25\7\21\0\13\7\7\0\7\7\1\0\1\7"+
    "\6\0\14\7\1\211\12\7\21\0\13\7\7\0\7\7"+
    "\1\0\1\7\6\0\5\7\1\212\17\7\1\213\1\7"+
    "\21\0\13\7\7\0\7\7\1\0\1\7\6\0\10\7"+
    "\1\214\1\7\1\215\14\7\21\0\13\7\7\0\7\7"+
    "\1\0\1\7\6\0\3\7\1\216\23\7\21\0\13\7"+
    "\7\0\7\7\1\0\1\7\6\0\7\7\1\217\17\7"+
    "\21\0\13\7\7\0\7\7\1\0\1\7\6\0\3\7"+
    "\1\220\23\7\21\0\13\7\7\0\7\7\1\0\1\7"+
    "\6\0\5\7\1\221\21\7\21\0\13\7\7\0\7\7"+
    "\1\0\1\7\6\0\7\7\1\222\17\7\21\0\13\7"+
    "\7\0\7\7\1\0\1\7\6\0\10\7\1\223\16\7"+
    "\21\0\13\7\7\0\7\7\1\0\1\7\6\0\12\7"+
    "\1\224\14\7\21\0\13\7\7\0\7\7\1\0\1\7"+
    "\6\0\17\7\1\225\7\7\21\0\13\7\7\0\7\7"+
    "\1\0\1\7\6\0\4\7\1\226\22\7\21\0\13\7"+
    "\7\0\7\7\1\0\1\7\6\0\3\7\1\227\23\7"+
    "\21\0\13\7\7\0\7\7\1\0\1\7\6\0\17\7"+
    "\1\230\7\7\21\0\13\7\7\0\7\7\1\0\1\7"+
    "\6\0\13\7\1\231\13\7\21\0\13\7\7\0\7\7"+
    "\1\0\1\7\6\0\27\7\21\0\2\7\1\232\10\7"+
    "\7\0\7\7\1\0\1\7\6\0\27\7\21\0\7\7"+
    "\1\233\3\7\7\0\7\7\1\0\1\7\6\0\27\7"+
    "\21\0\12\7\1\234\1\166\2\0\106\166\1\167\2\0"+
    "\106\167\4\170\1\235\1\170\1\171\102\170\7\0\7\7"+
    "\1\0\1\7\6\0\3\7\1\236\23\7\21\0\13\7"+
    "\7\0\7\7\1\0\1\7\6\0\13\7\1\237\13\7"+
    "\21\0\13\7\7\0\7\7\1\0\1\7\6\0\1\240"+
    "\26\7\21\0\13\7\7\0\7\7\1\0\1\7\6\0"+
    "\3\7\1\241\3\7\1\242\17\7\21\0\13\7\7\0"+
    "\7\7\1\0\1\7\6\0\7\7\1\243\17\7\21\0"+
    "\13\7\7\0\7\7\1\0\1\7\6\0\4\7\1\244"+
    "\22\7\21\0\13\7\7\0\7\7\1\0\1\7\6\0"+
    "\7\7\1\245\17\7\21\0\13\7\7\0\7\7\1\0"+
    "\1\7\6\0\3\7\1\246\23\7\21\0\13\7\7\0"+
    "\7\7\1\0\1\7\6\0\1\247\26\7\21\0\13\7"+
    "\7\0\7\7\1\0\1\7\6\0\2\7\1\250\24\7"+
    "\21\0\13\7\7\0\7\7\1\0\1\7\6\0\6\7"+
    "\1\251\20\7\21\0\13\7\7\0\7\7\1\0\1\7"+
    "\6\0\10\7\1\252\16\7\21\0\13\7\7\0\7\7"+
    "\1\0\1\7\6\0\1\7\1\253\25\7\21\0\13\7"+
    "\7\0\7\7\1\0\1\7\6\0\13\7\1\254\13\7"+
    "\21\0\13\7\7\0\7\7\1\0\1\7\6\0\3\7"+
    "\1\255\23\7\21\0\13\7\7\0\7\7\1\0\1\7"+
    "\6\0\11\7\1\256\15\7\21\0\13\7\7\0\7\7"+
    "\1\0\1\7\6\0\7\7\1\257\17\7\21\0\13\7"+
    "\7\0\7\7\1\0\1\7\6\0\5\7\1\260\21\7"+
    "\21\0\13\7\7\0\7\7\1\0\1\7\6\0\13\7"+
    "\1\261\13\7\21\0\13\7\7\0\7\7\1\0\1\7"+
    "\6\0\16\7\1\262\10\7\21\0\13\7\7\0\7\7"+
    "\1\0\1\7\6\0\13\7\1\263\13\7\21\0\13\7"+
    "\7\0\7\7\1\0\1\7\6\0\1\7\1\264\25\7"+
    "\21\0\13\7\7\0\7\7\1\0\1\7\6\0\5\7"+
    "\1\265\21\7\21\0\13\7\7\0\7\7\1\0\1\7"+
    "\6\0\2\7\1\266\24\7\21\0\13\7\7\0\7\7"+
    "\1\0\1\7\6\0\17\7\1\267\7\7\21\0\13\7"+
    "\7\0\7\7\1\0\1\7\6\0\2\7\1\270\24\7"+
    "\21\0\13\7\7\0\7\7\1\0\1\7\6\0\27\7"+
    "\21\0\3\7\1\271\7\7\7\0\7\7\1\0\1\272"+
    "\6\0\27\7\21\0\13\7\7\0\7\7\1\0\1\7"+
    "\6\0\27\7\21\0\3\7\1\273\7\7\7\0\7\7"+
    "\1\0\1\7\6\0\3\7\1\274\23\7\21\0\13\7"+
    "\7\0\7\7\1\0\1\7\6\0\22\7\1\275\4\7"+
    "\21\0\13\7\7\0\7\7\1\0\1\7\6\0\7\7"+
    "\1\276\17\7\21\0\13\7\7\0\7\7\1\0\1\7"+
    "\6\0\10\7\1\277\16\7\21\0\13\7\7\0\7\7"+
    "\1\0\1\7\6\0\10\7\1\300\16\7\21\0\13\7"+
    "\7\0\7\7\1\0\1\7\6\0\1\301\26\7\21\0"+
    "\13\7\7\0\7\7\1\0\1\7\6\0\13\7\1\302"+
    "\13\7\21\0\13\7\7\0\7\7\1\0\1\7\6\0"+
    "\7\7\1\303\17\7\21\0\13\7\7\0\7\7\1\0"+
    "\1\7\6\0\1\7\1\304\25\7\21\0\13\7\7\0"+
    "\7\7\1\0\1\7\6\0\20\7\1\305\6\7\21\0"+
    "\13\7\7\0\7\7\1\0\1\7\6\0\15\7\1\306"+
    "\11\7\21\0\13\7\7\0\7\7\1\0\1\7\6\0"+
    "\14\7\1\307\12\7\21\0\13\7\7\0\7\7\1\0"+
    "\1\7\6\0\2\7\1\310\24\7\21\0\13\7\7\0"+
    "\7\7\1\0\1\7\6\0\12\7\1\311\14\7\21\0"+
    "\13\7\7\0\7\7\1\0\1\7\6\0\6\7\1\312"+
    "\20\7\21\0\13\7\7\0\7\7\1\0\1\7\6\0"+
    "\13\7\1\313\13\7\21\0\13\7\7\0\7\7\1\0"+
    "\1\7\6\0\1\7\1\314\25\7\21\0\13\7\7\0"+
    "\7\7\1\0\1\7\6\0\5\7\1\315\21\7\21\0"+
    "\13\7\7\0\7\7\1\0\1\7\6\0\13\7\1\316"+
    "\13\7\21\0\13\7\7\0\7\7\1\0\1\7\6\0"+
    "\24\7\1\317\2\7\21\0\13\7\7\0\7\7\1\0"+
    "\1\7\6\0\27\7\21\0\4\7\1\320\6\7\7\0"+
    "\7\7\1\0\1\7\6\0\27\7\21\0\2\7\1\321"+
    "\10\7\7\0\7\7\1\0\1\7\6\0\6\7\1\322"+
    "\20\7\21\0\13\7\7\0\7\7\1\0\1\7\6\0"+
    "\1\323\26\7\21\0\13\7\7\0\7\7\1\0\1\7"+
    "\6\0\22\7\1\324\4\7\21\0\13\7\7\0\7\7"+
    "\1\0\1\7\6\0\10\7\1\325\16\7\21\0\13\7"+
    "\7\0\7\7\1\0\1\7\6\0\1\7\1\326\25\7"+
    "\21\0\13\7\7\0\7\7\1\0\1\7\6\0\13\7"+
    "\1\327\13\7\21\0\13\7\7\0\7\7\1\0\1\7"+
    "\6\0\6\7\1\330\20\7\21\0\13\7\7\0\7\7"+
    "\1\0\1\7\6\0\6\7\1\331\20\7\21\0\13\7"+
    "\7\0\7\7\1\0\1\7\6\0\17\7\1\332\7\7"+
    "\21\0\13\7\7\0\7\7\1\0\1\7\6\0\13\7"+
    "\1\333\13\7\21\0\13\7\7\0\7\7\1\0\1\7"+
    "\6\0\1\7\1\334\25\7\21\0\13\7\7\0\7\7"+
    "\1\0\1\7\6\0\6\7\1\335\20\7\21\0\13\7"+
    "\7\0\7\7\1\0\1\7\6\0\5\7\1\336\21\7"+
    "\21\0\13\7\7\0\7\7\1\0\1\7\6\0\11\7"+
    "\1\337\15\7\21\0\13\7\7\0\7\7\1\0\1\7"+
    "\6\0\25\7\1\340\1\7\21\0\13\7\7\0\7\7"+
    "\1\0\1\7\6\0\1\341\26\7\21\0\13\7\7\0"+
    "\7\7\1\0\1\7\6\0\3\7\1\342\23\7\21\0"+
    "\13\7\7\0\7\7\1\0\1\7\6\0\7\7\1\343"+
    "\17\7\21\0\13\7\7\0\7\7\1\0\1\7\6\0"+
    "\13\7\1\344\13\7\21\0\13\7\7\0\7\7\1\0"+
    "\1\7\6\0\6\7\1\345\20\7\21\0\13\7\7\0"+
    "\7\7\1\0\1\7\6\0\13\7\1\346\13\7\21\0"+
    "\13\7\7\0\7\7\1\0\1\7\6\0\11\7\1\347"+
    "\15\7\21\0\13\7\7\0\7\7\1\0\1\7\6\0"+
    "\4\7\1\350\22\7\21\0\13\7";

  private static int [] zzUnpackTrans() {
    int [] result = new int[11096];
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
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\12\1\3\11\22\1\7\11\1\1\2\11"+
    "\5\1\2\11\3\1\1\0\1\1\6\11\1\0\1\11"+
    "\2\1\1\0\1\11\2\0\1\11\41\1\13\11\6\1"+
    "\1\0\43\1\1\11\113\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[232];
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
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _MonkeyLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _MonkeyLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
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
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
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
    return zzBuffer.charAt(zzStartRead+pos);
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
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

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
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
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
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return com.intellij.psi.TokenType.BAD_CHARACTER;
            }
          case 97: break;
          case 2: 
            { return com.intellij.psi.TokenType.WHITE_SPACE;
            }
          case 98: break;
          case 3: 
            { return SLASH;
            }
          case 99: break;
          case 4: 
            { return BANG;
            }
          case 100: break;
          case 5: 
            { return STAR;
            }
          case 101: break;
          case 6: 
            { return IDENTIFIER;
            }
          case 102: break;
          case 7: 
            { return INTLITERAL;
            }
          case 103: break;
          case 8: 
            { return DOT;
            }
          case 104: break;
          case 9: 
            { return STRING_A;
            }
          case 105: break;
          case 10: 
            { return STRING_B;
            }
          case 106: break;
          case 11: 
            { return SEMI;
            }
          case 107: break;
          case 12: 
            { return QUES;
            }
          case 108: break;
          case 13: 
            { return COLON;
            }
          case 109: break;
          case 14: 
            { return BLING;
            }
          case 110: break;
          case 15: 
            { return LBRACE;
            }
          case 111: break;
          case 16: 
            { return RBRACE;
            }
          case 112: break;
          case 17: 
            { return LBRACKET;
            }
          case 113: break;
          case 18: 
            { return RBRACKET;
            }
          case 114: break;
          case 19: 
            { return LPAREN;
            }
          case 115: break;
          case 20: 
            { return RPAREN;
            }
          case 116: break;
          case 21: 
            { return COMMA;
            }
          case 117: break;
          case 22: 
            { return BAR;
            }
          case 118: break;
          case 23: 
            { return LT;
            }
          case 119: break;
          case 24: 
            { return GT;
            }
          case 120: break;
          case 25: 
            { return EQ;
            }
          case 121: break;
          case 26: 
            { return AMP;
            }
          case 122: break;
          case 27: 
            { return PLUS;
            }
          case 123: break;
          case 28: 
            { return SUB;
            }
          case 124: break;
          case 29: 
            { return PERCENT;
            }
          case 125: break;
          case 30: 
            { return CARET;
            }
          case 126: break;
          case 31: 
            { return TILDE;
            }
          case 127: break;
          case 32: 
            { return MULTI_LINE_COMMENT_START;
            }
          case 128: break;
          case 33: 
            { return SLASHEQ;
            }
          case 129: break;
          case 34: 
            { return BANGEQ;
            }
          case 130: break;
          case 35: 
            { return MULTI_LINE_COMMENT_END;
            }
          case 131: break;
          case 36: 
            { return STAREQ;
            }
          case 132: break;
          case 37: 
            { return LONGLITERAL;
            }
          case 133: break;
          case 38: 
            { return FLOATLITERAL;
            }
          case 134: break;
          case 39: 
            { return DOUBLELITERAL;
            }
          case 135: break;
          case 40: 
            { return HEX_LITERAL;
            }
          case 136: break;
          case 41: 
            { return STRING;
            }
          case 137: break;
          case 42: 
            { return CHARLITERAL;
            }
          case 138: break;
          case 43: 
            { return AS;
            }
          case 139: break;
          case 44: 
            { return IF;
            }
          case 140: break;
          case 45: 
            { return OR;
            }
          case 141: break;
          case 46: 
            { return DO;
            }
          case 142: break;
          case 47: 
            { return BARBAR;
            }
          case 143: break;
          case 48: 
            { return CARETEQ;
            }
          case 144: break;
          case 49: 
            { return EQGT;
            }
          case 145: break;
          case 50: 
            { return EQEQ;
            }
          case 146: break;
          case 51: 
            { return AMPEQ;
            }
          case 147: break;
          case 52: 
            { return AMPAMP;
            }
          case 148: break;
          case 53: 
            { return PLUSEQ;
            }
          case 149: break;
          case 54: 
            { return PLUSPLUS;
            }
          case 150: break;
          case 55: 
            { return SUBEQ;
            }
          case 151: break;
          case 56: 
            { return SUBSUB;
            }
          case 152: break;
          case 57: 
            { return PERCENTEQ;
            }
          case 153: break;
          case 58: 
            { return SINGLE_LINE_COMMENT;
            }
          case 154: break;
          case 59: 
            { return SINGLE_LINE_DOC_COMMENT;
            }
          case 155: break;
          case 60: 
            { return BLOCK_COMMENT;
            }
          case 156: break;
          case 61: 
            { return AND;
            }
          case 157: break;
          case 62: 
            { return FOR;
            }
          case 158: break;
          case 63: 
            { return NEW;
            }
          case 159: break;
          case 64: 
            { return TRY;
            }
          case 160: break;
          case 65: 
            { return VAR;
            }
          case 161: break;
          case 66: 
            { return HAS;
            }
          case 162: break;
          case 67: 
            { return CASE;
            }
          case 163: break;
          case 68: 
            { return SELF;
            }
          case 164: break;
          case 69: 
            { return NULL;
            }
          case 165: break;
          case 70: 
            { return TRUE;
            }
          case 166: break;
          case 71: 
            { return THIS;
            }
          case 167: break;
          case 72: 
            { return ELSE;
            }
          case 168: break;
          case 73: 
            { return ENUM;
            }
          case 169: break;
          case 74: 
            { return VOID;
            }
          case 170: break;
          case 75: 
            { return CLASS;
            }
          case 171: break;
          case 76: 
            { return CATCH;
            }
          case 172: break;
          case 77: 
            { return CONST;
            }
          case 173: break;
          case 78: 
            { return FALSE;
            }
          case 174: break;
          case 79: 
            { return USING;
            }
          case 175: break;
          case 80: 
            { return THROW;
            }
          case 176: break;
          case 81: 
            { return WHILE;
            }
          case 177: break;
          case 82: 
            { return BREAK;
            }
          case 178: break;
          case 83: 
            { return BAREQ;
            }
          case 179: break;
          case 84: 
            { return SUPER;
            }
          case 180: break;
          case 85: 
            { return STATIC;
            }
          case 181: break;
          case 86: 
            { return SWITCH;
            }
          case 182: break;
          case 87: 
            { return NATIVE;
            }
          case 183: break;
          case 88: 
            { return RETURN;
            }
          case 184: break;
          case 89: 
            { return MODULE;
            }
          case 185: break;
          case 90: 
            { return HIDDEN;
            }
          case 186: break;
          case 91: 
            { return FINALLY;
            }
          case 187: break;
          case 92: 
            { return EXTENDS;
            }
          case 188: break;
          case 93: 
            { return DEFAULT;
            }
          case 189: break;
          case 94: 
            { return CONTINUE;
            }
          case 190: break;
          case 95: 
            { return FUNCTION;
            }
          case 191: break;
          case 96: 
            { return INSTANCEOF;
            }
          case 192: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
