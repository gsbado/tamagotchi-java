# Tamagotchi
Este é um simulador de Tamagotchi implementado em Java, onde você pode controlar as ações do seu animal de estimação digital. O Tamagotchi tem necessidades como sono, alimentação e exercício, e você deve tomar decisões para garantir sua sobrevivência.

## **Funcionalidades**

**1. Sono:** <br/>
- O Tamagotchi sente sono aleatoriamente. <br/>
- Escolha entre dormir ou permanecer acordado. <br/>
- Dormir aumenta a idade em 1 dia; atingir 15 dias resulta em morte.<br/>

**2. Fome:** <br/>
- O Tamagotchi sente fome aleatoriamente.  <br/>
- Escolha entre comer muito, comer pouco ou não comer.  <br/>
- Comer pouco é normal, comer muito aumenta 5 kg; não comer diminui 2 kg.  <br/>
- Excesso de peso acima de 20 kg leva à explosão; menos de 0 kg resulta em morte. <br/>

**3. Tédio:** <br/>
- O Tamagotchi fica entediado aleatoriamente. <br/>
- Escolha entre correr por 10 minutos ou caminhar por 10 minutos. <br/>
- Correr automaticamente emagrece 4 kg e resulta em comer muito; caminhar emagrece 1 kg e causa fome. <br/>


## **Estrutura do projeto**

**1. Classe Tamagotchi:** <br/>
- Classe principal que representa o Tamagotchi. <br/>
- Atributos para nome, idade e peso. <br/>
- Métodos para gerenciar ações como dormir, comer, se exercitar, etc. <br/>

**2. Classe Principal** <br/>
- Contém o método main, responsável pela lógica principal do programa. <br/>
- Instancia objetos da classe Tamagotchi e interage com o usuário. <br/>

**3. Classe Teclado** <br/>
- Classe utilitária para interação com o usuário. <br/>
- Fornece métodos para entrada de dados do teclado. <br/>
- Classe criada pelos professores da Unisinos <br/>

## **Como Usar:** <br/>
Compile o projeto Java. <br/>
O arquivo Principal.java contém o método main, onde os métodos das classes principais são chamados para realizar as operações descritas no enunciado. <br/>
Siga as instruções na tela para alimentar, exercitar e cuidar do seu Tamagotchi. <br/>
Monitore o estado do seu Tamagotchi e tome decisões estratégicas para mantê-lo saudável.
