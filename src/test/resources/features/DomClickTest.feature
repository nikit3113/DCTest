# language:ru
Функционал: Тестирование ресурса DomClick

  @DCTest
  Сценарий: Просмотр результатов поиска
    Дано пользователь переходит на страницу "http://domclick.ru" по ссылке
    И открывается страница "ДомКлик — cервис для поиска и покупки недвижимости в ипотеку"

    Когда пользователь (нажимает кнопку) "Вторичка"
    И пользователь (заполняет поле) "Строка поиска" "Санкт-Петербург"
    И пользователь (кликает по ссылке) "Строка поиска"
    Также пользователь (нажимает клавишу) "Enter"
    И пользователь (нажимает кнопку) "Начать подбор"

    Тогда открывается страница "Страница поиска"


    И пользователь (заполняет поле) "Минимальная цена" "1000000"
    И пользователь (заполняет поле) "Максимальная цена" "30000000"
    И пользователь (нажимает кнопку) "3 комнаты в квартире"
    И пользователь (нажимает кнопку) "Скидка на ставку"
    И пользователь (заполняет поле) "Общая площадь от" "30"
    И пользователь (заполняет поле) "Общая площадь до" "100"
    И пользователь (заполняет поле) "Площадь кухни от" "8"
    И пользователь (заполняет поле) "Площадь кухни до" "15"
    И пользователь (нажимает кнопку) "Не первый этаж"
    И пользователь (нажимает кнопку) "Не последний этаж"
    И пользователь (заполняет поле) "Этаж от" "5"
    И пользователь (заполняет поле) "Этаж до" "15"
    И пользователь (заполняет поле) "Этажность от" "3"
    И пользователь (заполняет поле) "Этажность до" "20"
  #  И пользователь (нажимает кнопку) "Раздельный санузел"
  #  И пользователь (нажимает кнопку) "балкон/лоджия"