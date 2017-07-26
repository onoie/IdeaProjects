import com.ymst180.Library;

import static com.ymst180.StaticLibrary.echoStatic;

/**
 * Created by ymst180 on 2/2/17.
 */
public class Main {
    public static void main(String[] args){
        Library lib = new Library();
        System.out.println(lib.echo("Hello"));
        System.out.println(echoStatic("World"));

    }
}
