package fabrica;

import java.util.Date;

public class Fabrica {
    private String tipoDeFabrica;
    private int numeroDeTrabajadores;
    private int numeroDeMaquinaria;
    private int salario;
    private int cantidadDeElementosFabricados;
    private Date fechaDeInauguracion;   
    
    public void despedirTrabajadores(){
        numeroDeTrabajadores -=9;
    }
    public void maquinariaDañada(){   
        numeroDeMaquinaria -=-5;
    } 

    public String getTipoDeFabrica() {
        return tipoDeFabrica;
    }

    public void setTipoDeFabrica(String tipoDeFabrica) {
        this.tipoDeFabrica = tipoDeFabrica;
    }

    public int getNumeroDeTrabajadores() {
        return numeroDeTrabajadores;
    }

    public void setNumeroDeTrabajadores(int numeroDeTrabajadores) {
        this.numeroDeTrabajadores = numeroDeTrabajadores;
    }

    public int getNumeroDeMaquinaria() {
        return numeroDeMaquinaria;
    }

    public void setNumeroDeMaquinaria(int numeroDeMaquinaria) {
        this.numeroDeMaquinaria = numeroDeMaquinaria;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getCantidadDeElementosFabricados() {
        return cantidadDeElementosFabricados;
    }

    public void setCantidadDeElementosFabricados(int cantidadDeElementosFabricados) {
        this.cantidadDeElementosFabricados = cantidadDeElementosFabricados;
    }

    public Date getFechaDeInauguracion() {
        return fechaDeInauguracion;
    }

    public void setFechaDeInauguracion(Date fechaDeInauguracion) {
        this.fechaDeInauguracion = fechaDeInauguracion;
    }
    
    
}
