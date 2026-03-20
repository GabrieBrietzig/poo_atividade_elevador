public class Elevador {

    private int andarAtual;
    private int limiteInferior;
    private int limiteSuperior;
    private boolean portaAberta;

    public Elevador(int limiteInferior, int limiteSuperior) {
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
        this.andarAtual = limiteInferior;
        this.portaAberta = false;
    }

    public void subir() {
        if (portaAberta) {
            System.out.println("Feche a porta para subir!");
            return;
        }

        if (andarAtual == limiteSuperior) {
            System.out.println("Já está no último andar (" + limiteSuperior + ")");
            return;
        }

        andarAtual++;
        System.out.println("Subiu para o andar: " + andarAtual);
    }

    public void descer() {
        if (portaAberta) {
            System.out.println("Feche a porta para descer!");
            return;
        }

        if (andarAtual == limiteInferior) {
            System.out.println("Já está no térreo (" + limiteInferior + ")");
            return;
        }

        andarAtual--;
        System.out.println("Desceu para o andar: " + andarAtual);
    }

    public void abrirPorta() {
        if (!portaAberta) {
            portaAberta = true;
            System.out.println("Porta aberta");
        } else {
            System.out.println("A porta já está aberta");
        }
    }

    public void fecharPorta() {
        if (portaAberta) {
            portaAberta = false;
            System.out.println("Porta fechada");
        } else {
            System.out.println("A porta já está fechada");
        }
    }

    public boolean portaEstaAberta() {
        return portaAberta;
    }

    public void exibirAndar() {
        System.out.println("Andar atual: " + andarAtual);
    }
}
