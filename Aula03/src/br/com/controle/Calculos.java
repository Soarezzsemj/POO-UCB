/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

/**
 *
 * @author Soarezz
 */
public class Calculos {
    private double valor; // atributo pq tem visibilidade de encapsulamento ( faz get set )
    double soma; // variavel pq nao tem visibilidade de encapsulamento ( sem get set )
    private int quantidade;
    // p ter get e set tem que ser atributo
    // tudo da tela pra controller e controller pra tela tem q ter get e set

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
         soma = soma + this.valor; // mesma coisa de soma += this.valor
         this.quantidade++; 
    }

    public int getQuantidade() {
        return quantidade;
    }

    /*public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }*/
    
    public double calcularMedia(){
     return soma/this.quantidade;
}
 
    
    // revisao classe, atributo. metodo extração visibilidade e encapsulamento
}
