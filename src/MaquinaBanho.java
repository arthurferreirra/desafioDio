public class MaquinaBanho extends Maquina implements OperacoesDaMaquina {
    private boolean petNaMaquina;
    private boolean petLimpo;

    public MaquinaBanho(){
        super(30,10);
        this.petNaMaquina = false;
        this.petLimpo = false;
    }

    @Override
    public void colocarPet(){
        if (petNaMaquina) {
            System.out.println("Já há um pet na máquina.");
        } else if (maquinaSuja) {
            System.out.println("A máquina está suja. Limpe-a antes de colocar outro pet.");
        } else {
            petNaMaquina = true;
            petLimpo = false;
            System.out.println("Pet colocado na máquina.");
        }
    }

    @Override
    public void retirarPet() {
        if(!petNaMaquina){
            System.out.println("Não há pet na máquina");
        }else{
            petNaMaquina = false;
            if(!petLimpo){
                maquinaSuja = true;
                System.out.println("Pet retirado sujo, maquina está seuja");
            }else {
                System.out.println("pet retirado limpo");
            }
        }
    }

    @Override
    public void darBanho() {
        if (!petNaMaquina) {
            System.out.println("Não há pet na máquina para dar banho.");
        } else if (nivelAgua < 10 || nivelShampoo < 2) {
            System.out.println("Recursos insuficientes para o banho.");
        } else {
            nivelAgua -= 10;
            nivelShampoo -= 2;
            petLimpo = true;
            System.out.println("Banho realizado com sucesso!");
        }
    }

    @Override
    public void limparMaquina() {
        if (!maquinaSuja) {
            System.out.println("A máquina já está limpa.");
        } else if (nivelAgua < 3 || nivelShampoo < 1) {
            System.out.println("Recursos insuficientes para limpeza.");
        } else {
            nivelAgua -= 3;
            nivelShampoo -= 1;
            maquinaSuja = false;
            System.out.println("Máquina limpa com sucesso.");
        }
    }

    @Override
    public void verificarPetNaMaquina() {
        System.out.println(petNaMaquina ? "Há um pet na máquina." : "A máquina está vazia.");
    }

    @Override
    public void abastecerTudoCompleto() {
        nivelAgua = 20;
        nivelShampoo = 10;
        System.out.println("Maquina abastecida com "+nivelAgua+"L de agua, e "+nivelShampoo+"L de shampoo");
    }


}
