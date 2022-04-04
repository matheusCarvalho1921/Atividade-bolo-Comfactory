
public abstract class Bolo {
	
	    private String Nome, Tipo;
	    private Float Preco;

	    public void sobreobolo() {
	        System.out.println(getNome());
	        System.out.println(getPreco());
	        System.out.println(getTipo());

	    }

	    public abstract void receita();

	    public String getNome() {
	        return Nome;
	    }

	    public void setNome(String Nome) {
	        this.Nome = Nome;
	    }

	    public String getTipo() {
	        return Tipo;
	    }

	    public void setTipo(String Tipo) {
	        this.Tipo = Tipo;
	    }

	    public Float getPreco() {
	        return Preco;
	    }

	    public void setPreco(int i, Float Preco) {
	        this.Preco = Preco;
	    }

	}


