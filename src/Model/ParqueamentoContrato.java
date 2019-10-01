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
public class ParqueamentoContrato {
    private Cliente cliente;
    private Viatura veiculo;
    private double Valor;

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Viatura getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Viatura veiculo) {
        this.veiculo = veiculo;
    }
    
    
    
    
}
