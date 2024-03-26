package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class presAvecSpringAnnotation {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("Dao","metier");//démarge de spring avec annotation
        //On le spécifie quels sont les packages utilisées pour qu'il les scanne
        IMetier metier = context.getBean(IMetier.class); //Récupérer un objet de type Imetier
        System.out.println("RES : "+metier.calcul());
    }
}
