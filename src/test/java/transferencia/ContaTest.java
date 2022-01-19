package transferencia;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    Cliente xuxa;
    Cliente silvioSantos;
    Conta contaXuxa;
    Conta contaSilvioSantos;

    @BeforeEach
    void setUp() {
        xuxa = new Cliente("Jonathas Santos", "73387049021", "98686708");
        silvioSantos = new Cliente("Miriely Santos", "78864797009", "98876678");

        contaXuxa = new Conta("0087", "6655", 2500.00, Xuxa);
        contaMiriely = new Conta("0088", "6363", 3500.00, mirielySantos);
    }

    @Test
    public void realizarTransacao(){
       contaJonathas.realizarTransferencia(1000.00, contaMiriely);

        assertEquals(1500.00, contaXuxa.getSaldo());
        assertEquals(4500.00, contaMiriely.getSaldo());
    }

    @Test
    public void validarTransferenciaInvalida(){
        boolean resultado = contaXuxa.realizarTransferencia(3500.00, contaMiriely);

        assertFalse(resultado);
    }

    @Test
    public void validarProprietario(){
        assertEquals(xuxa, contaXuxa.getProprietario());
    }

}