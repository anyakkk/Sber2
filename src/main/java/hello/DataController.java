package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;

import java.util.*;

@RestController
public class DataController {
    private static final SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd");
    private static final SimpleDateFormat formatForTimeNow = new SimpleDateFormat("h:mm:ss a zzz");

    @RequestMapping("/data")
    public Data data() {
        Date dateNow = new Date();
        return new Data(
                formatForDateNow.format(dateNow),
                formatForTimeNow.format(dateNow));
    }
}