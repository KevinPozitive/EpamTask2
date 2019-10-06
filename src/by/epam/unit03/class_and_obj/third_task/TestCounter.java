package by.epam.unit03.class_and_obj.third_task;

import java.util.Scanner;

public class TestCounter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min = in.nextInt();
        int max = in.nextInt();

        MyСounter counter = new MyСounter(min,max);
        int mas[] = counter.getMas();

        while(true){
            int i = in.nextInt();
            switch(i){
                case 1:counter.growth();break;
                case 2:counter.reduction();break;
                case 3: System.out.println(counter.getPresentValue());break;
                case 4:for(int k = counter.getMin();k<counter.getMax();k++){
                    counter.initialization(in.nextInt(),k);
                };break;
                case 5:for(int k=0;k<mas.length;k++){
                    System.out.println(mas[k]);
                };break;
                case 6:return;
                default:break;
            }
        }

    }
}
