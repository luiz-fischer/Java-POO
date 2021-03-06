
public class Pedido {
    private int idPedido;
    Cliente cliente;
    Produto produto;
    Bebida bebida;
    private static int pedidoNumero = 1;

    /**
     * 
     * @param cliente  Variável de entrada para cliente.
     * @param produto  Variável de entrada para produto.
     * @param idPedido Variável para controle dos pedidos.
     */
    public Pedido(Cliente cliente, Produto produto, Bebida bebida) {
        this.idPedido = pedidoNumero++;
        this.cliente = cliente;
        this.produto = produto;
        this.bebida = bebida;

    }

    // ======== SETS ========
    public void setId(int idPedido) {
        this.idPedido = idPedido;
    }

    public void setCliente(Cliente cliente) {
        cliente.setCliente(cliente);
    }

    public void setProduto(Produto produto) {
        produto.setProduto(this);
    }

    public void setPedido(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setBebida(Bebida bebida) {
        bebida.setBebida(bebida);
    }

    // ======== GETS ========
    public int getIdPedido() {
        return this.idPedido;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public Cliente getPedido() {
        return this.cliente;
    }
    public Bebida getBebida() {
        return this.bebida;
    }

    // ======== Impressão ========
    @Override
    public String toString() {
        String print = "-------Ordem de Serviço-------" + "\nPedido Número : " + getIdPedido() + "\n";
        print += getProduto() + "\n";
        print += getCliente() + "\n";
        print += getBebida() + "\n";
        return print;
    }

    // ======== Método equals para comparação de propriedades ========
    @Override
    public boolean equals(Object object) {
        if (object == this)
            return true;
        if (!(object instanceof Pedido))
            return false;

        Pedido pedido = (Pedido) object;

        return this.getIdPedido() == pedido.getIdPedido();
    }
}