import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.SpringLayout.Constraints;
@SuppressWarnings("unused")

public class Desafios {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //Desafio 1 - Mostre a lista na ordem numérica:
        numeros.stream().sorted().forEach(System.out::println);

        //Desafio 2 - Imprima a soma dos números pares da lista:
        int total =numeros.stream().filter(n->n%2==0).reduce(0,(n1,n2)->n1+n2);
        System.out.println("Soma dos Pares: "+total);

        //Desafio 3 - Verifique se todos os números da lista são positivos:
        int somaPositivos = numeros.stream().filter(n-> n>=0).reduce(0,(n1,n2)->n1+n2);
        if(somaPositivos==total){System.out.println("Todos são positivos");}

        //Desafio 4 - Remova todos os valores ímpares:
        numeros.stream().filter(n -> n%2==0).forEach(System.out::println);

    }
}
