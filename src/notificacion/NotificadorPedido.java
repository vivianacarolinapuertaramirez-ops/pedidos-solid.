package notificacion;

import model.Pedido;

public interface NotificadorPedido {
    void enviarConfirmacion(Pedido pedido);
}