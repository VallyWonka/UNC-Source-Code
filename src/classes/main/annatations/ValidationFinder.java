package classes.main.annatations;

import classes.main.annatations.validation.Validation;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ValidationFinder {
    private static Set<Class> findAllClassesUsingClassLoader(String packageName) {
        InputStream stream = ClassLoader.getSystemClassLoader()
                .getResourceAsStream(packageName.replaceAll("[.]", "/"));
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        return reader.lines()
                .filter(line -> line.endsWith(".class"))
                .map(line -> getClass(line, packageName))
                .collect(Collectors.toSet());
    }

    private static Class getClass(String className, String packageName) {
        try {
            return Class.forName(packageName + "."
                    + className.substring(0, className.lastIndexOf('.')));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Validation> getAllValidations(String packageName) throws IllegalAccessException, InstantiationException, NoSuchFieldException {
        List<Validation> result = new ArrayList<>();

        Set<Class> classes = ValidationFinder.findAllClassesUsingClassLoader(packageName);
        for (Class clazz : classes){

            if (clazz.getSuperclass() != null && Arrays.asList(clazz.getSuperclass().getInterfaces()).contains(Validation.class) && !clazz.getName().contains("Abstract")){
                Object object  = clazz.newInstance();

                Field field = clazz.getSuperclass().getDeclaredField("filed1");
                field.setAccessible(true);
                field.setInt(object, 10);

                result.add((Validation) clazz.newInstance());
            }
        }
        return result;
    }


}
