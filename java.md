# Java

O **Java** é uma linguagem de programação orientada a objetos amplamente utilizada no desenvolvimento de aplicações desktop, web, mobile e sistemas corporativos. Um programa Java é escrito em arquivos de código-fonte (`.java`), compilado para **bytecode** (`.class`) e executado pela **Máquina Virtual Java (JVM - Java Virtual Machine)**.

Durante a disciplina, o Java será utilizado para consolidar conceitos de **Programação Orientada a Objetos (POO)**, como classes, objetos, herança, polimorfismo, encapsulamento e abstração.

---

# Verificando a instalação

Para criar um ambiente inicial para programação em Java no Linux, execute no terminal:

'''
sudo apt update && sudo apt install default-jdk 
'''

para instalar o kit de desenvolvimento, verifique com java -version e javac -version, e crie uma pasta de projeto com 

'''
mkdir meu-projeto && cd meu-projeto.
'''

Antes de iniciar qualquer projeto, é importante verificar se o Java Development Kit (JDK) está instalado corretamente.

## Verificar a versão da JVM

```bash
java -version
```

Exibe a versão do Java instalada no computador.

Exemplo:

```text
openjdk version "21.0.2"
OpenJDK Runtime Environment
OpenJDK 64-Bit Server VM
```

O comando `java` é responsável por **executar** programas Java já compilados.

---

## Verificar a versão do compilador

```bash
javac -version
```

Exibe a versão do compilador Java.

Exemplo:

```text
javac 21.0.2
```

O comando `javac` transforma arquivos `.java` em arquivos `.class`.

---

# Estrutura básica de um programa Java

Arquivo:

```java
public class Main {

    public static void main(String[] args) {

        System.out.println("Olá Mundo!");

    }

}
```

Salve o arquivo com o nome:

```
Main.java
```

Em Java, o nome do arquivo deve ser igual ao nome da classe pública.

---

# Compilação

```bash
javac Main.java
```

Compila o arquivo-fonte.

Antes:

```
Main.java
```

Depois da compilação:

```
Main.java
Main.class
```

O arquivo `.class` contém o **bytecode**, que será interpretado pela JVM.

Se houver erros de sintaxe, eles serão exibidos durante essa etapa.

Exemplo:

```text
Main.java:5: error: ';' expected
```

---

# Execução

```bash
java Main
```

Executa o programa compilado.

Observe que **não** é necessário informar a extensão `.class`.

Saída:

```text
Olá Mundo!
```

Fluxo completo:

```
Main.java
      │
      ▼
 javac Main.java
      │
      ▼
Main.class
      │
      ▼
 java Main
```

---

# Compilando vários arquivos

Projetos Java normalmente possuem diversas classes.

Exemplo:

```
Main.java
Pessoa.java
Aluno.java
Professor.java
```

Para compilar todos os arquivos da pasta:

```bash
javac *.java
```

O caractere `*` (curinga) indica "todos os arquivos com extensão `.java`".

Após a compilação:

```
Main.class
Pessoa.class
Aluno.class
Professor.class
```

---

# Executando um programa organizado em pacotes

Em projetos maiores, as classes são organizadas em **pacotes** (*packages*), que funcionam como pastas para organizar o código.

Exemplo de estrutura:

```
src/
└── pacote/
    └── Main.java
```

Arquivo:

```java
package pacote;

public class Main {

    public static void main(String[] args) {

        System.out.println("Olá!");

    }

}
```

Após a compilação, a execução deve informar o nome completo da classe:

```bash
java pacote.Main
```

O ponto (`.`) separa o nome do pacote da classe.

---

# Arquivos JAR

Um arquivo **JAR (Java Archive)** é um pacote compactado que reúne classes compiladas e outros recursos de uma aplicação Java. Ele facilita a distribuição e a execução do programa.

## Criando um arquivo JAR

```bash
jar cf projeto.jar *.class
```

Explicação:

| Opção | Significado |
|--------|-------------|
| `jar` | Ferramenta para criar e manipular arquivos JAR. |
| `c` | Create (criar um novo arquivo). |
| `f` | File (especifica o nome do arquivo). |
| `projeto.jar` | Nome do arquivo gerado. |
| `*.class` | Inclui todos os arquivos compilados. |

Após a execução:

```
projeto.jar
```

---

## Executando um arquivo JAR

```bash
java -jar projeto.jar
```

A opção `-jar` informa à JVM que deve executar uma aplicação empacotada em um arquivo JAR.

Para que esse comando funcione, o JAR deve conter um arquivo de manifesto (`MANIFEST.MF`) indicando qual é a classe principal da aplicação.

---

# Organização típica de um projeto Java

```
projeto-java/
│
├── src/
│   ├── Main.java
│   ├── Pessoa.java
│   └── model/
│       └── Aluno.java
│
├── bin/
│
├── lib/
│
├── README.md
└── .gitignore
```

Descrição:

| Pasta | Função |
|--------|--------|
| `src` | Código-fonte da aplicação. |
| `bin` | Classes compiladas (`.class`). |
| `lib` | Bibliotecas externas. |
| `README.md` | Documentação do projeto. |

---

# Fluxo de desenvolvimento

Durante a criação de um programa Java, o processo normalmente segue estas etapas:

1. Escrever o código-fonte (`.java`).
2. Compilar o código com `javac`.
3. Corrigir possíveis erros de compilação.
4. Executar o programa com `java`.
5. Repetir o processo até que o programa esteja funcionando corretamente.

Fluxo resumido:

```
Escrever código
        │
        ▼
 Compilar (javac)
        │
        ▼
 Corrigir erros
        │
        ▼
 Executar (java)
        │
        ▼
 Testar
```

---

# Boas práticas

- Utilize sempre a mesma versão do JDK em todo o projeto.
- Nomeie as classes com letra inicial maiúscula (ex.: `Pessoa`, `Aluno`, `Produto`).
- Organize as classes em pacotes conforme a responsabilidade de cada uma.
- Compile frequentemente para identificar erros de sintaxe o quanto antes.
- Mantenha o código organizado e bem documentado.
- Utilize controle de versão (Git) para acompanhar a evolução do projeto.
- Sempre teste a aplicação após cada alteração importante.
