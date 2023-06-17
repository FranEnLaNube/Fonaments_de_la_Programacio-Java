## Ejercicis FDLP
### Ejercicios del curso de Fundamentos de la Programación del Cibernarium - Barcelona Activa

### Exercicis Fonaments de la Programació – Java 
#### M3 – Mètodes de Entrada
##### M3 – Exercici 1
Fer un programa que li demani a l’usuari/ària: El nom, el cognom i l’edat.  
Un cop l’usuari/ària hagi acabat d’introduir les dades, aquestes s’han de mostrar per pantalla.
##### M3 – Exercici 2
Fer un programa que li demani dos números sencers a l’usuari/ària. Al final, el programa imprimeix per pantalla el següent missatge:
- El resultat de la suma és: “valor”
- El resultat de la resta és: “valor”
- El resultat de la multiplicació és: “valor”
- El resultat de la divisió és: “valor”.
##### M3 – Exercici 3
El programa demana a l'usuari/ària que introdueixi 3 notes i el programa mostra la mitja de les 3 notes per pantalla.  
**Nota:**
Les notes que introdueix l'usuari/ària són números sencers, però la mitja pot tenir decimals.

##### M3 – Exercici Extra 1
Escriu un programa Java que llegeix un nombre enter per teclat i obté i mostra per pantalla el doble i el triple d'aquest número.
##### M3 – Exercici Extra 2
**NOTA** Per aquest exercici es necessiten alguns coneixements del següent mòdul (Estructures condicionals).  
Escriu un programa Java que sol·liciti per pantalla un nombre enter, i si és menor que 10, ho assigni a una variable de tipus int, anomenada varInt. Si no ho és, llavors li assignarà a la variable varInt el número 1. (Utilitza per a això l'operador condicional ? :)
Després, imprimeix la taula de multiplicar d'aquesta variable.
##### M3 – Exercici Extra 3
Escriu un programa Java que calculi els litres de pintura necessaris per a pintar una paret rectangular.  
Un litre de pintura cobreix aproximadament, 12 m² en una sola mà.
Crea una constant anomenada coberturaLitro per a guardar la dada de cobertura de la pintura (12 m²)  
Hauràs de demanar a l'usuari/ària:
- L'alt i ample de la paret (multiplicant sabràs l'àrea de la mateixa)
- El nombre de mans a aplicar.
Mostra en pantalla els litres de pintura a utilitzar.
#### M4 – Estructures Condicionals
##### M4 – Exercici 1
Modifica l’exercici 1 del mòdul 3. Un cop introduïdes les dades, el programa ha de mostrar el següent per pantalla:
- Si l’usuari/ària té 18 anys o més: “Nom Cognom, ets MAJOR d’edat” 
- Si l’usuari/ària és menor de 18 anys: “Nom Cognom, ets MENOR d’edat”.
##### M4 – Exercici 2
Aquest programa li demana l’edat a l’usuari/ària, en funció d’aquesta, mostrarem un dels següents missatges per pantalla:
- Si té 5 anys o menys: preescolar.
- Si té entre 6 i 11 anys: primària.
- Si té entre 12 i 15: ESO.
- Si té entre 16 i 17: Batxillerat.
- Si és major d'edat: FP o Universitat.
##### M4 – Exercici 3
Una escola d’idiomes concedeix beques a futurs estudiants si compleixen una sèrie de requisits.  
- A l'alumne/a se li assigna una beca si és major d’edat i si té un títol universitari. O també se li assigna una beca si l’alumne/a està a l’atur.  
- El programa demana les tres dades per pantalla i en finalitzar mostra si l’alumne/a té la beca o no.
##### M4 – Exercici 4 (Switch)
L’usuari/ària introdueix un mes per pantalla i mitjançant un switch amb els 12 mesos de l’any, el programa calcula els dies del mes i mostra el següent:  
Exemple: Si el número introduït és 1, llavors ha d'aparèixer per pantalla: “El mes de gener té 31 dies”
##### M4 – Exercici 5
Fer un programa que demani dos números i un operador(+,-,*,/).  
Al final, el programa ha d'imprimir per pantalla el resultat de fer l’operació que contingui la variable operador.
##### M4 – Exercici 6
Fer un programa que demani a l’usuari/ària quin dia i quin mes va néixer, amb aquesta informació el programa mostra per pantalla, de quin signe del zodíac és.
- Àries-Aries (21.03 — 19.04)
- Taure-Tauro (20.04 — 20.05)
- Bessons-Géminis (21.05 — 20.06)
- Cranc-Cáncer (21.06 — 22.07)
- Lleó-Leo (23.07 — 22.08)
- Verge-Virgo (23.08 — 22.09)
- Balança-Libra (23.09 — 22.10)
- Escorpí-Escorpión (23.10 — 21.11)
- Sagitari-Sagitario (22.11 — 21.12)
- Capricorn-Capricornio (22.12 — 19.01)
- Aquari-Acuario (20.01 — 18.02)
- Peixos-Piscis (19.02 — 20.03)
##### M4 – Exercici Extra 1
Fes un programa que pregunti a l'usuari/ària dos nombres enters al qual anomenaràs dividend i divisor respectivament.  
El divisor haurà d'estar comprès entre 2 i 7.  
En cas contrari, el programa haurà de mostrar un missatge d'error.  
Si el divisor és correcte (2-7) mostra en pantalla si el dividend és múltiple del divisor, o no.
##### M4 – Exercici Extra 2
Demana a l'usuari/ària un número entre 0 i 99 i mostra'l escrit en lletres (pots fer-ho en català o castellà).  
**Exemple**: 56 (cinquanta-sis) o 56 (cincuenta y seis)
##### M4 – Exercici Extra 3
Aquesta línia de codi:  
`int numRandom = (int)(Math.random() * 3) + 1;`  
Retorna un número entre l'1 i el 3 de forma aleatòria.  
Escriu un programa que et permeti jugar pedra, paper o tisora amb l'ordinador.  
Per a això l'ordinador haurà de generar un nombre aleatori entre 1 i 3 que representi pedra, paper o tisora respectivament, i l'usuari/ària haurà de respondre al seu torn amb un nombre entre l'1 i el 3 després de mostrar la següent pantalla:  
Juguem a pedra, paper o tisora:
1. Pedra
2. Paper
3. Tisora

