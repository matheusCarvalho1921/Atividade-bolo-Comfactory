public class Prestigio extends Bolo{
	
	    public Prestigio() {
	        setNome("Este bolo é de Prestigio");
	        setPreco(21,00f);
	        setTipo("Receita bolo Prestigio\n");
	    }

	    @Override
	    public void receita() {
	        System.out.println("Receita");
	    }
}
