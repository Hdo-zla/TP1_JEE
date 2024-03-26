package metier;

import Dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service // <bean id="metier" class="metier.MetierImpl">
public class MetierImpl  implements IMetier {

    /*
    @Autowired // Quand tu crée un objet de cette classe [MetierImpl] affecte moi à
        // cette variable [dao] un objet de type Idao
    */
    // @Qualifier("V3") //pour spécifier quelle version on veut l'utiliser
    private IDao dao ; // couplage faible , quand j'appelle une interface

    public MetierImpl(@Qualifier("V3") IDao dao) {
        this.dao = dao;
    }

    // si on  fait new , on va faire l'appel à une classe d'où il s'agit de couplage fort qui
    //est mauvais

    public double calcul() {
        double data = dao.getData()*2;
        return data;
    }


    /*
    * Pour permettre d'injecter dans la variable dao
    * un objet d'une classe qui implémente l'interface dao
    * @param Dao
    * */
       // public void setDao(IDao dao){

         //   this.dao=dao;
        // }
}
