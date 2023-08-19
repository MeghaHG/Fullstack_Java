package controlflowstatement;

public class StarPattern {

    public static void main(String[] args) {

        /**
         *   $
         *   $  $
         *   $  $   $
         *   $  $   $   $
         */

        int i = 1;
        while(i <= 4){

            for (int j = 1; j <= i; j++){
                System.out.print(" *");
            }
            System.out.println();
            i++;
        }
        System.out.println();

        /**     $   $   $   $
         *      $   $   $   $
         *      $   $   $   $
         *      $   $   $   $        */

     int m=4;

        for ( m=1; m<=4; m++){
            for(int n=1; n<=4; n++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int x=1; x<=4; x++) {
            for (int y = 1; y <= 4; y++) {
                if ((x == 2 && y == 2) || (x == 2 && y == 3)) {
                    System.out.print("  ");
                } else {
                    System.out.print(" *");
                }
                System.out.println();
            }
        }
        /**     $   $   $   $
         *      $   $   $
         *      $   $
         *      $
         */

        int p=4;
        for (p=0; p<=4; p++){
            for (int q=4; q>p; q--){
                System.out.print("*");
            }
            System.out.println();
        }

        /**                  $
         *               $   $
                    $    $   $
               $    $    $    $      */


        int n=4;
        int s,t;

        for (s=0; s<n; s++){
            for (t=2*(n-s); t>=0; t--){
                System.out.print(" ");
            }
            for (t=0; t<=s; t++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        /**
         *              $
         *           $      $
         *       $      $       $
         *   $      $      $       $
         */
        int c=4;
        int a,b;

        for (a=0; a<c; a++){
            for (b=c-a; b>1; b--){
                System.out.print(" ");
            }
            for (b=0; b<=a; b++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }

}
