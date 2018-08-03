package NikCorpo;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, format = {"pretty"},
        // Укажите здесь корневые пакеты, в которых хранятся шаги. Если вы написали свои классы с шагами, не забудьте указать здесь пакеты, в которых они находятся
        glue = {"ru.sbtqa.tag.stepdefs",
                "ru.sbtqa.tag.pagefactory2example.stepdefs",
                "ru.sbtqa.tag.pagefactory2example.elements.jdi.stepdefs"},
        // Укажите здесь путь до каталога с фичами
        features = {"src/test/resources/features/"},
        // Здесь можно указать тэг теста или нескольких тестов, которые вы хотите запустить. Это удобно при отладке тестов
        tags = {"@DCTest"})

public class CucumberTest {
}