<div align="center">

# 🔁 PSC · Lista 04 — Laços de Repetição e Validação de Dados

**Dez programas em Java trabalhando `while`, `for`, `do-while`, acumuladores e validação robusta de entrada.**

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![Exercícios](https://img.shields.io/badge/exerc%C3%ADcios-10-7C3AED?style=flat-square)
![PSC](https://img.shields.io/badge/disciplina-PSC%202025-0EA5E9?style=flat-square)

</div>

---

## 📖 Sobre

Quarta lista da disciplina **PSC — Programação de Soluções Computacionais (2025)**. O foco são as **estruturas de repetição** e, principalmente, **validação de entrada**: os programas insistem na pergunta até receber um dado válido, em vez de aceitar qualquer coisa.

## 📚 Exercícios

### Repetição simples

| Arquivo | O que faz |
|:---|:---|
| `NumerosImpressao.java` | Imprime de 1 a 20 — primeiro um abaixo do outro, depois lado a lado |
| `NumerosImpares.java` | Lista os números ímpares entre 1 e 50 |
| `MaiorNumero.java` | Lê 5 números e identifica o maior |
| `SomaEMedia.java` | Lê 5 números e calcula soma e média |
| `NumerosNoIntervalo.java` | Recebe dois inteiros e imprime todos os números do intervalo entre eles, tratando a ordem invertida |

### Validação de entrada

| Arquivo | Regra validada |
|:---|:---|
| `validarNota.java` | A nota deve estar entre **0 e 10** — repete a pergunta enquanto estiver fora |
| `ValidarUsuarioSenha.java` | A senha **não pode ser igual** ao nome de usuário |
| `ValidarInformacoes.java` | Nome com mais de 3 caracteres · idade entre 0 e 150 · salário maior que zero |

### Crescimento populacional

| Arquivo | O que faz |
|:---|:---|
| `CrescimentoPopulacional.java` | Versão com valores fixos: calcula em quantos anos a população do país A ultrapassa ou iguala a do país B |
| `CrescimentoPopulacionalDinamico.java` | Versão interativa e mais robusta: lê população inicial e taxa de crescimento anual dos dois países, validando cada entrada |

> `CrescimentoPopulacionalDinamico` é o exercício mais completo da lista (~105 linhas): exige população positiva, taxa de crescimento positiva e população de B maior que a de A, tratando também `InputMismatchException` quando o usuário digita texto no lugar de número.

## 🧠 Conceitos aplicados

- `for`, `while` e `do-while`
- Acumuladores (`soma += valor`) e busca de maior/menor
- **Laço de validação** — repetir a leitura até o dado satisfazer a regra
- `try/catch` com `InputMismatchException` + `scanner.next()` para limpar o buffer
- Cálculo de crescimento composto ao longo de iterações

## ▶️ Como executar

```bash
git clone https://github.com/rafaellfsouza/psc-lista-04-2025.git
cd psc-lista-04-2025

javac ValidarInformacoes.java
java ValidarInformacoes
```

---

<div align="center">

<sub>Desenvolvido por <a href="https://github.com/rafaellfsouza"><b>Rafael Luiz Ferreira de Souza</b></a> · PSC 2025 · <code>Java</code> <code>Laços</code> <code>Validação</code></sub>

</div>
