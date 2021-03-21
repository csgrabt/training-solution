## Senior

Készítsünk egy `Song` osztályt, melynek az alábbi mezői vannak:

- `String name`
- `long lengthInSeconds`
- `String artist`

A `Song` konstruktorában ellenőrizd, hogy a `name` és az `artist` üres-e! Dobj kivételt, ha igen! Ellenőrizd továbbá a `lengthInSeconds`-ot is, hogy nagyobb legyen, mint `0`!
Készítsünk egy `Playlist` osztályt, melynek van egy konstruktora, amiben `Song`-ok listáját fogadja el!
Írjunk egy metódust `findByLengthGreaterThan` néven, mely egy `int`-et vár paraméterként `mins` néven.
Azoknak a `Song`-oknak a listáját adjuk vissza, melyek hosszabbak percben (!), mint a `Song` `lengthInSeconds` mezője.

Bónusz feladat: Implementáljuk megfelelően a `toString` metódust a `Song` és a `Playlist` osztályban, hogy a `Playliset`-et kiirva a konzolra olvasható eredményt kapjunk!

Forrás:
https://github.com/Training360/strukturavalto-java-public/blob/master/orai-feladatok.md