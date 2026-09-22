import java.util.Scanner;

public class calculadora_abstrata {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        
        System.out.print(" NUM1 ");
        double num1 = sc.nextDouble();
        
        System.out.print(" +,-,*,/ ");
        String sim = sc.nextLine();
        sc.nextLine();
        
        System.out.print(" NUM2 ");
        double num2 = sc.nextDouble();
        
        double resultado1 = num1 + num2;
        System.out.println(resultado1);
        
        double resultado2 = num1 - num2;
        System.out.println(resultado2);
        
        double resultado3 = num1 * num2;
        System.out.println(resultado3);
        
        double resultado4 = num1 / num2;
        System.out.println(resultado4);
        
        
        if(sim.equals("+")) {
        	System.out.println(resultado1);
        }
        if(sim.equals("-")) {
        	System.out.println(resultado2);
        }
        if(sim.equals("*")) {
        	System.out.println(resultado3);
        }
        if(sim.equals("/")) {
        	System.out.println(resultado4);
        }
        
       
    }
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        
        System.out.print(" NUM1 ");
        double num1 = sc.nextDouble();
        
        System.out.print(" +,-,*,/ ");
        String sim = sc.nextLine();
        sc.nextLine();
        
        System.out.print(" NUM2 ");
        double num2 = sc.nextDouble();
        
        double resultado1 = num1 + num2;
        System.out.println(resultado1);
        
        double resultado2 = num1 - num2;
        System.out.println(resultado2);
        
        double resultado3 = num1 * num2;
        System.out.println(resultado3);
        
        double resultado4 = num1 / num2;
        System.out.println(resultado4);
        
        
        if(sim.equals("+")) {
        	System.out.println(resultado1);
        }
        if(sim.equals("-")) {
        	System.out.println(resultado2);
        }
        if(sim.equals("*")) {
        	System.out.println(resultado3);
        }
        if(sim.equals("/")) {
        	System.out.println(resultado4);
        }
        
       
    }
}