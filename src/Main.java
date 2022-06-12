public class Main
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 1; i++)
        {
            System.out.println("Hello world!");
        }

        for (int i = 0; i < 1; i++)
        {
            System.out.println("Hello world!");
        }

        Person person = new Person();

        person.setAge(10);
        person.setName("Kiss Ernő");

        person.setName("Nagy Ervin");

        System.out.printf("Sziaaaaaa %s", person.getName());
    }
}