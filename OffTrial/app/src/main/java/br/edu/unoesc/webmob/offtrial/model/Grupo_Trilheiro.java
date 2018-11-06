package br.edu.unoesc.webmob.offtrial.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

public class Grupo_Trilheiro {

    @DatabaseField(columnName = "codigo")
    private Integer codigo;

    @DatabaseField(foreign = true, foreignColumnName = "codigo")
    private Grupo grupo;
    @DatabaseField(foreign = true, foreignColumnName = "codigo")
    private Trilheiro trilheiro;

    public Grupo_Trilheiro() {

    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Trilheiro getTrilheiro() {
        return trilheiro;
    }

    public void setTrilheiro(Trilheiro trilheiro) {
        this.trilheiro = trilheiro;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @DatabaseField

    private Date data;


}
