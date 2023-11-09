
// Nome do aluno: Gabriela Bado

public class Principal
{

    //O método main para o programa é onde irá começar a execução e os objetos irão interagir entre si

    public static void main (String[]args)
    {
        System.out.println("Bem vindo! O seu novo Tamagotchi acaba de nascer!"); 
        //Foi impressa uma mensagem de boas vindas para o usuário antes de solicitar um "input" do nome do Tamagotchi através da Classe Teclado
        String nomeTamagotchi = Teclado.leString("\n\nComo esse Tamagotchi é lindo! Qual nome você gostaria que ele tivesse? ");

        //foi criada a instância da classe para passar os parâmetros para o construtor
        Tamagotchi t = new Tamagotchi(nomeTamagotchi);
        String nome = t.getNome(); 
        int idade = t.getIdade();
        double peso = t.getPeso();
        boolean isVivo = t.getIsVivo();
        int vezesAcordado = t.getVezesAcordado();

        System.out.println("Vamos descobrir do que o seu Tamagotchi precisa:");
        //as primeiras frases são dedicadas a apresentação e nome do Tamagotchi. A partir disso, vamos entrar em um loop de sua vida até a morte.

        while (isVivo == true) 
        //Condição para o programa seguir rodando
        { 
            int opcaoSorteio = (int) (Math.random()*3)+1;
            //Utilizei o método Math.random para escolher um número aleatório, delimitei para esse número ser até 3 e converti para receber um valor inteiro
            //O resultado do sorteio será o número de uma das opções para interagir com o Tamagotchi

            if (opcaoSorteio == 1) 
            //Chama o método para quando o Tamagotchi sente sono
            {
                t.sono ();
                t.getIdade(); 
                //Pega a informação da idade atual do Tamagotchi após dormir, para verificar se ainda está vivo
                if (t.getIdade() >= 15) {
                    isVivo = false;
                    System.out.println("\n" + nome + " faleceu pois estava em idade avançada de 15 dias. \nGame over!");
                    //Nessa condição, o Tamagotchi veio a óbito e é mostrada uma mensagem de Game over
                }

                else
                    t.status ();
                //Nessa condição, é acionado o método status, mostrando a idade e peso atuais do Tamagotchi
            }

            else if (opcaoSorteio == 2) 
            //Chama o método para quando o Tamagotchi sente fome
            {
                t.fome ();
                t.getPeso(); 
                //Pega a informação do peso atual do Tamagotchi após comer, para verificar se ainda está vivo
                if (t.getPeso() >= 20.00) {
                    isVivo = false;
                    System.out.println("\n" + nome + " faleceu pois explodiu de tanto comer. \nGame over!");
                    //Nessa condição, o Tamagotchi veio a óbito e é mostrada uma mensagem de Game over
                }

                else if (t.getPeso() <= 0.0) {
                    isVivo = false;
                    System.out.println("\n" + nome + " faleceu pois atingiu 0kg e ficou desnutrido. \nGame over!");
                    //Nessa condição, o Tamagotchi também veio a óbito e é mostrada uma mensagem de Game over
                }

                else
                    t.status ();
                //Nessa condição, é acionado o método status, mostrando a idade e peso atuais do Tamagotchi
            }

            else if (opcaoSorteio ==3) 
            //Chama o método para quando o Tamagotchi sente tédio e vai se exercitar
            {
                t.tedio ();
                t.getPeso();
                //Pega a informação do peso atual do Tamagotchi após comer, para verificar se ainda está vivo
                if (t.getPeso() > 20.0) {
                    isVivo = false;
                    System.out.println("\n" + nome + " faleceu pois explodiu de tanto comer. \nGame over!");
                    //Nessa condição, o Tamagotchi também veio a óbito e é mostrada uma mensagem de Game over
                }

                else if (t.getPeso() <= 0.0) {
                    isVivo = false;
                    System.out.println("\n" + nome + " faleceu pois atingiu 0kg e ficou desnutrido. \nGame over!");
                    //Nessa condição, o Tamagotchi também veio a óbito e é mostrada uma mensagem de Game over
                }

                else
                    t.status ();
                //Nessa condição, é acionado o método status, mostrando a idade e peso atuais do Tamagotchi

            }

        }
    }
}
