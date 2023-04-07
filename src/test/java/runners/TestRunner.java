package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@amazon",
        dryRun = false
)

public class TestRunner {
    /*
    Bir framework'de bir tek Runner class'i yeterli olabilir
    Runner class'indan class bodysinde hic bir sey olmaz
    Runner class'imizi onemli yapan iki adet annotation vardir
    @RunWith(Cucumber.class) notasyonu Runner class'ina calisma ozelligi katar
    Bu notasyon oldugu icin Cucumber framework'umuzde JUnit kullanmayi tercih ediyoruz

    features : Runner dosyasinin feature dosyalarini nereden bulacagini tarif eder
    glue : stepdefinitions dosyalarini nerede bulacagimizi gosterir
    tags : o an hangi tag'i calistirmak istiyorsak onu belli eder

    dryRun : iki secenek var
    dryRun=true; yazdigimiz Testimizi calistirmadan sadece eksik adimlari bize verir
    dryRun=false; yazdigimizda testlerimizi calistirir

     */
}
