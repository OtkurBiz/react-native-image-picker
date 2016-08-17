package biz.otkur.app.textview;

import android.content.Context;
import android.graphics.Typeface;

public final class Farsi {

    public static boolean isFarsiConversionNeeded = true;

    private final static String szLamAndAlef = Character
            .toString((char) 0xfedf)
            + Character.toString((char) 0xfe8e); // Lam + Alef

    private final static String szLamStickAndAlef = Character
            .toString((char) 0xfee0)
            + Character.toString((char) 0xfe8e); // Lam (Sticky !!!)+
                                                    // Alef

    private final static String szLa = Character.toString((char) 0xfefb); // La
    private final static String szLaStick = Character.toString((char) 0xfefc); // La

    private static final class struc {
        public char character;
        public char endGlyph;
        public char iniGlyph;
        public char midGlyph;
        public char isoGlyph;

        public struc(char Character,char IsoGlyph,char IniGlyph, char MidGlyph,
        		char EndGlyph) {
            character = Character;
            isoGlyph = IsoGlyph;
            iniGlyph = IniGlyph;
            midGlyph = MidGlyph;
            endGlyph = EndGlyph;
        }
    }

    static struc[] arrStruc = {
		new struc((char) 0x626, (char) 0xfe89, (char) 0xfe8b,(char) 0xfe8c, (char) 0xfe8a),
		new struc((char) 0x0627,(char) 0xfe8d,(char) 0xfe8d,(char) 0xfe8e,(char) 0xfe8e),//a
		new struc((char) 0x06d5,(char) 0xfee9,(char) 0xfee9,(char) 0xfeea,(char) 0xfeea),//e
		new struc((char) 0x0628,(char) 0xfe8f,(char) 0xfe91,(char) 0xfe92,(char) 0xfe90),//b
		new struc((char) 0x067e,(char) 0xfb56,(char) 0xfb58,(char) 0xfb59,(char) 0xfb57),//p
		new struc((char) 0x062a,(char) 0xfe95,(char) 0xfe97,(char) 0xfe98,(char) 0xfe96),//t
		new struc((char) 0x062c,(char) 0xfe9d,(char) 0xfe9f,(char) 0xfea0,(char) 0xfe9e),//j
		new struc((char) 0x0686,(char) 0xfb7a,(char) 0xfb7c,(char) 0xfb7d,(char) 0xfb7b),//q
		new struc((char) 0x062e,(char) 0xfea5,(char) 0xfea7,(char) 0xfea8,(char) 0xfea9),//h
		new struc((char) 0x062f,(char) 0xfea9,(char) 0xfea9,(char) 0xfeaa,(char) 0xfeaa),//d
		new struc((char) 0x0631,(char) 0xfead,(char) 0xfead,(char) 0xfeae,(char) 0xfeae),//r
		new struc((char) 0x0632,(char) 0xfeaf,(char) 0xfeaf,(char) 0xfeb0,(char) 0xfeb0),//z
		new struc((char) 0x0698,(char) 0xfb8a,(char) 0xfb8a,(char) 0xfb8b,(char) 0xfb8b),//z+
		new struc((char) 0x0633,(char) 0xfeb1,(char) 0xfeb3,(char) 0xfeb4,(char) 0xfeb2),//c
		new struc((char) 0x0634,(char) 0xfeb5,(char) 0xfeb7,(char) 0xfeb8,(char) 0xfeb6),//x
		new struc((char) 0x063a,(char) 0xfecd,(char) 0xfecf,(char) 0xfed0,(char) 0xfece),//g+
		new struc((char) 0x0641,(char) 0xfed1,(char) 0xfed3,(char) 0xfed4,(char) 0xfed2),//f
		new struc((char) 0x0642,(char) 0xfed5,(char) 0xfed7,(char) 0xfed8,(char) 0xfed6),//k+
		new struc((char) 0x0643,(char) 0xfed9,(char) 0xfedb,(char) 0xfedc,(char) 0xfeda),//k
		new struc((char) 0x06af,(char) 0xfb92,(char) 0xfb94,(char) 0xfb95,(char) 0xfb93),//g
		new struc((char) 0x06ad,(char) 0xfbd3,(char) 0xfbd5,(char) 0xfbd6,(char) 0xfbd4),//ng
		new struc((char) 0x0644,(char) 0xfedd,(char) 0xfedf,(char) 0xfee0,(char) 0xfede),//L
		new struc((char) 0x0645,(char) 0xfee1,(char) 0xfee3,(char) 0xfee4,(char) 0xfee2),//m
		new struc((char) 0x0646,(char) 0xfee5,(char) 0xfee7,(char) 0xfee8,(char) 0xfee6),//n
		new struc((char) 0x06be,(char) 0xfbaa,(char) 0xfbac,(char) 0xfbad,(char) 0xfbab),//h+
		new struc((char) 0x0648,(char) 0xfeed,(char) 0xfeed,(char) 0xfeee,(char) 0xfeee),//o
		new struc((char) 0x06c7,(char) 0xfbd7,(char) 0xfbd7,(char) 0xfbd8,(char) 0xfbd8),//u
		new struc((char) 0x06c6,(char) 0xfbd9,(char) 0xfbd9,(char) 0xfbda,(char) 0xfbda),//u+
		new struc((char) 0x06c8,(char) 0xfbdb,(char) 0xfbdb,(char) 0xfbdc,(char) 0xfbdc),//v
		new struc((char) 0x06cb,(char) 0xfbde,(char) 0xfbde,(char) 0xfbdf,(char) 0xfbdf),//e
		new struc((char) 0x06d0,(char) 0xfbe4,(char) 0xfbe6,(char) 0xfbe7,(char) 0xfbe5),//y
		new struc((char) 0x0649,(char) 0xfeef,(char) 0xfbe8,(char) 0xfbe9,(char) 0xfef0),//i
		new struc((char) 0x064a,(char) 0xfef1,(char) 0xfef3,(char) 0xfef4,(char) 0xfef2)//y
	};


