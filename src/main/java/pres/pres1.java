package pres;

import Dao.DaoImpl;
import Dao.DaoImplV2;
import metier.MetierImpl;

public class pres1 {
    public static void main(String[] args) {
        DaoImplV2 D1 = new DaoImplV2(); // instanciation statique , quand on utilise new on sait la classe
        //DaoImpl D2 = new DaoImpl();
        MetierImpl metier=new MetierImpl(D1); //  Injection via le constructeur
        //metier.setDao(D1);//l'injection des dépendances
        System.out.println(metier.calcul());
    }
}
