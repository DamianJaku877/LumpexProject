package pl.sda.tests.users;

import pl.sda.tests.users.exception.UserExistException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Sztuczna implementacja czegoś na wzór "bazy danych" która przechowuje
 * użytkowników. Klasa udostępnia kilka prostych metod z operacjami.
 */
public class UserService {

	private List<User> users = new ArrayList<User>();

	/**
	 * Zapisuje użytkownika w bazie danych.
	 * 
	 * Metoda Objects.requireNonNull(user) sprawdza czy obiekt user nie jest
	 * Null'em. Jeśli jest, zostanie rzucony wyjątek NullPointerException.
	 * 
	 * Sprawdzane jest także czy w bazie danych nie istnieje już użytkownik o
	 * tym samym loginie. Jeśli istnieje, rzucony zostanie wyjątek klasy
	 * UserExistException.
	 * 
	 * @param user
	 *            Użytkownik który będzie zapisany w bazie danych.
	 * 
	 * @throws UserExistException
	 *             Wyjątek rzucony jeśli użytkownik o tym loginie już istnieje.
	 */
	public void saveUser(User user) throws UserExistException {
		Objects.requireNonNull(user);

		if (isUserExist(user.getLogin())) {
			throw new UserExistException("User login " + user.getLogin() + " is exist in database.");
		}

		users.add(user);
	}

	/**
	 * Usuwanie użytkownika z listy. Metoda także sprawdza czy przekazany user
	 * nie jest Null'em.
	 * 
	 * @param user
	 */
	public void removeUser(User user) {
		Objects.requireNonNull(user);

		users.remove(user);
	}

	/**
	 * Usuwanie użytkownika z listy na podstawie przekazanego loginu.
	 * 
	 * @param login
	 *            Login użytkownika
	 */
	public void removeUser(String login) {
		User user = findUserByLogin(login);

		removeUser(user);
	}

	/**
	 * Pobranie wszystkich zapisanych użytkowników.
	 * 
	 * @return Lista użytkowników
	 */
	public List<User> getAllUsers() {
		return users;
	}

	/**
	 * Usuwanie wszystkich istniejących w bazie użytkowników.
	 */
	public void cleanDB() {
		users.clear();
	}

	/**
	 * Wyszukiwanie użytkownika w bazie danych na podstawie przekazanego loginu.
	 * 
	 * @param login
	 *            Login użytkownika
	 * 
	 * @return Znaleziony w bazie użytkownik. Jeśli użytkownik nie zostanie
	 *         znaleziony, zwrócony zostanie null.
	 */
	public User findUserByLogin(String login) {
		for (User user : users) {
			if (user.getLogin().equals(login)) {
				return user;
			}
		}

		return null;

		// JAVA 8 VERSION:
		// Optional<User> user = users.stream()
		// .filter(user -> user.getLogin().equals(login))
		// .findFirst();
		//
		// return user;
	}

	/**
	 * Logowanie użytkownika, jeśli zostały przekazane poprawne dane do
	 * istniejącego konta zapisane w bazie danych.
	 * 
	 * @param login
	 *            Login użytkownika.
	 * @param password
	 *            Hasło użytkowinka.
	 * 
	 * @return Jeśli przekazano poprawny login i hasło, zwrócone zostanie true,
	 *         jeśli nie wówczas poleci false
	 */
	public boolean login(String login, String password) {
		User user = findUserByLogin(login);

		Objects.requireNonNull(user);

		if (user.getPassword().equals(password)) {
			return true;
		}

		return false;
	}

	/**
	 * Metoda prywatna a więc nie można z niej korzystać z "zewnątrz klasy".
	 * Metoda sprawdza czy użytkownik o podanym loginie istnieje w bazie danych.
	 * Jeśli tak zwrócony zostanie true, jeśli nie to false; Metoda pomocnicza
	 * wykorzystywana przy zapisie użytkownika do bazy aby nie zapisać dwóch lub
	 * więcej użytkowników o tym samym loginie.
	 * 
	 * @param login
	 *            Login użytkownika.
	 * 
	 * @return True jeśli użytkownik o podanym loginie istnieje w bazie oraz
	 *         False jeśli nie.
	 */
	private boolean isUserExist(String login) {
		User user = findUserByLogin(login);

		if (Objects.nonNull(user)) {
			return true;
		} else {
			return false;
		}
	}
}
