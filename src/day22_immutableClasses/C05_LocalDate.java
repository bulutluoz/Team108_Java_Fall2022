package day22_immutableClasses;

import java.time.LocalDate;

public class C05_LocalDate {

    public static void main(String[] args) {

        LocalDate tarih= LocalDate.now();
        System.out.println(tarih); // 2022-12-19

        System.out.println(tarih.getDayOfWeek()); // MONDAY
        System.out.println(tarih.getMonthValue()); // 12
        System.out.println(tarih.getMonth());//DECEMBER
        System.out.println(tarih.getDayOfYear()); // 353
        System.out.println(tarih.getChronology()); // ISO

        System.out.println(tarih.withYear(2015)); // 2015-12-19
        System.out.println(tarih.withDayOfMonth(15)); // 2022-12-15
        System.out.println(tarih.withDayOfMonth(15).withYear(2015)); // 2015-12-15

        System.out.println(tarih.isLeapYear()); // false

        System.out.println(tarih.minusWeeks(5));//2022-11-14
        System.out.println(tarih.minusYears(3).minusMonths(5).minusDays(5));// 2019-07-14

        System.out.println(tarih.plusWeeks(19)); // 2023-05-01
        System.out.println(tarih.plusYears(10).plusMonths(3).plusDays(10)); // 2033-03-29

        LocalDate tarih1= LocalDate.of(1975,10,13);
        LocalDate tarih2=LocalDate.of(1975,10,20);

        System.out.println(tarih1.isBefore(tarih2) ? "Tarih1 daha eski" : "Tarih2 daha eski");

        System.out.println(tarih1.isLeapYear()); // false

        System.out.println(tarih.hashCode());// 4141843
        System.out.println(tarih1.hashCode()); // 4045453
        System.out.println(tarih2.minusDays(7).hashCode()); // 4045453


    }
}
