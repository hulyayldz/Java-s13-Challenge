package employeeApp;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro) {
        this.id = id;
        this.name = name;
        this.giro = giro;
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

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        this.giro = giro > 0 ? giro : 0;
    }

    public void addEmploye(int index, String name) {
        if(developerNames[index] == null) {
            developerNames[index] = name;
        }else{
            System.out.println(developerNames[index] + " already exists");
        }
    }

    @Override
    public String toString() {
        return "Id: " + id + " Name: " + name + " Giro: " + giro;
    }
}

