# Anotações - Técnicas de Programação II

## JVM (Java Virtual Machine)

Java traz vantagens significativas através da JVM (Java Virtual Machine). O código Java é compilado em bytecode e executado pela JVM. Essa abordagem permite a execução de não apenas código Java, mas também de outras linguagens na JVM, tornando-a uma plataforma versátil.

## Modificadores de Acesso

Em Java, os modificadores de acesso controlam a visibilidade de classes, métodos e atributos. Os quatro principais modificadores:

- **default (ausência de modificador):**
  - Acesso apenas dentro do mesmo pacote, promovendo encapsulamento local.

- **public:**
  - Acesso de qualquer lugar, oferecendo a mais alta permissão.

- **private:**
  - Acesso restrito à própria classe, protegendo detalhes internos.

- **protected:**
  - Acesso na mesma classe, subclasses e mesmo pacote, facilitando a herança.

## Atributos e Métodos Estáticos (static)

Em Java, atributos e métodos estáticos pertencem à classe em si, em vez de pertencerem a instâncias individuais da classe. Isso significa que eles podem ser acessados diretamente através do nome da classe, sem precisar criar uma instância dela.

- **Atributos Estáticos:**
  - Atributos estáticos são compartilhados por todas as instâncias da classe.
  - Eles são declarados usando a palavra-chave `static`.
  - Exemplo: `static int contador = 0;`
  - O acesso é feito usando o nome da classe: `NomeDaClasse.contador`.

- **Métodos Estáticos:**
  - Métodos estáticos podem ser chamados sem criar uma instância da classe.
  - Eles também são declarados usando a palavra-chave `static`.
  - Exemplo: `static void imprimirMensagem() { ... }`
  - Acesso: `NomeDaClasse.imprimirMensagem();`

## Criação de Variáveis e Uso de Memória

Ao criar uma classe:

- `Carro c;`: Declaração da variável "c".
- `Carro c = new Carro();`: Instância de um objeto e referência à variável "c".
- `Carro c2 = new Carro();`: Instância de outro objeto e referência à variável "c2".
- `c2 = c;`: "c2" passa a apontar para o mesmo objeto de "c".

A JVM possui um "garbage collector" que limpa memória não referenciada.

## Constantes (final)

Em Java, é possível declarar constantes usando a palavra-chave `final`. Constantes são valores que não podem ser alterados após serem atribuídos. Geralmente são usadas para representar valores fixos que têm um significado especial no contexto do programa.

  - `final int NUMERO_MAXIMO = 100;`
  - Por convenção, constantes têm nomes em letras maiúsculas para destacar sua natureza.
  - Ao usar constantes, é mais claro o propósito de um valor fixo no código (Legibilidade).
  - Impede a reatribuição acidental de valores.

- **Exemplo de Uso:**
  ```java
  public class Exemplo {
    private static final double PI = 3.14159;

    public static void main(String[] args) {
      double raio = 5.0;
      double area = PI * raio * raio;
      System.out.println("Área do círculo: " + area);
    }
  }
  ```

## Arquivos .java e .class

- Arquivo .java: Código-fonte legível para humanos.
- Arquivo .class: Bytecode interpretado pela JVM, gerado a partir do .java.

## Sobre o Java

- Threads permitem a execução simultânea (multithreading), o que é útil para lidar com tarefas paralelas.
- Todas as classes têm um construtor default herdado do `Object`, que é chamado se um construtor não for definido explicitamente.
- `int` é um tipo primitivo, enquanto `Integer` é um objeto que oferece mais versatilidade, permitindo valores nulos e oferecendo métodos auxiliares.
- Strings são imutáveis. Qualquer alteração cria novas strings. No "String Pool", strings idênticas são reutilizadas para economizar memória.
- `@Override` indica sobrescrita de método e ajuda a prevenir erros de digitação nos nomes dos métodos.

## API e HTTP

Uma API (Interface de Programação de Aplicativos) é um conjunto de regras e protocolos que permite que diferentes softwares se comuniquem. As solicitações são feitas utilizando o protocolo HTTP (Hypertext Transfer Protocol).

- GET: Obter dados do servidor.
- POST: Enviar dados ao servidor.
- PUT: Atualizar dados no servidor.
- DELETE: Remover dados do servidor.

Respostas incluem códigos de status HTTP e dados solicitados.
