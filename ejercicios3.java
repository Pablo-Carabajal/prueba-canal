import java.util.Scanner;

public class ejercicios3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tabla1[] = new int[10];
        int tabla2[] = new int[10];
        int tabla3[] = new int[20];

        for (int i = 0; i < 10; i++) {
            System.out.println("digite un numero para la tabla1:");
            tabla1[i] = sc.nextInt();
            
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("digite un numero para la tabla2:");
            tabla2[i] = sc.nextInt();
            
        }
        int j=0;
         for (int i = 0; i < 10; i++) {
                tabla3[j] = tabla1[i];
                j++;
                tabla3[j]= tabla2[i];
                j++;
            }

        /*int j = 0;
        for (int i = 0; i < 20; i++) {
            tabla3[i] = tabla1[j];
            for (j = 1; j < 10; j++) {
                tabla3[i] = tabla2[j];
                j++;

            }

        }*/
        for (int i = 0; i < 20; i++) {
            System.out.print(tabla3[i]+" ");
        }

    }
}
