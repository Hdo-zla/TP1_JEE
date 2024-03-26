package Dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("V2")
public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Dao implements V2");
        double data = 20;
        return data;
    }
}
