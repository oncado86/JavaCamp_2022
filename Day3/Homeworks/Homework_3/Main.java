package Homeworks.Homework_3;

import java.util.Arrays;
import java.util.List;

import Homeworks.Homework_3.business.BaseManager;
import Homeworks.Homework_3.business.CourseManager;
import Homeworks.Homework_3.core.logger.EmailLogger;
import Homeworks.Homework_3.core.logger.FileLogger;
import Homeworks.Homework_3.core.logger.ILoggerBase;
import Homeworks.Homework_3.dataAccess.HipernateDatabaseDal;
import Homeworks.Homework_3.dataAccess.JdbcDatabaseDal;
import Homeworks.Homework_3.entities.Category;
import Homeworks.Homework_3.entities.Course;
import Homeworks.Homework_3.entities.IEntitie;
import Homeworks.Homework_3.entities.Educator;

public class Main {

        public static void main(String[] args) {
                // definitions ---------------------------------

                List<ILoggerBase> loggers = Arrays.asList(
                                new FileLogger(),
                                new EmailLogger());

                BaseManager managerJDBC = new BaseManager(new JdbcDatabaseDal(), loggers);
                CourseManager courseManagerHipernate = new CourseManager(new HipernateDatabaseDal(), loggers);

                List<IEntitie> baseCategories = Arrays.asList(
                                new Category(0, "Programlama"));

                List<IEntitie> baseInstructor = Arrays.asList(
                                new Educator(0, "Engin", "Demiroğ"));

                List<IEntitie> baseCourses = Arrays.asList(
                                new Course(0, "Java Kampı", "Java Yazılım Geliştirici Kampı",
                                                baseCategories.get(0), baseInstructor.get(0), 1000));

                IEntitie kategori1 = new Category(1, "Kategori 1");
                IEntitie kategori2 = new Category(2, "Programlama");

                IEntitie egitmen1 = new Educator(1, "OnCaDo", "OnCaDo");
                IEntitie egitmen2 = new Educator(2, "Engin", "Demiroğ");

                Course kurs1 = new Course(1, "Python", "Python Kampı", kategori1, egitmen1, 1000);
                Course kurs2 = new Course(2, "Java Kampı", "Java Yazılım Geliştirici Kampı", kategori2, egitmen2,
                                1000);
                Course kurs3 = new Course(3, "Python", "Python Kampı", kategori1, egitmen1, -1000);

                // tests -------------------------------------------

                System.out.println("--------------------------------\nCategory Tests:");
                // category
                managerJDBC.add(kategori1, baseCategories);
                managerJDBC.add(kategori2, baseCategories);
                System.out.println("--------------------------------\nCourse Tests:");
                // course
                courseManagerHipernate.add(kurs1, baseCourses);
                courseManagerHipernate.add(kurs2, baseCourses);
                courseManagerHipernate.add(kurs3, baseCourses);
                System.out.println("--------------------------------\nInstructor Tests:");
                // instructor
                managerJDBC.add(egitmen1, baseInstructor);
                managerJDBC.add(egitmen2, baseInstructor);
                System.out.println("--------------------------------");

        }
}