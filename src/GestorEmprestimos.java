import Interface.ItemEmprestavel;

public class GestorEmprestimos {
    public void emprestarItem(ItemEmprestavel item) {
        if (item.estaDisponivel()) {
            item.emprestar();
        } else {
            System.out.println("O Item não está disponível para empréstimo. ");
        }
    }

    public void devolverItem(ItemEmprestavel item) {
        item.devolver();
    }
}
