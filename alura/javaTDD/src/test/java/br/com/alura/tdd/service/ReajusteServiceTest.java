package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;


public class ReajusteServiceTest {

    private ReajusteService service;
    private Funcionario funcionario;

    @BeforeEach
    public void setUp(){
        this.service = new ReajusteService();
        this.funcionario = new Funcionario("Lucas", LocalDate.now(), new BigDecimal("1000"));
    }
    @Test
    public void deveRetornarReajustede3PorCentoNoSalarioPorDesempenhoADesesar(){
        service.reajusteSalarial(funcionario, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    public void deveRetornarReajustede15PorCentoNoSalarioPorDesempenhoBom(){
        service.reajusteSalarial(funcionario, Desempenho.BOM);
        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    public void deveRetornarReajustede20PorCentoNoSalarioPorDesempenhoOtimo(){
        service.reajusteSalarial(funcionario, Desempenho.OTIMO);
        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }
}
