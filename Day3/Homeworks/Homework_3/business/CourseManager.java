package Homeworks.Homework_3.business;

import java.util.List;

import Homeworks.Homework_3.core.logger.ILoggerBase;
import Homeworks.Homework_3.dataAccess.IDalBase;
import Homeworks.Homework_3.entities.Course;
import Homeworks.Homework_3.entities.IEntitie;

public class CourseManager extends BaseManager {

    public CourseManager(IDalBase dalBase, List<ILoggerBase> loggers) {
        super(dalBase, loggers);
    }

    public void add(Course course, List<IEntitie> baseEntities) {
        if (!isCategoryOnTheList(course.getName(), baseEntities)) {
            if (course.getCourseFee() > 0) {
                dalBase.add(course);
                for (ILoggerBase logger : loggers) {
                    logger.log(course.getName());
                }
            } else {
                System.out.println("Course fee cannot be less than 0!");
            }

        } else
            System.out.println(String.format("This category already exists!: '%s'", course.getName()));
    }

}
