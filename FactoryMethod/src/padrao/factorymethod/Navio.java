package padrao.factorymethod;

public class Navio implements ITransporte{

    public String entrar() {
        return "Navio entrou";
    }

    public String sair() {
        return "Navio saiu";
    }
}
