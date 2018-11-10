
package com.corder.jdbc.insert.table;

import com.corder.jdbc.dom.stu.StudentInfo;

public class TestInsertData {
    public static void main(String[] args) {
        
        StudentInfo s =new StudentInfo();
        InsertDataToTableUsingMySql.insertDataTOTable(s);
    }
}
