package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.situacao.EmAnalise;
import br.com.alura.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento {

    private BigDecimal valor;
    private int quantidadeItens;

    private SituacaoOrcamento situacao;

    public Orcamento(BigDecimal valor) {
        this.valor = valor;
    }

    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.situacao = new EmAnalise();
    }
    
    public void aplicarDescontoExtra() {
    	BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDescontroExtra(this);
    	this.valor = this.valor.subtract(valorDoDescontoExtra);
    }

    public void aprovar() {
    	this.situacao.aprovar(this);
    }
    
    public void reprovar() {
    	this.situacao.reprovar(this);
    }
    
    public void finalizar() {
    	this.situacao.finalizar(this);
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public BigDecimal getValor() {
        return valor;
    }

	public SituacaoOrcamento getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}
    
    
}
