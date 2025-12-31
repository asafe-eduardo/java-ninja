# Machop Academia — Desafio (Fundamentos Java I)
## Gestor de Academia (CRUD + Coleções + Pacotes)

### Contexto
Você foi contratado para criar um sistema simples, em **Java SE**, para gerenciar uma pequena academia. O sistema deve funcionar em **linha de comando (console)** e permitir o cadastro e consulta de **alunos**, **planos**,**matrículas**, **listar equipamentos**, **professores** e etc...

O objetivo do desafio é praticar:
- Criação de classes e objetos (POO)
- Organização por **pacotes**
- Coleções do Java (`List`, `Set`, `Map`)
- Comparação/ordenação (`Comparator`)
- Controle de fluxo (`if`, `switch`, laços)

---

## Requisitos

### 1) Entidades (exemplo)
Implemente as classes (sugestão de atributos):
- **Aluno**: `id`, `nome`, `email`, `dataNascimento` (opcional)
- **Plano**: `id`, `nome`, `valorMensal`, `duracaoMeses`
- **Matrícula**: `id`, `alunoId`, `planoId`, `dataInicio`, `status`

### 2) Operações (menu no console)
O sistema deve oferecer um menu com as operações abaixo:

**Alunos**
1. Cadastrar aluno  
2. Listar alunos  
3. Buscar aluno por id  
4. Remover aluno por id  

**Planos**
5. Cadastrar plano  
6. Listar planos  
7. Buscar plano por id  
8. Remover plano por id  

**Matrículas**
9. Criar matrícula (vincula aluno + plano)  
10. Listar matrículas  
11. Listar matrículas por aluno  
12. Cancelar matrícula  

> Observação: Você pode agrupar o menu como preferir, mas todas as operações devem existir.

### 3) Regras de negócio mínimas
- `id` deve ser único.
- Não permitir cadastrar aluno com **email vazio**.
- Não permitir criar matrícula se **aluno** ou **plano** não existir.
- Não permitir remover plano se existir **matrícula ATIVA** vinculada (regra simples).

---

## Instruções gerais

### 1) Coleções
Para armazenar os dados de alunos, planos, matriculas e etc... pode utilizar como container as interfaces
do pacote:
- `java.util.*` para alunos

### 2) Orientação a objetos
Fazer a modelagem e design de suas classes seguindo as boas práticas
de **POO**

### 3) Validações
Fazer as validações negociais utilizando os recursos
do **JAVA SE** como **if**, **switch**, **for** e **while**

---

## Restrições
- Não usar banco de dados.
- Não usar frameworks.
- Persistência apenas em memória (coleções).

---