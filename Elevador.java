import java.util.Scanner;

public class Elevador {
    int AndarAtual;
    int TotalAndares;
    int AndarDesejado;
    boolean portaAberta;

    Scanner scanner = new Scanner(System.in);

    public void abrirPorta() {
        if (!portaAberta) {
            portaAberta = true;
            System.out.println("Você abriu a porta ");
        } else {
            System.out.println("A porta já está aberta ");
        }
    }

    public void fecharPorta() {
        if (portaAberta) {
            portaAberta = false;
            System.out.println("Você fechou a porta ");
        } else {
            System.out.println("A porta já está fechada ");
        }
    }

    public void informarEstadoPorta() {
        if (portaAberta) {
            System.out.println("A porta está aberta ");
        } else {
            System.out.println("A porta está fecada ");
        }
    }

    public void pegarAndar() {
        if (portaAberta) {
            System.out.println("Feche a porta antes de se mover ");
            return;
        }

        System.out.println("Qual andar deseja ir?");
        AndarDesejado = scanner.nextInt();

        if (AndarDesejado >= 0 && AndarDesejado <= TotalAndares) {
            if (AndarDesejado > AndarAtual) {
                System.out.println("Subindo...");
            } else if (AndarDesejado < AndarAtual) {
                System.out.println("Desccendo...");
            } else {
                System.out.println("Já está nesse andar!");
            }
            AndarAtual = AndarDesejado;
            System.out.println("Você está no " + AndarAtual + "º andar.");
        } else {
            System.out.println("Esse andar não existe. Esccolha outro.{}");
        }
    }

    public void opcoes() {
        while (true) {
            System.out.println("\nEscolha uma ação: ");
            System.out.println("1 - Ir para um andar ");
            System.out.println("2 - Abrir porta ");
            System.out.println("3 - Fechar a porta ");
            System.out.println("4 - Ver estado da porta ");
            System.out.println("5 - Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    pegarAndar();
                    break;
                case 2:
                    abrirPorta();
                    break;
                case 3:
                    fecharPorta();
                    break;
                case 4:
                    informarEstadoPorta();
                    break;
                case 5:
                    System.out.println("Voce saiu");
                    return;
                default:
                    System.out.println("Opçção invalida");
            }
        }
    }


}