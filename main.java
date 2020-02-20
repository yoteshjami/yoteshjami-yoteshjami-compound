package simple;

import java.util.Scanner;
public class main {
    public static void Main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Amount");
        double principal=sc.nextDouble();
        System.out.println("Enter time");
        double time=sc.nextDouble();
        System.out.println("Enter rate of interest");
        double rate_of_interest=sc.nextDouble();
        System.out.println("Is commited ??");
        boolean automated=sc.nextBoolean();
        System.out.println("Enter material");
        String material=sc.next();
        System.out.println("Enter area");
        double area=sc.nextDouble();

        sim_in sim =new sim_in(principal,time,rate_of_interest);
        double simple_interest=sim.cal();
        System.out.println("Simple Interest : "+simple_interest);

        com_in com =new com_in(principal,time,rate_of_interest);
        double compound_interest=com.calc();
        System.out.println("Compound Interest : "+compound_interest);

        construct con =new construct(automated,material,area);
        double cost=con.constructs();
        System.out.println("Total Cost : "+cost);
    }
}