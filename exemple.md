# Mise en situation :

Prenons un exemple concret : vous naviguez sur un site d'e-commerce de votre choix. Un article vous intéresse, vous voulez l'acheter : vous l'ajoutez au panier.  
Vous ouvrez votre panier, et là, le site vous demande d'effectuer l'action abstraite de "payer". Elle ne vous paraît pas abstraite, car vous auriez des idées d'implémentations ? N'avez vous qu'une seule idée d'implémentation de cette méthode ?  
Il est possible de payer de différentes manières : directement par carte, par Paypal...
La méthode "payer" peut être implémentée de différentes manières : c'est là l'intérêt du Pattern Strategy.

![UML Diagram](https://raw.githubusercontent.com/Lhudram/DesignPattern_Strategy/master/UML_Exemple.png)

# Implémentation

On commence par l’interface Strategy, qui implémente la/les méthodes qui changeront. Ici, c'est la méthode payer qu'on déclare (avec un montant, bien entendu).

	public interface PaiementStrategy {
		public void payer(int montant);
	}

On implémente ensuite les deux classes qui l'implémenteront :

	public class PaypalStrategy implements PaiementStrategy{
	
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
	public class CarteDeCreditStrategy implements PaiementStrategy {

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
	
Enfin, on implémente la classe qui se servira du pattern :

	public class Article {

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



```java runnable
// { autofold
interface PaiementStrategy {
	public void payer(int montant);
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
			
			Article article1 = new Article("Livre : 'Tout savoir sur le pattern Strategy'",25);
			Article article2 = new Article("Piano steinway & sons d274",155690);
			
			article1.payer(new PaypalStrategy("idExemple", "passwordExemple"));
			
			//pay by credit card
			article2.payer(new CarteDeCreditStrategy( "1234567890123456", "786", "12/15"));
		}

}

```

# Quizz !

?[A quelle famille de Patterns le pattern Strategy apartient-il ?]
-[ ] Création
-[ ] Structuration
-[x] Comportement

?[Le pattern Strategy :]
-[ ] Fait apparaître l'implémentation des méthodes directement dans le code de la classe concernée
-[X] Rend les algorithmes interchangeables

?[Quel est le principe SOLID dont le pattern Strategy empêche la violation ?]
-[ ] Liskov Substitution Principle
-[ ] Dependency Inversion principle
-[X] Single Responsibility principle

?["Il a vraiment peu d’inconvénients ! Je vais pourvoir l’utiliser partout !" Cette personne : ]
-[ ] A raison
-[X] N’a pas raison
-[ ] Le Luxembourg
