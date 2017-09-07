package algorithm4.chpterOne;

import java.util.Stack;

public class AddSymbol {
    Stack vals = new Stack();
    Stack os = new Stack();
    Stack symbol = new Stack();  //括号
    public static void main(String[] args) {
        String string = "1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )";
    }

    public void add(String string) {
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == ' ') continue;
            if (isNumber(c)) {
                vals.push(c);
            }


        }
    }

    public boolean isNumber( char c) {
        switch (c) {
            case '0' :
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9': return true;
        }
        return false;
    }
}
