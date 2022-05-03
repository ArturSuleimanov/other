import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestReflection1 {
    public static void main(String[] args) {
        Class personClass = Person.class;

        Method[] methods = personClass.getMethods();
        for(Method method: methods) {
            System.out.println(method.getName() + " " + method.getReturnType() + " " + Arrays.toString(method.getParameterTypes()));
        }


        Field[] fields = personClass.getDeclaredFields();
        for(Field field: fields) {
            System.out.println(field.getName() + " " + field.getType());
        }



    }
}
