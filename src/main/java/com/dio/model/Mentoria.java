package com.dio.model;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate dataDaMentoria;

    private static final double XP_CONTEUDO = 20;

    public LocalDate getDataDaMentoria() {
        return dataDaMentoria;
    }

    public void setDataDaMentoria(LocalDate dataDaMentoria) {
        this.dataDaMentoria = dataDaMentoria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + XP_CONTEUDO;
    }
}
