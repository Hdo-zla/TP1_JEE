package Dao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.lang.Override;
@Repository("V1") //<bean id="dao"  class="Dao.DaoImpl" ></bean>
/*
* Si on veut faire plusieurs component sur des classes qui apparatient sur le même package
* Il faut spécifie qu'elle version on veut utilisé par faire @Component("Donner un nom")
* et utilisé une annotation qui s'appelle @Qualifier("le nom qui est donné ") après
* l'annotation @Autowired
*
* */
public class DaoImpl implements IDao {

    @Override
    public double getData() {
        System.out.println("Dao Implement V1");
        double data = 10;
        return data;
    }
}
