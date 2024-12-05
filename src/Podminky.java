public class Podminky {

    public static void main(String[] args) {

        int a = 11;
        int b = 10;

        if (a == b) {
            System.out.println("A je rovno B");
        } else {
            System.out.println("A neni rovno B");
        }

        int c = 100;
        double d = 100.11;

        if ((a == b) && (c < d)) {
            System.out.println("A je rovno B a c je mensi nez d");
        } else {
            System.out.println("nic ");
        }

        if(b != 0) { // test zdali b neni 0
            if(a / b < 10) { // zakazano delit nulou
                System.out.println("a / b < 10 ==> true");
            }
        } else {
            System.out.println("pozor B je nula, nulou nelze delit");
        }

        if(b != 0 && ((a / b) < 10)) {
            System.out.println("a / b < 10 ==> true");
        } else {
            System.out.println("b != 0 && ((a / b) < 10) ==> false");
        }


        if( a == b ) {
            System.out.println("a == b");
        } else if ( a < b) {
            System.out.println("a < b");
        } else if (a > b) {
            System.out.println("a > b");
        }



//        if((a / b) < 10) {
//            System.out.println("a / b < 10 ==> true");
//        } else {
//            System.out.println("((a / b) < 10) ==> false");
//        }
//
//        System.out.println("tento text se nevypise");



    }


}
