package model.account;

import model.creditCard.CreditCard;
import model.customer.Individual;
import model.customer.LegalEntity;
import model.enumeration.AccountType;

public class CurrentAccount extends Account{
    private Integer idCurrentAccout;

    public CurrentAccount() {
    }

    public CurrentAccount(Integer idCurrentAccout,String accountNumber, Double balance, CreditCard creditCard, AccountType accountType, Individual individual, LegalEntity legalEntity) {
        this.idCurrentAccout = idCurrentAccout;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.creditCard = creditCard;
        this.accountType = accountType;
        this.individual = individual;
        this.legalEntity = legalEntity;
    }

    public Integer getIdCurrentAccout() {

        return idCurrentAccout;
    }

    public void setIdCurrentAccout(Integer idCurrentAccout) {

        this.idCurrentAccout = idCurrentAccout;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public void setIndividual(Individual individual) {
        this.individual = individual;
    }

    public void setLegalEntity(LegalEntity legalEntity) {
        this.legalEntity = legalEntity;
    }

}
