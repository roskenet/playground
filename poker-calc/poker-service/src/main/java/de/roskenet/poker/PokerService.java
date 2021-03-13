package de.roskenet.poker;

import com.rundef.poker.Console;
import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PokerService
{
    public static void main( String[] args ) {
        SpringApplication.run(PokerService.class, args);
    }

    class PokerHand {
        private String hand;
        private int probability;
        private boolean accurate;
    }

    class PokerResponse {
        private String board;
        private List<PokerHand> hands;
    }

    @GetMapping("/poker")
    public List<String> getSomething(@RequestParam(value="board", required = false) String board, @RequestParam("hands") String hands)
            throws Exception {
//        var response = new PokerResponse();
//        response.setBoard(board);
//        response.setHand(hand);
//        return response;
//        String[] input = new String[] {"-b", board};

        var arrayList = new ArrayList<String>();
        if(board != null && board != "") {
            arrayList.add("-b");
            arrayList.add(board);
        }
        String[] s = hands.split(" ");

        for (String str: s) {
            arrayList.add(str);
        }

//        String[] retList = arrayList.toArray()

        return Console.calculateOdd((arrayList.toArray(new String[arrayList.size()])));
    }
}