Tria (1-3):  
Si l'usuari/ària indica algun nombre diferent del sol·licitat, haurà d'aparèixer el següent missatge:  
«Entenc que no vols jugar. Adeu»  
En cas contrari, indicar el guanyador/a de la següent manera:  
Jo xxx i tu xxx. He guanyat!, o Has guanyat!  
Segons sigui el cas.  
**Exemple:** «Jo paper i tu tisora. Has guanyat!»
##### M5 – Estructures Repetitives i Arrays
###### M5 – Exercici 1
El programa demana quantes paraules vol introduir l'usuari/ària. Aquest, introdueix el número i llavors apareix el següent missatge  
"Introdueix la paraula".  
Aquest missatge es mostra tantes vegades com número de paraules ha dit l'usuari/ària que volia introduir. Les paraules es guarden en un arrayList i un cop han sigut totes introduïdes, es mostren per pantalla.

##### M5 – Exercici 2
El programa demana dos números enters i llavors calcula la suma dels valors compresos entre els dos números, inclosos.  
**Exemple:** 4 i 10  --> resultat = 4 + 5 + 6 + 7 + 8 + 9 + 10 = 49
##### M5 – Exercici 3
Aquesta línia de codi:  
`Math.ceil((Math.random() * 10));`  
Retorna un número entre el 1 i el 10 de forma aleatòria.  
L’exercici consisteix a què l’usuari/ària ha d'endevinar el número escollit aleatòriament pel programa.  
El programa, demana números a l’usuari/ària fins que aquest encerti el número aleatori generat pel programa.  
Un cop l’usuari/ària ha endevinat el número, es mostrarà per pantalla el següent missatge:  
“Enhorabona, el número era X”
##### M5 – Exercici 4
Has de modificar el programa anterior per afegir una nova funcionalitat:  
Establir un número màxim de 5 intents.  
Si l’usuari/ària encerta el número escollit pel programa abans d'aquests 5 intents, el programa mostra el següent missatge per pantalla:  
“Enhorabona, el número és X i has necessitat Y intents per encertar-lo”.  
Si no encerta el número abans de 5 intents, el programa mostra per pantalla:  
"Has utilitzat massa intents! El número és X ".
##### M5 – Exercici 5
Has de modificar el programa de les beques (M4 Exercici 3)  
Ara el programa ha de poder donar 5 beques.  
El programa anirà demanant les dades dels/les alumnes fins que es donin aquestes 5 beques. Un cop el programa hagi assignat les 5 beques s’ha de mostrar per pantalla els noms dels/les 5 alumnes que tenen beca.
##### M5 – Exercici Extra 1
Realitzar un joc per endevinar un nombre aleatori N, entre 1 i 500.
Si la distància entre el nombre a endevinar i el de l'usuari/ària és de 50 o més, el programa haurà de dir:  
“Fred, fred: el teu número és més gran “ o “Fred, fred: el teu número és més petit “  
Si la distància entre el nombre a endevinar i el de l'usuari/ària està entre 15 i 50, el programa haurà de dir:  
“Tebi, Tebi: el teu número és més gran “ o “Tebi, Tebi: el teu número és més petit “   
I si la distància entre el nombre a endevinar i el de l'usuari/ària és menor a 15, el programa haurà de dir:  
“Calent, calent: el teu número és més gran “ o “Calent, calent: el teu número és més petit “  
El procés acaba quan l'usuari/ària encerta.
##### M5 – Exercici Extra 2
Realitza un programa que pinti la lletra L per pantalla feta amb asteriscs.  
El programa demanarà l'altura.  
El pal horitzontal de la L tindrà una longitud de la meitat (divisió entera entre 2) de l'altura més un. (Recordar println i print)
**Exemple:**  
Introdueix l'alçada de la L: 5  
La base serà la divisió del nombre entre 2: (5 / 2) + 1 = 3
```
*  
* 
*
*
* * *
```
#### M6 – Mètodes
##### M6 – Exercici 1
Modificar la calculadora arcaica (M4 Exercici 5). El programa demana a l’usuari/ària que introdueixi dos números i l’operació que desitja realitzar.  
Cada operació (suma, resta, multiplicació, divisió i mòdul) estarà programada en un mètode diferent
##### M6 – Exercici 2
Aquest programa calcula l'edat mitjana d'un número de persones. Aquest número s'haurà de preguntar a l'usuari/ària.

