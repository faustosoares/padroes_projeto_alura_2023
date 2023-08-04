package br.com.alura.loja;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {
    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento(new BigDecimal("200"),6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"),1);

        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();

        System.out.println(calculadoraDeDescontos.calcular(orcamento1));
        System.out.println(calculadoraDeDescontos.calcular(orcamento2));
    }
}
