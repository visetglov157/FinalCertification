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

