/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml;

/**
 *
 * @author Cilop002
 */
public class Facturas {
    private int codigo_fact;
    private String fecha_fact;
    private double total_fact;

    public Facturas() {
    }

    public Facturas(int codigo_fact, String fecha_fact, double total_fact) {
        this.codigo_fact = codigo_fact;
        this.fecha_fact = fecha_fact;
        this.total_fact = total_fact;
    }

    public int getCodigo_fact() {
        return codigo_fact;
    }

    public void setCodigo_fact(int codigo_fact) {
        this.codigo_fact = codigo_fact;
    }

    public String getFecha_fact() {
        return fecha_fact;
    }

    public void setFecha_fact(String fecha_fact) {
        this.fecha_fact = fecha_fact;
    }

    public double getTotal_fact() {
        return total_fact;
    }

    public void setTotal_fact(double total_fact) {
        this.total_fact = total_fact;
    }
    
    
    
}
