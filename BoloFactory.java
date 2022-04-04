
public class BoloFactory {
	
	public enum Tipo {
		
        ABACAXI, CHOCONINHO, FLORESTANEGRA, PRESTIGIO;

    }

    public Bolo getBolo(Tipo t) {
        
    	Bolo f = null;

        switch (t) {

            case ABACAXI:

                f = new Abacaxi();
                break;

            case PRESTIGIO:
                f = new Prestigio();
                break;

            case CHOCONINHO:
                f = new Choconinho();
                break;

            case FLORESTANEGRA:
                f = new FlorestaNegra();

        }
        
        return f;

    }

}
