# Resumo do Curso de POO em Java

**Curso:** [Curso em Vídeo - POO Java](https://www.youtube.com/playlist?list=PLHz_AreHm4dkqe2aR0tQK74m8SFe-aGsY)

## 👨‍🏫 Conteúdos Abordados

### 📦 Organização
- Criação de pacotes por aula (ex: `aula01`, `aula02`, ...)

### 🧱 Fundamentos de POO
- **Classe**: estrutura que define atributos e comportamentos.
- **Objeto**: instância de uma classe.
- **Atributos**: características do objeto.
- **Métodos**: ações executadas pelos objetos.
- **Construtores**: inicializam objetos com ou sem parâmetros.

### 🛡️ Encapsulamento
- Protege os dados internos da classe.
- Uso de modificadores de acesso: `private`, `public`, `protected`.
- Métodos **getters** e **setters** para acesso controlado.

### 🔁 Sobrecarga vs Sobrescrita
- **Sobrecarga (Overload)**: vários métodos com o mesmo nome, mas parâmetros diferentes.
- **Sobrescrita (Override)**: redefinição de um método herdado.

### 🧬 Herança
- Permite que uma classe herde atributos e métodos de outra.
- Utilização da palavra-chave `extends`.
- Exemplo: `class Gafanhoto extends Pessoa`

### 🧩 Polimorfismo
- **De sobrescrita**: mesmo método se comporta de forma diferente em subclasses.
- **De sobrecarga**: múltiplas versões de um método com mesmo nome.

### 🧰 Modificadores de Acesso
- `public`: acesso livre.
- `private`: acesso apenas na mesma classe.
- `protected`: acesso na mesma classe, pacote e subclasses.

### 🧪 Classes Abstratas
- Não podem ser instanciadas.
- Contêm métodos abstratos (sem corpo).
- Servem como modelo base para outras classes.

### 🧾 Interfaces
- Contratos que definem métodos que devem ser implementados.
- Utilização com `implements`.
- Exemplo: `class Video implements AcoesVideo`

### ⚙️ Relacionamentos entre Classes
- **Composição**: uma classe depende da existência da outra (ex: Visualizacao contém Gafanhoto e Video).
- **Agregação**: relação onde as classes podem existir separadamente (ex: Pessoa e Endereco).

## ✅ Conceitos Fixados
- Organização do código orientado a objetos.
- Boas práticas de encapsulamento e acesso.
- Clareza nas responsabilidades de cada classe.
- Aplicação prática dos pilares de POO: **Encapsulamento**, **Herança**, **Polimorfismo**.
