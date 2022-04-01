package sts;

import EL.Elementos;
import MTD.Metodos;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;

public class Steps {
	Metodos metodos = new Metodos();
	Elementos elementos = new Elementos();
	
	@Dado("que entro no site {string}")
	public void que_entro_no_site(String appUrl) {
	    metodos.abrirNavegador(appUrl);
	}

	@Quando("quando clico em Novo usuário?")
	public void quando_clico_em_novo_usuário() {
	    metodos.clicar(elementos.getNovousuario());
	}

	@Entao("realizo meu cadastro preenchendo os campos necessarios.")
	public void realizo_meu_cadastro_preenchendo_os_campos_necessarios() {
		
		metodos.inseriDados(elementos.getNome(), "ggggggggg");
		metodos.inseriDados(elementos.getEmail(), "rafauiooool@gmail.com");
	   metodos.inseriDados(elementos.getSenha(), "123456789");
	   metodos.clicar(elementos.getBttnCad());
	   metodos.fecharNavegador();
	}

	
	@Quando("deixo os campos em branco")
	public void deixo_os_campos_em_branco() {
	    
	}

	@Entao("tento me cadastrar")
	public void tento_me_cadastrar() {
		 metodos.clicar(elementos.getNovousuario());
		 metodos.clicar(elementos.getBttnCad());
		 
	}

	@Entao("aparecem mensagem de erro")
	public void aparecem_mensagem_de_erro() {
		
	   
	}
}