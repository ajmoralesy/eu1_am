package uce.edu.ec.paquetes.extensiones;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import uce.edu.ec.paquetes.Pedido;

@ApplicationScoped
@Named("discapacidad")
public class DescuentoDiscapacidad implements Descuento{
    @Override
    public double calcular(Pedido pedido) {
            return pedido.getValor() * 0.20; 
    }

}