public abstract class Maquina {
    protected int capacidadeMaxAgua;
    protected int capacidadeMaxShampoo;

    protected int nivelAgua;
    protected int nivelShampoo;
    protected  boolean maquinaSuja;

    public Maquina(int capacidadeMaxAgua, int capacidadeMaxShampoo){
        this.capacidadeMaxAgua = capacidadeMaxAgua;
        this.capacidadeMaxShampoo = capacidadeMaxShampoo;
        this.nivelAgua = 0;
        this.nivelShampoo = 0;
        this.maquinaSuja = false;
    }

    public void abastecerAgua(){
        if(nivelAgua + 2 <= capacidadeMaxAgua){
            nivelAgua += 2;
            System.out.println("Abastecido 2L de água. Nível atual: " + nivelAgua + "L");
        }else {
            System.out.println("Capacidade máxima de água atingida.");
        }
    }

    public void abastecerShampoo(){
        if (nivelShampoo + 2 <= capacidadeMaxShampoo) {
            nivelShampoo += 2;
            System.out.println("Abastecido 2L de shampoo. Nível atual: " + nivelShampoo + "L");
        } else {
            System.out.println("Capacidade máxima de shampoo atingida.");
        }
    }

    public void verificarNivelAgua() {
        System.out.println("Nível atual de água: " + nivelAgua + "L");
    }

    public void verificarNivelShampoo() {
        System.out.println("Nível atual de shampoo: " + nivelShampoo + "L");
    }

    public abstract void limparMaquina();

}
