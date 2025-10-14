public class DiscreteMathDriver {
    public static void main(String[] args) {

//        Create some propositions
        boolean p = DiscreteMath.T;
        boolean q = DiscreteMath.F;
        boolean r = DiscreteMath.T;

//        Display them
        System.out.println("p = "+ p);
        System.out.println("q = "+ q);
        System.out.println("r = "+ r);

//        Test NOT
        boolean result = DiscreteMath.NOT(p);
        System.out.println("NOT(p) =  "+ result);

//        OR
        result = DiscreteMath.OR(p,q);
        System.out.println("p OR q = "+ result);

//        XOR
        result = DiscreteMath.XOR(p,q);
        System.out.println("p XOR q = "+ result);

//        IF
        result = DiscreteMath.IF(p,q);
        System.out.println("p --> q = "+ result);

//        IFF
        result = DiscreteMath.IFF(p,q);
        System.out.println("p <--> q = "+ result);
    }
}
