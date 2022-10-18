package Homeworks.h01_OOP.dataAccess;

import Homeworks.h01_OOP.entities.IEntitie;

public interface ICustomerDAL {
    void add(IEntitie customer);

    void delete(IEntitie customer);
}
