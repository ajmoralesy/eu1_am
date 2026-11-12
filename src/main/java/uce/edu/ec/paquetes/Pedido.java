package uce.edu.ec.paquetes;

public class Pedido {
    private String codigo;
    private String producto;
    private double valor;
    private String cliente;
    public Pedido() {
    }
    public Pedido(String codigo, String producto, double valor, String cliente) {
        this.codigo = codigo;
        this.producto = producto;
        this.valor = valor;
        this.cliente = cliente;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getProducto() {
        return producto;
    }
    public void setProducto(String producto) {
        this.producto = producto;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    
    


}
