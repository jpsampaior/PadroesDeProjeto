/*package POA.AspectJ;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StockAspect {
    @After("execution(void updateItem())")
    public void afterUpdateItem(JoinPoint joinPoint) {
        LocalDateTime agora = LocalDateTime.now();

        DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("MM/dd/uuuu");
        String dataFormatada = formatterData.format(agora);

        DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaFormatada = formatterHora.format(agora);


        System.out.println("Item updated "+dataFormatada+" "+horaFormatada);
    }
}*/
