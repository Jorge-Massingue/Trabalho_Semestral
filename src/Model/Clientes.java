/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Almerino Buce
 */
@Entity
public class Clientes implements Serializable {

    @Id
    @GeneratedValue
    private int codCliente;
    @Column(unique = true)
    private String nrBI;
    private String nomeCompleto;
    private String sexo;
    private String morada;
    private String dataNascimento;
    @Column(unique = true)
    private String contacto;
    private String email;
    private String contrato;
    private String status;

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
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

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Clientes() {
    }

    public Clientes(int codCliente, String nrBI, String nomeCompleto, String sexo, String morada, String dataNascimento, String contacto, String email, String contrato, String status) {
        this.codCliente = codCliente;
        this.nrBI = nrBI;
        this.nomeCompleto = nomeCompleto;
        this.sexo = sexo;
        this.morada = morada;
        this.dataNascimento = dataNascimento;
        this.contacto = contacto;
        this.email = email;
        this.contrato = contrato;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Clientes{" + "codCliente=" + codCliente + ", nrBI=" + nrBI + ", nomeCompleto=" + nomeCompleto + ", sexo=" + sexo + ", morada=" + morada + ", dataNascimento=" + dataNascimento + ", contacto=" + contacto + ", email=" + email + ", contrato=" + contrato + ", status=" + status + '}';
    }
    
}
