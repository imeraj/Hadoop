// ORM class for table 'loan_info'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sun Aug 26 13:05:40 JST 2018
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class loan_info extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("loan_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        loan_info.this.loan_id = (Integer)value;
      }
    });
    setters.put("user_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        loan_info.this.user_id = (Integer)value;
      }
    });
    setters.put("last_payment_date", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        loan_info.this.last_payment_date = (java.sql.Date)value;
      }
    });
    setters.put("payment_installation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        loan_info.this.payment_installation = (Double)value;
      }
    });
    setters.put("date_payable", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        loan_info.this.date_payable = (java.sql.Date)value;
      }
    });
  }
  public loan_info() {
    init0();
  }
  private Integer loan_id;
  public Integer get_loan_id() {
    return loan_id;
  }
  public void set_loan_id(Integer loan_id) {
    this.loan_id = loan_id;
  }
  public loan_info with_loan_id(Integer loan_id) {
    this.loan_id = loan_id;
    return this;
  }
  private Integer user_id;
  public Integer get_user_id() {
    return user_id;
  }
  public void set_user_id(Integer user_id) {
    this.user_id = user_id;
  }
  public loan_info with_user_id(Integer user_id) {
    this.user_id = user_id;
    return this;
  }
  private java.sql.Date last_payment_date;
  public java.sql.Date get_last_payment_date() {
    return last_payment_date;
  }
  public void set_last_payment_date(java.sql.Date last_payment_date) {
    this.last_payment_date = last_payment_date;
  }
  public loan_info with_last_payment_date(java.sql.Date last_payment_date) {
    this.last_payment_date = last_payment_date;
    return this;
  }
  private Double payment_installation;
  public Double get_payment_installation() {
    return payment_installation;
  }
  public void set_payment_installation(Double payment_installation) {
    this.payment_installation = payment_installation;
  }
  public loan_info with_payment_installation(Double payment_installation) {
    this.payment_installation = payment_installation;
    return this;
  }
  private java.sql.Date date_payable;
  public java.sql.Date get_date_payable() {
    return date_payable;
  }
  public void set_date_payable(java.sql.Date date_payable) {
    this.date_payable = date_payable;
  }
  public loan_info with_date_payable(java.sql.Date date_payable) {
    this.date_payable = date_payable;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof loan_info)) {
      return false;
    }
    loan_info that = (loan_info) o;
    boolean equal = true;
    equal = equal && (this.loan_id == null ? that.loan_id == null : this.loan_id.equals(that.loan_id));
    equal = equal && (this.user_id == null ? that.user_id == null : this.user_id.equals(that.user_id));
    equal = equal && (this.last_payment_date == null ? that.last_payment_date == null : this.last_payment_date.equals(that.last_payment_date));
    equal = equal && (this.payment_installation == null ? that.payment_installation == null : this.payment_installation.equals(that.payment_installation));
    equal = equal && (this.date_payable == null ? that.date_payable == null : this.date_payable.equals(that.date_payable));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof loan_info)) {
      return false;
    }
    loan_info that = (loan_info) o;
    boolean equal = true;
    equal = equal && (this.loan_id == null ? that.loan_id == null : this.loan_id.equals(that.loan_id));
    equal = equal && (this.user_id == null ? that.user_id == null : this.user_id.equals(that.user_id));
    equal = equal && (this.last_payment_date == null ? that.last_payment_date == null : this.last_payment_date.equals(that.last_payment_date));
    equal = equal && (this.payment_installation == null ? that.payment_installation == null : this.payment_installation.equals(that.payment_installation));
    equal = equal && (this.date_payable == null ? that.date_payable == null : this.date_payable.equals(that.date_payable));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.loan_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.user_id = JdbcWritableBridge.readInteger(2, __dbResults);
    this.last_payment_date = JdbcWritableBridge.readDate(3, __dbResults);
    this.payment_installation = JdbcWritableBridge.readDouble(4, __dbResults);
    this.date_payable = JdbcWritableBridge.readDate(5, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.loan_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.user_id = JdbcWritableBridge.readInteger(2, __dbResults);
    this.last_payment_date = JdbcWritableBridge.readDate(3, __dbResults);
    this.payment_installation = JdbcWritableBridge.readDouble(4, __dbResults);
    this.date_payable = JdbcWritableBridge.readDate(5, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(loan_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(user_id, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDate(last_payment_date, 3 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDouble(payment_installation, 4 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDate(date_payable, 5 + __off, 91, __dbStmt);
    return 5;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(loan_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(user_id, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDate(last_payment_date, 3 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDouble(payment_installation, 4 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDate(date_payable, 5 + __off, 91, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.loan_id = null;
    } else {
    this.loan_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.user_id = null;
    } else {
    this.user_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.last_payment_date = null;
    } else {
    this.last_payment_date = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.payment_installation = null;
    } else {
    this.payment_installation = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.date_payable = null;
    } else {
    this.date_payable = new Date(__dataIn.readLong());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.loan_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.loan_id);
    }
    if (null == this.user_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.user_id);
    }
    if (null == this.last_payment_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.last_payment_date.getTime());
    }
    if (null == this.payment_installation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.payment_installation);
    }
    if (null == this.date_payable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.date_payable.getTime());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.loan_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.loan_id);
    }
    if (null == this.user_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.user_id);
    }
    if (null == this.last_payment_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.last_payment_date.getTime());
    }
    if (null == this.payment_installation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.payment_installation);
    }
    if (null == this.date_payable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.date_payable.getTime());
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(loan_id==null?"null":"" + loan_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_id==null?"null":"" + user_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_payment_date==null?"null":"" + last_payment_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(payment_installation==null?"null":"" + payment_installation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date_payable==null?"null":"" + date_payable, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(loan_id==null?"null":"" + loan_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_id==null?"null":"" + user_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_payment_date==null?"null":"" + last_payment_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(payment_installation==null?"null":"" + payment_installation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date_payable==null?"null":"" + date_payable, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.loan_id = null; } else {
      this.loan_id = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_id = null; } else {
      this.user_id = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.last_payment_date = null; } else {
      this.last_payment_date = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.payment_installation = null; } else {
      this.payment_installation = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.date_payable = null; } else {
      this.date_payable = java.sql.Date.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.loan_id = null; } else {
      this.loan_id = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_id = null; } else {
      this.user_id = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.last_payment_date = null; } else {
      this.last_payment_date = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.payment_installation = null; } else {
      this.payment_installation = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.date_payable = null; } else {
      this.date_payable = java.sql.Date.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    loan_info o = (loan_info) super.clone();
    o.last_payment_date = (o.last_payment_date != null) ? (java.sql.Date) o.last_payment_date.clone() : null;
    o.date_payable = (o.date_payable != null) ? (java.sql.Date) o.date_payable.clone() : null;
    return o;
  }

  public void clone0(loan_info o) throws CloneNotSupportedException {
    o.last_payment_date = (o.last_payment_date != null) ? (java.sql.Date) o.last_payment_date.clone() : null;
    o.date_payable = (o.date_payable != null) ? (java.sql.Date) o.date_payable.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("loan_id", this.loan_id);
    __sqoop$field_map.put("user_id", this.user_id);
    __sqoop$field_map.put("last_payment_date", this.last_payment_date);
    __sqoop$field_map.put("payment_installation", this.payment_installation);
    __sqoop$field_map.put("date_payable", this.date_payable);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("loan_id", this.loan_id);
    __sqoop$field_map.put("user_id", this.user_id);
    __sqoop$field_map.put("last_payment_date", this.last_payment_date);
    __sqoop$field_map.put("payment_installation", this.payment_installation);
    __sqoop$field_map.put("date_payable", this.date_payable);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
