package com.brunopiovan.Jasperreports.model;

import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Aluno {

    private String nome;
    private String curso;
    private Integer cargaHoraria;
    private Date dataInicioCurso;
    private Date dataTerminoCurso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Date getDataInicioCurso() {
        return dataInicioCurso;
    }

    public void setDataInicioCurso(Date dataInicioCurso) {
        this.dataInicioCurso = dataInicioCurso;
    }

    public Date getDataTerminoCurso() {
        return dataTerminoCurso;
    }

    public void setDataTerminoCurso(Date dataTerminoCurso) {
        this.dataTerminoCurso = dataTerminoCurso;
    }
}
