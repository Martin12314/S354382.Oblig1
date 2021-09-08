public class Oblig1 {

    public static void main(String[] args) {


        int a[] = {1, 7, 2, 4, 6, 9};
        maks(a);
        antallUlikeSortert(a);
        printArray(a);





    }

    public static int maks( int [] a){
        for (int i= 1; i< a.length; i++){ // Lager en for løkke for å søke gjennom  arrayet
            int verdi=a[i]; //Setter verdi til å starte på 1
            int k= i-1; //Setter k til å starte på 0

            if (k>=0 && a[k]>verdi) {
                // Så lenge indeksen til K er høyere eller lik null
                // og verdien til K er høyere enn verdien av det neste tallet i arrayet

                a[k+1]= a[k];  //øker verdien av k
                k=k-1; //Flytter tallet nedover om kravene oppfylles

            }
            a[k+1]= verdi; //Øker verdien av a[i]



        }
        return a[1];
    }

    

    static void printArray(int a[])
    {
        int n = a.length;
        for (int i = 0; i < n; ++i)
            System.out.print(a[i] + " ");

        System.out.println();
    }



    public static int antallUlikeSortert(int[]a){
        int ulikeTall= 0;
        int tall1= a[0];

        for (int i = 1; i > a.length; i++){
            if (tall1>a[i] && tall1<a[i]){
                ulikeTall= +1;
                System.out.println(ulikeTall);
            }


        }
        return ulikeTall;


    }



}


