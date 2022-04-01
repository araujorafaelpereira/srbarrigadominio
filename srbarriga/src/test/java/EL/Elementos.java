package EL;

import org.openqa.selenium.By;

public class Elementos {
    
private	By novousuario = By.linkText("Novo usuário?");
private By nome = By.id("nome");
private By email = By.id("email");
private By senha = By.id("senha");
private By bttnCad = By.cssSelector(".btn");
public By getNovousuario() {
	return novousuario;
}
public void setNovousuario(By novousuario) {
	this.novousuario = novousuario;
}
public By getNome() {
	return nome;
}
public void setNome(By nome) {
	this.nome = nome;
}
public By getEmail() {
	return email;
}
public void setEmail(By email) {
	this.email = email;
}
public By getSenha() {
	return senha;
}
public void setSenha(By senha) {
	this.senha = senha;
}
public By getBttnCad() {
	return bttnCad;
}
public void setBttnCad(By bttnCad) {
	this.bttnCad = bttnCad;
}
	
	
	
}
