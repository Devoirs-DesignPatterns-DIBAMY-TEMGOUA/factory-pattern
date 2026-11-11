import Produit.Produit;
import Produit.ProduitFactory;
import Produit.ProduitFactoryA;
import Produit.ProduitFactoryB;
import Produit.ProduitFactoryC;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("..........Methode 2: Abstract Factory...........");
        ProduitFactory produitfactoryA = new ProduitFactoryA();
        ProduitFactory produitfactoryB = new ProduitFactoryB();
        ProduitFactory produitfactoryC = new ProduitFactoryC();
        Produit produit = null;

        //affiche un produit de type A
        produit = produitfactoryA.getProduit();
        produit.methodeproduit();

        //affiche un produit de type B
        produit = produitfactoryB.getProduit();
        produit.methodeproduit();

        //affiche un produit de type C
        produit = produitfactoryC.getProduit();
        produit.methodeproduit();

    }
}
