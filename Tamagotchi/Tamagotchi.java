
// Nome do aluno: Gabriela Bado

public class Tamagotchi
{ 
    //atributos principais do Tamagotchi
    private String nome; 
    private int idade; 
    private double peso;
    private boolean isVivo;
    //para checar se o Tamagotchi segue vivo para rodar o sistema
    private int vezesAcordado;
    //para checar quantas vezes ele ficou acordado

    //método construtor para construir o objeto e adiciona-lo na memória

    public Tamagotchi(String nome)
    {
        this.nome = nome; //nome que o usuário irá definir
        idade = 0; //a idade inicial virá setada em 0
        peso = 1.0; //o peso inicial virá setado em 1.0
        isVivo = true; //caso o Tamagotchi siga vivo, o programa irá continuar rodando
        vezesAcordado = 0; //no início do jogo, ele não ficou acordado em nenhum momento
    }

    //métodos
    public void sono() 
    {
        //opções irão aparecer para o usuário definir qual o seu próximo passo. Essa informação será adicionada por parâmetro pelo usuário através do uso da Classe Teclado.
        System.out.println("\n" +nome + " está sonolento. O que você deseja que ele faça?");
        System.out.println("1) " +nome+ " deve dormir");
        System.out.println("2) " +nome+ " deve permanecer acordado");
        char opcao = Teclado.leChar ("Digite o número da opção desejada: ");

        if (opcao == '1')
        {
            this.vezesAcordado = 0; //é zerado o contador de número de vezes acordado do Tamagotchi
            this.vezesAcordado = vezesAcordado; //é atualizado o status de número de vezes acordado do Tamagotchi
            this.idade = idade + 1; //a idade atual é somada com o número inteiro 1 (dia), que é o número de dias de envelhecimento do Tamagotchi ao dormir
            this.idade = idade; //a partir da soma, é atualizado o status de idade
            //É impressa uma mensagem sobre as consequências da ação para o usuário
            System.out.println("\n"+nome + " dormiu e envelheceu um pouco. Sua idade atual é de " + idade + " dias");
        }

        else if (opcao == '2')
        {
            this.vezesAcordado = vezesAcordado + 1;
            this.vezesAcordado = vezesAcordado;
            System.out.println("\n"+nome + " permaneceu acordado. Sua idade atual é de " + idade + " dias");
            if (vezesAcordado >= 6) {
                this.idade = idade + 1; //a idade atual é somada com o número inteiro 1 (dia), que é o número de dias de envelhecimento do Tamagotchi ao dormir
                this.idade = idade; //a partir da soma, é atualizado o status de idade
                this.vezesAcordado = 0; //quando o contador atinge o número 6, ele dorme automaticamente
                this.vezesAcordado = vezesAcordado; //é atualizado o status de número de vezes acordado do Tamagotchi.
                //É impressa uma mensagem sobre as consequências da ação para o usuário
                System.out.println(nome + " estava muito exausto de permanecer acordado e acabou dormindo. Ele envelheceu um pouco durante o sono. Sua idade atual é de " + idade + " dias");
            }
        }
    }

    public void fome() 
    {
        //opções irão aparecer para o usuário definir qual o seu próximo passo. Essa informação será adicionada por parâmetro pelo usuário através do uso da Classe Teclado.
        System.out.println("\n" + nome + " está esfomeado. O que você deseja que ele faça?");
        System.out.println("1) " +nome+ " deve comer muito");
        System.out.println("2) " +nome+ " deve comer pouco");
        System.out.println("3) " +nome+ " não deve comer nada");
        char opcao = Teclado.leChar ("Digite o número da opção desejada: "); 

        if (opcao == '1') 
        {
            this.peso = peso + 5; //o peso atual é somado com o número de kg que a opção aumenta para o Tamagotchi
            this.peso = peso; //a partir da soma, é atualizado o status de peso
            //É impressa uma mensagem sobre as consequências da ação para o usuário
            System.out.println(nome + " se alimentou muito e ficou mais pesado. Seu peso atual é de " + peso + " kg");
        }

        else if (opcao == '2')
        {
            this.peso = peso + 1; //o peso atual é somado com o número de kg que a opção aumenta para o Tamagotchi
            this.peso = peso; //a partir da soma, é atualizado o status de peso
            //É impressa uma mensagem sobre as consequências da ação para o usuário
            System.out.println(nome + " se alimentou pouco e ganhou peso. Seu peso atual é de " + peso + " kg");
        }

        else
        {
            this.peso = peso - 2; //o peso atual é subtraído com o número de kg que a opção aumenta para o Tamagotchi
            this.peso = peso; //a partir da subtração, é atualizado o status de peso
            //É impressa uma mensagem sobre as consequências da ação para o usuário
            System.out.println(nome + " não se alimentou e perdeu peso. Seu peso atual é de " + peso + " kg");
        }

    }

    public void tedio() 
    {
        //opções irão aparecer para o usuário definir qual o seu próximo passo. Essa informação será adicionada por parâmetro pelo usuário através do uso da Classe Teclado.
        System.out.println("\n" + nome + " está entediado. O que você deseja que ele faça?");
        System.out.println("1) " +nome+ " deve correr por 10 minutos");
        System.out.println("2) " +nome+ " deve caminhar por 10 minutos");
        char opcao = Teclado.leChar ("Digite o número da opção desejada: ");

        if (opcao == '1') {
            this.peso = peso + 1; //o peso atual é somado com o número de kg que a opção aumenta para o Tamagotchi
            this.peso = peso; //a partir da soma, é atualizado o status de peso
            //É impressa uma mensagem sobre as consequências da ação para o usuário
            System.out.println(nome + " correu muito e emagreceu 4 kg. Como ninguém é de ferro, logo após a corrida ele sentiu muita fome e comeu muito, engordando 5 kg. Seu peso atual é de " + peso + " kg");
        }

        else {
            this.peso = peso - 1; //o peso atual é subtraído com o número de kg que a opção aumenta para o Tamagotchi
            this.peso = peso; //a partir da subtração, é atualizado o status de peso
            //É impressa uma mensagem sobre as consequências da ação para o usuário
            System.out.println(nome + " caminhou e emagreceu 1 kg. Ele está com fome! Seu peso atual é de " + peso + " kg");
            fome(); //Nesse caso específico, ele fica com fome após correr, então o próximo método é chamado para o Tamagotchi se alimentar
        }

    }

    public void status() 
    {
        //método com informações irão aparecer para o usuário entender o status atual do Tamagotchi
        System.out.println("\nÉ assim que " +nome+ " está atualmente:" + "\nIdade: " + idade + " dias" + "\nPeso: " + peso + " kg");
    }

    // getters - para dar acesso aos atributos que precisamos durante a execução do programa
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public double getPeso(){
        return peso;
    }

    public boolean getIsVivo(){
        return isVivo;
    }

    public int getVezesAcordado(){
        return vezesAcordado;
    }

    //setters - para poder ter acesso para alterações nos atributos que precisamos durante a execução do programa
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;    
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public void setIsVivo(boolean isVivo) {
        this.isVivo = isVivo;
        if (isVivo == true)
            System.out.println("\nÉ assim que "+nome+ " está atualmente:" + "\nIdade: " + idade + "\nPeso: " + peso); //caso o Tamagotchi esteja vivo, o jogo continuará
        else
            System.out.println("Game Over"); //caso o Tamagotchi não esteja vivo, o jogo terminará
    }

    public void setVezesAcordado(int vezesAcordado){
        this.vezesAcordado = vezesAcordado;
    }
}
 
