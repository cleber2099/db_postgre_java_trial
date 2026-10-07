import com.company.DbFunctions;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DbFunctions db = new DbFunctions();
        db.connect_to_db("tutdb", "postgres","123456789");
    }
}