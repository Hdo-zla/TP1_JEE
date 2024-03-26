package pres;

import Dao.DaoImpl;
import Dao.IDao;
import metier.IMetier;
import metier.MetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class pres2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException  {
        //DaoImpl dao = new DaoImpl();
        Scanner scanner =new Scanner(new File("config.txt")); // lire le fichier de configuration
        String daoClassName = scanner.nextLine(); // affecter à cette variable la première line de fichier de configuration


        //daoClassName contient le nom de la classe chargée dans la première ligne de fichier de configuration



        Class cDao=Class.forName(daoClassName);//cette méthode au moment d'exécution va chercher si cette classe daoClassName existe
                                                 // réelement ( bytecode de cette classe éxiste réelement sinon il va génerer une exception
                                                // Qui s'appelle classNotFoundException


        IDao dao = (IDao) cDao.getConstructor().newInstance(); //new DaoImpl(); instanciation dynamique

        System.out.println(dao.getData());

        //MetierImpl metier = new MetierImpl();

        String metierClassName = scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier = (IMetier)cMetier.getConstructor(IDao.class).newInstance(dao);


        //metier.setDao(dao); Statique


              /*        Method setDao = cMetier.getDeclaredMethod("setDao",IDao.class); // 1 parametre est le nom de la méthode  , et les autres
                                                                    // paramettre suivie sont les parametres de la méthode
            setDao.invoke(metier,dao); //  l'injection des dépendances dynamique  , l'execution de la méthode setDao

           */ System.out.println(metier.calcul());
    }
}
