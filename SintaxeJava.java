
package sintaxe.java;

import java.util.Scanner;

        public class SintaxeJava {

   
    
    public static void main(String[] args) {
   
        
        
         Scanner leitor = new Scanner( System.in );
       
    /*Faça um algoritmo que receba dois números e exiba 
    o resultado da sua soma;*/  
 
    /* Faça um algoritmo que receba dois números e ao final mostre a soma, 
    subtração, multiplicação e a divisão dos dois números lidos;
    
    */

    System.out.println("Digite o primeiro número");
    float y = leitor.nextInt();
    
    System.out.println("Digite o segundo número");
    float x = leitor.nextInt();
    
    float resultadoSoma = (x + y);
    float resultadoSubtracao = (x - y);
    float resultadoDivisao = (x / y);
    float resultadoMultiplicacao = ( x * y);
    
    System.out.println ("O resultado é: " + "  " +resultadoSoma +"  " +resultadoSubtracao 
    +"  " +resultadoDivisao + "  " +resultadoMultiplicacao);/*
    
    

    /* Escreva um algoritmo para determinar o consumo médio de 
    um automóvel sendo fornecida a distância total percorrida pelo automóvel e 
    o total de combustível gasto; */
       
    
    System.out.println("Digite o total de combustível gasto pelo veículo:");
    float combustivelGasto = leitor.nextFloat();
    
    System.out.println("Digite a distância total percorrida pelo veículo:");
    float distancia = leitor.nextFloat();
    
    float consumoMedio = (distancia / combustivelGasto);
    
    System.out.println("seu consumo médio foi de" + "  " +consumoMedio + "  " 
    + "litros por km percorrido");
    
    
    
   /* Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores 
   de forma que a variável A passe a possuir o valor da variável B e a variável 
   B passe a possuir o valor da variável A. Apresentar os valores trocados; */

   
   
   float x = 0;
   
   
           
   System.out.println("Digite o valor para variável A");
   float a = leitor.nextInt();
   
   System.out.println("Digite o valor para variável B");
   float b = leitor.nextInt();
    
   x = a;
   a = b;
   b = x;
   x = 0;
 

   System.out.println( "o valor da variavel a é" +a);
   System.out.println( "o valor da variavel b é" +b); 
   System.out.println( "o valor da variavel x é" +x);
    
    
    };*/
        
    
    /* Escreva um algoritmo que leia o nome de um aluno e as notas das três 
       provas que ele obteve no semestre. No finalinformar o nome do aluno e a 
       sua média (aritmética);*/
    
       
       float contador = 0;
    
       System.out.println("Qual o nome do aluno?");
       String nomeAluno = leitor.nextLine();
       
      
       System.out.println("Qual a primeira nota do aluno?"); 
       float nota1 = leitor.nextFloat();
       contador ++;
       System.out.println("Qual a segunda nota do aluno?");   
       float nota2 = leitor.nextFloat();
       contador ++;
      
       System.out.println("Qual a segunda nota do aluno?");
       float nota3 = leitor.nextFloat();
       contador++;
       
       float resultado = (nota1 + nota2 +nota3) / contador;
       
       System.out.println("A média do aluno:" +nomeAluno + " " + "é:" +resultado);
    
       
       
       
        
       
       
       
    
    
    
    }      
        }
