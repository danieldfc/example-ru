/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru;

import java.util.Scanner;

/**
 *
 * @author danielfelizardo
 */
public class RU {

  public static int calculaQuantidadeDeRefeicoesTipoAlmoco(RefeicaoRealizada[] refeicoes) {
    int quantidade = 0;

    for (int i = 0; i < refeicoes.length; i++) {
      if (refeicoes[i].getTipoRefeicao().equals("ALMOÇO")) {
        quantidade += 1;
      }
    }

    return quantidade;
  }

  public static String verificaDeRefeicoesTipoCafe(RefeicaoRealizada[] refeicoes) {
    String verificaRefeicaoCafe = "NÃO";
    
    for (int i = 0; i < refeicoes.length; i++) {
      if (refeicoes[i].getTipoRefeicao().equals("CAFÉ")) {
        verificaRefeicaoCafe = "SIM";
        break;
      }
    }
    
    return verificaRefeicaoCafe;
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.println("Quantas refeições foram servidas hoje?");
    int quantidadeRefeicoes = Integer.parseInt(leitor.nextLine());

    RefeicaoRealizada [] refeicoes = new RefeicaoRealizada[quantidadeRefeicoes];

    for (int k = 0; k < quantidadeRefeicoes; k++) {
      System.out.println("Matrícula do(a) aluno(a) [" + (k + 1) + "]");
      String matricula = leitor.nextLine();
      
      System.out.println("Qual o tipo de refeição? CAFÉ, ALMOÇO ou JANTAR");
      String tipoRefeicao = leitor.nextLine();

      refeicoes[k] = new RefeicaoRealizada(matricula, tipoRefeicao);

      System.out.printf("%s\n", refeicoes[k].toString());
    }

    int quantidadeAlmocos = Integer.parseInt(leitor.nextLine());
    double preco = 10;
    RefeicaoRealizada[] refeicoesRealizadas = new RefeicaoRealizada[quantidadeAlmocos];

    for (int j=0; j < quantidadeAlmocos; j++) {
      String aluno = leitor.nextLine();
      
      refeicoesRealizadas[j] = new RefeicaoRealizada(aluno, "ALMOCO");
    }

    double total = preco * quantidadeAlmocos;

    System.out.println("Total de refeições do tipo almoço: "+ total);

    System.out.printf("FIM DO PROGRAMA");
    leitor.close();
  }
  
}
