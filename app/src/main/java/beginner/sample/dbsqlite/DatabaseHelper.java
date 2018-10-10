package beginner.sample.dbsqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;

import static beginner.sample.dbsqlite.TableData.TableInfo.DATABASE_NAME;
import static beginner.sample.dbsqlite.TableData.TableInfo.TABLE_NAME;
import static beginner.sample.dbsqlite.TableData.TableInfo.TAG_ADDRESS;
import static beginner.sample.dbsqlite.TableData.TableInfo.TAG_MOBILE;
import static beginner.sample.dbsqlite.TableData.TableInfo.TAG_NAME;
import static beginner.sample.dbsqlite.TableData.TableInfo.VERSION;

public class DatabaseHelper extends SQLiteOpenHelper {

    private String CREATE_QUERY = "CREATE TABLE " + TABLE_NAME + "("
            + TAG_NAME + " TEXT, "
            + TAG_MOBILE + " TEXT, "
            + TAG_ADDRESS + " TEXT"
            + ");";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_QUERY);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void insertDetails(String name, String mobile, String address) {
        SQLiteDatabase SQ = this.getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put(TAG_NAME, name);
        cv.put(TAG_MOBILE, mobile);
        cv.put(TAG_ADDRESS, address);

        long k = SQ.insert(TABLE_NAME, null, cv);
        cv.clear();

        SQ.close();

        Log.d("Database Operations", "ONE ROW INSERTED");
    }

    public Cursor getInformation() {
        SQLiteDatabase SQ = this.getReadableDatabase();
        String[] columns = {TAG_NAME, TAG_MOBILE, TAG_ADDRESS};
        Cursor CR = SQ.query(TABLE_NAME, columns, null, null, null, null, null);
        return CR;
    }

    public ArrayList<TableDetails> getDetails() {
        ArrayList<TableDetails> tableDetails = new ArrayList<>();
        Cursor cursor = getInformation();
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                tableDetails.add(new TableDetails(cursor.getString(0), cursor.getString(1), cursor.getString(2)));
            } while (cursor.moveToNext());
        }
        return tableDetails;
}
}
