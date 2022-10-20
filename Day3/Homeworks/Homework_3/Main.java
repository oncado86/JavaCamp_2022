package Homeworks.Homework_3;

import java.util.Arrays;
import java.util.List;

import Homeworks.Homework_3.business.BaseManager;
import Homeworks.Homework_3.core.logger.EmailLogger;
import Homeworks.Homework_3.core.logger.FileLogger;
import Homeworks.Homework_3.core.logger.ILoggerBase;
import Homeworks.Homework_3.dataAccess.JdbcDatabaseDal;
import Homeworks.Homework_3.entities.Category;
import Homeworks.Homework_3.entities.Course;
import Homeworks.Homework_3.entities.IEntitie;
import Homeworks.Homework_3.entities.Instructor;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        // definitions --------------------------------

        List<ILoggerBase> loggers = Arrays.asList(
                new FileLogger(),
                new EmailLogger());

        List<IEntitie> baseCategories = Arrays.asList(
                new Category(1, "Programming"));

        List<IEntitie> baseCourses = Arrays.asList(
                new Course(1, "Java Kampı", "Java Yazılım Geliştirici Kampı", new Category(3, "Programming"),
                        new Instructor(0, "Engin", "Demiroğ")));

        List<IEntitie> baseInstructor = Arrays.asList(
                new Instructor(1, "Engin", "Demiroğ"));

        IEntitie kategori1 = new Category(1, "Kategori1");
        IEntitie kategori2 = new Category(2, "Programming");

        IEntitie kurs1 = new Course(1, "C#", "C# Kampı", kategori1, new Instructor(0, "OnCaDo", "OnCaDo"));
        IEntitie kurs2 = new Course(2, "Java Kampı", "Java Yazılım Geliştirici Kampı", kategori2,
                new Instructor(0, "OnCaDo", "OnCaDo"));

        IEntitie egitmen1 = new Instructor(1, "OnCaDo", "OnCaDo");
        IEntitie egitmen2 = new Instructor(1, "Engin", "Demiroğ");

        BaseManager managerJdbc = new BaseManager(new JdbcDatabaseDal(), loggers);

        // ----------------------------------------------------------------

        // category
        System.out.println("--------------------------------");
        managerJdbc.add(kategori1, baseCategories);
        managerJdbc.add(kategori2, baseCategories);
        System.out.println("--------------------------------");
        // course
        managerJdbc.add(kurs1, baseCourses);
        managerJdbc.add(kurs2, baseCourses);
        System.out.println("--------------------------------");
        // instructor
        managerJdbc.add(egitmen1, baseInstructor);
        managerJdbc.add(egitmen2, baseInstructor);
        System.out.println("--------------------------------");
    }
}