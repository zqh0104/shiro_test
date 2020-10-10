package com.qihang;


import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

import java.util.Arrays;

/**
 * @Author: QiHangZhang
 * @Date: 2020/9/27 14:51
 * @Description:
 */
public class HanZiToPinYin {

    public static void main(String[] args) {

        HanyuPinyinOutputFormat outputFormat = new HanyuPinyinOutputFormat();
        //设置大小写  UPPERCASE:大写   LOWERCASE:小写
        outputFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);

        //设置声调格式
        outputFormat.setToneType(HanyuPinyinToneType.WITH_TONE_NUMBER);
        String[] strings = null;
        try {
            strings = PinyinHelper.toHanyuPinyinStringArray('家',outputFormat);
        } catch (BadHanyuPinyinOutputFormatCombination badHanyuPinyinOutputFormatCombination) {
            badHanyuPinyinOutputFormatCombination.printStackTrace();
        }
        System.out.println(Arrays.toString(strings));

    }
}
