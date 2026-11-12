package uce.edu.ec.paquetes.interceptor;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import uce.edu.ec.paquetes.Pedido;

@Interceptor
@Notificacion
@Priority(Interceptor.Priority.APPLICATION +20)
public class NotifiacionInterceptor {

    @AroundInvoke
    public Object interceptar(InvocationContext context) throws Exception {
        Object resultado = context.proceed();
        Object [] valores = context.getParameters();
        Pedido pedido = (Pedido) valores [0];
        String codigo = pedido.getCodigo();
        System.out.println("NOTIFICACION: " + codigo);
        return resultado;
    }

}


