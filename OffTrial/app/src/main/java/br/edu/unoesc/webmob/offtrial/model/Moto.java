package br.edu.unoesc.webmob.offtrial.model;

import com.j256.ormlite.field.DatabaseField;

public class Moto {

    @DatabaseField(generatedId = true)
    private Integer codigo;
    @DatabaseField
    private String modelo;
    @DatabaseField
    private String marca;
    @DatabaseField
    private String cilindrada;
    @DatabaseField(canBeNull = false)
    private String cor;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Moto() {

    }
}
