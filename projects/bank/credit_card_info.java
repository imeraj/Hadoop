// ORM class for table 'credit_card_info'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sun Aug 26 19:39:25 JST 2018
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

public class credit_card_info extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("cc_number", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        credit_card_info.this.cc_number = (Long)value;
      }
    });
    setters.put("user_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        credit_card_info.this.user_id = (Integer)value;
      }
    });
    setters.put("maximum_credit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        credit_card_info.this.maximum_credit = (Double)value;
      }
    });
    setters.put("outstanding_balance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        credit_card_info.this.outstanding_balance = (Double)value;
      }
    });
    setters.put("due_date", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        credit_card_info.this.due_date = (java.sql.Date)value;
      }
    });
  }
  public credit_card_info() {
    init0();
  }
  private Long cc_number;
  public Long get_cc_number() {
    return cc_number;
  }
  public void set_cc_number(Long cc_number) {
    this.cc_number = cc_number;
  }
  public credit_card_info with_cc_number(Long cc_number) {
    this.cc_number = cc_number;
    return this;
  }
  private Integer user_id;
  public Integer get_user_id() {
    return user_id;
  }
  public void set_user_id(Integer user_id) {
    this.user_id = user_id;
  }
  public credit_card_info with_user_id(Integer user_id) {
    this.user_id = user_id;
    return this;
  }
  private Double maximum_credit;
  public Double get_maximum_credit() {
    return maximum_credit;
  }
  public void set_maximum_credit(Double maximum_credit) {
    this.maximum_credit = maximum_credit;
  }
  public credit_card_info with_maximum_credit(Double maximum_credit) {
    this.maximum_credit = maximum_credit;
    return this;
  }
  private Double outstanding_balance;
  public Double get_outstanding_balance() {
    return outstanding_balance;
  }
  public void set_outstanding_balance(Double outstanding_balance) {
    this.outstanding_balance = outstanding_balance;
  }
  public credit_card_info with_outstanding_balance(Double outstanding_balance) {
    this.outstanding_balance = outstanding_balance;
    return this;
  }
  private java.sql.Date due_date;
  public java.sql.Date get_due_date() {
    return due_date;
  }
  public void set_due_date(java.sql.Date due_date) {
    this.due_date = due_date;
  }
  public credit_card_info with_due_date(java.sql.Date due_date) {
    this.due_date = due_date;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof credit_card_info)) {
      return false;
    }
    credit_card_info that = (credit_card_info) o;
    boolean equal = true;
    equal = equal && (this.cc_number == null ? that.cc_number == null : this.cc_number.equals(that.cc_number));
    equal = equal && (this.user_id == null ? that.user_id == null : this.user_id.equals(that.user_id));
    equal = equal && (this.maximum_credit == null ? that.maximum_credit == null : this.maximum_credit.equals(that.maximum_credit));
    equal = equal && (this.outstanding_balance == null ? that.outstanding_balance == null : this.outstanding_balance.equals(that.outstanding_balance));
    equal = equal && (this.due_date == null ? that.due_date == null : this.due_date.equals(that.due_date));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof credit_card_info)) {
      return false;
    }
    credit_card_info that = (credit_card_info) o;
    boolean equal = true;
    equal = equal && (this.cc_number == null ? that.cc_number == null : this.cc_number.equals(that.cc_number));
    equal = equal && (this.user_id == null ? that.user_id == null : this.user_id.equals(that.user_id));
    equal = equal && (this.maximum_credit == null ? that.maximum_credit == null : this.maximum_credit.equals(that.maximum_credit));
    equal = equal && (this.outstanding_balance == null ? that.outstanding_balance == null : this.outstanding_balance.equals(that.outstanding_balance));
    equal = equal && (this.due_date == null ? that.due_date == null : this.due_date.equals(that.due_date));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.cc_number = JdbcWritableBridge.readLong(1, __dbResults);
    this.user_id = JdbcWritableBridge.readInteger(2, __dbResults);
    this.maximum_credit = JdbcWritableBridge.readDouble(3, __dbResults);
    this.outstanding_balance = JdbcWritableBridge.readDouble(4, __dbResults);
    this.due_date = JdbcWritableBridge.readDate(5, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.cc_number = JdbcWritableBridge.readLong(1, __dbResults);
    this.user_id = JdbcWritableBridge.readInteger(2, __dbResults);
    this.maximum_credit = JdbcWritableBridge.readDouble(3, __dbResults);
    this.outstanding_balance = JdbcWritableBridge.readDouble(4, __dbResults);
    this.due_date = JdbcWritableBridge.readDate(5, __dbResults);
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
    JdbcWritableBridge.writeLong(cc_number, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(user_id, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDouble(maximum_credit, 3 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(outstanding_balance, 4 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDate(due_date, 5 + __off, 91, __dbStmt);
    return 5;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(cc_number, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(user_id, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDouble(maximum_credit, 3 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(outstanding_balance, 4 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDate(due_date, 5 + __off, 91, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.cc_number = null;
    } else {
    this.cc_number = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.user_id = null;
    } else {
    this.user_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.maximum_credit = null;
    } else {
    this.maximum_credit = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.outstanding_balance = null;
    } else {
    this.outstanding_balance = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.due_date = null;
    } else {
    this.due_date = new Date(__dataIn.readLong());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.cc_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.cc_number);
    }
    if (null == this.user_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.user_id);
    }
    if (null == this.maximum_credit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.maximum_credit);
    }
    if (null == this.outstanding_balance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.outstanding_balance);
    }
    if (null == this.due_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.due_date.getTime());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.cc_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.cc_number);
    }
    if (null == this.user_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.user_id);
    }
    if (null == this.maximum_credit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.maximum_credit);
    }
    if (null == this.outstanding_balance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.outstanding_balance);
    }
    if (null == this.due_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.due_date.getTime());
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
    __sb.append(FieldFormatter.escapeAndEnclose(cc_number==null?"null":"" + cc_number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_id==null?"null":"" + user_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(maximum_credit==null?"null":"" + maximum_credit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(outstanding_balance==null?"null":"" + outstanding_balance, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(due_date==null?"null":"" + due_date, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(cc_number==null?"null":"" + cc_number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_id==null?"null":"" + user_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(maximum_credit==null?"null":"" + maximum_credit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(outstanding_balance==null?"null":"" + outstanding_balance, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(due_date==null?"null":"" + due_date, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cc_number = null; } else {
      this.cc_number = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.maximum_credit = null; } else {
      this.maximum_credit = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.outstanding_balance = null; } else {
      this.outstanding_balance = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.due_date = null; } else {
      this.due_date = java.sql.Date.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cc_number = null; } else {
      this.cc_number = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.maximum_credit = null; } else {
      this.maximum_credit = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.outstanding_balance = null; } else {
      this.outstanding_balance = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.due_date = null; } else {
      this.due_date = java.sql.Date.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    credit_card_info o = (credit_card_info) super.clone();
    o.due_date = (o.due_date != null) ? (java.sql.Date) o.due_date.clone() : null;
    return o;
  }

  public void clone0(credit_card_info o) throws CloneNotSupportedException {
    o.due_date = (o.due_date != null) ? (java.sql.Date) o.due_date.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("cc_number", this.cc_number);
    __sqoop$field_map.put("user_id", this.user_id);
    __sqoop$field_map.put("maximum_credit", this.maximum_credit);
    __sqoop$field_map.put("outstanding_balance", this.outstanding_balance);
    __sqoop$field_map.put("due_date", this.due_date);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("cc_number", this.cc_number);
    __sqoop$field_map.put("user_id", this.user_id);
    __sqoop$field_map.put("maximum_credit", this.maximum_credit);
    __sqoop$field_map.put("outstanding_balance", this.outstanding_balance);
    __sqoop$field_map.put("due_date", this.due_date);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
