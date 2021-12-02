package test;

import org.junit.jupiter.api.Test;
import padrao.factorymethod.ITransporte;
import padrao.factorymethod.TransporteFactory;

import static org.junit.jupiter.api.Assertions.*;

public class TransporteFactoryTest {

    @Test
    void deveRetornarExcecaoParaTransporteInexistente() {
        try {
            ITransporte transporte = TransporteFactory.obterTransporte("Onibus");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Transporte inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaTransporteInvalido() {
        try {
            ITransporte transporte = TransporteFactory.obterTransporte("Carro");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Transporte inválido", e.getMessage());
        }
    }
}
