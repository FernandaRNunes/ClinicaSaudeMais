# AGENDAMENTOS 

## PRÉ-CONDIÇÃO

+ Estar logado no sistema.

+ Ter disponibilidade na agenda.

# **1 - Fluxo Principal**

1. O usuário acessa o sistema;

2. O usuário seleciona a especialidade desejada;

3. O usuário seleciona o médico de sua preferência;

4. O usuário escolhe uma data disponível;

5. O Usuário escolhe um horário disponível;

6. O Sistema concluí o agendamento;

# **2 -  Fluxo Alternativo de Exceção A**

1. usuário seleciona um médico específico;

2. O sistema verifica e identifica que o médico está indisponível para o horário solicitado;

3. O sistema exibe a mensagem: “O profissional não possui horários disponíveis neste período.”;

4. O usuário pode escolher outro horário ou outro profissional;


# **2.1 - Fluxo Alternativo de Exceção B**

1. O usuário acessa o sistema;

2. O usuário seleciona uma data e horário disponíveis;

3. No momento da confirmação, o sistema detecta que outro usuário acabou de reservar o mesmo horário;

4. O sistema exibe a mensagem “Horário indisponível. Por favor, selecione outro.”;

5. O sistema retorna à tela de horários atualizada;

6. O usuário escolhe novo horário;

## PÓS-CONDIÇÃO
+ Nenhum agendamento é confirmado até que um novo horário seja selecionado.
