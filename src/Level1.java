import java.util.*;

public class Level1 {
    public static int PrintingCosts(String Line) {
        int res = 0;
        HashMap<Character, Integer> quantityOnChar = new HashMap<>();
        quantityOnChar.put(' ', 0);
        quantityOnChar.put('&', 24);
        quantityOnChar.put(',', 7);
        quantityOnChar.put('2', 22);
        quantityOnChar.put('8', 23);
        quantityOnChar.put('>', 10);
        quantityOnChar.put('D', 26);
        quantityOnChar.put('J', 18);
        quantityOnChar.put('P', 23);
        quantityOnChar.put('V', 19);
        quantityOnChar.put('\\', 10);
        quantityOnChar.put('b', 25);
        quantityOnChar.put('h', 21);
        quantityOnChar.put('n', 18);
        quantityOnChar.put('t', 17);
        quantityOnChar.put('z', 19);

        quantityOnChar.put('!', 9);
        quantityOnChar.put('\'', 3);
        quantityOnChar.put('-', 7);
        quantityOnChar.put('3', 23);
        quantityOnChar.put('9', 26);
        quantityOnChar.put('?', 15);
        quantityOnChar.put('E', 26);
        quantityOnChar.put('K', 21);
        quantityOnChar.put('Q', 31);
        quantityOnChar.put('W', 26);
        quantityOnChar.put(']', 18);
        quantityOnChar.put('c', 17);
        quantityOnChar.put('i', 15);
        quantityOnChar.put('o', 20);
        quantityOnChar.put('u', 17);
        quantityOnChar.put('{', 18);

        quantityOnChar.put('"', 6);
        quantityOnChar.put('(', 12);
        quantityOnChar.put('.', 4);
        quantityOnChar.put('4', 21);
        quantityOnChar.put(':', 8);
        quantityOnChar.put('@', 32);
        quantityOnChar.put('F', 20);
        quantityOnChar.put('L', 16);
        quantityOnChar.put('R', 28);
        quantityOnChar.put('X', 18);
        quantityOnChar.put('^', 7);
        quantityOnChar.put('d', 25);
        quantityOnChar.put('j', 20);
        quantityOnChar.put('p', 25);
        quantityOnChar.put('v', 13);
        quantityOnChar.put('|', 12);

        quantityOnChar.put('#', 24);
        quantityOnChar.put(')', 12);
        quantityOnChar.put('/', 10);
        quantityOnChar.put('5', 27);
        quantityOnChar.put(';', 11);
        quantityOnChar.put('A', 24);
        quantityOnChar.put('G', 25);
        quantityOnChar.put('M', 28);
        quantityOnChar.put('S', 25);
        quantityOnChar.put('Y', 14);
        quantityOnChar.put('_', 8);
        quantityOnChar.put('e', 23);
        quantityOnChar.put('k', 21);
        quantityOnChar.put('q', 25);
        quantityOnChar.put('w', 19);
        quantityOnChar.put('}', 18);

        quantityOnChar.put('$', 29);
        quantityOnChar.put('*', 17);
        quantityOnChar.put('0', 22);
        quantityOnChar.put('6', 26);
        quantityOnChar.put('<', 10);
        quantityOnChar.put('B', 29);
        quantityOnChar.put('H', 25);
        quantityOnChar.put('N', 25);
        quantityOnChar.put('T', 16);
        quantityOnChar.put('Z', 22);
        quantityOnChar.put('`', 3);
        quantityOnChar.put('f', 18);
        quantityOnChar.put('l', 16);
        quantityOnChar.put('r', 13);
        quantityOnChar.put('x', 13);
        quantityOnChar.put('~', 9);

        quantityOnChar.put('%', 22);
        quantityOnChar.put('+', 13);
        quantityOnChar.put('1', 19);
        quantityOnChar.put('7', 16);
        quantityOnChar.put('=', 14);
        quantityOnChar.put('C', 20);
        quantityOnChar.put('I', 18);
        quantityOnChar.put('O', 26);
        quantityOnChar.put('U', 23);
        quantityOnChar.put('[', 18);
        quantityOnChar.put('a', 23);
        quantityOnChar.put('g', 30);
        quantityOnChar.put('m', 22);
        quantityOnChar.put('s', 21);
        quantityOnChar.put('y', 24);

        for (int i = 0; i < Line.length(); i++) {
            if(quantityOnChar.get(Line.charAt(i)) != null) {
                res += quantityOnChar.get(Line.charAt(i));
            } else {
                res += 23;
            }
        }

        return res;
    }
}