# :computer: Projeto de Software - Lab04

Laboratório 04 da disciplina Projeto de Software com o objetivo de retirar bad smells do código, ou seja, fazer uma refatoração.

## :arrows_clockwise: Bad Smells:

Na classe Anuncio há dois grandes problemas, o primeiro se dá pelo nome do atributo *codigoPreco*(que deve ser o *precoTipoAnuncio*), pois não é claro de se deduzir o que seja, após muito tempo observando, entendi que é o código de um dos três tipos de atributos, o TEXTO, IMAGEM e VÍDEO.

Solução: Acredito que estas constantes podem ser excluídas, e ao invés de se utilizar as constantes, deve-se criar três classes distintas, onde estas irão herdar da classe abstrata *Anuncio*.
Assim, o código estará mais legível e o cálculo da compra na classe Cliente será realizado no seu respectivo tipo de anuncio, sem precisar fazer este cálculo no método histórico. Inclusive, este método histórico da classe *Compra* está muito grande (isso se dá também pelo uso dos switch case, isso indica um tipo de bad small(**long method**), por isso, este método deve ser modularizado em métodos menores( como *imprimeInformacoesCliente()* e o *calculaPontos()* e além disso os cálculos serão realizados cada qual dentro da sua respectiva classe) para isto, irei utilizar a técnica de *Extract Class* fazendo com que cada qual faça a sua devida rotina. E desse modo, no método histórico, esse novos métodos só devem ser chamados.

Ainda na classe Cliente, acredito que o tipo ```Vector() compras```, não é o melhor. Por esse motivo, irei trocar para o tipo arrayList que me dá um leque maior de funcionalidades de operações.

Além disso, ainda no método histórico podemos enxergar problemas de nomenclaturas de variáveis, como por exemplo: 
- total
- totalParcial
- cada ( é do tipo compra, deveria se chamar compra)
- pontosFrequentes
- resultado

Sendo assim, as variáveis citadas acima deveriam se chamar:

- preco
- precoTotal
- Não terei compra no meu sistema, por isso "cada" não irá ter correção.
- pontos
- informacoesCliente

Além de haver dois erros ortógraficos, são estes
- um na variavel ```pontosFRequentes```
E o outro na string  ```"pontod"```

A classe *Compra*, atualmente no sistema não realiza nenhum tipo de operação, sendo assim ela é considerada uma **classe preguiçosa** e faz uso da **inveja de recursos** da classe *Anuncios*, logo, isto configura dois tipos de bad smalls.

## :repeat: Refatorações realizadas: 

#### Na classe Anúncio: 
- A classe foi transformada em uma classe abstrata que possui três subtipos (Vídeo, Imagem e Texto)
- O atributo diasAnuncio que estava na classe Compra foi extraído e levado para a classe Anúncio. 

#### Na classe Compra: 
- Classe excluída, por possuir dois tipos de bad smells (classe preguiçosa e inveja de recursos.

#### Na classe Cliente: 
O método historico será composto de mais dois métodos, o calculaPrecoTotal() que está sendo realizado em cada classe do tipo Anuncio e o método imprimeInformaçõesCliente().



