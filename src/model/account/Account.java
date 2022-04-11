package model.account;

import model.creditCard.CreditCard;
import model.customer.Individual;
import model.customer.LegalEntity;
import model.enumeration.AccountType;

public abstract class Account {
    public String accountNumber;
    public Double balance = 0.00;
    public CreditCard creditCard;
    public AccountType accountType;
    public Individual individual;
    public LegalEntity legalEntity;


    public String getAccountNumber() {
        return accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public Individual getIndividual() {
        return individual;
    }

    public LegalEntity getLegalEntity() {
        return legalEntity;
    }


    //Método utilizado para trânsferir
    public Boolean transferMoney(Account destinationAccount, double money) {
        if(this.getBalance() >= money){
          this.balance = this.balance - money;
          destinationAccount.balance = destinationAccount.balance + money;
          return true;
        }else{
            System.out.println("Saldo insuficiente!");
                return false;
        }
    }

    //Método utilizado para consultar saldo
    public Double checkBalance(String accountNumber) {
        if(accountNumber.isEmpty()){
            System.out.println("Conta não existe!");
        } else
            System.out.println("Seu saldo é de US$ " );
            return balance;
    }

    //Método utilizado para sacar dinheiro
    public Boolean withdrawCash(String accountNumber) {

        return true;
    }

    //Método utilizado para depositar dinheiro
    public void cashDeposit(String accountNumber) {

    }

    //Método utilizado para consultar dados da conta
    public void obtainAccountData(String accountNumber) {

    }

}
