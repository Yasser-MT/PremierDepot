import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner A=new Scanner(System.in);
        calculatrice calc=new calculatrice();
        System.out.println("donner le premier nombre");
        Double nombre1=A.nextDouble();
        System.out.println("donner l'operation");
        char op=A.next().charAt(0);
        System.out.println("donner le deuxieme nombre");
        Double nombre2=A.nextDouble();
        double result=0;
        switch (op) {
            case '-':
                result=calc.soustraction(nombre1, nombre2);
                break;
            case '+':
                result=calc.addition(nombre1, nombre2);
                break;
            case '*':
                result=calc.multiplication(nombre1, nombre2);
                break;
            case '/':
                result=calc.division(nombre1, nombre2);
                break;
            default:
                System.out.println("erreur");
                break;
        }
        System.out.println("calcule..."+nombre1+" "+op+" "+nombre2+"="+result);
    }
    
}
