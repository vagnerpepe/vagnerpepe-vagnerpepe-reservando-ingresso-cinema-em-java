import java.util.Scanner;

public class Cinema {
    
    public static void main(String[] args) {
        
        Scanner vetor = new Scanner(System.in);

        String [][] cinema = new String [10][10];
        String opcao;
        int fila, poltrona;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                cinema[i][j] = "0";

            }
        }

        do {
            System.out.println("1 - Reservar");
            System.out.println("2 - Layout do Cinema");
            System.out.println("3 - Sair");
            opcao = vetor.next();

            switch (opcao) {
                case "1":
                    System.out.println("Fila: ");
                    fila = vetor.nextInt();
                    System.out.println("Poltrona: ");
                    poltrona = vetor.nextInt();

                    if (cinema[fila][poltrona].equals("0")) {
                        cinema[fila][poltrona] = "X";
                    } else {
                        System.out.println("Poltrona já ocupada.");
                    }
                    break;

                case "2":
                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < 10; j++) {
                            System.out.print(" " + cinema[i][j] + " ");
                        }
                        System.out.println("");
                    }
                    break;
                case "3":
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (!opcao.equals("3"));
    }
}
