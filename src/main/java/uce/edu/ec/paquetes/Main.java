package uce.edu.ec.paquetes;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
import uce.edu.ec.paquetes.extensiones.DescuentoBlackFriday;
import uce.edu.ec.paquetes.extensiones.DescuentoDiscapacidad;

import uce.edu.ec.paquetes.extensiones.DescuentoVIP;

@QuarkusMain
public class Main implements QuarkusApplication{
    @Inject
    private PedidoService pedidoService;

    @Inject
    private DescuentoVIP descuentoVIP;

    @Inject
    private DescuentoBlackFriday descuentoBlackFriday;

    @Inject
    private DescuentoDiscapacidad descuentoDiscapacidad ;
    

   public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) {
        System.out.println("INICIO_EVALUACION");
        Pedido pedido = new Pedido("P001", "Laptop", 1000, "vip");
        pedidoService.realizarPedido(pedido, descuentoVIP);
        Pedido pedido2 = new Pedido("P002", "Mouse", 100, "blackfriday");
        pedidoService.realizarPedido(pedido2, descuentoBlackFriday);
        Pedido pedido3 = new Pedido("P003", "Teclado",200, "discapacidad");
        pedidoService.realizarPedido(pedido3, descuentoDiscapacidad);
        System.out.println("FIN_EVALUACION");
        System.out.println("172219-am");
        return 0; 

    }
}

