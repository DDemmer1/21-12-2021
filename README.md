# 21-12-2021
Übungsaufgabe vom 21.12.2021 für die Studierenden des Java I Seminars der Universität zu Köln


### 📝 Aufgabe:

In dieser Aufgabe wird das Mail Programm von letzter Sitzung vervollständigt

- Erstellt eine Klasse ```Inbox```
- Erstellt eine Klasse ```Sent```
- Erstellt eine Klasse ```MailCollection```
  - Die Klasse dient als Überklasse für die Klassen ```Inbox``` und ```Sent```. Fügt also in den Klassen ```Inbox```  und ```Sent```  mit dem ```extends``` Keyword die ```MailCollection``` als Überklasse ein.
  - Die Klasse soll ein ```Mail[] mail``` haben in das Mails gespeichert werden können.
  - Außerdem braucht die Klasse einen Konstruktor mit dem das ```Mail[]``` Array initialisiert wird. Programmiert den Konstruktor so, dass man bei der initialisierung eines ```MailCollection```-Objektes die Länge des ```Mail[] mail``` frei wählen kann (```public MailCollection(int size)```)
  - Die ```MailCollection``` soll eine Methode haben mit der man ```Mail``` Objekte in das Array einfügen kann. Die Methode soll immer an der letzten freien Stelle eine Mail einfügen. Wenn das Array voll ist soll die Methode ```false``` zurückgeben. Wenn die ```Mail``` erfolgreich eingefügt wurde soll ```true``` zurückgegeben werden.
 




### ℹ️ Resourcen:
Hier noch ein paar nützliche 📃Artikel, 🖊️Threads und 🎥Videos

- [📃 Java Vererbung](https://github.com/DH-Cologne/java-wegweiser/blob/master/articles/Vererbung-I-Grundlagen.md)
- [📃 Klassen und Objekte (Instanzen von Klassen) in Java](https://www.programmierenlernenhq.de/klassen-und-objekte-in-java/)


