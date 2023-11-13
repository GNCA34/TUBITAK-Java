/*Alıştırma 2
 * rastgele sayı 50<x<60
 * double->long->int->double->double
 * ->short->float->char->double
 * System.out.println()
 * Tamamı ilkel tip
 * Sarma Yöntemleri
 * Yalnızca (char) tipi döküm
 * Math.random,Math.round
 */

package practice;

public class practice_2 {
    

    public static void main(String[] args) {
        int min=50;
        int max=60;
        double doubleFirstValue=Math.random()*(max-min)+min;
        double doubleSecondValue=Math.random()*(max-min)+min;

        System.out.println("doubleFirstValue: " +doubleFirstValue);
        System.out.println("doubleSecondValue: "+doubleSecondValue);

        
        long longFirstValue=Math.round(doubleFirstValue);
        long longSecondValue=Math.round(doubleSecondValue);

        System.out.println("longFirstValue: "+longFirstValue);
        System.out.println("longSecondValue: "+longSecondValue);

        int intFirstValue=Math.toIntExact(longFirstValue);
        int intSecondValue=Math.toIntExact(longSecondValue);

        System.out.println("intFirstValue: "+intFirstValue);
        System.out.println("intSecondValue: "+intSecondValue);

        short shortFirstValue=Short.parseShort(String.valueOf(intFirstValue));
        short shortSecondValue=Short.parseShort(String.valueOf(intSecondValue));

        System.out.println("shortFirstValue: "+shortFirstValue);
        System.out.println("shortSecondValue: "+shortSecondValue);


        float floatfirstvalue =shortFirstValue;
        float floatSecondValue =shortSecondValue;

        System.out.println("floatfirstvalue:"+floatfirstvalue);
        System.out.println("floatSecondValue:"+floatSecondValue);

        char charFirstvalue =(char) floatfirstvalue;
        char charSecondValue =(char) floatSecondValue;

        System.out.println("charfistvalue"+charFirstvalue);
        System.out.println("charSecondValue:"+charSecondValue);


    }
}