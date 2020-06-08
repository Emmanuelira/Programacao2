package questao2_3_4;

public class Resposta {
	
	/*Questão 02
	
	Optando pela opção sem o "new", haverá reaproveitamento do objeto caso dois ou mais 
	objetos tenham o mesmo conteúdo. Usando o "new", será criado um objeto para cada String.
	*/
	
	
	/*Questão 03
	  
	Se você optar por criar uma String sem o "new", a JVM poderá usar de uma artimanha
	para economizar espaço na memória. Se ela (JVM) encontrar duas Strings com o mesmo
	conteúdo, os dois objetos irão apontar para o mesmo endereço de memória. Já criando
	String com o termo "new", independente dos valores dos objetos, será um
	endereço de memória diferente para cada objeto.
	 */
	
	
	/*Questão 04
	 
	Uma String é imutável. A cada modificação realizada, será criado um novo objeto e
	deixado para trás o conteúdo anterior da String na memória, ocupando espaço até o 
	Garbage Collector ser executado e removê-lo. 
	 */
	
	
	
	
}
