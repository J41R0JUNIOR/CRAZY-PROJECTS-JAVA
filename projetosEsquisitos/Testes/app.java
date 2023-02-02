package Testes;
public class app {
    public static void main(String[] args)throws Exception{
        System.out.println("Hello, World!!!");

        int numero = -10;
        String resultado = "";
        if(numero >= 0){
            resultado = "Positivo meu patrão o número é maior que 0!!!";
        }else{
            resultado = "Negativo meu patrão o número não é maior que 0!!!";
        }
        System.out.println("Meu patrão, seguinte, tú quer saber se o número e maior ou igual a 0 : "+resultado);

    }
}
