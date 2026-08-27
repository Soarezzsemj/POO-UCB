/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

/**
 *
 * @author Soarezz
 */
public class Calculadora {
    private double valor;
    private int quantidade;
    private double venda;
    private double maiorVenda;
    
    
    
    public double getValor(){
        return valor;
    }
    
    public void setValor(double valor){
        this.valor = valor;
        this.venda += valor;
        this.quantidade++;
        
        if(valor > this.maiorVenda){
            this.maiorVenda = valor;
        }
        
    } 
    
    
    
    public double getQuantidade(){
        return quantidade;
    }
    
    
    public double calcularMedia(){
        return this.venda/this.quantidade;
    }
    
    public double maiorVenda(){
        
        return maiorVenda;
   
    }
    
}
