package Homeworks.Homework_1.h01_OOP.dataAccess;

import Homeworks.Homework_1.h01_OOP.entities.IEntitie;

public interface ICustomerDAL {
    void add(IEntitie customer);

    void delete(IEntitie customer);
}
