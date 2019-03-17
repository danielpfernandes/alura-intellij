package br.com.alura.bytebank;

import br.com.alura.bytebank.model.Funcionario;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        System.out.println("bam vindo ao Bytebank");
        Funcionario jose = new Funcionario("Jose", 1, LocalDate.of(1980,5,3));
        Funcionario maria = new Funcionario("Maria", 2, LocalDate.of(1991, 11, 22));
        System.out.println(jose.toString());
        System.out.println(maria.toString());
    }
}