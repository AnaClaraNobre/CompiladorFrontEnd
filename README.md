
Link para o gitHub: https://github.com/AnaClaraNobre/CompiladorFrontEnd

Ao executar o programa na classe Main, você terá quatro opções disponíveis no console:
PS: caso queira clicar nas opções 1, 2 ou 3 de modo seguido, é melhor excluir os arquivos scanners e parsers existentes (os que foram gerados na opção anterior). 
ex: clico na opção 1: gera as classes scanners
quero clicar na opção 2, para isso eu tenho que apagar as classes que a opção 1 gerou e assim por diante. (perdão, não ficou mt boa essa parte kk)

Gerar o Scanner (1):
Esta opção gera a classe Scanner de forma isolada e realiza a análise léxica do arquivo entrada.txt. A entrada será exibida no console antes do início da execução.

Gerar o Parser (2): 
Esta opção gera tanto a classe Scanner quanto a classe Parser de forma isolada.
A análise léxica não será exibida no console.
A análise sintática será realizada, e a árvore sintática resultante do código presente no arquivo entrada.txt será exibida no console.
Além disso, a árvore gerada será salva em um arquivo chamado saida_arvore.txt.
A entrada do arquivo será exibida no console antes da execução.

Executar a Integração (3):
Esta opção realiza a geração e execução das classes Scanner e Parser em conjunto.
Tanto a análise léxica quanto a análise sintática serão exibidas no console.
A árvore sintática gerada será exibida no console, representando a estrutura do código no arquivo entrada.txt.
A entrada do arquivo será exibida no console antes da execução.

Sair do Programa (4):
Encerra a execução do programa.

OBS: Em todas as opções, o conteúdo do arquivo entrada.txt será exibido no console antes do início das análises.

