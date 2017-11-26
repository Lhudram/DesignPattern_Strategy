# Welcome!

This Java template lets you get started quickly with a simple one-page playground.

```java runnable
// { autofold
interface PaiementStrategy {
	public void payer(int amount);
}
class PaypalStrategy implements PaiementStrategy{
	
	private String id;
	private String password;
	
	public PaypalStrategy(String email, String pass){
		this.id=id;
		this.password=pass;
	}
	
	@Override
	public void payer(int montant) {
		System.out.println(montant + "€ payés par Paypal.");
	}

}
class CarteDeCreditStrategy implements PaiementStrategy {

	private String numeroCarte;
	private String cryptogramme;
	private String dateExpiration;

	public CarteDeCreditStrategy(String num, String crypto, String date) {
		this.numeroCarte = num;
		this.cryptogramme = crypto;
		this.dateExpiration = date;
	}

	@Override
	public void payer(int montant) {
		System.out.println(montant + "€ payés par carte de crédit.");
	}

}
class Article {

	private String nom;
	private int prix;

	public Article(String nom, int prix) {
		this.nom = nom;
		this.prix = prix;
	}

	public String getNom() {
		return this.nom;
	}

	public int getPrix() {
		return this.prix;
	}
	
	public void payer(PaiementStrategy methode){
		int montant=this.getPrix();
		methode.payer(montant);
	}
}

// }
class Main {

		public static void main(String[] args) {
			
			Article article1 = new Article("Livre : 'Tout savoir sur le Pattern Strategy'",25);
			Article article2 = new Article("Piano steinway & sons d274",155690);
			
			article1.payer(new PaypalStrategy("idExemple", "passwordExemple"));
			
			//pay by credit card
			article2.payer(new CarteDeCreditStrategy( "1234567890123456", "786", "12/15"));
		}

}

```

# Quizz !

?[A quelle famille de Patterns le Pattern Strategy apartient-il ?]
-[ ] Création
-[ ] Structuration
-[x] Comportement
