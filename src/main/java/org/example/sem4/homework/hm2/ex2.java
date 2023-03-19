package org.example.sem4.homework.hm2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;

//Учитывая строку s, содержащую только символы '(', ')', '{', и , определите '}', допустима ли входная строка.'['']'
//Входная строка действительна, если:
//Открытые скобки должны быть закрыты однотипными скобками.
//Открытые скобки должны быть закрыты в правильном порядке.
//Каждой закрывающей скобке соответствует открытая скобка того же типа.
public class ex2 {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("{)]{}"));
    }
    public static Boolean isValid(String s) {

        LinkedList<String> inputList = new LinkedList<>(Arrays.asList(s.split("")));

        HashMap <String, String> brackets = new HashMap<>();
        brackets.put(")", "(");
        brackets.put("]", "[");
        brackets.put("}", "{");

        LinkedList<String> startBrackets = new LinkedList<>();

        for (String bracket : inputList) {
            if (brackets.containsValue(bracket)) startBrackets.add(bracket);
            else if (brackets.containsKey(bracket)){
                if (!Objects.equals(startBrackets.pollLast(), brackets.get(bracket))) {
                    return false;
                }
            }
        }
        return startBrackets.isEmpty();
    }

}
