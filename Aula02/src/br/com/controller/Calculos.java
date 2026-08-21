package br.com.controller;

public class Calculos {

    //ATRIBUTOS
    private double valor1;
    private double valor2;
    private int op;
    double resposta;

    public void setOp(int op) {
        this.op = op;
    }

    //METODO - primeira letra minuscula e a segunda q sepaa maiuscula
    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }


    public double calcular(){

        if (op == 1) {
            resposta = this.valor1+this.valor2;
        } else if (op == 2) {
            resposta = this.valor1-this.valor2;
        } else if (op == 3) {
            resposta = this.valor1*this.valor2;
        } else if (op == 4) {
            resposta = this.valor1/this.valor2;
        }

        return resposta;
    }


}
