package test;
import org.junit.jupiter.api.Test;
import padrao.factorymethod.ITransporte;
import padrao.factorymethod.TransporteFactory;

import static org.junit.jupiter.api.Assertions.*;

public class NavioTest {
    @Test
    void deveEntrarNavio() {
        ITransporte transporte = TransporteFactory.obterTransporte("Navio");
        assertEquals("Navio entrou", transporte.entrar());
    }

    @Test
    void deveSairNavio() {
        ITransporte transporte = TransporteFactory.obterTransporte("Navio");
        assertEquals("Navio saiu", transporte.sair());
    }
}
