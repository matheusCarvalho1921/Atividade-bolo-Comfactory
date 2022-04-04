
public class TestaBolo {
	
    public static void main(String[] args) {

    	BoloFactory bf = new BoloFactory();

    Bolo bf1 = bf.getBolo(BoloFactory.Tipo.ABACAXI);
    bf1.sobreobolo();
    
    Bolo bf2 = bf.getBolo(BoloFactory.Tipo.PRESTIGIO);
    bf2.sobreobolo();
    
    Bolo bf3 = bf.getBolo(BoloFactory.Tipo.FLORESTANEGRA);
    bf3.sobreobolo();
    
    Bolo bf4 = bf.getBolo(BoloFactory.Tipo.CHOCONINHO);
    bf4.sobreobolo();


    }

}
