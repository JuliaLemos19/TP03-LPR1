/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package com.mycompany.tp03ex01;


import java.util.Scanner;

/**
 *
 * @author João Victor Crivoi Cesar Souza e Júlia Lemos
 */
public class TP03Ex01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hora hora = null;
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Criar hora usando construtor com entrada de dados");
            System.out.println("2 - Criar hora usando construtor com parâmetros(já definido)");
            System.out.println("3 - Definir hora");
            System.out.println("4 - Definir minutos");
            System.out.println("5 - Definir segundos");
            System.out.println("6 - Obter hora no formato hh:mm:ss");
            System.out.println("7 - Obter hora no formato hh:mm:ss (AM/PM)");
            System.out.println("8 - Obter segundos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

           try {
                opcao = scanner.nextInt();
                scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    hora = new Hora();
                    break;
                case 2:

                    hora = new Hora(8, 45, 30); //valores quaisquer, somente há o travamento(integridade) e conversão nos valores que serão efetivamente digitados pelo usuário.
                    break;
                case 3:
                    System.out.print("Digite a nova hora: ");
                    int novaHora = Integer.parseInt(scanner.nextLine());
                    hora.setHor(novaHora);
                    break;
                case 4:
                    System.out.print("Digite os novos minutos: ");
                    int novosMin = Integer.parseInt(scanner.nextLine());
                    hora.setMin(novosMin);
                    break;
                case 5:
                    System.out.print("Digite os novos segundos: ");
                    int novosSeg = Integer.parseInt(scanner.nextLine());
                    hora.setSeg(novosSeg);
                    break;
                case 6:
                    System.out.println("Hora no formato hh:mm:ss: " + hora.getHora1());
                    break;
                case 7:
                    System.out.println("Hora no formato hh:mm:ss (AM/PM): " + hora.getHora2());
                    break;
                case 8:
                    System.out.println("Segundos: " + hora.getSeg());
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }   
            } catch (Exception e) {
                System.out.println("\n\nErro: entrada inválida! Certifique-se de digitar os valores corretamente! \nErro: " + e + "\n\nAperte enter para continuar...");
                scanner.nextLine(); 
                opcao = -1; 
            }
        } while (opcao != 0);

        scanner.close();
    }
}