    private static final int N_DISTINCT_CHARACTERS = 33;

    private static final String ArabicReverse(String s) {
        try {
            String Out = "", rev;
            s = MakeReverse(s);
            char[] chs = new char[s.length()];
            chs = s.toCharArray();
            int i = 0;
            while (i < s.length()) {
                if ((chs[i] >= '0' && chs[i] <= '9')) // isDigit(s[i]) ?
                {
                    rev = "";
                    while (i < s.length()
                            && ((chs[i] >= '0' && chs[i] <= '9') || chs[i] == '/')) // isDigit(s[i])
                                                                                    // ?
                    {
                        rev = rev + chs[i];
                        ++i;
                    }
                    rev = MakeReverse(rev);
                    Out = Out + rev;
                } else {
                    Out = Out + chs[i];
                    ++i;
                }
            }
            s = Out;
        } catch (Exception ex) {
            // throw new Exception(
            // "An exception has occurred in ArabicReverse function.\\n"
            // + ex.getMessage());
        }
        return s;
    }

    private static final boolean isFromTheSet1(/* WCHAR */char ch) {
        char[] theSet1 = new char[] {
        		(char) 0x626,   (char) 0x0628,(char) 0x067e,
        		(char) 0x062a, (char) 0x062c, (char) 0x0686,(char) 0x062e,
        		(char) 0x0633, (char) 0x0634, (char) 0x063a,(char) 0x0641,
        		(char) 0x0642, (char) 0x0643, (char) 0x06af,(char) 0x06ad,
        		(char) 0x0644, (char) 0x0645, (char) 0x0646,(char) 0x06be,
        		(char) 0x06d0, (char) 0x0649,(char) 0x064a
        };
        int i = 0;
        while (i < 22) {
            if (ch == theSet1[i])
                return true;
            ++i;
        }
        return false;
    }

