package ru.synergy.rvcontentprovaiderwithsql.tablemoc;

import java.util.Locale;

public class TableItems {

    public static final String NAME = TableItems.class.getSimpleName().toLowerCase(Locale.ROOT);

    public static final String _ID = "_id";
    public static final String TEXT = "text";

    public static final String CREATE_TABLE =
            "CREATE TABLE" + NAME + "("
            + _ID + "Integer primary key autoincrement, " +
            TEXT + "text" + ");";
    public static final String DROP_TABLE = "DROP TABLE IF EXISTS" + NAME;
    public static final String[] Columns = new String[]{_ID, TEXT};
}
