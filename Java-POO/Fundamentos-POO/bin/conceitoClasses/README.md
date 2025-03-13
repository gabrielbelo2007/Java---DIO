## Classes

Toda estrutura de código em Java é distribuído em arquivos com extensão `.java` denominados de `classe`.

As classes existentes em noso projeto serão compostas por:

> **Identificador, Características e Comportamentos**

- **Classe** (*class*): A estrutura e ou representação que direciona a criação dos objetos de mesmo tipo.
 
- **Identificador** (*identity*): Propósito existencial aos objetos que serão criados.

- **Características** (*states*): Também conhecido como `atributos` ou `propriedades`, é toda informação que representa o estado do objeto.

- **Comportamentos** (*behavior*): Também conhecido como `ações` ou `métodos`, é toda parte comportamental que um objeto dispõe.

- **Instanciar** (*new*): É o ato de criar um objeto a partir de estrutura definida em uma classe.

> Exemplo:

![Modelo](java-class-objects.jpg)

- Para ilustrar essas etapas de orientação a objeto em Java, vamos reproduzir a imagem em código para explicar que primeiro criamos a estrutura (`classe`) correspondente para assim criarmos as pessoas (`objetos`) com as características e possibilidade de realização de ações (*behavior*) como se fosse no "mundo real".

> Criando a *classe*
```
public class Student {
    String name;
    int age;
    Color color;
    Sex sex;

    void eating(Food food){
        //codigo acao
    }

    void drinking(Eat eat){
        // codigo acao
    }
}
```

> Criando os *objetos*
```
public class School {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student();
        student1.name = "Gabriel"
        student1.age = 18;
        student1.color = Color.FAIR;
        student1.sex = Sex.MALE;

        Student student2 = new Student();
        student2.name = "Leticia"
        student2.age = 19;
        student2.color = Color.FAIR;
        student2.sex = Sex.FEMALE; 
    }
}
```

> A classe Student não foi estruturada com o padrão *Java Beans* de `getters` e `setters`.

Seguindo convenções, as classes podem ser classificadas como:

- **Classe de modelo (model)**: Classes que representem estrutura de domínio da aplicação, exemplo: Cliente, Pedido, Nota fiscal...

- **Classe de serviço (service)**: Classes que contém regras de negócio e validação de nosso sistema.

- **Classe de repositório (repository)**: Classes que contém, uma integração com banco de dados.

- **Classe de controle (controller)**: Classes que possuem a finalidade de disponibilizar alguma comunicação externa à nossa aplicação, tipo *http web* ou *webservices*.

- **Classe utilitária (util)**: Classe que contém recursos comuns à toda nossa aplicação.

> Exemplo:

![Modelo](Classes-tipos.png)
