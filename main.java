public class main {
    public static void main(String[] args) {

        Elevador elevador = new Elevador(0, 5);

        System.out.println("=== Teste Elevador ===\n");

        elevador.exibirAndar();

        elevador.abrirPorta();
        elevador.subir();

        elevador.fecharPorta();
        elevador.subir();
        elevador.subir();
        elevador.subir();

        elevador.exibirAndar();

        elevador.descer();

        if (elevador.portaEstaAberta()) {
            System.out.println("Porta aberta");
        } else {
            System.out.println("Porta fechada");
        }

        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.subir();

        elevador.descer();
        elevador.descer();
        elevador.descer();
        elevador.descer();
        elevador.descer();
        elevador.descer();
    }
}
