/*Kullanıcıdan doğum gününü alın(LocalDateTime)
 * Sistem tarihi ile karşılaştırın.
 * Doğum günü bugünse kullanıcıya bir tebrik mesajı gösterin
 * Değilse ne kadar gün veya saat kaldığını bildiren bir mesaj verin.
 */
package practice;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.*;

public class practice_3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Doğum günü Tebrik Programı");
        System.out.println("Doğum gününüzü ve saatinizi girin.");
        String dogumGunuInput=scanner.nextLine();

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dogumGunu=LocalDateTime.parse(dogumGunuInput,formatter);
        LocalDateTime  bugun=LocalDateTime.now();

        if(dogumGunu.getMonthValue()== bugun.getMonthValue() && dogumGunu.getDayOfMonth()== bugun.getDayOfMonth()){
            System.out.println("Bugün doğum gününüz! İyi ki doğdunuz!");

        }
        else{
            long gunKaldi=bugun.until(dogumGunu, ChronoUnit.DAYS);
            long saatKaldi=bugun.until(dogumGunu, ChronoUnit.HOURS);
            System.out.println("Doğum gününüze "+ gunKaldi+"gün, veya "+ saatKaldi+" saat "+" kaldi.");

        }
        scanner.close();
    }
}