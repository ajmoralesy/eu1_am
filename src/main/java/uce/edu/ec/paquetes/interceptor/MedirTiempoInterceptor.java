package uce.edu.ec.paquetes.interceptor;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import uce.edu.ec.paquetes.Pedido;

@Interceptor
@MedirTiempo
@Priority(Interceptor.Priority.APPLICATION)
public class MedirTiempoInterceptor {
     @AroundInvoke
    public Object interceptar(InvocationContext context) throws Exception {
        Object [] valores = context.getParameters();
        Pedido pedido = (Pedido) valores [0];
        String codigo = pedido.getCodigo();
        long inicio = System.currentTimeMillis();
        Object resultado = context.proceed();
        long fin = System.currentTimeMillis();
        long total = fin - inicio;
        System.out.println("DURACION: " + codigo + "|MS:"+total);
        System.out.println("TIEMPO: " + codigo+"|OK");
        return resultado;
    }

}