    private static final boolean isFromTheSet2(/* WCHAR */char ch) {
        char[] theSet2 = new char[] { 
        		(char) 0x0627,(char) 0x06d5,(char) 0x062f,(char) 0x0631,
                (char) 0x0632,(char) 0x0698,(char) 0x0648,(char) 0x06c7,
                (char) 0x06c6,(char) 0x06c8,(char) 0x06cb
        };
        int i = 0;
        while (i < 11) {
            if (ch == theSet2[i])
                return true;
            ++i;
        }
        return false;
    }

    private static final String MakeReverse(String text) {
        String Result = "";
        char[] Ctext = new char[text.length()];
        Ctext = text.toCharArray();
        for (int i = (text.length()) - 1; i >= 0; i--) {
            Result += Ctext[i];
        }
        return Result;
    }

    public static final String Convert(String In) {

        if (!isFarsiConversionNeeded) {
            return In;
        }

        try {

            boolean linkBefore, linkAfter;
            String Out = In;
            char[] chOut = new char[Out.length()];
            chOut = Out.toCharArray();
            char[] chIn = new char[In.length()];
            chIn = In.toCharArray();

            for (int i = 0; i < In.length(); i++) {
                /* WCHAR */
                char ch = chIn[i];
                if ((ch >= (char) 0x0626 && ch <= (char) 0x064a)
                        || (ch == (char) 0x067e) || (ch == (char) 0x0686)
                        || (ch == (char) 0x0698) || (ch == (char) 0x06af)
                        || (ch == (char) 0x06ad) || (ch == (char) 0x06be)
                        || (ch == (char) 0x06c7) || (ch == (char) 0x06c6)
                        || (ch == (char) 0x06c8) || (ch == (char) 0x06cb)
                        || (ch == (char) 0x06d0) || (ch == (char) 0x06d5)
                ) // is an Uyghur character?
                {
                    int idx = 0;
                    while (idx < N_DISTINCT_CHARACTERS) {
                        if (arrStruc[idx].character == chIn[i])
                            break;
                        ++idx;
                    }

                    if (i == In.length() - 1)
                        linkAfter = false;
                    else
                        linkAfter = (isFromTheSet1(chIn[i + 1]) || isFromTheSet2(chIn[i + 1]));
                    if (i == 0)
                        linkBefore = false;
                    else
                        linkBefore = isFromTheSet1(chIn[i - 1]);
                    if (idx < N_DISTINCT_CHARACTERS) {
                        if (linkBefore && linkAfter)
                            chOut[i] = arrStruc[idx].midGlyph;
                        if (linkBefore && !linkAfter)
                            chOut[i] = arrStruc[idx].endGlyph;
                        if (!linkBefore && linkAfter)
                            chOut[i] = arrStruc[idx].iniGlyph;
                        if (!linkBefore && !linkAfter)
                            chOut[i] = arrStruc[idx].isoGlyph;
                    } else {
                        chOut[i] = chIn[i];
                    }
                } else {
                    chOut[i] = chIn[i];
                }
            }
            Out = "";
            for (int j = 0; j < chOut.length; j++)
                Out += chOut[j];
            ArabicReverse(Out);

            Out = Out.replace((char) 0x200c, ' '); // Change NO SPACE to SPACE

            Out = Out.replace(szLamAndAlef, szLa); // Join 'Lam' and 'Alef' and
                                                    // make 'La'
            Out = Out.replace(szLamStickAndAlef, szLaStick); // Join 'Lam Stick'
                                                                // and 'Alef'
                                                                // and make 'La
                                                                // Stick'

            return Out;
        } catch (Exception ex) {
            // throw new
            // Exception("An exception has occurred in Arabize function.\\n" +
            // ex.getMessage());
            return "";
        }
    }


    private static Typeface typeface;

    public static final Typeface GetFarsiFont(Context act) {
        if (typeface == null) {
            typeface = Typeface.createFromAsset(act.getAssets(),
                    // "DroidSansFallback.ttf");
                    "UkijTuzTom.ttf");
        }
        return typeface;
    }
}
