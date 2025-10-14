public class DiscreteMath {

//    Static variables
    public static boolean T = true;
    public static boolean F = false;

//    This negates x
    public static boolean NOT (boolean x) {
//        return !x;
        if (x == T) return F;
        else return T;
    }

//    test AND
    public static boolean AND(boolean x, boolean y) {
        if (x == T && y == T) return T;
        else return F;
    }

//    test OR
    public static boolean OR(boolean x, boolean y) {
        if (x == F && y == F) return F;
        else return T;
    }

//    Test XOR
    public static boolean XOR(boolean x, boolean y) {
        if (x == T && y == F) {
            return T;
        }
        else if(x == F && y == T) {
            return T;
        }
        else {
            return F;
        }
    }

//    x implies y (x -> y)
    public static boolean IF (boolean x, boolean y) {
        if (x == T && y == F) return F;
        else return T;
    }

//    x IFF y (x <--> y)
    public static boolean IFF (boolean x, boolean y) {
//        IFF is the negation of XOR
        return !XOR(x, y);
    }
}
