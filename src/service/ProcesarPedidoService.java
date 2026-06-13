package service;

import discount.PoliticaDescuento;
import model.Pedido;
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
    public void ejecutar(Pedido pedido) {
        System.out.println("🔄 Procesando pedido: " + pedido.getId());

        // Aplica descuento SIN condicionales (Cumple OCP)
        double valorFinal = politicaDescuento.aplicarDescuento(pedido);
        Pedido pedidoProcesado = new Pedido(pedido.getId(), valorFinal, pedido.getTipoCliente());

        // Guarda y notifica
        repositorio.guardar(pedidoProcesado);
        notificador.enviarConfirmacion(pedidoProcesado);

        System.out.println("✅ Proceso finalizado.\n");
    }
}