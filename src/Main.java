import com.company.DbFunctions;

import java.sql.Connection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DbFunctions db = new DbFunctions();
        Connection conn =db.connect_to_db("tutdb", "postgres","123456789");

        //db.insert_row(conn, "employee", "cleber2", "china");
        db.read_data(conn, "employee");
        db.delete_row_by_id(conn,"employee", 1);
        db.read_data(conn, "employee");

        //db.search_by_name(conn,"employee","cleber2");
    }
}