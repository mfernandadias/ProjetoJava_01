package dio.desafios;
import java.util.Arrays;
import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {

        //entrada de serviço
        Scanner scan = new Scanner(System.in);

        //entrada do serviço a ser verificado
        String servico = scan.nextLine().trim();

        //entrada do nome do cliente e os serviços controtados
        String entradaCliente = scan.nextLine().trim();

        //sepradando nome do cliente e os servidores contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        String[] servicosContratados = Arrays.copyOfRange(partes, 1, partes.length);

        boolean contratado = false;


        //todo: Verifique se o serviço está na lista de serviços contratados
        for (String servicoContratado : servicosContratados) {
            if (servico.equalsIgnoreCase(servicoContratado.trim())) {
                contratado = true;
                break;
            }
        }

        if (contratado) {
            System.out.println("Sim");
        } else {
            System.out.println("Nao");
        }


        scan.close();
    }

}
