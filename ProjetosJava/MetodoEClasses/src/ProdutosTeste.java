
public class ProdutosTeste {
	public static void main(String[] args) {
		
		MetodoeClass M1= new MetodoeClass();
		M1.nome="Casa";
		M1.preço=10000;
		M1.desconto= 0.30;
	
		System.out.println(M1.preço *(1-M1.desconto));
	}
}
