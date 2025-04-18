package aula05;

import java.util.Objects;

public class ContaBanco {
    public Integer numConta;
    protected String tipo;
    private String dono;
    private Double saldo;
    private Boolean status;

    public ContaBanco() {
    }

    public ContaBanco(Integer numConta, String dono) {
        this.numConta = numConta;
        this.dono = dono;
        this.status = false;
        this.saldo = 0.0;
    }

    public Integer getNumConta() {
        return numConta;
    }

    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void abrirConta(String tipo) {
        this.tipo = tipo;
        this.status = true;
        if (tipo.equals("CC")) {
            this.saldo = 50.0;
        } else if (tipo.equals("CP")) {
            this.saldo = 150.00;
        }
    }

    public void fecharConta() {
        if (this.saldo > 0) {
            System.out.println("Conta com dinheiro. Retire o saldo antes de fechar.");
        } else if (this.saldo < 0) {
            System.out.println("Conta em débito. Quite as dívidas antes de fechar.");
        } else {
            this.status = false;
        }
    }

    public void depositar(Double valor) {
        if (this.status) {
            this.saldo += valor;
        } else {
            System.out.println("Não é possível realizar um depósito em uma conta fechada.");
        }
    }

    public void sacar(Double valor) {
        if (this.status && valor <= this.saldo) {
            this.saldo -= valor;
        } else if (!this.status) {
            System.out.println("Não é possível realizar um saque em uma conta fechada.");
        } else {
            System.out.println("Saldo insuficiente para o saque informado!");
        }
    }

    public void pagarMensal() {
        if (!this.status) {
            System.out.println("Não existe mensalidade para uma conta fechada.");
        } else if (tipo.equals("CC")) {
            saldo -= 12.00;
        } else if (tipo.equals("CP")) {
            saldo -= 20.00;
        }
    }

    @Override
    public String toString() {
        return "Conta: "
                + this.numConta
                + ", Dono: " + this.dono
                + ", Saldo: R$" + this.saldo
                + ", Status: " + (this.status ? "Ativa" : "Fechada");
    }

}
