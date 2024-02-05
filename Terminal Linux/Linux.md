1. Используя команду cat в терминале операционной системы Linux, создать
   два файла Домашние животные (заполнив файл собаками, кошками,
   хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и
   ослы), а затем объединить их. Просмотреть содержимое созданного файла.
   Переименовать файл, дав ему новое имя (Друзья человека).
````bash
gbuser@gbuser-VirtualBox:~$ cat > 'Домашние животные'
Собаки
Кошки
Хомяки
^C
gbuser@gbuser-VirtualBox:~$ cat > 'Вьючные животные'
Лошади
Верблюды
Ослы
gbuser@gbuser-VirtualBox:~$ cat 'Домашние животные' 'Вьючные животные' > 'Все животные'
gbuser@gbuser-VirtualBox:~$ cat '^C
gbuser@gbuser-VirtualBox:~$ cat 'Все животные'
Собаки
Кошки
Хомяки
Лошади
Верблюды
Ослы
gbuser@gbuser-VirtualBox:~$ mv 'Все животные' 'Друзья человека'
````
2. Создать директорию, переместить файл туда.
````bash
gbuser@gbuser-VirtualBox:~$ mkdir animals
gbuser@gbuser-VirtualBox:~$ mv 'Друзья человека' animals/'Друзья человека'
gbuser@gbuser-VirtualBox:~$ ls -la animals
total 12
drwxrwxr-x  2 gbuser gbuser 4096 фев  5 19:27  .
drwxr-x--- 15 gbuser gbuser 4096 фев  5 19:27  ..
-rw-rw-r--  1 gbuser gbuser   76 фев  5 19:16 'Друзья человека'
````

