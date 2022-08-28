import java.util.Scanner;
public  class Main{

public static void main(String[] args) {

	public static void main(String[] args) public static void main(String[] args) {

        /*exercício 1

import java.util.Scanner;

public  class Main{

public static void main(String[] args) {
			float terrenoFrente, terrenoLateral,valorMetroQuadrado,area,valorTotal;
		
        Scanner teclado = new Scanner(System.in);
		
        System.out.print("Quantos metros o terreno possui de frente:");
		terrenoFrente = teclado.nextFloat();
		
        System.out.print("Quantos metros o terreno possui de lateral:");
		terrenoLateral = teclado.nextFloat();
		
        System.out.print("Informe o valor do metro quadrado:");
		valorMetroQuadrado = teclado.nextFloat();
		
        area = terrenoFrente * terrenoLateral;
		System.out.printf("Área total do terreno de %.2f mts de frente com %.2f mts de lateral é: %.2f \n", terrenoFrente, terrenoLateral, area);
		
        valorTotal=area*valorMetroQuadrado;
		System.out.printf("O valor deste terreno é : R$ %.2f", valorTotal);
    }
 
}*/

    /*exercício 2

import java.util.Scanner;

public  class Main{

public static void main(String[] args) {
		float  salarioMinimo, salarioFuncionario, salariorecebidos;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o valor do salario mínimo:");
		salarioMinimo = teclado.nextFloat();
		
		System.out.print("Informe o valor do salario do funcionário:");
		salarioFuncionario = teclado.nextFloat();
		
		salariorecebidos = salarioFuncionario/salarioMinimo;
		System.out.printf("O funcionário recebe %.2f salários mínimos!", salariorecebidos); }
 
}*/

        /*exercício 3

import java.util.Scanner;

public  class Main{

public static void main(String[] args) {
			float  nota1, nota2, nota3, mediaPonderada;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe a nota 1: ");
		nota1 = teclado.nextFloat();
		
		System.out.print("Informe a nota 2: ");
		nota2 = teclado.nextFloat();
		
		System.out.print("Informe a nota 3: ");
		nota3 = teclado.nextFloat();
		
		mediaPonderada = (nota1 + (nota2 * 2) + (nota3 * 3))/6;
		System.out.printf("A média ponderada das notas %.1f, %.1f, %.1f é: %.2f", nota1, nota2, nota3, mediaPonderada);
         }
 
}*/

         /*exercício 4

import java.util.Scanner;

public  class Main{

public static void main(String[] args) {
			 int numTabuada, resultadoMais, resultadoMenos, resultadoVezes;
	float resultadoDivi;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o número para o cálculo da tabuada: ");
		numTabuada = teclado.nextInt();
		
		
		System.out.println("\nTabuada do + e - para o número " + numTabuada + ":");
		for (int i = 0; i<10;i++)public static void main(String[] args) {

		    resultadoMais = numTabuada + i;
		    resultadoMenos = Math.abs(numTabuada - i);
		    System.out.print(numTabuada + " + " + i + " = " + resultadoMais + "   ");
		    System.out.print(numTabuada + " - " + i + " = " + resultadoMenos + "\n");
		    
		}
		System.out.println("\nTabuada do * e / para o número " + numTabuada + ":");
		for (int x = 0; x<10;x++)public static void main(String[] args) {

		    resultadoVezes = numTabuada * x;
		    System.out.print(numTabuada + " * " + x + " = " + resultadoVezes +  "   ");
		    if(x!=0)public static void main(String[] args) {

		        resultadoDivi = numTabuada / (float) x;
		        System.out.printf(numTabuada + " / " + x + " = %.2f \n",resultadoDivi);
		    }elsepublic static void main(String[] args) {

		        System.out.print(numTabuada + " / " + x + " = não existe divisão por zero" + "\n");
		}
		}
        }
 
}*/

/*exercício 5

import java.util.Scanner;

public  class Main{

public static void main(String[] args) {
	int valor1, valor2;
	float resultadoDivi;
		
	Scanner teclado = new Scanner(System.in);
	
	System.out.print("Informe o valor 1: ");
	valor1 = teclado.nextInt();
	
	System.out.print("Informe o valor 2: ");
	valor2 = teclado.nextInt();
	
	
	if(valor2!=0)public static void main(String[] args) {

	    resultadoDivi = valor1/(float)valor2;
	    System.out.printf("A divisão de " + valor1 + " por " + valor2 + " é %.2f ", resultadoDivi);
	};
}
 
}*/

/*exercício 6

import java.util.Scanner;

public  class Main{

public static void main(String[] args) {
	int quantDeCavalos, quantFerraNeces;
	float valorFerradura, valorTotal;
	
	Scanner teclado = new Scanner(System.in);
	
	System.out.print("Informe a quantidade de cavalos: ");
	quantDeCavalos = teclado.nextInt();
	
	System.out.printf("Informe o valor de cada ferradura R$: "); 
	valorFerradura = teclado.nextFloat();
	
	quantFerraNeces = quantDeCavalos * 4;
	System.out.println("\nA quantidade de ferraduras necessárias é: " + quantFerraNeces);
	
	valorTotal = valorFerradura * quantFerraNeces;
	System.out.printf("Valor total para a compra das ferraduras: R$ %.2f", valorTotal);
	
 }
 
}*/

 /*exercício 7

import java.util.Scanner;

public  class Main{

public static void main(String[] args) {
	 int peso;
	
	Scanner teclado = new Scanner(System.in);
	
	System.out.print("Informe o peso em KG: ");
	peso = teclado.nextInt();
	
	System.out.println("Caso a pessoa engorde 15% ficaria com: " + peso*1.15f + " KG");
	System.out.print("Caso a pessoa emagrecer 20% ficaria com: " + peso*0.80f + " KG");
	  
}
 
}*/

/*exercício 8

import java.util.Scanner;

public  class Main{

public static void main(String[] args) {
	float salarioInicial, salarioReajustado, descontoInss, descontoFgts, totalDescontos, salarioFinal;
	
	Scanner teclado = new Scanner(System.in);
	
	System.out.print("Informe o salário: ");
	salarioInicial = Math.round(teclado.nextFloat());
	
	System.out.printf("\nSalário inicial: %.2f",salarioInicial);
	
	salarioReajustado = salarioInicial*1.15f;
	System.out.printf("\nSalário Reajustado: %.2f" ,salarioReajustado);
	
	descontoInss = salarioReajustado * 0.11f;
	System.out.printf("\nDesconto de 11%% de INSS: %.2f",descontoInss);
	
	descontoFgts = salarioReajustado * 0.08f;
	System.out.printf("\nDesconto de 8%% de FGTS: %.2f", descontoFgts);
	
	totalDescontos = descontoInss + descontoFgts;
	System.out.printf("\nTotal de descontos de INSS + FGTS: %.2f", totalDescontos);
	
	salarioFinal = salarioReajustado - totalDescontos;
	System.out.printf("\nSalário Final: %.2f", salarioFinal);
 }
 
}*/

/*exercício 9

import java.util.Scanner;

public  class Main{

public static void main(String[] args) {
	int baseMaior,baseMenor,alturaTrapezio,ladoQuadrado,alturaRetangulo,larguraRetangulo, raioCirc, baseTriangulo, alturaTriangulo;
	float areaTrapezio,areaRetangulo,areaTriangulo;
	double areaCirc, areaQuadrado;
	
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Área do trapézio:");
	
	System.out.print("Informe o valor da base maior: ");
	baseMaior = teclado.nextInt();
	
	System.out.print("Informe o valor da base menor: ");
	baseMenor = teclado.nextInt();
	
	System.out.print("Informe o valor da altura: ");
	alturaTrapezio = teclado.nextInt();
	
	areaTrapezio = ((baseMaior + baseMenor)*alturaTrapezio)/2;
	System.out.printf("A área do trapézio é: %.2f\n\n", areaTrapezio);
	
	System.out.println("Área do quadrado:");
	
	System.out.print("Informe o valor de um dos lados: ");
	ladoQuadrado = teclado.nextInt();
	
	areaQuadrado = Math.pow(ladoQuadrado,2);
	System.out.printf("A área do quadrado é: %.2f\n\n",areaQuadrado);
	
	System.out.println("Área do retângulo:");
	
	System.out.print("Informe o valor da largura: ");
	larguraRetangulo = teclado.nextInt();
	
	System.out.print("Informe o valor da base menor: ");
	alturaRetangulo = teclado.nextInt();
	
	areaRetangulo = larguraRetangulo * alturaRetangulo;
	System.out.printf("A área do retângulo é: %.2f\n\n",areaRetangulo);
	
	System.out.println("Área do círculo:");
	
	System.out.print("Informe o valor do raio: ");
	raioCirc = teclado.nextInt();
	
	areaCirc = Math.PI * Math.pow(raioCirc, 2) ;
	System.out.printf("A área do círculo é: %.2f\n\n",areaCirc);
	
	System.out.println("Área do triângulo:");
	
	System.out.print("Informe o valor da base: ");
	baseTriangulo = teclado.nextInt();
	
	System.out.print("Informe o valor da altura: ");
	alturaTriangulo = teclado.nextInt();
	
	areaTriangulo = (baseTriangulo * alturaTriangulo)/2f;
	System.out.printf("A área do triângulo é: %.2f",areaTriangulo);
 }
 
}*/

 /*exercício 10
 import java.util.Scanner;

public  class Main{

public static void main(String[] args) {

    int anoInicial, anoFinal, idadeAnos;
	
	Scanner teclado = new Scanner(System.in);
	
	System.out.print("Digite o ano inicial: ");
	anoInicial = teclado.nextInt();
	
	System.out.print("Digite o ano final: ");
	anoFinal = teclado.nextInt();
	
	idadeAnos = anoFinal - anoInicial;
	System.out.println("\nA idade dessa pessoa em"); 
	System.out.println("anos é: " + idadeAnos);
	System.out.println("meses é: " + idadeAnos * 12);
	System.out.println("dias e: " + idadeAnos * 360);
	System.out.print("semanas e: " + idadeAnos * 12 * 4);
}
 
}*/

/*exercício 11
import java.util.Scanner;

public  class Main{

public static void main(String[] args) {

 		int qtdSuco;
		double litrosAgua, litrosSucoConc;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de litros de suco necessária: ");
		qtdSuco = teclado.nextInt();
		
		System.out.println("\nSerá necessário para fazer " + qtdSuco + " litros de suco de maracujá:");
	    
	    litrosAgua = (qtdSuco*4)/5f;
	    System.out.printf("\n%.2f litros de água",litrosAgua);
	    
	    litrosSucoConc = qtdSuco/5f;
	    System.out.printf("\n%.2f litros de suco concentrado de maracujá", litrosSucoConc);
}
 
}*/

/*exercício 12
import java.util.Scanner;

public  class Main{

public static void main(String[] args) {


	int qtdeFrango;
		double valorTotal;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de frangos: ");
		qtdeFrango = teclado.nextInt();
		
		//valorTotal = 2*qtdeFrango*3.5 + qtdeFrango*4
		  valorTotal = qtdeFrango(2*3.5 + 4)//
		  
		valorTotal = qtdeFrango*11f;
		  System.out.printf("\n O valor total para identificar os frangos é: R$ %.2f", valorTotal);
 }
 
}*/

/*exercício 13
import java.util.Scanner;

public  class Main{

public static void main(String[] args) {

		int qtdLatas, qtdGarrafasMl, qtdGarrafasLitros;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de latas de 350ml: ");
		qtdLatas = teclado.nextInt();
		
		System.out.print("Digite a quantidade de garrafas de 600ml: ");
		qtdGarrafasMl = teclado.nextInt();
		
		System.out.print("Digite a quantidade de garrafas de 2l: ");
		qtdGarrafasLitros = teclado.nextInt();
		
		System.out.print("A quantidade total de litros é: " + ((qtdLatas*350) + (qtdGarrafasMl * 600) + (qtdGarrafasLitros * 2000))/1000);
 }
 
}*/

/*exercício 14
import java.util.Scanner;

public  class Main{

public static void main(String[] args) {

		int qtdeSanduiches;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de sanduíches: ");
		qtdeSanduiches = teclado.nextInt();
		
		System.out.println("\nPara produzir " + qtdeSanduiches + " sanduíches serão necessários:");
		
		System.out.println((100*qtdeSanduiches)/1000f + " kg de mussarela");
		
		System.out.println((50*qtdeSanduiches)/1000f + " kg de presunto");
		
		System.out.println((120*qtdeSanduiches)/1000f + " kg de hamburguer");
 }
 
}*/

/*exercício 15
import java.util.Scanner;

public  class Main{

public static void main(String[] args) {

  int qtdHorasNormais,qtdHorasExtras,qtdDependentesMenores;
	    double valorHorasNormais, valorHorasExtras, valorDependentes, salarioLiquido, salarioFinal;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a quantidade total de horas normais: ");
		qtdHorasNormais = teclado.nextInt();
		
		System.out.print("Digite a quantidade total de horas extras: ");
		qtdHorasExtras = teclado.nextInt();
		
		System.out.print("Digite a quantidade total de dependentes menores que 6 anos: ");
		qtdDependentesMenores = teclado.nextInt();
		
		valorHorasNormais = qtdHorasNormais * 10;
		System.out.printf("\nHoras normais: R$ %.2f",valorHorasNormais);
		
		valorHorasExtras = qtdHorasExtras * 15f;
		System.out.printf("\nAdicional de Horas Extras: R$ %.2f", valorHorasExtras);
		
		valorDependentes = qtdDependentesMenores * 90f;
		System.out.printf("\nAdicional de Dependentes: R$ %.2f", valorDependentes);
		
		salarioLiquido = valorHorasNormais * 0.89;
		System.out.printf("\nSalário Líquido (horas normais - desconto: R$ %.2f", salarioLiquido);
		
		salarioFinal = salarioLiquido + valorHorasExtras + valorDependentes;
		System.out.printf("\nSalário final: R$ %.2f",salarioFinal);
 }
 
}*/

/*exercício 16
 import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o valor do faturamento anterior: ");
		double faturamentoAnterior = teclado.nextDouble();
		
		double meta = faturamentoAnterior * 1.2;
		System.out.printf("\nA meta do próximo mês é: R$ %.2f",meta);
		
		double aumento = meta - faturamentoAnterior;
		System.out.printf("\nUm aumento de R$ %.2f", aumento);
		
		System.out.println("\nQuantidade de peças a serem vendidas para atingir a meta:");
		
		double produto1 = aumento/150;
		System.out.printf("\nProduto 1: %.2f peças", produto1);
		
		double produto2 = aumento/220;
		System.out.printf("\nProduto 2: %.2f peças", produto2);
		
		double produto3 = aumento/97;
		System.out.printf("\nProduto 3: %.2f peças", produto3);
		
}

}
 */

 /*exercício 17 
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a quantidade de pães vendidos: ");
		int paesVendidos = teclado.nextInt();
		
		System.out.print("Digite a quantidade de broas vendidas: ");
		int broasVendidas = teclado.nextInt();
		
		System.out.print("Digite o valor da reforma: ");
		double valorReforma = teclado.nextDouble();
		
		double valorBroas = broasVendidas * 1.6f;
		System.out.printf("Faturamento com a venda de broas: R$ %.2f", valorBroas);
		
		double valorPaes = paesVendidos * 0.12f;
		System.out.printf("\nFaturamento com a venda de pães: R$ %.2f", valorPaes);
		
		double faturaDiario = valorBroas + valorPaes;
		System.out.printf("\nFaturamento diário (pães + broas): R$ %.2f", faturaDiario);
		
		double deposito = faturaDiario * 0.1f;
		System.out.printf("\nValor do depósito na poupança: R$ %.2f", deposito);
		
		double diasPagar = Math.ceil(valorReforma/deposito);
		System.out.printf("\nPara pagar a reforma serão necessários: %.2f dias", diasPagar);
	}
}

 */

/*exercício 18
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o valor da conta R$: ");
		double valorConta = teclado.nextDouble();
		int valordividido = (int)valorConta/3;
		double valorFelipe = valorConta - (2*valordividido);
		System.out.println("\nCarlos pagará: R$ " + valordividido);
		System.out.println("André pagará: R$ " + valordividido);
		System.out.printf("Felipe pagará: R$ %.2f", valorFelipe);
	}
}

 */

 /*exercício 19
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o dia: ");
		int dias = teclado.nextInt();
		System.out.print("Digite o mês: ");
		int meses = teclado.nextInt();
		
		int quantidadeDias = (meses - 1) * 30 + dias;
		System.out.print("A quantidade de dias que se passaram foi: " + quantidadeDias + " dias");
}

}

  */

/*exercício 20
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um número de 4 dígitos: ");
		int numero = teclado.nextInt();
		int milhares = numero/1000;
		int centenas = (numero%1000)/100;
		int dezenas = (numero%100)/10;
		int unidades = numero%10;
		
		System.out.println("\nMilhares: " + milhares);
		System.out.println("Centenas: " + centenas);
		System.out.println("Dezenas: " + dezenas);
		System.out.print("Unidades: " + unidades);
}

}


 */
	}
}