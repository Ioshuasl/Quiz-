import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Cabecalho();
        grupo2();

    }

    public static void Cabecalho(){
        System.out.println("Nome do aluno: Ioshua Souza Lopes");
        System.out.println("Nome do curso: Engenharia de software");
        System.out.println("Período: 2° periodo");
        System.out.println("Nome do professor: Brenno Pimenta");
        System.out.println("");
    }


    public static int grupo2() {
        int cont = 0, media;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        System.out.println("");
        Questao questao1 = new Questao();
        questao1.pergunta = "Qual é o maior planeta do sistema solar?";
        questao1.opcaoA = "A: Terra";
        questao1.opcaoB = "B: Júpiter";
        questao1.opcaoC = "C: Marte";
        questao1.opcaoD = "D: Vênus";
        questao1.opcaoE = "E: Mercúrio";
        questao1.correta = "B";
        questao1.escrevaQuestao();
        if (respostaUsuario .equals(questao1.correta)) {
            System.out.println("acertou a questão");
            cont++;
        } else {
            System.out.println("errou a questão");
        }


        Questao questao2 = new Questao();
        questao2.pergunta = "Qual é o país com a maior área territorial do mundo?";
        questao2.opcaoA = "A: China";
        questao2.opcaoB = "B: Canadá";
        questao2.opcaoC = "C: Rússia";
        questao2.opcaoD = "D: Estados Unidos";
        questao2.opcaoE = "E: Brasil";
        questao2.correta = "C";
        questao2.escrevaQuestao();
        if (respostaUsuario .equals(questao2.correta)) {
            System.out.println("acertou a questão");
            cont++;
        } else {
            System.out.println("errou a questão");
        }

        Questao questao3 = new Questao();
        questao3.pergunta = "Quem pintou a Mona Lisa?";
        questao3.opcaoA = "A: Pablo Picasso";
        questao3.opcaoB = "B: Leonardo da Vinci";
        questao3.opcaoC = "C: Vincent van Gogh";
        questao3.opcaoD = "D: Michelangelo";
        questao3.opcaoE = "E: Salvador Dalí";
        questao3.correta = "B";
        questao3.escrevaQuestao();
        if (respostaUsuario .equals(questao2.correta)) {
            System.out.println("acertou a questão");
            cont++;
        } else {
            System.out.println("errou a questão");
        }

       Questao questao4 = new Questao();
        questao4.pergunta = "Sou redondo como uma bola, mas nem sempre estou no chão. Quem sou eu?";
        questao4.opcaoA = "A: Sol";
        questao4.opcaoB = "B: Lua";
        questao4.opcaoC = "C: Planeta";
        questao4.opcaoD = "D: Estrela";
        questao4.opcaoE = "E: Vênus";
        questao4.correta = "B";
        questao4.escrevaQuestao();
        if (respostaUsuario .equals(questao2.correta)) {
            System.out.println("acertou a questão");
            cont++;
        } else {
            System.out.println("errou a questão");
        }

        Questao questao5 = new Questao();
        questao5.pergunta = "Quanto mais você tira, mais eu cresço. O que sou?";
        questao5.opcaoA = "A: Buraco";
        questao5.opcaoB = "B: Silêncio";
        questao5.opcaoC = "C: Fome";
        questao5.opcaoD = "D: Sono";
        questao5.opcaoE = "E: Espaço";
        questao5.correta = "B";
        questao5.escrevaQuestao();
        if (respostaUsuario .equals(questao2.correta)) {
            System.out.println("acertou a questão");
            cont++;
        } else {
            System.out.println("errou a questão");
        }

        Questao questao6 = new Questao();
        questao6.pergunta = "Sou um instrumento que não se toca, mas produzo som. Quem sou eu?";
        questao6.opcaoA = "A: Flauta";
        questao6.opcaoB = "B: Violino";
        questao6.opcaoC = "C: Tambor";
        questao6.opcaoD = "D: Rádio";
        questao6.opcaoE = "E: Televisão";
        questao6.correta = "D";
        questao6.escrevaQuestao();
        if (respostaUsuario .equals(questao2.correta)) {
            System.out.println("acertou a questão");
            cont++;
        } else {
            System.out.println("errou a questão");
        }

        Questao questao7 = new Questao();
        questao7.pergunta = "Tenho coroa, mas não sou rei. O que sou?";
        questao7.opcaoA = "A: Cogumelo";
        questao7.opcaoB = "B: Abacaxi";
        questao7.opcaoC = "C: Dente";
        questao7.opcaoD = "D: Girassol";
        questao7.opcaoE = "E: Laranja";
        questao7.correta = "C";
        questao7.escrevaQuestao();
        if (respostaUsuario .equals(questao2.correta)) {
            System.out.println("acertou a questão");
            cont++;
        } else {
            System.out.println("errou a questão");
        }

        Questao questao8 = new Questao();
        questao8.pergunta = "Sou cheio de buracos e ainda seguro água. O que sou?";
        questao8.opcaoA = "A: Peneira";
        questao8.opcaoB = "B: Vaso";
        questao8.opcaoC = "C: Balde";
        questao8.opcaoD = "D: Tubo";
        questao8.opcaoE = "E: Rede";
        questao8.correta = "A";
        questao8.escrevaQuestao();
        if (respostaUsuario .equals(questao2.correta)) {
            System.out.println("acertou a questão");
            cont++;
        } else {
            System.out.println("errou a questão");
        }

        Questao questao9 = new Questao();
        questao9.pergunta = "Sou um caminho sem fim. O que sou?";
        questao9.opcaoA = "A: Destino";
        questao9.opcaoB = "B: Estrada";
        questao9.opcaoC = "C: Pensamento";
        questao9.opcaoD = "D: Tempo";
        questao9.opcaoE = "E: Ideia";
        questao9.correta = "D";
        questao9.escrevaQuestao();
        if (respostaUsuario .equals(questao2.correta)) {
            System.out.println("acertou a questão");
            cont++;
        } else {
            System.out.println("errou a questão");
        }

        Questao questao10 = new Questao();
        questao10.pergunta = "Não tenho asas, mas posso voar. Quem sou?";
        questao10.opcaoA = "A: Pássaro";
        questao10.opcaoB = "B: Avião";
        questao10.opcaoC = "C: Pensamento";
        questao10.opcaoD = "D: Tempo";
        questao10.opcaoE = "E: Ideia";
        questao10.correta = "C";
        questao10.escrevaQuestao();
        if (respostaUsuario .equals(questao2.correta)) {
            System.out.println("acertou a questão");
            cont++;
        } else {
            System.out.println("errou a questão");
        }

        Questao questao11 = new Questao();
        questao11.pergunta = "Tenho folhas, mas não sou uma árvore. Quem sou?";
        questao11.opcaoA = "A: Livro";
        questao11.opcaoB = "B: Caderno";
        questao11.opcaoC = "C: Carta";
        questao11.opcaoD = "D: Pintura";
        questao11.opcaoE = "E: Jornal";
        questao11.correta = "A";
        questao11.escrevaQuestao();
        if (respostaUsuario .equals(questao2.correta)) {
            System.out.println("acertou a questão");
            cont++;
        } else {
            System.out.println("errou a questão");
        }

        Questao questao12 = new Questao();
        questao12.pergunta = "Tenho dentes, mas não mastigo. Quem sou?";
        questao12.opcaoA = "A: Pente";
        questao12.opcaoB = "B: Boca";
        questao12.opcaoC = "C: Engrenagem";
        questao12.opcaoD = "D: Pá";
        questao12.opcaoE = "E: Chave";
        questao12.correta = "A";
        questao12.escrevaQuestao();
        if (respostaUsuario .equals(questao2.correta)) {
            System.out.println("acertou a questão");
            cont++;
        } else {
            System.out.println("errou a questão");
        }

        Questao questao13 = new Questao();
        questao13.pergunta = "Posso ser cortado, mas nunca ser penteado. Quem sou?";
        questao13.opcaoA = "A: Grama";
        questao13.opcaoB = "B: Papel";
        questao13.opcaoC = "C: Cabelo";
        questao13.opcaoD = "D: Barba";
        questao13.opcaoE = "E: Pano";
        questao13.correta = "B";
        questao13.escrevaQuestao();
        if (respostaUsuario .equals(questao2.correta)) {
            System.out.println("acertou a questão");
            cont++;
        } else {
            System.out.println("errou a questão");
        }

        Questao questao14 = new Questao();
        questao14.pergunta = "Posso ser tocado, mas não sou uma pessoa. Quem sou?";
        questao14.opcaoA = "A: Telefone";
        questao14.opcaoB = "B: Computador";
        questao14.opcaoC = "C: Internet";
        questao14.opcaoD = "D: Rádio";
        questao14.opcaoE = "E: Ventilador";
        questao14.correta = "A";
        questao14.escrevaQuestao();
        if (respostaUsuario .equals(questao2.correta)) {
            System.out.println("acertou a questão");
            cont++;
        } else {
            System.out.println("errou a questão");
        }
        Questao questao15 = new Questao();
        questao15.pergunta = "Tenho coroa, mas não sou rei. O que sou?";
        questao15.opcaoA = "A: Cogumelo";
        questao15.opcaoB = "B: Abacaxi";
        questao15.opcaoC = "C: Dente";
        questao15.opcaoD = "D: Girassol";
        questao15.opcaoE = "E: Laranja";
        questao15.correta = "C";
        questao15.escrevaQuestao();
        if (respostaUsuario .equals(questao2.correta)) {
            System.out.println("acertou a questão");
            cont++;
        } else {
            System.out.println("errou a questão");
        }
        System.out.println("vc acertou: " + cont + "/15 questões");

        System.out.println("=========================================================================");


        media = (cont/15) * 100;

        System.out.println("PORCENTAGEM DE ACERTO "+ media + "%");

        return cont;
    }

    public static String leiaResposta() {
        Scanner ler = new Scanner(System.in);
        String resposta;
        String resp;

        System.out.println("Digite a resposta: ");
        resposta = ler.next();

        resp = resposta.toUpperCase();

        return resp;
    }


    public static class Questao {
        String pergunta;
        String opcaoA;
        String opcaoB;
        String opcaoC;
        String opcaoD;
        String opcaoE;
        String correta;

        public void escrevaQuestao() {
            System.out.println(this.pergunta);
            System.out.println();
            System.out.println(this.opcaoA);
            System.out.println(this.opcaoB);
            System.out.println(this.opcaoC);
            System.out.println(this.opcaoD);
            System.out.println(this.opcaoE);
            System.out.println();

        }

    }
}