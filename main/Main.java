package main;

import java.time.LocalDateTime;
import java.util.*;

import entidade.Agendamento;
import entidade.Pessoa;
import entidade.Cliente;
import entidade.Barbeiro;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		List<Pessoa> usuarios = new ArrayList<>();
        List<Agendamento> agendamentos = new ArrayList<>();
        
        
        Cliente cl1 = new Cliente();
        cl1.setNome("Takeshi");
        
        Barbeiro br1 = new Barbeiro();
        br1.setNome("Carlos");
      
        usuarios.add(cl1);
        usuarios.add(br1);
        
        
        Pessoa usuarioLogado = null;
        for (Pessoa p : usuarios) {
            System.out.println(
                "Número: " + p.getId() +
                " | Nome: " + p.getNome() +
                " | Função: " + p.getClass().getSimpleName()
            );
        }
        
        System.out.print("Digite seu número: ");
        int id = sc.nextInt();
        
        for (Pessoa p : usuarios) {
            if (p.getId() == id) {
                usuarioLogado = p;
                break;
            }
        }

        if (usuarioLogado == null) {
            System.out.println("Usuário não encontrado.");
            return;
        }

        System.out.println("Bem-vindo, " + usuarioLogado.getNome());

        if (usuarioLogado instanceof Cliente) {

            System.out.println("1 - Agendar");
            int op = sc.nextInt();

            if (op == 1) {

                System.out.print("Digite o número do barbeiro que deseja: ");
                int barbeiroId = sc.nextInt();
                
                if(barbeiroId == id) {
                Agendamento ag = new Agendamento();
                ag.setClienteId(usuarioLogado.getId());
                ag.setBarbeiroId(barbeiroId);
                ag.setDataHora(LocalDateTime.now());
                ag.setValor(35.0);

                agendamentos.add(ag);

                System.out.println("Agendamento realizado!");}
                
                else {
                	System.out.println("Agendamento inválido");
                }
                
            	}
            
     
            
            if (op != 1) {
            	System.out.println("Opção inválida");
            }

        } 
        else if (usuarioLogado instanceof Barbeiro) {

            System.out.println("Seus agendamentos:");

            for (Agendamento a : agendamentos) {
                if (a.getBarbeiroId() == usuarioLogado.getId()) {
                    System.out.println(
                        "Cliente número: " + a.getClienteId() +
                        " | Data: " + a.getDataHora()
                    );
                }
            }
        }

        sc.close();
        
        
	}

	private static String getSimpleName() {
		return null;
	}

}
