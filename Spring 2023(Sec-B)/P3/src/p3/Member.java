package p3;

public class Member {

    private String name;
    private String specialization;
    private int projectWorked = 0;

    Member(String name) {
        this.name = name;
    }

    Member(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getProjectWorked() {
        return projectWorked;
    }

    public void setProjectWorked(int projectWorked) {
        this.projectWorked = projectWorked;
    }

    @Override
    public String toString() {
        return null;

    }

    public boolean addMember(Member m) {
        if (this.name.equals(m.name)&&this.specialization.equals(m.specialization)) {
            return true;
        } 
        else {
            return false;
        }
    }
    
    
}
