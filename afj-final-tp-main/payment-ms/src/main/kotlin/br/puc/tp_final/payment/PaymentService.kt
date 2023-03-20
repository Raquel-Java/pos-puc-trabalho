package br.puc.tp_final.payment

import org.springframework.stereotype.Service

@Service
class PaymentService {
    fun status(Integer id){
        if (id<=80){
            return "Sucesso"
        }else{
            return "erro"
        }
    }

    fun pay(Integer id){
        // 1 - validação do pedido
        // vai na base de dados e verifica o pedido através do numero recebido.

        // Caso o pedido sejá encontrado, faz o random e gera o status do pagamento
        var gerador: Random = Random();

        String statusPagamento = status(gerador.nextInt(1,100))
        //retorna para o controller o status do pagamento


        return statusPagamento


    }
}