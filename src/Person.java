public interface Person {
    public void Setinfo();
}

class Student implements Person {
    private int ID;
    private String Name;
    private String Surname;
    private int Age;

    public Student( int ID, String Name, String Surname, int Age ) {
    }

    @Override
    public void Setinfo() {
        System.out.println("ID = " + ID + "Name: " + Name + "Surname: " + Surname + "Age: " + Age);
    }
}

class Employee implements Person {
    private String Name;
    private String Surname;
    private int Age;

    public Employee(String Name, String Surname, int Age) {}

    @Override
    public void Setinfo() {
        System.out.println("Name = " + Name + "Surname: " + Surname + "Age: " + Age);
    }
}