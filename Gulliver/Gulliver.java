import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Gulliver {
    public static void main(String[] args) throws IOException {
        Path sourse = Path.of("e:/input.txt");
        Path fin = Path.of("e:/output.txt");
        List<Integer> list;
        list = Files.lines(sourse).flatMap(s -> Stream.of(s.split(" ")))
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        int result = list.get(0) * list.get(0) * list.get(1);
        String str = Integer.toString(result);

        Files.write(fin, Collections.singleton(str), StandardCharsets.UTF_8);
    }
}