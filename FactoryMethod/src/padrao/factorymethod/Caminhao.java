package padrao.factorymethod;

public class Caminhao implements ITransporte{

    public String entrar() {
        return "Caminhao entrou";
    }

    public String sair() {
        return "Caminhao saiu";
    }
}
