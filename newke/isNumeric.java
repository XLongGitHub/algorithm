package offer;

/**
 * Created by Xulong on 2017/4/4.
 */
public class isNumeric {
    public boolean isNumeric(char[] str) {
        boolean is = false;

//        boolean =
        return false;
    }

    public boolean isD(char c) {
        if (c <= '9' && c >= '0')
            return true;
        return false;
    }

    public boolean isF(char c) {
        if (c == '+' || c == '-')
            return true;
        return false;
    }

    public boolean isE(char c) {
        if (c == 'e' || c == 'E')
            return true;
        return false;
    }
}
