


# LOGIN 


# **1 - Fluxo Principal - Login Tradicional**

## PRÉ-CONDIÇÃO

+ O usuário deve possuir cadastro prévio no sistema.

+ O sistema deve estar conectado ao banco de dados.

## FLUXO PRINCIPAL

1. Usuário acessa o App SaudeMais;

2. O Sistema solicita o login via email e senha;

3. Usuário insere os dados solicitados;

4. Sistema valida os dados do usuário pelo banco de dados;

5. O sistema confirma o acesso e o direciona o usuário para a Homepage do App.

## PÓS-CONDIÇÃO

+ O usuário é autenticado com sucesso.

+ Sessão do usuário é iniciada.


# **2 - Fluxo Alternativo de Sucesso**

## PRÉ-CONDIÇÃO

+ O aplicativo deve estar integrado às APIs das redes sociais (Google/Apple).

+ O usuário deve possuir conta ativa na rede social escolhida.

## FLUXO ALTERNATIVO DE SUCESSO

1. Usuário acessa o App SaudeMais;

2. O Sistema solicita o login via email e senha;

3. O Sistema possibilita acesso via redes sociais;

4. O usuário realiza o login via redes social;

5. O Sistema autentetica o acesso pela rede social escolhida;

6. O Sistema confirma o acesso e direciona o usuário para a Homepage do App.

## PÓS-CONDIÇÃO

+ O usuário é autenticado com sucesso via rede social;

+ O sistema registra o perfil do usuário no banco de dados.

# **3 - Fluxo Alternativo de Exceção A**

## PRÉ-CONDIÇÃO

+ Tentativa de login com dados inválidos

## Fluxo Alternativo de Exceção A

1. Usuário acessa o App SaudeMais;

2. O Sistema solicita o login via email e senha;

3. Usuário insere dados inválidos;

4. O Sistema notifica que os dados de login são inválidos

5. O sistema oferece a opção “Esqueci minha senha”.

## PÓS-CONDIÇÃO 

+ O Sistema não permite o login

+ O sistema mantém o usuário na tela de login.

# **3.1 - Fluxo Alternativo de Exceção B**

## PRÉ-CONDIÇÃO

+ O aplicativo deve estar integrado às APIs das redes sociais (Google/Apple);

+ O Usuário não possui conta em rede social.

## FLUXO ALTERNATIVO DE EXCEÇÃO B

1. Usuário acessa o App SaudeMais;

2. O Sistema solicita o login via email e senha;

3. O Sistema possibilita acesso via redes sociais;

4. Usuário não possui conta ativa em rede social;

5. O Sistema solicita o Login via email e senha.

## PÓS-CONDIÇÃO

+ O acesso não é concedido.

+ O sistema mantém o usuário na tela de login.
