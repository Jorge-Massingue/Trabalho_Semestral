/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author FST
 */
public class ParqueamentoNormal {
    private String numeroBiCliente;
    private Funcionario funcionario;
    private String nome;
    private String matricula;
    private String data;
    private String Hora;
    private String numBiAlternativo;
    private double valorParqueamento;

    public String getNumeroBiCliente() {
        return numeroBiCliente;
    }

    public void setNumeroBiCliente(String numeroBiCliente) {
        this.numeroBiCliente = numeroBiCliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getNumBiAlternativo() {
        return numBiAlternativo;
    }

    public void setNumBiAlternativo(String numBiAlternativo) {
        this.numBiAlternativo = numBiAlternativo;
    }

    public double getValorParqueamento() {
        return valorParqueamento;
    }

    public void setValorParqueamento(double valorParqueamento) {
        this.valorParqueamento = valorParqueamento;
    }
    
    
    
}