S'ha de crear una funció que s'encarregui de demanar les edats a l'usuari/ària i de calcular l'edat mitjana.

- La funció rebrà per paràmetre el núm. de persones a qui ha de demanar l'edat.
- L'edat de les persones només serà vàlida si està compresa entre 0 i 120 anys.
- La mitjana de les edats introduïdes s'ha de retornar per la funció (return).
##### M6 – Exercici Extra 1
Fes un programa amb 4 mètodes. El programa “main” ha de cridar als 4 mètodes i interactuar amb ells de la següent manera:  
a. Crea un mètode sense paràmetres i sense retorn que imprimeixi per consola “soc un mètode”. Crida a aquest mètode des del main.

Sortida: soc un mètode


b. Crea un mètode que rebi un arrayList de números com a paràmetre, imprimeixi el número més gran per consola i retorni l’índex de l’arrayList on es troba el número més petit.  
Crea un arrayList de 5 números al main i utilitza el mètode que acabes de crear per imprimir el número més petit de l’array.  
Sortida (amb aquests números dintre de l’arrayList “8, 12, 5, 22, 6”:  
Número més gran 22 (això ho imprimeix el propi mètode)  
Número més petit 5  (això ho imprimeix el main)  
c. Crea un mètode que rebi un arrayList de noms com a paràmetre i retorni l’índex del nom més llarg.  
Crea un arrayList amb 5 noms al main i utilitza el mètode que acabes de crear per imprimir el nom més llarg de l’array.  
Sortida (amb aquests noms dintre de l’array “Noa, Peter, Victòria, Dani, Sara”:  
Nom més llarg: Victòria (això ho imprimeix el main)  

d. Crea un mètode que rebi dos números com a paràmetres i retorni un arrayList amb tots els números compresos entre ells.  
Crida al mètode que acabes de crear des del main amb els dos números que vulguis i imprimeix l’arrayList que et retorna.  
Sortida (amb el núm. 2 i 10):  
Els números compresos entre 2 i 10 són: 3, 4, 5, 6, 7, 8, 9
#### M7.1. Anem a practicar
##### M7.1 – Exercici 1
Crea un programa on l’usuari/ària introdueix tres notes i el programa calcula la mitja.  
Si la mitja és inferior a 5 ha de mostrar el següent missatge per pantalla: “No has superat el curs. Has de recuperar”.  
Si la mitja està entre 5 i 7 ha de mostrar: “Enhorabona! Has aprovat, però hauries de continuar practicant”.  
Si la mitja és superior a 7 ha de mostrar: "Enhorabona! Has superat el curs! Passa ja al següent nivell!"
##### M7.1 – Exercici 2
Un/a professor/a vol calcular les mitges de les notes de tota la classe.  
Crea una aplicació on l'usuari/ària introduirà un número per pantalla (el número correspon al nombre de notes que vol introduir) i el programa li demanarà que introdueixi les notes de tots els/les alumnes.  
Un cop les notes han sigut introduïdes, el programa retorna el següent:  
Si la nota mitjana és menor que 5: "La nota mitjana de la classe està suspesa. Els/les alumnes haurien de preguntar els seus dubtes i treballar més".  
Si la nota és inferior a 7: "La nota mitjana de la classe és bona, però els/les alumnes haurien de millorar el treball personal".  
Per la resta de casos, el missatge ha de ser: "Enhorabona! La nota mitjana de la classe es correspon amb l'esforç realitzat".  
**Nota:** Les notes han d'estar compreses entre 0 i 10.
##### M7.1 – Exercici 3
L’usuari/ària ha d'introduir un número i el programa ha de mostrar per pantalla si el número és parell o imparell.
##### M7.1 – Exercici 4
L’usuari/ària ha d’introduir dos números, el programa retornarà “Un dels dos números és negatiu”, només si un dels dos números és negatiu.
##### M7.1 – Exercici 5
Mostra per pantalla els nombres parells compresos entre el 100 i el 0 en ordre descendent.
##### M7.1 – Exercici 6
Taula de multiplicar.  
L’usuari/ària introduirà un número (de l'1 al 10) per pantalla, i utilitzant un bucle, el programa li mostrarà la taula de multiplicar d’aquell número.  
**Exemple:**  
```
2 x 1 = 2  
2 x 2 = 4  
2 x 3 = 6  
...  
2 x 10 = 20
```
##### M7.1 – Exercici 7
Fer un programa on l’usuari/ària introdueix per pantalla un caràcter i un número. El programa imprimeix per pantalla un quadrat amb la mida i el caràcter introduïts per l’usuari/ària.  
**Exemple:**
```
% % % % %
% % % % %
% % % % %
% % % % %
% % % % %
```
##### M7.1 – Exercici 8
Crea un programa on l’usuari/ària introdueixi una temperatura en °C i es mostri per pantalla la conversió en ºFahrenheit  
K = 32;
Fórmula
(0 °C × 9 / 5) + K = 32 °F
##### M7.2 – Exercici 1
 Fes un programa que mostri el següent per pantalla:
```
*
* *
* * *
* * * *
* * * * *
* * * * * *
```
El nombre de línies formades per “*” vindrà donat per un número que l’usuari/ària introduirà per consola.
Condició: En tot el codi del programa només hi pot haver un *  
També, a poder ser, no utilitzis cap mètode com repeat() o substring() de la classe String.
##### M7.2 – Exercici 2
Fes un programa que mostri el següent per pantalla:
```
* * * * * *
* * * * *
* * * *
* * *
* *
*
```
El nombre de línies formades per “*” vindrà donat per un número que l’usuari/ària introduirà per consola.  
Condició: En tot el codi del programa només hi pot haver un *  
També, a poder ser, no utilitzis cap mètode com repeat() o substring() de la classe String  
##### M7.2 – Exercici 3
Fes un programa que mostri el següent per pantalla:
```
*
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
*
```
La línia amb més “*” vindrà donada per un número que l’usuari/ària introduirà per consola.  
Condició: En tot el codi del programa només hi pot haver-hi dos *  
També, a poder ser, no utilitzis cap mètode com repeat() o substring() de la classe String.  
##### M7.2 – Exercici 4
Realitzar un programa on l’usuari/ària introdueix un número i el programa crida a un mètode que retorna el factorial del número introduït.  
El factorial d'un nombre n (enter, no negatiu) és el   producte de tots els nombres enters positius inferiors o iguals a n. 
##### M7.2 – Exercici 5
L’usuari/ària introdueix un nombre per teclat i el programa crida a un mètode que indiqui si el número és primer o no.
##### M7.3 – Exercici 6
L’usuari/ària ha d’introduir números fins que introdueixi un nombre primer.  
En el moment que l’usuari/ària introdueixi un nombre primer, el programa ha de treure per pantalla el següent missatge:  
"Exacte, el número “x” és primer!"
**Nota** Utilitzar el mètode creat a l'exercici: (M7.2.) Exercici 5.
##### M7.2 Exercici 7
![image](https://user-images.githubusercontent.com/123636378/225598129-e976e543-97da-40cf-abfb-24ff9250f39b.png)  
L’usuari/ària introdueix un any a per teclat  
i el programa crida a un mètode que indiqui si l’any és de traspàs o no.
##### M7.2 – Exercici 8
L’usuari/ària introdueix un nombre per teclat i el programa crida a un mètode que ha de mostrar la successió de Fibonacci.  
**Exemple:**
Si l’usuari/ària introdueix el 10, el resultat ha de ser:  
0,1,1,2,3,5,8,13,21,34
##### M7.3 – Exercici 1
Realitzar un programa que tingui un menú on se li mostraran 4 opcions a l’usuari/ària per pantalla:
1.  Quadrat
2.  Triangle
3.  Rectangle
4. Cercle
0. Sortir del programa  

Segons l’opció escollida haurà d’introduir unes dades o altres perquè el programa mostri per pantalla l’àrea (el valor) del polígon escollit.
##### M7.3 – Exercici 2
En aquest programa l’usuari/ària ha d’introduir un string i el programa ha de mostrar l’string al revés.
**Important** No es pot fer servir el mètode reverse()
##### M7.3 – Exercici 3
L’usuari/ària ha d’introduir una frase i el programa ha de dir si la frase és un palíndrom.
##### M7.3 – Exercici 4
![image](https://user-images.githubusercontent.com/123636378/225598229-223b2f1e-023f-4d38-a83a-07d0f9458cf5.png)  
L’usuari/ària ha d’introduir un DNI i el programa ha de dir si la lletra és correcte o no amb el nombre de DNI. Si la lletra no és correcta, ha de dir quina lletra és la correcta.
Per calcular la lletra DNI has de prendre el número de DNI a verificar i dividir-lo entre 23. El residu es reemplaça per una lletra que ja està assignada a aquest nombre mitjançant la taula adjunta: 

##### M7.3 – Exercici 5
Comprovar si una frase introduïda per l’usuari/ària està formada només per minúscules, només per majúscules o per minúscules i majúscules.
##### M7.3 – Exercici 6
Donat un array de números, el programa ha de mostrar la suma de tots els nombres parells i la suma de tots els números imparells.
##### M7.3 – Exercici 7
Un grup d’amics ha quedat per fer una fideuà.  
Els ingredients principals seran: fideus, gambes, i calamars.  
Saben que per cada quatre persones han d’utilitzar mig quilo de fideus, 400 grams de calamars i 200 grams de gambes.  
S’ha de fer un programa que demani per pantalla el preu per quilo de cada ingredient i el nombre d’amics que seran per dinar. El programa ha de calcular les quantitats necessàries de cada ingredient, el preu per persona i el preu final de la fideuà.
#### M8. Programació Orientada a Objectes
##### M8 – Exercici 1
Crea un nou projecte Java amb una classe anomenada "Ordinador", a més a més de la classe que conté el main.  
Aquesta classe tindrà com a atributs la marca, el model, el processador, la quantitat de memòria RAM i la capacitat del disc dur.  
L'aplicació ha de poder generar ordinadors de diferents maneres:
- Només a partir de la marca i el model.
- Indicant tots els atributs.
La classe Ordinador ha de disposar dels següents mètodes:
- Mètodes que permetin consultar cadascun dels atributs.
- Mètodes que permetin modificar el processador, la quantitat de memòria ram i la capacitat del disc dur.
- Un mètode que rebrà un string per paràmetre i retornarà un string que digui:  
"En aquests moments s'està executant: 'X'"  
(X és el paràmetre rebut pel mètode i que normalment serà el nom d'un programa)  
**Exemple:** "En aquests moments s'està executant: Eclipse" 
- Un mètode que retornarà una descripció completa de l'ordinador (toString()).  

Al main del projecte crea ordinadors de les 2 maneres possibles i comprova que els mètodes creats funcionen correctament.
##### M8 – Exercici 2
Ens demanen crear una aplicació per donar d’alta, modificar, veure i eliminar hotels.  
La classe hotel haurà de tenir els següents atributs: nom, nombre d’habitacions, nombre de plantes i superfície total de l’hotel. Com a mètodes només haurà de tenir els getters i setters propis de la classe i un mètode anomenat calcularManteniment(). Aquest mètode ha de tenir en compte que cada persona del servei pot atendre 20 habitacions i haurà de mostrar quantes persones són necessàries per atendre el servei d’habitacions de l’hotel i quin és el cost total destinat al servei sabent que aquestes persones cobren 1.500 € al mes.  
El mètode crearHotel() haurà de demanar a l’usuari/ària que introdueixi per pantalla les dades de nom, nombre d’habitacions, nombre de plantes i superfície total de l’hotel (o haurà de rebre aquestes dades per paràmetre). Un cop hagi demanat totes aquestes dades, s’ha d’instanciar l’objecte de la classe i afegir-lo a un array d’hotels.  
El mètode donarDeBaixaHotel() haurà de rebre el nom de l'hotel que es vol donar de baixa. L’usuari/ària introduirà el nom de l’hotel i si l’hotel està dintre de l’array, l’eliminarem i mostrarem un missatge per pantalla informant l’usuari/ària que hem eliminat l’hotel. Si no hem trobat l’hotel dintre de l’array, avisarem l’usuari/ària dient que l’hotel no estava dintre de la nostra aplicació.  
El mètode veureHotel() haurà de rebre el nom de l'hotel que vol que mostrem per pantalla, si l’hotel està a la nostra aplicació, li mostrarem l’hotel, si no hi és, informarem l’usuari/ària dient que l’hotel que ens ha demanat no està dintre de la nostra aplicació.
Quan mostrem l’hotel, a més, de mostrar el nombre d’habitacions, nombre de plantes i superfície total de l’hotel també es cridarà al mètode calcularManteniment().  
El mètode modificarHotel() haurà de rebre el nom de l'hotel que volem modificar. L’usuari/ària introduirà el nom de l’hotel. Si el tenim a l’aplicació, li demanarem si vol modificar el nombre d’habitacions, el nombre de plantes o la superfície total de l’hotel. Farem la modificació pertinent i avisarem a l’usuari/ària que la modificació s’ha realitzat.
##### M8 – Exercici 3
Donat el diagrama de classes de la imatge.
<img width="563" alt="image" src="https://user-images.githubusercontent.com/123636378/225598364-c0393168-62e7-442a-aa41-e7cd1bc97bc0.png">  
Programa una aplicació que tingui programades totes les opcions del següent menú:
- 0.- Sortir de l'aplicació.
- 1.- Crear client/a.
- 2.- Eliminar client/a.
- 3.- Crear compta d'un client/a.
- 4.- Ingressar euros en un compte d'un client/a.
- 5.- Retirar euros en un compte d'un client/a.

A tenir en compte:
- El saldo inicial de totes les comptes, ha de ser 0 €.
- En crear un client/a, no haurà de tenir cap compte "associada".
- El diagrama UML mostrà les propietats i mètodes mínims que han de tenir les classes, però pots crear-ne més si és necessari.
##### M8 – Exercici 4
La ciutat de Barcelona, com qualsevol ciutat, està formada per un nombre molt gran d’edificis. Hi ha moltes classes d’edificis: edificis d’habitatges, hospitals, escoles, blocs d’apartaments, blocs d’oficines, hotels, cinemes, etc.  
L’exercici proposat consistirà a crear una aplicació que contindrà una classe Edifici i diverses classes derivades. No s’instanciarà cap objecte de la classe Edifici, sinó que s’instanciaran objectes de les classes derivades d’aquesta.  
Les classes derivades són: **Hotel, Hospital i Cinema.**  
Tots els edificis tindran certes dades comunes (nom, nombre de plantes, superficie (m²)) que es donaran en crear l’edifici i no es modificaran, però sí que s’haurà de poder accedir a elles per llegir-les.  
Es crearà un mètode netejar() en la classe adient, la qual mostrarà per pantalla el temps que s’ha trigat a netejar l’edifici, tenint en compte que es tarda a netejar un minut per cada 5 m². A més, si un edifici té més d’una planta, es tarda a pujar mig minut d’una planta a una altra. Per tant, afegirem mig minut per cada planta addicional. Per cada minut de feina es pagarà un euro diari. A més, com que es neteja cada dia, per obtenir el cost mensual, haurem de multiplicar per 30 (aquest cost mensual també es mostrarà per pantalla).  
A més, s’implementarà un mètode anomenat calcularCostVigilancia() que mostrarà el que costa al mes contractar vigilants a cada edifici. Es considera que cada vigilant d’hotel o hospital pot vigilar 1000 m². Per tant, si un edifici té una superfície de 5500 m², necessitarem 6 vigilants. En canvi, els vigilants dels cinemes poden vigilar 3000 m². Contractar cada vigilant costa als propietaris de l’edifici 1.300 euros mensuals, però els vigilants d’hotels cobren un plus de perillositat de 500 euros mensuals.  
A l’hospital es reparteix dinar pels malalts tres vegades al dia. Hi haurà un mètode repartirDinar() en el lloc adient que mostrarà, quan sigui cridat, el missatge “S’estan repartint xxx racions”. Per aconseguir el nombre de racions, s'ha de multiplicar el nombre de malalts/es per 3. El nombre de malalts/es ingressats/des a l'hospital pot variar al llarg del temps, per tant, s’haurà de permetre accedir a l’atribut corresponent, tant per llegir-lo com per modificar-lo, encara que no es faci directament.  
Al cinema es crearà la funció projectarSessio(), que mostrarà el missatge “S’han recaptat xxx euros”, tenint en compte que, per calcular la recaptació, s’ha de multiplicar el preu d’una entrada pel nombre d’assistents a la sessió, que no podrà superar l’aforament màxim. Per tant, la funció projectarSessió() haurà de rebre com a paràmetres el nombre d’assistents i el preu de l’entrada per aquella sessió. El nombre d’assistents a la sessió no pot ser més gran que l’aforament total de la sala.  
En els hotels cada dia passa el servei d’habitacions. Es calcula que cada membre del servei pot atendre 20 habitacions. Es crearà un mètode que calculi, i mostri per pantalla: a) Quantes persones són necessàries per atendre el servei d’habitacions l’hotel. b) Quin és el total necessari per als sous d’aquestes persones, tenint en compte que cada persona cobra 1.000 euros al mes.  
**Exemples:** L’”Hospital de Vilafranca”, de 1.950 m² i 2 plantes. En aquest moment té 26 malalts.  L’”Hospital General de Catalunya”, de 25.350 m² i 10 plantes. En aquest moment té 315 malalts.  El “Cinema Montecarlo”, de  3180 m² i 1 planta.  El “Cinema Principal”, de 12.450 m² i 2 plantes.  L’”Hotel Hilton”, de 73.858 m² i 22 plantes. Té 583 habitacions. L’”Hotel Pepita”, de 593 m² i 3 plantes. Té 12 habitacions.  
L'aplicació ha de ser capaç de donar d'alta, mostrar i eliminar edificis. En cridar el mètode mostrar, cridarem a tots els mètodes de l'edifici en qüestió per veure totes les seves dades per pantalla.
##### M8 – Exercici 5
Fer una aplicació on l'usuari/a introdueix les coordenades x, y de dos cercles i els seus respectius radis.  
Crear la classe Punt i la classe Cercle:  
###### Classe Punt
La classe Punt tindrà els atributs posicioX i posicioY. A més, tindrà el constructor parametritzat amb tots els atributs de la classe.
###### Classe Cercle
La classe Cercle tindrà els atributs centre (un punt) i el radi (distància entre el centre i qualsevol punt de la circumferència). A més, tindrà el constructor amb tots els paràmetres i els següents mètodes:
- distanciaCentres(altreCercle): Retorna la distància entre el centre del cercle actual i el rebut com a paràmetre.
- equals(altreCercle): Retorna true si dos cercles són iguals (si tenen el mateix centre i el mateix radi).
- sonConcentrics(altreCercle): Retorna true si dos cercles són concèntrics (tenen igual centre).
- tenenIgualRadi(altreCercle): Retorna true si dos cercles tenen el mateix radi.
- sonTangents(altreCercle): Retorna true si dos cercles són tangents.
- sonSecants(altreCercle): Retorna true si dos cercles són secants.
- noEsToquen(altreCercle): Retorna true si dos cercles no es toquen.
Al final l'aplicació mostrarà per pantalla el resultat de fer la crida a tots els mètodes de la classe Cercle.
##### M8 – Exercici 6
L'organització d’un campionat de cotxes vol tenir un programa per gestionar part de la informació que fins ara no tenien informatitzada. Volen saber de cada escuderia que participa en el campionat, el nom, el pressupost que tenen i el país d’origen. Cada escuderia pot tenir més d’un cotxe i de cadascun volen saber la potència, la velocitat màxima, el color i el preu de mercat.  
De les persones treballadores de les diferents escuderies volen saber el nom, el primer cognom, l’edat, el temps que porten a l’escuderia i el sou. El sou base és de 50.000 €. A més, dels/les pilots volen saber la seva alçada, el pes. El sou dels/les pilots és el sou base de les persones treballadores més 10.000 € per cada any d’antiguitat a l’escuderia, més 50.000 € de perillositat.  
Dels/les mecànics volen saber si tenen estudis superiors de mecànica o no. I el seu sou es calcula sumant 10.000 € per cada any d’antiguitat a l’escuderia més el sou base.  
Es demana que l’aplicació sigui capaç de donar d’alta, de baixa i de veure pilots i mecànics, i de veure escuderies i bòlids. Les escuderies i els bòlids poden estar introduïts directament en el codi.
##### M8 – Exercici Extra 1 
Es tracta d'un nombre de jugadors/es que amb un revòlver amb una sola bala al tambor, es disparen al cap.  
Les classes a fer són:  
Revolver (amb un tambor de 6 buits):  
Atributs:  
- Posició actual* (posició del tambor on es dispara, pot ser que estigui la bala o no).
- Posició bala* (la posició del tambor on es troba la bala).  

*Aquestes dues posicions, es generaran aleatòriament.
Mètodes:
- disparar(): retorna true si la bala coincideix amb la posició actual.
- seguentBala(): canvia a la següent posició del tambor.
- informa(): mostra informació del revòlver (posició actual i on està la bala).  
###### Jugador/a:
Atributs
- id (representa el número del jugador, comença en 1)
- nom
- nickname (Comença amb el nom més el seu id, “Jugador/a 1” per exemple)
- viu (indica si està viu o no el jugador)
Mètodes:
- jugar(Revolver r): el jugador/a s'apunta i es dispara, si la bala es dispara, el jugador/a mor.

###### Joc:
Atributs:
- Jugadors/es (conjunt de Jugadors/es)
- Revolver
Mètodes
- fiJoc(): quan un jugador/a mor, retorna true.
- ronda(): cada jugador/a s'apunta i es dispara, s'informarà de l'estat de la partida (El jugador/a X es dispara, no ha mort en aquesta ronda, etc.)  
El nombre de jugadors/es serà decidit per l'usuari/ària, però ha de ser entre 1 i 6. Si no està en aquest rang, per defecte serà 6.
En cada torn un dels jugadors/es, dispara el revòlver, si aquest té la bala, el jugador/a mor i el joc s'acaba.
##### M8 – Exercici Extra 2
Ens demanen fer un programa orientat a objectes sobre un cinema (només d'una sala) que té un conjunt de seients (3 files per 5 columnes).  
Del cinema ens interessa conèixer la pel·lícula que s'està reproduint i el preu de l'entrada al cinema.  
De les pel·lícules ens interessa saber el títol, durada, edat mínima i director/a.  
De l'espectador/a, ens interessa saber el seu nom, edat i els diners que té.  
Els seients són etiquetats per una lletra (columna) i un número (fila), com es mostra a continuació. També haurem de saber si el seient està ocupat.
```
1A 1B 1C 1D 1E
2A 2B 2C 2D 2E
3A 3B 3C 3D 3E
```
Realitzarem una petita simulació, en el qual generarem entre 5 i 10 espectadors/es i els asseurem aleatòriament d'un en un (no podem on ja estigui ocupat).  
Només es podrà asseure si tenen els suficients diners, hi ha espai lliure i té edat per a veure la pel·lícula, en cas que el seient estigui ocupat li busquem un lliure.  
Les dades de l'espectador/a i la pel·lícula poden ser totalment aleatòries.  
La simulació haurà d'anar mostrant els passos de càlcul, per exemple:
- Omplint la sala per a la pel·lícula “…” amb preu X € per a majors de X edat.
- Asseient a l'espectador Pedro, amb X anys i X diners.
- L'espectador/a no té suficients diners.
- Asseient a l'espectadora Ana, amb X anys i X diners.
- Asseguda en el seient 1C.
- Asseient a l'espectadora Silvia, amb X anys i X diners.
- L'espectadora no té suficient edat.
- Asseient a l'espectador Daniel, amb X anys i X diners.
- El seient 1C està ocupat, tractant de buscar un altre seient.
- Assegut en el seient 2B.
- …
-  S'han gestionat tots els espectadors/es