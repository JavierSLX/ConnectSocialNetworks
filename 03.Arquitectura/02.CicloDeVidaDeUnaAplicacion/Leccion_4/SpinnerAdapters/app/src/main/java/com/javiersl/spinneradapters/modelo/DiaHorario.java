package com.javiersl.spinneradapters.modelo;

/**
 * Created by JavierSL on 22/08/2017.
 */
public class DiaHorario
{
    private String asignatura;
    private String dia;

    public DiaHorario(String asignatura, String dia)
    {
        this.asignatura = asignatura;
        this.dia = dia;
    }

    public String getAsignatura()
    {
        return asignatura;
    }

    public void setAsignatura(String asignatura)
    {
        this.asignatura = asignatura;
    }

    public String getDia()
    {
        return dia;
    }

    public void setDia(String dia)
    {
        this.dia = dia;
    }
}
