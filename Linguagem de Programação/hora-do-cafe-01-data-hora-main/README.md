# Hora do Café - 001 ☕ - Data e Hora 📅⏰

> “Eu desperdicei o tempo, e agora o tempo me desperdiça.”
> *William Shakespeare*

## Orientações Gerais: 🚨

1. Utilize **apenas** tipos **wrapper** para criar variáveis quando necessário.
2. Verifique se **não** há **erros de compilação** no projeto antes de enviar.
3. Respeite os nomes de atributos e métodos definidos no exercício.
4. Tome cuidado com os argumentos especificados no exercício. Não adicione argumentos não
   solicitados e mantenha a ordem definida no enunciado.

---

### 🕰️ Exercício 1 - Verificar se uma data já passou

`Boolean isPassado(LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim)`

- Deve retornar `true` se `dataHoraInicio` for anterior a `dataHoraFim`, caso contrário `false`.

---

### 🎂 Exercício 2 - Calcular idade

`Integer calcularIdade(LocalDate dataNascimento, LocalDate dataAtual)`

- Deve retornar a idade em anos completos considerando a data de nascimento e a data atual.

**Exemplo:**

- Input: `dataAniversario = 2000-09-01`, `dataAtual = 2025-09-01`
- Output: `25`

> **💡 Dica**
> - Você pode usar o método `until`, que calcula a diferença entre duas datas.
> - Ele irá retornar um objeto Period.
> - Saiba mais em: 
>   - https://docs.oracle.com/javase/8/docs/api/java/time/Period.html
>   - https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html#until-java.time.chrono.ChronoLocalDate-

---

### 📆 Exercício 3 - Verificar final de semana

`Boolean isFinalDeSemana(LocalDate data)`

* Deve retornar `true` se a data informada for um sábado ou domingo, caso contrário `false`.

**Exemplo:**

- Input: `data = 2025-09-06` (sábado)
- Output: `true`

> **💡 Dica**
> - Você pode usar o método `getDayOfWeek()`, que irá retornar uma classe que representa o Dia da
    Semana, e em seguida, o método `getValue()`, que irá retornar o dia da semana representado
    numericamente.
> - Os dias da semana seguem o padrão: **1 = Segunda-feira ... 7 = Domingo**.

---

### 📅 Exercício 4 - Próximo dia útil

`LocalDate proximoDiaUtil(LocalDate data)`

* Deve retornar a próxima data que não seja sábado nem domingo.

**Exemplo:**

- Input: `data = 2025-09-06` (sábado)
- Output: `2025-09-08` (segunda-feira)

---

### ✍️ Exercício 5 - Formatar data e hora

`String formatarDataHora(LocalDateTime dataHora)`

- Deve formatar a data e hora com os seguintes campos:

    - Mês e ano
    - Hora 12h com minutos e segundos
    - AM/PM
    - Nanosegundos

**Exemplo:**

- Input: `dataHora = 2025-09-25T15:30:45.123`
- Output: `09/25/2025 03:30:45 PM (nanosegundos: 123)`

---

### 🗓️ Exercício 6 - Gerar reuniões Semanais

`List<LocalDate> gerarReunioesSemanais(LocalDate dataComeco, LocalDate dataFim, List<Integer> diasDaSemana)`

* Gera uma lista com **todas as datas de reuniões** que ocorram entre `dataComeco` e `dataFim`.
* Cada reunião acontece nos **dias da semana especificados** em `diasDaSemana`.
* Os dias da semana seguem o padrão: **1 = Segunda-feira ... 7 = Domingo**.

**Exemplo 1:**

* **Input:**
  `dataComeco = 2025-09-01`
  `dataFim = 2025-09-15`
  `diasDaSemana = [2, 4]` *(Terças e Quintas)*

* **Output:**
  `[2025-09-02, 2025-09-04, 2025-09-09, 2025-09-11]`

**Exemplo 2:**

* **Input:**
  `dataComeco = 2025-09-01`
  `dataFim = 2025-09-10`
  `diasDaSemana = [1, 7]` *(Segundas e Domingos)*

* **Output:**
  `[2025-09-01, 2025-09-07, 2025-09-08]`

> **💡 Dica**
> - Você pode usar o método `getDayOfWeek()`, que irá retornar uma classe que representa o Dia da
    Semana, e em seguida, o método `getValue()`, que irá retornar o dia da semana representado
    numericamente.
> - Os dias da semana seguem o padrão: **1 = Segunda-feira ... 7 = Domingo**.

---

### 🔥 Desafio - Dia dos Pais

`LocalDate calcularDiaDosPais(Integer ano)`

* Retorna a data do **Dia dos Pais no Brasil** para o ano informado.
* O Dia dos Pais **sempre cai no segundo domingo de agosto**.

**Exemplo:**

* **Input:**
  `ano = 2023`

* **Output:**
  `2023-08-13`
