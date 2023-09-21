package ch.juventus.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import ch.juventus.entity.Person;

public class TodoList {
    public static void arrayList() {
        // TODO: Erstelle eine ArrayList von Strings und füge 5 Tiere hinzu ("Hund", "Katze", "Maus", ...)
        List<String> animals = new ArrayList<>();
        animals.add("Pferd");
        animals.add("Kuh");
        animals.add("Schwein");
        animals.add("Huhn");
        animals.add("Hahn");
        // TODO: Gib die Anzahl Einträge auf der Konsole aus.
        System.out.println(animals.size());
        // TODO: Füge ein weiteres Element mit Index 2 hinzu.
        animals.add(2, "Ziege");
        // TODO: Gib die ganze Liste auf der Konsole aus.
        System.out.println(animals);
        // TODO: Prüfe ob ein bestimmtes Element in der Liste vorkommt.
        System.out.println(animals.contains("Huhn"));
        // TODO: Ein Element lesen via Index.
        System.out.println(animals.get(2));
        // TODO: Ein Element löschen via Index
        animals.remove(2);
        // TODO: Ein Element löschen via String
        animals.remove("Schwein");
        // TODO: Ein Element löschen via Index, das es nicht gibt (was passiert?)
        animals.remove(2);
        // TODO: Ein Element löschen via String, das es nicht gibt (was passiert?)
        animals.remove("Schwein");
        // TODO: Alle Elemente aus der Liste löschen
        animals.clear();

    }

    public static void linkedList() {
        // TODO: Erstelle eine LinkedList von Strings und füge 5 Tiere hinzu ("Hund",
        // "Katze", "Maus", ...)
        LinkedList<String> animals = new LinkedList<String>();
        animals.add("Pferd");
        animals.add("Kuh");
        animals.add("Schwein");
        animals.add("Huhn");
        animals.add("Hahn");

        // TODO: Gib die Anzahl Einträge auf der Konsole aus.
        System.out.println(animals.size());

        // TODO: Den Index eines bestimmten Elements finden
        System.out.println(animals.indexOf("Huhn"));

        // TODO: Den Index eines Elements das nicht existiert finden (was passiert?)
        System.out.println(animals.indexOf("Test"));

        // TODO: Ein Element via Index lesen
        System.out.println(animals.get(2));
        // TODO: Das erste und letzte Element der Liste ausgeben
        System.out.println(animals.getLast());

        // TODO: Das erste und letzte Element der Liste löschen
        animals.removeFirst();

        System.out.println(animals);

        for (String animal : animals) {
            System.out.println(animal);
        }
    }

    public static void hashSet() {
        System.out.println("");
        System.out.println("");
        // TODO: Erstelle ein HashSet von Personen (object package)
        Set<Person> person = new HashSet<Person>();
        Person p1 = new Person("Test", "Tester", 20, false);
        Person p2 = new Person("Test", "Tester", 20, false);
        Person p3 = new Person("Test4", "Tester5", 30, true);
        person.add(p1);
        person.add(p2);
        person.add(p3);

        // TODO: Füge mehrere Personen ein, auch doppelte (verschiedene Objekte mit gleichen Werten)
        person.add(new Person("Test3", "Tester2", 201, true));

        // TODO: Prüfe, ob das Set nicht leer ist
        System.out.println(person.isEmpty());

        // TODO: Gib die Länge des Sets aus (doppelte Personen?)
        System.out.println(person.size());
        // TODO: Prüfe, ob ein gewisses Element im Set existiert
        System.out.println(person.contains(p1));
        // TODO: Lösche ein bestimmtes Element aus dem Set
        person.remove(p1);

        // TODO: Gib das gesamte Set mehrmals auf der Konsole aus. Wie ist die Reihenfolge der Elemente?
        System.out.println(person);
        System.out.println(person);
        System.out.println(person);

        for (Person p : person) {
            System.out.println(p);
        }
    }

