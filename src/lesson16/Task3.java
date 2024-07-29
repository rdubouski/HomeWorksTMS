package lesson16;

//Задана строка, которая может иметь внутри себя скобки. Скобкой считается
//любой из следующих символов — «(«, «)», «[«, «]», «{«, «}». Проверить
//сбалансированность расстановки скобок в этой строке. Набор скобок считается
//сбалансированной парой, если открывающая скобка "(", "[" и "{" стоит слева от
//соответствующей закрывающей скобки ")", "]" и "} ", соответственно. Строка,
//содержащая пары скобок, не сбалансирована, если набор заключенных в нее
//скобок не совпадает .
//Например, если ввод «{[(])}», пара квадратных скобок «[]» заключает в себя
//одну несбалансированную открывающую круглую скобку «(». Аналогично, пара
//круглых скобок «() ", заключает в себя одну несбалансированную
//закрывающую квадратную скобку "]". Таким образом, входная строка "{[(])}"
//несбалансированная.
//Пример
//() - сбалансирована
//[()] - сбалансирована
//{[()]} - сбалансирована
//([{{[(())]}}]) - сбалансирована
//{{[]()}}}} - не сбалансирована
//{[(])} - не сбалансирована

import java.util.Map;
import java.util.Stack;

public class Task3 {

    public static void main(String[] args) {

        String string;
        string = "()";
        System.out.println(checkString(string));
        string = "[()]";
        System.out.println(checkString(string));
        string = "{[()]}";
        System.out.println(checkString(string));
        string = "([{{[(())]}}])";
        System.out.println(checkString(string));
        string = "{{[]()}}}}";
        System.out.println(checkString(string));
        string = "{[(])}";
        System.out.println(checkString(string));

    }

    public static String checkString(String string) {

        Stack<String> stack = new Stack<>();
        Map<String, String> map = Map.of(")","(", "]", "[", "}", "{");

        for (int i = 0; i < string.length(); i++) {
            String s = String.valueOf(string.charAt(i));
            if (s.equals("(") || s.equals("[") || s.equals("{")) {
                stack.push(s);
            } else if (s.equals(")") || s.equals("]") || s.equals("}")){
                if (stack.isEmpty()) {
                    return string + " - не сбалансирована";
                } else if (!map.get(s).equals(stack.pop())) {
                    return string + " - не сбалансирована";
                }
            }
        }
        return string + " - сбалансирована";
    }
}
