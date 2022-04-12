package model.account;

import model.creditCard.CreditCard;
import model.customer.Customer;
import model.enumeration.AccountType;

public class CurrentAccount extends Account{
    private Integer idCurrentAccout;

    public CurrentAccount() {
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

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }



}
