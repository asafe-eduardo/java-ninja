# Posto de Gasolina — Desafio (Fundamentos Java II)
## Simulador de Posto de Gasolina (Threads + synchronized)

### Contexto
Implemente uma simulação de um **posto de gasolina** com **duas bombas** e uma **fila de carros** que chegam para abastecer. Dois carros podem abastecer simultaneamente (um em cada bomba). Se não houver bomba disponível, os carros devem aguardar.

O objetivo do desafio é praticar:
- Orientação a objetos
- `Thread` e `synchronized`
- Demais recursos da Java SE

---

## Requisitos
- Posto com **2 bombas**.
- Fila de carros (ordem de chegada preservada).
- Cada carro possui: `modelo`, `cor`, `litrosDesejados`.
- Abastecimento simulado com `Thread.sleep`.
- Cálculo de custo (preço por litro fixo).
- Logs assíncronos no console, por exemplo:
  - `Bomba 1 disponível.`
  - `Carro Mustang vermelho chegou.`
  - `Bomba 1 ocupada.`
  - `Bomba 2 ocupada.`
  - `Carro Mustang vermelho abasteceu 40 litros e custou R$ X.`
  - `Carro Camaro amarelo chegou.`
  - `Carro Mustang vermelho saiu.`
  - `Bomba 1 disponível.`
  - `Carro Camaro amarelo abasteceu 40 litros e custou R$ X.`

> Observação: A ordem global dos logs pode variar por concorrência, mas a sequência lógica por carro deve ser consistente.

---

## Restrições
- Não usar banco de dados.
- Não usar frameworks.
- Persistência apenas em memória (coleções).

---
