import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class TextBoxTest {
    @BeforeAll
    static void setUp() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.holdBrowserOpen = true;
    }


    @Test
    void TextBoxFillingTest() {
        open("/text-box");
        $x("//input[@id='userName']").setValue("Timur");
        $x("//input[@id='userEmail']").setValue("TiM76rus@yandex.ru");
        $x("//textarea[@id='currentAddress']").setValue("Чкалова, 13");
        $x("//textarea[@id='permanentAddress']").setValue("Другой адрес");
    }
}
