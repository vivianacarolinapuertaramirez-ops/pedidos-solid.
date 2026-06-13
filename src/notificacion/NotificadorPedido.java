package notificacion;

import model.pedidoDTO;

public interface NotificadorPedido {
    void enviarConfirmacion(pedidoDTO pedidoDTO);
}