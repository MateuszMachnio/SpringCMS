# SpringCMS

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


