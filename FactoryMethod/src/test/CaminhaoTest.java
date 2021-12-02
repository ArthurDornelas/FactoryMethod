package test;
import org.junit.jupiter.api.Test;
import padrao.factorymethod.ITransporte;
import padrao.factorymethod.TransporteFactory;

import static org.junit.jupiter.api.Assertions.*;

public class CaminhaoTest {
    @Test
    void deveEntrarCaminhao() {
        ITransporte transporte = TransporteFactory.obterTransporte("Caminhao");
        assertEquals("Caminhao entrou", transporte.entrar());
    }

    @Test
    void deveSairCaminhao() {
        ITransporte transporte = TransporteFactory.obterTransporte("Caminhao");
        assertEquals("Caminhao saiu", transporte.sair());
    }
}
