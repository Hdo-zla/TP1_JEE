package Dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("V3")
public class DaoImplV3 implements IDao{
    @Override
    public double getData() {
        System.out.println("Version 3 : ");
        double data = 80;
        return data;
    }
}
