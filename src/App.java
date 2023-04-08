import java.util.Scanner;
class Main{
public static void main(String[] args){
//Passo1:Mostrar variaveis
double nota1;
double nota2;
double nota3;
double nota4;
double totaldenotas;
double media;
//Passo2:Entrada de dados
Scanner teclado = new Scanner(System.in);
  System.out.println("Quais são as 4 notas");
    nota1 = teclado.nextDouble();
  nota2 = teclado.nextDouble();
    nota3 = teclado.nextDouble();
  nota4 = teclado.nextDouble();
//Passo3:Mostrar total de notas e media
  totaldenotas = nota1 + nota2 + nota3 + nota4;
media = totaldenotas / 4;
//Passo4:Mostrar resultado
System.out.println ("Soma das 4 notas é :" + totaldenotas);
System.out.println ("Média das 4 notas é :" + media);
}
}