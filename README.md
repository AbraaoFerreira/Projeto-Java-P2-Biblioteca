# Projeto Biblioteca

Este é um projeto Java para uma aplicação de biblioteca que permite o gerenciamento de livros, empréstimos, reservas e geração de relatórios.

## Descrição do Problema

O sistema de biblioteca enfrenta dificuldades com empréstimos, reservas e relatórios. Registros manuais consomem tempo e são propensos a erros.

## Solução Proposta

Desenvolvemos um sistema fácil de usar que organiza itens, registra empréstimos e permite reservas. Usamos técnicas simples de programação para torná-lo flexível e fácil de manter.

## Funcionalidades

- Cadastro de livros: Permite cadastrar novos livros na biblioteca.
- Gestão de empréstimo: Permite registrar empréstimos de livros para os usuários.
- Gestão de reserva: Permite que os usuários reservem livros que estão atualmente emprestados.
- Geração de relatórios: Permite gerar relatórios sobre os livros disponíveis, emprestados e reservados.

## Pré-requisitos

- Java Development Kit (JDK) 8 ou superior instalado
- MySQL Server instalado e em execução
- Conector JDBC do MySQL (pode ser baixado em [https://dev.mysql.com/downloads/connector/j/](https://dev.mysql.com/downloads/connector/j/))

## Configuração do Banco de Dados

- Execute o script SQL fornecido (`criar_banco.sql`) para criar o banco de dados e a tabela necessária.

## Como Executar

1. Clone este repositório para o seu ambiente local.
2. Abra o projeto em sua IDE Java preferida.
3. Adicione o arquivo JAR do conector JDBC do MySQL ao classpath do projeto.
4. Compile e execute o projeto a partir da classe principal `Biblioteca.java`.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para enviar pull requests ou abrir novas issues relatando problemas ou sugerindo melhorias.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE.md](LICENSE.md) para mais detalhes.
