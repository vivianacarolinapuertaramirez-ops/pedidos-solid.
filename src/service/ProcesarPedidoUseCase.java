package service;

import model.pedidoDTO;

public interface ProcesarPedidoUseCase {
    void ejecutar(pedidoDTO pedidoDTO);
}