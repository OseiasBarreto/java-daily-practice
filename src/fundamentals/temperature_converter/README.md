# 🌡️ Temperature Converter

O **Temperature Converter** é um programa em **Java** que permite converter valores de temperatura em **Celsius** para **Fahrenheit (°F)** e **Kelvin (K)**. O usuário interage através de um menu no console, digitando o valor em Celsius e escolhendo a unidade de conversão desejada. O programa continua executando até que o usuário escolha sair.

---

## 📂 Estrutura do Código
- **Pacote:** `fundamentals.temperature_converter`
- **Classe principal:** `Temperature_Converter`
- **Métodos implementados:**
  - `convFahrenheit(int celsius)` → converte Celsius para Fahrenheit  
  - `convKelvin(float celsius)` → converte Celsius para Kelvin  

O programa utiliza **Scanner** para leitura do usuário e **switch-case** para tratamento das opções do menu.

---

## 📌 Exemplo de uso
```arduino
Qual o valor em Celsius para converter?
25
Converter 25° graus Celsius para: 

1 - Fahrenheit
2 - Kelvin
3 - Sair do programa
Escolhendo 1 → saída: O resultado foi: 77°F

Escolhendo 2 → saída: O resultado foi: 298.15K

Escolhendo 3 → encerra o programa com a mensagem: SAINDO DO PROGRAMA...

O programa continua pedindo novas conversões até o usuário optar por sair.

🔧 Funcionalidades
Menu interativo com loop até saída

Conversão de Celsius para Fahrenheit

Conversão de Celsius para Kelvin

Tratamento de opções inválidas

Entrada de usuário via console

✨ Autor
👤 Oséias Barreto
📌 Repositório de estudos diários em Java: java-daily-practice
