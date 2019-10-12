/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Almerino Buce
 */
@Entity
public class Viaturas implements Serializable {

    @Id
    @GeneratedValue
    private int codViatura;
    @Column(unique = true)
    private String matricula;
    @Column(unique = true)
    private String codMotor;
    @Column(unique = true)
    private String codChassi;
    private String fabricante;
    private String modelo;
    private String cor;
    private String tipo;
    private String estado;
    private String status;

    public int getCodViatura() {
        return codViatura;
    }

    public void setCodViatura(int codViatura) {
        this.codViatura = codViatura;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCodMotor() {
        return codMotor;
    }

    public void setCodMotor(String codMotor) {
        this.codMotor = codMotor;
    }

    public String getCodChassi() {
        return codChassi;
    }

    public void setCodChassi(String codChassi) {
        this.codChassi = codChassi;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Viaturas() {
    }

    public Viaturas(int codViatura, String matricula, String codMotor, String codChassi, String fabricante, String modelo, String cor, String tipo, String estado, String status) {
        this.codViatura = codViatura;
        this.matricula = matricula;
        this.codMotor = codMotor;
        this.codChassi = codChassi;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
        this.tipo = tipo;
        this.estado = estado;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Viaturas{" + "codViatura=" + codViatura + ", matricula=" + matricula + ", codMotor=" + codMotor + ", codChassi=" + codChassi + ", fabricante=" + fabricante + ", modelo=" + modelo + ", cor=" + cor + ", tipo=" + tipo + ", estado=" + estado + ", status=" + status + '}';
    }
    

}
