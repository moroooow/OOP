import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;

public class Main {
    private final static int MAX_INT=1000;
    private final  static double MAX_DOUBLE=1000;
    private final static long MAX_LONG=10000;
    private final static int MAX_STRING_LEN=100;

    public static void main(String[] args)  {
        Class<TestClass> testClass=TestClass.class;
        Method[] methods = testClass.getDeclaredMethods();
        for(Method method : methods)
        {
            if(!method.isAnnotationPresent(Attached.class))
            {
                continue;
            }
            Attached annotation=method.getAnnotation(Attached.class);
            for(int i = 0; i<annotation.count() ;i++)
            {
                try
                {
                    method.setAccessible(true);
                    Class<?>[] params=method.getParameterTypes();
                    Object[] obj = new Object[method.getParameterCount()];
                    setRandomParams(params,obj);
                    method.invoke(testClass.newInstance(),obj);
                }
                catch (InvocationTargetException | IllegalAccessException | InstantiationException e)
                {
                    System.err.println(e.getMessage());
                }
            }
        }
    }
    private static void setRandomParams(Class<?>[] params,Object[] objects)
    {
        Random rand = new Random();
        for(int i = 0;i<params.length; i ++)
        {
            switch (params[i].toString())
            {
                case("int"):
                    objects[i] = rand.nextInt(MAX_INT);
                    break;
                case ("byte"):
                    objects[i] = (byte) rand.nextInt(MAX_INT);
                    break;
                case("float"):
                    objects[i] = rand.nextFloat(MAX_INT);
                    break;
                case("long"):
                    objects[i] = rand.nextLong(MAX_LONG);
                    break;
                case("double"):
                    objects[i] = rand.nextDouble(MAX_DOUBLE);
                    break;
                case("short"):
                    objects[i] = (short)rand.nextInt(MAX_INT);
                    break;
                case ("char"):
                    objects[i] =(char)(rand.nextInt(25)+'a');
                    break;
                case("boolean"):
                    objects[i]= rand.nextBoolean();
                    break;
                case("class java.lang.String"):
                    objects[i] = getRandomString();
                    break;
                default:
                    objects[i]=null;
                    break;
            }
        }
    }
    private static String getRandomString()
    {
        Random rand = new Random();
        int length = rand.nextInt(MAX_STRING_LEN);
        String str = "";
        for(int i = 0; i < length;i++)
        {
            str +=((char) (rand.nextInt(25) + 'a'));
        }
        return str;
    }
}
