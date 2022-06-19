import java.util.ArrayList;


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

        ArrayList<Integer> myList = new ArrayList<>();

        Person person = new Person();

        person.setAge(10);
        person.setName("Kiss Ernő");

        person.setName("Nagy Ervin");

        System.out.printf("Sziaaaaaa %s\n", person.getName());


        StringBuilder sb = new StringBuilder();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000;i++)
        {
            sb.append(i);
        }
        sb.append("\n");

        long finish = System.currentTimeMillis();

        System.out.printf("String Bulder Time: %f\n", (double)(finish - start) / 1000);

        String st = "";

        start = System.currentTimeMillis();
        for (int i = 0; i < 100000;i++)
        {
            st += i;
        }
        st += '\n';

        finish = System.currentTimeMillis();

        System.out.printf("String Concat. Time: %f\n", (double)(finish - start) / 1000);


        int count = 0;

        String[][] things = {
                                {"scarf", "gloves", "hat"},
                                {"shoes", "shirt", "pants"}
                            };

        for (int r = 0; r < things.length; r++)
        {
            for (int c = 0; c < things[r].length - 1; c++)
            {
                if (things[r][c].indexOf("a") >= 0)
                {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}