package data.Stream;

import java.util.Random;

public class RandomNumber {

    void main(){

        Random random=new Random(100);
        for(int i=0;i<100;i++){
//            System.out.print(random.nextInt(0,100)+ " ");
        }

        for(int i=0;i<100;i++){
            System.out.print((Math.random()*100)+ " ");
        }




    }



}
