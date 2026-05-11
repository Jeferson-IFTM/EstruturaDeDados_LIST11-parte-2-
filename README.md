# MyLinkedList - Implementação de Lista Encadeada Dinâmica

Este projeto consiste na implementação integral de uma **Lista Dinâmica Simplesmente Encadeada** em Java. O objetivo é demonstrar o domínio sobre manipulação de referências (ponteiros), gerenciamento de memória e análise de complexidade de algoritmos.

## 🚀 Estrutura do Projeto

O projeto está dividido em três componentes principais para garantir a separação de responsabilidades:

1.  **`MyList<T>`**: Interface que define o contrato com todas as operações obrigatórias (inserção, remoção, busca e acesso).
2.  **`MyLinkedList<T>`**: Classe concreta que implementa a lógica de encadeamento de nós.
3.  **`Main.java`**: Interface via console (Menu) para realizar testes manuais e demonstrar o funcionamento da estrutura.

## 🛠️ Funcionalidades Implementadas

* **Inserção:** Início, Fim, Posição Específica e Inserção Ordenada.
* **Remoção:** Início, Fim, Por Índice e Por Elemento.
* **Busca:** Localização de índice por valor e acesso direto via índice.
* **Utilidade:** Verificação de tamanho e limpeza total da lista.

## 📊 Análise de Complexidade (Assintótica)

Abaixo, a tabela de performance para as operações implementadas:

| Operação               | Complexidade | Justificativa                                              |
| :--------------------- | :----------- | :--------------------------------------------------------- |
| `addFirst`             | $O(1)$       | Inserção direta no início, apenas altera o `head`.         |
| `addLast`              | $O(1)$       | Graças ao uso do ponteiro `tail`, não precisa percorrer a lista. |
| `insertAt` / `get`     | $O(n)$       | No pior caso, percorre a lista até a posição desejada.     |
| `addSorted`            | $O(n)$       | Necessário encontrar o ponto exato de inserção na ordem.   |
| `removeFirst`          | $O(1)$       | Apenas desloca o ponteiro `head`.                          |
| `removeLast`           | $O(n)$       | Precisa percorrer até o penúltimo nó para atualizar o `tail`. |

## 🎥 Defesa Técnica

Como parte da avaliação, um vídeo explicativo foi produzido detalhando:
1.  **Execução dos Testes:** Demonstração do menu interativo e validação das operações.
2.  **Lógica de Nós:** Explicação de como os objetos `Node` se conectam via referência `.next`.
3.  **Casting Genérico:** Explicação técnica sobre o uso de `(Comparable<T>)` dentro do método `addSorted` para permitir ordenação em classes genéricas.

---
**Desenvolvido por:** Jeferson Silva Lima
**Disciplina:** Estrutura de Dados
