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
3. Подключить дополнительный репозиторий MySQL. Установить любой пакет
   из этого репозитория.
````bash
gbuser@gbuser-VirtualBox:~$ wget https://dev.mysql.com/get/mysql-apt-config_0.8.24-1_all.deb
--2024-02-05 19:31:27--  https://dev.mysql.com/get/mysql-apt-config_0.8.24-1_all.deb
Resolving dev.mysql.com (dev.mysql.com)... 23.52.29.249, 2a02:26f0:9500:98d::2e31, 2a02:26f0:9500:98f::2e31
Connecting to dev.mysql.com (dev.mysql.com)|23.52.29.249|:443... connected.
HTTP request sent, awaiting response... 302 Moved Temporarily
Location: https://repo.mysql.com//mysql-apt-config_0.8.24-1_all.deb [following]
--2024-02-05 19:31:28--  https://repo.mysql.com//mysql-apt-config_0.8.24-1_all.deb
Resolving repo.mysql.com (repo.mysql.com)... 23.210.173.94, 2a02:26f0:9500:b83::1d68, 2a02:26f0:9500:b8a::1d68
Connecting to repo.mysql.com (repo.mysql.com)|23.210.173.94|:443... connected.
HTTP request sent, awaiting response... 200 OK
Length: 18048 (18K) [application/x-debian-package]
Saving to: ‘mysql-apt-config_0.8.24-1_all.deb’
mysql-apt-config_0.8.24 100%[=============================>]  17,62K  --.-KB/s    in 0s      
2024-02-05 19:31:29 (121 MB/s) - ‘mysql-apt-config_0.8.24-1_all.deb’ saved [18048/18048]
gbuser@gbuser-VirtualBox:~$ sudo apt install mysql-common
Reading package lists... Done
Building dependency tree... Done
Reading state information... Done
The following NEW packages will be installed:
  mysql-common
0 upgraded, 1 newly installed, 0 to remove and 149 not upgraded.
Need to get 7 212 B of archives.
After this operation, 34,8 kB of additional disk space will be used.
Get:1 http://ru.archive.ubuntu.com/ubuntu jammy/main amd64 mysql-common all 5.8+1.0.8 [7 212 B]
Fetched 7 212 B in 0s (79,1 kB/s)   
Selecting previously unselected package mysql-common.
(Reading database ... 181773 files and directories currently installed.)
Preparing to unpack .../mysql-common_5.8+1.0.8_all.deb ...
Unpacking mysql-common (5.8+1.0.8) ...
Setting up mysql-common (5.8+1.0.8) ...
update-alternatives: using /etc/mysql/my.cnf.fallback to provide /etc/mysql/my.cnf (my.cnf) in
 auto mode
````
4. Установить и удалить deb-пакет с помощью dpkg.
````bash
gbuser@gbuser-VirtualBox:~$ apt download lftp
Get:1 http://ru.archive.ubuntu.com/ubuntu jammy/main amd64 lftp amd64 4.9.2-1build1 [720 kB]
Fetched 720 kB in 0s (3 395 kB/s)
gbuser@gbuser-VirtualBox:~$ sudo dpkg -i lftp_4.9.2-1build1_amd64.deb
Selecting previously unselected package lftp.
(Reading database ... 181787 files and directories currently installed.)
Preparing to unpack lftp_4.9.2-1build1_amd64.deb ...
Unpacking lftp (4.9.2-1build1) ...
Setting up lftp (4.9.2-1build1) ...
Processing triggers for mailcap (3.70+nmu1ubuntu1) ...
Processing triggers for gnome-menus (3.36.0-1ubuntu3) ...
Processing triggers for desktop-file-utils (0.26-1ubuntu3) ...
Processing triggers for hicolor-icon-theme (0.17-2) ...
Processing triggers for man-db (2.10.2-1) ...
gbuser@gbuser-VirtualBox:~$ 
````
````bash
gbuser@gbuser-VirtualBox:~$ sudo dpkg -r lftp
(Reading database ... 181810 files and directories currently installed.)
Removing lftp (4.9.2-1build1) ...
Processing triggers for man-db (2.10.2-1) ...
Processing triggers for hicolor-icon-theme (0.17-2) ...
Processing triggers for mailcap (3.70+nmu1ubuntu1) ...
Processing triggers for gnome-menus (3.36.0-1ubuntu3) ...
Processing triggers for desktop-file-utils (0.26-1ubuntu3) ...
````
5. Выложить историю команд в терминале ubuntu.
````bash
1 cat > 'Домашние животные'
2 cat > 'Вьючные животные'
3 cat 'Домашние животные' 'Вьючные животные' > 'Все животные'
4 cat 'Все животные'
5 mv 'Все животные' 'Друзья человека'
6 mkdir animals
7 mv 'Друзья человека' animals/'Друзья человека'
8 ls -la animals
9 wget https://dev.mysql.com/get/mysql-apt-config_0.8.24-1_all.deb
10 sudo apt-get update 
11 sudo apt install mysql-common
12 apt download lftp
13 sudo dpkg -i lftp_4.9.2-1build1_amd64.deb
14 sudo dpkg -r lftp
15 history
````


