Получение Баланса по ID пользователя
Запрос GET http://localhost:8081/personal_account/id
--------------
Положить деньги на счёт пользователя
Запрос POST http://localhost:8081/personal_account/putMoney/id
(Param KEY - amount,VALUE - Сумма)
--------------
Получить деньги со счёта пользователя
Запрос POST http://localhost:8081/personal_account/takeMoney/id
(Param KEY - amount,VALUE - Сумма)
--------------
Перевести деньги со счёта пользователя другому пользователю
Запрос POST http://localhost:8081/personal_account/transferMoney/id
(Param KEY - toID,amount,VALUE - id(кому переводим),Сумма)


![База_Данных](https://github.com/MrOleg87/Personal-Account/assets/128096870/b272acb4-2f2d-420c-87f4-909e63bb7b33)
