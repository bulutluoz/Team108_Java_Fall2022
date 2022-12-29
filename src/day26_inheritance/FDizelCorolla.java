package day26_inheritance;



public class FDizelCorolla extends ECorolla{

    String motor="1.6 dizel motor";
    String yakit="Dizel";
    String guvenlik="Abs";
    String renk="renk belirtilmedi";


    public static void main(String[] args) {

        DToyota c3=new FDizelCorolla();
        System.out.println(c3.motor); // T "Motor Belirtilmedi"
        System.out.println(c3.yakit); // T Yakit belirtilmedi
        // System.out.println(c3.guvenlik); // CTE
        //System.out.println(c3.renk);// CTE

        System.out.println(c3.model); // T Model Belirtilmed
        //System.out.println(c3.uretimYeri); // CTE
        //System.out.println(c3.teker); // CTE
        // System.out.println(c3.vites); // CTE

        System.out.println(c3.marka);//T Toyota



        // Bazen child class'dan obje olusturmakla beraber
        // bu child class'in parent class'indaki hangi ozellikleri
        // aldigini bilmek isteriz
        // Bu durumda data turunu constructor'i kullanilan class'in
        // parent class'larindan secebiliriz

        ECorolla c2=new FDizelCorolla();
        System.out.println(c2.motor); // T  Motor belirtilmedi
        System.out.println(c2.yakit); // T yakit belirtilmedi
        // System.out.println(c2.guvenlik); // CTE
        // System.out.println(c2.renk);// CTE

        System.out.println(c2.model); // C Corolla
        System.out.println(c2.uretimYeri); // C Turkiye
        System.out.println(c2.teker); //C 200.55 teker
        System.out.println(c2.vites); // C vites belirtilmedi

        System.out.println(c2.marka);//T Toyota




        FDizelCorolla c1=new FDizelCorolla();

        System.out.println(c1.motor); // DC 1.6 dizel motor
        System.out.println(c1.yakit); // DC Dizel
        System.out.println(c1.guvenlik); // DC Abs
        System.out.println(c1.renk);//DC renk belirtilmedi

        System.out.println(c1.model); // C Corolla
        System.out.println(c1.uretimYeri); // C Turkiye
        System.out.println(c1.teker); //C 200.55 teker
        System.out.println(c1.vites); // C vites belirtilmedi

        System.out.println(c1.marka);//T Toyota




    }
}
