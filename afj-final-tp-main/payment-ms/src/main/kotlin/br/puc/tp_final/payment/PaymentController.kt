package br.puc.tp_final.payment

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/payment-ms/rest/payment")
class PaymentController(
    val paymentService: PaymentService
) {
    @PostMapping("pay/{id}")
    //@validator() - valida se o id é valido
    fun pay(Integer id) {
        //Se o id for valido chama o método service
        // se não for válido retorno 422 com a mensagem de retorno,
        // favor informar o id do pedido para pagamento
        paymentService.pay(id)
    }

    @GetMapping("status/{id}")
    fun status(): String {
        return paymentService.status()
    }
}