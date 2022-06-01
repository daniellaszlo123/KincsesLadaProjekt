# KincsesLadaProjekt

3 láda közül az egyik rejti a kincset. Mindegyiken van egy felirat (ami nem változtatható, mert belevésték a ládába), de csak az egyik láda állítása igaz! 
- arany: én rejtem a kincset
- ezüst: nem én rejtem a kincset
- bronz: az arany hazudik

## Indoklás
### Esetek felmérése
1. eset: ha arany igazat mond, akkor ezüst hazudik, tehát (!(nem én rejtem a kincset))=én rejtem a kincset, így az arany nem lehet igaz
2. eset: ha arany hazudik, akkor nem ő rejti a kincset, emellett, ha ezüst mond igazat "nem én rejtem a kincset" viszont így bronz hazudik, ami azt jelenti hogy (!(arany hazudik))=arany igazat mond, de mivel ebben az esetben az arany hazudik, így ez nem lehetséges
3. eset: ha bronznak adunk igazat, akkor arany hazudik, tehát nem ő rejti a kincset és ezüst is hazudik "nem én rejtem a kincset", tehát kizárásos alapon ezüst rejtheti a kincset
### Felmért esetek alapján
A kincset az ezüst láda rejti.

## Feladat ismertetése
Egy találóskérdést kell leprogramozni. A programozási munkába minél több mindent kell bemutatni arra vonatkozóan, hogy miket tanultál a 2. félév során.
### Szempontok
-	OOP szemlélet (javaslom max 3 osztály használatát)
-	Tervezési lépések, pl UML, esetleg pszeudókód v foylamatábra
-	public/private/static/final/enum megfelelő használata
-	GitHub (commit, gitignore, readme)
-	program szétbontása package-ekre
-	GUI készítés, kép használattal
-	Tiszta kód elvei
-	Tesztkód írása (1 fontos metódusnak 1 fontos tesztesete)

## Kiinduló UML ábra
**[UML](https://ibb.co/kyZhKPb)**
