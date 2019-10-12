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
public class Parqueamentos implements Serializable {

    @Id
    @GeneratedValue
    private int codParqueamento;
    private String tipoParqueamento;
    private String nrBI;
    private String matricula;
    private String nrBIAlternativo;
    private String nomeAlternativo;
    private String vagaDescricao;
    private String dataP;
    private String horaP;
    private String estado;
    private String status;

    public int getCodParqueamento() {
        return codParqueamento;
    }

    public void setCodParqueamento(int codParqueamento) {
        this.codParqueamento = codParqueamento;
    }

    public String getTipoParqueamento() {
        return tipoParqueamento;
    }

    public void setTipoParqueamento(String tipoParqueamento) {
        this.tipoParqueamento = tipoParqueamento;
    }

    public String getNrBI() {
        return nrBI;
    }

    public void setNrBI(String nrBI) {
        this.nrBI = nrBI;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNrBIAlternativo() {
        return nrBIAlternativo;
    }

    public void setNrBIAlternativo(String nrBIAlternativo) {
        this.nrBIAlternativo = nrBIAlternativo;
    }

    public String getNomeAlternativo() {
        return nomeAlternativo;
    }

    public void setNomeAlternativo(String nomeAlternativo) {
        this.nomeAlternativo = nomeAlternativo;
    }

    public String getVagaDescricao() {
        return vagaDescricao;
    }

    public void setVagaDescricao(String vagaDescricao) {
        this.vagaDescricao = vagaDescricao;
    }

    public String getDataP() {
        return dataP;
    }

    public void setDataP(String dataP) {
        this.dataP = dataP;
    }

    public String getHoraP() {
        return horaP;
    }

    public void setHoraP(String horaP) {
        this.horaP = horaP;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Parqueamentos() {
    }

    public Parqueamentos(Integer codParqueamento, String tipoParqueamento, String nrBI, String matricula, String nrBIAlternativo, String nomeAlternativo, String vagaDescricao, String dataP, String horaP, String status,String estado) {
        this.codParqueamento = codParqueamento;
        this.tipoParqueamento = tipoParqueamento;
        this.nrBI = nrBI;
        this.matricula = matricula;
        this.nrBIAlternativo = nrBIAlternativo;
        this.nomeAlternativo = nomeAlternativo;
        this.vagaDescricao = vagaDescricao;
        this.dataP = dataP;
        this.horaP = horaP;
        this.status = status;
        this.estado = estado;
    }
    @Override
    public String toString() {
        return "Parqueamentos{" + "codParqueamento=" + codParqueamento + ", tipoParqueamento=" + tipoParqueamento + ", nrBI=" + nrBI + ", matricula=" + matricula + ", nrBIAlternativo=" + nrBIAlternativo + ", nomeAlternativo=" + nomeAlternativo + ", vagaDescricao=" + vagaDescricao + ", dataP=" + dataP + ", horaP=" + horaP + ", estado=" + estado + ", status=" + status + '}';
    }   
}
