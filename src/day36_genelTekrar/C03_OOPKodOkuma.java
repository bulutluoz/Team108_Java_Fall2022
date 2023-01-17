package day36_genelTekrar;

    class M
    {
    static {System.out.println('A');}
    { System.out.println('B');}

    public M() {
        System.out.println('C');
    }}

    class N extends M {
    static {
        System.out.println('D');
    }

    { System.out.println('E');}

    public N()
    {
        System.out.println('F');
    }
}

public class C03_OOPKodOkuma {
    public static void main(String[] args) {
        N n = new N();
    }
}




