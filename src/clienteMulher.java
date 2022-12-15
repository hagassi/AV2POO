public class clienteMulher extends cadastroCliente{
    private String sexo;
    boolean manicure;
    boolean escova;

    public boolean isManicure() {
        return manicure;
    }

    public void setManicure(boolean manicure) {
        this.manicure = manicure;
    }

    public boolean isEscova() {
        return escova;
    }

    public void setEscova(boolean escova) {
        this.escova = escova;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void imprimir () {
        System.out.println(this.getNome() + " é do sexo " + this.getSexo() + " e tem " + this.getIdade() + " anos.");
    }
}
