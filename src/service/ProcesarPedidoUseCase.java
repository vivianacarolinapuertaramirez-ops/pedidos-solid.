package service;

import model.Pedido;

public interface ProcesarPedidoUseCase {
    void ejecutar(Pedido pedido);
}