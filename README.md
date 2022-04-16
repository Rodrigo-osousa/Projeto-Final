## Título e Imagem de Capa
<p align="center">

# Projeto Final /BootCamp Wipro (Sprint 1)
</p>

## Índice 

* [Título e Imagem de capa](#Título-e-Imagem-de-capa)
* [Índice](#índice)
* [Descrição do Projeto](#descrição-do-projeto)
* [Status do Projeto](#status-do-Projeto)
* [Funcionalidades e Demonstração da Aplicação](#funcionalidades-e-demonstração-da-aplicação)
* [Tecnologias utilizadas](#tecnologias-utilizadas)
* [Pessoas Desenvolvedoras do Projeto](#pessoas-desenvolvedoras)
* [Conclusão](#conclusão)

## Descrição do Projeto
<p> Projeto proposto para aplicar ensinamentos de Programação Orientada a Objetos, onde aplicamos o básico na criação de um banco digital com manipulação via console da IDEA.
</p>

<p>A atividade foi realizada em grupo e versionado com a ferramenta GitHub Desktop:</p>


{{{{{{{{{{{{{Imagem aqui}}}}}}}}}}}}}


<p>A organização e o planejamento foram feitos com auxílio da farramentas  Trello e Google Diagrams:</p>

{{{{{{{{{{{{{{{{Imagem aqui}}}}}}}}}}}}}}}}


## Status do projeto
<p>
<img height="26
" width="200" src="https://img.shields.io/badge/STATUS-FINALIZADO-blue"/>
</p>

## Funcionalidades e Demonstração da Aplicação

<p> A aplicação salva as informações na memória sendo assim já possuímos dois clientes e duas contas cadastradas afim de facilitar a demonstração de seu funcionamento.</p>

### Composição de um Cliente:

<p>Um cliente é composto de Endereço e Tipo sendo que o tipo do cliente determina quais informações iremos atribuir. Assim quando determinamos que ele é uma pessoa individual, ele recebe CPF e Nome como atributo. No caso de pessoa jurídica ele recebe CNPJ e Nome da Companhia.</p>

<p>Abaixo temos exemplos de como atribuímos os clientes:</p>

**Cliente Individual:**

```
Individual individual = new Individual();
    individual.setIdCustomerIndiv(1);
    individual.setCustomerName("Test");
    individual.setCpf("999999999");
    individual.setCostumerType(CustomerType.INDIVIDUAL);

```

**Cliente Jurídico:**

```
LegalEntity legal = new LegalEntity();
    legal.setIdLegalEntity(1);
    legal.setCnpj("11111111/0001-00");
    legal.setCompanyName("Wipro Bank");
    legal.setCostumerType(CustomerType.LEGAL_ENTITY);

```

### Composição de uma Conta:

<p>Para a criação de uma conta, podemos escolher se a conta é corrente ou especial, onde a única diferença é que na conta especial possuímos um método que permite sacar mesmo sem ter saldo, porém temos nos atentar ao limite definido:</p>

**Conta Corrente:**

```
CurrentAccount currentAccount = new CurrentAccount();
    currentAccount.setIdCurrentAccout(1);
    currentAccount.setCustomer(individual);
    currentAccount.setAccountNumber("9999");
    currentAccount.setAccountType(AccountType.CURRENT_ACCOUNT);
    currentAccount.setBalance(1000.000);
    currentAccount.setCreditCard(creditCard);

```

**Conta Especial**

```
SpecialAccount specialAccount = new SpecialAccount();
    specialAccount.setIdSpecialAccount(1);
    specialAccount.setLimitAmount(1000.00);
    specialAccount.setAccountType(AccountType.ESPECIAL_ACCOUNT);
    specialAccount.setBalance(10.00);
    specialAccount.setCustomer(legal);
    specialAccount.setAccountNumber("1111");
    specialAccount.setCreditCard(creditCard2);

```



Ao iniciarmos a aplicação nos é solicitado um conta antes de apresentar o menu devido a função adicional da conta especial: </p>

{{{{{{{{{imagem aqui}}}}}}}}}



<p>A aplicação permite realizar diversas funções e apenas será finalizada se escolher a opção 0 (Encerrar).</p>
  



## Tecnologias utilizadas

<img align="center" alt="Rodrigo-Java" height="38" width="47" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg"> - Java 11;

<img align="center" alt="Rodrigo-Trello" height="26" width="35" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/trello/trello-plain.svg"> - Trello;


 
## Pessoas Desenvolvedoras do Projeto
| [<img src="https://avatars.githubusercontent.com/u/57736435?v=4" width=115><br><sub>Guilherme Felix</sub>](https://github.com/felixdasilva050/) | [<img src="https://avatars.githubusercontent.com/u/62018091?v=4" width=115><br><sub>Thiago Ferreira Sousa</sub>](https://github.com/ThiagoFerreiraSousa/) |  [<img src="https://avatars.githubusercontent.com/u/79177544?s=96&v=4" width=115><br><sub>Rodrigo Oliveira Sousa</sub>](https://www.linkedin.com/in/rodrigo-oliveira-sousa/) | [<img src="https://avatars.githubusercontent.com/u/13386106?v=4" width=115><br><sub>Gustavo Santos</sub>](https://github.com/gsantoss/) 
| :---: | :---: | :---: | :---: |
 
 
## Conclusão
 
<p>Esta aplicação foi desenvolvida em equipe onde cada desenvolvedor contribuiu com suas ideias e conhecimentos. Desta forma compartilhamos experiências ao mesmo tempo em que esta aplicação foi tomando forma.</p> 
  
<p>Cada implementação ou mudança no código foi realizada mediante a aprovação de todos os membros, assim quando um não entendia algum ponto o assunto era debatido até não existir dúvida.</p>
