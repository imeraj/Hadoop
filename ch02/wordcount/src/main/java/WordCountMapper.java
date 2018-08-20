import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class WordCountMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
    private static final IntWritable one = new IntWritable(1);
    private static final Pattern WORD_BOUNDARY = Pattern.compile("\\s*\\b\\s*");
    private boolean caseSensitive = false;

    @Override
    protected void setup(Mapper.Context context)
            throws IOException,
            InterruptedException {
        Configuration config = context.getConfiguration();
        this.caseSensitive = config.getBoolean("wordcount.case.sensitive", false);
    }

    @Override
    public void map(LongWritable offset, Text lineText, Context context)
            throws IOException, InterruptedException {
        String line = caseSensitive == true ? lineText.toString() : lineText.toString().toLowerCase();
        Text currentWord;

        for (String word: WORD_BOUNDARY.split(line)) {
            if (word.matches("")) {
                continue;
            }

            currentWord = new Text(word);
            context.write(currentWord, one);
        }
    }
}
