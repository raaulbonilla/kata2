package software.ulpgc.katas.io;

import software.ulpgc.katas.Person;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class TsvPersonReader implements PersonReader {

    @Override
    public List<Person> readAll(InputStream input) throws IOException {
        Reader reader = new InputStreamReader(input, StandardCharsets.UTF_8);
        return loadFrom(reader);
    }
}
