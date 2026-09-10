public class TabularOutput {
    public static void main(String[] args) {

        int n;
        int n2 = 1;
        int n3 = 1;
        int n4 = 1;
        String k1 = "N1";
        String k2 = "N2";
        String k3 = "N3";
        String k4 = "N4";

        System.out.printf("%3s %3s %3s %3s %n",k1,k2,k3,k4 );



        for (n = 1; n <= 5; n++) {
             n2 = n * n;
             n3 = n * n * n;
             n4 = n * n * n * n;

             System.out.printf("%3d %3d %3d %3d %n",n,n2,n3 ,n4 );

        }
    }
}
