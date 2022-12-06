public class PessoaJuridica extends Conta {
    
    private String cnpj;
    private String razaoSocial;
    
    public PessoaJuridica(Pessoa client, String cnpj, String razaoSocial) {
        super(client);
        setCliente(client);

        setCnpj(cnpj);
        setRazaoSocial(razaoSocial);
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String output() {
        String out = "----------------";
        out += "\nNome: " + cliente.getNome();
        out += "\nCNPJ: " + this.getCnpj();
        out += "\nRazão Social: " + this.getRazaoSocial();
        out += "\n----------------";
        return out;
    }

    @Override
    public String toString() {
        return output();
    }
}