import java.util.*;
import java.lang.Math;

public class bee1021 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float n =input.nextFloat();

        double hundredTaka = n/100;
        int  hundredTakaE = (int)hundredTaka;
        double next1 = n -(hundredTakaE*100);
        double fiftyTaka = next1/50;
        int fiftyTakaE =(int)fiftyTaka;
        
        double next2 = next1 -(fiftyTakaE*50);
        double twentyTaka = next2/20;
        int twentyTakaE = (int)twentyTaka;

        double next3 = next2 -(twentyTakaE*20);
        double tenTaka = next3/10;
        int tenTakaE = (int ) tenTaka;

        double next4 = next3 -(tenTakaE*10);
        double fiveTaka = next4/5;
        int fiveTakaE = (int) fiveTaka;

        double next5 = next4-(fiveTakaE*5);
        double twoTaka = next5/2;
        int twoTakaE = (int )twoTaka;

        double next6 = next5 -(twoTakaE*2);
        double oneTaka = next6/1;
        int oneTakaE = (int )oneTaka;

        double next7 = next6 -(oneTakaE*1);
        double poisaFiftyTaka = next7/0.5;
        int poisaFiftyTakaE = (int )poisaFiftyTaka;

        double next8 = next7 - (poisaFiftyTakaE * 0.5);
        double twentyFivePoisa = next8  /0.25;
        int twentyFivePoisaE = (int ) twentyFivePoisa;

        double next9 = next8 - (twentyFivePoisaE * 0.25);
        double zeroPointOneTaka = next9 /  0.1;
        int zeroPointOneTakaE = (int ) zeroPointOneTaka;

        double next10 = next9 - (zeroPointOneTakaE*0.1);
        double zeroPointZerofiveTaka = next10/0.05;
        int zeroPointZerofiveTakaE = (int) zeroPointZerofiveTaka;

        double next11 = next10 - (zeroPointZerofiveTakaE*0.05);
        double ZeroPointZeroOne = next10/0.01;
        int ZeroPoinZeroOneE = (int) ZeroPointZeroOne;

        System.out.println("NOTAS:\n" + hundredTakaE + " nota(s) de R$ 100.00\n"+ fiftyTakaE +" nota(s) de R$ 50.00\n" +twentyTakaE + " nota(s) de R$ 20.00\n" + tenTakaE +" nota(s) de R$ 10.00\n"+ fiveTakaE + " nota(s) de R$ 5.00\n" +twoTakaE + " nota(s) de R$ 2.00\n" +"MOEDAS:\n" + oneTakaE +" moeda(s) de R$ 1.00\n"+ poisaFiftyTakaE + " moeda(s) de R$ 0.50\n" + twentyFivePoisaE + " moeda(s) de R$ 0.25\n" + zeroPointOneTakaE + " moeda(s) de R$ 0.10\n" + zeroPointZerofiveTakaE + " moeda(s) de R$ 0.05\n" +  ZeroPoinZeroOneE + " moeda(s) de R$ 0.01" );

    }
}
