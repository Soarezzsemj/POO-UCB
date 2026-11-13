/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.garagem.controle;

/**
 *
 * @author Soarezz
 */
public class Carro extends Veiculo {
    
    private int quantidadePortas;

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public double calcularPrecoFinal() {
       
        return getPrecoBase() + 1500.00;
    
    }

    @Override
    public String exibirDados() {
        int quantidadePortaas = this.quantidadePortas;
        return "" + quantidadePortaas;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
