package Model;
// Generated 02 Oct 2019 12:30:15 PM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Viatura generated by hbm2java
 */
@Entity
public class Via implements Serializable{


     @Id
    @GeneratedValue
     private int codViatura;
//     @Column(name = "matricula", length = 20 , nullable = false , unique = true)
     private String matricula;
//     @Column(name = "codMotor", length = 20 , nullable = false )
     private String codMotor;
//     @Column(name = "codChassi", length = 20 , nullable = false )
     private String codChassi;
//     @Column(name = "fabricante", length = 30 , nullable = false )
     private String fabricante;
//     @Column(name = "modelo", length = 20 , nullable = false )
     private String modelo;
//     @Column(name = "cor", length = 20 , nullable = false )
     private String cor;
//     @Column(name = "tipo", length = 20 , nullable = false )
     private String tipo;
//     @Column(name = "estado", length = 20 , nullable = false )
     private String estado;
//     @Column(name = "status", length = 20 , nullable = false )
     private boolean status = true;

    public Via() {
    }

	
    public Via(int codViatura, String codMotor, String codChassi, String fabricante, String modelo, String cor, String tipo, String estado, boolean status) {
        this.codViatura = codViatura;
        this.codMotor = codMotor;
        this.codChassi = codChassi;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
        this.tipo = tipo;
        this.estado = estado;
        this.status = status;
    }
    public Via(int codViatura, String codMotor, String codChassi, String fabricante, String modelo, String cor, String tipo, String estado, boolean status, Set parqueamentos) {
       this.codViatura = codViatura;
       this.codMotor = codMotor;
       this.codChassi = codChassi;
       this.fabricante = fabricante;
       this.modelo = modelo;
       this.cor = cor;
       this.tipo = tipo;
       this.estado = estado;
       this.status = status;
    }
   
    public String getMatricula() {
        return this.matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public int getCodViatura() {
        return this.codViatura;
    }
    
    public void setCodViatura(int codViatura) {
        this.codViatura = codViatura;
    }
    public String getCodMotor() {
        return this.codMotor;
    }
    
    public void setCodMotor(String codMotor) {
        this.codMotor = codMotor;
    }
    public String getCodChassi() {
        return this.codChassi;
    }
    
    public void setCodChassi(String codChassi) {
        this.codChassi = codChassi;
    }
    public String getFabricante() {
        return this.fabricante;
    }
    
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return this.cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public boolean isStatus() {
        return this.status;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }
    

}

