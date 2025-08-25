public class pattern {
    public static void main (String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            if (i <=n / 2) {
                System.out.print("*");
                for (int k = 1; k <= n + 2; k++) {
                        System.out.print(' ');
                }for (int k = 1; k <= i; k++) {
                    System.out.print('*');
                }
            System.out.println();
            } else if(i==n/2+1){
                for (int k = 1; k <=2*n+(n-1-(3*(n/2-1))); k++) {
                    System.out.print("*");

                }
                System.out.println();
            }
            else{
                System.out.print("*");
                for (int k = 1; k <= n + 2; k++) {
                    System.out.print(' ');
                }for (int k = 1; k <=n-i+1; k++) {
                    System.out.print('*');
                }System.out.println();
            }

        }
    }
}
