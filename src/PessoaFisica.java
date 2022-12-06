public class PessoaFisica extends Conta {
    
    private String cpf;
    
    public PessoaFisica(Pessoa client, String cpf) {
        super(client);
        setCliente(client);

        setCpf(cpf);
    }

	public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String output() {
        String out = "----------------";
        out += "\nNome: " + cliente.getNome();
        out += "\nSobrenome: " + cliente.getSobrenome();
        out += "\nCPF: " + this.getCpf();
        out += "\n----------------";
        return out;
    }

    @Override
    public String toString() {
        return output();
    }
}