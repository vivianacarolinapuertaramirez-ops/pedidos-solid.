package notificacion;

import model.pedidoDTO;

public class NotificadorPedidoImpl implements NotificadorPedido {
    @Override
    public void enviarConfirmacion(pedidoDTO pedidoDTO) {
        System.out.println("✅ Notificación enviada: Pedido " + pedidoDTO.getId() +
                " procesado. Valor final: $" + pedidoDTO.getValorTotal());
    }
}
