// ORM class for table 'shares_info'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sun Aug 26 19:51:57 JST 2018
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

public class shares_info extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("share_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        shares_info.this.share_id = (String)value;
      }
    });
    setters.put("company_name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        shares_info.this.company_name = (String)value;
      }
    });
    setters.put("gmt_timestamp", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        shares_info.this.gmt_timestamp = (Long)value;
      }
    });
    setters.put("share_price", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        shares_info.this.share_price = (Double)value;
      }
    });
  }
  public shares_info() {
    init0();
  }
  private String share_id;
  public String get_share_id() {
    return share_id;
  }
  public void set_share_id(String share_id) {
    this.share_id = share_id;
  }
  public shares_info with_share_id(String share_id) {
    this.share_id = share_id;
    return this;
  }
  private String company_name;
  public String get_company_name() {
    return company_name;
  }
  public void set_company_name(String company_name) {
    this.company_name = company_name;
  }
  public shares_info with_company_name(String company_name) {
    this.company_name = company_name;
    return this;
  }
  private Long gmt_timestamp;
  public Long get_gmt_timestamp() {
    return gmt_timestamp;
  }
  public void set_gmt_timestamp(Long gmt_timestamp) {
    this.gmt_timestamp = gmt_timestamp;
  }
  public shares_info with_gmt_timestamp(Long gmt_timestamp) {
    this.gmt_timestamp = gmt_timestamp;
    return this;
  }
  private Double share_price;
  public Double get_share_price() {
    return share_price;
  }
  public void set_share_price(Double share_price) {
    this.share_price = share_price;
  }
  public shares_info with_share_price(Double share_price) {
    this.share_price = share_price;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof shares_info)) {
      return false;
    }
    shares_info that = (shares_info) o;
    boolean equal = true;
    equal = equal && (this.share_id == null ? that.share_id == null : this.share_id.equals(that.share_id));
    equal = equal && (this.company_name == null ? that.company_name == null : this.company_name.equals(that.company_name));
    equal = equal && (this.gmt_timestamp == null ? that.gmt_timestamp == null : this.gmt_timestamp.equals(that.gmt_timestamp));
    equal = equal && (this.share_price == null ? that.share_price == null : this.share_price.equals(that.share_price));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof shares_info)) {
      return false;
    }
    shares_info that = (shares_info) o;
    boolean equal = true;
    equal = equal && (this.share_id == null ? that.share_id == null : this.share_id.equals(that.share_id));
    equal = equal && (this.company_name == null ? that.company_name == null : this.company_name.equals(that.company_name));
    equal = equal && (this.gmt_timestamp == null ? that.gmt_timestamp == null : this.gmt_timestamp.equals(that.gmt_timestamp));
    equal = equal && (this.share_price == null ? that.share_price == null : this.share_price.equals(that.share_price));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.share_id = JdbcWritableBridge.readString(1, __dbResults);
    this.company_name = JdbcWritableBridge.readString(2, __dbResults);
    this.gmt_timestamp = JdbcWritableBridge.readLong(3, __dbResults);
    this.share_price = JdbcWritableBridge.readDouble(4, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.share_id = JdbcWritableBridge.readString(1, __dbResults);
    this.company_name = JdbcWritableBridge.readString(2, __dbResults);
    this.gmt_timestamp = JdbcWritableBridge.readLong(3, __dbResults);
    this.share_price = JdbcWritableBridge.readDouble(4, __dbResults);
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
    JdbcWritableBridge.writeString(share_id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(company_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(gmt_timestamp, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeDouble(share_price, 4 + __off, 8, __dbStmt);
    return 4;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(share_id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(company_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(gmt_timestamp, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeDouble(share_price, 4 + __off, 8, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.share_id = null;
    } else {
    this.share_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.company_name = null;
    } else {
    this.company_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.gmt_timestamp = null;
    } else {
    this.gmt_timestamp = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.share_price = null;
    } else {
    this.share_price = Double.valueOf(__dataIn.readDouble());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.share_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, share_id);
    }
    if (null == this.company_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, company_name);
    }
    if (null == this.gmt_timestamp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.gmt_timestamp);
    }
    if (null == this.share_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.share_price);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.share_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, share_id);
    }
    if (null == this.company_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, company_name);
    }
    if (null == this.gmt_timestamp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.gmt_timestamp);
    }
    if (null == this.share_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.share_price);
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
    __sb.append(FieldFormatter.escapeAndEnclose(share_id==null?"null":share_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(company_name==null?"null":company_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(gmt_timestamp==null?"null":"" + gmt_timestamp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(share_price==null?"null":"" + share_price, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(share_id==null?"null":share_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(company_name==null?"null":company_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(gmt_timestamp==null?"null":"" + gmt_timestamp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(share_price==null?"null":"" + share_price, delimiters));
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
    if (__cur_str.equals("null")) { this.share_id = null; } else {
      this.share_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.company_name = null; } else {
      this.company_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.gmt_timestamp = null; } else {
      this.gmt_timestamp = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.share_price = null; } else {
      this.share_price = Double.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.share_id = null; } else {
      this.share_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.company_name = null; } else {
      this.company_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.gmt_timestamp = null; } else {
      this.gmt_timestamp = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.share_price = null; } else {
      this.share_price = Double.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    shares_info o = (shares_info) super.clone();
    return o;
  }

  public void clone0(shares_info o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("share_id", this.share_id);
    __sqoop$field_map.put("company_name", this.company_name);
    __sqoop$field_map.put("gmt_timestamp", this.gmt_timestamp);
    __sqoop$field_map.put("share_price", this.share_price);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("share_id", this.share_id);
    __sqoop$field_map.put("company_name", this.company_name);
    __sqoop$field_map.put("gmt_timestamp", this.gmt_timestamp);
    __sqoop$field_map.put("share_price", this.share_price);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
