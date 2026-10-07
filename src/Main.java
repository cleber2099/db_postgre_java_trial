import com.company.DbFunctions;

import java.sql.Connection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("tutdb", "postgres","123456789");

        //db.createTable(conn, "employee");
        //db.insert_row(conn, "employee", "André","Brasil");
        db.read_data(conn, "employee");

    }
}