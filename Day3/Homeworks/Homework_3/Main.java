package Homeworks.Homework_3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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
                // definitions ---------------------------------

                List<ILoggerBase> loggers = Arrays.asList(
                                new FileLogger(),
                                new EmailLogger());

                BaseManager managerJDBC = new BaseManager(new JdbcDatabaseDal(), loggers);

                List<IEntitie> baseCategories = Arrays.asList(
                                new Category(0, "Programlama"));

                List<IEntitie> baseInstructor = Arrays.asList(
                                new Instructor(0, "Engin", "Demiroğ"));

                List<IEntitie> baseCourses = Arrays.asList(
                                new Course(0, "Java Kampı", "Java Yazılım Geliştirici Kampı",
                                                baseCategories.get(0), baseInstructor.get(0)));

                IEntitie kategori1 = new Category(1, "Kategori 1");
                IEntitie kategori2 = new Category(2, "Programlama");

                IEntitie egitmen1 = new Instructor(1, "OnCaDo", "OnCaDo");
                IEntitie egitmen2 = new Instructor(2, "Engin", "Demiroğ");

                IEntitie kurs1 = new Course(1, "Python", "Python Kampı", kategori1, egitmen1);
                IEntitie kurs2 = new Course(2, "Java Kampı", "Java Yazılım Geliştirici Kampı", kategori2, egitmen2);

                // tests -------------------------------------------

                System.out.println("--------------------------------");
                // category
                managerJDBC.add(kategori1, baseCategories);
                managerJDBC.add(kategori2, baseCategories);
                System.out.println("--------------------------------");
                // course
                managerJDBC.add(kurs1, baseCourses);
                managerJDBC.add(kurs2, baseCourses);
                System.out.println("--------------------------------");
                // instructor
                managerJDBC.add(egitmen1, baseInstructor);
                managerJDBC.add(egitmen2, baseInstructor);
                System.out.println("--------------------------------");

        }
}