import entities.Champion;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os status do primeiro campeao:");
        System.out.print("Nome: ");
        String campeao1Nome = sc.nextLine();
        System.out.print("Vida Inicial: ");
        Integer campeao1VidaInicial = sc.nextInt();
        System.out.print("Ataque: ");
        Integer campeao1Ataque = sc.nextInt();
        System.out.print("Armadura: ");
        Integer campeao1Armadura = sc.nextInt();
        Champion campeao1 = new Champion(campeao1Nome, campeao1VidaInicial, campeao1Ataque, campeao1Armadura);

        System.out.println("Digite os status do segundo campeao:");
        System.out.print("Nome: ");
        sc.nextLine();
        String campeao2Nome = sc.nextLine();
        System.out.print("Vida Inicial: ");
        Integer campeao2VidaInicial = sc.nextInt();
        sc.nextLine();
        System.out.print("Ataque: ");
        Integer campeao2Ataque = sc.nextInt();
        sc.nextLine();
        System.out.print("Armadura: ");
        Integer campeao2Armadura = sc.nextInt();
        sc.nextLine();
        Champion campeao2 = new Champion(campeao2Nome, campeao2VidaInicial, campeao2Ataque, campeao2Armadura);

        System.out.print("Quantos turnos deseja executar? ");
        int turnos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < turnos; i++) {
            System.out.println("Resultado do turno " + (i + 1) + ":");
            campeao1.takeDamage(campeao2);
            campeao2.takeDamage(campeao1);

            System.out.println(campeao1.status());
            System.out.println(campeao2.status());

            if (campeao1.getLife() <= 0 || campeao2.getLife() <= 0) {
                break;
            }
        }

        System.out.println("FIM DO COMBATE");

        sc.close();
    }
}
