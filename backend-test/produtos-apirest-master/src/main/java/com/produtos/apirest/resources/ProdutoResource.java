package com.produtos.apirest.resources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.produtos.apirest.models.Produto;
import com.produtos.apirest.models.Retorno;
import com.produtos.apirest.service.ProdutoService;


//@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
public class ProdutoResource {
	
  @Autowired
  private ProdutoService produtoService;

	
	@PostMapping(value="/produtos")
	public Retorno retorno(@RequestBody @Valid Produto produto){
		return produtoService.findJuros(produto);
	}
	
	 

}
