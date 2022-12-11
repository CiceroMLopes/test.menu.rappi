@descontos
Feature: Validar descontos atraves do atalho do menu
Como usuario 
Quero acessar atalhos da plataforma 
Para validar produtos com desconto disponiveis

  	Scenario: Acessar descontos a partir da barra de menu.
   Given que eu acesso o site da Rappi
    When clico no icone do menu representado por tres riscos na horizontal
    And clico no botao Conheca nossos descontos
    Then valido a pagina de promocoes