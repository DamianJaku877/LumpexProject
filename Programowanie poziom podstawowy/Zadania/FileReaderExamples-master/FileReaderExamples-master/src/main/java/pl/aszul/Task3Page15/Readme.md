# Zadania z przetwarzania danych  
## Zadanie #3 (przetwarzanie danych, strona 15)
1.Otwórz plik userActions.csv. Plik zawiera dane, które należy wprowadzić do systemu dotyczącego
użytkowników. Login użytkownika jest zawsze unikatowy. Plik ma strukturę: [METODA][USER], np.  

    a. CREATE jnowak password Jan Nowak user  
    b. CREATE anowak password2 Adam Nowak user  
    c. UPDATE jnowak ; ; admin  
    d. REMOVE anowak
      
2.Akcja CREATE zawiera zawsze wypełnione wszystkie pola. UPDATE zawiera tylko login użytkownika (który jest unikatowy) oraz pole ktore powinno być aktualizowane. REMOVE zawiera tylko login użytkownika do usunięcia.  
3.Utwórz klasę UserService która zawiera listę użytkowników. Zaimplementuj metody addUser, updateUser oraz removeUser. W zależności od akcji zdefiniowanej w pliku, wykonaj odpowiednią operację.