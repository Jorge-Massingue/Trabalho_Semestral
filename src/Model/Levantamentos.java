/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Almerino Buce
 */
@Entity
public class Levantamentos implements Serializable {

    @Id
    @GeneratedValue
    private int codLevantamento;
    private double valor;
    private String nrBI;
    private int codParqueamento;
    private int codUtilizador;
    private String status;
    private String dataL;
    private String horaL;

    public int getCodLevantamento() {
        return codLevantamento;
    }

    public void setCodLevantamento(int codLevantamento) {
        this.codLevantamento = codLevantamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNrBI() {
        return nrBI;
    }

    public void setNrBI(String nrBI) {
        this.nrBI = nrBI;
    }

    public int getCodParqueamento() {
        return codParqueamento;
    }

    public void setCodParqueamento(int codParqueamento) {
        this.codParqueamento = codParqueamento;
    }

    public int getCodUtilizador() {
        return codUtilizador;
    }

    public void setCodUtilizador(int codUtilizador) {
        this.codUtilizador = codUtilizador;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDataL() {
        return dataL;
    }

    public void setDataL(String dataL) {
        this.dataL = dataL;
    }

    public String getHoraL() {
        return horaL;
    }

    public void setHoraL(String horaL) {
        this.horaL = horaL;
    }

    public Levantamentos() {
    }

    public Levantamentos(int codLevantamento, double valor, String nrBI, int codParqueamento, int codUtilizador, String status, String dataL, String horaL) {
        this.codLevantamento = codLevantamento;
        this.valor = valor;
        this.nrBI = nrBI;
        this.codParqueamento = codParqueamento;
        this.codUtilizador = codUtilizador;
        this.status = status;
        this.dataL = dataL;
        this.horaL = horaL;
    }

    @Override
    public String toString() {
        return "Levantamentos{" + "codLevantamento=" + codLevantamento + ", valor=" + valor + ", nrBI=" + nrBI + ", codParqueamento=" + codParqueamento + ", codUtilizador=" + codUtilizador + ", status=" + status + ", dataL=" + dataL + ", horaL=" + horaL + '}';
    }

}
