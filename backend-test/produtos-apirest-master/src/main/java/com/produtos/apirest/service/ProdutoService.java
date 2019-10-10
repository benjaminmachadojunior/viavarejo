package com.produtos.apirest.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.produtos.apirest.models.Produto;
import com.produtos.apirest.models.Retorno;

@Service
public class ProdutoService {

	public Retorno findJuros(Produto listaProdutos) {
		
		Retorno retorno = new Retorno();
		BigDecimal big = new BigDecimal(0.020872);
		
		retorno.setNumeroParcela(listaProdutos.getQtdeParcelas());
		retorno.setValor(listaProdutos.getValor());
		retorno.setTaxaJurosAoMes(big);
		
		return retorno;
	}

}
