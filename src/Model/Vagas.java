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
public class Vagas implements Serializable {

    @Id
    @GeneratedValue
    private int codVaga;
    private String categoria;
    @Column(unique = true)
    private String descricao;
    private double valor;
    private String status;

    public int getCodVaga() {
        return codVaga;
    }

    public void setCodVaga(int codVaga) {
        this.codVaga = codVaga;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Vagas() {
    }

    public Vagas(Integer codVaga, String categoria, String descricao, double valor, String status) {
        this.codVaga = codVaga;
        this.categoria = categoria;
        this.descricao = descricao;
        this.valor = valor;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Vagas{" + "codVaga=" + codVaga + ", categoria=" + categoria + ", descricao=" + descricao + ", valor=" + valor + ", status=" + status + '}';
    }

}