    public  static void linkedHashSet() {
        // TODO: Erstelle ein LinkedHashSet von Personen (object package)
        Set<Person> person = new LinkedHashSet<Person>();
        Person p1 = new Person("Test", "Tester", 20, false);
        Person p2 = new Person("Test", "Tester", 20, false);
        Person p3 = new Person("Test4", "Tester5", 30, true);
        
        person.add(p1);
        person.add(p2);
        person.add(p3);

        // TODO: Füge mehrere Personen ein, auch doppelte (verschiedene Objekte mit
        // gleichen Werten)
        // TODO: Prüfe, ob das Set nicht leer ist
        System.out.println(person.isEmpty());

        // TODO: Gib die Länge des Sets aus (doppelte Personen?)
        System.out.println(person.size());

        // TODO: Gib das gesamte Set mehrmals auf der Konsole aus. Wie ist die
        // Reihenfolge der Elemente?
        System.out.println(person);
        System.out.println(person);
        System.out.println(person);
    }

    public static void treeSet() {
        // TODO: Erstelle ein TreeSet von Personen (object package) und verwende den
        Person p1 = new Person("Test", "Bester", 20, false);
        Person p2 = new Person("Test", "Cester", 20, false);
        Person p3 = new Person("Test4", "Aester5", 30, true);

        Set<Person> person = new TreeSet<Person>();
        person.add(p1);
        person.add(p2);
        person.add(p3);
        // PersonComperator
        // TODO: Füge mehrere Personen ein, auch doppelte (verschiedene Objekte mit
        // gleichen Werten)
        // TODO: Gib die Länge des Sets aus (doppelte Personen?)
        System.out.println(person.size());

        // TODO: Gib das gesamte Set auf der Konsole aus. Wie ist die Reihenfolge der
        // Elemente?
        System.out.println(person);
    }

    public static void hashMap() {
        // TODO: Erstelle eine HashMap (Key: String; Value: List<Person>)
        // TODO: Füge folgende Einträge in die Map:
        // ­ "family" : Liste von 3 Personen
        // ­ "office" : null
        // ­ "friends" : Liste von 3 Personen
        List<Person> family = new ArrayList<Person>();
        family.add(new Person("Test1", "Bester", 20, false));
        family.add(new Person("Test2", "Bester2", 30, true));
        family.add(new Person("Test3", "Bester3", 25, false));

        List<Person> friends = new ArrayList<Person>();
        friends.add(new Person("Test4", "Bester4", 20, false));
        friends.add(new Person("Test5", "Bester5", 30, true));

        Map<String, List<Person>> map = new HashMap<String, List<Person>>();
        map.put("family", family);
        map.put("friends", friends);
        map.put("office", null);

        // TODO: Gib die gesamte Map auf der Konsole aus
        System.out.println(map);
        // TODO: Füge einen weiteren Eintrag "office" : Liste von 2 Personen der Map hinzu. (Wieviele Einträge sind jetzt in der Map?)
        List<Person> office = new ArrayList<Person>();
        office.add(new Person("Test6", "Bester6", 20, false));
        office.add(new Person("Test7", "Bester7", 30, true));
        map.put("office", office);

        // TODO: Gib das entrySet auf der Konsole aus
        System.out.println(map.entrySet());

        // TODO: Gib das keySet auf der Konsole aus
        System.out.println(map.keySet());

        // TODO: Gib die values auf der Konsole aus
        System.out.println(map.values());

        map.forEach((key, value) -> System.out.println(key + " " + value));
    }

    public static void linkedHashMap() {
        // TODO: Erstelle eine LinkedHashMap (Key: Integer; Value: Person) mit
        // Access-Order
        // TODO: Fülle 5 Einträge ein (auch doppelte Keys, um zu überprüfen, dass der
        // Value überschrieben wird)
        // TODO: Gib die gesamte Map auf der Konsole aus
        // TODO: Greife auf mehrere Elemente zu
        // TODO: Gib die Map erneut aus und überprüfe die Sortierung
    }

    public static void treeMap() {
        // TODO: Erstelle eine TreeMap (Key: Integer; Value: Person)
        Map<Integer, Person> map = new TreeMap<Integer, Person>();

        // TODO: Fülle 5 Einträge ein (auch doppelte Keys, um zu überprüfen, dass der Value überschrieben wird)
        map.put(1, new Person("Test1", "Bester", 20, false));
        map.put(2, new Person("Test2", "Bester2", 30, true));
        map.put(2, new Person("Test3", "Bester3", 25, false));
        map.put(3, new Person("Test4", "Bester4", 20, false));

        // TODO: Gib die gesamte Map auf der Konsole aus und überprüfe die Sortierung
        System.out.println(map);
    }
}
