import java.util.ArrayList;
import java.util.Date;

public class Application {
    public static void main(String[] args) {


        ArrayList<cadastroCliente> clientes = new ArrayList<>();


        cadastroCliente c1 = new clienteMulher();
        c1.setNome("Maria");
        c1.setIdade(28);
        clientes.add(c1);


        cadastroCliente c2 = new clienteHomem();
        c2.setNome("Augusto");
        c2.setIdade(24);
        c2.setCep(554545);
        c2.setCpf(65465421);
        clientes.add(c2);

        cadastroCliente c3 = new cadastroCliente();
        c3.setNome("Linho");
        c3.setIdade(17);
        c3.setCpf(84654654);
        clientes.add(c3);

        clientes.remove(1);



        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i).getDados());
        }


        System.out.println("Existem " + clientes.size() + " clientes cadastrados na lista.");

        boolean existe = clientes.contains(c1);
            return ();

        if (existe) {
            System.out.println("Sim, " + + " está na lista.");

        }else{
            System.out.println("Não, o cliente não está na lista.");
        }


    }

}
