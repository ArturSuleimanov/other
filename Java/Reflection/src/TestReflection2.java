import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;
public class TestReflection2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Scanner inp = new Scanner(System.in);
        Class class1 = Class.forName(inp.next());   //get class by it's name
        Class class2 = Class.forName(inp.next());
        String methodName = inp.next(); //get method name
        Method m = class1.getMethod(methodName, class2);  //get method by it's signature
        Object o1 = class1.newInstance();
        Object o2 = class2.getConstructor(String.class).newInstance("MY string");
        m.invoke(o1, o2);  //calls m method for object o1 , with parameter o2
        System.out.println(o1);

    }



}
