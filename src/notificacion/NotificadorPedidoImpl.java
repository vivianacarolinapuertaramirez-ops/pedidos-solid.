package notificacion;

import model.Pedido;

public class NotificadorPedidoImpl implements NotificadorPedido {
    @Override
    public void enviarConfirmacion(Pedido pedido) {
        System.out.println("✅ Notificación enviada: Pedido " + pedido.getId() +
                " procesado. Valor final: $" + pedido.getValorTotal());
    }
}
