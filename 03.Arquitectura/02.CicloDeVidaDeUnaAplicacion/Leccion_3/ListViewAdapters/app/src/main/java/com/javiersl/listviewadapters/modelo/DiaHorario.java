package com.javiersl.listviewadapters.modelo;

/**
 * Created by JavierSL on 31/05/2017.
 */
public class DiaHorario
{
    private String asignatura;
    private String dia;

    public DiaHorario(String dia, String asignatura)
    {
        this.dia = dia;
        this.asignatura = asignatura;
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
