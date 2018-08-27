# Zadania z przetwarzania danych  
## [Zadanie #1 (przetwarzanie danych, strona 13)](src/main/java/pl/aszul/Task1Page13)
1. Utwórz projekt FileReaderExamples w którym zaimplementujesz obsługę plików. Do
utworzonego projektu dodaj katalog resources (po utworzeniu kliknij PPM na nazwę projektu,
wybierz z menu Maven a następnie Reimport - ikona katalogu powinna się zmienić).
2. Do katalogu resources dodaj plik simpleExample.txt i wyświetl jego zawartość w konsoli.
3. Do katalogu resources dodaj plik users.txt Plik zawiera listę imion oraz nazwisk wraz z
wiekiem. Utwórz obiekt User i utwórz listę obiektów z danymi z pliku.
4. Rozbuduj poprzedni algorytm. Utwórz 2 listy. Na jednej zapisz kobiety, natomiast na drugiej
mężczyzn (dla ułatwienia przyjmujemy że każda osoba z nazwiskiem kończącym się na „a”
jest kobietą). Na listach zapisuj tylko osoby pełnoletnie.
5. Wczytaj plik books.csv w którym znajduje się lista książek. Utwórz listę obiektów, posortuj
według dostępności w magazynie i ceny. Na koniec wyświetl listę książek w konsoli.
6. Zmodyfikuj poprzedni algorytm w taki sposób aby posortowana lista książek została zapisana
w pliku sortedBooks.csv.
## [Zadanie #2 (przeszukiwanie, strona 14)](src/main/java/pl/aszul/Task2Page14)
1. Dodaj do projektu plik weather-data.csv. Zawiera on informacje pogodowe z jednej stacji
meteorologicznej na przestrzeni prawie 70 lat (25 tysięcy rekordów).
2. Napisz program który pobierze od użytkownika datę i zwróci minimalną, średnią i
maksymalną temperaturę tego dnia. Spróbuj zoptymalizować swój algorytm.
3. Dodaj metodę która przyjmie 2 daty a następnie wyświetl jaka była najwyższa, najniższa i
średnia temperatura w tym okresie czasu.
4. Dodaj metodę która przyjmie liczbę całkowitą i zwróci liczbę dni w których średnia
temperatura była wyższa lub równa przekazanej.
5. Dodaj metodę która przeanalizuje i zwróci 2 informacje o datach oraz różnice temperatur:
a.Statystycznie który rok był najcieplejszy a który najchłodniejszy  
b. Statystycznie który miesiąc był najcieplejszy a który najchłodniejszy  
c. Statystycznie który kalendarzowy dzień był najcieplejszy a który najchłodniejszy  
## [Zadanie #3 (przetwarzanie danych, strona 15)](src/main/java/pl/aszul/Task3Page15)
1. Otwórz plik userActions.csv. Plik zawiera dane, które należy wprowadzić do systemu dotyczącego
użytkowników. Login użytkownika jest zawsze unikatowy. Plik ma strukturę: [METODA][USER], np.  

    a. CREATE jnowak password Jan Nowak user  
    b. CREATE anowak password2 Adam Nowak user  
    c. UPDATE jnowak ; ; admin  
    d. REMOVE anowak
      
2. Akcja CREATE zawiera zawsze wypełnione wszystkie pola. UPDATE zawiera tylko login użytkownika (który jest unikatowy) oraz pole ktore powinno być aktualizowane. REMOVE zawiera tylko login użytkownika do usunięcia.  
3. Utwórz klasę UserService która zawiera listę użytkowników. Zaimplementuj metody addUser, updateUser oraz removeUser. W zależności od akcji zdefiniowanej w pliku, wykonaj odpowiednią operację.  
## [Zadanie #4 (analiza danych, strona 16)](src/main/java/pl/aszul/Task4Page16)
1. Wczytaj plik flights.csv - plik zawiera dane dotyczące pasażerów pewnej firmy lotniczej działającej w latach 1949 - 1960. Przeprowadź analizę danych a wyniki zapisz w nowym pliku.  
2. Twoja analiza powinna zawierać:  
    1. Ilu pasażerów przetransportowała firma przez cały okres działania?
    2. Zsumuj i zapisz liczbę pasażerów korzystających z usług firmy z podziałem na lata.
    3. Zsumuj i zapisz liczbę pasażerów korzystających z usług firmy z podziałem na każdy
    miesiąc.
    4. Podaj rok i miesiąc w którym pasażerów było najwięcej oraz najmniej (podaj także różnicę
    liczby pasażerów).
    5. O ile procent zmieniała się liczba pasażerów które korzystały z usług firmy każdego roku w
    stosunku do poprzedniego roku?