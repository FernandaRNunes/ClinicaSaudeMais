# CONFIRMAÇÃO DE AGENDAMENTO
## PRÉ-CONDIÇÃO

+ O paciente deve possuir uma consulta previamente agendada;


# **1 - Fluxo Principal**



 1. O sistema envia uma notificação (SMS ou e-mail) solicitando a confirmação de comparecimento à consulta;

 2. O paciente acessa o sistema;

 3. O paciente clica na opção “Confirmar Comparecimento”;

 4. O paciente confirma;

 5. O sistema atualiza o status da consulta para “Confirmado”;

 6. O sistema envia uma mensagem de confirmação ao paciente e a recepcionista responsável;

 7. O sistema exibe a mensagem “Comparecimento confirmado com sucesso.”

# **2 - Fluxo Alternativo de Exceção A**

1. O sistema envia a notificação de confirmação;

2. O paciente acessa o sistema e seleciona a opção “Cancelar Comparecimento”;

3. O sistema solicita confirmação da ação;

4. O paciente confirma o cancelamento;

5. O sistema atualiza o status da consulta para “Cancelada pelo Paciente”;

6. A recepcionista é notificada da desistência;

7. O sistema exibe a mensagem “Consulta cancelada com sucesso.”;

8. O sistema libera espaço na agenda do médico;

# **2 - Fluxo Alternativo de Exceção B**

1. O paciente tenta confirmar o comparecimento após o horário limite;

2. O paciente acessa a tela de consultas e tenta confirmar;

3. O sistema exibe a mensagem “O prazo para confirmação desta consulta expirou.”;

## PÓS-CONDIÇÃO 

+ O paciente e a recepcionista são devidamente notificados sobre o resultado da ação;

+ Em caso de confirmação, o horário é mantido bloqueado na agenda do médico;

+ Em caso de cancelamento, o horário é liberado para novos agendamentos;

