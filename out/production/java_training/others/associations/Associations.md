#Associação em Java
####ref: https://www.tutorialcup.com/pt/Java/associa%C3%A7%C3%A3o-em-java.htm#What_is_Association_in_Java
####ref: https://www.geeksforgeeks.org/association-composition-aggregation-java/
Índice analítico

# O que é associação em Java
A associação em java descreve o relacionamento entre duas classes. Ele estabelece relacionamentos por meio de seus objetos. Uma associação pode representar relacionamentos um para um, um para muitos, muitos para um ou muitos para muitos. Isso habilita o TEM UM relação entre as classes.

Vamos ver diferentes exemplos dessas relações de associação abaixo.
* Uma pessoa pode ter apenas 1 carteira de habilitação. Isso mostra uma relação de um para um.
* Uma pessoa pode ter várias contas bancárias. Esta é uma relação de um para muitos.
* Muitos funcionários podem ter um único gerente de relatórios. Isso descreve uma relação muitos para um.
* Muitos alunos podem ter muitos professores. Isso mostra uma relação muitos para muitos.

Antes de vermos uma ilustração de associação em java, é importante entender o herança conceito também.

### Exemplo de associação em Java (classe AssociationMain)
Este exemplo mostra uma relação um-para-muitos em que um único departamento pode ter muitos professores. Embora cada classe possa existir separadamente, por meio da associação em java podemos relacionar ambas as classes por meio de seus objetos.

Nós criamos um Professor classe que contém nomes e assuntos. Temos 2 métodos para recuperar o nome e o assunto do professor. Por meio do construtor, podemos definir o nome e o assunto, respectivamente.

In Departamento classe, nós declaramos Nome do departamento e lista de professores uma vez que esta é uma associação de uma relação um-para-muitos. Por meio do construtor, inicializamos o nome do departamento e, usando o método getter, podemos obter o nome do departamento.

Agora, precisamos ter 2 outros métodos para obter a lista de professores e definir a lista de professores. Para isso, criamos getProfessores() e setDepartamento(professores).

Em seguida, criamos instâncias separadas para ambas as classes e chamamos os métodos de acordo. Usando Lista de Matriz podemos criar uma lista de professores e, em seguida, passar essa variável para o setDepartment para associar os professores a um único departamento.

Agora que temos uma ideia do que é uma associação, vamos discutir as diferentes formas de associação em java.

### Formas de Associação
A associação contém 2 formas diferentes, conforme mencionado abaixo:

* Composição
* Agregação

![](../../../../../Users/gleid/OneDrive/Pictures/Association.webp)

## Composição
Composição denota um pertencer a ou parte de tipo de associação. Em outras palavras, podemos dizer que um objeto contém ou é composto de outro objeto. Isso implementa um tipo forte de associação, o que significa que, se o objeto interno não puder existir, o objeto externo principal será destruído.

Exemplo de composição

Por exemplo, não podemos ter uma escola sem alunos. Isso significa que uma escola não pode existir sem alunos nela. Por isso, estabelece uma composição entre escola e alunos.

Outro exemplo é, não podemos ter um carro sem motor, o que significa que um carro não pode se mover sem motor. Portanto, essas duas classes estão intimamente ligadas.

### Características de composição
* Ambas as classes são altamente dependentes uma da outra
* A composição entre 2 classes significa que ambas as entidades não podem existir sem a outra.
* Ele implementa uma relação parcial.
* É uma forma restrita de agregação.

### Exemplo de composição (Class CompositionMain)

No exemplo abaixo, mostramos a composição entre Aluno e Escola. Isso significa que uma escola contém uma lista de alunos e, se a escola for destruída, o aluno também não existe. Isso ocorre porque, no construtor School, passamos o objeto da lista de Alunos como um parâmetro

## Agregação
A agregação também é outra forma de associação que implementa um TEM UM relacionamento e suporta apenas uma relação unidirecional. Isso significa que uma classe tem uma referência a outra classe. Por exemplo, podemos dizer que uma pessoa tem um endereço. O caminho inverso, ou seja, o endereço de uma pessoa não é significativo. É por isso que dizemos que é uma relação unilateral que é outra forma de associação.

### Exemplo de agregação (Class AggregationMain)

### Diferença entre composição e agregação
Abaixo estão as diferenças entre as duas formas de associação em java.

| Composição | Agregação |
|--- |--- |
| Tipo forte de associação| Tipo fraco de associação |
| Implementa relacionamento parcial ou pertencente a | Implementa um relacionamento tem um |
| Ambas as classes dependem uma da outra.|  A classe filha pode existir independentemente, mesmo sem a classe pai |
|A classe filha não pode existir sem a classe pai |
