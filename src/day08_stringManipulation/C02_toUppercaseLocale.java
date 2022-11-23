package day08_stringManipulation;

import java.util.Locale;

public class C02_toUppercaseLocale {

    public static void main(String[] args) {

        String str= "JAVA CANDIR";

        System.out.println(str.toLowerCase()); // java candir

        str= str.toLowerCase(Locale.forLanguageTag("Tr"));
        System.out.println(str); // java candır

        str="sevgi insanı hayata bağlar";

        System.out.println(str.toUpperCase()); // SEVGI INSANI HAYATA BAĞLAR

        str=str.toUpperCase(Locale.forLanguageTag("Tr"));
        System.out.println(str); // SEVGİ İNSANI HAYATA BAĞLAR

    }
}
