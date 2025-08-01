// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Abstração, Encapsulamento, Herança e Polimorfismo
        OperacoesDaMaquina maquina1 = new MaquinaBanho();
        maquina1.abastecerTudoCompleto();

        maquina1.colocarPet();
        maquina1.darBanho();
        maquina1.retirarPet();

        maquina1.verificarPetNaMaquina();
        maquina1.limparMaquina();



    }
}