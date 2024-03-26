package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class presAvecSpringXml
{
    public static void main(String[] args) {
        ApplicationContext springContext = new ClassPathXmlApplicationContext("config.xml");//démarage de Spring
        IMetier metier = springContext.getBean(IMetier.class);
        System.out.println("Res : "+metier.calcul());
    }
}
