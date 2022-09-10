import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //("Sarah", "Smith", "Ms.", 1998, 14.50);
        //("Donovan", "Scoglietti", "Mr.", 1999, 25.78);
       //("Rhonda", "Holscher", "Mrs.", 1969, 17.63);

        //("Sarah", "Smith", "Ms.", 1998, 32000.52);
        //("Donovan", "Scoglietti", "Mr.", 1999, 57045.0);
        //("Rhonda", "Holscher", "Mrs.", 1969, 26987.98);
        int week = 0;


        //ArrayList<Worker> Worker = new ArrayList<Worker>();
        Worker w1 = new Worker("Sarah", "Smith", "Ms.", 1998, 14.50);
        Worker w2 = new Worker("Donovan", "Scoglietti", "Mr.", 1999, 25.00);
        Worker w3 = new Worker("Rhonda", "Holscher", "Mrs.", 1969, 17.00);
       // Worker.add(w1);
      //  Worker.add(w2);
       // Worker.add(w3);
        SalaryWorker sw1 = new SalaryWorker("Tim", "Bob", "Ms.", 1998, 32000.00);
        SalaryWorker sw2 = new SalaryWorker("Joe", "Will", "Mr.", 1999, 57045.00);
        SalaryWorker sw3 = new SalaryWorker("Sim", "Car", "Mrs.", 1969, 26987.00);
      //  Worker.add(sw1);
     //   Worker.add(sw2);
     //   Worker.add(sw3);


        do {
            week ++;
            if (week == 1){
                System.out.printf("\n%-15s %-15s %-15s %-15s %-15s %-15s %-15s","Week 1", "ID#", "FirstName", "LastName", "Title", "YOB", "Weekly Pay");
                System.out.println("\n-----------------------------------------------------------------------------------------------------------------------");
                System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %-15s"," ", w1.ID, w1.fName, w1.lName, w1.title, w1.YOB, w1.calculateWeeklyPay(40));
                System.out.printf("\n%-15s %-15s %-15s %-15s %-15s %-15s %-15s"," ", w2.ID, w2.fName, w2.lName, w2.title, w2.YOB, w2.calculateWeeklyPay(40));
                System.out.printf("\n%-15s %-15s %-15s %-15s %-15s %-15s %-15s"," ", w3.ID, w3.fName, w3.lName, w3.title, w3.YOB, w3.calculateWeeklyPay(40));
                System.out.printf("\n%-15s %-15s %-15s %-15s %-15s %-15s %-15s"," ", sw1.ID, sw1.fName, sw1.lName, sw1.title, sw1.YOB, sw1.calculateWeeklyPay());
                System.out.printf("\n%-15s %-15s %-15s %-15s %-15s %-15s %-15s"," ", sw2.ID, sw2.fName, sw2.lName, sw2.title, sw2.YOB, sw2.calculateWeeklyPay());
                System.out.printf("\n%-15s %-15s %-15s %-15s %-15s %-15s %-15s"," ", sw3.ID, sw3.fName, sw3.lName, sw3.title, sw3.YOB, sw3.calculateWeeklyPay());
                System.out.println("\n");
               /* w1.calculateWeeklyPay(40);
                System.out.println(w1.displayWeeklyPay(40));
                sw1.calculateWeeklyPay();
                System.out.println(sw1.displayWeeklyPay());
                */
            }
            if (week == 2){
                System.out.printf("\n%-15s %-15s %-15s %-15s %-15s %-15s %-15s","Week 2", "ID#", "FirstName", "LastName", "Title", "YOB", "Weekly Pay");
                System.out.println("\n-----------------------------------------------------------------------------------------------------------------------");
                System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %-15s"," ", w1.ID, w1.fName, w1.lName, w1.title, w1.YOB, w1.calculateWeeklyPay(50));
                System.out.printf("\n%-15s %-15s %-15s %-15s %-15s %-15s %-15s"," ", w2.ID, w2.fName, w2.lName, w2.title, w2.YOB, w2.calculateWeeklyPay(50));
                System.out.printf("\n%-15s %-15s %-15s %-15s %-15s %-15s %-15s"," ", w3.ID, w3.fName, w3.lName, w3.title, w3.YOB, w3.calculateWeeklyPay(50));
                System.out.printf("\n%-15s %-15s %-15s %-15s %-15s %-15s %-15s"," ", sw1.ID, sw1.fName, sw1.lName, sw1.title, sw1.YOB, sw1.calculateWeeklyPay());
                System.out.printf("\n%-15s %-15s %-15s %-15s %-15s %-15s %-15s"," ", sw2.ID, sw2.fName, sw2.lName, sw2.title, sw2.YOB, sw2.calculateWeeklyPay());
                System.out.printf("\n%-15s %-15s %-15s %-15s %-15s %-15s %-15s"," ", sw3.ID, sw3.fName, sw3.lName, sw3.title, sw3.YOB, sw3.calculateWeeklyPay());
                System.out.println("\n");
            }
            if (week == 3){
                System.out.printf("\n%-15s %-15s %-15s %-15s %-15s %-15s %-15s","Week 3", "ID#", "FirstName", "LastName", "Title", "YOB", "Weekly Pay");
                System.out.println("\n-----------------------------------------------------------------------------------------------------------------------");
                System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %-15s"," ", w1.ID, w1.fName, w1.lName, w1.title, w1.YOB, w1.calculateWeeklyPay(40));
                System.out.printf("\n%-15s %-15s %-15s %-15s %-15s %-15s %-15s"," ", w2.ID, w2.fName, w2.lName, w2.title, w2.YOB, w2.calculateWeeklyPay(40));
                System.out.printf("\n%-15s %-15s %-15s %-15s %-15s %-15s %-15s"," ", w3.ID, w3.fName, w3.lName, w3.title, w3.YOB, w3.calculateWeeklyPay(40));
                System.out.printf("\n%-15s %-15s %-15s %-15s %-15s %-15s %-15s"," ", sw1.ID, sw1.fName, sw1.lName, sw1.title, sw1.YOB, sw1.calculateWeeklyPay());
                System.out.printf("\n%-15s %-15s %-15s %-15s %-15s %-15s %-15s"," ", sw2.ID, sw2.fName, sw2.lName, sw2.title, sw2.YOB, sw2.calculateWeeklyPay());
                System.out.printf("\n%-15s %-15s %-15s %-15s %-15s %-15s %-15s"," ", sw3.ID, sw3.fName, sw3.lName, sw3.title, sw3.YOB, sw3.calculateWeeklyPay());
                System.out.println("\n");
            }
        }while(week <=3);


    }
}