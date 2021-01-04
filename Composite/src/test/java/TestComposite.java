import org.junit.jupiter.api.Test;

public class TestComposite {



    /*
    У нас есть 3 типа рунических ставов, которые выполняют воздействие после их рисования
    Они могут быть нарисованы на определенном месте, части тела или каком-то объекте.
    Для упрощения программы мы используем паттерн компоновщик, и объеденяем все эти ставы
    в классе Drawing. Теперь для того, чтобы нарисовать их нам нужно лишь добавить ставы в хранилище
    Drawing, а затем нарисовать, выбрав для них всех единное место.
     */
    @Test
    public void draw() {
        RunicLigature annealingTheNegative = new AnnealingTheNegative();
        RunicLigature healthRecoveryFromEir = new HealthRecoveryFromEir();
        RunicLigature fenrirProtection = new FenrirProtection();
        Drawing drawing = new Drawing();

        drawing.add(annealingTheNegative);
        drawing.add(healthRecoveryFromEir);
        drawing.draw("forearm");
        System.out.println("-----------------");
        drawing.add(fenrirProtection);
        drawing.draw("paper");
        System.out.println("-----------------");
        drawing.clear();
        drawing.add(annealingTheNegative);
        drawing.draw("photo");

    }
}
