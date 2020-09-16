package aula05;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Luiz_
 */
public class Aula05 {
    
    public static void main(String[] args) throws IOException {
        
        Scanner in = new Scanner(System.in);
        Pessoas pessoa = new Pessoas();
        
        try (BufferedWriter buffWrite = new BufferedWriter(new FileWriter("testando.txt"))) {
            
            System.out.println("Nome: ");
            String nome = in.nextLine();
            pessoa.setNome(nome);
            buffWrite.append("Nome: " + pessoa.getNome() + "\n");
            
            System.out.println("Email: ");
            String email = in.nextLine();
            pessoa.setEmail(email);
            buffWrite.append("Email: " + pessoa.getEmail() + "\n");
            
            System.out.println("RG: ");
            int rg = in.nextInt();
            pessoa.setRg(rg);
            buffWrite.append("RG: " + pessoa.getRg() + "\n");
            
            System.out.println("--------------------------");
            buffWrite.close();
        }
     
    }
    
}
