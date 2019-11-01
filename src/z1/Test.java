package z1;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Jacket[] jackets = new Jacket[3];
        for (int i = 0; i < jackets.length; ) {
            Jacket jacket = new Jacket();
            System.out.println("Producent:");
            jacket.setProducer(scan.nextLine());
            System.out.println("Color:");
            jacket.setColour(scan.nextLine());
            System.out.println("Rozmiar:");
            jacket.setSize(scan.nextInt());
            scan.nextLine();
            if (i==0){
                jackets[i]=jacket;
                i++;
            }else{
                for (int j = i-1; j>=0;j--){
                    if (jacket.equals(jackets[j])){
                        System.out.println("Ten objekt istnieje w tablicy");
                        i--;
                    }else {
                        jackets[i] = jacket;
                    }
                }
                i++;
            }
        }
            for (int i = 0; i < jackets.length; i++) {
                System.out.println(jackets[i].getInfo());
            }

    }
}