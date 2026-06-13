package repository;

import model.pedidoDTO;

public interface PedidosRepository {
    void guardar(pedidoDTO pedidoDTO);
    pedidoDTO buscarPorId(String id);
}