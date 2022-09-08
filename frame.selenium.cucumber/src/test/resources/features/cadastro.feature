#language: pt
#Author: samuel00750@hotmail.com

@regressivos @cadastroPrestador
Funcionalidade: Cadastro de prestador de servicos
Como prestador de servicos
Quero realizar o meu cadastro
Para realizar entregas

Contexto: Acessar a tela de cadastro
Dado que esteja na tela de cadastro

@positivo @smoke @moto
 Cenario: Realizar cadastro metodo moto
   E preencha dados pessoais validos
   E preencha endereco valido
   E selecione tipo de veiculo
   Quando envie a foto da cnh valida
   Entao clicar em cadastre-se para fazer entregas
   E valido cadastro realizado com sucesso

@positivo
Cenario: Realizar cadastro metodo bicicleta
  Quando eu clicar em cadastra-se para entrega de bicicleta
  Entao eu valido as informacoes

@positivo
Cenario: Realizar cadastro metodo van
Quando eu clicar em cadastra-se para entrega de van
Entao eu valido as informacoes

@negativo
Cenario: Selecionar mais de um metodo de entrega
Mas escolher mais de um metodo de entrega
Quando clico em cadastra-se
Entao  eu valido mensagem de erro sobre a obrigatoriedade do metodo de entrega

@negativo
Cenario: Realizar cadastro com dados em Branco
Mas nao informo nenhum dado obrigatorio
Quando cliclo em cadastra-se
Entao valido mensagens nos campos indicando obrigatoriedade do preenchimento

@negativo
Cenario: Realizar cadastro com dados invalidos
Mas informo dado obrigatorios invalidos
Quando clico em cadastra-se
Entao valido mensagens nos campos indicando dados invalidos

@negativo
Cenario: Realizar cadastro sem enviar anexo
E preencho os campos obrigatorios
Mas nao anexo a cnh
Quando clico em cadastra-se
Entao valido mensagem de erro sobre a obrigatoriedade do anexo

@negativo
Cenario: Realizar cadastro sem metodo de entrega
Mas nao informo nenhum metodo de entrega
Quando clico em cadastra-se
Entao valido mensagens de erro sobre a obrigatoriedade de um metodo

Cenario: Realizar cadastro sem preencher o campo nome
Mas nao preencho o campo nome
Quando clico em cadastra-se
Entao valido a mensagem campo nome obrigatorio

