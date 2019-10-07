package by.epam.unit03.class_and_obj.first_task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student[] student = new Student[10];


        for(int i = 0;i<10;i++){
            in.nextLine();
            student[i] = new Student();
            System.out.println("input name");
            student[i].setSurname(in.nextLine());
            System.out.println("input init");
            student[i].setInitials(in.nextLine());
            System.out.println("num og gr");
            student[i].setNumbOfGroup(in.nextInt());
            System.out.println("score");

            int[]a = new int[5];
            for(int k = 0;k<5;k++){
                a[k] = in.nextInt();
            }
            student[i].setProgress(a);
        }

        for(int i = 0;i<10;i++){
            System.out.println(student[i].getSurname()+" "
                    +student[i].getInitials()+" "
                    + student[i].getNumbOfGroup());
            for(int k = 0;k<5;k++) {
                System.out.println(student[i].getProgress()[k]);
            }
        }
        System.out.println("with good marks");
        int m;
        for(int i = 0;i<10;i++) {
            m = 0;
            for(int k=0;k<5;k++) {
                if (student[i].getProgress()[k] < 9) {
                  m++;
                }
            }
                if(m==0){
                    System.out.println(student[i].getSurname()+" "
                            +student[i].getInitials()+" "
                            + student[i].getNumbOfGroup());
                    for(int n = 0;n<5;n++) {
                        System.out.println(student[i].getProgress()[n]);
                    }
                }
                else
                    continue;
        }
    }
}

