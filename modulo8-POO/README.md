### M8. Programació Orientada a Objectes
#### M8 – Exercici 1
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
#### M8 – Exercici 2
Ens demanen crear una aplicació per donar d’alta, modificar, veure i eliminar hotels.  
La classe hotel haurà de tenir els següents atributs: nom, nombre d’habitacions, nombre de plantes i superfície total de l’hotel. Com a mètodes només haurà de tenir els getters i setters propis de la classe i un mètode anomenat calcularManteniment(). Aquest mètode ha de tenir en compte que cada persona del servei pot atendre 20 habitacions i haurà de mostrar quantes persones són necessàries per atendre el servei d’habitacions de l’hotel i quin és el cost total destinat al servei sabent que aquestes persones cobren 1.500 € al mes.  
El mètode crearHotel() haurà de demanar a l’usuari/ària que introdueixi per pantalla les dades de nom, nombre d’habitacions, nombre de plantes i superfície total de l’hotel (o haurà de rebre aquestes dades per paràmetre). Un cop hagi demanat totes aquestes dades, s’ha d’instanciar l’objecte de la classe i afegir-lo a un array d’hotels.  
El mètode donarDeBaixaHotel() haurà de rebre el nom de l'hotel que es vol donar de baixa. L’usuari/ària introduirà el nom de l’hotel i si l’hotel està dintre de l’array, l’eliminarem i mostrarem un missatge per pantalla informant l’usuari/ària que hem eliminat l’hotel. Si no hem trobat l’hotel dintre de l’array, avisarem l’usuari/ària dient que l’hotel no estava dintre de la nostra aplicació.  
El mètode veureHotel() haurà de rebre el nom de l'hotel que vol que mostrem per pantalla, si l’hotel està a la nostra aplicació, li mostrarem l’hotel, si no hi és, informarem l’usuari/ària dient que l’hotel que ens ha demanat no està dintre de la nostra aplicació.
Quan mostrem l’hotel, a més, de mostrar el nombre d’habitacions, nombre de plantes i superfície total de l’hotel també es cridarà al mètode calcularManteniment().  
El mètode modificarHotel() haurà de rebre el nom de l'hotel que volem modificar. L’usuari/ària introduirà el nom de l’hotel. Si el tenim a l’aplicació, li demanarem si vol modificar el nombre d’habitacions, el nombre de plantes o la superfície total de l’hotel. Farem la modificació pertinent i avisarem a l’usuari/ària que la modificació s’ha realitzat.
#### M8 – Exercici 3
Donat el diagrama de classes de la imatge.


<img width="563" alt="image" src="https://user-images.githubusercontent.com/123636378/225598364-c0393168-62e7-442a-aa41-e7cd1bc97bc0.png">  
Programa una aplicació que tingui programades totes les opcions del següent menú:
- "0.- Sortir de l'aplicació."
- "1.- Crear client/a."
- "2.- Eliminar client/a."
- "3.- Crear compta d'un client/a."
- "4.- Ingressar euros en un compte d'un client/a."
- "5.- Retirar euros en un compte d'un client/a."

A tenir en compte:
- El saldo inicial de totes les comptes, ha de ser 0 €.
- En crear un client/a, no haurà de tenir cap compte "associada".
- El diagrama UML mostrà les propietats i mètodes mínims que han de tenir les classes, però pots crear-ne més si és necessari.
#### M8 – Exercici 4
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
#### M8 – Exercici 5
Fer una aplicació on l'usuari/a introdueix les coordenades x, y de dos cercles i els seus respectius radis.  
Crear la classe Punt i la classe Cercle:  
##### Classe Punt
La classe Punt tindrà els atributs posicioX i posicioY. A més, tindrà el constructor parametritzat amb tots els atributs de la classe.
##### Classe Cercle
La classe Cercle tindrà els atributs centre (un punt) i el radi (distància entre el centre i qualsevol punt de la circumferència). A més, tindrà el constructor amb tots els paràmetres i els següents mètodes:
- distanciaCentres(altreCercle): Retorna la distància entre el centre del cercle actual i el rebut com a paràmetre.
- equals(altreCercle): Retorna true si dos cercles són iguals (si tenen el mateix centre i el mateix radi).
- sonConcentrics(altreCercle): Retorna true si dos cercles són concèntrics (tenen igual centre).
- tenenIgualRadi(altreCercle): Retorna true si dos cercles tenen el mateix radi.
- sonTangents(altreCercle): Retorna true si dos cercles són tangents.
- sonSecants(altreCercle): Retorna true si dos cercles són secants.
- noEsToquen(altreCercle): Retorna true si dos cercles no es toquen.
Al final l'aplicació mostrarà per pantalla el resultat de fer la crida a tots els mètodes de la classe Cercle.
#### M8 – Exercici 6
L'organització d’un campionat de cotxes vol tenir un programa per gestionar part de la informació que fins ara no tenien informatitzada. Volen saber de cada escuderia que participa en el campionat, el nom, el pressupost que tenen i el país d’origen. Cada escuderia pot tenir més d’un cotxe i de cadascun volen saber la potència, la velocitat màxima, el color i el preu de mercat.  
De les persones treballadores de les diferents escuderies volen saber el nom, el primer cognom, l’edat, el temps que porten a l’escuderia i el sou. El sou base és de 50.000 €. A més, dels/les pilots volen saber la seva alçada, el pes. El sou dels/les pilots és el sou base de les persones treballadores més 10.000 € per cada any d’antiguitat a l’escuderia, més 50.000 € de perillositat.  
Dels/les mecànics volen saber si tenen estudis superiors de mecànica o no. I el seu sou es calcula sumant 10.000 € per cada any d’antiguitat a l’escuderia més el sou base.  
Es demana que l’aplicació sigui capaç de donar d’alta, de baixa i de veure pilots i mecànics, i de veure escuderies i bòlids. Les escuderies i els bòlids poden estar introduïts directament en el codi.
#### M8 – Exercici Extra 1 
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
##### Jugador/a:
Atributs
- id (representa el número del jugador, comença en 1)
- nom
- nickname (Comença amb el nom més el seu id, “Jugador/a 1” per exemple)
- viu (indica si està viu o no el jugador)
Mètodes:
- jugar(Revolver r): el jugador/a s'apunta i es dispara, si la bala es dispara, el jugador/a mor.

##### Joc:
Atributs:
- Jugadors/es (conjunt de Jugadors/es)
- Revolver
Mètodes
- fiJoc(): quan un jugador/a mor, retorna true.
- ronda(): cada jugador/a s'apunta i es dispara, s'informarà de l'estat de la partida (El jugador/a X es dispara, no ha mort en aquesta ronda, etc.)  
El nombre de jugadors/es serà decidit per l'usuari/ària, però ha de ser entre 1 i 6. Si no està en aquest rang, per defecte serà 6.
En cada torn un dels jugadors/es, dispara el revòlver, si aquest té la bala, el jugador/a mor i el joc s'acaba.
#### M8 – Exercici Extra 2
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