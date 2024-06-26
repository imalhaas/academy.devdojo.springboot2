package academy.devdojo.springboot2.util;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class DataUtil {

    public String formatLocalDateTimeDataBaseStyle (LocalDateTime localDateTime){
        return DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss").format(localDateTime);
    }
}
