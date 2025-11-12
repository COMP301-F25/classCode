package edu.unc.comp301.bugOfTheDay.adapter;

//// Target interface
//interface Database {
//    void connect();
//    void query(String sql);
//}
//
//// Adaptee (legacy API)
//class OldDatabase {
//    public void openConnection() {
//        System.out.println("Opening legacy DB connection...");
//    }
//
//    public void runQuery(String sql) {
//        System.out.println("Running query on legacy DB: " + sql);
//    }
//}
//
//// Adapter
//class DatabaseAdapter implements Database {
//
//    @Override
//    public void connect() {
//        OldDatabase.openConnection(); // Compile error!
//    }
//
//    @Override
//    public void query(String sql) {
//        OldDatabase.runQuery(sql); // Compile error!
//    }
//}
//
//public class BugOfTheDay {
//    public static void main(String[] args) {
//        Database db = new DatabaseAdapter();
//        db.connect();
//        db.query("SELECT * FROM users;");
//    }
//}