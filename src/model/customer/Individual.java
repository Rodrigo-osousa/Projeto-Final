package model.customer;

public class Individual extends Customer{
    private Integer idCustomerIndiv;
    private String cpf;
    private String customerName;

    public Integer getIdCustomerIndiv() {
        return idCustomerIndiv;
    }

    public void setIdCustomerIndiv(Integer idCustomerIndiv) {
        this.idCustomerIndiv = idCustomerIndiv;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
