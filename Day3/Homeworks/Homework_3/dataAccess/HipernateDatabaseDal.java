package Homeworks.Homework_3.dataAccess;

import Homeworks.Homework_3.entities.IEntitie;

public class HipernateDatabaseDal implements IDalBase {

    @Override
    public void add(IEntitie entitie) {
        System.out.println(String.format("Added to database with Hipernate: %s", entitie.getName()));
    }

}
