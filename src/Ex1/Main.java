
/*
EX 1 – Criando e usando classes
Crie uma classe Pessoa com os atributos nome, idade e profissao.
No main, crie 2 objetos diferentes e imprima os dados de cada um com um método exibirDados().

EX 2 – Entendendo métodos com parâmetros
Na classe Pessoa, crie um método aniversario() que aumenta a idade em 1.
Teste chamando o método no objeto e mostrando antes e depois.

 */
package Ex1;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        p1.setNome("pedro");
//
//        p1.nome = "pedro";
//        p1.idade = 15;
//        p1.profissao = "estudande";
//
//        p2.nome = "jana";
//        p2.idade = 32;
//        p2.profissao = "professora";
//
//        p1.exibirDados();
//        p2.exibirDados();

//        p1.aniversario();
        System.out.println(p1.getNome());
    }
}
