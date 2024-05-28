# language: pt
@test
Funcionalidade: Propondo lances ao leilao

  Esquema do Cenário: Cenário:  Testar se o recurso de validação do licenciamento está aplicado para o WS
    Dado o <local da publicação>
    E renomear o arquivo de licenciamento de <serviço> com extensão .jpg para a extensão .png
#    E acessar o site do gerenciador do tomcat fazer o reload do <serviço>
#    E obter a primeira requisição com o <servidor>, <porta>, <serviço> e <endpoint> utilizando a funcionalidade ?WSDL
#    Quando submeter a requisição deste primeiro serviço
#    Então receber a mensagem Arquivo '*.LIC' não encontrado.
    E renomear o arquivo de licenciamento de <serviço> com extensão .png para a extensão .jpg
#    E acessar o site do gerenciador do tomcat fazer o reload do <serviço>
#    Quando submeter a requisição deste primeiro serviço
#    Então receber a mensagem do serviço esperada

    Exemplos:
      | servidor     | local da publicação            | porta | serviço | endpoint               |
      | 140.2.254.15 | C:\Users\lucsd\Downloads\Teste | 6060  | novo    | services/EBServicesBar |

