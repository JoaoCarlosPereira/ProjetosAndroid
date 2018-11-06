package br.edu.unoesc.webmob.offtrial.model;

import com.j256.ormlite.field.DatabaseField;

public class Moto {

    @DatabaseField(generatedId = true)
    private Integer codigo;
    @DatabaseField
    private String descricaoModelo;
    @DatabaseField
    private String descricaoMarca;
    @DatabaseField
    private String cilindradas;
    @DatabaseField(canBeNull = false)
    private String cor;

    public Moto() {

    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricaoModelo() {
        return descricaoModelo;
    }

    public void setDescricaoModelo(String descricaoModelo) {
        this.descricaoModelo = descricaoModelo;
    }

    public String getDescricaoMarca() {
        return descricaoMarca;
    }

    public void setDescricaoMarca(String descricaoMarca) {
        this.descricaoMarca = descricaoMarca;
    }

    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
