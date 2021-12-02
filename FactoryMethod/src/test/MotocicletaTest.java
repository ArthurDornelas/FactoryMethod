package test;
import org.junit.jupiter.api.Test;
import padrao.factorymethod.ITransporte;
import padrao.factorymethod.TransporteFactory;

import static org.junit.jupiter.api.Assertions.*;

public class MotocicletaTest {
    @Test
    void deveEntrarMotocicleta() {
        ITransporte transporte = TransporteFactory.obterTransporte("Motocicleta");
        assertEquals("Motocicleta entrou", transporte.entrar());
    }

    @Test
    void deveSairMotocicleta() {
        ITransporte transporte = TransporteFactory.obterTransporte("Motocicleta");
        assertEquals("Motocicleta saiu", transporte.sair());
    }
}