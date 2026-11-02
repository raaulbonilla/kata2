package software.ulpgc.katas.io;

import software.ulpgc.katas.Person;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static com.sun.tools.jdeprscan.scan.CPEntries.loadFrom;

public class TsvPersonReader implements PersonReader {

    @Override
    public List<Person> readAll(InputStream input) throws IOException {
        Reader reader = new InputStreamReader(input, StandardCharsets.UTF_8);
        return loadFrom(reader);
    }

    private List<Person> loadFrom(Reader reader) throws IOException {
        BufferedReader buffer = new BufferedReader(reader);
        List<String> lines = new ArrayList<>();
        String line = buffer.readLine();
        while (line != null) {
            lines.add(line);
            line = buffer.readLine();
        }
        return loadFrom(lines);
    }

    private List<Person> loadFrom(List<String> lines) {
        if (lines.size() < 2) {
            throw new IllegalArgumentException("El TSV no contiene personas");
        }
        List<Person> persons = new ArrayList<>();
        for (int i = 1; i < lines.size(); i++ ) {
            persons.add(loadFrom(lines.get(i)));
        }
        return persons;
    }
}
