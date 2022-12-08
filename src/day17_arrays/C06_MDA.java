package day17_arrays;

public class C06_MDA {

    public static void main(String[] args) {

        // Verilen iki katli String bir array'de
        // istenen metni iceren elementleri yazdiran bir method olusturun

        String[][] arr = {{"Ali","Zafer"},{"Betul","Huseyin","Hasan"},{"Said"}};

        String arananMetin="a";

        istenenElementleriYazdir(arr,arananMetin); // Zafer Hasan Said
        istenenElementleriYazdir(arr,"e"); // Zafer Betul Huseyin
        istenenElementleriYazdir(arr,"Ali"); // Ali

    }

    public static void istenenElementleriYazdir(String[][] arr, String arananMetin){

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length ; j++) {

                if (arr[i][j].contains(arananMetin)){
                    System.out.print(arr[i][j] + " ");
                }
            }

        }
        System.out.println("");
    }
}
