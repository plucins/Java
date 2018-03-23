public class Zadanie13 {
    public static void main(String[] args) {
        a();
        System.out.println();
        b();
        System.out.println();
        c();
        System.out.println();
        d();
    }

    private static void d() {
        for(int i = 0; i <= 8; i++ ){
            System.out.println();
            for(int k = 8; k > i ; k--){
                System.out.print(" ");
            }
            for( int j = 0; j < i; j++){
                System.out.print("#");
            }
        }
    }

    private static void c() {
        for(int i = 8; i > 0; i-- ){
            System.out.println();
            for(int k = 8; k > i ; k--){
                System.out.print(" ");
            }
            for( int j = 0; j < i; j++){
                System.out.print("#");
            }
        }
    }


    private static void b() {
        for(int i = 8; i > 0; i-- ){
            System.out.println();
            for( int j = 0; j < i; j++){
                System.out.print("#");
            }
        }
    }


    private static void a() {
        for(int i = 0; i <= 8; i++ ){
            System.out.println();
            for( int j = 0; j < i; j++){
                System.out.print("#");
            }
        }
    }

}
