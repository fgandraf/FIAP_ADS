import java.util.Scanner;

public class Programa {

    /*
    public static void main(String[] args) {
        int i, j;

        System.out.print("\033\143"); //Clear console

        for (i = 1; i <= 2; i++) {
            j = 0;
            do {
                j++;
            } while (j <= 2);
            System.out.print("X ");
        }
    }
    */

	public static void main(String[] args)
	{
        try (Scanner entrada = new Scanner(System.in)) 
        {
            int ini, f, cont;

            System.out.print("\033\143"); //Clear console

            System.out.println("----------MÉTODO  FOR----------");
            System.out.println("Digite 2 números: ");
            ini = entrada.nextInt();
            f = entrada.nextInt();

            for (cont = ini; cont <= f; cont++)
                System.out.print(cont + " ");

            System.out.println();
            System.out.println("----------MÉTODO  WHILE----------");
            System.out.println("Digite 2 números: ");
            ini = entrada.nextInt();
            f = entrada.nextInt();
            while (ini <= f) {
                System.out.print(ini + " ");
                ini++;
            }

            System.out.println();
            System.out.println("----------MÉTODO  DO  WHILE----------");
            System.out.println("Digite 2 números: ");
            ini = entrada.nextInt();
            f = entrada.nextInt();
            do {
                System.out.print(ini + " ");
                ini++;
            } while (ini <= f);
        }
        
        System.out.println();
		System.out.println("----------FIM----------");
	}


}