package br.edu.unoesc.webmob.offtrial.model;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;

import java.io.Serializable;

public class Trilheiro implements Serializable {
    @DatabaseField(generatedId = true)
    private Integer codigo;
    @DatabaseField
    private String nome;
    @DatabaseField
    private Integer idade;
    @DatabaseField(foreign = true, foreignColumnName = "codigo")
    private Moto moto;
    @DatabaseField(dataType = DataType.BYTE_ARRAY)
    private byte[] foto;

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Moto getMoto() {
        return moto;
    }

    public void setMoto(Moto moto) {
        this.moto = moto;
    }

    public Trilheiro() {


    }
}
