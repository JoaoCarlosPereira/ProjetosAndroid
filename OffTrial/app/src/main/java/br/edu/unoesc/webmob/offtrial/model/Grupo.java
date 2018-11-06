package br.edu.unoesc.webmob.offtrial.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "TB_GRUPO")
public class Grupo {

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

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Grupo() {

    }

    @DatabaseField(generatedId = true)
    private Integer codigo;
    @DatabaseField
    private String nome;
    @DatabaseField(foreign = true, foreignColumnName = "codigo")
    private Cidade cidade;

}
