/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Almerino Buce
 */
@Entity
public class Utilizadores implements Serializable {

    @Id
    @GeneratedValue
    private int codUtilizador;
    private String nomeUtilizador;
    private String password;
    private String perfil;
    private String estado;
    @Column(unique = true)
    private String nrBI;
    private String status;

    public Utilizadores() {
    }

    public Utilizadores(Integer codUtilizador, String nomeUtilizador, String password, String perfil, String estado, String nrBI, String status) {
        this.codUtilizador = codUtilizador;
        this.nomeUtilizador = nomeUtilizador;
        this.password = password;
        this.perfil = perfil;
        this.estado = estado;
        this.nrBI = nrBI;
        this.status = status;
    }

    public int getCodUtilizador() {
        return codUtilizador;
    }

    public void setCodUtilizador(int codUtilizador) {
        this.codUtilizador = codUtilizador;
    }

    public String getNomeUtilizador() {
        return nomeUtilizador;
    }

    public void setNomeUtilizador(String nomeUtilizador) {
        this.nomeUtilizador = nomeUtilizador;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNrBI() {
        return nrBI;
    }

    public void setNrBI(String nrBI) {
        this.nrBI = nrBI;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Utilizadores{" + "codUtilizador=" + codUtilizador + ", nomeUtilizador=" + nomeUtilizador + ", password=" + password + ", perfil=" + perfil + ", estado=" + estado + ", nrBI=" + nrBI + ", status=" + status + '}';
    }

  
}
