package desafioelite.model;

import java.util.Date;

public class Empresa {
    String codigo;
    String cnpj;
    String razaoSocial;
    String inscricaoMunicipal;
    Date dataInclusao;
    int status; // 2 = inativo, 1 = ativo
    Pessoa responsavelLegal;
    String email;
    String telefoneContato;


    public String getCodigo() {
            return codigo;
    }
    public void setCodigo(String codigo) {
            this.codigo = codigo;
    }
    public String getCnpj() {
            return cnpj;
    }
    public void setCnpj(String cnpj) {
            this.cnpj = cnpj;
    }
    public String getRazaoSocial() {
            return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
            this.razaoSocial = razaoSocial;
    }
    public String getInscricaoMunicipal() {
            return inscricaoMunicipal;
    }
    public void setInscricaoMunicipal(String inscricaoMunicipal) {
            this.inscricaoMunicipal = inscricaoMunicipal;
    }
    public Date getDataInclusao() {
            return dataInclusao;
    }
    public void setDataInclusao(Date dataInclusao) {
            this.dataInclusao = dataInclusao;
    }
    public int getStatus() {
            return status;
    }
    public void setStatus(int status) {
            this.status = status;
    }
    public Pessoa getResponsavelLegal() {
            return responsavelLegal;
    }
    public void setResponsavelLegal(Pessoa responsavelLegal) {
            this.responsavelLegal = responsavelLegal;
    }
    public String getEmail() {
            return email;
    }
    public void setEmail(String email) {
            this.email = email;
    }
    public String getTelefoneContato() {
            return telefoneContato;
    }
    public void setTelefoneContato(String telefoneContato) {
            this.telefoneContato = telefoneContato;
    }

    public Empresa(){
        super();
    }
    public Empresa(String codigo, String cnpj, String razaoSocial, String inscricaoMunicipal, Date dataInclusao,
                    int status, Pessoa responsavelLegal, String email, String telefoneContato) {
            super();
            this.codigo = codigo;
            this.cnpj = cnpj;
            this.razaoSocial = razaoSocial;
            this.inscricaoMunicipal = inscricaoMunicipal;
            this.dataInclusao = dataInclusao;
            this.status = status;
            this.responsavelLegal = responsavelLegal;
            this.email = email;
            this.telefoneContato = telefoneContato;
    }
}
