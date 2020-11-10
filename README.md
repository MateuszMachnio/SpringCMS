# SpringCMS

###Dzień 1
Zadanie 1
Otwórz IDE a następnie utwórz w nim projekt o nazwie SpringCMS.
Utwórz encje o nazwie Category.
Encja ma zawierać następujące pola:
id
name (max 100 znaków)
description (może przyjmować wartość null)


Zadanie 2
Utwórz encje o nazwie Author.
Encja ma zawierać następujące pola:
id
firstName
lastName


Zadanie 3
Utwórz encję Article,
Encja ma zawierać następujące pola:
id
title (max. 200 znaków),
author - (powiązanie relacją do klasy Author) - artykuł może mieć tylko jednego autora
categories - (powiązanie relacją do klasy Category) - artykuł może należeć do wielu kategorii
content
created (wartość ma być automatycznie dodawana podczas zapisu)
updated (wartość ma być automatycznie zmieniana podczas edycji).


Zadanie 4
Uzupełnij ręcznie dane w bazie, lub stwórz odpowiedni skrypt, który zostanie załadowany podczas startu aplikacji.
Utwórz klasy ArticleDao, AuthorDao, CategoryDao.
W klasach Dao utwórz metody pozwalające na:
zapis encji
usuwanie encji
edycję encji


### Dzień 2
Zadanie 1
W ramach pracy domowej rozbudujemy nasz system do zarządzania treścią (CMS - Content Management System).

Zadanie 1
W klasach ArticleDao, AuthorDao, CategoryDao dodaj metody, które przy użyciu JPQL umożliwią pobieranie wszystkich obiektów danego typu.



Zadanie 2
Utwórz kontroler HomePageController,
Utwórz akcję startową o nazwie home() dostępną pod adresem /, wyświetlającą 5 ostatnio dodanych artykułów.
Wyświetlamy tytuł, datę dodania oraz zawartość danego artykułu.
W klasie Dao utwórz wymaganą metodę, wstrzyknij Dao do kontrolera


Zadanie 3
Utwórz kontroler CategoryController, utwórz w nim akcje, które pozwolą:
wyświetlić listę wszystkich kategorii
dodać kategorię
usunąć kategorię
edytować kategorię
Dla akcji dodawania oraz edycji utwórz formularz.
Utwórz linki nawigacyjne umożliwiające przechodzenie między akcjami - bez konieczności znania adresów URL.


Zadanie 4
Utwórz kontroler AuthorController, utwórz w nim akcje, które pozwolą:
wyświetlić listę wszystkich autorów
dodać autora
usunąć autora
edytować autora
Dla akcji dodawania oraz edycji utwórz formularz.
Utwórz linki nawigacyjne umożliwiające przechodzenie między akcjami - bez konieczności znania adresów URL.


Zadanie 5
Utwórz kontroler ArticleController, utwórz w nim akcje, które pozwolą:
wyświetlić listę wszystkich artykułów
dodać artykuł
usunąć artykuł
edytować artykuł
Dla akcji dodawania oraz edycji utwórz formularz.
Formularz tworzenia ma zawierać pola z możliwością wyboru autora.
Formularz tworzenia ma zawierać pola z możliwością wyboru wielu kategorii.
Dodaj konwertery dla klas Author oraz Category.
Utwórz linki nawigacyjne umożliwiające przechodzenie między akcjami - bez konieczności znania adresów URL.

###Dzień 3

W ramach pracy domowej rozbudujemy nasz system do zarządzania treścią (CMS - Content Management System).

Zadanie 1
Dla encji Category ustaw następujące ograniczenia:
name - minimum 5 znaków, pole wymagane
Dla encji Author ustaw następujące ograniczenia:
firstName - pole wymagane
lastName - pole wymagane
Dla encji Article ustaw następujące ograniczenia:
title - pole wymagane, maksymalnie 200 znaków
content - pole wymagane, minimalnie 500 znaków
categories - minimum jedna wybrana kategoria


Zadanie 2
Dodaj walidację formularzy dla akcji kontrolerów:
CategoryController
AuthorController
ArticleController


Zadanie 3
Rozbudujemy naszą aplikację o możliwość dodawania szkiców artykułów.
W tym celu rozbuduj encję Article o dodatkowe pole typu boolean draft.
Utwórz kontroler DraftController, utwórz w nim akcje, które pozwolą:
wyświetlić listę wszystkich szkiców
dodać szkic
usunąć szkic
edytować szkic
Dla akcji dodawania oraz edycji utwórz formularz.
Dla szkicu wymaganymi polami są tylko:
title
content
Utwórz odpowiednie grupy walidacji, oraz zmodyfikuj akcje dodawania artykułu, tak aby dało się dodać zarówno szkic, z uproszczonym zestawem danych jak i artykuł.


