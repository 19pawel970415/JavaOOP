public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Paul");
        person.setSurname("Smith");
        person.setAge(35);
        person.setSex(Sex.MAN);
        person.setPeselNumber("88010123817");

        Person person1 = new Person("Anna", "James", Sex.WOMAN, 60, "63020212000");

        String result = (person.hasReachedRetirementAge()) ? person.getSurname() + " has reached the retirement age." : person.getSurname() + " has not reached the retirement age.";
        String result1 = (person1.hasReachedRetirementAge()) ? person1.getSurname() + " has reached the retirement age." : person1.getSurname() + " has not reached the retirement age.";
        System.out.println(result);
        System.out.println(result1);

        int ageDiff = person.getAgeDifference(person1);
        System.out.println("The age difference between the people is " + ageDiff);

        System.out.println(person.getSurname() + " has " + person.getYearsToRetirement() + " years to retirement.");




//        Stwórz klasę Person
//
//        dodaj pola: name, surname, gender, age, pesel
//
//        dodaj metodę sprawdzającą, czy dana osoba osiągnęła wiek emerytalny (np. hasReachedRetirementAge()); dla kobiet wiek emerytalny przyjmijmy >=60 lat, a dla mężczyzn >=65 lat
//
//        dodaj metodę zwracającą różnicę wieku pomiędzy daną osobą a inną osobą
//
//        niech metoda przyjmuje parametr typu Person
//
//        niech nie zwraca wartości ujemnych jako różnicy lat
//
//        dodaj metodę, która wylicza i zwraca, ile lat brakuje do emerytury
//
//        Stwórz klasę Computer
//
//
//        public class Computer {
//
//            // obowiązkowe pola
//            private String motherboard;     // płyta główna
//            private String processor;       // "i5", "i7", "intel", "amd"
//            private int cores;              // liczba rdzeni
//            private int ram;                // ilość ramu
//
//            // dodatkowe pola
//            private int hd;                 // wielkość dysku w GB
//            private String monitor;         // nazwa preducenta
//            private String printer;         // nazwa drukarki
//
//            public Computer(String motherboard, String processor, int cores, int ram) {
//
//            }
//        }
//        uzupełnij konstruktor o przypisanie wartości
//
//        dopisz metodę toString()
//
//        dopisz metody getter i setter
//
//        przetestuj działanie
//
//        pola processor i cores łączą się ze sobą - stwórzmy dla nich osobną klasę
//
//
//        public class Processor {
//
//            private String name;        // nazwa procesora
//            private int cores;          // liczba rdzeni
//        }
//        dodaj odpowiedni konstruktor
//
//        dodaj metody getter i setter
//
//        dopisz metodę toString()
//
//        zmień klasę Computer tak, by korzystała teraz z klasy Processor
//
//
//        public class Computer {
//
//            // obowiązkowe pola
//            private String motherboard;     // płyta główna
//            private Processor processor;
//            private int ram;                // ilość ramu
//
//            // dodatkowe pola
//            private int hd;                 // wielkość dysku w GB
//            private String monitor;         // nazwa preducenta
//            private String printer;         // nazwa drukarki
//
//            public Computer(String motherboard, Processor processor, int ram) {
//
//            }
//        }
//        kości RAM mogą występować w różnych konfiguracjach, stwórz klasę RAM i umieść w niej odpowiednie pola (np. name oraz size)
//
//        załóżmy, że na płycie mogą być 4 kości RAM - utwórz tablicę 4-elementową na elementy klasy RAM
//
//
//        public class Computer {
//
//            // obowiązkowe pola
//            private String motherboard;     // płyta główna
//            private Processor processor;
//            private RAM[] ramSlots;         // kości ramu
//
//            // dodatkowe pola
//            private int hd;                 // wielkość dysku w GB
//            private String monitor;         // nazwa preducenta
//            private String printer;         // nazwa drukarki
//
//            public Computer(String motherboard, Processor processor, Ram ram) {
//
//            }
//            w konstruktorze umieść zmienną Ram ram określającą pojedynczą kość RAM podawaną podczas tworzenia komputera; pamiętaj o inicjalizacji tablicy ramSlots
//
//            dodaj metodę, która pozwala na dodawanie kolejnych kości RAMu - uwaga na ograniczenia dotyczące slotów; w razie braku miejsca, możesz np. usuwać najmniejszą kość i zastępować ją podaną (o ile jest niemniejsza)
//
//            na podstawie RAMu przeprowadź podobną zmianę z dyskami twardymi - ich także może być kilka w komputerze; mają różną pojemność i producenta (oraz np. typ i prędkość)
//
//            pozostałe zmienne (monitor, printer) także przekształć w klasy - komputer może mieć kilka monitorów i drukarek, każde z nich mają własne parametry
//
//            dodaj kolejne peryferia do komputera
//
//            za każdym razem uruchamiaj i testuj
//
//            dostosowuj metody toString() aby wyświetlały wymagane dane
//
//            zastanów się nad metodą, która porówna dwa zestawy komputerowe
//
//            np. przypisz jakieś wagi do poszczególnych części i na ich podstawie wyliczaj ocenę
    }
}
