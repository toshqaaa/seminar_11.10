/*
Написать метод, который переведет число из римского формата записи в арабский.
Например, MMXXII = 2022
http://graecolatini.bsu.by/htm-different/num-converter-roman.htm

если большая цифра стоит перед меньшей, они складываются

если меньшая цифра стоит перед большей (в этом случае она не может повторяться),
то меньшая вычитается из большей; вычитаться могут только цифры, обозначающие 1 или степени 10;
уменьшаемым может быть только цифра, ближайшая в числовом ряду к вычитаемой:

цифры V, L, D не могут повторяться; цифры I, X, C, M могут повторяться не более трех раз подряд:
 */

import java.util.HashMap;
import java.util.Map;

//Будет работать от 1 до 3999
public class ThirdProblem {
    public int romanToArabic(String input){
        int result = 0;
        for (int i = 0; i<input.length(); i++){
            if (i==0 || getAlphabet().get(input.charAt(i)) <= getAlphabet().get(input.charAt(i-1))){
                result += getAlphabet().get(input.charAt(i));
            } else {
                result += getAlphabet().get(input.charAt(i)) - 2* getAlphabet().get(input.charAt(i-1));
            }
        }
        return result;
    }

    public Map<Character, Integer> getAlphabet(){
        Map<Character, Integer> numbers = new HashMap<>();
        numbers.put('I', 1);
        numbers.put('V', 5);
        numbers.put('X', 10);
        numbers.put('L', 50);
        numbers.put('C', 100);
        numbers.put('D', 500);
        numbers.put('M', 1000);
        return numbers;

    }
}
