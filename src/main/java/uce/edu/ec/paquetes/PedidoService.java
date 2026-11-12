package uce.edu.ec.paquetes;

import jakarta.enterprise.context.ApplicationScoped;
import uce.edu.ec.paquetes.extensiones.Descuento;
import uce.edu.ec.paquetes.interceptor.MedirTiempo;
import uce.edu.ec.paquetes.interceptor.Notificacion;

@ApplicationScoped
public class PedidoService {



    @MedirTiempo
    @Notificacion
    public void realizarPedido(Pedido pedido,Descuento descuento){
         double descuentoCalculado = descuento.calcular(pedido);
        double total = pedido.getValor() - descuentoCalculado;
        System.out.println("PEDIDO:" + pedido.getCodigo()+" | TOTAL: "+ total);
    }


}
