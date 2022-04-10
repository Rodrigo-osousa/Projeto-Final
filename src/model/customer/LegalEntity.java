package model.customer;

public class LegalEntity {
    private Integer idLegalEntity;
    private String cnpj;
    private String companyName;

    public Integer getIdLegalEntity() {
        return idLegalEntity;
    }

    public void setIdLegalEntity(Integer idLegalEntity) {
        this.idLegalEntity = idLegalEntity;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
