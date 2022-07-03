import java.text.DecimalFormat;

public class CalculadoraSimples {
    public void somar(double numero1, double numero2){
        double resultado;
        resultado = numero1 + numero2;
        System.out.println(resultado);


    }
    public void subtrair(double numero1, double numero2){
        double resultado;
        resultado = numero1 - numero2;
        System.out.println(resultado);
    }
    public void multiplicar(double numero1, double numero2){
        double resultado;
        resultado = numero1 * numero2;
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(df.format(resultado));

    }
    public void dividir(double numero1, double numero2){
        double resultado;
        resultado = numero1 / numero2;
        DecimalFormat df = new DecimalFormat("#.000000");
        System.out.println(df.format(resultado));
    }
    public void Imc(double peso, double altura){
        double resultado;
        DecimalFormat df= new DecimalFormat("#.000");
        resultado = peso / (altura*altura);
        if(resultado <18.5){
            System.out.println(df.format(resultado));
            System.out.println("Abaixo do peso");
        }
        if(resultado >= 18.5 && resultado <=24.9){
            System.out.println(df.format(resultado));
            System.out.println("Peso normal");
        }
        if(resultado >=25 && resultado <=29.9){
            System.out.println(df.format(resultado));
            System.out.println("Sobrepeso");
        }
        if(resultado >=30 && resultado <= 34.9){
            System.out.println(df.format(resultado));
            System.out.println("Obesidade grau 1");
        }
        if(resultado >=35 && resultado <=39.9){
            System.out.println(df.format(resultado));
            System.out.println("Obesidade grau 2");
        }
        if(resultado >=40){
            System.out.println(df.format(resultado));
            System.out.println("Obesidade morbida");
        }
    }
    public void Detran(int idade){
        if(idade <18){
            System.out.print(idade+" anos.");
            System.out.println("Nao pode dirigir");
        }
        if(idade >=18 && idade <=75){
            System.out.print(idade+" anos.");
            System.out.println("Pode dirigir");
        }
        if(idade >75){
            System.out.print(idade+" anos.");
            System.out.println("Pode dirigir com restricoes");
        }

    }

}
