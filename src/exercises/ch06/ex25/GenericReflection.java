package exercises.ch06.ex25;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericReflection {
    public static void main(String[] args) throws ReflectiveOperationException {

        Method m = Collections.class.getMethod("sort", List.class);

        TypeVariable<Method>[] typeParameters = m.getTypeParameters();
        String name = typeParameters[0].getName(); // "T"
        System.out.println("typeParameters[0].getName(): " + name);

        Type[] typeParameterBounds = typeParameters[0].getBounds();
        if (typeParameterBounds[0] instanceof ParameterizedType) { // Comparable<? super T>
            ParameterizedType typeParameterBound_ParameterizedType = (ParameterizedType) typeParameterBounds[0];

            System.out.println("typeParameterBound_ParameterizedType.getTypeName(): " + typeParameterBound_ParameterizedType.getTypeName());

            Type[] typeArguments = typeParameterBound_ParameterizedType.getActualTypeArguments();

            if (typeArguments[0] instanceof WildcardType) { // ? super T
                WildcardType typeArgument_WildcardType = (WildcardType) typeArguments[0];
                Type[] typeArgumentUpperBound = typeArgument_WildcardType.getUpperBounds(); // ? extends ... & ...
                Type[] typeArgumentLowerBound = typeArgument_WildcardType.getLowerBounds(); // ? super ... & ...
                if (typeArgumentLowerBound.length > 0) {
                    String typeArgumentLowerBoundName = typeArgumentLowerBound[0].getTypeName(); // "T"
                    System.out.println("typeArgumentLowerBoundName: " + typeArgumentLowerBoundName);
                }
                if (typeArgumentUpperBound.length > 0) {
                    String typeArgumentUpperBoundName = typeArgumentUpperBound[0].getTypeName(); // "T"
                    System.out.println("typeArgumentUpperBoundName: " + typeArgumentUpperBoundName);
                }
            }
        }

        Class<?>[] parameterTypes = m.getParameterTypes();
        Type[] genericParameterTypes = m.getGenericParameterTypes();
        for (int i = 0; i < parameterTypes.length; i++) {
            System.out.println("parameterTypes[" + i + "]: " + parameterTypes[i]);
            System.out.println("genericParameterTypes[" + i + "]: " + genericParameterTypes[i]);
        }
    }
}