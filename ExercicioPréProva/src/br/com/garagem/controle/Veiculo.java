/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.garagem.controle;

/**
 *
 * @author Soarezz
 */
public class Veiculo {
    
   private String marca;
   private String modelo;
   private double precoBase;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }
    
    
   public double calcularPrecoFinal(){
   
   return 0;
   }
           
   
           
   public String exibirDados(){
   
   return "Dados do veiculo";
   }
           
           
           
  public void aplicarDesconto(double porcentagem){
        
      this.precoBase = this.precoBase - ( this.precoBase * (porcentagem / 100.0));
  
   }
  
  
  //sobrecarga         
  public void aplicarDesconto(double valorFixo, boolean ehValorFixo){
   
      this.precoBase = this.precoBase - valorFixo;
  
   }
   
   
   
    
}
