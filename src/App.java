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
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("//CONSUMER--------------------------------------------------------");
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,12,13,14);
        numeros.stream()
            .filter(n -> n%2==0)
            .forEach(System.out::println);
       
        System.out.println("//SUPLIER--------------------------------------------------------");
        Supplier<String> saudacao = () -> "Olá";

        List<String> saudacoes = Stream.generate(()-> "Olá")  
            .limit(5)
            .collect(Collectors.toList());
        saudacoes.forEach(System.out::println);

        System.out.println("//FUNCTION------------------------------------------------------");
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        Function<Integer,Integer> dobrar = num -> num*2;

        List<Integer> numsDobrados = nums.stream()
            /*.map(new Function<Integer,Integer>(){
                public Integer apply(Integer n){
                    return n*2;
                }
            RESUMINDO*/
            .map(n -> n*2)
            .collect(Collectors.toList());
        
        numsDobrados.forEach(System.out::println);
        
        System.out.println("//PREDICATE------------------------------------------------");
        List<String> nomes = Arrays.asList("jonas","Rafael","silva","cavalcanti");
        //Predicate<String> teste = palavra -> palavra.length()>6;
        //Resumido a (palavra -> palavra.length()>5)
        nomes.stream()
                .filter(palavra -> palavra.length()>5)
                .forEach(System.out::println);  

        System.out.println("//BINARY_OPERATOR--------------------------------------------");
        //BinaryOperator<Integer> somar = (num1,num2) -> num1 + num2;
        //Resumindo a  (num1,num2)->num1+num2
        List<Integer> lista = Arrays.asList(1,2,3,4,5);
        int total = lista.stream().reduce(0, (num1,num2)->num1+num2);
        System.out.println(total);
            
    }
}
