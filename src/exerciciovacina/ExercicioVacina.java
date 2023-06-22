package exerciciovacina;
import java.util.Scanner;
/**
 * @author Try
 */
public class ExercicioVacina {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o total de pessoas que"
                + " moram na cidade: ");
        
        int totalPessoas = entrada.nextInt();
        System.out.println("Informe o número total de "
                + "pessoas que já foram vacinadas: ");   
        
        int pessoasVacinadas = entrada.nextInt();
       
        
        double porcentagemVacinacao = (pessoasVacinadas * 100.0) / totalPessoas;
        
        System.out.println("Porcentagem de Pessoas "
                + "Vacinadas na cidade: " +porcentagemVacinacao + "%");
    }
    
}
