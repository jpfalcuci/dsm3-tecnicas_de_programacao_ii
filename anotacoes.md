# Anotações

## JVM

Uma grande vantagem do Java é a JVM (Java Virtual Machine). O código Java é compilado em bytecode e posteriormente executado pela JVM. Além disso, outras linguagens também podem ser executadas na JVM.

## Criação de variáveis e uso de memória

Ao criar uma classe, são definidas apenas as instruções para a criação de objetos.

- `Carro c;`: Isso apenas declara uma variável do tipo "Carro".
- `Carro c = new Carro();`: Isso instancia um objeto do tipo "Carro" e a variável "c" passa a fazer referência ao seu endereço de memória.
- `Carro c2 = new Carro();`: Isso instancia outro objeto do tipo "Carro" e a variável "c2" passa a fazer referência ao seu endereço de memória.
- `c2 = c;`: Agora "c2" passa a fazer referência ao mesmo objeto que "c" está apontando. O objeto anteriormente referenciado por "c2" fica na memória, porém não está mais acessível.
  - Em linguagem C, essa atribuição faria com que "c2" apontasse para o endereço de memória de "c", não para o objeto em si. Portanto, se "c" receber o valor "null", "c2" também receberia "null".

A JVM possui um garbage collector que é executado periodicamente para limpar espaços na memória que não possuem mais referências de variáveis. É possível chamar o garbage collector, mas o momento exato de sua execução ainda é gerenciado pela JVM.

## Modificadores de Acesso

Em Java, os modificadores de acesso determinam a visibilidade e acessibilidade de classes, métodos e atributos. Existem quatro principais modificadores de acesso:

- **default (ausência de modificador):**
  - Sem a especificação de um modificador (conhecido como "default" ou "package-private"), a classe, método ou atributo é acessível somente dentro do mesmo pacote. Isso promove encapsulamento dentro do pacote, limitando o acesso externo não intencional.

- **public**:
  - O uso do modificador "public" permite que a classe, método ou atributo seja acessado de qualquer lugar, seja de dentro da mesma classe, de outras classes no mesmo pacote ou de classes em pacotes diferentes. Esse é o nível mais permissivo de acesso.

- **private:**
  - Ao usar o modificador "private", a classe, método ou atributo fica acessível apenas dentro da própria classe. Isso garante que os detalhes internos da classe permaneçam restritos e protegidos de qualquer manipulação externa.

- **protected:**
  - O modificador "protected" torna a classe, método ou atributo acessível dentro da mesma classe, subclasses (mesmo que estejam em pacotes diferentes) e classes no mesmo pacote. Isso facilita a herança e extensão de classes, permitindo acesso controlado às subclasses.