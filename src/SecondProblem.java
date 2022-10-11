/*
Написать программу, определяющую правильность расстановки скобок в выражении.
Пример 1: a+(d*3) - истина
Пример 2: [a+(1*3) - ложь
Пример 3: [6+(3*3)] - истина
Пример 4: {a}[+]{(d*3)} - истина
Пример 5: <{a}+{(d*3)}> - истина
Пример 6: {a+]}{(d*3)} - ложь
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SecondProblem {
    public boolean correctBrackets(String input){
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put('}', '{');
        brackets.put(')', '(');
        brackets.put(']', '[');

        Stack<Character> stack = new Stack<>();
        char[] chars = input.toCharArray();
        for (char myChar : chars) {
            if(brackets.containsValue(myChar)) {
                stack.push(myChar);
            } else if (brackets.containsKey(myChar)) {
                if(stack.isEmpty() || stack.pop() != brackets.get(myChar)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
