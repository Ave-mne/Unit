В качестве языка программирования для выполнения проекта выбран Java. 
Приложение написано в соответствии с принципами объектно-ориентированного программирования. 
Код представлен в папке src -> main -> java, тесты к нему в папке test -> java.

Для написания тестов применена библиотека JUnit, Mockito. 
Над каждым тестом приведена краткая аннотация, содержащая информацию о типе теста и метода, 
который он проверяет. Применял unit и mock-тесты для проверки методов в классах MyList, Controller.
Для тестирования взаимодействия контроллера и модели (интеграционные тесты) применил 
Mockito для создания mock-объектов. В качестве заполнения списка выбрал Random.