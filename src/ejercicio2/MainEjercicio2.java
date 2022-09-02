package ejercicio2;

public class MainEjercicio2 {

	public static void main(String[] args)
	{
		ProdFresco PF = new ProdFresco("01/01/2022", "Argentina", "31/12/2020", 111);
		System.out.println(PF.toString());
		
		ProdRefrigerado PR = new ProdRefrigerado("01/04/2022", 123, 2);
		System.out.println(PR.toString());
		
		ProdCongelado PG = new ProdCongelado("01/04/2019", 22, -5);
		System.out.println(PG.toString());
	}
}
