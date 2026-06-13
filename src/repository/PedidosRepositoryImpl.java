package repository;

import model.pedidoDTO;
import java.util.HashMap;
import java.util.Map;

public class PedidosRepositoryImpl implements PedidosRepository {
    private final Map<String, pedidoDTO> baseDatos = new HashMap<>();

    @Override
    public void guardar(pedidoDTO pedidoDTO) {
        baseDatos.put(pedidoDTO.getId(), pedidoDTO);
        System.out.println("💾 Pedido guardado en repositorio: " + pedidoDTO.getId());
    }

    @Override
    public pedidoDTO buscarPorId(String id) {
        return baseDatos.get(id);
    }
}