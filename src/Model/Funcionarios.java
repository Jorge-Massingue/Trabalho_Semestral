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
public class Funcionarios implements Serializable {

    @Id
    @GeneratedValue
    private int codFuncionario;
    @Column(unique = true)
    private String nrBI;
    private String nomeCompleto;
    private String sexo;
    private String morada;
    private String dataNascimento;
    private String departamento;
    private String cargo;
    private String contacto;
    private String email;
    private String estado;
    private String status;

    public Funcionarios() {
    }

    public Funcionarios(int codFuncionario, String nomeCompleto, String sexo, String morada, String dataNascimento, String departamento, String cargo, String contacto, String email, String estado,String status) {
        this.codFuncionario = codFuncionario;
        this.nomeCompleto = nomeCompleto;
        this.sexo = sexo;
        this.morada = morada;
        this.dataNascimento = dataNascimento;
        this.departamento = departamento;
        this.cargo = cargo;
        this.contacto = contacto;
        this.email = email;
        this.estado = estado;
        this.status = status;
    }

    public int getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public String getNrBI() {
        return nrBI;
    }

    public void setNrBI(String nrBI) {
        this.nrBI = nrBI;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    @Override
    public String toString() {
        return "Funcionarios{" + "codFuncionario=" + codFuncionario + ", nrBI=" + nrBI + ", nomeCompleto=" + nomeCompleto + ", sexo=" + sexo + ", morada=" + morada + ", dataNascimento=" + dataNascimento + ", departamento=" + departamento + ", cargo=" + cargo + ", contacto=" + contacto + ", email=" + email + ", estado=" + estado + ", status=" + status + '}';
    }

}
