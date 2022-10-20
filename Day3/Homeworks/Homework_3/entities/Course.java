package Homeworks.Homework_3.entities;

public class Course implements IEntitie {
    private int id;
    private int courseFee;    

    private String name;
    private String description;
    private IEntitie category;
    private IEntitie instructor;
    // private Instructor instructor;

    public Course() {
    }

    public Course(int id, String name, String description, IEntitie category, IEntitie instructor, int courseFee) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.instructor = instructor;
        this.courseFee = courseFee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public IEntitie getCategory() {
        return category;
    }

    public void setCategory(IEntitie category) {
        this.category = category;
    }

    public IEntitie getInstructor() {
        return instructor;
    }

    public void setInstructor(IEntitie instructor) {
        this.instructor = instructor;
    }

    public int getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(int courseFee) {
        this.courseFee = courseFee;
    }

}
