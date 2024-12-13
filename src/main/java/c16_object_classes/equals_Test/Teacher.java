package c16_object_classes.equals_Test;

import java.util.Objects;


public class Teacher {
    // 필드 설정
    private String name;
    private String schoolName;

    // AllArgs
    public Teacher(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

    // getter setter
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // toString Override
    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
    // equals  hashCode override

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        c16_object_classes.Teacher teacher = (c16_object_classes.Teacher) o;
        return Objects.equals(name, teacher.getName()) && Objects.equals(schoolName, teacher.getSchoolName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, schoolName);
    }
}
