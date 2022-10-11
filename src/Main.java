import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        SecondProblem secondProblem = new SecondProblem();
//        Scanner in = new Scanner(System.in);
//        while(in.hasNext()) {
//            System.out.println(secondProblem.correctBrackets(in.nextLine()));
//        }

//        ThirdProblem thirdProblem = new ThirdProblem();
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()) {
//            System.out.println(thirdProblem.romanToArabic(in.nextLine()));
//        }
            FourthProblem fourthProblem = new FourthProblem();
            Scanner in = new Scanner(System.in);
            while(in.hasNextLine()){
                fourthProblem.sortedMap(in.nextLine());
            }
    }
}
/*
Пример 1: a+(d*3) - истина
Пример 2: [a+(1*3) - ложь
Пример 3: [6+(3*3)] - истина
Пример 4: {a}[+]{(d*3)} - истина
Пример 5: <{a}+{(d*3)}> - истина
Пример 6: {a+]}{(d*3)} - ложь
 */
