package service;

import discount.PoliticaDescuento;
import model.pedidoDTO;
import notificacion.NotificadorPedido;
import repository.PedidosRepository;

public class ProcesarPedidoService implements ProcesarPedidoUseCase {

    // ✅ DEPENDE DE ABSTRACCIONES (Cumple DIP)
    private final PoliticaDescuento politicaDescuento;
    private final PedidosRepository repositorio;
    private final NotificadorPedido notificador;

    // ✅ INYECCIÓN DE DEPENDENCIAS POR CONSTRUCTOR (lo pide la guía)
    public ProcesarPedidoService(PoliticaDescuento politicaDescuento,
                                 PedidosRepository repositorio,
                                 NotificadorPedido notificador) {
        this.politicaDescuento = politicaDescuento;
        this.repositorio = repositorio;
        this.notificador = notificador;
    }

    @Override
    public void ejecutar(pedidoDTO pedidoDTO) {
        System.out.println("🔄 Procesando pedido: " + pedidoDTO.getId());

        // Aplica descuento SIN condicionales (Cumple OCP)
        double valorFinal = politicaDescuento.aplicarDescuento(pedidoDTO);
        pedidoDTO pedidoDTOProcesado = new pedidoDTO(pedidoDTO.getId(), valorFinal, pedidoDTO.getTipoCliente());

        // Guarda y notifica
        repositorio.guardar(pedidoDTOProcesado);
        notificador.enviarConfirmacion(pedidoDTOProcesado);

        System.out.println("✅ Proceso finalizado.\n");
    }
}