package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    public void retornaBonusZeroParaSalarioMuitoAlto() throws IllegalAccessException {
        BonusService service = new BonusService();
        //assertThrows(IllegalAccessException.class,
                //() -> service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal(20000))));

        try{
            service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal(20000)));
            fail("Não deu a exception!");
        } catch (Exception e) {
            assertEquals("Funcionário com salário maior do que R$10000 não pode receber bônus", e.getMessage());
        }
    }

    @Test
    public void retornaBonus100ParaSalario() throws IllegalAccessException {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal(1000)));
        assertEquals(new BigDecimal("100.0"), bonus);
    }

    @Test
    public void limiteBonus() throws IllegalAccessException {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal(10000)));
        assertEquals(new BigDecimal("1000.0"), bonus);
    }
}