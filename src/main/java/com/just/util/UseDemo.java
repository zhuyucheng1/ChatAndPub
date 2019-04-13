package com.just.util;

import com.alibaba.fastjson.JSONObject;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.apache.lucene.analysis.tokenattributes.OffsetAttribute;
import org.apache.lucene.analysis.tokenattributes.TypeAttribute;
import org.springframework.util.ResourceUtils;
import org.wltea.analyzer.lucene.IKAnalyzer;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;

/**
 * @author yuyufeng
 * @date 2017/11/3
 */
public class UseDemo {
    public List<Score> fenci(String field) {

        List<String> keyWords = new ArrayList<>();
        int k = 2;  //窗口大小/2
        float d = 0.85f;
        /**
         * 标点符号、常用词、以及“名词、动词、形容词、副词之外的词”
         */

        Set<String> stopWordSet = null;
        try {
            stopWordSet = getStopWord();
        } catch (IOException e) {
            e.printStackTrace();
        }


        Analyzer analyzer = new IKAnalyzer(true);
        TokenStream ts = null;
        //分词
        try {
            ts = analyzer.tokenStream("myfield", new StringReader(field));
            OffsetAttribute offset = (OffsetAttribute) ts.addAttribute(OffsetAttribute.class);
            CharTermAttribute term = (CharTermAttribute) ts.addAttribute(CharTermAttribute.class);
            TypeAttribute type = (TypeAttribute) ts.addAttribute(TypeAttribute.class);
            ts.reset();

            while (ts.incrementToken()) {
                if (!stopWordSet.contains(term.toString())) {
                    keyWords.add(term.toString());
                }
            }
            ts.end();
        } catch (IOException var14) {
            var14.printStackTrace();
        } finally {
            if (ts != null) {
                try {
                    ts.close();
                } catch (IOException var13) {
                    var13.printStackTrace();
                }
            }

        }

        Map<String, Set<String>> relationWords = new HashMap<>();


        //获取每个关键词 前后k个的组合
        for (int i = 0; i < keyWords.size(); i++) {
            String keyword = keyWords.get(i);
            Set<String> keySets = relationWords.get(keyword);
            if (keySets == null) {
                keySets = new HashSet<>();
                relationWords.put(keyword, keySets);
            }

            for (int j = i - k; j <= i + k; j++) {
                if (j < 0 || j >= keyWords.size() || j == i) {
                    continue;
                } else {
                    keySets.add(keyWords.get(j));
                }
            }
        }


        Map<String, Float> score = new HashMap<>();
        float min_diff = 0.1f; //差值最小
        int max_iter = 100;//最大迭代次数

        //迭代
        for (int i = 0; i < max_iter; i++) {
            Map<String, Float> m = new HashMap<>();
            float max_diff = 0;
            for (String key : relationWords.keySet()) {
                Set<String> value = relationWords.get(key);
                //先给每个关键词一个默认rank值
                m.put(key, 1 - d);
                //一个关键词的TextRank由其它成员投票出来
                for (String other : value) {
                    int size = relationWords.get(other).size();
                    if (key.equals(other) || size == 0) {
                        continue;
                    } else {
                        m.put(key, m.get(key) + d / size * (score.get(other) == null ? 0 : score.get(other)));
                    }
                }
//                System.out.println("m.get(key):"+m.get(key)+" score:"+(score.get(key) == null ? 0 : score.get(key)));
                max_diff = Math.max(max_diff, Math.abs(m.get(key) - (score.get(key) == null ? 0 : score.get(key))));
            }
            score = m;
            if (max_diff <= min_diff) {
                System.out.println("迭代次数：" + i);
                break;
            }
        }

        List<Score> scores = new ArrayList<>();
        for (String s : score.keySet()) {
            Score score1 = new Score();
            score1.setKey(s);
            score1.setSignificance(score.get(s));
            scores.add(score1);
        }

        scores.sort(new Comparator<Score>() {
            @Override
            public int compare(Score o1, Score o2) {
                if (o2.getSignificance() - o1.getSignificance() > 0) {
                    return 1;
                } else {
                    return -1;
                }

            }
        });

        return  scores;

    }
    /***
     * @return void
     * @Author zhuyucheng
     * @Description 获取stopWord
     * @Date 13:46 2019/3/6
     * @Email zhuyucheng@jsaepay.com
     * @Param []
     **/
    private  Set<String> getStopWord() throws FileNotFoundException, IOException {
        Set<String> stopWordSet = new HashSet<String>();
//        File file = new File(this.originalPath);
//        StringBuffer stringBuffer = new StringBuffer();
        try {
            URL url = new URL("http://118.25.59.30:9091/fenciku.txt");
//            File file = ResourceUtils.getFile();
//            String url = "http://118.25.59.30:9091/fenciku.txt";
            URLConnection conn = url.openConnection();
            InputStream stream =  conn.getInputStream();
//            InputStream stream = getClass().getClassLoader().getResourceAsStream("fenciku.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(stream, "GBK"));
            String line;
            while ((line = br.readLine()) != null) {
                String str = line.trim();
                stopWordSet.add(str);
//                LogUtils.info(str);
//                stringBuffer.append(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return stopWordSet;
    }
}
