
/*
Dia 1 – Criando e usando classes
Crie uma classe Pessoa com os atributos nome, idade e profissao.
No main, crie 2 objetos diferentes e imprima os dados de cada um com um método exibirDados().

Dia 2 – Entendendo métodos com parâmetros
Na classe Pessoa, crie um método aniversario() que aumenta a idade em 1.
Teste chamando o método no objeto e mostrando antes e depois.

 */
package Ex1;

public class Pessoa {
    private String nome;
    private int idade;
    private String profissao;

    public void setDados(String nome, int idade, String profissao){
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    public String getDados(){
        return nome + "tem " + idade + "e é " + profissao;
    }
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void exibirDados(){
        System.out.println(nome);

    }
    public void aniversario(){
        System.out.println("Feliz aniversário, você esta fazendo: "+ (idade + 1));
    }
}
