import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int scoreTabel[]=new int[100];
        int antalScores;
        antalScores=inputScores(scoreTabel);
        udskriv(scoreTabel,antalScores);
        double snit;
        snit=gennemsnit(scoreTabel,antalScores);
        System.out.println("Gennemsnittet er: "+snit);

        int x=antalOverSnit(scoreTabel,antalScores,snit);
        System.out.println("Antal over snittet: "+x);

        int minimum=min(scoreTabel,antalScores);
        System.out.println("Mindste score: "+minimum);

    }

     public static int inputScores(int[] a){
        Scanner input=new Scanner(System.in);
        int score=0;
        int antalScores=0;

        while(score>=0){
            score=input.nextInt();
            if(score>=0){
                a[antalScores]=score;
                antalScores++;
            }
        }
        return antalScores;
    }

    public static void udskriv(int[]a, int antal){

        for(int i=0;i<antal;i++)
            System.out.print(a[i]+" ");
    }

    public static double gennemsnit(int[] a,int antal){
        double sum=0;
        for(int i=0;i<antal;i++){
            sum+=a[i];
        }
        return sum/antal;
    }


    public static int antalOverSnit(int[] a,int antal,double snit){
        int overSnit=0;
        for(int i=0;i<antal;i++){
            if(a[i]>snit)
                overSnit++;
        }
        return overSnit;
    }

    public static int antalUnderSnit(int[] a,int antal,double snit){
        int underSnit=0;
        for(int i=0;i<antal;i++){
            if(a[i]<snit)
                underSnit++;
        }
        return underSnit;
    }

    public static int min(int[] a,int antal){
        int lavest=a[0];
        for(int i=1;i<antal;i++){
            if(a[i]<lavest)
                lavest=a[i];
        }
        return lavest;
    }











}