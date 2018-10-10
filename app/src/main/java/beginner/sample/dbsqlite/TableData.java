package beginner.sample.dbsqlite;

import android.provider.BaseColumns;

public class TableData {
    public TableData()
    {

    }
    public static abstract class TableInfo implements BaseColumns
    {
        public static final String TAG_NAME = "name";
        public static final String TAG_MOBILE = "mobile";
        public static final String TAG_ADDRESS = "address";
        public static final String DATABASE_NAME = "register";
        public static final String TABLE_NAME = "info";
        public static  final int VERSION = 1;
    }
}
