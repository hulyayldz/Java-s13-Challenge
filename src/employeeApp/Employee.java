package employeeApp;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee(int id, String fullName, String email, String password){
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addHealthPlan(int index, String name) {
        if(healthPlans[index] == null){
            healthPlans[index] = name;
        }else{
            System.out.println("Index dolu!");
        }
    }

    @Override
    public String toString() {
        return "Id: " + id + " Full Name: " + fullName + " Email: " + email + " Password: " + password;
    }
}

// id, fullName, email, password

