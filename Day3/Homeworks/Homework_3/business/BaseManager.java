package Homeworks.Homework_3.business;

import java.util.List;

import Homeworks.Homework_3.core.logger.ILoggerBase;
import Homeworks.Homework_3.dataAccess.IDalBase;
import Homeworks.Homework_3.entities.IEntitie;

public class BaseManager {
    protected IDalBase dalBase;
    protected List<ILoggerBase> loggers;

    public BaseManager(IDalBase dalBase, List<ILoggerBase> loggers) {
        this.dalBase = dalBase;
        this.loggers = loggers;
    }

    public void add(IEntitie entitie, List<IEntitie> baseEntities) {
        if (!isCategoryOnTheList(entitie.getName(), baseEntities)) {
            dalBase.add(entitie);
            for (ILoggerBase logger : loggers) {
                logger.log(entitie.getName());
            }
        } else
            System.out.println(String.format("This category already exists!: '%s'", entitie.getName()));
    }

    protected boolean isCategoryOnTheList(String entitieToSearch, List<IEntitie> entities) {
        boolean result = false;
        for (IEntitie entitie : entities) {
            if (entitieToSearch.equals(entitie.getName()))
                result = true;
        }
        return result;
    }

}
