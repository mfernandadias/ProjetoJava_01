package problemasJava;
import java.util.Arrays;
import java.util.Scanner;

public class VerificacaoServico {
    /*
    Descrição
    Uma concessionária de telecomunicações oferece quatro tipos de serviços:
    telefonia móvel, telefonia fixa, banda larga e TV por assinatura.
    Para facilitar o atendimento ao cliente, é necessário implementar um programa
    que verifique se um cliente específico contratou um determinado serviço.
     Por exemplo, quando um cliente liga para a central de atendimento
     e  menciona um serviço, o atendente deve ser capaz de rapidamente verificar
     se esse serviço está contratado pelo cliente.
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // Entrada do serviço a ser verificado
        String servico = scan.nextLine().trim();

        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scan.nextLine().trim();

        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
        String[] servicosContratados = Arrays.copyOfRange(partes, 1, partes.length);

        // Verifica se o serviço procurado está na lista de serviços contratados
        boolean contratado = false;
        for (String servicoContratado : servicosContratados) {
            if (servicoProcurado.equalsIgnoreCase(servicoContratado.trim())) {
                contratado = true;
                break;
            }
        }

        // Exibe o resultado
        System.out.println(contratado);


        // TODO: Verifique se o serviço está na lista de serviços contratados
        scan.close();

    }
}
