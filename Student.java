/**
 * Student
 */
public class Student {
    private int id;
    private String name, lastname;
    private String password;
    public Student () {
        this(0,"","","");
    }

    public Student(int id, String name, String lastname, String password)
    {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.password = password;
    }

    public int getId()
    {
        return this.id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
      this.name = name;
    }

    public String getLastname()
    {
        return this.lastname;
    }

    public String getPassword()
    {
        return this.password;
    }
}
