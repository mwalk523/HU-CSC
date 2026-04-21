public class Person
{
    //Parameters
    private int height;
    private int age;
    private String gender;
    private String name;

    //Constructors
    public Person()
    {
        height = 100;
        age = 21;
        name =  "Miles";
        gender = "male";
    }

    public Person(int h, int a, String g, String n)
    {
        height = h; 
        age = a;
        gender = g;
        name = n;
    }

    //Methods
    public int getHeight()
    {
        return height;
    }

    public int howOld()
    {
        return age;
    }

    public String who()
    {
        return name;
    }

    public String getGender()
    {
        return gender;
    }

    public String profile()
    {
        String prof = "Profile:\n\tName: " + name + 
        "\n\tHeight: " + height + 
        "\n\tAge: " + age +
        "\n\tGender: " + gender;

        return prof;
    }

    public void setHeight(int h)
    {
        height = h;
    }
}
