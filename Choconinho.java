
public class Choconinho extends Bolo {
    public Choconinho() {
        setNome("Este bolo é de choconinho");
        setPreco(23,00f);
        setTipo("Receita bolo Choconinho\n");
    }

    @Override
    public void receita() {
        System.out.println("Receita");
    }

}
