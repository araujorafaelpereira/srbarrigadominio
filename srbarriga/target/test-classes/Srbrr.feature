#language:pt  
#Author: Rafael Araujo


Funcionalidade: Novo usuario?
  Eu como usuario acesso o site e tento me cadastra pelo link novo usuario

 
  Cenario: Tela de cadastro
    Dado que entro no site "https://srbarriga.herokuapp.com/login"
    Quando quando clico em Novo usuário?
    Entao realizo meu cadastro preenchendo os campos necessarios.
    
   Cenario: Tela de cadastro dados me branco
   Dado que entro no site "https://srbarriga.herokuapp.com/login"
   Quando deixo os campos em branco
   Entao tento me cadastrar
   Mas aparecem mensagem de erro
    
    

