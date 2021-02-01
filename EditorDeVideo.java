//Gerente é um funcionario , Gerente herda da class Funcionario
public class EditorDeVideo extends Funcionario {
		
	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificacao do Editor de Video");
		return super.getBonificacao() + 100;
	}
}

